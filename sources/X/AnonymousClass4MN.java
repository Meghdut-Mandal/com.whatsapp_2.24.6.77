package X;

import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;

/* renamed from: X.4MN  reason: invalid class name */
public final class AnonymousClass4MN extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UpdatesViewModel $updatesViewModel;
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MN(UpdatesFragment updatesFragment, UpdatesViewModel updatesViewModel) {
        super(1);
        this.this$0 = updatesFragment;
        this.$updatesViewModel = updatesViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r4 < 0) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            com.whatsapp.updates.ui.UpdatesFragment r0 = r9.this$0
            X.01I r5 = r0.A0h()
            boolean r0 = r5 instanceof X.AnonymousClass15M
            if (r0 == 0) goto L_0x006c
            X.15M r5 = (X.AnonymousClass15M) r5
            if (r5 == 0) goto L_0x006c
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r9.$updatesViewModel
            X.00s r0 = r0.A0T
            java.util.List r0 = X.C36401kF.A0w(r0)
            r6 = 0
            if (r0 == 0) goto L_0x003e
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Iterator r7 = r0.iterator()
        L_0x0021:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r6 = r7.next()
            r0 = r6
            X.2go r0 = (X.C48162go) r0
            long r3 = r0.A03
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0021
            r8.add(r6)
            goto L_0x0021
        L_0x003a:
            int r6 = r8.size()
        L_0x003e:
            com.whatsapp.HomeActivity r5 = (com.whatsapp.HomeActivity) r5
            int r0 = r5.A07
            int r4 = r6 - r0
            int r0 = r5.A03
            r3 = 300(0x12c, float:4.2E-43)
            if (r0 == r3) goto L_0x0071
            android.content.SharedPreferences r1 = X.C36331k8.A06(r5)
            java.lang.String r0 = "newsletter_message_received"
            boolean r2 = X.C36371kC.A1U(r1, r0)
            X.1RF r1 = r5.A0j
            int r0 = com.whatsapp.HomeActivity.A0G(r3)
            X.1RG r1 = X.AnonymousClass1RF.A00(r1, r0)
            if (r2 == 0) goto L_0x006f
            if (r4 <= 0) goto L_0x006f
            int r0 = r1.A01
            int r0 = r0 + r4
            r1.A01 = r0
            r5.A07 = r6
            r5.A3q()
        L_0x006c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x006f:
            if (r4 >= 0) goto L_0x006c
        L_0x0071:
            com.whatsapp.HomeActivity.A0v(r5)
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MN.invoke(java.lang.Object):java.lang.Object");
    }
}
