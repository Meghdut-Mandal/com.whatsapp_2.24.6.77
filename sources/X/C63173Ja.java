package X;

/* renamed from: X.3Ja  reason: invalid class name and case insensitive filesystem */
public final class C63173Ja {
    public final AnonymousClass147 A00;
    public final Integer A01;
    public final Integer A02;
    public final C006302t A03;

    public C63173Ja(AnonymousClass147 r2, Integer num, Integer num2, C006302t r5) {
        C36331k8.A1G(r2, 1, r5);
        this.A00 = r2;
        this.A02 = num;
        this.A01 = num2;
        this.A03 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63173Ja) {
                C63173Ja r5 = (C63173Ja) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A03, (((C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A01)) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PendingGroupsAndEventsUiState(parentJid=");
        A0u.append(this.A00);
        A0u.append(", upcomingEventsCount=");
        A0u.append(this.A02);
        A0u.append(", pendingGroupsCount=");
        A0u.append(this.A01);
        A0u.append(", onPendingGroupsClick=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
