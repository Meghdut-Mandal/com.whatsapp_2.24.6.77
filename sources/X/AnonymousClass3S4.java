package X;

import java.util.List;

/* renamed from: X.3S4  reason: invalid class name */
public final class AnonymousClass3S4 {
    public final AnonymousClass2bT A00;
    public final C51552o0 A01;
    public final List A02;
    public final List A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3S4) {
                AnonymousClass3S4 r5 = (AnonymousClass3S4) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A01 != r5.A01 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36351kA.A05(this.A02, C36351kA.A05(this.A03, AnonymousClass000.A0H(this.A00) * 31))) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public AnonymousClass3S4(AnonymousClass2bT r1, C51552o0 r2, List list, List list2, boolean z) {
        this.A00 = r1;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = r2;
        this.A04 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState(message=");
        A0u.append(this.A00);
        A0u.append(", responses=");
        A0u.append(this.A03);
        A0u.append(", eventInfoItems=");
        A0u.append(this.A02);
        A0u.append(", currentStep=");
        A0u.append(this.A01);
        A0u.append(", shouldAnimate=");
        return C36321k7.A0H(A0u, this.A04);
    }

    public AnonymousClass3S4() {
        this((AnonymousClass2bT) null, C51552o0.MAIN, AnonymousClass001.A0I(), AnonymousClass001.A0I(), true);
    }
}
