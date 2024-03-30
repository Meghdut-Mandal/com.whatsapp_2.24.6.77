package X;

import android.app.NotificationManager;
import java.util.Iterator;

/* renamed from: X.3sw  reason: invalid class name and case insensitive filesystem */
public class C78953sw implements AnonymousClass4UH {
    public C21060yb A00;
    public AnonymousClass1CR A01;

    public /* synthetic */ void BOc(String str) {
    }

    public /* synthetic */ void BOg(AnonymousClass37W r1) {
    }

    public void BOw(String str) {
        NotificationManager A07;
        Iterator it = this.A01.A0V().iterator();
        while (it.hasNext()) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append(" /settings/");
            C36321k7.A1a(A0v, ((AnonymousClass3LI) it.next()).toString());
        }
        if (C24501Cr.A00 && (A07 = this.A00.A07()) != null) {
            for (Object next : C34101gS.A02(A07)) {
                StringBuilder A0v2 = AnonymousClass000.A0v(str);
                A0v2.append("/setting/channel:");
                C36321k7.A1a(A0v2, next.toString());
            }
        }
    }

    public C78953sw(C21060yb r1, AnonymousClass1CR r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
