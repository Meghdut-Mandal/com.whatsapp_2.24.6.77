package X;

import java.util.Iterator;
import java.util.List;

public abstract class A8F implements C22905AyH {
    public void A00(Number number) {
        if (this instanceof AnonymousClass8TG) {
            AnonymousClass8TG r4 = (AnonymousClass8TG) this;
            r4.A00 = Double.valueOf(r4.A00.doubleValue() + number.doubleValue());
        } else if (this instanceof AnonymousClass8TI) {
            AnonymousClass8TI r6 = (AnonymousClass8TI) this;
            r6.A01 = Double.valueOf(r6.A01.doubleValue() + number.doubleValue());
            r6.A02 = Double.valueOf(r6.A02.doubleValue() + (number.doubleValue() * number.doubleValue()));
            r6.A00 = Double.valueOf(r6.A00.doubleValue() + 1.0d);
        } else if (this instanceof AnonymousClass8TF) {
            AnonymousClass8TF r5 = (AnonymousClass8TF) this;
            if (r5.A00.doubleValue() > number.doubleValue()) {
                r5.A00 = Double.valueOf(number.doubleValue());
            }
        } else if (this instanceof AnonymousClass8TE) {
            AnonymousClass8TE r52 = (AnonymousClass8TE) this;
            if (r52.A00.doubleValue() < number.doubleValue()) {
                r52.A00 = Double.valueOf(number.doubleValue());
            }
        } else {
            AnonymousClass8TH r42 = (AnonymousClass8TH) this;
            r42.A00 = Double.valueOf(r42.A00.doubleValue() + 1.0d);
            r42.A01 = Double.valueOf(r42.A01.doubleValue() + number.doubleValue());
        }
    }

    public Object BKy(C21670AUn aUn, C199959gK r9, Object obj, String str, List list) {
        C23091B4b b4b = r9.A01.A00;
        int i = 0;
        if (obj instanceof List) {
            for (Object next : b4b.Bvj(obj)) {
                if (next instanceof Number) {
                    i++;
                    A00((Number) next);
                }
            }
        }
        if (list != null) {
            Iterator it = C201989kp.A00(r9, Number.class, list).iterator();
            while (it.hasNext()) {
                i++;
                A00((Number) it.next());
            }
        }
        if (i != 0) {
            if (this instanceof AnonymousClass8TG) {
                return ((AnonymousClass8TG) this).A00;
            }
            if (this instanceof AnonymousClass8TI) {
                AnonymousClass8TI r6 = (AnonymousClass8TI) this;
                double doubleValue = r6.A02.doubleValue();
                double doubleValue2 = r6.A00.doubleValue();
                double doubleValue3 = r6.A01.doubleValue();
                return Double.valueOf(Math.sqrt((doubleValue / doubleValue2) - (((doubleValue3 * doubleValue3) / doubleValue2) / doubleValue2)));
            } else if (this instanceof AnonymousClass8TF) {
                return ((AnonymousClass8TF) this).A00;
            } else {
                if (this instanceof AnonymousClass8TE) {
                    return ((AnonymousClass8TE) this).A00;
                }
                AnonymousClass8TH r62 = (AnonymousClass8TH) this;
                double doubleValue4 = r62.A00.doubleValue();
                if (doubleValue4 != 0.0d) {
                    return Double.valueOf(r62.A01.doubleValue() / doubleValue4);
                }
                return Double.valueOf(0.0d);
            }
        } else {
            throw new C21831Ab9("Aggregation function attempted to calculate value using empty array");
        }
    }
}
