package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.5PJ  reason: invalid class name */
public final class AnonymousClass5PJ extends AnonymousClass57O {
    public final C19970wo A00;

    public /* bridge */ /* synthetic */ void A02(AnonymousClass6QB r7, C120445rW r8) {
        String str;
        String str2;
        String str3;
        AnonymousClass5PH r82 = (AnonymousClass5PH) r8;
        super.A02(r7, r82);
        if (r82 != null) {
            byte[] bArr = r82.A04;
            if (bArr != null) {
                AnonymousClass6QB A0q = C36441kJ.A0q("id_sign");
                A0q.A01 = bArr;
                C36361kB.A1H(A0q, r7);
            }
            int i = r82.A00;
            if (i != -1 && (str = r82.A03) != null && (str2 = r82.A02) != null && (str3 = r82.A01) != null) {
                AnonymousClass6QB A0q2 = C36441kJ.A0q("disclosure");
                AnonymousClass6QB.A01(A0q2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, i);
                C36331k8.A1D(A0q2, "version", str);
                C36331k8.A1D(A0q2, "lg", str2);
                C36331k8.A1D(A0q2, "lc", str3);
                C36411kG.A1K(A0q2, "acceptance_timestamp", C19970wo.A00(this.A00) / ((long) 1000));
                C36361kB.A1H(A0q2, r7);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PJ(C19700wN r1, C19970wo r2, AnonymousClass19A r3) {
        super(r1, r2, r3);
        C36321k7.A11(r2, r1, r3);
        this.A00 = r2;
    }
}
