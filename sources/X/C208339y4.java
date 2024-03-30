package X;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.9y4  reason: invalid class name and case insensitive filesystem */
public class C208339y4 implements B5O, C22853Ax3, C17520rY {
    public boolean A00;
    public C196189Yb A01 = null;
    public final C165737u4 A02;
    public final Path A03 = C36441kJ.A0M();
    public final RectF A04 = C36441kJ.A0N();
    public final AnonymousClass9P7 A05 = new AnonymousClass9P7();
    public final C196189Yb A06;
    public final C196189Yb A07;
    public final C196189Yb A08;
    public final String A09;
    public final boolean A0A;

    public void BkC() {
        this.A00 = false;
        this.A02.invalidateSelf();
    }

    public void Bqe(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            B0T b0t = (B0T) list.get(i);
            if (b0t instanceof C208289xz) {
                C208289xz r2 = (C208289xz) b0t;
                if (r2.A03 == C023109s.A00) {
                    this.A05.A00.add(r2);
                    r2.A04.add(this);
                }
            }
            if (b0t instanceof C208279xy) {
                this.A01 = ((C208279xy) b0t).A01;
            }
        }
    }

    public void B0q(C199409fG r2, Object obj) {
        C196189Yb r0;
        if (obj == B4R.A04) {
            r0 = this.A08;
        } else if (obj == B4R.A03) {
            r0 = this.A07;
        } else if (obj == B4R.A0B) {
            r0 = this.A06;
        } else {
            return;
        }
        r0.A0A(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e9, code lost:
        if (r15 == 0.0f) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Path BFG() {
        /*
            r17 = this;
            r7 = r17
            boolean r0 = r7.A00
            android.graphics.Path r6 = r7.A03
            if (r0 != 0) goto L_0x00e0
            r6.reset()
            boolean r0 = r7.A0A
            r5 = 1
            if (r0 != 0) goto L_0x00de
            X.9Yb r0 = r7.A08
            android.graphics.PointF r0 = X.C196189Yb.A02(r0)
            float r2 = r0.x
            r16 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r16
            float r10 = r0.y
            float r10 = r10 / r16
            X.9Yb r0 = r7.A06
            r13 = 0
            if (r0 != 0) goto L_0x00e1
            r15 = 0
        L_0x0026:
            X.9Yb r0 = r7.A01
            if (r0 == 0) goto L_0x0036
            float r1 = X.C196189Yb.A01(r0)
            float r0 = java.lang.Math.min(r2, r10)
            float r15 = java.lang.Math.min(r1, r0)
        L_0x0036:
            float r1 = java.lang.Math.min(r2, r10)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            r15 = r1
        L_0x003f:
            X.9Yb r0 = r7.A07
            android.graphics.PointF r11 = X.C196189Yb.A02(r0)
            float r1 = r11.x
            float r1 = r1 + r2
            float r0 = r11.y
            float r0 = r0 - r10
            float r0 = r0 + r15
            r6.moveTo(r1, r0)
            float r1 = r11.x
            float r1 = r1 + r2
            float r0 = r11.y
            float r0 = r0 + r10
            float r0 = r0 - r15
            r6.lineTo(r1, r0)
            r9 = 0
            r8 = 1119092736(0x42b40000, float:90.0)
            int r14 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r14 <= 0) goto L_0x0074
            android.graphics.RectF r12 = r7.A04
            float r4 = r11.x
            float r4 = r4 + r2
            float r0 = r15 * r16
            float r3 = r4 - r0
            float r1 = r11.y
            float r1 = r1 + r10
            float r0 = r1 - r0
            r12.set(r3, r0, r4, r1)
            r6.arcTo(r12, r13, r8, r9)
        L_0x0074:
            float r1 = r11.x
            float r1 = r1 - r2
            float r1 = r1 + r15
            float r0 = r11.y
            float r0 = r0 + r10
            r6.lineTo(r1, r0)
            if (r14 <= 0) goto L_0x0093
            android.graphics.RectF r12 = r7.A04
            float r4 = r11.x
            float r4 = r4 - r2
            float r3 = r11.y
            float r3 = r3 + r10
            float r0 = r15 * r16
            float r1 = r3 - r0
            float r0 = r0 + r4
            r12.set(r4, r1, r0, r3)
            r6.arcTo(r12, r8, r8, r9)
        L_0x0093:
            float r1 = r11.x
            float r1 = r1 - r2
            float r0 = r11.y
            float r0 = r0 - r10
            float r0 = r0 + r15
            r6.lineTo(r1, r0)
            if (r14 <= 0) goto L_0x00b4
            android.graphics.RectF r12 = r7.A04
            float r4 = r11.x
            float r4 = r4 - r2
            float r3 = r11.y
            float r3 = r3 - r10
            float r0 = r15 * r16
            float r1 = r4 + r0
            float r0 = r0 + r3
            r12.set(r4, r3, r1, r0)
            r0 = 1127481344(0x43340000, float:180.0)
            r6.arcTo(r12, r0, r8, r9)
        L_0x00b4:
            float r1 = r11.x
            float r1 = r1 + r2
            float r1 = r1 - r15
            float r0 = r11.y
            float r0 = r0 - r10
            r6.lineTo(r1, r0)
            if (r14 <= 0) goto L_0x00d6
            android.graphics.RectF r4 = r7.A04
            float r3 = r11.x
            float r3 = r3 + r2
            float r15 = r15 * r16
            float r2 = r3 - r15
            float r1 = r11.y
            float r1 = r1 - r10
            float r0 = r1 + r15
            r4.set(r2, r1, r3, r0)
            r0 = 1132920832(0x43870000, float:270.0)
            r6.arcTo(r4, r0, r8, r9)
        L_0x00d6:
            r6.close()
            X.9P7 r0 = r7.A05
            r0.A00(r6)
        L_0x00de:
            r7.A00 = r5
        L_0x00e0:
            return r6
        L_0x00e1:
            X.812 r0 = (X.AnonymousClass812) r0
            float r15 = r0.A0B()
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0036
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208339y4.BFG():android.graphics.Path");
    }

    public C208339y4(C165737u4 r4, C208569yT r5, C208409yC r6) {
        this.A09 = r5.A03;
        this.A0A = r5.A04;
        this.A02 = r4;
        C196189Yb B4M = r5.A01.B4M();
        this.A07 = B4M;
        C196189Yb B4M2 = r5.A02.B4M();
        this.A08 = B4M2;
        AnonymousClass812 A002 = C1684680s.A00(r5.A00);
        this.A06 = A002;
        r6.A0C(B4M);
        r6.A0C(B4M2);
        r6.A0C(A002);
        B4M.A09(this);
        B4M2.A09(this);
        A002.A09(this);
    }

    public void Bof(C201629k0 r1, C201629k0 r2, List list, int i) {
        C200579hd.A01(this, r1, r2, list, i);
    }

    public String getName() {
        return this.A09;
    }
}
