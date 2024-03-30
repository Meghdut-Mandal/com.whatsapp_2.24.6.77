package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.0md  reason: invalid class name and case insensitive filesystem */
public abstract class C15060md extends C15070me {
    public static final C12810ih A02(C006302t r2, C16970qV r3) {
        return new C12810ih(r2, r3, true);
    }

    public static final C12810ih A03(C006302t r4, C16970qV r5) {
        AnonymousClass00C.A0D(r5, 0);
        return new C12810ih(C14760m9.A00, new C12790if(r4, r5), false);
    }

    public static final C12820ii A04(C16970qV r3, C16970qV r4) {
        AnonymousClass00C.A0D(r3, 0);
        C18660tW r32 = new C18660tW(new C16970qV[]{r3, r4}, 1);
        return new C12820ii(C14750m8.A00, C14740m7.A00, r32);
    }

    public static final List A00(C16970qV r3) {
        Iterator it = r3.iterator();
        if (!it.hasNext()) {
            return C023409w.A00;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            List singletonList = Collections.singletonList(next);
            AnonymousClass00C.A08(singletonList);
            return singletonList;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        while (true) {
            A0I.add(next);
            if (!it.hasNext()) {
                return A0I;
            }
            next = it.next();
        }
    }

    public static final Set A01(C16970qV r3) {
        Iterator it = r3.iterator();
        if (!it.hasNext()) {
            return C004702c.A00;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Set singleton = Collections.singleton(next);
            AnonymousClass00C.A08(singleton);
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            linkedHashSet.add(next);
            if (!it.hasNext()) {
                return linkedHashSet;
            }
            next = it.next();
        }
    }
}
