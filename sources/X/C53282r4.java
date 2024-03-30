package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.2r4  reason: invalid class name and case insensitive filesystem */
public abstract class C53282r4 {
    public static void A00(Activity activity, View view, C19420v0 r5, AnonymousClass005 r6) {
        if (((AnonymousClass1RU) r6.get()).A0A() && !C36341k9.A0E(r5).getBoolean("backup_warning_shown", false)) {
            view.setVisibility(0);
            C36401kF.A0H(activity, R.id.banner_description).setText(R.string.f12nameremoved);
            C36421kH.A10(C03570Gk.A0B(activity, R.id.close), view, 3);
            C36331k8.A18(r5, "backup_warning_shown", true);
        }
    }
}
