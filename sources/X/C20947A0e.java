package X;

/* renamed from: X.A0e  reason: case insensitive filesystem */
public class C20947A0e implements B0Y {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (!this.A01) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C20947A0e) obj).A00);
    }

    public int hashCode() {
        if (!this.A01) {
            return super.hashCode();
        }
        return this.A00.hashCode();
    }

    public C20947A0e(int i, boolean z) {
        this.A00 = AnonymousClass000.A0r("anim://", AnonymousClass000.A0u(), i);
        this.A01 = z;
    }
}
