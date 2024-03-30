package X;

import java.util.ArrayList;

/* renamed from: X.8sx  reason: invalid class name and case insensitive filesystem */
public final class C184758sx extends C118095nK {
    public static final ArrayList A01 = C165567td.A0e("0", "1");
    public static final ArrayList A02 = C165567td.A0e("0", "1");
    public static final ArrayList A03 = C165567td.A0e("0", "1");
    public static final ArrayList A04 = C165567td.A0f("0", "1", "2");
    public final C184728su A00;

    public C184758sx(C203399nx r18) {
        C203399nx r3 = r18;
        C203399nx.A0A(r3, "merchant");
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        Long A0Z = C165577te.A0Z();
        C203379ns.A03(r3, cls, A0Y, A0Z, (Object) null, new String[]{"merchant-id"}, false);
        C203399nx r10 = r3;
        Class<String> cls2 = cls;
        Long l = A0Y;
        C203539oF.A07(r10, cls2, l, C165577te.A0a(), (Object) null, new String[]{"business-name"}, false);
        C203539oF.A07(r10, cls2, l, C165587tf.A0b(), (Object) null, new String[]{"support-phone-number"}, false);
        C203539oF.A07(r3, cls, A0Y, A0Z, (Object) null, new String[]{"provider-type"}, false);
        C203379ns.A0G(r3, "can-sell", A03);
        C203379ns.A0G(r3, "can-payout", A02);
        C203379ns.A0G(r3, "can-add-payout", A01);
        C203379ns.A0H(r3, "pix-onboarding-state", A04);
        this.A00 = (C184728su) C203539oF.A02(r3, AJU.A00, 0);
        this.A00 = r3;
    }
}
