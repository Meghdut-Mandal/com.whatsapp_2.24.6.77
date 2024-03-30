package X;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3Yh  reason: invalid class name and case insensitive filesystem */
public final class C67043Yh implements View.OnClickListener {
    public final View A00;
    public final C19730wQ A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass171 A03;
    public final AnonymousClass1RY A04;
    public final AnonymousClass3HF A05;
    public final AnonymousClass1V6 A06;
    public final C19420v0 A07;
    public final C18820ts A08;
    public final WeakReference A09;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r2 == 10) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r12, r6)
            X.1V6 r9 = r11.A06
            X.6zU r2 = r9.A00()
            X.2bi r3 = r9.A01()
            boolean r1 = r9.A0C()
            boolean r0 = r9.A0B()
            if (r1 != 0) goto L_0x0026
            if (r0 == 0) goto L_0x001d
            r9.A04()
        L_0x001d:
            monitor-enter(r9)
            r0 = 0
            r9.A02 = r0     // Catch:{ all -> 0x0023 }
            monitor-exit(r9)
            goto L_0x0045
        L_0x0023:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0026:
            if (r0 == 0) goto L_0x0041
            X.6zU r1 = r9.A00()
            if (r1 == 0) goto L_0x0034
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
        L_0x0034:
            r9.A04()
            boolean r0 = r12 instanceof android.widget.ImageButton
            if (r0 == 0) goto L_0x0090
            android.widget.ImageButton r12 = (android.widget.ImageButton) r12
            X.AnonymousClass3UR.A06(r12)
            return
        L_0x0041:
            if (r2 != 0) goto L_0x0091
            if (r3 == 0) goto L_0x0090
        L_0x0045:
            java.lang.ref.WeakReference r0 = r11.A09
            android.app.Activity r2 = X.C36441kJ.A0D(r0)
            if (r3 == 0) goto L_0x0090
            if (r2 == 0) goto L_0x0090
            X.3HF r1 = r11.A05
            r5 = 0
            r0 = 1
            X.6zU r4 = r1.A01(r2, r6, r0)
            r4.A0J = r3
            r4.A08 = r0
            int r2 = r3.A0D
            r0 = 9
            if (r2 == r0) goto L_0x0066
            r1 = 10
            r0 = 0
            if (r2 != r1) goto L_0x0067
        L_0x0066:
            r0 = 1
        L_0x0067:
            r4.A0P = r0
            r4.A0F = r5
            r0 = 1
            r4.A0C(r6, r0, r0)
            X.0ts r10 = r11.A08
            android.view.View r4 = r11.A00
            X.1RY r8 = r11.A04
            X.0wQ r5 = r11.A01
            X.16D r6 = r11.A02
            X.171 r7 = r11.A03
            X.AnonymousClass3UR.A01(r4, r5, r6, r7, r8, r9, r10)
            X.0v0 r1 = r11.A07
            X.3Qa r0 = r3.A1J
            X.11F r0 = r0.A00
            X.AnonymousClass3UR.A0B(r1, r0)
            X.6zU r1 = r9.A00()
            if (r1 == 0) goto L_0x0090
            r0 = 1
            r1.A0S = r0
        L_0x0090:
            return
        L_0x0091:
            r0 = 1
            r2.A0C(r6, r0, r0)
            boolean r0 = r12 instanceof android.widget.ImageButton
            if (r0 == 0) goto L_0x0090
            android.widget.ImageButton r12 = (android.widget.ImageButton) r12
            X.AnonymousClass3UR.A05(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67043Yh.onClick(android.view.View):void");
    }

    public C67043Yh(Activity activity, View view, C19730wQ r4, AnonymousClass16D r5, AnonymousClass171 r6, AnonymousClass1RY r7, AnonymousClass3HF r8, AnonymousClass1V6 r9, C19420v0 r10, C18820ts r11) {
        C36321k7.A11(view, r8, r9);
        C36381kD.A1K(r11, 5, r4);
        C36321k7.A14(r5, r6, r10);
        this.A00 = view;
        this.A05 = r8;
        this.A06 = r9;
        this.A08 = r11;
        this.A04 = r7;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A07 = r10;
        this.A09 = AnonymousClass001.A0F(activity);
    }
}
