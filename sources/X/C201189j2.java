package X;

import android.os.Build;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.9j2  reason: invalid class name and case insensitive filesystem */
public class C201189j2 {
    public static final Map A05;
    public final Map A00;
    public final Set A01;
    public final Executor A02;
    public final AnonymousClass004 A03;
    public final Map A04;

    static {
        Map A0J;
        if (Build.VERSION.SDK_INT >= 24) {
            A0J = C90524aI.A0s();
        } else {
            A0J = AnonymousClass001.A0J();
        }
        A05 = A0J;
    }

    public static C133076Wo A00(C201189j2 r4, AnonymousClass004 r5) {
        C133076Wo r2 = new C133076Wo(r4.A02, r5);
        if (Build.VERSION.SDK_INT >= 24) {
            r4.A04.put("linkedapp_app_identity", r2);
            return r2;
        }
        Map map = r4.A04;
        synchronized (map) {
            map.put("linkedapp_app_identity", r2);
        }
        return r2;
    }

    public C133076Wo A01() {
        C133076Wo r0;
        int i = Build.VERSION.SDK_INT;
        Map map = this.A04;
        if (i >= 24) {
            C133076Wo r02 = (C133076Wo) map.get("linkedapp_app_identity");
            if (r02 == null) {
                return (C133076Wo) map.computeIfAbsent("linkedapp_app_identity", new C21742AYw(this));
            }
            return r02;
        }
        synchronized (map) {
            r0 = (C133076Wo) map.get("linkedapp_app_identity");
            if (r0 == null) {
                r0 = A00(this, new BAU(this));
            }
        }
        return r0;
    }

    public C201189j2(Set set, Executor executor, AnonymousClass004 r5) {
        Map A0J;
        if (Build.VERSION.SDK_INT >= 24) {
            A0J = C90524aI.A0s();
        } else {
            A0J = AnonymousClass001.A0J();
        }
        this.A04 = A0J;
        this.A00 = AnonymousClass001.A0J();
        this.A02 = executor;
        this.A03 = r5;
        this.A01 = set;
    }
}
