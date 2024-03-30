package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.99W  reason: invalid class name */
public abstract class AnonymousClass99W {
    public static final Map A00;

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("avg", AnonymousClass8TH.class);
        A0J.put("stddev", AnonymousClass8TI.class);
        A0J.put("sum", AnonymousClass8TG.class);
        A0J.put("min", AnonymousClass8TF.class);
        A0J.put("max", AnonymousClass8TE.class);
        A0J.put("concat", A8D.class);
        Class<A8E> cls = A8E.class;
        A0J.put("length", cls);
        A0J.put("size", cls);
        A0J.put("append", A8B.class);
        A0J.put("keys", A8C.class);
        A00 = Collections.unmodifiableMap(A0J);
    }
}
