package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.9y3  reason: invalid class name and case insensitive filesystem */
public class C208329y3 implements B5O, C22853Ax3, C17520rY {
    public boolean A00;
    public final C165737u4 A01;
    public final Path A02 = C36441kJ.A0M();
    public final AnonymousClass9P7 A03 = new AnonymousClass9P7();
    public final C196189Yb A04;
    public final C196189Yb A05;
    public final C208489yK A06;
    public final String A07;

    public void BkC() {
        this.A00 = false;
        this.A01.invalidateSelf();
    }

    public void Bqe(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            B0T b0t = (B0T) list.get(i);
            if (b0t instanceof C208289xz) {
                C208289xz r2 = (C208289xz) b0t;
                if (r2.A03 == C023109s.A00) {
                    this.A03.A00.add(r2);
                    r2.A04.add(this);
                }
            }
        }
    }

    public void B0q(C199409fG r2, Object obj) {
        C196189Yb r0;
        if (obj == B4R.A02) {
            r0 = this.A05;
        } else if (obj == B4R.A03) {
            r0 = this.A04;
        } else {
            return;
        }
        r0.A0A(r2);
    }

    public Path BFG() {
        boolean z = this.A00;
        Path path = this.A02;
        if (!z) {
            path.reset();
            C208489yK r5 = this.A06;
            if (!r5.A03) {
                PointF A022 = C196189Yb.A02(this.A05);
                float f = A022.x / 2.0f;
                float f2 = A022.y / 2.0f;
                float f3 = f * 0.55228f;
                float f4 = 0.55228f * f2;
                path.reset();
                if (r5.A04) {
                    float f5 = -f2;
                    path.moveTo(0.0f, f5);
                    float f6 = 0.0f - f3;
                    float f7 = -f;
                    float f8 = 0.0f - f4;
                    path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
                    float f9 = f4 + 0.0f;
                    path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
                    float f10 = f3 + 0.0f;
                    path.cubicTo(f10, f2, f, f9, f, 0.0f);
                    path.cubicTo(f, f8, f10, f5, 0.0f, f5);
                } else {
                    float f11 = -f2;
                    path.moveTo(0.0f, f11);
                    float f12 = f3 + 0.0f;
                    float f13 = 0.0f - f4;
                    path.cubicTo(f12, f11, f, f13, f, 0.0f);
                    float f14 = f4 + 0.0f;
                    path.cubicTo(f, f14, f12, f2, 0.0f, f2);
                    float f15 = 0.0f - f3;
                    float f16 = -f;
                    path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
                    path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
                }
                PointF A023 = C196189Yb.A02(this.A04);
                path.offset(A023.x, A023.y);
                path.close();
                this.A03.A00(path);
            }
            this.A00 = true;
        }
        return path;
    }

    public C208329y3(C165737u4 r3, C208489yK r4, C208409yC r5) {
        this.A07 = r4.A02;
        this.A01 = r3;
        AnonymousClass813 r1 = new AnonymousClass813(r4.A00.A00);
        this.A05 = r1;
        C196189Yb B4M = r4.A01.B4M();
        this.A04 = B4M;
        this.A06 = r4;
        r5.A0C(r1);
        r5.A0C(B4M);
        r1.A09(this);
        B4M.A09(this);
    }

    public void Bof(C201629k0 r1, C201629k0 r2, List list, int i) {
        C200579hd.A01(this, r1, r2, list, i);
    }

    public String getName() {
        return this.A07;
    }
}
