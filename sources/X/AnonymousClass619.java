package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.619  reason: invalid class name */
public final class AnonymousClass619 {
    public final C19630wG A00;

    public AnonymousClass619(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final ArrayList A00(String str) {
        String str2;
        AnonymousClass00C.A0D(str, 0);
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            Signature[] signatureArr = this.A00.A00.getPackageManager().getPackageInfo(str, 64).signatures;
            AnonymousClass00C.A0B(signatureArr);
            for (Signature charsString : signatureArr) {
                String charsString2 = charsString.toCharsString();
                AnonymousClass00C.A08(charsString2);
                String A0f = C90464aC.A0f(charsString2, AnonymousClass000.A0v(str), ' ');
                try {
                    MessageDigest A0s = C90504aG.A0s();
                    Charset charset = StandardCharsets.UTF_8;
                    AnonymousClass00C.A09(charset);
                    A0s.update(C36371kC.A1Z(A0f, charset));
                    String encodeToString = Base64.encodeToString(Arrays.copyOfRange(A0s.digest(), 0, 9), 3);
                    AnonymousClass00C.A0B(encodeToString);
                    str2 = C36431kI.A16(0, 11, encodeToString);
                } catch (NoSuchAlgorithmException unused) {
                    Log.e("OTPHashUtil/hash:NoSuchAlgorithm");
                    str2 = null;
                }
                if (str2 != null) {
                    A0I.add(C36391kE.A0y("%s", Locale.US, new Object[]{str2}, 1));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.e("OTPHashUtil/Unable to find package to obtain hash");
        }
        return A0I;
    }
}
