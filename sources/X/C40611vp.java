package X;

/* renamed from: X.1vp  reason: invalid class name and case insensitive filesystem */
public class C40611vp implements AnonymousClass00P, C006302t {
    public Object A00;
    public final int A01;

    public C40611vp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        r1.runOnUiThread(X.C80313vC.A00(r1, r7, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f1, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r0.A0C(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e8, code lost:
        if (r2 != null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r1.A0D(r4.A06) == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x00dd;
                case 2: goto L_0x00dd;
                case 3: goto L_0x0050;
                case 4: goto L_0x0005;
                case 5: goto L_0x00ec;
                case 6: goto L_0x0005;
                case 7: goto L_0x00f2;
                case 8: goto L_0x0057;
                case 9: goto L_0x012b;
                case 10: goto L_0x009f;
                case 11: goto L_0x00b0;
                case 12: goto L_0x00c7;
                case 13: goto L_0x00ce;
                case 14: goto L_0x013a;
                case 15: goto L_0x0188;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r6.A00
            X.1ub r2 = (X.C40021ub) r2
            X.1LV r1 = r2.A03
            r0 = 1
            r1.A08(r0)
            X.1Rs r0 = r2.A0N
        L_0x0011:
            r0.A0C(r7)
        L_0x0014:
            r4 = 0
            return r4
        L_0x0016:
            java.lang.Object r3 = r6.A00
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            X.3H3 r4 = r3.A0T
            X.00T r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            r2 = 1
            if (r0 == 0) goto L_0x004e
            X.17X r1 = r4.A04
            boolean r0 = r1.A0C(r0)
            if (r0 != r2) goto L_0x004e
            X.147 r0 = r4.A06
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x004e
        L_0x0037:
            if (r2 == 0) goto L_0x0046
            X.3H3 r2 = r3.A0T
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.0wU r1 = r2.A07
            r0 = 27
            X.C80263v7.A00(r1, r2, r7, r0)
        L_0x0046:
            X.0wU r1 = r3.A04
            r0 = 47
            X.C36411kG.A1M(r1, r3, r7, r0)
            goto L_0x0014
        L_0x004e:
            r2 = 0
            goto L_0x0037
        L_0x0050:
            java.lang.Object r0 = r6.A00
            X.1uf r0 = (X.C40051uf) r0
            X.1Rs r0 = r0.A0u
            goto L_0x0011
        L_0x0057:
            java.lang.Object r5 = r6.A00
            X.1uh r5 = (X.C40061uh) r5
            X.11F r7 = (X.AnonymousClass11F) r7
            X.11F r0 = r5.A0t
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r7 instanceof X.C223313w
            if (r0 == 0) goto L_0x0014
            X.3Mv r4 = X.C64153Mv.A01
            r3 = 0
            X.AnonymousClass00C.A0D(r7, r3)
            java.util.Set r2 = X.C64153Mv.A03
            boolean r0 = r2.contains(r7)
            if (r0 != 0) goto L_0x0014
            X.18x r0 = r5.A0r
            X.8n1 r1 = r0.A03(r7)
            if (r1 == 0) goto L_0x0014
            X.1Rs r0 = r5.A17
            X.C36331k8.A13(r0)
            X.0xM r0 = r5.A0k
            r0.A0h(r1)
            r2.add(r7)
            java.util.Set r0 = X.C64153Mv.A04
            r0.remove(r7)
            X.02t r1 = r5.A1G
            X.AnonymousClass00C.A0D(r1, r3)
            monitor-enter(r4)
            java.util.List r0 = X.C64153Mv.A02     // Catch:{ all -> 0x0256 }
            r0.remove(r1)     // Catch:{ all -> 0x0256 }
            monitor-exit(r4)
            goto L_0x0014
        L_0x009f:
            java.lang.Object r1 = r6.A00
            com.whatsapp.group.newgroup.NewGroup r1 = (com.whatsapp.group.newgroup.NewGroup) r1
            java.util.List r0 = r1.A0h
            r0.remove(r7)
            com.whatsapp.group.newgroup.NewGroup.A0I(r1)
            com.whatsapp.group.newgroup.NewGroup.A0H(r1)
            goto L_0x0014
        L_0x00b0:
            java.lang.Object r2 = r6.A00
            com.whatsapp.mentions.MentionableEntry r2 = (com.whatsapp.mentions.MentionableEntry) r2
            X.141 r7 = (X.AnonymousClass141) r7
            X.1Sj r1 = r2.A0F
            X.11F r0 = r2.A09
            X.147 r0 = X.C65533Sl.A01(r0)
            X.34G r0 = r1.A00(r7, r0)
            r2.A0H(r0, r7)
            goto L_0x0014
        L_0x00c7:
            java.lang.Object r1 = r6.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 24
            goto L_0x00d4
        L_0x00ce:
            java.lang.Object r1 = r6.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 25
        L_0x00d4:
            X.3vC r0 = X.C80313vC.A00(r1, r7, r0)
            r1.runOnUiThread(r0)
            goto L_0x0014
        L_0x00dd:
            java.lang.Object r0 = r6.A00
            X.1uf r0 = (X.C40051uf) r0
            X.3QK r7 = (X.AnonymousClass3QK) r7
            X.12q r1 = r0.A0U
            com.whatsapp.jid.GroupJid r0 = r7.A02
            boolean r0 = r1.A0O(r0)
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x00f2:
            java.lang.Object r3 = r6.A00
            X.1ub r3 = (X.C40021ub) r3
            X.3T1 r7 = (X.AnonymousClass3T1) r7
            r4 = 0
            if (r7 != 0) goto L_0x0102
            java.lang.String r1 = "CommunityTabViewModel/onActivityRowTapped from a null message"
        L_0x00fd:
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            return r4
        L_0x0102:
            X.3Qa r0 = r7.A1J
            X.11F r0 = r0.A00
            com.whatsapp.jid.GroupJid r2 = X.C36441kJ.A0l(r0)
            if (r2 != 0) goto L_0x010f
            java.lang.String r1 = "CommunityTabViewModel/null parent for activity row"
            goto L_0x00fd
        L_0x010f:
            boolean r0 = X.C66013Ui.A0o(r7)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r2 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x011f
            X.1Rs r0 = r3.A0O
            r0.A0D(r2)
            return r4
        L_0x011f:
            X.1LV r1 = r3.A03
            r0 = 1
            r1.A08(r0)
            X.1Rs r0 = r3.A0N
            r0.A0C(r2)
            return r4
        L_0x012b:
            java.lang.Object r2 = r6.A00
            com.whatsapp.gallery.GalleryFragmentBase r2 = (com.whatsapp.gallery.GalleryFragmentBase) r2
            X.0Bk r7 = (X.C02680Bk) r7
            X.11F r1 = r2.A0D
            X.1S3 r0 = r2.A0E
            android.database.Cursor r4 = r2.A1Z(r7, r1, r0)
            return r4
        L_0x013a:
            java.lang.Object r3 = r6.A00
            com.whatsapp.settings.Settings r3 = (com.whatsapp.settings.Settings) r3
            java.lang.String r7 = (java.lang.String) r7
            X.2Ot r1 = new X.2Ot
            r1.<init>()
            r1.A01 = r7
            X.3PI r0 = r3.A0n
            int r0 = r0.A01(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.0yW r0 = r3.A0d
            r0.Blv(r1)
            r3.A14 = r7
            java.lang.String r0 = "app_language"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017b
            r1 = 1
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r3.A0u
            if (r0 == 0) goto L_0x0178
            com.whatsapp.wds.components.search.WDSSearchView r0 = r0.A07
            int r0 = r0.getVisibility()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 == 0) goto L_0x0178
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r3.A0u
            r0.A02(r1)
        L_0x0178:
            com.whatsapp.settings.Settings.A0F(r3)
        L_0x017b:
            X.3PI r2 = r3.A0n
            android.view.View r1 = r3.A00
            java.lang.String r0 = ""
            r2.A02(r1, r0, r7)
            r4 = 0
            r3.A14 = r4
            return r4
        L_0x0188:
            java.lang.Object r4 = r6.A00
            com.whatsapp.stickers.info.StickerInfoDialogFragment r4 = (com.whatsapp.stickers.info.StickerInfoDialogFragment) r4
            X.2on r7 = (X.C52042on) r7
            X.3QU r1 = r4.A0M
            if (r1 == 0) goto L_0x019c
            int r0 = r7.ordinal()
            switch(r0) {
                case 0: goto L_0x024d;
                case 1: goto L_0x024d;
                case 2: goto L_0x019f;
                case 3: goto L_0x01f8;
                case 4: goto L_0x0212;
                case 5: goto L_0x021a;
                case 6: goto L_0x021a;
                case 7: goto L_0x01fe;
                case 8: goto L_0x023a;
                case 9: goto L_0x0199;
                case 10: goto L_0x0223;
                default: goto L_0x0199;
            }
        L_0x0199:
            r4.A1b()
        L_0x019c:
            X.0AJ r4 = X.AnonymousClass0AJ.A00
            return r4
        L_0x019f:
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x01c6
            X.01I r0 = r4.A0i()
            boolean r0 = r0 instanceof X.AnonymousClass4V7
            if (r0 == 0) goto L_0x01c1
            boolean r0 = X.AnonymousClass3H7.A00(r4)
            if (r0 != 0) goto L_0x01c1
            X.1YD r2 = r4.A0N
            X.3QU r0 = r4.A0M
            java.lang.String r1 = r0.A00
            r0 = 39
            r2.A03(r1, r0)
            goto L_0x0199
        L_0x01c1:
            X.3QU r0 = r4.A0M
            java.lang.String r2 = r0.A00
            goto L_0x01ea
        L_0x01c6:
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x01e2
            X.1Dv r2 = r4.A05     // Catch:{ ActivityNotFoundException -> 0x01dc }
            android.content.Context r1 = r4.A0a()     // Catch:{ ActivityNotFoundException -> 0x01dc }
            X.3QU r0 = r4.A0M     // Catch:{ ActivityNotFoundException -> 0x01dc }
            java.lang.String r0 = r0.A03     // Catch:{ ActivityNotFoundException -> 0x01dc }
            android.content.Intent r0 = X.C36331k8.A04(r0)     // Catch:{ ActivityNotFoundException -> 0x01dc }
            r2.A06(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x01dc }
            goto L_0x0199
        L_0x01dc:
            java.lang.String r0 = "StickerInfoDialogFragment/onClickListener failed to open play store link"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0199
        L_0x01e2:
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0199
            java.lang.String r2 = r1.A00
            if (r2 == 0) goto L_0x0199
        L_0x01ea:
            android.content.Context r1 = r4.A0a()
            java.lang.String r0 = "info_dialog"
            android.content.Intent r0 = X.AnonymousClass190.A1D(r1, r2, r0)
            r4.A1C(r0)
            goto L_0x0199
        L_0x01f8:
            X.1YD r0 = r4.A0N
            r0.A00()
            goto L_0x0199
        L_0x01fe:
            X.6c4 r1 = r4.A0I
            if (r1 == 0) goto L_0x0199
            X.11F r0 = r4.A0B
            if (r0 == 0) goto L_0x0199
            java.lang.String r2 = r1.A0A
            if (r2 == 0) goto L_0x0199
            X.0wU r1 = r4.A0R
            r0 = 27
            X.C36421kH.A1H(r1, r4, r2, r0)
            goto L_0x0199
        L_0x0212:
            java.lang.String r1 = r1.A01
            X.1YD r0 = r4.A0N
            r0.A01(r1)
            goto L_0x0199
        L_0x021a:
            boolean r1 = r1.A0C
            r0 = 39
            com.whatsapp.stickers.info.StickerInfoDialogFragment.A06(r4, r0, r1)
            goto L_0x0199
        L_0x0223:
            android.content.Context r2 = r4.A0a()
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.avatar.privacy.AvatarStickerPrivacySettings"
            android.content.Intent r1 = r1.setClassName(r2, r0)
            android.content.Context r0 = r4.A0a()
            r0.startActivity(r1)
            goto L_0x0199
        L_0x023a:
            X.11F r0 = r4.A0B
            if (r0 == 0) goto L_0x0199
            X.3Oc r3 = r4.A0H
            X.01I r2 = r4.A0i()
            X.11F r1 = r4.A0B
            r0 = 43
            r3.A01(r2, r1, r0)
            goto L_0x0199
        L_0x024d:
            X.6c4 r0 = r4.A0I
            if (r0 == 0) goto L_0x0199
            com.whatsapp.stickers.info.StickerInfoDialogFragment.A05(r0, r1, r4)
            goto L_0x0199
        L_0x0256:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40611vp.invoke(java.lang.Object):java.lang.Object");
    }
}
