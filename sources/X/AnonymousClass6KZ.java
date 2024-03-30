package X;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.6KZ  reason: invalid class name */
public class AnonymousClass6KZ {
    public final WeakReference A00;
    public final Handler A01;
    public final Runnable A02;
    public final /* synthetic */ C142566p5 A03;

    public AnonymousClass6KZ(C142566p5 r5, AnonymousClass6VU r6, String str) {
        this.A03 = r5;
        Handler handler = new Handler();
        this.A01 = handler;
        this.A00 = AnonymousClass001.A0F(r6);
        AnonymousClass751 r2 = new AnonymousClass751(9, str, this);
        this.A02 = r2;
        handler.postDelayed(r2, AnonymousClass6X5.A0L);
    }

    public static void A00(AnonymousClass6KZ r2, String str) {
        r2.A01.removeCallbacks(r2.A02);
        Map map = r2.A03.A01.A09;
        if (map.containsKey(str)) {
            ((C132576Ui) map.get(str)).A0A.remove(r2);
        }
    }
}
