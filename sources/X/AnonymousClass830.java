package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.List;

/* renamed from: X.830  reason: invalid class name */
public class AnonymousClass830 extends C196079Xo implements C23062B2k {
    public final AnonymousClass833 A00;

    public AnonymousClass9WU BH9(long j) {
        C194829Rk r4;
        int i;
        long j2 = j;
        AnonymousClass833 r42 = this.A00;
        if (r42 instanceof AnonymousClass832) {
            AnonymousClass832 r43 = (AnonymousClass832) r42;
            List list = r43.A04;
            long j3 = 0;
            if (list != null) {
                AnonymousClass9GK r5 = r43.A00;
                int i2 = (int) (j - r43.A03);
                if (!r43.A02(i2).A05 || r5 == null) {
                    j3 = r43.A02(i2).A04;
                    r4 = r43.A02;
                } else {
                    int i3 = r43.A00;
                    if (i3 == list.size()) {
                        i = ((i2 + r5.A00) - i3) + 1;
                    } else if (i2 >= i3) {
                        i = ((AnonymousClass9SE) C36401kF.A0n(list)).A01 + (i2 - i3) + 1;
                    } else {
                        i = r43.A02(i2).A01;
                    }
                    j2 = (long) i;
                    r4 = r5.A01;
                }
            } else {
                j3 = (j - r43.A03) * r43.A01;
                r4 = r43.A02;
            }
            C207099uY r0 = this.A00;
            return new AnonymousClass9WU(0, r4.A00(r0.A0Q, r0.A04, j2, j3), -1);
        }
        AnonymousClass831 r44 = (AnonymousClass831) r42;
        return (AnonymousClass9WU) r44.A00.get((int) (j - r44.A03));
    }

    public long BBL(long j, long j2) {
        long j3;
        AnonymousClass833 r6 = this.A00;
        if (r6.A04 != null) {
            j3 = r6.A02((int) (j - r6.A03)).A03;
        } else {
            int A002 = r6.A00(-9223372036854775807L);
            if (A002 != -1 && j == (r6.A03 + ((long) A002)) - 1) {
                return -9223372036854775807L - r6.A01(j);
            }
            j3 = r6.A01;
        }
        return (j3 * SearchActionVerificationClientService.MS_TO_NS) / r6.A01;
    }

    public long BBu() {
        return this.A00.A03;
    }

    public int BH8(long j) {
        return this.A00.A00(j);
    }

    public AnonymousClass830(C207099uY r1, AnonymousClass833 r2, String str, List list) {
        super(r1, r2, str, list);
        this.A00 = r2;
    }
}
