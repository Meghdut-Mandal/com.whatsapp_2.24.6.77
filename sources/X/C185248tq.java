package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.8tq  reason: invalid class name and case insensitive filesystem */
public final class C185248tq extends C118095nK implements C23008Azy {
    public void Azv(AnonymousClass9KD r7) {
        List list = r7.A01;
        AnonymousClass3UA r4 = AnonymousClass3UA.A00;
        C203399nx r3 = this.A00;
        AnonymousClass00C.A08(r3);
        AnonymousClass9KE r1 = r7.A00;
        list.add(r4.A0A(r3, AnonymousClass97B.A00(r1, 40), AnonymousClass97B.A00(r1, 41), 3));
    }

    public C185248tq(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "group");
        Class<String> cls = String.class;
        C203379ns.A03(r2, cls, C165567td.A0P(), C165567td.A0Q(), "true", new String[]{"truncated"}, false);
        C203379ns.A03(r2, cls, C165607th.A0k(), C165597tg.A0e(), (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        C203379ns.A03(r2, Long.class, C36411kG.A0t(), 19999L, (Object) null, new String[]{"size"}, false);
        this.A00 = r10;
    }
}
