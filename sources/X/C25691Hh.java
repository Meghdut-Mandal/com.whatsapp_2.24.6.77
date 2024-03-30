package X;

import android.content.SharedPreferences;
import com.whatsapp.bonsai.sync.discovery.DiscoveryBots;
import com.whatsapp.bonsai.sync.discovery.DiscoveryBotsSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Hh  reason: invalid class name and case insensitive filesystem */
public final class C25691Hh {
    public final AnonymousClass1HY A00;
    public volatile DiscoveryBots A01;

    public C25691Hh(AnonymousClass1HY r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final DiscoveryBots A00() {
        if (this.A01 != null) {
            return this.A01;
        }
        String string = ((SharedPreferences) this.A00.A00.A00.get()).getString("bonsai_bots_response", "");
        AnonymousClass00C.A08(string);
        boolean z = false;
        if (string.length() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            this.A01 = DiscoveryBotsSerializer.A00.B7i(new JSONObject(string));
            return this.A01;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void A01(DiscoveryBots discoveryBots) {
        String obj = DiscoveryBotsSerializer.A00(discoveryBots).toString();
        AnonymousClass00C.A0B(obj);
        AnonymousClass1HY r1 = this.A00;
        AnonymousClass00C.A0D(obj, 0);
        C19420v0 r2 = r1.A00;
        r2.A1m("bonsai_bots_response", obj);
        C19420v0.A00(r2).remove("bonsai_last_bots_update_ms").apply();
        this.A01 = discoveryBots;
    }
}
