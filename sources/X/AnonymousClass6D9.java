package X;

/* renamed from: X.6D9  reason: invalid class name */
public final class AnonymousClass6D9 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final boolean A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D9) {
                AnonymousClass6D9 r8 = (AnonymousClass6D9) obj;
                if (!(AnonymousClass00C.A0J(this.A03, r8.A03) && this.A01 == r8.A01 && this.A00 == r8.A00 && this.A02 == r8.A02 && this.A04 == r8.A04 && AnonymousClass00C.A0J(this.A05, r8.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A002 = C36321k7.A00(this.A00, C36321k7.A00(this.A01, C36421kH.A04(this.A03)) * 31);
        return C36381kD.A08(this.A05, (C36321k7.A00(this.A02, A002) + C36341k9.A01(this.A04 ? 1 : 0)) * 31);
    }

    public AnonymousClass6D9(String str, String str2, long j, long j2, long j3, boolean z) {
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = j3;
        this.A04 = z;
        this.A05 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoDownloadedInfo(videoId=");
        A0u.append(this.A03);
        A0u.append(", fetchedTimeMs=");
        A0u.append(this.A01);
        C90514aH.A1S(A0u, ", retryCount=");
        A0u.append(", bytesDownloaded=");
        A0u.append(this.A00);
        A0u.append(", totalMediaBytes=");
        A0u.append(this.A02);
        A0u.append(", isPrefetch=");
        A0u.append(this.A04);
        A0u.append(", downloadError=");
        A0u.append(this.A05);
        A0u.append(", statusCode=");
        return C36321k7.A0G(A0u, 0);
    }
}
