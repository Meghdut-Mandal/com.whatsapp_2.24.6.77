package org.apache.xml.security.algorithms;

import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import X.C36431kI;
import X.C90514aH;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.apache.xml.security.signature.XMLSignatureException;
import org.w3c.dom.Element;

public class SignatureAlgorithm extends Algorithm {
    public static Log a;
    public static boolean b = false;
    public static HashMap c = null;
    public static ThreadLocal d = new ThreadLocal() {
        public Object initialValue() {
            return AnonymousClass001.A0J();
        }
    };
    public static ThreadLocal e = new ThreadLocal() {
        public Object initialValue() {
            return AnonymousClass001.A0J();
        }
    };
    public static ThreadLocal f = new ThreadLocal() {
        public Object initialValue() {
            return AnonymousClass001.A0J();
        }
    };
    public static ThreadLocal g = new ThreadLocal() {
        public Object initialValue() {
            return AnonymousClass001.A0J();
        }
    };
    public static Class i;
    public SignatureAlgorithmSpi h = null;
    public String q = g();

    static {
        Class b2 = b("org.apache.xml.security.algorithms.SignatureAlgorithm");
        i = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public SignatureAlgorithm(Element element, String str) {
        super(element, str);
    }

    private void a(boolean z) {
        String str = this.q;
        SignatureAlgorithmSpi d2 = z ? d(str) : e(str);
        this.h = d2;
        d2.a(this.k);
    }

    public static SignatureAlgorithmSpi d(String str) {
        SignatureAlgorithmSpi signatureAlgorithmSpi = (SignatureAlgorithmSpi) ((Map) d.get()).get(str);
        if (signatureAlgorithmSpi != null) {
            signatureAlgorithmSpi.c();
            return signatureAlgorithmSpi;
        }
        SignatureAlgorithmSpi f2 = f(str);
        ((Map) d.get()).put(str, f2);
        return f2;
    }

    public static SignatureAlgorithmSpi e(String str) {
        SignatureAlgorithmSpi signatureAlgorithmSpi = (SignatureAlgorithmSpi) ((Map) e.get()).get(str);
        if (signatureAlgorithmSpi != null) {
            signatureAlgorithmSpi.c();
            return signatureAlgorithmSpi;
        }
        SignatureAlgorithmSpi f2 = f(str);
        ((Map) e.get()).put(str, f2);
        return f2;
    }

    public static Class g(String str) {
        HashMap hashMap = c;
        if (hashMap == null) {
            return null;
        }
        return (Class) hashMap.get(str);
    }

    public static void h() {
        Log log = a;
        if (log == null) {
            Class cls = i;
            if (cls == null) {
                cls = b("org.apache.xml.security.algorithms.SignatureAlgorithm");
                i = cls;
            }
            log = LogFactory.getLog(cls.getName());
            a = log;
        }
        log.debug("Init() called");
        if (!b) {
            c = new HashMap(10);
            b = true;
        }
    }

    public void a(byte b2) {
        this.h.a(b2);
    }

    public void a(Key key) {
        a(false);
        Map map = (Map) g.get();
        if (map.get(this.q) != key) {
            map.put(this.q, key);
            this.h.a(key);
        }
    }

    public void a(byte[] bArr) {
        this.h.a(bArr);
    }

    public void a(byte[] bArr, int i2, int i3) {
        this.h.a(bArr, i2, i3);
    }

    public String b() {
        try {
            return e(this.q).a();
        } catch (XMLSignatureException unused) {
            return null;
        }
    }

    public boolean b(byte[] bArr) {
        return this.h.b(bArr);
    }

    public String c() {
        try {
            return e(this.q).b();
        } catch (XMLSignatureException unused) {
            return null;
        }
    }

    public String d() {
        return "http://www.w3.org/2000/09/xmldsig#";
    }

    public String e() {
        return "SignatureMethod";
    }

    public void f() {
        ((Map) g.get()).clear();
        ((Map) e.get()).clear();
    }

    public final String g() {
        return this.k.getAttributeNS((String) null, "Algorithm");
    }

    public static void a(String str, String str2) {
        String name;
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer A0x = C165607th.A0x();
            A0x.append("Try to register ");
            A0x.append(str);
            C165567td.A1O(" ", str2, A0x, log);
        }
        Class g2 = g(str);
        if (g2 == null || (name = g2.getName()) == null || name.length() == 0) {
            try {
                c.put(str, Class.forName(str2));
            } catch (ClassNotFoundException e2) {
                Object[] objArr = new Object[2];
                objArr[0] = str;
                C90514aH.A1U(e2, objArr, 1);
                throw new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr, e2);
            } catch (NullPointerException e3) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = str;
                C90514aH.A1U(e3, objArr2, 1);
                throw new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr2, e3);
            }
        } else {
            throw new AlgorithmAlreadyRegisteredException("algorithm.alreadyRegistered", C36431kI.A1a(str, name, 2));
        }
    }

    public static SignatureAlgorithmSpi f(String str) {
        try {
            Class g2 = g(str);
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0x = C165607th.A0x();
                A0x.append("Create URI \"");
                A0x.append(str);
                A0x.append("\" class \"");
                A0x.append(g2);
                C165567td.A1Q("\"", A0x, log);
            }
            return (SignatureAlgorithmSpi) g2.newInstance();
        } catch (IllegalAccessException e2) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            C90514aH.A1U(e2, objArr, 1);
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr, e2);
        } catch (InstantiationException e3) {
            Object[] objArr2 = new Object[2];
            objArr2[0] = str;
            C90514aH.A1U(e3, objArr2, 1);
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr2, e3);
        } catch (NullPointerException e4) {
            Object[] objArr3 = new Object[2];
            objArr3[0] = str;
            C90514aH.A1U(e4, objArr3, 1);
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr3, e4);
        }
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw C165577te.A0m(e2);
        }
    }
}
