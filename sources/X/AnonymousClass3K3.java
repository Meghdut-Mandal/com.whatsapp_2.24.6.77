package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.3K3  reason: invalid class name */
public final class AnonymousClass3K3 {
    public final C65073Qp A00;
    public final GroupJid A01;
    public final C006302t A02;
    public final C006302t A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3K3) {
                AnonymousClass3K3 r5 = (AnonymousClass3K3) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0A = C36391kE.A0A(this.A00);
        return C36351kA.A05(this.A03, C36351kA.A05(this.A02, (C36351kA.A05(this.A01, A0A) + C36341k9.A01(this.A05 ? 1 : 0)) * 31)) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public AnonymousClass3K3(C65073Qp r1, GroupJid groupJid, C006302t r3, C006302t r4, boolean z, boolean z2) {
        C36331k8.A1H(r3, r4);
        this.A00 = r1;
        this.A01 = groupJid;
        this.A05 = z;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParentViewItemUiState(chatInfo=");
        A0u.append(this.A00);
        A0u.append(", parentJid=");
        A0u.append(this.A01);
        A0u.append(", isSuspended=");
        A0u.append(this.A05);
        A0u.append(", onClick=");
        A0u.append(this.A02);
        A0u.append(", onLongClick=");
        A0u.append(this.A03);
        A0u.append(", isSelected=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
