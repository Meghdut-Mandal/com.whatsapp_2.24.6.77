package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1HC  reason: invalid class name */
public final class AnonymousClass1HC {
    public Integer A00;
    public final C21430zE A01;
    public final AtomicInteger A02 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);

    public AnonymousClass1HC(C21430zE r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
    }

    public final void A01(int i, String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A01.markerPoint(354170068, i, str);
    }

    public final void A05(C117775mo r4, String str, int i) {
        AnonymousClass00C.A0D(str, 2);
        this.A01.markerAnnotate(354170068, i, r4.A00, str);
    }

    public final int A00() {
        int andIncrement = this.A02.getAndIncrement();
        this.A01.markerStart(354170068, andIncrement);
        return andIncrement;
    }

    public final void A02(C52322pF r4, int i) {
        this.A01.markerEnd(354170068, i, r4.id);
    }

    public final void A03(C117775mo r4, int i, int i2) {
        this.A01.markerAnnotate(354170068, i, r4.A00, i2);
    }

    public final void A04(C117775mo r7, int i, long j) {
        this.A01.markerAnnotate(354170068, i, r7.A00, j);
    }
}
