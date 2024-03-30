package X;

import java.util.ArrayList;

/* renamed from: X.8sT  reason: invalid class name and case insensitive filesystem */
public final class C184458sT extends C118095nK {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"ADDITIONAL_KYC_REQUIRED", "COMPLETED", "FAILED", "ONBOARDING_COMPLETED", "PENDING", "PROCESSING", "REJECTED", "UPLOADING"});

    public C184458sT(C203399nx r4) {
        C203399nx.A0A(r4, "pay");
        C203379ns.A0F(r4, "kyc", "state", A00);
        this.A00 = r4;
    }
}
