package X;

/* renamed from: X.9U6  reason: invalid class name */
public class AnonymousClass9U6 {
    public final int A00;
    public final int A01;
    public final C23072B3b A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9U6 r5 = (AnonymousClass9U6) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public AnonymousClass9U6(AnonymousClass9JK r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A02 = r2.A02;
    }
}
