package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.A1j  reason: case insensitive filesystem */
public class C20973A1j implements B3B, B3M {
    public int A00 = 0;
    public final Map A01 = AnonymousClass001.A0J();
    public final ConcurrentHashMap A02 = C90524aI.A0s();
    public final Context A03;
    public final C197439bi A04;
    public final AnonymousClass9VB A05 = new AnonymousClass9VB();

    public void A01(C23113B5s b5s, C1691688a r5) {
        this.A02.put(b5s, b5s);
        Map map = this.A01;
        synchronized (map) {
            Map map2 = (Map) map.get(r5);
            if (map2 == null) {
                map2 = AnonymousClass001.A0J();
                map.put(r5, map2);
            }
            C90504aG.A1K(b5s, map2, 0);
        }
    }

    public C23113B5s B9y(C1691688a r6) {
        C23113B5s b5s;
        synchronized (this) {
            A00();
            b5s = null;
            Map map = this.A01;
            synchronized (map) {
                try {
                    Map map2 = (Map) map.get(r6);
                    if (map2 != null) {
                        b5s = (C23113B5s) C36371kC.A0r(map2, 0);
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            if (b5s == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Requested component is null for index: ");
                A0u.append(0);
                th = AnonymousClass000.A0f(r6, " and componentClass: ", A0u);
                throw th;
            }
        }
        return b5s;
    }

    public synchronized void Bok() {
        C23112B5r b5r;
        A00();
        B1R("LiteCameraController must be initialized before invoking resume()");
        if (this.A00 == 1) {
            AnonymousClass94T r1 = C23112B5r.A00;
            if (BLS(r1)) {
                b5r = (C23112B5r) B9z(r1);
                if (b5r != null) {
                    b5r.BOf("connect_controllers_started", "ComponentManager", (Map) null, (long) hashCode());
                }
            } else {
                b5r = null;
            }
            this.A00 = 2;
            Iterator A10 = C36391kE.A10(this.A02);
            while (A10.hasNext()) {
                ((C23113B5s) A10.next()).connect();
            }
            if (b5r != null) {
                b5r.BOf("connect_controllers_finished", "ComponentManager", (Map) null, (long) hashCode());
            }
        }
    }

    public synchronized void destroy() {
        if (this.A00 != 0) {
            pause();
            Iterator A10 = C36391kE.A10(this.A02);
            while (A10.hasNext()) {
                ((C23113B5s) A10.next()).release();
            }
            this.A00 = 0;
        }
    }

    public synchronized void pause() {
        B1R("LiteCameraController must be initialized before invoking pause()");
        if (this.A00 == 2) {
            this.A00 = 1;
            Iterator A10 = C36391kE.A10(this.A02);
            while (A10.hasNext()) {
                ((C23113B5s) A10.next()).B5X();
            }
        }
    }

    public void A00() {
        C23112B5r b5r;
        if (this.A00 == 0) {
            AnonymousClass94T r1 = C23112B5r.A00;
            if (BLS(r1)) {
                b5r = (C23112B5r) B9z(r1);
                if (b5r != null) {
                    b5r.BOf("init_controllers_started", "ComponentManager", (Map) null, (long) hashCode());
                }
            } else {
                b5r = null;
            }
            this.A00 = 1;
            List list = this.A05.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A24 a24 = (A24) ((C22876AxX) list.get(i));
                if (!a24.A01) {
                    a24.A01 = true;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.A02;
            Iterator A10 = C36391kE.A10(concurrentHashMap);
            while (A10.hasNext()) {
                ((B30) A10.next()).BKJ();
            }
            Iterator A102 = C36391kE.A10(concurrentHashMap);
            while (A102.hasNext()) {
                ((B30) A102.next()).BKS();
            }
            if (b5r != null) {
                b5r.BOf("init_controllers_finished", "ComponentManager", (Map) null, (long) hashCode());
            }
        }
    }

    public void A02(C22876AxX axX) {
        AnonymousClass9VB r1 = this.A05;
        if (!r1.A00.contains(axX)) {
            r1.A01(axX);
            A24 a24 = (A24) axX;
            if (!a24.A01) {
                a24.A01 = true;
            }
        }
    }

    public void B1R(String str) {
        if (this.A00 == 0) {
            throw AnonymousClass001.A09(str);
        }
    }

    public C22876AxX B9z(AnonymousClass94T r6) {
        List list = this.A05.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C22876AxX axX = (C22876AxX) list.get(i);
            if (axX.BDK() == r6) {
                return axX;
            }
        }
        throw C90464aC.A0P(r6, "Requested core component is null for key ", AnonymousClass000.A0u());
    }

    public Object BA0(AnonymousClass94Q r2) {
        return this.A04.A00.get(r2);
    }

    public boolean BLR(C1691688a r3) {
        boolean containsKey;
        Map map = this.A01;
        synchronized (map) {
            containsKey = map.containsKey(r3);
        }
        return containsKey;
    }

    public boolean BLS(AnonymousClass94T r6) {
        List list = this.A05.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C22876AxX) list.get(i)).BDK() == r6) {
                return true;
            }
        }
        return false;
    }

    public C20973A1j(Context context, C197439bi r3) {
        this.A03 = context.getApplicationContext();
        this.A04 = r3;
    }

    public Context getContext() {
        return this.A03;
    }
}
