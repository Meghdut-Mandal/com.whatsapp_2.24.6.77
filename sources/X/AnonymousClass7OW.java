package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;

/* renamed from: X.7OW  reason: invalid class name */
public final class AnonymousClass7OW extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass3KU $currentAccount;
    public final /* synthetic */ C10810fG $makeActiveLid;
    public final /* synthetic */ AccountSwitchingContentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OW(AccountSwitchingContentProvider accountSwitchingContentProvider, AnonymousClass3KU r3, C10810fG r4) {
        super(0);
        this.this$0 = accountSwitchingContentProvider;
        this.$currentAccount = r3;
        this.$makeActiveLid = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r10.this$0
            X.1Z0 r5 = X.C90474aD.A0Q(r0)
            X.3KU r8 = r10.$currentAccount
            X.0fG r0 = r10.$makeActiveLid
            java.lang.Object r9 = r0.element
            if (r9 == 0) goto L_0x00cd
            java.lang.String r9 = (java.lang.String) r9
            X.C36321k7.A0w(r8, r9)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AccountSwitchingDataRepo/removeAndAddAccount/addAccount:"
            r1.append(r0)
            java.lang.String r7 = r8.A08
            java.lang.String r0 = X.AnonymousClass3LV.A01(r7)
            r1.append(r0)
            java.lang.String r0 = ",removeLid:"
            java.lang.String r0 = X.C90524aI.A0g(r0, r9, r1)
            X.C36321k7.A1a(r1, r0)
            X.6C2 r6 = X.AnonymousClass1Z0.A00(r5)
            java.util.List r1 = r6.A01
            boolean r0 = X.AnonymousClass1Z0.A02(r9, r1)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "AccountSwitchingDataRepo/addAndRemoveAccount/Account doesn't exist"
        L_0x003c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2 = 0
        L_0x0040:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/dataRepoOps/success: "
            X.C36321k7.A1X(r0, r1, r2)
            if (r2 != 0) goto L_0x0087
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/dataRepoOps/autocorrecting accounts file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r10.this$0
            X.1Z0 r0 = X.C90474aD.A0Q(r0)
            java.lang.String r1 = r0.A05()
            if (r1 == 0) goto L_0x0068
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r10.this$0
            X.1Z0 r0 = X.C90474aD.A0Q(r0)
            boolean r0 = r0.A09(r1)
            if (r0 == 0) goto L_0x0087
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/dataRepoOps/autocorrecting accounts file/adding account "
            r1.append(r0)
            X.3KU r0 = r10.$currentAccount
            java.lang.String r0 = r0.A08
            java.lang.String r0 = X.AnonymousClass3LV.A01(r0)
            X.C36321k7.A1a(r1, r0)
            com.whatsapp.accountswitching.AccountSwitchingContentProvider r0 = r10.this$0
            X.1Z0 r1 = X.C90474aD.A0Q(r0)
            X.3KU r0 = r10.$currentAccount
            r1.A06(r0)
        L_0x0087:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x008a:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r1.iterator()
        L_0x0096:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3KU r0 = (X.AnonymousClass3KU) r0
            java.lang.String r0 = r0.A08
            boolean r0 = X.AnonymousClass00C.A0J(r0, r9)
            X.C36391kE.A1V(r1, r3, r0)
            goto L_0x0096
        L_0x00ad:
            r4.addAll(r3)
            boolean r0 = X.AnonymousClass1Z0.A02(r7, r4)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = "AccountSwitchingDataRepo/addAndRemoveAccount/Account already exists"
            goto L_0x003c
        L_0x00b9:
            r4.add(r8)
            java.lang.String r3 = r6.A00
            boolean r2 = r6.A03
            boolean r1 = r6.A02
            X.6C2 r0 = new X.6C2
            r0.<init>(r3, r4, r2, r1)
            boolean r2 = X.AnonymousClass1Z0.A01(r0, r5)
            goto L_0x0040
        L_0x00cd:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7OW.invoke():java.lang.Object");
    }
}
