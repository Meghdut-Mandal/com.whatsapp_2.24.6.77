package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.4cY  reason: invalid class name and case insensitive filesystem */
public class C91744cY extends PhoneStateListener {
    public boolean A00 = false;
    public final /* synthetic */ AnonymousClass6YM A01;

    public C91744cY(AnonymousClass6YM r2) {
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r1.isSpeakerphoneOn() == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCallStateChanged(int r7, java.lang.String r8) {
        /*
            r6 = this;
            X.6YM r2 = r6.A01
            X.0yb r0 = r2.A2g
            android.media.AudioManager r1 = r0.A0D()
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/phoneStateListener/onCallStateChanged state: "
            r5.append(r0)
            java.lang.String r0 = X.C34681hT.A07(r7)
            r5.append(r0)
            java.lang.String r0 = " using speaker: "
            r5.append(r0)
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0028
            boolean r1 = r1.isSpeakerphoneOn()
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            X.C36331k8.A1S(r5, r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            boolean r0 = r2.A0r(r0)
            if (r0 == 0) goto L_0x0045
            android.telephony.TelephonyManager r1 = r2.A23
            if (r1 == 0) goto L_0x0045
            java.lang.String r0 = "PhoneStateListener is only used when Telecom Framework is not enabled"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            android.telephony.PhoneStateListener r0 = r2.A0i
            r1.listen(r0, r3)
        L_0x0044:
            return
        L_0x0045:
            int r1 = r2.A0Q
            r2.A0Q = r7
            r0 = 2
            if (r7 == r0) goto L_0x0052
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0069
            if (r7 != r4) goto L_0x0069
        L_0x0052:
            boolean r0 = r6.A00
            if (r4 != r0) goto L_0x006b
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r0 == 0) goto L_0x0044
            if (r7 == 0) goto L_0x0084
            X.6zT r1 = r2.A2E
            r1.A07(r0)
            r0 = 45
            X.C148816zT.A02(r1, r0)
            return
        L_0x0069:
            r4 = 0
            goto L_0x0052
        L_0x006b:
            r6.A00 = r4
            android.os.Handler r0 = r2.A0c
            r1 = 6
            android.os.Message r3 = r0.obtainMessage(r1, r7, r4)
            android.os.Handler r0 = r2.A0c
            r0.removeMessages(r1)
            android.os.Handler r2 = r2.A0c
            if (r4 == 0) goto L_0x0081
            r2.sendMessage(r3)
            return
        L_0x0081:
            r0 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0097
        L_0x0084:
            if (r1 == 0) goto L_0x0044
            android.os.Handler r0 = r2.A0c
            r1 = 38
            android.os.Message r3 = r0.obtainMessage(r1)
            android.os.Handler r0 = r2.A0c
            r0.removeMessages(r1)
            android.os.Handler r2 = r2.A0c
            r0 = 2000(0x7d0, double:9.88E-321)
        L_0x0097:
            r2.sendMessageDelayed(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91744cY.onCallStateChanged(int, java.lang.String):void");
    }
}
