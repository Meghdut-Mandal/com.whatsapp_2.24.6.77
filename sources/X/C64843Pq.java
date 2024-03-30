package X;

import java.util.List;

/* renamed from: X.3Pq  reason: invalid class name and case insensitive filesystem */
public final class C64843Pq {
    public final int A00;
    public final List A01;

    public C64843Pq(int i, List list) {
        AnonymousClass00C.A0D(list, 2);
        this.A00 = i;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64843Pq) {
                C64843Pq r5 = (C64843Pq) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupCallPsaUiState(titleResId=");
        A0u.append(this.A00);
        A0u.append(", groupSuggestions=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public C64843Pq() {
        this(0, C023409w.A00);
    }
}
