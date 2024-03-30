package X;

import android.net.Uri;
import java.util.Objects;

public final class A0R implements B0X {
    public long A00;
    public long A01 = -1;
    public long A02;
    public C202189lD A03;
    public boolean A04 = true;
    public final C191039Bi A05 = new C191039Bi();
    public final Uri A06;
    public final AnonymousClass9J1 A07;
    public final B39 A08;
    public final C199339f9 A09;
    public volatile boolean A0A;
    public final /* synthetic */ C209379zu A0B;

    public void B2W() {
        this.A0A = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        r0 = r13.A02;
        r9.A00 = r0;
        r6.A00 = r0 - r6.A03.A01;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0109 A[SYNTHETIC, Splitter:B:69:0x0109] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BOE() {
        /*
            r19 = this;
            r8 = 0
            r7 = 0
        L_0x0002:
            r6 = r19
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x010d
            r12 = 1
            X.9Bi r9 = r6.A05     // Catch:{ all -> 0x0104 }
            long r2 = r9.A00     // Catch:{ all -> 0x0104 }
            X.9lD r0 = X.C202189lD.A09     // Catch:{ all -> 0x0104 }
            android.net.Uri r14 = r6.A06     // Catch:{ all -> 0x0104 }
            r17 = -1
            X.9zu r10 = r6.A0B     // Catch:{ all -> 0x0104 }
            X.9lD r13 = new X.9lD     // Catch:{ all -> 0x0104 }
            r15 = r2
            r13.<init>(r14, r15, r17)     // Catch:{ all -> 0x0104 }
            r6.A03 = r13     // Catch:{ all -> 0x0104 }
            X.B39 r14 = r6.A08     // Catch:{ all -> 0x0104 }
            long r0 = r14.Bks(r13)     // Catch:{ all -> 0x0104 }
            r6.A01 = r0     // Catch:{ all -> 0x0104 }
            int r4 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x002c
            long r0 = r0 + r2
            r6.A01 = r0     // Catch:{ all -> 0x0104 }
        L_0x002c:
            X.9jm r11 = new X.9jm     // Catch:{ all -> 0x0104 }
            r13 = r11
            r17 = r0
            r13.<init>(r14, r15, r17)     // Catch:{ all -> 0x0104 }
            X.9J1 r1 = r6.A07     // Catch:{ all -> 0x00f5 }
            android.net.Uri r4 = r14.BIj()     // Catch:{ all -> 0x00f5 }
            X.B2h r13 = r1.A00     // Catch:{ all -> 0x00f5 }
            if (r13 != 0) goto L_0x005f
            X.B2h[] r15 = r1.A02     // Catch:{ all -> 0x00f5 }
            int r5 = r15.length     // Catch:{ all -> 0x00f5 }
            r13 = 0
        L_0x0042:
            if (r13 >= r5) goto L_0x0056
            r0 = r15[r13]     // Catch:{ all -> 0x00f5 }
            boolean r16 = r0.BuG(r11)     // Catch:{ EOFException -> 0x004f, all -> 0x00aa }
            if (r16 == 0) goto L_0x004f
            r1.A00 = r0     // Catch:{ EOFException -> 0x004f, all -> 0x00aa }
            goto L_0x0054
        L_0x004f:
            r11.A01 = r8     // Catch:{ all -> 0x00f5 }
            int r13 = r13 + 1
            goto L_0x0042
        L_0x0054:
            r11.A01 = r8     // Catch:{ all -> 0x00f5 }
        L_0x0056:
            X.B2h r13 = r1.A00     // Catch:{ all -> 0x00f5 }
            if (r13 == 0) goto L_0x00b1
            X.9zu r0 = r1.A01     // Catch:{ all -> 0x00f5 }
            r13.BKL(r0)     // Catch:{ all -> 0x00f5 }
        L_0x005f:
            boolean r0 = r6.A04     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x006a
            long r0 = r6.A02     // Catch:{ all -> 0x00f5 }
            r13.BpY(r2, r0)     // Catch:{ all -> 0x00f5 }
            r6.A04 = r8     // Catch:{ all -> 0x00f5 }
        L_0x006a:
            boolean r0 = r6.A0A     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x0098
            X.9f9 r15 = r6.A09     // Catch:{ all -> 0x00f5 }
            monitor-enter(r15)     // Catch:{ all -> 0x00f5 }
        L_0x0071:
            boolean r0 = r15.A00     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x0079
            r15.wait()     // Catch:{ all -> 0x00ae }
            goto L_0x0071
        L_0x0079:
            monitor-exit(r15)     // Catch:{ all -> 0x00f5 }
            int r7 = r13.Bmm(r11, r9)     // Catch:{ all -> 0x00f5 }
            long r4 = r11.A02     // Catch:{ all -> 0x00f5 }
            long r0 = r10.A0O     // Catch:{ all -> 0x00f5 }
            long r0 = r0 + r2
            int r16 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r16 <= 0) goto L_0x0092
            r2 = r4
            r15.A00()     // Catch:{ all -> 0x00f5 }
            android.os.Handler r1 = r10.A0P     // Catch:{ all -> 0x00f5 }
            java.lang.Runnable r0 = r10.A0W     // Catch:{ all -> 0x00f5 }
            r1.post(r0)     // Catch:{ all -> 0x00f5 }
        L_0x0092:
            if (r7 == 0) goto L_0x006a
            if (r7 != r12) goto L_0x0098
            r7 = 0
            goto L_0x00a3
        L_0x0098:
            long r0 = r11.A02
            r9.A00 = r0
            X.9lD r2 = r6.A03
            long r2 = r2.A01
            long r0 = r0 - r2
            r6.A00 = r0
        L_0x00a3:
            r14.close()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            if (r7 != 0) goto L_0x010d
            goto L_0x0002
        L_0x00aa:
            r1 = move-exception
            r11.A01 = r8     // Catch:{ all -> 0x00f5 }
            goto L_0x00f4
        L_0x00ae:
            r1 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f4
        L_0x00b1:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = ""
            r2.append(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "  Content Length: "
            r2.append(r0)     // Catch:{ all -> 0x00f5 }
            long r0 = r11.A04     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "None of the available extractors ("
            java.lang.StringBuilder r1 = X.C90484aE.A0q(r0, r2)     // Catch:{ all -> 0x00f5 }
        L_0x00d3:
            if (r8 >= r5) goto L_0x00e6
            r0 = r15[r8]     // Catch:{ all -> 0x00f5 }
            X.AnonymousClass000.A1C(r0, r1)     // Catch:{ all -> 0x00f5 }
            int r0 = r5 + -1
            if (r8 >= r0) goto L_0x00e3
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00e3:
            int r8 = r8 + 1
            goto L_0x00d3
        L_0x00e6:
            X.C36351kA.A1K(r1, r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = ") could read the stream."
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r2)     // Catch:{ all -> 0x00f5 }
            X.82I r1 = new X.82I     // Catch:{ all -> 0x00f5 }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x00f5 }
        L_0x00f4:
            throw r1     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r4 = move-exception
            if (r7 == r12) goto L_0x0105
            long r2 = r11.A02
            r9.A00 = r2
            X.9lD r0 = r6.A03
            long r0 = r0.A01
            long r2 = r2 - r0
            r6.A00 = r2
            goto L_0x0105
        L_0x0104:
            r4 = move-exception
        L_0x0105:
            X.B39 r0 = r6.A08
            if (r0 == 0) goto L_0x010c
            r0.close()     // Catch:{ IOException -> 0x010c }
        L_0x010c:
            throw r4
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0R.BOE():void");
    }

    public A0R(Uri uri, AnonymousClass9J1 r4, C209379zu r5, B39 b39, C199339f9 r7) {
        this.A0B = r5;
        Objects.requireNonNull(uri);
        this.A06 = uri;
        Objects.requireNonNull(b39);
        this.A08 = b39;
        Objects.requireNonNull(r4);
        this.A07 = r4;
        this.A09 = r7;
    }
}
