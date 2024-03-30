package X;

import java.util.HashSet;

/* renamed from: X.3QA  reason: invalid class name */
public final class AnonymousClass3QA {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final HashSet A03;

    public AnonymousClass3QA(HashSet hashSet) {
        this.A01 = false;
        this.A02 = false;
        this.A00 = null;
        this.A03 = hashSet;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QA) {
                AnonymousClass3QA r5 = (AnonymousClass3QA) obj;
                if (this.A01 != r5.A01 || this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A03, (C53202qw.A00(C36341k9.A01(this.A01 ? 1 : 0) * 31, this.A02) + C36341k9.A09(this.A00)) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CtwaUserJourneyLogger(hasAdContext=");
        A0u.append(this.A01);
        A0u.append(", icebreakersShown=");
        A0u.append(this.A02);
        A0u.append(", adId=");
        A0u.append(this.A00);
        A0u.append(", performedAction=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }

    public AnonymousClass3QA() {
        this(C36441kJ.A16());
    }
}
