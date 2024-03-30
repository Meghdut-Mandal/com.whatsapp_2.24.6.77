package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1IU  reason: invalid class name */
public class AnonymousClass1IU {
    public static final byte[] A01 = new byte[0];
    public final AnonymousClass1IV A00;

    public static byte[] A00(C201539jo r5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] A05 = C203239na.A05(bArr, r5.A00);
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong((long) A05.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(A01("HmacSHA512", C203239na.A05(A05, bArr3, order.array()), bArr2), 0, bArr4, 0, 32);
        return bArr4;
    }

    public byte[] A03(C195589Va r4, String str, byte[] bArr, long j) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong(j);
        return A01(DefaultCrypto.HMAC_SHA256, C203239na.A05(bArr, order.array(), str.getBytes(C19430v1.A0D)), this.A00.A00(r4.A00).A01);
    }

    public byte[] A04(C195589Va r4, String str, byte[] bArr, byte[] bArr2, long j) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong(j);
        return A01(DefaultCrypto.HMAC_SHA256, C203239na.A05(bArr2, bArr, order.array(), str.getBytes(C19430v1.A0D)), this.A00.A00(r4.A00).A00);
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new C176168bg(e);
        }
    }

    public AnonymousClass1IU(AnonymousClass1IV r1) {
        this.A00 = r1;
    }

    public static byte[] A01(String str, byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(bArr2, str));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new C176168bg(e);
        }
    }
}
