package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Aw  reason: invalid class name and case insensitive filesystem */
public class C02560Aw implements C02530At {
    public int A00 = 1;
    public AnonymousClass0Ax A01 = null;
    public C02540Au A02;
    public Integer A03 = C023109s.A00;
    public int A04;
    public int A05;
    public C02530At A06 = null;
    public List A07 = new ArrayList();
    public List A08 = new ArrayList();
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;

    public void A00() {
        this.A08.clear();
        this.A07.clear();
        this.A0B = false;
        this.A05 = 0;
        this.A0A = false;
        this.A09 = false;
    }

    public void A01(int i) {
        if (!this.A0B) {
            this.A0B = true;
            this.A05 = i;
            for (C02530At r0 : this.A07) {
                r0.BwU(r0);
            }
        }
    }

    public void A02(C02530At r2) {
        this.A07.add(r2);
        if (this.A0B) {
            r2.BwU(r2);
        }
    }

    public void BwU(C02530At r7) {
        List<C02560Aw> list = this.A08;
        for (C02560Aw r0 : list) {
            if (!r0.A0B) {
                return;
            }
        }
        this.A0A = true;
        C02530At r02 = this.A06;
        if (r02 != null) {
            r02.BwU(this);
        }
        if (this.A09) {
            this.A02.BwU(this);
            return;
        }
        C02560Aw r4 = null;
        int i = 0;
        for (C02560Aw r1 : list) {
            if (!(r1 instanceof AnonymousClass0Ax)) {
                i++;
                r4 = r1;
            }
        }
        if (r4 != null && i == 1 && r4.A0B) {
            AnonymousClass0Ax r2 = this.A01;
            if (r2 != null) {
                if (r2.A0B) {
                    this.A04 = this.A00 * r2.A05;
                } else {
                    return;
                }
            }
            A01(r4.A05 + this.A04);
        }
        C02530At r03 = this.A06;
        if (r03 != null) {
            r03.BwU(this);
        }
    }

    public String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02.A03.A0f);
        sb.append(":");
        switch (this.A03.intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 2:
                str = "VERTICAL_DIMENSION";
                break;
            case 3:
                str = "LEFT";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "TOP";
                break;
            case 6:
                str = "BOTTOM";
                break;
            default:
                str = "BASELINE";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.A0B) {
            obj = Integer.valueOf(this.A05);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.A08.size());
        sb.append(":d=");
        sb.append(this.A07.size());
        sb.append(">");
        return sb.toString();
    }

    public C02560Aw(C02540Au r4) {
        this.A02 = r4;
    }
}
