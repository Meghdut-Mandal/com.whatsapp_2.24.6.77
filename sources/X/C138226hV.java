package X;

/* renamed from: X.6hV  reason: invalid class name and case insensitive filesystem */
public final class C138226hV implements C161937ni {
    public final float A00;
    public final float A01;

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

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C138226hV) {
                C138226hV r5 = (C138226hV) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
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
        return AnonymousClass6GH.A01(this, f / this.A00);
    }

    public int hashCode() {
        return C90514aH.A0C(C90514aH.A05(this.A00), this.A01);
    }

    public C138226hV(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public float BAy() {
        return this.A00;
    }

    public float BC0() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DensityImpl(density=");
        A0u.append(this.A00);
        A0u.append(", fontScale=");
        return C90464aC.A0g(A0u, this.A01);
    }
}
