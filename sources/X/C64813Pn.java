package X;

import android.app.Activity;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

/* renamed from: X.3Pn  reason: invalid class name and case insensitive filesystem */
public class C64813Pn {
    public final C20810yC A00;

    public void A02(View view, BottomSheetBehavior bottomSheetBehavior, C225314u r5, AnonymousClass1N2 r6) {
        bottomSheetBehavior.A0d(true);
        bottomSheetBehavior.A0W(4);
        bottomSheetBehavior.A0h = true;
        ((C02460Ak) view.getLayoutParams()).A00(bottomSheetBehavior);
        bottomSheetBehavior.A0a(new AnonymousClass21H(view, r5, r6, this));
    }

    public static void A00(Activity activity, AnonymousClass07B r3) {
        if (r3 != null) {
            r3.A0L(AnonymousClass3UF.A04(activity, C36381kD.A0H(activity, R.drawable.ic_close), R.color.f6nameremoved));
        }
    }

    public void A01(Activity activity) {
        if (AnonymousClass3MR.A00(this.A00)) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public void A03(BottomSheetBehavior bottomSheetBehavior, C225314u r5) {
        View view = r5.A00;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0J == 4) {
            view.post(new C1497472p(bottomSheetBehavior, 0));
        }
    }

    public C64813Pn(C20810yC r1) {
        this.A00 = r1;
    }
}
