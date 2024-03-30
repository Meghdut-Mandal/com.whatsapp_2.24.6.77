package X;

import android.content.Context;
import com.facebook.msys.mci.NetworkSession;
import com.whatsapp.wamsys.JniBridge;
import java.util.LinkedHashMap;

/* renamed from: X.2sj  reason: invalid class name and case insensitive filesystem */
public abstract class C54302sj {
    public static final void A00(Context context, NetworkSession networkSession, C19420v0 r9, C20810yC r10, C000100b r11) {
        AnonymousClass00C.A0D(r11, 0);
        C36321k7.A0v(networkSession, 1, context);
        AnonymousClass00C.A0D(r9, 4);
        LinkedHashMap A1G = C36431kI.A1G();
        boolean z = false;
        boolean A1S = AnonymousClass000.A1S(r10.A07(5120), 1);
        if (!C36341k9.A0E(r9).getBoolean("wam_is_psid_migrated", false) && A1S) {
            z = true;
        }
        A1G.put("ps_id_migration", Boolean.valueOf(z));
        A1G.put("beacon_probability", Integer.valueOf(r10.A07(6977)));
        JniBridge.jvidispatchIOOOO(0, context.getFilesDir().getAbsolutePath(), networkSession, ((JniBridge) r11).wajContext.get(), A1G);
        if (z) {
            C36331k8.A18(r9, "wam_is_psid_migrated", true);
        }
    }
}
