package X;

import java.util.ArrayList;

/* renamed from: X.8tO  reason: invalid class name and case insensitive filesystem */
public final class C185028tO extends C118095nK {
    public static final ArrayList A05 = C36351kA.A10(new String[]{"APPROVED", "NO_REVIEW", "OUTDATED", "PENDING", "REJECTED"});
    public final C183998rj A00;
    public final C183998rj A01;
    public final C184678sp A02;
    public final String A03;
    public final C203399nx A04;

    public C185028tO(C203399nx r5) {
        this.A03 = C203379ns.A0A(r5, A05, new String[]{"status_info", "status", "#elementValue"});
        this.A02 = (C184678sp) C203379ns.A02(r5, AQJ.A00, new String[]{"status_info", "can_appeal"});
        this.A01 = (C183998rj) C203379ns.A02(r5, AQK.A00, new String[]{"status_info", "reject_reason"});
        this.A00 = (C183998rj) C203379ns.A02(r5, AQL.A00, new String[]{"status_info", "commerce_url"});
        this.A04 = (C203399nx) C203539oF.A04(r5, AQM.A00, C165607th.A1b(r5, this, "status_info"));
    }
}
