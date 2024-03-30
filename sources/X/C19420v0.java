package X;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0v0  reason: invalid class name and case insensitive filesystem */
public class C19420v0 {
    public static final String A05;
    public final AnonymousClass005 A00;
    public final Object A01 = new Object();
    public final C19760wT A02;
    public final Object A03 = new Object();
    public final Object A04 = new Object();

    public int A0C() {
        try {
            return Integer.parseInt(((SharedPreferences) this.A00.get()).getString("interface_gdrive_backup_frequency", String.valueOf(0)));
        } catch (NumberFormatException e) {
            Log.e("wa-shared-preferences/get-backup-freq", e);
            return 0;
        }
    }

    public int A0D() {
        try {
            return Integer.parseInt(((SharedPreferences) this.A00.get()).getString("interface_gdrive_backup_network_setting", String.valueOf(0)));
        } catch (NumberFormatException e) {
            Log.w("wa-shared-preferences/get-backup-network-settings", e);
            return 0;
        }
    }

    public int A0G() {
        return ((SharedPreferences) this.A00.get()).getInt("connection_sequence_state", 0);
    }

    public void A10() {
        A00(this).putInt("shortcut_version", 1).apply();
    }

    public void A11() {
        A00(this).putBoolean("show_statuses_education", false).apply();
    }

    public void A29(byte[] bArr) {
        A00(this).putString("token_used_during_reg", Base64.encodeToString(bArr, 3)).apply();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19430v1.A0A);
        sb.append("_light");
        A05 = sb.toString();
    }

    public static SharedPreferences.Editor A00(C19420v0 r0) {
        return ((SharedPreferences) r0.A00.get()).edit();
    }

    public static ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass00I("security_notifications", 1));
        arrayList.add(new AnonymousClass00I("input_enter_send", 1));
        arrayList.add(new AnonymousClass00I("interface_font_size", 2));
        arrayList.add(new AnonymousClass00I("settings_language", 2));
        arrayList.add(new AnonymousClass00I("conversation_sound", 1));
        arrayList.add(new AnonymousClass00I("autodownload_wifi_mask", 0));
        arrayList.add(new AnonymousClass00I("autodownload_cellular_mask", 0));
        arrayList.add(new AnonymousClass00I("autodownload_roaming_mask", 0));
        arrayList.add(new AnonymousClass00I("voip_low_data_usage", 1));
        arrayList.add(new AnonymousClass00I("gdrive_backup_filters", 3));
        arrayList.add(new AnonymousClass00I("lock_folder_hidden", 1));
        arrayList.add(new AnonymousClass00I("does_user_have_passcode", 1));
        return arrayList;
    }

    public int A03() {
        return ((SharedPreferences) this.A00.get()).getInt("adv_current_key_index", -1);
    }

    public int A04() {
        return ((SharedPreferences) this.A00.get()).getInt("adv_raw_id", -1);
    }

    public int A05() {
        return ((SharedPreferences) this.A00.get()).getInt("autodownload_cellular_mask", 1);
    }

    public int A06() {
        return ((SharedPreferences) this.A00.get()).getInt("autoconf_type", -1);
    }

    public int A07() {
        return ((SharedPreferences) this.A00.get()).getInt("connection_sequence_attempts", 0);
    }

    public int A08() {
        return ((SharedPreferences) this.A00.get()).getInt("create_group_tool_tip_nudge_count", 0);
    }

    public int A09() {
        return ((SharedPreferences) this.A00.get()).getInt("expressions_tray_peek_height_landscape", 0);
    }

    public int A0A() {
        return ((SharedPreferences) this.A00.get()).getInt("expressions_tray_peek_height_portrait", 0);
    }

    public int A0B() {
        return ((SharedPreferences) this.A00.get()).getInt("pref_flash_call_education_link_clicked", -1);
    }

    public int A0E() {
        return ((SharedPreferences) this.A00.get()).getInt("gdrive_error_code", 10);
    }

    public int A0F() {
        return ((SharedPreferences) this.A00.get()).getInt("gdrive_state", 0);
    }

    public int A0H() {
        return ((SharedPreferences) this.A00.get()).getInt("logins_with_messages", 0);
    }

    public int A0I() {
        return ((SharedPreferences) this.A00.get()).getInt("number_of_inactive_accounts", 0);
    }

    public int A0J() {
        return ((SharedPreferences) this.A00.get()).getInt("photo_quality", 0);
    }

    public int A0K() {
        return ((SharedPreferences) this.A00.get()).getInt("migrate_from_other_app_attempt_count", 0);
    }

    public int A0L() {
        return ((SharedPreferences) this.A00.get()).getInt("shortcut_version", 0);
    }

    public int A0M() {
        return ((SharedPreferences) this.A00.get()).getInt("gdrive_successive_backup_failed_count", 0);
    }

    public int A0O(String str, int i) {
        return ((SharedPreferences) this.A00.get()).getInt(str, i);
    }

    public long A0P() {
        return ((SharedPreferences) this.A00.get()).getLong("privacy_fingerprint_timeout", 60000);
    }

    public long A0Q() {
        return ((SharedPreferences) this.A00.get()).getLong("registration_initialized_time", 0);
    }

    public long A0R(AnonymousClass11F r6) {
        if (r6 == null) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("show_expired_group_dialog");
        sb.append(r6.getRawString());
        return ((SharedPreferences) this.A00.get()).getLong(sb.toString(), 0);
    }

    public long A0T(String str) {
        if (str == null) {
            Log.w("wa-shared-preferences/get-backup-timestamp accountName passed is null.");
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_timestamp:");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getLong(sb.toString(), 0);
    }

    public long A0U(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_total_size:");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getLong(sb.toString(), -1);
    }

    public long A0V(String str) {
        return ((SharedPreferences) this.A00.get()).getLong(str, -1);
    }

    public Point A0W(int i) {
        Point point = new Point();
        AnonymousClass005 r2 = this.A00;
        point.x = ((SharedPreferences) r2.get()).getInt("foldable_max_display_width", i);
        point.y = ((SharedPreferences) r2.get()).getInt("foldable_max_display_height", i);
        return point;
    }

    public Point A0X(int i) {
        Point point = new Point();
        AnonymousClass005 r2 = this.A00;
        point.x = ((SharedPreferences) r2.get()).getInt("foldable_min_display_width", i);
        point.y = ((SharedPreferences) r2.get()).getInt("foldable_min_display_height", i);
        return point;
    }

    public Boolean A0Y() {
        return Boolean.valueOf(((SharedPreferences) this.A00.get()).getBoolean("account_switching_open_link_companion", false));
    }

    public Integer A0Z() {
        AnonymousClass005 r1 = this.A00;
        if (((SharedPreferences) r1.get()).contains("get_groups_params")) {
            return Integer.valueOf(((SharedPreferences) r1.get()).getInt("get_groups_params", 0));
        }
        return null;
    }

    public String A0a() {
        return ((SharedPreferences) this.A00.get()).getString("block_list_v2_dhash", (String) null);
    }

    public String A0b() {
        return ((SharedPreferences) this.A00.get()).getString("encrypted_rid", "");
    }

    public String A0c() {
        return ((SharedPreferences) this.A00.get()).getString("gdrive_account_name", (String) null);
    }

    public String A0d() {
        return ((SharedPreferences) this.A00.get()).getString("account_switching_logged_out_phone_number", (String) null);
    }

    public String A0e() {
        String string = ((SharedPreferences) this.A00.get()).getString("perf_device_id", (String) null);
        if (string != null) {
            return string;
        }
        String obj = UUID.randomUUID().toString();
        A00(this).putString("perf_device_id", obj).apply();
        return obj;
    }

    public String A0f() {
        return ((SharedPreferences) this.A00.get()).getString("cc", "");
    }

    public String A0g() {
        return ((SharedPreferences) this.A00.get()).getString("registration_jid", (String) null);
    }

    public String A0h() {
        return ((SharedPreferences) this.A00.get()).getString("ph", "");
    }

    public String A0i() {
        return ((SharedPreferences) this.A00.get()).getString("settings_verification_email_address", (String) null);
    }

    public String A0j() {
        return ((SharedPreferences) this.A00.get()).getString("pref_wfs_pw", (String) null);
    }

    public String A0k() {
        return ((SharedPreferences) this.A00.get()).getString("pref_wfs_user", (String) null);
    }

    public String A0l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("dc_user_postcode_");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getString(sb.toString(), (String) null);
    }

    public ArrayList A0m() {
        return new ArrayList(((SharedPreferences) this.A00.get()).getStringSet("pref_nta_target_accounts", new HashSet()));
    }

    public List A0o() {
        String string = ((SharedPreferences) this.A00.get()).getString("network:last_blocked_session_ids", "");
        if (string.isEmpty()) {
            return Collections.emptyList();
        }
        return Arrays.asList(string.split(",", 0));
    }

    public Set A0p(String str) {
        Set<String> stringSet = ((SharedPreferences) this.A00.get()).getStringSet(str, new HashSet());
        C18740tg.A06(stringSet);
        return stringSet;
    }

    public void A0r() {
        Log.i("wa-shared-preferences/cleangcmregsettings");
        A00(this).remove("c2dm_reg_id").remove("c2dm_app_vers").remove("saved_gcm_token_server_unreg").apply();
    }

    public void A0u() {
        Log.i("washaredpreferences/clearPreChatdAbHash");
        ((SharedPreferences) this.A00.get()).edit().remove("pref_pre_chatd_ab_hash").apply();
    }

    public void A0x() {
        int i = ((SharedPreferences) this.A00.get()).getInt("connection_lc", 0);
        if (i == Integer.MAX_VALUE) {
            i = -1;
        }
        A00(this).putInt("connection_lc", i + 1).apply();
    }

    public void A13(int i) {
        ((SharedPreferences) this.A00.get()).edit().putInt("autoconf_type", i).apply();
    }

    public void A14(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-preferences/set-backup-restore-state/");
        sb.append(i);
        Log.i(sb.toString());
        A00(this).putInt("backup_restore_state", i).apply();
    }

    public void A19(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-preferences/getgroupsparams ");
        sb.append(i);
        Log.i(sb.toString());
        A00(this).putInt("get_groups_params", i).apply();
    }

    public void A1A(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-preferences/set-gdrive-state/");
        sb.append(i);
        Log.i(sb.toString());
        A00(this).putInt("gdrive_state", i).apply();
    }

    public void A1D(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-prefs/setNumberOfInactiveAccounts/");
        sb.append(i);
        Log.i(sb.toString());
        A00(this).putInt("number_of_inactive_accounts", i).apply();
    }

    public void A1E(int i) {
        ((SharedPreferences) this.A00.get()).edit().putInt("flash_call_eligible", i).apply();
    }

    public void A1G(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-prefs/save-gdrive-user-prompt-again-timestamp/");
        sb.append(j);
        sb.append(" ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        sb.append(simpleDateFormat.format(instance.getTime()));
        Log.i(sb.toString());
        A1h("gdrive_next_prompt_for_setup_timestamp", j);
    }

    public void A1J(AnonymousClass11F r4, long j) {
        if (r4 != null) {
            SharedPreferences.Editor A002 = A00(this);
            StringBuilder sb = new StringBuilder();
            sb.append("show_expired_group_dialog");
            sb.append(r4.getRawString());
            A002.putLong(sb.toString(), j).apply();
        }
    }

    public void A1N(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_autoconf_feo2_query_status", str).apply();
    }

    public void A1O(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_autoconf_status", str).apply();
    }

    public void A1P(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_captcha_status", str).apply();
    }

    public void A1Q(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_email_otp_status", str).apply();
    }

    public void A1T(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_primary_flash_call_status", str).apply();
    }

    public void A1W(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_secondary_flash_call_status", str).apply();
    }

    public void A1Y(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_silent_auth_status", str).apply();
    }

    public void A1a(String str) {
        ((SharedPreferences) this.A00.get()).edit().putString("pref_wa_old_status", str).apply();
    }

    public void A1d(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-backup-media-size account name is null");
            return;
        }
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_media_size:");
        sb.append(str);
        A002.putLong(sb.toString(), j).apply();
    }

    public void A1e(String str, long j) {
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("wa-shared-preferences/set-backup-timestamp last successful backup timestamp is set to ");
            sb.append(j);
            sb.append(" but accountName associated is null, ignoring.");
            Log.e(sb.toString());
            return;
        }
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gdrive_last_successful_backup_timestamp:");
        sb2.append(str);
        A002.putLong(sb2.toString(), j).apply();
    }

    public void A1f(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-total-backup-size account name is null");
            return;
        }
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_total_size:");
        sb.append(str);
        A002.putLong(sb.toString(), j).apply();
    }

    public void A1g(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-backup-video-size account name is null");
            return;
        }
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_video_size:");
        sb.append(str);
        A002.putLong(sb.toString(), j).apply();
    }

    public void A1o(String str, boolean z) {
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("wa-shared-preferences/set-encrypted is set to ");
            sb.append(z);
            sb.append(" but accountName associated is null, ignoring.");
            Log.e(sb.toString());
            return;
        }
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gdrive_last_successful_backup_encrypted:");
        sb2.append(str);
        A002.putBoolean(sb2.toString(), z).apply();
    }

    public void A21(boolean z) {
        ((SharedPreferences) this.A00.get()).edit().putBoolean("pref_prefer_sms_over_flash", z).apply();
    }

    public void A24(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-prefs/setshouldgetprekeydigest/");
        sb.append(z);
        Log.i(sb.toString());
        synchronized (this.A03) {
            A00(this).putBoolean("need_to_get_pre_key_digest", z).apply();
        }
    }

    public void A26(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-prefs/setsignalprotocolstoreisnew/");
        sb.append(z);
        Log.i(sb.toString());
        synchronized (this.A04) {
            A00(this).putBoolean("signal_protocol_store_is_new", z).apply();
        }
    }

    public void A27(boolean z) {
        ((SharedPreferences) this.A00.get()).edit().putBoolean("silent_auth_verification_status", z).apply();
    }

    public boolean A2A() {
        return ((SharedPreferences) this.A00.get()).getBoolean("conversation_sound", true);
    }

    public boolean A2B() {
        return ((SharedPreferences) this.A00.get()).getBoolean("gdrive_restore_overwrite_local_files", false);
    }

    public boolean A2C() {
        return ((SharedPreferences) this.A00.get()).getBoolean("security_notifications", false);
    }

    public boolean A2D() {
        return ((SharedPreferences) this.A00.get()).getBoolean("migrate_from_consumer_app_directly", false);
    }

    public boolean A2E() {
        return ((SharedPreferences) this.A00.get()).getBoolean("gdrive_include_videos_in_backup", false);
    }

    public boolean A2F() {
        return ((SharedPreferences) this.A00.get()).getBoolean("archive_v2_enabled", false);
    }

    public boolean A2G() {
        return ((SharedPreferences) this.A00.get()).getBoolean("notify_new_message_for_archived_chats", false);
    }

    public boolean A2H() {
        return ((SharedPreferences) this.A00.get()).getBoolean("companion_reg_opt_in_enabled", false);
    }

    public boolean A2I() {
        return ((SharedPreferences) this.A00.get()).getBoolean("encrypted_backup_enabled", false);
    }

    public boolean A2J() {
        return ((SharedPreferences) this.A00.get()).getBoolean("encrypted_backup_using_encryption_key", false);
    }

    public boolean A2K() {
        return ((SharedPreferences) this.A00.get()).getBoolean("privacy_fingerprint_enabled", false);
    }

    public boolean A2L() {
        return ((SharedPreferences) this.A00.get()).getBoolean("read_receipts_enabled", true);
    }

    public boolean A2M() {
        return ((SharedPreferences) this.A00.get()).getBoolean("tos_2016_opt_out_state", false);
    }

    public boolean A2N() {
        if (Build.VERSION.SDK_INT == ((SharedPreferences) this.A00.get()).getInt("video_transcode_compliance_v5", -1)) {
            return true;
        }
        return false;
    }

    public boolean A2O() {
        boolean z;
        synchronized (this.A03) {
            z = ((SharedPreferences) this.A00.get()).getBoolean("need_to_get_pre_key_digest", true);
        }
        return z;
    }

    public boolean A2P() {
        return ((SharedPreferences) this.A00.get()).getBoolean("support_ban_appeal_screen_before_verification", false);
    }

    public boolean A2Q() {
        boolean z;
        synchronized (this.A04) {
            z = ((SharedPreferences) this.A00.get()).getBoolean("signal_protocol_store_is_new", false);
        }
        return z;
    }

    public boolean A2R(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            A00(this).putString("interface_gdrive_backup_frequency", String.valueOf(i)).apply();
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-preferences/set-backup-freq/");
        sb.append(i);
        Log.e(sb.toString());
        return false;
    }

    public boolean A2S(String str) {
        return ((SharedPreferences) this.A00.get()).getBoolean(str, false);
    }

    public boolean A2U(String str) {
        return ((SharedPreferences) this.A00.get()).getBoolean(str, false);
    }

    public boolean A2W(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("dc_customer_sent_message_");
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        return ((SharedPreferences) this.A00.get()).getBoolean(sb.toString(), false);
    }

    public byte[] A2X() {
        return Base64.decode(((SharedPreferences) this.A00.get()).getString("token_used_during_reg", ""), 3);
    }

    public C19420v0(C19760wT r4, C19890wg r5) {
        this.A02 = r4;
        this.A00 = new C18910u1((Object) null, new C36251k0(r5, 4));
    }

    public static ArrayList A01() {
        ArrayList A022 = A02();
        A022.add(new AnonymousClass00I("smb_priority_inbox_label_id", 4));
        A022.add(new AnonymousClass00I("smb_priority_inbox_label_switch", 1));
        A022.add(new AnonymousClass00I("wamo_user_identifier", 2));
        return A022;
    }

    public int A0N(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_old_media_encryption_status:");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getInt(sb.toString(), 0);
    }

    public long A0S(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_old_media_encryption_start_time:");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getLong(sb.toString(), 0);
    }

    public HashMap A0n() {
        Set<String> set;
        ArrayList A012 = A01();
        HashMap hashMap = new HashMap();
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            AnonymousClass00I r0 = (AnonymousClass00I) it.next();
            Object obj = r0.A00;
            C18740tg.A06(obj);
            String str = (String) obj;
            Object obj2 = r0.A01;
            C18740tg.A06(obj2);
            int intValue = ((Number) obj2).intValue();
            AnonymousClass005 r4 = this.A00;
            if (((SharedPreferences) r4.get()).contains(str)) {
                if (intValue == 0) {
                    set = Integer.valueOf(((SharedPreferences) r4.get()).getInt(str, 0));
                } else if (intValue == 1) {
                    set = Boolean.valueOf(((SharedPreferences) r4.get()).getBoolean(str, false));
                } else if (intValue == 2) {
                    Object string = ((SharedPreferences) r4.get()).getString(str, (String) null);
                    set = string;
                    if (string == null) {
                    }
                } else if (intValue == 3) {
                    Set<String> stringSet = ((SharedPreferences) r4.get()).getStringSet(str, new HashSet());
                    if (stringSet != null) {
                        boolean isEmpty = stringSet.isEmpty();
                        set = stringSet;
                        if (isEmpty) {
                        }
                    }
                } else if (intValue == 4) {
                    set = Long.valueOf(((SharedPreferences) r4.get()).getLong(str, 0));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected key type: ");
                    sb.append(str);
                    sb.append(" ");
                    sb.append(intValue);
                    throw new IllegalStateException(sb.toString());
                }
                hashMap.put(str, set);
            }
        }
        return hashMap;
    }

    public void A0q() {
        A00(this).remove("gdrive_already_downloaded_bytes").remove("gdrive_restore_overwrite_local_files").remove("gdrive_restore_start_timestamp").remove("gdrive_media_restore_network_setting").remove("gdrive_approx_media_download_size").apply();
    }

    public void A0s() {
        A00(this).remove("connection_sequence_state").apply();
    }

    public void A0t() {
        A00(this).remove("pref_wfs_name").apply();
        A00(this).remove("pref_nta_target_accounts").apply();
        A00(this).remove("pref_nta_source").apply();
        A00(this).remove("pref_nta_disclosure_id").apply();
        A00(this).remove("pref_nta_profile_pic").apply();
    }

    public void A0v() {
        A00(this).remove("pref_fail_too_many").remove("pref_no_route_sms").remove("pref_no_route_voice").remove("pref_fail_too_many_attempts").remove("pref_fail_too_many_guesses").apply();
    }

    public void A0w() {
        A00(this).remove("pref_wfs_blob").apply();
        A00(this).remove("pref_wfs_user").apply();
        A00(this).remove("pref_wfs_pw").apply();
        A00(this).remove("pref_wfs_id_sign").apply();
        A00(this).remove("pref_wfs_name").apply();
        A00(this).remove("pref_wfs_source").apply();
    }

    public void A0y() {
        A00(this).remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry").remove("registration_wipe_server_time").apply();
        A00(this).remove("registration_wipe_info_timestamp").apply();
    }

    public void A0z() {
        A00(this).remove("business_activity_report_expiration_timestamp").remove("business_activity_report_size").remove("business_activity_report_name").remove("business_activity_report_url").remove("business_activity_report_direct_url").remove("business_activity_report_media_key").remove("business_activity_report_file_sha").remove("business_activity_report_file_enc_sha").remove("business_activity_report_timestamp").remove("business_activity_report_state").apply();
    }

    public void A12() {
        A00(this).putInt("video_transcode_compliance_v5", Build.VERSION.SDK_INT).apply();
    }

    public void A15(int i) {
        A00(this).putInt("business_activity_report_state", i).apply();
    }

    public void A16(int i) {
        A00(this).putInt("connection_sequence_attempts", i).apply();
    }

    public void A17(int i) {
        A00(this).putInt("external_dir_migration_stage", i).commit();
    }

    public void A18(int i) {
        A00(this).putInt("gdrive_error_code", i).apply();
    }

    public void A1B(int i) {
        A00(this).putInt("connection_sequence_state", i).apply();
    }

    public void A1C(int i) {
        A00(this).putInt("logins_with_messages", i).apply();
    }

    public void A1F(int i) {
        A00(this).putInt("skin_emoji_tip", i).apply();
    }

    public void A1H(long j) {
        A00(this).putLong("last_login_time", j).apply();
    }

    public void A1I(AnonymousClass11F r4) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("show_expired_group_dialog");
        sb.append(r4.getRawString());
        A002.remove(sb.toString()).apply();
    }

    public void A1K(String str) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("smb_business_direct_connection_enc_string_");
        sb.append(str);
        A002.remove(sb.toString()).apply();
    }

    public void A1L(String str) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("smb_business_direct_connection_enc_string_expired_timestamp_");
        sb.append(str);
        A002.remove(sb.toString()).apply();
    }

    public void A1M(String str) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("smb_business_direct_connection_public_key_");
        sb.append(str);
        A002.remove(sb.toString()).apply();
    }

    public void A1R(String str) {
        A00(this).putString("gdrive_account_name", str).apply();
    }

    public void A1S(String str) {
        SharedPreferences.Editor putString;
        if (TextUtils.isEmpty(str)) {
            putString = A00(this).remove("last_datacenter");
        } else {
            putString = A00(this).putString("last_datacenter", str);
        }
        putString.apply();
    }

    public void A1U(String str) {
        A00(this).putString("registration_code", str).apply();
    }

    public void A1V(String str) {
        A00(this).putString("registration_jid", str).remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry").remove("registration_wipe_server_time").apply();
        A00(this).remove("registration_wipe_info_timestamp").apply();
    }

    public void A1X(String str) {
        A00(this).putString("settings_verification_email_address", str).apply();
    }

    public void A1Z(String str) {
        A1h(str, System.currentTimeMillis());
    }

    public void A1b(String str, int i) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_old_media_encryption_status:");
        sb.append(str);
        A002.putInt(sb.toString(), i).apply();
        if (i == 1) {
            SharedPreferences.Editor A003 = A00(this);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gdrive_old_media_encryption_start_time:");
            sb2.append(str);
            A003.putLong(sb2.toString(), System.currentTimeMillis()).apply();
        }
    }

    public void A1c(String str, int i) {
        A00(this).putInt(str, i).apply();
    }

    public void A1h(String str, long j) {
        A00(this).putLong(str, j).apply();
    }

    public void A1i(String str, String str2) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("dc_default_postcode_");
        sb.append(str);
        A002.putString(sb.toString(), str2).apply();
    }

    public void A1j(String str, String str2) {
        SharedPreferences.Editor A002 = A00(this);
        if (str == null) {
            A002.remove("my_current_status");
        } else {
            A002.putString("my_current_status", str);
            if (!TextUtils.isEmpty(str2)) {
                A002.putString("my_current_status_hash", str2);
                A002.apply();
            }
        }
        A002.remove("my_current_status_hash");
        A002.apply();
    }

    public void A1k(String str, String str2) {
        SharedPreferences.Editor A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("downloadable_category_local_info_json_");
        sb.append(str);
        A002.putString(sb.toString(), str2).apply();
    }

    public void A1l(String str, String str2) {
        A00(this).putString("cc", str).putString("ph", str2).apply();
    }

    public void A1m(String str, String str2) {
        A00(this).putString(str, str2).apply();
    }

    public void A1n(String str, String str2, long j, long j2, long j3, long j4) {
        A00(this).putString("registration_wipe_type", str).putString("registration_wipe_token", str2).putLong("registration_wipe_wait", j).putLong("registration_wipe_expiry", j2).putLong("registration_wipe_server_time", j3).apply();
        A1h("registration_wipe_info_timestamp", j4);
    }

    public void A1p(JSONObject jSONObject) {
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        SharedPreferences.Editor A002 = A00(this);
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            AnonymousClass00I r0 = (AnonymousClass00I) it.next();
            Object obj = r0.A00;
            C18740tg.A06(obj);
            String str2 = (String) obj;
            Object obj2 = r0.A01;
            C18740tg.A06(obj2);
            int intValue = ((Number) obj2).intValue();
            if (jSONObject.has(str2)) {
                if (intValue == 0) {
                    try {
                        A002.putInt(str2, jSONObject.getInt(str2));
                    } catch (JSONException e) {
                        e = e;
                        sb = new StringBuilder();
                        sb.append("wa-shared-preferences/set-local-settings/error-while-inserting ");
                        sb.append(str2);
                        sb.append(":");
                        sb.append(((SharedPreferences) this.A00.get()).getInt(str2, 0));
                    }
                } else if (intValue == 1) {
                    try {
                        A002.putBoolean(str2, jSONObject.getBoolean(str2));
                    } catch (JSONException e2) {
                        e = e2;
                        sb = new StringBuilder();
                        sb.append("wa-shared-preferences/set-local-settings/error-while-inserting ");
                        sb.append(str2);
                        sb.append(":");
                        sb.append(((SharedPreferences) this.A00.get()).getBoolean(str2, false));
                    }
                } else if (intValue == 2) {
                    try {
                        A002.putString(str2, jSONObject.getString(str2));
                    } catch (JSONException e3) {
                        e = e3;
                        sb2 = new StringBuilder();
                        sb2.append("wa-shared-preferences/set-local-settings/error-while-inserting ");
                        sb2.append(str2);
                        sb2.append(":");
                        sb2.append(((SharedPreferences) this.A00.get()).getString(str2, (String) null));
                    }
                } else if (intValue == 3) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray(str2);
                        HashSet hashSet = new HashSet(jSONArray.length());
                        for (int i = 0; i < jSONArray.length(); i++) {
                            hashSet.add(jSONArray.get(i));
                        }
                        A002.putStringSet(str2, hashSet);
                    } catch (JSONException e4) {
                        e = e4;
                        sb2 = new StringBuilder();
                        sb2.append("wa-shared-preferences/set-local-settings/error-while-inserting ");
                        sb2.append(str2);
                        sb2.append(":");
                        sb2.append(((SharedPreferences) this.A00.get()).getStringSet(str2, (Set) null));
                        str = sb2.toString();
                        Log.e(str, e);
                    }
                } else if (intValue == 4) {
                    try {
                        A002.putLong(str2, jSONObject.getLong(str2));
                    } catch (JSONException e5) {
                        e = e5;
                        sb2 = new StringBuilder();
                        sb2.append("wa-shared-preferences/set-local-settings/error-while-inserting ");
                        sb2.append(str2);
                        sb2.append(":");
                        sb2.append(((SharedPreferences) this.A00.get()).getLong(str2, -1));
                    }
                }
            }
        }
        A002.apply();
        return;
        str = sb.toString();
        Log.e(str, e);
    }

    public void A1q(boolean z) {
        SharedPreferences.Editor remove = A00(this).remove("external_dir_migration_attempt_n").remove("ext_dir_migration_rescan_time").remove("ext_dir_migration_move_time").remove("ext_dir_migration_start_time");
        if (!z) {
            remove.remove("external_dir_migration_stage");
        }
        remove.commit();
    }

    public void A1r(boolean z) {
        A00(this).putBoolean("first_party_migration_initiated", z).apply();
    }

    public void A1s(boolean z) {
        A00(this).putBoolean("future_proof_processing_needed", z).apply();
    }

    public void A1t(boolean z) {
        A00(this).putBoolean("gdrive_restore_overwrite_local_files", z).apply();
    }

    public void A1u(boolean z) {
        A00(this).putBoolean("gdrive_include_videos_in_backup", z).apply();
    }

    public void A1v(boolean z) {
        A00(this).putBoolean("net_new_jid", z).apply();
    }

    public void A1w(boolean z) {
        A00(this).putBoolean("new_jid", z).apply();
    }

    public void A1x(boolean z) {
        A00(this).putBoolean("live_location_is_new_user", z).apply();
    }

    public void A1y(boolean z) {
        A00(this).putBoolean("reg_passkey_exists", z).apply();
    }

    public void A1z(boolean z) {
        A00(this).putBoolean("encrypted_backup_enabled", z).apply();
    }

    public void A20(boolean z) {
        A00(this).putBoolean("encrypted_backup_using_encryption_key", z).apply();
    }

    public void A22(boolean z) {
        A00(this).putBoolean("privacy_fingerprint_enabled", z).apply();
    }

    public void A23(boolean z) {
        A00(this).putBoolean("settings_verification_email_address_verified", z).apply();
    }

    public void A25(boolean z) {
        SharedPreferences.Editor A002 = A00(this);
        if (z) {
            A002.putBoolean("show_post_reg_logged_out_dialog", true);
        } else {
            A002.remove("show_post_reg_logged_out_dialog");
        }
        A002.apply();
    }

    public void A28(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        A00(this).putBoolean("pref_fail_too_many", z).putBoolean("pref_no_route_sms", z2).putBoolean("pref_no_route_voice", z3).putBoolean("pref_fail_too_many_attempts", z4).putBoolean("pref_fail_too_many_guesses", z5).apply();
    }

    public boolean A2T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive_last_successful_backup_encrypted:");
        sb.append(str);
        return ((SharedPreferences) this.A00.get()).getBoolean(sb.toString(), false);
    }

    public boolean A2V(String str, long j) {
        long A0V = A0V(str);
        if (A0V == -1 || System.currentTimeMillis() > A0V + j) {
            return true;
        }
        return false;
    }
}
