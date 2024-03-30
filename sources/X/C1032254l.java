package X;

/* renamed from: X.54l  reason: invalid class name and case insensitive filesystem */
public final class C1032254l extends C201669k5 {
    public final String A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1032254l(C201539jo r10, String str, String str2, String str3, long j) {
        super(C199769fw.A03, r10, str3, "regular_low", 7, j, false);
        AnonymousClass00C.A0D(str, 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public String A07() {
        return "primary_version";
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8NN A0p = C99824u1.DEFAULT_INSTANCE.A0p();
        String str = this.A00;
        C99824u1 r1 = (C99824u1) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.version_ = str;
        AnonymousClass8LN A04 = super.A04();
        if (A04 == null) {
            return null;
        }
        AnonymousClass8SS r2 = (AnonymousClass8SS) C90524aI.A0H(A04);
        C99824u1 r12 = (C99824u1) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r2.primaryVersionAction_ = r12;
        r2.bitField0_ |= 67108864;
        return A04;
    }

    public String[] A0A() {
        String[] A1S = C36441kJ.A1S();
        A1S[0] = "primary_version";
        A1S[1] = this.A01;
        return A1S;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0q = C90484aE.A0q("PrimaryVersionMutation{", A0u);
        A0q.append("rowId=");
        A0q.append(this.A07);
        A0q.append(", ");
        StringBuilder A0j = C90464aC.A0j(A0q, A0u);
        A0j.append("versionType=");
        StringBuilder A0q2 = C90484aE.A0q(AnonymousClass000.A0p(this.A01, ", ", A0j), A0u);
        A0q2.append("appVersion=");
        StringBuilder A0q3 = C90484aE.A0q(AnonymousClass000.A0p(this.A00, ", ", A0q2), A0u);
        A0q3.append("timestamp=");
        A0q3.append(this.A04);
        A0q3.append(", ");
        StringBuilder A0j2 = C90464aC.A0j(A0q3, A0u);
        A0j2.append("operation=");
        A0j2.append(this.A05);
        A0j2.append(", ");
        StringBuilder A0j3 = C90464aC.A0j(A0j2, A0u);
        A0j3.append("collectionName=");
        StringBuilder A0q4 = C90484aE.A0q(AnonymousClass000.A0p(this.A06, ", ", A0j3), A0u);
        A0q4.append("keyId=");
        A0q4.append(this.A00);
        C36351kA.A1K(A0q4, A0u);
        String A0q5 = AnonymousClass000.A0q("}", A0u);
        AnonymousClass00C.A08(A0q5);
        return A0q5;
    }
}
