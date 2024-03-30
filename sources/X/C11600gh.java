package X;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: X.0gh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11600gh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SideSheetBehavior A01;

    public /* synthetic */ C11600gh(SideSheetBehavior sideSheetBehavior, int i) {
        this.A01 = sideSheetBehavior;
        this.A00 = i;
    }

    public final void run() {
        SideSheetBehavior sideSheetBehavior = this.A01;
        int i = this.A00;
        View A0Y = AnonymousClass000.A0Y(sideSheetBehavior.A0D);
        if (A0Y != null) {
            SideSheetBehavior.A01(A0Y, sideSheetBehavior, i, false);
        }
    }
}
