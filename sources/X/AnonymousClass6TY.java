package X;

import java.util.Random;

/* renamed from: X.6TY  reason: invalid class name */
public class AnonymousClass6TY {
    public static final AnonymousClass6TY A06 = new AnonymousClass6TY(true);
    public static final AnonymousClass6TY A07 = new AnonymousClass6TY(true);
    public static final AnonymousClass6TY A08 = new AnonymousClass6TY(true);
    public static final AnonymousClass6TY A09 = new AnonymousClass6TY(true);
    public static final AnonymousClass6TY A0A = new AnonymousClass6TY(true);
    public static final AnonymousClass6TY A0B = new AnonymousClass6TY(true);
    public static final AnonymousClass6TY A0C;
    public static final AnonymousClass6TY A0D;
    public static final AnonymousClass6TY A0E;
    public static final AnonymousClass6TY A0F = new AnonymousClass6TY(false);
    public static final AnonymousClass6TY A0G;
    public static final AnonymousClass6TY A0H;
    public static final AnonymousClass6TY A0I = new AnonymousClass6TY(true);
    public static final AnonymousClass6TY A0J = new AnonymousClass6TY(true);
    public static final AnonymousClass6TY A0K = new AnonymousClass6TY(true);
    public static final AnonymousClass6TY A0L;
    public static final AnonymousClass6TY A0M;
    public static final AnonymousClass6TY A0N = new AnonymousClass6TY(false);
    public static final AnonymousClass6TY A0O;
    public static final AnonymousClass6TY[] A0P;
    public static final Random A0Q = new Random();
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03;
    public long[] A04;
    public final boolean A05;

    static {
        AnonymousClass6TY r9 = new AnonymousClass6TY(false);
        A0C = r9;
        AnonymousClass6TY r8 = new AnonymousClass6TY(false);
        A0E = r8;
        AnonymousClass6TY r7 = new AnonymousClass6TY(true);
        A0M = r7;
        AnonymousClass6TY r6 = new AnonymousClass6TY(true);
        A0L = r6;
        AnonymousClass6TY r5 = new AnonymousClass6TY(true);
        A0O = r5;
        AnonymousClass6TY r3 = new AnonymousClass6TY(false);
        A0G = r3;
        AnonymousClass6TY r2 = new AnonymousClass6TY(false);
        A0H = r2;
        AnonymousClass6TY r1 = new AnonymousClass6TY(false);
        A0D = r1;
        AnonymousClass6TY[] r0 = new AnonymousClass6TY[8];
        r0[0] = r9;
        C90464aC.A1D(r8, r7, r6, r0);
        AnonymousClass000.A18(r5, r3, r2, r1, r0);
        A0P = r0;
    }

    public void A03() {
        synchronized (this) {
        }
    }

    private void A00(long j) {
        long[] jArr = this.A04;
        if (jArr == null) {
            jArr = new long[256];
            this.A04 = jArr;
        }
        long j2 = this.A01;
        if (j2 <= j) {
            j2 = j;
        }
        this.A01 = j2;
        long j3 = this.A02;
        if (j3 >= j) {
            j3 = j;
        }
        this.A02 = j3;
        this.A03 += j;
        int i = this.A00;
        if (i < 256) {
            jArr[i] = j;
        } else {
            int nextInt = A0Q.nextInt(i + 1);
            if (nextInt < 256) {
                jArr[nextInt] = j;
            }
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (i2 == 256) {
            A04();
        }
    }

    public static void A01(AnonymousClass6TY r2) {
        r2.A01 = Long.MIN_VALUE;
        r2.A02 = Long.MAX_VALUE;
        r2.A03 = 0;
    }

    public void A04() {
        if (this.A05) {
            synchronized (this) {
                A01(this);
                this.A00 = 0;
            }
            return;
        }
        A01(this);
        this.A00 = 0;
    }

    public void A05(long j) {
        if (this.A05) {
            synchronized (this) {
                A00(j);
            }
            return;
        }
        A00(j);
    }

    public AnonymousClass6TY(boolean z) {
        A01(this);
        this.A05 = z;
    }

    public static void A02(AnonymousClass6TY r2, long j) {
        r2.A05(System.nanoTime() - j);
    }
}
