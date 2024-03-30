package X;

/* renamed from: X.ATg  reason: case insensitive filesystem */
public final class C21640ATg implements B0B {
    public final C19970wo A00;
    public final C202109l3 A01;

    public C21640ATg(C19970wo r1, C202109l3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean B1C(C193229Kn r10, C16540pP r11, C87374On r12) {
        boolean A1a = C36331k8.A1a(r12, r10);
        C21642ATi aTi = (C21642ATi) r12;
        String str = aTi.A0F;
        C202109l3 r5 = this.A01;
        long A0B = C36341k9.A0B(r5.A00, C202109l3.A01(str, "eligibilityDurationAfterFirstImpression"));
        int i = aTi.A00;
        if (i <= 0 || A0B <= 0 || C36441kJ.A0A(A0B) > ((long) i)) {
            Object obj = r10.A01.get("param");
            if (obj != null) {
                if (System.currentTimeMillis() < r5.A04(C188408zX.IMPRESSION, str) + (Long.parseLong((String) obj) * ((long) 1000))) {
                    return false;
                }
            } else {
                throw C36381kD.A0l();
            }
        }
        return A1a;
    }
}
