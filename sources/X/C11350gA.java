package X;

import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: X.0gA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11350gA implements Runnable {
    public final /* synthetic */ AnonymousClass0U1 A00;

    public /* synthetic */ C11350gA(AnonymousClass0U1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass0U1 r3 = this.A00;
        r3.A01 = false;
        SideSheetBehavior sideSheetBehavior = r3.A03;
        AnonymousClass0Z5 r1 = sideSheetBehavior.A08;
        if (r1 != null && r1.A0I(true)) {
            r3.A00(r3.A00);
        } else if (sideSheetBehavior.A05 == 2) {
            sideSheetBehavior.A0R(r3.A00);
        }
    }
}
