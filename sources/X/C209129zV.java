package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.9zV  reason: invalid class name and case insensitive filesystem */
public final class C209129zV implements B29 {
    public final /* synthetic */ C209219ze A00;

    public boolean BN9() {
        return true;
    }

    public C209129zV(C209219ze r1) {
        this.A00 = r1;
    }

    public long BBK() {
        C209219ze r0 = this.A00;
        return (r0.A05 * SearchActionVerificationClientService.MS_TO_NS) / ((long) r0.A0B.A00);
    }

    public AnonymousClass9VL BH7(long j) {
        C209219ze r8 = this.A00;
        long A0E = C165597tg.A0E((long) r8.A0B.A00, j);
        long j2 = r8.A09;
        long j3 = r8.A08;
        C199759fu r1 = new C199759fu(j, Math.max(j2, Math.min((j2 + ((A0E * (j3 - j2)) / r8.A05)) - AnonymousClass6X5.A0L, j3 - 1)));
        return new AnonymousClass9VL(r1, r1);
    }
}
