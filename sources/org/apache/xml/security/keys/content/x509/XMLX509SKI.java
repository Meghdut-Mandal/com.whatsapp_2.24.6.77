package org.apache.xml.security.keys.content.x509;

import X.C165577te;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.SignatureElementProxy;

public abstract class XMLX509SKI extends SignatureElementProxy implements XMLX509DataContent {
    public static Log a;
    public static Class b;

    static {
        Class a2 = a("org.apache.xml.security.keys.content.x509.XMLX509SKI");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public abstract byte[] a();

    public String e() {
        throw null;
    }

    public boolean equals(Object obj) {
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }
}
