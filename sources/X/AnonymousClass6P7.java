package X;

/* renamed from: X.6P7  reason: invalid class name */
public final class AnonymousClass6P7 {
    public static final AnonymousClass6P7 A02 = new AnonymousClass6P7(2, false);
    public static final AnonymousClass6P7 A03 = new AnonymousClass6P7(1, true);
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6P7) {
                AnonymousClass6P7 r5 = (AnonymousClass6P7) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public String toString() {
        if (equals(A02)) {
            return "TextMotion.Static";
        }
        if (equals(A03)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    public AnonymousClass6P7(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
