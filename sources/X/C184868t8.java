package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8t8  reason: invalid class name and case insensitive filesystem */
public final class C184868t8 extends C118095nK {
    public static final ArrayList A02 = C36351kA.A10(new String[]{"ACCOUNT_PENDING_LINKING", "ACTIVE", "EXTERNALLY_DISABLED", "HARD_BLOCKED", "INACTIVE", "INITED", "INTEGRITY_BLOCKED", "PENDING", "SOFT_BLOCKED"});
    public final C184748sw A00;
    public final List A01;

    public C184868t8(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "merchant");
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        C203539oF.A07(r2, cls, A0Y, C165577te.A0a(), (Object) null, new String[]{"gateway-name"}, false);
        C203539oF.A07(r2, cls, A0Y, 3000L, (Object) null, new String[]{"dashboard-url"}, false);
        C203539oF.A07(r2, cls, A0Y, 3000L, (Object) null, new String[]{"logo-uri"}, false);
        C203539oF.A07(r2, Long.class, C36411kG.A0t(), C165597tg.A0e(), (Object) null, new String[]{"max_installment_count"}, false);
        C203379ns.A0G(r10, "display-state", A02);
        this.A00 = (C184748sw) C203539oF.A02(r10, C21404AKe.A00, 0);
        C21405AKf aKf = C21405AKf.A00;
        AnonymousClass00C.A0D(r10, 0);
        this.A01 = C203539oF.A09(r2, aKf, new String[]{"payout"}, 0, Long.MAX_VALUE);
        this.A00 = r10;
    }
}
