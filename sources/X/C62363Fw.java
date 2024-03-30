package X;

/* renamed from: X.3Fw  reason: invalid class name and case insensitive filesystem */
public class C62363Fw {
    public String A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C62363Fw r5 = (C62363Fw) obj;
            if (!this.A00.equals(r5.A00) || !C1901797e.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C62363Fw(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A00;
        return AnonymousClass000.A0L(this.A01, A0M);
    }
}
