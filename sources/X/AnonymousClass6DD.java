package X;

import java.util.List;

/* renamed from: X.6DD  reason: invalid class name */
public final class AnonymousClass6DD {
    public final int A00;
    public final C123255wC A01;
    public final C61243Bc A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DD) {
                AnonymousClass6DD r5 = (AnonymousClass6DD) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A05 != r5.A05 || this.A04 != r5.A04 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A03, C36391kE.A0A(this.A01)) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A02);
    }

    public AnonymousClass6DD(C123255wC r2, C61243Bc r3, List list, boolean z, boolean z2) {
        this.A01 = r2;
        this.A03 = list;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = r3;
        this.A00 = r2.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioChatBottomSheetViewState(title=");
        A0u.append(this.A01);
        A0u.append(", buttonViewStates=");
        A0u.append(this.A03);
        A0u.append(", shouldShowParticipantList=");
        A0u.append(this.A05);
        A0u.append(", shouldShowConfirmation=");
        A0u.append(this.A04);
        A0u.append(", countdownText=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
