package X;

import android.content.Context;

/* renamed from: X.8gY  reason: invalid class name */
public class AnonymousClass8gY extends C178498gd {
    public final /* synthetic */ C22966AzI A00;
    public final /* synthetic */ AnonymousClass8gN A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8gY(Context context, AnonymousClass17Y r8, C29221Vu r9, AnonymousClass9YX r10, C22966AzI azI, AnonymousClass8gN r12, String str) {
        super(context, r8, r9, r10, "register-alias");
        this.A01 = r12;
        this.A02 = str;
        this.A00 = azI;
    }

    public void A05(C202059ky r3) {
        AnonymousClass8gN.A00(r3, this.A01, this.A02);
        super.A05(r3);
        this.A00.BeP((C206719tr) null, r3);
    }

    public void A06(C202059ky r3) {
        AnonymousClass8gN.A00(r3, this.A01, this.A02);
        super.A06(r3);
        this.A00.BeP((C206719tr) null, r3);
    }

    public void A07(C203399nx r10) {
        C203399nx A0c;
        AnonymousClass8gN r7 = this.A01;
        AnonymousClass8gN.A00((C202059ky) null, r7, this.A02);
        super.A07(r10);
        C203399nx A03 = C203399nx.A03(r10);
        if (A03 != null && (A0c = A03.A0c("alias")) != null) {
            C22966AzI azI = this.A00;
            try {
                azI.BeP(new C206719tr(C165617ti.A0P(C146356vT.A00(), String.class, A0c.A0i("alias_value", (String) null), "upiAlias"), A0c.A0h("alias_type"), A0c.A0h("alias_id"), C90514aH.A0y(A0c.A0h("alias_status"))), (C202059ky) null);
            } catch (C235919b unused) {
                r7.A00.A05("onRegisterVpaAlias/onResponseSuccess/corrupt stream exception");
                azI.BeP((C206719tr) null, new C202059ky(500));
            }
        }
    }
}
