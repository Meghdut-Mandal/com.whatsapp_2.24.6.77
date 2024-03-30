package X;

import android.widget.FrameLayout;

/* renamed from: X.752  reason: invalid class name */
public class AnonymousClass752 implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public AnonymousClass752(C123865xD r2, C123925xJ r3) {
        this.A03 = 26;
        this.A00 = r3;
        this.A02 = true;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03c2, code lost:
        if (r8 <= r0) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0411, code lost:
        if (r1 == 11) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x049d, code lost:
        if (r17 == false) goto L_0x049f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0543, code lost:
        if (r18 != false) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x08dc, code lost:
        if (r11.contains(java.lang.Long.valueOf(r2.A00.A01)) == false) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0972, code lost:
        if (r1 == false) goto L_0x0974;
     */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x05cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r40 = this;
            r3 = r40
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x0257;
                case 2: goto L_0x0302;
                case 3: goto L_0x0035;
                case 4: goto L_0x0310;
                case 5: goto L_0x0092;
                case 6: goto L_0x032f;
                case 7: goto L_0x00b2;
                case 8: goto L_0x0348;
                case 9: goto L_0x0356;
                case 10: goto L_0x00ce;
                case 11: goto L_0x0364;
                case 12: goto L_0x0384;
                case 13: goto L_0x05ee;
                case 14: goto L_0x0609;
                case 15: goto L_0x064f;
                case 16: goto L_0x00ec;
                case 17: goto L_0x0676;
                case 18: goto L_0x0be5;
                case 19: goto L_0x0107;
                case 20: goto L_0x0bf8;
                case 21: goto L_0x0c06;
                case 22: goto L_0x015e;
                case 23: goto L_0x01a2;
                case 24: goto L_0x01c9;
                case 25: goto L_0x01ee;
                case 26: goto L_0x0c55;
                case 27: goto L_0x020e;
                case 28: goto L_0x0cfe;
                case 29: goto L_0x0d11;
                case 30: goto L_0x0d34;
                case 31: goto L_0x0d62;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r4 = r3.A02
            java.lang.Object r1 = r3.A00
            java.lang.Object r0 = r3.A01
            X.7fl r0 = (X.C158077fl) r0
            X.7ku r2 = r0.B7y()
            if (r4 == 0) goto L_0x0253
            r0 = 0
            X.4vP r1 = X.C142326oh.A03(r1)
            X.68b r0 = X.C1273868b.A01(r0)
            X.C1273868b.A07(r1, r0, r2)
        L_0x0021:
            return
        L_0x0022:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0021
            java.lang.Object r1 = r3.A01
            X.01N r1 = (X.AnonymousClass01N) r1
            java.lang.Object r0 = r3.A00
            X.05R r0 = (X.AnonymousClass05R) r0
            r1.A06(r0)
            r0 = 1
            r3.A02 = r0
            return
        L_0x0035:
            boolean r2 = r3.A02
            java.lang.Object r1 = r3.A01
            X.6NA r1 = (X.AnonymousClass6NA) r1
            X.62U r0 = r1.A03
            if (r2 == 0) goto L_0x006f
            X.6c3 r3 = r1.A04
            X.6Xw r2 = r0.A01
            X.679 r0 = r0.A02
            java.util.List r1 = X.C133326Xw.A04(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0021
            X.6PQ r2 = r2.A03
            java.lang.Object r0 = X.C36391kE.A0t(r1)
            X.682 r0 = (X.AnonymousClass682) r0
            X.6SG r1 = r0.A07
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = X.AnonymousClass6PQ.A00(r1, r2)
            if (r0 != 0) goto L_0x0021
            X.4xG r2 = r2.A00
            int r1 = X.C101264xG.A00(r3, r1)
            java.lang.String r0 = "download_resume"
            r2.A02(r1, r0)
            return
        L_0x006f:
            X.6c3 r4 = r1.A04
            X.6Xw r3 = r0.A01
            X.679 r0 = r0.A02
            java.util.List r1 = X.C133326Xw.A04(r3, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0021
            java.lang.Object r0 = X.C36391kE.A0t(r1)
            X.682 r0 = (X.AnonymousClass682) r0
            X.6SG r0 = r0.A07
            java.util.List r2 = java.util.Collections.singletonList(r0)
            java.lang.Integer r1 = X.C023109s.A0C
            r0 = 1
            X.C133326Xw.A08(r3, r4, r1, r2, r0)
            return
        L_0x0092:
            java.lang.Object r0 = r3.A00
            X.9lS r0 = (X.C202279lS) r0
            java.lang.Object r4 = r3.A01
            X.9N9 r4 = (X.AnonymousClass9N9) r4
            boolean r2 = r3.A02
            java.util.List r0 = r0.A0O
            java.util.Iterator r1 = r0.iterator()
        L_0x00a2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            X.7fZ r0 = (X.AnonymousClass7fZ) r0
            r0.Bdc(r4, r2)
            goto L_0x00a2
        L_0x00b2:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.A02
            java.lang.Object r1 = r3.A01
            X.3Ae r1 = (X.C61003Ae) r1
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0021
            if (r2 != 0) goto L_0x0021
            X.17Y r2 = r1.A03
            r1 = 0
            r0 = 2131897196(0x7f122b6c, float:1.9429275E38)
            r2.A06(r0, r1)
            return
        L_0x00ce:
            java.lang.Object r0 = r3.A00
            X.70z r0 = (X.C1493770z) r0
            java.lang.Object r4 = r3.A01
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            boolean r2 = r3.A02
            X.5Fb r0 = r0.A00
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x00de:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            X.7m5 r0 = X.C90524aI.A0K(r1)
            r0.BSq(r4, r2)
            goto L_0x00de
        L_0x00ec:
            java.lang.Object r0 = r3.A00
            com.whatsapp.community.CommunitySpamReportDialogFragment r0 = (com.whatsapp.community.CommunitySpamReportDialogFragment) r0
            boolean r4 = r3.A02
            java.lang.Object r3 = r3.A01
            X.1uO r3 = (X.C39971uO) r3
            X.17Y r2 = r0.A00
            r0 = 2131888336(0x7f1208d0, float:1.9411304E38)
            r1 = 1
            r2.A06(r0, r1)
            if (r4 == 0) goto L_0x0021
            X.1Rs r0 = r3.A01
            X.C36341k9.A17(r0, r1)
            return
        L_0x0107:
            java.lang.Object r4 = r3.A00
            X.1sS r4 = (X.C39471sS) r4
            java.lang.Object r5 = r3.A01
            X.6tS r5 = (X.C145166tS) r5
            boolean r2 = r3.A02
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0dc3
            if (r5 == 0) goto L_0x0122
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r5.A0Z
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0122
            return
        L_0x0122:
            if (r2 == 0) goto L_0x014a
            if (r5 == 0) goto L_0x0daa
            boolean r0 = r5.A0I()
            if (r0 == 0) goto L_0x0daa
            X.00s r3 = r4.A0G
            java.lang.Object r0 = r3.A04()
            X.3JB r0 = (X.AnonymousClass3JB) r0
            if (r0 == 0) goto L_0x0021
            X.2pW r0 = r0.A01
            int r1 = r0.value
            X.2pW r2 = X.C52492pW.SMALL_THUMBNAIL_LOADED
            int r0 = r2.value
            if (r1 >= r0) goto L_0x0021
            r1 = 0
        L_0x0141:
            X.3JB r0 = new X.3JB
            r0.<init>(r5, r2, r1)
            r3.A0D(r0)
            return
        L_0x014a:
            if (r5 == 0) goto L_0x0021
            boolean r0 = r5.A0I()
            if (r0 == 0) goto L_0x0021
            X.00s r3 = r4.A0G
            X.2pW r2 = X.C52492pW.WEB_PAGE_LOADED
            java.lang.String r1 = r5.A0C()     // Catch:{ MalformedURLException -> 0x015b }
            goto L_0x0141
        L_0x015b:
            java.lang.String r1 = r5.A0Z
            goto L_0x0141
        L_0x015e:
            java.lang.Object r5 = r3.A00
            X.2jf r5 = (X.C49772jf) r5
            java.lang.Object r4 = r3.A01
            java.util.List r4 = (java.util.List) r4
            boolean r2 = r3.A02
            boolean r0 = X.C36431kI.A1Y(r5)
            if (r0 != 0) goto L_0x0021
            X.31p r1 = r5.A05
            int r0 = r5.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = r1.A00
            r1.A01 = r0
            int r0 = r5.A00
            if (r2 == 0) goto L_0x018c
            if (r0 != 0) goto L_0x0184
            r4.size()
        L_0x017f:
            java.util.List r0 = r5.A07
            r0.addAll(r4)
        L_0x0184:
            r1.A1b()
            r0 = 0
            r1.A1h(r0)
            return
        L_0x018c:
            if (r0 != 0) goto L_0x0196
            java.util.List r0 = r5.A07
            r0.size()
            r0.clear()
        L_0x0196:
            r4.size()
            int r0 = r5.A00
            int r0 = X.C90524aI.A04(r4, r0)
            r5.A00 = r0
            goto L_0x017f
        L_0x01a2:
            java.lang.Object r2 = r3.A00
            com.whatsapp.gesture.VerticalSwipeDismissBehavior r2 = (com.whatsapp.gesture.VerticalSwipeDismissBehavior) r2
            X.0Z5 r1 = r2.A04
            if (r1 == 0) goto L_0x01b9
            r0 = 1
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            X.C011504z.A07(r0, r3)
            return
        L_0x01b9:
            X.7lM r2 = r2.A05
            if (r2 == 0) goto L_0x0021
            boolean r1 = r3.A02
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            if (r1 == 0) goto L_0x0dc9
            r2.BVs(r0)
            return
        L_0x01c9:
            java.lang.Object r4 = r3.A00
            X.6Zc r4 = (X.C133586Zc) r4
            boolean r1 = r3.A02
            java.lang.Object r3 = r3.A01
            android.location.Location r3 = (android.location.Location) r3
            X.6c8 r0 = r4.A0W
            if (r0 == 0) goto L_0x01d9
            if (r1 == 0) goto L_0x0021
        L_0x01d9:
            float r0 = r3.getAccuracy()
            int r1 = (int) r0
            r0 = 100
            int r6 = java.lang.Math.max(r1, r0)
            r5 = 0
            r7 = 1
            boolean r0 = r4.A0j
            r8 = r0 ^ 1
            X.C133586Zc.A06(r3, r4, r5, r6, r7, r8)
            return
        L_0x01ee:
            java.lang.Object r4 = r3.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r2 = r3.A01
            X.2bU r2 = (X.AnonymousClass2bU) r2
            boolean r0 = r3.A02
            if (r2 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0021
            X.01I r0 = r4.A0h()
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0021
            r1 = 0
            r0 = 1
            com.whatsapp.mediaview.MediaViewFragment.A0Q(r4, r2, r1, r0)
            return
        L_0x020e:
            java.lang.Object r7 = r3.A00
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r7 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r7
            java.lang.Object r6 = r3.A01
            X.2bZ r6 = (X.AnonymousClass2bZ) r6
            boolean r2 = r3.A02
            X.16S r1 = r7.A06
            com.whatsapp.jid.UserJid r0 = r6.A0L()
            X.8ax r5 = r1.A05(r0)
            if (r2 == 0) goto L_0x0250
            java.lang.String r1 = "active"
        L_0x0226:
            if (r5 == 0) goto L_0x0021
            java.lang.String r0 = r5.A05
            if (r0 == 0) goto L_0x0232
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0021
        L_0x0232:
            r5.A05 = r1
            X.16S r4 = r7.A06
            com.whatsapp.jid.UserJid r3 = r6.A0L()
            boolean r0 = r5.A06
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = r5.A05
            r0 = 0
            r4.A0F(r3, r2, r1, r0)
            X.9UZ r1 = r7.A0V
            X.9uk r0 = r6.A00
            X.9ui r0 = r0.A01
            r1.A01(r0, r6)
            return
        L_0x0250:
            java.lang.String r1 = "inactive"
            goto L_0x0226
        L_0x0253:
            X.AnonymousClass6JI.A01(r2, r1)
            return
        L_0x0257:
            boolean r2 = r3.A02
            java.lang.Object r0 = r3.A01
            X.6VR r0 = (X.AnonymousClass6VR) r0
            X.6im r8 = r0.A03
            java.lang.Object r1 = r3.A00
            X.5hI r1 = (X.C114465hI) r1
            X.69L r0 = r1.A00
            java.lang.String r5 = r0.A01
            if (r2 == 0) goto L_0x0292
            java.lang.Object r4 = r8.A0A
            monitor-enter(r4)
            X.6VD r3 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x028f }
            java.lang.String r2 = X.C138836im.A0C     // Catch:{ all -> 0x028f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x028f }
            java.lang.String r0 = "Processor stopping foreground work "
            r1.append(r0)     // Catch:{ all -> 0x028f }
            X.AnonymousClass6VD.A03(r3, r5, r2, r1)     // Catch:{ all -> 0x028f }
            java.util.Map r0 = r8.A05     // Catch:{ all -> 0x028f }
            java.lang.Object r1 = r0.remove(r5)     // Catch:{ all -> 0x028f }
            X.758 r1 = (X.AnonymousClass758) r1     // Catch:{ all -> 0x028f }
            if (r1 == 0) goto L_0x028d
            java.util.Map r0 = r8.A06     // Catch:{ all -> 0x028f }
            r0.remove(r5)     // Catch:{ all -> 0x028f }
        L_0x028d:
            monitor-exit(r4)     // Catch:{ all -> 0x028f }
            goto L_0x02df
        L_0x028f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x028f }
            throw r0
        L_0x0292:
            java.lang.Object r7 = r8.A0A
            monitor-enter(r7)
            java.util.Map r0 = r8.A04     // Catch:{ all -> 0x02ff }
            java.lang.Object r6 = r0.remove(r5)     // Catch:{ all -> 0x02ff }
            X.758 r6 = (X.AnonymousClass758) r6     // Catch:{ all -> 0x02ff }
            if (r6 != 0) goto L_0x02b3
            X.6VD r3 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x02ff }
            java.lang.String r2 = X.C138836im.A0C     // Catch:{ all -> 0x02ff }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ff }
            java.lang.String r0 = "WorkerWrapper could not be found for "
            r1.append(r0)     // Catch:{ all -> 0x02ff }
            X.AnonymousClass6VD.A03(r3, r5, r2, r1)     // Catch:{ all -> 0x02ff }
        L_0x02b1:
            monitor-exit(r7)     // Catch:{ all -> 0x02ff }
            goto L_0x02d8
        L_0x02b3:
            java.util.Map r4 = r8.A06     // Catch:{ all -> 0x02ff }
            java.util.Set r0 = X.C90524aI.A0r(r5, r4)     // Catch:{ all -> 0x02ff }
            if (r0 == 0) goto L_0x02b1
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x02ff }
            if (r0 == 0) goto L_0x02b1
            X.6VD r3 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x02ff }
            java.lang.String r2 = X.C138836im.A0C     // Catch:{ all -> 0x02ff }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ff }
            java.lang.String r0 = "Processor stopping background work "
            r1.append(r0)     // Catch:{ all -> 0x02ff }
            X.AnonymousClass6VD.A03(r3, r5, r2, r1)     // Catch:{ all -> 0x02ff }
            r4.remove(r5)     // Catch:{ all -> 0x02ff }
            monitor-exit(r7)     // Catch:{ all -> 0x02ff }
            goto L_0x02da
        L_0x02d8:
            r4 = 0
            goto L_0x02e3
        L_0x02da:
            boolean r4 = X.C138836im.A01(r6, r5)
            goto L_0x02e3
        L_0x02df:
            boolean r4 = X.C138836im.A01(r1, r5)
        L_0x02e3:
            X.6VD r3 = X.AnonymousClass6VD.A00()
            java.lang.String r2 = X.C112575e7.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "StopWorkRunnable for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; Processor.stopWork = "
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r4)
            r3.A04(r2, r0)
            return
        L_0x02ff:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x02ff }
            throw r0
        L_0x0302:
            java.lang.Object r2 = r3.A01
            X.6LC r2 = (X.AnonymousClass6LC) r2
            java.lang.Object r1 = r3.A00
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            X.5hM r0 = r2.A03
            X.AnonymousClass6LC.A00(r1, r0, r2)
            return
        L_0x0310:
            java.lang.Object r4 = r3.A00
            java.lang.Object r1 = r3.A01
            X.7fl r1 = (X.C158077fl) r1
            boolean r0 = r3.A02
            X.7ku r2 = r1.B7y()
            if (r0 == 0) goto L_0x032c
            java.lang.String r0 = "accounts_not_linked_error"
        L_0x0320:
            X.4vP r1 = X.C142326oh.A03(r4)
            X.68b r0 = X.C1273868b.A01(r0)
            X.C1273868b.A07(r1, r0, r2)
            return
        L_0x032c:
            java.lang.String r0 = "generic_error"
            goto L_0x0320
        L_0x032f:
            boolean r2 = r3.A02
            java.lang.Object r1 = r3.A00
            X.00S r1 = (X.AnonymousClass00S) r1
            java.lang.Object r0 = r3.A01
            X.1K6 r0 = (X.AnonymousClass1K6) r0
            X.C36321k7.A0x(r1, r0)
            if (r2 == 0) goto L_0x0342
            r1.invoke()
            return
        L_0x0342:
            X.17Y r0 = r0.A00
            r0.A02()
            return
        L_0x0348:
            java.lang.Object r2 = r3.A00
            X.4c0 r2 = (X.C91434c0) r2
            java.lang.Object r1 = r3.A01
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1
            boolean r0 = r3.A02
            r2.A02(r1, r0)
            return
        L_0x0356:
            java.lang.Object r2 = r3.A00
            X.6zT r2 = (X.C148816zT) r2
            java.lang.Object r1 = r3.A01
            com.whatsapp.voipcalling.CallInfo r1 = (com.whatsapp.voipcalling.CallInfo) r1
            boolean r0 = r3.A02
            r2.A0E(r1, r0)
            return
        L_0x0364:
            java.lang.Object r4 = r3.A00
            X.52X r4 = (X.AnonymousClass52X) r4
            boolean r2 = r3.A02
            java.lang.Object r1 = r3.A01
            X.6Eu r1 = (X.C129066Eu) r1
            if (r2 == 0) goto L_0x0378
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r4.A04
            if (r0 == 0) goto L_0x0378
            X.C95504lc.A03(r0)
            return
        L_0x0378:
            if (r1 == 0) goto L_0x0382
            if (r2 != 0) goto L_0x0382
            android.graphics.Bitmap r0 = r1.A07
        L_0x037e:
            X.AnonymousClass52X.A01(r0, r4)
            return
        L_0x0382:
            r0 = 0
            goto L_0x037e
        L_0x0384:
            java.lang.Object r4 = r3.A00
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r4 = (com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r4
            java.lang.Object r9 = r3.A01
            X.6OZ r9 = (X.AnonymousClass6OZ) r9
            boolean r10 = r3.A02
            com.whatsapp.voipcalling.CallState r13 = r9.A09
            boolean r6 = r9.A0G
            X.0wy r2 = r9.A04
            int r8 = r2.size()
            boolean r7 = r9.A0L
            if (r7 == 0) goto L_0x041f
            X.1HK r1 = r4.A08
            java.lang.String r0 = r9.A0A
            java.lang.String r0 = X.C34681hT.A09(r0)
            X.5Nh r19 = r1.A06(r0)
            if (r19 == 0) goto L_0x03b4
            java.util.ArrayList r0 = r19.A0C()
            int r0 = r0.size()
            int r8 = r0 + 1
        L_0x03b4:
            X.0yC r1 = r4.A09
            r0 = 4716(0x126c, float:6.609E-42)
            int r0 = r1.A07(r0)
            boolean r11 = r9.A0E
            if (r11 == 0) goto L_0x03c4
            r18 = 1
            if (r8 > r0) goto L_0x03c6
        L_0x03c4:
            r18 = 0
        L_0x03c6:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Collection r0 = r2.values()
            java.util.Iterator r16 = r0.iterator()
            r3 = 0
        L_0x03d3:
            r17 = 0
        L_0x03d5:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0422
            X.6EE r14 = X.C90524aI.A0J(r16)
            boolean r0 = r14.A0J
            if (r0 != 0) goto L_0x03d5
            com.whatsapp.jid.UserJid r12 = r14.A08
            int r1 = r14.A02
            r0 = 1
            if (r1 == r0) goto L_0x0405
            if (r18 == 0) goto L_0x0405
            X.16D r0 = r4.A06
            boolean r0 = r0.A0q(r12)
            if (r0 != 0) goto L_0x0405
            int r3 = r3 + 1
        L_0x03f6:
            if (r17 != 0) goto L_0x0402
            r0 = 3
            if (r1 == r0) goto L_0x0402
            r0 = 2
            if (r1 == r0) goto L_0x0402
            r0 = 11
            if (r1 != r0) goto L_0x03d3
        L_0x0402:
            r17 = 1
            goto L_0x03d5
        L_0x0405:
            X.AnonymousClass00C.A08(r12)
            r0 = 3
            if (r1 == r0) goto L_0x0413
            r0 = 2
            if (r1 == r0) goto L_0x0413
            r0 = 11
            r15 = 0
            if (r1 != r0) goto L_0x0414
        L_0x0413:
            r15 = 1
        L_0x0414:
            boolean r14 = r14.A0D
            X.6CF r0 = new X.6CF
            r0.<init>(r12, r1, r15, r14)
            r5.add(r0)
            goto L_0x03f6
        L_0x041f:
            r19 = 0
            goto L_0x03b4
        L_0x0422:
            if (r7 == 0) goto L_0x0457
            if (r19 == 0) goto L_0x0457
            java.util.Iterator r14 = X.C107265Nh.A00(r19)
        L_0x042a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0457
            java.lang.Object r0 = r14.next()
            X.5Nf r0 = (X.C107255Nf) r0
            com.whatsapp.jid.UserJid r12 = r0.A00
            boolean r0 = r2.containsKey(r12)
            if (r0 != 0) goto L_0x042a
            if (r18 == 0) goto L_0x044b
            X.16D r0 = r4.A06
            boolean r0 = r0.A0q(r12)
            if (r0 != 0) goto L_0x044b
            int r3 = r3 + 1
            goto L_0x042a
        L_0x044b:
            r7 = 11
            r1 = 0
            X.6CF r0 = new X.6CF
            r0.<init>(r12, r7, r1, r1)
            r5.add(r0)
            goto L_0x042a
        L_0x0457:
            r1 = 12
            X.7qw r0 = new X.7qw
            r0.<init>(r4, r1)
            java.util.Collections.sort(r5, r0)
            X.147 r0 = r9.A06
            if (r0 != 0) goto L_0x048e
            if (r10 == 0) goto L_0x0471
            boolean r0 = com.whatsapp.voipcalling.Voip.A0A(r13)
            if (r0 != 0) goto L_0x048e
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r13 == r0) goto L_0x048e
        L_0x0471:
            r16 = 1
        L_0x0473:
            X.0y6 r0 = r2.values()
            java.util.Iterator r2 = r0.iterator()
            r7 = 0
        L_0x047c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0491
            X.6EE r0 = X.C90524aI.A0J(r2)
            int r1 = r0.A02
            r0 = 1
            if (r1 != r0) goto L_0x047c
            int r7 = r7 + 1
            goto L_0x047c
        L_0x048e:
            r16 = 0
            goto L_0x0473
        L_0x0491:
            r12 = 1
            if (r10 != 0) goto L_0x0537
            if (r7 <= r12) goto L_0x0537
            boolean r0 = r9.A0J
            if (r0 == 0) goto L_0x0537
        L_0x049a:
            if (r6 == 0) goto L_0x049f
            r15 = 1
            if (r17 != 0) goto L_0x04a0
        L_0x049f:
            r15 = 0
        L_0x04a0:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.HashSet r10 = X.C36441kJ.A16()
            r6 = 0
            r1 = 1
            if (r12 == 0) goto L_0x04cc
            X.1hi r0 = r4.A0A
            boolean r0 = X.C36351kA.A1W(r0)
            r14 = 2131755179(0x7f1000ab, float:1.914123E38)
            if (r0 == 0) goto L_0x04ba
            r14 = 2131755399(0x7f100187, float:1.9141676E38)
        L_0x04ba:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            X.AnonymousClass000.A1L(r0, r7, r6)
            X.2fu r12 = new X.2fu
            r12.<init>(r0, r14, r7)
            X.52u r0 = new X.52u
            r0.<init>(r12)
            r2.add(r0)
        L_0x04cc:
            if (r15 == 0) goto L_0x04d7
            r12 = 2
            X.68p r0 = new X.68p
            r0.<init>(r12)
            r2.add(r0)
        L_0x04d7:
            java.lang.String r0 = r9.A0B
            if (r0 == 0) goto L_0x04ea
            boolean r0 = X.C131856Qx.A00(r13)
            if (r0 != 0) goto L_0x04ea
            r12 = 5
            X.68p r0 = new X.68p
            r0.<init>(r12)
            r2.add(r0)
        L_0x04ea:
            if (r16 == 0) goto L_0x04f4
            X.68p r0 = new X.68p
            r0.<init>(r6)
            r2.add(r0)
        L_0x04f4:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r13 == r0) goto L_0x0534
            X.6EE r0 = r9.A05
            if (r0 == 0) goto L_0x0534
            int r12 = r0.A02
            if (r12 == r1) goto L_0x0503
            r0 = 7
            if (r12 != r0) goto L_0x0534
        L_0x0503:
            r16 = 1
        L_0x0505:
            r0 = 0
        L_0x0506:
            int r12 = r5.size()
            if (r0 >= r12) goto L_0x053a
            java.lang.Object r12 = r5.get(r0)
            X.6CF r12 = (X.AnonymousClass6CF) r12
            int r13 = r12.A00
            if (r13 != r1) goto L_0x053a
            com.whatsapp.jid.UserJid r14 = r12.A01
            X.16D r13 = r4.A06
            X.141 r13 = r13.A0D(r14)
            int r15 = r12.A00
            X.1hi r12 = r4.A0A
            boolean r17 = X.C36351kA.A1W(r12)
            X.52t r12 = new X.52t
            r12.<init>(r13, r14, r15, r16, r17)
            r2.add(r12)
            r10.add(r14)
            int r0 = r0 + 1
            goto L_0x0506
        L_0x0534:
            r16 = 0
            goto L_0x0505
        L_0x0537:
            r12 = 0
            goto L_0x049a
        L_0x053a:
            if (r11 == 0) goto L_0x054e
            if (r7 >= r8) goto L_0x054e
            boolean r7 = r9.A0D
            if (r7 == 0) goto L_0x0545
            r8 = 1
            if (r18 == 0) goto L_0x0546
        L_0x0545:
            r8 = 0
        L_0x0546:
            X.52v r7 = new X.52v
            r7.<init>(r8)
            r2.add(r7)
        L_0x054e:
            int r7 = r5.size()
            if (r0 >= r7) goto L_0x05c9
            java.lang.Object r7 = r5.get(r0)
            X.6CF r7 = (X.AnonymousClass6CF) r7
            com.whatsapp.jid.UserJid r14 = r7.A01
            X.16D r8 = r4.A06
            X.141 r13 = r8.A0D(r14)
            int r15 = r7.A00
            X.1hi r8 = r4.A0A
            boolean r17 = X.C36351kA.A1W(r8)
            X.52t r12 = new X.52t
            r12.<init>(r13, r14, r15, r16, r17)
            r2.add(r12)
            java.util.Set r9 = r4.A0C
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x05c3
            boolean r8 = r9.contains(r14)
            if (r8 != 0) goto L_0x05c3
            if (r15 == r1) goto L_0x05c3
            X.61I r8 = r4.A00
            if (r8 == 0) goto L_0x05c3
            com.whatsapp.voipcalling.VoipActivityV2 r11 = r8.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r8 = r11.A1a
            if (r8 == 0) goto L_0x05c3
            boolean r8 = r8.A1k()
            if (r8 != 0) goto L_0x05c3
            com.whatsapp.contact.picker.ContactPickerFragment r8 = r11.A17
            if (r8 != 0) goto L_0x05c3
            boolean r7 = r7.A02
            if (r7 != 0) goto L_0x05c3
            com.whatsapp.voipcalling.CallInfo r9 = com.whatsapp.voipcalling.VoipActivityV2.A01(r11)
            if (r9 == 0) goto L_0x05c3
            com.whatsapp.voipcalling.CallState r8 = r9.callState
            com.whatsapp.voipcalling.CallState r7 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r8 != r7) goto L_0x05c3
            boolean r7 = r9.isGroupCall
            if (r7 == 0) goto L_0x05c3
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r11 = r11.A0f
            boolean r9 = r9.videoEnabled
            com.whatsapp.jid.UserJid[] r7 = new com.whatsapp.jid.UserJid[r1]
            java.util.List r8 = X.C90524aI.A0p(r14, r7, r6)
            r7 = 2131102530(0x7f060b42, float:1.78175E38)
            if (r9 == 0) goto L_0x05bc
            r7 = 2131101876(0x7f0608b4, float:1.7816174E38)
        L_0x05bc:
            X.5yh r7 = com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel.A06(r11, r8, r7)
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel.A09(r11, r7)
        L_0x05c3:
            r10.add(r14)
            int r0 = r0 + 1
            goto L_0x054e
        L_0x05c9:
            if (r3 <= 0) goto L_0x05e0
            java.lang.Object[] r5 = new java.lang.Object[r1]
            X.AnonymousClass000.A1L(r5, r3, r6)
            r0 = 2131755263(0x7f1000ff, float:1.91414E38)
            X.2fu r1 = new X.2fu
            r1.<init>(r5, r0, r3)
            X.52w r0 = new X.52w
            r0.<init>(r1)
            r2.add(r0)
        L_0x05e0:
            java.util.Set r0 = r4.A0C
            r0.clear()
            r0.addAll(r10)
            X.00s r0 = r4.A01
            r0.A0C(r2)
            return
        L_0x05ee:
            java.lang.Object r0 = r3.A00
            X.6XR r0 = (X.AnonymousClass6XR) r0
            java.lang.Object r4 = r3.A01
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            boolean r2 = r3.A02
            if (r4 == 0) goto L_0x0603
            long[] r1 = r0.A03
            r0 = -1
            if (r2 == 0) goto L_0x0600
            r0 = 0
        L_0x0600:
            r4.vibrate(r1, r0)
        L_0x0603:
            java.lang.String r0 = "voip/vibrate/start complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0609:
            java.lang.Object r5 = r3.A00
            X.6YM r5 = (X.AnonymousClass6YM) r5
            java.lang.Object r4 = r3.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r2 = r3.A02
            int r0 = com.whatsapp.voipcalling.Voip.sendRemoveUserRequest(r4)
            if (r0 != 0) goto L_0x0638
            if (r2 == 0) goto L_0x0620
            java.util.Set r0 = r5.A1D
            r0.add(r4)
        L_0x0620:
            android.os.Handler r1 = r5.A0c
            r0 = 46
            r1.removeMessages(r0)
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r1.what = r0
            r1.arg1 = r2
            r1.obj = r4
            android.os.Handler r0 = r5.A0c
            r0.sendMessage(r1)
            return
        L_0x0638:
            r1 = 28
            if (r2 == 0) goto L_0x063e
            r1 = 29
        L_0x063e:
            switch(r0) {
                case 670041: goto L_0x064c;
                case 670042: goto L_0x0649;
                default: goto L_0x0641;
            }
        L_0x0641:
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r5.A0l(r0, r1)
            return
        L_0x0649:
            r1 = 25
            goto L_0x0641
        L_0x064c:
            r1 = 27
            goto L_0x0641
        L_0x064f:
            java.lang.Object r1 = r3.A00
            X.6YM r1 = (X.AnonymousClass6YM) r1
            java.lang.Object r0 = r3.A01
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            boolean r3 = r3.A02
            java.lang.String r0 = r0.callId
            boolean r0 = r1.A0r(r0)
            r2 = r0 ^ 1
            X.0yC r1 = r1.A2t
            r0 = 4204(0x106c, float:5.891E-42)
            boolean r1 = r1.A0E(r0)
            boolean r0 = X.C19550w8.A08()
            if (r0 == 0) goto L_0x0672
            if (r1 == 0) goto L_0x0672
            r2 = 1
        L_0x0672:
            com.whatsapp.voipcalling.Voip.onCallInterrupted(r3, r2)
            return
        L_0x0676:
            java.lang.Object r5 = r3.A00
            X.8Yr r5 = (X.C174848Yr) r5
            java.lang.Object r4 = r3.A01
            X.2bS r4 = (X.AnonymousClass2bS) r4
            boolean r0 = r3.A02
            r20 = r0
            android.widget.LinearLayout r0 = r5.A06
            r39 = r0
            java.lang.Object r0 = r39.getTag()
            if (r0 == 0) goto L_0x0be1
            X.3Qa r0 = r4.A1J
            r38 = r0
            java.lang.Object r1 = r39.getTag()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0be1
            java.util.List r6 = r4.A04
            r10 = 0
            if (r6 == 0) goto L_0x06c7
            r8 = 0
            java.util.Iterator r7 = r6.iterator()
        L_0x06a5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x06c7
            java.lang.Object r3 = r7.next()
            X.2bM r3 = (X.AnonymousClass2bM) r3
            X.3Qa r0 = r3.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x06a5
            boolean r0 = r3 instanceof X.C180858mX
            if (r0 == 0) goto L_0x06a5
            X.8mX r3 = (X.C180858mX) r3
            long r1 = r3.A00
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x06a5
            java.util.List r10 = r3.A06
            r8 = r1
            goto L_0x06a5
        L_0x06c7:
            r5.A01 = r10
            X.1RJ r2 = r5.A09
            int r1 = r4.A00
            r0 = 0
            if (r1 != 0) goto L_0x06d2
            r0 = 8
        L_0x06d2:
            r2.A03(r0)
            java.util.List r0 = r4.A05
            r37 = r0
            java.util.Iterator r2 = r37.iterator()
            r19 = 0
        L_0x06df:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06f4
            java.lang.Object r0 = r2.next()
            X.3PS r0 = (X.AnonymousClass3PS) r0
            int r1 = r0.A00
            r0 = r19
            int r19 = java.lang.Math.max(r0, r1)
            goto L_0x06df
        L_0x06f4:
            java.util.HashMap r18 = X.AnonymousClass001.A0J()
            if (r6 == 0) goto L_0x0744
            int r8 = r6.size()
        L_0x06fe:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x0744
            java.lang.Object r7 = r6.get(r8)
            X.2bM r7 = (X.AnonymousClass2bM) r7
            boolean r0 = r7 instanceof X.C180858mX
            if (r0 == 0) goto L_0x06fe
            X.8mX r7 = (X.C180858mX) r7
            X.3Qa r0 = r7.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x06fe
            java.util.List r0 = r7.A06
            java.util.Iterator r3 = r0.iterator()
        L_0x071a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x06fe
            java.lang.Object r2 = r3.next()
            r0 = r18
            java.lang.Object r1 = r0.get(r2)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 != 0) goto L_0x0739
            r0 = 0
            android.util.Pair r1 = X.C36441kJ.A0Q(r7, r0)
        L_0x0733:
            r0 = r18
            r0.put(r2, r1)
            goto L_0x071a
        L_0x0739:
            java.lang.Object r0 = r1.second
            if (r0 != 0) goto L_0x071a
            java.lang.Object r0 = r1.first
            android.util.Pair r1 = X.C36441kJ.A0Q(r0, r7)
            goto L_0x0733
        L_0x0744:
            com.whatsapp.WaTextView r1 = r5.A07
            r3 = 1
            boolean r0 = X.AnonymousClass000.A1R(r19)
            r1.setEnabled(r0)
            java.util.List r17 = r5.getHighlightTerms()
            r6 = 0
        L_0x0753:
            int r1 = r37.size()
            java.util.List r0 = r5.A0A
            if (r6 >= r1) goto L_0x0a32
            int r1 = X.C36421kH.A06(r0, r3)
            if (r1 >= r6) goto L_0x0a23
            android.view.LayoutInflater r2 = X.C36351kA.A0C(r5)
            r1 = 2131625864(0x7f0e0788, float:1.8878948E38)
            android.view.View r8 = X.C36381kD.A0K(r2, r1)
            X.5kP r2 = r5.A00
            X.1RY r10 = r5.A08
            boolean r9 = r5.A0B
            X.1Qd r1 = r2.A00
            X.0tq r1 = r1.A01
            X.0yC r30 = X.C36341k9.A0V(r1)
            X.1Qd r1 = r2.A00
            X.0tq r7 = r1.A01
            X.0ts r28 = X.C36341k9.A0T(r7)
            X.0wQ r23 = X.C36351kA.A0N(r7)
            X.1H2 r29 = X.C36351kA.A0e(r7)
            X.1X4 r24 = X.C36361kB.A0T(r7)
            X.16D r25 = X.C36341k9.A0R(r7)
            X.0yb r27 = X.C36351kA.A0U(r7)
            X.004 r1 = r7.A1l
            X.005 r33 = X.C18840tu.A00(r1)
            X.0tt r2 = r7.A00
            X.004 r1 = r2.A3I
            java.lang.Object r1 = r1.get()
            X.3Sh r1 = (X.C65493Sh) r1
            X.0wg r32 = X.C36351kA.A0m(r7)
            X.004 r2 = r2.A2u
            X.005 r34 = X.C18840tu.A00(r2)
            X.6SW r2 = new X.6SW
            r21 = r2
            r22 = r8
            r26 = r10
            r31 = r1
            r35 = r0
            r36 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r1 = r39
            r1.addView(r8)
            r0.add(r2)
        L_0x07c9:
            android.content.Context r7 = r5.getContext()
            java.util.List r11 = r5.A01
            int r0 = r4.A00
            boolean r13 = X.AnonymousClass000.A1Q(r0)
            r2.A01 = r4
            r0 = r37
            java.lang.Object r0 = r0.get(r6)
            X.3PS r0 = (X.AnonymousClass3PS) r0
            r2.A00 = r0
            java.lang.String r8 = r0.A03
            if (r17 == 0) goto L_0x07ed
            X.0ts r1 = r2.A0D
            r0 = r17
            java.lang.CharSequence r8 = X.C65783Tl.A01(r7, r1, r8, r0)
        L_0x07ed:
            android.text.SpannableStringBuilder r9 = X.C36441kJ.A0P(r8)
            X.0yb r1 = r2.A0C
            X.0wg r0 = r2.A0H
            X.AnonymousClass6YV.A08(r1, r0, r9)
            android.widget.TextView r8 = r2.A04
            android.text.TextPaint r1 = r8.getPaint()
            X.1H2 r0 = r2.A0E
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A03(r7, r1, r0, r9)
            r8.setText(r0)
            X.1RJ r10 = r2.A0J
            r0 = 8
            r10.A03(r0)
            X.1RJ r9 = r2.A0K
            r9.A03(r0)
            X.1RJ r8 = r2.A0I
            r8.A03(r0)
            X.3PS r0 = r2.A00
            int r12 = r0.A00
            X.0ts r0 = r2.A0D
            r23 = r0
            java.text.NumberFormat r14 = r23.A0M()
            long r0 = (long) r12
            java.lang.String r1 = r14.format(r0)
            X.2bS r0 = r2.A01
            if (r0 == 0) goto L_0x084b
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x084b
            X.0yC r14 = r2.A0F
            r0 = 6489(0x1959, float:9.093E-42)
            boolean r0 = r14.A0E(r0)
            if (r0 == 0) goto L_0x084b
            X.005 r0 = r2.A0L
            java.lang.Object r0 = r0.get()
            X.3Ov r0 = (X.C64633Ov) r0
            java.lang.String r1 = r0.A01(r12)
        L_0x084b:
            android.widget.TextView r0 = r2.A05
            r0.setText(r1)
            android.widget.CheckBox r12 = r2.A03
            r12.setEnabled(r13)
            r0 = r38
            boolean r1 = r0.A02
            r0 = 2131102202(0x7f0609fa, float:1.7816835E38)
            if (r1 == 0) goto L_0x0861
            r0 = 2131102203(0x7f0609fb, float:1.7816837E38)
        L_0x0861:
            android.content.res.ColorStateList r0 = X.AnonymousClass00F.A04(r7, r0)
            X.AnonymousClass0Q6.A00(r0, r12)
            com.whatsapp.components.RoundCornerProgressBarV2 r13 = r2.A09
            r0 = 2131101974(0x7f060916, float:1.7816373E38)
            if (r1 == 0) goto L_0x0872
            r0 = 2131101975(0x7f060917, float:1.7816375E38)
        L_0x0872:
            int r0 = X.AnonymousClass00F.A00(r7, r0)
            r13.A01 = r0
            r7 = 0
            if (r19 != 0) goto L_0x0a09
            r1 = 0
        L_0x087c:
            int r0 = r13.A02
            if (r1 == r0) goto L_0x08c1
            r13.A02 = r1
            android.animation.ValueAnimator r0 = r13.A00
            if (r0 == 0) goto L_0x0891
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L_0x0891
            android.animation.ValueAnimator r0 = r13.A00
            r0.cancel()
        L_0x0891:
            if (r20 == 0) goto L_0x0a01
            float[] r1 = X.C90524aI.A0v()
            float r0 = r13.A00
            r1[r7] = r0
            int r0 = r13.A02
            float r0 = (float) r0
            r1[r3] = r0
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r1)
            r13.A00 = r14
            r0 = 200(0xc8, double:9.9E-322)
            r14.setDuration(r0)
            android.animation.ValueAnimator r1 = r13.A00
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r13.A00
            r0 = 21
            X.C111565cU.A00(r1, r13, r0)
            android.animation.ValueAnimator r0 = r13.A00
            r0.start()
        L_0x08c1:
            android.view.View r13 = r2.A02
            r1 = 21
            X.72o r0 = new X.72o
            r0.<init>(r2, r1)
            r13.post(r0)
            if (r11 == 0) goto L_0x08de
            X.3PS r0 = r2.A00
            long r0 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r1 = r11.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x08df
        L_0x08de:
            r0 = 0
        L_0x08df:
            r12.setChecked(r0)
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0922
            boolean r0 = r12.isChecked()
            r16 = 2131755010(0x7f100002, float:1.9140887E38)
            if (r0 == 0) goto L_0x08f2
            r16 = 2131755009(0x7f100001, float:1.9140885E38)
        L_0x08f2:
            X.3PS r14 = r2.A00
            int r13 = r14.A00
            long r0 = (long) r13
            r21 = r0
            java.lang.Object[] r15 = X.AnonymousClass001.A0M()
            java.lang.String r0 = r14.A03
            r15[r7] = r0
            X.AnonymousClass000.A1L(r15, r13, r3)
            r14 = r23
            r0 = r21
            r13 = r16
            java.lang.String r0 = r14.A0L(r15, r13, r0)
            androidx.constraintlayout.widget.ConstraintLayout r13 = r2.A06
            r13.setContentDescription(r0)
            boolean r1 = r12.isChecked()
            r0 = 2131886224(0x7f120090, float:1.940702E38)
            if (r1 == 0) goto L_0x091f
            r0 = 2131886223(0x7f12008f, float:1.9407019E38)
        L_0x091f:
            X.C33521fV.A03(r13, r0)
        L_0x0922:
            X.3PS r0 = r2.A00
            if (r0 == 0) goto L_0x093e
            long r0 = r0.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r18
            java.lang.Object r12 = r0.get(r1)
            android.util.Pair r12 = (android.util.Pair) r12
            X.2bS r0 = r2.A01
            if (r0 == 0) goto L_0x0942
            boolean r0 = X.AnonymousClass6SW.A00(r2, r0)
            if (r0 == 0) goto L_0x0942
        L_0x093e:
            int r6 = r6 + 1
            goto L_0x0753
        L_0x0942:
            if (r11 == 0) goto L_0x09b3
            X.3PS r0 = r2.A00
            long r0 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x09b3
            if (r12 == 0) goto L_0x09ea
            java.lang.Object r0 = r12.first
            if (r0 == 0) goto L_0x09ea
            r10.A03(r7)
            android.view.View r11 = X.C36391kE.A0L(r8, r7)
            android.view.View r0 = r8.A01()
            android.content.Context r8 = r0.getContext()
            X.2bS r0 = r2.A01
            if (r0 == 0) goto L_0x0974
            X.3Qa r0 = r0.A1J
            boolean r1 = r0.A02
            r0 = 2131233515(0x7f080aeb, float:1.808317E38)
            if (r1 != 0) goto L_0x0977
        L_0x0974:
            r0 = 2131233514(0x7f080aea, float:1.8083168E38)
        L_0x0977:
            X.C36371kC.A13(r8, r11, r0)
            X.1RY r8 = r2.A0B
            X.0wQ r0 = r2.A07
            r0.A0G()
            X.142 r1 = r0.A0E
            android.view.View r0 = r10.A01()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r8.A08(r0, r1)
            java.lang.Object r1 = r12.first
        L_0x098e:
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            android.view.View r8 = X.C36391kE.A0L(r9, r7)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            X.3Qa r0 = r1.A1J
            X.11F r7 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r7)
            if (r0 == 0) goto L_0x09a4
            X.11F r7 = r1.A0J()
        L_0x09a4:
            X.C18740tg.A06(r7)
            X.1RY r1 = r2.A0B
            X.16D r0 = r2.A0A
            X.141 r0 = r0.A0D(r7)
            r1.A08(r8, r0)
            goto L_0x093e
        L_0x09b3:
            if (r12 == 0) goto L_0x093e
            java.lang.Object r1 = r12.first
            if (r1 == 0) goto L_0x093e
            java.lang.Object r0 = r12.second
            if (r0 == 0) goto L_0x098e
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            r10.A03(r7)
            r8.A03(r7)
            android.view.View r10 = r10.A01()
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            X.3Qa r0 = r1.A1J
            X.11F r8 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r8)
            if (r0 == 0) goto L_0x09d9
            X.11F r8 = r1.A0J()
        L_0x09d9:
            X.C18740tg.A06(r8)
            X.1RY r1 = r2.A0B
            X.16D r0 = r2.A0A
            X.141 r0 = r0.A0D(r8)
            r1.A08(r10, r0)
            java.lang.Object r1 = r12.second
            goto L_0x098e
        L_0x09ea:
            r9.A03(r7)
            X.1RY r7 = r2.A0B
            X.0wQ r0 = r2.A07
            r0.A0G()
            X.142 r1 = r0.A0E
            android.view.View r0 = r9.A01()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.A08(r0, r1)
            goto L_0x093e
        L_0x0a01:
            float r0 = (float) r1
            r13.A00 = r0
            r13.invalidate()
            goto L_0x08c1
        L_0x0a09:
            X.3PS r0 = r2.A00
            int r0 = r0.A00
            r1 = 100
            int r0 = r0 * 100
            int r0 = r0 / r19
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = java.lang.Math.max(r0, r7)
            if (r1 < 0) goto L_0x0a2b
            r0 = 100
            if (r1 > r0) goto L_0x0a2b
            goto L_0x087c
        L_0x0a23:
            java.lang.Object r2 = r0.get(r6)
            X.6SW r2 = (X.AnonymousClass6SW) r2
            goto L_0x07c9
        L_0x0a2b:
            java.lang.String r0 = "Progress must be between 0 and 100 inclusive"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0a32:
            int r6 = X.C36421kH.A06(r0, r3)
        L_0x0a36:
            int r1 = r37.size()
            if (r6 < r1) goto L_0x0a4f
            java.lang.Object r1 = r0.get(r6)
            X.6SW r1 = (X.AnonymousClass6SW) r1
            android.view.View r2 = r1.A02
            r1 = r39
            r1.removeView(r2)
            r0.remove(r6)
            int r6 = r6 + -1
            goto L_0x0a36
        L_0x0a4f:
            android.widget.LinearLayout r2 = r5.A05
            boolean r0 = r5.A0B
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            if (r0 != 0) goto L_0x0abe
            android.content.res.Resources r10 = r5.getResources()
            r9 = 2131893137(0x7f121b91, float:1.9421042E38)
            java.lang.Object[] r8 = X.C36441kJ.A1Q()
            android.content.Context r7 = r5.getContext()
            X.16D r1 = r5.A0l
            X.171 r0 = r5.A0n
            java.lang.String r1 = X.C55032tx.A00(r7, r1, r0, r4)
            r0 = 0
            r8[r0] = r1
            X.0ts r11 = r5.A0E
            X.0wo r7 = r5.A19
            long r0 = r4.A0I
            long r0 = r7.A08(r0)
            java.lang.String r0 = X.AnonymousClass3UM.A00(r11, r0)
            r8[r3] = r0
            java.lang.String r1 = r4.A03
            r0 = 2
            java.lang.String r0 = X.C36411kG.A0w(r10, r1, r8, r0, r9)
            r6.append(r0)
            java.util.ArrayList r7 = X.C36441kJ.A15(r37)
            r1 = 13
            X.7qw r0 = new X.7qw
            r0.<init>(r5, r1)
            java.util.Collections.sort(r7, r0)
            java.util.Iterator r4 = r7.iterator()
        L_0x0a9f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0bc4
            java.lang.Object r3 = r4.next()
            X.3PS r3 = (X.AnonymousClass3PS) r3
            java.lang.String r0 = r3.A03
            r6.append(r0)
            java.lang.String r1 = " "
            r6.append(r1)
            int r0 = r3.A00
            r6.append(r0)
            r6.append(r1)
            goto L_0x0a9f
        L_0x0abe:
            r0 = r38
            boolean r0 = r0.A02
            r11 = 2
            r7 = 0
            android.content.res.Resources r12 = r5.getResources()
            if (r0 == 0) goto L_0x0b1a
            r10 = 2131893139(0x7f121b93, float:1.9421046E38)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r0 = r4.A03
            r9[r7] = r0
        L_0x0ad3:
            java.lang.String r0 = r12.getString(r10, r9)
            r6.append(r0)
            java.lang.String r0 = "\n"
            r6.append(r0)
            int r8 = r4.A01
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131893155(0x7f121ba3, float:1.9421079E38)
            if (r8 != 0) goto L_0x0aed
            r0 = 2131893156(0x7f121ba4, float:1.942108E38)
        L_0x0aed:
            java.lang.String r0 = r1.getString(r0)
            r6.append(r0)
            r0 = 10
            r6.append(r0)
            r10 = 0
            java.util.Iterator r8 = r37.iterator()
            r9 = 0
            r13 = 0
        L_0x0b00:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0b32
            java.lang.Object r1 = r8.next()
            X.3PS r1 = (X.AnonymousClass3PS) r1
            int r0 = r1.A00
            if (r0 <= r9) goto L_0x0b15
            r9 = r0
            java.lang.String r10 = r1.A03
            r13 = 1
            goto L_0x0b00
        L_0x0b15:
            if (r0 != r9) goto L_0x0b00
            int r13 = r13 + 1
            goto L_0x0b00
        L_0x0b1a:
            r10 = 2131893140(0x7f121b94, float:1.9421048E38)
            java.lang.Object[] r9 = new java.lang.Object[r11]
            android.content.Context r8 = r5.getContext()
            X.16D r1 = r5.A0l
            X.171 r0 = r5.A0n
            java.lang.String r0 = X.C55032tx.A00(r8, r1, r0, r4)
            r9[r7] = r0
            java.lang.String r0 = r4.A03
            r9[r3] = r0
            goto L_0x0ad3
        L_0x0b32:
            X.0ts r12 = r5.A0E
            X.0wo r8 = r5.A19
            long r0 = r4.A0I
            long r0 = r8.A08(r0)
            java.lang.String r8 = X.AnonymousClass3UM.A00(r12, r0)
            android.content.res.Resources r12 = r5.getResources()
            if (r9 > 0) goto L_0x0ba4
            r1 = 2131893138(0x7f121b92, float:1.9421044E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r0 = X.C36411kG.A0w(r12, r8, r0, r7, r1)
        L_0x0b4f:
            r6.append(r0)
            r0 = r38
            X.11F r1 = r0.A00
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0b9f
            X.12q r0 = r5.A0F
            X.3Qp r9 = r0.A09(r1, r7)
            X.2La r9 = (X.C44072La) r9
            java.lang.String r7 = r6.toString()
            X.0ts r6 = r5.A0E
            X.005 r0 = r5.A2B
            java.lang.Object r1 = r0.get()
            X.1GQ r1 = (X.AnonymousClass1GQ) r1
            X.005 r0 = r5.A2D
            java.lang.Object r3 = r0.get()
            X.3Ov r3 = (X.C64633Ov) r3
            boolean r0 = X.C65903Tx.A07(r9, r1)
            if (r0 == 0) goto L_0x0bdd
            int r1 = r7.indexOf(r8)
            java.lang.String r0 = X.C65903Tx.A03(r6, r3, r4)
            java.lang.StringBuilder r6 = X.C90524aI.A0i(r7)
            int r3 = r1 + -1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.C36421kH.A1N(r1)
            r1.append(r0)
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r6.insert(r3, r0)
        L_0x0b9f:
            java.lang.String r7 = r6.toString()
            goto L_0x0bdd
        L_0x0ba4:
            if (r13 <= r3) goto L_0x0bb5
            r1 = 2131755288(0x7f100118, float:1.9141451E38)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            X.AnonymousClass000.A1L(r0, r9, r7)
            r0[r3] = r8
        L_0x0bb0:
            java.lang.String r0 = r12.getQuantityString(r1, r9, r0)
            goto L_0x0b4f
        L_0x0bb5:
            r1 = 2131755289(0x7f100119, float:1.9141453E38)
            java.lang.Object[] r0 = X.C36441kJ.A1Q()
            r0[r7] = r10
            X.AnonymousClass000.A1L(r0, r9, r3)
            r0[r11] = r8
            goto L_0x0bb0
        L_0x0bc4:
            r1 = 14
            X.7qw r0 = new X.7qw
            r0.<init>(r5, r1)
            java.util.Collections.sort(r7, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131893141(0x7f121b95, float:1.942105E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r7 = X.AnonymousClass000.A0q(r0, r6)
        L_0x0bdd:
            r2.setContentDescription(r7)
            return
        L_0x0be1:
            r39.getTag()
            return
        L_0x0be5:
            java.lang.Object r4 = r3.A00
            X.6Xv r4 = (X.C133316Xv) r4
            java.lang.Object r2 = r3.A01
            X.6E7 r2 = (X.AnonymousClass6E7) r2
            boolean r1 = r3.A02
            r0 = 2
            X.C133316Xv.A00(r4, r2, r0, r1)
            r0 = 1
            X.C133316Xv.A04(r4, r2, r0)
            return
        L_0x0bf8:
            java.lang.Object r2 = r3.A00
            X.2LU r2 = (X.AnonymousClass2LU) r2
            java.lang.Object r1 = r3.A01
            X.3PL r1 = (X.AnonymousClass3PL) r1
            boolean r0 = r3.A02
            r2.A07(r1, r0)
            return
        L_0x0c06:
            java.lang.Object r4 = r3.A00
            com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment r4 = (com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment) r4
            java.lang.Object r5 = r3.A01
            X.11F r5 = (X.AnonymousClass11F) r5
            boolean r8 = r3.A02
            r2 = 0
            X.01I r0 = r4.A0h()
            if (r0 == 0) goto L_0x0c47
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0c47
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0c47
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0c47
            X.3Qa r1 = new X.3Qa
            r1.<init>(r5, r0, r2)
            X.1A1 r0 = r4.A08
            if (r0 == 0) goto L_0x0c4e
            X.3T1 r6 = r0.A03(r1)
        L_0x0c38:
            X.17Y r0 = r4.A01
            if (r0 == 0) goto L_0x0c49
            r7 = 15
            X.755 r3 = new X.755
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0H(r3)
            return
        L_0x0c47:
            r6 = 0
            goto L_0x0c38
        L_0x0c49:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0c4e:
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c55:
            java.lang.Object r2 = r3.A00
            X.5xJ r2 = (X.C123925xJ) r2
            java.lang.Object r0 = r3.A01
            X.5xD r0 = (X.C123865xD) r0
            X.6Fj r0 = r0.A02
            java.lang.String r0 = r0.A04()
            if (r0 == 0) goto L_0x0cf6
            java.util.List r7 = r2.A04
            r7.add(r0)
            int r1 = r7.size()
            java.util.List r6 = r2.A05
            int r0 = r6.size()
            if (r1 != r0) goto L_0x0ce8
            com.whatsapp.payments.ui.BrazilPayBloksActivity r9 = r2.A02
            java.lang.String r8 = r2.A03
            X.6C8 r12 = r2.A01
            X.1Db r0 = r9.A0A
            X.9tF r0 = r0.A04()
            if (r0 == 0) goto L_0x0ce4
            X.9sz r0 = r0.A00
            java.lang.String r6 = r0.A01
            if (r6 == 0) goto L_0x0ce4
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r7.iterator()
        L_0x0c92:
            boolean r1 = r3.hasNext()
            r7 = 1
            r0 = 2
            r4 = 0
            if (r1 == 0) goto L_0x0cb4
            java.lang.String r1 = X.AnonymousClass001.A0C(r3)
            X.1AL[] r2 = new X.AnonymousClass1AL[r0]
            java.lang.String r0 = "type"
            X.C36341k9.A1L(r0, r8, r2, r4)
            X.C36331k8.A1R(r1, r2, r7)
            java.lang.String r1 = "document"
            X.9nx r0 = new X.9nx
            r0.<init>(r1, r2)
            r5.add(r0)
            goto L_0x0c92
        L_0x0cb4:
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            java.lang.String r1 = "action"
            java.lang.String r0 = "document-upload-step-up-challenge"
            X.C36341k9.A1L(r1, r0, r3, r4)
            java.lang.String r0 = "challenge_id"
            X.C36341k9.A1L(r0, r6, r3, r7)
            X.9nx[] r0 = new X.C203399nx[r4]
            java.lang.Object[] r1 = r5.toArray(r0)
            X.9nx[] r1 = (X.C203399nx[]) r1
            java.lang.String r0 = "account"
            X.9nx r2 = new X.9nx
            r2.<init>((java.lang.String) r0, (X.AnonymousClass1AL[]) r3, (X.C203399nx[]) r1)
            X.1Vk r1 = r9.A0C
            X.17Y r11 = r9.A05
            X.1Vu r10 = r9.A08
            r14 = 2
            X.7pJ r8 = new X.7pJ
            r13 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = "set"
            r1.A0F(r8, r2, r0)
            return
        L_0x0ce4:
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0G(r12, r9)
            return
        L_0x0ce8:
            com.whatsapp.payments.ui.BrazilPayBloksActivity r4 = r2.A02
            int r0 = r2.A00
            int r8 = r0 + 1
            java.lang.String r5 = r2.A03
            X.6C8 r3 = r2.A01
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0I(r3, r4, r5, r6, r7, r8)
            return
        L_0x0cf6:
            com.whatsapp.payments.ui.BrazilPayBloksActivity r1 = r2.A02
            X.6C8 r0 = r2.A01
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0G(r0, r1)
            return
        L_0x0cfe:
            java.lang.Object r2 = r3.A00
            X.14u r2 = (X.C225314u) r2
            boolean r1 = r3.A02
            java.lang.Object r0 = r3.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r1 == 0) goto L_0x0d0d
            r2.Bnv()
        L_0x0d0d:
            r0.run()
            return
        L_0x0d11:
            java.lang.Object r5 = r3.A00
            X.8jA r5 = (X.C179098jA) r5
            boolean r4 = r3.A02
            java.lang.Object r3 = r3.A01
            X.16S r0 = r5.A04
            java.util.ArrayList r0 = r0.A0A()
            r5.A0G = r0
            X.9un r0 = X.AnonymousClass16S.A02(r0)
            r5.A03 = r0
            X.17Y r2 = r5.A05
            r1 = 28
            X.752 r0 = new X.752
            r0.<init>(r5, r3, r1, r4)
            r2.A0H(r0)
            return
        L_0x0d34:
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r3.A02
            java.lang.Object r3 = r3.A01
            X.1qm r2 = X.AnonymousClass3LW.A00(r0)
            r0 = 2131892735(0x7f1219ff, float:1.9420227E38)
            if (r1 == 0) goto L_0x0d48
            r0 = 2131892444(0x7f1218dc, float:1.9419636E38)
        L_0x0d48:
            r2.A0d(r0)
            r0 = 2131892717(0x7f1219ed, float:1.942019E38)
            if (r1 == 0) goto L_0x0d53
            r0 = 2131892443(0x7f1218db, float:1.9419634E38)
        L_0x0d53:
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 39
            X.C163297py.A00(r2, r3, r0, r1)
            X.C36341k9.A11(r2)
            return
        L_0x0d62:
            java.lang.Object r0 = r3.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            java.lang.Object r4 = r3.A01
            com.whatsapp.voipcalling.CallInfo r4 = (com.whatsapp.voipcalling.CallInfo) r4
            boolean r2 = r3.A02
            X.6W1 r3 = r0.A18
            X.6YM r0 = r0.A0r
            java.lang.String r1 = r4.callId
            X.1PY r0 = r0.A2I
            java.lang.String r5 = r0.A00(r1)
            r6 = 4
            if (r2 == 0) goto L_0x0d7c
            r6 = 5
        L_0x0d7c:
            X.00T r0 = X.AnonymousClass6W1.A04
            java.util.List r1 = X.C90524aI.A0q(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0d9e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot start a session from subSurface:"
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r6)
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return
        L_0x0d9e:
            X.0wk r0 = r3.A03
            r7 = 3
            X.3vX r2 = new X.3vX
            r2.<init>(r3, r4, r5, r6, r7)
            r0.execute(r2)
            return
        L_0x0daa:
            X.00s r4 = r4.A0G
            X.2pW r3 = X.C52492pW.LOADING_FAILED
            if (r5 == 0) goto L_0x0db5
            java.lang.String r2 = r5.A0C()     // Catch:{ MalformedURLException -> 0x0db7 }
            goto L_0x0db9
        L_0x0db5:
            r2 = 0
            goto L_0x0db9
        L_0x0db7:
            java.lang.String r2 = r5.A0Z
        L_0x0db9:
            r1 = 0
            X.3JB r0 = new X.3JB
            r0.<init>(r1, r3, r2)
            r4.A0D(r0)
            return
        L_0x0dc3:
            X.00s r0 = r4.A0D
            r0.A0D(r5)
            return
        L_0x0dc9:
            r2.BgQ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass752.run():void");
    }

    public AnonymousClass752(Object obj, Object obj2, int i, boolean z) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = z;
        this.A01 = obj2;
    }

    public AnonymousClass752(FrameLayout frameLayout, AnonymousClass6LC r3) {
        this.A03 = 2;
        this.A01 = r3;
        this.A00 = frameLayout;
        this.A02 = true;
    }

    public AnonymousClass752(AnonymousClass05R r2, AnonymousClass01N r3) {
        this.A03 = 0;
        this.A02 = false;
        this.A01 = r3;
        this.A00 = r2;
    }
}
