package X;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.6Uw  reason: invalid class name and case insensitive filesystem */
public class C132696Uw {
    public final AnonymousClass1VE A00;

    private synchronized byte[] A00(C128946Ef r8) {
        String A0t;
        AnonymousClass1VE r4 = this.A00;
        String str = r8.A01;
        A0t = C36371kC.A0t(AnonymousClass1VE.A00(r4), AnonymousClass1VE.A01(str, "auth/encryption_key"));
        if (A0t == null) {
            try {
                Set set = C131936Rj.A00;
                KeyGenerator instance = KeyGenerator.getInstance("AES");
                KeyGenerator keyGenerator = (KeyGenerator) C131936Rj.A00(instance, "AES", instance.getProvider().getName());
                SecureRandom A01 = C131936Rj.A01();
                byte[] encoded = keyGenerator.generateKey().getEncoded();
                keyGenerator.init(256, A01);
                A0t = C90504aG.A0o(encoded);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                A0t = null;
            }
            C36341k9.A0x(AnonymousClass1VE.A00(r4).edit(), AnonymousClass1VE.A01(str, "auth/encryption_key"), A0t);
        }
        return Base64.decode(A0t, 11);
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2) {
        boolean z = true;
        byte[] A0L = C18750th.A0L(bArr, bArr2);
        if (A0L.length < 20) {
            z = false;
        }
        C18740tg.A0B(z);
        byte[] bArr3 = new byte[20];
        System.arraycopy(A0L, 0, bArr3, 0, 20);
        return bArr3;
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec A0m = C90494aF.A0m(bArr3);
            Set set = C131936Rj.A00;
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            Cipher cipher = (Cipher) C131936Rj.A00(instance, "AES/CBC/PKCS5Padding", instance.getProvider().getName());
            cipher.init(i, A0m, ivParameterSpec);
            return cipher.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new SecurityException(e);
        }
    }

    public String A03(C128946Ef r9, String str) {
        if (r9.A03) {
            byte[] decode = Base64.decode(str, 11);
            try {
                byte[][] A07 = C203239na.A07(decode, 20, 16, (decode.length - 20) - 16);
                byte[] bArr = A07[0];
                byte[] bArr2 = A07[1];
                byte[] bArr3 = A07[2];
                byte[] A002 = A00(r9);
                if (Arrays.equals(bArr, A01(A002, C203239na.A05(bArr2, bArr3)))) {
                    return new String(A02(bArr2, bArr3, A002, 2));
                }
                throw new SecurityException("Data mac corrupt");
            } catch (ParseException e) {
                throw new SecurityException(e);
            }
        } else {
            throw new SecurityException("Caller isn't trusted");
        }
    }

    public String A04(C128946Ef r8, String str) {
        if (r8.A03) {
            byte[] A002 = A00(r8);
            byte[] A01 = A01(A002, str.getBytes());
            C18740tg.A0B(true);
            byte[] bArr = new byte[16];
            System.arraycopy(A01, 0, bArr, 0, 16);
            byte[] A05 = C203239na.A05(bArr, A02(bArr, str.getBytes(), A002, 1));
            return C90504aG.A0o(C203239na.A05(A01(A002, A05), A05));
        }
        throw new SecurityException("Caller isn't trusted");
    }

    public C132696Uw(AnonymousClass1VE r1) {
        this.A00 = r1;
    }
}
