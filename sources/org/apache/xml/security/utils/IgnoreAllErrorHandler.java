package org.apache.xml.security.utils;

import X.C165577te;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

public class IgnoreAllErrorHandler implements ErrorHandler {
    public static Log a;
    public static final boolean b = System.getProperty("org.apache.xml.security.test.warn.on.exceptions", "false").equals("true");
    public static final boolean c = System.getProperty("org.apache.xml.security.test.throw.exceptions", "false").equals("true");
    public static Class d;

    static {
        Class a2 = a("org.apache.xml.security.utils.IgnoreAllErrorHandler");
        d = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public void error(SAXParseException sAXParseException) {
        if (b) {
            a.error("", sAXParseException);
        }
        if (c) {
            throw sAXParseException;
        }
    }

    public void fatalError(SAXParseException sAXParseException) {
        if (b) {
            a.warn("", sAXParseException);
        }
        if (c) {
            throw sAXParseException;
        }
    }

    public void warning(SAXParseException sAXParseException) {
        if (b) {
            a.warn("", sAXParseException);
        }
        if (c) {
            throw sAXParseException;
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }
}
