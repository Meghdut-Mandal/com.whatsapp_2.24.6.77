package X;

/* renamed from: X.0uZ  reason: invalid class name and case insensitive filesystem */
public class C19210uZ {
    public final boolean A00;
    public final Class A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C19210uZ)) {
            return false;
        }
        C19210uZ r4 = (C19210uZ) obj;
        if (!r4.A01.equals(this.A01) || r4.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.A01.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.A00).hashCode();
    }

    public C19210uZ(Class cls, boolean z) {
        this.A01 = cls;
        this.A00 = z;
    }
}
