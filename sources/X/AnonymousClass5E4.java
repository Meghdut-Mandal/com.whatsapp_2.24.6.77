package X;

import java.util.List;

/* renamed from: X.5E4  reason: invalid class name */
public class AnonymousClass5E4 extends AnonymousClass5EQ {
    public final C119265pX A00;
    public final AnonymousClass141 A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public AnonymousClass5E4(C119265pX r2, AnonymousClass141 r3, String str, String str2, List list) {
        super(36);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = list;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            AnonymousClass5E4 r4 = (AnonymousClass5E4) obj;
            if (this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A04.equals(r4.A04)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        int A08 = C36381kD.A08(this.A02, super.hashCode() * 31);
        return C36401kF.A02(this.A01, (C36381kD.A08(this.A03, A08) + this.A04.hashCode()) * 31);
    }
}
