package org.apache.xml.security.utils;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165597tg;
import X.C165607th;
import X.C36431kI;
import X.C90514aH;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Attr;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class XMLUtils {
    public static String a;
    public static String b;
    public static boolean c = AnonymousClass000.A1X(AccessController.doPrivileged(new PrivilegedAction() {
        public Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.apache.xml.security.ignoreLineBreaks"));
        }
    }));
    public static Map d = C165607th.A12();

    public static Element a(Node node) {
        while (node != null && node.getNodeType() != 1) {
            node = node.getNextSibling();
        }
        return (Element) node;
    }

    public static Element a(Node node, String str, int i) {
        while (node != null) {
            if ("http://www.w3.org/2000/09/xmldsig#".equals(node.getNamespaceURI()) && node.getLocalName().equals(str)) {
                if (i == 0) {
                    return (Element) node;
                }
                i--;
            }
            node = node.getNextSibling();
        }
        return null;
    }

    public static Element a(Node node, String str, String str2, int i) {
        while (node != null) {
            if (node.getNamespaceURI() != null && node.getNamespaceURI().equals(str) && node.getLocalName().equals(str2)) {
                if (i == 0) {
                    return (Element) node;
                }
                i--;
            }
            node = node.getNextSibling();
        }
        return null;
    }

    public static void a(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement.getAttributeNodeNS("http://www.w3.org/2000/xmlns/", "xmlns") == null) {
            documentElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "");
        }
        c(document);
    }

    public static void a(Node node, Set set, Node node2, boolean z) {
        if (node2 == null || !a(node2, node)) {
            b(node, set, node2, z);
        }
    }

    public static boolean a() {
        return c;
    }

    public static boolean a(Node node, Node node2) {
        if (node != node2) {
            while (node2 != null) {
                if (node2 != node) {
                    node2 = node2.getNodeType() == 2 ? ((Attr) node2).getOwnerElement() : node2.getParentNode();
                }
            }
            return false;
        }
        return true;
    }

    public static Element[] a(Node node, String str) {
        return a(node, "http://www.w3.org/2000/09/xmldsig#", str);
    }

    public static Element[] a(Node node, String str, String str2) {
        int i = 20;
        Element[] elementArr = new Element[20];
        int i2 = 0;
        while (node != null) {
            if (node.getNamespaceURI() != null && node.getNamespaceURI().equals(str) && node.getLocalName().equals(str2)) {
                int i3 = i2 + 1;
                elementArr[i2] = node;
                i2 = i3;
                if (i <= i3) {
                    int i4 = i << 2;
                    Element[] elementArr2 = new Element[i4];
                    System.arraycopy(elementArr, 0, elementArr2, 0, i);
                    i = i4;
                    i2 = i3;
                    elementArr = elementArr2;
                }
            }
            node = node.getNextSibling();
        }
        Element[] elementArr3 = new Element[i2];
        System.arraycopy(elementArr, 0, elementArr3, 0, i2);
        return elementArr3;
    }

    public static Text b(Node node, String str, int i) {
        Element a2 = a(node, str, i);
        if (a2 == null) {
            return null;
        }
        Node firstChild = a2.getFirstChild();
        while (firstChild != null && firstChild.getNodeType() != 3) {
            firstChild = firstChild.getNextSibling();
        }
        return (Text) firstChild;
    }

    public static void b(Element element) {
        if (!c) {
            element.appendChild(element.getOwnerDocument().createTextNode("\n"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r4.add(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(org.w3c.dom.Node r3, java.util.Set r4, org.w3c.dom.Node r5, boolean r6) {
        /*
            if (r3 == r5) goto L_0x000f
            short r1 = r3.getNodeType()
            r0 = 1
            if (r1 == r0) goto L_0x0013
            switch(r1) {
                case 8: goto L_0x0010;
                case 9: goto L_0x0031;
                case 10: goto L_0x000f;
                default: goto L_0x000c;
            }
        L_0x000c:
            r4.add(r3)
        L_0x000f:
            return
        L_0x0010:
            if (r6 == 0) goto L_0x000f
            goto L_0x000c
        L_0x0013:
            r4.add(r3)
            boolean r0 = r3.hasAttributes()
            if (r0 == 0) goto L_0x0031
            org.w3c.dom.NamedNodeMap r2 = r3.getAttributes()
            r1 = 0
        L_0x0021:
            int r0 = r2.getLength()
            if (r1 >= r0) goto L_0x0031
            org.w3c.dom.Node r0 = r2.item(r1)
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0031:
            org.w3c.dom.Node r2 = r3.getFirstChild()
        L_0x0035:
            if (r2 == 0) goto L_0x000f
            short r0 = r2.getNodeType()
            r1 = 3
            if (r0 != r1) goto L_0x004e
            r4.add(r2)
        L_0x0041:
            short r0 = r2.getNodeType()
            if (r0 != r1) goto L_0x004e
            org.w3c.dom.Node r2 = r2.getNextSibling()
            if (r2 == 0) goto L_0x000f
            goto L_0x0041
        L_0x004e:
            b(r2, r4, r5, r6)
            org.w3c.dom.Node r2 = r2.getNextSibling()
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.XMLUtils.b(org.w3c.dom.Node, java.util.Set, org.w3c.dom.Node, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r1 != 9) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(org.w3c.dom.Node r10) {
        /*
            r3 = 0
            r2 = r3
        L_0x0002:
            short r1 = r10.getNodeType()
            r9 = 1
            if (r1 == r9) goto L_0x0023
            r0 = 5
            if (r1 == r0) goto L_0x0078
            r0 = 9
            if (r1 == r0) goto L_0x0078
        L_0x0010:
            r10 = r2
        L_0x0011:
            if (r10 != 0) goto L_0x001e
            if (r3 == 0) goto L_0x007f
            org.w3c.dom.Node r10 = r3.getNextSibling()
            org.w3c.dom.Node r3 = r3.getParentNode()
            goto L_0x0011
        L_0x001e:
            org.w3c.dom.Node r2 = r10.getNextSibling()
            goto L_0x0002
        L_0x0023:
            boolean r0 = r10.hasChildNodes()
            if (r0 == 0) goto L_0x0010
            boolean r0 = r10.hasAttributes()
            if (r0 == 0) goto L_0x0078
            org.w3c.dom.NamedNodeMap r8 = r10.getAttributes()
            int r7 = r8.getLength()
            org.w3c.dom.Node r6 = r10.getFirstChild()
        L_0x003b:
            if (r6 == 0) goto L_0x0078
            short r0 = r6.getNodeType()
            if (r0 != r9) goto L_0x0073
            r5 = r6
            org.w3c.dom.Element r5 = (org.w3c.dom.Element) r5
            r4 = 0
        L_0x0047:
            if (r4 >= r7) goto L_0x0073
            org.w3c.dom.Node r3 = r8.item(r4)
            org.w3c.dom.Attr r3 = (org.w3c.dom.Attr) r3
            java.lang.String r0 = r3.getNamespaceURI()
            java.lang.String r2 = "http://www.w3.org/2000/xmlns/"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r3.getLocalName()
            boolean r0 = r5.hasAttributeNS(r2, r0)
            if (r0 != 0) goto L_0x0070
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = r3.getNodeValue()
            r5.setAttributeNS(r2, r1, r0)
        L_0x0070:
            int r4 = r4 + 1
            goto L_0x0047
        L_0x0073:
            org.w3c.dom.Node r6 = r6.getNextSibling()
            goto L_0x003b
        L_0x0078:
            org.w3c.dom.Node r0 = r10.getFirstChild()
            r3 = r10
            r10 = r0
            goto L_0x0011
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.XMLUtils.c(org.w3c.dom.Node):void");
    }

    public static Document b(Node node) {
        if (node.getNodeType() == 9) {
            return (Document) node;
        }
        try {
            return node.getOwnerDocument();
        } catch (NullPointerException e) {
            StringBuffer A0x = C165607th.A0x();
            A0x.append(I18n.b("endorsed.jdk1.4.0"));
            A0x.append(" Original message was \"");
            A0x.append(e.getMessage());
            throw AnonymousClass001.A0A(C165597tg.A0n("\"", A0x));
        }
    }

    public static String a(Element element) {
        StringBuffer A0x = C165607th.A0x();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 3) {
                A0x.append(((CharacterData) item).getData());
            }
        }
        return A0x.toString();
    }

    public static Document a(Set set) {
        String message;
        Iterator it = set.iterator();
        NullPointerException e = null;
        while (it.hasNext()) {
            Node node = (Node) it.next();
            short nodeType = node.getNodeType();
            if (nodeType == 9) {
                return (Document) node;
            }
            if (nodeType != 2) {
                return node.getOwnerDocument();
            }
            try {
                return ((Attr) node).getOwnerElement().getOwnerDocument();
            } catch (NullPointerException e2) {
                e = e2;
            }
        }
        StringBuffer A0x = C165607th.A0x();
        A0x.append(I18n.b("endorsed.jdk1.4.0"));
        A0x.append(" Original message was \"");
        if (e == null) {
            message = "";
        } else {
            message = e.getMessage();
        }
        A0x.append(message);
        throw AnonymousClass001.A0A(C165597tg.A0n("\"", A0x));
    }

    public static Element a(Document document, String str) {
        if (document != null) {
            String str2 = a;
            if (str2 == null || str2.length() == 0) {
                return document.createElementNS("http://www.w3.org/2000/09/xmldsig#", str);
            }
            String A1A = C36431kI.A1A(str, d);
            if (A1A == null) {
                StringBuffer stringBuffer = new StringBuffer(a);
                stringBuffer.append(':');
                A1A = C165597tg.A0n(str, stringBuffer);
                d.put(str, A1A);
            }
            return document.createElementNS("http://www.w3.org/2000/09/xmldsig#", A1A);
        }
        throw C90514aH.A0s("Document is null");
    }
}
