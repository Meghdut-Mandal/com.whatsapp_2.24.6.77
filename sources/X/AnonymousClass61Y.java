package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.61Y  reason: invalid class name */
public class AnonymousClass61Y {
    public final C157757ed A00;
    public final C159017ie A01;

    public long A00(C1267665l r10) {
        long now = this.A00.now();
        long now2 = this.A01.now();
        long elapsedRealtimeNanos = r10.A00.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos != 0 && Long.valueOf(elapsedRealtimeNanos) != null) {
            return (((now2 * SearchActionVerificationClientService.MS_TO_NS) - elapsedRealtimeNanos) + 500000) / SearchActionVerificationClientService.MS_TO_NS;
        }
        if (r10.A00() != null) {
            return now - r10.A00().longValue();
        }
        return Long.MIN_VALUE;
    }

    public AnonymousClass61Y(C157757ed r1, C159017ie r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
