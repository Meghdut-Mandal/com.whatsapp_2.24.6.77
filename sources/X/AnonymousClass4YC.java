package X;

import android.widget.AdapterView;

/* renamed from: X.4YC  reason: invalid class name */
public class AnonymousClass4YC implements AdapterView.OnItemClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4YC(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ca, code lost:
        if (r1.longValue() == 2) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(android.widget.AdapterView r16, android.view.View r17, int r18, long r19) {
        /*
            r15 = this;
            int r0 = r15.A02
            r5 = r18
            switch(r0) {
                case 0: goto L_0x00ff;
                case 1: goto L_0x0096;
                case 2: goto L_0x0050;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r15.A00
            com.whatsapp.registration.EULA r3 = (com.whatsapp.registration.EULA) r3
            java.lang.Object r0 = r15.A01
            android.widget.ListView r0 = (android.widget.ListView) r0
            android.widget.ListAdapter r0 = r0.getAdapter()
            java.lang.Object r0 = r0.getItem(r5)
            X.3IV r0 = (X.AnonymousClass3IV) r0
            java.lang.String r1 = r0.A01
            X.0ts r0 = r3.A0D
            r0.A0P(r1)
            X.0v0 r0 = r3.A09
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "is_ls_shown_during_reg"
            X.C36331k8.A0w(r1, r0, r2)
            X.3GZ r1 = r3.A0J
            X.0v0 r0 = r1.A02
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)
            java.lang.String r2 = "language_selector_clicked_count"
            int r0 = X.C36371kC.A01(r0, r2)
            X.0v0 r1 = r1.A02
            int r0 = r0 + 1
            X.C36321k7.A0q(r1, r2, r0)
            X.3GZ r0 = r3.A0J
            r0.A00()
            boolean r0 = X.C19550w8.A08()
            if (r0 == 0) goto L_0x00da
            r3.recreate()
        L_0x004f:
            return
        L_0x0050:
            java.lang.Object r2 = r15.A00
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r2 = (com.whatsapp.languageselector.LanguageSelectorBottomSheet) r2
            java.lang.Object r1 = r15.A01
            X.1nJ r1 = (X.C37851nJ) r1
            com.whatsapp.BottomSheetListView r0 = r2.A00
            android.widget.ListAdapter r0 = r0.getAdapter()
            java.lang.Object r0 = r0.getItem(r5)
            X.3IV r0 = (X.AnonymousClass3IV) r0
            java.lang.String r3 = r0.A01
            boolean r0 = r1 instanceof X.AnonymousClass2XG
            if (r0 == 0) goto L_0x006f
            r0 = r1
            X.2XG r0 = (X.AnonymousClass2XG) r0
            r0.A00 = r5
        L_0x006f:
            r1.notifyDataSetChanged()
            X.4Qx r2 = r2.A04
            if (r2 == 0) goto L_0x004f
            X.3LR r2 = (X.AnonymousClass3LR) r2
            int r0 = r2.A02
            if (r0 == 0) goto L_0x0154
            java.lang.Object r1 = r2.A00
            com.whatsapp.settings.Settings r1 = (com.whatsapp.settings.Settings) r1
            java.lang.Object r4 = r2.A01
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.0ts r0 = r1.A00
            r0.A0P(r3)
            X.3TR r0 = r1.A0m
            java.util.Map r0 = r0.A00
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "allSettingsMap"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0096:
            java.lang.Object r2 = r15.A00
            X.3FA r2 = (X.AnonymousClass3FA) r2
            java.lang.Object r8 = r15.A01
            X.0cQ r8 = (X.C09470cQ) r8
            r0 = 1
            X.AnonymousClass00C.A0D(r8, r0)
            java.util.List r0 = r2.A08
            java.lang.Object r0 = r0.get(r5)
            X.3Jd r0 = (X.C63203Jd) r0
            X.2nR r1 = r0.A02
            X.2nR r0 = X.C51202nR.OPTION
            if (r1 != r0) goto L_0x004f
            java.lang.Long r1 = java.lang.Long.valueOf(r19)
            r2.A00(r1)
            X.318 r0 = r2.A02
            if (r0 == 0) goto L_0x00d6
            com.whatsapp.conversation.ConversationEntryActionButton r7 = r0.A00
            X.1ts r6 = r7.A03
            if (r1 == 0) goto L_0x00cc
            long r4 = r1.longValue()
            r2 = 2
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x00cd
        L_0x00cc:
            r0 = 1
        L_0x00cd:
            r6.A0T(r0)
            X.1ts r1 = r7.A03
            r0 = 2
            r1.A0U(r0)
        L_0x00d6:
            r8.dismiss()
            return
        L_0x00da:
            r3.finish()
            android.content.Intent r0 = r3.getIntent()
            r3.startActivity(r0)
            r0 = 0
            r3.overridePendingTransition(r0, r0)
            return
        L_0x00e9:
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r0)
        L_0x00ed:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r1 = r2.next()
            X.4Us r1 = (X.C88964Us) r1
            java.lang.String r0 = ""
            r1.BrU(r0)
            goto L_0x00ed
        L_0x00ff:
            java.lang.Object r3 = r15.A00
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r15.A01
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r4 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r4
            java.lang.String r0 = "AccountSwitchingBottomSheet/setupAccountList/switch account tapped"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r3.get(r5)
            X.3Iq r0 = (X.C63073Iq) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = "AccountSwitchingBottomSheet/setupAccountList/isActiveAccount == true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x011b:
            r4.A1c()
            return
        L_0x011f:
            X.6TO r2 = r4.A09
            if (r2 == 0) goto L_0x014d
            int r1 = r4.A00
            r9 = 0
            r0 = 6
            r2.A02(r9, r1, r0)
            X.1RU r6 = r4.A07
            if (r6 == 0) goto L_0x0146
            java.lang.Object r0 = r3.get(r5)
            X.3Iq r0 = (X.C63073Iq) r0
            X.3KU r0 = r0.A01
            java.lang.String r8 = r0.A08
            android.content.Context r7 = X.C36371kC.A0B(r17)
            int r11 = r4.A00
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r9
            r6.A0E(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0146:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x014d:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0154:
            java.lang.Object r0 = r2.A00
            X.2iF r0 = (X.C48902iF) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.registration.EULA r0 = (com.whatsapp.registration.EULA) r0
            X.0ts r0 = r0.A0D
            r0.A0P(r3)
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YC.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
