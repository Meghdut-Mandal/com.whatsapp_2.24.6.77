package X;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9Xt  reason: invalid class name and case insensitive filesystem */
public class C196119Xt {
    public final Handler A00;
    public final C198549dl A01;
    public final C23112B5r A02;
    public final C201589jv A03;
    public final C197159bE A04;
    public final AnonymousClass9RH A05;
    public final Map A06 = AnonymousClass001.A0J();

    public void A00(C23071B3a b3a) {
        AnonymousClass9RH r0 = this.A05;
        C201589jv r3 = this.A03;
        SparseArray sparseArray = r0.A00;
        C20983A1x a1x = (C20983A1x) sparseArray.get(0);
        if (a1x == null) {
            synchronized (sparseArray) {
                a1x = (C20983A1x) sparseArray.get(0);
                if (a1x == null) {
                    a1x = new C20983A1x(r0.A01);
                    sparseArray.put(0, a1x);
                }
            }
        }
        if (!r3.A08.A00.contains(a1x)) {
            r3.A03(a1x);
        }
        a1x.A00(r3, b3a);
        C23112B5r b5r = this.A02;
        if (b5r != null) {
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("output_index", String.valueOf(0));
            A0J.put("output_class", C90484aE.A0k(b3a));
            b5r.BOu("media_pipeline_add_output", "MediaGraphIOImpl", A0J, (long) hashCode());
        }
    }

    public void A02(C20979A1t a1t) {
        C197159bE r4 = this.A04;
        C201589jv r3 = this.A03;
        Handler handler = this.A00;
        if (r4.A00.get(0) != a1t) {
            if (handler.getLooper() == Looper.myLooper()) {
                C197159bE.A00(r3, r4, a1t);
            } else {
                handler.post(new C1503374w(r3, r4, a1t));
            }
        }
        C23112B5r b5r = this.A02;
        if (b5r != null) {
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("input_index", String.valueOf(0));
            b5r.BOu("media_pipeline_add_input", "MediaGraphIOImpl", A0J, (long) hashCode());
        }
    }

    public void A03(Object obj) {
        C20983A1x a1x = (C20983A1x) this.A05.A00.get(0);
        if (a1x != null) {
            a1x.A02(obj);
        }
        C23112B5r b5r = this.A02;
        if (b5r != null) {
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("output_index", String.valueOf(0));
            b5r.BOu("media_pipeline_remove_output", "MediaGraphIOImpl", A0J, (long) hashCode());
        }
    }

    public C196119Xt(C198549dl r4, C23112B5r b5r, C201589jv r6) {
        C197159bE r2 = new C197159bE();
        AnonymousClass9RH r1 = new AnonymousClass9RH(r4);
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = r6.A00;
        this.A04 = r2;
        this.A05 = r1;
        this.A02 = b5r;
    }

    public void A01(C22789Aw0 aw0, int i) {
        ConcurrentHashMap concurrentHashMap;
        Map map = this.A06;
        synchronized (map) {
            Integer valueOf = Integer.valueOf(i);
            concurrentHashMap = (ConcurrentHashMap) map.get(valueOf);
            if (concurrentHashMap == null) {
                concurrentHashMap = C90524aI.A0s();
                map.put(valueOf, concurrentHashMap);
            }
        }
        concurrentHashMap.put(aw0, aw0);
    }
}
