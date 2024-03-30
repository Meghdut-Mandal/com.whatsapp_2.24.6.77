package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2tv  reason: invalid class name and case insensitive filesystem */
public abstract class C55012tv {
    public static final List A00(C51882oX r5, Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        ArrayList A0J = C36321k7.A0J(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            AnonymousClass00C.A0D(A0l, 1);
            A0J.add(new AnonymousClass3JJ(r5, A0l, (C64933Qa) null));
        }
        return A0J;
    }
}
