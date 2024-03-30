package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6Nu  reason: invalid class name and case insensitive filesystem */
public abstract class C131116Nu {
    public final C19700wN A00;
    public final AnonymousClass19A A01;

    public static C122515uy A00(C203399nx r4) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C203399nx A0d = r4.A0d("encryption_metadata");
        C203399nx A0d2 = A0d.A0d("encrypted_key");
        C203399nx A0d3 = A0d.A0d("nonce");
        C203399nx A0d4 = A0d.A0d("encrypted_data");
        C203399nx A0d5 = A0d.A0d("auth_tag");
        byte[] bArr4 = A0d2.A01;
        if (bArr4 != null && (bArr = A0d3.A01) != null && (bArr2 = A0d4.A01) != null && (bArr3 = A0d5.A01) != null) {
            return new C122515uy(bArr4, bArr2, bArr3, bArr);
        }
        throw new C235919b("encryption_metadata inner node data missing");
    }

    public void A01(C160047kN r9, Object obj, int i) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C203399nx A03;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        AnonymousClass19A r3 = this.A01;
        String A09 = r3.A09();
        if (this instanceof AnonymousClass57O) {
            AnonymousClass6QB A002 = C111935d5.A00(A09, i, true);
            ((AnonymousClass57O) this).A02(A002, (C120445rW) obj);
            A03 = A002.A03();
        } else if (this instanceof AnonymousClass57N) {
            C122515uy r10 = (C122515uy) obj;
            AnonymousClass6QB A0T = C36421kH.A0T();
            AnonymousClass6QB.A01(A0T, "smax_id", i);
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
            C36331k8.A1D(A0T, "xmlns", "fb:graphql");
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            C36341k9.A1C(A0T);
            AnonymousClass6QB A0q = C36441kJ.A0q("auth_metadata");
            C36411kG.A1K(A0q, "timestamp", C36371kC.A09(((AnonymousClass57N) this).A00));
            C36331k8.A1D(A0q, "version", "1");
            C36361kB.A1H(A0q, A0T);
            AnonymousClass6QB A0q2 = C36441kJ.A0q("encryption_metadata");
            C36331k8.A1D(A0q2, "version", "1");
            C36331k8.A1D(A0q2, "algorithm", "rsa2048");
            AnonymousClass6QB A0q3 = C36441kJ.A0q("encrypted_key");
            A0q3.A01 = r10.A01;
            C36361kB.A1H(A0q3, A0q2);
            AnonymousClass6QB A0q4 = C36441kJ.A0q("encrypted_data");
            A0q4.A01 = r10.A00;
            C36361kB.A1H(A0q4, A0q2);
            AnonymousClass6QB A0q5 = C36441kJ.A0q("nonce");
            A0q5.A01 = r10.A02;
            C36361kB.A1H(A0q5, A0q2);
            AnonymousClass6QB A0q6 = C36441kJ.A0q("auth_tag");
            A0q6.A01 = r10.A03;
            C36361kB.A1H(A0q6, A0q2);
            C36361kB.A1H(A0q2, A0T);
            A03 = A0T.A03();
        } else if (this instanceof AnonymousClass57M) {
            C122515uy r102 = (C122515uy) obj;
            AnonymousClass6QB A0T2 = C36421kH.A0T();
            AnonymousClass6QB.A01(A0T2, "smax_id", i);
            C36331k8.A1D(A0T2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
            C36331k8.A1D(A0T2, "xmlns", "fb:graphql");
            C36331k8.A1D(A0T2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            C36341k9.A1C(A0T2);
            AnonymousClass6QB A0q7 = C36441kJ.A0q("auth_metadata");
            C36411kG.A1K(A0q7, "timestamp", C36371kC.A09(((AnonymousClass57M) this).A00));
            AnonymousClass6QB.A01(A0q7, "version", 1);
            C36331k8.A1D(A0q7, "use_case", "support");
            C36361kB.A1H(A0q7, A0T2);
            AnonymousClass6QB A0q8 = C36441kJ.A0q("encryption_metadata");
            AnonymousClass6QB.A01(A0q8, "version", 1);
            C36331k8.A1D(A0q8, "algorithm", "rsa2048");
            AnonymousClass6QB A0q9 = C36441kJ.A0q("encrypted_key");
            byte[] bArr7 = null;
            if (r102 != null) {
                bArr4 = r102.A01;
            } else {
                bArr4 = null;
            }
            A0q9.A01 = bArr4;
            C36361kB.A1H(A0q9, A0q8);
            AnonymousClass6QB A0q10 = C36441kJ.A0q("encrypted_data");
            if (r102 != null) {
                bArr5 = r102.A00;
            } else {
                bArr5 = null;
            }
            A0q10.A01 = bArr5;
            C36361kB.A1H(A0q10, A0q8);
            AnonymousClass6QB A0q11 = C36441kJ.A0q("nonce");
            if (r102 != null) {
                bArr6 = r102.A02;
            } else {
                bArr6 = null;
            }
            A0q11.A01 = bArr6;
            C36361kB.A1H(A0q11, A0q8);
            AnonymousClass6QB A0q12 = C36441kJ.A0q("auth_tag");
            if (r102 != null) {
                bArr7 = r102.A03;
            }
            A0q12.A01 = bArr7;
            C36361kB.A1H(A0q12, A0q8);
            C36361kB.A1H(A0q8, A0T2);
            A03 = A0T2.A03();
        } else {
            C122515uy r103 = (C122515uy) obj;
            AnonymousClass6QB A0T3 = C36421kH.A0T();
            AnonymousClass6QB.A01(A0T3, "smax_id", i);
            C36331k8.A1D(A0T3, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
            C36331k8.A1D(A0T3, "xmlns", "fb:graphql");
            C36331k8.A1D(A0T3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            C36341k9.A1C(A0T3);
            AnonymousClass6QB A0q13 = C36441kJ.A0q("auth_metadata");
            C36411kG.A1K(A0q13, "timestamp", C36371kC.A09(((AnonymousClass57L) this).A00));
            AnonymousClass6QB.A01(A0q13, "version", 1);
            C36361kB.A1H(A0q13, A0T3);
            AnonymousClass6QB A0q14 = C36441kJ.A0q("encryption_metadata");
            AnonymousClass6QB.A01(A0q14, "version", 1);
            C36331k8.A1D(A0q14, "algorithm", "rsa2048");
            AnonymousClass6QB A0q15 = C36441kJ.A0q("encrypted_key");
            byte[] bArr8 = null;
            if (r103 != null) {
                bArr = r103.A01;
            } else {
                bArr = null;
            }
            A0q15.A01 = bArr;
            C36361kB.A1H(A0q15, A0q14);
            AnonymousClass6QB A0q16 = C36441kJ.A0q("encrypted_data");
            if (r103 != null) {
                bArr2 = r103.A00;
            } else {
                bArr2 = null;
            }
            A0q16.A01 = bArr2;
            C36361kB.A1H(A0q16, A0q14);
            AnonymousClass6QB A0q17 = C36441kJ.A0q("nonce");
            if (r103 != null) {
                bArr3 = r103.A02;
            } else {
                bArr3 = null;
            }
            A0q17.A01 = bArr3;
            C36361kB.A1H(A0q17, A0q14);
            AnonymousClass6QB A0q18 = C36441kJ.A0q("auth_tag");
            if (r103 != null) {
                bArr8 = r103.A03;
            }
            A0q18.A01 = bArr8;
            C36361kB.A1H(A0q18, A0q14);
            C36361kB.A1H(A0q14, A0T3);
            A03 = A0T3.A03();
        }
        C90474aD.A13(r3, new C165487tV(r9, this, 1), A03, A09);
    }

    public C131116Nu(C19700wN r1, AnonymousClass19A r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
