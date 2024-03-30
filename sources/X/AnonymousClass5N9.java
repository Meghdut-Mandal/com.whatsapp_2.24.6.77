package X;

import android.util.Pair;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5N9  reason: invalid class name */
public class AnonymousClass5N9 extends AnonymousClass1VI {
    public static final Set A00;
    public static final Set A01;

    public AnonymousClass5N9() {
        super(A00, A01);
    }

    static {
        HashSet A16 = C36441kJ.A16();
        C156737aS r1 = C114175gm.A01;
        String str = r1.A02;
        AnonymousClass72I r2 = r1.A01;
        A00(r2, str, A16);
        C156737aS r0 = C114175gm.A02;
        A00(r0.A01, r0.A02, A16);
        C156737aS r6 = C114175gm.A09;
        String str2 = r6.A02;
        A00(r2, str2, A16);
        C156737aS r4 = C114175gm.A06;
        String str3 = r4.A02;
        A00(r2, str3, A16);
        A00 = Collections.unmodifiableSet(A16);
        HashSet A162 = C36441kJ.A16();
        C156737aS r02 = C114175gm.A04;
        A00(r02.A01, r02.A02, A162);
        C156737aS r03 = C114175gm.A05;
        A00(r03.A01, r03.A02, A162);
        A00(r6.A01, str2, A162);
        A00(r4.A01, str3, A162);
        A01 = Collections.unmodifiableSet(A162);
    }

    public static void A00(AnonymousClass72I r0, Object obj, AbstractCollection abstractCollection) {
        C18740tg.A06(r0);
        abstractCollection.add(Pair.create(obj, r0.sha1Hash));
    }
}
