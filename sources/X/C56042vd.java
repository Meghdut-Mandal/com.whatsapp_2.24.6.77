package X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.2vd  reason: invalid class name and case insensitive filesystem */
public abstract class C56042vd {
    public static C18830tt A00(Context context) {
        return ((C18800tq) A01(context)).AfI.A00;
    }

    public static Object A01(Context context) {
        Application A00 = C19560w9.A00(context.getApplicationContext());
        boolean z = A00 instanceof C18700tb;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = A00.getClass();
        if (z) {
            return ((C18700tb) A00).generatedComponent();
        }
        throw AnonymousClass001.A08(String.format("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", A0L));
    }
}
