package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.6XR  reason: invalid class name */
public class AnonymousClass6XR {
    public int A00;
    public Ringtone A01;
    public Uri A02;
    public long[] A03;
    public C106935Lx A04;
    public C19930wk A05;
    public final int A06;
    public final Context A07;
    public final AnonymousClass6YM A08;
    public final C21060yb A09;
    public final C20810yC A0A;
    public final AnonymousClass1CR A0B;
    public final int A0C;
    public final C116985lW A0D = new C116985lW(this);
    public final C19970wo A0E;
    public final AnonymousClass13J A0F;
    public final C19770wU A0G;

    public void A06() {
        this.A02 = null;
        C106935Lx r1 = this.A04;
        if (r1 != null) {
            r1.A0D(true);
            this.A04 = null;
        }
        if (this.A01 != null) {
            Log.i("voip/ringtone/stop");
            Ringtone ringtone = this.A01;
            if (this.A0A.A0E(6570)) {
                C19930wk A002 = A00(this);
                A002.A02();
                C1501574e.A00(A002, ringtone, 27);
            } else {
                ringtone.stop();
            }
            this.A01 = null;
        }
        A01();
    }

    public boolean A08(CallInfo callInfo) {
        int i;
        int i2;
        if (!(callInfo == null && (callInfo = Voip.getCallInfo()) == null)) {
            AnonymousClass6YM r2 = this.A08;
            if (r2.A2t.A07(5170) <= 1 || (i2 = this.A0C) <= 0 ? ((i = this.A0C) <= 0 || callInfo.participants.size() > i) && this.A06 > 0 && callInfo.groupJid != null && callInfo.isJoinableGroupCall : callInfo.groupJid != null && callInfo.participants.size() > i2) {
                if (!r2.A0G(callInfo.callId).A06) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C19930wk A00(AnonymousClass6XR r3) {
        C19930wk r2 = r3.A05;
        if (r2 != null) {
            return r2;
        }
        C19930wk r22 = new C19930wk(r3.A0G, true);
        r3.A05 = r22;
        return r22;
    }

    private void A01() {
        if (this.A03 != null) {
            Log.i("voip/vibrate/stop");
            Vibrator A0H = this.A09.A0H();
            C18740tg.A06(A0H);
            if (this.A0A.A0E(6570)) {
                C1501574e.A00(A00(this), A0H, 28);
            } else {
                A0H.cancel();
            }
            this.A03 = null;
        }
    }

    public static /* synthetic */ void A02(AudioAttributes audioAttributes, VibrationEffect vibrationEffect, Vibrator vibrator) {
        if (vibrator != null) {
            vibrator.vibrate(vibrationEffect, audioAttributes);
        }
        Log.i("voip/vibrate/start complete");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r0.getRingerMode() != 2) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass6XR r8) {
        /*
            android.media.Ringtone r0 = r8.A01
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "voip/ringtone/play"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yC r1 = r8.A0A
            r0 = 6570(0x19aa, float:9.207E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x006f
            X.0wk r1 = A00(r8)
            r0 = 29
            X.C1501574e.A00(r1, r8, r0)
        L_0x001c:
            int r0 = r8.A00
            r5 = 1
            int r0 = r0 + 1
            r8.A00 = r0
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 == 0) goto L_0x006e
            X.6YM r1 = r8.A08
            java.lang.String r0 = r6.callId
            X.5yC r7 = r1.A0G(r0)
            long r1 = r7.A01
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            long r1 = r7.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.A01 = r0
        L_0x0045:
            boolean r0 = r6.isGroupCall
            if (r0 == 0) goto L_0x006e
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x006e
            com.whatsapp.jid.UserJid r4 = r6.getPeerJid()
            boolean r3 = r8.A08(r6)
            X.0yb r0 = r8.A09
            android.media.AudioManager r0 = r0.A0D()
            if (r0 == 0) goto L_0x0067
            int r2 = r0.getRingerMode()
            r0 = 2
            r1 = 1
            if (r2 == r0) goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            long[] r0 = r8.A03
            if (r0 == 0) goto L_0x007d
            if (r1 != 0) goto L_0x007d
        L_0x006e:
            return
        L_0x006f:
            android.media.Ringtone r0 = r8.A01
            boolean r0 = r0.isPlaying()
            if (r0 != 0) goto L_0x006e
            android.media.Ringtone r0 = r8.A01
            r0.play()
            goto L_0x001c
        L_0x007d:
            r8.A01()
            X.C18740tg.A06(r4)
            long[] r0 = r8.A09(r4, r3, r1)
            if (r3 != 0) goto L_0x008f
            if (r1 != 0) goto L_0x008f
        L_0x008b:
            r8.A07(r4, r0, r5)
            return
        L_0x008f:
            r5 = 0
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XR.A03(X.6XR):void");
    }

    public static boolean A04(AnonymousClass6XR r4) {
        AnonymousClass6CH r0 = r4.A08.A0n;
        boolean z = r0.A00;
        boolean z2 = r0.A01;
        boolean z3 = r0.A03;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VoiceService/isCallSilenced By Call Notification Settings: ");
        A0u.append(z);
        A0u.append("; By WA App Notification Settings : ");
        A0u.append(z3);
        C36321k7.A1X("; By DND Mode: ", A0u, z2);
        if (z || z3 || z2) {
            return true;
        }
        return false;
    }

    public void A05() {
        if (this.A02 == null) {
            return;
        }
        if (this.A01 != null) {
            try {
                A03(this);
            } catch (NullPointerException e) {
                if (Build.VERSION.SDK_INT != 22 || !"oppo".equalsIgnoreCase(Build.MANUFACTURER)) {
                    throw e;
                }
                Log.e("voip/loadAndPlayRingtone error while playing existing ringtone", e);
            }
        } else if (this.A04 == null) {
            C106935Lx r4 = new C106935Lx(this.A07, this.A0D);
            this.A04 = r4;
            this.A0G.Box(r4, this.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        com.whatsapp.util.Log.e("voip/ringtone/vibrate/UNKNOWN");
        X.C18740tg.A0D(false, X.AnonymousClass000.A0p("unknown vibrate preference ", r4, X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b9, code lost:
        if (r4.equals("2") == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        r0 = new long[]{0, 300, 200};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        switch(r3) {
            case 0: goto L_0x00d7;
            case 1: goto L_0x00df;
            default: goto L_0x00cb;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        r0 = {0, 750, 250} // fill-array;
        r5.A03 = r0;
        r0 = "voip/ringtone/vibrate/LONG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        r0 = {0, 750, 1500} // fill-array;
        r5.A03 = r0;
        r0 = "voip/ringtone/vibrate/DEFAULT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
        r0 = {0, 300, 200} // fill-array;
        r5.A03 = r0;
        r0 = "voip/ringtone/vibrate/SHORT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r5.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass11F r6, long[] r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = "voip/vibrate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r6 != 0) goto L_0x000d
            java.lang.String r0 = "voip/vibrate/error/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000c:
            return
        L_0x000d:
            long[] r0 = r5.A03
            if (r0 != 0) goto L_0x000c
            boolean r0 = A04(r5)
            if (r0 != 0) goto L_0x000c
            X.0yb r1 = r5.A09
            android.media.AudioManager r4 = r1.A0D()
            if (r4 == 0) goto L_0x000c
            int r2 = r4.getRingerMode()
            r3 = 1
            r0 = 2
            if (r2 == r0) goto L_0x002d
            int r0 = r4.getRingerMode()
            if (r0 != r3) goto L_0x000c
        L_0x002d:
            X.1CR r0 = r5.A0B
            X.3LI r0 = X.C36361kB.A0d(r6, r0)
            java.lang.String r4 = r0.A04()
            if (r4 == 0) goto L_0x000c
            java.lang.String r0 = "0"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x000c
            r2 = 0
            if (r7 == 0) goto L_0x008f
            r5.A03 = r7
        L_0x0046:
            long[] r0 = r5.A03
            if (r0 == 0) goto L_0x000c
            android.os.Vibrator r3 = r1.A0H()
            X.C18740tg.A06(r3)
            java.lang.String r0 = "voip/vibrate/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00eb
            android.media.AudioAttributes$Builder r1 = new android.media.AudioAttributes$Builder
            r1.<init>()
            r0 = 4
            android.media.AudioAttributes$Builder r1 = r1.setContentType(r0)
            r0 = 6
            android.media.AudioAttributes$Builder r0 = r1.setUsage(r0)
            android.media.AudioAttributes r4 = r0.build()
            long[] r0 = r5.A03
            if (r8 != 0) goto L_0x0074
            r2 = -1
        L_0x0074:
            android.os.VibrationEffect r2 = android.os.VibrationEffect.createWaveform(r0, r2)
            X.0yC r1 = r5.A0A
            r0 = 6570(0x19aa, float:9.207E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00e7
            X.0wk r1 = A00(r5)
            X.72y r0 = new X.72y
            r0.<init>(r4, r2, r3)
            r1.execute(r0)
            return
        L_0x008f:
            int r0 = r4.hashCode()
            switch(r0) {
                case 49: goto L_0x00a9;
                case 50: goto L_0x00b3;
                case 51: goto L_0x00bc;
                default: goto L_0x0096;
            }
        L_0x0096:
            java.lang.String r0 = "voip/ringtone/vibrate/UNKNOWN"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unknown vibrate preference "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r3)
            X.C18740tg.A0D(r2, r0)
            goto L_0x0046
        L_0x00a9:
            java.lang.String r0 = "1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0096
            r3 = 0
            goto L_0x00c5
        L_0x00b3:
            java.lang.String r0 = "2"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00c5
            goto L_0x0096
        L_0x00bc:
            java.lang.String r0 = "3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0096
            r3 = 2
        L_0x00c5:
            r0 = 3
            long[] r0 = new long[r0]
            switch(r3) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x00df;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            r0 = {0, 750, 250} // fill-array
            r5.A03 = r0
            java.lang.String r0 = "voip/ringtone/vibrate/LONG"
        L_0x00d2:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0046
        L_0x00d7:
            r0 = {0, 750, 1500} // fill-array
            r5.A03 = r0
            java.lang.String r0 = "voip/ringtone/vibrate/DEFAULT"
            goto L_0x00d2
        L_0x00df:
            r0 = {0, 300, 200} // fill-array
            r5.A03 = r0
            java.lang.String r0 = "voip/ringtone/vibrate/SHORT"
            goto L_0x00d2
        L_0x00e7:
            r3.vibrate(r2, r4)
            return
        L_0x00eb:
            X.0yC r1 = r5.A0A
            r0 = 6570(0x19aa, float:9.207E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0104
            X.0wk r2 = A00(r5)
            r1 = 13
            X.752 r0 = new X.752
            r0.<init>(r5, r3, r1, r8)
            r2.execute(r0)
            return
        L_0x0104:
            long[] r0 = r5.A03
            if (r8 != 0) goto L_0x0109
            r2 = -1
        L_0x0109:
            r3.vibrate(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XR.A07(X.11F, long[], boolean):void");
    }

    public long[] A09(AnonymousClass11F r8, boolean z, boolean z2) {
        int i;
        if ("0".equals(C36361kB.A0d(r8, this.A0B).A04())) {
            return new long[]{0, 0, 0};
        }
        if (!z) {
            return new long[]{0, 50, 50, 70, 30, 70, 30, 50, 50, 70, 30, 70, 30, 50, 50, 70, 30, 70, 4000};
        }
        long[] jArr = {0, 150, 83, 50, 67, 20, 97, 20, 96, 50, 67, 35, 195, 50, 78, 300, 4000};
        if (z2 || (i = this.A06) <= 1) {
            return jArr;
        }
        long[] jArr2 = new long[((i * 16) + 1)];
        int i2 = 0;
        do {
            System.arraycopy(jArr, 1, jArr2, (i2 * 16) + 1, 16);
            i2++;
        } while (i2 < i);
        return jArr2;
    }

    public AnonymousClass6XR(Context context, AnonymousClass6YM r3, C21060yb r4, C19970wo r5, C20810yC r6, AnonymousClass1CR r7, AnonymousClass13J r8, C19770wU r9) {
        this.A0E = r5;
        this.A0A = r6;
        this.A07 = context;
        this.A0G = r9;
        this.A08 = r3;
        this.A0F = r8;
        this.A09 = r4;
        this.A0B = r7;
        this.A0C = r6.A07(4710);
        this.A06 = r6.A07(870);
    }
}
