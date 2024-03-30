package X;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Vs  reason: invalid class name */
public final class AnonymousClass6Vs {
    public static final AnonymousClass6Vs A00 = new AnonymousClass6Vs();

    public static final String A00(String str, Map map) {
        C113055ev.A00.getValue();
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(':');
        AnonymousClass6Vs r1 = A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        r1.A01(map, A0u);
        A0v.append(C36381kD.A0y(A0u));
        A0v.append(':');
        A0v.append("b3ee4083bc5153a49b8915306fcb062aac140bd37f9c3c5b42e55d85397fdf0c");
        String A0f = C90464aC.A0f("", A0v, ':');
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        AnonymousClass00C.A08(instance);
        Charset charset = AnonymousClass0S4.A05;
        instance.update(C36371kC.A1Z(A0f, charset));
        byte[] digest = instance.digest();
        AnonymousClass00C.A08(digest);
        return new String(digest, charset);
    }

    private final void A01(Object obj, StringBuilder sb) {
        if (obj == null) {
            return;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String) || (obj instanceof Enum)) {
            sb.append(obj);
        } else if (obj instanceof List) {
            Iterator A12 = C90514aH.A12((Iterable) obj);
            while (A12.hasNext()) {
                A00.A01(A12.next(), sb);
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            AnonymousClass00C.A0D(map, 0);
            Iterator A10 = C36371kC.A10(new TreeMap(map));
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                AnonymousClass6Vs r1 = A00;
                r1.A01(A11.getKey(), sb);
                r1.A01(A11.getValue(), sb);
            }
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unexpected object value type ");
            A0u.append(obj.getClass());
            throw AnonymousClass000.A0b(A0u);
        }
    }

    public static final boolean A02(C118835oo r6, long j, long j2) {
        long j3 = r6.A00;
        Integer num = r6.A01;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(j);
        if (j3 >= 0 && millis > 0 && j3 + millis > j2) {
            return true;
        }
        if (num == C023109s.A00 && millis == 0 && j2 - j3 < timeUnit.toMillis(5)) {
            return true;
        }
        return false;
    }
}
