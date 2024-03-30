package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Ej  reason: invalid class name and case insensitive filesystem */
public class C24941Ej {
    public final AnonymousClass12P A00;
    public final ThreadLocal A01 = new ThreadLocal();
    public final AtomicInteger A02 = new AtomicInteger(0);

    public AnonymousClass6QI A00(String str, String str2) {
        ThreadLocal threadLocal = this.A01;
        C30611aU r2 = (C30611aU) threadLocal.get();
        if (r2 == null) {
            r2 = new C30611aU(this.A00, this.A02.get());
            threadLocal.set(r2);
        }
        AnonymousClass6QI A002 = r2.A00(str, str2, this.A02.get());
        A002.A03();
        return A002;
    }

    public void A01() {
        Log.i("statementsmanager/resetstatements");
        this.A02.incrementAndGet();
        C30611aU r0 = (C30611aU) this.A01.get();
        if (r0 != null) {
            r0.A01();
        }
    }

    public C24941Ej(AnonymousClass12P r3) {
        this.A00 = r3;
    }
}
