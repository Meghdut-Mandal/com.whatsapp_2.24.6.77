package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ir  reason: invalid class name and case insensitive filesystem */
public class C63083Ir {
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C63083Ir r7 = (C63083Ir) obj;
            if (this.A00 != r7.A00 || !this.A02.equals(r7.A02) || !C1901797e.A00(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public C63083Ir(UserJid userJid, String str, long j) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = userJid;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = Long.valueOf(this.A00);
        A1Q[1] = this.A02;
        return AnonymousClass000.A0M(this.A01, A1Q, 2);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallLink[rowId=");
        A0u.append(this.A00);
        A0u.append(", token='");
        A0u.append(this.A02);
        A0u.append(", creatorJid=");
        A0u.append(this.A01);
        return AnonymousClass000.A0t(A0u, ']');
    }
}
