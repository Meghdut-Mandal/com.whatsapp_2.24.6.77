package X;

import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* renamed from: X.1KN  reason: invalid class name */
public final class AnonymousClass1KN {
    public byte[] A00;
    public byte[] A01;

    public static final byte[] A01(PublicKey publicKey, SecretKey secretKey) {
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        instance.init(1, publicKey, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        byte[] doFinal = instance.doFinal(secretKey.getEncoded());
        AnonymousClass00C.A08(doFinal);
        return doFinal;
    }

    public static final C193019Jn A00(String str) {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128);
        SecretKey generateKey = instance.generateKey();
        byte[] bArr = new byte[16];
        AnonymousClass136.A00().nextBytes(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        byte[] bytes = str.getBytes(AnonymousClass0S4.A05);
        AnonymousClass00C.A08(bytes);
        AnonymousClass00C.A0B(generateKey);
        Cipher instance2 = Cipher.getInstance("AES/GCM/NoPadding");
        instance2.init(1, generateKey, ivParameterSpec);
        byte[] iv = instance2.getIV();
        byte[] doFinal = instance2.doFinal(bytes);
        AnonymousClass00C.A0B(doFinal);
        AnonymousClass00C.A0B(iv);
        return new C193019Jn(generateKey, doFinal, iv);
    }
}
