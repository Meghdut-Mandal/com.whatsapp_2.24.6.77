package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.List;

/* renamed from: X.0cS  reason: invalid class name and case insensitive filesystem */
public class C09490cS implements C17010qZ {
    public final /* synthetic */ C03450Fb A00;

    public C09490cS(C03450Fb r1) {
        this.A00 = r1;
    }

    public void BZQ(MenuItem menuItem, C016307a r9) {
        C03450Fb r1 = this.A00;
        Handler handler = r1.A0F;
        C06140Sl r0 = null;
        handler.removeCallbacksAndMessages((Object) null);
        List list = r1.A0L;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (r9 != ((C06140Sl) list.get(i)).A01) {
                i++;
            } else if (i != -1) {
                int i2 = i + 1;
                if (i2 < list.size()) {
                    r0 = (C06140Sl) list.get(i2);
                }
                handler.postAtTime(new C11930hE(menuItem, this, r0, r9), r9, SystemClock.uptimeMillis() + 200);
                return;
            } else {
                return;
            }
        }
    }

    public void BZR(MenuItem menuItem, C016307a r3) {
        this.A00.A0F.removeCallbacksAndMessages(r3);
    }
}
