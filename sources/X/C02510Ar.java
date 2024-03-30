package X;

import java.util.ArrayList;

/* renamed from: X.0Ar  reason: invalid class name and case insensitive filesystem */
public abstract class C02510Ar extends C02500Aq {
    public ArrayList A00 = new ArrayList();

    public abstract void A0K();

    public void A07() {
        this.A00.clear();
        super.A07();
    }

    public void A0A(AnonymousClass0B7 r4) {
        super.A0A(r4);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            ((C02500Aq) this.A00.get(i)).A0A(r4);
        }
    }
}
