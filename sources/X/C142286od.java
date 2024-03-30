package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6od  reason: invalid class name and case insensitive filesystem */
public class C142286od implements AnonymousClass7fJ {
    public final AnonymousClass7fJ A00;
    public final Set A01;

    public /* bridge */ /* synthetic */ Object B6u(AnonymousClass6MO r5, C115215iW r6, C124125xd r7) {
        for (C142266ob r2 : this.A01) {
            if (r2.A00.contains(r6.A00)) {
                return r2.B6u(r5, r6, r7);
            }
        }
        AnonymousClass7fJ r0 = this.A00;
        if (r0 != null) {
            return r0.B6u(r5, r6, r7);
        }
        return null;
    }

    public C142286od(AnonymousClass7fJ r9, Set set) {
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C142266ob r5 = (C142266ob) it.next();
            Iterator it2 = r5.A00.iterator();
            while (it2.hasNext()) {
                String A0C = AnonymousClass001.A0C(it2);
                if (A0J.containsKey(A0C)) {
                    String A0k = C90484aE.A0k(this);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Duplicate support for action=");
                    A0u.append(A0C);
                    A0u.append(" by ");
                    A0u.append(r5);
                    A0u.append(" and ");
                    Log.e(A0k, AnonymousClass000.A0o(A0J.get(A0C), A0u));
                }
                A0J.put(A0C, r5);
            }
        }
        this.A01 = set;
        this.A00 = r9;
    }
}
