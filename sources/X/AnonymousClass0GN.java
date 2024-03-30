package X;

import java.util.List;

/* renamed from: X.0GN  reason: invalid class name */
public class AnonymousClass0GN extends C02540Au {
    public void A0B() {
        this.A00 = null;
        this.A05.A00();
    }

    public boolean A0C() {
        return false;
    }

    public void A09() {
        List list;
        C02540Au r0;
        C02500Aq r6 = this.A03;
        if (r6 instanceof AnonymousClass0GH) {
            C02560Aw r2 = this.A05;
            r2.A09 = true;
            AnonymousClass0GH r62 = (AnonymousClass0GH) r6;
            int i = r62.A00;
            boolean z = r62.A02;
            int i2 = 0;
            if (i == 0) {
                r2.A03 = C023109s.A0G;
                while (i2 < r62.A00) {
                    C02500Aq r1 = r62.A01[i2];
                    if (z || r1.A0N != 8) {
                        C02560Aw r12 = r1.A0c.A05;
                        C02540Au.A03(r2, r12, r12.A07);
                    }
                    i2++;
                }
            } else if (i != 1) {
                if (i == 2) {
                    r2.A03 = C023109s.A0S;
                    while (i2 < r62.A00) {
                        C02500Aq r13 = r62.A01[i2];
                        if (z || r13.A0N != 8) {
                            C02560Aw r14 = r13.A0d.A05;
                            C02540Au.A03(r2, r14, r14.A07);
                        }
                        i2++;
                    }
                } else if (i == 3) {
                    r2.A03 = C023109s.A0V;
                    while (i2 < r62.A00) {
                        C02500Aq r15 = r62.A01[i2];
                        if (z || r15.A0N != 8) {
                            C02560Aw r16 = r15.A0d.A04;
                            C02540Au.A03(r2, r16, r16.A07);
                        }
                        i2++;
                    }
                } else {
                    return;
                }
                C02560Aw r02 = this.A03.A0d.A05;
                list = r2.A07;
                C02540Au.A03(r02, r2, list);
                r0 = this.A03.A0d;
                C02540Au.A03(r0.A04, r2, list);
            } else {
                r2.A03 = C023109s.A0R;
                while (i2 < r62.A00) {
                    C02500Aq r17 = r62.A01[i2];
                    if (z || r17.A0N != 8) {
                        C02560Aw r18 = r17.A0c.A04;
                        C02540Au.A03(r2, r18, r18.A07);
                    }
                    i2++;
                }
            }
            C02560Aw r03 = this.A03.A0c.A05;
            list = r2.A07;
            C02540Au.A03(r03, r2, list);
            r0 = this.A03.A0c;
            C02540Au.A03(r0.A04, r2, list);
        }
    }

    public void A0A() {
        C02500Aq r2 = this.A03;
        if (r2 instanceof AnonymousClass0GH) {
            int i = ((AnonymousClass0GH) r2).A00;
            if (i == 0 || i == 1) {
                r2.A0P = this.A05.A05;
            } else {
                r2.A0Q = this.A05.A05;
            }
        }
    }

    public void BwU(C02530At r9) {
        AnonymousClass0GH r7 = (AnonymousClass0GH) this.A03;
        int i = r7.A00;
        C02560Aw r5 = this.A05;
        int i2 = 0;
        int i3 = -1;
        for (C02560Aw r0 : r5.A08) {
            int i4 = r0.A05;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            r5.A01(i3 + r7.A01);
        } else {
            r5.A01(i2 + r7.A01);
        }
    }

    public AnonymousClass0GN(C02500Aq r1) {
        super(r1);
    }
}
