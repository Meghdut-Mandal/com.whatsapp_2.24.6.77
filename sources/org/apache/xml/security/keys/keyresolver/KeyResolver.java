package org.apache.xml.security.keys.keyresolver;

import X.C165577te;
import X.C36441kJ;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.keys.storage.StorageResolver;

public class KeyResolver {
    public static Log a;
    public static boolean b = false;
    public static List c = null;
    public static Class f;
    public KeyResolverSpi d = null;
    public StorageResolver e = null;

    public abstract class ResolverIterator implements Iterator {
        public Iterator a;
        public int b;

        public abstract boolean hasNext();

        public abstract Object next();

        public abstract void remove();
    }

    static {
        Class b2 = b("org.apache.xml.security.keys.keyresolver.KeyResolver");
        f = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public static void a(String str) {
        c.add(new KeyResolver(str));
    }

    public static void a() {
        if (!b) {
            c = C36441kJ.A14(10);
            b = true;
        }
    }

    public KeyResolver(String str) {
        KeyResolverSpi keyResolverSpi = (KeyResolverSpi) Class.forName(str).newInstance();
        this.d = keyResolverSpi;
        keyResolverSpi.b = true;
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw C165577te.A0m(e2);
        }
    }
}
