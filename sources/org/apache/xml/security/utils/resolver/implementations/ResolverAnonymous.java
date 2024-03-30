package org.apache.xml.security.utils.resolver.implementations;

import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.w3c.dom.Attr;

public abstract class ResolverAnonymous extends ResourceResolverSpi {
    public XMLSignatureInput d;

    public XMLSignatureInput a(Attr attr, String str) {
        throw null;
    }

    public boolean b(Attr attr, String str) {
        throw null;
    }
}
