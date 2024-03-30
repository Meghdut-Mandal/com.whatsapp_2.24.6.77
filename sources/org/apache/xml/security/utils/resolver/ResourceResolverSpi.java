package org.apache.xml.security.utils.resolver;

import X.AnonymousClass001;
import X.C165577te;
import X.C36431kI;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.w3c.dom.Attr;

public abstract class ResourceResolverSpi {
    public static Log a;
    public static Class c;
    public Map b = null;

    static {
        Class b2 = b("org.apache.xml.security.utils.resolver.ResourceResolverSpi");
        c = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public abstract XMLSignatureInput a(Attr attr, String str);

    public abstract boolean a();

    public abstract boolean b(Attr attr, String str);

    public void a(Map map) {
        if (map != null) {
            Map map2 = this.b;
            if (map2 == null) {
                map2 = AnonymousClass001.A0J();
                this.b = map2;
            }
            map2.putAll(map);
        }
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }

    public String a(String str) {
        Map map = this.b;
        if (map == null) {
            return null;
        }
        return C36431kI.A1A(str, map);
    }
}
