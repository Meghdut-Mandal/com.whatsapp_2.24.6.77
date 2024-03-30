package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.android.exoplayer2.Timeline;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* renamed from: X.9zp  reason: invalid class name and case insensitive filesystem */
public final class C209329zp implements C161967nm, Handler.Callback, C22859AxB {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05 = -9223372036854775807L;
    public long A06;
    public AnonymousClass9GB A07;
    public C192869Iw A08;
    public C201399jS A09;
    public B5Q A0A;
    public C199399fF A0B;
    public B38 A0C;
    public Integer A0D = C023109s.A00;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public B5Q[] A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final long A0T;
    public final long A0U;
    public final Handler A0V;
    public final HandlerThread A0W;
    public final C20946A0d A0X;
    public final C202709mU A0Y;
    public final C194809Ri A0Z;
    public final B3Y A0a;
    public final C203149nP A0b;
    public final C195889Wr A0c;
    public final C199579fY A0d;
    public final AnonymousClass9GL A0e;
    public final C20944A0b A0f;
    public final C201079ik A0g;
    public final C20945A0c A0h;
    public final ArrayList A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final B5Q[] A0o;
    public final B26[] A0p;
    public final AnonymousClass9MF A0q;
    public final C22774Avk A0r;
    public final B40 A0s;

    private int A00(Timeline timeline, Timeline timeline2, int i) {
        Timeline timeline3 = timeline;
        int i2 = i;
        int A002 = timeline.A00();
        int i3 = -1;
        for (int i4 = 0; i4 < A002 && i3 == -1; i4++) {
            C195889Wr r5 = this.A0c;
            i2 = timeline3.A03(r5, this.A0d, i2, this.A03, this.A0O);
            if (i2 == -1) {
                break;
            }
            i3 = timeline2.A04(timeline.A08(r5, i2, true).A04);
        }
        return i3;
    }

    private void A06() {
        this.A0M = false;
        C20944A0b a0b = this.A0X.A02;
        if (!a0b.A02) {
            a0b.A00 = SystemClock.elapsedRealtime();
            a0b.A02 = true;
        }
        C20944A0b a0b2 = this.A0f;
        if (!a0b2.A02) {
            a0b2.A00 = SystemClock.elapsedRealtime();
            a0b2.A02 = true;
        }
        if (this.A0n) {
            C20945A0c a0c = this.A0h;
            synchronized (a0c) {
                if (!a0c.A01) {
                    a0c.A00 = SystemClock.elapsedRealtime();
                    a0c.A01 = true;
                }
            }
        }
        for (B5Q b5q : this.A0P) {
            C208949zD r1 = (C208949zD) b5q;
            C200319h9.A02(AnonymousClass000.A1O(r1.A01));
            r1.A01 = 2;
            r1.A0C();
        }
    }

    public static void A0F(C196149Xx r4) {
        synchronized (r4) {
        }
        try {
            r4.A08.BJd(r4.A01, r4.A04);
        } finally {
            r4.A03(true);
        }
    }

    private void A0I(boolean z) {
        AnonymousClass9WT r4 = this.A0b.A05.A02.A04;
        long A012 = A01(r4, this.A09.A0D, false, true);
        if (A012 != this.A09.A0D) {
            C201399jS r5 = this.A09;
            this.A09 = r5.A01(r4, A012, r5.A01);
            if (z) {
                this.A0Z.A00(5);
            }
        }
    }

    private void A0K(boolean z, boolean z2) {
        A0L(true, z, z);
        this.A0Z.A01 += this.A02 + (z2 ? 1 : 0);
        this.A02 = 0;
        this.A0a.Bhv();
        A0A(1);
    }

    private Pair A02(C192869Iw r15, boolean z) {
        int A002;
        Timeline timeline = this.A09.A03;
        Timeline timeline2 = r15.A02;
        if (!AnonymousClass000.A1Q(timeline.A01())) {
            if (AnonymousClass000.A1Q(timeline2.A01())) {
                timeline2 = timeline;
            }
            try {
                C199579fY r8 = this.A0d;
                C195889Wr r7 = this.A0c;
                Pair A072 = timeline2.A07(r7, r8, r15.A00, r15.A01, 0);
                Objects.requireNonNull(A072);
                if (timeline == timeline2) {
                    return A072;
                }
                int A042 = timeline.A04(timeline2.A08(r7, C36381kD.A04(A072), true).A04);
                if (A042 != -1) {
                    return Pair.create(Integer.valueOf(A042), A072.second);
                }
                if (z && (A002 = A00(timeline2, timeline, C36381kD.A04(A072))) != -1) {
                    return A03(timeline, timeline.A08(r7, A002, false).A00);
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new AnonymousClass92N(timeline, r15.A00, r15.A01);
            }
        }
        return null;
    }

    private Pair A03(Timeline timeline, int i) {
        Timeline timeline2 = timeline;
        Pair A072 = timeline2.A07(this.A0c, this.A0d, i, -9223372036854775807L, 0);
        Objects.requireNonNull(A072);
        return A072;
    }

    private void A04() {
        int i;
        C194809Ri r5 = this.A0Z;
        C201399jS r4 = this.A09;
        if (r4 != r5.A02 || r5.A01 > 0 || r5.A03) {
            Handler handler = this.A0V;
            int i2 = r5.A01;
            if (r5.A03) {
                i = r5.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, r4).sendToTarget();
            r5.A02 = this.A09;
            r5.A01 = 0;
            r5.A03 = false;
        }
    }

    private void A05() {
        C203149nP r0 = this.A0b;
        AnonymousClass9XX r4 = r0.A04;
        AnonymousClass9XX r1 = r0.A06;
        if (r4 != null && !r4.A07) {
            if (r1 == null || r1.A01 == r4) {
                B5Q[] b5qArr = this.A0P;
                int length = b5qArr.length;
                int i = 0;
                while (i < length) {
                    if (b5qArr[i].BK4()) {
                        i++;
                    } else {
                        return;
                    }
                }
                r4.A08.BPe();
            }
        }
    }

    private void A07() {
        this.A0X.A02.A00();
        this.A0f.A00();
        if (this.A0n) {
            this.A0h.A00();
        }
        for (B5Q b5q : this.A0P) {
            C208949zD r2 = (C208949zD) b5q;
            if (r2.A01 == 2) {
                r2.A01 = 1;
                r2.A0D();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r3 == Long.MIN_VALUE) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        if (r10 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fa, code lost:
        if (r10.A02 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fe, code lost:
        if (r10.A00 != r7) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0100, code lost:
        r0 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0104, code lost:
        if (r0 <= r2) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        if (r0 > r4) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
        A0E(r10.A03);
        r1 = r13.A01;
        r8.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        if (r1 >= r8.size()) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        r10 = (X.C21660AUc) r8.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A08() {
        /*
            r13 = this;
            X.9nP r0 = r13.A0b
            X.9XX r6 = r0.A05
            if (r6 == 0) goto L_0x004f
            X.B5S r0 = r6.A08
            long r9 = r0.Bmt()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            r13.A0B(r9)
            X.9jS r0 = r13.A09
            long r1 = r0.A0D
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            X.9jS r7 = r13.A09
            X.9WT r8 = r7.A04
            long r11 = r7.A01
            X.9jS r0 = r7.A01(r8, r9, r11)
            r13.A09 = r0
            X.9Ri r1 = r13.A0Z
            r0 = 5
            r1.A00(r0)
        L_0x0032:
            X.9jS r5 = r13.A09
            X.B5Q[] r0 = r13.A0P
            int r0 = r0.length
            if (r0 == 0) goto L_0x005c
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0050
            X.9NQ r0 = r6.A02
            long r3 = r0.A03
        L_0x0041:
            r5.A0C = r3
            X.9jS r3 = r13.A09
            long r1 = r3.A0D
            X.B5S r0 = r6.A08
            long r0 = r0.B92(r1)
            r3.A0B = r0
        L_0x004f:
            return
        L_0x0050:
            X.B5S r0 = r6.A08
            long r3 = r0.B93()
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
        L_0x005c:
            X.9NQ r0 = r6.A02
            long r3 = r0.A01
            goto L_0x0041
        L_0x0061:
            X.A0d r1 = r13.A0X
            X.B5Q r0 = r1.A00
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r0.BLh()
            if (r0 != 0) goto L_0x00cc
            X.B5Q r0 = r1.A00
            boolean r0 = r0.BMw()
            if (r0 != 0) goto L_0x007d
            X.B5Q r0 = r1.A00
            boolean r0 = r0.BK4()
            if (r0 != 0) goto L_0x00cc
        L_0x007d:
            X.C20946A0d.A00(r1)
            X.B2G r0 = r1.A01
            long r4 = r0.BG6()
        L_0x0086:
            r13.A06 = r4
            long r0 = r6.A00
            long r4 = r4 - r0
            X.9jS r0 = r13.A09
            long r2 = r0.A0D
            java.util.ArrayList r8 = r13.A0i
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0121
            X.9jS r7 = r13.A09
            X.9WT r9 = r7.A04
            int r1 = r9.A00
            r0 = -1
            if (r1 != r0) goto L_0x0121
            long r0 = r7.A02
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x00a9
            r0 = 1
            long r2 = r2 - r0
        L_0x00a9:
            int r7 = r9.A02
            int r11 = r13.A01
        L_0x00ad:
            if (r11 <= 0) goto L_0x00d3
            int r0 = r11 + -1
            java.lang.Object r1 = r8.get(r0)
            X.AUc r1 = (X.C21660AUc) r1
            if (r1 == 0) goto L_0x00d3
            int r0 = r1.A00
            if (r0 > r7) goto L_0x00c7
            int r0 = r1.A00
            if (r0 != r7) goto L_0x00d3
            long r0 = r1.A01
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d3
        L_0x00c7:
            int r11 = r11 + -1
            r13.A01 = r11
            goto L_0x00ad
        L_0x00cc:
            X.A0b r0 = r1.A02
            long r4 = r0.BG6()
            goto L_0x0086
        L_0x00d3:
            int r0 = r8.size()
            if (r11 >= r0) goto L_0x0121
            java.lang.Object r10 = r8.get(r11)
            X.AUc r10 = (X.C21660AUc) r10
            if (r10 == 0) goto L_0x0121
            java.lang.Object r0 = r10.A02
            if (r0 == 0) goto L_0x00f8
            int r0 = r10.A00
            if (r0 < r7) goto L_0x00f1
            if (r0 != r7) goto L_0x00f8
            long r0 = r10.A01
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x00f8
        L_0x00f1:
            int r11 = r11 + 1
            r13.A01 = r11
            goto L_0x00d3
        L_0x00f6:
            if (r10 == 0) goto L_0x0121
        L_0x00f8:
            java.lang.Object r0 = r10.A02
            if (r0 == 0) goto L_0x0121
            int r0 = r10.A00
            if (r0 != r7) goto L_0x0121
            long r0 = r10.A01
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0121
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0121
            X.9Xx r0 = r10.A03
            r13.A0E(r0)
            int r1 = r13.A01
            r8.remove(r1)
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x0121
            java.lang.Object r10 = r8.get(r1)
            X.AUc r10 = (X.C21660AUc) r10
            goto L_0x00f6
        L_0x0121:
            X.9jS r0 = r13.A09
            r0.A0D = r4
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209329zp.A08():void");
    }

    private void A09(byte b, boolean z) {
        AnonymousClass9XX r1 = this.A0b.A04;
        if (r1 != null && this.A0S) {
            r1.A08.Bwk(b, z);
        }
    }

    private void A0A(int i) {
        long j;
        C201399jS r1 = this.A09;
        int i2 = i;
        if (r1.A00 != i2) {
            Timeline timeline = r1.A03;
            Object obj = r1.A08;
            C201399jS r2 = new C201399jS(timeline, r1.A04, r1.A05, r1.A06, r1.A07, obj, i2, r1.A02, r1.A01, r1.A0A, r1.A09);
            C201399jS.A00(r1, r2);
            this.A09 = r2;
            if (i2 == 2) {
                j = System.currentTimeMillis();
            } else {
                j = -1;
            }
            this.A04 = j;
        }
    }

    private void A0B(long j) {
        long j2;
        AnonymousClass9XX r1 = this.A0b.A05;
        if (!AnonymousClass000.A1V(r1)) {
            j2 = (long) 0;
        } else {
            j2 = r1.A00;
        }
        long j3 = j + j2;
        this.A06 = j3;
        this.A0X.A02.A01(j3);
        for (B5Q b5q : this.A0P) {
            long j4 = this.A06;
            C208949zD r3 = (C208949zD) b5q;
            r3.A08 = false;
            r3.A02 = j4;
            r3.A0G(j4, false);
        }
    }

    private void A0C(AnonymousClass9GB r22, boolean z) {
        C194809Ri r5 = this.A0Z;
        boolean z2 = true;
        r5.A01++;
        AnonymousClass9GB r6 = r22;
        AnonymousClass9WT r14 = r6.A01;
        long j = r6.A00;
        boolean A1Q = AnonymousClass000.A1Q((j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1)));
        try {
            if (this.A0C == null || this.A02 > 0) {
                this.A07 = r6;
                this.A08 = null;
            } else {
                long j2 = j;
                C203149nP r8 = this.A0b;
                AnonymousClass9XX r3 = r8.A05;
                boolean z3 = z;
                if (!(z || r3 == null || j == 0)) {
                    j2 = r3.A08.B8K(this.A0B, j);
                }
                UUID uuid = AnonymousClass9B7.A04;
                if (Util.A05(j2) != Util.A05(this.A09.A0D)) {
                    j = A01(r14, j2, z3, C36371kC.A1W(r8.A05, r8.A06));
                    if (j == j) {
                        z2 = false;
                    }
                    A1Q |= z2;
                }
            }
        } finally {
            this.A09 = this.A09.A01(r14, j, j);
            if (A1Q) {
                r5.A00(2);
            }
        }
    }

    private void A0D(AnonymousClass9XX r10) {
        AnonymousClass9XX r6 = this.A0b.A05;
        if (r6 != null && r10 != r6) {
            B5Q[] b5qArr = this.A0o;
            int length = b5qArr.length;
            boolean[] zArr = new boolean[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                B5Q b5q = b5qArr[i2];
                zArr[i2] = AnonymousClass000.A1P(((C208949zD) b5q).A01);
                C199319f7[] r1 = r6.A05.A03;
                if (r1[i2] != null) {
                    i++;
                }
                if (zArr[i2]) {
                    if (r1[i2] != null) {
                        C208949zD r12 = (C208949zD) b5q;
                        if (r12.A08) {
                            if (r12.A06 != r10.A0B[i2]) {
                            }
                        }
                    }
                    A0G(b5q);
                }
            }
            this.A09 = this.A09.A02(r6.A03, r6.A05);
            A0M(zArr, i);
        }
    }

    private void A0E(C196149Xx r5) {
        Looper looper = r5.A03;
        C201079ik r1 = this.A0g;
        Handler handler = r1.A00;
        if (looper == handler.getLooper()) {
            A0F(r5);
            int i = this.A09.A00;
            if (i == 3 || i == 2) {
                handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        AnonymousClass9QI.A00(r1, r5, 15);
    }

    private void A0G(B5Q b5q) {
        C20946A0d a0d = this.A0X;
        if (b5q == a0d.A00) {
            a0d.A01 = null;
            a0d.A00 = null;
        }
        C208949zD r4 = (C208949zD) b5q;
        if (r4.A01 == 2) {
            r4.A01 = 1;
            r4.A0D();
        }
        boolean z = true;
        if (r4.A01 != 1) {
            z = false;
        }
        C200319h9.A02(z);
        r4.A0C.A00 = null;
        r4.A01 = 0;
        r4.A06 = null;
        r4.A0A = null;
        r4.A08 = false;
        r4.A0F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r16 != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0H(boolean r16) {
        /*
            r15 = this;
            X.9nP r4 = r15.A0b
            X.9XX r6 = r4.A04
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x00aa
            r2 = 0
        L_0x000a:
            r7 = 0
            r8 = -9223372036854775808
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            r15.A0J(r7)
        L_0x0014:
            return
        L_0x0015:
            long r12 = r15.A06
            long r0 = r6.A00
            long r12 = r12 - r0
            boolean r0 = r15.A0m
            if (r0 == 0) goto L_0x008b
            X.9XX r0 = r4.A05
            if (r6 == r0) goto L_0x008b
            if (r0 == 0) goto L_0x008b
            long r10 = r15.A0P()
        L_0x0028:
            X.B3Y r8 = r15.A0a
            X.A0d r0 = r15.A0X
            X.9fS r0 = r0.BFz()
            float r9 = r0.A01
            boolean r1 = r15.A0K
            r0 = 1
            if (r1 != 0) goto L_0x003a
            r14 = 0
            if (r16 == 0) goto L_0x003b
        L_0x003a:
            r14 = 1
        L_0x003b:
            boolean r4 = r8.Bt2(r9, r10, r12, r14)
            boolean r1 = r15.A0R
            if (r1 == 0) goto L_0x0076
            boolean r1 = r15.A0K
            if (r1 == 0) goto L_0x0076
            boolean r1 = r15.A0M
            if (r1 == 0) goto L_0x0076
            if (r4 != 0) goto L_0x0076
            X.9jS r1 = r15.A09
            int r5 = r1.A00
            r1 = 2
            if (r5 != r1) goto L_0x0076
            java.lang.Object[] r5 = X.C36441kJ.A1Q()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r8
            X.AnonymousClass000.A1M(r5, r7, r12)
            long r10 = r10 / r8
            X.AnonymousClass000.A1M(r5, r0, r10)
            long r2 = r2 / r8
            X.AnonymousClass000.A1M(r5, r1, r2)
            java.lang.String r1 = "PlaybackPositionMs: %d, bufferedDurationMs: %d, nextLoadPositionMs: %d"
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r1, r5)
            android.os.Handler r1 = r15.A0V
            r0 = 5
            X.C165577te.A0w(r1, r2, r0)
            r15.A0R = r7
        L_0x0076:
            r15.A0J(r4)
            if (r4 == 0) goto L_0x0014
            long r3 = r15.A06
            long r0 = r6.A00
            long r3 = r3 - r0
            X.B5S r2 = r6.A08
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.B3Y(r3, r0)
            return
        L_0x008b:
            X.B5S r0 = r6.A08
            long r10 = r0.B92(r12)
            boolean r0 = r15.A0J
            if (r0 == 0) goto L_0x0028
            X.9XX r8 = r4.A05
        L_0x0097:
            if (r8 == 0) goto L_0x0028
            if (r8 == r6) goto L_0x0028
            long r0 = r15.A06
            long r4 = r8.A00
            long r0 = r0 - r4
            X.B5S r4 = r8.A08
            long r0 = r4.B92(r0)
            long r10 = r10 + r0
            X.9XX r8 = r8.A01
            goto L_0x0097
        L_0x00aa:
            X.B5S r0 = r6.A08
            long r2 = r0.BEW()
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209329zp.A0H(boolean):void");
    }

    private void A0J(boolean z) {
        C201399jS r0 = this.A09;
        boolean z2 = z;
        if (r0.A0A != z2) {
            Timeline timeline = r0.A03;
            Object obj = r0.A08;
            AnonymousClass9WT r4 = r0.A04;
            long j = r0.A02;
            long j2 = r0.A01;
            C201399jS r2 = new C201399jS(timeline, r4, r0.A05, r0.A06, r0.A07, obj, r0.A00, j, j2, z2, r0.A09);
            C201399jS.A00(r0, r2);
            this.A09 = r2;
        }
    }

    private void A0L(boolean z, boolean z2, boolean z3) {
        Object obj;
        Timeline timeline;
        AnonymousClass9WT r8;
        long j;
        long j2;
        C206419tN r9;
        AnonymousClass9MF r10;
        B38 b38;
        int i;
        this.A0g.A00.removeMessages(2);
        this.A0M = false;
        this.A0X.A02.A00();
        this.A0f.A00();
        if (this.A0n) {
            this.A0h.A00();
        }
        this.A06 = 0;
        for (B5Q A0G2 : this.A0P) {
            try {
                A0G(A0G2);
            } catch (AnonymousClass82J | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.A0P = new B5Q[0];
        C203149nP r2 = this.A0b;
        r2.A08(!z2);
        A0J(false);
        if (z2) {
            this.A08 = null;
        }
        if (z3) {
            timeline = Timeline.A00;
            r2.A07 = timeline;
            ArrayList arrayList = this.A0i;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C21660AUc) it.next()).A03.A03(false);
            }
            arrayList.clear();
            this.A01 = 0;
            obj = null;
        } else {
            C201399jS r1 = this.A09;
            timeline = r1.A03;
            obj = r1.A08;
        }
        C201399jS r12 = this.A09;
        if (z2) {
            Timeline timeline2 = r12.A03;
            if (AnonymousClass000.A1Q(timeline2.A01())) {
                i = 0;
            } else {
                i = timeline2.A09(this.A0d, timeline2.A05(this.A0O), 0).A00;
            }
            r8 = new AnonymousClass9WT(i, -1, -1, -1);
            j2 = -9223372036854775807L;
            j = -9223372036854775807L;
        } else {
            r8 = r12.A04;
            j = r12.A0D;
            j2 = this.A09.A01;
        }
        C201399jS r4 = this.A09;
        int i2 = r4.A00;
        if (z3) {
            r9 = C206419tN.A03;
            r10 = this.A0q;
        } else {
            r9 = r4.A05;
            r10 = r4.A06;
        }
        this.A09 = new C201399jS(timeline, r8, r9, r10, C023109s.A00, obj, i2, j, j2, false, false);
        if (z && (b38 = this.A0C) != null) {
            b38.BnU(this);
            this.A0C = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r12.A09.A00 != 3) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r19 == false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0M(boolean[] r23, int r24) {
        /*
            r22 = this;
            r0 = r24
            X.B5Q[] r0 = new X.B5Q[r0]
            r12 = r22
            r12.A0P = r0
            X.9nP r11 = r12.A0b
            X.9XX r0 = r11.A05
            r21 = r0
            r10 = 0
            r2 = 0
        L_0x0010:
            X.B5Q[] r1 = r12.A0o
            int r0 = r1.length
            if (r10 >= r0) goto L_0x0100
            r0 = r21
            X.9MF r0 = r0.A05
            X.9f7[] r0 = r0.A03
            r0 = r0[r10]
            if (r0 == 0) goto L_0x00de
            boolean r5 = r23[r10]
            int r20 = r2 + 1
            X.9XX r13 = r11.A05
            r9 = r1[r10]
            X.B5Q[] r0 = r12.A0P
            r0[r2] = r9
            r8 = r9
            X.9zD r8 = (X.C208949zD) r8
            int r0 = r8.A01
            if (r0 != 0) goto L_0x00dc
            X.9XX r0 = r11.A06
            boolean r15 = X.C36361kB.A1a(r0, r13)
            X.9MF r2 = r13.A05
            X.9f7[] r1 = r2.A03
            r14 = r1[r10]
            X.B5T[] r1 = r2.A04
            r4 = r1[r10]
            r3 = 0
            if (r4 == 0) goto L_0x005b
            r1 = r4
            X.A0A r1 = (X.A0A) r1
            int[] r1 = r1.A03
            int r2 = r1.length
        L_0x004b:
            X.9uY[] r7 = new X.C207099uY[r2]
        L_0x004d:
            if (r3 >= r2) goto L_0x005d
            r1 = r4
            X.A0A r1 = (X.A0A) r1
            X.9uY[] r1 = r1.A04
            r1 = r1[r3]
            r7[r3] = r1
            int r3 = r3 + 1
            goto L_0x004d
        L_0x005b:
            r2 = 0
            goto L_0x004b
        L_0x005d:
            boolean r1 = r12.A0K
            if (r1 == 0) goto L_0x006a
            X.9jS r1 = r12.A09
            int r2 = r1.A00
            r1 = 3
            r19 = 1
            if (r2 == r1) goto L_0x006c
        L_0x006a:
            r19 = 0
        L_0x006c:
            if (r5 != 0) goto L_0x0071
            r6 = 1
            if (r19 != 0) goto L_0x0072
        L_0x0071:
            r6 = 0
        L_0x0072:
            X.B2j[] r1 = r13.A0B
            r16 = r1[r10]
            long r4 = r12.A06
            boolean r1 = r12.A0G
            if (r1 != 0) goto L_0x00ea
            long r2 = r0.A00
        L_0x007e:
            long r0 = r13.A00
            r13 = 1
            r8.A04 = r14
            r8.A01 = r13
            r8.A0H(r6, r15)
            boolean r14 = r8.A08
            r14 = r14 ^ 1
            X.C200319h9.A02(r14)
            r14 = r16
            r8.A06 = r14
            long r14 = r8.A02
            r17 = -9223372036854775808
            int r16 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r16 != 0) goto L_0x009d
            r8.A02 = r2
        L_0x009d:
            r8.A0A = r7
            r8.A03 = r0
            r8.A0E(r7, r0)
            r0 = 0
            r8.A08 = r0
            r8.A02 = r4
            r8.A0G(r4, r6)
            X.A0d r2 = r12.A0X
            boolean r0 = r9 instanceof X.AnonymousClass82G
            if (r0 == 0) goto L_0x00e2
            r1 = r9
            X.82G r1 = (X.AnonymousClass82G) r1
        L_0x00b5:
            if (r1 == 0) goto L_0x00cb
            X.B2G r0 = r2.A01
            if (r1 == r0) goto L_0x00cb
            if (r0 != 0) goto L_0x00f2
            r2.A01 = r1
            r2.A00 = r9
            X.A0b r0 = r2.A02
            X.9fS r0 = r0.A01
            r1.Brd(r0)
            X.C20946A0d.A00(r2)
        L_0x00cb:
            if (r19 == 0) goto L_0x00dc
            int r1 = r8.A01
            r0 = 1
            if (r1 == r13) goto L_0x00d3
            r0 = 0
        L_0x00d3:
            X.C200319h9.A02(r0)
            r0 = 2
            r8.A01 = r0
            r8.A0C()
        L_0x00dc:
            r2 = r20
        L_0x00de:
            int r10 = r10 + 1
            goto L_0x0010
        L_0x00e2:
            boolean r0 = r9 instanceof X.C1689082m
            if (r0 == 0) goto L_0x00cb
            r1 = r9
            X.82m r1 = (X.C1689082m) r1
            goto L_0x00b5
        L_0x00ea:
            X.9NQ r1 = r0.A02
            long r2 = r1.A03
            long r0 = r0.A00
            long r2 = r2 + r0
            goto L_0x007e
        L_0x00f2:
            java.lang.String r0 = "Multiple renderer media clocks enabled."
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r0)
            r1 = 2
            r0 = 1000(0x3e8, float:1.401E-42)
            X.82J r0 = X.AnonymousClass82J.A00(r2, r1, r0)
            throw r0
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209329zp.A0M(boolean[], int):void");
    }

    private boolean A0N() {
        AnonymousClass9XX r5 = this.A0b.A05;
        long j = r5.A02.A01;
        if (j == -9223372036854775807L || this.A09.A0D < j) {
            return true;
        }
        AnonymousClass9XX r1 = r5.A01;
        if (r1 == null) {
            return false;
        }
        if (r1.A07 || r1.A02.A04.A00 != -1) {
            return true;
        }
        return false;
    }

    private boolean A0O(C21660AUc aUc) {
        Object obj = aUc.A02;
        if (obj == null) {
            C196149Xx r0 = aUc.A03;
            Timeline timeline = r0.A09;
            int i = r0.A00;
            long j = r0.A02;
            UUID uuid = AnonymousClass9B7.A04;
            Pair A022 = A02(new C192869Iw(timeline, i, Util.A04(j)), false);
            if (A022 != null) {
                int A042 = C36381kD.A04(A022);
                long A092 = C36431kI.A09(A022.second);
                Object obj2 = this.A09.A03.A08(this.A0c, A042, true).A04;
                aUc.A00 = A042;
                aUc.A01 = A092;
                aUc.A02 = obj2;
                return true;
            }
        } else {
            int A043 = this.A09.A03.A04(obj);
            if (A043 != -1) {
                aUc.A00 = A043;
                return true;
            }
        }
        return false;
    }

    public long A0P() {
        long j;
        AnonymousClass9XX r5 = this.A0b.A04;
        if (r5 != null) {
            B2j[] b2jArr = r5.A0B;
            long j2 = Long.MAX_VALUE;
            for (int i = 0; i < b2jArr.length; i++) {
                if (b2jArr[i] instanceof A00) {
                    A00 a00 = (A00) b2jArr[i];
                    C199089eg r2 = a00.A01.A0H[a00.A00].A09;
                    synchronized (r2) {
                        if (r2.A02 == 0) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = r2.A0E[r2.A04];
                        }
                    }
                    j2 = Math.min(j2, j);
                }
            }
            if (!(j2 == Long.MAX_VALUE || j2 == -9223372036854775807L)) {
                return r5.A08.B92(j2);
            }
        }
        return 0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    public void A0Q(X.C199519fS r4) {
        /*
            r3 = this;
            android.os.Handler r1 = r3.A0V
            r0 = 1
            X.C165577te.A0w(r1, r4, r0)
            X.9nP r0 = r3.A0b
            X.9XX r2 = r0.A05
            if (r2 != 0) goto L_0x0011
            X.9XX r2 = r0.A04
        L_0x000e:
            if (r2 != 0) goto L_0x0011
            return
        L_0x0011:
            X.9MF r0 = r2.A05
            if (r0 == 0) goto L_0x001e
            X.B5T[] r0 = r0.A04
            int r1 = r0.length
            r0 = 0
        L_0x0019:
            if (r0 >= r1) goto L_0x001e
            int r0 = r0 + 1
            goto L_0x0019
        L_0x001e:
            X.9XX r2 = r2.A01
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209329zp.A0Q(X.9fS):void");
    }

    public /* bridge */ /* synthetic */ void BUd(B3I b3i) {
        AnonymousClass9QI.A00(this.A0g, b3i, 10);
    }

    public void BdO(B5S b5s) {
        AnonymousClass9QI.A00(this.A0g, b5s, 9);
    }

    public void Bgs(Timeline timeline, B38 b38, Object obj) {
        AnonymousClass9QI.A00(this.A0g, new C192859Iv(timeline, b38, obj), 8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x039c, code lost:
        if (r8.equals(r9) == false) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03bf, code lost:
        if (r8.A00 != -1) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0519, code lost:
        if (r0.A0K != false) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0539, code lost:
        if (r1.A08 == r2) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x053b, code lost:
        A0H(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x055f, code lost:
        if (X.C203149nP.A04(r1) == false) goto L_0x0561;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05ae, code lost:
        r6.A03(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x06c5, code lost:
        if (r5.A00 < 100) goto L_0x06c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0808, code lost:
        if (r6.A01 == null) goto L_0x080a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0916, code lost:
        if (com.facebook.android.exoplayer2.util.Util.A05(r7) > 1000) goto L_0x0918;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0929, code lost:
        if (r9.BLh() == false) goto L_0x092b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0935, code lost:
        if (r9.BLh() == false) goto L_0x0937;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a26, code lost:
        if (A0N() != false) goto L_0x0a28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0a32, code lost:
        if (((X.C208949zD) r1).A0B == 1) goto L_0x0a34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0afe, code lost:
        if ((r12 - r5) >= ((long) r8)) goto L_0x0b00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b37, code lost:
        if (r25 == false) goto L_0x0b39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0b47, code lost:
        if (((X.C208949zD) r1).A0B == 1) goto L_0x0b49;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0426 A[Catch:{ all -> 0x01d0, all -> 0x00c5, 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0446 A[Catch:{ all -> 0x01d0, all -> 0x00c5, 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0767 A[Catch:{ all -> 0x01d0, all -> 0x00c5, 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x076e A[Catch:{ all -> 0x01d0, all -> 0x00c5, 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x07c4 A[Catch:{ all -> 0x01d0, all -> 0x00c5, 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x09b4 A[Catch:{ all -> 0x01d0, all -> 0x00c5, 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:577:0x0c26 A[Catch:{ all -> 0x01d0, all -> 0x00c5, 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0150 A[Catch:{ all -> 0x01d0, all -> 0x00c5, 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b3 A[Catch:{ all -> 0x01d0, all -> 0x00c5, 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ca A[Catch:{ all -> 0x01d0, all -> 0x00c5, 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:82:0x01b8=Splitter:B:82:0x01b8, B:53:0x0148=Splitter:B:53:0x0148, B:36:0x00ba=Splitter:B:36:0x00ba, B:281:0x072e=Splitter:B:281:0x072e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r39) {
        /*
            r38 = this;
            java.lang.String r18 = "ExoPlayerImplInternal"
            r4 = 1
            r3 = 0
            r0 = r38
            r2 = r39
            int r1 = r2.what     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            switch(r1) {
                case 0: goto L_0x0027;
                case 1: goto L_0x005a;
                case 2: goto L_0x0659;
                case 3: goto L_0x00d0;
                case 4: goto L_0x000e;
                case 5: goto L_0x01e8;
                case 6: goto L_0x01f0;
                case 7: goto L_0x0c49;
                case 8: goto L_0x01fb;
                case 9: goto L_0x0499;
                case 10: goto L_0x052d;
                case 11: goto L_0x0c64;
                case 12: goto L_0x0540;
                case 13: goto L_0x054f;
                case 14: goto L_0x0566;
                case 15: goto L_0x0597;
                case 16: goto L_0x0d58;
                case 17: goto L_0x05da;
                case 18: goto L_0x05e3;
                default: goto L_0x000d;
            }     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x000d:
            return r3
        L_0x000e:
            java.lang.Object r2 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9fS r2 = (X.C199519fS) r2     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.A0d r1 = r0.A0X     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.Brd(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.A0c r1 = r0.A0h     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x001e
            r1.Brd(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x001e:
            X.A0b r1 = r0.A0f     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0d58
            r1.Brd(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x0027:
            java.lang.Object r6 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B38 r6 = (X.B38) r6     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r2.arg1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r5 = X.AnonymousClass000.A1P(r1)
            int r1 = r2.arg2     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r2 = X.AnonymousClass000.A1P(r1)
            int r1 = r0.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1 + 1
            r0.A02 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0L(r4, r5, r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B3Y r1 = r0.A0a     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.BdN()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0C = r6     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 2
            r0.A0A(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9mU r1 = r0.A0Y     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r6.BmC(r1, r0, r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9ik r1 = r0.A0g     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.os.Handler r2 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x005a:
            int r1 = r2.arg1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r8 = X.AnonymousClass000.A1P(r1)
            r7 = 3
            r0.A0M = r3     // Catch:{ all -> 0x00c5 }
            r0.A0K = r8     // Catch:{ all -> 0x00c5 }
            X.9nP r5 = r0.A0b     // Catch:{ all -> 0x00c5 }
            X.9XX r1 = r5.A04     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x0070
            X.B5S r1 = r1.A08     // Catch:{ all -> 0x00c5 }
            r1.Brc(r8)     // Catch:{ all -> 0x00c5 }
        L_0x0070:
            if (r8 != 0) goto L_0x0091
            r0.A07()     // Catch:{ all -> 0x00c5 }
            r0.A08()     // Catch:{ all -> 0x00c5 }
            boolean r2 = r0.A0l     // Catch:{ all -> 0x00c5 }
            r1 = 2
            r0.A09(r1, r2)     // Catch:{ all -> 0x00c5 }
            boolean r1 = r0.A0F     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x00ba
            X.9XX r5 = r5.A04     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x00ba
            X.B5S r9 = r5.A08     // Catch:{ all -> 0x00c5 }
            long r1 = r0.A06     // Catch:{ all -> 0x00c5 }
            long r5 = r5.A00     // Catch:{ all -> 0x00c5 }
            long r1 = r1 - r5
            r9.B2Y(r1)     // Catch:{ all -> 0x00c5 }
            goto L_0x00ba
        L_0x0091:
            boolean r1 = r0.A0l     // Catch:{ all -> 0x00c5 }
            r0.A09(r3, r1)     // Catch:{ all -> 0x00c5 }
            X.B3Y r5 = r0.A0a     // Catch:{ all -> 0x00c5 }
            r1 = -1
            r5.BrV(r1, r1)     // Catch:{ all -> 0x00c5 }
            X.9jS r1 = r0.A09     // Catch:{ all -> 0x00c5 }
            int r2 = r1.A00     // Catch:{ all -> 0x00c5 }
            if (r2 != r7) goto L_0x00af
            r0.A06()     // Catch:{ all -> 0x00c5 }
            X.9ik r1 = r0.A0g     // Catch:{ all -> 0x00c5 }
            android.os.Handler r2 = r1.A00     // Catch:{ all -> 0x00c5 }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ all -> 0x00c5 }
            goto L_0x00ba
        L_0x00af:
            r1 = 2
            if (r2 != r1) goto L_0x00ba
            X.9ik r1 = r0.A0g     // Catch:{ all -> 0x00c5 }
            android.os.Handler r2 = r1.A00     // Catch:{ all -> 0x00c5 }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ all -> 0x00c5 }
        L_0x00ba:
            android.os.Handler r2 = r0.A0V     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.C165577te.A0w(r2, r1, r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x00c5:
            r5 = move-exception
            android.os.Handler r2 = r0.A0V     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.C165577te.A0w(r2, r1, r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            throw r5     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x00d0:
            java.lang.Object r11 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Iw r11 = (X.C192869Iw) r11     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Ri r12 = r0.A0Z     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = 1
            int r1 = r12.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1 + 1
            r12.A01 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.util.Pair r7 = r0.A02(r11, r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r9 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L_0x0119
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            com.facebook.android.exoplayer2.Timeline r5 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r5.A01()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = X.AnonymousClass000.A1Q(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x00fb
            r1 = 0
            goto L_0x0109
        L_0x00fb:
            boolean r1 = r0.A0O     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = r5.A05(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9fY r1 = r0.A0d     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9fY r1 = r5.A09(r1, r2, r9)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0109:
            r23 = -1
            r22 = -1
            X.9WT r13 = new X.9WT     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r25 = -1
            r20 = r13
            r21 = r1
            r20.<init>(r21, r22, r23, r25)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x013d
        L_0x0119:
            java.lang.Object r1 = r7.first     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = X.C90514aH.A0H(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r1 = r7.second     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r1.longValue()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9nP r1 = r0.A0b     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r13 = r1.A07(r2, r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r1 = r7.second     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.longValue()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r11.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r15 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            r14 = 0
            if (r15 != 0) goto L_0x0148
            goto L_0x0147
        L_0x013d:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0147:
            r14 = 1
        L_0x0148:
            X.B38 r7 = r0.A0C     // Catch:{ all -> 0x01d0 }
            if (r7 == 0) goto L_0x01b3
            int r7 = r0.A02     // Catch:{ all -> 0x01d0 }
            if (r7 > 0) goto L_0x01b3
            int r7 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x015c
            r7 = 4
            r0.A0A(r7)     // Catch:{ all -> 0x01d0 }
            r0.A0L(r3, r4, r3)     // Catch:{ all -> 0x01d0 }
            goto L_0x01b8
        L_0x015c:
            X.9jS r7 = r0.A09     // Catch:{ all -> 0x01d0 }
            X.9WT r7 = r7.A04     // Catch:{ all -> 0x01d0 }
            boolean r7 = r13.equals(r7)     // Catch:{ all -> 0x01d0 }
            if (r7 == 0) goto L_0x0193
            X.9nP r7 = r0.A0b     // Catch:{ all -> 0x01d0 }
            X.9XX r8 = r7.A05     // Catch:{ all -> 0x01d0 }
            if (r8 == 0) goto L_0x0171
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0171
            goto L_0x0174
        L_0x0171:
            r22 = r1
            goto L_0x017c
        L_0x0174:
            X.B5S r8 = r8.A08     // Catch:{ all -> 0x01d0 }
            X.9fF r7 = r0.A0B     // Catch:{ all -> 0x01d0 }
            long r22 = r8.B8K(r7, r1)     // Catch:{ all -> 0x01d0 }
        L_0x017c:
            java.util.UUID r7 = X.AnonymousClass9B7.A04     // Catch:{ all -> 0x01d0 }
            long r10 = com.facebook.android.exoplayer2.util.Util.A05(r22)     // Catch:{ all -> 0x01d0 }
            X.9jS r7 = r0.A09     // Catch:{ all -> 0x01d0 }
            long r7 = r7.A0D     // Catch:{ all -> 0x01d0 }
            long r8 = com.facebook.android.exoplayer2.util.Util.A05(r7)     // Catch:{ all -> 0x01d0 }
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0195
            X.9jS r7 = r0.A09     // Catch:{ all -> 0x01d0 }
            long r1 = r7.A0D     // Catch:{ all -> 0x01d0 }
            goto L_0x01b8
        L_0x0193:
            r22 = r1
        L_0x0195:
            X.9nP r7 = r0.A0b     // Catch:{ all -> 0x01d0 }
            X.9XX r8 = r7.A05     // Catch:{ all -> 0x01d0 }
            X.9XX r7 = r7.A06     // Catch:{ all -> 0x01d0 }
            boolean r25 = X.C36371kC.A1W(r8, r7)
            r24 = 0
            r20 = r0
            r21 = r13
            long r8 = r20.A01(r21, r22, r24, r25)     // Catch:{ all -> 0x01d0 }
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x01af
            r19 = 0
        L_0x01af:
            r14 = r14 | r19
            r1 = r8
            goto L_0x01b8
        L_0x01b3:
            r0.A08 = r11     // Catch:{ all -> 0x01d0 }
            r7 = 0
            r0.A07 = r7     // Catch:{ all -> 0x01d0 }
        L_0x01b8:
            X.9jS r7 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r7
            r20 = r13
            r21 = r1
            r23 = r5
            X.9jS r1 = r19.A01(r20, r21, r23)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r14 == 0) goto L_0x0d58
            r1 = 2
            r12.A00(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x01d0:
            r8 = move-exception
            X.9jS r7 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r7
            r20 = r13
            r21 = r1
            r23 = r5
            X.9jS r1 = r19.A01(r20, r21, r23)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r14 == 0) goto L_0x01e7
            r1 = 2
            r12.A00(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x01e7:
            throw r8     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x01e8:
            java.lang.Object r1 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9fF r1 = (X.C199399fF) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0B = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x01f0:
            int r1 = r2.arg1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = X.AnonymousClass000.A1P(r1)
            r0.A0K(r1, r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x01fb:
            java.lang.Object r5 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Iv r5 = (X.C192859Iv) r5     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B38 r2 = r5.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B38 r1 = r0.A0C     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r2 != r1) goto L_0x0d58
            X.9jS r15 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            com.facebook.android.exoplayer2.Timeline r8 = r15.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            com.facebook.android.exoplayer2.Timeline r9 = r5.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r1 = r5.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r25 = r1
            X.9nP r7 = r0.A0b     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7.A07 = r9     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r1 = r15.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r21 = r1
            long r5 = r15.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r15.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r10 = r15.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r17 = r10
            boolean r10 = r15.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r16 = r10
            X.9tN r14 = r15.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9MF r13 = r15.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Integer r12 = r15.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r11 = r15.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r10 = new X.9jS     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r10
            r20 = r9
            r22 = r14
            r23 = r13
            r24 = r12
            r26 = r17
            r27 = r5
            r29 = r1
            r31 = r16
            r32 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.C201399jS.A00(r15, r10)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09 = r10     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.util.ArrayList r5 = r0.A0i     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = r5.size()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x024f:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x026e
            java.lang.Object r1 = r5.get(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.AUc r1 = (X.C21660AUc) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r0.A0O(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x024f
            java.lang.Object r1 = r5.get(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.AUc r1 = (X.C21660AUc) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Xx r1 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.A03(r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5.remove(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x024f
        L_0x026e:
            java.util.Collections.sort(r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r5 = r0.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            if (r5 <= 0) goto L_0x0294
            X.9Ri r2 = r0.A0Z     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r2.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1 + r5
            r2.A01 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A02 = r3     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Iw r1 = r0.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r6 = 0
            if (r1 == 0) goto L_0x03b0
            android.util.Pair r2 = r0.A02(r1, r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A08 = r6     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r2 != 0) goto L_0x03ea
            goto L_0x03fd
        L_0x0294:
            X.9jS r2 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r1 = r2.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r6 = r1.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r2.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r5 = r8.A01()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r5 = X.AnonymousClass000.A1Q(r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r5 == 0) goto L_0x02b8
            int r5 = r9.A01()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r5 = X.AnonymousClass000.A1Q(r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r5 != 0) goto L_0x0d58
            X.9WT r8 = r7.A07(r6, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r7 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x03cc
        L_0x02b8:
            X.9XX r12 = r7.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r12 != 0) goto L_0x02f7
            X.9XX r12 = r7.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r12 != 0) goto L_0x02f7
            X.9Wr r5 = r0.A0c     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Wr r5 = r8.A08(r5, r6, r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r5 = r5.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x02c8:
            int r10 = r9.A04(r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r11 = -1
            if (r10 != r11) goto L_0x0349
            int r1 = r0.A00(r8, r9, r6)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == r11) goto L_0x03fd
            X.9Wr r5 = r0.A0c     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Wr r1 = r9.A08(r5, r1, r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.util.Pair r2 = r0.A03(r9, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r1 = r2.first     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r10 = X.C90514aH.A0H(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r1 = r2.second     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.longValue()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r8 = r7.A07(r10, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r9.A08(r5, r10, r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x02fa
        L_0x02f7:
            java.lang.Object r5 = r12.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x02c8
        L_0x02fa:
            if (r12 == 0) goto L_0x039e
            java.lang.Object r13 = r5.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x02fe:
            X.9NQ r9 = r12.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r5 = r9.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r20 = r5.A00(r11)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r9.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r23 = r5
            long r5 = r9.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r25 = r5
            long r15 = r9.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r9.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r14 = r9.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r17 = r14
            boolean r9 = r9.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r14 = r9
            X.9NQ r9 = new X.9NQ     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r9
            r21 = r23
            r23 = r25
            r25 = r15
            r27 = r5
            r29 = r17
            r30 = r14
            r19.<init>(r20, r21, r23, r25, r27, r29, r30)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x032c:
            r12.A02 = r9     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r5 = r12.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r5 == 0) goto L_0x039e
            X.9XX r12 = r12.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r5 = r12.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r5 = r5.equals(r13)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r5 == 0) goto L_0x02fe
            X.9NQ r6 = r12.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r5 = r6.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r5 = r5.A00(r10)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r9 = X.C203149nP.A01(r6, r7, r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x032c
        L_0x0349:
            if (r10 == r6) goto L_0x038b
            X.9jS r14 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            com.facebook.android.exoplayer2.Timeline r5 = r14.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r20 = r5
            java.lang.Object r5 = r14.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r25 = r5
            X.9WT r5 = r14.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r21 = r5.A00(r10)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r8 = r14.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r14.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r11 = r14.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r26 = r11
            boolean r11 = r14.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r17 = r11
            X.9tN r11 = r14.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r16 = r11
            X.9MF r15 = r14.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Integer r13 = r14.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r12 = r14.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r11 = new X.9jS     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r11
            r22 = r16
            r23 = r15
            r24 = r13
            r27 = r8
            r29 = r5
            r31 = r17
            r32 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.C201399jS.A00(r14, r11)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09 = r11     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x038b:
            X.9jS r5 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r9 = r5.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r6 = r9.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5 = -1
            if (r6 == r5) goto L_0x0406
            X.9WT r8 = r7.A07(r10, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r5 = r8.equals(r9)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r5 != 0) goto L_0x0406
        L_0x039e:
            X.9XX r6 = r7.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r5 = r7.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r12 = X.C36371kC.A1W(r6, r5)
            r11 = 0
            r7 = r0
            r9 = r1
            long r12 = r7.A01(r8, r9, r11, r12)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r7 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x03c1
        L_0x03b0:
            X.9GB r5 = r0.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r5 == 0) goto L_0x03ce
            long r1 = r5.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r8 = r5.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A07 = r6     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x03ba:
            X.9jS r7 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r6 = r8.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5 = -1
            if (r6 == r5) goto L_0x03cc
        L_0x03c1:
            r10 = r7
            r11 = r8
            r14 = r1
            X.9jS r1 = r10.A01(r11, r12, r14)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x03cc:
            r12 = r1
            goto L_0x03c1
        L_0x03ce:
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r5 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0d58
            int r1 = r9.A01()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = X.AnonymousClass000.A1Q(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x03fd
            boolean r1 = r0.A0O     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r9.A05(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.util.Pair r2 = r0.A03(r9, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x03ea:
            java.lang.Object r1 = r2.first     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r5 = X.C90514aH.A0H(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r1 = r2.second     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.longValue()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r8 = r7.A07(r5, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x03ba
        L_0x03fd:
            r1 = 4
            r0.A0A(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0L(r3, r4, r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x0406:
            long r13 = r0.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r12 = r9.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r11 = r7.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r11 != 0) goto L_0x0412
            X.9XX r11 = r7.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r10 = 0
            goto L_0x0444
        L_0x0412:
            X.9NQ r2 = r11.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r1 = r2.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r1 = r1.A00(r12)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r1 = X.C203149nP.A01(r2, r7, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r11.A02 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0420:
            X.9NQ r1 = r11.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r1.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0440
            com.facebook.android.exoplayer2.Timeline r8 = r7.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Wr r6 = r7.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9fY r5 = r7.A0B     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = r7.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r7.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r8
            r20 = r6
            r21 = r5
            r22 = r12
            r23 = r2
            r24 = r1
            int r12 = r19.A03(r20, r21, r22, r23, r24)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0440:
            X.9XX r1 = r11.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r10 = r11
            r11 = r1
        L_0x0444:
            if (r11 == 0) goto L_0x0d58
            if (r10 == 0) goto L_0x0412
            r1 = -1
            if (r12 == r1) goto L_0x048c
            java.lang.Object r5 = r11.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            com.facebook.android.exoplayer2.Timeline r2 = r7.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Wr r1 = r7.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Wr r1 = r2.A08(r1, r12, r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r1 = r1.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r5.equals(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x048c
            X.9NQ r9 = X.C203149nP.A00(r10, r7, r13)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r9 == 0) goto L_0x048c
            X.9NQ r2 = r11.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r1 = r2.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r1 = r1.A00(r12)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r8 = X.C203149nP.A01(r2, r7, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r11.A02 = r8     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r8.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r9.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r15 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r15 != 0) goto L_0x048c
            long r5 = r8.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r9.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r15 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r15 != 0) goto L_0x048c
            X.9WT r2 = r8.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r1 = r9.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r2.equals(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x048c
            goto L_0x0420
        L_0x048c:
            boolean r1 = r7.A09(r10)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0d58
            r0.A0I(r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x0499:
            java.lang.Object r2 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5S r2 = (X.B5S) r2     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9nP r8 = r0.A0b     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r7 = r8.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r7 == 0) goto L_0x0d58
            X.B5S r1 = r7.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != r2) goto L_0x0d58
            X.A0d r1 = r0.A0X     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.BFz()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7.A07 = r4     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5S r1 = r7.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9tN r1 = r1.BIW()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7.A03 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7.A02()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r1 = r7.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B26[] r5 = r7.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r5 = r5.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean[] r5 = new boolean[r5]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r21 = r7.A00(r5, r1, r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r7.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r9 = r7.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r9.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1 - r21
            long r5 = r5 + r1
            r7.A00 = r5     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r14 = r9.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r10 = r9.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r9.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r9.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r12 = r9.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r13 = r9.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r9 = new X.9NQ     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r9
            r20 = r14
            r23 = r10
            r25 = r5
            r27 = r1
            r29 = r12
            r30 = r13
            r19.<init>(r20, r21, r23, r25, r27, r29, r30)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7.A02 = r9     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9tN r6 = r7.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9MF r1 = r7.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B3Y r5 = r0.A0a     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5Q[] r2 = r0.A0o     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5T[] r1 = r1.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5.BjQ(r6, r2, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r1 = r8.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x0512
            X.9XX r1 = r8.A06()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r1 = r1.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0B(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 0
            r0.A0D(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0512:
            boolean r1 = r0.A0H     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x051b
            boolean r1 = r0.A0K     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2 = 2
            if (r1 == 0) goto L_0x051c
        L_0x051b:
            r2 = 0
        L_0x051c:
            boolean r1 = r0.A0l     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09(r2, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r2 = r0.A0K     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r1 = r8.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x053b
            X.B5S r1 = r1.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.Brc(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x053b
        L_0x052d:
            java.lang.Object r2 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5S r2 = (X.B5S) r2     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9nP r1 = r0.A0b     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r1 = r1.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0d58
            X.B5S r1 = r1.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != r2) goto L_0x0d58
        L_0x053b:
            r0.A0H(r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x0540:
            int r2 = r2.arg1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A03 = r2     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9nP r1 = r0.A0b     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.A01 = r2     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = X.C203149nP.A04(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x0d58
            goto L_0x0561
        L_0x054f:
            int r1 = r2.arg1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r2 = X.AnonymousClass000.A1P(r1)
            r0.A0O = r2     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9nP r1 = r0.A0b     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.A09 = r2     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = X.C203149nP.A04(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x0d58
        L_0x0561:
            r0.A0I(r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x0566:
            java.lang.Object r6 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Xx r6 = (X.C196149Xx) r6     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r6.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x057a
            r0.A0E(r6)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x057a:
            X.B38 r1 = r0.A0C     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x05ce
            int r1 = r0.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 > 0) goto L_0x05ce
            X.AUc r2 = new X.AUc     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2.<init>(r6)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r0.A0O(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x05ae
            java.util.ArrayList r1 = r0.A0i     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.add(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.util.Collections.sort(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x0597:
            java.lang.Object r6 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Xx r6 = (X.C196149Xx) r6     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.os.Looper r5 = r6.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Thread r1 = r5.getThread()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r1.isAlive()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x05b3
            java.lang.String r2 = "TAG"
            java.lang.String r1 = "Trying to send message on a dead thread."
            android.util.Log.w(r2, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x05ae:
            r6.A03(r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x05b3:
            r2 = 0
            java.util.List r1 = X.C201079ik.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.<init>(r5, r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9ik r5 = new X.9ik     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5.<init>(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 27
            X.75C r2 = new X.75C     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2.<init>((java.lang.Object) r0, (java.lang.Object) r6, (int) r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.os.Handler r1 = r5.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.post(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x05ce:
            java.util.ArrayList r2 = r0.A0i     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.AUc r1 = new X.AUc     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.<init>(r6)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2.add(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x05da:
            java.lang.Object r1 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9GB r1 = (X.AnonymousClass9GB) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0C(r1, r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x05e3:
            java.lang.Object r9 = r2.obj     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9GB r9 = (X.AnonymousClass9GB) r9     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r9.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9nP r10 = r0.A0b     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r1 = r10.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0d58
            X.B5S r2 = r1.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9fF r1 = X.C199399fF.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r2.B8K(r1, r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r1 - r5
            long r13 = java.lang.Math.abs(r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r11 = 1200000(0x124f80, double:5.92879E-318)
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x0617
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.String r1 = "Unable to find keyframe, skip fast seek. Distance: "
            java.lang.String r2 = X.C36381kD.A0z(r1, r2, r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r18
            android.util.Log.d(r1, r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A0D     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0617:
            X.9XX r10 = r10.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r10 != 0) goto L_0x061e
            r12 = 0
            goto L_0x0629
        L_0x061e:
            long r5 = r0.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r10.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r5 - r7
            X.B5S r7 = r10.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r12 = r7.B92(r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0629:
            long r5 = r0.A0P()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r12 = r12 + r5
            X.B3Y r6 = r0.A0a     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.A0d r5 = r0.A0X     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9fS r5 = r5.BFz()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            float r5 = r5.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r14 = 0
            r15 = 0
            r10 = r6
            r11 = r5
            boolean r5 = r10.BtX(r11, r12, r14, r15)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r5 != 0) goto L_0x064d
            java.lang.String r2 = "Can't start playback now, skip fast seek"
            r1 = r18
            android.util.Log.d(r1, r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A0D     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x064d:
            X.9WT r6 = r9.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9GB r5 = new X.9GB     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5.<init>(r6, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0C(r5, r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x0659:
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B38 r2 = r0.A0C     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r2 == 0) goto L_0x0668
            int r1 = r0.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 <= 0) goto L_0x0692
            r2.BPf()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0668:
            X.9nP r10 = r0.A0b     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r12 = r10.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r12 == 0) goto L_0x0c32
            X.9XX r15 = r10.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.String r1 = "doSomeWork"
            X.C196289Yq.A01(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A08()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r1
            X.B5S r9 = r12.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A0D     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r0.A0T     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1 - r7
            boolean r7 = r0.A0k     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r9.B5V(r1, r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5Q[] r14 = r0.A0P     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r13 = r14.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x08cf
        L_0x0692:
            X.9nP r5 = r0.A0b     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r7 = r5.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r7 == 0) goto L_0x06c7
            X.9NQ r1 = r7.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r1.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x074e
            boolean r1 = r7.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x074e
            boolean r1 = r7.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x06b2
            X.B5S r1 = r7.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r8 = r1.B93()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r6 = -9223372036854775808
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x074e
        L_0x06b2:
            X.9XX r7 = r5.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r1 = r7.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x074e
            int r2 = r5.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 100
            if (r2 >= r1) goto L_0x074e
        L_0x06c7:
            long r1 = r0.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r6 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r7 != 0) goto L_0x06ea
            X.9WT r9 = r6.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r6 = r6.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            com.facebook.android.exoplayer2.Timeline r2 = r5.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r8 = r9.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Wr r1 = r5.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2.A08(r1, r8, r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = r9.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = -1
            if (r2 != r1) goto L_0x072e
            long r1 = r9.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r9 = r5
            r10 = r8
            r11 = r6
            r13 = r1
            X.9NQ r8 = X.C203149nP.A02(r9, r10, r11, r13)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x06ee
        L_0x06ea:
            X.9NQ r8 = X.C203149nP.A00(r7, r5, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x06ee:
            if (r8 == 0) goto L_0x072e
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            com.facebook.android.exoplayer2.Timeline r6 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r1 = r8.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = r1.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Wr r1 = r0.A0c     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Wr r1 = r6.A08(r1, r2, r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r12 = r1.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B26[] r13 = r0.A0p     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9GL r10 = r0.A0e     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B3Y r1 = r0.A0a     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Ws r11 = r1.B8a()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B38 r9 = r0.A0C     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r6 = 0
            X.9XX r1 = r5.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x0721
            long r14 = r8.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r14 = r14 + r6
        L_0x0715:
            X.9XX r7 = new X.9XX     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r2 = r5.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r2 == 0) goto L_0x0739
            X.9XX r1 = r5.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0729
        L_0x0721:
            long r14 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r1 = r1.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r14 = r14 + r1
            goto L_0x0715
        L_0x0729:
            boolean r1 = X.AnonymousClass000.A1V(r1)
            goto L_0x0734
        L_0x072e:
            X.B38 r1 = r0.A0C     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.BPf()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x074e
        L_0x0734:
            X.C200319h9.A02(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2.A01 = r7     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0739:
            r1 = 0
            r5.A08 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5.A04 = r7     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r5.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1 + 1
            r5.A00 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5S r6 = r7.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r8.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r6.Bm4(r0, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0J(r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x074e:
            X.9XX r2 = r5.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r11 = 0
            if (r2 == 0) goto L_0x0767
            boolean r1 = r2.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x07c4
            boolean r1 = r2.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0767
            X.B5S r1 = r2.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r8 = r1.B93()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r6 = -9223372036854775808
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x07c4
        L_0x0767:
            r0.A0J(r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x076a:
            X.9XX r12 = r5.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r12 == 0) goto L_0x0668
            X.9XX r10 = r5.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r13 = 0
        L_0x0771:
            boolean r1 = r0.A0K     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x07ce
            if (r12 == r10) goto L_0x07ce
            long r8 = r0.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r2 = r12.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r0.A0G     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x0782
            long r6 = r2.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0789
        L_0x0782:
            X.9NQ r1 = r2.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r6 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r2.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r6 = r6 + r1
        L_0x0789:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x07ce
            if (r13 == 0) goto L_0x0792
            r0.A04()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0792:
            X.9NQ r1 = r12.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r1.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r13 = 3
            if (r1 == 0) goto L_0x079a
            r13 = 0
        L_0x079a:
            X.9XX r9 = r5.A06()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0D(r12)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r12 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r1 = r9.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r8 = r1.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r6 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r12
            r20 = r8
            r21 = r6
            r23 = r1
            X.9jS r1 = r19.A01(r20, r21, r23)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Ri r1 = r0.A0Z     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.A00(r13)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A08()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r12 = r9
            r13 = 1
            goto L_0x0771
        L_0x07c4:
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r1.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x076a
            r0.A0H(r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x076a
        L_0x07ce:
            X.9NQ r1 = r10.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r1.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x08ae
            X.9XX r1 = r10.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0668
            boolean r1 = r1.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x07de
            goto L_0x0668
        L_0x07de:
            X.B5Q[] r13 = r0.A0o     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r12 = r13.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r11 >= r12) goto L_0x07fd
            r6 = r13[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B2j[] r1 = r10.A0B     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2 = r1[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r6
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B2j r1 = r1.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != r2) goto L_0x0668
            if (r2 == 0) goto L_0x07fa
            boolean r1 = r6.BK4()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x07fa
            goto L_0x0668
        L_0x07fa:
            int r11 = r11 + 1
            goto L_0x07de
        L_0x07fd:
            X.9MF r1 = r10.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r23 = r1
            X.9XX r6 = r5.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r6 == 0) goto L_0x080a
            X.9XX r2 = r6.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 1
            if (r2 != 0) goto L_0x080b
        L_0x080a:
            r1 = 0
        L_0x080b:
            X.C200319h9.A02(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r14 = r6.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5.A06 = r14     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9MF r15 = r14.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5S r1 = r14.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r1.Bmt()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            boolean r22 = X.AnonymousClass000.A1P(r1)
            r11 = 0
        L_0x0826:
            if (r11 >= r12) goto L_0x0668
            r10 = r13[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r23
            X.9f7[] r2 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r2[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x08aa
            if (r22 != 0) goto L_0x08a6
            r1 = r10
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r1.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x08aa
            X.B5T[] r1 = r15.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7 = r1[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9f7[] r6 = r15.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r6[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r5 = X.AnonymousClass000.A1V(r1)
            r2 = r2[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r6[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r5 == 0) goto L_0x08a6
            boolean r1 = r1.equals(r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x08a6
            r5 = 0
            if (r7 == 0) goto L_0x0857
            goto L_0x0859
        L_0x0857:
            r2 = 0
            goto L_0x085f
        L_0x0859:
            r1 = r7
            X.A0A r1 = (X.A0A) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int[] r1 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = r1.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x085f:
            X.9uY[] r9 = new X.C207099uY[r2]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0861:
            if (r5 >= r2) goto L_0x086f
            r1 = r7
            X.A0A r1 = (X.A0A) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9uY[] r1 = r1.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r1[r5]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r9[r5] = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r5 = r5 + 1
            goto L_0x0861
        L_0x086f:
            java.lang.String r2 = "replaceStream"
            r1 = r18
            android.util.Log.e(r1, r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B2j[] r1 = r14.A0B     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r8 = r1[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r0.A0G     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x089e
            long r1 = r14.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5 = r1
        L_0x0881:
            X.9zD r10 = (X.C208949zD) r10     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r7 = r10.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7 = r7 ^ 1
            X.C200319h9.A02(r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r10.A06 = r8     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r10.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r20 = -9223372036854775808
            int r19 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r19 != 0) goto L_0x0896
            r10.A02 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0896:
            r10.A0A = r9     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r10.A03 = r5     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r10.A0E(r9, r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x08aa
        L_0x089e:
            X.9NQ r1 = r14.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r14.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1 + r5
            goto L_0x0881
        L_0x08a6:
            X.9zD r10 = (X.C208949zD) r10     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r10.A08 = r4     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x08aa:
            int r11 = r11 + 1
            goto L_0x0826
        L_0x08ae:
            X.B5Q[] r2 = r0.A0o     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r2.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r11 >= r1) goto L_0x0668
            r5 = r2[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B2j[] r1 = r10.A0B     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2 = r1[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r2 == 0) goto L_0x08cc
            r1 = r5
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B2j r1 = r1.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != r2) goto L_0x08cc
            boolean r1 = r5.BK4()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x08cc
            X.9zD r5 = (X.C208949zD) r5     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5.A08 = r4     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x08cc:
            int r11 = r11 + 1
            goto L_0x08ae
        L_0x08cf:
            boolean r26 = X.C90474aD.A1T(r13, r4)
            r25 = 1
            r24 = 1
            r11 = 0
            r23 = 0
        L_0x08da:
            java.lang.String r22 = "Temporarily ignoring stream error: "
            if (r11 >= r13) goto L_0x09ca
            r9 = r14[r11]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r0.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r9.Bo3(r1, r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r1 = r15.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r1.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x091d
            boolean r1 = r0.A0J     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x09be
            boolean r1 = r9.BK4()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x0918
            boolean r1 = r0.A0E     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x091d
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A0D     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = -1
            int r7 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r7 == 0) goto L_0x091d
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r1.A0D     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r7 - r1
            java.util.UUID r1 = X.AnonymousClass9B7.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r19 = com.facebook.android.exoplayer2.util.Util.A05(r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x091d
        L_0x0918:
            r1 = r9
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.A08 = r4     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x091d:
            boolean r1 = r9 instanceof X.AnonymousClass82F     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x092d
            if (r26 == 0) goto L_0x092b
            boolean r1 = r9.BLh()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r26 = 1
            if (r1 != 0) goto L_0x092d
        L_0x092b:
            r26 = 0
        L_0x092d:
            if (r24 == 0) goto L_0x0937
            boolean r1 = r9.BLh()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r24 = 1
            if (r1 != 0) goto L_0x0939
        L_0x0937:
            r24 = 0
        L_0x0939:
            boolean r1 = r9.BMw()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x09ad
            boolean r1 = r9.BLh()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x09ad
            X.9XX r1 = r10.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r1 = r1.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0956
            boolean r1 = r1.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0956
            boolean r1 = r9.BK4()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0956
            goto L_0x09ad
        L_0x0956:
            r21 = 0
            r1 = r9
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ 83L -> 0x0964 }
            X.B2j r1 = r1.A06     // Catch:{ 83L -> 0x0964 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ 83L -> 0x0964 }
            r1.BPd()     // Catch:{ 83L -> 0x0964 }
            goto L_0x099f
        L_0x0964:
            r7 = move-exception
            java.lang.Class r2 = r7.getClass()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Class<X.83L> r1 = X.AnonymousClass83L.class
            boolean r1 = r2.equals(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0bec
            boolean r1 = r0.A0I     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0bec
            long r1 = r0.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r8 != 0) goto L_0x09a2
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r22
            java.lang.String r2 = X.C36331k8.A0i(r1, r2, r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r18
            android.util.Log.w(r1, r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A05 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r0.A0j     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x099f
            android.os.Handler r2 = r0.A0V     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 4
            X.C165577te.A0w(r2, r7, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x099f:
            r0.A0A = r9     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x09b0
        L_0x09a2:
            long r19 = X.C36441kJ.A0A(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r0.A0U     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r8 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r8 > 0) goto L_0x0bec
            goto L_0x099f
        L_0x09ad:
            r21 = 1
            goto L_0x09b2
        L_0x09b0:
            r23 = 1
        L_0x09b2:
            if (r25 == 0) goto L_0x09b8
            r25 = 1
            if (r21 != 0) goto L_0x09ba
        L_0x09b8:
            r25 = 0
        L_0x09ba:
            int r11 = r11 + 1
            goto L_0x08da
        L_0x09be:
            boolean r1 = r0.A0E     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0918
            boolean r1 = r9.BK4()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x091d
            goto L_0x0918
        L_0x09ca:
            if (r25 != 0) goto L_0x09cf
            r0.A05()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x09cf:
            boolean r1 = r0.A0L     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x09f2
            if (r26 == 0) goto L_0x09f2
            if (r24 != 0) goto L_0x09f2
            X.B5Q[] r8 = r0.A0P     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r7 = r8.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r6 = 0
        L_0x09db:
            if (r6 >= r7) goto L_0x09f2
            r5 = r8[r6]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r5 instanceof X.AnonymousClass82F     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x09ef
            r1 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r5.Bo3(r1, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r24 = r5.BLh()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x09ef:
            int r6 = r6 + 1
            goto L_0x09db
        L_0x09f2:
            X.9NQ r1 = r12.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r1.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r9 = 3
            if (r24 == 0) goto L_0x0a16
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0a0a
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A0D     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 > 0) goto L_0x0a16
        L_0x0a0a:
            X.9NQ r1 = r12.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r1.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0a16
            r1 = 4
            r0.A0A(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0b8a
        L_0x0a16:
            X.9jS r5 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = r5.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 2
            if (r2 != r1) goto L_0x0b24
            X.B5Q[] r1 = r0.A0P     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x0a8c
            boolean r1 = r0.A0N()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0b24
        L_0x0a28:
            X.B5Q r1 = r0.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0a89
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.A0B     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r37 = 1
            if (r1 != r4) goto L_0x0a89
        L_0x0a34:
            java.lang.Integer r1 = r0.A0D     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r1
            X.9jS r13 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r13.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == r9) goto L_0x0a72
            com.facebook.android.exoplayer2.Timeline r15 = r13.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Object r14 = r13.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r12 = r13.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r13.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r13.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r11 = r13.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9tN r10 = r13.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9MF r8 = r13.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r7 = new X.9jS     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r31 = 3
            r24 = r7
            r25 = r15
            r26 = r12
            r27 = r10
            r28 = r8
            r29 = r19
            r30 = r14
            r32 = r5
            r34 = r1
            r36 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r37)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.C201399jS.A00(r13, r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09 = r7     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = -1
            r0.A04 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0a72:
            boolean r1 = r0.A0K     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0a79
            r0.A06()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0a79:
            r1 = 0
            r0.A0A = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0a7c:
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 2
            if (r2 != r1) goto L_0x0bed
            X.B5Q[] r8 = r0.A0P     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r6 = r8.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5 = 0
            goto L_0x0b92
        L_0x0a89:
            r37 = 0
            goto L_0x0a34
        L_0x0a8c:
            if (r25 != 0) goto L_0x0a98
            X.B5Q r1 = r0.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0b24
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Integer r1 = r1.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0b22
        L_0x0a98:
            boolean r1 = r5.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0a28
            X.9XX r11 = r10.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9NQ r2 = r11.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r2.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r8 = r1 ^ 1
            boolean r1 = r11.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x0ab5
            long r1 = r2.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0aaa:
            boolean r5 = r0.A0m     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r5 == 0) goto L_0x0acb
            X.9XX r12 = r10.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r5 = r10.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r12 == r5) goto L_0x0acb
            goto L_0x0ac8
        L_0x0ab5:
            X.B5S r1 = r11.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.B93()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r6 = -9223372036854775808
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0aaa
            if (r8 == 0) goto L_0x0aaa
            X.9NQ r1 = r11.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0aaa
        L_0x0ac8:
            if (r12 == 0) goto L_0x0acb
            goto L_0x0ad7
        L_0x0acb:
            long r5 = r0.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r11.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r5 - r7
            X.B5S r7 = r11.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r28 = r7.B92(r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0ae8
        L_0x0ad7:
            long r5 = r0.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r12.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r5 - r7
            X.B5S r7 = r12.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r28 = r7.B92(r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r0.A0P()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r28 = r28 + r5
        L_0x0ae8:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r8 = r0.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r8 <= 0) goto L_0x0b00
            long r5 = r0.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r10 = 0
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0b00
            long r12 = r12 - r5
            long r5 = (long) r8     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            r31 = 1
            if (r7 < 0) goto L_0x0b02
        L_0x0b00:
            r31 = 0
        L_0x0b02:
            r6 = -9223372036854775808
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0a28
            X.B3Y r5 = r0.A0a     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.A0d r1 = r0.A0X     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9fS r1 = r1.BFz()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            float r2 = r1.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r0.A0M     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r26 = r5
            r27 = r2
            r30 = r1
            boolean r1 = r26.BtX(r27, r28, r30, r31)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x0a28
            java.lang.Integer r1 = X.C023109s.A0V     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0b22:
            r0.A0D = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0b24:
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != r9) goto L_0x0a7c
            X.B5Q[] r1 = r0.A0P     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 != 0) goto L_0x0b37
            boolean r1 = r0.A0N()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0b39
            goto L_0x0a7c
        L_0x0b37:
            if (r25 != 0) goto L_0x0a7c
        L_0x0b39:
            boolean r1 = r0.A0K     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0M = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5Q r1 = r0.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0b8f
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.A0B     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r37 = 1
            if (r1 != r4) goto L_0x0b8f
        L_0x0b49:
            X.9jS r13 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = r13.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 2
            if (r2 == r1) goto L_0x0b8a
            com.facebook.android.exoplayer2.Timeline r1 = r13.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r1
            java.lang.Object r15 = r13.A08     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r14 = r13.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r13.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r13.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r12 = r13.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9tN r11 = r13.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9MF r10 = r13.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Integer r8 = r13.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r7 = new X.9jS     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r31 = 2
            r24 = r7
            r25 = r19
            r26 = r14
            r27 = r11
            r28 = r10
            r29 = r8
            r30 = r15
            r32 = r5
            r34 = r1
            r36 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r37)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.C201399jS.A00(r13, r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09 = r7     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A04 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0b8a:
            r0.A07()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0a7c
        L_0x0b8f:
            r37 = 0
            goto L_0x0b49
        L_0x0b92:
            if (r5 >= r6) goto L_0x0bed
            r1 = r8[r5]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ 83L -> 0x0ba1 }
            X.B2j r1 = r1.A06     // Catch:{ 83L -> 0x0ba1 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ 83L -> 0x0ba1 }
            r1.BPd()     // Catch:{ 83L -> 0x0ba1 }
            goto L_0x0be7
        L_0x0ba1:
            r7 = move-exception
            java.lang.Class r2 = r7.getClass()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            java.lang.Class<X.83L> r1 = X.AnonymousClass83L.class
            boolean r1 = r2.equals(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0bec
            boolean r1 = r0.A0I     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0bec
            long r1 = r0.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0bdd
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r22
            java.lang.String r2 = X.C36331k8.A0i(r1, r2, r7)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r18
            android.util.Log.w(r1, r2)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A05 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r0.A0j     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0be7
            android.os.Handler r2 = r0.A0V     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 4
            X.C165577te.A0w(r2, r7, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0be7
        L_0x0bdd:
            long r11 = X.C36441kJ.A0A(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r0.A0U     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 > 0) goto L_0x0bec
        L_0x0be7:
            int r5 = r5 + 1
            r23 = 1
            goto L_0x0b92
        L_0x0bec:
            throw r7     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0bed:
            boolean r1 = r0.A0K     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0bf7
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == r9) goto L_0x0c12
        L_0x0bf7:
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r2 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 2
            if (r2 == r1) goto L_0x0c12
            X.B5Q[] r1 = r0.A0P     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0c09
            r1 = 4
            if (r2 == r1) goto L_0x0c09
            r7 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0c14
        L_0x0c09:
            X.9ik r1 = r0.A0g     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.os.Handler r2 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 2
            r2.removeMessages(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0c24
        L_0x0c12:
            r7 = 10
        L_0x0c14:
            X.9ik r1 = r0.A0g     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.os.Handler r6 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 2
            r6.removeMessages(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r16 = r16 + r7
            r5 = 2
            r1 = r16
            r6.sendEmptyMessageAtTime(r5, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0c24:
            if (r23 != 0) goto L_0x0c2d
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.A05 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0c2d:
            X.C196289Yq.A00()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x0c32:
            r0.A05()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r7 = 10
            X.9ik r1 = r0.A0g     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.os.Handler r6 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 2
            r6.removeMessages(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r16 = r16 + r7
            r5 = 2
            r1 = r16
            r6.sendEmptyMessageAtTime(r5, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d58
        L_0x0c49:
            r0.A0L(r4, r4, r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B3Y r1 = r0.A0a     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.BeW()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0A(r4)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.os.HandlerThread r1 = r0.A0W     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.quit()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            monitor-enter(r0)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0N = r4     // Catch:{ all -> 0x0c61 }
            r0.notifyAll()     // Catch:{ all -> 0x0c61 }
            monitor-exit(r0)     // Catch:{ all -> 0x0c61 }
            return r4
        L_0x0c61:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0c61 }
            throw r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0c64:
            X.9nP r6 = r0.A0b     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r1 = r6.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0d58
            X.A0d r1 = r0.A0X     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1.BFz()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r10 = r6.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9XX r5 = r6.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2 = 1
        L_0x0c74:
            if (r10 == 0) goto L_0x0d58
            boolean r1 = r10.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0d58
            boolean r1 = r10.A02()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0c81
            goto L_0x0c87
        L_0x0c81:
            if (r10 != r5) goto L_0x0c84
            r2 = 0
        L_0x0c84:
            X.9XX r10 = r10.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0c74
        L_0x0c87:
            r9 = 4
            if (r2 == 0) goto L_0x0d0b
            X.9XX r11 = r6.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r5 = r6.A09(r11)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5Q[] r10 = r0.A0o     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r8 = r10.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean[] r7 = new boolean[r8]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1.A0D     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r11.A00(r7, r1, r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9tN r12 = r11.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9MF r1 = r11.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B3Y r2 = r0.A0a     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5T[] r1 = r1.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2.BjQ(r12, r10, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r2 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r2.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == r9) goto L_0x0cd1
            long r1 = r2.A0D     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r12 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r12 == 0) goto L_0x0cd1
            X.9jS r13 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9WT r12 = r13.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r13.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r19 = r13
            r20 = r12
            r21 = r5
            r23 = r1
            X.9jS r1 = r19.A01(r20, r21, r23)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9Ri r2 = r0.A0Z     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 5
            r2.A00(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0B(r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0cd1:
            boolean[] r6 = new boolean[r8]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r13 = 0
            r5 = 0
        L_0x0cd5:
            if (r13 >= r8) goto L_0x0d35
            r14 = r10[r13]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = r14
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.A01     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = X.AnonymousClass000.A1P(r1)
            r6[r13] = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B2j[] r1 = r11.A0B     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r2 = r1[r13]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r2 == 0) goto L_0x0cec
            int r5 = r5 + 1
        L_0x0cec:
            boolean r1 = r6[r13]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0d08
            r12 = r14
            X.9zD r12 = (X.C208949zD) r12     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B2j r1 = r12.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r2 == r1) goto L_0x0cfb
            r0.A0G(r14)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d08
        L_0x0cfb:
            boolean r1 = r7[r13]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0d08
            long r1 = r0.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r12.A08 = r3     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r12.A02 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r12.A0G(r1, r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0d08:
            int r13 = r13 + 1
            goto L_0x0cd5
        L_0x0d0b:
            r6.A09(r10)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean r1 = r10.A07     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == 0) goto L_0x0d44
            X.9NQ r1 = r10.A02     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r5 = r1.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r0.A06     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r7 = r10.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r5, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B26[] r5 = r10.A0A     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r5 = r5.length     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            boolean[] r5 = new boolean[r5]     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r10.A00(r5, r1, r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9tN r6 = r10.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9MF r1 = r10.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B3Y r5 = r0.A0a     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5Q[] r2 = r0.A0o     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.B5T[] r1 = r1.A04     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r5.BjQ(r6, r2, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            goto L_0x0d44
        L_0x0d35:
            X.9jS r7 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9tN r2 = r11.A03     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9MF r1 = r11.A05     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9jS r1 = r7.A02(r2, r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A09 = r1     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A0M(r6, r5)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0d44:
            X.9jS r1 = r0.A09     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            int r1 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            if (r1 == r9) goto L_0x0d58
            r0.A0H(r3)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r0.A08()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            X.9ik r1 = r0.A0g     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            android.os.Handler r2 = r1.A00     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            r1 = 2
            r2.sendEmptyMessage(r1)     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
        L_0x0d58:
            r0.A04()     // Catch:{ 82J -> 0x0d70, IOException -> 0x0d5c, RuntimeException -> 0x0d7e }
            return r4
        L_0x0d5c:
            r5 = move-exception
            java.lang.String r2 = "Source error."
            r1 = r18
            android.util.Log.e(r1, r2, r5)
            r0.A0K(r3, r3)
            android.os.Handler r6 = r0.A0V
            r1 = 2000(0x7d0, float:2.803E-42)
            X.82J r5 = X.AnonymousClass82J.A00(r5, r3, r1)
            goto L_0x0d92
        L_0x0d70:
            r5 = move-exception
            java.lang.String r2 = "Playback error."
            r1 = r18
            android.util.Log.e(r1, r2, r5)
            r0.A0K(r3, r3)
            android.os.Handler r6 = r0.A0V
            goto L_0x0d92
        L_0x0d7e:
            r5 = move-exception
            java.lang.String r2 = "Internal runtime error."
            r1 = r18
            android.util.Log.e(r1, r2, r5)
            r0.A0K(r3, r3)
            android.os.Handler r6 = r0.A0V
            r2 = 1000(0x3e8, float:1.401E-42)
            r1 = 2
            X.82J r5 = X.AnonymousClass82J.A00(r5, r1, r2)
        L_0x0d92:
            r1 = 2
            X.C165577te.A0w(r6, r5, r1)
            r0.A04()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209329zp.handleMessage(android.os.Message):boolean");
    }

    private long A01(AnonymousClass9WT r11, long j, boolean z, boolean z2) {
        A07();
        this.A0M = false;
        A0A(2);
        C203149nP r5 = this.A0b;
        AnonymousClass9XX r6 = r5.A05;
        AnonymousClass9XX r4 = r6;
        while (true) {
            if (r4 == null) {
                break;
            }
            AnonymousClass9WT r2 = r4.A02.A04;
            if (r11.equals(r2) && r4.A07) {
                Timeline timeline = this.A09.A03;
                int i = r2.A02;
                C195889Wr r22 = this.A0c;
                timeline.A08(r22, i, false);
                int A002 = r22.A00(j);
                if (A002 == -1 || r22.A03.A00[A002] == r4.A02.A02) {
                    r5.A09(r4);
                }
            }
            r4 = r5.A06();
        }
        r5.A09(r4);
        if (r6 != r4 || z2) {
            for (B5Q A0G2 : this.A0P) {
                A0G(A0G2);
            }
            this.A0P = new B5Q[0];
            r6 = null;
        }
        if (r4 != null) {
            A0D(r6);
            if (r4.A06) {
                B5S b5s = r4.A08;
                j = b5s.Bpa(j, z);
                b5s.B5V(j - this.A0T, this.A0k);
            }
            A0B(j);
            A0H(this.A0Q);
        } else {
            r5.A08(true);
            A0B(j);
        }
        this.A0g.A00.sendEmptyMessage(2);
        return j;
    }

    public C209329zp(Handler handler, C202709mU r17, B3Y b3y, C200769iC r19, AnonymousClass9GL r20, AnonymousClass9MF r21, C22774Avk avk, B40 b40, B5Q[] b5qArr, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        B5Q[] b5qArr2 = b5qArr;
        this.A0o = b5qArr2;
        AnonymousClass9GL r6 = r20;
        this.A0e = r6;
        AnonymousClass9MF r12 = r21;
        this.A0q = r12;
        B3Y b3y2 = b3y;
        this.A0a = b3y2;
        C22774Avk avk2 = avk;
        this.A0r = avk2;
        this.A0K = z;
        this.A03 = i;
        this.A0O = false;
        this.A0V = handler;
        this.A0Y = r17;
        B40 b402 = b40;
        this.A0s = b402;
        this.A0b = new C203149nP();
        this.A0S = z2;
        this.A0E = z3;
        this.A0Q = z4;
        this.A0H = z5;
        this.A0F = z6;
        this.A0R = z7;
        this.A0U = j;
        this.A0j = z8;
        this.A00 = i2;
        this.A0n = z10;
        this.A0m = z9;
        this.A0l = z11;
        this.A0J = z12;
        this.A0L = z13;
        this.A0G = z14;
        this.A0I = AnonymousClass000.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1)));
        this.A0T = b3y2.B8i();
        this.A0k = b3y2.Bon();
        this.A0B = C199399fF.A03;
        this.A09 = new C201399jS(Timeline.A00, C206419tN.A03, r12, -9223372036854775807L);
        C20945A0c a0c = null;
        this.A0Z = new C194809Ri();
        int length = b5qArr2.length;
        B26[] b26Arr = new B26[length];
        this.A0p = b26Arr;
        for (int i3 = 0; i3 < length; i3++) {
            C208949zD r0 = b5qArr[i3];
            r0.A00 = i3;
            r0.A05 = r19;
            b26Arr[i3] = r0;
        }
        this.A0X = new C20946A0d(this, b402);
        this.A0f = new C20944A0b(b402);
        this.A0h = z10 ? new C20945A0c(b402) : a0c;
        this.A0i = AnonymousClass001.A0I();
        this.A0P = new B5Q[0];
        this.A0d = new C199579fY();
        this.A0c = new C195889Wr();
        r6.A00 = this;
        r6.A01 = avk2;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.A0W = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        List list = C201079ik.A01;
        this.A0g = new C201079ik(new Handler(looper, this));
    }
}
