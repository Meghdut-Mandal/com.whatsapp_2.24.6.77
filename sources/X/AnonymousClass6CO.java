package X;

/* renamed from: X.6CO  reason: invalid class name */
public final class AnonymousClass6CO {
    public final int A00;
    public final AnonymousClass5SH A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CO) {
                AnonymousClass6CO r5 = (AnonymousClass6CO) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((C36391kE.A0A(this.A01) + 1237) * 31) + 1231) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + this.A00;
    }

    public AnonymousClass6CO(AnonymousClass5SH r1, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BuildHistorySyncParams(historySyncUsage=");
        A0u.append(this.A01);
        C90474aD.A1N(A0u, ", strictMode=");
        C90484aE.A1K(A0u, ", ignoreThumbnail=");
        A0u.append(", supportCagReactionsAndPolls=");
        A0u.append(this.A03);
        A0u.append(", shouldIncludeBotUserAgentChat=");
        A0u.append(this.A02);
        A0u.append(", maxCommentsToAdd=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
