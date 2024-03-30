package X;

import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.72i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1496872i implements Runnable {
    public final /* synthetic */ String A00;

    public /* synthetic */ C1496872i(String str) {
        this.A00 = str;
    }

    public final void run() {
        String str = this.A00;
        AtomicInteger atomicInteger = AnonymousClass6YM.A3X;
        Voip.rejectCall(str, "");
    }
}
