package X;

import android.app.Activity;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.4sr  reason: invalid class name and case insensitive filesystem */
public final class C99224sr extends C06570Uc {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ BottomSheetBehavior A01;
    public final /* synthetic */ C115235iY A02;
    public final /* synthetic */ AnonymousClass00S A03;
    public final /* synthetic */ C10770fC A04;
    public final /* synthetic */ C10790fE A05;

    public void A02(View view, float f) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        if (r8.A04.element != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            r7 = 1
            r6 = 3
            if (r10 != r7) goto L_0x0025
            r9.getTop()
            X.0fE r1 = r8.A05
            int r0 = r9.getTop()
            r1.element = r0
            X.00S r0 = r8.A03
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x0024
        L_0x001f:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r8.A01
            r0.A0W(r6)
        L_0x0024:
            return
        L_0x0025:
            r0 = 2
            r5 = 5
            if (r10 != r0) goto L_0x0061
            X.0fE r2 = r8.A05
            int r1 = r2.element
            r0 = -1
            if (r1 == r0) goto L_0x0024
            int r1 = r9.getTop()
            int r0 = r2.element
            int r1 = r1 - r0
            float r2 = (float) r1
            int r0 = r9.getMeasuredHeight()
            float r0 = (float) r0
            float r2 = r2 / r0
            X.5iY r0 = r8.A02
            X.0yC r1 = r0.A00
            r0 = 2305(0x901, float:3.23E-42)
            int r0 = r1.A07(r0)
            float r0 = (float) r0
            double r3 = (double) r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r0
            double r1 = (double) r2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001f
            X.0fC r0 = r8.A04
            r0.element = r7
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r8.A01
            r0.A0W(r5)
        L_0x005b:
            android.app.Activity r0 = r8.A00
            r0.finish()
            return
        L_0x0061:
            if (r10 != r5) goto L_0x0024
            X.0fC r0 = r8.A04
            boolean r0 = r0.element
            if (r0 == 0) goto L_0x001f
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99224sr.A03(android.view.View, int):void");
    }

    public C99224sr(Activity activity, BottomSheetBehavior bottomSheetBehavior, C115235iY r3, AnonymousClass00S r4, C10770fC r5, C10790fE r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = bottomSheetBehavior;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = activity;
    }
}
