package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.6CN  reason: invalid class name */
public abstract class AnonymousClass6CN {
    public final int A00;
    public final C19700wN A01;
    public final String A02;
    public final AnonymousClass19A A03;

    public final void A00(C160067kP r8) {
        AnonymousClass19A r6 = this.A03;
        String A09 = r6.A09();
        AnonymousClass6QB A0T = C36421kH.A0T();
        AnonymousClass6QB.A01(A0T, "smax_id", this.A00);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
        C36331k8.A1D(A0T, "xmlns", this.A02);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C36331k8.A1D(A0T, "to", "s.whatsapp.net");
        if (this instanceof AnonymousClass57S) {
            C36361kB.A1H(C36441kJ.A0q("password_pem"), A0T);
            C36361kB.A1H(C36441kJ.A0q("payload_enc_certificates"), A0T);
            AnonymousClass6QB A0q = C36441kJ.A0q("timestamp");
            AnonymousClass6QB.A00(((AnonymousClass57S) this).A00, A0q);
            C36361kB.A1H(A0q, A0T);
        } else if (this instanceof AnonymousClass57T) {
            AnonymousClass57T r2 = (AnonymousClass57T) this;
            AnonymousClass1HC r3 = r2.A01;
            Integer num = r3.A00;
            if (num != null) {
                r3.A01(num.intValue(), "fetch_certificate");
            }
            C36361kB.A1H(C36441kJ.A0q("password_pem"), A0T);
            C36361kB.A1H(C36441kJ.A0q("payload_enc_certificates"), A0T);
            AnonymousClass6QB A0q2 = C36441kJ.A0q("timestamp");
            A0q2.A07(String.valueOf(C36371kC.A09(r2.A00)));
            C36361kB.A1H(A0q2, A0T);
        } else if (this instanceof AnonymousClass57R) {
            Log.i("SupportUser/Fetch Certificate");
            AnonymousClass6QB A0q3 = C36441kJ.A0q("supported_certificates");
            A0q3.A07("rsa2048");
            C36361kB.A1H(A0q3, A0T);
            AnonymousClass6QB A0q4 = C36441kJ.A0q("fetch_password_pem");
            A0q4.A07("true");
            C36361kB.A1H(A0q4, A0T);
            AnonymousClass6QB A0q5 = C36441kJ.A0q("auth_metadata");
            C36411kG.A1K(A0q5, "timestamp", C36371kC.A09(((AnonymousClass57R) this).A00));
            AnonymousClass6QB.A01(A0q5, "version", 1);
            C36331k8.A1D(A0q5, "use_case", "support");
            C36361kB.A1H(A0q5, A0T);
        } else if (this instanceof AnonymousClass57P) {
            AnonymousClass6QB A0q6 = C36441kJ.A0q("supported_certificates");
            A0q6.A07("rsa2048");
            C36361kB.A1H(A0q6, A0T);
            AnonymousClass6QB A0q7 = C36441kJ.A0q("auth_metadata");
            C36411kG.A1K(A0q7, "timestamp", C36371kC.A09(((AnonymousClass57P) this).A00));
            AnonymousClass6QB.A01(A0q7, "version", 1);
            C36361kB.A1H(A0q7, A0T);
        } else {
            AnonymousClass6QB A0q8 = C36441kJ.A0q("supported_certificates");
            A0q8.A07("rsa2048");
            C36361kB.A1H(A0q8, A0T);
            AnonymousClass6QB A0q9 = C36441kJ.A0q("fetch_password_pem");
            A0q9.A07("true");
            C36361kB.A1H(A0q9, A0T);
            AnonymousClass6QB A0q10 = C36441kJ.A0q("auth_metadata");
            C36411kG.A1K(A0q10, "timestamp", C36371kC.A09(((AnonymousClass57Q) this).A00));
            AnonymousClass6QB.A01(A0q10, "version", 1);
            C36361kB.A1H(A0q10, A0T);
        }
        C90474aD.A13(r6, new C165487tV(r8, this, 2), A0T.A03(), A09);
    }

    public AnonymousClass6CN(C19700wN r1, AnonymousClass19A r2, String str, int i) {
        this.A01 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A02 = str;
    }
}
