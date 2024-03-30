package X;

import java.io.ByteArrayOutputStream;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;

/* renamed from: X.6Na  reason: invalid class name and case insensitive filesystem */
public class C130936Na {
    public static C122515uy A00(C145546u7 r2, String str, X509Certificate x509Certificate) {
        C122515uy A03 = r2.A01.A03(str, x509Certificate);
        C19970wo.A00(r2.A00);
        return A03;
    }

    public String A04(C122515uy r7, PrivateKey privateKey) {
        byte[] bArr = r7.A01;
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPPadding");
        instance.init(2, privateKey);
        byte[] doFinal = instance.doFinal(bArr);
        byte[] bArr2 = r7.A00;
        byte[] bArr3 = r7.A03;
        int length = bArr2.length;
        int length2 = bArr3.length;
        byte[] copyOf = Arrays.copyOf(bArr2, length + length2);
        System.arraycopy(bArr3, 0, copyOf, length, length2);
        return new String(C90484aE.A1a(C90494aF.A0m(doFinal), C90514aH.A19(), r7.A02, copyOf), C19430v1.A0B);
    }

    public static String A01(Integer num, String str, String str2, PublicKey publicKey) {
        SecretKey A0n = C90464aC.A0n();
        byte[] bArr = new byte[12];
        C90504aG.A1Q(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        byte[] bytes = str.getBytes();
        Cipher A19 = C90514aH.A19();
        A19.init(1, A0n, ivParameterSpec);
        if (str2 != null && !str2.isEmpty()) {
            A19.updateAAD(str2.getBytes());
        }
        byte[] iv = A19.getIV();
        byte[] doFinal = A19.doFinal(bytes);
        int length = doFinal.length;
        int i = length - 16;
        byte[] copyOfRange = Arrays.copyOfRange(doFinal, 0, i);
        byte[] copyOfRange2 = Arrays.copyOfRange(doFinal, i, length);
        byte byteValue = num.byteValue();
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(1, publicKey);
        byte[] doFinal2 = instance.doFinal(A0n.getEncoded());
        short length2 = (short) doFinal2.length;
        byte[] bArr2 = {(byte) (length2 & 255), (byte) ((length2 >> 8) & 255)};
        ByteArrayOutputStream A0Q = C90524aI.A0Q();
        A0Q.write(1);
        A0Q.write(byteValue);
        A0Q.write(iv);
        A0Q.write(bArr2);
        A0Q.write(doFinal2);
        A0Q.write(copyOfRange2);
        A0Q.write(copyOfRange);
        byte[] byteArray = A0Q.toByteArray();
        A0Q.close();
        return C90504aG.A0o(byteArray);
    }

    public static JSONObject A02(C122515uy r0, C130936Na r1, PrivateKey privateKey) {
        return new JSONObject(r1.A04(r0, privateKey));
    }

    public C122515uy A03(String str, X509Certificate x509Certificate) {
        SecretKey A0n = C90464aC.A0n();
        byte[] bArr = new byte[12];
        C90504aG.A1Q(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        byte[] bytes = str.getBytes();
        Cipher A19 = C90514aH.A19();
        A19.init(1, A0n, ivParameterSpec);
        byte[] iv = A19.getIV();
        byte[] doFinal = A19.doFinal(bytes);
        int length = doFinal.length;
        int i = length - 16;
        byte[] copyOfRange = Arrays.copyOfRange(doFinal, 0, i);
        byte[] copyOfRange2 = Arrays.copyOfRange(doFinal, i, length);
        PublicKey publicKey = x509Certificate.getPublicKey();
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPPadding");
        instance.init(1, publicKey);
        return new C122515uy(instance.doFinal(A0n.getEncoded()), copyOfRange, copyOfRange2, iv);
    }
}
