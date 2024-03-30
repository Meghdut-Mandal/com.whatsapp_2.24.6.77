package org.apache.xml.security.utils.resolver;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165597tg;
import X.C165607th;
import X.C36441kJ;
import X.C90494aF;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.w3c.dom.Attr;

public class ResourceResolver {
    public static Log a = null;
    public static boolean b = false;
    public static List c = null;
    public static boolean d = true;
    public static Class f;
    public ResourceResolverSpi e;

    static {
        Class b2 = b("org.apache.xml.security.utils.resolver.ResourceResolver");
        f = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public ResourceResolver(String str) {
        this.e = null;
        this.e = (ResourceResolverSpi) Class.forName(str).newInstance();
    }

    public ResourceResolver(ResourceResolverSpi resourceResolverSpi) {
        this.e = resourceResolverSpi;
    }

    public static void a(String str) {
        a(str, false);
    }

    private boolean c(Attr attr, String str) {
        return this.e.b(attr, str);
    }

    public void a(Map map) {
        this.e.a(map);
    }

    public XMLSignatureInput b(Attr attr, String str) {
        return this.e.a(attr, str);
    }

    public static final ResourceResolver a(Attr attr, String str) {
        String str2;
        int size = c.size();
        for (int i = 0; i < size; i++) {
            ResourceResolver resourceResolver = (ResourceResolver) c.get(i);
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0x = C165607th.A0x();
                A0x.append("check resolvability by class ");
                C165567td.A1Q(AnonymousClass000.A0k(resourceResolver.e), A0x, log);
            } else if (resourceResolver == null) {
                continue;
            }
            if (resourceResolver.e.b(attr, str)) {
                if (i != 0) {
                    List list = (List) ((ArrayList) c).clone();
                    list.remove(i);
                    list.add(0, resourceResolver);
                    c = list;
                }
                return resourceResolver;
            }
        }
        Object[] A0M = AnonymousClass001.A0M();
        if (attr != null) {
            str2 = attr.getNodeValue();
        } else {
            str2 = "null";
        }
        C90494aF.A1H(str2, str, A0M);
        throw new ResourceResolverException("utils.resolver.noClass", A0M, attr, str);
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw C165577te.A0m(e2);
        }
    }

    public static final ResourceResolver a(Attr attr, String str, List list) {
        int size;
        int size2;
        int i = 0;
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer A0x = C165607th.A0x();
            A0x.append("I was asked to create a ResourceResolver and got ");
            if (list == null) {
                size2 = 0;
            } else {
                size2 = list.size();
            }
            A0x.append(size2);
            log.debug(A0x.toString());
            Log log2 = a;
            StringBuffer A0x2 = C165607th.A0x();
            A0x2.append(" extra resolvers to my existing ");
            A0x2.append(c.size());
            C165567td.A1Q(" system-wide resolvers", A0x2, log2);
        }
        if (list == null || (size = list.size()) <= 0) {
            return a(attr, str);
        }
        do {
            ResourceResolver resourceResolver = (ResourceResolver) list.get(i);
            if (resourceResolver != null) {
                String A0k = AnonymousClass000.A0k(resourceResolver.e);
                if (a.isDebugEnabled()) {
                    C165567td.A1O("check resolvability by class ", A0k, C165607th.A0x(), a);
                }
                if (resourceResolver.e.b(attr, str)) {
                    return resourceResolver;
                }
            }
            i++;
        } while (i < size);
        return a(attr, str);
    }

    public static void a(String str, boolean z) {
        try {
            ResourceResolver resourceResolver = new ResourceResolver(str);
            if (z) {
                c.add(0, resourceResolver);
                a.debug("registered resolver");
                return;
            }
            c.add(resourceResolver);
        } catch (Exception | NoClassDefFoundError unused) {
            a.warn(C165577te.A0l(str, " disabling it", C165597tg.A0p("Error loading resolver ")));
        }
    }

    public static void a() {
        if (!b) {
            c = C36441kJ.A14(10);
            b = true;
        }
    }
}
