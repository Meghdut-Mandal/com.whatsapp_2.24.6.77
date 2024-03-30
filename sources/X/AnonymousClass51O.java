package X;

/* renamed from: X.51O  reason: invalid class name */
public final class AnonymousClass51O extends AnonymousClass5EL {
    public final C144416s9 A00;
    public final boolean A01;
    public final int A02;
    public final C159367jF A03;
    public final AnonymousClass7gC A04;
    public final C160947lq A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass51O(X.C159367jF r12, X.AnonymousClass7gC r13, X.C160947lq r14, X.C144416s9 r15, int r16, boolean r17) {
        /*
            r11 = this;
            r9 = 0
            r2 = 0
            r7 = 56
            r1 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r16
            r10 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A02 = r8
            r11.A00 = r15
            r11.A03 = r12
            r11.A04 = r13
            r11.A05 = r14
            r0 = r17
            r11.A01 = r0
            r11.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51O.<init>(X.7jF, X.7gC, X.7lq, X.6s9, int, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass51O) {
                AnonymousClass51O r5 = (AnonymousClass51O) obj;
                if (this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A05, r5.A05) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A05, C36351kA.A05(this.A04, C36351kA.A05(this.A03, C36351kA.A05(this.A00, ((((this.A02 * 31) + 1237) * 31 * 31) + 1237) * 31)))) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TypeaheadBusinessProfileListItemData(wamLocationType=");
        A0u.append(this.A02);
        C90474aD.A1N(A0u, ", shouldShowDistance=");
        C90474aD.A1M(A0u, ", userLocation=");
        C90474aD.A1N(A0u, ", shouldShowProductImages=");
        A0u.append(", businessProfile=");
        A0u.append(this.A00);
        A0u.append(", onClickProfileListener=");
        A0u.append(this.A03);
        A0u.append(", businessProfileSyncListener=");
        A0u.append(this.A04);
        A0u.append(", rankingAnalyticsFieldProvider=");
        A0u.append(this.A05);
        A0u.append(", isRecentSearchBusiness=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
