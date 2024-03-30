package X;

import java.util.Map;

/* renamed from: X.6A3  reason: invalid class name */
public final class AnonymousClass6A3 {
    public final long A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6A3) {
                AnonymousClass6A3 r8 = (AnonymousClass6A3) obj;
                if (this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C90464aC.A08(this.A00));
    }

    public AnonymousClass6A3(Map map, long j) {
        this.A00 = j;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CategoryCache(creationTime=");
        A0u.append(this.A00);
        A0u.append(", categories=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
