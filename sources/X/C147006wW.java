package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Random;

/* renamed from: X.6wW  reason: invalid class name and case insensitive filesystem */
public class C147006wW implements C159587jb {
    public final C159587jb A00;
    public final C119865qa A01;
    public final C24451Cm A02 = new C24451Cm(new Random(), 3, 200);
    public final C19770wU A03;
    public final boolean A04;

    public void A00() {
        String str;
        C119865qa r0 = this.A01;
        boolean z = this.A04;
        AnonymousClass19A r7 = r0.A01;
        String A09 = r7.A09();
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        ArrayList arrayList = C107505Pf.A00;
        String A0e = r0.A00.A0e();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, "xmlns", "urn:xmpp:whatsapp:account");
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        if (C203539oF.A0P(A09, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("first_party_migration");
        if (A0e != null && C203539oF.A0P(A0e, 0, 9007199254740991L, true)) {
            C36331k8.A1D(A0q, "device_id", A0e);
        }
        A0q.A09(str, "intent", C107505Pf.A00);
        C36361kB.A1H(A0q, A0T);
        r7.A0E(new C165487tV(this, r0, 3), A0T.A03(), A09, 357, 32000);
    }

    public void BWY() {
        Long A002 = this.A02.A00();
        if (A002 != null) {
            this.A03.BpM(new C1497272n(this, 31), "fpm/IntentToMigrateHandler/onError", A002.longValue());
            return;
        }
        this.A00.BWY();
    }

    public void onSuccess() {
        this.A00.onSuccess();
    }

    public C147006wW(C159587jb r7, C119865qa r8, C19770wU r9, boolean z) {
        this.A03 = r9;
        this.A01 = r8;
        this.A04 = z;
        this.A00 = r7;
    }
}
