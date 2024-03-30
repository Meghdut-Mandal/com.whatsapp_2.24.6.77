package X;

import java.util.ArrayList;

/* renamed from: X.8sv  reason: invalid class name and case insensitive filesystem */
public final class C184738sv extends C118095nK {
    public static final ArrayList A01 = C165567td.A0e("0", "1");
    public static final ArrayList A02 = C165567td.A0e("0", "1");
    public final C203399nx A00;

    public C184738sv(C203399nx r4) {
        C203399nx.A0A(r4, "card");
        C203379ns.A0F(r4, "capabilities", "p2m-credit-eligible", A01);
        C203379ns.A0F(r4, "capabilities", "p2m-debit-eligible", A02);
        this.A00 = (C203399nx) C203539oF.A04(r4, C21414AKo.A00, C165607th.A1b(r4, this, "capabilities"));
    }
}
