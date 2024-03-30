package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6qF  reason: invalid class name and case insensitive filesystem */
public final class C143256qF implements C159977kG {
    public final C131376Ou A00;

    public C143256qF(C131376Ou r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void Bpp(Activity activity, C1260062e r8, Map map) {
        Intent intent;
        Bundle extras;
        String string;
        if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null && (string = extras.getString("fds_observer_id")) != null && map != null) {
            LinkedHashMap A1G = C36431kI.A1G();
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                if (!(A11.getKey() == null || A11.getValue() == null)) {
                    C36411kG.A1T(A1G, A11);
                }
            }
            LinkedHashMap A0s = C90474aD.A0s(A1G);
            Iterator A0y2 = AnonymousClass000.A0y(A1G);
            while (A0y2.hasNext()) {
                Map.Entry A112 = AnonymousClass000.A11(A0y2);
                A0s.put(String.valueOf(A112.getKey()), A112.getValue());
            }
            this.A00.A02(string).A02(new AnonymousClass70E(A0s));
        }
    }

    public String B9X(Activity activity) {
        throw C90464aC.A0o();
    }

    public String BEN(Activity activity) {
        throw C90464aC.A0o();
    }
}
