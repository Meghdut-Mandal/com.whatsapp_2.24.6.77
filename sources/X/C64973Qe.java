package X;

/* renamed from: X.3Qe  reason: invalid class name and case insensitive filesystem */
public final class C64973Qe {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64973Qe) {
                C64973Qe r5 = (C64973Qe) obj;
                if (!(this.A07 == r5.A07 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A05 == r5.A05 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        if (!this.A04) {
            return 0;
        }
        if ((!this.A03 || this.A00 != 0) && (!this.A02 || this.A00 != 1)) {
            return 0;
        }
        return 1;
    }

    public int hashCode() {
        return (((((((((((((C36341k9.A01(this.A07 ? 1 : 0) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + this.A00) * 31) + this.A01) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A06 ? 1 : 0);
    }

    public C64973Qe(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A07 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A02 = z4;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = z5;
        this.A06 = z6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("State(toolTipVisible=");
        A0u.append(this.A07);
        A0u.append(", entryIsBlank=");
        A0u.append(this.A04);
        A0u.append(", canSendVoiceMessages=");
        A0u.append(this.A03);
        A0u.append(", canSendPushToVideoMessages=");
        A0u.append(this.A02);
        A0u.append(", recorderMode=");
        A0u.append(this.A00);
        A0u.append(", toolTipType=");
        A0u.append(this.A01);
        A0u.append(", isPushToVideoNuxEnabled=");
        A0u.append(this.A05);
        A0u.append(", isRecorderModeMenuVisible=");
        return C36321k7.A0H(A0u, this.A06);
    }

    public C64973Qe() {
        this(0, 0, false, true, false, false, false, false);
    }
}
