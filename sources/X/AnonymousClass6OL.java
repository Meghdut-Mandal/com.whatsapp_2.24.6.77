package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6OL  reason: invalid class name */
public class AnonymousClass6OL {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final String A04;
    public final AtomicInteger A05;
    public final /* synthetic */ C139356je A06;

    public AnonymousClass6OL(C139356je r4, String str, long j) {
        this.A06 = r4;
        if (j < 0) {
            C139356je.A04(r4, AnonymousClass000.A0p("Negative Cache Recency Threshold Entered For Query: ", str, AnonymousClass000.A0u()));
        }
        r4.A08.add(str);
        r4.BPA(AnonymousClass000.A0p("recency_threshold_for_", str, AnonymousClass000.A0u()), j);
        this.A04 = str;
        this.A05 = C90484aE.A0v();
        this.A03 = j;
    }

    public final Integer A00() {
        return C023109s.A00(5)[this.A05.get()];
    }

    public void A01() {
        String str;
        C139356je r2;
        String str2;
        Integer A002 = A00();
        String str3 = "CACHE";
        if (A002 == C023109s.A0G) {
            if (!this.A02 || this.A01) {
                r2 = this.A06;
                str2 = AnonymousClass000.A0q(this.A04, AnonymousClass000.A0v("ttrc_source_for_"));
                str3 = "NETWORK";
                r2.BPB(str2, str3);
            }
        } else if (A002 != C023109s.A0C || this.A00) {
            if (A002 != C023109s.A0R) {
                C139356je r22 = this.A06;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Unexpected call to addSourceAnnotation in state ");
                if (A002 != null) {
                    switch (A002.intValue()) {
                        case 1:
                            str = "CACHE_NOT_APPLICABLE_NETWORK_PENDING";
                            break;
                        case 2:
                            str = "CACHE_DONE_NETWORK_PENDING";
                            break;
                        case 3:
                            str = "QUERY_SUCCESSFULLY_COMPLETED";
                            break;
                        case 4:
                            str = "QUERY_NOT_NEEDED";
                            break;
                        default:
                            str = "CACHE_AND_NETWORK_PENDING";
                            break;
                    }
                } else {
                    str = "null";
                }
                C139356je.A04(r22, AnonymousClass000.A0q(str, A0u));
                return;
            }
            return;
        }
        r2 = this.A06;
        str2 = AnonymousClass000.A0q(this.A04, AnonymousClass000.A0v("ttrc_source_for_"));
        r2.BPB(str2, str3);
    }

    public AnonymousClass6OL(C139356je r3, String str) {
        this.A06 = r3;
        this.A04 = str;
        this.A05 = C90514aH.A17();
        this.A03 = -1;
        r3.A09.add(str);
    }
}
