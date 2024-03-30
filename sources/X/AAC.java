package X;

public final class AAC implements C22934Ayk {
    public final int A00;
    public final C20810yC A01;
    public final C45832Sw A02;
    public final C30571aQ A03;
    public final AnonymousClass1DL A04;
    public final C177808eP A05;
    public final C23084B3s A06;
    public final boolean A07;

    public void BJg(byte[] bArr) {
        C177808eP r0 = this.A05;
        if (r0 != null) {
            r0.A02 = true;
        }
        if (bArr != null && bArr.length != 0) {
            C45832Sw r1 = this.A02;
            r1.A00 = true;
            r1.A0B = 12;
            C23084B3s b3s = this.A06;
            if (b3s instanceof C21337AHp) {
                C21337AHp aHp = (C21337AHp) b3s;
                C30571aQ.A00(this.A03, C183348qe.A01(this.A01, C21337AHp.A00(aHp), aHp, bArr, this.A00), aHp);
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("DecryptionCallbackFuture: ignoring ");
            C36321k7.A1a(A0u, C90484aE.A0k(b3s));
        } else if (this.A07) {
            this.A04.A0C(this.A06);
        }
    }

    public AAC(C20810yC r1, C45832Sw r2, C30571aQ r3, AnonymousClass1DL r4, C177808eP r5, C23084B3s b3s, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A07 = z;
        this.A04 = r4;
        this.A02 = r2;
        this.A06 = b3s;
        this.A03 = r3;
        this.A05 = r5;
    }
}
