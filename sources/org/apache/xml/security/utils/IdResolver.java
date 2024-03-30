package org.apache.xml.security.utils;

import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class IdResolver {
    public static Class a;
    public static Log b;
    public static WeakHashMap c = new WeakHashMap();
    public static List d;
    public static int e;

    static {
        Class a2 = a("org.apache.xml.security.utils.IdResolver");
        a = a2;
        b = LogFactory.getLog(a2.getName());
        List asList = Arrays.asList(new String[]{"http://www.w3.org/2000/09/xmldsig#", "http://www.w3.org/2001/04/xmlenc#", "http://schemas.xmlsoap.org/soap/security/2000-12", "http://www.w3.org/2002/03/xkms#", "urn:oasis:names:tc:SAML:1.0:assertion", "urn:oasis:names:tc:SAML:1.0:protocol"});
        d = asList;
        e = asList.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r1 != 2) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        if (r1 != 3) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c8, code lost:
        if (r0.equals(r13) != false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(org.w3c.dom.Element r12, java.lang.String r13, org.w3c.dom.Element[] r14) {
        /*
            boolean r0 = r12.hasAttributes()
            r2 = 0
            if (r0 == 0) goto L_0x00df
            org.w3c.dom.NamedNodeMap r7 = r12.getAttributes()
            java.util.List r1 = d
            java.lang.String r0 = r12.getNamespaceURI()
            int r6 = r1.indexOf(r0)
            if (r6 >= 0) goto L_0x0019
            int r6 = e
        L_0x0019:
            int r4 = r7.getLength()
            r3 = 0
        L_0x001e:
            r5 = 3
            if (r3 >= r4) goto L_0x0092
            org.w3c.dom.Node r9 = r7.item(r3)
            org.w3c.dom.Attr r9 = (org.w3c.dom.Attr) r9
            java.lang.String r0 = r9.getNamespaceURI()
            if (r0 != 0) goto L_0x0087
            r1 = r6
        L_0x002e:
            if (r1 >= 0) goto L_0x0032
            int r1 = e
        L_0x0032:
            java.lang.String r11 = r9.getLocalName()
            if (r11 != 0) goto L_0x003c
            java.lang.String r11 = r9.getName()
        L_0x003c:
            int r0 = r11.length()
            r8 = 2
            if (r0 > r8) goto L_0x0084
            java.lang.String r9 = r9.getNodeValue()
            char r10 = r11.charAt(r2)
            r0 = 73
            if (r10 != r0) goto L_0x0063
            r10 = 1
            char r8 = r11.charAt(r10)
            r0 = 100
            if (r8 != r0) goto L_0x0074
            boolean r0 = r9.equals(r13)
            if (r0 == 0) goto L_0x0084
            r14[r1] = r12
            if (r1 != 0) goto L_0x0084
            return r10
        L_0x0063:
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0084
            boolean r0 = r9.equals(r13)
            if (r0 == 0) goto L_0x0084
            if (r1 == r8) goto L_0x0082
            goto L_0x0080
        L_0x0074:
            r0 = 68
            if (r8 != r0) goto L_0x0084
            boolean r0 = r9.endsWith(r13)
            if (r0 == 0) goto L_0x0084
            if (r1 == r5) goto L_0x0082
        L_0x0080:
            int r1 = e
        L_0x0082:
            r14[r1] = r12
        L_0x0084:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x0087:
            java.util.List r1 = d
            java.lang.String r0 = r9.getNamespaceURI()
            int r1 = r1.indexOf(r0)
            goto L_0x002e
        L_0x0092:
            java.lang.String r4 = "ResponseID"
            java.lang.String r3 = "RequestID"
            if (r6 != r5) goto L_0x00bb
            java.lang.String r0 = "OriginalRequestID"
            java.lang.String r0 = r12.getAttribute(r0)
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = r12.getAttribute(r3)
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = r12.getAttribute(r4)
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00df
        L_0x00b8:
            r14[r5] = r12
            return r2
        L_0x00bb:
            r1 = 4
            if (r6 != r1) goto L_0x00cd
            java.lang.String r0 = "AssertionID"
            java.lang.String r0 = r12.getAttribute(r0)
        L_0x00c4:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00df
        L_0x00ca:
            r14[r1] = r12
            return r2
        L_0x00cd:
            r1 = 5
            if (r6 != r1) goto L_0x00df
            java.lang.String r0 = r12.getAttribute(r3)
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = r12.getAttribute(r4)
            goto L_0x00c4
        L_0x00df:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.IdResolver.a(org.w3c.dom.Element, java.lang.String, org.w3c.dom.Element[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(org.w3c.dom.Node r6, java.lang.String r7, org.w3c.dom.Element[] r8) {
        /*
            r5 = 0
            r4 = r5
            r3 = r5
        L_0x0003:
            short r1 = r6.getNodeType()
            r2 = 1
            if (r1 == r2) goto L_0x002e
            r0 = 9
            if (r1 == r0) goto L_0x0029
            r0 = 11
            if (r1 == r0) goto L_0x0029
            r6 = r3
        L_0x0013:
            if (r6 != 0) goto L_0x0046
            if (r4 == 0) goto L_0x004b
            org.w3c.dom.Node r6 = r4.getNextSibling()
            org.w3c.dom.Node r4 = r4.getParentNode()
            if (r4 == 0) goto L_0x0013
            short r0 = r4.getNodeType()
            if (r2 == r0) goto L_0x0013
            r4 = r5
            goto L_0x0013
        L_0x0029:
            org.w3c.dom.Node r6 = r6.getFirstChild()
            goto L_0x0013
        L_0x002e:
            r1 = r6
            org.w3c.dom.Element r1 = (org.w3c.dom.Element) r1
            int r0 = a((org.w3c.dom.Element) r1, (java.lang.String) r7, (org.w3c.dom.Element[]) r8)
            if (r0 == r2) goto L_0x004b
            org.w3c.dom.Node r0 = r6.getFirstChild()
            if (r0 != 0) goto L_0x0044
            if (r4 == 0) goto L_0x004b
            org.w3c.dom.Node r6 = r6.getNextSibling()
            goto L_0x0013
        L_0x0044:
            r4 = r1
            r6 = r0
        L_0x0046:
            org.w3c.dom.Node r3 = r6.getNextSibling()
            goto L_0x0003
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.IdResolver.a(org.w3c.dom.Node, java.lang.String, org.w3c.dom.Element[]):int");
    }

    public static Element a(Node node, String str) {
        int i = e + 1;
        Element[] elementArr = new Element[i];
        a(node, str, elementArr);
        for (int i2 = 0; i2 < i; i2++) {
            Element element = elementArr[i2];
            if (element != null) {
                return element;
            }
        }
        return null;
    }

    public static Element b(Document document, String str) {
        if (b.isDebugEnabled()) {
            C165567td.A1O("getElementByIdUsingDOM() Search for ID ", str, C165607th.A0x(), b);
        }
        return document.getElementById(str);
    }

    public static Element c(Document document, String str) {
        WeakHashMap weakHashMap;
        Reference reference;
        if (b.isDebugEnabled()) {
            C165567td.A1O("getElementByIdType() Search for ID ", str, C165607th.A0x(), b);
        }
        synchronized (c) {
            weakHashMap = (WeakHashMap) c.get(document);
        }
        if (weakHashMap == null || (reference = (Reference) weakHashMap.get(str)) == null) {
            return null;
        }
        return (Element) reference.get();
    }

    public static Element a(Document document, String str) {
        Log log;
        StringBuffer A0x;
        String str2;
        Element c2 = c(document, str);
        if (c2 != null) {
            log = b;
            A0x = C165607th.A0x();
            str2 = "I could find an Element using the simple getElementByIdType method: ";
        } else {
            c2 = b(document, str);
            if (c2 != null) {
                log = b;
                A0x = C165607th.A0x();
                str2 = "I could find an Element using the simple getElementByIdUsingDOM method: ";
            } else {
                Element a2 = a((Node) document, str);
                if (a2 == null) {
                    return null;
                }
                a(a2, str);
                return a2;
            }
        }
        A0x.append(str2);
        C165567td.A1Q(c2.getTagName(), A0x, log);
        return c2;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw C165577te.A0m(e2);
        }
    }

    public static void a(Element element, String str) {
        WeakHashMap weakHashMap;
        Document ownerDocument = element.getOwnerDocument();
        synchronized (c) {
            weakHashMap = (WeakHashMap) c.get(ownerDocument);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                c.put(ownerDocument, weakHashMap);
            }
        }
        weakHashMap.put(str, AnonymousClass001.A0F(element));
    }
}
