package com.whatsapp.messaging.xmpp;

import X.AnonymousClass19O;
import X.AnonymousClass19Q;
import X.C005502l;
import X.C18800tq;
import X.C19700wN;
import X.C19970wo;
import X.C20810yC;
import X.C21390zA;
import X.C36321k7;
import X.C36371kC;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class XmppLifecycleWorker extends CoroutineWorker {
    public final C21390zA A00;
    public final C19700wN A01;
    public final C20810yC A02;
    public final XmppConnectionMetricsWorkManager A03;
    public final AnonymousClass19O A04;
    public final C005502l A05 = AnonymousClass19Q.A00();
    public final C19970wo A06;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.messaging.xmpp.XmppLifecycleWorker r26, X.C023509x r27) {
        /*
            r3 = r27
            r8 = r26
            boolean r0 = r3 instanceof X.AnonymousClass7B6
            if (r0 == 0) goto L_0x0220
            r7 = r3
            X.7B6 r7 = (X.AnonymousClass7B6) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0220
            int r2 = r2 - r1
            r7.label = r2
        L_0x0016:
            java.lang.Object r1 = r7.result
            X.0AO r20 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 1
            if (r0 == 0) goto L_0x0169
            if (r0 != r6) goto L_0x0227
            int r0 = r7.I$0
            r19 = r0
            long r14 = r7.J$1
            long r2 = r7.J$0
            boolean r0 = r7.Z$0
            r18 = r0
            java.lang.Object r8 = r7.L$0
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker r8 = (com.whatsapp.messaging.xmpp.XmppLifecycleWorker) r8
            X.AnonymousClass0AN.A00(r1)
        L_0x0034:
            r21 = r2
            X.19O r0 = r8.A04
            r27 = r0
            boolean r0 = r27.A0A()
            if (r0 == 0) goto L_0x014e
            if (r18 != 0) goto L_0x008c
            r0 = r19
            if (r0 != r6) goto L_0x008c
            X.0Nh r0 = X.AnonymousClass0Nh.SECONDS
            long r4 = X.C06790Vc.A00(r0, r6)
            long r11 = X.C10920fR.A00
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0136
            long r9 = X.C10920fR.A01
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0136
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0132
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0132
            int r0 = (int) r2
            r1 = r0 & 1
            int r0 = (int) r4
            r0 = r0 & 1
            if (r1 != r0) goto L_0x00e5
            long r21 = r2 >> r6
            long r4 = r4 >> r6
            long r21 = r21 + r4
            if (r1 != 0) goto L_0x00c3
            r4 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r0 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            X.0ma r9 = new X.0ma
            r9.<init>(r4, r0)
            long r0 = r9.A00
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 > 0) goto L_0x00bc
            long r0 = r9.A01
            int r4 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x00bc
        L_0x008a:
            long r21 = r21 << r6
        L_0x008c:
            long r0 = X.C10920fR.A00(r21)
            r4 = r27
            boolean r0 = r4.A0B(r0)
            if (r0 == 0) goto L_0x014e
            X.0yC r1 = r8.A02
            r0 = 5409(0x1521, float:7.58E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x014e
            java.lang.String r0 = "XmppLifecycleWorker/doWork seems like stanzas stuck"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wN r3 = r8.A01
            java.lang.String r2 = r27.A03()
            java.lang.String r1 = "xmpp-lifecycle-worker-stuck-stanza"
            r0 = 0
            r3.A0E(r1, r2, r0)
            r1 = 3
            r4.A08(r1)
        L_0x00b7:
            X.4ow r0 = X.C97334ow.A00()
            return r0
        L_0x00bc:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r21 = r21 / r0
            goto L_0x012a
        L_0x00c3:
            r4 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r0 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            X.0ma r9 = new X.0ma
            r9.<init>(r4, r0)
            long r0 = r9.A00
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 > 0) goto L_0x011c
            long r0 = r9.A01
            int r4 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x011c
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r21 = r21 * r0
            goto L_0x008a
        L_0x00e5:
            if (r1 != r6) goto L_0x0117
            long r21 = r2 >> r6
            long r4 = r4 >> r6
        L_0x00ea:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r16 = r4 / r0
            long r21 = r21 + r16
            r12 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r9 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            X.0ma r11 = new X.0ma
            r11.<init>(r12, r9)
            long r9 = r11.A00
            int r12 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r12 > 0) goto L_0x011c
            long r9 = r11.A01
            int r11 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x011c
            long r16 = r16 * r0
            long r4 = r4 - r16
            long r21 = r21 * r0
            long r21 = r21 + r4
            goto L_0x008a
        L_0x0117:
            long r21 = r4 >> r6
            long r4 = r2 >> r6
            goto L_0x00ea
        L_0x011c:
            r23 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r25 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r21 = X.C15040mb.A04(r21, r23, r25)
        L_0x012a:
            long r21 = r21 << r6
            r0 = 1
            long r21 = r21 + r0
            goto L_0x008c
        L_0x0132:
            r21 = r4
            goto L_0x008c
        L_0x0136:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0140
            long r9 = X.C10920fR.A01
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
        L_0x0140:
            long r4 = r4 ^ r2
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            java.lang.String r0 = "Summing infinite durations of different signs yields an undefined result."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x014e:
            boolean r0 = r27.A0A()
            if (r0 != 0) goto L_0x01a9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "XmppLifecycleWorker/work is done; is processing: "
            r1.append(r0)
            boolean r0 = r27.A0A()
            X.C36331k8.A1S(r1, r0)
            X.4ox r0 = X.C97344ox.A00()
            return r0
        L_0x0169:
            X.AnonymousClass0AN.A00(r1)
            X.19O r3 = r8.A04
            boolean r18 = r3.A0A()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "XmppLifecycleWorker/work started; is processing: "
            r0 = r18
            X.C36321k7.A1X(r1, r2, r0)
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r2 = r8.A03
            X.0yC r1 = r2.A01
            r0 = 7777(0x1e61, float:1.0898E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01f9
            X.00T r0 = r2.A06
            android.os.Handler r0 = X.C90524aI.A0C(r0)
            r0.removeMessages(r6)
        L_0x0192:
            r0 = 0
            r3.A03 = r0
            X.0yC r1 = r8.A02
            r0 = 3320(0xcf8, float:4.652E-42)
            int r1 = r1.A07(r0)
            X.0Nh r0 = X.AnonymousClass0Nh.SECONDS
            long r2 = X.C06790Vc.A00(r0, r1)
            long r14 = android.os.SystemClock.elapsedRealtime()
            r19 = 0
        L_0x01a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "XmppLifecycleWorker/cycle: "
            r1.append(r0)
            int r9 = r19 + 1
            r0 = r19
            r1.append(r0)
            java.lang.String r0 = " started: "
            r1.append(r0)
            X.19O r5 = r8.A04
            java.lang.String r0 = r5.A03()
            X.C36321k7.A1a(r1, r0)
            long r12 = X.C90514aH.A0J(r14)
            r4 = 0
            r10 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0205
            X.0zA r0 = r8.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01e4
            X.0wN r2 = r8.A01
            java.lang.String r1 = r5.A03()
            java.lang.String r0 = "xmpp-tracking-work"
            r2.A0E(r0, r1, r4)
        L_0x01e4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "XmppLifecycleWorker/300000 milliseconds time out reached; stop the job; is processing: "
            r1.append(r0)
            boolean r0 = r5.A0A()
            X.C36331k8.A1S(r1, r0)
            r5.A08(r4)
            goto L_0x00b7
        L_0x01f9:
            X.0zS r0 = r2.A02
            X.6VR r1 = X.C90514aH.A0V(r0)
            java.lang.String r0 = "xmpp-logout-worker"
            r1.A0B(r0)
            goto L_0x0192
        L_0x0205:
            r7.L$0 = r8
            r0 = r18
            r7.Z$0 = r0
            r7.J$0 = r2
            r7.J$1 = r14
            r7.I$0 = r9
            r7.label = r6
            java.lang.Object r1 = X.C07330Xf.A01(r7, r2)
            r0 = r20
            if (r1 != r0) goto L_0x021c
            return r20
        L_0x021c:
            r19 = r9
            goto L_0x0034
        L_0x0220:
            X.7B6 r7 = new X.7B6
            r7.<init>(r8, r3)
            goto L_0x0016
        L_0x0227:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.xmpp.XmppLifecycleWorker.A00(com.whatsapp.messaging.xmpp.XmppLifecycleWorker, X.09x):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLifecycleWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A04 = (AnonymousClass19O) A0P.A9f.get();
        this.A00 = (C21390zA) A0P.A0J.get();
        this.A01 = A0P.B3m();
        this.A06 = A0P.Bvc();
        this.A02 = A0P.Azp();
        this.A03 = (XmppConnectionMetricsWorkManager) A0P.A9g.get();
    }
}
