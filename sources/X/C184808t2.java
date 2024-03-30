package X;

import java.util.ArrayList;

/* renamed from: X.8t2  reason: invalid class name and case insensitive filesystem */
public final class C184808t2 extends C118095nK {
    public static final ArrayList A01 = C165567td.A0e("0", "1");
    public static final ArrayList A02 = C165567td.A0e("0", "1");
    public static final ArrayList A03 = C165567td.A0e("0", "1");
    public static final ArrayList A04 = C165567td.A0e("0", "1");
    public static final ArrayList A05 = C165567td.A0f("DISABLED", "ENABLED", "REQUIRES_VERIFICATION");
    public static final ArrayList A06 = C165567td.A0f("DISABLED", "ENABLED", "REQUIRES_VERIFICATION");
    public static final ArrayList A07 = C165567td.A0f("DISABLED", "ENABLED", "REQUIRES_VERIFICATION");
    public static final ArrayList A08 = C165567td.A0f("DISABLED", "ENABLED", "REQUIRES_VERIFICATION");
    public static final ArrayList A09 = C165567td.A0e("0", "1");
    public final C203399nx A00;

    public C184808t2(C203399nx r4) {
        C203399nx.A0A(r4, "card");
        C203379ns.A0F(r4, "capabilities", "editable", A04);
        C203379ns.A0F(r4, "capabilities", "verifiable", A09);
        C203379ns.A0F(r4, "capabilities", "default-eligible", A03);
        C203379ns.A09(r4, A02, new String[]{"capabilities", "default-eligible-p2p"});
        C203379ns.A09(r4, A01, new String[]{"capabilities", "default-eligible-p2m"});
        C203379ns.A0F(r4, "capabilities", "p2p-send", A08);
        C203379ns.A0F(r4, "capabilities", "p2p-receive", A07);
        C203379ns.A0F(r4, "capabilities", "p2m-send", A06);
        C203379ns.A0F(r4, "capabilities", "p2m-receive", A05);
        this.A00 = (C203399nx) C203539oF.A04(r4, C21410AKk.A00, C165607th.A1b(r4, this, "capabilities"));
    }
}
