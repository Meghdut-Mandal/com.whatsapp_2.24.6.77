package X;

/* renamed from: X.6Pb  reason: invalid class name and case insensitive filesystem */
public final class C131446Pb {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final long A0N;
    public final long A0O;
    public final long A0P;
    public final Boolean A0Q;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131446Pb) {
                C131446Pb r8 = (C131446Pb) obj;
                if (!(this.A0F == r8.A0F && this.A0I == r8.A0I && this.A0E == r8.A0E && this.A0G == r8.A0G && this.A0H == r8.A0H && this.A0M == r8.A0M && this.A0P == r8.A0P && this.A0L == r8.A0L && this.A0N == r8.A0N && this.A0O == r8.A0O && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A03 == r8.A03 && this.A07 == r8.A07 && this.A06 == r8.A06 && this.A08 == r8.A08 && this.A00 == r8.A00 && this.A0J == r8.A0J && this.A0K == r8.A0K && this.A05 == r8.A05 && this.A04 == r8.A04 && this.A09 == r8.A09 && this.A0B == r8.A0B && this.A0A == r8.A0A && this.A0C == r8.A0C && this.A0D == r8.A0D && AnonymousClass00C.A0J(this.A0Q, r8.A0Q))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36321k7.A00(this.A0D, C36321k7.A00(this.A0C, C36321k7.A00(this.A0A, C36321k7.A00(this.A0B, C36321k7.A00(this.A09, C36321k7.A00(this.A04, C36321k7.A00(this.A05, C36321k7.A00(this.A0K, C36321k7.A00(this.A0J, C36321k7.A00(this.A00, C36321k7.A00(this.A08, C36321k7.A00(this.A06, C36321k7.A00(this.A07, C36321k7.A00(this.A03, C36321k7.A00(this.A02, C36321k7.A00(this.A01, C36321k7.A00(this.A0O, C36321k7.A00(this.A0N, C36321k7.A00(this.A0L, C36321k7.A00(this.A0P, C36321k7.A00(this.A0M, C36321k7.A00(this.A0H, C36321k7.A00(this.A0G, C36321k7.A00(this.A0E, C36321k7.A00(this.A0I, C90464aC.A08(this.A0F)))))))))))))))))))))))))) + AnonymousClass000.A0H(this.A0Q);
    }

    public C131446Pb(Boolean bool, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26) {
        this.A0F = j;
        this.A0I = j2;
        this.A0E = j3;
        this.A0G = j4;
        this.A0H = j5;
        this.A0M = j6;
        this.A0P = j7;
        this.A0L = j8;
        this.A0N = j9;
        this.A0O = j10;
        this.A01 = j11;
        this.A02 = j12;
        this.A03 = j13;
        this.A07 = j14;
        this.A06 = j15;
        this.A08 = j16;
        this.A00 = j17;
        this.A0J = j18;
        this.A0K = j19;
        this.A05 = j20;
        this.A04 = j21;
        this.A09 = j22;
        this.A0B = j23;
        this.A0A = j24;
        this.A0C = j25;
        this.A0D = j26;
        this.A0Q = bool;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaEngagementSentDailyStat(numPhotoSent=");
        A0u.append(this.A0F);
        A0u.append(", numPhotoVoSent=");
        A0u.append(this.A0I);
        A0u.append(", numPhotoHdSent=");
        A0u.append(this.A0E);
        A0u.append(", numPhotoSentLte=");
        A0u.append(this.A0G);
        A0u.append(", numPhotoSentWifi=");
        A0u.append(this.A0H);
        A0u.append(", numVideoSent=");
        A0u.append(this.A0M);
        A0u.append(", numVideoVoSent=");
        A0u.append(this.A0P);
        A0u.append(", numVideoHdSent=");
        A0u.append(this.A0L);
        A0u.append(", numVideoSentLte=");
        A0u.append(this.A0N);
        A0u.append(", numVideoSentWifi=");
        A0u.append(this.A0O);
        A0u.append(", numDocsSent=");
        A0u.append(this.A01);
        A0u.append(", numDocsSentLte=");
        A0u.append(this.A02);
        A0u.append(", numDocsSentWifi=");
        A0u.append(this.A03);
        A0u.append(", numLargeDocsSent=");
        A0u.append(this.A07);
        A0u.append(", numLargeDocsNonWifi=");
        A0u.append(this.A06);
        A0u.append(", numMediaSentAsDocs=");
        A0u.append(this.A08);
        A0u.append(", numAudioSent=");
        A0u.append(this.A00);
        A0u.append(", numSticker=");
        A0u.append(this.A0J);
        A0u.append(", numUrl=");
        A0u.append(this.A0K);
        A0u.append(", numGifSent=");
        A0u.append(this.A05);
        A0u.append(", numExternalShare=");
        A0u.append(this.A04);
        A0u.append(", numMediaSentChat=");
        A0u.append(this.A09);
        A0u.append(", numMediaSentGroup=");
        A0u.append(this.A0B);
        A0u.append(", numMediaSentCommunity=");
        A0u.append(this.A0A);
        A0u.append(", numMediaSentStatus=");
        A0u.append(this.A0C);
        A0u.append(", numMediaUploadFailed=");
        A0u.append(this.A0D);
        A0u.append(", hdMediaTooltipSeen=");
        return AnonymousClass000.A0m(this.A0Q, A0u);
    }

    public C131446Pb() {
        this((Boolean) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }
}
