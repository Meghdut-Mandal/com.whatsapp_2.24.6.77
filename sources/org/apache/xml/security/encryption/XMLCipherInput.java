package org.apache.xml.security.encryption;

import X.C165577te;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class XMLCipherInput {
    public static Class a;
    public static Log b;

    static {
        Class a2 = a("org.apache.xml.security.encryption.XMLCipher");
        a = a2;
        b = LogFactory.getLog(a2.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }
}
