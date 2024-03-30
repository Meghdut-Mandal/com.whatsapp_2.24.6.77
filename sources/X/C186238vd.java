package X;

import java.util.ArrayList;

/* renamed from: X.8vd  reason: invalid class name and case insensitive filesystem */
public final class C186238vd extends AnonymousClass5PS {
    public static final ArrayList A06 = C165567td.A0e("HPP_PAYMENT_LINK", "UPI");
    public final C184308sE A00;
    public final C184408sO A01;
    public final C203399nx A02;
    public final C184048ro A03;
    public final C184838t5 A04;
    public final AnonymousClass5PT A05;

    public C186238vd(C203399nx r20, C185968vC r21) {
        C203399nx r5 = r20;
        C203399nx A0e = C90514aH.A0e(r5, r21);
        Class<String> cls = String.class;
        C203379ns.A03(r5, cls, C165567td.A0P(), C165567td.A0Q(), "upi-get-p2m-checkout-session", new String[]{"account", "action"}, false);
        Long A0Y = C90474aD.A0Y();
        Long A0Z = C165577te.A0Z();
        C203379ns.A03(r5, cls, A0Y, A0Z, (Object) null, new String[]{"account", "order_id"}, false);
        C203379ns.A03(r5, cls, A0Y, A0Z, (Object) null, new String[]{"account", "payment_provider"}, false);
        C203379ns.A0F(r5, "account", "payment_type", A06);
        C23214B9w b9w = new C23214B9w(A0e, 6);
        AnonymousClass00C.A0D(b9w, 1);
        this.A04 = (C184838t5) b9w.B15(r5);
        this.A00 = (C184308sE) C203379ns.A02(r5, C21603ARv.A00, new String[]{"account", "hpp_payment_link"});
        this.A01 = (C184408sO) C203379ns.A02(r5, C21604ARw.A00, new String[]{"account", "upi"});
        this.A05 = (AnonymousClass5PT) C203379ns.A02(r5, C21605ARx.A00, new String[]{"account", "amount"});
        this.A03 = (C184048ro) C203379ns.A02(r5, C21606ARy.A00, new String[]{"account", "l2checkout"});
        C203399nx r12 = r5;
        this.A02 = (C203399nx) C203539oF.A09(r12, C21607ARz.A00, C165607th.A1b(r5, this, "account"), 1, 1).get(0);
    }
}
