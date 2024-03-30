package X;

import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: X.18g  reason: invalid class name and case insensitive filesystem */
public final class C233818g {
    public final C233518d A00;
    public final long A01;
    public final C19970wo A02;

    public C233818g(C19970wo r3, C20810yC r4, C233518d r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r5, 3);
        this.A02 = r3;
        this.A00 = r5;
        this.A01 = (long) C20800yB.A00(C21000yV.A02, r4, 3860);
    }

    public final int A00() {
        long A002 = C19970wo.A00(this.A02);
        C233518d r7 = this.A00;
        int i = ((A002 - C233518d.A00(r7).getLong("last_interaction_timestamp", -1)) > this.A01 ? 1 : ((A002 - C233518d.A00(r7).getLong("last_interaction_timestamp", -1)) == this.A01 ? 0 : -1));
        SharedPreferences A003 = C233518d.A00(r7);
        if (i <= 0) {
            A003.edit().putLong("last_interaction_timestamp", A002).apply();
            return C233518d.A00(r7).getInt("session_id", -1);
        }
        SharedPreferences.Editor edit = A003.edit();
        edit.putInt("session_id", -1);
        edit.putLong("last_interaction_timestamp", -1);
        edit.putLong("session_start_timestamp", -1);
        edit.putInt("bit_array_session_sequence", 0);
        edit.putInt("cumulative_bits", 0);
        edit.apply();
        int leastSignificantBits = (int) UUID.randomUUID().getLeastSignificantBits();
        C233518d.A00(r7).edit().putInt("session_id", leastSignificantBits).apply();
        C233518d.A00(r7).edit().putLong("session_start_timestamp", A002).apply();
        C233518d.A00(r7).edit().putLong("last_interaction_timestamp", A002).apply();
        return leastSignificantBits;
    }
}
