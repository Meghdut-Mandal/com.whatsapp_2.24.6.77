package X;

import android.os.SystemClock;
import java.net.URL;

/* renamed from: X.6Fk  reason: invalid class name */
public class AnonymousClass6Fk {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public long A05 = -1;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = -1;
    public long A09;
    public long A0A;
    public long A0B = -1;
    public long A0C = -1;
    public long A0D;
    public long A0E = -1;
    public long A0F;
    public C133136Wx A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Exception A0J;
    public Float A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public URL A0Z;
    public boolean A0a;
    public boolean A0b;
    public long A0c;
    public long A0d = -1;
    public long A0e = -1;
    public final long A0f = SystemClock.elapsedRealtime();
    public final C25471Gl A0g;

    public AnonymousClass6Fk(C25471Gl r3, int i) {
        this.A0g = r3;
        this.A00 = i;
    }

    public final synchronized long A05() {
        return this.A0c;
    }

    public final synchronized long A06() {
        return this.A0F;
    }

    public final synchronized void A0A(long j, long j2) {
        this.A0F = j;
        this.A0c += j2;
    }

    public final long A01() {
        long j = this.A08;
        if (j != -1) {
            long j2 = this.A0d;
            if (j2 != -1) {
                return j2;
            }
            if (this.A05 == -1) {
                return C90514aH.A0J(j);
            }
        }
        return 0;
    }

    public final long A02() {
        long j = this.A08;
        if (j != -1) {
            long j2 = this.A0e;
            if (j2 != -1) {
                return j2;
            }
            if (this.A05 == -1) {
                return C90514aH.A0J(j);
            }
        }
        return 0;
    }

    public final long A03() {
        long j = this.A08;
        if (j != -1) {
            long j2 = this.A0E;
            if (j2 != -1) {
                return j2;
            }
            if (this.A05 == -1) {
                return C90514aH.A0J(j);
            }
        }
        return 0;
    }

    public final long A04() {
        long j = this.A08;
        if (j == -1) {
            return 0;
        }
        long j2 = this.A05;
        if (j2 == -1) {
            j2 = SystemClock.elapsedRealtime();
        }
        return j2 - j;
    }

    public final void A07() {
        long j = this.A08;
        if (j != -1) {
            this.A0d = C90514aH.A0J(j);
            this.A03 = 1;
        }
    }

    public final void A08() {
        long j = this.A0B;
        if (j != -1) {
            this.A0P = C90494aF.A0V(j);
        }
    }

    public final void A09() {
        long j = this.A08;
        if (j != -1) {
            this.A0e = C90514aH.A0J(j);
        }
    }

    public final void A0B(Exception exc) {
        Class<?> cls;
        if (exc instanceof AnonymousClass5V2) {
            Throwable cause = exc.getCause();
            if (cause == null) {
                cause = exc;
            }
            cls = cause.getClass();
        } else {
            if (exc != null) {
                cls = exc.getClass();
            }
            this.A0J = exc;
        }
        this.A0V = cls.getName();
        this.A0J = exc;
    }

    public static void A00(AnonymousClass6Fk r1, Exception exc, URL url) {
        r1.A0B(exc);
        r1.A0Y = AnonymousClass6VO.A01(url);
    }

    public final boolean A0C() {
        return AnonymousClass000.A1P((A01() > -1 ? 1 : (A01() == -1 ? 0 : -1)));
    }

    public String toString() {
        Long A0h;
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("MMS type: ");
        A0u2.append(this.A0g);
        A0u2.append(' ');
        StringBuilder A0j = C90464aC.A0j(A0u2, A0u);
        A0j.append("retry count: ");
        A0j.append(this.A0D);
        A0j.append(' ');
        StringBuilder A0j2 = C90464aC.A0j(A0j, A0u);
        A0j2.append("network stack: ");
        A0j2.append(this.A02);
        A0j2.append(' ');
        StringBuilder A0j3 = C90464aC.A0j(A0j2, A0u);
        A0j3.append("connection type: ");
        A0j3.append(this.A0M);
        A0j3.append(' ');
        StringBuilder A0j4 = C90464aC.A0j(A0j3, A0u);
        A0j4.append("connection class: ");
        A0j4.append(this.A0U);
        A0j4.append(' ');
        StringBuilder A0j5 = C90464aC.A0j(A0j4, A0u);
        A0j5.append("url: ");
        A0j5.append(this.A0Z);
        StringBuilder A0j6 = C90464aC.A0j(A0j5, A0u);
        A0j6.append("download time: ");
        A0j6.append(A04());
        StringBuilder A0j7 = C90464aC.A0j(A0j6, A0u);
        A0j7.append("queue time: ");
        long j = this.A08;
        if (j == -1) {
            A0h = null;
        } else {
            A0h = C90504aG.A0h(j, this.A0f);
        }
        A0j7.append(A0h);
        StringBuilder A0j8 = C90464aC.A0j(A0j7, A0u);
        A0j8.append("connection time: ");
        A0j8.append(A01());
        StringBuilder A0j9 = C90464aC.A0j(A0j8, A0u);
        A0j9.append("route selection delay: ");
        A0j9.append(this.A0S);
        StringBuilder A0j10 = C90464aC.A0j(A0j9, A0u);
        A0j10.append("network time: ");
        A0j10.append(A02());
        StringBuilder A0j11 = C90464aC.A0j(A0j10, A0u);
        A0j11.append("connection reused: ");
        A0j11.append(this.A0H);
        StringBuilder A0j12 = C90464aC.A0j(A0j11, A0u);
        A0j12.append("response code: ");
        A0j12.append(this.A0R);
        StringBuilder A0j13 = C90464aC.A0j(A0j12, A0u);
        A0j13.append("total bytes transferred: ");
        A0j13.append(this.A0F);
        StringBuilder A0j14 = C90464aC.A0j(A0j13, A0u);
        A0j14.append("media ip: ");
        A0j14.append(this.A0Y);
        StringBuilder A0j15 = C90464aC.A0j(A0j14, A0u);
        A0j15.append("exception: ");
        A0j15.append(this.A0V);
        StringBuilder A0j16 = C90464aC.A0j(A0j15, A0u);
        A0j16.append("download stage: ");
        A0j16.append(this.A03);
        StringBuilder A0j17 = C90464aC.A0j(A0j16, A0u);
        A0j17.append("download resume point: ");
        long j2 = this.A07;
        if (j2 == -1) {
            j2 = 0;
        }
        A0j17.append(j2);
        C36351kA.A1K(A0j17, A0u);
        return C36381kD.A0y(A0u);
    }
}
