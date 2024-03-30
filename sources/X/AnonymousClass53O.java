package X;

import android.os.Handler;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.53O  reason: invalid class name */
public class AnonymousClass53O extends AnonymousClass1Pk {
    public final AnonymousClass6YM A00;

    public AnonymousClass53O(AnonymousClass6YM r1) {
        this.A00 = r1;
    }

    public void A01(String str) {
        C18740tg.A01();
        C36321k7.A1Q("voip/service/selfManagedConnectionListener/onCreateIncomingConnection ", str, AnonymousClass000.A0u());
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null || (!str.equals(callInfo.callId) && !C90514aH.A1X(callInfo, str))) {
            C27671Pf.A00(this.A00.A2S).A0B(str);
            return;
        }
        AnonymousClass6YM r2 = this.A00;
        r2.A0c.removeMessages(1);
        Handler handler = r2.A0c;
        handler.sendMessageDelayed(handler.obtainMessage(28, str), 500);
    }

    public void A02(String str) {
        C18740tg.A01();
        C36321k7.A1Q("voip/service/selfManagedConnectionListener/onCreateIncomingConnectionFailed ", str, AnonymousClass000.A0u());
        if (C90484aE.A1V(str)) {
            AnonymousClass6YM r2 = this.A00;
            r2.A0c.removeMessages(1);
            r2.A0i(str, "busy", 4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (X.C90514aH.A1X(r3, r12) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.String r17) {
        /*
            r16 = this;
            X.C18740tg.A01()
            r0 = r16
            X.6YM r9 = r0.A00
            android.os.Handler r0 = r9.A0c
            r5 = 28
            r0.removeMessages(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/service/selfManagedConnectionListener/onShowIncomingCallUi "
            r12 = r17
            X.C36321k7.A1Q(r0, r12, r1)
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r13 = 0
            r2 = 1
            if (r3 == 0) goto L_0x0028
            boolean r0 = X.C90514aH.A1X(r3, r12)
            r8 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r8 = 0
        L_0x0029:
            boolean r0 = X.C34681hT.A0T(r3)
            if (r0 == 0) goto L_0x006b
            boolean r0 = r3.callEnding
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = r3.callId
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x003d
            if (r8 == 0) goto L_0x006b
        L_0x003d:
            long r0 = r9.A0X
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x006c
            java.lang.Long r0 = X.C90494aF.A0V(r0)
            r9.A07 = r0
        L_0x004b:
            if (r8 != 0) goto L_0x005a
            com.whatsapp.jid.UserJid r11 = X.C90494aF.A0M(r3)
            boolean r14 = r3.videoEnabled
            boolean r15 = r3.isGroupCall
            com.whatsapp.jid.GroupJid r10 = r3.groupJid
            r9.A0X(r10, r11, r12, r13, r14, r15)
        L_0x005a:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L_0x0069
            if (r8 == 0) goto L_0x0065
            boolean r0 = r9.A1O
            if (r0 != 0) goto L_0x0065
            r13 = 1
        L_0x0065:
            r0 = 0
            X.AnonymousClass6YM.A08(r9, r3, r2, r13, r0)
        L_0x0069:
            r9.A0H = r2
        L_0x006b:
            return
        L_0x006c:
            java.lang.String r0 = "selfManagedConnectionNewCallTs is not set"
            X.C18740tg.A0D(r13, r0)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass53O.A03(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (X.C90514aH.A1X(r3, r10) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.lang.String r10, int r11) {
        /*
            r9 = this;
            X.C18740tg.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/service/selfManagedConnectionListener/onConnectionStateChanged "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", state "
            X.C36321k7.A1T(r0, r1, r11)
            X.6YM r2 = r9.A00
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass6YM.A3X
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r5 = 0
            r4 = 1
            if (r3 == 0) goto L_0x0027
            boolean r0 = X.C90514aH.A1X(r3, r10)
            r1 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            boolean r0 = X.C34681hT.A0T(r3)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = r3.callId
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0038
            if (r1 == 0) goto L_0x0050
        L_0x0038:
            if (r11 == 0) goto L_0x00de
            if (r11 == r4) goto L_0x00da
            r0 = 2
            if (r11 == r0) goto L_0x00c9
            r0 = 3
            if (r11 == r0) goto L_0x0051
            X.5uj r0 = r2.A1d
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x00bb
            X.6zT r0 = r2.A2E
            boolean r0 = r0.A0G(r10)
            if (r0 != 0) goto L_0x00bb
        L_0x0050:
            return
        L_0x0051:
            X.1Pf r0 = r2.A2S
            int r8 = r0.A02()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r2.A0X
            java.lang.Long r1 = X.C90504aG.A0h(r3, r0)
            r2.A08 = r1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService/onConnectionStateChanged Time elapsed since SelfManagedConnection creation = "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", Android auto connected = "
            r3.append(r0)
            X.5uj r7 = r2.A1d
            boolean r0 = r7.A03
            r3.append(r0)
            java.lang.String r0 = ", isBluetoothAvailable = "
            r3.append(r0)
            X.6zT r1 = r2.A2E
            boolean r0 = r1.A0G(r10)
            X.C36331k8.A1S(r3, r0)
            java.lang.Long r0 = r2.A08
            long r5 = r0.longValue()
            long r3 = (long) r8
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x009e
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r1.A0G(r10)
            if (r0 != 0) goto L_0x00c2
        L_0x009e:
            android.telephony.TelephonyManager r1 = r2.A23
            X.0yE r0 = r2.A2j
            int r0 = X.AnonymousClass3UL.A00(r1, r0)
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "VoiceService/onConnectionStateChanged Ignoring SelfManagedConnection.onReject"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x0050
            r0 = 0
            r2.A0X = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r2.A0T(r0)
            return
        L_0x00bb:
            r1 = 31
            r0 = 0
            X.AnonymousClass6YM.A0A(r2, r3, r0, r1)
            return
        L_0x00c2:
            r1 = 9
            r0 = 0
            r2.A0i(r10, r0, r1)
            return
        L_0x00c9:
            r2.A0D = r4
            r2.A0a(r3)
            X.1Pf r0 = r2.A2S
            boolean r1 = r0.A0B()
            r0 = 8
            r2.A0h(r10, r0, r1)
            return
        L_0x00da:
            r2.A0c(r3, r5, r4)
            return
        L_0x00de:
            r2.A0c(r3, r4, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass53O.A04(java.lang.String, int):void");
    }
}
