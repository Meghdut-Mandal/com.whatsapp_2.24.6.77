package X;

import java.util.Map;

/* renamed from: X.9g6  reason: invalid class name and case insensitive filesystem */
public final class C199839g6 {
    public long A00;
    public long A01;
    public Map A02;
    public Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199839g6) {
                C199839g6 r8 = (C199839g6) obj;
                if (this.A01 != r8.A01 || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C199839g6(Map map, Map map2) {
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = map;
        this.A02 = map2;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A03, C36321k7.A00(this.A00, C90464aC.A08(this.A01))));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PollResultsCache(summaryVotersExpiresAtMs=");
        A0u.append(this.A01);
        A0u.append(", fullVotersExpiresAtMs=");
        A0u.append(this.A00);
        A0u.append(", optionsSummaryVoters=");
        A0u.append(this.A03);
        A0u.append(", optionsFullVoters=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }

    public C199839g6() {
        this(C36431kI.A1G(), C36431kI.A1G());
    }
}
