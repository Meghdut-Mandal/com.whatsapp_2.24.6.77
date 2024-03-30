package org.apache.xml.security.algorithms.implementations;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C36331k8;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.SignatureAlgorithmSpi;
import org.apache.xml.security.signature.XMLSignatureException;

public abstract class SignatureBaseRSA extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class b;
    public static Class c;
    public Signature d = null;

    public class SignatureRSAMD5 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#rsa-md5";
        }
    }

    public class SignatureRSARIPEMD160 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160";
        }
    }

    public class SignatureRSASHA1 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
        }
    }

    public class SignatureRSASHA256 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
        }
    }

    public class SignatureRSASHA384 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384";
        }
    }

    public class SignatureRSASHA512 extends SignatureBaseRSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512";
        }
    }

    static {
        Class a2 = a("org.apache.xml.security.algorithms.implementations.SignatureBaseRSA");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public String a() {
        return this.d.getAlgorithm();
    }

    public String b() {
        return this.d.getProvider().getName();
    }

    public abstract String d();

    public void a(byte[] bArr, int i, int i2) {
        try {
            this.d.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw C165597tg.A0v(e);
        }
    }

    public boolean b(byte[] bArr) {
        try {
            return this.d.verify(bArr);
        } catch (SignatureException e) {
            throw C165597tg.A0v(e);
        }
    }

    public SignatureBaseRSA() {
        Signature signature;
        String a2 = JCEMapper.a(d());
        if (a.isDebugEnabled()) {
            C165567td.A1O("Created SignatureRSA using ", a2, C165607th.A0x(), a);
        }
        String str = JCEMapper.e;
        if (str == null) {
            signature = Signature.getInstance(a2);
        } else {
            try {
                signature = Signature.getInstance(a2, str);
            } catch (NoSuchAlgorithmException e) {
                Object[] objArr = new Object[2];
                objArr[0] = a2;
                throw C165587tf.A0s(e, objArr);
            } catch (NoSuchProviderException e2) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = a2;
                throw C165587tf.A0s(e2, objArr2);
            }
        }
        this.d = signature;
    }

    public void a(Key key) {
        if (!(key instanceof PublicKey)) {
            String A0k = AnonymousClass000.A0k(key);
            Class cls = c;
            if (cls == null) {
                cls = a("java.security.PublicKey");
                c = cls;
            }
            String name = cls.getName();
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1N(A0k, name, A0M);
            throw new XMLSignatureException("algorithms.WrongKeyForThisOperation", A0M);
        }
        try {
            this.d.initVerify((PublicKey) key);
        } catch (InvalidKeyException e) {
            Signature signature = this.d;
            try {
                this.d = Signature.getInstance(signature.getAlgorithm());
            } catch (Exception e2) {
                if (a.isDebugEnabled()) {
                    C165577te.A1J(e2, "Exception when reinstantiating Signature:", C165607th.A0x(), a);
                }
                this.d = signature;
            }
            throw C165597tg.A0v(e);
        }
    }

    public void a(byte b2) {
        try {
            this.d.update(b2);
        } catch (SignatureException e) {
            throw C165597tg.A0v(e);
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }

    public void a(byte[] bArr) {
        try {
            this.d.update(bArr);
        } catch (SignatureException e) {
            throw C165597tg.A0v(e);
        }
    }
}
