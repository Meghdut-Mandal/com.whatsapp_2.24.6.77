package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: X.82F  reason: invalid class name */
public final class AnonymousClass82F extends C208949zD implements Handler.Callback {
    public int A00;
    public long A01;
    public C207099uY A02;
    public C1688382f A03;
    public C1688282d A04;
    public int A05;
    public long A06;
    public long A07;
    public C1688282d A08;
    public AnonymousClass82Y A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C190989Bd A0E;
    public final C22860AxC A0F;
    public final AnonymousClass9D8 A0G;

    public AnonymousClass82F(Looper looper, C22860AxC axC, AnonymousClass9D8 r5) {
        super(3);
        Handler handler;
        Objects.requireNonNull(axC);
        this.A0F = axC;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A0D = handler;
        this.A0G = r5;
        this.A0E = new C190989Bd();
        this.A06 = -9223372036854775807L;
        this.A01 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    private void A02() {
        this.A09 = null;
        this.A05 = -1;
        C1688282d r0 = this.A04;
        if (r0 != null) {
            r0.release();
            this.A04 = null;
        }
        C1688282d r02 = this.A08;
        if (r02 != null) {
            r02.release();
            this.A08 = null;
        }
    }

    public static void A05(AnonymousClass82F r3) {
        C1688382f r0;
        r3.A0C = true;
        AnonymousClass9D8 r2 = r3.A0G;
        C207099uY r02 = r3.A02;
        Objects.requireNonNull(r02);
        if (r02.A0S.equals("application/x-subrip")) {
            if (r2.A00.sortSubripSubtitles) {
                r0 = new AnonymousClass835();
            } else {
                r0 = new AnonymousClass836();
            }
            r3.A03 = r0;
            return;
        }
        throw AnonymousClass001.A08("Attempted to create decoder for unsupported format");
    }

    public void A0F() {
        this.A02 = null;
        this.A06 = -9223372036854775807L;
        A01();
        this.A01 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        A02();
        C1688382f r0 = this.A03;
        Objects.requireNonNull(r0);
        r0.release();
        this.A03 = null;
        this.A00 = 0;
    }

    public boolean BMw() {
        return true;
    }

    public String getName() {
        return "TextRenderer";
    }

    private long A00() {
        if (this.A05 == -1) {
            return Long.MAX_VALUE;
        }
        Objects.requireNonNull(this.A04);
        if (this.A05 < this.A04.BBg()) {
            return this.A04.BBf(this.A05);
        }
        return Long.MAX_VALUE;
    }

    private void A01() {
        AnonymousClass7c0 r0 = C197429bh.A01;
        List emptyList = Collections.emptyList();
        boolean z = true;
        C200319h9.A02(AnonymousClass000.A1P((this.A07 > -9223372036854775807L ? 1 : (this.A07 == -9223372036854775807L ? 0 : -1))));
        if (this.A01 == -9223372036854775807L) {
            z = false;
        }
        C200319h9.A02(z);
        C197429bh r2 = new C197429bh(emptyList);
        Handler handler = this.A0D;
        if (handler != null) {
            C165577te.A0w(handler, r2, 0);
        } else {
            A04(r2);
        }
    }

    private void A04(C197429bh r6) {
        C22860AxC axC = this.A0F;
        C23931Ak r0 = r6.A00;
        axC.BV0(r0);
        A09 a09 = (A09) axC;
        ArrayList A0I = AnonymousClass001.A0I();
        if (r0 != null) {
            C225614x it = r0.iterator();
            while (it.hasNext()) {
                A0I.add(new C207129ub(((AnonymousClass6TI) it.next()).A05));
            }
        }
        a09.A01.A0o.BV0(A0I);
    }

    public void A0G(long j, boolean z) {
        this.A07 = j;
        A01();
        this.A0A = false;
        this.A0B = false;
        this.A06 = -9223372036854775807L;
        if (this.A00 != 0) {
            A03();
            return;
        }
        A02();
        C1688382f r0 = this.A03;
        Objects.requireNonNull(r0);
        r0.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bb, code lost:
        if (r8 != false) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011c A[LOOP:1: B:64:0x011c->B:99:0x011c, LOOP_START, SYNTHETIC, Splitter:B:64:0x011c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bo3(long r11, long r13) {
        /*
            r10 = this;
            r10.A07 = r11
            boolean r0 = r10.A08
            r5 = 1
            if (r0 == 0) goto L_0x001b
            long r1 = r10.A06
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x001b
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            r10.A02()
            r10.A0B = r5
        L_0x001b:
            boolean r0 = r10.A0B
            if (r0 != 0) goto L_0x01ad
            X.82d r0 = r10.A08
            if (r0 != 0) goto L_0x0052
            X.82f r0 = r10.A03
            java.util.Objects.requireNonNull(r0)
            X.82f r0 = r10.A03     // Catch:{ 82a -> 0x0036 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ 82a -> 0x0036 }
            X.82X r0 = r0.A03()     // Catch:{ 82a -> 0x0036 }
            X.82d r0 = (X.C1688282d) r0     // Catch:{ 82a -> 0x0036 }
            r10.A08 = r0     // Catch:{ 82a -> 0x0036 }
            goto L_0x0052
        L_0x0036:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Subtitle decoding failed. streamFormat="
            r1.append(r0)
            X.9uY r0 = r10.A02
            java.lang.String r1 = X.AnonymousClass000.A0o(r0, r1)
            java.lang.String r0 = "TextRenderer"
            android.util.Log.e(r0, r1, r2)
            r10.A01()
            r10.A03()
            return
        L_0x0052:
            int r0 = r10.A01
            r4 = 2
            if (r0 != r4) goto L_0x01ad
            X.82d r0 = r10.A04
            r3 = 0
            if (r0 == 0) goto L_0x0071
            long r1 = r10.A00()
            r8 = 0
        L_0x0061:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0072
            int r0 = r10.A05
            int r0 = r0 + 1
            r10.A05 = r0
            long r1 = r10.A00()
            r8 = 1
            goto L_0x0061
        L_0x0071:
            r8 = 0
        L_0x0072:
            X.82d r7 = r10.A08
            r2 = 0
            if (r7 == 0) goto L_0x00bb
            r1 = 4
            int r0 = r7.A00
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x00a3
            if (r8 != 0) goto L_0x00bd
            long r8 = r10.A00()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0098
            int r0 = r10.A00
            if (r0 != r4) goto L_0x009d
            r10.A03()
        L_0x0098:
            int r0 = r10.A00
            if (r0 != r4) goto L_0x011c
            return
        L_0x009d:
            r10.A02()
            r10.A0B = r5
            goto L_0x0098
        L_0x00a3:
            long r0 = r7.A01
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x00bb
            X.82d r0 = r10.A04
            if (r0 == 0) goto L_0x00b0
            r0.release()
        L_0x00b0:
            int r0 = r7.BEU(r11)
            r10.A05 = r0
            r10.A04 = r7
            r10.A08 = r2
            goto L_0x00bd
        L_0x00bb:
            if (r8 == 0) goto L_0x0098
        L_0x00bd:
            X.82d r0 = r10.A04
            java.util.Objects.requireNonNull(r0)
            X.82d r0 = r10.A04
            int r6 = r0.BEU(r11)
            if (r6 == 0) goto L_0x0112
            X.82d r0 = r10.A04
            int r0 = r0.BBg()
            if (r0 == 0) goto L_0x0112
            r0 = -1
            X.82d r1 = r10.A04
            if (r6 != r0) goto L_0x010f
            int r0 = r1.BBg()
            int r0 = r0 + -1
        L_0x00dd:
            long r0 = r1.BBf(r0)
        L_0x00e1:
            r9 = 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r6)
            X.C200319h9.A02(r0)
            long r0 = r10.A01
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00f7
            r9 = 0
        L_0x00f7:
            X.C200319h9.A02(r9)
            X.7c0 r0 = X.C197429bh.A01
            X.82d r0 = r10.A04
            java.util.List r0 = r0.BAU(r11)
            X.9bh r1 = new X.9bh
            r1.<init>(r0)
            android.os.Handler r0 = r10.A0D
            if (r0 == 0) goto L_0x0117
            X.C165577te.A0w(r0, r1, r3)
            goto L_0x0098
        L_0x010f:
            int r0 = r6 + -1
            goto L_0x00dd
        L_0x0112:
            X.82d r0 = r10.A04
            long r0 = r0.A01
            goto L_0x00e1
        L_0x0117:
            r10.A04(r1)
            goto L_0x0098
        L_0x011c:
            boolean r0 = r10.A0A     // Catch:{ 82a -> 0x0192 }
            if (r0 != 0) goto L_0x01ad
            X.82Y r6 = r10.A09     // Catch:{ 82a -> 0x0192 }
            if (r6 != 0) goto L_0x0133
            X.82f r0 = r10.A03     // Catch:{ 82a -> 0x0192 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ 82a -> 0x0192 }
            X.82Z r6 = r0.A02()     // Catch:{ 82a -> 0x0192 }
            X.82Y r6 = (X.AnonymousClass82Y) r6     // Catch:{ 82a -> 0x0192 }
            if (r6 == 0) goto L_0x01ad
            r10.A09 = r6     // Catch:{ 82a -> 0x0192 }
        L_0x0133:
            int r0 = r10.A00     // Catch:{ 82a -> 0x0192 }
            if (r0 != r5) goto L_0x0147
            r0 = 4
            r6.A00 = r0     // Catch:{ 82a -> 0x0192 }
            X.82f r0 = r10.A03     // Catch:{ 82a -> 0x0192 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ 82a -> 0x0192 }
            r0.A04(r6)     // Catch:{ 82a -> 0x0192 }
            r10.A09 = r2     // Catch:{ 82a -> 0x0192 }
            r10.A00 = r4     // Catch:{ 82a -> 0x0192 }
            goto L_0x0191
        L_0x0147:
            X.9Bd r7 = r10.A0E     // Catch:{ 82a -> 0x0192 }
            int r1 = r10.A0A(r7, r6, r3)     // Catch:{ 82a -> 0x0192 }
            r0 = -4
            if (r1 != r0) goto L_0x018d
            r1 = 4
            int r0 = r6.A00     // Catch:{ 82a -> 0x0192 }
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)     // Catch:{ 82a -> 0x0192 }
            if (r0 == 0) goto L_0x016a
            r10.A0A = r5     // Catch:{ 82a -> 0x0192 }
            r10.A0C = r3     // Catch:{ 82a -> 0x0192 }
        L_0x015f:
            X.82f r0 = r10.A03     // Catch:{ 82a -> 0x0192 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ 82a -> 0x0192 }
            r0.A04(r6)     // Catch:{ 82a -> 0x0192 }
            r10.A09 = r2     // Catch:{ 82a -> 0x0192 }
            goto L_0x011c
        L_0x016a:
            X.9uY r0 = r7.A00     // Catch:{ 82a -> 0x0192 }
            if (r0 == 0) goto L_0x01ad
            long r0 = r0.A0J     // Catch:{ 82a -> 0x0192 }
            r6.A00 = r0     // Catch:{ 82a -> 0x0192 }
            java.nio.ByteBuffer r0 = r6.A01     // Catch:{ 82a -> 0x0192 }
            if (r0 == 0) goto L_0x0179
            r0.flip()     // Catch:{ 82a -> 0x0192 }
        L_0x0179:
            boolean r1 = r10.A0C     // Catch:{ 82a -> 0x0192 }
            int r0 = r6.A00     // Catch:{ 82a -> 0x0192 }
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0, r5)     // Catch:{ 82a -> 0x0192 }
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r1 = r1 & r0
            r10.A0C = r1     // Catch:{ 82a -> 0x0192 }
            if (r1 != 0) goto L_0x011c
            goto L_0x015f
        L_0x018d:
            r0 = -3
            if (r1 != r0) goto L_0x011c
            return
        L_0x0191:
            return
        L_0x0192:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Subtitle decoding failed. streamFormat="
            r1.append(r0)
            X.9uY r0 = r10.A02
            java.lang.String r1 = X.AnonymousClass000.A0o(r0, r1)
            java.lang.String r0 = "TextRenderer"
            android.util.Log.e(r0, r1, r2)
            r10.A01()
            r10.A03()
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82F.Bo3(long, long):void");
    }

    public int BvJ(C207099uY r3) {
        int A1P;
        String str = r3.A0S;
        if ("application/x-subrip".equals(str)) {
            A1P = 2;
            if (r3.A06 == 0) {
                A1P = 4;
            }
        } else {
            A1P = AnonymousClass000.A1P(C203249nb.A06(str) ? 1 : 0);
        }
        return A1P | 128;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            A04((C197429bh) message.obj);
            return true;
        }
        throw C165617ti.A0V();
    }

    private void A03() {
        A02();
        C1688382f r0 = this.A03;
        Objects.requireNonNull(r0);
        r0.release();
        this.A03 = null;
        this.A00 = 0;
        A05(this);
    }

    public boolean BLh() {
        return this.A0B;
    }
}
