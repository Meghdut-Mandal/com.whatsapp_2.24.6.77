package X;

/* renamed from: X.50r  reason: invalid class name and case insensitive filesystem */
public class C1025650r extends AnonymousClass66F {
    public final String A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1025650r r5 = (C1025650r) obj;
            if (!this.A00.equals(r5.A00) || r5.A01 != this.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1025650r(C159277j6 r1, String str, boolean z) {
        super(r1, z);
        this.A00 = str;
    }
}
