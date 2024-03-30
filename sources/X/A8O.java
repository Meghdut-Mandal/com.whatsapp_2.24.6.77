package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class A8O implements C23091B4b {
    public final AnonymousClass9YQ A00 = C197039b2.A02.A01;

    public Set BGJ(Object obj) {
        if (!(obj instanceof List)) {
            return ((Map) obj).keySet();
        }
        throw AnonymousClass001.A0D();
    }

    public int BOA(Object obj) {
        String str;
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        if (obj instanceof Map) {
            return BGJ(obj).size();
        }
        if (obj instanceof String) {
            return ((String) obj).length();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("length operation cannot be applied to ");
        if (obj != null) {
            str = AnonymousClass000.A0k(obj);
        } else {
            str = "null";
        }
        throw new C21831Ab9(AnonymousClass000.A0q(str, A0u));
    }

    public void BqC(Object obj, int i, Object obj2) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (i == list.size()) {
                list.add(obj2);
            } else {
                list.set(i, obj2);
            }
        } else {
            throw AnonymousClass001.A0D();
        }
    }

    public void Brr(Object obj, Object obj2, Object obj3) {
        String str;
        if (obj instanceof Map) {
            ((Map) obj).put(obj2.toString(), obj3);
            return;
        }
        if (AnonymousClass000.A0l(obj, "setProperty operation cannot be used with ", AnonymousClass000.A0u()) != null) {
            str = AnonymousClass000.A0k(obj);
        } else {
            str = "null";
        }
        throw new C21831Ab9(str);
    }

    public Iterable Bvj(Object obj) {
        String str;
        if (obj instanceof List) {
            return (Iterable) obj;
        }
        if (AnonymousClass000.A0l(obj, "Cannot iterate over ", AnonymousClass000.A0u()) != null) {
            str = AnonymousClass000.A0k(obj);
        } else {
            str = "null";
        }
        throw new C21831Ab9(str);
    }
}
