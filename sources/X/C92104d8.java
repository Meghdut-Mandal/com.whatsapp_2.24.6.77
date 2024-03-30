package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.4d8  reason: invalid class name and case insensitive filesystem */
public class C92104d8 extends OrientationEventListener {
    public int A00 = -1;
    public final C117015lZ A01;

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00db, code lost:
        if (r14 >= 300) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r14) {
        /*
            r13 = this;
            r1 = -1
            if (r14 == r1) goto L_0x00a1
            r0 = 330(0x14a, float:4.62E-43)
            if (r14 >= r0) goto L_0x00e0
            r0 = 30
            if (r14 < r0) goto L_0x00e0
            r0 = 60
            if (r14 < r0) goto L_0x00dd
            r0 = 120(0x78, float:1.68E-43)
            if (r14 >= r0) goto L_0x00c9
            r4 = 1
        L_0x0014:
            int r0 = r13.A00
            if (r4 == r0) goto L_0x00a1
            if (r4 == r1) goto L_0x00a1
            r13.A00 = r4
            X.5lZ r0 = r13.A01
            X.6YT r2 = r0.A00
            X.14u r0 = r2.A0A
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r2.A0S()
            if (r0 != 0) goto L_0x00a1
            X.6WU r3 = r2.A0E
            int r0 = r3.A01
            int r1 = X.C90504aG.A07(r0)
            int r5 = X.C90504aG.A07(r4)
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != 0) goto L_0x00c1
            if (r5 != r0) goto L_0x003e
            r1 = 360(0x168, float:5.04E-43)
        L_0x003e:
            float r7 = (float) r1
            float r8 = (float) r5
            r9 = 1
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 1
            r12 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.RotateAnimation r6 = new android.view.animation.RotateAnimation
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.C90514aH.A1K(r6)
            r0 = 100
            r6.setDuration(r0)
            r6.setFillAfter(r9)
            com.whatsapp.WaImageView r0 = r3.A0F
            r0.startAnimation(r6)
            com.whatsapp.WaImageView r0 = r3.A0I
            r0.startAnimation(r6)
            X.5tE r0 = r3.A05
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x006b
            com.whatsapp.WaImageView r0 = r3.A0G
            r0.startAnimation(r6)
        L_0x006b:
            android.view.View r1 = r3.A0C
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0076
            r1.startAnimation(r6)
        L_0x0076:
            r3.A00 = r5
            r3.A01 = r4
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x00b8
            r3.A06 = r9
        L_0x0080:
            X.6OO r0 = r2.A0I
            com.whatsapp.camera.recording.RecordingView r5 = r0.A01
            int r0 = X.C90504aG.A07(r4)
            float r0 = (float) r0
            r5.setRotation(r0)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            X.0BJ r3 = (X.AnonymousClass0BJ) r3
            r2 = -1
            r1 = 0
            if (r4 != r9) goto L_0x00a2
            r3.A0U = r1
            r3.A0q = r1
            r3.A0m = r2
        L_0x009c:
            r3.A0D = r1
        L_0x009e:
            r5.setLayoutParams(r3)
        L_0x00a1:
            return
        L_0x00a2:
            r0 = 3
            if (r4 != r0) goto L_0x00ac
            r3.A0U = r2
            r3.A0q = r1
            r3.A0m = r1
            goto L_0x009c
        L_0x00ac:
            r3.A0U = r1
            r0 = 2131428532(0x7f0b04b4, float:1.8478711E38)
            r3.A0q = r0
            r3.A0m = r1
            r3.A0D = r2
            goto L_0x009e
        L_0x00b8:
            if (r4 == r9) goto L_0x00bd
            r0 = 3
            if (r4 != r0) goto L_0x0080
        L_0x00bd:
            X.AnonymousClass6YT.A06(r2)
            goto L_0x0080
        L_0x00c1:
            if (r1 != r0) goto L_0x003e
            if (r5 != 0) goto L_0x003e
            r5 = 360(0x168, float:5.04E-43)
            goto L_0x003e
        L_0x00c9:
            r0 = 150(0x96, float:2.1E-43)
            if (r14 < r0) goto L_0x00dd
            r0 = 210(0xd2, float:2.94E-43)
            if (r14 >= r0) goto L_0x00d4
            r4 = 2
            goto L_0x0014
        L_0x00d4:
            r0 = 240(0xf0, float:3.36E-43)
            if (r14 < r0) goto L_0x00dd
            r0 = 300(0x12c, float:4.2E-43)
            r4 = 3
            if (r14 < r0) goto L_0x0014
        L_0x00dd:
            r4 = -1
            goto L_0x0014
        L_0x00e0:
            r4 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92104d8.onOrientationChanged(int):void");
    }

    public C92104d8(Context context, C117015lZ r3) {
        super(context);
        this.A01 = r3;
    }
}
