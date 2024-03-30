package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6Tm  reason: invalid class name and case insensitive filesystem */
public final class C132406Tm {
    public static final AtomicInteger A04 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);
    public Integer A00;
    public String A01;
    public final int A02;
    public final C21430zE A03;

    public C132406Tm(C21430zE r2, int i) {
        AnonymousClass00C.A0D(r2, 1);
        this.A03 = r2;
        this.A02 = i;
    }

    public String A02() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        throw C36331k8.A0d("endpointName");
    }

    public void A03() {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerEnd(this.A02, num.intValue(), 3);
            return;
        }
        this.A03.markerEnd(this.A02, 3);
    }

    public void A04() {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerEnd(this.A02, num.intValue(), 2);
            return;
        }
        this.A03.markerEnd(this.A02, 2);
    }

    public void A05() {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerStart(this.A02, num.intValue());
            return;
        }
        this.A03.markerStart(this.A02);
    }

    public final void A06(String str) {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerPoint(this.A02, num.intValue(), str);
            return;
        }
        this.A03.markerPoint(this.A02, str);
    }

    public static final String A00(String str, String str2) {
        return C90464aC.A0f(str, AnonymousClass000.A0v(str2), '_');
    }

    public static void A01(C132406Tm r4, Number number, String str) {
        r4.A03.markerPoint(r4.A02, number.intValue(), A00(str, r4.A02()));
    }
}
