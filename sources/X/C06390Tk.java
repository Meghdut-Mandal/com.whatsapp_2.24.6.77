package X;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Tk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C06390Tk {
    public final /* synthetic */ C07100Wi A00;

    public /* synthetic */ C06390Tk(C07100Wi r1) {
        this.A00 = r1;
    }

    public final Object A00() {
        Map map;
        C07100Wi r0 = this.A00;
        Cursor query = r0.A00.query(r0.A02, C07100Wi.A08, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new AnonymousClass008(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
