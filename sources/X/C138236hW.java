package X;

/* renamed from: X.6hW  reason: invalid class name and case insensitive filesystem */
public final class C138236hW implements C161937ni {
    public final float A00;
    public final C158897iQ A01;
    public final float A02;

    public /* synthetic */ int Bor(float f) {
        return AnonymousClass6QY.A01(this, f);
    }

    public /* synthetic */ float Bvp(long j) {
        return AnonymousClass6QY.A00(this, j);
    }

    public /* synthetic */ long Bvs(long j) {
        return AnonymousClass6QY.A02(this, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C138236hW) {
                C138236hW r5 = (C138236hW) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A02, r5.A02) == 0 && AnonymousClass00C.A0J(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ float Bvi(float f) {
        return f / this.A00;
    }

    public /* synthetic */ float Bvq(float f) {
        return f * this.A00;
    }

    public /* synthetic */ long Bvt(float f) {
        return AnonymousClass6U3.A01(this.A01.B3e(f / this.A00), 4294967296L);
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C90474aD.A02(C90514aH.A05(this.A00), this.A02));
    }

    public C138236hW(C158897iQ r1, float f, float f2) {
        this.A00 = f;
        this.A02 = f2;
        this.A01 = r1;
    }

    public float BAy() {
        return this.A00;
    }

    public float BC0() {
        return this.A02;
    }

    public float Bvh(long j) {
        if (AnonymousClass6WI.A01(j) == 4294967296L) {
            return this.A01.B3f(C90464aC.A00(j));
        }
        throw AnonymousClass001.A09("Only Sp can convert to Px");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DensityWithConverter(density=");
        A0u.append(this.A00);
        A0u.append(", fontScale=");
        A0u.append(this.A02);
        A0u.append(", converter=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
