package org.apache.xml.security.utils;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165597tg;
import X.C165607th;
import X.C36441kJ;
import X.C90514aH;
import java.util.HashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class ElementProxy {
    public static Log j;
    public static HashMap n = AnonymousClass001.A0J();
    public static HashMap o = AnonymousClass001.A0J();
    public static Class p;
    public Element k = null;
    public String l = null;
    public Document m = null;

    public ElementProxy() {
    }

    public String b(String str, String str2) {
        return ((CharacterData) XMLUtils.a(this.k.getFirstChild(), str2, str, 0).getFirstChild()).getData();
    }

    public int c(String str, String str2) {
        int i = 0;
        for (Node firstChild = this.k.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (str2.equals(firstChild.getLocalName()) && str.equals(firstChild.getNamespaceURI())) {
                i++;
            }
        }
        return i;
    }

    public abstract String d();

    public abstract String e();

    public final Element k() {
        return this.k;
    }

    public String l() {
        return this.l;
    }

    public byte[] n() {
        return Base64.a(XMLUtils.a(this.k));
    }

    public String o() {
        return XMLUtils.a(this.k);
    }

    static {
        Class c = c("org.apache.xml.security.utils.ElementProxy");
        p = c;
        j = LogFactory.getLog(c.getName());
    }

    public static void d(String str, String str2) {
        if (n.containsValue(str2)) {
            Object obj = n.get(str);
            if (!obj.equals(str2)) {
                Object[] A1Q = C36441kJ.A1Q();
                AnonymousClass000.A19(str2, str, obj, A1Q);
                throw new XMLSecurityException("prefix.AlreadyAssigned", A1Q);
            }
        }
        if ("http://www.w3.org/2000/09/xmldsig#".equals(str)) {
            XMLUtils.a = str2;
        }
        if ("http://www.w3.org/2001/04/xmlenc#".equals(str)) {
            XMLUtils.b = str2;
        }
        n.put(str, str2.intern());
        if (str2.length() == 0) {
            o.put(str, "xmlns");
        } else {
            o.put(str, C165577te.A0l("xmlns:", str2, C165607th.A0x()).intern());
        }
    }

    public ElementProxy(Element element, String str) {
        if (element != null) {
            if (j.isDebugEnabled()) {
                Log log = j;
                StringBuffer A0x = C165607th.A0x();
                A0x.append("setElement(\"");
                A0x.append(element.getTagName());
                A0x.append("\", \"");
                A0x.append(str);
                C165567td.A1Q("\")", A0x, log);
            }
            this.m = element.getOwnerDocument();
            this.k = element;
            this.l = str;
            m();
            return;
        }
        throw new XMLSecurityException("ElementProxy.nullElement");
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }

    public void m() {
        String e = e();
        String d = d();
        String localName = this.k.getLocalName();
        String namespaceURI = this.k.getNamespaceURI();
        if (!d.equals(namespaceURI) && !e.equals(localName)) {
            Object[] A0M = AnonymousClass001.A0M();
            StringBuffer A0p = C165597tg.A0p(namespaceURI);
            A0p.append(":");
            A0p.append(localName);
            C90514aH.A1Q(A0p, A0M, 0);
            StringBuffer A0p2 = C165597tg.A0p(d);
            A0p2.append(":");
            A0p2.append(e);
            C90514aH.A1Q(A0p2, A0M, 1);
            throw new XMLSecurityException("xml.WrongElement", A0M);
        }
    }
}
