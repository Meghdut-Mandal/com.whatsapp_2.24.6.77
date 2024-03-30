package X;

/* renamed from: X.6DE  reason: invalid class name */
public final class AnonymousClass6DE {
    public final C61243Bc A00;
    public final C61243Bc A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DE) {
                AnonymousClass6DE r5 = (AnonymousClass6DE) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A03 != r5.A03 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A00, (((C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A02)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public AnonymousClass6DE(C61243Bc r1, C61243Bc r2, Integer num, boolean z, boolean z2, boolean z3) {
        this.A01 = r1;
        this.A02 = num;
        this.A05 = z;
        this.A00 = r2;
        this.A03 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioChatCallingBannerViewState(title=");
        A0u.append(this.A01);
        A0u.append(", participantColorIndex=");
        A0u.append(this.A02);
        A0u.append(", shouldShowAudioWave=");
        A0u.append(this.A05);
        A0u.append(", subTitle=");
        A0u.append(this.A00);
        A0u.append(", isMuted=");
        A0u.append(this.A03);
        A0u.append(", shouldShowAnimatedWave=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
