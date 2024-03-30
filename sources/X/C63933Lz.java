package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.3Lz  reason: invalid class name and case insensitive filesystem */
public abstract class C63933Lz {
    public static C99304t3 A00(Activity activity, Intent intent, View view, int i) {
        C99304t3 A00 = C99304t3.A00(view, R.string.f12nameremoved, 0);
        A00.A0Y(new C48942iJ(activity, i, 2, intent), R.string.f12nameremoved);
        A00.A0X(C36351kA.A02(view.getContext(), view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        return A00;
    }

    public static boolean A01(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(C54542t7.A00(Uri.parse(str)))) {
            return false;
        }
        return true;
    }
}
