package X;

import android.graphics.Path;

/* renamed from: X.9yp  reason: invalid class name and case insensitive filesystem */
public class C208779yp implements B37 {
    public float A00;
    public float A01;
    public Path A02 = C36441kJ.A0M();
    public final /* synthetic */ AnonymousClass9p5 A03;

    public void B1N(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        AnonymousClass9p5.A0T(this, this.A00, this.A01, f, f2, f3, f4, f5, z, z2);
        this.A00 = f4;
        this.A01 = f5;
    }

    public C208779yp(C208799yr r2, AnonymousClass9p5 r3) {
        this.A03 = r3;
        if (r2 != null) {
            r2.A03(this);
        }
    }

    public void B51(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A02.cubicTo(f, f2, f3, f4, f5, f6);
        this.A00 = f5;
        this.A01 = f6;
    }

    public void BOB(float f, float f2) {
        this.A02.lineTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    public void BPz(float f, float f2) {
        this.A02.moveTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    public void Bmc(float f, float f2, float f3, float f4) {
        this.A02.quadTo(f, f2, f3, f4);
        this.A00 = f3;
        this.A01 = f4;
    }

    public void close() {
        this.A02.close();
    }
}
