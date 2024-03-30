package X;

import android.util.Pair;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.9nP  reason: invalid class name and case insensitive filesystem */
public final class C203149nP {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass9XX A04;
    public AnonymousClass9XX A05;
    public AnonymousClass9XX A06;
    public Timeline A07;
    public Object A08;
    public boolean A09;
    public final C195889Wr A0A = new C195889Wr();
    public final C199579fY A0B = new C199579fY();

    public static AnonymousClass9NQ A01(AnonymousClass9NQ r14, C203149nP r15, AnonymousClass9WT r16) {
        long j;
        AnonymousClass9NQ r3 = r14;
        long j2 = r14.A03;
        long j3 = r14.A02;
        C203149nP r5 = r15;
        Timeline timeline = r15.A07;
        AnonymousClass9WT r6 = r16;
        int i = r6.A02;
        C195889Wr r4 = r15.A0A;
        timeline.A08(r4, i, false);
        boolean A052 = r5.A05(r6);
        r5.A07.A08(r4, i, false);
        if (r6.A00 != -1) {
            j = -9223372036854775807L;
        } else if (j3 == Long.MIN_VALUE) {
            j = r4.A01;
        } else {
            j = j3;
        }
        return new AnonymousClass9NQ(r6, j2, j3, r3.A00, j, true, A052);
    }

    public static AnonymousClass9NQ A02(C203149nP r12, int i, long j, long j2) {
        long j3;
        long j4;
        AnonymousClass9WT r0 = new AnonymousClass9WT(i, -1, j2, -1);
        Timeline timeline = r12.A07;
        int i2 = r0.A02;
        C195889Wr r4 = r12.A0A;
        timeline.A08(r4, i2, false);
        long j5 = j;
        int A002 = r4.A00(j);
        if (A002 == -1) {
            j3 = Long.MIN_VALUE;
        } else {
            j3 = r4.A03.A00[A002];
        }
        r12.A07.A08(r4, i2, false);
        boolean A052 = r12.A05(r0);
        if (j3 == Long.MIN_VALUE) {
            j4 = r4.A01;
        } else {
            j4 = j3;
        }
        return new AnonymousClass9NQ(r0, j5, j3, -9223372036854775807L, j4, true, A052);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    public X.AnonymousClass9WT A07(int r14, long r15) {
        /*
            r13 = this;
            r7 = r13
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            X.9Wr r6 = r13.A0A
            r0 = 1
            r8 = r14
            X.9Wr r0 = r1.A08(r6, r14, r0)
            java.lang.Object r3 = r0.A04
            int r5 = r6.A00
            java.lang.Object r1 = r13.A08
            r4 = -1
            if (r1 == 0) goto L_0x002f
            com.facebook.android.exoplayer2.Timeline r0 = r13.A07
            int r2 = r0.A04(r1)
            if (r2 == r4) goto L_0x002f
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            r0 = 0
            X.9Wr r0 = r1.A08(r6, r2, r0)
            int r0 = r0.A00
            if (r0 != r5) goto L_0x002f
            long r11 = r13.A03
        L_0x0029:
            r9 = r15
            X.9WT r0 = r7.A03(r8, r9, r11)
            return r0
        L_0x002f:
            X.9XX r1 = r13.A05
            if (r1 != 0) goto L_0x0047
            X.9XX r1 = r13.A04
        L_0x0035:
            if (r1 != 0) goto L_0x0047
            X.9XX r3 = r13.A05
            if (r3 != 0) goto L_0x0052
            X.9XX r3 = r13.A04
        L_0x003d:
            if (r3 != 0) goto L_0x0052
            long r11 = r13.A02
            r0 = 1
            long r0 = r0 + r11
            r13.A02 = r0
            goto L_0x0029
        L_0x0047:
            java.lang.Object r0 = r1.A09
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0071
            X.9NQ r0 = r1.A02
            goto L_0x0069
        L_0x0052:
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            java.lang.Object r0 = r3.A09
            int r2 = r1.A04(r0)
            if (r2 == r4) goto L_0x006e
            com.facebook.android.exoplayer2.Timeline r1 = r13.A07
            r0 = 0
            X.9Wr r0 = r1.A08(r6, r2, r0)
            int r0 = r0.A00
            if (r0 != r5) goto L_0x006e
            X.9NQ r0 = r3.A02
        L_0x0069:
            X.9WT r0 = r0.A04
            long r11 = r0.A03
            goto L_0x0029
        L_0x006e:
            X.9XX r3 = r3.A01
            goto L_0x003d
        L_0x0071:
            X.9XX r1 = r1.A01
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203149nP.A07(int, long):X.9WT");
    }

    public boolean A09(AnonymousClass9XX r4) {
        boolean z = false;
        C200319h9.A02(AnonymousClass000.A1V(r4));
        this.A04 = r4;
        while (r4.A01 != null) {
            r4 = r4.A01;
            if (r4 == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            r4.A01();
            this.A00--;
        }
        this.A04.A01 = null;
        return z;
    }

    public static AnonymousClass9NQ A00(AnonymousClass9XX r16, C203149nP r17, long j) {
        AnonymousClass9XX r7 = r16;
        AnonymousClass9NQ r3 = r7.A02;
        C203149nP r2 = r17;
        if (r3.A06) {
            Timeline timeline = r2.A07;
            int i = r3.A04.A02;
            C195889Wr r13 = r2.A0A;
            C199579fY r14 = r2.A0B;
            int A032 = timeline.A03(r13, r14, i, r2.A01, r2.A09);
            if (A032 != -1) {
                int i2 = r2.A07.A08(r13, A032, true).A00;
                Object obj = r13.A04;
                long j2 = r3.A04.A03;
                long j3 = 0;
                if (r2.A07.A09(r14, i2, 0).A00 == A032) {
                    Pair A072 = r2.A07.A07(r13, r14, i2, -9223372036854775807L, Math.max(0, (r7.A00 + r3.A01) - j));
                    if (A072 != null) {
                        A032 = C36381kD.A04(A072);
                        j3 = C36431kI.A09(A072.second);
                        AnonymousClass9XX r0 = r7.A01;
                        if (r0 == null || !r0.A09.equals(obj)) {
                            j2 = r2.A02;
                            r2.A02 = 1 + j2;
                        } else {
                            j2 = r7.A01.A02.A04.A03;
                        }
                    }
                }
                C203149nP r142 = r2;
                AnonymousClass9WT A033 = r142.A03(A032, j3, j2);
                Timeline timeline2 = r2.A07;
                int i3 = A033.A02;
                timeline2.A08(r13, i3, false);
                return A02(r142, i3, j3, A033.A03);
            }
        } else {
            AnonymousClass9WT r8 = r3.A04;
            Timeline timeline3 = r2.A07;
            int i4 = r8.A02;
            C195889Wr r1 = r2.A0A;
            timeline3.A08(r1, i4, false);
            if (r8.A00 == -1) {
                long j4 = r3.A02;
                if (j4 != Long.MIN_VALUE) {
                    long[] jArr = r1.A03.A00;
                    int length = jArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            return A02(r2, r8.A02, j4, r8.A03);
                        } else if (jArr[length] != Long.MIN_VALUE && jArr[length] <= j4) {
                            throw AnonymousClass001.A0A("hasUnplayedAds");
                        }
                    }
                }
            }
        }
        return null;
    }

    private AnonymousClass9WT A03(int i, long j, long j2) {
        Timeline timeline = this.A07;
        C195889Wr r1 = this.A0A;
        int i2 = i;
        timeline.A08(r1, i, false);
        long[] jArr = r1.A03.A00;
        int length = jArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return new AnonymousClass9WT(i2, -1, j2, -1);
            }
            if (jArr[length] != Long.MIN_VALUE && jArr[length] <= j) {
                throw AnonymousClass001.A0A("hasUnplayedAds");
            }
        }
    }

    public static boolean A04(C203149nP r11) {
        AnonymousClass9XX r1;
        AnonymousClass9XX r3 = r11.A05;
        if (r3 == null) {
            r3 = r11.A04;
        }
        if (r3 != null) {
            while (true) {
                int A032 = r11.A07.A03(r11.A0A, r11.A0B, r3.A02.A04.A02, r11.A01, r11.A09);
                while (true) {
                    r1 = r3.A01;
                    if (r1 != null && !r3.A02.A06) {
                        r3 = r1;
                    }
                }
                if (A032 == -1 || r1 == null || r1.A02.A04.A02 != A032) {
                    boolean A092 = r11.A09(r3);
                    AnonymousClass9NQ r12 = r3.A02;
                    r3.A02 = A01(r12, r11, r12.A04);
                } else {
                    r3 = r1;
                }
            }
            boolean A0922 = r11.A09(r3);
            AnonymousClass9NQ r122 = r3.A02;
            r3.A02 = A01(r122, r11, r122.A04);
            if (!A0922 || r11.A05 == null) {
                return true;
            }
            return false;
        }
        return true;
    }

    private boolean A05(AnonymousClass9WT r10) {
        Timeline timeline = this.A07;
        int i = r10.A02;
        C195889Wr r4 = this.A0A;
        int i2 = timeline.A08(r4, i, false).A00;
        Timeline timeline2 = this.A07;
        C199579fY r5 = this.A0B;
        if (timeline2.A09(r5, i2, 0).A09 || this.A07.A03(r4, r5, i, this.A01, this.A09) != -1) {
            return false;
        }
        return true;
    }

    public AnonymousClass9XX A06() {
        AnonymousClass9XX r1 = this.A05;
        if (r1 != null) {
            if (r1 == this.A06) {
                this.A06 = r1.A01;
            }
            r1.A01();
            AnonymousClass9XX r12 = this.A05.A01;
            this.A05 = r12;
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                this.A04 = null;
            }
            return r12;
        }
        AnonymousClass9XX r13 = this.A04;
        this.A05 = r13;
        this.A06 = r13;
        return r13;
    }

    public void A08(boolean z) {
        Object obj;
        AnonymousClass9XX r3 = this.A05;
        if (r3 == null) {
            r3 = this.A04;
        }
        if (r3 != null) {
            if (z) {
                obj = r3.A09;
            } else {
                obj = null;
            }
            this.A08 = obj;
            this.A03 = r3.A02.A04.A03;
            r3.A01();
            A09(r3);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }
}
