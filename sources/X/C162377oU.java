package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.7oU  reason: invalid class name and case insensitive filesystem */
public class C162377oU extends Handler {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162377oU(Looper looper, Object obj, int i) {
        super(looper);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (r9 <= r7) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if (r5 < r3) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r19) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A01
            r1 = r19
            switch(r0) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x0042;
                case 2: goto L_0x0028;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r3.A00
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = (com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView) r0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r4 = r0.getExpressionsViewModel()
            X.040 r2 = X.C109325Xd.A00(r4)
            r1 = 0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onEmojiBackspaceClick$1 r0 = new com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onEmojiBackspaceClick$1
            r0.<init>(r4, r1)
            X.C36331k8.A1T(r0, r2)
            int r0 = android.view.ViewConfiguration.getKeyRepeatDelay()
            long r1 = (long) r0
            r0 = 0
            r3.sendEmptyMessageDelayed(r0, r1)
        L_0x0027:
            return
        L_0x0028:
            java.lang.Object r8 = r3.A00
            X.6zU r8 = (X.C148826zU) r8
            int r0 = X.C148826zU.A12
            X.6Tw r0 = r8.A0L
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x0105
            boolean r0 = r8.A0Q
            if (r0 != 0) goto L_0x0027
            r1 = 1
            r0 = 0
            r8.A0H(r1, r0)
            return
        L_0x0042:
            int r1 = r1.what
            r15 = 1
            java.lang.Object r0 = r3.A00
            X.6OO r0 = (X.AnonymousClass6OO) r0
            X.5lc r0 = r0.A05
            if (r1 != r15) goto L_0x006d
            X.6YT r1 = r0.A00
            X.7m8 r0 = r1.A0C
            boolean r0 = r0.BLy()
            if (r0 == 0) goto L_0x0027
            X.7m8 r0 = r1.A0C
            boolean r0 = r0.BMx()
            if (r0 != 0) goto L_0x0027
            X.14u r0 = r1.A0A
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.BLh()
            if (r0 != 0) goto L_0x0027
            X.AnonymousClass6YT.A07(r1)
            return
        L_0x006d:
            X.6YT r14 = r0.A00
            X.7m8 r0 = r14.A0C
            boolean r0 = r0.BMx()
            X.6OO r13 = r14.A0I
            if (r0 == 0) goto L_0x01a9
            java.io.File r2 = r14.A0K
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r13.A00
            long r5 = r5 - r0
            com.whatsapp.camera.recording.RecordingView r12 = r13.A01
            java.lang.String r1 = X.AnonymousClass6OO.A00(r13, r5)
            android.widget.TextView r0 = r12.A00
            r0.setText(r1)
            r11 = 0
            if (r2 == 0) goto L_0x00eb
            long r9 = r2.length()
            long r7 = r13.A03
            r16 = 0
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r2 = 1
            if (r0 > 0) goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            long r3 = r13.A02
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ad
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            if (r2 != 0) goto L_0x00e4
            if (r0 != 0) goto L_0x00e4
            r2 = 0
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x00e0
            r1 = 0
        L_0x00b8:
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bf
            float r2 = (float) r5
            float r0 = (float) r3
            float r2 = r2 / r0
        L_0x00bf:
            r3 = 1120403456(0x42c80000, float:100.0)
            float r0 = java.lang.Math.max(r1, r2)
            float r0 = r0 * r3
            int r3 = (int) r0
            com.whatsapp.CircularProgressBar r0 = r12.A01
            r0.setProgress(r3)
        L_0x00cc:
            r13.A01(r15, r15, r11)
            android.os.Handler r2 = r13.A04
            r0 = 50
            r2.sendEmptyMessageDelayed(r11, r0)
            X.6WU r0 = r14.A0E
            com.whatsapp.CircularProgressBar r0 = r0.A04
            if (r0 == 0) goto L_0x0027
            r0.setProgress(r3)
            return
        L_0x00e0:
            float r1 = (float) r9
            float r0 = (float) r7
            float r1 = r1 / r0
            goto L_0x00b8
        L_0x00e4:
            X.5lc r0 = r13.A05
            X.6YT r0 = r0.A00
            X.AnonymousClass6YT.A0K(r0, r15)
        L_0x00eb:
            r3 = 0
            goto L_0x00cc
        L_0x00ed:
            java.lang.Object r4 = r1.obj
            X.7ku r4 = (X.C160377ku) r4
            java.lang.Object r0 = r3.A00
            X.4rE r0 = (X.C98314rE) r0
            X.6lc r3 = r0.A00
            X.68b r2 = X.C1273868b.A00()
            X.67i r1 = r0.A02
            r0 = 0
            r2.A0A(r1, r0)
            X.C1273868b.A06(r1, r3, r2, r4)
            return
        L_0x0105:
            int r1 = r8.A0A()
            r8.A02 = r1
            X.7ld r0 = r8.A0G
            if (r0 == 0) goto L_0x011a
            boolean r0 = X.C90494aF.A1W(r0, r8)
            if (r0 == 0) goto L_0x011a
            X.7ld r0 = r8.A0G
            r0.Bdg(r1)
        L_0x011a:
            boolean r0 = r8.A0T
            if (r0 == 0) goto L_0x0139
            X.6OW r9 = r8.A0f
            X.1V6 r0 = r9.A0C
            X.6zU r0 = r0.A00
            if (r0 != r8) goto L_0x0139
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r9.A00
            long r4 = r6 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0139
            r9.A02(r8)
            r9.A00 = r6
        L_0x0139:
            X.7gO r9 = r8.A0H
            if (r9 == 0) goto L_0x01a2
            android.media.audiofx.Visualizer r0 = r8.A0E
            if (r0 != 0) goto L_0x01a2
            int r0 = r8.A05
            int r12 = r0 + 1
            r8.A05 = r12
            byte[] r8 = X.C148826zU.A14
            r2 = 0
            if (r8 != 0) goto L_0x018e
            r0 = 128(0x80, float:1.794E-43)
            r11 = 128(0x80, float:1.794E-43)
            byte[] r8 = new byte[r0]
            X.C148826zU.A14 = r8
            r10 = 0
        L_0x0155:
            double r6 = (double) r10
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 * r0
            r0 = 4629700416936869888(0x4040000000000000, double:32.0)
            double r0 = r0 * r6
            double r4 = (double) r11
            double r0 = r0 / r4
            double r0 = java.lang.Math.sin(r0)
            r13 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r13 = r13 * r6
            double r13 = r13 / r4
            double r13 = java.lang.Math.sin(r13)
            double r13 = java.lang.Math.abs(r13)
            double r0 = r0 * r13
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 * r13
            double r6 = r6 / r4
            double r4 = java.lang.Math.sin(r6)
            double r4 = java.lang.Math.abs(r4)
            double r0 = r0 * r4
            r6 = 4638707616191610880(0x4060000000000000, double:128.0)
            r4 = 4634204016564240384(0x4050000000000000, double:64.0)
            double r0 = r0 * r4
            double r0 = r0 + r6
            int r4 = (int) r0
            byte r0 = (byte) r4
            r8[r10] = r0
            int r10 = r10 + 1
            if (r10 >= r11) goto L_0x018e
            goto L_0x0155
        L_0x018e:
            int r0 = r12 % 4
            if (r0 != 0) goto L_0x019f
        L_0x0192:
            int r0 = r8.length
            if (r2 >= r0) goto L_0x019f
            byte r0 = r8[r2]
            int r0 = 256 - r0
            byte r0 = (byte) r0
            r8[r2] = r0
            int r2 = r2 + 1
            goto L_0x0192
        L_0x019f:
            r9.Bkd(r8)
        L_0x01a2:
            r2 = 0
            r0 = 50
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        L_0x01a9:
            boolean r1 = r14.A0S()
            r0 = 0
            r13.A01(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162377oU.handleMessage(android.os.Message):void");
    }
}
