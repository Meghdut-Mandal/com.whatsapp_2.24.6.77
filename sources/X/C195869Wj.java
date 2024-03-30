package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.9Wj  reason: invalid class name and case insensitive filesystem */
public final class C195869Wj {
    public final int A00;
    public final int A01;
    public final GroupJid A02;
    public final String A03;

    public static C195869Wj A00(GroupJid groupJid, String str) {
        return new C195869Wj(groupJid, str, 1, 0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195869Wj) {
                C195869Wj r5 = (C195869Wj) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36391kE.A0A(this.A02) + C36341k9.A09(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public C195869Wj(GroupJid groupJid, String str, int i, int i2) {
        this.A02 = groupJid;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupNode(jid=");
        A0u.append(this.A02);
        A0u.append(", subject=");
        A0u.append(this.A03);
        A0u.append(", type=");
        A0u.append(this.A00);
        A0u.append(", version=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
