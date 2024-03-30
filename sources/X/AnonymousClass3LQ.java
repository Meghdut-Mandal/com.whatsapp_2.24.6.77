package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.3LQ  reason: invalid class name */
public abstract class AnonymousClass3LQ {
    public static void A01(DialogFragment dialogFragment, AnonymousClass02E r3) {
        if (!r3.A0a) {
            AnonymousClass01z A0k = r3.A0k();
            String A0k2 = AnonymousClass000.A0k(dialogFragment);
            if (A0k.A0N(A0k2) == null) {
                dialogFragment.A1f(r3.A0k(), A0k2);
            }
        }
    }

    public static void A00(Intent intent, AnonymousClass02E r1) {
        AnonymousClass3M9.A00(intent, r1);
        r1.A1C(intent);
    }
}
