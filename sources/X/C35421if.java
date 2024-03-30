package X;

/* renamed from: X.1if  reason: invalid class name and case insensitive filesystem */
public class C35421if implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C35421if(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:239:0x062a, code lost:
        if (r6.A01((com.whatsapp.jid.UserJid) r11) == false) goto L_0x062c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x069a, code lost:
        if (r6.A1I != 0) goto L_0x069c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010a, code lost:
        if (r4.A0L() != false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x08dc A[SYNTHETIC, Splitter:B:345:0x08dc] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x08e1  */
    /* JADX WARNING: Removed duplicated region for block: B:430:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r5 = r30
            int r0 = r5.A05
            switch(r0) {
                case 0: goto L_0x08e6;
                case 1: goto L_0x0977;
                case 2: goto L_0x093f;
                case 3: goto L_0x0029;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r5.A00
            java.lang.Object r4 = r5.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r5.A02
            X.7l9 r3 = (X.C160527l9) r3
            java.lang.Object r2 = r5.A03
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.Object r1 = r5.A04
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            android.graphics.BitmapFactory$Options r0 = X.AnonymousClass1SV.A08
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0028
            r3.Bte(r2, r4, r1)
        L_0x0028:
            return
        L_0x0029:
            java.lang.Object r2 = r5.A00
            X.1aH r2 = (X.C30481aH) r2
            java.lang.Object r0 = r5.A01
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r9 = r5.A02
            java.lang.Object r7 = r5.A03
            com.whatsapp.jid.DeviceJid r7 = (com.whatsapp.jid.DeviceJid) r7
            java.lang.Object r1 = r5.A04
            X.B3s r1 = (X.C23084B3s) r1
            if (r0 == 0) goto L_0x0097
            X.1W9 r6 = r2.A0g
            int r5 = r0.intValue()
            boolean r0 = r6.A03()
            if (r0 == 0) goto L_0x0086
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.A04
            r0 = 1
            boolean r0 = r3.getAndSet(r0)
            if (r0 != 0) goto L_0x0086
            X.00T r0 = r6.A05
            java.lang.Object r8 = r0.getValue()
            X.6Lb r8 = (X.C130436Lb) r8
            monitor-enter(r8)
            java.util.LinkedHashSet r3 = r8.A00     // Catch:{ all -> 0x0990 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0990 }
            if (r0 != 0) goto L_0x0085
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0990 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0990 }
        L_0x006b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0990 }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0990 }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r4)     // Catch:{ all -> 0x0990 }
            if (r0 != 0) goto L_0x007f
            r3.remove()     // Catch:{ all -> 0x0990 }
            goto L_0x006b
        L_0x007f:
            r0 = 1
            r8.A02 = r0     // Catch:{ all -> 0x0990 }
            X.C130436Lb.A00(r8)     // Catch:{ all -> 0x0990 }
        L_0x0085:
            monitor-exit(r8)
        L_0x0086:
            if (r9 == 0) goto L_0x0097
            X.0yC r4 = r2.A0W
            r3 = 6363(0x18db, float:8.916E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r3)
            if (r0 == 0) goto L_0x0097
            r6.A02(r5)
        L_0x0097:
            r3 = 1
            if (r7 != 0) goto L_0x00a0
            r16 = 0
        L_0x009c:
            r6 = 0
            if (r7 == 0) goto L_0x011c
            goto L_0x00a7
        L_0x00a0:
            X.18I r0 = r2.A0J     // Catch:{ all -> 0x09c9 }
            X.79X r16 = r0.A08(r7)     // Catch:{ all -> 0x09c9 }
            goto L_0x009c
        L_0x00a7:
            X.17i r4 = r2.A0T     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid r0 = r7.userJid     // Catch:{ all -> 0x09bd }
            java.util.HashSet r0 = r4.A0B(r0)     // Catch:{ all -> 0x09bd }
            boolean r0 = r0.contains(r7)     // Catch:{ all -> 0x09bd }
            if (r0 != 0) goto L_0x011c
            X.0wQ r4 = r2.A05     // Catch:{ all -> 0x09bd }
            boolean r0 = r4.A0N(r7)     // Catch:{ all -> 0x09bd }
            if (r0 == 0) goto L_0x010c
            boolean r0 = r4.A0L()     // Catch:{ all -> 0x09bd }
            if (r0 != 0) goto L_0x0106
            X.19g r0 = r2.A0R     // Catch:{ all -> 0x09bd }
            boolean r0 = r0.A0F(r7)     // Catch:{ all -> 0x09bd }
            if (r0 != 0) goto L_0x0106
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r4.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r0 = "MessagingXmppHandler/onMessageForMe/unknown self device, jid="
            r4.append(r0)     // Catch:{ all -> 0x09bd }
            r4.append(r7)     // Catch:{ all -> 0x09bd }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x09bd }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x09bd }
            X.0wU r5 = r2.A0w     // Catch:{ all -> 0x09bd }
            r4 = 26
            X.1jD r0 = new X.1jD     // Catch:{ all -> 0x09bd }
            r0.<init>(r2, r7, r4)     // Catch:{ all -> 0x09bd }
            r5.Boy(r0)     // Catch:{ all -> 0x09bd }
            r4 = 7
            boolean r0 = r1.BvK()     // Catch:{ all -> 0x09bd }
            if (r0 != 0) goto L_0x00f9
            X.1DL r0 = r2.A0j     // Catch:{ all -> 0x09bd }
            r0.A0C(r1)     // Catch:{ all -> 0x09bd }
            goto L_0x08da
        L_0x00f9:
            r1.Brb(r4)     // Catch:{ all -> 0x09bd }
            X.1aQ r4 = r2.A0e     // Catch:{ all -> 0x09bd }
            X.AHp r1 = (X.C21337AHp) r1     // Catch:{ all -> 0x09bd }
            r0 = 0
            X.C30571aQ.A00(r4, r0, r1)     // Catch:{ all -> 0x09bd }
            goto L_0x08da
        L_0x0106:
            boolean r0 = r4.A0L()     // Catch:{ all -> 0x09bd }
            if (r0 == 0) goto L_0x011c
        L_0x010c:
            int r0 = r7.getDevice()     // Catch:{ all -> 0x09bd }
            if (r0 == 0) goto L_0x011c
            X.630 r0 = r1.BCe()     // Catch:{ all -> 0x09bd }
            if (r0 == 0) goto L_0x0896
            int r0 = r0.A00     // Catch:{ all -> 0x09bd }
            if (r0 != r3) goto L_0x0896
        L_0x011c:
            X.1OD r5 = r2.A0S     // Catch:{ all -> 0x09bd }
            byte[] r4 = r1.BB4()     // Catch:{ all -> 0x09bd }
            X.630 r0 = r1.BCe()     // Catch:{ all -> 0x09bd }
            boolean r0 = r5.A0D(r7, r0, r4, r3)     // Catch:{ all -> 0x09bd }
            if (r0 == 0) goto L_0x081d
            X.1ap r0 = r2.A0r     // Catch:{ all -> 0x09bd }
            X.19L r7 = r0.A0U     // Catch:{ all -> 0x09bd }
            long r4 = r1.BDf()     // Catch:{ all -> 0x09bd }
            X.9ju r5 = X.AnonymousClass19L.A00(r7, r6, r4)     // Catch:{ all -> 0x09bd }
            X.8eP r5 = (X.C177808eP) r5     // Catch:{ all -> 0x09bd }
            if (r5 == 0) goto L_0x0140
            r4 = 3
            r5.A04(r4)     // Catch:{ all -> 0x09bd }
        L_0x0140:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r7.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "DecryptMessageRunnable/run axolotl received a message; message.key="
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            X.3Qa r4 = r1.BE4()     // Catch:{ all -> 0x09bd }
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "; message.retryCount="
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            int r4 = r1.BGp()     // Catch:{ all -> 0x09bd }
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            java.lang.String r13 = "; message.remote_resource="
            r7.append(r13)     // Catch:{ all -> 0x09bd }
            X.11F r4 = r1.BFC()     // Catch:{ all -> 0x09bd }
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x09bd }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x09bd }
            byte[] r4 = r1.BGa()     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x0221
            int r12 = X.C203239na.A01(r4, r6)     // Catch:{ all -> 0x09bd }
            X.189 r14 = r0.A0B     // Catch:{ all -> 0x09bd }
            X.18l r4 = r14.A07     // Catch:{ all -> 0x09bd }
            int r11 = r4.A03()     // Catch:{ all -> 0x09bd }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r7.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "DecryptMessageRunnable/sendPreKeysIfNecessary received a registration id with message; message.key="
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            X.3Qa r4 = r1.BE4()     // Catch:{ all -> 0x09bd }
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            r7.append(r13)     // Catch:{ all -> 0x09bd }
            X.11F r4 = r1.BFC()     // Catch:{ all -> 0x09bd }
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            java.lang.String r10 = "; serverRegistrationId="
            r7.append(r10)     // Catch:{ all -> 0x09bd }
            r7.append(r12)     // Catch:{ all -> 0x09bd }
            java.lang.String r8 = "; localRegistrationId="
            r7.append(r8)     // Catch:{ all -> 0x09bd }
            r7.append(r11)     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x09bd }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x09bd }
            if (r12 == r11) goto L_0x0221
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r7.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "DecryptMessageRunnable/sendPreKeysIfNecessary registration id received with message did not match local; message.key="
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            X.3Qa r4 = r1.BE4()     // Catch:{ all -> 0x09bd }
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            r7.append(r13)     // Catch:{ all -> 0x09bd }
            X.11F r4 = r1.BFC()     // Catch:{ all -> 0x09bd }
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            r7.append(r10)     // Catch:{ all -> 0x09bd }
            r7.append(r12)     // Catch:{ all -> 0x09bd }
            r7.append(r8)     // Catch:{ all -> 0x09bd }
            r7.append(r11)     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x09bd }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x09bd }
            X.0xL r7 = r0.A06     // Catch:{ all -> 0x09bd }
            monitor-enter(r7)     // Catch:{ all -> 0x09bd }
            boolean r4 = r7.A01     // Catch:{ all -> 0x09ad }
            monitor-exit(r7)     // Catch:{ all -> 0x09bd }
            if (r4 != 0) goto L_0x01f3
            r14.A0O()     // Catch:{ all -> 0x09bd }
            r7.A07()     // Catch:{ all -> 0x09bd }
            goto L_0x0221
        L_0x01f3:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r7.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "DecryptMessageRunnable/sendPreKeysIfNecessary pre keys already sent on this connection; not sending at this time; message.key="
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            X.3Qa r4 = r1.BE4()     // Catch:{ all -> 0x09bd }
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            r7.append(r13)     // Catch:{ all -> 0x09bd }
            X.11F r4 = r1.BFC()     // Catch:{ all -> 0x09bd }
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            r7.append(r10)     // Catch:{ all -> 0x09bd }
            r7.append(r12)     // Catch:{ all -> 0x09bd }
            r7.append(r8)     // Catch:{ all -> 0x09bd }
            r7.append(r11)     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x09bd }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x09bd }
        L_0x0221:
            X.11F r4 = r1.BGb()     // Catch:{ all -> 0x09bd }
            boolean r4 = X.AnonymousClass143.A0G(r4)     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x0415
            X.0xQ r13 = r0.A0O     // Catch:{ all -> 0x09bd }
            X.11F r7 = r1.BGb()     // Catch:{ all -> 0x09bd }
            android.os.Parcelable$Creator r4 = X.AnonymousClass147.CREATOR     // Catch:{ all -> 0x09bd }
            X.147 r12 = X.C65533Sl.A03(r7)     // Catch:{ all -> 0x09bd }
            X.11F r7 = r1.BFC()     // Catch:{ all -> 0x09bd }
            X.13r r4 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid r11 = X.C222813r.A00(r7)     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.Jid r4 = r1.BHI()     // Catch:{ all -> 0x09bd }
            X.11F r4 = X.C222713q.A00(r4)     // Catch:{ all -> 0x09bd }
            boolean r4 = X.C197029b1.A00(r4)     // Catch:{ all -> 0x09bd }
            r21 = 0
            if (r4 == 0) goto L_0x0268
            X.17X r4 = r13.A0U     // Catch:{ all -> 0x09bd }
            X.17r r4 = r4.A07     // Catch:{ all -> 0x09bd }
            X.6X6 r7 = r4.A0C(r12)     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.Jid r4 = r1.BHI()     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid r4 = X.C222813r.A00(r4)     // Catch:{ all -> 0x09bd }
            boolean r4 = r7.A0Q(r4)     // Catch:{ all -> 0x09bd }
            r7 = r4 ^ 1
            goto L_0x0269
        L_0x0268:
            r7 = 0
        L_0x0269:
            if (r12 == 0) goto L_0x0415
            if (r11 == 0) goto L_0x0415
            int r4 = r1.BBO()     // Catch:{ all -> 0x09bd }
            r15 = 7
            if (r4 == r15) goto L_0x0415
            if (r7 != 0) goto L_0x0415
            boolean r4 = r1 instanceof X.C21337AHp     // Catch:{ all -> 0x09bd }
            java.lang.String r17 = "pn"
            if (r4 == 0) goto L_0x029a
            r4 = r1
            X.AHp r4 = (X.C21337AHp) r4     // Catch:{ all -> 0x09bd }
            java.lang.String r8 = r4.A1B     // Catch:{ all -> 0x09bd }
        L_0x0281:
            X.1P4 r7 = r13.A0e     // Catch:{ all -> 0x09bd }
            X.11F r4 = r1.BGb()     // Catch:{ all -> 0x09bd }
            X.144 r14 = X.AnonymousClass6H4.A00(r4)     // Catch:{ all -> 0x09bd }
            X.11F r4 = r1.BFC()     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid r4 = X.C222813r.A00(r4)     // Catch:{ all -> 0x09bd }
            boolean r4 = X.AnonymousClass143.A0I(r4)     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x02b3
            goto L_0x029d
        L_0x029a:
            r8 = r17
            goto L_0x0281
        L_0x029d:
            if (r14 == 0) goto L_0x02b3
            X.17b r4 = r7.A01     // Catch:{ all -> 0x09bd }
            X.16D r10 = r4.A01     // Catch:{ all -> 0x09bd }
            X.141 r4 = r10.A0A(r14)     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x02be
            java.lang.String r7 = r4.A0M     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "lid"
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x02be
        L_0x02b3:
            int r7 = r1.BBO()     // Catch:{ all -> 0x09bd }
            r4 = 8
            r20 = 0
            if (r7 != r4) goto L_0x031a
            goto L_0x0318
        L_0x02be:
            X.141 r4 = r10.A0A(r14)     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x02c9
            boolean r4 = r4.A0j     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x02c9
            goto L_0x02b3
        L_0x02c9:
            java.lang.String r4 = "lid"
            boolean r4 = r4.equals(r8)     // Catch:{ all -> 0x09bd }
            if (r4 != 0) goto L_0x02b3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r4.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r0 = "decryptmessagerunnable/Dropping incoming message since it's from a lid participant in a non-incognito CAG; message.key="
            r4.append(r0)     // Catch:{ all -> 0x09bd }
            X.3Qa r0 = r1.BE4()     // Catch:{ all -> 0x09bd }
            r4.append(r0)     // Catch:{ all -> 0x09bd }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x09bd }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x09bd }
            X.1DL r0 = r13.A0r     // Catch:{ all -> 0x09bd }
            r6 = 551(0x227, float:7.72E-43)
            r0.A0D(r1, r6)     // Catch:{ all -> 0x09bd }
            X.11F r0 = r1.BGb()     // Catch:{ all -> 0x09bd }
            X.147 r7 = X.C65533Sl.A03(r0)     // Catch:{ all -> 0x09bd }
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x09bd }
            X.0xg r5 = r13.A0k     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "subgroup_conflict_recovery"
            r0 = 3
            r5.A0E(r7, r4, r0)     // Catch:{ all -> 0x09bd }
            X.1DT r4 = r13.A06     // Catch:{ all -> 0x09bd }
            r0 = 0
            r4.A0S(r1, r0, r15)     // Catch:{ all -> 0x09bd }
            X.0xM r5 = r13.A0O     // Catch:{ all -> 0x09bd }
            X.3Qa r4 = r1.BE4()     // Catch:{ all -> 0x09bd }
            long r0 = r1.BIM()     // Catch:{ all -> 0x09bd }
            r5.A0r(r4, r6, r0)     // Catch:{ all -> 0x09bd }
            goto L_0x08da
        L_0x0318:
            r20 = 1
        L_0x031a:
            X.17X r10 = r13.A0U     // Catch:{ all -> 0x09bd }
            boolean r4 = r10.A0C(r12)     // Catch:{ all -> 0x09bd }
            r19 = r4 ^ 1
            if (r19 == 0) goto L_0x0345
            if (r20 != 0) goto L_0x0415
            X.16D r4 = r13.A0C     // Catch:{ all -> 0x09bd }
            X.141 r4 = r4.A0D(r12)     // Catch:{ all -> 0x09bd }
            boolean r4 = r4.A0i     // Catch:{ all -> 0x09bd }
            if (r4 != 0) goto L_0x0345
            r4 = r17
            boolean r7 = r4.equals(r8)     // Catch:{ all -> 0x09bd }
            X.0wQ r4 = r13.A05     // Catch:{ all -> 0x09bd }
            if (r7 == 0) goto L_0x037c
            r4.A0G()     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.PhoneUserJid r4 = r4.A03     // Catch:{ all -> 0x09bd }
            X.C18740tg.A06(r4)     // Catch:{ all -> 0x09bd }
        L_0x0342:
            r13.A0c(r12, r4)     // Catch:{ all -> 0x09bd }
        L_0x0345:
            boolean r4 = r10.A0G(r12, r11)     // Catch:{ all -> 0x09bd }
            r18 = r4 ^ 1
            X.17b r14 = r13.A0i     // Catch:{ all -> 0x09bd }
            boolean r8 = X.C230717b.A00(r14, r12, r8)     // Catch:{ all -> 0x09bd }
            if (r18 == 0) goto L_0x03b9
            r22 = r11
            X.12O r4 = r14.A02     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid r17 = r4.A0B(r11)     // Catch:{ all -> 0x09bd }
            if (r17 != 0) goto L_0x0375
            X.0wN r15 = r14.A00     // Catch:{ all -> 0x09bd }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r7.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "Cannot retrieve counterpart from "
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            r7.append(r11)     // Catch:{ all -> 0x09bd }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "GroupLidInfra/incoming_group_message_sanitation"
            r15.A0E(r4, r7, r6)     // Catch:{ all -> 0x09bd }
        L_0x0375:
            int r7 = r14.A01(r12)     // Catch:{ all -> 0x09bd }
            if (r7 == 0) goto L_0x0389
            goto L_0x0381
        L_0x037c:
            X.13w r4 = r4.A08()     // Catch:{ all -> 0x09bd }
            goto L_0x0342
        L_0x0381:
            r4 = 3
            if (r7 != r4) goto L_0x03b4
            boolean r4 = X.AnonymousClass143.A0I(r11)     // Catch:{ all -> 0x09bd }
            goto L_0x038d
        L_0x0389:
            boolean r4 = X.AnonymousClass143.A0J(r11)     // Catch:{ all -> 0x09bd }
        L_0x038d:
            if (r4 != 0) goto L_0x03b4
            r22 = r17
            if (r17 != 0) goto L_0x03b4
            X.0wN r15 = r13.A03     // Catch:{ all -> 0x09bd }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r7.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "participant "
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            r7.append(r11)     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = " missing mapping, addressing mode mismatch = "
            r7.append(r4)     // Catch:{ all -> 0x09bd }
            r7.append(r8)     // Catch:{ all -> 0x09bd }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "GroupLidInfra/incoming_group_message_unknown"
            r15.A0E(r4, r7, r6)     // Catch:{ all -> 0x09bd }
            goto L_0x03b9
        L_0x03b4:
            r4 = r22
            r13.A0c(r12, r4)     // Catch:{ all -> 0x09bd }
        L_0x03b9:
            if (r20 == 0) goto L_0x03d3
            boolean r4 = r10.A0J(r12, r11)     // Catch:{ all -> 0x09bd }
            r7 = r4 ^ 1
            if (r7 == 0) goto L_0x03d4
            X.6PM r4 = r10.A03(r12, r11)     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x03d4
            r4.A01 = r3     // Catch:{ all -> 0x09bd }
            java.util.List r4 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x09bd }
            r13.A0b(r12, r4)     // Catch:{ all -> 0x09bd }
            goto L_0x03d4
        L_0x03d3:
            r7 = 0
        L_0x03d4:
            if (r19 != 0) goto L_0x03dd
            if (r18 != 0) goto L_0x03dd
            if (r7 != 0) goto L_0x03dd
            if (r8 == 0) goto L_0x0415
            goto L_0x03fe
        L_0x03dd:
            if (r8 != 0) goto L_0x03fe
            int r4 = r14.A01(r12)     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x03e7
            r21 = 1
        L_0x03e7:
            X.0yC r8 = r13.A0a     // Catch:{ all -> 0x09bd }
            r7 = 7053(0x1b8d, float:9.883E-42)
            X.0yV r4 = X.C21000yV.A02     // Catch:{ all -> 0x09bd }
            boolean r4 = X.C20800yB.A01(r4, r8, r7)     // Catch:{ all -> 0x09bd }
            java.lang.String r8 = "participant_change_recovery"
            if (r4 == 0) goto L_0x03f8
            if (r21 != 0) goto L_0x03f8
            goto L_0x0407
        L_0x03f8:
            X.0xg r4 = r13.A0k     // Catch:{ all -> 0x09bd }
            r4.A0E(r12, r8, r3)     // Catch:{ all -> 0x09bd }
            goto L_0x0415
        L_0x03fe:
            X.0xg r7 = r13.A0k     // Catch:{ all -> 0x09bd }
            r6 = 6
            java.lang.String r4 = "lid_migration"
            r7.A0E(r12, r4, r6)     // Catch:{ all -> 0x09bd }
            goto L_0x0415
        L_0x0407:
            X.0xg r7 = r13.A0k     // Catch:{ all -> 0x09bd }
            java.lang.String r6 = r10.A04(r12, r6)     // Catch:{ all -> 0x09bd }
            X.3S5 r4 = new X.3S5     // Catch:{ all -> 0x09bd }
            r4.<init>(r8, r3, r6)     // Catch:{ all -> 0x09bd }
            r7.A09(r4, r12)     // Catch:{ all -> 0x09bd }
        L_0x0415:
            int r4 = r1.BGp()     // Catch:{ all -> 0x09bd }
            if (r4 < r3) goto L_0x0458
            r4 = 16
            boolean r4 = r1.BK0(r4)     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x0458
            X.1A1 r6 = r0.A0Y     // Catch:{ all -> 0x09bd }
            X.3Qa r4 = r1.BE4()     // Catch:{ all -> 0x09bd }
            X.3T1 r4 = r6.A03(r4)     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x0435
            int r6 = r4.A1I     // Catch:{ all -> 0x09bd }
            r4 = 11
            if (r6 == r4) goto L_0x0458
        L_0x0435:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r5.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "DecryptMessageRunnable/run Dropping bypassed retry message due to missing placeholder; message.key="
            r5.append(r4)     // Catch:{ all -> 0x09bd }
            X.3Qa r4 = r1.BE4()     // Catch:{ all -> 0x09bd }
            r5.append(r4)     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x09bd }
            com.whatsapp.util.Log.w((java.lang.String) r4)     // Catch:{ all -> 0x09bd }
            X.1DL r5 = r0.A0T     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "bypassed-dropped"
            java.lang.String r0 = "404"
            r5.A0E(r1, r4, r0)     // Catch:{ all -> 0x09bd }
            goto L_0x08da
        L_0x0458:
            X.2Sw r4 = new X.2Sw     // Catch:{ all -> 0x09bd }
            r4.<init>()     // Catch:{ all -> 0x09bd }
            int r6 = r1.BGp()     // Catch:{ all -> 0x09bd }
            long r6 = (long) r6     // Catch:{ all -> 0x09bd }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x09bd }
            r4.A0F = r6     // Catch:{ all -> 0x09bd }
            boolean r6 = r1.BMW()     // Catch:{ all -> 0x09bd }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x09bd }
            r4.A03 = r6     // Catch:{ all -> 0x09bd }
            int r6 = r1.BBO()     // Catch:{ all -> 0x09bd }
            java.lang.Integer r6 = X.C203229nZ.A04(r6)     // Catch:{ all -> 0x09bd }
            r4.A0C = r6     // Catch:{ all -> 0x09bd }
            X.11F r6 = r1.BGb()     // Catch:{ all -> 0x09bd }
            boolean r6 = X.AnonymousClass143.A0G(r6)     // Catch:{ all -> 0x09bd }
            if (r6 == 0) goto L_0x0488
            r7 = 1
            goto L_0x04a8
        L_0x0488:
            X.11F r6 = r1.BGb()     // Catch:{ all -> 0x09bd }
            boolean r6 = r6 instanceof X.C177528dw     // Catch:{ all -> 0x09bd }
            if (r6 == 0) goto L_0x0492
            r7 = 3
            goto L_0x04a8
        L_0x0492:
            X.11F r6 = r1.BFC()     // Catch:{ all -> 0x09bd }
            boolean r6 = r6 instanceof X.C177618e5     // Catch:{ all -> 0x09bd }
            if (r6 == 0) goto L_0x049c
            r7 = 2
            goto L_0x04a8
        L_0x049c:
            X.11F r6 = r1.BGb()     // Catch:{ all -> 0x09bd }
            boolean r6 = X.AnonymousClass143.A0H(r6)     // Catch:{ all -> 0x09bd }
            r7 = 0
            if (r6 == 0) goto L_0x04a8
            r7 = 5
        L_0x04a8:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x09bd }
            r4.A07 = r6     // Catch:{ all -> 0x09bd }
            X.11F r7 = r1.BGb()     // Catch:{ all -> 0x09bd }
            X.12q r6 = r0.A0C     // Catch:{ all -> 0x09bd }
            java.lang.Integer r6 = X.AnonymousClass3UK.A06(r6, r7)     // Catch:{ all -> 0x09bd }
            r4.A0D = r6     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.Jid r6 = r1.BHI()     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.of(r6)     // Catch:{ all -> 0x09bd }
            X.0wQ r6 = r0.A04     // Catch:{ all -> 0x09bd }
            r29 = r6
            java.lang.Integer r6 = X.C203229nZ.A05(r6, r7)     // Catch:{ all -> 0x09bd }
            r4.A09 = r6     // Catch:{ all -> 0x09bd }
            int r6 = r1.BBO()     // Catch:{ all -> 0x09bd }
            java.lang.Integer r6 = X.AnonymousClass1DT.A03(r6)     // Catch:{ all -> 0x09bd }
            r4.A0A = r6     // Catch:{ all -> 0x09bd }
            boolean r8 = r1 instanceof X.C21337AHp     // Catch:{ all -> 0x09bd }
            if (r8 == 0) goto L_0x04e5
            X.1DT r7 = r0.A05     // Catch:{ all -> 0x09bd }
            r6 = r1
            X.AHp r6 = (X.C21337AHp) r6     // Catch:{ all -> 0x09bd }
            java.lang.Integer r6 = r7.A0E(r6)     // Catch:{ all -> 0x09bd }
            r4.A04 = r6     // Catch:{ all -> 0x09bd }
        L_0x04e5:
            X.1DT r7 = r0.A05     // Catch:{ all -> 0x09bd }
            X.11F r6 = r1.BGb()     // Catch:{ all -> 0x09bd }
            int r6 = r7.A0B(r6)     // Catch:{ all -> 0x09bd }
            if (r6 == 0) goto L_0x04f7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x09bd }
            r4.A05 = r6     // Catch:{ all -> 0x09bd }
        L_0x04f7:
            com.whatsapp.jid.Jid r6 = r1.BHI()     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.of(r6)     // Catch:{ all -> 0x09bd }
            if (r6 == 0) goto L_0x08da
            X.6EZ r23 = X.C133256Xm.A02(r6)     // Catch:{ all -> 0x09bd }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x09bd }
            r4.A00 = r6     // Catch:{ all -> 0x09bd }
            if (r5 == 0) goto L_0x050f
            r5.A02 = r3     // Catch:{ all -> 0x09bd }
        L_0x050f:
            X.0yC r6 = r0.A0M     // Catch:{ all -> 0x09bd }
            X.0wU r10 = r0.A0Z     // Catch:{ all -> 0x09bd }
            X.189 r11 = r0.A0B     // Catch:{ all -> 0x09bd }
            r28 = r11
            X.1ar r11 = r0.A0R     // Catch:{ all -> 0x09bd }
            X.9S5 r17 = new X.9S5     // Catch:{ all -> 0x09bd }
            r18 = r28
            r19 = r6
            r20 = r11
            r21 = r1
            r22 = r10
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x09bd }
            X.630 r26 = r1.BCe()     // Catch:{ all -> 0x09bd }
            boolean r12 = X.C30821ap.A01(r1, r0)     // Catch:{ all -> 0x09bd }
            r13 = 0
            if (r12 != 0) goto L_0x053a
            X.630 r12 = r1.BHJ()     // Catch:{ all -> 0x09bd }
            if (r12 == 0) goto L_0x053a
            r13 = 1
        L_0x053a:
            r27 = r13 ^ 1
            r22 = r17
            r24 = r4
            r25 = r5
            X.6Nt r17 = r22.A00(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x09bd }
            X.630 r12 = r1.BHJ()     // Catch:{ all -> 0x09bd }
            r22 = 0
            if (r12 == 0) goto L_0x0550
            r22 = 1
        L_0x0550:
            r18 = r4
            r19 = r5
            r20 = r1
            r21 = r0
            int r13 = X.C30821ap.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x09bd }
            if (r13 != 0) goto L_0x0587
            X.9S5 r17 = new X.9S5     // Catch:{ all -> 0x09bd }
            r18 = r28
            r19 = r6
            r20 = r11
            r21 = r1
            r22 = r10
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x09bd }
            X.630 r26 = r1.BHJ()     // Catch:{ all -> 0x09bd }
            r27 = 1
            r22 = r17
            X.6Nt r17 = r22.A00(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x09bd }
            r22 = 0
            r18 = r4
            r19 = r5
            r20 = r1
            r21 = r0
            int r13 = X.C30821ap.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x09bd }
        L_0x0587:
            if (r5 == 0) goto L_0x05c8
            X.1W9 r14 = r0.A0S     // Catch:{ all -> 0x09bd }
            java.lang.Integer r12 = r5.A08     // Catch:{ all -> 0x09bd }
            boolean r11 = r14.A03()     // Catch:{ all -> 0x09bd }
            if (r11 == 0) goto L_0x05c8
            if (r12 == 0) goto L_0x05c8
            X.00T r11 = r14.A05     // Catch:{ all -> 0x09bd }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x09bd }
            X.6Lb r11 = (X.C130436Lb) r11     // Catch:{ all -> 0x09bd }
            monitor-enter(r11)     // Catch:{ all -> 0x09bd }
            java.util.LinkedHashSet r14 = r11.A00     // Catch:{ all -> 0x09aa }
            r14.add(r12)     // Catch:{ all -> 0x09aa }
            int r12 = r14.size()     // Catch:{ all -> 0x09aa }
            r15 = 2000(0x7d0, float:2.803E-42)
            if (r12 <= r15) goto L_0x05c2
            int r12 = r14.size()     // Catch:{ all -> 0x09aa }
            int r12 = r12 - r15
            r15 = 0
            if (r12 < 0) goto L_0x0993
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x09aa }
        L_0x05b7:
            if (r15 >= r12) goto L_0x05c2
            r14.next()     // Catch:{ all -> 0x09aa }
            r14.remove()     // Catch:{ all -> 0x09aa }
            int r15 = r15 + 1
            goto L_0x05b7
        L_0x05c2:
            r11.A02 = r3     // Catch:{ all -> 0x09aa }
            X.C130436Lb.A00(r11)     // Catch:{ all -> 0x09aa }
            monitor-exit(r11)     // Catch:{ all -> 0x09bd }
        L_0x05c8:
            r11 = 2
            if (r13 == r11) goto L_0x08da
            X.1DW r13 = r0.A0L     // Catch:{ all -> 0x09bd }
            X.1AW r12 = r0.A0V     // Catch:{ all -> 0x09bd }
            X.1EO r11 = r0.A0W     // Catch:{ all -> 0x09bd }
            int r11 = X.AnonymousClass1DT.A01(r13, r1, r12, r11)     // Catch:{ all -> 0x09bd }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x09bd }
            r4.A0B = r12     // Catch:{ all -> 0x09bd }
            X.11F r11 = r1.BGb()     // Catch:{ all -> 0x09bd }
            boolean r11 = r7.A0V(r11, r12)     // Catch:{ all -> 0x09bd }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x09bd }
            r4.A02 = r11     // Catch:{ all -> 0x09bd }
            java.lang.Boolean r11 = r4.A00     // Catch:{ all -> 0x09bd }
            if (r11 == 0) goto L_0x05fd
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x09bd }
            if (r11 == 0) goto L_0x05fd
            if (r5 == 0) goto L_0x05f7
            r5.A02 = r3     // Catch:{ all -> 0x09bd }
        L_0x05f7:
            X.0yW r5 = r0.A0N     // Catch:{ all -> 0x09bd }
            r5.Bly(r4)     // Catch:{ all -> 0x09bd }
            goto L_0x063d
        L_0x05fd:
            X.11F r11 = r1.BGb()     // Catch:{ all -> 0x09bd }
            if (r11 == 0) goto L_0x0633
            r5 = 6500(0x1964, float:9.108E-42)
            X.0yV r12 = X.C21000yV.A02     // Catch:{ all -> 0x09bd }
            boolean r5 = X.C20800yB.A01(r12, r6, r5)     // Catch:{ all -> 0x09bd }
            if (r5 == 0) goto L_0x0633
            r5 = 7285(0x1c75, float:1.0208E-41)
            boolean r5 = X.C20800yB.A01(r12, r6, r5)     // Catch:{ all -> 0x09bd }
            if (r5 == 0) goto L_0x0633
            r5 = 7283(0x1c73, float:1.0206E-41)
            boolean r5 = X.C20800yB.A01(r12, r6, r5)     // Catch:{ all -> 0x09bd }
            if (r5 == 0) goto L_0x0633
            X.0xV r6 = r0.A0H     // Catch:{ all -> 0x09bd }
            boolean r5 = r11 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x09bd }
            if (r5 == 0) goto L_0x062c
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x09bd }
            boolean r6 = r6.A01(r11)     // Catch:{ all -> 0x09bd }
            r5 = 1
            if (r6 != 0) goto L_0x062d
        L_0x062c:
            r5 = 0
        L_0x062d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x09bd }
            r4.A01 = r5     // Catch:{ all -> 0x09bd }
        L_0x0633:
            X.0yW r6 = r0.A0N     // Catch:{ all -> 0x09bd }
            X.0u5 r5 = new X.0u5     // Catch:{ all -> 0x09bd }
            r5.<init>(r3, r3)     // Catch:{ all -> 0x09bd }
            r6.Bls(r4, r5, r3)     // Catch:{ all -> 0x09bd }
        L_0x063d:
            X.3T1 r6 = r1.BBj()     // Catch:{ all -> 0x09bd }
            boolean r5 = r6 instanceof X.AnonymousClass2bL     // Catch:{ all -> 0x09bd }
            if (r5 == 0) goto L_0x0665
            X.2bL r6 = (X.AnonymousClass2bL) r6     // Catch:{ all -> 0x09bd }
            boolean r5 = r6.A1Q()     // Catch:{ all -> 0x09bd }
            if (r5 != 0) goto L_0x0665
            java.lang.String r5 = "DecryptMessageRunnable/downloadLocationThumbnail"
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x09bd }
            r6.A02 = r3     // Catch:{ all -> 0x09bd }
            X.2ig r12 = new X.2ig     // Catch:{ all -> 0x09bd }
            r12.<init>(r0, r6)     // Catch:{ all -> 0x09bd }
            android.os.Handler r11 = r0.A00     // Catch:{ all -> 0x09bd }
            r6 = 25
            X.1jD r5 = new X.1jD     // Catch:{ all -> 0x09bd }
            r5.<init>(r0, r12, r6)     // Catch:{ all -> 0x09bd }
            r11.post(r5)     // Catch:{ all -> 0x09bd }
        L_0x0665:
            X.17X r6 = r0.A0G     // Catch:{ all -> 0x09bd }
            X.3Qa r5 = r1.BE4()     // Catch:{ all -> 0x09bd }
            X.11F r5 = r5.A00     // Catch:{ all -> 0x09bd }
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x09bd }
            java.util.HashSet r11 = r6.A05(r5)     // Catch:{ all -> 0x09bd }
            X.0wN r5 = r0.A02     // Catch:{ all -> 0x09bd }
            java.util.Set r5 = X.AnonymousClass143.A09(r5, r11)     // Catch:{ all -> 0x09bd }
            int r6 = r5.size()     // Catch:{ all -> 0x09bd }
            int r5 = r11.size()     // Catch:{ all -> 0x09bd }
            r7.A0R(r1, r6, r5)     // Catch:{ all -> 0x09bd }
            X.0ww r13 = r0.A07     // Catch:{ all -> 0x09bd }
            X.3T1 r6 = r1.BBj()     // Catch:{ all -> 0x09bd }
            X.11F r5 = r1.BGb()     // Catch:{ all -> 0x09bd }
            boolean r5 = r5 instanceof X.C177528dw     // Catch:{ all -> 0x09bd }
            if (r5 == 0) goto L_0x0695
            r12 = 3
            goto L_0x069d
        L_0x0695:
            if (r6 == 0) goto L_0x069c
            int r5 = r6.A1I     // Catch:{ all -> 0x09bd }
            r12 = 1
            if (r5 == 0) goto L_0x069d
        L_0x069c:
            r12 = 2
        L_0x069d:
            long r5 = r1.BIM()     // Catch:{ all -> 0x09bd }
            boolean r11 = r1.BMd()     // Catch:{ all -> 0x09bd }
            r13.A03(r12, r5, r11)     // Catch:{ all -> 0x09bd }
            java.lang.Boolean r5 = r4.A00     // Catch:{ all -> 0x09bd }
            if (r5 == 0) goto L_0x06c5
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x09bd }
            if (r5 != 0) goto L_0x06c5
            java.lang.Integer r4 = r4.A08     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x0757
            int r5 = r4.intValue()     // Catch:{ all -> 0x09bd }
        L_0x06ba:
            int r4 = r1.B9h()     // Catch:{ all -> 0x09bd }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x09bd }
            r7.A0T(r1, r4, r5)     // Catch:{ all -> 0x09bd }
        L_0x06c5:
            boolean r4 = r1.BvM()     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x06fe
            X.11F r4 = r1.BGb()     // Catch:{ all -> 0x09bd }
            boolean r4 = r4 instanceof X.C177528dw     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x06fe
            r5 = 24
            X.1jD r4 = new X.1jD     // Catch:{ all -> 0x09bd }
            r4.<init>(r0, r1, r5)     // Catch:{ all -> 0x09bd }
            r10.Boy(r4)     // Catch:{ all -> 0x09bd }
        L_0x06dd:
            X.1A5 r5 = r0.A0D     // Catch:{ all -> 0x09bd }
            X.11F r4 = r1.BGb()     // Catch:{ all -> 0x09bd }
            X.141 r6 = r5.A01(r4)     // Catch:{ all -> 0x09bd }
            boolean r4 = r6.A0z     // Catch:{ all -> 0x09bd }
            if (r4 != 0) goto L_0x06f7
            r6.A0z = r3     // Catch:{ all -> 0x09bd }
            r5 = 22
            X.1jD r4 = new X.1jD     // Catch:{ all -> 0x09bd }
            r4.<init>(r0, r6, r5)     // Catch:{ all -> 0x09bd }
            r10.Boy(r4)     // Catch:{ all -> 0x09bd }
        L_0x06f7:
            boolean r4 = r1.BNC()     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x075e
            goto L_0x075b
        L_0x06fe:
            boolean r4 = r1.BvI()     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x06dd
            X.1WG r7 = r0.A09     // Catch:{ all -> 0x09bd }
            X.11F r13 = r1.B9Y()     // Catch:{ all -> 0x09bd }
            X.C18740tg.A06(r13)     // Catch:{ all -> 0x09bd }
            X.3Qa r12 = r1.BE4()     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid r11 = r1.BHK()     // Catch:{ all -> 0x09bd }
            int r6 = r1.BBO()     // Catch:{ all -> 0x09bd }
            java.lang.Iterable r4 = r7.getObservers()     // Catch:{ all -> 0x09bd }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x09bd }
        L_0x0721:
            boolean r4 = r5.hasNext()     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x0731
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x09bd }
            X.1NL r4 = (X.AnonymousClass1NL) r4     // Catch:{ all -> 0x09bd }
            r4.BTN(r13, r11, r12, r6)     // Catch:{ all -> 0x09bd }
            goto L_0x0721
        L_0x0731:
            boolean r4 = r1.BMO()     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x06dd
            X.3Qa r4 = r1.BE4()     // Catch:{ all -> 0x09bd }
            X.11F r6 = r4.A00     // Catch:{ all -> 0x09bd }
            if (r6 == 0) goto L_0x06dd
            java.lang.Iterable r4 = r7.getObservers()     // Catch:{ all -> 0x09bd }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x09bd }
        L_0x0747:
            boolean r4 = r5.hasNext()     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x06dd
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x09bd }
            X.1NL r4 = (X.AnonymousClass1NL) r4     // Catch:{ all -> 0x09bd }
            r4.BaT(r6)     // Catch:{ all -> 0x09bd }
            goto L_0x0747
        L_0x0757:
            r5 = 34
            goto L_0x06ba
        L_0x075b:
            if (r8 == 0) goto L_0x08da
            goto L_0x0761
        L_0x075e:
            if (r8 == 0) goto L_0x08da
            goto L_0x07b0
        L_0x0761:
            X.AHp r1 = (X.C21337AHp) r1     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "DecryptMessageRunnable/sendRetry"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x09bd }
            int r4 = r1.BGp()     // Catch:{ all -> 0x09bd }
            r6 = 0
            if (r4 <= 0) goto L_0x0813
            byte[] r21 = r28.A0c()     // Catch:{ all -> 0x09bd }
            X.5tq r19 = r28.A0G()     // Catch:{ all -> 0x09bd }
            X.5tq r20 = r28.A0H()     // Catch:{ all -> 0x09bd }
            boolean r4 = r29.A0L()     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x080f
            X.0wp r4 = r0.A0A     // Catch:{ all -> 0x09bd }
            byte[] r22 = r4.A02()     // Catch:{ all -> 0x09bd }
        L_0x0787:
            X.11F r4 = r1.BGb()     // Catch:{ all -> 0x09bd }
            boolean r4 = r4 instanceof X.C177528dw     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x07de
            int r5 = r1.A01     // Catch:{ all -> 0x09bd }
            r4 = 7
            if (r5 != r4) goto L_0x07de
            boolean r4 = r1.BMW()     // Catch:{ all -> 0x09bd }
            if (r4 == 0) goto L_0x07c4
            X.1SR r8 = r0.A0F     // Catch:{ all -> 0x09bd }
            X.1C7 r7 = r8.A03     // Catch:{ all -> 0x09bd }
            r4 = 7
            X.1j7 r5 = new X.1j7     // Catch:{ all -> 0x09bd }
            r5.<init>(r8, r1, r4)     // Catch:{ all -> 0x09bd }
            r4 = 29
            r7.A01(r5, r4)     // Catch:{ all -> 0x09bd }
            X.1DL r5 = r0.A0T     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "status-revoke-delay"
            r5.A0E(r1, r4, r6)     // Catch:{ all -> 0x09bd }
        L_0x07b0:
            X.0v5 r1 = r0.A01     // Catch:{ all -> 0x09bd }
            boolean r0 = r1.A05()     // Catch:{ all -> 0x09bd }
            if (r0 == 0) goto L_0x08da
            r1.A02()     // Catch:{ all -> 0x09bd }
            java.lang.String r1 = "sendAutomatedMessagesIfNeeded"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x09bd }
            r0.<init>(r1)     // Catch:{ all -> 0x09bd }
            goto L_0x09af
        L_0x07c4:
            X.16E r7 = r0.A0J     // Catch:{ all -> 0x09bd }
            X.11F r5 = r1.BFC()     // Catch:{ all -> 0x09bd }
            X.13r r4 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid r4 = X.C222813r.A00(r5)     // Catch:{ all -> 0x09bd }
            X.3Sz r4 = r7.A08(r4)     // Catch:{ all -> 0x09bd }
            if (r4 != 0) goto L_0x07de
            X.1DL r5 = r0.A0T     // Catch:{ all -> 0x09bd }
            java.lang.String r4 = "status-revoke-drop"
            r5.A0E(r1, r4, r6)     // Catch:{ all -> 0x09bd }
            goto L_0x07b0
        L_0x07de:
            X.1aK r4 = r0.A03     // Catch:{ all -> 0x09bd }
            r23 = 0
            r17 = r4
            r18 = r1
            X.9Sr r5 = r17.A00(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x09bd }
            int r4 = r1.A04     // Catch:{ all -> 0x09bd }
            r1 = 1
            if (r4 == r3) goto L_0x080b
            r1 = 2
            if (r4 == r1) goto L_0x080b
            r1 = 3
            if (r4 == r1) goto L_0x080b
            r1 = 4
            if (r4 == r1) goto L_0x080b
            switch(r4) {
                case 8: goto L_0x0809;
                case 9: goto L_0x0806;
                case 10: goto L_0x0804;
                case 11: goto L_0x0802;
                case 12: goto L_0x0800;
                case 13: goto L_0x07fd;
                default: goto L_0x07fb;
            }     // Catch:{ all -> 0x09bd }
        L_0x07fb:
            r1 = 0
            goto L_0x080b
        L_0x07fd:
            r1 = 8
            goto L_0x080b
        L_0x0800:
            r1 = 7
            goto L_0x080b
        L_0x0802:
            r1 = 5
            goto L_0x080b
        L_0x0804:
            r1 = 6
            goto L_0x080b
        L_0x0806:
            r1 = 10
            goto L_0x080b
        L_0x0809:
            r1 = 11
        L_0x080b:
            r5.A00(r1)     // Catch:{ all -> 0x09bd }
            goto L_0x07b0
        L_0x080f:
            r22 = r6
            goto L_0x0787
        L_0x0813:
            r21 = r6
            r19 = r6
            r20 = r6
            r22 = r6
            goto L_0x0787
        L_0x081d:
            X.0wQ r0 = r2.A05     // Catch:{ all -> 0x09bd }
            boolean r0 = r0.A0N(r7)     // Catch:{ all -> 0x09bd }
            if (r0 != 0) goto L_0x0869
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r4.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r0 = "MessagingXmppHandler/onMessageForMe/invalid adv sender="
            r4.append(r0)     // Catch:{ all -> 0x09bd }
            r4.append(r7)     // Catch:{ all -> 0x09bd }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x09bd }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x09bd }
            X.1Nr r5 = r2.A0E     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid[] r4 = new com.whatsapp.jid.UserJid[r3]     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid r0 = r7.userJid     // Catch:{ all -> 0x09bd }
            r4[r6] = r0     // Catch:{ all -> 0x09bd }
            r0 = 3
            r5.A01(r4, r0)     // Catch:{ all -> 0x09bd }
            r5 = 5
            r4 = 12
            boolean r0 = r1.BvK()     // Catch:{ all -> 0x09bd }
            if (r0 == 0) goto L_0x0851
            r1.Brb(r5)     // Catch:{ all -> 0x09bd }
        L_0x0851:
            X.1aK r0 = r2.A04     // Catch:{ all -> 0x09bd }
            r19 = 0
            r21 = r19
            r22 = r19
            r23 = 0
            r17 = r0
            r18 = r1
            r20 = r19
            X.9Sr r0 = r17.A00(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x09bd }
            r0.A00(r4)     // Catch:{ all -> 0x09bd }
            goto L_0x08da
        L_0x0869:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r4.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r0 = "MessagingXmppHandler/onMessageForMe/invalid self device identity, jid="
            r4.append(r0)     // Catch:{ all -> 0x09bd }
            r4.append(r7)     // Catch:{ all -> 0x09bd }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x09bd }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x09bd }
            r4 = 6
            boolean r0 = r1.BvK()     // Catch:{ all -> 0x09bd }
            if (r0 != 0) goto L_0x088a
            X.1DL r0 = r2.A0j     // Catch:{ all -> 0x09bd }
            r0.A0C(r1)     // Catch:{ all -> 0x09bd }
            goto L_0x08da
        L_0x088a:
            r1.Brb(r4)     // Catch:{ all -> 0x09bd }
            X.1aQ r4 = r2.A0e     // Catch:{ all -> 0x09bd }
            X.AHp r1 = (X.C21337AHp) r1     // Catch:{ all -> 0x09bd }
            r0 = 0
            X.C30571aQ.A00(r4, r0, r1)     // Catch:{ all -> 0x09bd }
            goto L_0x08da
        L_0x0896:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x09bd }
            r4.<init>()     // Catch:{ all -> 0x09bd }
            java.lang.String r0 = "MessagingXmppHandler/onMessageForMe/unknown device message without prekey, jid="
            r4.append(r0)     // Catch:{ all -> 0x09bd }
            r4.append(r7)     // Catch:{ all -> 0x09bd }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x09bd }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x09bd }
            r5 = 8
            r4 = 11
            boolean r0 = r1.BvK()     // Catch:{ all -> 0x09bd }
            if (r0 == 0) goto L_0x08b7
            r1.Brb(r5)     // Catch:{ all -> 0x09bd }
        L_0x08b7:
            X.1aK r0 = r2.A04     // Catch:{ all -> 0x09bd }
            r19 = 0
            r21 = r19
            r22 = r19
            r23 = 0
            r17 = r0
            r18 = r1
            r20 = r19
            X.9Sr r0 = r17.A00(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x09bd }
            r0.A00(r4)     // Catch:{ all -> 0x09bd }
            X.1Nr r4 = r2.A0E     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r3]     // Catch:{ all -> 0x09bd }
            com.whatsapp.jid.UserJid r0 = r7.userJid     // Catch:{ all -> 0x09bd }
            r1[r6] = r0     // Catch:{ all -> 0x09bd }
            r0 = 3
            r4.A01(r1, r0)     // Catch:{ all -> 0x09bd }
        L_0x08da:
            if (r16 == 0) goto L_0x08df
            r16.close()     // Catch:{ all -> 0x09c9 }
        L_0x08df:
            if (r9 == 0) goto L_0x0028
            java.util.Set r1 = r2.A0x
            monitor-enter(r1)
            goto L_0x09b0
        L_0x08e6:
            java.lang.Object r8 = r5.A00
            X.1VX r8 = (X.AnonymousClass1VX) r8
            java.lang.Object r9 = r5.A01
            X.13w r9 = (X.C223313w) r9
            java.lang.Object r7 = r5.A02
            X.13w r7 = (X.C223313w) r7
            java.lang.Object r6 = r5.A03
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r5 = r5.A04
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.1FV r10 = r8.A04
            monitor-enter(r10)
            X.12j r0 = r10.A03     // Catch:{ all -> 0x09dd }
            long r11 = r0.A07(r9)     // Catch:{ all -> 0x09dd }
            long r3 = r0.A07(r7)     // Catch:{ all -> 0x09dd }
            r1 = -1
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0927
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0927
            java.lang.Boolean r0 = r10.A06(r9)     // Catch:{ all -> 0x09dd }
            if (r0 == 0) goto L_0x091e
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x09dd }
            X.AnonymousClass1FV.A04(r10, r7, r3, r0)     // Catch:{ all -> 0x09dd }
        L_0x091e:
            long r1 = X.AnonymousClass1FV.A00(r10, r9)     // Catch:{ all -> 0x09dd }
            X.1FW r0 = r10.A04     // Catch:{ all -> 0x09dd }
            r0.A03(r3, r1)     // Catch:{ all -> 0x09dd }
        L_0x0927:
            monitor-exit(r10)
            boolean r0 = r6 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0933
            X.12O r0 = r8.A03
            com.whatsapp.jid.PhoneUserJid r6 = (com.whatsapp.jid.PhoneUserJid) r6
            r0.A0H(r9, r6)
        L_0x0933:
            boolean r0 = r5 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0028
            X.12O r0 = r8.A03
            com.whatsapp.jid.PhoneUserJid r5 = (com.whatsapp.jid.PhoneUserJid) r5
            r0.A0H(r7, r5)
            return
        L_0x093f:
            java.lang.Object r1 = r5.A01
            X.005 r1 = (X.AnonymousClass005) r1
            java.lang.Object r4 = r5.A02
            X.13Q r4 = (X.AnonymousClass13Q) r4
            java.lang.Object r3 = r5.A03
            X.12q r3 = (X.C220412q) r3
            java.lang.Object r2 = r5.A04
            X.005 r2 = (X.AnonymousClass005) r2
            r0 = -8
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r1.get()
            X.12s r0 = (X.C220612s) r0
            X.12P r0 = r0.A00
            r1 = 0
            boolean r0 = r0.A0A(r4, r1)
            X.C220412q.A00(r3)
            if (r0 == 0) goto L_0x0973
            java.lang.String r0 = "app-init/main/msgstoredb/healthy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r2.get()
            X.0y3 r0 = (X.C20720y3) r0
            r0.A07()
        L_0x0973:
            android.os.Process.setThreadPriority(r1)
            return
        L_0x0977:
            java.lang.Object r1 = r5.A00
            X.1Ps r1 = (X.C27761Ps) r1
            java.lang.Object r2 = r5.A01
            X.141 r2 = (X.AnonymousClass141) r2
            java.lang.Object r4 = r5.A02
            X.147 r4 = (X.AnonymousClass147) r4
            java.lang.Object r3 = r5.A03
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            java.lang.Object r0 = r5.A04
            X.026 r0 = (X.AnonymousClass026) r0
            r5 = 0
            X.C27761Ps.A02(r0, r1, r2, r3, r4, r5)
            return
        L_0x0990:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0993:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09aa }
            r1.<init>()     // Catch:{ all -> 0x09aa }
            java.lang.String r0 = "n must be positive, but got "
            r1.append(r0)     // Catch:{ all -> 0x09aa }
            r1.append(r12)     // Catch:{ all -> 0x09aa }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x09aa }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x09aa }
            r0.<init>(r1)     // Catch:{ all -> 0x09aa }
            throw r0     // Catch:{ all -> 0x09aa }
        L_0x09aa:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x09bd }
            goto L_0x09af
        L_0x09ad:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x09bd }
        L_0x09af:
            throw r0     // Catch:{ all -> 0x09bd }
        L_0x09b0:
            r1.remove(r9)     // Catch:{ all -> 0x09ba }
            int r0 = r2.A00     // Catch:{ all -> 0x09ba }
            int r0 = r0 - r3
            r2.A00 = r0     // Catch:{ all -> 0x09ba }
            monitor-exit(r1)     // Catch:{ all -> 0x09ba }
            return
        L_0x09ba:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x09ba }
            throw r0
        L_0x09bd:
            r1 = move-exception
            if (r16 == 0) goto L_0x09c8
            r16.close()     // Catch:{ all -> 0x09c4 }
            goto L_0x09c8
        L_0x09c4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09c9 }
        L_0x09c8:
            throw r1     // Catch:{ all -> 0x09c9 }
        L_0x09c9:
            r4 = move-exception
            if (r9 == 0) goto L_0x09dc
            java.util.Set r1 = r2.A0x
            monitor-enter(r1)
            r1.remove(r9)     // Catch:{ all -> 0x09d9 }
            int r0 = r2.A00     // Catch:{ all -> 0x09d9 }
            int r0 = r0 - r3
            r2.A00 = r0     // Catch:{ all -> 0x09d9 }
            monitor-exit(r1)     // Catch:{ all -> 0x09d9 }
            throw r4
        L_0x09d9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x09d9 }
            throw r0
        L_0x09dc:
            throw r4
        L_0x09dd:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35421if.run():void");
    }
}
