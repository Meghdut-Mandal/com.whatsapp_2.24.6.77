package X;

import com.whatsapp.instrumentation.service.InstrumentationFGService;
import java.util.Set;

/* renamed from: X.6S5  reason: invalid class name */
public class AnonymousClass6S5 {
    public final C19630wG A00;
    public final AnonymousClass1MM A01;
    public final Set A02 = C36441kJ.A16();

    public static synchronized void A00(AnonymousClass6S5 r4, int i) {
        synchronized (r4) {
            r4.A02.add(Integer.valueOf(i));
            r4.A01.A03(r4.A00.A00, C36431kI.A0D(), InstrumentationFGService.class);
        }
    }

    public static synchronized void A01(AnonymousClass6S5 r3, int i) {
        synchronized (r3) {
            Set set = r3.A02;
            set.remove(Integer.valueOf(i));
            if (set.isEmpty()) {
                r3.A01.A01(r3.A00.A00, InstrumentationFGService.class);
            }
        }
    }

    public AnonymousClass6S5(C19630wG r2, AnonymousClass1MM r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
