package X;

import java.util.NoSuchElementException;

/* renamed from: X.7Ie  reason: invalid class name and case insensitive filesystem */
public final class C151837Ie extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C94264hv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151837Ie(C94264hv r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6QC A02;
        C94264hv r5 = this.this$0;
        AnonymousClass605 r3 = r5.A0A;
        while (AnonymousClass000.A1P(r3.A00.A00)) {
            C1506776e r6 = r3.A00;
            int i = r6.A00;
            if (i != 0) {
                AnonymousClass6QC r2 = (AnonymousClass6QC) ((AnonymousClass61R) r6.A01[i - 1]).A00.invoke();
                if (r2 != null && !C94264hv.A04(r5, r2, r5.A00)) {
                    break;
                }
                ((AnonymousClass61R) r6.A04(r6.A00 - 1)).A01.resumeWith(AnonymousClass0AJ.A00);
            } else {
                throw new NoSuchElementException("MutableVector is empty.");
            }
        }
        C94264hv r1 = this.this$0;
        if (r1.A07 && (A02 = C94264hv.A02(r1)) != null) {
            C94264hv r22 = this.this$0;
            if (C94264hv.A04(r22, A02, r22.A00)) {
                this.this$0.A07 = false;
            }
        }
        C94264hv r0 = this.this$0;
        r0.A0B.A00 = C94264hv.A00(r0);
        return AnonymousClass0AJ.A00;
    }
}
