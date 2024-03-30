package X;

/* renamed from: X.3Ua  reason: invalid class name and case insensitive filesystem */
public class C65933Ua implements AnonymousClass04S {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        if (r0.A00.A0E(7245) == false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r13) {
        /*
            r12 = this;
            r9 = r13
            int r0 = r12.A03
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x00c4;
                case 2: goto L_0x007f;
                case 3: goto L_0x00e4;
                default: goto L_0x0006;
            }
        L_0x0006:
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x0018
            java.lang.Object r0 = r12.A00
            X.08V r0 = (X.AnonymousClass08V) r0
            java.lang.Object r0 = r0.apply(r13)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0022
        L_0x0018:
            r0 = 1
            r12.A02 = r0
            java.lang.Object r0 = r12.A01
            X.00r r0 = (X.C001600r) r0
            r0.A0D(r13)
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r7 = r12.A00
            com.whatsapp.community.CommunityMembersActivity r7 = (com.whatsapp.community.CommunityMembersActivity) r7
            java.lang.Object r8 = r12.A01
            X.1wY r8 = (X.C41061wY) r8
            boolean r11 = r12.A02
            java.util.List r9 = (java.util.List) r9
            java.lang.String r0 = "load_community_member"
            r7.A2S(r0)
            java.util.List r1 = r8.A0B
            int r0 = r1.size()
            r4 = 0
            if (r0 == 0) goto L_0x004e
            int r1 = r1.size()
            r0 = 1
            if (r1 != r0) goto L_0x014e
            long r5 = r8.A0E(r4)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x014e
        L_0x004e:
            java.lang.String r2 = "render_community_member"
            r7.A2T(r2)
            if (r11 == 0) goto L_0x0077
            r8.A0L(r9)
        L_0x0058:
            r7.A2S(r2)
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0022
            X.174 r3 = r7.A00
            int r0 = r9.size()
            java.lang.String r2 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "member_count"
            X.0zf r0 = r3.A01
            r0.A0A(r1, r2, r4)
            r0 = 2
            r7.BPG(r0)
            return
        L_0x0077:
            X.0wU r1 = r7.A04
            r0 = 49
            X.C36411kG.A1M(r1, r8, r9, r0)
            goto L_0x0058
        L_0x007f:
            java.lang.Object r4 = r12.A00
            com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment r4 = (com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment) r4
            java.lang.Object r2 = r12.A01
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            boolean r1 = r12.A02
            boolean r0 = r4.A12()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto L_0x00a6
            if (r1 == 0) goto L_0x00a6
            X.1GQ r0 = r4.A01
            if (r0 == 0) goto L_0x0165
            X.0yC r1 = r0.A00
            r0 = 7245(0x1c4d, float:1.0152E-41)
            boolean r0 = r1.A0E(r0)
            r3 = 1
            if (r0 != 0) goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            X.00T r0 = r4.A02
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            if (r2 == 0) goto L_0x00c0
            X.01I r1 = r4.A0h()
            boolean r0 = r1 instanceof X.AnonymousClass4RI
            if (r0 == 0) goto L_0x00c0
            X.4RI r1 = (X.AnonymousClass4RI) r1
            if (r1 == 0) goto L_0x00c0
            r1.BVv(r2, r3)
        L_0x00c0:
            r4.A1b()
            return
        L_0x00c4:
            java.lang.Object r5 = r12.A00
            X.3FP r5 = (X.AnonymousClass3FP) r5
            java.lang.Object r4 = r12.A01
            android.view.View r4 = (android.view.View) r4
            boolean r3 = r12.A02
            boolean r1 = X.AnonymousClass000.A1X(r13)
            r2 = 0
            int r0 = X.C36351kA.A00(r1)
            r4.setVisibility(r0)
            android.view.ViewGroup r0 = r5.A03
            if (r3 == 0) goto L_0x00e1
            if (r1 != 0) goto L_0x00e1
            goto L_0x0137
        L_0x00e1:
            r2 = 8
            goto L_0x0137
        L_0x00e4:
            java.lang.Object r4 = r12.A00
            com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r4 = (com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity) r4
            boolean r7 = r12.A02
            java.lang.Object r5 = r12.A01
            android.view.View r5 = (android.view.View) r5
            X.35a r9 = (X.C597235a) r9
            int r6 = r9.A00
            r3 = 1
            r1 = 0
            r2 = 8
            r0 = 2
            if (r6 != r0) goto L_0x0126
            X.35Z r0 = r9.A01
            X.C18740tg.A06(r0)
            if (r7 == 0) goto L_0x0123
            java.util.List r0 = r0.A01
        L_0x0102:
            r4.A07 = r0
            android.view.View r0 = r4.A01
            r0.setVisibility(r2)
            android.view.View r0 = r4.A00
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            r0.setVisibility(r1)
            r5.setEnabled(r1)
            X.00I r2 = r4.A02
            if (r2 != 0) goto L_0x011b
            r3 = 0
        L_0x011b:
            X.7zg r1 = r4.A06
            java.util.List r0 = r4.A07
            r1.A0L(r2, r0, r3)
            return
        L_0x0123:
            java.util.List r0 = r0.A00
            goto L_0x0102
        L_0x0126:
            if (r6 != r3) goto L_0x013b
            r5.setEnabled(r1)
            android.view.View r0 = r4.A01
            r0.setVisibility(r1)
            android.view.View r0 = r4.A00
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
        L_0x0137:
            r0.setVisibility(r2)
            return
        L_0x013b:
            android.view.View r0 = r4.A01
            r0.setVisibility(r2)
            android.view.View r0 = r4.A00
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            r0.setVisibility(r2)
            r5.setEnabled(r3)
            return
        L_0x014e:
            X.17Y r1 = r7.A05
            java.lang.Runnable r0 = r7.A0K
            r1.A0G(r0)
            r10 = 6
            X.755 r6 = new X.755
            r6.<init>(r7, r8, r9, r10, r11)
            r7.A0K = r6
            X.17Y r2 = r7.A05
            r0 = 500(0x1f4, double:2.47E-321)
            r2.A0I(r6, r0)
            return
        L_0x0165:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65933Ua.BTH(java.lang.Object):void");
    }

    public C65933Ua(Object obj, Object obj2, int i, boolean z) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = z;
        this.A01 = obj;
    }

    public C65933Ua(AnonymousClass08V r2, AnonymousClass08S r3) {
        this.A03 = 4;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = false;
    }
}
