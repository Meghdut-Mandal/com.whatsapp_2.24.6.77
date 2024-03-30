package X;

import android.content.Context;

/* renamed from: X.8gX  reason: invalid class name */
public class AnonymousClass8gX extends C178498gd {
    public final C19700wN A00;
    public final C194749Rb A01;
    public final C185998vF A02;

    public void A07(C203399nx r21) {
        try {
            C203399nx r13 = r21;
            C203399nx A0e = C90514aH.A0e(r13, this.A02);
            Class<String> cls = String.class;
            Long A0P = C165567td.A0P();
            Long A0Q = C165567td.A0Q();
            C203539oF r5 = C203379ns.A00;
            Class<String> cls2 = cls;
            Long l = A0P;
            Long l2 = A0Q;
            C203379ns.A03(r13, cls2, l, l2, r5.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
            Long A0Y = C90474aD.A0Y();
            Long A0c = C165587tf.A0c();
            C203539oF r12 = r5;
            String str = (String) r12.A0Z(r13, cls2, A0Y, C165577te.A0Z(), (Object) null, new String[]{"account", "mandate-no"}, false);
            C203539oF.A0B(r13, new C23214B9w(A0e, 1));
            AIB.A03(r13, C21595ARn.A00, new String[]{"account"});
            this.A01.A00((C202059ky) null, str, (String) r12.A0Z(r13, cls2, A0Y, A0c, (Object) null, new String[]{"account", "transaction-id"}, false));
        } catch (C235919b unused) {
            this.A01.A00(new C202059ky(500), (String) null, (String) null);
        }
    }

    public AnonymousClass8gX(Context context, C19700wN r8, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, C194749Rb r12, C185998vF r13) {
        super(context, r9, r10, r11, "upi-create-mandate");
        this.A00 = r8;
        this.A02 = r13;
        this.A01 = r12;
    }

    public void A05(C202059ky r3) {
        super.A05(r3);
        this.A01.A00(r3, (String) null, (String) null);
    }

    public void A06(C202059ky r3) {
        super.A06(r3);
        this.A01.A00(r3, (String) null, (String) null);
    }
}
