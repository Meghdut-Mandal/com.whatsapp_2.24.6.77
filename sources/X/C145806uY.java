package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.6uY  reason: invalid class name and case insensitive filesystem */
public class C145806uY implements C159487jR {
    public final /* synthetic */ C145896uh A00;

    public C145806uY(C145896uh r1) {
        this.A00 = r1;
    }

    public void BWx(C1261662u r6, int i) {
        C143526qh r4 = this.A00.A0A;
        if (r4 != null) {
            Map map = r4.A0B;
            C119275pY r2 = (C119275pY) C36371kC.A0r(map, 1);
            C119275pY r0 = (C119275pY) C36371kC.A0r(map, 2);
            if (r2 != null) {
                r2.A00 = 2;
            }
            if (r0 != null) {
                r0.A00 = 2;
            }
            C143526qh.A05(r4, r6, i, 0);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        C143526qh r6 = this.A00.A0A;
        if (r6 != null) {
            synchronized (C143526qh.class) {
                Map map = r6.A0B;
                C119275pY r7 = (C119275pY) C36371kC.A0r(map, 1);
                C119275pY r4 = (C119275pY) C36371kC.A0r(map, 2);
                if (list.isEmpty()) {
                    C124535yM r3 = r6.A06;
                    r3.A02 = 4;
                    r3.A00 = 3;
                    r3.A01 = 0;
                    r3.A07 = new C1261662u((Integer) null, (String) null, 7);
                    if (r7 != null) {
                        r7.A00 = 2;
                    }
                    if (r4 != null) {
                        r4.A00 = 2;
                    }
                    Log.e("HomeWidgetsDelegate/onFetchWidgetsSuccess widgets list cannot be empty");
                    r6.A0A();
                } else {
                    if (r7 != null) {
                        r7.A00 = 1;
                        r7.A01 = list.get(0);
                        C143526qh.A04(r6, 1);
                    }
                    if (r4 != null) {
                        r4.A00 = 1;
                        r4.A01 = list.get(1);
                        C143526qh.A04(r6, 2);
                    }
                    C143526qh.A03(r6);
                }
            }
        }
    }
}
