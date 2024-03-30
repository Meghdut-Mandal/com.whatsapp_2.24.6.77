package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.4Kb  reason: invalid class name and case insensitive filesystem */
public final class C86214Kb extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86214Kb(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r2 = r17
            X.3KP r2 = (X.AnonymousClass3KP) r2
            if (r2 == 0) goto L_0x015e
            r0 = r16
            com.whatsapp.newsletter.NewsletterInfoActivity r4 = r0.this$0
            r3 = 0
            r4.A2C(r3)
            X.141 r0 = r2.A02
            r4.A0Y = r0
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0Q
            java.lang.String r7 = "rootLayout"
            if (r0 != 0) goto L_0x001d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x001d:
            java.lang.String r5 = r2.A04
            r0.setTitleText(r5)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r1 = r4.A0Q
            if (r1 != 0) goto L_0x002b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x002b:
            boolean r0 = r2.A07
            r1.setTitleVerified(r0)
            X.3QQ r8 = r4.A0P
            if (r8 != 0) goto L_0x008b
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0Q
            if (r0 != 0) goto L_0x003d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x003d:
            android.view.View r1 = r0.A0E
            r0 = 2131431952(0x7f0b1210, float:1.8485648E38)
            android.view.ViewStub r0 = X.C36431kI.A0M(r1, r0)
            if (r0 == 0) goto L_0x00c2
            android.view.View r10 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard"
            X.AnonymousClass00C.A0E(r10, r0)
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r10 = (com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard) r10
            if (r10 == 0) goto L_0x00c2
            r10.setVisibility(r3)
            X.2yc r1 = r4.A0F
            if (r1 == 0) goto L_0x0096
            X.2Sj r13 = r4.A0e
            X.1Mz r0 = r1.A00
            X.0tq r0 = r0.A01
            X.17Y r9 = X.C36351kA.A0M(r0)
            X.1Mz r0 = r1.A00
            X.0tq r0 = r0.A01
            X.0yb r11 = X.C36351kA.A0U(r0)
            X.0ts r12 = X.C36341k9.A0T(r0)
            X.0tt r1 = r0.A00
            X.004 r0 = r1.A2y
            java.lang.Object r14 = r0.get()
            X.3hE r14 = (X.C71723hE) r14
            X.004 r0 = r1.A2w
            java.lang.Object r15 = r0.get()
            X.3G3 r15 = (X.AnonymousClass3G3) r15
            X.3QQ r8 = new X.3QQ
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r4.A0P = r8
        L_0x008b:
            X.141 r0 = r4.A0Y
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "contact"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0096:
            java.lang.String r0 = "newsletterDetailsCardControllerFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009d:
            r8.A02(r0)
            X.3QQ r6 = r4.A0P
            if (r6 == 0) goto L_0x00c2
            r1 = 13
            X.3Y4 r0 = new X.3Y4
            r0.<init>(r4, r1)
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r6 = r6.A02
            r6.setFollowUnfollowButton(r0)
            r1 = 7
            X.3Y4 r0 = new X.3Y4
            r0.<init>(r4, r1)
            r6.setForwardClickListener(r0)
            r1 = 4
            X.3Y4 r0 = new X.3Y4
            r0.<init>(r4, r1)
            r6.setShareClickListener(r0)
        L_0x00c2:
            com.whatsapp.newsletter.NewsletterInfoActivity.A15(r4)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0Q
            if (r0 != 0) goto L_0x00ce
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x00ce:
            r0.setPushName(r5)
            X.3QQ r0 = r4.A0P
            if (r0 == 0) goto L_0x00ec
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r5 = r0.A02
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x00ec
            X.2pL r0 = r2.A01
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0120
            r0 = 1
            if (r1 == r0) goto L_0x011c
            r0 = 2
            if (r1 == r0) goto L_0x010b
            r0 = 3
            if (r1 == r0) goto L_0x010b
        L_0x00ec:
            X.2pL r0 = r2.A01
            X.2pL r2 = X.C52382pL.SUBSCRIBED
            if (r0 != r2) goto L_0x00fb
            X.1na r1 = r4.A0l
            if (r1 == 0) goto L_0x00fb
            X.09w r0 = X.C023409w.A00
            r1.A01(r2, r0)
        L_0x00fb:
            X.1na r0 = r4.A0l
            if (r0 == 0) goto L_0x0102
            r0.notifyDataSetChanged()
        L_0x0102:
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r5 = r4.A0Q
            if (r5 != 0) goto L_0x0124
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x010b:
            android.view.View r1 = r5.A00
            if (r1 != 0) goto L_0x0116
            java.lang.String r0 = "followUnfollowButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0116:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00ec
        L_0x011c:
            r5.A05()
            goto L_0x00ec
        L_0x0120:
            r5.A06()
            goto L_0x00ec
        L_0x0124:
            android.view.View r2 = r4.A01
            if (r2 != 0) goto L_0x012f
            java.lang.String r0 = "footerViews"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x012f:
            android.widget.LinearLayout r1 = r4.A06
            if (r1 != 0) goto L_0x013a
            java.lang.String r0 = "footerPadding"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x013a:
            X.1na r0 = r4.A0l
            r5.A0G(r2, r1, r0)
            X.2La r0 = r4.A3t()
            boolean r2 = r0.A0N
            r0 = 2131429491(0x7f0b0873, float:1.8480656E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r1 == 0) goto L_0x0155
            int r0 = X.C36351kA.A00(r2)
            r1.setVisibility(r0)
        L_0x0155:
            com.whatsapp.newsletter.NewsletterInfoActivity.A1B(r4, r3, r3)
            com.whatsapp.newsletter.NewsletterInfoActivity.A14(r4)
            com.whatsapp.newsletter.NewsletterInfoActivity.A16(r4)
        L_0x015e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86214Kb.invoke(java.lang.Object):java.lang.Object");
    }
}
