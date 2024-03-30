package X;

public final class AZM implements B6N {
    public int A00;
    public long A01;
    public C200069gY A02;
    public boolean A03;
    public final AU1 A04;
    public final C23125B6g A05;

    public long Bmp(AU1 au1, long j) {
        C200069gY r0;
        C200069gY r02;
        AnonymousClass00C.A0C(au1, 0);
        if (!this.A03) {
            C200069gY r1 = this.A02;
            if (r1 == null || (r1 == (r02 = this.A04.A01) && this.A00 == r02.A01)) {
                long j2 = j;
                this.A05.BoJ(this.A01 + j);
                if (this.A02 == null && (r0 = this.A04.A01) != null) {
                    this.A02 = r0;
                    this.A00 = r0.A01;
                }
                AU1 au12 = this.A04;
                long j3 = au12.A00;
                long j4 = this.A01;
                long min = Math.min(j2, j3 - j4);
                if (min <= 0) {
                    return -1;
                }
                long j5 = min;
                C1902797o.A00(j3, j4, min);
                if (min != 0) {
                    au1.A00 += min;
                    C200069gY r4 = au12.A01;
                    while (r4 != null) {
                        if (j4 >= ((long) (r4.A00 - r4.A01))) {
                            j4 -= (long) (r4.A00 - r4.A01);
                            r4 = r4.A02;
                        } else {
                            while (j5 > 0) {
                                if (r4 == null) {
                                    throw C165567td.A0T();
                                }
                                C200069gY A022 = r4.A02();
                                int i = A022.A01 + ((int) j4);
                                A022.A01 = i;
                                A022.A00 = Math.min(i + ((int) j5), A022.A00);
                                C200069gY r2 = au1.A01;
                                if (r2 == null) {
                                    A022.A03 = A022;
                                    A022.A02 = A022;
                                    au1.A01 = A022;
                                } else {
                                    C200069gY r22 = r2.A03;
                                    if (r22 == null) {
                                        throw C165567td.A0T();
                                    }
                                    r22.A03(A022);
                                }
                                j5 -= (long) (A022.A00 - A022.A01);
                                r4 = r4.A02;
                                j4 = 0;
                            }
                        }
                    }
                    throw C165567td.A0T();
                }
                this.A01 += min;
                return min;
            }
            throw AnonymousClass001.A09("Peek source is invalid because upstream source was used");
        }
        throw AnonymousClass001.A09("closed");
    }

    public void close() {
        this.A03 = true;
    }

    public AZM(C23125B6g b6g) {
        int i;
        this.A05 = b6g;
        AU1 au1 = ((AZL) b6g).A01;
        this.A04 = au1;
        C200069gY r0 = au1.A01;
        this.A02 = r0;
        if (r0 != null) {
            i = r0.A01;
        } else {
            i = -1;
        }
        this.A00 = i;
    }
}
