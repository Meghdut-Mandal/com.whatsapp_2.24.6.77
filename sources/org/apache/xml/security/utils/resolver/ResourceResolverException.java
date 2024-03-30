package org.apache.xml.security.utils.resolver;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.w3c.dom.Attr;

public class ResourceResolverException extends XMLSecurityException {
    public Attr c;
    public String d;

    public ResourceResolverException(String str, Exception exc, Attr attr, String str2) {
        super(str, exc);
        this.c = attr;
        this.d = str2;
    }

    public ResourceResolverException(String str, Object[] objArr, Attr attr, String str2) {
        super(str, objArr);
        this.c = attr;
        this.d = str2;
    }
}
