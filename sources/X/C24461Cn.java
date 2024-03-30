package X;

import android.content.SharedPreferences;

/* renamed from: X.1Cn  reason: invalid class name and case insensitive filesystem */
public final class C24461Cn {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new C24471Co(this));
    public final C19760wT A02;

    public C24461Cn(C19760wT r3, C19890wg r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        this.A02 = r3;
        this.A00 = r4;
    }

    public final synchronized void A02() {
        ((SharedPreferences) this.A01.getValue()).edit().remove("google_backup_retry_count").commit();
    }

    public final void A06(String str) {
        AnonymousClass00C.A0D(str, 0);
        ((SharedPreferences) this.A01.getValue()).edit().putLong(str, System.currentTimeMillis()).apply();
    }

    public final boolean A09(String str, long j) {
        AnonymousClass00C.A0D(str, 1);
        long j2 = ((SharedPreferences) this.A01.getValue()).getLong(str, -1);
        if (j2 == -1 || System.currentTimeMillis() > j2 + j) {
            return true;
        }
        return false;
    }

    public static final String A00(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("backup_storage_banner_shown_timestamp:");
        sb.append(i);
        return sb.toString();
    }

    public static final void A01(C24461Cn r3, Long l, String str, String str2) {
        if (l != null) {
            SharedPreferences.Editor edit = ((SharedPreferences) r3.A01.getValue()).edit();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            edit.putLong(sb.toString(), l.longValue()).apply();
        }
    }

    public final void A03(int i) {
        AnonymousClass00T r3 = this.A01;
        ((SharedPreferences) r3.getValue()).edit().putInt("backup_current_banner_type", i).apply();
        ((SharedPreferences) r3.getValue()).edit().putBoolean("backup_current_banner_shown", false).apply();
    }

    public final void A04(AnonymousClass6C6 r5, String str) {
        if (str != null && str.length() != 0) {
            SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
            StringBuilder sb = new StringBuilder();
            sb.append("backup_stats_media_size:");
            sb.append(str);
            SharedPreferences.Editor putLong = edit.putLong(sb.toString(), r5.A00);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("backup_stats_timestamp:");
            sb2.append(str);
            SharedPreferences.Editor putLong2 = putLong.putLong(sb2.toString(), r5.A03);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("backup_stats_msg_id:");
            sb3.append(str);
            SharedPreferences.Editor putLong3 = putLong2.putLong(sb3.toString(), r5.A01);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("backup_stats_prem_msg_id:");
            sb4.append(str);
            putLong3.putLong(sb4.toString(), r5.A02).apply();
        }
    }

    public final void A05(String str) {
        if (str != null && str.length() != 0) {
            SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
            StringBuilder sb = new StringBuilder();
            sb.append("backup_stats_media_size:");
            sb.append(str);
            SharedPreferences.Editor remove = edit.remove(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("backup_stats_timestamp:");
            sb2.append(str);
            SharedPreferences.Editor remove2 = remove.remove(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("backup_stats_msg_id:");
            sb3.append(str);
            SharedPreferences.Editor remove3 = remove2.remove(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("backup_stats_prem_msg_id:");
            sb4.append(str);
            remove3.remove(sb4.toString()).apply();
        }
    }

    public final void A07(boolean z) {
        ((SharedPreferences) this.A01.getValue()).edit().putBoolean("_new_user", z).apply();
    }

    public final boolean A08() {
        return ((SharedPreferences) this.A01.getValue()).getBoolean("backup_enforcement_flag_sent_to_google", false);
    }
}
