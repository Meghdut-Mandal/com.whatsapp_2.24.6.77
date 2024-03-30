package org.apache.xml.security.utils.resolver.implementations;

import X.C165567td;
import X.C165577te;
import X.C165607th;
import X.C36431kI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.IdResolver;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class ResolverFragment extends ResourceResolverSpi {
    public static Log d;
    public static Class e;

    static {
        Class c = c("org.apache.xml.security.utils.resolver.implementations.ResolverFragment");
        e = c;
        d = LogFactory.getLog(c.getName());
    }

    public boolean a() {
        return true;
    }

    public boolean b(Attr attr, String str) {
        if (attr == null) {
            d.debug("Quick fail for null uri");
        } else {
            String nodeValue = attr.getNodeValue();
            if (nodeValue.equals("") || (nodeValue.charAt(0) == '#' && (nodeValue.charAt(1) != 'x' || !nodeValue.startsWith("#xpointer(")))) {
                if (d.isDebugEnabled()) {
                    Log log = d;
                    StringBuffer A0x = C165607th.A0x();
                    A0x.append("State I can resolve reference: \"");
                    C165567td.A1O(nodeValue, "\"", A0x, log);
                }
                return true;
            } else if (d.isDebugEnabled()) {
                Log log2 = d;
                StringBuffer A0x2 = C165607th.A0x();
                A0x2.append("Do not seem to be able to resolve reference: \"");
                C165567td.A1O(nodeValue, "\"", A0x2, log2);
                return false;
            }
        }
        return false;
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw C165577te.A0m(e2);
        }
    }

    public XMLSignatureInput a(Attr attr, String str) {
        Node node;
        String nodeValue = attr.getNodeValue();
        Document ownerDocument = attr.getOwnerElement().getOwnerDocument();
        if (nodeValue.equals("")) {
            d.debug("ResolverFragment with empty URI (means complete document)");
            node = ownerDocument;
        } else {
            String substring = nodeValue.substring(1);
            Node a = IdResolver.a(ownerDocument, substring);
            if (a != null) {
                node = a;
                if (d.isDebugEnabled()) {
                    Log log = d;
                    StringBuffer A0x = C165607th.A0x();
                    A0x.append("Try to catch an Element with ID ");
                    A0x.append(substring);
                    C165577te.A1J(a, " and Element was ", A0x, log);
                    node = a;
                }
            } else {
                throw new ResourceResolverException("signature.Verification.MissingID", C36431kI.A1Z(substring, 1), attr, str);
            }
        }
        XMLSignatureInput xMLSignatureInput = new XMLSignatureInput(node);
        xMLSignatureInput.f = true;
        xMLSignatureInput.m = "text/xml";
        String nodeValue2 = attr.getNodeValue();
        if (str != null) {
            nodeValue2 = str.concat(nodeValue2);
        }
        xMLSignatureInput.n = nodeValue2;
        return xMLSignatureInput;
    }
}
