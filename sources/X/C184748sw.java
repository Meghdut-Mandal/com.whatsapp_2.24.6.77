package X;

import java.util.ArrayList;

/* renamed from: X.8sw  reason: invalid class name and case insensitive filesystem */
public final class C184748sw extends C118095nK {
    public static final ArrayList A01 = C165567td.A0e("0", "1");
    public static final ArrayList A02 = C165567td.A0e("0", "1");
    public static final ArrayList A03 = C165567td.A0e("0", "1");
    public final C184528sa A00;

    public C184748sw(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "merchant");
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        C203379ns.A03(r2, cls, A0Y, C165577te.A0Z(), (Object) null, new String[]{"merchant-id"}, false);
        C203539oF.A07(r2, cls, A0Y, C165577te.A0a(), (Object) null, new String[]{"business-name"}, false);
        C203539oF.A07(r2, cls, A0Y, C165587tf.A0b(), (Object) null, new String[]{"support-phone-number"}, false);
        C203379ns.A0G(r10, "can-sell", A03);
        C203379ns.A0G(r10, "can-payout", A02);
        C203379ns.A0G(r10, "can-add-payout", A01);
        this.A00 = (C184528sa) C203539oF.A02(r10, ALQ.A00, 0);
        this.A00 = r10;
    }
}
