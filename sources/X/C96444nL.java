package X;

import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nL  reason: invalid class name and case insensitive filesystem */
public abstract class C96444nL extends AnonymousClass0UE {
    public int A00;
    public C125385zp A01;
    public boolean A02;
    public final Resources A03;
    public final GridLayoutManager A04;
    public final C95834mM A05;
    public final boolean A06;
    public final boolean A07;

    public void A03(RecyclerView recyclerView, int i) {
        boolean z = false;
        AnonymousClass00C.A0D(recyclerView, 0);
        if (i != 0) {
            if (i == 2) {
                z = true;
            } else {
                return;
            }
        }
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r10 <= r12.A00) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if (r10 < (r6 + r5)) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (r10 <= r7) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(androidx.recyclerview.widget.RecyclerView r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0097
            androidx.recyclerview.widget.GridLayoutManager r9 = r12.A04
            int r0 = r9.A1U()
            r12.A00 = r0
            int r8 = r9.A1T()
            int r7 = r9.A1V()
            int r6 = r9.A1S()
            int r5 = r9.A01
            android.content.res.Resources r0 = r12.A03
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            boolean r11 = X.AnonymousClass000.A1S(r1, r0)
            int r4 = r9.A0L()
            r3 = 0
        L_0x0030:
            if (r3 >= r4) goto L_0x0083
            android.view.View r1 = r9.A0R(r3)
            if (r1 == 0) goto L_0x0097
            int r10 = X.AnonymousClass0CP.A02(r1)
            X.0D3 r0 = r13.A0S(r1)
            boolean r0 = r0 instanceof X.AnonymousClass56I
            if (r0 == 0) goto L_0x0068
            X.0D3 r2 = r13.A0S(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.expressionstray.stickergrid.viewholder.StickerViewHolder"
            X.AnonymousClass00C.A0E(r2, r0)
            X.56I r2 = (X.AnonymousClass56I) r2
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x0075
            if (r11 == 0) goto L_0x0075
            int r1 = r12.A00
            boolean r0 = r12.A07
            if (r7 != r1) goto L_0x006b
            r2.A0C(r0)
            if (r6 > r10) goto L_0x0081
            int r0 = r12.A00
            if (r10 > r0) goto L_0x0081
        L_0x0064:
            r0 = 1
        L_0x0065:
            r2.A0B(r0)
        L_0x0068:
            int r3 = r3 + 1
            goto L_0x0030
        L_0x006b:
            r2.A0C(r0)
            if (r10 < r6) goto L_0x0081
            int r0 = r6 + r5
            if (r10 >= r0) goto L_0x0081
            goto L_0x0064
        L_0x0075:
            boolean r0 = r12.A07
            r2.A0C(r0)
            if (r8 < 0) goto L_0x0068
            if (r8 > r10) goto L_0x0081
            if (r10 > r7) goto L_0x0081
            goto L_0x0064
        L_0x0081:
            r0 = 0
            goto L_0x0065
        L_0x0083:
            if (r8 < 0) goto L_0x0097
            X.4mM r0 = r12.A05
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r0.A0L(r8)
            X.65b r0 = (X.C1266865b) r0
            X.5zp r0 = r0.A02()
            if (r0 == 0) goto L_0x0097
            r12.A01 = r0
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96444nL.A04(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public C96444nL(Resources resources, GridLayoutManager gridLayoutManager, C95834mM r4, C20810yC r5, boolean z) {
        C36321k7.A11(r5, resources, gridLayoutManager);
        this.A03 = resources;
        this.A04 = gridLayoutManager;
        this.A07 = z;
        this.A05 = r4;
        this.A06 = r5.A0E(272);
    }
}
