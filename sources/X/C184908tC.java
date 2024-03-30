package X;

import java.util.ArrayList;

/* renamed from: X.8tC  reason: invalid class name and case insensitive filesystem */
public final class C184908tC extends C118095nK {
    public static final ArrayList A02 = C165567td.A0e("0", "1");
    public static final ArrayList A03 = C165567td.A0e("0", "1");
    public final String A00;
    public final C203399nx A01;

    public C184908tC(C203399nx r4) {
        C203399nx.A0A(r4, "merchant");
        this.A00 = C203379ns.A07(r4, "settings", "buyer_initiated_payments_enabled", A02);
        C203379ns.A09(r4, A03, new String[]{"settings", "hpp_enabled"});
        this.A01 = (C203399nx) C203539oF.A04(r4, AJT.A00, C165607th.A1b(r4, this, "settings"));
    }
}
