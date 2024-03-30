package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.13R  reason: invalid class name */
public class AnonymousClass13R {
    public C20070wy A00;
    public final AnonymousClass005 A01;

    public AnonymousClass13R(C19630wG r4) {
        this.A01 = new C18910u1((Object) null, new C36251k0(r4, 5));
    }

    public C20070wy A00() {
        C20070wy r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                HashMap hashMap = new HashMap();
                for (C227415p r3 : (Set) this.A01.get()) {
                    C18740tg.A06(r3);
                    String str = r3.A05;
                    C18740tg.A06(str);
                    if (hashMap.containsKey(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MigrationRegistry/addMigration/duplicate; name=");
                        sb.append(str);
                        Log.w(sb.toString());
                    }
                    hashMap.put(str, r3);
                }
                r0 = C20070wy.copyOf((Map) hashMap);
                this.A00 = r0;
            }
        }
        return r0;
    }
}
