package X;

import android.content.res.Resources;
import com.whatsapp.R;

/* renamed from: X.96w  reason: invalid class name and case insensitive filesystem */
public abstract class C1900996w {
    public static void A00(C225314u r5) {
        Resources resources = r5.getResources();
        C20810yC r1 = r5.A0D;
        AnonymousClass00C.A07(r1);
        int A07 = r1.A07(4248);
        String string = resources.getString(new int[]{R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved}[A07]);
        AnonymousClass00C.A08(string);
        AnonymousClass07B supportActionBar = r5.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0Q(string);
        }
    }
}
