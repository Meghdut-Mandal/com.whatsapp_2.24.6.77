package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.6eH  reason: invalid class name and case insensitive filesystem */
public final class C136376eH implements C161417ms {
    public final int A00;
    public final AnonymousClass7dY A01;

    public long BBI(float f, float f2, float f3) {
        return C90504aG.A0E(0 + this.A00);
    }

    public /* synthetic */ float BBa(float f, float f2, float f3) {
        return BIu(f, f2, f3, C90504aG.A0E(0 + this.A00));
    }

    public /* bridge */ /* synthetic */ C160547lB BxH(C156857b4 r3) {
        return new C136416eM(new C163147pj((C161417ms) this));
    }

    public C136376eH(AnonymousClass7dY r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public float BIq(float f, float f2, float f3, long j) {
        int i = this.A00;
        float Bvz = this.A01.Bvz(C15040mb.A01(((float) C15040mb.A04((j / SearchActionVerificationClientService.MS_TO_NS) - ((long) 0), 0, (long) i)) / ((float) i), 0.0f, 1.0f));
        return C90514aH.A00(f, ((float) 1) - Bvz, f2, Bvz);
    }

    public float BIu(float f, float f2, float f3, long j) {
        long A04 = C15040mb.A04((j / SearchActionVerificationClientService.MS_TO_NS) - ((long) 0), 0, (long) this.A00);
        int i = (A04 > 0 ? 1 : (A04 == 0 ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        float f4 = f3;
        if (i == 0) {
            return f3;
        }
        float f5 = f2;
        return (BIq(f, f5, f4, A04 * SearchActionVerificationClientService.MS_TO_NS) - BIq(f, f5, f4, (A04 - 1) * SearchActionVerificationClientService.MS_TO_NS)) * 1000.0f;
    }

    public C136376eH() {
        this(C113945gO.A00, 300);
    }
}
