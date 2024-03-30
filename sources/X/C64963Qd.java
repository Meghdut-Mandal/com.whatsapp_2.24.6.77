package X;

/* renamed from: X.3Qd  reason: invalid class name and case insensitive filesystem */
public final class C64963Qd {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass3I8 A03;
    public final C51842oT A04;
    public final AnonymousClass38r A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64963Qd) {
                C64963Qd r5 = (C64963Qd) obj;
                if (!(AnonymousClass00C.A0J(this.A03, r5.A03) && this.A07 == r5.A07 && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A04 == r5.A04 && AnonymousClass00C.A0J(this.A05, r5.A05) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C64963Qd A00(C51842oT r9, C64963Qd r10) {
        AnonymousClass3I8 r1 = r10.A03;
        boolean z = r10.A07;
        return new C64963Qd(r1, r9, r10.A05, r10.A02, r10.A01, r10.A00, z, r10.A06);
    }

    public final int A01() {
        int ordinal = this.A04.ordinal();
        if (ordinal == 0 || ordinal == 4) {
            return 1;
        }
        if (ordinal == 1 || ordinal == 2) {
            return 2;
        }
        if (ordinal == 3) {
            return this.A02;
        }
        throw C36441kJ.A18();
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A04, ((((((AnonymousClass000.A0H(this.A03) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + this.A02) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + C36411kG.A09(this.A05)) * 31) + this.A01) * 31) + this.A00;
    }

    public C64963Qd(AnonymousClass3I8 r1, C51842oT r2, AnonymousClass38r r3, int i, int i2, int i3, boolean z, boolean z2) {
        this.A03 = r1;
        this.A07 = z;
        this.A02 = i;
        this.A06 = z2;
        this.A04 = r2;
        this.A05 = r3;
        this.A01 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("State(mediaSource=");
        A0u.append(this.A03);
        A0u.append(", playWhenReady=");
        A0u.append(this.A07);
        A0u.append(", videoPlayerPlaybackState=");
        A0u.append(this.A02);
        A0u.append(", mute=");
        A0u.append(this.A06);
        A0u.append(", preparePhase=");
        A0u.append(this.A04);
        A0u.append(", videoPlayer=");
        A0u.append(this.A05);
        A0u.append(", seekPositionWhenCreated=");
        A0u.append(this.A01);
        A0u.append(", resizeMode=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public C64963Qd() {
        this((AnonymousClass3I8) null, C51842oT.UNINITIALIZED, (AnonymousClass38r) null, 1, 0, 4, false, true);
    }
}
