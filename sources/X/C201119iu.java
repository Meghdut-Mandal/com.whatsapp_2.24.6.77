package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9iu  reason: invalid class name and case insensitive filesystem */
public class C201119iu {
    public static final byte[] A03 = {2};
    public static final byte[] A04 = {1};
    public final int A00;
    public final C201249jC A01;
    public final byte[] A02;

    public static byte[] A00(C201119iu r4, byte[] bArr) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(new SecretKeySpec(r4.A02, DefaultCrypto.HMAC_SHA256));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public AnonymousClass9M6 A01() {
        try {
            byte[][] A022 = C200539hZ.A02(this.A01.A02(A00(this, A04), "WhisperMessageKeys".getBytes(), 80), 32, 32, 16);
            SecretKeySpec A0m = C90494aF.A0m(A022[0]);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A022[1], DefaultCrypto.HMAC_SHA256);
            return new AnonymousClass9M6(new IvParameterSpec(A022[2]), A0m, secretKeySpec, this.A00);
        } catch (ParseException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public C201119iu(C201249jC r1, byte[] bArr, int i) {
        this.A01 = r1;
        this.A02 = bArr;
        this.A00 = i;
    }
}
