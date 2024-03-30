package X;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import java.util.Map;

/* renamed from: X.8Dg  reason: invalid class name and case insensitive filesystem */
public final class C170398Dg extends C170678Ej {
    public final /* synthetic */ C22810AwL A00;
    public final /* synthetic */ LocationRequest A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170398Dg(AnonymousClass0XK r1, C22810AwL awL, LocationRequest locationRequest) {
        super(r1);
        this.A01 = locationRequest;
        this.A00 = awL;
    }

    public final /* bridge */ /* synthetic */ void A0A(C15900oC r20) {
        C170378De r2;
        AnonymousClass8DY r3 = new AnonymousClass8DY(this);
        LocationRequest locationRequest = this.A01;
        C22810AwL awL = this.A00;
        AnonymousClass006.A08(AnonymousClass000.A1V(Looper.myLooper()), "Can't create handler inside thread that has not called Looper.prepare()");
        Looper myLooper = Looper.myLooper();
        AnonymousClass006.A02(awL, "Listener must not be null");
        AnonymousClass006.A02(myLooper, "Looper must not be null");
        C06200Sr r6 = new C06200Sr(myLooper, awL, "LocationListener");
        AnonymousClass9MO r1 = ((AnonymousClass8BW) r20).A00;
        synchronized (r1) {
            AnonymousClass8BW r5 = ((C21018A3h) r1.A00).A00;
            r5.A09();
            AnonymousClass0UL r0 = r6.A01;
            if (r0 != null) {
                Map map = r1.A01;
                synchronized (map) {
                    r2 = (C170378De) map.get(r0);
                    if (r2 == null) {
                        r2 = new C170378De(r6);
                    }
                    map.put(r0, r2);
                }
                ((C23102B4r) r5.A04()).Byw(new AnonymousClass8CC((PendingIntent) null, r2, (IBinder) null, r3, new AnonymousClass8CL(locationRequest, (String) null, (String) null, (String) null, AnonymousClass8CL.A0B, Long.MAX_VALUE, false, false, false, false, false), 1));
            }
        }
    }
}
