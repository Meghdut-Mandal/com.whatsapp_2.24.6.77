package X;

import java.util.List;

/* renamed from: X.63P  reason: invalid class name */
public class AnonymousClass63P {
    public int A00;
    public C144416s9 A01;
    public String A02;
    public String A03;

    public void A00(int i, List list) {
        String str = null;
        String str2 = null;
        if (i > 0) {
            str2 = ((C144416s9) list.get(i - 1)).A0H;
        }
        this.A03 = str2;
        if (i < C36431kI.A07(list)) {
            str = ((C144416s9) list.get(i + 1)).A0H;
        }
        this.A02 = str;
    }

    public AnonymousClass63P(C144416s9 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }
}
