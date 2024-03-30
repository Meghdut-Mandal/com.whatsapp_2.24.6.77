package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2s7  reason: invalid class name and case insensitive filesystem */
public class C53922s7 implements C22995Azl {
    public Object A00;
    public final int A01;

    public C53922s7(C77963rL r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final Object B17(Object obj, Object obj2, Object obj3) {
        Object valueOf;
        if (this.A01 != 0) {
            C77963rL r1 = (C77963rL) this.A00;
            List list = (List) obj;
            int A0I = AnonymousClass000.A0I(obj2);
            int A0I2 = AnonymousClass000.A0I(obj3);
            C36321k7.A0w(r1, list);
            List list2 = r1.A05;
            list2.clear();
            int A012 = C14960mT.A01(((float) A0I) * (((float) A0I2) / 4.0f));
            int i = A0I2 + A012;
            while (A012 < i) {
                if (A012 < 0 || A012 >= list.size()) {
                    valueOf = Float.valueOf(0.0f);
                } else {
                    valueOf = list.get(A012);
                }
                list2.add(valueOf);
                A012++;
            }
            return list2;
        }
        Object obj4 = this.A00;
        List list3 = (List) obj;
        int A0I3 = AnonymousClass000.A0I(obj2);
        int A0I4 = AnonymousClass000.A0I(obj3);
        C36321k7.A0w(obj4, list3);
        int A013 = A0I3 + C14960mT.A01((((float) A0I3) / 4.0f) * (((float) A0I4) / 150.0f));
        ArrayList A14 = C36441kJ.A14(A013);
        C54032sI.A00(list3, A14, A013);
        return A14;
    }
}
