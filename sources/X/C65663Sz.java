package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.3Sz  reason: invalid class name and case insensitive filesystem */
public class C65663Sz {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public AnonymousClass3T1 A07;
    public long A08;
    public final UserJid A09;
    public final C19970wo A0A;

    public synchronized int A02() {
        return this.A00;
    }

    public synchronized int A03() {
        return this.A01;
    }

    public synchronized long A04() {
        return this.A04;
    }

    public synchronized long A05() {
        return this.A08;
    }

    public synchronized C65663Sz A06() {
        return new C65663Sz(this.A0A, this);
    }

    public synchronized C65663Sz A07(AnonymousClass3T1 r6) {
        this.A07 = r6;
        long j = r6.A1O;
        this.A04 = j;
        this.A08 = r6.A0I;
        this.A00++;
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 1) {
            this.A03 = j;
        } else {
            if (i <= 2) {
            }
            A01(r6);
        }
        this.A02 = j;
        A01(r6);
        return A06();
    }

    public synchronized void A08(int i) {
        this.A00 = i;
    }

    public synchronized void A09(long j) {
        this.A02 = j;
    }

    public synchronized void A0A(long j) {
        this.A08 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if ((X.C19970wo.A00(r6.A0A) - r6.A08) <= 86400000) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0C() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.whatsapp.jid.UserJid r0 = r6.A09     // Catch:{ all -> 0x001b }
            boolean r0 = r0 instanceof X.C177638e7     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0018
            X.0wo r0 = r6.A0A     // Catch:{ all -> 0x001b }
            long r4 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x001b }
            long r0 = r6.A08     // Catch:{ all -> 0x001b }
            long r4 = r4 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            monitor-exit(r6)
            return r0
        L_0x001b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65663Sz.A0C():boolean");
    }

    public synchronized boolean A0D(AnonymousClass3T1 r6) {
        return AnonymousClass000.A1R((r6.A1O > this.A05 ? 1 : (r6.A1O == this.A05 ? 0 : -1)));
    }

    public synchronized String toString() {
        StringBuilder A0u;
        A0u = AnonymousClass000.A0u();
        A0u.append("StatusInfo[jid=");
        A0u.append(this.A09);
        A0u.append(", msgId=");
        A0u.append(this.A04);
        A0u.append(", lastRead=");
        A0u.append(this.A05);
        A0u.append(", lastSent=");
        A0u.append(this.A06);
        A0u.append(", firstUnread=");
        A0u.append(this.A03);
        A0u.append(", autoDownloadLimit=");
        A0u.append(this.A02);
        A0u.append(", ts=");
        A0u.append(this.A08);
        A0u.append(", unreadCount=");
        A0u.append(this.A01);
        A0u.append(", total=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q(" ]", A0u);
    }

    public boolean A0B() {
        return C36361kB.A1a(this.A09, C223613z.A00);
    }

    public C65663Sz(C19970wo r3, UserJid userJid, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6) {
        this.A0A = r3;
        this.A09 = userJid;
        this.A04 = j;
        this.A05 = j2;
        this.A06 = j3;
        this.A03 = j4;
        this.A02 = Math.max(j5, j4);
        this.A08 = j6;
        this.A01 = i;
        this.A00 = i2;
    }

    public static Long A00(Iterator it) {
        return Long.valueOf(((C65663Sz) it.next()).A05());
    }

    public static String A01(AnonymousClass3T1 r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[id=");
        C64933Qa r1 = r3.A1J;
        A0u.append(r1.A01);
        A0u.append(", from_me=");
        A0u.append(r1.A02);
        A0u.append(", remote_resource=");
        A0u.append(r3.A0J());
        return AnonymousClass000.A0q("]", A0u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65663Sz(X.C19970wo r34, X.C65663Sz r35) {
        /*
            r33 = this;
            r15 = r35
            com.whatsapp.jid.UserJid r14 = r15.A09
            long r10 = r15.A04
            long r8 = r15.A05
            long r6 = r15.A06
            long r4 = r15.A03
            long r2 = r15.A02
            long r0 = r15.A08
            int r13 = r15.A01
            int r12 = r15.A00
            r16 = r33
            r17 = r34
            r31 = r0
            r29 = r2
            r27 = r4
            r25 = r6
            r23 = r8
            r21 = r10
            r19 = r13
            r20 = r12
            r18 = r14
            r16.<init>(r17, r18, r19, r20, r21, r23, r25, r27, r29, r31)
            X.3T1 r1 = r15.A07
            r0 = r16
            r0.A07 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65663Sz.<init>(X.0wo, X.3Sz):void");
    }

    public C65663Sz(C19970wo r3, UserJid userJid) {
        this.A0A = r3;
        this.A09 = userJid;
        this.A04 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A08 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }
}
