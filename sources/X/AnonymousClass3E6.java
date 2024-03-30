package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3E6  reason: invalid class name */
public class AnonymousClass3E6 {
    public final AnonymousClass3PY A00;
    public final C19770wU A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass19A A03;

    public AnonymousClass3E6(AnonymousClass17Y r1, AnonymousClass19A r2, AnonymousClass3PY r3, C19770wU r4) {
        this.A02 = r1;
        this.A01 = r4;
        this.A03 = r2;
        this.A00 = r3;
    }

    public void A00(AnonymousClass4U7 r12, String str, String str2, boolean z, boolean z2) {
        String str3;
        C36321k7.A1X("ChatSupportTicketManager/contactSupport called, shouldUploadLogs=", AnonymousClass000.A0u(), z);
        C76623pB r5 = new C76623pB(this.A02, new C602036w(r12, this, z), this.A03);
        AnonymousClass19A r4 = r5.A01;
        String A09 = r4.A09();
        if (z2) {
            str3 = "payment";
        } else {
            str3 = "general";
        }
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, "xmlns", "fb:thrift_iq");
        C36331k8.A1D(A0T, "smax_id", "3");
        AnonymousClass6QB A0q = C36441kJ.A0q("additional_attributes");
        C36331k8.A1D(A0q, "context_flow", str3);
        C36361kB.A1H(A0q, A0T);
        A0T.A05(new C203399nx("description", str, (AnonymousClass1AL[]) null));
        if (!TextUtils.isEmpty(str2)) {
            A0T.A05(new C203399nx("debug_information_json", str2, (AnonymousClass1AL[]) null));
        }
        r4.A0K(r5, A0T.A03(), A09, 256, 32000);
    }
}
