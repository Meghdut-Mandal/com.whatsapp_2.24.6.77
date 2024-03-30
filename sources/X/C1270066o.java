package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.66o  reason: invalid class name and case insensitive filesystem */
public final class C1270066o {
    public final AnonymousClass1JI A00;
    public final C21430zE A01;
    public final AtomicInteger A02 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);

    public final void A00(int i, String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        this.A01.markerPoint(694884634, i, str, str2);
    }

    public final void A01(AnonymousClass5TR r4, int i) {
        this.A01.markerEnd(694884634, i, r4.id);
    }

    public C1270066o(AnonymousClass1JI r3, C21430zE r4) {
        C36321k7.A0x(r4, r3);
        this.A01 = r4;
        this.A00 = r3;
    }
}
