package X;

/* renamed from: X.6Dn  reason: invalid class name and case insensitive filesystem */
public final class C128766Dn {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final C200889iQ A05;
    public final AnonymousClass6E8 A06;
    public final String A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128766Dn) {
                C128766Dn r8 = (C128766Dn) obj;
                if (!(AnonymousClass00C.A0J(this.A07, r8.A07) && this.A02 == r8.A02 && this.A01 == r8.A01 && this.A00 == r8.A00 && this.A03 == r8.A03 && this.A04 == r8.A04 && AnonymousClass00C.A0J(this.A05, r8.A05) && AnonymousClass00C.A0J(this.A06, r8.A06) && this.A08 == r8.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A002 = C36321k7.A00(this.A02, C36421kH.A04(this.A07));
        return ((C36351kA.A05(this.A05, C36321k7.A00(this.A04, C36321k7.A00(this.A03, (C36321k7.A00(this.A01, A002) + this.A00) * 31))) + AnonymousClass000.A0H(this.A06)) * 31) + C36341k9.A01(this.A08 ? 1 : 0);
    }

    public C128766Dn(C200889iQ r1, AnonymousClass6E8 r2, String str, int i, long j, long j2, long j3, long j4, boolean z) {
        this.A07 = str;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        this.A03 = j3;
        this.A04 = j4;
        this.A05 = r1;
        this.A06 = r2;
        this.A08 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoCompletedInfo(videoId=");
        A0u.append(this.A07);
        A0u.append(", playbackStartLatencyMs=");
        A0u.append(this.A02);
        A0u.append(", playbackStallTimeMs=");
        A0u.append(this.A01);
        A0u.append(", playbackStallCount=");
        A0u.append(this.A00);
        A0u.append(", playbackTime=");
        A0u.append(this.A03);
        A0u.append(", videoDuration=");
        A0u.append(this.A04);
        A0u.append(", playbackError=");
        A0u.append(this.A05);
        A0u.append(", videoQueuedContext=");
        A0u.append(this.A06);
        A0u.append(", isNextVideoPrepared=");
        return C36321k7.A0H(A0u, this.A08);
    }
}
