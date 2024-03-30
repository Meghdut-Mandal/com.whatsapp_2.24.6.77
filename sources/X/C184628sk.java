package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8sk  reason: invalid class name and case insensitive filesystem */
public final class C184628sk extends C118095nK {
    public static final ArrayList A01 = C165567td.A0e("admin", "superadmin");
    public final C22837Awm A00;

    public C184628sk(C203399nx r5) {
        C203399nx.A0A(r5, "participant");
        C203379ns.A0G(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A01);
        C22993Azj[] azjArr = new C22993Azj[4];
        azjArr[0] = ANQ.A00;
        azjArr[1] = ANR.A00;
        azjArr[2] = ANS.A00;
        this.A00 = (C22837Awm) C203379ns.A06(r5, "ParticipantWithJidLidAndDisplayName|ParticipantWithJidAndLid|ParticipantWithJidAndPn|ParticipantWithJid", C165567td.A0d(ANT.A00, azjArr, 3), new String[0]);
        this.A00 = r5;
    }
}
