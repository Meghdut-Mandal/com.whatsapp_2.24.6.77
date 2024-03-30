package X;

import android.view.ViewTreeObserver;

/* renamed from: X.7r5  reason: invalid class name and case insensitive filesystem */
public class C163987r5 implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public final int A01;

    public C163987r5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00af, code lost:
        r3 = r4.A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x00e2;
                case 1: goto L_0x00a7;
                case 2: goto L_0x0084;
                case 3: goto L_0x005e;
                case 4: goto L_0x0043;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r6.A00
            X.688 r5 = (X.AnonymousClass688) r5
            com.whatsapp.text.FinalBackspaceAwareEntry r0 = r5.A07
            X.C36351kA.A1D(r0, r6)
            android.view.View r3 = r5.A0B
            r0 = 2131433672(0x7f0b18c8, float:1.8489136E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x0041
            int[] r2 = r5.A0H
            r0.getLocationOnScreen(r2)
            int[] r1 = r5.A0G
            r3.getLocationOnScreen(r1)
            android.widget.TextView r4 = r5.A05
            float r3 = r4.getX()
            r0 = 0
            r2 = r2[r0]
            r0 = r1[r0]
            int r2 = r2 - r0
            float r1 = (float) r2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            r5.A00 = r2
            r4.setX(r1)
            android.widget.TextView r1 = r5.A06
            int r0 = r5.A00
        L_0x003d:
            float r0 = (float) r0
            r1.setX(r0)
        L_0x0041:
            r0 = 1
            return r0
        L_0x0043:
            java.lang.Object r2 = r6.A00
            X.6Zc r2 = (X.C133586Zc) r2
            android.view.View r0 = r2.A0D
            X.C36351kA.A1D(r0, r6)
            android.view.View r0 = r2.A0D
            int r0 = r0.getHeight()
            X.C133586Zc.A0D(r2, r0)
            r1 = 0
            r2.A0Y(r1)
            r0 = 0
            r2.A0U(r0, r1)
            goto L_0x0041
        L_0x005e:
            java.lang.Object r4 = r6.A00
            X.6Zc r4 = (X.C133586Zc) r4
            android.view.View r0 = r4.A07
            X.C36351kA.A1D(r0, r6)
            X.62y r1 = r4.A0U
            android.view.View r0 = r4.A07
            float r0 = X.C36441kJ.A02(r0)
            r1.A00(r0)
            android.location.Location r3 = r4.A0I()
            int r2 = r4.A0H()
            r1 = 0
            r0 = 0
            X.C133586Zc.A05(r3, r4, r1, r2, r0)
            r0 = 1
            r4.A0V(r1, r0)
            goto L_0x0041
        L_0x0084:
            java.lang.Object r1 = r6.A00
            X.6ov r1 = (X.C142466ov) r1
            android.view.View r0 = r1.A09
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x0041
            java.util.List r0 = r1.A19
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0041
            android.view.View r0 = r1.A09
            X.C36351kA.A1D(r0, r6)
            android.view.View r1 = r1.A09
            float r0 = X.C36441kJ.A02(r1)
            r1.setTranslationY(r0)
            goto L_0x0041
        L_0x00a7:
            java.lang.Object r0 = r6.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity) r0
            X.5Jw r4 = r0.A04
            if (r4 == 0) goto L_0x0041
            android.view.View r3 = r4.A07
            r0 = 2131433672(0x7f0b18c8, float:1.8489136E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x0041
            int[] r2 = r4.A0B
            r0.getLocationOnScreen(r2)
            int[] r1 = r4.A0A
            r3.getLocationOnScreen(r1)
            android.widget.TextView r0 = r4.A04
            float r3 = r0.getX()
            r0 = 0
            r2 = r2[r0]
            r0 = r1[r0]
            int r2 = r2 - r0
            float r1 = (float) r2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            X.C106485Jw.A0E = r2
            android.widget.TextView r0 = r4.A04
            r0.setX(r1)
            android.widget.TextView r1 = r4.A05
            int r0 = X.C106485Jw.A0E
            goto L_0x003d
        L_0x00e2:
            java.lang.Object r3 = r6.A00
            com.google.android.material.timepicker.ClockFaceView r3 = (com.google.android.material.timepicker.ClockFaceView) r3
            boolean r0 = r3.isShown()
            if (r0 == 0) goto L_0x0041
            X.C36351kA.A1D(r3, r6)
            int r2 = X.C36441kJ.A07(r3)
            com.google.android.material.timepicker.ClockHandView r1 = r3.A0B
            int r0 = r1.A07
            int r2 = r2 - r0
            int r0 = r3.A04
            int r2 = r2 - r0
            int r0 = r3.A01
            if (r2 == r0) goto L_0x0041
            r3.A01 = r2
            r3.A06()
            int r0 = r3.A01
            r1.A02 = r0
            r1.invalidate()
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163987r5.onPreDraw():boolean");
    }
}
