package com.whatsapp.otp;

import X.AnonymousClass1J1;
import X.AnonymousClass1J3;
import X.AnonymousClass1TG;
import X.AnonymousClass1TH;
import X.C19970wo;
import X.C36331k8;
import X.C36441kJ;
import android.content.BroadcastReceiver;

public final class OtpRequestedReceiver extends BroadcastReceiver {
    public C19970wo A00;
    public AnonymousClass1J3 A01;
    public AnonymousClass1J1 A02;
    public AnonymousClass1TH A03;
    public AnonymousClass1TG A04;
    public final Object A05;
    public volatile boolean A06;

    public final AnonymousClass1J1 A00() {
        AnonymousClass1J1 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("loggingUtil");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r1.A00.A0E(6758) != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            r10 = this;
            boolean r0 = r10.A06
            if (r0 != 0) goto L_0x001a
            java.lang.Object r1 = r10.A05
            monitor-enter(r1)
            boolean r0 = r10.A06     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            X.0tt r0 = X.C56042vd.A00(r11)     // Catch:{ all -> 0x0017 }
            X.C18830tt.APX(r0, r10)     // Catch:{ all -> 0x0017 }
            r0 = 1
            r10.A06 = r0     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            X.C36321k7.A0w(r11, r12)
            r10.A00()     // Catch:{ Exception -> 0x015f }
            java.lang.String r0 = "Wa-otp-handshake: handshake intent received"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x015f }
            java.lang.String r0 = "_ci_"
            android.os.Parcelable r0 = r12.getParcelableExtra(r0)     // Catch:{ Exception -> 0x015f }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x014d
            java.lang.String r6 = r0.getCreatorPackage()     // Catch:{ Exception -> 0x015f }
            if (r6 != 0) goto L_0x0037
            java.lang.String r6 = ""
        L_0x0037:
            java.lang.String r2 = "request_id"
            java.lang.String r4 = r12.getStringExtra(r2)     // Catch:{ Exception -> 0x015f }
            X.1J3 r1 = r10.A01     // Catch:{ Exception -> 0x015f }
            if (r1 == 0) goto L_0x013f
            boolean r0 = r1.A00(r6)     // Catch:{ Exception -> 0x015f }
            if (r0 != 0) goto L_0x0052
            X.0yC r1 = r1.A00     // Catch:{ Exception -> 0x015f }
            r0 = 6758(0x1a66, float:9.47E-42)
            boolean r1 = r1.A0E(r0)     // Catch:{ Exception -> 0x015f }
            r0 = 0
            if (r1 == 0) goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            r3 = 0
            if (r0 == 0) goto L_0x0059
            if (r4 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r4 = r3
            goto L_0x0068
        L_0x005b:
            java.lang.String r1 = "^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$"
            X.0fN r0 = new X.0fN     // Catch:{ Exception -> 0x015f }
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x015f }
            boolean r0 = r0.A03(r4)     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x0059
        L_0x0068:
            X.1TH r3 = r10.A03     // Catch:{ Exception -> 0x015f }
            if (r3 == 0) goto L_0x0138
            X.0wo r0 = r10.A00     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x0131
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x015f }
            r9 = r4
            java.lang.String r5 = X.C36361kB.A0l()     // Catch:{ Exception -> 0x015f }
            X.AnonymousClass00C.A08(r5)     // Catch:{ Exception -> 0x015f }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x015f }
            java.util.Map r0 = r3.A02     // Catch:{ Exception -> 0x015f }
            r0.put(r6, r1)     // Catch:{ Exception -> 0x015f }
            java.util.Map r0 = r3.A00     // Catch:{ Exception -> 0x015f }
            r0.put(r6, r5)     // Catch:{ Exception -> 0x015f }
            if (r4 == 0) goto L_0x0091
            java.util.Map r0 = r3.A01     // Catch:{ Exception -> 0x015f }
            r0.put(r6, r4)     // Catch:{ Exception -> 0x015f }
        L_0x0091:
            java.lang.String r0 = "SDK_VERSION"
            java.lang.String r1 = r12.getStringExtra(r0)     // Catch:{ Exception -> 0x015f }
            X.1J1 r8 = r10.A00()     // Catch:{ Exception -> 0x015f }
            X.2T4 r3 = new X.2T4     // Catch:{ Exception -> 0x015f }
            r3.<init>()     // Catch:{ Exception -> 0x015f }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ Exception -> 0x015f }
            r3.A08 = r0     // Catch:{ Exception -> 0x015f }
            java.lang.Integer r7 = X.C36401kF.A0h()     // Catch:{ Exception -> 0x015f }
            r3.A07 = r7     // Catch:{ Exception -> 0x015f }
            r3.A0L = r6     // Catch:{ Exception -> 0x015f }
            r3.A0E = r5     // Catch:{ Exception -> 0x015f }
            r3.A0H = r1     // Catch:{ Exception -> 0x015f }
            X.1J3 r0 = r8.A04     // Catch:{ Exception -> 0x015f }
            X.0yC r1 = r0.A00     // Catch:{ Exception -> 0x015f }
            r0 = 7493(0x1d45, float:1.05E-41)
            boolean r0 = r1.A0E(r0)     // Catch:{ Exception -> 0x015f }
            if (r0 != 0) goto L_0x00bf
            r9 = 0
        L_0x00bf:
            r3.A0G = r9     // Catch:{ Exception -> 0x015f }
            X.AnonymousClass1J1.A00(r3, r8)     // Catch:{ Exception -> 0x015f }
            X.0yW r0 = r8.A03     // Catch:{ Exception -> 0x015f }
            r0.Bly(r3)     // Catch:{ Exception -> 0x015f }
            r10.A00()     // Catch:{ Exception -> 0x015f }
            java.lang.String r0 = "Wa-otp-handshake: handshake intent registered"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x015f }
            X.1J3 r0 = r10.A01     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x0146
            boolean r0 = r0.A00(r6)     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x017d
            if (r4 == 0) goto L_0x017d
            X.1TG r0 = r10.A04     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x012a
            android.content.Intent r1 = X.C36431kI.A0D()     // Catch:{ Exception -> 0x015f }
            r1.setPackage(r6)     // Catch:{ Exception -> 0x015f }
            java.lang.String r0 = "com.whatsapp.otp.OTP_HANDSHAKE_CONFIRMATION"
            r1.setAction(r0)     // Catch:{ Exception -> 0x015f }
            r1.putExtra(r2, r4)     // Catch:{ Exception -> 0x015f }
            r11.sendBroadcast(r1)     // Catch:{ Exception -> 0x015f }
            X.1J1 r3 = r10.A00()     // Catch:{ Exception -> 0x015f }
            X.1J3 r0 = r3.A04     // Catch:{ Exception -> 0x015f }
            X.0yC r2 = r0.A00     // Catch:{ Exception -> 0x015f }
            r0 = 7204(0x1c24, float:1.0095E-41)
            boolean r0 = r2.A0E(r0)     // Catch:{ Exception -> 0x015f }
            if (r0 == 0) goto L_0x017d
            X.2T4 r1 = new X.2T4     // Catch:{ Exception -> 0x015f }
            r1.<init>()     // Catch:{ Exception -> 0x015f }
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x015f }
            r1.A08 = r0     // Catch:{ Exception -> 0x015f }
            r1.A07 = r7     // Catch:{ Exception -> 0x015f }
            r1.A0L = r6     // Catch:{ Exception -> 0x015f }
            r1.A0E = r5     // Catch:{ Exception -> 0x015f }
            r0 = 7493(0x1d45, float:1.05E-41)
            boolean r0 = r2.A0E(r0)     // Catch:{ Exception -> 0x015f }
            if (r0 != 0) goto L_0x011f
            r4 = 0
        L_0x011f:
            r1.A0G = r4     // Catch:{ Exception -> 0x015f }
            X.AnonymousClass1J1.A00(r1, r3)     // Catch:{ Exception -> 0x015f }
            X.0yW r0 = r3.A03     // Catch:{ Exception -> 0x015f }
            r0.Bly(r1)     // Catch:{ Exception -> 0x015f }
            return
        L_0x012a:
            java.lang.String r0 = "otpClient"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ Exception -> 0x015f }
            goto L_0x014c
        L_0x0131:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ Exception -> 0x015f }
            goto L_0x014c
        L_0x0138:
            java.lang.String r0 = "otpStateManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ Exception -> 0x015f }
            goto L_0x014c
        L_0x013f:
            java.lang.String r0 = "otpGatingManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ Exception -> 0x015f }
            goto L_0x014c
        L_0x0146:
            java.lang.String r0 = "otpGatingManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ Exception -> 0x015f }
        L_0x014c:
            throw r0     // Catch:{ Exception -> 0x015f }
        L_0x014d:
            X.1J1 r1 = r10.A00()     // Catch:{ Exception -> 0x015f }
            java.lang.String r0 = "OTP intent has no caller info"
            r1.A04(r0)     // Catch:{ Exception -> 0x015f }
            r10.A00()     // Catch:{ Exception -> 0x015f }
            java.lang.String r0 = "Wa-otp-handshake: PendingIntent missing from handshake Intent"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x015f }
            return
        L_0x015f:
            r3 = move-exception
            java.lang.String r0 = "OTP: Error while unmarshalling"
            com.whatsapp.util.Log.e(r0, r3)
            X.1J1 r2 = r10.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.AnonymousClass000.A0k(r3)
            r1.append(r0)
            java.lang.String r0 = " / "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r3)
            r2.A04(r0)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.otp.OtpRequestedReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public OtpRequestedReceiver(int i) {
        this.A06 = false;
        this.A05 = C36441kJ.A11();
    }

    public OtpRequestedReceiver() {
        this(0);
    }
}
