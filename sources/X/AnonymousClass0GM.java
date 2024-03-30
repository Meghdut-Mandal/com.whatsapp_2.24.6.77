package X;

import java.util.List;

/* renamed from: X.0GM  reason: invalid class name */
public class AnonymousClass0GM extends C02540Au {
    public boolean A0C() {
        return false;
    }

    public void A09() {
        List list;
        C02540Au r0;
        C02500Aq r6 = this.A03;
        AnonymousClass0GG r02 = (AnonymousClass0GG) r6;
        int i = r02.A02;
        int i2 = r02.A03;
        int i3 = r02.A01;
        C02560Aw r2 = this.A05;
        if (i3 == 1) {
            if (i != -1) {
                r2.A08.add(r6.A0Z.A0c.A05);
                this.A03.A0Z.A0c.A05.A07.add(r2);
            } else if (i2 != -1) {
                r2.A08.add(r6.A0Z.A0c.A04);
                this.A03.A0Z.A0c.A04.A07.add(r2);
                i = -i2;
            } else {
                r2.A09 = true;
                r2.A08.add(r6.A0Z.A0c.A04);
                this.A03.A0Z.A0c.A04.A07.add(r2);
                C02560Aw r03 = this.A03.A0c.A05;
                list = r2.A07;
                C02540Au.A03(r03, r2, list);
                r0 = this.A03.A0c;
            }
            r2.A04 = i;
            C02560Aw r032 = this.A03.A0c.A05;
            list = r2.A07;
            C02540Au.A03(r032, r2, list);
            r0 = this.A03.A0c;
        } else {
            if (i != -1) {
                r2.A08.add(r6.A0Z.A0d.A05);
                this.A03.A0Z.A0d.A05.A07.add(r2);
            } else if (i2 != -1) {
                r2.A08.add(r6.A0Z.A0d.A04);
                this.A03.A0Z.A0d.A04.A07.add(r2);
                i = -i2;
            } else {
                r2.A09 = true;
                r2.A08.add(r6.A0Z.A0d.A04);
                this.A03.A0Z.A0d.A04.A07.add(r2);
                C02560Aw r04 = this.A03.A0d.A05;
                list = r2.A07;
                C02540Au.A03(r04, r2, list);
                r0 = this.A03.A0d;
            }
            r2.A04 = i;
            C02560Aw r042 = this.A03.A0d.A05;
            list = r2.A07;
            C02540Au.A03(r042, r2, list);
            r0 = this.A03.A0d;
        }
        C02540Au.A03(r0.A04, r2, list);
    }

    public void A0A() {
        C02500Aq r3 = this.A03;
        int i = ((AnonymousClass0GG) r3).A01;
        int i2 = this.A05.A05;
        if (i == 1) {
            r3.A0P = i2;
        } else {
            r3.A0Q = i2;
        }
    }

    public void A0B() {
        this.A05.A00();
    }

    public void BwU(C02530At r6) {
        C02560Aw r4 = this.A05;
        if (r4.A0A && !r4.A0B) {
            r4.A01((int) ((((float) ((C02560Aw) r4.A08.get(0)).A05) * ((AnonymousClass0GG) this.A03).A00) + 0.5f));
        }
    }

    public AnonymousClass0GM(C02500Aq r2) {
        super(r2);
        r2.A0c.A0B();
        r2.A0d.A0B();
        this.A02 = ((AnonymousClass0GG) r2).A01;
    }
}
