package X;

import android.os.Build;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.62t  reason: invalid class name and case insensitive filesystem */
public class C1261562t {
    public boolean A00;
    public final AnonymousClass005 A01;
    public final Map A02 = AnonymousClass001.A0J();

    public synchronized Object A00(String str) {
        Object obj;
        if (!this.A00) {
            String A0e = ((C19420v0) this.A01.get()).A0e();
            Map map = this.A02;
            map.put("device_id", A0e);
            map.put("app_build", "release");
            map.put("release_channel", "release");
            Objects.requireNonNull("2.24.6.77");
            map.put("app_version", "2.24.6.77");
            map.put("os_version", Build.VERSION.RELEASE);
            map.put("platform", "android");
            this.A00 = true;
        }
        Map map2 = this.A02;
        if (map2.containsKey(str)) {
            obj = map2.get(str);
            Objects.requireNonNull(obj);
        } else {
            throw AnonymousClass000.A0c(" has not been set on UserInfo", AnonymousClass000.A0v(str));
        }
        return obj;
    }

    public C1261562t(AnonymousClass005 r2) {
        this.A01 = r2;
    }
}
