package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.Aag  reason: case insensitive filesystem */
public class C21806Aag implements B23 {
    public final int A00;
    public final int A01;
    public final C21665AUh A02;
    public final byte[] A03;
    public final byte[] A04;

    public int getType() {
        return 2;
    }

    public static byte[] A00(SecretKeySpec secretKeySpec, C199299f5 r3, C199299f5 r4, byte[] bArr, int i) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(secretKeySpec);
            if (i >= 3) {
                instance.update(r3.A00.A00());
                instance.update(r4.A00.A00());
            }
            byte[] doFinal = instance.doFinal(bArr);
            byte[] bArr2 = new byte[8];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            return bArr2;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public C21806Aag(byte[] bArr) {
        Throwable th;
        try {
            byte[][] A022 = C200539hZ.A02(bArr, 1, (bArr.length - 1) - 8, 8);
            byte b = A022[0][0];
            byte[] bArr2 = A022[1];
            int i = (b & 255) >> 4;
            if (i <= 1) {
                th = new AnonymousClass18A(AnonymousClass000.A0r("Legacy message: ", AnonymousClass000.A0u(), i));
            } else if (i <= 3) {
                C173198Qt r2 = (C173198Qt) C170918Hz.A08(C173198Qt.DEFAULT_INSTANCE, bArr2);
                int i2 = r2.bitField0_;
                if ((i2 & 8) == 0 || (i2 & 2) == 0 || (i2 & 1) == 0) {
                    th = new AnonymousClass18B("Incomplete message.");
                } else {
                    this.A04 = bArr;
                    this.A02 = C200529hY.A00(r2.ratchetKey_);
                    this.A01 = (b & 255) >> 4;
                    this.A00 = r2.counter_;
                    this.A03 = r2.ciphertext_.A06();
                    return;
                }
            } else {
                th = new AnonymousClass18B(AnonymousClass000.A0r("Unknown version: ", AnonymousClass000.A0u(), i));
            }
            throw th;
        } catch (AnonymousClass186 | AnonymousClass18E | ParseException e) {
            throw new AnonymousClass18B(e);
        }
    }

    public byte[] Bq0() {
        return this.A04;
    }

    public C21806Aag(SecretKeySpec secretKeySpec, C199299f5 r10, C199299f5 r11, C21665AUh aUh, byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = {(byte) (((i << 4) | 3) & 255)};
        AnonymousClass8NN A0p = C173198Qt.DEFAULT_INSTANCE.A0p();
        AnonymousClass8I5 A032 = AnonymousClass8NN.A03(A0p, aUh.A00());
        C173198Qt r1 = (C173198Qt) A0p.A00;
        r1.bitField0_ |= 1;
        r1.ratchetKey_ = A032;
        C173198Qt r12 = (C173198Qt) C90524aI.A0H(A0p);
        r12.bitField0_ |= 2;
        r12.counter_ = i2;
        C173198Qt r13 = (C173198Qt) C90524aI.A0H(A0p);
        r13.bitField0_ |= 4;
        r13.previousCounter_ = i3;
        AnonymousClass8I5 A033 = AnonymousClass8NN.A03(A0p, bArr);
        C173198Qt r14 = (C173198Qt) A0p.A00;
        r14.bitField0_ |= 8;
        r14.ciphertext_ = A033;
        byte[] A0N = AnonymousClass8NN.A0N(A0p);
        this.A04 = C200539hZ.A00(bArr2, A0N, A00(secretKeySpec, r10, r11, C200539hZ.A00(bArr2, A0N), i));
        this.A02 = aUh;
        this.A00 = i2;
        this.A03 = bArr;
        this.A01 = i;
    }
}
