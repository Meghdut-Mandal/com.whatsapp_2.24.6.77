package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.3Sb  reason: invalid class name and case insensitive filesystem */
public abstract class C65443Sb {
    public static void A00(DialogFragment dialogFragment, AnonymousClass01I r2) {
        A02(dialogFragment, r2.getSupportFragmentManager());
    }

    public static void A01(DialogFragment dialogFragment, AnonymousClass01z r3) {
        String A0k = AnonymousClass000.A0k(dialogFragment);
        if (r3.A0N(A0k) == null) {
            dialogFragment.A1f(r3, A0k);
        }
    }

    public static void A02(DialogFragment dialogFragment, AnonymousClass01z r3) {
        String A0k = AnonymousClass000.A0k(dialogFragment);
        if (r3.A0N(A0k) == null) {
            C36381kD.A1F(dialogFragment, r3, A0k);
        }
    }

    public static void A04(DialogFragment dialogFragment, AnonymousClass01z r2, String str) {
        if (r2.A0N(str) == null) {
            dialogFragment.A1f(r2, str);
        }
    }

    public static void A03(DialogFragment dialogFragment, AnonymousClass01z r1, String str) {
        C36381kD.A1F(dialogFragment, r1, str);
    }
}
