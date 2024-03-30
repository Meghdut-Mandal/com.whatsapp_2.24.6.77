package X;

import java.util.List;

/* renamed from: X.51g  reason: invalid class name and case insensitive filesystem */
public final class C1026751g extends C110225aK {
    public final int A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1026751g) {
                C1026751g r5 = (C1026751g) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A02);
    }

    public C1026751g(List list, List list2, int i) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failure(statusCode=");
        A0u.append(this.A00);
        A0u.append(", errorCode=");
        A0u.append(this.A01);
        A0u.append(", errorMessage=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
