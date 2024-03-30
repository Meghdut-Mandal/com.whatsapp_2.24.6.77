package X;

import java.util.ArrayList;

/* renamed from: X.8tN  reason: invalid class name and case insensitive filesystem */
public final class C185018tN extends C118095nK {
    public static final ArrayList A04 = C36351kA.A10(C165597tg.A1a());
    public static final ArrayList A05 = C165567td.A0e("mobile_number", "numeric_id");
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C185018tN(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "alias");
        Class<String> cls = String.class;
        Long A0k = C165607th.A0k();
        C203539oF r1 = C203379ns.A00;
        this.A03 = (String) r1.A0Z(r2, cls, 8L, A0k, (Object) null, new String[]{"alias_value"}, false);
        this.A00 = (String) r1.A0Z(r2, cls, C90474aD.A0Y(), C165587tf.A0b(), (Object) null, new String[]{"alias_id"}, false);
        this.A02 = C203379ns.A08(r10, "alias_type", A05);
        this.A01 = C203379ns.A09(r10, A04, new String[]{"alias_status"});
        this.A00 = r10;
    }
}
