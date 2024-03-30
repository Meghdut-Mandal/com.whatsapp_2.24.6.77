package X;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.174  reason: invalid class name */
public final class AnonymousClass174 {
    public C605338f A00;
    public final C21700zf A01;

    public boolean A00(View view, C226715i r5, String str, long j) {
        if (view != null && this.A01.A04.A02) {
            C605338f r1 = new C605338f(view);
            this.A00 = r1;
            AnonymousClass3DJ r2 = new AnonymousClass3DJ(this, r5);
            C18740tg.A01();
            C18740tg.A01();
            if (r1.A01) {
                r2.A00();
            } else {
                List list = r1.A03;
                list.add(r2);
                Collections.sort(list, C81683xP.A00);
            }
        }
        return this.A01.A0D(str, j);
    }

    public AnonymousClass174(AnonymousClass173 r2, C21710zg r3, String str) {
        this.A01 = r2.A01(r3, str);
    }
}
