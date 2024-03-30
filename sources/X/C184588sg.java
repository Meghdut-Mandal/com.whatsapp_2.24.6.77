package X;

import java.util.ArrayList;

/* renamed from: X.8sg  reason: invalid class name and case insensitive filesystem */
public final class C184588sg extends C118095nK {
    public static final ArrayList A01 = C165567td.A0f("FAILED", "PENDING", "VERIFIED");
    public final C184528sa A00;

    public C184588sg(C203399nx r10) {
        C203399nx r2 = r10;
        Class<String> cls = String.class;
        C203379ns.A03(r2, cls, C165567td.A0P(), C165567td.A0Q(), "bank", C203399nx.A0O(r10, "payout"), false);
        Long A0Y = C90474aD.A0Y();
        Long A0Z = C165577te.A0Z();
        C203539oF.A07(r2, cls, A0Y, A0Z, (Object) null, new String[]{"account-number"}, false);
        C203379ns.A03(r2, cls, A0Y, A0Z, (Object) null, new String[]{"bank-name"}, false);
        C203539oF.A07(r2, cls, A0Y, A0Z, (Object) null, C165597tg.A1Z(), false);
        C203379ns.A0G(r10, "verification-status", A01);
        this.A00 = (C184528sa) C203539oF.A02(r10, ALR.A00, 0);
        this.A00 = r10;
    }
}
