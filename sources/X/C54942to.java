package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.2to  reason: invalid class name and case insensitive filesystem */
public abstract class C54942to {
    public static final LinkedHashMap A00(Uri uri) {
        AnonymousClass00C.A0D(uri, 0);
        String query = uri.getQuery();
        if (query == null) {
            return null;
        }
        List A0L = AnonymousClass099.A0L(query, new String[]{"&"}, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(A0L));
        Iterator it = A0L.iterator();
        while (it.hasNext()) {
            List A0L2 = AnonymousClass099.A0L(AnonymousClass001.A0C(it), new String[]{"="}, 0);
            linkedHashMap.put(A0L2.get(0), A0L2.get(1));
        }
        return linkedHashMap;
    }
}
