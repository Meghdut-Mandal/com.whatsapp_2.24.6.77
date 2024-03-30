package X;

import java.io.EOFException;

/* renamed from: X.9ze  reason: invalid class name and case insensitive filesystem */
public final class C209219ze implements B2B {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public int A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final AnonymousClass9XD A0A;
    public final AnonymousClass9Y0 A0B;

    public /* bridge */ /* synthetic */ B29 B4u() {
        if (this.A05 != 0) {
            return new C209129zV(this);
        }
        return null;
    }

    public long Bmo(C201519jm r19) {
        long j;
        long j2;
        long j3;
        int i = this.A06;
        C201519jm r11 = r19;
        if (i == 0) {
            long j4 = r11.A02;
            this.A07 = j4;
            this.A06 = 1;
            long j5 = this.A08 - 65307;
            if (j5 > j4) {
                return j5;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j6 = this.A02;
                long j7 = this.A00;
                if (j6 != j7) {
                    long j8 = r11.A02;
                    AnonymousClass9XD r6 = this.A0A;
                    if (!r6.A00(r11, j7)) {
                        j2 = this.A02;
                        if (j2 == j8) {
                            throw C90524aI.A0X("No ogg page can be found.");
                        }
                    } else {
                        r6.A01(r11, false);
                        r11.A01 = 0;
                        long j9 = this.A04;
                        long j10 = r6.A04;
                        long j11 = j9 - j10;
                        int i2 = r6.A01 + r6.A00;
                        if (0 > j11 || j11 >= 72000) {
                            int i3 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                            if (i3 < 0) {
                                this.A00 = j8;
                                this.A01 = j10;
                            } else {
                                this.A02 = r11.A02 + ((long) i2);
                                this.A03 = j10;
                            }
                            long j12 = this.A00;
                            j2 = this.A02;
                            long j13 = j12 - j2;
                            if (j13 < 100000) {
                                this.A00 = j2;
                            } else {
                                long j14 = (long) i2;
                                if (i3 <= 0) {
                                    j3 = 2;
                                } else {
                                    j3 = 1;
                                }
                                j2 = Math.max(j2, Math.min((r11.A02 - (j14 * j3)) + ((j11 * j13) / (this.A01 - this.A03)), j12 - 1));
                            }
                        }
                    }
                    if (j2 != -1) {
                        return j2;
                    }
                }
                this.A06 = 3;
            } else if (i != 3) {
                return -1;
            }
            while (true) {
                AnonymousClass9XD r5 = this.A0A;
                r5.A00(r11, -1);
                r5.A01(r11, false);
                if (r5.A04 > this.A04) {
                    r11.A01 = 0;
                    this.A06 = 4;
                    return -(this.A03 + 2);
                }
                r11.A02(r5.A01 + r5.A00);
                this.A02 = r11.A02;
                this.A03 = r5.A04;
            }
        }
        AnonymousClass9XD r8 = this.A0A;
        r8.A03 = 0;
        r8.A04 = 0;
        r8.A02 = 0;
        r8.A01 = 0;
        r8.A00 = 0;
        if (r8.A00(r11, -1)) {
            r8.A01(r11, false);
            r11.A02(r8.A01 + r8.A00);
            while (true) {
                j = r8.A04;
                if ((r8.A03 & 4) == 4 || !r8.A00(r11, -1) || r11.A02 >= this.A08 || !r8.A01(r11, true)) {
                    break;
                }
                try {
                    r11.A02(r8.A01 + r8.A00);
                } catch (EOFException unused) {
                }
            }
            this.A05 = j;
            this.A06 = 4;
            return this.A07;
        }
        throw C165617ti.A0T();
    }

    public void Buq(long j) {
        long j2 = this.A05;
        this.A04 = Math.max(0, Math.min(j, j2 - 1));
        this.A06 = 2;
        this.A02 = this.A09;
        this.A00 = this.A08;
        this.A03 = 0;
        this.A01 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r9 <= r7) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C209219ze(X.AnonymousClass9Y0 r6, long r7, long r9, long r11, long r13, boolean r15) {
        /*
            r5 = this;
            r5.<init>()
            r2 = 0
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x000f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            X.C200319h9.A01(r0)
            r5.A0B = r6
            r5.A09 = r7
            r5.A08 = r9
            long r9 = r9 - r7
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            if (r15 != 0) goto L_0x002a
            r5.A06 = r2
        L_0x0022:
            X.9XD r0 = new X.9XD
            r0.<init>()
            r5.A0A = r0
            return
        L_0x002a:
            r5.A05 = r13
            r0 = 4
            r5.A06 = r0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209219ze.<init>(X.9Y0, long, long, long, long, boolean):void");
    }
}
