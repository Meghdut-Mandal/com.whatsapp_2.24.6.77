package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

/* renamed from: X.71D  reason: invalid class name */
public final class AnonymousClass71D implements C158717hx {
    public final AnonymousClass1KT A00;
    public final C20810yC A01;
    public final C131376Ou A02;

    public void BlS(Activity activity, C594233w r8, Map map) {
        Intent intent;
        Bundle extras;
        String str;
        String str2;
        int i;
        Intent intent2;
        Bundle extras2;
        String string;
        if (!(activity == null || (intent2 = activity.getIntent()) == null || (extras2 = intent2.getExtras()) == null || (string = extras2.getString("fds_observer_id")) == null)) {
            this.A02.A02(string).A02(new C149036zp());
        }
        if (this.A01.A0E(4510) && activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("flow_id");
            int i2 = 0;
            if (map == null || !map.containsKey("is_valid") || C90464aC.A1a(map, "is_valid")) {
                AnonymousClass1KT r0 = this.A00;
                if (string2 != null) {
                    i2 = string2.hashCode();
                }
                r0.A0C(i2, 2);
                return;
            }
            if (map.containsKey("error_type")) {
                str = C90484aE.A0m("error_type", map);
            } else {
                str = "UNKNOWN";
            }
            if (map.containsKey("error_message")) {
                str2 = C90484aE.A0m("error_message", map);
            } else {
                str2 = null;
            }
            AnonymousClass1KT r1 = this.A00;
            if (string2 != null) {
                i = string2.hashCode();
            } else {
                i = 0;
            }
            r1.A0B(i, str, str2);
            if (string2 != null) {
                i2 = string2.hashCode();
            }
            r1.A0C(i2, 3);
        }
    }

    public AnonymousClass71D(AnonymousClass1KT r1, C20810yC r2, C131376Ou r3) {
        C36321k7.A0x(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
