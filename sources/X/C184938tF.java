package X;

import java.util.ArrayList;

/* renamed from: X.8tF  reason: invalid class name and case insensitive filesystem */
public final class C184938tF extends C118095nK {
    public static final ArrayList A02 = C165567td.A0e("0", "1");
    public static final ArrayList A03 = C165567td.A0e("NONE", "VISA");
    public static final ArrayList A04 = C165567td.A0e("0", "1");
    public static final ArrayList A05 = C36351kA.A10(new String[]{"ACTIVE", "DELETED", "INACTIVE", "NEEDS_RETOKENIZATION", "NEEDS_RETOKENIZATION_DELETED", "SUSPENDED"});
    public final C184948tG A00;
    public final C184738sv A01;

    public C184938tF(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "card");
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        C203379ns.A03(r2, cls, A0Y, C165587tf.A0c(), (Object) null, new String[]{"image-content-id"}, false);
        C203539oF.A07(r2, cls, A0Y, C165577te.A0Z(), (Object) null, new String[]{"bank-name"}, false);
        C203539oF.A07(r2, cls, A0Y, C165587tf.A0b(), (Object) null, new String[]{"bank-phone-number"}, false);
        C203379ns.A03(r2, cls, C165567td.A0P(), C165567td.A0Q(), (Object) null, new String[]{"binding-type"}, false);
        C203379ns.A0G(r10, "needs-device-binding", A04);
        C203379ns.A0H(r10, "state", A05);
        C203379ns.A0H(r10, "automatic-binding", A02);
        this.A00 = (C184948tG) C203539oF.A02(r10, C21401AKb.A00, 0);
        this.A01 = (C184738sv) C203379ns.A01(r10, C21402AKc.A00);
        this.A00 = r10;
    }
}
