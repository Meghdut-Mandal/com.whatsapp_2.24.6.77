package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.19Z  reason: invalid class name */
public class AnonymousClass19Z {
    public AnonymousClass1WP A00;
    public final AnonymousClass19B A01;
    public final AnonymousClass19O A02;
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final C19700wN A05;

    public void A00(C207209uj r6, C23046B1r b1r) {
        Map map = this.A03;
        synchronized (map) {
            if (map.containsKey(r6)) {
                StringBuilder sb = new StringBuilder();
                sb.append("MessageCallbacksManager/added duplicate ackable stanza: ");
                sb.append(r6);
                Log.e(sb.toString());
                this.A05.A0E("MessageCallbacksManager/addAckCallback", "duplicate_ackable_stanza", true);
            }
            map.put(r6, new AT6(this, this.A01.A04(), b1r));
            String str = r6.A05;
            if ("message".equals(str) || "receipt".equals(str)) {
                AnonymousClass19O r3 = this.A02;
                AtomicInteger atomicInteger = r3.A0G;
                if (atomicInteger.incrementAndGet() == 1 || r3.A03 != null) {
                    AnonymousClass19O.A01(r3);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("XmppConnectionMetrics outgoing stanza processing started counter:");
                sb2.append(atomicInteger.get());
                Log.i(sb2.toString());
            }
        }
    }

    public void A01(Exception exc) {
        Map map = this.A04;
        synchronized (map) {
            for (Map.Entry value : map.entrySet()) {
                ((C23046B1r) value.getValue()).BVM(exc);
            }
            map.clear();
        }
    }

    public AnonymousClass19Z(C19700wN r2, AnonymousClass19B r3, AnonymousClass19O r4) {
        this.A05 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
