package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1eV  reason: invalid class name and case insensitive filesystem */
public class C32971eV {
    public final C29231Vv A00;
    public final C24601Db A01;
    public final C29121Vk A02;
    public final AnonymousClass1EU A03;
    public final C19770wU A04;

    public C1031954i A00() {
        C175768b1 r0;
        AnonymousClass1EU r02 = this.A03;
        AnonymousClass1EU.A00(r02);
        ArrayList A08 = r02.A06.A08();
        if (A08.isEmpty() || (r0 = (C175768b1) A08.get(0)) == null) {
            return null;
        }
        return new C1031954i(r0);
    }

    public ArrayList A01(String str) {
        AnonymousClass1EU r0 = this.A03;
        AnonymousClass1EU.A00(r0);
        ArrayList A09 = r0.A06.A09();
        ArrayList arrayList = new ArrayList();
        Iterator it = A09.iterator();
        while (it.hasNext()) {
            C207249un r2 = (C207249un) it.next();
            if (r2 instanceof C175788b3) {
                C175788b3 r22 = (C175788b3) r2;
                if (str != null && !str.equalsIgnoreCase(r22.A00)) {
                    C175898bF r1 = r22.A08;
                    if (r1 instanceof C175838b9) {
                        if (!((C175838b9) r1).A03.containsKey(str)) {
                        }
                    }
                }
                arrayList.add(r22);
            }
        }
        return arrayList;
    }

    public C32971eV(C29231Vv r1, C24601Db r2, C29121Vk r3, AnonymousClass1EU r4, C19770wU r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
