package org.apache.xml.security.algorithms;

import X.AnonymousClass001;
import X.C165587tf;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Map;
import org.apache.xml.security.signature.XMLSignatureException;
import org.w3c.dom.Document;

public class MessageDigestAlgorithm extends Algorithm {
    public static ThreadLocal b = new ThreadLocal() {
        public Object initialValue() {
            return AnonymousClass001.A0J();
        }
    };
    public MessageDigest a;

    public MessageDigestAlgorithm(Document document, MessageDigest messageDigest, String str) {
        super(document, str);
        this.a = messageDigest;
    }

    public static MessageDigestAlgorithm a(Document document, String str) {
        return new MessageDigestAlgorithm(document, b(str), str);
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        return MessageDigest.isEqual(bArr, bArr2);
    }

    public void a(byte b2) {
        this.a.update(b2);
    }

    public void a(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }

    public byte[] b() {
        return this.a.digest();
    }

    public void c() {
        this.a.reset();
    }

    public String d() {
        return "http://www.w3.org/2000/09/xmldsig#";
    }

    public String e() {
        return "DigestMethod";
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        MessageDigest messageDigest2 = (MessageDigest) ((Map) b.get()).get(str);
        if (messageDigest2 != null) {
            return messageDigest2;
        }
        String a2 = JCEMapper.a(str);
        if (a2 != null) {
            String str2 = JCEMapper.e;
            if (str2 == null) {
                try {
                    messageDigest = MessageDigest.getInstance(a2);
                } catch (NoSuchAlgorithmException e) {
                    Object[] objArr = new Object[2];
                    objArr[0] = a2;
                    throw C165587tf.A0s(e, objArr);
                } catch (NoSuchProviderException e2) {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = a2;
                    throw C165587tf.A0s(e2, objArr2);
                }
            } else {
                messageDigest = MessageDigest.getInstance(a2, str2);
            }
            ((Map) b.get()).put(str, messageDigest);
            return messageDigest;
        }
        throw new XMLSignatureException("algorithms.NoSuchMap", new Object[]{str});
    }
}
