package X;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.19n  reason: invalid class name and case insensitive filesystem */
public class C237119n {
    public static final Set A03;
    public SharedPreferences A00;
    public final C19730wQ A01;
    public final C19890wg A02;

    public static synchronized SharedPreferences A00(C237119n r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A02.A00("syncd_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public synchronized long A01(String str) {
        long j;
        j = A00(this).getLong(str, 0);
        A00(this).edit().remove(str).apply();
        return j;
    }

    public synchronized void A06(String str, long j) {
        A00(this).edit().putLong(str, A00(this).getLong(str, 0) + j).apply();
    }

    static {
        HashSet hashSet = new HashSet();
        A03 = hashSet;
        hashSet.add("first_transient_server_failure_timestamp");
        Set set = A03;
        set.add("syncd_dirty");
        set.add("syncd_dirty_reason");
        set.add("syncd_last_companion_dereg_time");
        set.add("syncd_last_companion_dereg_logging_time");
        set.add("syncd_first_companion_reg_logging_time");
        set.add("syncd_bootstrap_state");
        set.add("syncd_bootstrapped_mutations");
        set.add("syncd_last_lthash_consistency_check_time");
        set.add("syncd_one_time_cleanup_for_non_md_user");
        set.add("syncd_has_logged_snapshot_mac_mismatch_in_patch");
    }

    public Set A02() {
        Set<String> stringSet;
        synchronized ("syncd_bootstrapped_mutations") {
            stringSet = A00(this).getStringSet("syncd_bootstrapped_mutations", Collections.emptySet());
            C18740tg.A06(stringSet);
        }
        return stringSet;
    }

    public void A05(int i) {
        if (this.A01.A0L()) {
            C18740tg.A0D(false, "SyncdSharedPreferences/ should not be setting SyncD dirty state in companion mode");
        } else {
            A00(this).edit().putInt("syncd_dirty", i).apply();
        }
    }

    public void A07(Set set) {
        synchronized ("syncd_bootstrapped_mutations") {
            Set A022 = A02();
            HashSet hashSet = new HashSet();
            hashSet.addAll(set);
            hashSet.addAll(A022);
            A00(this).edit().putStringSet("syncd_bootstrapped_mutations", hashSet).apply();
        }
    }

    public C237119n(C19730wQ r1, C19890wg r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public void A03(int i) {
        if (!A08()) {
            A05(0);
            A00(this).edit().remove("syncd_last_companion_dereg_time").apply();
            A00(this).edit().putInt("syncd_dirty_reason", i).apply();
        }
    }

    public void A04(int i) {
        A00(this).edit().putInt("syncd_bootstrap_state", i).apply();
    }

    public boolean A08() {
        if (A00(this).getInt("syncd_dirty", -1) != -1) {
            return true;
        }
        return false;
    }
}
