package X;

import android.view.View;

/* renamed from: X.4Xa  reason: invalid class name and case insensitive filesystem */
public class C89564Xa implements View.OnLongClickListener {
    public Object A00;
    public final int A01;

    public C89564Xa(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnLongClickListener(new C89564Xa(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010f, code lost:
        if (r3 == false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0111, code lost:
        r2.Bvv(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
        r4.A0A.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011b, code lost:
        r2.Bur(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0165, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0169, code lost:
        r1 = r2.A01.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016f, code lost:
        if (r1.A0q != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0171, code lost:
        com.whatsapp.util.Log.i("callsHistoryFragmentV2/callItemViewHolderEventListener/onSingleContactPhotoLongClicked Ignoring long click");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0178, code lost:
        com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A07(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x01b0;
                case 1: goto L_0x0198;
                case 2: goto L_0x017d;
                case 3: goto L_0x0158;
                case 4: goto L_0x014a;
                case 5: goto L_0x0093;
                case 6: goto L_0x0141;
                case 7: goto L_0x011f;
                case 8: goto L_0x00f7;
                case 9: goto L_0x00de;
                case 10: goto L_0x00b1;
                case 11: goto L_0x0186;
                case 12: goto L_0x0052;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r8.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r4 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r4
            int r2 = r4.A02
            int[] r6 = X.AnonymousClass3UN.A02
            r5 = 8
            r1 = 0
        L_0x0010:
            r0 = r6[r1]
            if (r0 != r2) goto L_0x004a
            if (r1 <= 0) goto L_0x004f
        L_0x0016:
            int r0 = r1 + -1
            r0 = r6[r0]
            r4.A02 = r0
            android.graphics.Typeface r1 = X.AnonymousClass3UN.A04(r4, r0)
            android.widget.TextView r0 = r4.A09
            r0.setTypeface(r1)
            com.whatsapp.status.widget.StatusEditText r0 = r4.A0f
            r0.setTypeface(r1)
            int r0 = r4.A02
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0k(r4, r0)
            int[] r3 = com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A1A
            int r2 = r4.A02
            r1 = 0
        L_0x0034:
            r0 = r6[r1]
            if (r0 == r2) goto L_0x003d
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x0034
            r1 = -1
        L_0x003d:
            r0 = r3[r1]
            java.lang.String r1 = r4.getString(r0)
            X.0yb r0 = r4.A08
            X.C33521fV.A00(r4, r0, r1)
        L_0x0048:
            r0 = 1
            return r0
        L_0x004a:
            int r1 = r1 + 1
            if (r1 >= r5) goto L_0x004f
            goto L_0x0010
        L_0x004f:
            r1 = 8
            goto L_0x0016
        L_0x0052:
            java.lang.Object r6 = r8.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r6 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r6
            int r2 = r6.A01
            int[] r5 = X.AnonymousClass3UN.A01
            r4 = 21
            r1 = 0
        L_0x005d:
            r0 = r5[r1]
            if (r0 != r2) goto L_0x008b
            if (r1 <= 0) goto L_0x0090
        L_0x0063:
            int r0 = r1 + -1
            r0 = r5[r0]
            r6.A01 = r0
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0i(r6)
            int[] r3 = com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A19
            int r2 = r6.A01
            r1 = 0
        L_0x0071:
            r0 = r5[r1]
            if (r0 == r2) goto L_0x007a
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x0071
            r1 = -1
        L_0x007a:
            r0 = r3[r1]
            java.lang.String r1 = r6.getString(r0)
            X.0yb r0 = r6.A08
            X.C33521fV.A00(r6, r0, r1)
            X.1Xt r0 = r6.A0e
            r0.A02()
            goto L_0x0048
        L_0x008b:
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x0090
            goto L_0x005d
        L_0x0090:
            r1 = 21
            goto L_0x0063
        L_0x0093:
            java.lang.Object r2 = r8.A00
            X.52e r2 = (X.C1028452e) r2
            X.C36341k9.A1D(r2)
            X.6rN r0 = r2.A00
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onViewHolderLongClicked call item is null"
            goto L_0x0165
        L_0x00a2:
            X.1dg r0 = r2.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r1 = r0.A00
            boolean r0 = r1.A0q
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onViewHolderLongClicked action not supported in the middle of a search"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x01c7
        L_0x00b1:
            java.lang.Object r3 = r8.A00
            com.whatsapp.settings.SettingsUserProxyActivity r3 = (com.whatsapp.settings.SettingsUserProxyActivity) r3
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r3.A09
            java.lang.String r0 = r0.A02
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 != 0) goto L_0x01c7
            X.1qm r2 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131893271(0x7f121c17, float:1.9421314E38)
            r2.A0d(r0)
            r1 = 2131888724(0x7f120a54, float:1.9412091E38)
            r0 = 39
            X.C39001qm.A0F(r2, r3, r0, r1)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            X.3W6 r0 = X.AnonymousClass3W6.A00
            r2.A0f(r0, r1)
            X.C36341k9.A11(r2)
            goto L_0x0048
        L_0x00de:
            java.lang.Object r1 = r8.A00
            X.1z5 r1 = (X.C42601z5) r1
            X.3T1 r0 = r1.A00
            if (r0 == 0) goto L_0x01c7
            com.whatsapp.gallery.LinksGalleryFragment r4 = r1.A0A
            X.4Uw r0 = X.C36381kD.A0Y(r4)
            boolean r3 = r0.BK6()
            X.4Uw r2 = X.C36381kD.A0Y(r4)
            X.3T1 r0 = r1.A00
            goto L_0x010f
        L_0x00f7:
            java.lang.Object r1 = r8.A00
            X.1ys r1 = (X.C42471ys) r1
            X.2by r0 = r1.A00
            if (r0 == 0) goto L_0x01c7
            com.whatsapp.gallery.DocumentsGalleryFragment r4 = r1.A0B
            X.4Uw r0 = X.C36381kD.A0Y(r4)
            boolean r3 = r0.BK6()
            X.4Uw r2 = X.C36381kD.A0Y(r4)
            X.2by r0 = r1.A00
        L_0x010f:
            if (r3 == 0) goto L_0x011b
            r2.Bvv(r0)
        L_0x0114:
            X.1wQ r0 = r4.A0A
            r0.A06()
            goto L_0x0048
        L_0x011b:
            r2.Bur(r0)
            goto L_0x0114
        L_0x011f:
            java.lang.Object r1 = r8.A00
            X.1zE r1 = (X.C42691zE) r1
            r7 = 0
            X.2sk r4 = new X.2sk
            r4.<init>(r1, r7)
            X.1H2 r5 = r1.A04
            android.widget.ImageView r3 = r1.A02
            X.1XQ r0 = r1.A01
            int[] r6 = r0.A00
            X.1qN r2 = new X.1qN
            r2.<init>(r3, r4, r5, r6, r7)
            com.whatsapp.emoji.EmojiContainerView r0 = r1.A03
            android.view.View r0 = r0.getRootView()
            X.AnonymousClass3TC.A01(r3, r0, r2)
            goto L_0x0048
        L_0x0141:
            java.lang.Object r0 = r8.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            r0.A1W()
            goto L_0x0048
        L_0x014a:
            java.lang.Object r2 = r8.A00
            X.52e r2 = (X.C1028452e) r2
            X.C36341k9.A1D(r2)
            X.6rN r0 = r2.A00
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onContactPhotoLongClicked call item is null"
            goto L_0x0165
        L_0x0158:
            java.lang.Object r2 = r8.A00
            X.52e r2 = (X.C1028452e) r2
            X.C36341k9.A1D(r2)
            X.6rN r0 = r2.A00
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onMultiContactPhotoLongClicked call item is null"
        L_0x0165:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x01c7
        L_0x0169:
            X.1dg r0 = r2.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r1 = r0.A00
            boolean r0 = r1.A0q
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "callsHistoryFragmentV2/callItemViewHolderEventListener/onSingleContactPhotoLongClicked Ignoring long click"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0048
        L_0x0178:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A07(r2, r1)
            goto L_0x0048
        L_0x017d:
            java.lang.Object r0 = r8.A00
            X.3Tn r0 = (X.C65803Tn) r0
            X.C65803Tn.A02(r9, r0)
            goto L_0x0048
        L_0x0186:
            java.lang.Object r0 = r8.A00
            X.2ev r0 = (X.C47532ev) r0
            r0.A0E()
            java.lang.String r2 = r0.A04
            X.0yb r1 = r0.A02
            X.17Y r0 = r0.A01
            boolean r0 = X.AnonymousClass3TM.A02(r0, r1, r2)
            return r0
        L_0x0198:
            java.lang.Object r1 = r8.A00
            X.1nQ r1 = (X.C37921nQ) r1
            X.1mW r9 = (X.C37501mW) r9
            android.graphics.drawable.Drawable r0 = r9.A01
            if (r0 == 0) goto L_0x01c7
            X.3Tz r2 = r1.A03
            int r0 = X.C65923Tz.A0Z
            X.0v0 r1 = r2.A0L
            r0 = 1
            r1.A1F(r0)
            X.C65923Tz.A02(r9, r2)
            goto L_0x01c7
        L_0x01b0:
            java.lang.Object r1 = r8.A00
            X.1nQ r1 = (X.C37921nQ) r1
            X.1mW r9 = (X.C37501mW) r9
            android.graphics.drawable.Drawable r0 = r9.A01
            if (r0 == 0) goto L_0x01c7
            X.3Tz r2 = r1.A03
            int r0 = X.C65923Tz.A0Z
            X.0v0 r1 = r2.A0L
            r0 = 1
            r1.A1F(r0)
            X.C65923Tz.A01(r9, r2)
        L_0x01c7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89564Xa.onLongClick(android.view.View):boolean");
    }
}
