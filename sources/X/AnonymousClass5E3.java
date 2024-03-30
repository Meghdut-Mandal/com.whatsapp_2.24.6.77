package X;

/* renamed from: X.5E3  reason: invalid class name */
public class AnonymousClass5E3 extends AnonymousClass5EQ {
    public final C33541fX A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            AnonymousClass5E3 r5 = (AnonymousClass5E3) obj;
            if (!this.A01.equals(r5.A01) || !this.A02.equals(r5.A02) || this.A03 != r5.A03) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass5E3(C33541fX r2, String str, String str2, boolean z) {
        super(35);
        this.A02 = str;
        this.A00 = r2;
        this.A03 = z;
        this.A01 = str2;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
