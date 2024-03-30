package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Collections;
import java.util.Map;

public final class A0S implements B2E, C22774Avk {
    public static A0S A0A;
    public static final C23931Ak A0B = C23931Ak.of(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final C23931Ak A0C;
    public static final C23931Ak A0D;
    public static final C23931Ak A0E = C23931Ak.of(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final C23931Ak A0F = C23931Ak.of(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static final C23931Ak A0G = C23931Ak.of(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Map A06;
    public final C199529fT A07;
    public final C191089Bn A08;
    public final B40 A09;

    public /* bridge */ /* synthetic */ void BSX(C202189lD r6, Object obj, int i, boolean z) {
        synchronized (this) {
            this.A02 += (long) i;
        }
    }

    public /* bridge */ /* synthetic */ void BjV(C202189lD r12, Object obj, boolean z) {
        synchronized (this) {
            C200319h9.A02(AnonymousClass000.A1R(this.A01));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.A03);
            this.A05 += (long) i;
            long j = this.A04;
            long j2 = this.A02;
            this.A04 = j + j2;
            if (i > 0) {
                float f = (((float) j2) * 8000.0f) / ((float) i);
                C199529fT r7 = this.A07;
                r7.A01((int) Math.sqrt((double) j2), f);
                if (this.A05 >= 2000 || this.A04 >= 524288) {
                    r7.A00();
                }
                this.A00++;
            }
            int i2 = this.A01 - 1;
            this.A01 = i2;
            if (i2 > 0) {
                this.A03 = elapsedRealtime;
            }
            this.A02 = 0;
        }
    }

    public /* bridge */ /* synthetic */ void BjZ(C202189lD r5, Object obj, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.A01;
            if (i == 0) {
                this.A03 = SystemClock.elapsedRealtime();
            }
            this.A01 = i + 1;
        }
    }

    static {
        Long valueOf = Long.valueOf(SearchActionVerificationClientService.MS_TO_NS);
        A0C = C23931Ak.of(2100000L, 1400000L, valueOf, 890000L, 640000L);
        A0D = C23931Ak.of(2600000L, 1700000L, 1300000L, valueOf, 700000L);
    }

    public A0S(B40 b40, Map map) {
        this.A08 = new C191089Bn();
        this.A07 = new C199529fT();
        this.A09 = b40;
        this.A06 = map;
        this.A00 = 0;
    }

    @Deprecated
    public A0S() {
        this(B40.A00, Collections.emptyMap());
    }
}
