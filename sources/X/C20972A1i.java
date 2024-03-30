package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.A1i  reason: case insensitive filesystem */
public class C20972A1i implements B3B, B3M {
    public final AnonymousClass9CT A00 = new AnonymousClass9CT();
    public final C23109B5o A01;

    public synchronized void Bok() {
        C23109B5o b5o = this.A01;
        C197479bm r2 = new C197479bm(this.A00);
        A27 a27 = (A27) b5o;
        synchronized (a27) {
            AnonymousClass9S2 r6 = a27.A03;
            AnonymousClass94T r4 = C23112B5r.A00;
            r6.A00(r4);
            r6.A00(r4);
            A27.A00(a27);
            if (a27.A07 == 2) {
                a27.A00 = r2;
                AnonymousClass94P r0 = C197479bm.A02;
                Map map = r2.A00;
                String str = (String) map.remove(r0);
                String str2 = (String) map.remove(C197479bm.A03);
                String str3 = (String) map.remove(C197479bm.A01);
                if (str != null) {
                    ((C23112B5r) r6.A00(r4)).Brp(str);
                }
                if (str2 != null) {
                    r6.A00(r4);
                }
                if (str3 != null) {
                    r6.A00(r4);
                }
                a27.A01.connect();
                a27.A07 = 3;
            }
            r6.A00(r4);
        }
    }

    public synchronized void destroy() {
        this.A01.release();
    }

    public synchronized void pause() {
        A27 a27 = (A27) this.A01;
        synchronized (a27) {
            if (a27.A07 == 3 || a27.A07 == 4) {
                a27.A07 = 2;
                a27.A01.B5X();
            }
            if (!a27.A04) {
                a27.release();
            }
        }
    }

    public void B1R(String str) {
        if (((A27) this.A01).A07 == 0) {
            throw AnonymousClass001.A09(str);
        }
    }

    public C23113B5s B9y(C1691688a r2) {
        return this.A01.B9y(r2);
    }

    public C22876AxX B9z(AnonymousClass94T r2) {
        return this.A01.B9z(r2);
    }

    public Object BA0(AnonymousClass94Q r2) {
        return this.A01.BA0(r2);
    }

    public boolean BLR(C1691688a r2) {
        return this.A01.BLR(r2);
    }

    public boolean BLS(AnonymousClass94T r2) {
        return this.A01.BLS(r2);
    }

    public Context getContext() {
        return this.A01.getContext();
    }

    public C20972A1i(C23109B5o b5o) {
        this.A01 = b5o;
    }
}
