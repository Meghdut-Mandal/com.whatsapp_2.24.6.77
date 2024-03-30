package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;

/* renamed from: X.4rE  reason: invalid class name and case insensitive filesystem */
public class C98314rE extends C95984mb {
    public C140456lc A00;
    public final Handler A01 = new C162377oU(Looper.getMainLooper(), this, 0);
    public final C1271967i A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C98314rE(X.C1271967i r4, X.C140456lc r5, int r6) {
        /*
            r3 = this;
            X.5hS r2 = new X.5hS
            r2.<init>(r6)
            r1 = 2131428023(0x7f0b02b7, float:1.8477679E38)
            android.util.SparseArray r0 = r4.A01
            r0.get(r1)
            r3.<init>(r2)
            r3.A02 = r4
            r3.A00 = r5
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1 = 0
            X.7oU r0 = new X.7oU
            r0.<init>(r2, r3, r1)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98314rE.<init>(X.67i, X.6lc, int):void");
    }

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass0D3 r4) {
        C160377ku A0X;
        C140456lc A0B = C140456lc.A0B(((C118815om) ((C96624nd) r4).A00).A01);
        if (A0B != null && A0B.A04 == 13366 && (A0X = A0B.A0X(40)) != null) {
            AnonymousClass6NR.A00();
            AnonymousClass000.A14(this.A01, A0X, 0);
        }
    }

    public /* bridge */ /* synthetic */ void A0F(AnonymousClass0D3 r4) {
        C160377ku A0X;
        C140456lc A0B = C140456lc.A0B(((C118815om) ((C96624nd) r4).A00).A01);
        if (A0B != null && A0B.A04 == 13366 && (A0X = A0B.A0X(38)) != null) {
            AnonymousClass6NR.A00();
            AnonymousClass000.A14(this.A01, A0X, 0);
        }
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r3) {
        C96624nd r32 = (C96624nd) r3;
        ((C157837el) r32.A0H).setRenderTree((C123055vr) null);
        r32.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e7, code lost:
        if (r4 != null) goto L_0x00e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r14, int r15) {
        /*
            r13 = this;
            X.4nd r14 = (X.C96624nd) r14
            X.5hS r2 = r13.A04
            int r1 = r13.A01
            r0 = -1
            if (r1 == r0) goto L_0x0097
            java.util.List r0 = r13.A03
            java.lang.Object r0 = r0.get(r15)
            X.5om r0 = (X.C118815om) r0
            X.6lc r3 = r0.A01
            int r9 = r13.A01
            int r6 = r13.A00
            int r8 = r2.A00
            r1 = -1
            r0 = -2
            r7 = 1
            r2 = 0
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            if (r8 != r7) goto L_0x0045
            r4.<init>(r1, r0)
        L_0x0024:
            X.6lc r0 = X.C140456lc.A0B(r3)
            if (r0 == 0) goto L_0x00a6
            X.6lc r0 = X.C140456lc.A0B(r3)
            int r1 = r0.A04
            r0 = 13366(0x3436, float:1.873E-41)
            if (r1 != r0) goto L_0x00a6
            X.6lc r12 = X.C140456lc.A0B(r3)
            java.lang.String r5 = X.C140456lc.A0N(r12)
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r3 = "CollectionBinderUtils"
            if (r8 != 0) goto L_0x0073
            if (r5 == 0) goto L_0x0073
            goto L_0x0049
        L_0x0045:
            r4.<init>(r0, r1)
            goto L_0x0024
        L_0x0049:
            X.6Mg r1 = X.AnonymousClass6Y7.A0A(r5)     // Catch:{ 5R5 -> 0x0066 }
            java.lang.Integer r0 = r1.A01     // Catch:{ 5R5 -> 0x0066 }
            int r0 = r0.intValue()     // Catch:{ 5R5 -> 0x0066 }
            if (r0 == r2) goto L_0x0058
            if (r0 != r7) goto L_0x0073
            goto L_0x005c
        L_0x0058:
            float r0 = r1.A00     // Catch:{ 5R5 -> 0x0066 }
            int r9 = (int) r0     // Catch:{ 5R5 -> 0x0066 }
            goto L_0x0063
        L_0x005c:
            float r1 = r1.A00     // Catch:{ 5R5 -> 0x0066 }
            float r0 = (float) r9     // Catch:{ 5R5 -> 0x0066 }
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch:{ 5R5 -> 0x0066 }
            double r0 = r0 / r10
            int r9 = (int) r0     // Catch:{ 5R5 -> 0x0066 }
        L_0x0063:
            r4.width = r9     // Catch:{ 5R5 -> 0x0066 }
            goto L_0x0073
        L_0x0066:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error parsing style width: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r5, r1)
            X.AnonymousClass6RS.A01(r3, r0)
        L_0x0073:
            java.lang.String r5 = X.C140456lc.A0J(r12)
            if (r8 != r7) goto L_0x00a6
            if (r5 == 0) goto L_0x00a6
            X.6Mg r1 = X.AnonymousClass6Y7.A0A(r5)     // Catch:{ 5R5 -> 0x0099 }
            java.lang.Integer r0 = r1.A01     // Catch:{ 5R5 -> 0x0099 }
            int r0 = r0.intValue()     // Catch:{ 5R5 -> 0x0099 }
            if (r0 == r2) goto L_0x0091
            if (r0 != r7) goto L_0x00a6
            float r1 = r1.A00     // Catch:{ 5R5 -> 0x0099 }
            float r0 = (float) r6     // Catch:{ 5R5 -> 0x0099 }
            float r1 = r1 * r0
            double r1 = (double) r1     // Catch:{ 5R5 -> 0x0099 }
            double r1 = r1 / r10
            int r0 = (int) r1     // Catch:{ 5R5 -> 0x0099 }
            goto L_0x0094
        L_0x0091:
            float r0 = r1.A00     // Catch:{ 5R5 -> 0x0099 }
            int r0 = (int) r0     // Catch:{ 5R5 -> 0x0099 }
        L_0x0094:
            r4.height = r0     // Catch:{ 5R5 -> 0x0099 }
            goto L_0x00a6
        L_0x0097:
            r4 = 0
            goto L_0x00ab
        L_0x0099:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error parsing style height: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r5, r1)
            X.AnonymousClass6RS.A01(r3, r0)
        L_0x00a6:
            android.view.View r0 = r14.A0H
            r0.setLayoutParams(r4)
        L_0x00ab:
            java.util.List r0 = X.AnonymousClass0D3.A0I
            boolean r0 = r14.A01
            if (r0 == 0) goto L_0x00e7
            if (r4 != 0) goto L_0x00e9
            android.view.View r1 = r14.A0H
            androidx.recyclerview.widget.RecyclerView r0 = r13.A02
            X.0CP r0 = r0.getLayoutManager()
            X.0D2 r0 = r0.A11()
            r1.setLayoutParams(r0)
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            r14.A01 = r0
            java.util.List r0 = r13.A03
            java.lang.Object r0 = r0.get(r15)
            X.5om r0 = (X.C118815om) r0
            X.4r9 r0 = r0.A00
            android.view.View r1 = r14.A0H
            X.7el r1 = (X.C157837el) r1
            java.lang.Object r0 = r0.A00()
            X.6Kq r0 = (X.C130326Kq) r0
            X.5vr r0 = r0.A02
            r1.setRenderTree(r0)
            java.util.List r0 = r13.A03
            java.lang.Object r0 = r0.get(r15)
            r14.A00 = r0
            return
        L_0x00e7:
            if (r4 == 0) goto L_0x00c2
        L_0x00e9:
            r0 = 1
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98314rE.BSE(X.0D3, int):void");
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        AnonymousClass00C.A0D(context, 1);
        return new C96624nd(new C98124qv(context));
    }
}
