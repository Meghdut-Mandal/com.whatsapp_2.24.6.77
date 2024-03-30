package X;

import java.util.List;

/* renamed from: X.8sH  reason: invalid class name and case insensitive filesystem */
public final class C184338sH extends C118095nK {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public C184338sH(C203399nx r17, C203399nx r18) {
        C203399nx r9 = r17;
        C203399nx.A0A(r9, "account");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        Class<String> cls2 = cls;
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r9, cls2, l, l2, C203379ns.A00.A0Z(r18, cls, A0P, A0Q, (Object) null, new String[]{"account", "action"}, false), new String[]{"action"}, true);
        C203539oF.A07(r9, Long.class, C36411kG.A0t(), l2, (Object) null, new String[]{"version"}, false);
        C203539oF.A07(r9, cls, 18L, 18, (Object) null, new String[]{"instance-id"}, false);
        Class<String> cls3 = cls;
        C203539oF.A07(r9, cls3, C90474aD.A0Y(), C165587tf.A0b(), (Object) null, new String[]{"wa-support-phone-number"}, false);
        C21374AJa aJa = C21374AJa.A00;
        AnonymousClass00C.A0D(r9, 0);
        this.A00 = C203539oF.A09(r9, aJa, new String[]{"card"}, 0, Long.MAX_VALUE);
        this.A02 = C203539oF.A09(r9, C21375AJb.A00, new String[]{"bank"}, 0, Long.MAX_VALUE);
        this.A04 = C203539oF.A09(r9, C21376AJc.A00, new String[]{"merchant"}, 0, Long.MAX_VALUE);
        this.A01 = C203539oF.A09(r9, C21377AJd.A00, new String[]{"alias"}, 0, 100);
        this.A03 = C203539oF.A09(r9, C21378AJe.A00, new String[]{"custom_payment_method"}, 0, 5);
        this.A00 = r9;
    }
}
