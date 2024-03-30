package org.apache.xml.security.c14n.implementations;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C90494aF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.helper.C14nHelper;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public abstract class Canonicalizer11 extends CanonicalizerBase {
    public static Log d;
    public static Class f;
    public boolean b = true;
    public final SortedSet c = new TreeSet(CanonicalizerBase.g);
    public XmlAttrStack e = new XmlAttrStack();

    public class XmlAttrStack {
        public int a = 0;
        public int b = 0;
        public XmlsStackElement c;
        public List d = AnonymousClass001.A0I();

        public class XmlsStackElement {
            public int a;
            public boolean b = false;
            public List c = AnonymousClass001.A0I();
        }

        public void a(Attr attr) {
            if (this.c == null) {
                XmlsStackElement xmlsStackElement = new XmlsStackElement();
                this.c = xmlsStackElement;
                xmlsStackElement.a = this.a;
                this.d.add(xmlsStackElement);
                this.b = this.a;
            }
            this.c.c.add(attr);
        }

        public void a(Collection collection) {
            String str;
            Attr attr;
            if (this.c == null) {
                XmlsStackElement xmlsStackElement = new XmlsStackElement();
                this.c = xmlsStackElement;
                int i = this.a;
                xmlsStackElement.a = i;
                this.b = i;
                this.d.add(xmlsStackElement);
            }
            int size = this.d.size() - 2;
            if (size != -1) {
                XmlsStackElement xmlsStackElement2 = (XmlsStackElement) this.d.get(size);
                if (!xmlsStackElement2.b || xmlsStackElement2.a + 1 != this.a) {
                    HashMap A0J = AnonymousClass001.A0J();
                    ArrayList A0I = AnonymousClass001.A0I();
                    boolean z = true;
                    while (size >= 0) {
                        XmlsStackElement xmlsStackElement3 = (XmlsStackElement) this.d.get(size);
                        if (xmlsStackElement3.b) {
                            z = false;
                        }
                        Iterator it = xmlsStackElement3.c.iterator();
                        while (it.hasNext() && z) {
                            Attr attr2 = (Attr) it.next();
                            if (attr2.getLocalName().equals("base")) {
                                if (!xmlsStackElement3.b) {
                                    A0I.add(attr2);
                                }
                            } else if (!A0J.containsKey(attr2.getName())) {
                                A0J.put(attr2.getName(), attr2);
                            }
                        }
                        size--;
                    }
                    if (!A0I.isEmpty()) {
                        Iterator it2 = this.c.c.iterator();
                        while (true) {
                            str = null;
                            if (!it2.hasNext()) {
                                attr = null;
                                break;
                            }
                            attr = (Attr) it2.next();
                            if (attr.getLocalName().equals("base")) {
                                str = attr.getValue();
                                break;
                            }
                        }
                        Iterator it3 = A0I.iterator();
                        while (it3.hasNext()) {
                            Attr attr3 = (Attr) it3.next();
                            if (str == null) {
                                str = attr3.getValue();
                                attr = attr3;
                            } else {
                                try {
                                    str = Canonicalizer11.b(attr3.getValue(), str);
                                } catch (URISyntaxException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        if (!(str == null || str.length() == 0)) {
                            attr.setValue(str);
                            collection.add(attr);
                        }
                    }
                    this.c.b = true;
                    collection.addAll(A0J.values());
                    return;
                }
            }
            collection.addAll(this.c.c);
            this.c.b = true;
        }

        public void a(int i) {
            this.a = i;
            if (i != -1) {
                this.c = null;
                while (this.b >= this.a) {
                    List list = this.d;
                    list.remove(C36431kI.A07(list));
                    if (this.d.size() == 0) {
                        this.b = 0;
                        return;
                    }
                    this.b = ((XmlsStackElement) C36401kF.A0n(this.d)).a;
                }
            }
        }
    }

    static {
        Class a = a("org.apache.xml.security.c14n.implementations.Canonicalizer11");
        f = a;
        d = LogFactory.getLog(a.getName());
    }

    public Canonicalizer11(boolean z) {
        super(z);
    }

    public static String a(String str, String str2) {
        return b(str, str2);
    }

    public byte[] a(Node node, String str) {
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");
    }

    public Iterator b(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        NamedNodeMap namedNodeMap;
        int i;
        Object b2;
        this.e.a(nameSpaceSymbTable.c.size());
        boolean A1S = AnonymousClass000.A1S(a((Node) element, nameSpaceSymbTable.c.size()), 1);
        if (element.hasAttributes()) {
            namedNodeMap = element.getAttributes();
            i = namedNodeMap.getLength();
        } else {
            namedNodeMap = null;
            i = 0;
        }
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        for (int i2 = 0; i2 < i; i2++) {
            Attr attr = (Attr) namedNodeMap.item(i2);
            String namespaceURI = attr.getNamespaceURI();
            if ("http://www.w3.org/2000/xmlns/".equals(namespaceURI)) {
                String localName = attr.getLocalName();
                String value = attr.getValue();
                if (!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(value)) {
                    if (c(attr)) {
                        if (!A1S) {
                            nameSpaceSymbTable.e(localName);
                        }
                        Node b3 = nameSpaceSymbTable.b(localName, value, attr);
                        if (b3 != null) {
                            sortedSet.add(b3);
                            if (C14nHelper.a(attr)) {
                                Object[] A1Q = C36441kJ.A1Q();
                                A1Q[0] = element.getTagName();
                                A1Q[1] = localName;
                                throw C165587tf.A0r(attr, A1Q);
                            }
                        } else {
                            continue;
                        }
                    } else if (!A1S || "xmlns".equals(localName)) {
                        nameSpaceSymbTable.a(localName, value, attr);
                    } else {
                        nameSpaceSymbTable.c(localName);
                    }
                }
            } else if ("http://www.w3.org/XML/1998/namespace".equals(namespaceURI) && !attr.getLocalName().equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                this.e.a(attr);
            } else if (A1S) {
                sortedSet.add(attr);
            }
        }
        if (A1S) {
            Attr attributeNodeNS = element.getAttributeNodeNS("http://www.w3.org/2000/xmlns/", "xmlns");
            if (attributeNodeNS == null) {
                b2 = nameSpaceSymbTable.a("xmlns");
            } else {
                if (!c(attributeNodeNS)) {
                    b2 = nameSpaceSymbTable.b("xmlns", "", CanonicalizerBase.i);
                }
                this.e.a((Collection) sortedSet);
                nameSpaceSymbTable.a((Collection) sortedSet);
            }
            if (b2 != null) {
                sortedSet.add(b2);
            }
            this.e.a((Collection) sortedSet);
            nameSpaceSymbTable.a((Collection) sortedSet);
        }
        return sortedSet.iterator();
    }

    public Iterator a(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        Node b2;
        if (!element.hasAttributes() && !this.b) {
            return null;
        }
        SortedSet sortedSet = this.c;
        sortedSet.clear();
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Attr attr = (Attr) attributes.item(i);
            if (!"http://www.w3.org/2000/xmlns/".equals(attr.getNamespaceURI())) {
                sortedSet.add(attr);
            } else {
                String localName = attr.getLocalName();
                String value = attr.getValue();
                if ((!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(value)) && (b2 = nameSpaceSymbTable.b(localName, value, attr)) != null) {
                    sortedSet.add(b2);
                    if (C14nHelper.a(attr)) {
                        Object[] A1Q = C36441kJ.A1Q();
                        C90494aF.A1H(element.getTagName(), localName, A1Q);
                        throw C165587tf.A0r(attr, A1Q);
                    }
                }
            }
        }
        if (this.b) {
            nameSpaceSymbTable.a((Collection) sortedSet);
            this.e.a((Collection) sortedSet);
            this.b = false;
        }
        return sortedSet.iterator();
    }

    public void c(Element element, NameSpaceSymbTable nameSpaceSymbTable) {
        if (element.hasAttributes()) {
            this.e.a = -1;
            NamedNodeMap attributes = element.getAttributes();
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                Attr attr = (Attr) attributes.item(i);
                if ("http://www.w3.org/2000/xmlns/".equals(attr.getNamespaceURI())) {
                    String localName = attr.getLocalName();
                    String nodeValue = attr.getNodeValue();
                    if (!"xml".equals(localName) || !"http://www.w3.org/XML/1998/namespace".equals(nodeValue)) {
                        nameSpaceSymbTable.a(localName, nodeValue, attr);
                    }
                } else if (!"http://www.w3.org/XML/1998/namespace".equals(attr.getNamespaceURI())) {
                    this.e.a(attr);
                }
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        String str4;
        if (d.isDebugEnabled()) {
            Log log = d;
            StringBuffer A0x = C165607th.A0x();
            A0x.append(" ");
            A0x.append(str);
            C165567td.A1O(":   ", str2, A0x, log);
            int length = str2.length();
            Log log2 = d;
            StringBuffer A0x2 = C165607th.A0x();
            if (length == 0) {
                str4 = "\t\t\t\t";
            } else {
                str4 = "\t\t\t";
            }
            C165567td.A1O(str4, str3, A0x2, log2);
        }
    }

    public static String b(String str) {
        String substring;
        d.debug("STEP   OUTPUT BUFFER\t\tINPUT BUFFER");
        while (str.indexOf("//") > -1) {
            str = str.replaceAll("//", "/");
        }
        StringBuffer A0x = C165607th.A0x();
        if (str.charAt(0) == '/') {
            A0x.append("/");
            str = str.substring(1);
        }
        a("1 ", A0x.toString(), r13);
        while (r13.length() != 0) {
            String str2 = "2A";
            if (!r13.startsWith("./")) {
                if (r13.startsWith("../")) {
                    r13 = r13.substring(3);
                    if (!A0x.toString().equals("/")) {
                        A0x.append("../");
                    }
                } else {
                    str2 = "2B";
                    if (!r13.startsWith("/./")) {
                        if (r13.equals("/.")) {
                            r13 = r13.replaceFirst("/.", "/");
                        } else {
                            str2 = "2C";
                            if (r13.startsWith("/../")) {
                                r13 = r13.substring(3);
                            } else if (r13.equals("/..")) {
                                r13 = r13.replaceFirst("/..", "/");
                            } else {
                                if (!r13.equals(".")) {
                                    if (!r13.equals("..")) {
                                        int indexOf = r13.indexOf(47);
                                        if (indexOf == 0) {
                                            indexOf = r13.indexOf(47, 1);
                                        }
                                        if (indexOf == -1) {
                                            substring = r13.substring(0);
                                            r13 = "";
                                        } else {
                                            substring = r13.substring(0, indexOf);
                                            r13 = r13.substring(indexOf);
                                        }
                                        a("2E", C165597tg.A0n(substring, A0x), r13);
                                    } else if (!A0x.toString().equals("/")) {
                                        A0x.append("..");
                                    }
                                }
                                a("2D", A0x.toString(), "");
                                r13 = "";
                            }
                            if (A0x.length() == 0) {
                                A0x.append("/");
                            } else if (A0x.toString().endsWith("../")) {
                                A0x.append("..");
                            } else if (A0x.toString().endsWith("..")) {
                                A0x.append("/..");
                            } else {
                                int lastIndexOf = A0x.lastIndexOf("/");
                                if (lastIndexOf == -1) {
                                    A0x = C165607th.A0x();
                                    if (r13.charAt(0) == '/') {
                                        r13 = r13.substring(1);
                                    }
                                } else {
                                    A0x.delete(lastIndexOf, A0x.length());
                                }
                            }
                        }
                    }
                }
                a(str2, A0x.toString(), r13);
            }
            r13 = r13.substring(2);
            a(str2, A0x.toString(), r13);
        }
        if (A0x.toString().endsWith("..")) {
            a("3 ", C165597tg.A0n("/", A0x), r13);
        }
        return A0x.toString();
    }

    public void a(XMLSignatureInput xMLSignatureInput) {
        Document a;
        if (xMLSignatureInput.j) {
            Node node = xMLSignatureInput.d;
            if (node != null) {
                a = XMLUtils.b(node);
            } else {
                a = XMLUtils.a(xMLSignatureInput.b(false));
            }
            XMLUtils.a(a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r9 != null) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r3 = "/"
            r6 = 0
            if (r9 == 0) goto L_0x00a1
            java.lang.String r0 = ".."
            boolean r0 = r9.endsWith(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.StringBuffer r0 = X.C165607th.A0x()
            java.lang.String r9 = X.C165577te.A0l(r9, r3, r0)
        L_0x0015:
            java.net.URI r0 = new java.net.URI
            r0.<init>(r9)
            java.lang.String r6 = r0.getScheme()
            java.lang.String r7 = r0.getAuthority()
            java.lang.String r8 = r0.getPath()
            java.lang.String r5 = r0.getQuery()
            r0.getFragment()
        L_0x002d:
            java.net.URI r0 = new java.net.URI
            r0.<init>(r10)
            java.lang.String r2 = r0.getScheme()
            java.lang.String r1 = r0.getAuthority()
            java.lang.String r4 = r0.getPath()
            java.lang.String r9 = r0.getQuery()
            r10 = 0
            if (r2 == 0) goto L_0x005b
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L_0x005b
            java.lang.String r8 = b(r4)
            r6 = r2
        L_0x0050:
            r7 = r1
        L_0x0051:
            java.net.URI r5 = new java.net.URI
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r0 = r5.toString()
            return r0
        L_0x005b:
            if (r1 == 0) goto L_0x0062
            java.lang.String r8 = b(r4)
            goto L_0x0050
        L_0x0062:
            int r0 = r4.length()
            if (r0 != 0) goto L_0x006d
            if (r9 == 0) goto L_0x006b
        L_0x006a:
            r5 = r9
        L_0x006b:
            r9 = r5
            goto L_0x0051
        L_0x006d:
            boolean r0 = r4.startsWith(r3)
            if (r0 != 0) goto L_0x0083
            if (r7 == 0) goto L_0x0088
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0088
            java.lang.StringBuffer r0 = X.C165607th.A0x()
            java.lang.String r4 = X.C165577te.A0l(r3, r4, r0)
        L_0x0083:
            java.lang.String r8 = b(r4)
            goto L_0x006a
        L_0x0088:
            r0 = 47
            int r3 = r8.lastIndexOf(r0)
            r0 = -1
            if (r3 == r0) goto L_0x0083
            java.lang.StringBuffer r2 = X.C165607th.A0x()
            r1 = 0
            int r0 = r3 + 1
            java.lang.String r0 = r8.substring(r1, r0)
            java.lang.String r4 = X.C165577te.A0l(r0, r4, r2)
            goto L_0x0083
        L_0x00a1:
            java.lang.String r8 = ""
            r7 = r6
            r5 = r6
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.c14n.implementations.Canonicalizer11.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw C165577te.A0m(e2);
        }
    }
}
