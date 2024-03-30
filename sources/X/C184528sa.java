package X;

import java.util.ArrayList;

/* renamed from: X.8sa  reason: invalid class name and case insensitive filesystem */
public final class C184528sa extends C118095nK {
    public static final ArrayList A00 = C165567td.A0e("0", "1");
    public static final ArrayList A01 = C165567td.A0e("0", "1");

    public C184528sa(C203399nx r10) {
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        C203399nx r2 = r10;
        C203379ns.A03(r2, cls, A0Y, C165587tf.A0c(), (Object) null, new String[]{"credential-id"}, false);
        C203539oF.A07(r2, cls, A0Y, C165607th.A0k(), (Object) null, new String[]{"country"}, false);
        C203539oF.A07(r2, cls, A0Y, C165577te.A0Z(), (Object) null, new String[]{"created"}, false);
        C203379ns.A0H(r10, "p2p-eligible", A01);
        C203379ns.A0H(r10, "p2m-eligible", A00);
        this.A00 = r10;
    }
}
