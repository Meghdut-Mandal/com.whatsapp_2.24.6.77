package org.apache.xml.security.utils;

import X.C90514aH;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class SignatureElementProxy extends ElementProxy {
    public SignatureElementProxy() {
    }

    public SignatureElementProxy(Element element, String str) {
        super(element, str);
    }

    public String d() {
        return "http://www.w3.org/2000/09/xmldsig#";
    }

    public SignatureElementProxy(Document document) {
        if (document != null) {
            this.m = document;
            this.k = XMLUtils.a(document, e());
            return;
        }
        throw C90514aH.A0s("Document is null");
    }
}
