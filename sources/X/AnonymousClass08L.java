package X;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;

/* renamed from: X.08L  reason: invalid class name */
public abstract class AnonymousClass08L {
    public static final AnonymousClass08M A00(Bundle bundle, Bundle bundle2) {
        AbstractMap abstractMap;
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            abstractMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                abstractMap.put(obj, parcelableArrayList2.get(i));
            }
        } else if (bundle2 == null) {
            return new AnonymousClass08M();
        } else {
            abstractMap = new HashMap();
            for (String next : bundle2.keySet()) {
                AnonymousClass00C.A06(next);
                abstractMap.put(next, bundle2.get(next));
            }
        }
        return new AnonymousClass08M(abstractMap);
    }
}
