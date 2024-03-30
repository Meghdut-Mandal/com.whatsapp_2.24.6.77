package X;

import java.util.List;

/* renamed from: X.6DV  reason: invalid class name */
public final class AnonymousClass6DV {
    public boolean A00;
    public final AnonymousClass6QG A01;
    public final AnonymousClass7g0 A02;
    public final String A03;
    public final List A04;
    public final int A05;
    public final Double A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DV) {
                AnonymousClass6DV r5 = (AnonymousClass6DV) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A06, r5.A06) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0A = C36391kE.A0A(this.A04);
        return C36401kF.A02(this.A02, (((((((C36351kA.A05(this.A01, A0A) + C36341k9.A09(this.A03)) * 31) + this.A05) * 31) + C36411kG.A09(this.A06)) * 31) + C36341k9.A01(this.A00 ? 1 : 0)) * 31);
    }

    public AnonymousClass6DV(AnonymousClass6QG r2, AnonymousClass7g0 r3, Double d, String str, List list, int i) {
        boolean A1Y = C90514aH.A1Y(r2);
        this.A04 = list;
        this.A01 = r2;
        this.A03 = str;
        this.A05 = i;
        this.A06 = d;
        this.A00 = A1Y;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessRankingRequest(rankerCandidates=");
        A0u.append(this.A04);
        A0u.append(", searchLocation=");
        A0u.append(this.A01);
        A0u.append(", csvmConfig=");
        A0u.append(this.A03);
        A0u.append(", endpoint=");
        A0u.append(this.A05);
        A0u.append(", proximityWeight=");
        A0u.append(this.A06);
        A0u.append(", isCancelled=");
        A0u.append(this.A00);
        A0u.append(", rankingCallback=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
