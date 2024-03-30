package X;

import android.util.Pair;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5NA  reason: invalid class name */
public class AnonymousClass5NA extends AnonymousClass1VI {
    public static final Set A00;
    public static final Set A01;

    public AnonymousClass5NA() {
        super(A00, A01);
    }

    static {
        HashSet A16 = C36441kJ.A16();
        Set<Object> set = C197129bB.A1P;
        HashSet A162 = C36441kJ.A16();
        for (Object obj : set) {
            Collection collection = (Collection) C197129bB.A0z.get(obj);
            if (collection == null) {
                collection = Collections.unmodifiableSet(C36421kH.A0g(new AnonymousClass72I[]{C197129bB.A01}));
            }
            A162.addAll(collection);
        }
        for (AnonymousClass72I r0 : Collections.unmodifiableSet(A162)) {
            String str = r0.sha1Hash;
            A16.add(Pair.create("com.whatsapp", str));
            A16.add(Pair.create("com.whatsapp.w4b", str));
        }
        A00 = Collections.unmodifiableSet(A16);
        HashSet A163 = C36441kJ.A16();
        AnonymousClass72I r1 = C197129bB.A0y;
        A163.add(Pair.create("com.whatsapp", r1.sha1Hash));
        A163.add(Pair.create("com.whatsapp.w4b", r1.sha1Hash));
        A01 = Collections.unmodifiableSet(A163);
    }
}
