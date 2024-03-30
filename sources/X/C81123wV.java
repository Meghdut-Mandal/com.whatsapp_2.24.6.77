package X;

import com.whatsapp.notification.PopupNotification;

/* renamed from: X.3wV  reason: invalid class name and case insensitive filesystem */
public class C81123wV implements Runnable {
    public Object A00;
    public final int A01;

    public C81123wV(PopupNotification popupNotification, int i) {
        this.A01 = i;
        if (37 - i != 0) {
            this.A00 = popupNotification;
        } else {
            this.A00 = popupNotification;
        }
    }

    public static void A00(AnonymousClass17Y r1, Object obj, int i) {
        r1.A0H(new C81123wV(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a3, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02fa, code lost:
        r4.A0H(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x030d, code lost:
        r1.BO5(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0310, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0320, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0323, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0337, code lost:
        r2.A06(r1, 1);
        com.whatsapp.notification.AndroidWear.A03(r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x033f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fe, code lost:
        r0 = X.C54812tb.A00(X.C51872oW.A02, r3, (java.lang.String) null, r2);
        r0.A00 = r5;
        X.C65443Sb.A00(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b1, code lost:
        if (r2.A02 != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c1, code lost:
        r2.postDelayed(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01de, code lost:
        X.C75853nu.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fc, code lost:
        X.C75863nv.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ff, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x01c5;
                case 1: goto L_0x01d3;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01e2;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01f7;
                case 6: goto L_0x0011;
                case 7: goto L_0x0011;
                case 8: goto L_0x007b;
                case 9: goto L_0x0007;
                case 10: goto L_0x00a5;
                case 11: goto L_0x0007;
                case 12: goto L_0x0007;
                case 13: goto L_0x0007;
                case 14: goto L_0x0200;
                case 15: goto L_0x02a7;
                case 16: goto L_0x0303;
                case 17: goto L_0x02cb;
                case 18: goto L_0x0303;
                case 19: goto L_0x02cb;
                case 20: goto L_0x020c;
                case 21: goto L_0x0286;
                case 22: goto L_0x028b;
                case 23: goto L_0x029c;
                case 24: goto L_0x00b1;
                case 25: goto L_0x00dd;
                case 26: goto L_0x02a7;
                case 27: goto L_0x02b2;
                case 28: goto L_0x02cb;
                case 29: goto L_0x02d7;
                case 30: goto L_0x02e2;
                case 31: goto L_0x0303;
                case 32: goto L_0x0311;
                case 33: goto L_0x0319;
                case 34: goto L_0x0324;
                case 35: goto L_0x032e;
                case 36: goto L_0x0340;
                case 37: goto L_0x010b;
                case 38: goto L_0x011f;
                case 39: goto L_0x018b;
                case 40: goto L_0x0353;
                case 41: goto L_0x01a6;
                case 42: goto L_0x035b;
                case 43: goto L_0x0364;
                case 44: goto L_0x0371;
                case 45: goto L_0x038a;
                case 46: goto L_0x0392;
                case 47: goto L_0x03b3;
                case 48: goto L_0x03cf;
                case 49: goto L_0x03d7;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A00
            X.3Ga r0 = (X.C62403Ga) r0
            X.17Y r0 = r0.A01
        L_0x000d:
            r0.A02()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r5 = r3.A00
            X.3cn r5 = (X.C68993cn) r5
            boolean r0 = r5 instanceof X.AnonymousClass2YI
            if (r0 == 0) goto L_0x0032
            X.1Ow r0 = r5.A03
            X.19A r0 = r0.A03
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x0032
            X.8fO r2 = new X.8fO
            r2.<init>()
        L_0x0028:
            r1 = 0
            X.9jD r0 = new X.9jD
            r0.<init>(r2, r1)
            r5.A04(r0)
            return
        L_0x0032:
            X.1Ow r1 = r5.A03
            X.9JF r0 = r5.A00()
            X.9fL r1 = r1.A01(r0)
            X.4KN r0 = new X.4KN
            r0.<init>(r1)
            X.8dW r3 = new X.8dW
            r3.<init>(r0)
            r5.A00 = r3
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r4 = r3.A07(r0, r2)
            r3 = 0
            boolean r0 = r4 instanceof X.AnonymousClass03N
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0074
            r2 = r4
            X.8dX r2 = (X.C177278dX) r2
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x006b
            org.json.JSONArray r1 = r2.A01
            X.9jD r0 = new X.9jD
            r0.<init>(r3, r1)
            boolean r0 = r5.A04(r0)
            if (r0 == 0) goto L_0x0074
        L_0x006b:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0074
            X.9Y8 r0 = r2.A00
            r5.A02(r0)
        L_0x0074:
            java.lang.Throwable r2 = X.AnonymousClass0AK.A00(r4)
            if (r2 == 0) goto L_0x0010
            goto L_0x0028
        L_0x007b:
            java.lang.Object r5 = r3.A00
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r5 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r5
            X.00T r0 = r5.A09
            X.1Uw r4 = X.C36431kI.A0i(r0)
            if (r4 == 0) goto L_0x0010
            X.1ZV r0 = r5.A01
            if (r0 == 0) goto L_0x0443
            X.2p0 r3 = X.C52172p0.FULL
            java.util.List r0 = r0.A01(r3, r4)
            java.util.List r0 = r5.A49(r0)
            r5.A06 = r0
            X.1ZV r2 = r5.A01
            if (r2 == 0) goto L_0x043c
            r1 = 1
            X.3ns r0 = new X.3ns
            r0.<init>(r5)
            r2.A00(r3, r4, r0, r1)
            return
        L_0x00a5:
            java.lang.Object r1 = r3.A00
            X.3Ga r1 = (X.C62403Ga) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.17Y r0 = r1.A01
            goto L_0x000d
        L_0x00b1:
            java.lang.Object r5 = r3.A00
            com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet r5 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet) r5
            android.content.Context r0 = r5.A1D()
            android.app.Activity r0 = X.C36381kD.A0A(r0)
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r0)
            java.lang.Object r4 = r0.get()
            X.01I r4 = (X.AnonymousClass01I) r4
            if (r4 == 0) goto L_0x0010
            r0 = 2131886140(0x7f12003c, float:1.940685E38)
            java.lang.String r3 = r5.A0n(r0)
            X.0wQ r0 = r5.A01
            if (r0 == 0) goto L_0x044a
            X.13w r0 = r0.A09()
            java.util.List r2 = X.C36371kC.A11(r0)
            goto L_0x00fe
        L_0x00dd:
            java.lang.Object r5 = r3.A00
            com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet r5 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet) r5
            android.content.Context r0 = r5.A1D()
            android.app.Activity r0 = X.C36381kD.A0A(r0)
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r0)
            java.lang.Object r4 = r0.get()
            X.01I r4 = (X.AnonymousClass01I) r4
            if (r4 == 0) goto L_0x0010
            r0 = 2131886141(0x7f12003d, float:1.9406852E38)
            java.lang.String r3 = r5.A0n(r0)
            X.09w r2 = X.C023409w.A00
        L_0x00fe:
            r1 = 0
            X.2oW r0 = X.C51872oW.ACCEPT_INVITE
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C54812tb.A00(r0, r3, r1, r2)
            r0.A00 = r5
            X.C65443Sb.A00(r0, r4)
            return
        L_0x010b:
            java.lang.Object r1 = r3.A00
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            android.os.PowerManager$WakeLock r0 = r1.A04
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L_0x0010
            android.os.PowerManager$WakeLock r0 = r1.A04
            r0.release()
            return
        L_0x011f:
            java.lang.Object r2 = r3.A00
            com.whatsapp.notification.PopupNotification r2 = (com.whatsapp.notification.PopupNotification) r2
            android.hardware.SensorEventListener r1 = r2.A02
            if (r1 == 0) goto L_0x012c
            android.hardware.SensorManager r0 = r2.A03
            r0.unregisterListener(r1)
        L_0x012c:
            r0 = 0
            r2.A02 = r0
            android.hardware.Sensor r0 = r2.A01
            if (r0 == 0) goto L_0x0185
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "popupnotification/proximity:"
            r1.append(r0)
            float r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = " max:"
            r1.append(r0)
            android.hardware.Sensor r0 = r2.A01
            float r0 = r0.getMaximumRange()
            r1.append(r0)
            X.C36411kG.A1P(r1)
            float r1 = r2.A00
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0164
            android.hardware.Sensor r0 = r2.A01
            float r0 = r0.getMaximumRange()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
        L_0x0164:
            java.lang.String r0 = "popupnotification/wakeup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.PowerManager$WakeLock r0 = r2.A04
            if (r0 == 0) goto L_0x0178
            boolean r0 = r0.isHeld()
            if (r0 != 0) goto L_0x0178
            android.os.PowerManager$WakeLock r0 = r2.A04
            r0.acquire()
        L_0x0178:
            android.os.Handler r3 = r2.A1U
            java.lang.Runnable r2 = r2.A1W
            r3.removeCallbacks(r2)
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x0185:
            java.lang.String r0 = "popupnotification/no proximity sensor"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0164
        L_0x018b:
            java.lang.Object r2 = r3.A00
            X.9KS r2 = (X.AnonymousClass9KS) r2
            com.whatsapp.numberkeyboard.NumberEntryKeyboard r1 = r2.A02
            int r0 = com.whatsapp.numberkeyboard.NumberEntryKeyboard.A0J
            java.util.Map r0 = r1.A0B
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r1.invalidate()
            android.os.Handler r2 = r2.A00
            r0 = 16
            goto L_0x01c1
        L_0x01a6:
            java.lang.Object r2 = r3.A00
            X.2Z9 r2 = (X.AnonymousClass2Z9) r2
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x01b3
            boolean r1 = r2.A02
            r0 = 1
            if (r1 == 0) goto L_0x01b4
        L_0x01b3:
            r0 = 0
        L_0x01b4:
            r2.A02 = r0
            r2.invalidate()
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0010
            android.os.Handler r2 = r2.A00
            r0 = 500(0x1f4, double:2.47E-321)
        L_0x01c1:
            r2.postDelayed(r3, r0)
            return
        L_0x01c5:
            java.lang.Object r1 = r3.A00
            X.3nu r1 = (X.C75853nu) r1
            X.C75853nu.A01(r1)
            r0 = 0
            r1.A01 = r0
            X.C75853nu.A02(r1)
            return
        L_0x01d3:
            java.lang.Object r1 = r3.A00
            X.3nu r1 = (X.C75853nu) r1
            r0 = 1
            goto L_0x01de
        L_0x01d9:
            java.lang.Object r1 = r3.A00
            X.3nu r1 = (X.C75853nu) r1
            r0 = 0
        L_0x01de:
            X.C75853nu.A03(r1, r0)
            return
        L_0x01e2:
            java.lang.Object r1 = r3.A00
            X.3nv r1 = (X.C75863nv) r1
            r0 = 1
            X.C75863nv.A02(r1, r0)
            r0 = 0
            r1.A01 = r0
            X.C75863nv.A01(r1)
            return
        L_0x01f1:
            java.lang.Object r1 = r3.A00
            X.3nv r1 = (X.C75863nv) r1
            r0 = 1
            goto L_0x01fc
        L_0x01f7:
            java.lang.Object r1 = r3.A00
            X.3nv r1 = (X.C75863nv) r1
            r0 = 0
        L_0x01fc:
            X.C75863nv.A03(r1, r0)
            return
        L_0x0200:
            java.lang.Object r1 = r3.A00
            X.7jd r1 = (X.C159607jd) r1
            X.00f r0 = X.C000400e.A0D()
            r1.BiH(r0)
            return
        L_0x020c:
            java.lang.Object r6 = r3.A00
            com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity r6 = (com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity) r6
            r12 = 0
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.6Tg r2 = new X.6Tg
            r2.<init>()
            X.1A5 r1 = r6.A04
            if (r1 == 0) goto L_0x027f
            X.1Uw r0 = r6.A07
            java.lang.String r3 = "jid"
            if (r0 != 0) goto L_0x0229
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0229:
            X.141 r1 = r1.A01(r0)
            X.171 r0 = r6.A02
            if (r0 == 0) goto L_0x027a
            java.lang.String r10 = r0.A0H(r1)
            if (r10 != 0) goto L_0x0239
            java.lang.String r10 = ""
        L_0x0239:
            X.1Uw r8 = r6.A07
            if (r8 != 0) goto L_0x0242
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0242:
            X.2pG r9 = X.C52332pG.LINK_CARD
            X.3Jw r7 = new X.3Jw
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            X.005 r0 = r6.A0A
            if (r0 == 0) goto L_0x0273
            java.lang.Object r0 = r0.get()
            X.3lC r0 = (X.C74183lC) r0
            X.6QO r1 = r0.A03(r6, r1, r7)
            if (r1 == 0) goto L_0x0268
            java.io.File r0 = r1.A08()
            if (r0 == 0) goto L_0x0268
            android.net.Uri r0 = r1.A0J
            r5.add(r0)
            r2.A06(r1)
        L_0x0268:
            X.17Y r4 = r6.A05
            r0 = 18
            X.736 r3 = new X.736
            r3.<init>(r6, r5, r2, r0)
            goto L_0x02fa
        L_0x0273:
            java.lang.String r0 = "newsletterStatusMediaGenerator"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x027a:
            java.lang.RuntimeException r0 = X.C36331k8.A0c()
            throw r0
        L_0x027f:
            java.lang.String r0 = "conversationContactManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0286:
            java.lang.Object r1 = r3.A00
            X.14u r1 = (X.C225314u) r1
            goto L_0x02a3
        L_0x028b:
            java.lang.Object r0 = r3.A00
            X.14u r0 = (X.C225314u) r0
            r2 = 0
            r0.Bnv()
            X.17Y r1 = r0.A05
            r0 = 2131891346(0x7f121492, float:1.941741E38)
            r1.A06(r0, r2)
            return
        L_0x029c:
            java.lang.Object r1 = r3.A00
            X.14u r1 = (X.C225314u) r1
            r1.Bnv()
        L_0x02a3:
            r0 = 2131888507(0x7f12097b, float:1.9411651E38)
            goto L_0x030d
        L_0x02a7:
            java.lang.Object r1 = r3.A00
            X.14u r1 = (X.C225314u) r1
            r1.Bnv()
            r0 = 2131891345(0x7f121491, float:1.9417407E38)
            goto L_0x030d
        L_0x02b2:
            java.lang.Object r1 = r3.A00
            X.14u r1 = (X.C225314u) r1
            r1.Bnv()
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r4 = r2
            r1.Btr(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x02cb:
            java.lang.Object r1 = r3.A00
            X.14u r1 = (X.C225314u) r1
            r1.Bnv()
            r0 = -1
            r1.setResult(r0)
            goto L_0x0320
        L_0x02d7:
            java.lang.Object r1 = r3.A00
            X.14u r1 = (X.C225314u) r1
            r1.Bnv()
            r0 = 2131891508(0x7f121534, float:1.9417738E38)
            goto L_0x030d
        L_0x02e2:
            java.lang.Object r2 = r3.A00
            X.8mT r2 = (X.C180818mT) r2
            X.171 r1 = r2.A05
            if (r1 == 0) goto L_0x02fe
            X.141 r0 = r2.A3j()
            java.lang.String r1 = r1.A0H(r0)
            X.17Y r4 = r2.A05
            r0 = 6
            X.74v r3 = new X.74v
            r3.<init>(r0, r1, r2)
        L_0x02fa:
            r4.A0H(r3)
            return
        L_0x02fe:
            java.lang.RuntimeException r0 = X.C36331k8.A0c()
            throw r0
        L_0x0303:
            java.lang.Object r1 = r3.A00
            X.14u r1 = (X.C225314u) r1
            r1.Bnv()
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
        L_0x030d:
            r1.BO5(r0)
            return
        L_0x0311:
            java.lang.Object r0 = r3.A00
            X.14u r0 = (X.C225314u) r0
            r0.Bnv()
            return
        L_0x0319:
            java.lang.Object r1 = r3.A00
            com.whatsapp.newsletter.ui.waitlist.NewsletterWaitListActivity r1 = (com.whatsapp.newsletter.ui.waitlist.NewsletterWaitListActivity) r1
            r0 = 0
            r1.A02 = r0
        L_0x0320:
            r1.finish()
            return
        L_0x0324:
            java.lang.Object r3 = r3.A00
            com.whatsapp.notification.AndroidWear r3 = (com.whatsapp.notification.AndroidWear) r3
            X.17Y r2 = r3.A00
            r1 = 2131894877(0x7f12225d, float:1.9424571E38)
            goto L_0x0337
        L_0x032e:
            java.lang.Object r3 = r3.A00
            com.whatsapp.notification.AndroidWear r3 = (com.whatsapp.notification.AndroidWear) r3
            X.17Y r2 = r3.A00
            r1 = 2131887537(0x7f1205b1, float:1.9409684E38)
        L_0x0337:
            r0 = 1
            r2.A06(r1, r0)
            r0 = 0
            com.whatsapp.notification.AndroidWear.A03(r3, r0)
            return
        L_0x0340:
            java.lang.Object r3 = r3.A00
            com.whatsapp.notification.DirectReplyService r3 = (com.whatsapp.notification.DirectReplyService) r3
            X.17Y r2 = r3.A00
            r1 = 2131887537(0x7f1205b1, float:1.9409684E38)
            r0 = 1
            r2.A06(r1, r0)
            X.1Si r0 = r3.A07
            r0.A09()
            return
        L_0x0353:
            java.lang.Object r0 = r3.A00
            X.22s r0 = (X.AnonymousClass22s) r0
            X.AnonymousClass22s.A03(r0)
            return
        L_0x035b:
            java.lang.Object r1 = r3.A00
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            r1.setLayoutTransition(r0)
            return
        L_0x0364:
            java.lang.Object r1 = r3.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 1
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x0371:
            java.lang.Object r3 = r3.A00
            com.whatsapp.passkey.PasskeyCreateEducationScreen r3 = (com.whatsapp.passkey.PasskeyCreateEducationScreen) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.3NA r2 = new X.3NA
            r2.<init>(r3)
            X.4Ct r1 = new X.4Ct
            r1.<init>(r3)
            r0 = 2131892115(0x7f121793, float:1.941897E38)
            X.AnonymousClass3NA.A00(r2, r1, r0)
            return
        L_0x038a:
            java.lang.Object r0 = r3.A00
            X.2ZN r0 = (X.AnonymousClass2ZN) r0
            r0.A00()
            return
        L_0x0392:
            java.lang.Object r0 = r3.A00
            com.whatsapp.payments.CheckFirstTransaction r0 = (com.whatsapp.payments.CheckFirstTransaction) r0
            X.3ty r6 = r0.A00
            X.1EU r0 = r0.A01
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r0 = r0.A05
            long r4 = r0.A0G()
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x03ab
            r0 = 1
        L_0x03ab:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0C(r0)
            return
        L_0x03b3:
            java.lang.Object r3 = r3.A00
            X.8r6 r3 = (X.C183628r6) r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: rejectCollect; request is expired; transaction id: "
            r2.append(r0)
            X.9lY r1 = r3.A01
            java.lang.String r0 = r1.A0K
            X.C36321k7.A1a(r2, r0)
            X.AE4 r0 = r3.A03
            X.1Ed r0 = r0.A02
            r0.A0W(r1)
            return
        L_0x03cf:
            java.lang.Object r0 = r3.A00
            X.8jE r0 = (X.C179128jE) r0
            r0.A3v()
            return
        L_0x03d7:
            java.lang.Object r6 = r3.A00
            com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity r6 = (com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity) r6
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.16D r0 = r6.A09
            r0.A0i(r5)
            X.9Ul r4 = r6.A03
            r0 = 17
            X.411 r3 = new X.411
            r3.<init>(r6, r0)
            r2 = 16
            X.411 r1 = new X.411
            r1.<init>(r6, r2)
            X.411 r0 = new X.411
            r0.<init>(r6, r2)
            X.38c r8 = new X.38c
            r8.<init>(r3, r1, r0, r5)
            X.19A r11 = r4.A04
            java.lang.String r14 = r11.A09()
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r5.iterator()
        L_0x040c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0423
            X.141 r0 = X.C36391kE.A0f(r2)
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r0)
            X.2l7 r0 = new X.2l7
            r0.<init>((com.whatsapp.jid.UserJid) r1)
            r3.add(r0)
            goto L_0x040c
        L_0x0423:
            X.8vG r10 = new X.8vG
            r10.<init>((java.lang.String) r14, (java.util.List) r3)
            X.17Y r7 = r4.A00
            X.1Vu r9 = r4.A09
            X.8gW r5 = new X.8gW
            r5.<init>(r6, r7, r8, r9, r10)
            r15 = 204(0xcc, float:2.86E-43)
            X.9nx r13 = r10.A00
            r16 = 0
            r12 = r5
            r11.A0E(r12, r13, r14, r15, r16)
            return
        L_0x043c:
            java.lang.String r0 = "newsletterSubscribersManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0443:
            java.lang.String r0 = "newsletterSubscribersManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x044a:
            java.lang.String r0 = "meManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81123wV.run():void");
    }

    public C81123wV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
