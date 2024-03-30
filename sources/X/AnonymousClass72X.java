package X;

/* renamed from: X.72X  reason: invalid class name */
public final class AnonymousClass72X implements Comparable {
    public final float A00;

    public static final boolean A02(float f) {
        return AnonymousClass000.A1Q(Float.compare(f, Float.NaN));
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.A00, ((AnonymousClass72X) obj).A00);
    }

    public boolean equals(Object obj) {
        float f = this.A00;
        if (!(obj instanceof AnonymousClass72X) || Float.compare(f, ((AnonymousClass72X) obj).A00) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ AnonymousClass72X(float f) {
        this.A00 = f;
    }

    public static String A00(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(f);
        return AnonymousClass000.A0q(".dp", A0u);
    }

    public static boolean A01(float f) {
        return A02(f);
    }
}
