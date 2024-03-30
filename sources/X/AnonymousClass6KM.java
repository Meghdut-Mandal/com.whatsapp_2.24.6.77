package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6KM  reason: invalid class name */
public final class AnonymousClass6KM {
    public final C19970wo A00;
    public final C19770wU A01;
    public final AnonymousClass005 A02;

    public static final void A00(AnonymousClass67G r5, C128936Ee r6, AnonymousClass6KM r7, String str, String str2, String str3, int i) {
        AnonymousClass19A r3 = (AnonymousClass19A) r7.A02.get();
        String A09 = r3.A09();
        AnonymousClass6QB A002 = C111935d5.A00(A09, 65, false);
        AnonymousClass6QB A0q = C36441kJ.A0q("disclosure");
        AnonymousClass6QB.A01(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_ID, i);
        C36331k8.A1D(A0q, "version", str);
        C36331k8.A1D(A0q, "lg", str2);
        C36331k8.A1D(A0q, "lc", str3);
        C36361kB.A1H(A0q, A002);
        AnonymousClass6QB A0q2 = C36441kJ.A0q("timestamp");
        AnonymousClass6QB.A00(r7.A00, A0q2);
        C36361kB.A1H(A0q2, A002);
        C90474aD.A13(r3, new C147756xj(r5, r6, r7, str, str2, str3, i), A002.A03(), A09);
    }

    public AnonymousClass6KM(C19970wo r1, C19770wU r2, AnonymousClass005 r3) {
        C36321k7.A11(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
