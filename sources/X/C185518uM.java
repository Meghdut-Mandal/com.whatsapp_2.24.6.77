package X;

/* renamed from: X.8uM  reason: invalid class name and case insensitive filesystem */
public final class C185518uM extends C118095nK implements B0A {
    public final C184048ro A00;
    public final C185048tQ A01;

    public void B06(C198169d1 r7) {
        C185048tQ r3 = this.A01;
        String str = r3.A04;
        String str2 = r3.A02;
        C184048ro r5 = this.A00;
        if ("gcm".equals(str)) {
            r7.A03[0] = str2;
            Long l = r3.A00;
            if (l != null) {
                r7.A01[0] = Long.toString(l.longValue());
            }
        } else if ("fbns".equals(str)) {
            r7.A02[0] = str2;
        }
        if (r5 != null) {
            r7.A04[0] = r5.A00;
        }
        Long l2 = r3.A01;
        if (l2 != null) {
            r7.A05[0] = Long.toString(l2.longValue());
        }
        r7.A06[0] = r3.A03;
        r7.A07[0] = r3.A05;
    }

    public C185518uM(C203399nx r3) {
        C203399nx.A0A(r3, "config");
        this.A01 = (C185048tQ) C203539oF.A00(r3, ARC.A00);
        this.A00 = (C184048ro) C203379ns.A02(r3, ARD.A00, new String[]{"item"});
        this.A00 = r3;
    }
}
