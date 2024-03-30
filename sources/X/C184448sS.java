package X;

import java.util.ArrayList;

/* renamed from: X.8sS  reason: invalid class name and case insensitive filesystem */
public final class C184448sS extends C118095nK {
    public static final ArrayList A00 = C165567td.A0e("0", "1");

    public C184448sS(C203399nx r18) {
        C203399nx r3 = r18;
        C203399nx.A0A(r3, "bank");
        Class<String> cls = String.class;
        C203379ns.A03(r3, cls, C165567td.A0P(), C165567td.A0Q(), "BR", new String[]{"country"}, false);
        Long A0Y = C90474aD.A0Y();
        C203399nx r10 = r3;
        C203379ns.A03(r10, Long.class, A0Y, C165577te.A0Z(), (Object) null, new String[]{"bank-code"}, false);
        Long A0c = C165587tf.A0c();
        Long l = A0Y;
        C203379ns.A03(r3, cls, l, A0c, (Object) null, new String[]{"bank-name"}, false);
        C203379ns.A03(r3, cls, l, A0c, (Object) null, new String[]{"short-name"}, false);
        C203379ns.A03(r3, cls, l, Long.valueOf(AnonymousClass6X5.A0L), (Object) null, new String[]{"image"}, false);
        C203379ns.A0G(r3, "accept-savings", A00);
        this.A00 = r3;
    }
}
