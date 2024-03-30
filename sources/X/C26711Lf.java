package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.Jid;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Lf  reason: invalid class name and case insensitive filesystem */
public final class C26711Lf implements C26701Le {
    public final C19420v0 A00;

    public /* bridge */ /* synthetic */ boolean BJz(Object obj) {
        String str;
        Jid jid = (Jid) obj;
        AnonymousClass005 r3 = this.A00.A00;
        if (!((SharedPreferences) r3.get()).getBoolean("about_community_nux_threshold_reached", false)) {
            Set<String> stringSet = ((SharedPreferences) r3.get()).getStringSet("pref_about_community_nux_seen_communities", new HashSet());
            if (jid != null) {
                str = jid.getRawString();
            } else {
                str = null;
            }
            if (stringSet.contains(str)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void BQQ(boolean z) {
        C19420v0 r2 = this.A00;
        C19420v0.A00(r2).putBoolean("about_community_nux_threshold_reached", z).apply();
        if (!z) {
            C19420v0.A00(r2).remove("pref_about_community_nux_seen_communities").apply();
        }
    }

    public /* bridge */ /* synthetic */ void BrK(Object obj) {
        boolean z;
        SharedPreferences.Editor A002;
        Jid jid = (Jid) obj;
        if (jid != null) {
            C19420v0 r3 = this.A00;
            Set<String> stringSet = ((SharedPreferences) r3.A00.get()).getStringSet("pref_about_community_nux_seen_communities", new HashSet());
            stringSet.add(jid.getRawString());
            C19420v0.A00(r3).putStringSet("pref_about_community_nux_seen_communities", stringSet).apply();
            z = true;
            if (stringSet.size() >= 1) {
                A002 = C19420v0.A00(r3);
            } else {
                return;
            }
        } else {
            z = true;
            A002 = C19420v0.A00(this.A00);
        }
        A002.putBoolean("about_community_nux_threshold_reached", z).apply();
    }

    public C26711Lf(C19420v0 r1) {
        this.A00 = r1;
    }

    public String BEa() {
        return "community_home";
    }
}
