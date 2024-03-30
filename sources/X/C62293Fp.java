package X;

/* renamed from: X.3Fp  reason: invalid class name and case insensitive filesystem */
public class C62293Fp {
    public final C143526qh A00;
    public final AnonymousClass544 A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((C62293Fp) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public C62293Fp(C143526qh r1, AnonymousClass544 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
