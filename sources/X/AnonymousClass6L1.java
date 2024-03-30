package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6L1  reason: invalid class name */
public class AnonymousClass6L1 {
    public AnonymousClass6DV A00;
    public List A01 = AnonymousClass001.A0I();
    public final C130846Mq A02;
    public final List A03 = AnonymousClass001.A0I();
    public final AnonymousClass1QW A04;

    public AnonymousClass6L1(C130846Mq r2, AnonymousClass1QW r3) {
        this.A04 = r3;
        this.A02 = r2;
    }

    public static ArrayList A00(List list, Map map) {
        AnonymousClass6CB r0;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C144416s9 r3 = (C144416s9) it.next();
            if (!(r3.A01 == 1 || (r0 = (AnonymousClass6CB) map.get(r3.A0F)) == null)) {
                List list2 = r0.A02;
                List list3 = r0.A03;
                String str = r0.A01;
                r3 = C144416s9.A00(r3);
                r3.A06 = list2;
                r3.A05 = list3;
                r3.A04 = str;
                r3.A01 = 1;
            }
            A0I.add(r3);
        }
        return A0I;
    }
}
