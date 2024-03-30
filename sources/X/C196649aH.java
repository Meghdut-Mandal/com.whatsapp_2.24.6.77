package X;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.9aH  reason: invalid class name and case insensitive filesystem */
public abstract class C196649aH {
    public static final C199269f2 A00 = new C199269f2("PhoneskyVerificationUtils");

    public static boolean A00(Signature[] signatureArr) {
        int length;
        String str;
        if (signatureArr == null || (length = signatureArr.length) == 0) {
            C199269f2 r4 = A00;
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 5)) {
                Log.w("PlayCore", C199269f2.A00(r4.A00, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
            }
        } else {
            int i = 0;
            do {
                try {
                    str = Base64.encodeToString(C90504aG.A1a(signatureArr[i].toByteArray(), "SHA-256"), 11);
                } catch (NoSuchAlgorithmException unused) {
                    str = "";
                }
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                    return true;
                }
                String str2 = Build.TAGS;
                if ((str2.contains("dev-keys") || str2.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                    return true;
                }
                i++;
            } while (i < length);
        }
        return false;
    }
}
