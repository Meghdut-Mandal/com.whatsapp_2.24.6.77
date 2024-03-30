package X;

/* renamed from: X.5E1  reason: invalid class name */
public class AnonymousClass5E1 extends AnonymousClass5EQ {
    public final int A00;
    public final AnonymousClass7gD A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            AnonymousClass5E1 r5 = (AnonymousClass5E1) obj;
            if (!this.A02.equals(r5.A02) || this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass5E1(AnonymousClass7gD r2, String str, int i) {
        super(32);
        this.A02 = str;
        this.A00 = i;
        this.A01 = r2;
    }

    public int hashCode() {
        return this.A02.hashCode();
    }
}
