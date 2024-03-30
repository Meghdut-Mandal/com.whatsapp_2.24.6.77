package X;

import java.util.ArrayList;

/* renamed from: X.8sZ  reason: invalid class name and case insensitive filesystem */
public final class C184518sZ extends C118095nK {
    public static final ArrayList A00 = C36351kA.A10(C165597tg.A1a());
    public static final ArrayList A01 = C165567td.A0e("mobile_number", "numeric_id");

    public C184518sZ(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "alias");
        Class<String> cls = String.class;
        C203379ns.A03(r2, cls, 8L, C165607th.A0k(), (Object) null, new String[]{"alias_value"}, false);
        C203379ns.A03(r2, cls, C90474aD.A0Y(), C165587tf.A0b(), (Object) null, new String[]{"alias_id"}, false);
        C203379ns.A0G(r10, "alias_type", A01);
        C203379ns.A0H(r10, "alias_status", A00);
        this.A00 = r10;
    }
}
