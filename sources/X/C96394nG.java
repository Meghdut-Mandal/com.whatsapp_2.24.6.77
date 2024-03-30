package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

/* renamed from: X.4nG  reason: invalid class name and case insensitive filesystem */
public final class C96394nG extends AnonymousClass0UE {
    public final /* synthetic */ LinearLayoutManager A00;
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity A01;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(androidx.recyclerview.widget.RecyclerView r15, int r16) {
        /*
            r14 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r15, r0)
            if (r16 != 0) goto L_0x00a2
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r3 = r14.A01
            X.0IK r2 = r3.A0C
            androidx.recyclerview.widget.RecyclerView r0 = r3.A02
            java.lang.String r1 = "horizontalBusinessListView"
            if (r0 != 0) goto L_0x0015
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0015:
            X.0CP r0 = r0.getLayoutManager()
            android.view.View r0 = r2.A04(r0)
            if (r0 == 0) goto L_0x00a2
            int r6 = X.AnonymousClass0CP.A02(r0)
            X.4kp r4 = r3.A3i()
            androidx.recyclerview.widget.RecyclerView r0 = r3.A02
            if (r0 != 0) goto L_0x0030
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0030:
            int r5 = r0.getHeight()
            android.app.Application r1 = r4.A00
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = X.C65103Qt.A01(r1, r0)
            int r5 = r5 + r0
            X.00s r3 = r4.A0G
            java.util.List r0 = X.C36401kF.A0w(r3)
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r1 = r0.get(r6)
            X.5EQ r1 = (X.AnonymousClass5EQ) r1
        L_0x004b:
            boolean r0 = r1 instanceof X.AnonymousClass5EL
            if (r0 == 0) goto L_0x00a3
            X.5EL r1 = (X.AnonymousClass5EL) r1
            java.lang.Object r2 = r1.A00
            if (r2 == 0) goto L_0x0062
            X.6sA r2 = (X.C144426sA) r2
        L_0x0057:
            r4.A07 = r2
            X.6To r1 = r4.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A05(r2, r0)
        L_0x0062:
            X.6sA r5 = r4.A07
            if (r5 == 0) goto L_0x00a2
            java.util.List r0 = X.C36401kF.A0w(r3)
            int r3 = X.C90484aE.A0F(r0)
            X.6pD r7 = r4.A0J
            int r2 = r6 + 1
            java.lang.Integer r8 = X.C95404kp.A01(r4)
            java.util.LinkedHashMap r10 = X.C36431kI.A1G()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "local_biz_count"
            java.lang.Integer r1 = X.C90514aH.A0l(r0, r1, r10, r2)
            java.lang.String r0 = "ranked_position"
            r10.put(r0, r1)
            r11 = 11
            r12 = 70
            r13 = 8
            r9 = 0
            r7.A08(r8, r9, r10, r11, r12, r13)
            X.6s8 r0 = r5.A0B
            X.6s9 r0 = r0.A03
            boolean r1 = X.AnonymousClass000.A1V(r0)
            java.lang.Integer r0 = X.C95404kp.A01(r4)
            r7.A05(r0, r2, r3, r1)
        L_0x00a2:
            return
        L_0x00a3:
            boolean r0 = r1 instanceof X.AnonymousClass5E9
            if (r0 == 0) goto L_0x0062
            X.5E9 r1 = (X.AnonymousClass5E9) r1
            X.6sA r2 = r1.A00
            goto L_0x0057
        L_0x00ac:
            r1 = 0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96394nG.A03(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public C96394nG(LinearLayoutManager linearLayoutManager, BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        this.A01 = businessDirectorySERPMapViewActivity;
        this.A00 = linearLayoutManager;
    }
}
