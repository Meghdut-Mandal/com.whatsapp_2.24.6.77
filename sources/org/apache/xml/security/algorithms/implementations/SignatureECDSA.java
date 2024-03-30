package org.apache.xml.security.algorithms.implementations;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C36331k8;
import X.C90524aI;
import java.io.IOException;
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
import org.apache.xml.security.utils.Base64;

public abstract class SignatureECDSA extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class b;
    public static Class c;
    public Signature d = null;

    public class SignatureECDSASHA1 extends SignatureECDSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1";
        }
    }

    static {
        Class a2 = a("org.apache.xml.security.algorithms.implementations.SignatureECDSA");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public static byte[] c(byte[] bArr) {
        int length = bArr.length;
        if (length >= 48) {
            int i = length / 2;
            int i2 = i;
            while (i2 > 0 && bArr[i - i2] == 0) {
                i2--;
            }
            int i3 = i - i2;
            int i4 = i2;
            if (bArr[i3] < 0) {
                i4 = i2 + 1;
            }
            int i5 = i;
            while (i5 > 0 && bArr[(i * 2) - i5] == 0) {
                i5--;
            }
            int i6 = (i * 2) - i5;
            int i7 = i5;
            if (bArr[i6] < 0) {
                i7 = i5 + 1;
            }
            int i8 = i4 + 6 + i7;
            byte[] bArr2 = new byte[i8];
            bArr2[0] = 48;
            int i9 = i4 + 4;
            bArr2[1] = (byte) (i9 + i7);
            bArr2[2] = 2;
            bArr2[3] = (byte) i4;
            System.arraycopy(bArr, i3, bArr2, i9 - i2, i2);
            bArr2[i9] = 2;
            bArr2[i4 + 5] = (byte) i7;
            System.arraycopy(bArr, i6, bArr2, i8 - i5, i5);
            return bArr2;
        }
        throw C90524aI.A0X("Invalid XMLDSIG format of ECDSA signature");
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
            byte[] c2 = c(bArr);
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0x = C165607th.A0x();
                A0x.append("Called ECDSA.verify() on ");
                C165567td.A1Q(Base64.b(bArr), A0x, log);
            }
            return this.d.verify(c2);
        } catch (SignatureException e) {
            throw new XMLSignatureException("empty", (Exception) e);
        } catch (IOException e2) {
            throw new XMLSignatureException("empty", (Exception) e2);
        }
    }

    public SignatureECDSA() {
        Signature signature;
        String a2 = JCEMapper.a("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1");
        if (a.isDebugEnabled()) {
            C165567td.A1O("Created SignatureECDSA using ", a2, C165607th.A0x(), a);
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
