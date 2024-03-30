package X;

/* renamed from: X.3Iu  reason: invalid class name and case insensitive filesystem */
public final class C63113Iu {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63113Iu) {
                C63113Iu r5 = (C63113Iu) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    public C63113Iu(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PendingGroupsDialogUiState(dialogId=");
        A0u.append(this.A01);
        A0u.append(", availableCapacity=");
        A0u.append(this.A00);
        A0u.append(", pendingSuggestionsCount=");
        return C36321k7.A0G(A0u, this.A02);
    }
}
