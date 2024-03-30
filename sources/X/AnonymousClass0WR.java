package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.0WR  reason: invalid class name */
public class AnonymousClass0WR {
    public final Map A00;
    public final Map A01 = AnonymousClass001.A0J();

    public static void A00(AnonymousClass05R r5, AnonymousClass012 r6, Object obj, List list) {
        Method method;
        Object[] objArr;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    AnonymousClass0UJ r1 = (AnonymousClass0UJ) list.get(size);
                    try {
                        int i = r1.A00;
                        if (i == 0) {
                            method = r1.A01;
                            objArr = new Object[0];
                        } else if (i != 1) {
                            method = r1.A01;
                            objArr = new Object[]{r6, r5};
                        } else {
                            method = r1.A01;
                            objArr = new Object[]{r6};
                        }
                        method.invoke(obj, objArr);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw AnonymousClass001.A0B(e2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public AnonymousClass0WR(Map map) {
        this.A00 = map;
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object value = A11.getValue();
            List list = (List) this.A01.get(value);
            if (list == null) {
                list = AnonymousClass001.A0I();
                this.A01.put(value, list);
            }
            list.add(A11.getKey());
        }
    }
}
