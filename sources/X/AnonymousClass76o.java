package X;

import com.whatsapp.R;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.76o  reason: invalid class name */
public final /* synthetic */ class AnonymousClass76o implements Callable {
    public final /* synthetic */ C1271967i A00;
    public final /* synthetic */ AnonymousClass66A A01;
    public final /* synthetic */ C124105xb A02;
    public final /* synthetic */ Map A03;

    public /* synthetic */ AnonymousClass76o(C1271967i r1, AnonymousClass66A r2, C124105xb r3, Map map) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = map;
        this.A02 = r3;
    }

    public final Object call() {
        C160367kt r0;
        C1271967i r6 = this.A00;
        AnonymousClass66A r5 = this.A01;
        Map map = this.A03;
        C124105xb r8 = this.A02;
        C131196Oc r11 = C131196Oc.A00;
        if (r6 == null) {
            r0 = null;
        } else {
            r0 = (C160367kt) r6.A01.get(R.id.bk_context_key_performance_logger);
        }
        int andIncrement = C114065ga.A00.getAndIncrement();
        if (r0 != null) {
            r0.B6y(4, andIncrement);
            r0.B6v(4, andIncrement, "instance", andIncrement);
        }
        AnonymousClass6RN.A00("Bloks Bind");
        C124105xb A002 = C132896Vr.A00(AnonymousClass6IB.A00, r6, r5.A00.A00(map), r8, r5.A01, r6.A02.A01.B8s(), r11);
        C114095gd.A00.incrementAndGet();
        AnonymousClass68E.A00();
        if (r0 != null) {
            r0.B6x(4, andIncrement);
        }
        return A002;
    }
}
