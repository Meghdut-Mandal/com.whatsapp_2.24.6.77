package X;

/* renamed from: X.4a9  reason: invalid class name and case insensitive filesystem */
public class C90434a9 implements AnonymousClass4TM {
    public Object A00;
    public final int A01;

    public C90434a9(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.39I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.whatsapp.newsletter.NewsletterInfoActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r3 = new X.C1497272n(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011c, code lost:
        r3 = new X.C1502074j(r2, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0121, code lost:
        r4.A0H(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0124, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bbg(X.C28981Uw r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x004e;
                case 2: goto L_0x005d;
                case 3: goto L_0x006b;
                case 4: goto L_0x0087;
                case 5: goto L_0x00be;
                case 6: goto L_0x00ed;
                case 7: goto L_0x012c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A00
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity r2 = (com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity) r2
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity.A01(r2, r0, r1)
            return
        L_0x0012:
            java.lang.Object r2 = r5.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = (com.whatsapp.newsletter.NewsletterInfoActivity) r2
            X.0v5 r0 = r2.A0A
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0030
            X.0v5 r0 = r2.A0A
            if (r0 == 0) goto L_0x0029
            java.lang.NullPointerException r0 = A00(r0)
            throw r0
        L_0x0029:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0030:
            X.2EJ r0 = r2.A0j
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "newsletterInfoViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x003b:
            X.2nb r1 = X.C51302nb.Verify
            X.00s r0 = r0.A07
            r0.A0C(r1)
            X.17Y r4 = r2.A05
            r0 = 47
            goto L_0x0056
        L_0x0047:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x004e:
            java.lang.Object r2 = r5.A00
            X.14u r2 = (X.C225314u) r2
            X.17Y r4 = r2.A05
            r0 = 48
        L_0x0056:
            X.72n r3 = new X.72n
            r3.<init>(r2, r0)
            goto L_0x0121
        L_0x005d:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.lang.Object r2 = r5.A00
            X.39I r2 = (X.AnonymousClass39I) r2
            X.17Y r4 = r2.A00
            r0 = 33
            goto L_0x011c
        L_0x006b:
            java.lang.Object r2 = r5.A00
            com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity r2 = (com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity) r2
            X.17Y r1 = r2.A05
            r0 = 22
            X.C81123wV.A00(r1, r2, r0)
            X.190 r0 = r2.A01
            if (r0 == 0) goto L_0x0082
            android.content.Intent r0 = X.AnonymousClass190.A06(r2)
            r2.startActivity(r0)
            return
        L_0x0082:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0087:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.lang.Object r2 = r5.A00
            com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity r2 = (com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity) r2
            X.0v5 r0 = r2.A00
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x00a9
            X.0v5 r0 = r2.A00
            if (r0 == 0) goto L_0x00a2
            java.lang.NullPointerException r0 = A00(r0)
            throw r0
        L_0x00a2:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NewsletterCreateMVActivity Channel created: "
            X.C36321k7.A1K(r6, r0, r1)
            X.17Y r4 = r2.A05
            r0 = 47
            goto L_0x011c
        L_0x00b7:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00be:
            java.lang.Object r1 = r5.A00
            com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity r1 = (com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity) r1
            X.0v5 r0 = r1.A00
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x00dc
            X.0v5 r0 = r1.A00
            if (r0 == 0) goto L_0x00d5
            java.lang.NullPointerException r0 = A00(r0)
            throw r0
        L_0x00d5:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00dc:
            X.17Y r4 = r1.A05
            r0 = 28
            X.3wV r3 = new X.3wV
            r3.<init>((java.lang.Object) r1, (int) r0)
            goto L_0x0121
        L_0x00e6:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ed:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.lang.Object r2 = r5.A00
            com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity r2 = (com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity) r2
            X.0v5 r0 = r2.A00
            if (r0 == 0) goto L_0x0125
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x010f
            X.0v5 r0 = r2.A00
            if (r0 == 0) goto L_0x0108
            java.lang.NullPointerException r0 = A00(r0)
            throw r0
        L_0x0108:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x010f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NewsletterUpgradeToMVActivity Channel upgraded to Meta Verified: "
            X.C36321k7.A1K(r6, r0, r1)
            X.17Y r4 = r2.A05
            r0 = 48
        L_0x011c:
            X.74j r3 = new X.74j
            r3.<init>(r2, r6, r0)
        L_0x0121:
            r4.A0H(r3)
            return
        L_0x0125:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x012c:
            java.lang.Object r1 = r5.A00
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity r1 = (com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity) r1
            r0 = 1
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity.A07(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90434a9.Bbg(X.1Uw):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: com.whatsapp.newsletter.NewsletterInfoActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r2 = new X.C1497272n(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00df, code lost:
        r2 = new X.C81123wV((java.lang.Object) r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e4, code lost:
        r3.A0H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0040;
                case 2: goto L_0x0011;
                case 3: goto L_0x0053;
                case 4: goto L_0x005d;
                case 5: goto L_0x008b;
                case 6: goto L_0x00b9;
                case 7: goto L_0x00ef;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A00
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity r2 = (com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity) r2
            java.lang.Boolean r1 = X.C36381kD.A0j()
            r0 = 1
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity.A01(r2, r1, r0)
        L_0x0011:
            return
        L_0x0012:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r1 = r4.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            X.0v5 r0 = r1.A0A
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0034
            X.0v5 r0 = r1.A0A
            if (r0 == 0) goto L_0x002d
            java.lang.NullPointerException r0 = A00(r0)
            throw r0
        L_0x002d:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0034:
            X.17Y r3 = r1.A05
            r0 = 46
            goto L_0x004c
        L_0x0039:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0040:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r1 = r4.A00
            X.14u r1 = (X.C225314u) r1
            X.17Y r3 = r1.A05
            r0 = 49
        L_0x004c:
            X.72n r2 = new X.72n
            r2.<init>(r1, r0)
            goto L_0x00e4
        L_0x0053:
            java.lang.Object r1 = r4.A00
            X.14u r1 = (X.C225314u) r1
            X.17Y r3 = r1.A05
            r0 = 23
            goto L_0x00df
        L_0x005d:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r1 = r4.A00
            com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity r1 = (com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity) r1
            X.0v5 r0 = r1.A00
            if (r0 == 0) goto L_0x0084
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x007f
            X.0v5 r0 = r1.A00
            if (r0 == 0) goto L_0x0078
            java.lang.NullPointerException r0 = A00(r0)
            throw r0
        L_0x0078:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x007f:
            X.17Y r3 = r1.A05
            r0 = 26
            goto L_0x00df
        L_0x0084:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x008b:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r1 = r4.A00
            com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity r1 = (com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity) r1
            X.0v5 r0 = r1.A00
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x00ad
            X.0v5 r0 = r1.A00
            if (r0 == 0) goto L_0x00a6
            java.lang.NullPointerException r0 = A00(r0)
            throw r0
        L_0x00a6:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ad:
            X.17Y r3 = r1.A05
            r0 = 27
            goto L_0x00df
        L_0x00b2:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00b9:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.Object r1 = r4.A00
            com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity r1 = (com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity) r1
            X.0v5 r0 = r1.A00
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x00db
            X.0v5 r0 = r1.A00
            if (r0 == 0) goto L_0x00d4
            java.lang.NullPointerException r0 = A00(r0)
            throw r0
        L_0x00d4:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00db:
            X.17Y r3 = r1.A05
            r0 = 29
        L_0x00df:
            X.3wV r2 = new X.3wV
            r2.<init>((java.lang.Object) r1, (int) r0)
        L_0x00e4:
            r3.A0H(r2)
            return
        L_0x00e8:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ef:
            java.lang.Object r1 = r4.A00
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity r1 = (com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity) r1
            r0 = 0
            com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity.A07(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90434a9.onError(java.lang.Throwable):void");
    }

    public static NullPointerException A00(C19460v5 r1) {
        r1.A02();
        return new NullPointerException("logMetaVerifiedChannelAction");
    }
}
