package X;

/* renamed from: X.3Ud  reason: invalid class name and case insensitive filesystem */
public class C65963Ud implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C65963Ud(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, int i) {
        r2.A08(r1, new C65963Ud(r1, i));
    }

    public static void A01(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new C65963Ud(obj, i));
    }

    public static void A02(C001600r r1, AnonymousClass08S r2, Object obj, int i) {
        r2.A0F(r1, new C65963Ud(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0210, code lost:
        if (r0 == 1) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0273, code lost:
        if (r0 == 1) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02a0, code lost:
        if (r5 == r3) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02a2, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a6, code lost:
        if (r5 == 2) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02a8, code lost:
        r2.A06(com.whatsapp.R.string.f12nameremoved, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02af, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02b2, code lost:
        r2.A04(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0446, code lost:
        r0.setText(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0449, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013a, code lost:
        if (java.lang.Boolean.TRUE != r11) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013c, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013e, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0141, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014e, code lost:
        if (((java.lang.Boolean) r11).booleanValue() != false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0150, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0401;
                case 1: goto L_0x0152;
                case 2: goto L_0x0130;
                case 3: goto L_0x03f5;
                case 4: goto L_0x0005;
                case 5: goto L_0x03d3;
                case 6: goto L_0x03bd;
                case 7: goto L_0x0142;
                case 8: goto L_0x03ad;
                case 9: goto L_0x0436;
                case 10: goto L_0x039a;
                case 11: goto L_0x0389;
                case 12: goto L_0x0005;
                case 13: goto L_0x00bb;
                case 14: goto L_0x037d;
                case 15: goto L_0x02ec;
                case 16: goto L_0x02c5;
                case 17: goto L_0x0087;
                case 18: goto L_0x02bc;
                case 19: goto L_0x02b6;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x023e;
                case 23: goto L_0x01c6;
                case 24: goto L_0x01b3;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x0050;
                case 31: goto L_0x01a9;
                case 32: goto L_0x018d;
                case 33: goto L_0x0183;
                case 34: goto L_0x0177;
                case 35: goto L_0x0023;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x0005;
                case 43: goto L_0x0005;
                case 44: goto L_0x0005;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x0005;
                case 49: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.C36331k8.A1J(r0, r11)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r1 = r10.A00
            X.01I r1 = (X.AnonymousClass01I) r1
            boolean r0 = X.AnonymousClass000.A1X(r11)
            if (r0 == 0) goto L_0x000a
            X.01z r1 = r1.getSupportFragmentManager()
            int r0 = r1.A0I()
            if (r0 <= 0) goto L_0x000a
            r1.A0V()
            return
        L_0x0023:
            java.lang.Object r2 = r10.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            com.whatsapp.status.widget.StatusEditText r0 = r2.A0f
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x000a
            X.1sS r0 = r2.A0K
            if (r0 == 0) goto L_0x000a
            X.1DU r1 = r2.A0V
            com.whatsapp.status.widget.StatusEditText r0 = r2.A0f
            java.lang.String r0 = X.C36361kB.A0n(r0)
            java.lang.String r1 = r1.A03(r0)
            X.1sS r0 = r2.A0K
            java.lang.String r0 = r0.A06
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x000a
            r0 = 0
            r2.A0I = r0
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0J(r2)
            return
        L_0x0050:
            java.lang.Object r2 = r10.A00
            X.14p r2 = (X.C224914p) r2
            android.content.Intent r11 = (android.content.Intent) r11
            android.content.ComponentName r0 = r11.getComponent()
            if (r0 == 0) goto L_0x0075
            android.content.ComponentName r0 = r11.getComponent()
            java.lang.String r1 = r0.getClassName()
        L_0x0064:
            java.lang.Class<com.whatsapp.storage.StorageUsageGalleryActivity> r0 = com.whatsapp.storage.StorageUsageGalleryActivity.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0077
            r0 = 0
            r2.startActivityForResult(r11, r0)
            return
        L_0x0075:
            r1 = 0
            goto L_0x0064
        L_0x0077:
            java.lang.Class<com.whatsapp.dmsetting.DisappearingMessagesSettingActivity> r0 = com.whatsapp.dmsetting.DisappearingMessagesSettingActivity.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000a
            r2.startActivity(r11)
            return
        L_0x0087:
            java.lang.Object r3 = r10.A00
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r3 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r3
            boolean r2 = X.AnonymousClass000.A1X(r11)
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x000a
            com.whatsapp.TextEmojiLabel r1 = r3.A01
            X.1e1 r4 = r3.A0A
            android.content.Context r5 = r1.getContext()
            r0 = 2131890577(0x7f121191, float:1.941585E38)
            if (r2 == 0) goto L_0x00a3
            r0 = 2131890579(0x7f121193, float:1.9415854E38)
        L_0x00a3:
            java.lang.String r7 = r3.getString(r0)
            int r9 = X.C36381kD.A01(r3)
            r0 = 6
            X.3wa r6 = new X.3wa
            r6.<init>((java.lang.Object) r3, (int) r0)
            java.lang.String r8 = ""
            android.text.SpannableStringBuilder r0 = r4.A03(r5, r6, r7, r8, r9)
            r1.setText(r0)
            return
        L_0x00bb:
            java.lang.Object r2 = r10.A00
            com.whatsapp.settings.SettingsUserProxyActivity r2 = (com.whatsapp.settings.SettingsUserProxyActivity) r2
            X.37R r11 = (X.AnonymousClass37R) r11
            int r4 = r11.A00
            if (r4 != 0) goto L_0x00dc
            int r0 = r11.A01
            if (r0 != 0) goto L_0x00dc
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r2.A09
            boolean r0 = r0.A0W()
            if (r0 == 0) goto L_0x00dc
            com.whatsapp.WaTextView r0 = r2.A06
            java.lang.String r1 = ""
            r0.setText(r1)
            com.whatsapp.WaTextView r0 = r2.A08
            goto L_0x0446
        L_0x00dc:
            int r1 = r11.A02
            com.whatsapp.WaTextView r0 = r2.A06
            r0.setText(r1)
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r2.A09
            boolean r0 = r0.A0W()
            if (r0 == 0) goto L_0x000a
            com.whatsapp.WaTextView r3 = r2.A08
            if (r3 == 0) goto L_0x000a
            r0 = 2
            if (r4 != r0) goto L_0x011a
            int r1 = r11.A01
            r0 = 6
            if (r1 != r0) goto L_0x011a
            r0 = 0
            r3.setVisibility(r0)
            com.whatsapp.WaTextView r1 = r2.A08
            r0 = 2131893275(0x7f121c1b, float:1.9421322E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r2.A08
            int r0 = r2.A04
            r1.setTextColor(r0)
            com.whatsapp.WaTextView r1 = r2.A06
            r0 = 2131893266(0x7f121c12, float:1.9421304E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r2.A06
            int r0 = r2.A01
        L_0x0116:
            r1.setTextColor(r0)
            return
        L_0x011a:
            r0 = 8
            r3.setVisibility(r0)
            com.whatsapp.WaTextView r1 = r2.A06
            r0 = 2
            if (r4 != r0) goto L_0x0127
            int r0 = r2.A01
            goto L_0x0116
        L_0x0127:
            r0 = 3
            if (r4 != r0) goto L_0x012d
            int r0 = r2.A04
            goto L_0x0116
        L_0x012d:
            int r0 = r2.A02
            goto L_0x0116
        L_0x0130:
            java.lang.Object r0 = r10.A00
            com.whatsapp.settings.SettingsDataUsageActivity r0 = (com.whatsapp.settings.SettingsDataUsageActivity) r0
            android.view.View r1 = r0.A05
            if (r1 == 0) goto L_0x000a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r0 == r11) goto L_0x0150
        L_0x013c:
            r0 = 8
        L_0x013e:
            r1.setVisibility(r0)
            return
        L_0x0142:
            java.lang.Object r0 = r10.A00
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            android.view.View r1 = r0.A06
            boolean r0 = r11.booleanValue()
            if (r0 == 0) goto L_0x013c
        L_0x0150:
            r0 = 0
            goto L_0x013e
        L_0x0152:
            java.lang.Object r3 = r10.A00
            com.whatsapp.settings.SettingsChat r3 = (com.whatsapp.settings.SettingsChat) r3
            long r1 = X.C36431kI.A09(r11)
            android.content.Context r0 = r3.getApplicationContext()
            boolean r0 = X.C34191gb.A08(r0)
            if (r0 != 0) goto L_0x000a
            X.0ts r0 = r3.A00
            java.lang.String r2 = X.AnonymousClass3RQ.A02(r3, r0, r1)
            com.whatsapp.settings.SettingsRowIconText r1 = r3.A0B
            r0 = 2131894201(0x7f121fb9, float:1.94232E38)
            java.lang.String r0 = X.C36321k7.A0A(r3, r2, r0)
            r1.setSubText(r0)
            return
        L_0x0177:
            java.lang.Object r0 = r10.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.4R0 r11 = (X.AnonymousClass4R0) r11
            X.1D0 r0 = r0.A0W
            r0.A0F(r11)
            return
        L_0x0183:
            java.lang.Object r0 = r10.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.6tS r11 = (X.C145166tS) r11
            r0.A3i(r11)
            return
        L_0x018d:
            java.lang.Object r1 = r10.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r1 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r1
            android.util.Pair r11 = (android.util.Pair) r11
            java.lang.Object r2 = r11.first
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            java.lang.Object r0 = r11.second
            if (r0 == 0) goto L_0x01a0
            X.3L1 r0 = (X.AnonymousClass3L1) r0
            r2.A12(r0)
        L_0x01a0:
            X.1X4 r0 = r1.A0H
            X.0xM r1 = r0.A0X
            r0 = 1
            r1.A0n(r2, r0)
            return
        L_0x01a9:
            java.lang.Object r0 = r10.A00
            com.whatsapp.text.FinalBackspaceAwareEntry r0 = (com.whatsapp.text.FinalBackspaceAwareEntry) r0
            java.lang.String r11 = (java.lang.String) r11
            r0.A0F(r11)
            return
        L_0x01b3:
            java.lang.Object r1 = r10.A00
            X.3rL r1 = (X.C77963rL) r1
            java.util.List r11 = (java.util.List) r11
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.4Rr r0 = r1.A04
            r0.setVoiceVisualizerSegments(r11)
            r0 = 1
            r1.A00 = r0
            return
        L_0x01c6:
            java.lang.Object r4 = r10.A00
            com.whatsapp.status.playback.MyStatusesActivity r4 = (com.whatsapp.status.playback.MyStatusesActivity) r4
            X.37T r11 = (X.AnonymousClass37T) r11
            java.lang.String r0 = "myStatuessActivity/onStatusSharingInfoChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r11 == 0) goto L_0x0229
            android.content.Intent r0 = r11.A01
            if (r0 == 0) goto L_0x0226
            java.util.List r3 = r4.A0w
            java.util.Iterator r2 = r3.iterator()
        L_0x01dd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ee
            java.lang.Object r1 = r2.next()
            android.net.Uri r1 = (android.net.Uri) r1
            r0 = 1
            r4.revokeUriPermission(r1, r0)
            goto L_0x01dd
        L_0x01ee:
            r3.clear()
            java.util.List r0 = r11.A02
            r3.addAll(r0)
            boolean r0 = r4.A0l
            if (r0 == 0) goto L_0x0223
            X.2oA r0 = X.C51652oA.SHARE_TO_FACEBOOK
        L_0x01fc:
            X.3P1 r6 = r4.A0T
            X.2oB r5 = r6.A03
            r3 = 0
            int r0 = r0.ordinal()
            r2 = 3
            r1 = 1
            if (r0 != r1) goto L_0x0213
            int r0 = r5.ordinal()
            if (r0 == r3) goto L_0x0212
            r2 = 4
            if (r0 != r1) goto L_0x0213
        L_0x0212:
            r2 = 2
        L_0x0213:
            X.1Xt r0 = r6.A04
            X.3Ao r0 = r0.A00
            if (r0 == 0) goto L_0x021b
            r0.A00 = r2
        L_0x021b:
            android.content.Intent r1 = r11.A01
            r0 = 35
            r4.startActivityForResult(r1, r0)
            return
        L_0x0223:
            X.2oA r0 = X.C51652oA.SHARE_TO_THIRD_PARTY
            goto L_0x01fc
        L_0x0226:
            int r5 = r11.A00
            goto L_0x022a
        L_0x0229:
            r5 = 0
        L_0x022a:
            r1 = 5
            if (r5 == 0) goto L_0x0232
            r0 = 1
            r1 = 3
            if (r5 == r0) goto L_0x0232
            r1 = 2
        L_0x0232:
            X.1Xt r0 = r4.A0W
            X.3Ao r0 = r0.A00
            if (r0 == 0) goto L_0x023a
            r0.A01 = r1
        L_0x023a:
            r3 = 1
            X.17Y r2 = r4.A05
            goto L_0x02a0
        L_0x023e:
            java.lang.Object r4 = r10.A00
            com.whatsapp.status.StatusesFragment r4 = (com.whatsapp.status.StatusesFragment) r4
            X.37T r11 = (X.AnonymousClass37T) r11
            java.lang.String r0 = "statusesFragment/onStatusSharingInfoChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r11 == 0) goto L_0x028c
            android.content.Intent r0 = r11.A01
            if (r0 == 0) goto L_0x0289
            com.whatsapp.status.StatusesFragment.A0A(r4)
            java.util.List r1 = r4.A1T
            java.util.List r0 = r11.A02
            r1.addAll(r0)
            boolean r0 = r4.A1I
            if (r0 == 0) goto L_0x0286
            X.2oA r0 = X.C51652oA.SHARE_TO_FACEBOOK
        L_0x025f:
            X.3P1 r6 = r4.A0u
            X.2oB r5 = r6.A03
            r3 = 0
            int r0 = r0.ordinal()
            r2 = 3
            r1 = 1
            if (r0 != r1) goto L_0x0276
            int r0 = r5.ordinal()
            if (r0 == r3) goto L_0x0275
            r2 = 4
            if (r0 != r1) goto L_0x0276
        L_0x0275:
            r2 = 2
        L_0x0276:
            X.1Xt r0 = r6.A04
            X.3Ao r0 = r0.A00
            if (r0 == 0) goto L_0x027e
            r0.A00 = r2
        L_0x027e:
            android.content.Intent r1 = r11.A01
            r0 = 35
            r4.startActivityForResult(r1, r0)
            return
        L_0x0286:
            X.2oA r0 = X.C51652oA.SHARE_TO_THIRD_PARTY
            goto L_0x025f
        L_0x0289:
            int r5 = r11.A00
            goto L_0x028d
        L_0x028c:
            r5 = 0
        L_0x028d:
            r1 = 5
            if (r5 == 0) goto L_0x0295
            r0 = 1
            r1 = 3
            if (r5 == r0) goto L_0x0295
            r1 = 2
        L_0x0295:
            X.1Xt r0 = r4.A10
            X.3Ao r0 = r0.A00
            if (r0 == 0) goto L_0x029d
            r0.A01 = r1
        L_0x029d:
            r3 = 1
            X.17Y r2 = r4.A0D
        L_0x02a0:
            if (r5 == r3) goto L_0x02af
            r1 = 2
            r0 = 2131894366(0x7f12205e, float:1.9423535E38)
            if (r5 == r1) goto L_0x02b2
            r0 = 2131894364(0x7f12205c, float:1.942353E38)
            r2.A06(r0, r3)
            return
        L_0x02af:
            r0 = 2131894365(0x7f12205d, float:1.9423533E38)
        L_0x02b2:
            r2.A04(r0, r3)
            return
        L_0x02b6:
            java.lang.Object r0 = r10.A00
            X.C36411kG.A1N(r0)
            return
        L_0x02bc:
            java.lang.Object r0 = r10.A00
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r0 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r0
            java.lang.String r11 = (java.lang.String) r11
            r0.A0B = r11
            return
        L_0x02c5:
            java.lang.Object r2 = r10.A00
            com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity r2 = (com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity) r2
            int r1 = X.AnonymousClass000.A0I(r11)
            r0 = 1
            if (r1 == r0) goto L_0x02d4
            r0 = 2
            if (r1 == r0) goto L_0x02da
            return
        L_0x02d4:
            r0 = 2131896137(0x7f122749, float:1.9427127E38)
            r2.Bu1(r0)
        L_0x02da:
            X.3T0 r1 = r2.A06
            boolean r0 = r1 instanceof X.C47232e6
            if (r0 == 0) goto L_0x02e8
            X.2e6 r1 = (X.C47232e6) r1
            X.00s r1 = r1.A00
            r0 = 0
            X.C36341k9.A16(r1, r0)
        L_0x02e8:
            X.C36331k8.A0m(r2)
            return
        L_0x02ec:
            java.lang.Object r2 = r10.A00
            com.whatsapp.settings.SettingsUserProxyActivity r2 = (com.whatsapp.settings.SettingsUserProxyActivity) r2
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r0 == 0) goto L_0x0372
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r2.A09
            boolean r0 = r0.A0W()
            if (r0 == 0) goto L_0x035f
            com.whatsapp.WaTextView r1 = r2.A07
            r0 = 2131893279(0x7f121c1f, float:1.942133E38)
            r1.setText(r0)
            androidx.appcompat.widget.SwitchCompat r1 = r2.A05
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.WaTextView r0 = r2.A06
            X.C36391kE.A1K(r0)
        L_0x0315:
            r2.invalidateOptionsMenu()
            com.whatsapp.settings.SettingsUserProxyViewModel r4 = r2.A09
            boolean r0 = r4.A0W()
            if (r0 == 0) goto L_0x035d
            androidx.appcompat.widget.SwitchCompat r0 = r2.A05
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L_0x0332
            androidx.appcompat.widget.SwitchCompat r0 = r2.A05
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x035d
        L_0x0332:
            r1 = 1
        L_0x0333:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0344
            boolean r0 = r4.A0W()
            if (r0 != 0) goto L_0x0344
            X.1BX r0 = r4.A0D
            r0.A05(r3)
        L_0x0344:
            boolean r0 = r4.A0W()
            if (r0 == 0) goto L_0x034f
            X.1BX r0 = r4.A0D
            r0.A05(r1)
        L_0x034f:
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r2.A09
            X.1VS r0 = r0.A0E
            X.1BX r0 = r0.A00
            boolean r0 = r0.A06()
            com.whatsapp.settings.SettingsUserProxyActivity.A07(r2, r0)
            return
        L_0x035d:
            r1 = 0
            goto L_0x0333
        L_0x035f:
            androidx.appcompat.widget.SwitchCompat r0 = r2.A05
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r1 = r2.A07
            r0 = 2131893278(0x7f121c1e, float:1.9421328E38)
            r1.setText(r0)
            androidx.appcompat.widget.SwitchCompat r0 = r2.A05
            r0.setChecked(r3)
            goto L_0x0315
        L_0x0372:
            androidx.appcompat.widget.SwitchCompat r0 = r2.A05
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r2.A07
            r0.setText(r11)
            goto L_0x0315
        L_0x037d:
            java.lang.Object r1 = r10.A00
            com.whatsapp.settings.SettingsUserProxyActivity r1 = (com.whatsapp.settings.SettingsUserProxyActivity) r1
            boolean r0 = X.AnonymousClass000.A1X(r11)
            com.whatsapp.settings.SettingsUserProxyActivity.A07(r1, r0)
            return
        L_0x0389:
            java.lang.Object r0 = r10.A00
            X.01I r0 = (X.AnonymousClass01I) r0
            X.01z r1 = r0.getSupportFragmentManager()
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentErrorDialogFragment r0 = new com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentErrorDialogFragment
            r0.<init>()
            X.C65443Sb.A01(r0, r1)
            return
        L_0x039a:
            java.lang.Object r0 = r10.A00
            X.01I r0 = (X.AnonymousClass01I) r0
            com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet r2 = new com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet
            r2.<init>()
            X.01z r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "SettingsPrivacyFLMConsentBottomSheet"
            r2.A1f(r1, r0)
            return
        L_0x03ad:
            java.lang.Object r0 = r10.A00
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            androidx.appcompat.widget.SwitchCompat r1 = r0.A0R
            boolean r0 = r11.booleanValue()
            r1.setChecked(r0)
            return
        L_0x03bd:
            java.lang.Object r1 = r10.A00
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r1 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r1
            java.lang.String r0 = "SettingsPasskeys/revokePasskey/cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00T r0 = r1.A01
            X.3Ec r2 = X.C36381kD.A0g(r0)
            r1 = 0
            r0 = 13
            r2.A00(r0, r1)
            return
        L_0x03d3:
            java.lang.Object r3 = r10.A00
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r3 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r3
            java.lang.String r0 = "SettingsPasskeys/revokePasskey/accept"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00T r0 = r3.A01
            X.3Ec r1 = X.C36381kD.A0g(r0)
            r2 = 0
            r0 = 14
            r1.A00(r0, r2)
            androidx.lifecycle.LifecycleCoroutineScopeImpl r1 = X.C33311f5.A00(r3)
            com.whatsapp.settings.SettingsPasskeysEnabledFragment$showRevokeDialog$2$1 r0 = new com.whatsapp.settings.SettingsPasskeysEnabledFragment$showRevokeDialog$2$1
            r0.<init>(r3, r2)
            X.C36331k8.A1T(r0, r1)
            return
        L_0x03f5:
            java.lang.Object r1 = r10.A00
            com.whatsapp.settings.SettingsDataUsageActivity r1 = (com.whatsapp.settings.SettingsDataUsageActivity) r1
            int r0 = X.AnonymousClass000.A0I(r11)
            com.whatsapp.settings.SettingsDataUsageActivity.A0G(r1, r0)
            return
        L_0x0401:
            java.lang.Object r4 = r10.A00
            com.whatsapp.search.SearchFragment r4 = (com.whatsapp.search.SearchFragment) r4
            X.3T1 r11 = (X.AnonymousClass3T1) r11
            X.3Qa r0 = r11.A1J
            X.11F r1 = r0.A00
            com.whatsapp.search.SearchFragment.A06(r1, r4)
            com.whatsapp.search.SearchFragment.A08(r4)
            X.005 r0 = r4.A1t
            X.1V7 r0 = X.C36431kI.A0o(r0)
            r0.A02(r1)
            X.190 r3 = X.C36441kJ.A0j()
            android.content.Context r1 = r4.A0a()
            com.whatsapp.search.SearchViewModel r0 = r4.A1d
            java.lang.String r2 = r0.A0b()
            android.content.Intent r1 = r3.A1c(r1, r11)
            java.lang.String r0 = "query"
            android.content.Intent r0 = r1.putExtra(r0, r2)
            X.AnonymousClass3LQ.A00(r0, r4)
            return
        L_0x0436:
            java.lang.Object r3 = r10.A00
            com.whatsapp.settings.SettingsPrivacy r3 = (com.whatsapp.settings.SettingsPrivacy) r3
            int r2 = X.AnonymousClass000.A0I(r11)
            r1 = 0
            r0 = 1
            java.lang.String r1 = X.AnonymousClass3TD.A01(r3, r2, r1, r0)
            android.widget.TextView r0 = r3.A0H
        L_0x0446:
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65963Ud.BTH(java.lang.Object):void");
    }
}
