package X;

import android.app.PendingIntent;
import android.os.IBinder;
import java.util.Map;

/* renamed from: X.8Df  reason: invalid class name and case insensitive filesystem */
public final class C170388Df extends C170678Ej {
    public final /* synthetic */ C22810AwL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170388Df(AnonymousClass0XK r1, C22810AwL awL) {
        super(r1);
        this.A00 = awL;
    }

    public final /* bridge */ /* synthetic */ void A0A(C15900oC r10) {
        C22810AwL awL = this.A00;
        AnonymousClass006.A02(awL, "Listener must not be null");
        AnonymousClass006.A05("LocationListener", "Listener type must not be empty");
        AnonymousClass0UL r3 = new AnonymousClass0UL(awL, "LocationListener");
        AnonymousClass8DY r6 = new AnonymousClass8DY(this);
        AnonymousClass9MO r1 = ((AnonymousClass8BW) r10).A00;
        AnonymousClass8BW r2 = ((C21018A3h) r1.A00).A00;
        r2.A09();
        Map map = r1.A01;
        synchronized (map) {
            C170378De r4 = (C170378De) map.remove(r3);
            if (r4 != null) {
                synchronized (r4) {
                    C06200Sr r0 = r4.A00;
                    r0.A02 = null;
                    r0.A01 = null;
                }
                ((C23102B4r) r2.A04()).Byw(new AnonymousClass8CC((PendingIntent) null, r4, (IBinder) null, r6, (AnonymousClass8CL) null, 2));
            }
        }
    }
}
