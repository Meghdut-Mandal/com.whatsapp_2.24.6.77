package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

/* renamed from: X.71C  reason: invalid class name */
public final class AnonymousClass71C implements C158717hx {
    public final AnonymousClass17Y A00;
    public final C1258061i A01;
    public final C130876Mt A02;

    public void BlS(Activity activity, C594233w r6, Map map) {
        Object obj;
        String str;
        Intent intent;
        Bundle extras;
        Map map2;
        if (map == null) {
            map = C000400e.A0D();
        }
        Object obj2 = map.get("values");
        String str2 = null;
        if (!(obj2 instanceof Map) || (map2 = (Map) obj2) == null) {
            obj = null;
        } else {
            obj = map2.get("in_pin_code");
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (!(activity == null || (intent = activity.getIntent()) == null || (extras = intent.getExtras()) == null)) {
            str2 = extras.getString("chat_id");
        }
        this.A02.A01(new C142576p6(r6, this), str, str2);
    }

    public AnonymousClass71C(AnonymousClass17Y r1, C130876Mt r2, C1258061i r3) {
        C36321k7.A0y(r3, r1);
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = r1;
    }
}
