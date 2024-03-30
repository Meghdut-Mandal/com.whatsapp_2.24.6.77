package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7ZI  reason: invalid class name */
public final class AnonymousClass7ZI extends AnonymousClass00R implements C009003v {
    public static final AnonymousClass7ZI A00 = new AnonymousClass7ZI();

    public AnonymousClass7ZI() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C137156fg r8 = (C137156fg) obj2;
        LinkedHashMap A06 = C000400e.A06(r8.A02);
        Iterator A0z = AnonymousClass000.A0z(r8.A01);
        while (A0z.hasNext()) {
            AnonymousClass63D r3 = (AnonymousClass63D) A0z.next();
            if (r3.A00) {
                Map Bla = r3.A01.Bla();
                boolean isEmpty = Bla.isEmpty();
                Object obj3 = r3.A02;
                if (isEmpty) {
                    A06.remove(obj3);
                } else {
                    A06.put(obj3, Bla);
                }
            }
        }
        if (A06.isEmpty()) {
            return null;
        }
        return A06;
    }
}
