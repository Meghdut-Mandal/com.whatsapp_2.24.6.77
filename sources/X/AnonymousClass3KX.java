package X;

import java.util.List;

/* renamed from: X.3KX  reason: invalid class name */
public final class AnonymousClass3KX {
    public final AnonymousClass3KF A00;
    public final C51692oE A01;
    public final C51902oZ A02;
    public final C48052gc A03;
    public final C48152gn A04;
    public final AnonymousClass3S7 A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KX) {
                AnonymousClass3KX r5 = (AnonymousClass3KX) obj;
                if (this.A0A != r5.A0A || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A08, r5.A08) || this.A02 != r5.A02 || this.A09 != r5.A09 || this.A0B != r5.A0B) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C51692oE r0 = this.A01;
        return ((C36351kA.A05(this.A02, (((((C36351kA.A05(r0, ((((((((C36341k9.A01(this.A0A ? 1 : 0) * 31) + AnonymousClass000.A0H(this.A05)) * 31) + AnonymousClass000.A0H(this.A07)) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + AnonymousClass000.A0H(this.A04)) * 31) + AnonymousClass000.A0H(this.A06)) * 31) + C36411kG.A09(this.A08)) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + C36341k9.A01(this.A0B ? 1 : 0);
    }

    public AnonymousClass3KX(AnonymousClass3KF r1, C51692oE r2, C51902oZ r3, C48052gc r4, C48152gn r5, AnonymousClass3S7 r6, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        this.A0A = z;
        this.A05 = r6;
        this.A07 = list;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A06 = list2;
        this.A08 = list3;
        this.A02 = r3;
        this.A09 = z2;
        this.A0B = z3;
    }

    public String toString() {
        int i;
        Integer num;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState: statusUpdates = ");
        AnonymousClass3S7 r1 = this.A05;
        int i2 = 0;
        if (r1 != null) {
            int size = r1.A05.size() + r1.A06.size();
            int i3 = 1;
            if (r1.A03.A00() == null) {
                i3 = 0;
            }
            i = size + i3;
        } else {
            i = 0;
        }
        A0u.append(i);
        A0u.append(", newsletters = ");
        List list = this.A07;
        if (list != null) {
            i2 = list.size();
        }
        A0u.append(i2);
        A0u.append(" recommended = ");
        C48152gn r0 = this.A04;
        if (r0 != null) {
            num = Integer.valueOf(r0.A00.size());
        } else {
            num = null;
        }
        A0u.append(num);
        return AnonymousClass000.A0q("  ", A0u);
    }
}
