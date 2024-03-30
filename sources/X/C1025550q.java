package X;

/* renamed from: X.50q  reason: invalid class name and case insensitive filesystem */
public class C1025550q extends AnonymousClass66F {
    public final AnonymousClass6BG A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1025550q r5 = (C1025550q) obj;
            if (!this.A00.equals(r5.A00) || r5.A01 != this.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1025550q(C159277j6 r1, AnonymousClass6BG r2, boolean z) {
        super(r1, z);
        this.A00 = r2;
    }
}
