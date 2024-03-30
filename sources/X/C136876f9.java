package X;

/* renamed from: X.6f9  reason: invalid class name and case insensitive filesystem */
public final class C136876f9 implements C157557dj {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C136876f9) && AnonymousClass000.A1Q(Float.compare(this.A00, ((C136876f9) obj).A00)));
    }

    public float Bvr(C161937ni r2, long j) {
        return r2.Bvq(this.A00);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C136876f9(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CornerSize(size = ");
        A0u.append(this.A00);
        return AnonymousClass000.A0q(".dp)", A0u);
    }
}
