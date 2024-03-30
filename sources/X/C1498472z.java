package X;

import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.72z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1498472z implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C1498472z(String str, String str2, boolean z) {
        this.A02 = z;
        this.A00 = str;
        this.A01 = str2;
    }

    public final void run() {
        boolean z = this.A02;
        String str = this.A00;
        String str2 = this.A01;
        AtomicInteger atomicInteger = AnonymousClass6YM.A3X;
        if (z) {
            Voip.rejectPendingCall(str);
        } else {
            Voip.rejectCall(str, str2);
        }
    }
}
