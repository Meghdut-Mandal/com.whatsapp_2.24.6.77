package X;

import android.content.Context;

/* renamed from: X.8gV  reason: invalid class name */
public class AnonymousClass8gV extends C178498gd {
    public final /* synthetic */ AnonymousClass8gM A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8gV(Context context, AnonymousClass17Y r13, C29221Vu r14, AnonymousClass9YX r15, AnonymousClass8gM r16, AF7 af7, AnonymousClass5GM r18, String str, boolean z, boolean z2) {
        super(context, r13, r14, r15, af7, r18, "upi-get-banks", str, 4);
        this.A00 = r16;
        this.A02 = z;
        this.A01 = z2;
    }

    public void A05(C202059ky r5) {
        super.A05(r5);
        B1K b1k = this.A00.A00;
        if (b1k != null) {
            b1k.BS3(r5, true, false, this.A02);
        }
    }

    public void A06(C202059ky r4) {
        super.A06(r4);
        B1K b1k = this.A00.A00;
        if (b1k != null) {
            b1k.BS3(r4, false, false, this.A02);
        }
    }

    public void A07(C203399nx r9) {
        super.A07(r9);
        AnonymousClass8gM r3 = this.A00;
        C22958AzA BFB = C165587tf.A0W(r3.A03).BFB();
        C18740tg.A06(BFB);
        AnonymousClass9KU A03 = r3.A02.A03(r3.A00, BFB.BlE(r3.A01, r9));
        B1K b1k = r3.A00;
        if (b1k != null) {
            b1k.BS4(A03.A00, A03.A01, A03.A02, false, this.A01, this.A02);
        }
    }
}
