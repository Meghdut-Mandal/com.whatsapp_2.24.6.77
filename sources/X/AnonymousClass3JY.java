package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.3JY  reason: invalid class name */
public final class AnonymousClass3JY {
    public final AnonymousClass3QK A00;
    public final GroupJid A01;
    public final Integer A02;
    public final boolean A03;

    public AnonymousClass3JY(AnonymousClass3QK r2, GroupJid groupJid, Integer num, boolean z) {
        AnonymousClass00C.A0D(groupJid, 2);
        this.A00 = r2;
        this.A01 = groupJid;
        this.A03 = z;
        this.A02 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JY) {
                AnonymousClass3JY r5 = (AnonymousClass3JY) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A01, C36391kE.A0A(this.A00)) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SubgroupDataModel(subgroup=");
        A0u.append(this.A00);
        A0u.append(", parentGroupJid=");
        A0u.append(this.A01);
        A0u.append(", isNew=");
        A0u.append(this.A03);
        A0u.append(", groupMembershipApprovalState=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
