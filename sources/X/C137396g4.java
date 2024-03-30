package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.6g4  reason: invalid class name and case insensitive filesystem */
public final class C137396g4 implements C161917ng {
    public float A00 = 1.0f;
    public float A01;
    public float A02 = 1.0f;
    public float A03 = 1.0f;
    public float A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public C157657dt A09;
    public C161937ni A0A;
    public boolean A0B;

    public /* synthetic */ int Bor(float f) {
        return AnonymousClass6QY.A01(this, f);
    }

    public /* synthetic */ float Bvh(long j) {
        return AnonymousClass6GH.A00(this, j);
    }

    public /* synthetic */ float Bvp(long j) {
        return AnonymousClass6QY.A00(this, j);
    }

    public /* synthetic */ long Bvs(long j) {
        return AnonymousClass6QY.A02(this, j);
    }

    public float BAy() {
        return this.A0A.BAy();
    }

    public float BC0() {
        return this.A0A.BC0();
    }

    public void Bq9(long j) {
        long j2 = this.A06;
        long j3 = C133336Xx.A01;
        if (j2 != j) {
            this.A05 |= 64;
            this.A06 = j;
        }
    }

    public void BsE(C157657dt r2) {
        if (!AnonymousClass00C.A0J(this.A09, r2)) {
            this.A05 |= DefaultCrypto.BUFFER_SIZE;
            this.A09 = r2;
        }
    }

    public void BsJ(long j) {
        long j2 = this.A07;
        long j3 = C133336Xx.A01;
        if (j2 != j) {
            this.A05 |= 128;
            this.A07 = j;
        }
    }

    public /* synthetic */ float Bvi(float f) {
        return f / this.A0A.BAy();
    }

    public /* synthetic */ float Bvq(float f) {
        return f * this.A0A.BAy();
    }

    public /* synthetic */ long Bvt(float f) {
        return AnonymousClass6GH.A01(this, f / this.A0A.BAy());
    }

    public C137396g4() {
        long j = C112345dk.A00;
        this.A06 = j;
        this.A07 = j;
        this.A01 = 8.0f;
        this.A08 = C112365dm.A00;
        this.A09 = C112355dl.A00;
        long j2 = AnonymousClass6X0.A02;
        this.A0A = new C138226hV(1.0f, 1.0f);
    }
}
