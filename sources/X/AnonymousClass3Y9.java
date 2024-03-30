package X;

import android.view.View;

/* renamed from: X.3Y9  reason: invalid class name */
public class AnonymousClass3Y9 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass3Y9(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass3Y9(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v92, resolved type: com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: X.14u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: X.14u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v184, resolved type: com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v185, resolved type: com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x027a, code lost:
        r0 = r1.A04.BJo();
        r2 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0282, code lost:
        if (r0 == false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0284, code lost:
        r2.Bd1(11, 58);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x028c, code lost:
        r2.Bd6();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0298, code lost:
        r0.BbJ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x029b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02bd, code lost:
        r0.BgV();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c9, code lost:
        r0.BbI();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02cc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e2, code lost:
        r1.Bbb(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0370, code lost:
        r3.startActivity(X.AnonymousClass190.A1N(r3, "DONE", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0379, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.BTc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d2, code lost:
        r2.A0U(r0.A0i(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x023a, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023d, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x03c0;
                case 1: goto L_0x038f;
                case 2: goto L_0x0385;
                case 3: goto L_0x035b;
                case 4: goto L_0x034d;
                case 5: goto L_0x037a;
                case 6: goto L_0x0341;
                case 7: goto L_0x032e;
                case 8: goto L_0x0320;
                case 9: goto L_0x0316;
                case 10: goto L_0x030e;
                case 11: goto L_0x0306;
                case 12: goto L_0x02fe;
                case 13: goto L_0x02f6;
                case 14: goto L_0x02ee;
                case 15: goto L_0x02e6;
                case 16: goto L_0x02d8;
                case 17: goto L_0x02cd;
                case 18: goto L_0x0136;
                case 19: goto L_0x00f2;
                case 20: goto L_0x02c1;
                case 21: goto L_0x02b5;
                case 22: goto L_0x02a8;
                case 23: goto L_0x029c;
                case 24: goto L_0x0290;
                case 25: goto L_0x0274;
                case 26: goto L_0x026c;
                case 27: goto L_0x025d;
                case 28: goto L_0x0253;
                case 29: goto L_0x0249;
                case 30: goto L_0x023e;
                case 31: goto L_0x009e;
                case 32: goto L_0x0231;
                case 33: goto L_0x0220;
                case 34: goto L_0x0213;
                case 35: goto L_0x0206;
                case 36: goto L_0x01fc;
                case 37: goto L_0x006f;
                case 38: goto L_0x01f2;
                case 39: goto L_0x01db;
                case 40: goto L_0x01cc;
                case 41: goto L_0x003f;
                case 42: goto L_0x01c5;
                case 43: goto L_0x0191;
                case 44: goto L_0x018b;
                case 45: goto L_0x0016;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x0005;
                case 49: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.7hm r0 = (X.C158607hm) r0
        L_0x0009:
            r0.BTc()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r10.A00
            X.5NK r0 = (X.AnonymousClass5NK) r0
            X.7hm r0 = r0.A0E
            if (r0 == 0) goto L_0x000c
            goto L_0x0009
        L_0x0016:
            java.lang.Object r4 = r10.A00
            com.whatsapp.util.DocumentWarningDialogFragment r4 = (com.whatsapp.util.DocumentWarningDialogFragment) r4
            X.0FM r0 = r4.A00
            if (r0 == 0) goto L_0x0021
            r0.dismiss()
        L_0x0021:
            r0 = 0
            r4.A00 = r0
            android.os.Bundle r1 = r4.A0b()
            java.lang.String r0 = "message_id"
            long r0 = r1.getLong(r0)
            X.3T1 r3 = r4.A1k(r0)
            if (r3 == 0) goto L_0x000c
            r2 = 0
            X.0wU r1 = r4.A09
            if (r1 == 0) goto L_0x03c6
            r0 = 38
            X.C81333wq.A00(r1, r3, r4, r2, r0)
            return
        L_0x003f:
            java.lang.Object r2 = r10.A00
            com.whatsapp.userban.ui.fragment.BanAppealFormFragment r2 = (com.whatsapp.userban.ui.fragment.BanAppealFormFragment) r2
            X.01I r0 = r2.A0h()
            if (r0 == 0) goto L_0x0054
            android.view.View r1 = r0.getCurrentFocus()
            if (r1 == 0) goto L_0x0054
            X.1N2 r0 = r2.A07
            r0.A01(r1)
        L_0x0054:
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r4 = r2.A06
            android.widget.EditText r0 = r2.A00
            java.lang.String r7 = X.C36361kB.A0n(r0)
            X.00s r3 = r4.A02
            java.lang.Number r0 = X.C36441kJ.A0z(r3)
            r2 = 1
            if (r0 == 0) goto L_0x03cb
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x000c
            r0 = 2
            if (r1 != r0) goto L_0x03cb
            return
        L_0x006f:
            java.lang.Object r1 = r10.A00
            X.2hQ r1 = (X.C48502hQ) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1d3 r0 = r1.A05
            com.whatsapp.updates.ui.UpdatesFragment r0 = (com.whatsapp.updates.ui.UpdatesFragment) r0
            com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel r2 = r0.A0W
            if (r2 != 0) goto L_0x0084
            java.lang.String r0 = "crosspostingUpdatesViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0084:
            X.3KF r0 = r2.A00
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = "crossPostingViewModelState"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x008f:
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x000c
            X.1dR r0 = r2.A03
            r0.A03()
            r1 = 1
            r0 = 0
            com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel.A01(r2, r0, r1)
            return
        L_0x009e:
            java.lang.Object r2 = r10.A00
            X.2hF r2 = (X.C48392hF) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r6 = 0
            X.AnonymousClass00C.A0D(r2, r6)
            boolean r0 = r2.A00
            r1 = r0 ^ 1
            r2.A00 = r1
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r0 = r2.A02
            r7 = r1 ^ 1
            X.09p r0 = r0.A0M
            com.whatsapp.updates.ui.UpdatesFragment r0 = (com.whatsapp.updates.ui.UpdatesFragment) r0
            com.whatsapp.updates.viewmodels.UpdatesViewModel r5 = r0.A0c
            if (r5 == 0) goto L_0x000c
            X.39a r3 = r5.A0g
            X.00s r0 = r5.A0S
            java.util.List r0 = X.C36401kF.A0w(r0)
            if (r0 == 0) goto L_0x00f0
            int r2 = r0.size()
        L_0x00c8:
            X.0v0 r0 = r3.A01
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "recommended_newsletters_collapsed"
            X.C36331k8.A0w(r1, r0, r7)
            X.1dD r4 = r3.A03
            long r2 = (long) r2
            X.2OD r1 = new X.2OD
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.A00 = r0
            X.0yW r0 = r4.A03
            r0.Bly(r1)
            com.whatsapp.updates.viewmodels.UpdatesViewModel.A0A(r5, r6)
            return
        L_0x00f0:
            r2 = 0
            goto L_0x00c8
        L_0x00f2:
            java.lang.Object r5 = r10.A00
            X.2hM r5 = (X.C48462hM) r5
            X.C36341k9.A1D(r5)
            int r1 = r5.A04()
            r0 = -1
            if (r1 == r0) goto L_0x000c
            X.2gm r0 = r5.A00
            java.lang.String r4 = "dataItem"
            if (r0 != 0) goto L_0x010b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x010b:
            X.2La r3 = r0.A02
            r2 = 1
            X.1RJ r0 = r5.A0A
            android.view.View r1 = r0.A01()
            X.AnonymousClass00C.A08(r1)
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r1 = r5.A03
            r0 = 4
            r1.setVisibility(r0)
            X.2gm r0 = r5.A00
            if (r0 != 0) goto L_0x012a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x012a:
            r0.A01 = r2
            com.whatsapp.updates.ui.UpdatesFragment r0 = r5.A08
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r0.A0c
            if (r0 == 0) goto L_0x000c
            r0.A0T(r3)
            return
        L_0x0136:
            java.lang.Object r0 = r10.A00
            X.2hM r0 = (X.C48462hM) r0
            X.C36341k9.A1D(r0)
            com.whatsapp.updates.ui.UpdatesFragment r2 = r0.A08
            X.2gm r0 = r0.A00
            if (r0 != 0) goto L_0x014a
            java.lang.String r0 = "dataItem"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x014a:
            X.2La r6 = r0.A02
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = r2.A0c
            if (r1 == 0) goto L_0x000c
            X.01I r0 = r2.A0h()
            X.14u r5 = X.C36401kF.A0L(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            com.whatsapp.updates.viewmodels.SearchUsecase r4 = r1.A0S()
            X.1Uw r0 = r6.A0J()
            r4.A00 = r0
            X.1dD r3 = r4.A09
            r2 = 4
            X.0yC r1 = r3.A02
            r0 = 5909(0x1715, float:8.28E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0183
            X.2Rq r1 = new X.2Rq
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A00 = r0
            X.0yW r0 = r3.A03
            r0.Bly(r1)
        L_0x0183:
            X.3UC r1 = r4.A0A
            r0 = 11
            r1.A08(r5, r6, r0)
            return
        L_0x018b:
            java.lang.Object r0 = r10.A00
            X.C36331k8.A1J(r0, r11)
            return
        L_0x0191:
            java.lang.Object r0 = r10.A00
            com.whatsapp.userban.ui.fragment.BanInfoFragment r0 = (com.whatsapp.userban.ui.fragment.BanInfoFragment) r0
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r3 = r0.A01
            X.3KW r0 = r3.A07
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x01c1
            X.3So r0 = r3.A08
            X.0v0 r0 = r0.A06
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "support_ban_appeal_state"
            java.lang.String r0 = X.C36371kC.A0t(r1, r0)
            java.lang.String r1 = X.C55682v1.A00(r0)
            java.lang.String r0 = "IN_REVIEW"
            boolean r2 = r0.equals(r1)
            X.1Rs r1 = r3.A0A
            r0 = 2
            if (r2 == 0) goto L_0x01bd
            r0 = 3
        L_0x01bd:
            X.C36341k9.A16(r1, r0)
            return
        L_0x01c1:
            X.00s r1 = r3.A01
            r0 = -2
            goto L_0x01bd
        L_0x01c5:
            java.lang.Object r0 = r10.A00
            com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment r0 = (com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment) r0
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r2 = r0.A01
            goto L_0x01d2
        L_0x01cc:
            java.lang.Object r0 = r10.A00
            com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment r0 = (com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment) r0
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r2 = r0.A01
        L_0x01d2:
            X.01I r1 = r0.A0i()
            r0 = 0
            r2.A0U(r1, r0)
            return
        L_0x01db:
            java.lang.Object r1 = r10.A00
            X.2hH r1 = (X.C48412hH) r1
            X.C36341k9.A1D(r1)
            boolean r0 = r1.A00
            r0 = r0 ^ 1
            r1.A00 = r0
            X.02t r1 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r0)
            return
        L_0x01f2:
            java.lang.Object r1 = r10.A00
            X.2hQ r1 = (X.C48502hQ) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1d3 r0 = r1.A05
            goto L_0x02bd
        L_0x01fc:
            java.lang.Object r0 = r10.A00
            X.2hS r0 = (X.C48522hS) r0
            X.C36341k9.A1D(r0)
            X.0Ws r0 = r0.A05
            goto L_0x023a
        L_0x0206:
            java.lang.Object r0 = r10.A00
            X.2hS r0 = (X.C48522hS) r0
            X.C36341k9.A1D(r0)
            X.1d0 r0 = r0.A08
            r0.Bd6()
            return
        L_0x0213:
            java.lang.Object r0 = r10.A00
            X.2hS r0 = (X.C48522hS) r0
            X.C36341k9.A1D(r0)
            X.1d0 r0 = r0.A08
            r0.Bg3()
            return
        L_0x0220:
            java.lang.Object r0 = r10.A00
            X.2hS r0 = (X.C48522hS) r0
            X.C36341k9.A1D(r0)
            X.1d0 r2 = r0.A08
            r1 = 11
            r0 = 9
            r2.Bd1(r1, r0)
            return
        L_0x0231:
            java.lang.Object r0 = r10.A00
            X.2hS r0 = (X.C48522hS) r0
            X.C36341k9.A1D(r0)
            X.0Ws r0 = r0.A04
        L_0x023a:
            r0.A00()
            return
        L_0x023e:
            java.lang.Object r0 = r10.A00
            X.0Ws r0 = (X.C07200Ws) r0
            X.C36341k9.A1D(r0)
            r0.A00()
            return
        L_0x0249:
            java.lang.Object r0 = r10.A00
            X.2h5 r0 = (X.C48322h5) r0
            X.C36341k9.A1D(r0)
            X.1cz r0 = r0.A00
            goto L_0x02c9
        L_0x0253:
            java.lang.Object r0 = r10.A00
            X.2h2 r0 = (X.C48302h2) r0
            X.C36341k9.A1D(r0)
            X.1cz r0 = r0.A05
            goto L_0x0298
        L_0x025d:
            java.lang.Object r1 = r10.A00
            X.2h2 r1 = (X.C48302h2) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.13J r0 = r1.A06
            boolean r0 = r0.BJo()
            X.1cz r2 = r1.A05
            goto L_0x0282
        L_0x026c:
            java.lang.Object r1 = r10.A00
            X.2h4 r1 = (X.AnonymousClass2h4) r1
            X.C36341k9.A1D(r1)
            goto L_0x027a
        L_0x0274:
            java.lang.Object r1 = r10.A00
            X.2h4 r1 = (X.AnonymousClass2h4) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
        L_0x027a:
            X.13J r0 = r1.A04
            boolean r0 = r0.BJo()
            X.1cz r2 = r1.A03
        L_0x0282:
            if (r0 == 0) goto L_0x028c
            r1 = 11
            r0 = 58
            r2.Bd1(r1, r0)
            return
        L_0x028c:
            r2.Bd6()
            return
        L_0x0290:
            java.lang.Object r1 = r10.A00
            X.2h4 r1 = (X.AnonymousClass2h4) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1cz r0 = r1.A03
        L_0x0298:
            r0.BbJ()
            return
        L_0x029c:
            java.lang.Object r1 = r10.A00
            X.2h3 r1 = (X.C48312h3) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1d3 r0 = r1.A08
            r0.BgW()
            return
        L_0x02a8:
            java.lang.Object r0 = r10.A00
            X.2h3 r0 = (X.C48312h3) r0
            X.C36341k9.A1D(r0)
            X.4UI r0 = r0.A09
            r0.BbJ()
            return
        L_0x02b5:
            java.lang.Object r1 = r10.A00
            X.2h3 r1 = (X.C48312h3) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1d3 r0 = r1.A08
        L_0x02bd:
            r0.BgV()
            return
        L_0x02c1:
            java.lang.Object r1 = r10.A00
            X.2hC r1 = (X.C48362hC) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1cz r0 = r1.A01
        L_0x02c9:
            r0.BbI()
            return
        L_0x02cd:
            java.lang.Object r0 = r10.A00
            X.2hT r0 = (X.C48532hT) r0
            X.C36341k9.A1D(r0)
            X.1d2 r1 = r0.A05
            r0 = 1
            goto L_0x02e2
        L_0x02d8:
            java.lang.Object r0 = r10.A00
            X.2hT r0 = (X.C48532hT) r0
            X.C36341k9.A1D(r0)
            X.1d2 r1 = r0.A05
            r0 = 6
        L_0x02e2:
            r1.Bbb(r0)
            return
        L_0x02e6:
            java.lang.Object r0 = r10.A00
            X.4SB r0 = (X.AnonymousClass4SB) r0
            X.C47942gR.A00(r0)
            return
        L_0x02ee:
            java.lang.Object r0 = r10.A00
            X.4SB r0 = (X.AnonymousClass4SB) r0
            X.C47942gR.A00(r0)
            return
        L_0x02f6:
            java.lang.Object r0 = r10.A00
            X.4SB r0 = (X.AnonymousClass4SB) r0
            X.C47942gR.A00(r0)
            return
        L_0x02fe:
            java.lang.Object r0 = r10.A00
            X.4SB r0 = (X.AnonymousClass4SB) r0
            X.C47942gR.A00(r0)
            return
        L_0x0306:
            java.lang.Object r0 = r10.A00
            X.4SB r0 = (X.AnonymousClass4SB) r0
            X.C47942gR.A00(r0)
            return
        L_0x030e:
            java.lang.Object r0 = r10.A00
            X.4SB r0 = (X.AnonymousClass4SB) r0
            X.C47942gR.A00(r0)
            return
        L_0x0316:
            java.lang.Object r1 = r10.A00
            X.3A6 r1 = (X.AnonymousClass3A6) r1
            X.4SC r0 = r1.A01
            r0.BTp(r11, r1)
            return
        L_0x0320:
            java.lang.Object r1 = r10.A00
            com.whatsapp.text.ReadMoreTextView r1 = (com.whatsapp.text.ReadMoreTextView) r1
            boolean r0 = r1.A0K()
            r0 = r0 ^ 1
            r1.setExpanded(r0)
            return
        L_0x032e:
            java.lang.Object r3 = r10.A00
            X.155 r3 = (X.AnonymousClass155) r3
            X.1Dv r2 = r3.A01
            X.1N3 r1 = r3.A04
            java.lang.String r0 = "https://faq.whatsapp.com/1278661612895630/"
            android.net.Uri r1 = r1.A00(r0)
            r0 = 0
            r2.Bp7(r3, r1, r0)
            return
        L_0x0341:
            java.lang.Object r3 = r10.A00
            android.content.Context r3 = (android.content.Context) r3
            r0 = 1
            int[] r2 = new int[r0]
            r1 = 0
            r0 = 2
            r2[r1] = r0
            goto L_0x0370
        L_0x034d:
            java.lang.Object r2 = r10.A00
            X.14u r2 = (X.C225314u) r2
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity$ConfirmDisableDialog r1 = new com.whatsapp.twofactor.SettingsTwoFactorAuthActivity$ConfirmDisableDialog
            r1.<init>()
            r0 = 0
            r2.Btl(r1, r0)
            return
        L_0x035b:
            java.lang.Object r3 = r10.A00
            X.14u r3 = (X.C225314u) r3
            X.0yC r1 = r3.A0D
            r0 = 5156(0x1424, float:7.225E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x037e
            int[] r2 = X.C36441kJ.A1O()
            r2 = {1, 2} // fill-array
        L_0x0370:
            java.lang.String r0 = "DONE"
            android.content.Intent r0 = X.AnonymousClass190.A1N(r3, r0, r2)
            r3.startActivity(r0)
            return
        L_0x037a:
            java.lang.Object r3 = r10.A00
            android.content.Context r3 = (android.content.Context) r3
        L_0x037e:
            r1 = 1
            int[] r2 = new int[r1]
            r0 = 0
            r2[r0] = r1
            goto L_0x0370
        L_0x0385:
            java.lang.Object r0 = r10.A00
            X.01I r0 = X.C36441kJ.A0X(r0)
            r0.finish()
            return
        L_0x038f:
            java.lang.Object r2 = r10.A00
            com.whatsapp.twofactor.AddEmailActivity r2 = (com.whatsapp.twofactor.AddEmailActivity) r2
            X.0v0 r0 = r2.A09
            java.lang.String r0 = r0.A0i()
            r1 = 1
            if (r0 == 0) goto L_0x03bc
            int r0 = r0.length()
            if (r0 == 0) goto L_0x03bc
            X.9Pi r3 = r2.A03
            if (r3 == 0) goto L_0x03b5
            java.lang.String r4 = r2.A06
            int r6 = r2.A00
            r7 = 2
            r8 = 3
            r5 = 0
            r9 = 3
            r3.A00(r4, r5, r6, r7, r8, r9)
            r2.finish()
            return
        L_0x03b5:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03bc:
            X.AnonymousClass3SJ.A01(r2, r1)
            return
        L_0x03c0:
            java.lang.Object r0 = r10.A00
            X.C36431kI.A1N(r0)
            return
        L_0x03c6:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x03cb:
            X.C36341k9.A16(r3, r2)
            X.3So r5 = r4.A08
            X.3SV r6 = new X.3SV
            r6.<init>(r4, r2)
            X.0v0 r0 = r5.A06
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "support_ban_appeal_token"
            java.lang.String r8 = X.C36371kC.A0t(r1, r0)
            if (r8 != 0) goto L_0x03eb
            java.lang.Integer r0 = X.C36371kC.A0n()
            r6.BXN(r0)
            return
        L_0x03eb:
            X.0zN r1 = r5.A07
            r0 = 7922(0x1ef2, float:1.1101E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x040c
            X.0yC r1 = r5.A08
            r0 = 7921(0x1ef1, float:1.11E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x040c
            X.0wU r0 = r5.A0A
            r9 = 11
            X.3vV r4 = new X.3vV
            r4.<init>(r5, r6, r7, r8, r9)
            r0.Boy(r4)
            return
        L_0x040c:
            X.38p r2 = new X.38p
            r2.<init>(r6, r5, r7, r8)
            X.0wU r1 = r5.A0A
            r0 = 46
            X.C81203wd.A02(r1, r5, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y9.onClick(android.view.View):void");
    }
}
