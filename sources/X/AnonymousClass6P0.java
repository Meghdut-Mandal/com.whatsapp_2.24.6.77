package X;

/* renamed from: X.6P0  reason: invalid class name */
public class AnonymousClass6P0 {
    public boolean A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass6P0)) {
            return false;
        }
        return this.A01.equals(((AnonymousClass6P0) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public AnonymousClass6P0(String str) {
        this.A00 = true;
        this.A01 = str;
    }

    public String toString() {
        return this.A01;
    }

    public AnonymousClass6P0() {
        this.A00 = false;
        this.A01 = "SMBBloks";
    }
}
