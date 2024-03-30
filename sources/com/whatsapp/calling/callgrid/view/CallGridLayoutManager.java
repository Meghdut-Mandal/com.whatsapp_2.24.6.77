package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass0C4;
import X.C116945lS;
import X.C145156tR;
import X.C97114oS;
import android.os.Handler;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class CallGridLayoutManager extends StaggeredGridLayoutManager {
    public int A00 = 0;
    public int A01 = 0;
    public C116945lS A02;
    public boolean A03 = false;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C145156tR A0A;
    public final C97114oS A0B;

    public CallGridLayoutManager(C145156tR r2, C97114oS r3) {
        super(1, 1);
        this.A0B = r3;
        this.A0A = r2;
        this.A09 = new Handler();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r6.A08 == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1D(X.C02760Bu r19, X.AnonymousClass0C4 r20) {
        /*
            r18 = this;
            r6 = r18
            boolean r0 = r6.A07
            r9 = r19
            r17 = r20
            if (r0 != 0) goto L_0x0144
            int r1 = r6.A0M()
            int r11 = r17.A00()
            if (r1 != 0) goto L_0x0022
            int r1 = r6.A0L()
        L_0x0018:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0149
            X.0CI r0 = r6.A05
            r0.A09(r1)
            goto L_0x0018
        L_0x0022:
            r6.A0c(r9)
            X.6tR r4 = r6.A0A
            boolean r0 = r6.A04
            int r7 = r4.A01(r1, r0)
            int r0 = r6.A06
            r1 = 1
            boolean r14 = X.C36381kD.A1U(r7, r0)
            int r2 = r6.A00
            int r0 = r6.A01
            boolean r5 = X.C36381kD.A1U(r2, r0)
            if (r11 != r1) goto L_0x0044
            boolean r0 = r6.A08
            r16 = 1
            if (r0 != 0) goto L_0x0046
        L_0x0044:
            r16 = 0
        L_0x0046:
            int r3 = r6.A0M()
            int r2 = r6.A00
            boolean r0 = r6.A04
            int r10 = r4.A00(r3, r2, r0)
            int r3 = r6.A0M()
            int r8 = r6.A00
            boolean r2 = r6.A04
            r0 = 12
            if (r3 <= r0) goto L_0x012b
            r8 = 0
        L_0x005f:
            int r13 = r6.A03
            int r12 = r13 / r7
            int r0 = r12 * r7
            int r13 = r13 - r0
            boolean r0 = r6.A06
            if (r0 != 0) goto L_0x0128
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0076
            X.4oS r0 = r6.A0B
            boolean r0 = r0.A0D()
            if (r0 != 0) goto L_0x0080
        L_0x0076:
            int r0 = r6.A00
            if (r10 <= r0) goto L_0x0128
            if (r5 != 0) goto L_0x0128
            if (r14 != 0) goto L_0x0128
            if (r11 == r1) goto L_0x0128
        L_0x0080:
            r6.A03 = r1
            android.graphics.Rect r5 = X.AnonymousClass001.A06()
            if (r16 == 0) goto L_0x00a2
            boolean r3 = r6.A05
            boolean r2 = r6.A04
            int r12 = r6.A03
            r1 = r12
            int r0 = r6.A00
            r10 = r0
            if (r2 == r3) goto L_0x0098
            if (r3 == 0) goto L_0x0124
            int r10 = r0 / 2
        L_0x0098:
            int r0 = r0 - r10
            int r0 = r0 / 2
            r5.top = r0
            int r1 = r1 - r12
            int r0 = r1 / 2
            r5.left = r0
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            if (r4 >= r11) goto L_0x0133
            android.view.View r3 = r9.A02(r4)
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x011e
            int r0 = r3.getHeight()
            if (r0 != 0) goto L_0x011c
            int r15 = r6.A00
        L_0x00b5:
            int r0 = r4 % r7
            r14 = 0
            if (r0 != 0) goto L_0x00bb
            r14 = r13
        L_0x00bb:
            int r14 = r14 + r12
            if (r15 == 0) goto L_0x0112
            if (r16 != 0) goto L_0x00fd
            boolean r0 = r6.A06
            X.6Ag r1 = new X.6Ag
            r1.<init>(r14, r15)
            android.graphics.Rect r2 = X.AnonymousClass001.A06()
            if (r0 == 0) goto L_0x011a
            r0 = 1
            if (r4 != r0) goto L_0x011a
            r0 = 5
            if (r11 < r0) goto L_0x011a
            int r0 = r11 % 2
            if (r0 == 0) goto L_0x011a
            int r0 = r1.A00
            int r0 = r0 / 2
        L_0x00db:
            r2.top = r0
            X.6Ag r1 = new X.6Ag
            r1.<init>(r14, r15)
            int r14 = r1.A01
            int r15 = r1.A00
            X.6Ag r1 = new X.6Ag
            r1.<init>(r14, r15)
            r5.top = r0
            int r0 = r2.left
            r5.left = r0
            int r0 = r2.bottom
            r5.bottom = r0
            int r0 = r2.right
            r5.right = r0
            int r14 = r1.A01
            int r15 = r1.A00
        L_0x00fd:
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0a(r3)
            int r1 = r5.top
            r2.topMargin = r1
            int r0 = r5.left
            r2.leftMargin = r0
            int r15 = r15 + r1
            r2.height = r15
            int r14 = r14 + r0
            r2.width = r14
            r3.setLayoutParams(r2)
        L_0x0112:
            r1 = -1
            r0 = 0
            X.AnonymousClass0CP.A05(r3, r6, r1, r0)
            int r4 = r4 + 1
            goto L_0x00a3
        L_0x011a:
            r0 = 0
            goto L_0x00db
        L_0x011c:
            r15 = 0
            goto L_0x00b5
        L_0x011e:
            r15 = 0
            if (r4 >= r7) goto L_0x0122
            r15 = r8
        L_0x0122:
            int r15 = r15 + r10
            goto L_0x00b5
        L_0x0124:
            int r12 = r12 / 2
            goto L_0x0098
        L_0x0128:
            r1 = 0
            goto L_0x0080
        L_0x012b:
            int r0 = r4.A02(r3, r2)
            int r0 = r0 * r10
            int r8 = r8 - r0
            goto L_0x005f
        L_0x0133:
            int r0 = r6.A06
            if (r7 == r0) goto L_0x0144
            android.os.Handler r2 = r6.A09
            r1 = 14
            X.3wl r0 = new X.3wl
            r0.<init>((java.lang.Object) r6, (int) r7, (int) r1)
            r2.post(r0)
            return
        L_0x0144:
            r0 = r17
            super.A1D(r9, r0)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGridLayoutManager.A1D(X.0Bu, X.0C4):void");
    }

    public boolean A1O() {
        return !this.A06;
    }

    public void A1F(AnonymousClass0C4 r5) {
        super.A1F(r5);
        this.A01 = this.A00;
        this.A00 = this.A0A.A00(A0M(), this.A00, this.A04);
        C116945lS r0 = this.A02;
        if (r0 != null) {
            r0.A00.A0D();
        }
    }
}
