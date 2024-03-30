package X;

import android.content.Context;
import android.util.SparseArray;
import com.whatsapp.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.67i  reason: invalid class name and case insensitive filesystem */
public class C1271967i {
    public final Context A00;
    public final SparseArray A01;
    public final AnonymousClass65A A02;
    public final boolean A03;
    public final Map A04 = Collections.synchronizedMap(new HashMap(4));
    public final Map A05 = new HashMap(4);

    public Object A01(int i) {
        Object obj = this.A01.get(i);
        if (obj != null) {
            return obj;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Null value associated with key: ");
        throw AnonymousClass001.A0A(AnonymousClass000.A0q(this.A00.getResources().getResourceEntryName(i), A0u));
    }

    public Object A02(AnonymousClass7fC r6, C140456lc r7, int i) {
        Integer valueOf;
        Object obj;
        Object obj2;
        int i2 = r7.A03;
        synchronized (this) {
            Map map = this.A05;
            valueOf = Integer.valueOf(i2);
            obj = map.get(valueOf);
            if (obj == null) {
                obj = C36441kJ.A11();
                map.put(valueOf, obj);
            }
        }
        synchronized (obj) {
            Map map2 = this.A04;
            SparseArray sparseArray = (SparseArray) map2.get(valueOf);
            if (sparseArray == null) {
                sparseArray = new SparseArray(2);
                map2.put(valueOf, sparseArray);
            }
            obj2 = sparseArray.get(i);
            if (obj2 == null) {
                obj2 = r6.BQA(this, r7);
            }
            sparseArray.put(i, obj2);
        }
        return obj2;
    }

    public C1271967i(Context context, SparseArray sparseArray, AnonymousClass65A r5) {
        this.A00 = context;
        this.A02 = r5;
        this.A03 = ((C141956o6) r5.A01).A03;
        this.A01 = sparseArray;
    }

    public static String A00(C1271967i r2) {
        return (String) r2.A01.get(R.id.bk_context_key_logging_id);
    }
}
