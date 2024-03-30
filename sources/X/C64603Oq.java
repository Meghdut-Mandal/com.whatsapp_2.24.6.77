package X;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* renamed from: X.3Oq  reason: invalid class name and case insensitive filesystem */
public class C64603Oq {
    public C592933j A00;
    public final C80203v1 A01;
    public final C61283Bg A02 = new C61283Bg(this);
    public final LinkedHashMap A03 = C36431kI.A1G();

    public static void A00(C61973Ef r6, C61273Bf r7, C64603Oq r8, AnonymousClass3PT r9) {
        C56952xQ r5 = new C56952xQ();
        C592933j r0 = new C592933j(r7, r5, new AnonymousClass3B4(C36341k9.A0H(), new C68323bi(), r6, r5, r9));
        r8.A00 = r0;
        r0.A01.A00 = r8.A02;
    }

    public void A01(View view, C130836Mp r5) {
        Object obj;
        if (view != null) {
            WeakHashMap weakHashMap = AnonymousClass3PK.A01;
            obj = weakHashMap.get(view);
            if (obj == null) {
                obj = new AnonymousClass3PK(view);
                weakHashMap.put(view, obj);
            }
        } else {
            obj = null;
        }
        C592933j r0 = this.A00;
        if (r0 != null && obj != null) {
            C56952xQ r1 = r0.A00;
            synchronized (r1) {
                r1.A00.put(obj, r5);
            }
        }
    }

    public C64603Oq(C80203v1 r2) {
        this.A01 = r2;
    }
}
