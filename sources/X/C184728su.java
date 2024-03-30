package X;

import java.util.ArrayList;

/* renamed from: X.8su  reason: invalid class name and case insensitive filesystem */
public final class C184728su extends C118095nK {
    public static final ArrayList A01 = C165567td.A0e("0", "1");
    public static final ArrayList A02 = C165567td.A0e("0", "1");
    public final String A00;

    public C184728su(C203399nx r10) {
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        Long A0c = C165587tf.A0c();
        C203399nx r2 = r10;
        this.A00 = (String) C203379ns.A00.A0Z(r2, cls, A0Y, A0c, (Object) null, new String[]{"credential-id"}, false);
        C203539oF.A07(r2, cls, A0Y, C165607th.A0k(), (Object) null, new String[]{"country"}, false);
        C203539oF.A07(r2, cls, A0Y, C165577te.A0Z(), (Object) null, new String[]{"created"}, false);
        C203379ns.A0H(r10, "p2p-eligible", A02);
        C203379ns.A0H(r10, "p2m-eligible", A01);
        this.A00 = r10;
    }
}
