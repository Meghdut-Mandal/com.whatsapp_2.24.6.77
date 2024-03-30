package X;

import java.util.ArrayList;

/* renamed from: X.8tM  reason: invalid class name and case insensitive filesystem */
public final class C185008tM extends C118095nK {
    public static final ArrayList A04 = C36351kA.A10(new String[]{"APPROVED", "NO_REVIEW", "OUTDATED", "PENDING", "REJECTED"});
    public final C184048ro A00;
    public final C184048ro A01;
    public final C184708ss A02;
    public final String A03;

    public C185008tM(C203399nx r4) {
        C203399nx.A0A(r4, "status_info");
        this.A03 = C203379ns.A07(r4, "status", "#elementValue", A04);
        this.A02 = (C184708ss) C203379ns.A02(r4, C21562AQg.A00, new String[]{"can_appeal"});
        this.A01 = (C184048ro) C203379ns.A02(r4, C21563AQh.A00, new String[]{"reject_reason"});
        this.A00 = (C184048ro) C203379ns.A02(r4, C21564AQi.A00, new String[]{"commerce_url"});
        this.A00 = r4;
    }
}
