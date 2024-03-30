package org.apache.xml.security.algorithms.implementations;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165597tg;
import X.C165607th;
import X.C36331k8;
import X.C36411kG;
import X.C36431kI;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.MessageDigestAlgorithm;
import org.apache.xml.security.algorithms.SignatureAlgorithmSpi;
import org.apache.xml.security.signature.XMLSignatureException;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public abstract class IntegrityHmac extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class c;
    public static Class d;
    public int b = 0;
    public Mac e = null;
    public boolean f = false;

    public class IntegrityHmacMD5 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-md5";
        }

        public int e() {
            return 128;
        }
    }

    public class IntegrityHmacRIPEMD160 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160";
        }

        public int e() {
            return 160;
        }
    }

    public class IntegrityHmacSHA1 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2000/09/xmldsig#hmac-sha1";
        }

        public int e() {
            return 160;
        }
    }

    public class IntegrityHmacSHA256 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256";
        }

        public int e() {
            return 256;
        }
    }

    public class IntegrityHmacSHA384 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384";
        }

        public int e() {
            return 384;
        }
    }

    public class IntegrityHmacSHA512 extends IntegrityHmac {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512";
        }

        public int e() {
            return 512;
        }
    }

    static {
        Class a2 = a("org.apache.xml.security.algorithms.implementations.IntegrityHmac$IntegrityHmacSHA1");
        c = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public String a() {
        a.debug("engineGetJCEAlgorithmString()");
        return this.e.getAlgorithm();
    }

    public String b() {
        return this.e.getProvider().getName();
    }

    public void c() {
        this.b = 0;
        this.f = false;
        this.e.reset();
    }

    public abstract String d();

    public abstract int e();

    public void a(byte[] bArr, int i, int i2) {
        try {
            this.e.update(bArr, i, i2);
        } catch (IllegalStateException e2) {
            throw C165597tg.A0v(e2);
        }
    }

    public boolean b(byte[] bArr) {
        int e2;
        try {
            if (!this.f || this.b >= (e2 = e())) {
                byte[] doFinal = this.e.doFinal();
                ThreadLocal threadLocal = MessageDigestAlgorithm.b;
                return MessageDigest.isEqual(doFinal, bArr);
            }
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0x = C165607th.A0x();
                A0x.append("HMACOutputLength must not be less than ");
                A0x.append(e2);
                log.debug(A0x.toString());
            }
            Object[] A0L = AnonymousClass001.A0L();
            C36431kI.A1O(A0L, e2, 0);
            throw new XMLSignatureException("algorithms.HMACOutputLengthMin", A0L);
        } catch (IllegalStateException e3) {
            throw C165597tg.A0v(e3);
        }
    }

    public IntegrityHmac() {
        String a2 = JCEMapper.a(d());
        if (a.isDebugEnabled()) {
            C165567td.A1O("Created IntegrityHmacSHA1 using ", a2, C165607th.A0x(), a);
        }
        try {
            this.e = Mac.getInstance(a2);
        } catch (NoSuchAlgorithmException e2) {
            Object[] A1b = C36411kG.A1b(a2);
            A1b[1] = e2.getLocalizedMessage();
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", A1b);
        }
    }

    public void a(Key key) {
        if (!(key instanceof SecretKey)) {
            String A0k = AnonymousClass000.A0k(key);
            Class cls = d;
            if (cls == null) {
                cls = a("javax.crypto.SecretKey");
                d = cls;
            }
            String name = cls.getName();
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1N(A0k, name, A0M);
            throw new XMLSignatureException("algorithms.WrongKeyForThisOperation", A0M);
        }
        try {
            this.e.init(key);
        } catch (InvalidKeyException e2) {
            Mac mac = this.e;
            try {
                this.e = Mac.getInstance(mac.getAlgorithm());
            } catch (Exception e3) {
                if (a.isDebugEnabled()) {
                    C165577te.A1J(e3, "Exception when reinstantiating Mac:", C165607th.A0x(), a);
                }
                this.e = mac;
            }
            throw C165597tg.A0v(e2);
        }
    }

    public void a(byte b2) {
        try {
            this.e.update(b2);
        } catch (IllegalStateException e2) {
            throw C165597tg.A0v(e2);
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw C165577te.A0m(e2);
        }
    }

    public void a(Element element) {
        if (element != null) {
            Text b2 = XMLUtils.b(element.getFirstChild(), "HMACOutputLength", 0);
            if (b2 != null) {
                this.b = Integer.parseInt(b2.getData());
                this.f = true;
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("element null");
    }

    public void a(byte[] bArr) {
        try {
            this.e.update(bArr);
        } catch (IllegalStateException e2) {
            throw C165597tg.A0v(e2);
        }
    }
}
