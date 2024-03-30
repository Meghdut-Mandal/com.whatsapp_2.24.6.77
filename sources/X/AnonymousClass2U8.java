package X;

import java.util.List;

/* renamed from: X.2U8  reason: invalid class name */
public final class AnonymousClass2U8 extends C54372sq {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2U8) {
                AnonymousClass2U8 r5 = (AnonymousClass2U8) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public AnonymousClass2U8(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BucketsUpdateResult(buckets=");
        A0u.append(this.A01);
        A0u.append(", bucketsReported=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
