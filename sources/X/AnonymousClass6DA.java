package X;

import android.content.SharedPreferences;

/* renamed from: X.6DA  reason: invalid class name */
public final class AnonymousClass6DA {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final C177838eS A04;
    public final C19970wo A05;

    public final String A01() {
        SharedPreferences.Editor putLong;
        C177838eS r8 = this.A04;
        String A0t = C36371kC.A0t(r8.A00(), "pref_saved_fs_search_session_id");
        if (!(A0t == null || A0t.length() == 0)) {
            long j = r8.A00().getLong("pref_saved_fs_search_session_ts", 0);
            if (j != 0 && C36441kJ.A0A(j) < 1800000) {
                putLong = C90474aD.A0H(r8).putLong("pref_saved_fs_search_session_ts", System.currentTimeMillis());
                putLong.apply();
                return A0t;
            }
        }
        A0t = C90464aC.A0V();
        C36341k9.A0x(C90474aD.A0H(r8), "pref_saved_fs_search_session_id", A0t);
        putLong = C90474aD.A0H(r8).putLong("pref_saved_fs_search_session_ts", System.currentTimeMillis());
        putLong.apply();
        return A0t;
    }

    public final String A02() {
        C177838eS r7 = this.A04;
        String A0t = C36371kC.A0t(r7.A00(), "pref_saved_ps_search_session_id");
        if (!(A0t == null || A0t.length() == 0)) {
            long j = r7.A00().getLong("pref_saved_ps_search_session_ts", 0);
            if (j != 0 && C36441kJ.A0A(j) < 1800000) {
                C36341k9.A0w(C90474aD.A0H(r7), "pref_saved_ps_search_session_ts", System.currentTimeMillis());
                return A0t;
            }
        }
        return A00();
    }

    public AnonymousClass6DA(C177838eS r1, C19970wo r2) {
        C36321k7.A0x(r2, r1);
        this.A05 = r2;
        this.A04 = r1;
    }

    public final String A00() {
        String A0V = C90464aC.A0V();
        C177838eS r4 = this.A04;
        C36341k9.A0x(C90474aD.A0H(r4), "pref_saved_ps_search_session_id", A0V);
        C36341k9.A0w(C90474aD.A0H(r4), "pref_saved_ps_search_session_ts", System.currentTimeMillis());
        C36341k9.A0v(C90474aD.A0H(r4), "pref_saved_search_session_action_order", 0);
        return A0V;
    }
}
