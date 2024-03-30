package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0WT  reason: invalid class name */
public final class AnonymousClass0WT {
    public final Map A00 = Collections.synchronizedMap(new WeakHashMap());
    public final Map A01 = Collections.synchronizedMap(new WeakHashMap());

    public static final void A00(Status status, AnonymousClass0WT r5, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = r5.A00;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = r5.A01;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            if (z || AnonymousClass000.A1X(A11.getValue())) {
                ((BasePendingResult) A11.getKey()).A07(status);
            }
        }
        Iterator it2 = hashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry A112 = AnonymousClass000.A11(it2);
            if (z || AnonymousClass000.A1X(A112.getValue())) {
                ((TaskCompletionSource) A112.getKey()).trySetException(new ApiException(status));
            }
        }
    }
}
