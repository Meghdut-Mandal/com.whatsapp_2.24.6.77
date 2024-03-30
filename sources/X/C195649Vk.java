package X;

import java.util.List;

/* renamed from: X.9Vk  reason: invalid class name and case insensitive filesystem */
public final class C195649Vk {
    public final long A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195649Vk) {
                C195649Vk r8 = (C195649Vk) obj;
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

    public C195649Vk(List list, long j) {
        this.A00 = j;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContactReactionsListUpdate(total=");
        A0u.append(this.A00);
        A0u.append(", reactions=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
