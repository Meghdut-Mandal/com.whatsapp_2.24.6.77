package X;

/* renamed from: X.7oq  reason: invalid class name and case insensitive filesystem */
public class C162597oq extends AnonymousClass9YG {
    public Object A00;
    public final int A01;

    public C162597oq(C203169nR r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void A00() {
        if (1 - this.A01 != 0) {
            super.A00();
            return;
        }
        AnonymousClass9AO.A01.A02("sup:SUPDelegate", "MediaStreamStateListener:onConnect");
        C203169nR r4 = (C203169nR) this.A00;
        C202609mI r3 = r4.A0C;
        r3.A04();
        if (AnonymousClass00C.A0J(r4.A02, AnonymousClass21B.A00)) {
            AnonymousClass21A A002 = r4.A02.A00(false);
            r4.A02 = A002;
            r4.A02 = A002.A01((AnonymousClass9QU) null, (Boolean) null, C36371kC.A0m());
            AnonymousClass00S r0 = r4.A04;
            if (r0 != null) {
                r0.invoke();
            }
        }
        r4.A0B.A0F = r3.A01;
    }

    public void A01() {
        if (1 - this.A01 != 0) {
            super.A01();
            return;
        }
        C200159gk r5 = AnonymousClass9AO.A01;
        r5.A02("sup:SUPDelegate", "MediaStreamStateListener:onDisconnected");
        C203169nR r3 = (C203169nR) this.A00;
        if (AnonymousClass00C.A0J(r3.A02, AnonymousClass21B.A00)) {
            r5.A01("sup:SUPDelegate", "SUP is not activated, switching to connected but not selected state");
            r3.A02 = r3.A02.A00(false);
            C202609mI r2 = r3.A0C;
            r2.A06(C98714rs.A00);
            r2.A05(new C1695289r("LIVE_STREAM_CONNECT_FAIL"));
            AnonymousClass00S r0 = r3.A04;
            if (r0 != null) {
                r0.invoke();
            }
        }
        if (C203169nR.A05(r3)) {
            r5.A01("sup:SUPDelegate", "MediaStreamStateListener:startErrorToConnectJob onDisconnected");
            C203169nR.A04(r3, true);
        }
    }

    public void A02() {
        if (this.A01 != 0) {
            super.A02();
            return;
        }
        AnonymousClass9AO.A01.A02("sup:SUPDelegate", "MediaStreamStateListener:onDiscovered");
        C203169nR r2 = (C203169nR) this.A00;
        r2.A0B.A0J.remove("sup:SUPDelegate_ON_DISCOVERED_CALLBACK");
        if (AnonymousClass00C.A0J(r2.A02, AnonymousClass21D.A00)) {
            r2.A09();
            AnonymousClass00S r0 = r2.A04;
            if (r0 != null) {
                r0.invoke();
            }
            C203169nR.A03(r2, true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r7 = this;
            int r0 = r7.A01
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x000a
            super.A03()
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r3 = r7.A00
            X.9nR r3 = (X.C203169nR) r3
            X.9mI r4 = r3.A0C
            X.4rr r2 = X.C98704rr.A00
            int r1 = r2.A00
            r0 = 4
            if (r1 == r0) goto L_0x001d
            r0 = 10
            if (r1 != r0) goto L_0x0020
            X.4rm r2 = X.C98654rm.A00
        L_0x001d:
            r4.A06(r2)
        L_0x0020:
            X.9gk r2 = X.AnonymousClass9AO.A01
            java.lang.String r1 = "sup:SUPDelegate"
            java.lang.String r0 = "MediaStreamStateListener:onStreamStarted"
            r2.A02(r1, r0)
            X.3FS r0 = r3.A02
            r5 = 1
            X.21A r0 = r0.A00(r5)
            r3.A02 = r0
            X.00S r0 = r4.A02
            java.lang.Object r1 = r0.invoke()
            X.9QU r1 = (X.AnonymousClass9QU) r1
            if (r1 == 0) goto L_0x0047
            boolean r0 = r1 instanceof X.C169768Ap
            if (r0 == 0) goto L_0x0047
            X.8Ap r0 = r4.A00
            if (r0 == 0) goto L_0x0047
            X.C202609mI.A02(r4, r0, r1)
        L_0x0047:
            X.7MB r0 = new X.7MB
            r0.<init>(r3)
            X.C203169nR.A02(r3, r0, r5)
            X.7jQ r6 = r3.A0D
            X.6uX r6 = (X.C145796uX) r6
            java.lang.String r0 = "VoipGlassesManager.kt onGlassesActive"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r4 == 0) goto L_0x00b1
            X.6ro r3 = r6.A00
            X.6YM r0 = r3.A00
            boolean r1 = X.AnonymousClass000.A1V(r0)
            java.lang.String r0 = "VoiceService is null"
            X.C18740tg.A0D(r1, r0)
            X.6EE r0 = r4.self
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "VoipGlassesManager.kt onGlassesActive selfInfo is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0075:
            int r1 = r0.A06
            if (r1 != 0) goto L_0x00bd
            java.lang.String r0 = "VoipGlassesManager.kt onGlassesActive triggering a pocket start."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yC r2 = r3.A07
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x00ec
            r0 = 6624(0x19e0, float:9.282E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x00ec
            boolean r0 = X.C144206ro.A00(r4)
            if (r0 == 0) goto L_0x0009
            X.6YM r4 = r3.A00
            if (r4 == 0) goto L_0x00b1
            X.C90464aC.A14(r4)
            android.os.Handler r0 = r4.A0c
            r3 = 23
            r0.removeMessages(r3)
            android.os.Handler r2 = r4.A0c
            r0 = 45000(0xafc8, double:2.2233E-319)
            r2.sendEmptyMessageDelayed(r3, r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r4.A1E
            X.74R r0 = X.AnonymousClass74R.A00
        L_0x00ae:
            r1.execute(r0)
        L_0x00b1:
            X.6ro r0 = r6.A00
            X.02t r1 = r0.A0B
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.invoke(r0)
            return
        L_0x00bd:
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "VoipGlassesManager.kt onGlassesActive Video stopped. Turning back on."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C144206ro.A00(r4)
            if (r0 == 0) goto L_0x0009
            X.6YM r0 = r3.A00
            if (r0 == 0) goto L_0x00b1
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A1E
            X.74S r0 = X.AnonymousClass74S.A00
            goto L_0x00ae
        L_0x00d8:
            java.lang.String r0 = "VoipGlassesManager.kt onGlassesActive Toggling to glasses."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6YM r0 = r3.A00
            if (r0 == 0) goto L_0x00b1
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A1E
            X.74d r0 = new X.74d
            r0.<init>((boolean) r5)
            r1.execute(r0)
            goto L_0x00b1
        L_0x00ec:
            java.lang.String r0 = "VoipGlassesManager.kt onGlassesActive Pocket start is not enabled."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162597oq.A03():void");
    }

    public void A04(C194269Ow r7) {
        if (1 - this.A01 != 0) {
            super.A04(r7);
            return;
        }
        C200159gk r4 = AnonymousClass9AO.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaStreamStateListener:onError ");
        r4.A02("sup:SUPDelegate", AnonymousClass000.A0q(r7.A01(), A0u));
        C203169nR r2 = (C203169nR) this.A00;
        if (AnonymousClass00C.A0J(r2.A02, AnonymousClass21B.A00)) {
            r4.A01("sup:SUPDelegate", "SUP is not activated, switching to connected but not selected state");
            r2.A02 = r2.A02.A00(false);
            AnonymousClass00S r0 = r2.A04;
            if (r0 != null) {
                r0.invoke();
            }
        }
        r2.A0C.A05(r7);
        if (C203169nR.A05(r2)) {
            r4.A01("sup:SUPDelegate", "MediaStreamStateListener:startErrorToConnectJob onError");
            C203169nR.A04(r2, true);
        }
        r2.A0D.BYf();
    }

    public void A05(AnonymousClass95G r5) {
        C202609mI r1;
        AnonymousClass9QU r0;
        if (1 - this.A01 != 0) {
            super.A05(r5);
            return;
        }
        if (AnonymousClass00C.A0J(r5, AnonymousClass8A0.A00)) {
            AnonymousClass9AO.A01.A02("sup:SUPDelegate", "MediaStreamStateListener:onUserEvent SGDonned");
            r1 = ((C203169nR) this.A00).A0C;
            r0 = C98694rq.A00;
        } else if (AnonymousClass00C.A0J(r5, C1696089z.A00)) {
            C203169nR r2 = (C203169nR) this.A00;
            if (r2.A0B()) {
                AnonymousClass9AO.A01.A02("sup:SUPDelegate", "MediaStreamStateListener:onUserEvent SGDoffedImmediate");
                r1 = r2.A0C;
                r0 = C98664rn.A00;
            } else {
                return;
            }
        } else if (AnonymousClass00C.A0J(r5, C1695989y.A00)) {
            C203169nR r22 = (C203169nR) this.A00;
            if (r22.A0B()) {
                AnonymousClass9AO.A01.A02("sup:SUPDelegate", "MediaStreamStateListener:onUserEvent SGDoffErrorDuringStream");
                r22.A0D.BYf();
                return;
            }
            return;
        } else {
            return;
        }
        r1.A06(r0);
    }
}
