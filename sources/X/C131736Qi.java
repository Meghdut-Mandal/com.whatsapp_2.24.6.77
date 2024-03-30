package X;

import android.media.MediaCodec;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.6Qi  reason: invalid class name and case insensitive filesystem */
public abstract class C131736Qi {
    public static final String A00(MediaCodec.CodecException codecException) {
        Object obj;
        AnonymousClass00C.A0D(codecException, 0);
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        if (Build.VERSION.SDK_INT >= 23) {
            obj = Integer.valueOf(codecException.getErrorCode());
        } else {
            obj = "null";
        }
        objArr[0] = obj;
        objArr[1] = codecException.getDiagnosticInfo();
        AnonymousClass000.A1N(objArr, 2, codecException.isRecoverable());
        AnonymousClass000.A1N(objArr, 3, codecException.isTransient());
        return C90494aF.A0e(locale, "mediaCodecErrorCode: %s, mediaCodecErrorDiagnosticInfo: %s, isRecoverable: %s, isTransient: %s", Arrays.copyOf(objArr, 4));
    }

    public static final String A01(Class cls, Map map) {
        StringBuilder A0h = C90524aI.A0h(32);
        A0h.append(cls.getSimpleName());
        A0h.append('{');
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String A0f = C90494aF.A0f(A11);
            Object value = A11.getValue();
            A0h.append(A0f);
            A0h.append('=');
            A0h.append(value);
            C90504aG.A1M(A0h);
        }
        if (A0h.charAt(A0h.length() - 2) == ',') {
            A0h.delete(A0h.length() - 2, A0h.length());
        }
        String A0s = AnonymousClass000.A0s(A0h);
        AnonymousClass00C.A08(A0s);
        return A0s;
    }

    public static final void A02(boolean z, String str) {
        if (!z) {
            if (str == null) {
                str = "";
            }
            throw AnonymousClass001.A08(str);
        }
    }
}
