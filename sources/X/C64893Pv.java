package X;

import java.util.List;

/* renamed from: X.3Pv  reason: invalid class name and case insensitive filesystem */
public final class C64893Pv {
    public final long A00;
    public final List A01;

    public C64893Pv(List list, long j) {
        AnonymousClass00C.A0D(list, 2);
        this.A00 = j;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64893Pv) {
                C64893Pv r8 = (C64893Pv) obj;
                if (this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, AnonymousClass000.A08(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ToSAcceptanceResponse(refreshRateMS=");
        A0u.append(this.A00);
        A0u.append(", userNotices=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public C64893Pv() {
        this(C023409w.A00, 864000000);
    }
}
