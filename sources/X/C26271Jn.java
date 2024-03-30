package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;

/* renamed from: X.1Jn  reason: invalid class name and case insensitive filesystem */
public class C26271Jn {
    public final C21010yW A00;

    public static void A01(C21010yW r3, String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/missing message secret");
        Log.e(sb.toString());
        C44862Pd r2 = new C44862Pd();
        r2.A02 = 0;
        r2.A00 = Integer.valueOf(i);
        r2.A01 = 0;
        r3.Bly(r2);
    }

    public void A02(int i, int i2) {
        C44862Pd r1 = new C44862Pd();
        r1.A02 = Integer.valueOf(i);
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = 0;
        this.A00.Bly(r1);
    }

    public C26271Jn(C21010yW r1) {
        this.A00 = r1;
    }

    public static Integer A00(AnonymousClass3T1 r2, C26271Jn r3, int i) {
        int i2;
        boolean A002 = AnonymousClass6HP.A00(r2);
        if (!A002 && !r2.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
            return null;
        }
        if (r2.A1I()) {
            if (r2.A1b.length == 32) {
                return null;
            }
            r3.A02(1, i);
            i2 = 67;
        } else if (!A002) {
            return null;
        } else {
            r3.A02(0, i);
            i2 = 66;
        }
        return Integer.valueOf(i2);
    }
}
