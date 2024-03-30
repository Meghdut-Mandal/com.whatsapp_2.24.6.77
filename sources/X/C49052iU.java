package X;

import com.whatsapp.registration.EULA;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2iU  reason: invalid class name and case insensitive filesystem */
public class C49052iU extends C132446Tt {
    public final /* synthetic */ EULA A00;

    public C49052iU(EULA eula) {
        this.A00 = eula;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            return this.A00.A0Z.A01(TimeUnit.SECONDS, 10);
        } catch (Exception e) {
            Log.w("EULA/exception while waiting on task killers thread to finish during onCreate ", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        C31171bO r3 = (C31171bO) obj;
        EULA eula = this.A00;
        eula.A0Y = r3;
        if (r3 != null && r3.A00 != null) {
            i = 6;
        } else if (C18750th.A0B()) {
            i = 8;
        } else {
            return;
        }
        AnonymousClass3SJ.A01(eula, i);
    }
}
