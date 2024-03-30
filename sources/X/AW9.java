package X;

import android.os.Handler;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class AW9 implements Runnable {
    public static final /* synthetic */ AW9 A00 = new AW9();

    public final void run() {
        AtomicInteger atomicInteger = C197109b9.A05;
        Date date = new Date(System.currentTimeMillis() - 10000);
        ConcurrentHashMap concurrentHashMap = C197669c8.A02;
        synchronized (concurrentHashMap) {
            LinkedHashMap A1G = C36431kI.A1G();
            Iterator A10 = C36371kC.A10(concurrentHashMap);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                if (((C192239Gf) A11.getValue()).A01.compareTo(date) < 0) {
                    C36411kG.A1T(A1G, A11);
                }
            }
            Iterator A0y = AnonymousClass000.A0y(A1G);
            while (A0y.hasNext()) {
                Map.Entry A112 = AnonymousClass000.A11(A0y);
                C202539m8 r3 = ((C192239Gf) A112.getValue()).A00;
                ConcurrentHashMap concurrentHashMap2 = r3.A09;
                Collection<AU0> values = concurrentHashMap2.values();
                AnonymousClass00C.A08(values);
                for (AU0 au0 : values) {
                    if (au0 != null) {
                        au0.close();
                    }
                }
                concurrentHashMap2.clear();
                r3.A00 = -1;
                concurrentHashMap.remove(A112.getKey());
            }
        }
        ((Handler) C197109b9.A06.getValue()).postDelayed(C197109b9.A01, 10000);
    }
}
