package X;

/* renamed from: X.3QV  reason: invalid class name */
public final class AnonymousClass3QV {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public AnonymousClass3QV(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = -1;
        this.A0D = false;
        this.A07 = z;
        this.A04 = z2;
        this.A0E = z3;
        this.A06 = z4;
        this.A05 = z5;
        this.A08 = false;
        this.A0C = false;
        this.A0A = true;
        this.A09 = false;
        this.A0B = false;
        this.A02 = false;
        this.A03 = false;
        this.A01 = false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QV) {
                AnonymousClass3QV r5 = (AnonymousClass3QV) obj;
                if (!(this.A00 == r5.A00 && this.A0D == r5.A0D && this.A07 == r5.A07 && this.A04 == r5.A04 && this.A0E == r5.A0E && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A08 == r5.A08 && this.A0C == r5.A0C && this.A0A == r5.A0A && this.A09 == r5.A09 && this.A0B == r5.A0B && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((37893873 + this.A00) * 31) + C36341k9.A01(this.A0D ? 1 : 0)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A0E ? 1 : 0)) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A08 ? 1 : 0)) * 31) + C36341k9.A01(this.A0C ? 1 : 0)) * 31) + C36341k9.A01(this.A0A ? 1 : 0)) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + C36341k9.A01(this.A0B ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommunitySubgroupViewOptions(showParticipating=");
        A0u.append(true);
        A0u.append(", showNonParticipating=");
        A0u.append(true);
        A0u.append(", showAuxiliaryViews=");
        A0u.append(true);
        A0u.append(", subgroupLimit=");
        A0u.append(this.A00);
        A0u.append(", updateLastSeenOnInit=");
        A0u.append(this.A0D);
        A0u.append(", showDescription=");
        A0u.append(this.A07);
        A0u.append(", showActions=");
        A0u.append(this.A04);
        A0u.append(", useUpdatedDesign=");
        A0u.append(this.A0E);
        A0u.append(", showCagInGroupsSection=");
        A0u.append(this.A06);
        A0u.append(", showAddGroup=");
        A0u.append(this.A05);
        A0u.append(", showEditActions=");
        A0u.append(this.A08);
        A0u.append(", showViewGroups=");
        A0u.append(this.A0C);
        A0u.append(", showGroupsSection=");
        A0u.append(this.A0A);
        A0u.append(", showEmptyGroupsUpsellSection=");
        A0u.append(this.A09);
        A0u.append(", showInlineMembersSection=");
        A0u.append(this.A0B);
        A0u.append(", isShowMemberSuggestedGroups=");
        A0u.append(this.A02);
        A0u.append(", isShowUpcomingEvents=");
        A0u.append(this.A03);
        A0u.append(", isShowEventsBanner=");
        return C36321k7.A0H(A0u, this.A01);
    }

    public AnonymousClass3QV() {
        this(true, true, false, true, true);
    }
}
