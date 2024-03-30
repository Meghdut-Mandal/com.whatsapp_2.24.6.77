package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.8gU  reason: invalid class name */
public class AnonymousClass8gU extends C178498gd {
    public final /* synthetic */ AnonymousClass8gM A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8gU(Context context, AnonymousClass17Y r13, C29221Vu r14, AnonymousClass9YX r15, AnonymousClass8gM r16, AF7 af7, AnonymousClass5GM r18, String str, boolean z) {
        super(context, r13, r14, r15, af7, r18, "upi-batch", str, 3);
        this.A00 = r16;
        this.A01 = z;
    }

    public void A05(C202059ky r4) {
        super.A05(r4);
        B1K b1k = this.A00.A00;
        if (b1k != null) {
            b1k.BS3(r4, true, true, false);
        }
    }

    public void A06(C202059ky r4) {
        super.A06(r4);
        B1K b1k = this.A00.A00;
        if (b1k != null) {
            b1k.BS3(r4, false, true, false);
        }
    }

    public void A07(C203399nx r13) {
        super.A07(r13);
        AnonymousClass8gM r2 = this.A00;
        C22958AzA BFB = C165587tf.A0W(r2.A03).BFB();
        C18740tg.A06(BFB);
        ArrayList BlE = BFB.BlE(r2.A01, r13);
        C202269lR r0 = r2.A02;
        AnonymousClass9YX r4 = r2.A00;
        AnonymousClass9KU A03 = r0.A03(r4, BlE);
        B1K b1k = r2.A00;
        if (b1k != null) {
            b1k.BS4(A03.A00, A03.A01, A03.A02, true, this.A01, false);
        }
        r4.A03("upi-batch");
        ArrayList arrayList = r4.A05;
        if (!arrayList.contains("upi-list-keys")) {
            r4.A04("upi-list-keys", 500);
        }
        if (!arrayList.contains("upi-get-banks")) {
            r4.A04("upi-get-banks", 500);
        }
    }
}
