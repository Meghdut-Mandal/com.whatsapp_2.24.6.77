package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2iu  reason: invalid class name and case insensitive filesystem */
public final class C49312iu extends C132446Tt {
    public final Context A00;
    public final AnonymousClass19J A01;
    public final C20720y3 A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z = false;
        try {
            if (this.A01.A06) {
                AtomicBoolean atomicBoolean = C20720y3.A14;
                Log.i("MessageHandler/isCaptiveWifi awaiting captive wifi status");
                C20720y3.A13.await();
                boolean z2 = C20720y3.A14.get();
                C36321k7.A1X("MessageHandler/isCaptiveWifi status is ", AnonymousClass000.A0u(), z2);
                if (z2) {
                    z = true;
                }
            }
        } catch (InterruptedException unused) {
        }
        return Boolean.valueOf(z);
    }

    public C49312iu(Context context, AnonymousClass19J r2, C20720y3 r3) {
        C36321k7.A0y(context, r3);
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (AnonymousClass000.A1X(obj)) {
            Context context = this.A00;
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(context.getPackageName(), "com.whatsapp.messaging.CaptivePortalActivity");
            A0D.setFlags(268435456);
            context.startActivity(A0D);
        }
    }
}
