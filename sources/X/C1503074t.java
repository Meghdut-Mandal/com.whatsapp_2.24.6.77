package X;

import com.whatsapp.mediacomposer.MediaComposerActivity;

/* renamed from: X.74t  reason: invalid class name and case insensitive filesystem */
public class C1503074t implements Runnable {
    public Object A00;
    public final int A01;

    public C1503074t(C142466ov r1, int i) {
        this.A01 = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }

    public static void A00(C19770wU r1, Object obj, int i) {
        r1.Boy(new C1503074t(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0375, code lost:
        if (r8 == 15) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03a5, code lost:
        if (r3 >= r7.A05()) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x059b, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x05ee, code lost:
        if (r5 <= 0) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0618, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06c0, code lost:
        if (r4 <= 0) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06f8, code lost:
        r0.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07b6, code lost:
        com.whatsapp.location.LocationSharingService.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0839, code lost:
        r1.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x083c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x08d1, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x08e2, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x08e3, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x08e6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x09a7, code lost:
        r4.A0H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0a33, code lost:
        r3.postDelayed(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0a36, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0a50, code lost:
        r0.postDelayed(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0a53, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0388  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r8 = r30
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0720;
                case 2: goto L_0x004f;
                case 3: goto L_0x074e;
                case 4: goto L_0x0756;
                case 5: goto L_0x077c;
                case 6: goto L_0x0795;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x0207;
                case 10: goto L_0x079f;
                case 11: goto L_0x07a7;
                case 12: goto L_0x07af;
                case 13: goto L_0x07ba;
                case 14: goto L_0x0a3b;
                case 15: goto L_0x025c;
                case 16: goto L_0x07c4;
                case 17: goto L_0x07d8;
                case 18: goto L_0x0276;
                case 19: goto L_0x07e1;
                case 20: goto L_0x0809;
                case 21: goto L_0x0815;
                case 22: goto L_0x081d;
                case 23: goto L_0x0829;
                case 24: goto L_0x0831;
                case 25: goto L_0x083d;
                case 26: goto L_0x0857;
                case 27: goto L_0x03be;
                case 28: goto L_0x0882;
                case 29: goto L_0x088e;
                case 30: goto L_0x08a2;
                case 31: goto L_0x08aa;
                case 32: goto L_0x03d2;
                case 33: goto L_0x04d5;
                case 34: goto L_0x08cd;
                case 35: goto L_0x08d3;
                case 36: goto L_0x0031;
                case 37: goto L_0x0524;
                case 38: goto L_0x08d8;
                case 39: goto L_0x08e7;
                case 40: goto L_0x0930;
                case 41: goto L_0x08f5;
                case 42: goto L_0x09b9;
                case 43: goto L_0x053a;
                case 44: goto L_0x08fd;
                case 45: goto L_0x055d;
                case 46: goto L_0x06e4;
                case 47: goto L_0x0905;
                case 48: goto L_0x06fc;
                case 49: goto L_0x091d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r8.A00
            X.2sf r0 = (X.C54262sf) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.location.LiveLocationPrivacyActivity r0 = (com.whatsapp.location.LiveLocationPrivacyActivity) r0
            com.whatsapp.location.LiveLocationPrivacyActivity.A01(r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r2 = r8.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r2 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r2
            boolean r0 = r2.A0X
            if (r0 != 0) goto L_0x0012
            X.6Fs r0 = r2.A06
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r1 = r0.A02
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            X.6Fs r0 = r2.A06
            r0.A04()
            return
        L_0x0031:
            java.lang.Object r1 = r8.A00
            X.4ab r1 = (X.C90714ab) r1
            X.3J6 r0 = r1.A00
            java.lang.String r2 = "emojiSearchCoordinator"
            if (r0 != 0) goto L_0x0040
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r2)
            throw r1
        L_0x0040:
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0012
            X.3J6 r1 = r1.A00
            if (r1 != 0) goto L_0x0925
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r2)
            throw r1
        L_0x004f:
            java.lang.Object r7 = r8.A00
            X.6ov r7 = (X.C142466ov) r7
            boolean r0 = r7.A1U
            android.os.Handler r3 = r7.A0v
            java.lang.Runnable r2 = r7.A16
            if (r0 == 0) goto L_0x005f
            r0 = 500(0x1f4, double:2.47E-321)
            goto L_0x0a33
        L_0x005f:
            r3.removeCallbacks(r2)
            java.util.Map r0 = r7.A1A
            monitor-enter(r0)
            java.util.ArrayList r1 = X.C90494aF.A0g(r0)     // Catch:{ all -> 0x092a }
            r0.clear()     // Catch:{ all -> 0x092a }
            monitor-exit(r0)     // Catch:{ all -> 0x092a }
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0012
            X.6Nv r6 = r7.A0L()
            if (r6 == 0) goto L_0x0012
            X.5v3 r5 = r7.A0M
            java.util.List r9 = r7.A18
            java.util.HashSet r8 = X.C36441kJ.A16()
            java.util.Iterator r15 = r1.iterator()
        L_0x0085:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r10 = r15.next()
            X.3Kq r10 = (X.C63593Kq) r10
            java.util.Iterator r3 = r9.iterator()
        L_0x0095:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r4 = r3.next()
            X.6N8 r4 = (X.AnonymousClass6N8) r4
            java.util.List r11 = r4.A04
            java.util.Iterator r2 = r11.iterator()
        L_0x00a7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r2.next()
            X.3Kq r0 = (X.C63593Kq) r0
            com.whatsapp.jid.UserJid r1 = r0.A06
            com.whatsapp.jid.UserJid r0 = r10.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a7
            int r0 = r4.A00
            r3 = 1
            if (r0 == r3) goto L_0x016e
            X.1P6 r2 = r5.A02
            long r0 = r10.A05
            X.0wo r2 = r2.A04
            long r12 = X.C19970wo.A00(r2)
            long r12 = r12 - r0
            r1 = 600000(0x927c0, double:2.964394E-318)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            boolean r1 = X.C36401kF.A1U(r0)
            int r0 = r4.A01
            if (r0 == r3) goto L_0x00db
            r3 = 0
        L_0x00db:
            if (r1 != r3) goto L_0x016a
            int r1 = r11.size()
            r0 = 1
            if (r1 == r0) goto L_0x011c
            double r2 = r10.A00
            double r0 = r10.A01
            com.google.android.gms.maps.model.LatLng r0 = X.C90524aI.A0F(r2, r0)
            android.graphics.Point r14 = r6.A00(r0)
            com.google.android.gms.maps.model.LatLng r0 = r4.A00()
            android.graphics.Point r13 = r6.A00(r0)
            int r1 = r14.x
            int r0 = r13.x
            int r0 = X.AnonymousClass000.A05(r1, r0)
            double r2 = (double) r0
            float r0 = r5.A00
            double r0 = (double) r0
            r11 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r0 = r0 * r11
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x016a
            int r1 = r14.y
            int r0 = r13.y
            int r0 = X.AnonymousClass000.A05(r1, r0)
            double r2 = (double) r0
            float r0 = r5.A01
            double r0 = (double) r0
            double r0 = r0 * r11
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x016a
        L_0x011c:
            com.google.android.gms.maps.model.LatLng r0 = r4.A00()
            android.graphics.Point r2 = r6.A00(r0)
            java.util.Iterator r11 = r9.iterator()
        L_0x0128:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r10 = r11.next()
            X.6N8 r10 = (X.AnonymousClass6N8) r10
            if (r10 == r4) goto L_0x0128
            java.util.List r0 = r10.A04
            int r3 = r0.size()
            r0 = 2
            r1 = 1
            if (r3 > r0) goto L_0x0144
            int r0 = r10.A00
            if (r1 == r0) goto L_0x0128
        L_0x0144:
            com.google.android.gms.maps.model.LatLng r0 = r10.A00()
            android.graphics.Point r3 = r6.A00(r0)
            int r1 = r3.x
            int r0 = r2.x
            int r0 = X.AnonymousClass000.A05(r1, r0)
            float r1 = (float) r0
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0128
            int r1 = r3.y
            int r0 = r2.y
            int r0 = X.AnonymousClass000.A05(r1, r0)
            float r1 = (float) r0
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0128
        L_0x016a:
            X.C142466ov.A06(r7)
            return
        L_0x016e:
            r8.add(r4)
            goto L_0x0085
        L_0x0173:
            java.util.Iterator r6 = r8.iterator()
        L_0x0177:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0200
            java.lang.Object r2 = r6.next()
            X.6N8 r2 = (X.AnonymousClass6N8) r2
            r3 = r7
            X.7pD r3 = (X.C162827pD) r3
            int r0 = r3.A01
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r5 = r3.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r5 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r5
            java.util.Map r1 = r5.A0T
            java.lang.String r0 = r2.A03
            java.lang.Object r4 = r1.get(r0)
            X.6Fg r4 = (X.C129116Fg) r4
            if (r4 == 0) goto L_0x0177
            boolean r0 = r4.A09()
            if (r0 != 0) goto L_0x01a4
            r0 = 1
            r4.A08(r0)
        L_0x01a4:
            com.google.android.gms.maps.model.LatLng r0 = r2.A00()
            r4.A05(r0)
            java.lang.Object r3 = r4.A01()
            boolean r0 = r3 instanceof X.AnonymousClass6N8
            if (r0 == 0) goto L_0x0177
            X.6N8 r3 = (X.AnonymousClass6N8) r3
            int r1 = r3.A00
            int r0 = r2.A00
            if (r1 != r0) goto L_0x01c1
            int r1 = r3.A01
            int r0 = r2.A01
            if (r1 == r0) goto L_0x0177
        L_0x01c1:
            X.6ov r0 = r5.A0O
            android.graphics.Bitmap r0 = r0.A0G(r2)
            X.5iI r0 = X.C112965ek.A00(r0)
            r4.A04(r0)
            X.6ov r0 = r5.A0O
            java.lang.String r0 = r0.A0M(r2)
            r4.A07(r0)
            goto L_0x0177
        L_0x01d8:
            java.lang.Object r0 = r3.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity r0 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r0
            java.util.Map r1 = r0.A0S
            java.lang.String r0 = r2.A03
            java.lang.Object r1 = r1.get(r0)
            X.4q1 r1 = (X.C97634q1) r1
            if (r1 == 0) goto L_0x0177
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x01f0
            r0 = 1
            r1.A05(r0)
        L_0x01f0:
            com.google.android.gms.maps.model.LatLng r0 = r2.A00()
            X.6bv r0 = X.C134976bv.A02(r0)
            r1.A0A(r0)
            r3.A0N()
            goto L_0x0177
        L_0x0200:
            r7.A0N()
            X.4mZ r0 = r7.A0K
            goto L_0x06f8
        L_0x0207:
            java.lang.Object r3 = r8.A00
            X.6Zc r3 = (X.C133586Zc) r3
            r4 = 1
            r3.A0g = r4
            android.location.Location r1 = r3.A05
            if (r1 == 0) goto L_0x0227
            X.6c8 r0 = r3.A0W
            if (r0 != 0) goto L_0x0227
            float r0 = r1.getAccuracy()
            int r1 = (int) r0
            r0 = 100
            int r2 = java.lang.Math.max(r1, r0)
            android.location.Location r1 = r3.A05
            r0 = 0
            X.C133586Zc.A05(r1, r3, r0, r2, r4)
        L_0x0227:
            X.0yE r0 = r3.A18
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0012
            android.location.Location r0 = r3.A05
            if (r0 == 0) goto L_0x023d
            float r1 = r0.getAccuracy()
            r0 = 1128792064(0x43480000, float:200.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
        L_0x023d:
            X.0yb r0 = r3.A15
            android.location.LocationManager r1 = r0.A0C()
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 == 0) goto L_0x0255
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x0012
        L_0x0255:
            X.01L r1 = r3.A0P
            r0 = 2
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x025c:
            java.lang.Object r0 = r8.A00
            X.1Cb r0 = (X.C24341Cb) r0
            java.util.List r0 = r0.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0266:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r1.next()
            X.4QA r0 = (X.AnonymousClass4QA) r0
            r0.BhN()
            goto L_0x0266
        L_0x0276:
            java.lang.Object r0 = r8.A00
            X.4xN r0 = (X.C101334xN) r0
            X.1DT r6 = r0.A0D
            X.68C r4 = r0.A0f
            X.6Fk r7 = r0.A0j
            X.5z2 r3 = r0.A01
            X.0yC r1 = r6.A0D
            r0 = 5367(0x14f7, float:7.521E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.String r2 = r7.A0T
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x0012
            X.1E1 r0 = r6.A0K
            X.0u5 r0 = r0.A02
            if (r2 != 0) goto L_0x02a1
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x02aa
            return
        L_0x02a1:
            int r1 = r2.hashCode()
            int r0 = r0.A00
            int r1 = r1 % r0
            if (r1 != 0) goto L_0x0012
        L_0x02aa:
            X.2Sp r5 = new X.2Sp
            r5.<init>()
            r5.A0E = r2
            if (r3 != 0) goto L_0x03ac
            r2 = 0
        L_0x02b5:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A0D = r0
            int r3 = r7.A00
            boolean r0 = r4.A0Z
            r2 = 5
            if (r0 != 0) goto L_0x02cd
            r1 = 2
            r0 = 1
            r2 = 2
            if (r3 == r0) goto L_0x02cd
            r2 = 3
            if (r3 == r1) goto L_0x02cd
            if (r3 == r2) goto L_0x02cd
            r2 = 1
        L_0x02cd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.A04 = r0
            long r0 = r7.A05()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.AnonymousClass6UH.A02(r0)
            java.lang.Double r0 = X.C90524aI.A0Z(r0)
            r5.A01 = r0
            long r0 = r7.A06
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0A = r0
            long r0 = r7.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.AnonymousClass6UH.A02(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0B = r0
            java.lang.Boolean r0 = r7.A0H
            r5.A00 = r0
            long r0 = r4.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.AnonymousClass6UH.A02(r0)
            java.lang.Double r0 = X.C90524aI.A0Z(r0)
            r5.A03 = r0
            X.0wD r0 = r6.A03
            X.1M8 r0 = r0.A04()
            java.lang.Integer r0 = X.AnonymousClass1M9.A00(r0)
            r5.A05 = r0
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = r4.A0L
            int r0 = r6.A0D(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A06 = r0
            X.6Wx r0 = r7.A0G
            if (r0 != 0) goto L_0x03a9
            r0 = -1
        L_0x0332:
            int r8 = X.AnonymousClass6UH.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r5.A07 = r0
            int r0 = r4.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A09 = r0
            long r0 = r7.A09
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.AnonymousClass6UH.A02(r0)
            java.lang.Double r0 = X.C90524aI.A0Z(r0)
            r5.A02 = r0
            long r0 = r7.A0A
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = X.AnonymousClass6UH.A02(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0C = r0
            boolean r0 = r7.A0a
            if (r0 != 0) goto L_0x038c
            r1 = 4
        L_0x0369:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x036d:
            r5.A08 = r0
            r2 = 1
            if (r8 == r2) goto L_0x0377
            r1 = 15
            r0 = 1
            if (r8 != r1) goto L_0x0378
        L_0x0377:
            r0 = 0
        L_0x0378:
            X.0yW r1 = r6.A0E
            if (r0 == 0) goto L_0x0388
            X.0u5 r0 = new X.0u5
            r0.<init>(r2, r2)
            r1.Bls(r5, r0, r2)
        L_0x0384:
            r1.BP7()
            return
        L_0x0388:
            r1.Bly(r5)
            goto L_0x0384
        L_0x038c:
            long r3 = r7.A09
            long r1 = r7.A05()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0398
            r1 = 3
            goto L_0x0369
        L_0x0398:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a7
            long r1 = r7.A05()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 2
            if (r0 < 0) goto L_0x0369
        L_0x03a7:
            r0 = 0
            goto L_0x036d
        L_0x03a9:
            int r0 = r0.A01
            goto L_0x0332
        L_0x03ac:
            java.lang.String r0 = r3.A0D
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            long r2 = r0.getLeastSignificantBits()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r2 & r0
            goto L_0x02b5
        L_0x03be:
            java.lang.Object r2 = r8.A00
            X.6wC r2 = (X.C146806wC) r2
            X.64m r0 = r2.A0P
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0012
            X.6Fh r1 = r2.A0V
            r0 = 1
            r1.A07(r0)
            r2.A07()
            return
        L_0x03d2:
            java.lang.Object r7 = r8.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r7 = (com.whatsapp.mediacomposer.MediaComposerActivity) r7
            X.6tQ r6 = r7.A0k
            java.util.Collection r0 = X.AnonymousClass6VT.A02(r7)
            boolean r13 = X.AnonymousClass143.A0N(r0)
            java.util.Collection r0 = X.AnonymousClass6VT.A02(r7)
            boolean r9 = X.AnonymousClass143.A0L(r0)
            X.0yC r1 = r7.A0D
            r0 = 3306(0xcea, float:4.633E-42)
            int r10 = r1.A07(r0)
            java.util.HashSet r5 = r7.A1x
            X.6Tg r0 = r7.A1r
            java.util.Map r0 = r0.A00
            java.util.ArrayList r11 = X.C90494aF.A0g(r0)
            r4 = 3
            X.AnonymousClass00C.A0D(r5, r4)
            int r1 = r11.size()
            r3 = 0
            r0 = 20
            if (r1 < r0) goto L_0x0012
            X.0wD r1 = r6.A00
            int r0 = r1.A03(r3)
            r2 = 1
            if (r0 == r2) goto L_0x0012
            X.1M8 r0 = r1.A04()
            if (r0 == 0) goto L_0x0421
            java.util.Set r1 = X.C113285fI.A00
            java.lang.String r0 = r0.A01
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0421
            return
        L_0x0421:
            java.util.Iterator r18 = r11.iterator()
            r16 = 0
        L_0x0427:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x04c0
            java.lang.Object r14 = r18.next()
            X.6QO r14 = (X.AnonymousClass6QO) r14
            X.1Gn r0 = r6.A01
            int r0 = r0.A01(r14)
            if (r0 == r2) goto L_0x048d
            if (r0 != r4) goto L_0x0427
            java.io.File r12 = r14.A08()
            X.67y r21 = r14.A05()
            if (r12 == 0) goto L_0x0427
            if (r21 == 0) goto L_0x0427
            boolean r11 = r14.A0K()
            monitor-enter(r14)
            boolean r0 = r14.A0D     // Catch:{ all -> 0x092d }
            r19 = r0
            monitor-exit(r14)
            android.graphics.Point r0 = r14.A03()
            if (r0 == 0) goto L_0x048b
            int r0 = r0.x
        L_0x045b:
            long r0 = (long) r0
            r25 = r0
            android.graphics.Point r0 = r14.A03()
            if (r0 == 0) goto L_0x0489
            int r0 = r0.y
        L_0x0466:
            long r14 = (long) r0
            X.1GJ r0 = r6.A03
            if (r9 == 0) goto L_0x0486
            X.1Gl r1 = X.C25471Gl.A0X
        L_0x046d:
            boolean r29 = r0.A0I(r1, r12)
            X.6BV r20 = r0.A0E(r13, r11, r9)
            r22 = r12
            r23 = r25
            r25 = r14
            r27 = r11
            r28 = r19
            r19 = r0
            long r0 = r19.A0B(r20, r21, r22, r23, r25, r27, r28, r29)
            goto L_0x04b9
        L_0x0486:
            X.1Gl r1 = X.C25471Gl.A0i
            goto L_0x046d
        L_0x0489:
            r0 = 0
            goto L_0x0466
        L_0x048b:
            r0 = 0
            goto L_0x045b
        L_0x048d:
            android.net.Uri r11 = r14.A0J
            boolean r0 = r5.contains(r11)
            android.graphics.Rect r20 = r14.A04()
            r1 = 0
            if (r0 == 0) goto L_0x049b
            r1 = 3
        L_0x049b:
            X.1D1 r12 = r6.A02
            int[] r0 = new int[r2]
            r0[r3] = r1
            r23 = 0
            r21 = r11
            r22 = r0
            r24 = r13
            r19 = r12
            java.util.HashMap r0 = r19.A01(r20, r21, r22, r23, r24)
            java.lang.Object r0 = X.C90484aE.A0j(r0, r1)
            X.3JE r0 = (X.AnonymousClass3JE) r0
            if (r0 == 0) goto L_0x04bd
            long r0 = r0.A02
        L_0x04b9:
            long r16 = r16 + r0
            goto L_0x0427
        L_0x04bd:
            r0 = 0
            goto L_0x04b9
        L_0x04c0:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r16 = r16 / r0
            long r1 = (long) r10
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0012
            X.17Y r4 = r7.A05
            r0 = 31
            X.74t r2 = new X.74t
            r2.<init>((java.lang.Object) r8, (int) r0)
            goto L_0x09a7
        L_0x04d5:
            java.lang.Object r7 = r8.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r7 = (com.whatsapp.mediacomposer.VideoComposerFragment) r7
            X.3Qq r0 = r7.A0L
            if (r0 == 0) goto L_0x0012
            int r0 = r0.A04()
            long r5 = (long) r0
            long r3 = r7.A06
            r1 = 50
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0511
            boolean r0 = r7.A0Q
            if (r0 != 0) goto L_0x04fc
            r7.A1l()
        L_0x04f1:
            X.3Qq r3 = r7.A0L
            if (r3 == 0) goto L_0x0012
            long r1 = r7.A05
            int r0 = (int) r1
            r3.A0L(r0)
            return
        L_0x04fc:
            com.whatsapp.mediacomposer.VideoTimelineView r0 = r7.A0G
            if (r0 == 0) goto L_0x0503
            r0.invalidate()
        L_0x0503:
            X.3Qq r0 = r7.A0L
            if (r0 == 0) goto L_0x04f1
            android.view.View r0 = r0.A08()
            if (r0 == 0) goto L_0x04f1
            r0.postDelayed(r8, r1)
            goto L_0x04f1
        L_0x0511:
            com.whatsapp.mediacomposer.VideoTimelineView r0 = r7.A0G
            if (r0 == 0) goto L_0x0518
            r0.invalidate()
        L_0x0518:
            X.3Qq r0 = r7.A0L
            if (r0 == 0) goto L_0x0012
            android.view.View r0 = r0.A08()
            if (r0 == 0) goto L_0x0012
            goto L_0x0a50
        L_0x0524:
            java.lang.Object r1 = r8.A00
            X.3AZ r1 = (X.AnonymousClass3AZ) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.A00 = r0
            android.widget.PopupWindow r1 = r1.A03
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x0012
            r1.dismiss()
            return
        L_0x053a:
            java.lang.Object r2 = r8.A00
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r2 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r2
            com.whatsapp.WaTextView r1 = r2.A0C
            if (r1 != 0) goto L_0x0549
            java.lang.String r0 = "mediaQualityToolTip"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x0549:
            r0 = 4
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r2.A06
            if (r0 == 0) goto L_0x0012
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x0012
            r0 = 13
            X.C164757sK.A00(r1, r2, r0)
            return
        L_0x055d:
            java.lang.Object r3 = r8.A00
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r3
            X.5vG r8 = r3.getMediaQualityTooltipUtil()
            X.0v0 r7 = r8.A00
            long r4 = r7.A0Q()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r7.A0Q()
            long r4 = r4 - r0
            r1 = 1209600000(0x48190800, double:5.97621805E-315)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
            X.005 r4 = r7.A00
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r4)
            java.lang.String r9 = "media_quality_has_send_media"
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x059d
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r4)
            boolean r1 = X.C36371kC.A1U(r0, r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x05f4
        L_0x059d:
            X.1DF r0 = r8.A01
            X.12P r0 = r0.A08     // Catch:{ Exception -> 0x05e2 }
            X.1M0 r10 = r0.get()     // Catch:{ Exception -> 0x05e2 }
            X.14e r5 = r10.A02     // Catch:{ all -> 0x05d8 }
            java.lang.String r2 = "SELECT count(1) as count FROM available_message_view WHERE from_me = 1 AND message_type IN ('3', '1')"
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x05d8 }
            java.lang.String r0 = "SELECT_MY_PHOTO_AND_VIDEO_MESSAGES_COUNT"
            android.database.Cursor r2 = r5.A09(r2, r0, r1)     // Catch:{ all -> 0x05d8 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x05cc }
            if (r0 == 0) goto L_0x05c5
            java.lang.String r0 = "count"
            long r5 = X.C36351kA.A07(r2, r0)     // Catch:{ all -> 0x05cc }
            r2.close()     // Catch:{ all -> 0x05d8 }
            r10.close()     // Catch:{ Exception -> 0x05e2 }
            goto L_0x05e9
        L_0x05c5:
            r2.close()     // Catch:{ all -> 0x05d8 }
            r10.close()     // Catch:{ Exception -> 0x05e2 }
            goto L_0x05f0
        L_0x05cc:
            r1 = move-exception
            if (r2 == 0) goto L_0x05d7
            r2.close()     // Catch:{ all -> 0x05d3 }
            goto L_0x05d7
        L_0x05d3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05d8 }
        L_0x05d7:
            throw r1     // Catch:{ all -> 0x05d8 }
        L_0x05d8:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x05dd }
            goto L_0x05e1
        L_0x05dd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x05e2 }
        L_0x05e1:
            throw r1     // Catch:{ Exception -> 0x05e2 }
        L_0x05e2:
            r1 = move-exception
            java.lang.String r0 = "MediaMessageStore/getMediaSendFromMeCount/sql failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x05f0
        L_0x05e9:
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x05f1
        L_0x05f0:
            r1 = 0
        L_0x05f1:
            X.C36331k8.A18(r7, r9, r1)
        L_0x05f4:
            if (r1 == 0) goto L_0x0012
            long r12 = java.lang.System.currentTimeMillis()
            r0 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r12 = r12 - r0
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r4)
            java.lang.String r6 = "media_quality_has_send_hd_media"
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x061a
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r4)
            boolean r1 = X.C36371kC.A1U(r0, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x06c6
        L_0x061a:
            X.1DF r9 = r8.A01
            X.0yC r2 = r9.A0A
            r0 = 3068(0xbfc, float:4.299E-42)
            int r0 = r2.A07(r0)
            java.lang.String r11 = java.lang.String.valueOf(r0)
            r0 = 4171(0x104b, float:5.845E-42)
            int r0 = r2.A07(r0)
            java.lang.String r10 = java.lang.String.valueOf(r0)
            r0 = 4172(0x104c, float:5.846E-42)
            int r0 = r2.A07(r0)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            r0 = 4175(0x104f, float:5.85E-42)
            int r0 = r2.A07(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 9
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.String.valueOf(r12)
            X.C36331k8.A1N(r0, r11, r4)
            X.C90514aH.A1O(r11, r10, r4)
            X.C36381kD.A1L(r10, r5, r4)
            r0 = 6
            r4[r0] = r1
            r0 = 7
            r4[r0] = r1
            r0 = 8
            r4[r0] = r5
            X.12P r0 = r9.A08     // Catch:{ Exception -> 0x06b4 }
            X.1M0 r9 = r0.get()     // Catch:{ Exception -> 0x06b4 }
            r0 = 6261(0x1875, float:8.774E-42)
            boolean r0 = r2.A0E(r0)     // Catch:{ all -> 0x06aa }
            if (r0 == 0) goto L_0x067a
            X.14e r2 = r9.A02     // Catch:{ all -> 0x06aa }
            java.lang.String r1 = "SELECT count(1) as count FROM message_media  JOIN available_message_view  WHERE available_message_view.from_me = 1 AND message_media.message_row_id = available_message_view._id AND available_message_view.timestamp >= ? AND (((message_media.width >= ? OR message_media.height >= ?) AND available_message_view.message_type = '1') OR (available_message_view.message_type = '3' AND (message_media.width >= ? OR message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ?)))"
            java.lang.String r0 = "SELECT_MY_PHOTO_AND_VIDEO_MESSAGES_COUNT_BASED_ON_SIZE_A14"
            android.database.Cursor r2 = r2.A09(r1, r0, r4)     // Catch:{ all -> 0x06aa }
            goto L_0x0684
        L_0x067a:
            X.14e r2 = r9.A02     // Catch:{ all -> 0x06aa }
            java.lang.String r1 = "SELECT count(1) as count FROM message_media  JOIN available_message_view ON message_media.message_row_id = available_message_view._id  WHERE available_message_view.from_me = 1 AND available_message_view.timestamp >= ? AND (((message_media.width >= ? OR message_media.height >= ?) AND available_message_view.message_type = '1') OR (available_message_view.message_type = '3' AND (message_media.width >= ? OR message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ?)))"
            java.lang.String r0 = "SELECT_MY_PHOTO_AND_VIDEO_MESSAGES_COUNT_BASED_ON_SIZE"
            android.database.Cursor r2 = r2.A09(r1, r0, r4)     // Catch:{ all -> 0x06aa }
        L_0x0684:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x069e }
            if (r0 == 0) goto L_0x0697
            java.lang.String r0 = "count"
            long r4 = X.C36351kA.A07(r2, r0)     // Catch:{ all -> 0x069e }
            r2.close()     // Catch:{ all -> 0x06aa }
            r9.close()     // Catch:{ Exception -> 0x06b4 }
            goto L_0x06bb
        L_0x0697:
            r2.close()     // Catch:{ all -> 0x06aa }
            r9.close()     // Catch:{ Exception -> 0x06b4 }
            goto L_0x06c2
        L_0x069e:
            r1 = move-exception
            if (r2 == 0) goto L_0x06a9
            r2.close()     // Catch:{ all -> 0x06a5 }
            goto L_0x06a9
        L_0x06a5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06aa }
        L_0x06a9:
            throw r1     // Catch:{ all -> 0x06aa }
        L_0x06aa:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x06af }
            goto L_0x06b3
        L_0x06af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x06b4 }
        L_0x06b3:
            throw r1     // Catch:{ Exception -> 0x06b4 }
        L_0x06b4:
            r1 = move-exception
            java.lang.String r0 = "MediaMessageStore/getHdMediaSendFromMeCount/sql failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x06c2
        L_0x06bb:
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x06c3
        L_0x06c2:
            r1 = 0
        L_0x06c3:
            X.C36331k8.A18(r7, r6, r1)
        L_0x06c6:
            if (r1 != 0) goto L_0x0012
            X.0yC r1 = r8.A02
            r0 = 6286(0x188e, float:8.809E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0012
            X.17Y r2 = r3.getGlobalUI()
            r1 = 43
            X.74t r0 = new X.74t
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0H(r0)
            r0 = 1
            r3.A0Y = r0
            return
        L_0x06e4:
            java.lang.Object r1 = r8.A00
            X.6WR r1 = (X.AnonymousClass6WR) r1
            android.graphics.Bitmap r0 = r1.A04
            r1.A03 = r0
            r0 = 0
            r1.A01 = r0
            X.6cU r0 = r1.A0T
            r0.A00()
            X.4me r0 = r1.A08
            if (r0 == 0) goto L_0x0012
        L_0x06f8:
            r0.A06()
            return
        L_0x06fc:
            java.lang.Object r0 = r8.A00
            X.4bJ r0 = (X.C91014bJ) r0
            X.6wE r2 = r0.A00
            X.1l9 r1 = r2.A02
            if (r1 == 0) goto L_0x0012
            X.1l9 r0 = r2.A03
            if (r0 == 0) goto L_0x0012
            int r0 = r1.getCount()
            r2.A00 = r0
            X.1l9 r0 = r2.A03
            int r0 = r0.getCount()
            r2.A01 = r0
            java.lang.Runnable r0 = r2.A06
            if (r0 == 0) goto L_0x0012
            r0.run()
            return
        L_0x0720:
            java.lang.Object r5 = r8.A00
            X.6ov r5 = (X.C142466ov) r5
            r0 = 1
            r5.A1U = r0
            java.lang.String r0 = "group-chat-live-location-ui-update-locations"
            X.C142466ov.A0C(r5, r0)
            X.C142466ov.A07(r5)
            java.util.List r4 = r5.A17
            X.0wQ r3 = r5.A0x
            X.16D r2 = r5.A0y
            X.171 r1 = r5.A0z
            X.3x3 r0 = new X.3x3
            r0.<init>(r3, r2, r1)
            java.util.Collections.sort(r4, r0)
            r1 = 0
            X.C142466ov.A0D(r5, r1)
            X.4mZ r0 = r5.A0K
            r0.A06()
            r5.A0S()
            r5.A1U = r1
            return
        L_0x074e:
            java.lang.Object r0 = r8.A00
            X.6ov r0 = (X.C142466ov) r0
            X.C142466ov.A07(r0)
            return
        L_0x0756:
            java.lang.Object r5 = r8.A00
            X.6ov r5 = (X.C142466ov) r5
            X.1P5 r1 = r5.A12
            X.11F r0 = r5.A0I
            X.11F r0 = r1.A0K(r0)
            X.7pF r4 = new X.7pF
            r4.<init>((X.C1503074t) r8, (X.AnonymousClass11F) r0)
            android.os.Handler r3 = r5.A0v
            java.lang.Runnable r2 = r5.A15
            r3.removeCallbacks(r2)
            long r0 = r5.A03
            r3.postDelayed(r2, r0)
            X.1PA r0 = r5.A14
            r0.A02(r4)
            X.C142466ov.A06(r5)
            return
        L_0x077c:
            java.lang.Object r2 = r8.A00
            X.5yO r2 = (X.C124555yO) r2
            X.3J6 r1 = r2.A06
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x078c
            r0 = 1
            r1.A01(r0)
        L_0x078c:
            android.widget.ImageButton r1 = r2.A03
            r0 = 2131231748(0x7f080404, float:1.8079586E38)
            r1.setImageResource(r0)
            return
        L_0x0795:
            java.lang.Object r0 = r8.A00
            com.whatsapp.location.LiveLocationPrivacyActivity r0 = (com.whatsapp.location.LiveLocationPrivacyActivity) r0
            X.1P5 r0 = r0.A07
            r0.A0O()
            return
        L_0x079f:
            java.lang.Object r0 = r8.A00
            X.6Zc r0 = (X.C133586Zc) r0
            X.C133586Zc.A09(r0)
            return
        L_0x07a7:
            java.lang.Object r1 = r8.A00
            com.whatsapp.location.LocationSharingService r1 = (com.whatsapp.location.LocationSharingService) r1
            r0 = 0
            r1.A0F = r0
            goto L_0x07b6
        L_0x07af:
            java.lang.Object r1 = r8.A00
            com.whatsapp.location.LocationSharingService r1 = (com.whatsapp.location.LocationSharingService) r1
            r0 = 0
            r1.A0G = r0
        L_0x07b6:
            com.whatsapp.location.LocationSharingService.A03(r1)
            return
        L_0x07ba:
            java.lang.Object r0 = r8.A00
            com.whatsapp.location.LocationSharingService r0 = (com.whatsapp.location.LocationSharingService) r0
            X.1P5 r0 = r0.A09
            r0.A0T()
            return
        L_0x07c4:
            java.lang.Object r0 = r8.A00
            X.4xN r0 = (X.C101334xN) r0
            java.io.File r1 = r0.A03
            if (r1 == 0) goto L_0x07d2
            X.0y0 r0 = r0.A0B
            X.C101334xN.A09(r0, r1)
            return
        L_0x07d2:
            java.lang.String r0 = "MediaDownload/deleteDownloadFileLegacyFlow/download file is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x07d8:
            java.lang.Object r0 = r8.A00
            X.4xN r0 = (X.C101334xN) r0
            X.1DE r1 = r0.A0c
            X.5z2 r0 = r0.A01
            goto L_0x0839
        L_0x07e1:
            java.lang.Object r4 = r8.A00
            X.4xN r4 = (X.C101334xN) r4
            X.6Fk r3 = r4.A0j
            X.5Bu r3 = (X.C104875Bu) r3
            long r9 = r3.A00
            r1 = -1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x07f5
            long r9 = r3.A06()
        L_0x07f5:
            long r7 = r3.A0D()
            X.66Q r5 = r4.A0b
            X.68C r0 = r4.A0f
            java.lang.String r6 = r0.A0G
            X.0wo r0 = r4.A0O
            long r11 = X.C19970wo.A00(r0)
            r5.A00(r6, r7, r9, r11)
            return
        L_0x0809:
            java.lang.Object r0 = r8.A00
            X.4xN r0 = (X.C101334xN) r0
            X.1DE r1 = r0.A0c
            X.5z2 r0 = r0.A01
            r1.A05(r0)
            return
        L_0x0815:
            java.lang.Object r0 = r8.A00
            X.4xN r0 = (X.C101334xN) r0
            X.C101334xN.A06(r0)
            return
        L_0x081d:
            java.lang.Object r1 = r8.A00
            X.00S r1 = (X.AnonymousClass00S) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.invoke()
            return
        L_0x0829:
            java.lang.Object r0 = r8.A00
            com.whatsapp.media.download.service.MediaDownloadJobService r0 = (com.whatsapp.media.download.service.MediaDownloadJobService) r0
            com.whatsapp.media.download.service.MediaDownloadJobService.A06(r0)
            return
        L_0x0831:
            java.lang.Object r0 = r8.A00
            X.6Wa r0 = (X.C132976Wa) r0
            X.1DE r1 = r0.A0L
            X.5z2 r0 = r0.A0K
        L_0x0839:
            r1.A04(r0)
            return
        L_0x083d:
            java.lang.Object r0 = r8.A00
            X.4xL r0 = (X.C101314xL) r0
            X.5tb r4 = r0.A0c
            X.5JZ r3 = r0.A02
            X.C18740tg.A06(r3)
            X.620 r2 = r0.A01
            X.C18740tg.A06(r2)
            r1 = 2
            X.6jc r0 = new X.6jc
            r0.<init>(r4, r3, r1)
            r2.A00(r0)
            return
        L_0x0857:
            java.lang.Object r2 = r8.A00
            X.5z8 r2 = (X.C124985z8) r2
            android.view.View r3 = r2.A05
            r0 = 1962934272(0x75000000, float:1.6225928E32)
            r3.setBackgroundColor(r0)
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x0875
            android.widget.TextView r1 = r2.A0A
            r0 = -1291845633(0xffffffffb2ffffff, float:-2.980232E-8)
            r1.setTextColor(r0)
            android.graphics.drawable.Drawable r1 = r2.A03
            r0 = 178(0xb2, float:2.5E-43)
            r1.setAlpha(r0)
        L_0x0875:
            android.view.animation.AlphaAnimation r2 = X.C36351kA.A0D()
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x0882:
            java.lang.Object r1 = r8.A00
            X.01L r1 = (X.AnonymousClass01L) r1
            r0 = 2131433000(0x7f0b1628, float:1.8487773E38)
            android.view.View r1 = r1.findViewById(r0)
            goto L_0x08d1
        L_0x088e:
            java.lang.Object r2 = r8.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            X.6vv r0 = r2.A0u
            X.6vx r0 = r0.A07
            X.4mf r1 = r0.A09
            r0 = 1
            r1.A00 = r0
            r1.A06()
            r0 = 0
            r2.A1U = r0
            return
        L_0x08a2:
            java.lang.Object r0 = r8.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            com.whatsapp.mediacomposer.MediaComposerActivity.A0l(r0)
            return
        L_0x08aa:
            java.lang.Object r5 = r8.A00
            X.74t r5 = (X.C1503074t) r5
            r0 = 6
            X.7sq r4 = new X.7sq
            r4.<init>(r5, r0)
            X.77l r3 = X.C1509577l.A00
            r0 = 7
            X.7sq r2 = new X.7sq
            r2.<init>(r5, r0)
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            com.whatsapp.mediacomposer.dialog.DataWarningDialog r1 = new com.whatsapp.mediacomposer.dialog.DataWarningDialog
            r1.<init>(r4, r3, r2)
            java.lang.Object r0 = r5.A00
            X.01I r0 = (X.AnonymousClass01I) r0
            X.C36331k8.A12(r1, r0)
            return
        L_0x08cd:
            java.lang.Object r1 = r8.A00
            android.view.View r1 = (android.view.View) r1
        L_0x08d1:
            r0 = 0
            goto L_0x08e3
        L_0x08d3:
            java.lang.Object r1 = r8.A00
            android.view.View r1 = (android.view.View) r1
            goto L_0x08e2
        L_0x08d8:
            java.lang.Object r1 = r8.A00
            X.6vx r1 = (X.C146656vx) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            androidx.recyclerview.widget.RecyclerView r1 = r1.A05
        L_0x08e2:
            r0 = 4
        L_0x08e3:
            r1.setVisibility(r0)
            return
        L_0x08e7:
            java.lang.Object r0 = r8.A00
            X.6vx r0 = (X.C146656vx) r0
            r1 = 0
            X.AnonymousClass00C.A0D(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r0.A05
            r0.setVisibility(r1)
            return
        L_0x08f5:
            java.lang.Object r0 = r8.A00
            X.6Fh r0 = (X.C129126Fh) r0
            r0.A03()
            return
        L_0x08fd:
            java.lang.Object r0 = r8.A00
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setTooltipInPosition$lambda$14(r0)
            return
        L_0x0905:
            java.lang.Object r0 = r8.A00
            X.6tU r0 = (X.C145186tU) r0
            X.4me r4 = r0.A00
            r3 = 0
            r4.A00 = r3
            r2 = 0
        L_0x090f:
            boolean[] r1 = r4.A02
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0919
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x090f
        L_0x0919:
            r4.A06()
            return
        L_0x091d:
            java.lang.Object r0 = r8.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = (com.whatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A1h()
            return
        L_0x0925:
            r0 = 1
            r1.A01(r0)
            return
        L_0x092a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x092a }
            throw r1
        L_0x092d:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0930:
            java.lang.Object r3 = r8.A00
            com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment r3 = (com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment) r3
            X.5v6 r2 = r3.A01
            if (r2 == 0) goto L_0x09b2
            X.6QO r0 = r3.A02
            android.net.Uri r10 = r0.A0J
            int[] r11 = X.C36441kJ.A1O()
            r11 = {3, 0} // fill-array
            r6 = 0
            r9 = 1
            java.util.HashMap r1 = X.AnonymousClass001.A0J()
            r8 = 2
            r0 = 0
        L_0x094b:
            r7 = r11[r0]
            X.1D1 r5 = r2.A02
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            X.63a r18 = r5.A00(r4, r9, r6)
            if (r18 == 0) goto L_0x0998
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r5 = "temp_file"
            java.lang.String r4 = ".jpeg"
            java.io.File r19 = java.io.File.createTempFile(r5, r4)
            X.6vg r14 = new X.6vg
            r14.<init>()
            java.lang.String r20 = X.C36381kD.A0y(r10)
            X.0yW r5 = r2.A01
            X.0yC r4 = r2.A00
            r15 = 0
            X.6Tv r13 = new X.6Tv
            r13.<init>(r4, r5, r15, r6)
            X.6vm r16 = X.C146546vm.A00
            X.6vo r17 = X.C146566vo.A00
            X.AnonymousClass00C.A0B(r19)
            r21 = 0
            r22 = 0
            X.5BV r12 = new X.5BV
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.1Gm r4 = r2.A03
            X.75H r4 = r4.A00(r12)
            r4.run()
            long r4 = r19.length()
            X.C36421kH.A1K(r7, r1, r4)
        L_0x0998:
            int r0 = r0 + 1
            if (r0 < r8) goto L_0x094b
            X.17Y r4 = r3.A02
            if (r4 == 0) goto L_0x09ab
            r0 = 44
            X.3vA r2 = new X.3vA
            r2.<init>(r3, r1, r0)
        L_0x09a7:
            r4.A0H(r2)
            return
        L_0x09ab:
            java.lang.String r0 = "globalUi"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x09b2:
            java.lang.String r0 = "imageTranscoderHelper"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x09b9:
            java.lang.Object r4 = r8.A00
            com.whatsapp.mediacomposer.doodle.DoodleView r4 = (com.whatsapp.mediacomposer.doodle.DoodleView) r4
            X.6FV r5 = r4.A0H
            java.util.List r0 = r5.A04
            java.util.Iterator r7 = r0.iterator()
        L_0x09c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0a27
            X.6Ft r6 = X.C90524aI.A0N(r7)
            boolean r0 = r6 instanceof X.AnonymousClass5CY
            if (r0 == 0) goto L_0x09ec
            X.5CY r6 = (X.AnonymousClass5CY) r6
            java.lang.String r2 = r6.A02
            java.lang.String r1 = "formattedTime"
            if (r2 != 0) goto L_0x09e0
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r1)
            throw r1
        L_0x09e0:
            X.AnonymousClass5CY.A01(r6)
            java.lang.String r0 = r6.A02
            if (r0 != 0) goto L_0x0a17
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r1)
            throw r1
        L_0x09ec:
            boolean r0 = r6 instanceof X.C104965Cn
            if (r0 == 0) goto L_0x09c5
            X.5Cn r6 = (X.C104965Cn) r6
            int r3 = r6.A01
            int r2 = r6.A00
            X.0ts r0 = r6.A0C
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            java.util.Calendar r1 = java.util.Calendar.getInstance(r0)
            r0 = 10
            int r0 = r1.get(r0)
            r6.A00 = r0
            r0 = 12
            int r0 = r1.get(r0)
            r6.A01 = r0
            if (r3 != r0) goto L_0x0a22
            int r0 = r6.A00
            if (r2 == r0) goto L_0x09c5
            goto L_0x0a22
        L_0x0a17:
            boolean r0 = r2.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x09c5
            X.AnonymousClass5CY.A00(r6)
        L_0x0a22:
            X.6V4 r0 = r4.A0E
            r0.A03()
        L_0x0a27:
            boolean r0 = r5.A06()
            android.os.Handler r3 = r4.A0D
            java.lang.Runnable r2 = r4.A0I
            if (r0 == 0) goto L_0x0a37
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x0a33:
            r3.postDelayed(r2, r0)
            return
        L_0x0a37:
            r3.removeCallbacks(r2)
            return
        L_0x0a3b:
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = X.C52952qR.A00
            long r3 = r3 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0a54
            java.lang.Object r0 = r8.A00
            X.7r9 r0 = (X.C164027r9) r0
            java.lang.Object r0 = r0.A00
            android.view.View r0 = (android.view.View) r0
        L_0x0a50:
            r0.postDelayed(r8, r1)
            return
        L_0x0a54:
            java.lang.Object r0 = r8.A00     // Catch:{ IncompatibleClassChangeError -> 0x0a6b }
            X.7r9 r0 = (X.C164027r9) r0     // Catch:{ IncompatibleClassChangeError -> 0x0a6b }
            java.lang.Object r2 = r0.A00     // Catch:{ IncompatibleClassChangeError -> 0x0a6b }
            com.whatsapp.location.WaMapView r2 = (com.whatsapp.location.WaMapView) r2     // Catch:{ IncompatibleClassChangeError -> 0x0a6b }
            X.4eX r1 = r2.A01     // Catch:{ IncompatibleClassChangeError -> 0x0a6b }
            X.C18740tg.A04(r1)     // Catch:{ IncompatibleClassChangeError -> 0x0a6b }
            r0 = 0
            r1.A05(r0)     // Catch:{ IncompatibleClassChangeError -> 0x0a6b }
            X.4eX r0 = r2.A01     // Catch:{ IncompatibleClassChangeError -> 0x0a6b }
            r0.A04()     // Catch:{ IncompatibleClassChangeError -> 0x0a6b }
            goto L_0x0a6f
        L_0x0a6b:
            r0 = move-exception
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
        L_0x0a6f:
            java.lang.Object r0 = r8.A00
            X.7r9 r0 = (X.C164027r9) r0
            java.lang.Object r1 = r0.A01
            X.1P6 r1 = (X.AnonymousClass1P6) r1
            r0 = 1
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1503074t.run():void");
    }

    public C1503074t(MediaComposerActivity mediaComposerActivity, int i) {
        this.A01 = i;
        switch (i) {
            case 28:
            case 29:
            case 30:
                this.A00 = mediaComposerActivity;
                return;
            default:
                this.A00 = mediaComposerActivity;
                return;
        }
    }

    public C1503074t(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
