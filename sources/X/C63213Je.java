package X;

/* renamed from: X.3Je  reason: invalid class name and case insensitive filesystem */
public final class C63213Je {
    public final Long A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63213Je) {
                C63213Je r5 = (C63213Je) obj;
                if (this.A02 != r5.A02 || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((C36341k9.A01(this.A02 ? 1 : 0) * 31 * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A09(this.A01)) * 31) + C36411kG.A09(this.A00);
    }

    public C63213Je(Long l, String str, boolean z, boolean z2) {
        this.A02 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A00 = l;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SubtitleUiState(isGroupAdderAContact=");
        A0u.append(this.A02);
        A0u.append(", groupType=");
        A0u.append(0);
        A0u.append(", isGroupCreatorMe=");
        A0u.append(this.A03);
        A0u.append(", creatorName=");
        A0u.append(this.A01);
        A0u.append(", createdDateMillis=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
