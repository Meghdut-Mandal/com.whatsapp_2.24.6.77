package X;

import java.io.Serializable;

/* renamed from: X.0fI  reason: invalid class name and case insensitive filesystem */
public final class C10830fI implements Serializable {
    public final Object first;
    public final Object second;
    public final Object third;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10830fI) {
                C10830fI r5 = (C10830fI) obj;
                if (!AnonymousClass00C.A0J(this.first, r5.first) || !AnonymousClass00C.A0J(this.second, r5.second) || !AnonymousClass00C.A0J(this.third, r5.third)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0H = ((AnonymousClass000.A0H(this.first) * 31) + AnonymousClass000.A0H(this.second)) * 31;
        Object obj = this.third;
        if (obj != null) {
            i = obj.hashCode();
        }
        return A0H + i;
    }

    public C10830fI(Object obj, Object obj2, Object obj3) {
        this.first = obj;
        this.second = obj2;
        this.third = obj3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('(');
        A0u.append(this.first);
        A0u.append(", ");
        A0u.append(this.second);
        A0u.append(", ");
        return AnonymousClass000.A0m(this.third, A0u);
    }
}
