package X;

import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.6HE  reason: invalid class name */
public abstract class AnonymousClass6HE {
    public static final byte[] A00(String str, String str2) {
        AnonymousClass00C.A0D(str, 0);
        try {
            byte[] decode = Base64.decode(str2, 2);
            AnonymousClass00C.A08(decode);
            MessageDigest A0s = C90504aG.A0s();
            AnonymousClass00C.A08(A0s);
            A0s.update(decode);
            Charset forName = Charset.forName(DefaultCrypto.UTF_8);
            AnonymousClass00C.A08(forName);
            return A0s.digest(C36371kC.A1Z(str, forName));
        } catch (Exception unused) {
            Log.e("Exception generating hash at sha256Bytes");
            return null;
        }
    }

    public static final byte[] A01(String str, byte[] bArr, byte[] bArr2) {
        SecretKeySpec A0m = C90494aF.A0m(bArr2);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode(str, 2));
        Cipher A19 = C90514aH.A19();
        AnonymousClass00C.A08(A19);
        A19.init(1, A0m, ivParameterSpec);
        byte[] doFinal = A19.doFinal(bArr);
        AnonymousClass00C.A08(doFinal);
        return doFinal;
    }
}
