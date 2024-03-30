package X;

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

public class AF2 implements C22969AzL {
    public final byte[] A00;

    public AF2(byte[] bArr) {
        this.A00 = bArr;
    }

    public byte[] B6U(byte[] bArr, byte[] bArr2) {
        AZA A002 = AZA.A00();
        byte[] bArr3 = A002.A02.A01;
        byte[][] A08 = C203239na.A08(C131336Oq.A00().A02(new AZ8(this.A00).A01, A002.A01.A01), bArr3);
        byte[] bArr4 = A08[0];
        byte[] bArr5 = A08[1];
        try {
            SecretKeySpec A0m = C90494aF.A0m(bArr4);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, A0m, new IvParameterSpec(bArr2));
            byte[] doFinal = instance.doFinal(bArr);
            try {
                Mac A0q = C165587tf.A0q(bArr5);
                A0q.update(bArr2);
                byte[] doFinal2 = A0q.doFinal(doFinal);
                byte[][] bArr6 = new byte[4][];
                bArr6[0] = bArr2;
                C90464aC.A1D(bArr3, doFinal2, doFinal, bArr6);
                byte[] A05 = C203239na.A05(bArr6);
                A002.destroy();
                return A05;
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw C90524aI.A0Y(e);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            throw C90524aI.A0Y(e2);
        }
    }
}
