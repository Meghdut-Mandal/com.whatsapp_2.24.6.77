package X;

import android.text.SpannableString;
import com.whatsapp.util.Log;

/* renamed from: X.5bF  reason: invalid class name and case insensitive filesystem */
public abstract class C110795bF {
    public static final SpannableString A00(String str, int i) {
        AnonymousClass00C.A0D(str, 0);
        int i2 = i - 3;
        if (AnonymousClass099.A09(str, 8206, 0, false) >= 0) {
            i2++;
        }
        if (str.length() <= 0 || i2 <= 0) {
            Log.e("FlowsUtil/truncateTextWithEllipsis -- actual string is empty or truncatedLength is invalid");
            return C36441kJ.A0O(str);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C36431kI.A16(0, i2, str));
        return C36441kJ.A0O(AnonymousClass000.A0q("...", A0u));
    }
}
