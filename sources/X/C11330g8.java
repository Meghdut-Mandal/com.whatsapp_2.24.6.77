package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.0g8  reason: invalid class name and case insensitive filesystem */
public class C11330g8 implements Runnable {
    public final /* synthetic */ AnonymousClass0U0 A00;

    public C11330g8(AnonymousClass0U0 r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0U0 r3 = this.A00;
        r3.A01 = false;
        BottomSheetBehavior bottomSheetBehavior = r3.A03;
        AnonymousClass0Z5 r1 = bottomSheetBehavior.A0N;
        if (r1 != null && r1.A0I(true)) {
            r3.A00(r3.A00);
        } else if (bottomSheetBehavior.A0J == 2) {
            bottomSheetBehavior.A0X(r3.A00);
        }
    }
}
