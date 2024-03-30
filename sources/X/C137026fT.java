package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.6fT  reason: invalid class name and case insensitive filesystem */
public final class C137026fT implements C159847k1 {
    public C007403e A00;
    public final C009003v A01;
    public final AnonymousClass040 A02;

    public void BQW() {
        C007403e r1 = this.A00;
        if (r1 != null) {
            r1.B2S(new AnonymousClass79K());
        }
        this.A00 = null;
    }

    public void BYM() {
        C007403e r1 = this.A00;
        if (r1 != null) {
            r1.B2S(new AnonymousClass79K());
        }
        this.A00 = null;
    }

    public void BeY() {
        C007403e r3 = this.A00;
        if (r3 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause((Throwable) null);
            r3.B2S(cancellationException);
        }
        this.A00 = C36391kE.A12(this.A01, this.A02);
    }

    public C137026fT(C005102h r2, C009003v r3) {
        this.A01 = r3;
        this.A02 = C009403z.A02(r2);
    }
}
