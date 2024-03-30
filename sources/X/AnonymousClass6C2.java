package X;

import java.util.List;

/* renamed from: X.6C2  reason: invalid class name */
public final class AnonymousClass6C2 {
    public final String A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6C2) {
                AnonymousClass6C2 r5 = (AnonymousClass6C2) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A03 != r5.A03 || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C53202qw.A00((C36391kE.A0A(this.A01) + C36341k9.A09(this.A00)) * 31, this.A03) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass6C2(String str, List list, boolean z, boolean z2) {
        this.A01 = list;
        this.A00 = str;
        this.A03 = z;
        this.A02 = z2;
    }

    public static List A00(AnonymousClass005 r0) {
        return AnonymousClass1Z0.A00((AnonymousClass1Z0) r0.get()).A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountSwitchingData(inactiveAccounts=");
        A0u.append(this.A01);
        A0u.append(", paymentsOnboardedLid=");
        A0u.append(this.A00);
        A0u.append(", shownMeTabMenuItemToolTip=");
        A0u.append(this.A03);
        A0u.append(", isCompanionModeEnabled=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
