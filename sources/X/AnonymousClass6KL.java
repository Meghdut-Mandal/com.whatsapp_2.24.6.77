package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6KL  reason: invalid class name */
public class AnonymousClass6KL {
    public final Map A00 = AnonymousClass001.A0J();
    public final Map A01 = AnonymousClass001.A0J();
    public final Map A02 = AnonymousClass001.A0J();

    public static HashMap A00(AnonymousClass6KL r3, String str) {
        HashMap hashMap;
        HashMap A0J = AnonymousClass001.A0J();
        Map A15 = C90514aH.A15(str, r3.A01);
        if (A15 == null) {
            hashMap = AnonymousClass001.A0J();
        } else {
            hashMap = new HashMap(A15);
        }
        A0J.put("data", hashMap);
        A0J.put("context", new HashMap(r3.A00));
        return A0J;
    }
}
