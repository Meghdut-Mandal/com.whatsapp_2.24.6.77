package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8tG  reason: invalid class name and case insensitive filesystem */
public final class C184948tG extends C118095nK {
    public static final ArrayList A02 = C36351kA.A10(new String[]{"ACTIVE", "EXPIRED", "SUSPENDED", "VOIDED"});
    public static final ArrayList A03 = C36351kA.A10(new String[]{"AMEX", "DISCOVER", "MAESTRO", "MASTERCARD", "VISA"});
    public static final ArrayList A04 = C165567td.A0f("combo", "credit", "debit");
    public static final ArrayList A05 = C165567td.A0e("0", "1");
    public final C184808t2 A00;
    public final C184788t0 A01;

    public C184948tG(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "card");
        Class<String> cls = String.class;
        C203379ns.A03(r2, cls, 4L, 4, (Object) null, new String[]{"last4"}, false);
        C203379ns.A03(r2, cls, C36411kG.A0t(), C165587tf.A0c(), (Object) null, new String[]{"time-last-added"}, false);
        C203379ns.A0G(r10, "verified", A05);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        C203379ns.A03(r2, cls, A0P, A0Q, (Object) null, strArr, false);
        C203379ns.A03(r2, cls, A0P, A0Q, (Object) null, new String[]{"network-type"}, false);
        C203379ns.A0H(r10, "display-state", A02);
        this.A01 = (C184788t0) C203539oF.A02(r10, C21408AKi.A00, 0);
        this.A00 = (C184808t2) C203539oF.A02(r10, C21409AKj.A00, 0);
        this.A00 = r10;
    }
}
