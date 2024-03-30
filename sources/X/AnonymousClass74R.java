package X;

import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.74R  reason: invalid class name */
public final /* synthetic */ class AnonymousClass74R implements Runnable {
    public static final /* synthetic */ AnonymousClass74R A00 = new AnonymousClass74R();

    public final void run() {
        AtomicInteger atomicInteger = AnonymousClass6YM.A3X;
        Voip.requestVideoUpgrade();
        Voip.toggleToHammerheadDev(true);
    }
}
