package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.74m  reason: invalid class name and case insensitive filesystem */
public class C1502374m implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C1502374m(AnonymousClass39Q r2, AnonymousClass4TU r3, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        this.A01 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.6tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.6tl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: X.6tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: X.6tm} */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:228|229|230|231|(2:233|375)(2:235|376)|234) */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x06b4, code lost:
        r2.Blp(new X.C139346jd(r4, r6, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x06bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07f1, code lost:
        r2.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x07f4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0136, code lost:
        if (r1.A04 == null) goto L_0x0138;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:230:0x0595 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x059e A[Catch:{ IOException -> 0x0614 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x05b5 A[Catch:{ IOException -> 0x0614 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r5 = r20
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x0231;
                case 1: goto L_0x02b9;
                case 2: goto L_0x0062;
                case 3: goto L_0x02d2;
                case 4: goto L_0x0348;
                case 5: goto L_0x0391;
                case 6: goto L_0x03c5;
                case 7: goto L_0x03e4;
                case 8: goto L_0x008a;
                case 9: goto L_0x0427;
                case 10: goto L_0x0435;
                case 11: goto L_0x0467;
                case 12: goto L_0x04ec;
                case 13: goto L_0x050c;
                case 14: goto L_0x070c;
                case 15: goto L_0x0534;
                case 16: goto L_0x0636;
                case 17: goto L_0x064b;
                case 18: goto L_0x066f;
                case 19: goto L_0x00b4;
                case 20: goto L_0x00d9;
                case 21: goto L_0x067f;
                case 22: goto L_0x068d;
                case 23: goto L_0x06a1;
                case 24: goto L_0x06bd;
                case 25: goto L_0x0183;
                case 26: goto L_0x019c;
                case 27: goto L_0x06d9;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r5.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r6 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r6
            java.lang.String r13 = r5.A02
            java.lang.Object r1 = r5.A01
            X.3GB r1 = (X.AnonymousClass3GB) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            X.5re r4 = r6.A01
            if (r4 == 0) goto L_0x022a
            X.011 r0 = r6.A07
            if (r0 == 0) goto L_0x0225
            java.lang.Object r12 = r0.first
            java.lang.String r12 = (java.lang.String) r12
            X.7UR r3 = new X.7UR
            r3.<init>(r6, r1)
            X.7YM r2 = new X.7YM
            r2.<init>(r6, r1)
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            X.5in r0 = r4.A00
            X.1Mz r0 = r0.A00
            X.0tq r1 = r0.A01
            X.0yC r8 = X.C36341k9.A0V(r1)
            X.0ww r6 = X.C36381kD.A0U(r1)
            X.0v0 r7 = X.C36351kA.A0Y(r1)
            X.005 r11 = X.C90514aH.A0i(r1)
            X.1My r0 = r0.A00
            X.004 r14 = r0.A3X
            X.004 r15 = r1.A9e
            X.1WF r9 = X.C90484aE.A0Y(r1)
            X.5dE r10 = X.C18800tq.ANF()
            X.5Qi r5 = new X.5Qi
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = 1
            X.7OV r0 = new X.7OV
            r0.<init>(r3, r4, r2, r1)
            r5.Blp(r0)
        L_0x0061:
            return
        L_0x0062:
            java.lang.Object r3 = r5.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.String r2 = r5.A02
            java.lang.Object r1 = r5.A01
            X.2bU r1 = (X.AnonymousClass2bU) r1
            com.whatsapp.TextEmojiLabel r0 = r3.A06
            if (r0 == 0) goto L_0x0073
            r0.setText(r2)
        L_0x0073:
            com.whatsapp.mediaview.MediaViewFragment.A0O(r3, r1)
            X.01I r0 = r3.A0h()
            if (r0 == 0) goto L_0x0061
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0061
            X.01I r0 = r3.A0h()
            r0.invalidateOptionsMenu()
            return
        L_0x008a:
            java.lang.Object r4 = r5.A00
            X.9ok r4 = (X.C203749ok) r4
            java.lang.String r2 = r5.A02
            java.lang.Object r3 = r5.A01
            java.lang.Object r1 = r4.A00
            X.8jE r1 = (X.C179128jE) r1
            X.1EU r0 = r1.A0P
            X.AnonymousClass1EU.A00(r0)
            X.16S r0 = r0.A06
            java.util.ArrayList r0 = r0.A0A()
            X.9un r0 = X.AnonymousClass16S.A01(r2, r0)
            r1.A0B = r0
            if (r0 == 0) goto L_0x0061
            X.17Y r2 = r1.A05
            r0 = 38
            X.AVb r1 = new X.AVb
            r1.<init>(r4, r3, r0)
            goto L_0x07f1
        L_0x00b4:
            java.lang.Object r0 = r5.A00
            X.35n r0 = (X.C598535n) r0
            java.lang.String r2 = r5.A02
            java.lang.Object r1 = r5.A01
            X.34Y r1 = (X.AnonymousClass34Y) r1
            X.1DU r0 = r0.A00
            java.util.ArrayList r11 = r0.A04(r2)
            X.3Or r9 = r1.A00
            X.3T1 r8 = r1.A01
            if (r11 == 0) goto L_0x0061
            X.3Qa r1 = r8.A1J
            X.11F r7 = r1.A00
            X.C18740tg.A06(r7)
            X.12P r0 = r9.A01
            X.1M0 r6 = r0.A05()
            goto L_0x07f5
        L_0x00d9:
            java.lang.Object r4 = r5.A00
            X.6E3 r4 = (X.AnonymousClass6E3) r4
            java.lang.Object r0 = r5.A01
            X.5oW r0 = (X.C118655oW) r0
            java.lang.String r3 = r5.A02
            X.5n3 r1 = r4.A05
            if (r1 == 0) goto L_0x0061
            java.lang.String r9 = r4.A07
            java.lang.String r2 = ""
            if (r9 != 0) goto L_0x00ee
            r9 = r2
        L_0x00ee:
            long r11 = r4.A00
            r17 = 0
            if (r0 == 0) goto L_0x0166
            long r13 = r0.A01
            int r10 = r0.A00
        L_0x00f8:
            X.9ps r0 = r4.A02
            if (r0 == 0) goto L_0x0163
            long r15 = r0.A08()
        L_0x0100:
            X.9ps r0 = r4.A02
            if (r0 == 0) goto L_0x0108
            long r17 = r0.A09()
        L_0x0108:
            X.9iQ r7 = r4.A03
            if (r7 != 0) goto L_0x0111
            X.9iQ r7 = new X.9iQ
            r7.<init>()
        L_0x0111:
            if (r3 == 0) goto L_0x0114
            r2 = r3
        L_0x0114:
            X.6WC r1 = r1.A00
            java.util.Set r0 = r1.A0B
            java.util.Iterator r5 = r0.iterator()
        L_0x011c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r3 = r5.next()
            X.60j r3 = (X.C1255660j) r3
            java.lang.String r4 = r1.A04
            java.lang.String r0 = r1.A05
            boolean r0 = X.AnonymousClass00C.A0J(r4, r0)
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = r1.A04
            r19 = 1
            if (r0 != 0) goto L_0x013a
        L_0x0138:
            r19 = 0
        L_0x013a:
            X.5xe r0 = r3.A00
            X.6WA r0 = r0.A01
            if (r0 == 0) goto L_0x011c
            android.util.LruCache r3 = r0.A06
            java.lang.Object r8 = r3.get(r2)
            X.6E8 r8 = (X.AnonymousClass6E8) r8
            X.6Dn r6 = new X.6Dn
            r6.<init>(r7, r8, r9, r10, r11, r13, r15, r17, r19)
            java.util.Set r0 = r0.A03
            java.util.Iterator r3 = r0.iterator()
        L_0x0153:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r0 = r3.next()
            X.62g r0 = (X.C1260262g) r0
            r0.A00(r6)
            goto L_0x0153
        L_0x0163:
            r15 = 0
            goto L_0x0100
        L_0x0166:
            r13 = 0
            r10 = 0
            goto L_0x00f8
        L_0x016a:
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0061
            java.lang.String r2 = r1.A04
            java.lang.String r0 = r1.A05
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0852
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x0852
            r0 = 0
            r1.A09 = r0
            X.AnonymousClass6WC.A02(r1)
            return
        L_0x0183:
            java.lang.Object r0 = r5.A00
            X.6l7 r0 = (X.C140156l7) r0
            java.lang.String r1 = r5.A02
            java.lang.Object r8 = r5.A01
            byte[] r8 = (byte[]) r8
            X.6l9 r0 = r0.A00
            java.util.Map r0 = r0.A05
            java.lang.Object r4 = r0.get(r1)
            X.6SQ r4 = (X.AnonymousClass6SQ) r4
            if (r4 == 0) goto L_0x0061
            r3 = 0
            goto L_0x0856
        L_0x019c:
            java.lang.Object r3 = r5.A00
            X.6K5 r3 = (X.AnonymousClass6K5) r3
            java.lang.Object r6 = r5.A01
            android.content.Intent r6 = (android.content.Intent) r6
            java.lang.String r4 = r5.A02
            android.content.ComponentName r5 = r6.getComponent()
            if (r5 == 0) goto L_0x01b8
            java.util.List r1 = X.AnonymousClass6K5.A02
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01eb
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01eb
        L_0x01b8:
            android.net.Uri r6 = r6.getData()
            if (r6 == 0) goto L_0x0061
            java.lang.String r5 = r6.getScheme()
            if (r5 == 0) goto L_0x0061
            java.util.List r1 = X.AnonymousClass6K5.A03
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 1
            if (r0 == 0) goto L_0x01d2
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01d2
            return
        L_0x01d2:
            java.util.Iterator r1 = r1.iterator()
        L_0x01d6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)
            boolean r0 = X.AnonymousClass099.A0O(r5, r0, r2)
            if (r0 == 0) goto L_0x01d6
            java.lang.String r1 = r6.getScheme()
            goto L_0x020d
        L_0x01eb:
            java.util.Iterator r2 = r1.iterator()
        L_0x01ef:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r5.getPackageName()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x01ef
            android.content.ComponentName r0 = r6.getComponent()
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = r0.getPackageName()
        L_0x020d:
            if (r1 == 0) goto L_0x0061
            java.util.Map r0 = X.AnonymousClass6K5.A04
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0061
            X.0yY r3 = r3.A01
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = "INTENT_LAUNCH"
            java.lang.String r0 = "START_ACTIVITY"
            r3.A00(r1, r0, r4, r2)
            return
        L_0x0225:
            java.lang.IllegalStateException r1 = X.C36381kD.A0l()
            throw r1
        L_0x022a:
            java.lang.String r0 = "webAuthAccessTokenFetcher"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x0231:
            java.lang.Object r4 = r5.A00
            X.733 r4 = (X.AnonymousClass733) r4
            java.lang.Object r3 = r5.A01
            android.location.Address r3 = (android.location.Address) r3
            java.lang.String r2 = r5.A02
            r5 = 0
            if (r3 == 0) goto L_0x026e
            int r0 = r3.getMaxAddressLineIndex()
            if (r0 < 0) goto L_0x0250
            java.lang.Object r0 = r4.A02
            X.6Zc r0 = (X.C133586Zc) r0
            com.whatsapp.location.PlaceInfo r1 = r0.A1C
            java.lang.String r0 = r3.getAddressLine(r5)
            r1.A06 = r0
        L_0x0250:
            java.lang.Object r1 = r4.A02
            X.6Zc r1 = (X.C133586Zc) r1
            com.whatsapp.location.PlaceInfo r0 = r1.A1C
            r0.A04 = r2
            java.lang.String r0 = r3.getLocality()
            if (r0 == 0) goto L_0x026e
            java.lang.String r0 = r3.getLocality()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x026e
            java.lang.String r0 = r3.getLocality()
            r1.A0Z = r0
        L_0x026e:
            java.lang.Object r4 = r4.A02
            X.6Zc r4 = (X.C133586Zc) r4
            X.01L r1 = r4.A0P
            r0 = 2131431380(0x7f0b0fd4, float:1.8484488E38)
            android.widget.TextView r3 = X.C36391kE.A0Q(r1, r0)
            android.view.View r1 = r4.A0C
            r0 = 2131431302(0x7f0b0f86, float:1.848433E38)
            android.widget.TextView r2 = X.C36391kE.A0P(r1, r0)
            X.5Sh r1 = r4.A0R
            X.5Sh r0 = X.C108135Sh.STICKER_MODE
            if (r1 != r0) goto L_0x02b0
            java.lang.String r1 = r4.A0Z
        L_0x028c:
            if (r3 == 0) goto L_0x029c
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            int r0 = X.C36381kD.A00(r0)
            r3.setVisibility(r0)
            r3.setText(r1)
        L_0x029c:
            if (r2 == 0) goto L_0x02ac
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x02a6
            r5 = 8
        L_0x02a6:
            r2.setVisibility(r5)
            r2.setText(r1)
        L_0x02ac:
            X.C133586Zc.A0B(r4)
            return
        L_0x02b0:
            com.whatsapp.location.PlaceInfo r0 = r4.A1C
            java.lang.String r1 = r0.A06
            if (r1 != 0) goto L_0x028c
            java.lang.String r1 = r0.A04
            goto L_0x028c
        L_0x02b9:
            java.lang.Object r3 = r5.A00
            X.02E r3 = (X.AnonymousClass02E) r3
            java.lang.Object r2 = r5.A01
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            java.lang.String r0 = r5.A02
            r1 = 2131893611(0x7f121d6b, float:1.9422003E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r0)
            java.lang.String r0 = r3.A0o(r1, r0)
            r2.setTitle(r0)
            return
        L_0x02d2:
            java.lang.Object r6 = r5.A00
            X.5wP r6 = (X.C123385wP) r6
            java.lang.String r13 = r5.A02
            java.lang.Object r4 = r5.A01
            X.7hC r4 = (X.AnonymousClass7hC) r4
            r3 = 1
            java.lang.String r1 = X.C18750th.A04(r13)
            if (r1 == 0) goto L_0x0343
            java.util.Map r2 = r6.A03
            monitor-enter(r2)
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0340 }
            X.5Bz r0 = (X.C104925Bz) r0     // Catch:{ all -> 0x0340 }
            if (r0 == 0) goto L_0x02f1
            boolean r0 = r0.A01     // Catch:{ all -> 0x0340 }
            goto L_0x033c
        L_0x02f1:
            X.5kJ r0 = r6.A00     // Catch:{ all -> 0x0340 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0340 }
            X.6we r10 = new X.6we     // Catch:{ all -> 0x0340 }
            r10.<init>(r4, r6, r13)     // Catch:{ all -> 0x0340 }
            X.0w7 r0 = r0.A00     // Catch:{ all -> 0x0340 }
            X.0tq r3 = r0.A00     // Catch:{ all -> 0x0340 }
            X.0wo r5 = X.C36351kA.A0V(r3)     // Catch:{ all -> 0x0340 }
            X.0ww r4 = X.C36381kD.A0U(r3)     // Catch:{ all -> 0x0340 }
            X.004 r0 = r3.A8B     // Catch:{ all -> 0x0340 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0340 }
            X.0wx r7 = (X.C20060wx) r7     // Catch:{ all -> 0x0340 }
            X.004 r0 = r3.A7Q     // Catch:{ all -> 0x0340 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x0340 }
            X.1BS r12 = (X.AnonymousClass1BS) r12     // Catch:{ all -> 0x0340 }
            X.1BV r9 = r3.AzY()     // Catch:{ all -> 0x0340 }
            X.0yC r8 = X.C36341k9.A0V(r3)     // Catch:{ all -> 0x0340 }
            X.0wG r6 = X.C36351kA.A0W(r3)     // Catch:{ all -> 0x0340 }
            X.1O9 r11 = X.C18800tq.AIi(r3)     // Catch:{ all -> 0x0340 }
            X.5Bz r3 = new X.5Bz     // Catch:{ all -> 0x0340 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0340 }
            r2.put(r1, r3)     // Catch:{ all -> 0x0340 }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0340 }
            X.5Bz r0 = (X.C104925Bz) r0     // Catch:{ all -> 0x0340 }
            if (r0 == 0) goto L_0x033e
            r0.A02()     // Catch:{ all -> 0x0340 }
            goto L_0x033e
        L_0x033c:
            if (r0 != r3) goto L_0x02f1
        L_0x033e:
            monitor-exit(r2)
            return
        L_0x0340:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0343:
            java.lang.IllegalArgumentException r1 = X.C36381kD.A0k()
            throw r1
        L_0x0348:
            java.lang.Object r6 = r5.A00
            X.353 r6 = (X.AnonymousClass353) r6
            java.lang.String r0 = r5.A02
            java.lang.Object r4 = r5.A01
            X.4RG r4 = (X.AnonymousClass4RG) r4
            java.net.URL r0 = X.C90524aI.A0j(r0)     // Catch:{ MalformedURLException -> 0x0388 }
            java.lang.String r0 = r0.getHost()     // Catch:{ MalformedURLException -> 0x0388 }
            if (r0 == 0) goto L_0x0388
            X.1Ak r2 = X.C23931Ak.of(r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckQueryImpl$Builder r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckQueryImpl$Builder
            r0.<init>()
            X.9VA r3 = r0.A00
            java.lang.String r1 = "url_domains"
            if (r2 == 0) goto L_0x0370
            X.84f r0 = r3.A00
            r0.A08(r1, r2)
        L_0x0370:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckResponseImpl.class
            java.lang.String r0 = "NewsletterLinkPreviewCheck"
            X.9JF r1 = new X.9JF
            r1.<init>(r3, r2, r0)
            X.1Ow r0 = r6.A00
            X.9fL r1 = r0.A01(r1)
            X.4Kj r0 = new X.4Kj
            r0.<init>(r4)
            r1.A02(r0)
            return
        L_0x0388:
            java.lang.String r0 = "NewsletterLinkPreviewChecker/failed to parse the url"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r4.BOC()
            return
        L_0x0391:
            java.lang.Object r2 = r5.A00
            com.whatsapp.notification.AndroidWear r2 = (com.whatsapp.notification.AndroidWear) r2
            java.lang.Object r0 = r5.A01
            X.141 r0 = (X.AnonymousClass141) r0
            java.lang.String r7 = r5.A02
            X.11F r12 = X.C36351kA.A0j(r0)
            X.1NM r1 = r2.A04
            r0 = 2
            r1.A0B(r12, r0)
            X.1X4 r3 = r2.A01
            X.C18740tg.A06(r12)
            java.util.List r8 = java.util.Collections.singletonList(r12)
            r4 = 0
            r10 = 0
            r6 = r4
            r9 = r4
            r11 = 0
            r5 = r4
            r3.A0I(r4, r5, r6, r7, r8, r9, r10, r11)
            X.1Y3 r11 = r2.A03
            r13 = 1
            r14 = 1
            r15 = 1
            r16 = 1
            r11.A02(r12, r13, r14, r15, r16)
            com.whatsapp.notification.AndroidWear.A03(r2, r10)
            return
        L_0x03c5:
            java.lang.Object r4 = r5.A00
            com.whatsapp.notification.AndroidWear r4 = (com.whatsapp.notification.AndroidWear) r4
            java.lang.String r3 = r5.A02
            java.lang.Object r1 = r5.A01
            X.3Qa r1 = (X.C64933Qa) r1
            X.1X4 r2 = r4.A01
            X.1A1 r0 = r2.A1H     // Catch:{ all -> 0x03e2 }
            X.3T1 r1 = r0.A03(r1)     // Catch:{ all -> 0x03e2 }
            if (r1 == 0) goto L_0x03dd
            r0 = 0
            r2.A0e(r1, r3, r0)
        L_0x03dd:
            r0 = 0
            com.whatsapp.notification.AndroidWear.A03(r4, r0)
            return
        L_0x03e2:
            r1 = move-exception
            throw r1
        L_0x03e4:
            java.lang.Object r3 = r5.A00
            X.3AI r3 = (X.AnonymousClass3AI) r3
            java.lang.String r4 = r5.A02
            java.lang.Object r11 = r5.A01
            java.util.Map r11 = (java.util.Map) r11
            r0 = 2
            X.AnonymousClass00C.A0D(r11, r0)
            X.19A r2 = r3.A02     // Catch:{ 1ej -> 0x0417 }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A0B(r0)     // Catch:{ 1ej -> 0x0417 }
            X.9oR r5 = r3.A03     // Catch:{ 1ej -> 0x0417 }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ 1ej -> 0x0417 }
            java.lang.String r0 = "DeepLink"
            X.6Be r8 = new X.6Be     // Catch:{ 1ej -> 0x0417 }
            r8.<init>(r4, r0, r11)     // Catch:{ 1ej -> 0x0417 }
            java.lang.String r9 = "deeplink"
            r10 = 0
            r0 = 1
            X.3T5 r6 = new X.3T5     // Catch:{ 1ej -> 0x0417 }
            r6.<init>(r3, r0)     // Catch:{ 1ej -> 0x0417 }
            X.3ot r7 = new X.3ot     // Catch:{ 1ej -> 0x0417 }
            r7.<init>(r3)     // Catch:{ 1ej -> 0x0417 }
            r5.A0B(r6, r7, r8, r9, r10, r11)     // Catch:{ 1ej -> 0x0417 }
            return
        L_0x0417:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.17Y r1 = r3.A01
            r1.A02()
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            r1.A03(r0)
            return
        L_0x0427:
            java.lang.Object r2 = r5.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r2 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r2
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.String r0 = r5.A02
            r2.A1p(r1, r0)
            return
        L_0x0435:
            java.lang.Object r6 = r5.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r6 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r6
            java.lang.String r4 = r5.A02
            java.lang.Object r1 = r5.A01
            X.2bZ r1 = (X.AnonymousClass2bZ) r1
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r6.Bu1(r0)
            X.1XC r3 = r6.A0E
            if (r3 == 0) goto L_0x0460
            X.6wj r2 = new X.6wj
            r2.<init>(r6, r1, r4)
            X.1EU r1 = r6.A3i()
            java.lang.String r0 = "P2M_LITE"
            X.AF8 r1 = r1.A04(r0)
            X.C18740tg.A06(r1)
            r0 = 0
            r3.A00(r2, r1, r4, r0)
            return
        L_0x0460:
            java.lang.String r0 = "paymentTransactionActions"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x0467:
            java.lang.Object r0 = r5.A00
            X.9mR r0 = (X.C202699mR) r0
            java.lang.String r6 = r5.A02
            java.lang.Object r5 = r5.A01
            X.5xK r5 = (X.C123935xK) r5
            X.1Ed r4 = r0.A03
            r0 = 2
            java.lang.Integer[] r3 = new java.lang.Integer[r0]
            r0 = 417(0x1a1, float:5.84E-43)
            boolean r2 = X.C36361kB.A1b(r3, r0)
            r0 = 418(0x1a2, float:5.86E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r3[r0] = r1
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r0 = 40
            X.AnonymousClass000.A1L(r1, r0, r2)
            java.util.List r0 = r4.A0U(r3, r1, r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x0494:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04de
            java.lang.Object r2 = r3.next()
            X.9lY r2 = (X.C202319lY) r2
            X.8av r1 = r2.A0A
            boolean r0 = r1 instanceof X.C175928bI
            if (r0 == 0) goto L_0x0494
            X.8bI r1 = (X.C175928bI) r1
            java.lang.String r4 = r2.A0K
            if (r4 == 0) goto L_0x0494
            X.9jw r0 = r1.A0G
            if (r0 == 0) goto L_0x0494
            X.6c7 r0 = r0.A08
            if (r0 == 0) goto L_0x0494
            java.lang.Object r0 = r0.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0494
            android.content.Context r3 = r5.A00
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r3, r0)
            X.9o6 r1 = r5.A01
            java.lang.String r0 = r5.A04
            X.C202759mb.A03(r2, r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            java.lang.String r0 = "extra_update_mandate_transaction_id"
            r2.putExtra(r0, r4)
            r3.startActivity(r2)
            X.7hK r0 = r5.A02
            r0.BY0()
            return
        L_0x04de:
            X.9mR r4 = r5.A03
            android.content.Context r3 = r5.A00
            X.7hK r2 = r5.A02
            java.lang.String r1 = r5.A04
            boolean r0 = r5.A05
            X.C202699mR.A01(r3, r2, r4, r1, r0)
            return
        L_0x04ec:
            java.lang.Object r6 = r5.A00
            X.39Q r6 = (X.AnonymousClass39Q) r6
            java.lang.String r4 = "user"
            java.lang.Object r3 = r5.A01
            X.4TU r3 = (X.AnonymousClass4TU) r3
            r0 = 2
            X.AnonymousClass00C.A0D(r3, r0)
            X.004 r0 = r6.A04
            java.lang.Object r2 = r0.get()
            X.1XW r2 = (X.AnonymousClass1XW) r2
            r1 = 1
            X.2rb r0 = new X.2rb
            r0.<init>(r6, r3, r1)
            r2.A03(r0, r4)
            return
        L_0x050c:
            java.lang.Object r3 = r5.A00
            X.39Q r3 = (X.AnonymousClass39Q) r3
            java.lang.String r2 = "user"
            java.lang.Object r1 = r5.A01
            X.4TU r1 = (X.AnonymousClass4TU) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            X.004 r0 = r3.A02
            java.lang.Object r0 = r0.get()
            X.1Bs r0 = (X.C24251Bs) r0
            r0.A01(r2)
            X.004 r0 = r3.A04
            java.lang.Object r0 = r0.get()
            X.1XW r0 = (X.AnonymousClass1XW) r0
            r0.A01()
            r1.onSuccess()
            return
        L_0x0534:
            java.lang.Object r9 = r5.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r9 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r9
            java.lang.Object r7 = r5.A01
            android.net.Network r7 = (android.net.Network) r7
            java.lang.String r3 = r5.A02
            java.lang.String r1 = "silent_auth_redirect_url_failed"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0614 }
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthUsingCarrierApi/network is null : "
            r2.append(r0)     // Catch:{ IOException -> 0x0614 }
            boolean r0 = X.AnonymousClass000.A1W(r7)
            X.C36331k8.A1S(r2, r0)     // Catch:{ IOException -> 0x0614 }
            X.13E r8 = r9.A0g     // Catch:{ IOException -> 0x0614 }
            java.lang.String r6 = X.AnonymousClass6JD.A0A     // Catch:{ IOException -> 0x0614 }
            java.net.URL r0 = X.C90524aI.A0j(r3)     // Catch:{ IOException -> 0x0614 }
            if (r7 != 0) goto L_0x05ba
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ IOException -> 0x0614 }
        L_0x055e:
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x0614 }
            r0 = 0
            r5.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0614 }
            X.C90464aC.A1S(r5)     // Catch:{ IOException -> 0x0614 }
            r5.connect()     // Catch:{ IOException -> 0x0614 }
            int r0 = r5.getResponseCode()     // Catch:{ IOException -> 0x0614 }
            r4 = 0
        L_0x056f:
            int r2 = r0 / 100
            r0 = 3
            if (r2 != r0) goto L_0x05bf
            r0 = 10
            if (r4 >= r0) goto L_0x05bf
            java.lang.String r0 = "Location"
            java.lang.String r3 = r5.getHeaderField(r0)     // Catch:{ IOException -> 0x0614 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x0614 }
            if (r0 != 0) goto L_0x05bf
            boolean r0 = r3.matches(r6)     // Catch:{ IOException -> 0x0614 }
            if (r0 != 0) goto L_0x05bf
            X.0ww r2 = r8.A00     // Catch:{ IOException -> 0x0595 }
            r0 = 23
            X.5RE r0 = X.AnonymousClass5RE.A00(r2, r5, r0)     // Catch:{ IOException -> 0x0595 }
            X.AnonymousClass14X.A02(r0)     // Catch:{ IOException -> 0x0595 }
        L_0x0595:
            r5.disconnect()     // Catch:{ IOException -> 0x0614 }
            java.net.URL r0 = X.C90524aI.A0j(r3)     // Catch:{ IOException -> 0x0614 }
            if (r7 != 0) goto L_0x05b5
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ IOException -> 0x0614 }
        L_0x05a2:
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x0614 }
            r0 = 0
            r5.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x0614 }
            X.C90464aC.A1S(r5)     // Catch:{ IOException -> 0x0614 }
            r5.connect()     // Catch:{ IOException -> 0x0614 }
            int r0 = r5.getResponseCode()     // Catch:{ IOException -> 0x0614 }
            int r4 = r4 + 1
            goto L_0x056f
        L_0x05b5:
            java.net.URLConnection r5 = r7.openConnection(r0)     // Catch:{ IOException -> 0x0614 }
            goto L_0x05a2
        L_0x05ba:
            java.net.URLConnection r5 = r7.openConnection(r0)     // Catch:{ IOException -> 0x0614 }
            goto L_0x055e
        L_0x05bf:
            r0 = 0
            X.6v1 r3 = new X.6v1     // Catch:{ IOException -> 0x0614 }
            r3.<init>(r0, r5)     // Catch:{ IOException -> 0x0614 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0614 }
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthUsingCarrierApi/returned code : "
            r2.append(r0)     // Catch:{ IOException -> 0x0614 }
            java.net.HttpURLConnection r3 = r3.A01     // Catch:{ IOException -> 0x0614 }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x0614 }
            X.C36321k7.A1Y(r2, r0)     // Catch:{ IOException -> 0x0614 }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x0614 }
            int r2 = r0 / 100
            r0 = 3
            if (r2 != r0) goto L_0x0623
            java.lang.String r0 = "Location"
            java.lang.String r2 = r3.getHeaderField(r0)     // Catch:{ IOException -> 0x0614 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x0614 }
            if (r0 != 0) goto L_0x0609
            byte[] r2 = r2.getBytes()     // Catch:{ IOException -> 0x0614 }
            r0 = 2
            java.lang.String r11 = android.util.Base64.encodeToString(r2, r0)     // Catch:{ IOException -> 0x0614 }
            java.lang.String r12 = r9.A1D     // Catch:{ IOException -> 0x0614 }
            java.lang.String r13 = r9.A1F     // Catch:{ IOException -> 0x0614 }
            java.lang.String r14 = "silent_auth"
            X.0v5 r0 = r9.A0K     // Catch:{ IOException -> 0x0614 }
            X.AnonymousClass3MJ.A00(r0)     // Catch:{ IOException -> 0x0614 }
            X.2d1 r10 = r9.A0u     // Catch:{ IOException -> 0x0614 }
            r15 = 0
            r16 = 2
            r9.A3l(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x0614 }
            return
        L_0x0609:
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthUsingCarrierApi/redirectUrl is null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0614 }
            X.0v0 r0 = r9.A09     // Catch:{ IOException -> 0x0614 }
            r0.A1Y(r1)     // Catch:{ IOException -> 0x0614 }
            goto L_0x0623
        L_0x0614:
            r2 = move-exception
            X.0v0 r0 = r9.A09
            r0.A1Y(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthUsingCarrierApi/IOException : "
            X.C36321k7.A1J(r2, r0, r1)
        L_0x0623:
            X.3TX r3 = r9.A0z
            java.lang.String r2 = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0J(r9)
            java.lang.String r1 = "ipification_auth_failure"
            java.lang.String r0 = "http_response_failure"
            r3.A0A(r2, r1, r0)
            int r0 = r9.A04
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1E(r9, r0)
            return
        L_0x0636:
            java.lang.Object r4 = r5.A00
            X.3dK r4 = (X.C69313dK) r4
            java.lang.String r3 = r5.A02
            java.lang.Object r2 = r5.A01
            X.4Te r2 = (X.C88564Te) r2
            X.2V5 r1 = r4.A09
            X.3mW r0 = new X.3mW
            r0.<init>(r2, r4, r3)
            r1.Blp(r0)
            return
        L_0x064b:
            java.lang.Object r1 = r5.A00
            X.5Ar r1 = (X.C104665Ar) r1
            java.lang.String r2 = r5.A02
            java.lang.Object r0 = r5.A01
            X.6c4 r0 = (X.C135066c4) r0
            java.lang.String r3 = r0.A0H
            java.lang.String r4 = r0.A09
            java.lang.String r5 = r0.A07
            java.lang.String r6 = r0.A0D
            java.lang.String r7 = r0.A0C
            int r9 = r0.A00
            int r10 = r0.A03
            int r11 = r0.A02
            java.lang.String r8 = r0.A08
            boolean r12 = r0.A0M
            boolean r13 = r0.A0N
            r1.A0K(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x066f:
            java.lang.Object r0 = r5.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r0
            java.lang.Object r2 = r5.A01
            X.6CW r2 = (X.AnonymousClass6CW) r2
            java.lang.String r1 = r5.A02
            android.widget.ImageView r0 = r0.A02
            r2.A01(r0, r1)
            return
        L_0x067f:
            java.lang.Object r2 = r5.A00
            com.whatsapp.wabloks.base.FdsContentFragmentManager r2 = (com.whatsapp.wabloks.base.FdsContentFragmentManager) r2
            java.lang.Object r1 = r5.A01
            X.02E r1 = (X.AnonymousClass02E) r1
            java.lang.String r0 = r5.A02
            com.whatsapp.wabloks.base.FdsContentFragmentManager.A00(r1, r2, r0)
            return
        L_0x068d:
            java.lang.Object r6 = r5.A00
            X.6tl r6 = (X.C145356tl) r6
            java.lang.Object r4 = r5.A01
            java.lang.String r3 = r5.A02
            X.6MG r2 = r6.A01
            java.lang.String r1 = r6.A0D
            java.lang.String r0 = r6.A0B
            X.5Ab r2 = r2.A01(r1, r0, r3)
            r1 = 4
            goto L_0x06b4
        L_0x06a1:
            java.lang.Object r6 = r5.A00
            X.6tm r6 = (X.C145366tm) r6
            java.lang.Object r4 = r5.A01
            java.lang.String r3 = r5.A02
            X.6MG r2 = r6.A01
            java.lang.String r1 = r6.A0G
            java.lang.String r0 = r6.A0E
            X.5Ab r2 = r2.A01(r1, r0, r3)
            r1 = 5
        L_0x06b4:
            X.6jd r0 = new X.6jd
            r0.<init>(r4, r6, r1)
            r2.Blp(r0)
            return
        L_0x06bd:
            java.lang.Object r4 = r5.A00
            java.lang.Object r1 = r5.A01
            X.7fl r1 = (X.C158077fl) r1
            java.lang.String r3 = r5.A02
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.7ku r2 = r1.B7y()
            X.4vP r1 = X.C142326oh.A03(r4)
            X.68b r0 = X.C1273868b.A01(r3)
            X.C1273868b.A07(r1, r0, r2)
            return
        L_0x06d9:
            java.lang.String r2 = r5.A02
            java.lang.Object r1 = r5.A00
            X.14u r1 = (X.C225314u) r1
            java.lang.Object r4 = r5.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            java.net.URL r0 = X.C90524aI.A0j(r2)     // Catch:{ MalformedURLException -> 0x0701, IOException -> 0x0705 }
            java.io.InputStream r0 = r0.openStream()     // Catch:{ MalformedURLException -> 0x0701, IOException -> 0x0705 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ MalformedURLException -> 0x0701, IOException -> 0x0705 }
            android.graphics.drawable.BitmapDrawable r3 = X.C36421kH.A0C(r1, r0)     // Catch:{ MalformedURLException -> 0x0701, IOException -> 0x0705 }
            X.17Y r2 = r1.A05     // Catch:{ MalformedURLException -> 0x0701, IOException -> 0x0705 }
            r1 = 2
            X.72x r0 = new X.72x     // Catch:{ MalformedURLException -> 0x0701, IOException -> 0x0705 }
            r0.<init>(r3, r4, r1)     // Catch:{ MalformedURLException -> 0x0701, IOException -> 0x0705 }
            r2.A0H(r0)     // Catch:{ MalformedURLException -> 0x0701, IOException -> 0x0705 }
            return
        L_0x0701:
            r1 = move-exception
            java.lang.String r0 = "AccountLinkingNativeAuthActivity/initProfilePic Invalid pic url"
            goto L_0x0708
        L_0x0705:
            r1 = move-exception
            java.lang.String r0 = "AccountLinkingNativeAuthActivity/initProfilePic Unable to download profile pic"
        L_0x0708:
            X.AnonymousClass1UT.A01(r0, r1)
            return
        L_0x070c:
            java.lang.Object r6 = r5.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r6 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r6
            java.lang.Object r2 = r5.A01
            android.net.Network r2 = (android.net.Network) r2
            java.lang.String r1 = r5.A02
            java.lang.String r3 = "silent_auth_failed"
            if (r2 != 0) goto L_0x071b
            goto L_0x0737
        L_0x071b:
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/attempt request on cellular"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x07d9 }
            java.net.URL r0 = X.C90524aI.A0j(r1)     // Catch:{ IOException -> 0x07d9 }
            java.net.URLConnection r1 = r2.openConnection(r0)     // Catch:{ IOException -> 0x07d9 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x07d9 }
            X.C90464aC.A1S(r1)     // Catch:{ IOException -> 0x07d9 }
            r1.connect()     // Catch:{ IOException -> 0x07d9 }
            r0 = 0
            X.6v1 r2 = new X.6v1     // Catch:{ IOException -> 0x07d9 }
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x07d9 }
            goto L_0x0742
        L_0x0737:
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/already on cellular"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x07d9 }
            X.13E r0 = r6.A0g     // Catch:{ IOException -> 0x07d9 }
            X.6v1 r2 = r0.A04(r1)     // Catch:{ IOException -> 0x07d9 }
        L_0x0742:
            java.net.HttpURLConnection r5 = r2.A01     // Catch:{ IOException -> 0x07d9 }
            int r1 = r5.getResponseCode()     // Catch:{ IOException -> 0x07d9 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x07b6
            X.0ww r1 = r6.A0S     // Catch:{ JSONException -> 0x07a6 }
            java.lang.Integer r0 = X.C36401kF.A0j()     // Catch:{ JSONException -> 0x07a6 }
            r10 = 0
            X.5RE r0 = r2.B8D(r1, r10, r0)     // Catch:{ JSONException -> 0x07a6 }
            org.json.JSONObject r1 = X.AnonymousClass14X.A01(r0)     // Catch:{ JSONException -> 0x07a6 }
            java.lang.String r0 = "available"
            boolean r0 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x07a6 }
            if (r0 == 0) goto L_0x078e
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/available"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ JSONException -> 0x07a6 }
            X.0v0 r1 = r6.A09     // Catch:{ JSONException -> 0x07a6 }
            java.lang.String r0 = "silent_auth_available"
            r1.A1Y(r0)     // Catch:{ JSONException -> 0x07a6 }
            X.3TX r2 = r6.A0z     // Catch:{ JSONException -> 0x07a6 }
            java.lang.String r1 = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0J(r6)     // Catch:{ JSONException -> 0x07a6 }
            java.lang.String r0 = "ipification_coverage_true"
            r2.A0A(r1, r0, r10)     // Catch:{ JSONException -> 0x07a6 }
            r12 = 0
            java.lang.String r7 = r6.A1D     // Catch:{ JSONException -> 0x07a6 }
            java.lang.String r8 = r6.A1F     // Catch:{ JSONException -> 0x07a6 }
            java.lang.String r9 = "silent_auth"
            X.0zN r1 = r6.A0e     // Catch:{ JSONException -> 0x07a6 }
            X.0v0 r0 = r6.A09     // Catch:{ JSONException -> 0x07a6 }
            X.2d2 r5 = X.C65983Uf.A08(r0, r1)     // Catch:{ JSONException -> 0x07a6 }
            r11 = r10
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A12(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ JSONException -> 0x07a6 }
            return
        L_0x078e:
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/not available"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ JSONException -> 0x07a6 }
            X.0v0 r1 = r6.A09     // Catch:{ JSONException -> 0x07a6 }
            java.lang.String r0 = "silent_auth_unavailable"
            r1.A1Y(r0)     // Catch:{ JSONException -> 0x07a6 }
            X.3TX r2 = r6.A0z     // Catch:{ JSONException -> 0x07a6 }
            java.lang.String r1 = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0J(r6)     // Catch:{ JSONException -> 0x07a6 }
            java.lang.String r0 = "ipification_coverage_false"
            r2.A0A(r1, r0, r10)     // Catch:{ JSONException -> 0x07a6 }
            goto L_0x07e8
        L_0x07a6:
            r2 = move-exception
            X.0v0 r0 = r6.A09     // Catch:{ IOException -> 0x07d9 }
            r0.A1Y(r3)     // Catch:{ IOException -> 0x07d9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x07d9 }
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/getJSONFromStream/JSONException: "
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ IOException -> 0x07d9 }
            goto L_0x07e8
        L_0x07b6:
            X.0v0 r0 = r6.A09     // Catch:{ IOException -> 0x07d9 }
            r0.A1Y(r3)     // Catch:{ IOException -> 0x07d9 }
            X.3TX r4 = r6.A0z     // Catch:{ IOException -> 0x07d9 }
            java.lang.String r2 = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0J(r6)     // Catch:{ IOException -> 0x07d9 }
            java.lang.String r1 = "ipification_coverage_failure"
            java.lang.String r0 = "http_response_failure"
            r4.A0A(r2, r1, r0)     // Catch:{ IOException -> 0x07d9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x07d9 }
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/returned code: "
            r1.append(r0)     // Catch:{ IOException -> 0x07d9 }
            int r0 = r5.getResponseCode()     // Catch:{ IOException -> 0x07d9 }
            X.C36351kA.A1R(r1, r0)     // Catch:{ IOException -> 0x07d9 }
            goto L_0x07e8
        L_0x07d9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/executeSilentAuthCoverageRequest/IOException : "
            X.C36321k7.A1J(r2, r0, r1)
            X.0v0 r0 = r6.A09
            r0.A1Y(r3)
        L_0x07e8:
            X.17Y r2 = r6.A05
            r0 = 16
            X.3wY r1 = new X.3wY
            r1.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r6, (int) r0)
        L_0x07f1:
            r2.A0H(r1)
            return
        L_0x07f5:
            X.71s r10 = r6.B1k()     // Catch:{ all -> 0x0848 }
            X.1A1 r0 = r9.A02     // Catch:{ all -> 0x083e }
            X.3T1 r0 = r0.A03(r1)     // Catch:{ all -> 0x083e }
            if (r0 == 0) goto L_0x0834
            boolean r0 = r0.A1P     // Catch:{ all -> 0x083e }
            if (r0 != 0) goto L_0x0834
            r5 = 0
        L_0x0806:
            int r0 = r11.size()     // Catch:{ all -> 0x083e }
            if (r5 >= r0) goto L_0x0834
            android.content.ContentValues r4 = X.C36441kJ.A0E()     // Catch:{ all -> 0x083e }
            java.lang.String r2 = "chat_row_id"
            X.163 r0 = r9.A00     // Catch:{ all -> 0x083e }
            long r0 = r0.A08(r7)     // Catch:{ all -> 0x083e }
            X.C36341k9.A0p(r4, r2, r0)     // Catch:{ all -> 0x083e }
            java.lang.String r2 = "message_row_id"
            long r0 = r8.A1N     // Catch:{ all -> 0x083e }
            X.C36341k9.A0p(r4, r2, r0)     // Catch:{ all -> 0x083e }
            java.lang.String r0 = "link_index"
            X.C36341k9.A0o(r4, r0, r5)     // Catch:{ all -> 0x083e }
            X.14e r3 = r6.A02     // Catch:{ all -> 0x083e }
            java.lang.String r2 = "message_link"
            r1 = 4
            java.lang.String r0 = "INSERT_MESSAGE_LINK_TABLE"
            r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x083e }
            int r5 = r5 + 1
            goto L_0x0806
        L_0x0834:
            r10.A00()     // Catch:{ all -> 0x083e }
            r10.close()     // Catch:{ all -> 0x0848 }
            r6.close()
            return
        L_0x083e:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0843 }
            goto L_0x0847
        L_0x0843:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0848 }
        L_0x0847:
            throw r1     // Catch:{ all -> 0x0848 }
        L_0x0848:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x084d }
            throw r1
        L_0x084d:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0852:
            r0 = 1
            r1.A09 = r0
            return
        L_0x0856:
            int r7 = r8.length     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            long r5 = r4.A00     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            long r0 = (long) r7     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            long r5 = r5 + r0
            r4.A00 = r5     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            r5 = 0
        L_0x085e:
            if (r5 >= r7) goto L_0x0870
            java.io.BufferedOutputStream r2 = r4.A05     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            int r1 = r7 - r5
            r0 = 10240(0x2800, float:1.4349E-41)
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            r2.write(r8, r5, r0)     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            int r5 = r5 + 10240
            goto L_0x085e
        L_0x0870:
            com.facebook.msys.mci.NetworkSession r8 = r4.A03     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            X.4qg r0 = new X.4qg     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            r0.<init>(r4, r7)     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            r8.executeInNetworkContext(r0)     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            long r5 = r4.A00     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            long r1 = r4.A01     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x088b
            X.4qf r0 = new X.4qf     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            r8.executeInNetworkContext(r0)     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
            return
        L_0x088b:
            java.io.ByteArrayOutputStream r10 = X.C90524aI.A0Q()     // Catch:{ IndexOutOfBoundsException -> 0x08cd, IllegalArgumentException -> 0x08cb, IOException -> 0x08c9 }
            X.AnonymousClass6SQ.A01(r4)     // Catch:{ all -> 0x08bf }
            X.6l9 r9 = r4.A08     // Catch:{ all -> 0x08bf }
            com.facebook.msys.mci.DataTask r0 = r4.A02     // Catch:{ all -> 0x08bf }
            java.lang.String r11 = r0.mTaskIdentifier     // Catch:{ all -> 0x08bf }
            java.net.HttpURLConnection r12 = r4.A06     // Catch:{ all -> 0x08bf }
            r13 = 1
            X.C140176l9.A02(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x08bf }
            com.facebook.msys.mci.UrlRequest r5 = r4.A04     // Catch:{ all -> 0x08bf }
            int r2 = r12.getResponseCode()     // Catch:{ all -> 0x08bf }
            java.util.Map r0 = r12.getHeaderFields()     // Catch:{ all -> 0x08bf }
            java.util.Map r0 = com.facebook.msys.mci.NetworkUtils.flattenHeaders((java.util.Map) r0)     // Catch:{ all -> 0x08bf }
            com.facebook.msys.mci.UrlResponse r1 = new com.facebook.msys.mci.UrlResponse     // Catch:{ all -> 0x08bf }
            r1.<init>(r5, r2, r0)     // Catch:{ all -> 0x08bf }
            r12.getResponseCode()     // Catch:{ all -> 0x08bf }
            byte[] r0 = r10.toByteArray()     // Catch:{ all -> 0x08bf }
            X.AnonymousClass6SQ.A00(r1, r4, r3, r0)     // Catch:{ all -> 0x08bf }
            r10.close()     // Catch:{ IndexOutOfBoundsException -> 0x08cd, IllegalArgumentException -> 0x08cb, IOException -> 0x08c9 }
            return
        L_0x08bf:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x08c4 }
            goto L_0x08c8
        L_0x08c4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IndexOutOfBoundsException -> 0x08cd, IllegalArgumentException -> 0x08cb, IOException -> 0x08c9 }
        L_0x08c8:
            throw r1     // Catch:{ IndexOutOfBoundsException -> 0x08cd, IllegalArgumentException -> 0x08cb, IOException -> 0x08c9 }
        L_0x08c9:
            r0 = move-exception
            goto L_0x08ce
        L_0x08cb:
            r0 = move-exception
            goto L_0x08ce
        L_0x08cd:
            r0 = move-exception
        L_0x08ce:
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x08d1, IllegalArgumentException -> 0x08d3, IOException -> 0x08cf }
        L_0x08cf:
            r2 = move-exception
            goto L_0x08d4
        L_0x08d1:
            r2 = move-exception
            goto L_0x08d4
        L_0x08d3:
            r2 = move-exception
        L_0x08d4:
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleUpdateStreamingTask"
            com.whatsapp.util.Log.e(r0, r2)
            com.facebook.msys.mci.UrlRequest r0 = r4.A04
            com.facebook.msys.mci.UrlResponse r1 = com.facebook.msys.mci.NetworkUtils.newErrorURLResponse(r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            X.AnonymousClass6SQ.A00(r1, r4, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502374m.run():void");
    }

    public C1502374m(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }
}
