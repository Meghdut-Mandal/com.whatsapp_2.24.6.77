package X;

/* renamed from: X.6De  reason: invalid class name and case insensitive filesystem */
public final class C128676De {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final long A06;
    public final long A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128676De) {
                C128676De r8 = (C128676De) obj;
                if (!AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A00, r8.A00) || this.A06 != r8.A06 || this.A07 != r8.A07 || this.A05 != r8.A05 || !AnonymousClass00C.A0J(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A08 = C36381kD.A08(this.A02, C36421kH.A04(this.A04));
        int A002 = C36321k7.A00(this.A06, (C36381kD.A08(this.A01, A08) + C36341k9.A09(this.A00)) * 31);
        return C90504aG.A0B(this.A03, (C36321k7.A00(this.A07, A002) + C36341k9.A01(this.A05 ? 1 : 0)) * 31);
    }

    public C128676De(String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
        C36321k7.A11(str, str2, str3);
        this.A04 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = z;
        this.A03 = str5;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AIBotEmbodimentVideoData(videoId=");
        A0u.append(this.A04);
        A0u.append(", sdProgressiveUrl=");
        A0u.append(this.A02);
        A0u.append(", hdProgressiveUrl=");
        A0u.append(this.A01);
        A0u.append(", dashManifest=");
        A0u.append(this.A00);
        A0u.append(", durationMs=");
        A0u.append(this.A06);
        A0u.append(", expiry=");
        A0u.append(this.A07);
        A0u.append(", fallback=");
        A0u.append(this.A05);
        A0u.append(", uniqueId=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
