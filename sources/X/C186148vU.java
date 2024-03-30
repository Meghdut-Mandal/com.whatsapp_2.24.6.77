package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.8vU  reason: invalid class name and case insensitive filesystem */
public final class C186148vU extends AnonymousClass5PS {
    public final AnonymousClass147 A00;
    public final List A01;
    public final C203399nx A02;
    public final C184478sV A03;

    public C186148vU(C203399nx r28, C186018vH r29) {
        C203399nx r12 = r28;
        C203399nx A0e = C90514aH.A0e(r12, r29);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        Class<String> cls2 = cls;
        Long l = A0P;
        Long l2 = A0Q;
        C203379ns.A03(r12, cls2, l, l2, "result", strArr, false);
        C203539oF.A07(r12, cls2, l, l2, "true", new String[]{"remove", "linked_groups"}, false);
        String[] A0l = C165617ti.A0l();
        Class<AnonymousClass147> cls3 = AnonymousClass147.class;
        C203539oF r3 = C203379ns.A00;
        this.A00 = (AnonymousClass147) r3.A0Z(r12, cls3, l, l2, r3.A0Z(A0e, cls3, A0P, A0Q, (Object) null, new String[]{"to"}, false), A0l, true);
        Class<String> cls4 = cls;
        C203379ns.A03(r12, cls4, l, l2, r3.A0Z(A0e, cls, A0P, A0Q, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
        this.A03 = (C184478sV) C203379ns.A01(r12, AOB.A00);
        this.A01 = C203539oF.A09(r12, AOC.A00, new String[]{"remove", "participant"}, 1, 1024);
        this.A02 = (C203399nx) C203539oF.A09(r12, AOD.A00, C165607th.A1b(r12, this, "remove"), 1, 1).get(0);
    }
}
