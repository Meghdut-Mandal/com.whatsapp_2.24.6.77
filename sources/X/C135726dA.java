package X;

import android.view.View;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.6dA  reason: invalid class name and case insensitive filesystem */
public final class C135726dA implements View.OnTouchListener {
    public final /* synthetic */ CreationModeBottomBar A00;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r1 != 3) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r10, r0)
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r2 = r8.A00
            X.7d6 r6 = r2.A09
            r3 = 0
            if (r6 == 0) goto L_0x0019
            int r1 = r10.getAction()
            if (r1 == 0) goto L_0x0127
            if (r1 == r0) goto L_0x00a4
            r0 = 2
            if (r1 == r0) goto L_0x001a
            r0 = 3
            if (r1 == r0) goto L_0x00a4
        L_0x0019:
            return r3
        L_0x001a:
            float r5 = r10.getRawX()
            r10.getRawY()
            float r7 = X.C36441kJ.A01(r2)
            X.6vw r6 = (X.C146646vw) r6
            boolean r0 = r6.A0C
            if (r0 != 0) goto L_0x0019
            float r0 = r6.A02
            float r4 = r5 - r0
            X.65z r2 = r6.A06
            X.5Sr r1 = r2.A00
            X.5Sr r0 = X.C108225Sr.RECORDING
            if (r1 != r0) goto L_0x003c
            r6.A00 = r4
            r2.A00()
        L_0x003c:
            r6.A01 = r5
            float r0 = r6.A00
            float r5 = java.lang.Math.abs(r0)
            float r5 = r5 / r7
            X.0ts r0 = r6.A0E
            boolean r4 = X.C36351kA.A1Y(r0)
            r1 = 0
            r2 = 1
            float r0 = r6.A00
            if (r4 == 0) goto L_0x009f
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0019
        L_0x0055:
            r0 = 1041194025(0x3e0f5c29, float:0.14)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0019
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0019
            X.6VH r0 = r6.A08
            r0.A05(r6, r2)
            r6.A0C = r2
            X.7ka r1 = r6.A07
            if (r1 == 0) goto L_0x007b
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r1 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r1
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r1.A0i
            if (r0 == 0) goto L_0x007b
            X.6zV r0 = r1.A0j
            if (r0 == 0) goto L_0x007b
            X.C148836zV.A03(r0, r2)
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0K(r1)
        L_0x007b:
            X.1Xt r0 = r6.A0I
            X.1Xw r2 = r0.A0A
            X.1Xc r0 = r2.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0019
            X.2SV r1 = X.C29761Xw.A00(r2)
            r0 = 28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            java.lang.Integer r0 = X.C36381kD.A0n()
            r1.A01 = r0
            X.0yW r0 = r2.A02
            r0.Blw(r1)
            return r3
        L_0x009f:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            goto L_0x0055
        L_0x00a4:
            X.6vw r6 = (X.C146646vw) r6
            X.65z r0 = r6.A06
            X.5Sr r1 = r0.A00
            X.5Sr r0 = X.C108225Sr.WAIT_FOR_VOICE
            if (r1 != r0) goto L_0x00d8
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0019
            X.6VH r5 = r6.A08
            X.6E4 r2 = r5.A02
            java.util.concurrent.CopyOnWriteArraySet r4 = r2.A04
            r4.clear()
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A01(r0)
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            X.4qs r0 = new X.4qs
            r0.<init>(r5, r2, r1)
            r4.add(r0)
            r6.A0B = r3
            X.7ka r0 = r6.A07
            if (r0 == 0) goto L_0x0019
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0h(r0)
            return r3
        L_0x00d8:
            X.5Sr r0 = X.C108225Sr.RECORDING
            if (r1 != r0) goto L_0x0019
            boolean r0 = r6.A0C
            if (r0 != 0) goto L_0x0019
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A04
            long r4 = r4 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a8
            X.7ka r7 = r6.A07
            if (r7 == 0) goto L_0x0113
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r7 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r7
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r7.A0i
            if (r0 == 0) goto L_0x0113
            X.6zV r5 = r7.A0j
            if (r5 == 0) goto L_0x0113
            X.1lt r4 = r5.A06
            if (r4 == 0) goto L_0x0110
            android.os.Handler r2 = r4.A03
            if (r2 == 0) goto L_0x010d
            r1 = 32
            X.3wb r0 = new X.3wb
            r0.<init>(r4, r1)
            r2.post(r0)
        L_0x010d:
            X.C148836zV.A03(r5, r3)
        L_0x0110:
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0I(r7)
        L_0x0113:
            X.6VH r1 = r6.A08
            r1.A02()
            X.7lP r0 = r6.A0J
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.A04(r0)
            X.5LL r0 = new X.5LL
            r0.<init>(r6)
            r6.A06 = r0
            return r3
        L_0x0127:
            float r0 = r10.getRawX()
            r10.getRawY()
            X.6vw r6 = (X.C146646vw) r6
            r6.A02 = r0
            r6.A01 = r0
            X.3L2 r1 = r6.A0H
            X.14u r0 = r6.A05
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0019
            X.65z r0 = r6.A06
            X.5Sr r1 = r0.A00
            X.5Sr r0 = X.C108225Sr.WAIT_FOR_VOICE
            if (r1 != r0) goto L_0x018c
            X.7lP r4 = r6.A0J
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r4 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r4
            X.3Dv r0 = r4.A0B
            if (r0 != 0) goto L_0x0160
            android.app.Activity r2 = X.C36361kB.A06(r4)
            X.4SR r1 = r4.getVoiceNotePermissionCheckerFactory()
            X.190 r0 = X.C36441kJ.A0j()
            X.3Dv r0 = r1.B43(r2, r0)
            r4.A0B = r0
        L_0x0160:
            r1 = 1
            boolean r0 = r0.A00()
            if (r0 != r1) goto L_0x018c
            X.6VH r5 = r6.A08
            X.0yb r0 = r5.A04
            if (r0 == 0) goto L_0x01c1
            X.C55922vP.A00(r0)
            X.6E4 r4 = r5.A02
            java.util.concurrent.CopyOnWriteArraySet r2 = r4.A04
            r2.clear()
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4.A00(r0)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4.A01(r0)
            X.5LO r0 = new X.5LO
            r0.<init>(r6, r5)
            r2.add(r0)
            r0 = 1
            r6.A0B = r0
        L_0x018c:
            X.7ka r2 = r6.A07
            if (r2 == 0) goto L_0x0019
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            android.view.View r0 = r2.A04
            if (r0 == 0) goto L_0x01a0
            r1 = 8
            r0.clearAnimation()
            android.view.View r0 = r2.A04
            r0.setVisibility(r1)
        L_0x01a0:
            X.17Y r1 = r2.A05
            java.lang.Runnable r0 = r2.A14
            r1.A0G(r0)
            return r3
        L_0x01a8:
            X.7ka r2 = r6.A07
            if (r2 == 0) goto L_0x01bd
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = r2.A0i
            if (r0 == 0) goto L_0x01bd
            X.6zV r1 = r2.A0j
            if (r1 == 0) goto L_0x01bd
            r0 = 1
            X.C148836zV.A03(r1, r0)
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0K(r2)
        L_0x01bd:
            X.C146646vw.A00(r6)
            return r3
        L_0x01c1:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135726dA.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C135726dA(CreationModeBottomBar creationModeBottomBar) {
        this.A00 = creationModeBottomBar;
    }
}
