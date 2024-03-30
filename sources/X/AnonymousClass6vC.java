package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.6vC  reason: invalid class name */
public class AnonymousClass6vC implements AnonymousClass1XI {
    public final Map A00;
    public final Map A01;
    public final AnonymousClass1H2 A02;
    public final AnonymousClass1XJ A03;
    public final C104655Aq A04;
    public final Map A05 = AnonymousClass001.A0J();

    public synchronized void A01(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A00((C161307mX) it.next(), this.A01);
        }
    }

    public Collection B7G(String str, int i, boolean z, boolean z2) {
        HashMap A0J = AnonymousClass001.A0J();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = this.A04.A04().iterator();
        while (it.hasNext()) {
            C161307mX r1 = (C161307mX) it.next();
            if (r1 instanceof C146796wB) {
                A00(r1, A0J);
            }
            A0I.addAll(Arrays.asList(r1.BBU()));
        }
        ArrayList A032 = this.A03.A03(str, A0I, AnonymousClass001.A0I(), i, false);
        LinkedHashSet A17 = C36441kJ.A17();
        LinkedHashSet A172 = C36441kJ.A17();
        ArrayList A14 = C36441kJ.A14(4);
        A14.add(A0J);
        A14.add(this.A00);
        A14.add(this.A01);
        A14.add(this.A05);
        synchronized (this) {
            Iterator it2 = A14.iterator();
            while (it2.hasNext()) {
                Map map = (Map) it2.next();
                Iterator it3 = A032.iterator();
                while (it3.hasNext()) {
                    Collection<C161307mX> collection = (Collection) map.get((AnonymousClass1XQ) it3.next());
                    if (collection != null) {
                        for (C161307mX r12 : collection) {
                            if (r12 instanceof C146796wB) {
                                A172.add(r12);
                            } else {
                                A17.add(r12);
                            }
                        }
                    }
                }
            }
        }
        Iterator it4 = A032.iterator();
        while (it4.hasNext()) {
            A17.add(new C146786wA((AnonymousClass1XQ) it4.next(), this.A02));
        }
        LinkedHashSet linkedHashSet = A172;
        if (z) {
            linkedHashSet = A17;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
        if (z) {
            A17 = A172;
        }
        linkedHashSet2.addAll(A17);
        return linkedHashSet2;
    }

    public void B2o() {
        this.A03.B2o();
    }

    public Collection B7H(String[] strArr, int i, boolean z, boolean z2) {
        C18740tg.A0D(false, "Not implemented");
        return AnonymousClass001.A0I();
    }

    public void Br6(boolean z) {
        this.A03.Br6(z);
    }

    public int getCount() {
        return this.A03.getCount();
    }

    public AnonymousClass6vC(AnonymousClass1H2 r4, AnonymousClass1XJ r5, C104655Aq r6) {
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        Iterator it = C129866It.A00().iterator();
        while (it.hasNext()) {
            A00((C161307mX) it.next(), this.A05);
        }
        this.A00 = AnonymousClass001.A0J();
        this.A01 = AnonymousClass001.A0J();
    }

    public static void A00(C161307mX r5, Map map) {
        for (AnonymousClass1XQ r1 : r5.BBU()) {
            Collection collection = (Collection) map.get(r1);
            if (collection == null) {
                collection = C36441kJ.A17();
                map.put(r1, collection);
            }
            collection.add(r5);
        }
    }
}
