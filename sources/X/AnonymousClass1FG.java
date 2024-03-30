package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.1FG  reason: invalid class name */
public final class AnonymousClass1FG {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new AnonymousClass1FH(this));

    public AnonymousClass1FG(C19890wg r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public final void A01(GroupJid groupJid, boolean z) {
        AnonymousClass00C.A0D(groupJid, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("CommunitySharedPrefs/ setTempIsClosed()/groupType = ");
        sb.append(z);
        Log.i(sb.toString());
        SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
        AnonymousClass00C.A08(edit);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("closed_");
        sb2.append(groupJid.getRawString());
        edit.putBoolean(sb2.toString(), z).apply();
    }

    public final void A00(GroupJid groupJid) {
        Log.i("CommunitySharedPrefs/ clearTempGroupType");
        SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
        AnonymousClass00C.A08(edit);
        StringBuilder sb = new StringBuilder();
        sb.append("create_");
        sb.append(groupJid.getRawString());
        edit.remove(sb.toString()).apply();
    }
}
