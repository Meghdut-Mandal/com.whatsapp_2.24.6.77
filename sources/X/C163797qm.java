package X;

import android.os.Handler;

/* renamed from: X.7qm  reason: invalid class name and case insensitive filesystem */
public class C163797qm implements Handler.Callback {
    public Object A00;
    public final int A01;

    public C163797qm(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:192|193|194|195|196|430) */
    /* JADX WARNING: Code restructure failed: missing block: B:429:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c3, code lost:
        if (r3.A1l() != false) goto L_0x00c5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:195:0x03d6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r20) {
        /*
            r19 = this;
            r3 = r19
            int r0 = r3.A01
            r5 = r20
            switch(r0) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x0479;
                case 2: goto L_0x0456;
                case 3: goto L_0x0497;
                case 4: goto L_0x04a4;
                case 5: goto L_0x04d8;
                case 6: goto L_0x04be;
                case 7: goto L_0x065d;
                case 8: goto L_0x058b;
                case 9: goto L_0x0600;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r3.A00
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            int r1 = r5.what
            r2 = 1
            r0 = 9
            if (r1 != r0) goto L_0x0019
            r4.finish()
        L_0x0017:
            r0 = 1
            return r0
        L_0x0019:
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.VoipActivityV2.A01(r4)
            if (r3 == 0) goto L_0x0017
            com.whatsapp.voipcalling.CallState r6 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r6 == r0) goto L_0x0017
            int r1 = r5.what
            if (r1 == r2) goto L_0x00f4
            r0 = 2
            if (r1 == r0) goto L_0x00e6
            r5 = 3
            if (r1 == r5) goto L_0x009d
            r0 = 7
            if (r1 == r0) goto L_0x0089
            r0 = 8
            if (r1 == r0) goto L_0x007f
            r0 = 10
            if (r1 == r0) goto L_0x007b
            r0 = 11
            if (r1 != r0) goto L_0x0017
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 != r0) goto L_0x0017
            boolean r0 = r3.callEnding
            if (r0 != 0) goto L_0x0017
            X.6YM r0 = r4.A0r
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "voip/VoipActivityV2/commonHandler STOP_CAMERA"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6EE r1 = r3.self
            X.6EE r0 = r3.getDefaultPeerInfo()
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x005c
            goto L_0x0017
        L_0x005c:
            int r0 = r1.A06
            if (r0 != r2) goto L_0x0017
            r4.A1y = r2
            X.6YM r0 = r4.A0r
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A1E
            X.74X r0 = X.AnonymousClass74X.A00
            r1.execute(r0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1a
            if (r0 == 0) goto L_0x0017
            com.whatsapp.calling.views.VoipCallFooter r1 = r0.A0U
            if (r1 == 0) goto L_0x0017
            boolean r0 = r4.A1q
            r0 = r0 ^ 1
            r1.setToggleVideoButtonSelected(r0)
            goto L_0x0017
        L_0x007b:
            r4.BxK(r3)
            goto L_0x0017
        L_0x007f:
            androidx.fragment.app.DialogFragment r1 = r4.A0N
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "NonActivityDismissDialogFragment"
            r4.A3o(r1, r0)
            goto L_0x0017
        L_0x0089:
            androidx.fragment.app.DialogFragment r0 = r4.A0N
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A12()
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "NonActivityDismissDialogFragment"
            r4.A3q(r0)
            r0 = 0
            r4.A0N = r0
            goto L_0x0017
        L_0x009d:
            boolean r0 = r4.A1w
            r1 = 5000(0x1388, double:2.4703E-320)
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r4.A1x
            if (r0 == 0) goto L_0x0017
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r3 = r4.A1a
            if (r3 == 0) goto L_0x00d1
            boolean r0 = r3.A1k()
            if (r0 != 0) goto L_0x00c5
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r3.A0N
            if (r0 == 0) goto L_0x00bd
            X.1hi r0 = r0.A0A
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 != 0) goto L_0x00c5
        L_0x00bd:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r3 = r4.A1a
            boolean r0 = r3.A1l()
            if (r0 == 0) goto L_0x00d1
        L_0x00c5:
            android.os.Handler r0 = r4.A05
            r0.removeMessages(r5)
            android.os.Handler r0 = r4.A05
            r0.sendEmptyMessageDelayed(r5, r1)
            goto L_0x0017
        L_0x00d1:
            if (r3 == 0) goto L_0x0017
            X.6X3 r1 = r3.A0L
            if (r1 == 0) goto L_0x0017
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A0G
            boolean r0 = r0.A0X
            if (r0 == 0) goto L_0x0017
            r0 = 5
            X.AnonymousClass6X3.A01(r1, r0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A07(r3)
            goto L_0x0017
        L_0x00e6:
            androidx.fragment.app.DialogFragment r0 = r4.A0O
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "EndCallConfirmationDialogFragment"
            r4.A3q(r0)
            r0 = 0
            r4.A0O = r0
            goto L_0x0017
        L_0x00f4:
            com.whatsapp.voipcalling.VoipActivityV2.A11(r4)
            goto L_0x0017
        L_0x00f9:
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x043f }
            X.6XM r0 = (X.AnonymousClass6XM) r0     // Catch:{ all -> 0x043f }
            int r1 = r5.what     // Catch:{ all -> 0x043f }
            switch(r1) {
                case 1: goto L_0x0329;
                case 2: goto L_0x0197;
                case 3: goto L_0x011c;
                case 4: goto L_0x03e0;
                case 5: goto L_0x03db;
                case 6: goto L_0x0104;
                case 7: goto L_0x03c5;
                case 8: goto L_0x03aa;
                case 9: goto L_0x032d;
                default: goto L_0x0102;
            }     // Catch:{ all -> 0x043f }
        L_0x0102:
            goto L_0x04f5
        L_0x0104:
            int r2 = r0.A00     // Catch:{ all -> 0x043f }
            r1 = 1
            if (r2 != r1) goto L_0x04f5
            r1 = 0
            r0.A00 = r1     // Catch:{ all -> 0x043f }
            X.67h r1 = r0.A0E     // Catch:{ all -> 0x043f }
            X.5sP r0 = r1.A01     // Catch:{ all -> 0x043f }
            X.6n7 r0 = r0.A02     // Catch:{ all -> 0x043f }
            r0.flush()     // Catch:{ all -> 0x043f }
            java.nio.ByteBuffer r0 = r1.A00     // Catch:{ all -> 0x043f }
            r0.clear()     // Catch:{ all -> 0x043f }
            goto L_0x04f5
        L_0x011c:
            java.lang.System.nanoTime()     // Catch:{ all -> 0x043f }
            X.6QD r1 = r0.A05     // Catch:{ all -> 0x043d }
            X.5TE r7 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x043d }
            X.7ez r6 = r0.A0F     // Catch:{ all -> 0x043d }
            long r4 = X.AnonymousClass6U7.A00(r6, r7, r1)     // Catch:{ all -> 0x043d }
            X.6QD r2 = r0.A05     // Catch:{ all -> 0x043d }
            X.5TE r1 = X.AnonymousClass5TE.VIDEO     // Catch:{ all -> 0x043d }
            long r1 = X.AnonymousClass6U7.A00(r6, r1, r2)     // Catch:{ all -> 0x043d }
            long r1 = java.lang.Math.max(r4, r1)     // Catch:{ all -> 0x043d }
            r0.A03 = r1     // Catch:{ all -> 0x043d }
            X.6QD r1 = r0.A05     // Catch:{ all -> 0x043d }
            java.util.HashMap r1 = r1.A03(r7)     // Catch:{ all -> 0x043d }
            if (r1 == 0) goto L_0x0190
            int r1 = r1.size()     // Catch:{ all -> 0x043d }
            r0.A01 = r1     // Catch:{ all -> 0x043d }
            X.6F3[] r1 = new X.AnonymousClass6F3[r1]     // Catch:{ all -> 0x043d }
            r0.A0B = r1     // Catch:{ all -> 0x043d }
            r2 = 0
        L_0x014a:
            int r1 = r0.A01     // Catch:{ all -> 0x043d }
            if (r2 >= r1) goto L_0x016a
            X.6QD r1 = r0.A05     // Catch:{ all -> 0x043d }
            X.6Eg r1 = r1.A01(r7, r2)     // Catch:{ all -> 0x043d }
            long r4 = X.AnonymousClass6U7.A01(r6, r1)     // Catch:{ all -> 0x043d }
            X.6F3[] r1 = r0.A0B     // Catch:{ all -> 0x043d }
            r10 = 0
            long r12 = r10 + r4
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x043d }
            X.6F3 r8 = new X.6F3     // Catch:{ all -> 0x043d }
            r8.<init>(r9, r10, r12)     // Catch:{ all -> 0x043d }
            r1[r2] = r8     // Catch:{ all -> 0x043d }
            int r2 = r2 + 1
            goto L_0x014a
        L_0x016a:
            java.util.HashMap r6 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x043d }
            r5 = 0
        L_0x016f:
            X.6F3[] r4 = r0.A0B     // Catch:{ all -> 0x043d }
            int r1 = r4.length     // Catch:{ all -> 0x043d }
            if (r5 >= r1) goto L_0x0180
            java.lang.String r2 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x043d }
            r1 = r4[r5]     // Catch:{ all -> 0x043d }
            r6.put(r2, r1)     // Catch:{ all -> 0x043d }
            int r5 = r5 + 1
            goto L_0x016f
        L_0x0180:
            X.5zI r1 = r0.A08     // Catch:{ all -> 0x043d }
            X.65W r2 = r1.A07     // Catch:{ all -> 0x043d }
            X.4rk r1 = new X.4rk     // Catch:{ all -> 0x043d }
            r1.<init>(r0, r2, r6)     // Catch:{ all -> 0x043d }
            r0.A07 = r1     // Catch:{ all -> 0x043d }
            X.AnonymousClass6XM.A02(r0)     // Catch:{ all -> 0x043d }
            goto L_0x04f5
        L_0x0190:
            java.lang.String r0 = "No audio tracks"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ all -> 0x043d }
            throw r0     // Catch:{ all -> 0x043d }
        L_0x0197:
            int r2 = r0.A00     // Catch:{ all -> 0x043f }
            r1 = 1
            r7 = 2
            if (r2 == r7) goto L_0x019f
            if (r2 != r1) goto L_0x04f5
        L_0x019f:
            int r1 = r0.A01     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x04f5
            boolean r1 = r0.A0A     // Catch:{ all -> 0x043f }
            if (r1 != 0) goto L_0x02a7
            java.util.Map r5 = r0.A0I     // Catch:{ all -> 0x043f }
            java.util.Set r1 = r5.keySet()     // Catch:{ all -> 0x043f }
            java.util.HashSet r1 = X.C90524aI.A0k(r1)     // Catch:{ all -> 0x043f }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x043f }
        L_0x01b5:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x01f5
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x043f }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x043f }
            int r6 = r9.intValue()     // Catch:{ all -> 0x043f }
            X.6F3[] r1 = r0.A0B     // Catch:{ all -> 0x043f }
            r8 = r1[r6]     // Catch:{ all -> 0x043f }
            long r1 = r0.A02     // Catch:{ all -> 0x043f }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x043f }
            boolean r1 = r8.A01(r1, r4)     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x01b5
            int r1 = r0.A00     // Catch:{ all -> 0x043f }
            if (r1 != r7) goto L_0x01e0
            java.util.HashSet r1 = r0.A09     // Catch:{ all -> 0x043f }
            boolean r1 = r1.contains(r9)     // Catch:{ all -> 0x043f }
            if (r1 != 0) goto L_0x01e0
            goto L_0x01b5
        L_0x01e0:
            X.67h r1 = r0.A0E     // Catch:{ all -> 0x043f }
            X.6Sq r1 = r1.A02     // Catch:{ all -> 0x043f }
            boolean[] r2 = r1.A03     // Catch:{ all -> 0x043f }
            r1 = 1
            r2[r6] = r1     // Catch:{ all -> 0x043f }
            X.7lp r4 = X.AnonymousClass6XM.A00(r0, r6)     // Catch:{ all -> 0x043f }
            if (r4 == 0) goto L_0x01b5
            long r1 = r0.A02     // Catch:{ all -> 0x043f }
            r4.B58(r1)     // Catch:{ all -> 0x043f }
            goto L_0x01b5
        L_0x01f5:
            r4 = 0
        L_0x01f6:
            int r1 = r0.A01     // Catch:{ all -> 0x043f }
            if (r4 >= r1) goto L_0x020c
            boolean r1 = X.C90484aE.A1Y(r5, r4)     // Catch:{ all -> 0x043f }
            if (r1 != 0) goto L_0x0209
            X.67h r1 = r0.A0E     // Catch:{ all -> 0x043f }
            X.6Sq r1 = r1.A02     // Catch:{ all -> 0x043f }
            boolean[] r2 = r1.A03     // Catch:{ all -> 0x043f }
            r1 = 0
            r2[r4] = r1     // Catch:{ all -> 0x043f }
        L_0x0209:
            int r4 = r4 + 1
            goto L_0x01f6
        L_0x020c:
            int r1 = r0.A00     // Catch:{ all -> 0x043f }
            X.67h r11 = r0.A0E     // Catch:{ all -> 0x043f }
            long r4 = r0.A02     // Catch:{ all -> 0x043f }
            if (r1 == r7) goto L_0x0296
            X.6Sq r12 = r11.A02     // Catch:{ all -> 0x043f }
            java.nio.ByteBuffer[] r8 = r11.A04     // Catch:{ all -> 0x043f }
            java.nio.ByteBuffer r1 = r12.A01     // Catch:{ all -> 0x043f }
            if (r1 != 0) goto L_0x0224
            int r1 = r12.A00     // Catch:{ all -> 0x043f }
            java.nio.ByteBuffer r1 = X.C90474aD.A0l(r1)     // Catch:{ all -> 0x043f }
            r12.A01 = r1     // Catch:{ all -> 0x043f }
        L_0x0224:
            r1.clear()     // Catch:{ all -> 0x043f }
            int r13 = r8.length     // Catch:{ all -> 0x043f }
            java.nio.ByteBuffer[] r10 = new java.nio.ByteBuffer[r13]     // Catch:{ all -> 0x043f }
            r6 = 0
        L_0x022b:
            if (r6 >= r13) goto L_0x0248
            boolean[] r1 = r12.A03     // Catch:{ all -> 0x043f }
            boolean r1 = r1[r6]     // Catch:{ all -> 0x043f }
            r2 = r8[r6]     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x0243
            java.util.List[] r1 = r12.A02     // Catch:{ all -> 0x043f }
            r1 = r1[r6]     // Catch:{ all -> 0x043f }
            java.nio.ByteBuffer r2 = X.C132206Sq.A00(r2, r1)     // Catch:{ all -> 0x043f }
            java.util.List r1 = r12.A04     // Catch:{ all -> 0x043f }
            java.nio.ByteBuffer r2 = X.C132206Sq.A00(r2, r1)     // Catch:{ all -> 0x043f }
        L_0x0243:
            r10[r6] = r2     // Catch:{ all -> 0x043f }
            int r6 = r6 + 1
            goto L_0x022b
        L_0x0248:
            r9 = 0
        L_0x0249:
            int r1 = r12.A00     // Catch:{ all -> 0x043f }
            if (r9 >= r1) goto L_0x0286
            r14 = 0
            r8 = 0
        L_0x024f:
            if (r14 >= r13) goto L_0x027e
            boolean[] r1 = r12.A03     // Catch:{ all -> 0x043f }
            boolean r1 = r1[r14]     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x027b
            r1 = r10[r14]     // Catch:{ all -> 0x043f }
            short r15 = r1.getShort(r9)     // Catch:{ all -> 0x043f }
            int r6 = X.C132206Sq.A05     // Catch:{ all -> 0x043f }
            int r8 = r8 + r6
            int r15 = r15 + r6
            if (r8 >= r6) goto L_0x0268
            if (r15 >= r6) goto L_0x0268
            int r8 = r8 * r15
            int r8 = r8 / r6
            goto L_0x0273
        L_0x0268:
            int r1 = r8 + r15
            int r2 = r1 * 2
            int r8 = r8 * r15
            int r8 = r8 / r6
            int r2 = r2 - r8
            int r1 = X.C132206Sq.A06     // Catch:{ all -> 0x043f }
            int r8 = r2 - r1
        L_0x0273:
            int r1 = X.C132206Sq.A06     // Catch:{ all -> 0x043f }
            if (r8 != r1) goto L_0x0279
            int r8 = r1 + -1
        L_0x0279:
            int r8 = r8 - r6
            short r8 = (short) r8     // Catch:{ all -> 0x043f }
        L_0x027b:
            int r14 = r14 + 1
            goto L_0x024f
        L_0x027e:
            java.nio.ByteBuffer r1 = r12.A01     // Catch:{ all -> 0x043f }
            r1.putShort(r8)     // Catch:{ all -> 0x043f }
            int r9 = r9 + 2
            goto L_0x0249
        L_0x0286:
            java.nio.ByteBuffer r1 = r12.A01     // Catch:{ all -> 0x043f }
            r1.flip()     // Catch:{ all -> 0x043f }
            java.nio.ByteBuffer r1 = r12.A01     // Catch:{ all -> 0x043f }
            r11.A00 = r1     // Catch:{ all -> 0x043f }
            X.6V3 r1 = r11.A03     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x0296
            r1.A03(r4)     // Catch:{ all -> 0x043f }
        L_0x0296:
            long r4 = r0.A02     // Catch:{ all -> 0x043f }
            long r1 = r0.A0C     // Catch:{ all -> 0x043f }
            long r4 = r4 + r1
            r0.A02 = r4     // Catch:{ all -> 0x043f }
            X.6Py r1 = r0.A07     // Catch:{ all -> 0x043f }
            r1.A00(r4)     // Catch:{ all -> 0x043f }
            X.6Py r1 = r0.A06     // Catch:{ all -> 0x043f }
            r1.A00(r4)     // Catch:{ all -> 0x043f }
        L_0x02a7:
            X.67h r8 = r0.A0E     // Catch:{ all -> 0x043f }
            X.5sP r6 = r8.A01     // Catch:{ all -> 0x043f }
            java.nio.ByteBuffer r11 = r8.A00     // Catch:{ all -> 0x043f }
            X.6n7 r9 = r6.A02     // Catch:{ all -> 0x043f }
            X.60L r4 = r9.A0B     // Catch:{ all -> 0x043f }
            r1 = 5000(0x1388, double:2.4703E-320)
            X.6Em r4 = r4.A00     // Catch:{ all -> 0x043f }
            X.6mq r13 = r4.A00(r1)     // Catch:{ all -> 0x043f }
            if (r13 == 0) goto L_0x02f6
            java.nio.ByteBuffer r1 = r13.B95()     // Catch:{ all -> 0x043f }
            r1.put(r11)     // Catch:{ all -> 0x043f }
            r14 = 0
            int r15 = r11.position()     // Catch:{ all -> 0x043f }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x043f }
            long r1 = r6.A01     // Catch:{ all -> 0x043f }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x043f }
            r4 = 1
            long r4 = r12.toNanos(r4)     // Catch:{ all -> 0x043f }
            long r1 = r1 * r4
            r4 = 44100(0xac44, float:6.1797E-41)
            long r4 = (long) r4     // Catch:{ all -> 0x043f }
            long r1 = r1 / r4
            long r16 = r10.toMicros(r1)     // Catch:{ all -> 0x043f }
            r18 = 1
            r13.BqJ(r14, r15, r16, r18)     // Catch:{ all -> 0x043f }
            X.60L r1 = r9.A0B     // Catch:{ all -> 0x043f }
            X.6Em r1 = r1.A00     // Catch:{ all -> 0x043f }
            r1.A03(r13)     // Catch:{ all -> 0x043f }
            long r4 = r6.A01     // Catch:{ all -> 0x043f }
            int r2 = r11.position()     // Catch:{ all -> 0x043f }
            int r1 = r6.A00     // Catch:{ all -> 0x043f }
            int r2 = r2 / r1
            long r1 = (long) r2     // Catch:{ all -> 0x043f }
            long r4 = r4 + r1
            r6.A01 = r4     // Catch:{ all -> 0x043f }
        L_0x02f6:
            java.nio.ByteBuffer r1 = r8.A00     // Catch:{ all -> 0x043f }
            boolean r1 = r1.hasRemaining()     // Catch:{ all -> 0x043f }
            r1 = r1 ^ 1
            r1 = r1 ^ 1
            r0.A0A = r1     // Catch:{ all -> 0x043f }
            boolean r1 = X.AnonymousClass6XM.A03(r0)     // Catch:{ all -> 0x043f }
            if (r1 != 0) goto L_0x031c
            X.6V3 r1 = r8.A03     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x030f
            r1.A02()     // Catch:{ all -> 0x043f }
        L_0x030f:
            boolean r1 = r9.BuB()     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x031c
            android.os.Handler r0 = r0.A0D     // Catch:{ all -> 0x043f }
            r0.removeMessages(r7)     // Catch:{ all -> 0x043f }
            goto L_0x04f5
        L_0x031c:
            android.os.Handler r1 = r0.A0D     // Catch:{ all -> 0x043f }
            boolean r0 = r1.hasMessages(r7)     // Catch:{ all -> 0x043f }
            if (r0 != 0) goto L_0x04f5
            android.os.Message r0 = r1.obtainMessage(r7)     // Catch:{ all -> 0x043f }
            goto L_0x03a5
        L_0x0329:
            r1 = 1
            r0.A00 = r1     // Catch:{ all -> 0x043f }
            goto L_0x0398
        L_0x032d:
            java.lang.Object r4 = r5.obj     // Catch:{ all -> 0x043f }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x043f }
            int r2 = r0.A00     // Catch:{ all -> 0x043f }
            r1 = 2
            if (r2 == r1) goto L_0x04f5
            r0.A00 = r1     // Catch:{ all -> 0x043f }
            java.lang.Object r2 = r4.first     // Catch:{ all -> 0x043f }
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x043f }
            r0.A09 = r2     // Catch:{ all -> 0x043f }
            java.lang.Object r1 = r4.second     // Catch:{ all -> 0x043f }
            int r1 = X.C90514aH.A0H(r1)     // Catch:{ all -> 0x043f }
            long r8 = (long) r1     // Catch:{ all -> 0x043f }
            r4 = 0
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0387
            int r1 = r2.size()     // Catch:{ all -> 0x043f }
            java.lang.Integer[] r1 = new java.lang.Integer[r1]     // Catch:{ all -> 0x043f }
            java.lang.Object[] r1 = r2.toArray(r1)     // Catch:{ all -> 0x043f }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x043f }
            r5 = 0
            r1 = r1[r5]     // Catch:{ all -> 0x043f }
            X.6QD r4 = r0.A05     // Catch:{ all -> 0x043f }
            X.5TE r2 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x043f }
            int r1 = r1.intValue()     // Catch:{ all -> 0x043f }
            X.6Eg r1 = r4.A01(r2, r1)     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x0387
            java.util.List r1 = r1.A01     // Catch:{ all -> 0x043f }
            java.util.ArrayList r1 = X.C36441kJ.A15(r1)     // Catch:{ all -> 0x043f }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x043f }
            X.6F1 r2 = (X.AnonymousClass6F1) r2     // Catch:{ all -> 0x043f }
            X.7ez r1 = r0.A0F     // Catch:{ IOException -> 0x0385 }
            long r4 = X.AnonymousClass6U7.A02(r1, r2)     // Catch:{ IOException -> 0x0385 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ IOException -> 0x0385 }
            long r1 = r1.toSeconds(r4)     // Catch:{ IOException -> 0x0385 }
            long r8 = java.lang.Math.min(r1, r8)     // Catch:{ IOException -> 0x0385 }
            goto L_0x0387
        L_0x0385:
            r8 = 0
        L_0x0387:
            r6 = 0
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x043f }
            X.6F3 r4 = new X.6F3     // Catch:{ all -> 0x043f }
            r4.<init>(r5, r6, r8)     // Catch:{ all -> 0x043f }
            r0.A04 = r4     // Catch:{ all -> 0x043f }
            boolean r1 = X.AnonymousClass6XM.A03(r0)     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x04f5
        L_0x0398:
            android.os.Handler r2 = r0.A0D     // Catch:{ all -> 0x043f }
            r1 = 2
            boolean r0 = r2.hasMessages(r1)     // Catch:{ all -> 0x043f }
            if (r0 != 0) goto L_0x04f5
            android.os.Message r0 = r2.obtainMessage(r1)     // Catch:{ all -> 0x043f }
        L_0x03a5:
            r0.sendToTarget()     // Catch:{ all -> 0x043f }
            goto L_0x04f5
        L_0x03aa:
            java.lang.Object r4 = r5.obj     // Catch:{ all -> 0x043f }
            X.6QD r4 = (X.AnonymousClass6QD) r4     // Catch:{ all -> 0x043f }
            X.5zI r1 = r0.A08     // Catch:{ all -> 0x043f }
            X.6Lv r2 = new X.6Lv     // Catch:{ all -> 0x043f }
            r2.<init>(r1)     // Catch:{ all -> 0x043f }
            r2.A05 = r4     // Catch:{ all -> 0x043f }
            X.5zI r1 = new X.5zI     // Catch:{ all -> 0x043f }
            r1.<init>(r2)     // Catch:{ all -> 0x043f }
            r0.A08 = r1     // Catch:{ all -> 0x043f }
            r0.A05 = r4     // Catch:{ all -> 0x043f }
            X.AnonymousClass6XM.A02(r0)     // Catch:{ all -> 0x043f }
            goto L_0x04f5
        L_0x03c5:
            java.lang.Object r2 = r5.obj     // Catch:{ all -> 0x043f }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x043f }
            X.6MV r1 = new X.6MV     // Catch:{ all -> 0x043f }
            r1.<init>()     // Catch:{ all -> 0x043f }
            X.AnonymousClass6MV.A00(r1, r2)     // Catch:{ all -> 0x043f }
            X.AnonymousClass6XM.A01(r0)     // Catch:{ all -> 0x03d6 }
            goto L_0x04f5
        L_0x03d6:
            X.AnonymousClass6MV.A00(r1, r2)     // Catch:{ all -> 0x043f }
            goto L_0x04f5
        L_0x03db:
            X.AnonymousClass6XM.A01(r0)     // Catch:{ all -> 0x043f }
            goto L_0x04f5
        L_0x03e0:
            java.lang.Object r1 = r5.obj     // Catch:{ all -> 0x043f }
            long r4 = X.C90524aI.A07(r1)     // Catch:{ all -> 0x043f }
            java.lang.System.nanoTime()     // Catch:{ all -> 0x043f }
            r0.A02 = r4     // Catch:{ all -> 0x043d }
            X.6Py r1 = r0.A07     // Catch:{ all -> 0x043d }
            r1.A00(r4)     // Catch:{ all -> 0x043d }
            X.6Py r1 = r0.A06     // Catch:{ all -> 0x043d }
            r1.A00(r4)     // Catch:{ all -> 0x043d }
            java.util.Map r1 = r0.A0I     // Catch:{ all -> 0x043d }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x043d }
            java.util.HashSet r1 = X.C90524aI.A0k(r1)     // Catch:{ all -> 0x043d }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x043d }
        L_0x0403:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x043d }
            if (r1 == 0) goto L_0x042a
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x043d }
            int r6 = X.C90514aH.A0H(r1)     // Catch:{ all -> 0x043d }
            X.7lp r8 = X.AnonymousClass6XM.A00(r0, r6)     // Catch:{ all -> 0x043d }
            if (r8 == 0) goto L_0x0403
            X.6QD r2 = r0.A05     // Catch:{ all -> 0x043d }
            X.5TE r1 = X.AnonymousClass5TE.AUDIO     // Catch:{ all -> 0x043d }
            r2.A01(r1, r6)     // Catch:{ all -> 0x043d }
            r6 = 0
            long r1 = r4 - r6
            long r1 = java.lang.Math.max(r1, r6)     // Catch:{ all -> 0x043d }
            r8.BpZ(r1)     // Catch:{ all -> 0x043d }
            goto L_0x0403
        L_0x042a:
            r1 = 0
            r0.A0A = r1     // Catch:{ all -> 0x043d }
            X.67h r1 = r0.A0E     // Catch:{ all -> 0x043d }
            X.5sP r0 = r1.A01     // Catch:{ all -> 0x043d }
            X.6n7 r0 = r0.A02     // Catch:{ all -> 0x043d }
            r0.flush()     // Catch:{ all -> 0x043d }
            java.nio.ByteBuffer r0 = r1.A00     // Catch:{ all -> 0x043d }
            r0.clear()     // Catch:{ all -> 0x043d }
            goto L_0x04f5
        L_0x043d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x043f }
        L_0x043f:
            r2 = move-exception
            java.lang.Object r1 = r3.A00
            X.6XM r1 = (X.AnonymousClass6XM) r1
            X.6MV r0 = new X.6MV
            r0.<init>()
            X.AnonymousClass6MV.A00(r0, r2)
            X.AnonymousClass6XM.A01(r1)     // Catch:{ all -> 0x0451 }
            goto L_0x04f5
        L_0x0451:
            X.AnonymousClass6MV.A00(r0, r2)
            goto L_0x04f5
        L_0x0456:
            java.lang.Object r3 = r3.A00
            X.5Fb r3 = (X.C105545Fb) r3
            int r0 = r5.what
            r2 = 2
            r1 = 1
            if (r0 == r1) goto L_0x0464
            if (r0 == r2) goto L_0x0464
            goto L_0x0017
        L_0x0464:
            android.os.Handler r0 = r3.A00
            r0.removeMessages(r1)
            r0.removeMessages(r2)
            r0 = 0
            com.whatsapp.voipcalling.CallInfo r1 = X.C105545Fb.A02(r3, r0)
            if (r1 == 0) goto L_0x0017
            r0 = 0
            X.C105545Fb.A03(r3, r1, r0)
            goto L_0x0017
        L_0x0479:
            int r0 = r5.what
            if (r0 != 0) goto L_0x04f5
            java.lang.Object r3 = r3.A00
            X.6Ww r3 = (X.C133126Ww) r3
            java.lang.Object r2 = r5.obj
            X.5sW r2 = (X.C121055sW) r2
            java.lang.Object r1 = r3.A03
            monitor-enter(r1)
            X.5sW r0 = r3.A00     // Catch:{ all -> 0x0666 }
            if (r0 == r2) goto L_0x0490
            X.5sW r0 = r3.A01     // Catch:{ all -> 0x0666 }
            if (r0 != r2) goto L_0x0494
        L_0x0490:
            r0 = 2
            X.C133126Ww.A04(r2, r3, r0)     // Catch:{ all -> 0x0666 }
        L_0x0494:
            monitor-exit(r1)     // Catch:{ all -> 0x0666 }
            goto L_0x0017
        L_0x0497:
            java.lang.Object r1 = r3.A00
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r1 = (com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner) r1
            int r0 = r5.what
            if (r0 != 0) goto L_0x0017
            r1.A00()
            goto L_0x0017
        L_0x04a4:
            java.lang.Object r3 = r3.A00
            X.4d9 r3 = (X.C92114d9) r3
            int r1 = r5.what
            r0 = 1
            if (r1 != r0) goto L_0x0017
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r2 = r3.A02
            int r1 = r3.A00
            X.004 r0 = r2.A07
            boolean r0 = X.C90474aD.A1X(r0)
            if (r0 != 0) goto L_0x0017
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel.A01(r2, r1)
            goto L_0x0017
        L_0x04be:
            java.lang.Object r2 = r3.A00
            X.6YM r2 = (X.AnonymousClass6YM) r2
            int r0 = r5.what
            r1 = 1
            if (r0 == 0) goto L_0x0565
            if (r0 != r1) goto L_0x04f5
            X.1MK r0 = r2.A2Y
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0017
            X.6zT r0 = r2.A2E
            r0.A05()
            goto L_0x0017
        L_0x04d8:
            java.lang.Object r4 = r3.A00
            X.6YM r4 = (X.AnonymousClass6YM) r4
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            int r6 = r5.what
            r5 = 4
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1S(r6, r5)
            boolean r0 = X.C34681hT.A0T(r3)
            if (r0 != 0) goto L_0x04f7
            if (r1 != 0) goto L_0x04f7
            java.lang.String r0 = "voip/callTimeoutHandler we are not in an active call"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x04f5:
            r0 = 0
            return r0
        L_0x04f7:
            if (r6 == 0) goto L_0x0534
            if (r6 == r2) goto L_0x0549
            r0 = 2
            if (r6 == r0) goto L_0x0517
            r0 = 3
            if (r6 == r0) goto L_0x050f
            if (r6 != r5) goto L_0x04f5
            java.lang.String r0 = "voip/call/ringtone-timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6XR r0 = r4.A2P
            r0.A06()
            goto L_0x0017
        L_0x050f:
            java.lang.String r0 = "voip/call/busy-tone-timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 10
            goto L_0x055f
        L_0x0517:
            java.lang.String r0 = "voip/call/send-call-offer-timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wD r0 = r4.A2a
            int r0 = r0.A03(r2)
            if (r0 != 0) goto L_0x0017
            r2 = 9
            android.content.Context r1 = r4.A22
            r0 = 2131895883(0x7f12264b, float:1.9426612E38)
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass6YM.A0A(r4, r3, r0, r2)
            goto L_0x0017
        L_0x0534:
            java.lang.String r0 = "voip/call/not-accept-timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.isGroupCall
            if (r0 == 0) goto L_0x0547
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0017
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 == r0) goto L_0x0017
        L_0x0547:
            r1 = 7
            goto L_0x055f
        L_0x0549:
            java.lang.String r0 = "voip/call/accepted-but-not-active-timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.isAudioChat()
            if (r0 == 0) goto L_0x055d
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r0 = 34
            r4.A0l(r1, r0)
        L_0x055d:
            r1 = 8
        L_0x055f:
            r0 = 0
            X.AnonymousClass6YM.A0A(r4, r3, r0, r1)
            goto L_0x0017
        L_0x0565:
            X.1MK r0 = r2.A2Y
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0017
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass6YM.A3X
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x057a
            r2.A0L()
            goto L_0x0017
        L_0x057a:
            java.lang.String r0 = "voip/service/stopSelfHandler stopSelf now"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A1T = r1
            X.1PW r0 = r2.A2R
            android.os.Handler r1 = r0.A00
            r0 = 2
            X.C90514aH.A1I(r1, r0)
            goto L_0x0017
        L_0x058b:
            java.lang.Object r3 = r3.A00
            X.711 r3 = (X.AnonymousClass711) r3
            int r1 = r5.what
            r2 = 1
            if (r1 == r2) goto L_0x05b3
            r0 = 2
            if (r1 != r0) goto L_0x0017
            X.53T r0 = r3.A03
            com.whatsapp.jid.UserJid r2 = r0.A0S()
            java.util.Map r1 = r3.A07
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0017
            X.AnonymousClass711.A02(r3, r2)
            java.lang.Object r0 = r1.get(r2)
            X.70u r0 = (X.C1493370u) r0
            X.AnonymousClass711.A01(r0, r3)
            goto L_0x0017
        L_0x05b3:
            java.lang.String r0 = "voip/VideoPortManager/Camera evicted"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = r3.A01
            if (r3 == 0) goto L_0x0017
            X.5Fb r5 = r3.A0Q
            X.6OZ r4 = r5.A05()
            com.whatsapp.voipcalling.CallState r1 = r4.A09
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x05d0
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x05d0
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0017
        L_0x05d0:
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x0017
            X.0wy r1 = r4.A04
            com.whatsapp.jid.UserJid r0 = r4.A08
            java.lang.Object r0 = r1.get(r0)
            X.6EE r0 = (X.AnonymousClass6EE) r0
            if (r0 == 0) goto L_0x05e6
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x05e6
            goto L_0x0017
        L_0x05e6:
            X.6EE r0 = r4.A05
            if (r0 == 0) goto L_0x0017
            int r0 = r0.A06
            if (r0 != r2) goto L_0x0017
            X.6YM r0 = r5.A01
            if (r0 == 0) goto L_0x05f9
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A1E
            X.74X r0 = X.AnonymousClass74X.A00
            r1.execute(r0)
        L_0x05f9:
            X.1Rs r0 = r3.A0v
            X.C36341k9.A18(r0, r2)
            goto L_0x0017
        L_0x0600:
            java.lang.Object r5 = r3.A00
            X.5NK r5 = (X.AnonymousClass5NK) r5
            boolean r0 = r5.A0R
            if (r0 == 0) goto L_0x0017
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x0653
            X.3Qq r0 = r5.A0H
            if (r0 == 0) goto L_0x0653
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0653
            X.3Qq r0 = r5.A0H
            int r0 = r0.A05()
            if (r0 == 0) goto L_0x0653
            X.3Qq r0 = r5.A0H
            int r0 = r0.A04()
            long r2 = X.C36371kC.A07(r0)
            X.3Qq r0 = r5.A0H
            int r0 = r0.A05()
            long r0 = (long) r0
            long r2 = r2 / r0
            android.widget.ProgressBar r0 = r5.A0l
            int r1 = (int) r2
            r0.setProgress(r1)
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x0653
            android.widget.SeekBar r0 = r5.A0m
            r0.setProgress(r1)
            android.widget.TextView r4 = r5.A0n
            java.lang.StringBuilder r3 = r5.A0u
            java.util.Formatter r2 = r5.A0v
            X.3Qq r0 = r5.A0H
            int r0 = r0.A04()
            long r0 = (long) r0
            java.lang.String r0 = X.C111825cu.A00(r3, r2, r0)
            r4.setText(r0)
        L_0x0653:
            android.os.Handler r3 = r5.A0V
            r2 = 0
            r0 = 50
            r3.sendEmptyMessageDelayed(r2, r0)
            goto L_0x0017
        L_0x065d:
            java.lang.Object r0 = r3.A00
            X.6YM r0 = (X.AnonymousClass6YM) r0
            boolean r0 = r0.A0o(r5)
            return r0
        L_0x0666:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0666 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163797qm.handleMessage(android.os.Message):boolean");
    }
}
