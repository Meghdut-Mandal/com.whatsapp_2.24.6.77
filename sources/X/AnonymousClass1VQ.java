package X;

import android.os.SystemClock;
import java.util.UUID;

/* renamed from: X.1VQ  reason: invalid class name */
public final class AnonymousClass1VQ {
    public final C19970wo A00;
    public final C20810yC A01;
    public final AnonymousClass1MT A02;
    public final AnonymousClass1VP A03;

    public AnonymousClass1VQ(C19970wo r2, C20810yC r3, AnonymousClass1MT r4, AnonymousClass1VP r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r4, 4);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public void A01() {
        AnonymousClass1VP r7 = this.A03;
        long uptimeMillis = SystemClock.uptimeMillis();
        r7.A00 = uptimeMillis;
        r7.A03 = uptimeMillis;
        r7.A05 = UUID.randomUUID().toString();
        r7.A02 = 0;
        AnonymousClass2SZ r6 = new AnonymousClass2SZ();
        r6.A05 = 1;
        r6.A07 = 0L;
        r6.A0A = 0L;
        r6.A0B = r7.A05;
        long j = r7.A02;
        r6.A09 = Long.valueOf(j);
        long j2 = r7.A01;
        r6.A08 = Long.valueOf(j2);
        r6.A00 = true;
        r7.A04 = r6;
        r7.A02 = j + 1;
        r7.A01 = j2 + 1;
    }

    public void A02(int i) {
        AnonymousClass1VP r5 = this.A03;
        if (i != 12) {
            long uptimeMillis = SystemClock.uptimeMillis();
            AnonymousClass2SZ r4 = new AnonymousClass2SZ();
            AnonymousClass1VP.A01(r4, r5, 2, uptimeMillis);
            r4.A03 = AnonymousClass6V9.A01(i);
            r4.A00 = false;
            r4.A06 = 1;
            r5.A03 = uptimeMillis;
            r5.A02++;
            r5.A01++;
            AnonymousClass2SZ r1 = r5.A04;
            if (r1 != null) {
                r5.A06.Bly(r1);
                r5.A04 = null;
            }
            r5.A06.Bly(r4);
        }
    }

    public void A03(AnonymousClass6FQ r3) {
        AnonymousClass1VP.A02(this.A03, r3, 6);
    }

    public void A04(AnonymousClass6FQ r4) {
        AnonymousClass1VP.A03(this.A03, r4, (Integer) null, 6);
    }

    public void A05(AnonymousClass6FQ r5) {
        AnonymousClass1VP r3 = this.A03;
        AnonymousClass2SZ A002 = AnonymousClass1VP.A00(r3, r5, AnonymousClass4NI.A00, 2);
        if (A002 != null) {
            AnonymousClass2SZ r1 = r3.A04;
            if (r1 != null) {
                r3.A06.Bly(r1);
                r3.A04 = null;
            }
            r3.A06.Bly(A002);
        }
    }

    public void A06(AnonymousClass6FQ r3) {
        AnonymousClass1VP.A02(this.A03, r3, 4);
    }

    public void A07(AnonymousClass6FQ r3) {
        AnonymousClass1VP.A02(this.A03, r3, 5);
    }

    public void A08(AnonymousClass6FQ r3) {
        AnonymousClass1VP.A02(this.A03, r3, 3);
    }

    public void A09(AnonymousClass6FQ r4, int i) {
        AnonymousClass1VP.A03(this.A03, r4, Integer.valueOf(i), 4);
    }

    public void A0A(AnonymousClass6FQ r4, int i) {
        AnonymousClass1VP.A03(this.A03, r4, Integer.valueOf(i), 5);
    }

    public void A0B(AnonymousClass6FQ r4, int i) {
        AnonymousClass1VP.A03(this.A03, r4, Integer.valueOf(i), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r9.A01, 4015) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C20890yK A00(X.AnonymousClass6FQ r21, int r22, int r23, int r24, int r25, long r26, long r28, long r30) {
        /*
            r20 = this;
            long r14 = android.os.SystemClock.elapsedRealtime()
            long r18 = r14 - r26
            r9 = r20
            X.1MT r1 = r9.A02
            boolean r0 = r1.A02()
            r17 = r0 ^ 1
            r0 = 1
            r10 = r22
            if (r10 == r0) goto L_0x002f
            r0 = 5
            if (r10 == r0) goto L_0x002f
            java.lang.Long r6 = java.lang.Long.valueOf(r30)
        L_0x001c:
            r7 = r21
            int r3 = r7.A02
            java.lang.Integer r5 = X.AnonymousClass6V9.A01(r3)
            java.lang.Integer r4 = r7.A01()
            int r16 = r7.A00()
            r8 = 0
            monitor-enter(r1)
            goto L_0x0031
        L_0x002f:
            r6 = 0
            goto L_0x001c
        L_0x0031:
            X.1MU r0 = r1.A00     // Catch:{ all -> 0x0152 }
            X.1MU r2 = new X.1MU     // Catch:{ all -> 0x0152 }
            r2.<init>(r0)     // Catch:{ all -> 0x0152 }
            monitor-exit(r1)
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0115
            long r0 = r2.A02
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0115
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C18740tg.A06(r0)
            long r0 = r0.longValue()
            long r26 = r26 - r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 10
            long r11 = r11.toMillis(r0)
            int r0 = (r26 > r11 ? 1 : (r26 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0115
            long r0 = r2.A02
            long r14 = r14 - r0
            java.lang.Long r8 = java.lang.Long.valueOf(r14)
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C18740tg.A06(r0)
            int r2 = r0.intValue()
            r12 = 3
            r1 = 2
            r0 = 1
            if (r2 == r0) goto L_0x0112
            if (r2 == r1) goto L_0x010f
            if (r2 != r12) goto L_0x007c
            r12 = 4
        L_0x007c:
            r1 = 1
            r2 = r25
            if (r25 == 0) goto L_0x010a
            r0 = 2
            if (r2 == r1) goto L_0x0090
            r1 = 3
            if (r2 == r0) goto L_0x010a
            r0 = 4
            if (r2 == r1) goto L_0x0090
            r1 = 5
            if (r2 == r0) goto L_0x010a
            if (r2 != r1) goto L_0x0108
            r0 = 6
        L_0x0090:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x0094:
            r0 = 12
            r15 = 0
            if (r3 != r0) goto L_0x00a7
            r15 = 1
            X.0yC r2 = r9.A01
            r1 = 4015(0xfaf, float:5.626E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r14 = 1
            if (r0 == 0) goto L_0x00a8
        L_0x00a7:
            r14 = 0
        L_0x00a8:
            r0 = r23
            long r2 = (long) r0
            r0 = r24
            long r0 = (long) r0
            java.lang.Boolean r9 = r7.A00
            if (r9 == 0) goto L_0x0106
            boolean r13 = r9.booleanValue()
        L_0x00b6:
            java.lang.Long r9 = r7.A01
            if (r15 != 0) goto L_0x0118
            X.2So r7 = new X.2So
            r7.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.A07 = r10
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r7.A0C = r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A0D = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r7.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r7.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r7.A01 = r0
            r7.A0B = r9
            java.lang.Long r0 = java.lang.Long.valueOf(r28)
            r7.A0A = r0
            if (r6 == 0) goto L_0x00ef
            r7.A0E = r6
        L_0x00ef:
            r7.A05 = r5
            r7.A04 = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r7.A06 = r0
            if (r8 == 0) goto L_0x00fd
            r7.A08 = r8
        L_0x00fd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r7.A03 = r0
            r7.A02 = r11
            return r7
        L_0x0106:
            r13 = 0
            goto L_0x00b6
        L_0x0108:
            r11 = 0
            goto L_0x0094
        L_0x010a:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            goto L_0x0094
        L_0x010f:
            r12 = 2
            goto L_0x007c
        L_0x0112:
            r12 = 1
            goto L_0x007c
        L_0x0115:
            r12 = 3
            goto L_0x007c
        L_0x0118:
            if (r14 == 0) goto L_0x011c
            r7 = 0
            return r7
        L_0x011c:
            X.2SL r7 = new X.2SL
            r7.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r7.A05 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r7.A08 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r7.A07 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r7.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r7.A01 = r0
            if (r6 == 0) goto L_0x0143
            r7.A09 = r6
        L_0x0143:
            r7.A04 = r4
            if (r8 == 0) goto L_0x0149
            r7.A06 = r8
        L_0x0149:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r7.A03 = r0
            r7.A02 = r11
            return r7
        L_0x0152:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VQ.A00(X.6FQ, int, int, int, int, long, long, long):X.0yK");
    }
}
