package X;

/* renamed from: X.3QC  reason: invalid class name */
public final class AnonymousClass3QC {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QC) {
                AnonymousClass3QC r5 = (AnonymousClass3QC) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass000.A0H(this.A01) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A03);
    }

    public AnonymousClass3QC(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.A01 = bool;
        this.A00 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CreateGroupSuggestionPermissionRequestParams(isAnyoneCanEditGroupEnabled=");
        A0u.append(this.A01);
        A0u.append(", isAnyoneCanAddEnabled=");
        A0u.append(this.A00);
        A0u.append(", isAnyoneCanSendMessagesEnabled=");
        A0u.append(this.A02);
        A0u.append(", isRequireMembershipApproval=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }

    public AnonymousClass3QC() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null);
    }
}
