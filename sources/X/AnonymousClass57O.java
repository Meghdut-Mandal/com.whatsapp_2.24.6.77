package X;

/* renamed from: X.57O  reason: invalid class name */
public abstract class AnonymousClass57O extends C131116Nu {
    public final C19970wo A00;

    public void A02(AnonymousClass6QB r5, C120445rW r6) {
        if (r6 != null) {
            AnonymousClass6QB A0q = C36441kJ.A0q("encryption_metadata");
            C36331k8.A1D(A0q, "version", "1");
            C36331k8.A1D(A0q, "algorithm", "rsa2048");
            AnonymousClass6QB A0q2 = C36441kJ.A0q("encrypted_key");
            C122515uy r2 = r6.A00;
            A0q2.A01 = r2.A01;
            C36361kB.A1H(A0q2, A0q);
            AnonymousClass6QB A0q3 = C36441kJ.A0q("encrypted_data");
            A0q3.A01 = r2.A00;
            C36361kB.A1H(A0q3, A0q);
            AnonymousClass6QB A0q4 = C36441kJ.A0q("nonce");
            A0q4.A01 = r2.A02;
            C36361kB.A1H(A0q4, A0q);
            AnonymousClass6QB A0q5 = C36441kJ.A0q("auth_tag");
            A0q5.A01 = r2.A03;
            C36361kB.A1H(A0q5, A0q);
            C36361kB.A1H(A0q, r5);
            AnonymousClass6QB A0q6 = C36441kJ.A0q("timestamp");
            AnonymousClass6QB.A00(this.A00, A0q6);
            C36361kB.A1H(A0q6, r5);
            C135086c7 r22 = r6.A01;
            if (r22 != null) {
                AnonymousClass6QB A0q7 = C36441kJ.A0q("fbid");
                A0q7.A07(C135086c7.A01(r22));
                C36361kB.A1H(A0q7, r5);
            }
        }
    }

    public AnonymousClass57O(C19700wN r1, C19970wo r2, AnonymousClass19A r3) {
        super(r1, r3);
        this.A00 = r2;
    }
}
