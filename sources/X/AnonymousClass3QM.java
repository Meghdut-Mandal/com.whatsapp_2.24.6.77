package X;

import java.util.List;

/* renamed from: X.3QM  reason: invalid class name */
public final class AnonymousClass3QM {
    public final int A00;
    public final AnonymousClass3J2 A01;
    public final AnonymousClass141 A02;
    public final AnonymousClass3T1 A03;
    public final List A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QM) {
                AnonymousClass3QM r5 = (AnonymousClass3QM) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A00 != r5.A00 || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A04, ((AnonymousClass000.A0H(this.A02) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + this.A00) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass3QM(AnonymousClass3J2 r1, AnonymousClass141 r2, AnonymousClass3T1 r3, List list, int i, boolean z) {
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = list;
        this.A00 = i;
        this.A05 = z;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState(groupContact=");
        A0u.append(this.A02);
        A0u.append(", parentMessage=");
        A0u.append(this.A03);
        A0u.append(", bottomSheetListItems=");
        A0u.append(this.A04);
        A0u.append(", inputState=");
        A0u.append(this.A00);
        A0u.append(", sendVisibility=");
        A0u.append(this.A05);
        A0u.append(", errorState=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3QM() {
        /*
            r7 = this;
            r1 = 0
            java.util.List r4 = java.util.Collections.emptyList()
            X.AnonymousClass00C.A08(r4)
            r5 = 1
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QM.<init>():void");
    }
}
