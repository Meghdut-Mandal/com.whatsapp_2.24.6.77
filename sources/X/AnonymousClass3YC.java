package X;

import android.view.View;

/* renamed from: X.3YC  reason: invalid class name */
public class AnonymousClass3YC implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3YC(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass3YC(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0280, code lost:
        if ((r4 instanceof X.C48552hV) == false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0282, code lost:
        r1 = (X.AnonymousClass02E) r3.A0M;
        r1.A1C(X.AnonymousClass190.A0E(r1.A0a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0292, code lost:
        if (r1 == false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0294, code lost:
        X.C65443Sb.A01(new com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog(), ((X.AnonymousClass02E) r3.A0M).A0k());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e7, code lost:
        r0.A0M.Bba(r2.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ee, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030a, code lost:
        r0 = r2.A01.A09;
        X.AnonymousClass00C.A08(r0);
        r1.BhQ(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0314, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0703, code lost:
        if (r4 != false) goto L_0x0705;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x09fe, code lost:
        r0.A0m(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0a01, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0129, code lost:
        r1 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013a, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013c, code lost:
        r1.A06(r2, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0140, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025b, code lost:
        r2 = (X.C65353Rs) r3.A0O.get();
        r1 = r4 instanceof X.C48542hU;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0265, code lost:
        if (r1 == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0267, code lost:
        X.C65353Rs.A01(r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x026b, code lost:
        X.C65353Rs.A00(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0270, code lost:
        if ((r4 instanceof X.C48562hW) == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0272, code lost:
        r3.A0M.Bbb(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0278, code lost:
        r3.A0L(r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x027d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r37) {
        /*
            r36 = this;
            r2 = r36
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0a02;
                case 1: goto L_0x09f2;
                case 2: goto L_0x09e7;
                case 3: goto L_0x09dc;
                case 4: goto L_0x09d1;
                case 5: goto L_0x09b5;
                case 6: goto L_0x018c;
                case 7: goto L_0x09a9;
                case 8: goto L_0x098c;
                case 9: goto L_0x0966;
                case 10: goto L_0x0a4e;
                case 11: goto L_0x091b;
                case 12: goto L_0x08c7;
                case 13: goto L_0x08b5;
                case 14: goto L_0x089a;
                case 15: goto L_0x0178;
                case 16: goto L_0x0876;
                case 17: goto L_0x0141;
                case 18: goto L_0x085c;
                case 19: goto L_0x082c;
                case 20: goto L_0x0813;
                case 21: goto L_0x0804;
                case 22: goto L_0x04bb;
                case 23: goto L_0x012c;
                case 24: goto L_0x011b;
                case 25: goto L_0x010c;
                case 26: goto L_0x00fd;
                case 27: goto L_0x012c;
                case 28: goto L_0x00ec;
                case 29: goto L_0x00b9;
                case 30: goto L_0x048f;
                case 31: goto L_0x03be;
                case 32: goto L_0x03b0;
                case 33: goto L_0x032c;
                case 34: goto L_0x0081;
                case 35: goto L_0x0315;
                case 36: goto L_0x02fe;
                case 37: goto L_0x02ef;
                case 38: goto L_0x0a35;
                case 39: goto L_0x0a1c;
                case 40: goto L_0x02db;
                case 41: goto L_0x02ce;
                case 42: goto L_0x02a5;
                case 43: goto L_0x024f;
                case 44: goto L_0x0242;
                case 45: goto L_0x003f;
                case 46: goto L_0x0018;
                case 47: goto L_0x022f;
                case 48: goto L_0x01bd;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r2.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            java.lang.Object r0 = r2.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r2 = r37
            r0.onClick(r2)
            com.whatsapp.voipcalling.VoipActivityV2.A0y(r1)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r3 = r2.A00
            X.5NK r3 = (X.AnonymousClass5NK) r3
            java.lang.Object r2 = r2.A01
            X.3Qq r2 = (X.C65083Qq) r2
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x0031
            r1 = 0
            r3.A0P = r1
            r0 = 1
            r3.A0Q = r0
            X.AnonymousClass5NK.A05(r3)
            r2.A0L(r1)
            return
        L_0x0031:
            boolean r0 = r3.A0J
            if (r0 != 0) goto L_0x0017
            boolean r0 = r2.A0X()
            if (r0 == 0) goto L_0x0a6f
            r3.A07()
            return
        L_0x003f:
            java.lang.Object r1 = r2.A00
            X.2hG r1 = (X.C48402hG) r1
            java.lang.Object r5 = r2.A01
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.updates.ui.UpdatesFragment r0 = r1.A02
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = r0.A0c
            if (r1 == 0) goto L_0x0017
            X.01I r0 = r0.A0h()
            X.14u r2 = X.C36401kF.A0L(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            com.whatsapp.updates.viewmodels.SearchUsecase r4 = r1.A0S()
            X.040 r3 = X.C109325Xd.A00(r1)
            r0 = 2
            X.AnonymousClass00C.A0D(r3, r0)
            boolean r0 = r5 instanceof X.C48192gr
            if (r0 != 0) goto L_0x0a73
            boolean r0 = r5 instanceof X.C48202gs
            if (r0 != 0) goto L_0x0a73
            boolean r0 = r5 instanceof X.C48232gv
            if (r0 != 0) goto L_0x0075
            boolean r0 = r5 instanceof X.C48212gt
            if (r0 == 0) goto L_0x0017
        L_0x0075:
            X.02l r2 = r4.A0C
            r1 = 0
            com.whatsapp.updates.viewmodels.SearchUsecase$launchRemoteSearch$1 r0 = new com.whatsapp.updates.viewmodels.SearchUsecase$launchRemoteSearch$1
            r0.<init>(r4, r1)
            X.C36381kD.A1R(r2, r0, r3)
            return
        L_0x0081:
            java.lang.Object r4 = r2.A00
            X.2hM r4 = (X.C48462hM) r4
            java.lang.Object r3 = r2.A01
            com.whatsapp.WaButtonWithLoader r3 = (com.whatsapp.WaButtonWithLoader) r3
            X.C36341k9.A1D(r4)
            int r1 = r4.A04()
            r0 = -1
            if (r1 == r0) goto L_0x0017
            X.2gm r1 = r4.A00
            java.lang.String r0 = "dataItem"
            if (r1 != 0) goto L_0x009e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009e:
            X.2La r2 = r1.A02
            r3.A02()
            X.2gm r1 = r4.A00
            if (r1 != 0) goto L_0x00ac
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ac:
            r0 = 1
            r1.A01 = r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r4.A08
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r0.A0c
            if (r0 == 0) goto L_0x0017
            r0.A0T(r2)
            return
        L_0x00b9:
            java.lang.Object r3 = r2.A00
            X.1wE r3 = (X.C40861wE) r3
            java.lang.Object r0 = r2.A01
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            X.C36391kE.A1T(r0)
            int r1 = r0.A04()
            r0 = -1
            if (r1 == r0) goto L_0x0017
            X.1wZ r2 = r3.A01
            java.util.List r0 = r3.A00
            java.lang.Object r0 = r0.get(r1)
            X.3Ii r0 = (X.C62993Ii) r0
            X.2pI r1 = r0.A00
            X.1wE r0 = r2.A0D
            r0.A0L(r1)
            X.4Ok r3 = r2.A0E
            if (r3 == 0) goto L_0x0017
            com.whatsapp.storage.StorageUsageActivity r3 = (com.whatsapp.storage.StorageUsageActivity) r3
            r3.A0G = r1
            java.util.ArrayList r2 = r3.A0Q
            r1 = 0
            r0 = 0
            com.whatsapp.storage.StorageUsageActivity.A0H(r3, r2, r1, r0)
            return
        L_0x00ec:
            java.lang.Object r0 = r2.A00
            X.4mY r0 = (X.C95954mY) r0
            java.lang.Object r1 = r2.A01
            X.65e r1 = (X.C1267165e) r1
            X.6xA r0 = r0.A01
            int r2 = r1.A00()
            X.6Es r1 = r0.A01
            goto L_0x013a
        L_0x00fd:
            java.lang.Object r1 = r2.A00
            X.4mk r1 = (X.C96074mk) r1
            java.lang.Object r0 = r2.A01
            X.6Mc r0 = (X.C130706Mc) r0
            X.6xB r1 = r1.A02
            int r0 = r0.A00
            int r2 = r0 + 3
            goto L_0x0129
        L_0x010c:
            java.lang.Object r1 = r2.A00
            X.4mk r1 = (X.C96074mk) r1
            java.lang.Object r0 = r2.A01
            X.6Mc r0 = (X.C130706Mc) r0
            X.6xB r1 = r1.A02
            int r0 = r0.A00
            int r2 = r0 + 2
            goto L_0x0129
        L_0x011b:
            java.lang.Object r1 = r2.A00
            X.4mk r1 = (X.C96074mk) r1
            java.lang.Object r0 = r2.A01
            X.6Mc r0 = (X.C130706Mc) r0
            X.6xB r1 = r1.A02
            int r0 = r0.A00
            int r2 = r0 + 1
        L_0x0129:
            X.6Es r1 = r1.A03
            goto L_0x013a
        L_0x012c:
            java.lang.Object r0 = r2.A00
            X.4mk r0 = (X.C96074mk) r0
            java.lang.Object r1 = r2.A01
            X.6Mc r1 = (X.C130706Mc) r1
            X.6xB r0 = r0.A02
            int r2 = r1.A00
            X.6Es r1 = r0.A03
        L_0x013a:
            if (r1 == 0) goto L_0x0017
            r0 = 1
            r1.A06(r2, r0)
            return
        L_0x0141:
            java.lang.Object r0 = r2.A00
            X.3rG r0 = (X.C77913rG) r0
            java.lang.Object r4 = r2.A01
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.whatsapp.status.StatusesFragment r3 = r0.A01
            android.animation.AnimatorSet r0 = r3.A00
            if (r0 != 0) goto L_0x0017
            boolean r0 = r3.A1J
            r2 = r0 ^ 1
            r3.A1J = r2
            android.content.res.Resources r1 = X.C36341k9.A0G(r3)
            r0 = 2131232172(0x7f0805ac, float:1.8080446E38)
            if (r2 == 0) goto L_0x0161
            r0 = 2131232170(0x7f0805aa, float:1.8080442E38)
        L_0x0161:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r4.setImageDrawable(r0)
            boolean r0 = r3.A1J
            if (r0 == 0) goto L_0x0a80
            r0 = 21
            X.4VL r1 = new X.4VL
            r1.<init>(r3, r0)
            r0 = 0
            com.whatsapp.status.StatusesFragment.A07(r1, r3, r0)
            return
        L_0x0178:
            java.lang.Object r1 = r2.A00
            X.3Jx r1 = (X.C63403Jx) r1
            java.lang.Object r2 = r2.A01
            X.2eX r2 = (X.C47432eX) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            java.lang.String r1 = r1.A02
            if (r1 == 0) goto L_0x0017
            X.02t r0 = r2.A00
            r0.invoke(r1)
            return
        L_0x018c:
            java.lang.Object r5 = r2.A00
            com.whatsapp.settings.Settings r5 = (com.whatsapp.settings.Settings) r5
            java.lang.Object r1 = r2.A01
            com.whatsapp.Me r1 = (com.whatsapp.Me) r1
            com.whatsapp.settings.Settings.A0H(r5)
            X.0ts r0 = r5.A00
            java.lang.String r4 = r1.cc
            java.lang.String r3 = r1.number
            java.util.Locale r1 = r0.A05
            java.util.Locale r0 = r0.A04
            X.3Rk r2 = new X.3Rk
            r2.<init>(r4, r3, r1, r0)
            java.lang.String r0 = r2.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0017
            X.2NY r1 = new X.2NY
            r1.<init>()
            java.lang.String r0 = r2.A02
            r1.A00 = r0
            X.0yW r0 = r5.A0d
            r0.Bly(r1)
            return
        L_0x01bd:
            java.lang.Object r3 = r2.A00
            X.1w6 r3 = (X.C40781w6) r3
            java.lang.Object r6 = r2.A01
            X.3Sx r6 = (X.C65643Sx) r6
            byte[] r2 = r6.A0B
            r8 = 0
            if (r2 == 0) goto L_0x0205
            int r1 = r2.length
            if (r1 <= 0) goto L_0x0205
            r0 = 0
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1)
        L_0x01d2:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r4 = r3.A01
            r4.A0J = r6
            java.util.List r7 = r4.A0P
            r7.clear()
            java.util.ArrayList r3 = r4.A0O
            r3.clear()
            java.util.List r0 = r6.A06
            if (r0 == 0) goto L_0x0207
            java.util.Iterator r2 = r0.iterator()
        L_0x01e8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0207
            java.lang.Object r1 = r2.next()
            X.39e r1 = (X.C607439e) r1
            java.lang.String r0 = r1.A02
            r3.add(r0)
            com.whatsapp.jid.UserJid r0 = r1.A01
            if (r0 == 0) goto L_0x0201
            r7.add(r0)
            goto L_0x01e8
        L_0x0201:
            r7.add(r8)
            goto L_0x01e8
        L_0x0205:
            r5 = r8
            goto L_0x01d2
        L_0x0207:
            X.1qm r3 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131886385(0x7f120131, float:1.9407347E38)
            r3.A0c(r0)
            r2 = 2131891289(0x7f121459, float:1.9417294E38)
            r1 = 14
            X.4XI r0 = new X.4XI
            r0.<init>(r5, r6, r4, r1)
            r3.A0h(r0, r2)
            r2 = 2131889431(0x7f120d17, float:1.9413525E38)
            r1 = 15
            X.4XI r0 = new X.4XI
            r0.<init>(r5, r6, r4, r1)
            r3.A0f(r0, r2)
            X.C36341k9.A11(r3)
            return
        L_0x022f:
            java.lang.Object r0 = r2.A00
            X.1w6 r0 = (X.C40781w6) r0
            java.lang.Object r4 = r2.A01
            X.141 r4 = (X.AnonymousClass141) r4
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r3 = r0.A01
            X.1ND r2 = r3.A02
            r1 = 15
            r0 = 1
            r2.Bua(r3, r4, r1, r0)
            return
        L_0x0242:
            java.lang.Object r1 = r2.A00
            X.2hD r1 = (X.C48372hD) r1
            java.lang.Object r4 = r2.A01
            X.3HM r4 = (X.AnonymousClass3HM) r4
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r3 = r1.A00
            goto L_0x025b
        L_0x024f:
            java.lang.Object r1 = r2.A00
            X.2hL r1 = (X.C48452hL) r1
            java.lang.Object r4 = r2.A01
            X.3HM r4 = (X.AnonymousClass3HM) r4
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r3 = r1.A03
        L_0x025b:
            X.005 r0 = r3.A0O
            java.lang.Object r2 = r0.get()
            X.3Rs r2 = (X.C65353Rs) r2
            boolean r1 = r4 instanceof X.C48542hU
            if (r1 == 0) goto L_0x026b
            r0 = 2
            X.C65353Rs.A01(r2, r0)
        L_0x026b:
            X.C65353Rs.A00(r4, r2)
            boolean r0 = r4 instanceof X.C48562hW
            if (r0 == 0) goto L_0x027e
            X.09p r1 = r3.A0M
            r0 = 5
            r1.Bbb(r0)
        L_0x0278:
            X.3KX r0 = r3.A00
            r3.A0L(r0)
            return
        L_0x027e:
            boolean r0 = r4 instanceof X.C48552hV
            if (r0 == 0) goto L_0x0292
            X.09p r1 = r3.A0M
            X.02E r1 = (X.AnonymousClass02E) r1
            android.content.Context r0 = r1.A0a()
            android.content.Intent r0 = X.AnonymousClass190.A0E(r0)
            r1.A1C(r0)
            goto L_0x0278
        L_0x0292:
            if (r1 == 0) goto L_0x0278
            X.09p r0 = r3.A0M
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01z r1 = r0.A0k()
            com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog r0 = new com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog
            r0.<init>()
            X.C65443Sb.A01(r0, r1)
            goto L_0x0278
        L_0x02a5:
            java.lang.Object r1 = r2.A00
            X.2hL r1 = (X.C48452hL) r1
            java.lang.Object r3 = r2.A01
            X.3HM r3 = (X.AnonymousClass3HM) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r2 = r1.A03
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.005 r0 = r2.A0O
            java.lang.Object r1 = r0.get()
            X.3Rs r1 = (X.C65353Rs) r1
            boolean r0 = r3 instanceof X.C48542hU
            if (r0 == 0) goto L_0x02c5
            r0 = 3
            X.C65353Rs.A01(r1, r0)
        L_0x02c5:
            X.C65353Rs.A00(r3, r1)
            X.3KX r0 = r2.A00
            r2.A0L(r0)
            return
        L_0x02ce:
            java.lang.Object r1 = r2.A00
            X.2hN r1 = (X.C48472hN) r1
            java.lang.Object r2 = r2.A01
            X.2go r2 = (X.C48162go) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r0 = r1.A0C
            goto L_0x02e7
        L_0x02db:
            java.lang.Object r1 = r2.A00
            X.2hO r1 = (X.C48482hO) r1
            java.lang.Object r2 = r2.A01
            X.2go r2 = (X.C48162go) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r0 = r1.A0D
        L_0x02e7:
            X.2La r1 = r2.A04
            X.09p r0 = r0.A0M
            r0.Bba(r1)
            return
        L_0x02ef:
            java.lang.Object r1 = r2.A00
            X.2h4 r1 = (X.AnonymousClass2h4) r1
            java.lang.Object r2 = r2.A01
            X.2ga r2 = (X.C48032ga) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1cz r1 = r1.A03
            X.2gZ r2 = (X.C48022gZ) r2
            goto L_0x030a
        L_0x02fe:
            java.lang.Object r1 = r2.A00
            X.2h1 r1 = (X.C48292h1) r1
            java.lang.Object r2 = r2.A01
            X.2gZ r2 = (X.C48022gZ) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1cy r1 = r1.A06
        L_0x030a:
            X.3Sz r0 = r2.A01
            com.whatsapp.jid.UserJid r0 = r0.A09
            X.AnonymousClass00C.A08(r0)
            r1.BhQ(r0)
            return
        L_0x0315:
            java.lang.Object r1 = r2.A00
            X.2h0 r1 = (X.C48282h0) r1
            java.lang.Object r2 = r2.A01
            X.2gZ r2 = (X.C48022gZ) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.4UI r1 = r1.A06
            X.3Sz r0 = r2.A01
            com.whatsapp.jid.UserJid r0 = r0.A09
            X.AnonymousClass00C.A08(r0)
            r1.BhQ(r0)
            return
        L_0x032c:
            java.lang.Object r3 = r2.A00
            X.33C r3 = (X.AnonymousClass33C) r3
            java.lang.Object r2 = r2.A01
            X.1yb r2 = (X.C42301yb) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r1 = 1
            X.AnonymousClass00C.A0D(r2, r1)
            com.whatsapp.TextEmojiLabel r0 = r2.A00
            java.lang.String r5 = X.C36431kI.A18(r0)
            java.lang.String r4 = r2.A03
            com.whatsapp.textstatus.AddTextStatusActivity r3 = r3.A00
            r3.A0F = r1
            java.lang.String r2 = "textEntry"
            if (r5 == 0) goto L_0x0364
            com.whatsapp.WaEditText r1 = r3.A01
            if (r1 != 0) goto L_0x0353
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0353:
            X.1lz r0 = new X.1lz
            r0.<init>(r5)
            r1.setText(r0)
            com.whatsapp.WaEditText r1 = r3.A01
            if (r1 != 0) goto L_0x0371
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0364:
            com.whatsapp.WaEditText r0 = r3.A01
            if (r0 != 0) goto L_0x036d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x036d:
            X.C36391kE.A1K(r0)
            goto L_0x0378
        L_0x0371:
            int r0 = r5.length()
            r1.setSelection(r0)
        L_0x0378:
            if (r4 == 0) goto L_0x0391
            X.0wU r2 = r3.A04
            r1 = 31
            X.74v r0 = new X.74v
            r0.<init>(r1, r4, r3)
            r2.Bp1(r0)
        L_0x0386:
            X.1vx r1 = r3.A0C
            java.lang.String r0 = "adapter"
            if (r1 != 0) goto L_0x03a3
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0391:
            android.content.Context r2 = r3.getApplicationContext()
            r1 = 2131231746(0x7f080402, float:1.8079582E38)
            r0 = 2131101055(0x7f06057f, float:1.7814509E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A01(r2, r1, r0)
            com.whatsapp.textstatus.AddTextStatusActivity.A01(r0, r3)
            goto L_0x0386
        L_0x03a3:
            r1.A01 = r5
            r3.A0E = r4
            r1.A00 = r4
            r1.A06()
            com.whatsapp.textstatus.AddTextStatusActivity.A07(r3)
            return
        L_0x03b0:
            java.lang.Object r0 = r2.A00
            X.1nB r0 = (X.C37771nB) r0
            java.lang.Object r1 = r2.A01
            X.38o r1 = (X.C606238o) r1
            com.whatsapp.support.faq.SearchFAQ r0 = r0.A00
            com.whatsapp.support.faq.SearchFAQ.A0v(r1, r0)
            return
        L_0x03be:
            java.lang.Object r12 = r2.A00
            com.whatsapp.support.DescribeProblemActivity r12 = (com.whatsapp.support.DescribeProblemActivity) r12
            java.lang.Object r5 = r2.A01
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r4 = com.whatsapp.support.DescribeProblemActivity.A01(r12)
            byte[] r0 = r4.getBytes()
            int r3 = r0.length
            java.lang.String r0 = r12.A0M
            boolean r1 = X.C1906499t.A00(r0)
            boolean r0 = r12.A0O
            r2 = 0
            if (r0 != 0) goto L_0x03f7
            boolean r0 = com.whatsapp.support.DescribeProblemActivity.A0M(r4, r1)
            if (r0 == 0) goto L_0x03f7
            android.widget.EditText r1 = r12.A02
            r0 = 2131231411(0x7f0802b3, float:1.8078902E38)
            X.C36371kC.A13(r12, r1, r0)
            r0 = 2131888769(0x7f120a81, float:1.9412183E38)
            if (r3 != 0) goto L_0x03f0
            r0 = 2131888768(0x7f120a80, float:1.941218E38)
        L_0x03f0:
            r5.setText(r0)
            r5.setVisibility(r2)
            return
        L_0x03f7:
            android.widget.EditText r1 = r12.A02
            r0 = 2131231413(0x7f0802b5, float:1.8078906E38)
            X.C36371kC.A13(r12, r1, r0)
            r0 = 8
            r5.setVisibility(r0)
            int r1 = r12.A00
            r0 = 2
            if (r1 == r0) goto L_0x048b
            r0 = 3
            if (r1 == r0) goto L_0x048b
            java.lang.String r1 = r12.A0L
            java.lang.String r0 = "voip-dev@whatsapp.com"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x048b
            java.lang.String r0 = r12.A0M
            boolean r0 = X.C1906499t.A00(r0)
            if (r0 != 0) goto L_0x048b
            X.0wU r11 = r12.A04
            X.2kG r0 = r12.A0C
            if (r0 == 0) goto L_0x0430
            int r1 = r0.A06()
            r0 = 1
            if (r1 != r0) goto L_0x0430
            X.2kG r0 = r12.A0C
            r0.A0D(r2)
        L_0x0430:
            X.0ww r0 = r12.A05
            r17 = r0
            X.1M4 r15 = r12.A0J
            X.0wx r14 = r12.A08
            X.0xT r13 = r12.A0H
            X.0ts r10 = r12.A00
            X.1bS r9 = r12.A0I
            X.1Cb r8 = r12.A06
            X.1CF r7 = r12.A09
            X.0v0 r6 = r12.A09
            X.3FE r5 = r12.A0G
            java.lang.String r4 = r12.A0M
            java.lang.String r3 = r12.A0N
            X.3Kk r0 = r12.A0F
            if (r0 == 0) goto L_0x0488
            java.util.ArrayList r34 = r0.A00()
        L_0x0452:
            java.lang.String r33 = com.whatsapp.support.DescribeProblemActivity.A01(r12)
            android.net.Uri[] r2 = r12.A0Q
            r22 = 0
            X.1ft r1 = r12.A0A
            X.2kG r0 = new X.2kG
            r16 = r12
            r26 = r22
            r30 = r15
            r31 = r4
            r32 = r3
            r35 = r2
            r27 = r5
            r28 = r13
            r29 = r9
            r23 = r7
            r24 = r1
            r25 = r12
            r20 = r10
            r21 = r14
            r18 = r8
            r19 = r6
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r12.A0C = r0
            X.C36391kE.A1Q(r0, r11)
            return
        L_0x0488:
            r34 = 0
            goto L_0x0452
        L_0x048b:
            com.whatsapp.support.DescribeProblemActivity.A0I(r12)
            return
        L_0x048f:
            java.lang.Object r1 = r2.A00
            X.1yR r1 = (X.C42201yR) r1
            java.lang.Object r5 = r2.A01
            X.00r r5 = (X.C001600r) r5
            android.content.Context r0 = X.C36441kJ.A0F(r1)
            java.lang.String r4 = r1.A02
            r3 = 6
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.dmsetting.DisappearingMessagesSettingActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
            if (r4 == 0) goto L_0x04b7
            java.lang.String r0 = "search_result_key"
            r2.putExtra(r0, r4)
        L_0x04b7:
            r5.A0D(r2)
            return
        L_0x04bb:
            java.lang.Object r3 = r2.A00
            java.lang.Object r1 = r2.A01
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r1 = (com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet) r1
            X.2fZ r0 = X.C47752fZ.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r0)
            java.lang.String r8 = "sticker"
            if (r2 == 0) goto L_0x04e4
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r5 = X.C36431kI.A0w(r1)
            X.6c4 r4 = r1.A07
            if (r4 != 0) goto L_0x04d8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x04d8:
            X.040 r9 = X.C109325Xd.A00(r5)
            r2 = 0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$starSticker$1 r8 = new com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$starSticker$1
            r8.<init>(r4, r5, r2)
            goto L_0x05b1
        L_0x04e4:
            X.2fb r2 = X.C47772fb.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r2)
            if (r2 == 0) goto L_0x050b
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet.A05(r1)
            X.005 r2 = r1.A0H
            if (r2 == 0) goto L_0x07c6
            java.lang.Object r2 = r2.get()
            X.1YD r2 = (X.AnonymousClass1YD) r2
            r2.A00()
        L_0x04fc:
            r1.A1b()
        L_0x04ff:
            X.2pV r2 = r1.A09
            java.lang.String r11 = "origin"
            r5 = 0
            if (r2 != 0) goto L_0x0718
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x050b:
            X.2fc r2 = X.C47782fc.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r2)
            java.lang.String r5 = "stickerInfo"
            if (r2 == 0) goto L_0x0597
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet.A05(r1)
            X.3QU r2 = r1.A08
            if (r2 != 0) goto L_0x0521
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0521:
            boolean r2 = r2.A0C
            if (r2 == 0) goto L_0x0558
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r2 = X.C36431kI.A0w(r1)
            boolean r2 = r2.A01
            if (r2 != 0) goto L_0x0554
            X.01I r2 = r1.A0i()
            boolean r2 = r2 instanceof X.AnonymousClass4V7
            if (r2 == 0) goto L_0x0554
            X.005 r2 = r1.A0D
            if (r2 == 0) goto L_0x07d4
            java.lang.Object r4 = r2.get()
            X.1Ae r4 = (X.C23871Ae) r4
            r2 = 6
            r4.A01(r2)
            X.005 r2 = r1.A0H
            if (r2 == 0) goto L_0x07cd
            java.lang.Object r5 = r2.get()
            X.1YD r5 = (X.AnonymousClass1YD) r5
            r4 = 0
            r2 = 39
            r5.A02(r4, r2)
            goto L_0x04fc
        L_0x0554:
            java.lang.String r5 = "meta-avatar"
            goto L_0x0705
        L_0x0558:
            X.0yC r4 = r1.A03
            if (r4 == 0) goto L_0x07e7
            r2 = 7755(0x1e4b, float:1.0867E-41)
            boolean r2 = r4.A0E(r2)
            if (r2 == 0) goto L_0x057f
            android.content.Context r2 = r1.A1D()
            if (r2 == 0) goto L_0x057f
            android.content.Context r4 = r1.A1D()
            if (r4 == 0) goto L_0x04fc
            X.190 r2 = r1.A04
            if (r2 == 0) goto L_0x07db
            java.lang.String r2 = "avatar_sticker_info_dialog"
            android.content.Intent r2 = X.AnonymousClass190.A11(r4, r2)
            r4.startActivity(r2)
            goto L_0x04fc
        L_0x057f:
            X.6WF r5 = r1.A06
            if (r5 == 0) goto L_0x07e0
            X.01I r4 = r1.A0i()
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.AnonymousClass00C.A0E(r4, r2)
            java.lang.ref.WeakReference r4 = X.AnonymousClass001.A0F(r4)
            java.lang.String r2 = "avatar_sticker_info_dialog"
            r5.A04(r2, r4)
            goto L_0x04fc
        L_0x0597:
            X.2fd r2 = X.C47792fd.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r2)
            if (r2 == 0) goto L_0x05b6
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r6 = X.C36431kI.A0w(r1)
            X.11F r5 = r1.A05
            r4 = 43
            X.040 r9 = X.C109325Xd.A00(r6)
            r2 = 0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$createYourOwnSticker$1 r8 = new com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$createYourOwnSticker$1
            r8.<init>(r5, r6, r2, r4)
        L_0x05b1:
            X.C36331k8.A1T(r8, r9)
            goto L_0x04ff
        L_0x05b6:
            X.2fe r2 = X.C47802fe.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r2)
            if (r2 == 0) goto L_0x05e9
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r7 = X.C36431kI.A0w(r1)
            X.6c4 r6 = r1.A07
            if (r6 != 0) goto L_0x05cb
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x05cb:
            X.2pV r5 = r1.A09
            if (r5 != 0) goto L_0x05d6
            java.lang.String r0 = "origin"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05d6:
            X.2pV r2 = X.C52482pV.MESSAGE
            r4 = 42
            if (r5 != r2) goto L_0x05de
            r4 = 44
        L_0x05de:
            X.040 r9 = X.C109325Xd.A00(r7)
            r2 = 0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$editSticker$1 r8 = new com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$editSticker$1
            r8.<init>(r6, r7, r2, r4)
            goto L_0x05b1
        L_0x05e9:
            boolean r2 = r3 instanceof X.C47742fY
            java.lang.String r4 = "origin"
            if (r2 == 0) goto L_0x061a
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r9 = X.C36431kI.A0w(r1)
            X.6c4 r6 = r1.A07
            if (r6 != 0) goto L_0x05fc
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x05fc:
            X.3QU r7 = r1.A08
            if (r7 != 0) goto L_0x0605
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0605:
            X.2pV r8 = r1.A09
            if (r8 != 0) goto L_0x060e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x060e:
            X.040 r2 = X.C109325Xd.A00(r9)
            r10 = 0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$removeSticker$1 r5 = new com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$removeSticker$1
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x06de
        L_0x061a:
            X.2fg r2 = X.C47822fg.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r2)
            if (r2 == 0) goto L_0x063f
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet.A05(r1)
            X.005 r2 = r1.A0H
            if (r2 == 0) goto L_0x07ec
            java.lang.Object r4 = r2.get()
            X.1YD r4 = (X.AnonymousClass1YD) r4
            X.3QU r2 = r1.A08
            if (r2 != 0) goto L_0x0638
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0638:
            java.lang.String r2 = r2.A01
            r4.A01(r2)
            goto L_0x04fc
        L_0x063f:
            X.2fh r2 = X.C47832fh.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r2)
            if (r2 == 0) goto L_0x06b1
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet.A05(r1)
            java.lang.String r6 = "StickerInfoBottomSheet/viewMoreAction"
            X.3QU r2 = r1.A08
            if (r2 != 0) goto L_0x0655
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0655:
            java.lang.String r5 = r2.A00
            java.lang.String r7 = r2.A03
            boolean r4 = r2.A04
            boolean r2 = r2.A0A
            if (r2 == 0) goto L_0x0682
            if (r5 == 0) goto L_0x0682
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r2 = X.C36431kI.A0w(r1)
            boolean r2 = r2.A01
            if (r2 != 0) goto L_0x0705
            X.01I r2 = r1.A0i()
            boolean r2 = r2 instanceof X.AnonymousClass4V7
            if (r2 == 0) goto L_0x0705
            X.005 r2 = r1.A0H
            if (r2 == 0) goto L_0x07f3
            java.lang.Object r4 = r2.get()
            X.1YD r4 = (X.AnonymousClass1YD) r4
            r2 = 39
            r4.A03(r5, r2)
            goto L_0x04fc
        L_0x0682:
            if (r7 == 0) goto L_0x0701
            X.005 r2 = r1.A0C     // Catch:{ ActivityNotFoundException -> 0x06ab }
            if (r2 == 0) goto L_0x06a4
            java.lang.Object r5 = r2.get()     // Catch:{ ActivityNotFoundException -> 0x06ab }
            X.1Dv r5 = (X.C24801Dv) r5     // Catch:{ ActivityNotFoundException -> 0x06ab }
            android.content.Context r4 = r1.A0a()     // Catch:{ ActivityNotFoundException -> 0x06ab }
            X.190 r2 = r1.A04     // Catch:{ ActivityNotFoundException -> 0x06ab }
            if (r2 == 0) goto L_0x069f
            android.content.Intent r2 = X.C36331k8.A04(r7)     // Catch:{ ActivityNotFoundException -> 0x06ab }
            r5.A06(r4, r2)     // Catch:{ ActivityNotFoundException -> 0x06ab }
            goto L_0x04fc
        L_0x069f:
            java.lang.RuntimeException r2 = X.C36331k8.A0X()     // Catch:{ ActivityNotFoundException -> 0x06ab }
            throw r2     // Catch:{ ActivityNotFoundException -> 0x06ab }
        L_0x06a4:
            java.lang.String r2 = "activityUtils"
            java.lang.RuntimeException r2 = X.C36331k8.A0d(r2)     // Catch:{ ActivityNotFoundException -> 0x06ab }
            throw r2     // Catch:{ ActivityNotFoundException -> 0x06ab }
        L_0x06ab:
            r2 = move-exception
            com.whatsapp.util.Log.e(r6, r2)
            goto L_0x04fc
        L_0x06b1:
            X.2ff r2 = X.C47812ff.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r2)
            if (r2 == 0) goto L_0x06e3
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet.A05(r1)
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r9 = X.C36431kI.A0w(r1)
            X.6c4 r7 = r1.A07
            if (r7 != 0) goto L_0x06c9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x06c9:
            X.11F r6 = r1.A05
            X.2pV r8 = r1.A09
            if (r8 != 0) goto L_0x06d4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x06d4:
            X.040 r2 = X.C109325Xd.A00(r9)
            r10 = 0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$sendSticker$1 r5 = new com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$sendSticker$1
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x06de:
            X.C36331k8.A1T(r5, r2)
            goto L_0x04ff
        L_0x06e3:
            X.2fa r2 = X.C47762fa.A00
            boolean r2 = X.AnonymousClass00C.A0J(r3, r2)
            if (r2 == 0) goto L_0x04ff
            X.190 r2 = r1.A04
            if (r2 == 0) goto L_0x07ff
            android.content.Context r5 = r1.A0a()
            android.content.Intent r4 = X.C36431kI.A0D()
            java.lang.String r2 = "com.whatsapp.avatar.privacy.AvatarStickerPrivacySettings"
            android.content.Intent r2 = r4.setClassName(r5, r2)
            X.AnonymousClass00C.A08(r2)
            goto L_0x0713
        L_0x0701:
            if (r5 == 0) goto L_0x04fc
            if (r4 == 0) goto L_0x04fc
        L_0x0705:
            X.190 r2 = r1.A04
            if (r2 == 0) goto L_0x07fa
            X.01I r4 = r1.A0i()
            java.lang.String r2 = "info_dialog"
            android.content.Intent r2 = X.AnonymousClass190.A1D(r4, r5, r2)
        L_0x0713:
            r1.A1C(r2)
            goto L_0x04fc
        L_0x0718:
            int r10 = r2.ordinal()
            r9 = 10
            r8 = 9
            r6 = 2
            r7 = 3
            r4 = 1
            r2 = 4
            if (r10 == r2) goto L_0x072d
            if (r10 == r7) goto L_0x0732
            if (r10 == r4) goto L_0x0732
            if (r10 == r6) goto L_0x0732
            return
        L_0x072d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x0736
        L_0x0732:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
        L_0x0736:
            int r2 = r2.intValue()
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x074c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
        L_0x0744:
            X.6O1 r0 = r1.A02
            if (r0 == 0) goto L_0x07bf
            r0.A02(r5, r4, r2)
            return
        L_0x074c:
            X.2fb r0 = X.C47772fb.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0759
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            goto L_0x0744
        L_0x0759:
            X.2fc r0 = X.C47782fc.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0766
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            goto L_0x0744
        L_0x0766:
            X.2fd r0 = X.C47792fd.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0773
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            goto L_0x0744
        L_0x0773:
            X.2fe r0 = X.C47802fe.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0782
            r0 = 38
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L_0x0744
        L_0x0782:
            boolean r0 = r3 instanceof X.C47742fY
            if (r0 == 0) goto L_0x07a1
            X.2pV r0 = r1.A09
            if (r0 != 0) goto L_0x078f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x078f:
            int r0 = r0.ordinal()
            if (r0 == r4) goto L_0x079e
            if (r0 != r6) goto L_0x0744
            r0 = 28
        L_0x0799:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L_0x0744
        L_0x079e:
            r0 = 36
            goto L_0x0799
        L_0x07a1:
            X.2fg r0 = X.C47822fg.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x07b0
            r0 = 37
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L_0x0744
        L_0x07b0:
            X.2fh r0 = X.C47832fh.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0744
            r0 = 39
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L_0x0744
        L_0x07bf:
            java.lang.String r0 = "expressionUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07c6:
            java.lang.String r0 = "stickerPickerOpenObservers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07cd:
            java.lang.String r0 = "stickerPickerOpenObservers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07d4:
            java.lang.String r0 = "avatarLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07db:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x07e0:
            java.lang.String r0 = "avatarEditorLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07e7:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x07ec:
            java.lang.String r0 = "stickerPickerOpenObservers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07f3:
            java.lang.String r0 = "stickerPickerOpenObservers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07fa:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x07ff:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0804:
            java.lang.Object r1 = r2.A00
            com.whatsapp.status.seeall.StatusSeeAllActivity r1 = (com.whatsapp.status.seeall.StatusSeeAllActivity) r1
            java.lang.Object r0 = r2.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            X.AnonymousClass00C.A0B(r0)
            r1.onOptionsItemSelected(r0)
            return
        L_0x0813:
            java.lang.Object r0 = r2.A00
            X.1qd r0 = (X.C38961qd) r0
            java.lang.Object r3 = r2.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r3 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r3
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            r1 = 1
            X.C38961qd.A00(r0)
            android.widget.RadioButton r0 = r0.A04
            r0.setChecked(r1)
            r3.A1q(r2)
            return
        L_0x082c:
            java.lang.Object r3 = r2.A00
            X.1qd r3 = (X.C38961qd) r3
            java.lang.Object r2 = r2.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            r1 = 1
            X.C38961qd.A00(r3)
            android.widget.RadioButton r0 = r3.A02
            r0.setChecked(r1)
            X.3XT r0 = r2.A03
            if (r0 != 0) goto L_0x084c
            java.lang.String r0 = "statusDistributionInfo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x084c:
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0858
            r2.A1p()
            return
        L_0x0858:
            r2.A1q(r1)
            return
        L_0x085c:
            java.lang.Object r3 = r2.A00
            X.1qd r3 = (X.C38961qd) r3
            java.lang.Object r2 = r2.A01
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r2 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            r1 = 1
            X.C38961qd.A00(r3)
            android.widget.RadioButton r0 = r3.A03
            r0.setChecked(r1)
            r0 = 2
            r2.A1q(r0)
            return
        L_0x0876:
            java.lang.Object r4 = r2.A00
            com.whatsapp.spamreport.ReportSpamDialogFragment r4 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r4
            java.lang.Object r0 = r2.A01
            X.141 r0 = (X.AnonymousClass141) r0
            X.3Os r3 = r4.A1k()
            java.lang.String r2 = X.C36371kC.A0x(r4)
            X.11F r1 = r0.A0H
            if (r1 == 0) goto L_0x0895
            X.C36321k7.A0w(r2, r1)
            r0 = 2
            X.AnonymousClass3Os.A00(r3, r1, r2, r0)
            r4.A1b()
            return
        L_0x0895:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        L_0x089a:
            java.lang.Object r3 = r2.A00
            com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r3 = (com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity) r3
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setEnabled(r0)
            X.3Nt r3 = r3.A05
            X.0wk r2 = r3.A04
            r1 = 47
            X.3wZ r0 = new X.3wZ
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.execute(r0)
            return
        L_0x08b5:
            java.lang.Object r3 = r2.A00
            X.14p r3 = (X.C224914p) r3
            java.lang.Object r2 = r2.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.0wU r1 = r3.A04
            r0 = 49
            X.C80313vC.A01(r1, r3, r2, r0)
            return
        L_0x08c7:
            java.lang.Object r4 = r2.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Object r0 = r2.A01
            X.37P r0 = (X.AnonymousClass37P) r0
            X.0v0 r1 = r0.A00
            java.lang.String r0 = "privacy_checkup_banner_last_seen_timestamp"
            r1.A1Z(r0)
            X.3PJ r2 = r4.A0z
            r3 = 4
            r0 = 0
            X.2QP r1 = X.AnonymousClass3PJ.A00(r0, r0, r3)
            java.lang.Integer r0 = X.C36361kB.A0i()
            r1.A00 = r0
            X.0yW r0 = r2.A00
            r0.Blv(r1)
            java.lang.Integer r2 = X.C36401kF.A0k()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.2Oh r1 = new X.2Oh
            r1.<init>()
            r1.A00 = r0
            r1.A01 = r2
            X.0yW r0 = r4.A0f
            r0.Blv(r1)
            X.3PJ r1 = r4.A0z
            r0 = 2
            r1.A01(r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.privacy.checkup.PrivacyCheckupHomeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "ENTRY_POINT"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x091b:
            java.lang.Object r3 = r2.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            java.lang.Object r5 = r2.A01
            X.37P r5 = (X.AnonymousClass37P) r5
            X.3PJ r4 = r3.A0z
            r2 = 4
            java.lang.Integer r1 = X.C36381kD.A0m()
            r0 = 0
            X.2QP r1 = X.AnonymousClass3PJ.A00(r0, r1, r2)
            java.lang.Integer r0 = X.C36361kB.A0j()
            r1.A00 = r0
            X.0yW r0 = r4.A00
            r0.Blv(r1)
            X.3PJ r1 = r3.A0z
            r0 = 3
            r1.A01(r0)
            X.0v0 r2 = r5.A00
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r2)
            java.lang.String r1 = "privacy_checkup_banner_dismiss"
            int r0 = X.C36371kC.A01(r0, r1)
            int r0 = r0 + 1
            X.C36321k7.A0q(r2, r1, r0)
            java.lang.String r0 = "privacy_checkup_banner_cool_off_timestamp"
            r2.A1Z(r0)
            java.lang.String r0 = "privacy_checkup_banner_last_seen_timestamp"
            r2.A1Z(r0)
            android.view.View r1 = r3.A0C
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.settings.SettingsPrivacy.A0I(r3)
            return
        L_0x0966:
            java.lang.Object r1 = r2.A00
            com.whatsapp.settings.SettingsChat r1 = (com.whatsapp.settings.SettingsChat) r1
            java.lang.Object r0 = r2.A01
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.toggle()
            boolean r2 = r0.isChecked()
            X.005 r0 = r1.A0H
            java.lang.Object r0 = r0.get()
            X.1HY r0 = (X.AnonymousClass1HY) r0
            X.00T r0 = r0.A02
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r0)
            java.lang.String r0 = "bonsai_meta_ai_button_setting_enabled"
            r1.putBoolean(r0, r2)
            r1.apply()
            return
        L_0x098c:
            java.lang.Object r1 = r2.A00
            com.whatsapp.settings.SettingsChat r1 = (com.whatsapp.settings.SettingsChat) r1
            java.lang.Object r0 = r2.A01
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.toggle()
            boolean r2 = r0.isChecked()
            X.1CR r0 = r1.A0D
            X.0v0 r0 = r0.A08
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "push_to_video_sending_enabled"
            X.C36341k9.A0v(r1, r0, r2)
            return
        L_0x09a9:
            java.lang.Object r1 = r2.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r2.A01
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            return
        L_0x09b5:
            java.lang.Object r0 = r2.A00
            com.whatsapp.settings.Settings r0 = (com.whatsapp.settings.Settings) r0
            java.lang.Object r3 = r2.A01
            android.view.View r3 = (android.view.View) r3
            X.1eg r0 = r0.A0Y
            X.0v0 r0 = r0.A00
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r0)
            java.lang.String r1 = "create_group_banner_dismissed"
            r0 = 1
            X.C36331k8.A0w(r2, r1, r0)
            r0 = 8
            r3.setVisibility(r0)
            return
        L_0x09d1:
            java.lang.Object r0 = r2.A00
            X.59a r0 = (X.AnonymousClass59a) r0
            java.lang.Object r2 = r2.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x09fe
        L_0x09dc:
            java.lang.Object r0 = r2.A00
            X.59Z r0 = (X.AnonymousClass59Z) r0
            java.lang.Object r2 = r2.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x09fe
        L_0x09e7:
            java.lang.Object r0 = r2.A00
            X.59Y r0 = (X.AnonymousClass59Y) r0
            java.lang.Object r2 = r2.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            com.whatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x09fe
        L_0x09f2:
            java.lang.Object r1 = r2.A00
            X.59X r1 = (X.AnonymousClass59X) r1
            java.lang.Object r2 = r2.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.search.SearchViewModel r0 = r1.A00
        L_0x09fe:
            r0.A0m(r2)
            return
        L_0x0a02:
            java.lang.Object r0 = r2.A00
            X.59W r0 = (X.AnonymousClass59W) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.search.SearchViewModel r1 = r0.A00
            r0 = 0
            r1.A0r(r0)
            com.whatsapp.search.SearchViewModel.A05(r1)
            X.1S6 r0 = r1.A0z
            r0.A01()
            X.1Rs r0 = r1.A17
            r0.A0D(r2)
            return
        L_0x0a1c:
            java.lang.Object r1 = r2.A00
            X.2hI r1 = (X.C48422hI) r1
            java.lang.Object r2 = r2.A01
            X.2gc r2 = (X.C48052gc) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1d4 r1 = r1.A02
            X.2nh r0 = r2.A00
            r1.BQv(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0a35:
            java.lang.Object r1 = r2.A00
            X.2hK r1 = (X.C48442hK) r1
            java.lang.Object r2 = r2.A01
            X.2gc r2 = (X.C48052gc) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1d4 r1 = r1.A04
            X.2nh r0 = r2.A00
            r1.BQv(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0a4e:
            java.lang.Object r2 = r2.A00
            com.whatsapp.settings.SettingsHelpV2 r2 = (com.whatsapp.settings.SettingsHelpV2) r2
            X.1N3 r1 = r2.A04
            java.lang.String r0 = ""
            android.net.Uri r0 = r1.A00(r0)
            X.C36371kC.A1A(r0, r2)
            X.3TS r0 = r2.A07
            if (r0 == 0) goto L_0x0a68
            java.lang.String r0 = "noticeId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0a68:
            java.lang.String r0 = "noticeBadgeManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0a6f:
            r3.A0F()
            return
        L_0x0a73:
            X.1dD r1 = r4.A09
            r0 = 7
            r1.A06(r0)
            X.3UC r1 = r4.A0A
            r0 = 1
            r1.A0B(r2, r0)
            return
        L_0x0a80:
            java.util.List r1 = r3.A1G
            java.util.List r0 = r3.A1H
            r1.addAll(r0)
            X.1nZ r0 = r3.A0o
            r0.notifyDataSetChanged()
            androidx.fragment.app.ListFragment.A00(r3)
            android.widget.ListView r0 = r3.A05
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 10
            X.C89924Yk.A00(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YC.onClick(android.view.View):void");
    }
}
