package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3i8  reason: invalid class name and case insensitive filesystem */
public class C72283i8 implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("frequent_index", "CREATE UNIQUE INDEX IF NOT EXISTS frequent_index ON frequent (jid_row_id, type)");
    }

    public void B7q(AnonymousClass38H r13, C65063Qo r14) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r1 = new C64563Om[4];
        A00.A02 = "_id";
        C52502pX r8 = C52502pX.INTEGER;
        A00.A00 = r8;
        boolean A0k = C63573Ko.A0k(A00, r1);
        A00.A02 = "jid";
        C63573Ko.A0W(A00, C52502pX.TEXT, r1, true);
        r1[2] = C63573Ko.A05(A00, r8, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, true);
        r1[3] = C63573Ko.A05(A00, r8, "message_count", true);
        r14.A0B("frequents", r1);
        C64563Om[] r12 = new C64563Om[4];
        A00.A02 = "_id";
        A00.A00 = r8;
        A00.A05 = true;
        A00.A03 = true;
        C63573Ko.A0e(A00, r12, A0k ? 1 : 0);
        C63573Ko.A0R(A00, r8, "jid_row_id", r12, true);
        r12[2] = C63573Ko.A05(A00, r8, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, true);
        r12[3] = C63573Ko.A05(A00, r8, "message_count", true);
        r14.A0B("frequent", r12);
    }
}
