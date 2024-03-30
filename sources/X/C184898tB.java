package X;

import java.util.ArrayList;

/* renamed from: X.8tB  reason: invalid class name and case insensitive filesystem */
public final class C184898tB extends C118095nK {
    public static final ArrayList A02 = C165567td.A0e("block", "unblock");
    public static final ArrayList A03 = C165567td.A0e("calls", "marketing_messages");
    public final C22999Azp A00;
    public final String A01;

    public C184898tB(C203399nx r11) {
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203399nx r3 = r11;
        this.A01 = (String) C203539oF.A07(r3, cls, A0P, A0Q, (Object) null, new String[]{"action"}, false);
        C203539oF.A07(r3, cls, A0P, A0Q, (Object) null, new String[]{"category"}, false);
        C22993Azj[] azjArr = new C22993Azj[2];
        azjArr[0] = AIS.A00;
        this.A00 = (C22999Azp) C203379ns.A06(r11, "BizOptOutBrandID|BizOptOutJid", C165567td.A0c(AIT.A00, azjArr), new String[0]);
        this.A00 = r11;
    }
}
