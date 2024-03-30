package X;

import java.util.Map;

/* renamed from: X.6Bf  reason: invalid class name and case insensitive filesystem */
public final class C128176Bf {
    public final long A00;
    public final String A01;
    public final Map A02;

    public static C128176Bf A00(String str) {
        return new C128176Bf(str, (Map) null, -1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128176Bf) {
                C128176Bf r8 = (C128176Bf) obj;
                if (this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C90464aC.A08(this.A00) + C36341k9.A09(this.A01)) * 31) + C36411kG.A09(this.A02);
    }

    public C128176Bf(String str, Map map, long j) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FdsError(errorCode=");
        A0u.append(this.A00);
        A0u.append(", errorMessage=");
        A0u.append(this.A01);
        A0u.append(", params=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
