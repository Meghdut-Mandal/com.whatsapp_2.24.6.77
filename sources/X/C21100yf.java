package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0yf  reason: invalid class name and case insensitive filesystem */
public class C21100yf implements C21090ye {
    public static C21120yh A06 = A01(Integer.MIN_VALUE, 172800, "privatestats_token_first_delay_seconds", "privatestats_token_first_delay_seconds", 21600);
    public static C21120yh A07 = A01(43200, Integer.MAX_VALUE, "privatestats_token_max_expiry_seconds", "privatestats_token_max_expiry_seconds", 86400);
    public static C21120yh A08 = A01(1, 43200, "privatestats_token_prec_lead_seconds", "privatestats_token_prec_lead_seconds", 7200);
    public static C21120yh A09 = A01(2, Integer.MAX_VALUE, "privatestats_token_pre_redeem_count", "privatestats_token_pre_redeem_count", 388);
    public static final C21130yi A0A = A00("abprops_encryption", "abprops_encryption", false);
    public static final C21130yi A0B = A00("async_init_md_migrations", "async_init_md_migrations", true);
    public static final C21130yi A0C = A00("bsp_system_message_enabled", "bsp_system_message_enabled", false);
    public static final C21130yi A0D = A00("ctwa_first_business_reply_logging", "ctwa_first_business_reply_logging", false);
    public static final C21130yi A0E = A00("fbns_disabled_for_secondary", "fbns_disabled_for_secondary", false);
    public static final C21130yi A0F = A00("fbns_enabled", "fbns_enabled", false);
    public static final C21130yi A0G = A00("group_message_notification_use_jid_instead_of_from_me", "group_message_notification_use_jid_instead_of_from_me", true);
    public static final C21130yi A0H = A00("grp_uii_cleanup", "grp_uii_cleanup", false);
    public static final C21130yi A0I = A00("md_voip_enabled", "md_voip_enabled", false);
    public static final C21130yi A0J = A00("mms_vcache_aggregation_enabled", "mms_vcache_aggregation_enabled", false);
    public static final C21130yi A0K = A00("payments_disable_switch_psp", "payments_disable_switch_psp", false);
    public static final C21130yi A0L = A00("novi_p2p", "novi_p2p", false);
    public static final C21130yi A0M = A00("portal_optimization_enabled", "p_opt", false);
    public static final C21130yi A0N = A00("receipt_processing_thread", "receipt_processing_thread", false);
    public static final C21130yi A0O = A00("stella_contact_ranking_enabled", "stella_contact_ranking_enabled", false);
    public static final C21130yi A0P = A00("stella_interop_enabled", "stella_interop_enabled", false);
    public static final C21130yi A0Q = A00("track_battery_metrics", "track_battery_metrics", false);
    public static final C21130yi A0R = A00("wa_msys_fingerprint", "wa_msys_fingerprint", false);
    public static final C21130yi A0S = A00("abprops_prefs_file_rollback_usage_enabled", "abprops_prefs_file_rollback_usage_enabled", false);
    public static final C21130yi A0T = A00("abprops_rollback_enabled", "abprops_rollback_enabled", false);
    public static final C21130yi A0U = A00("disable_hfm_autodownload", "disable_hfm_autodownload", false);
    public static final C21130yi A0V = A00("linked_devices_re_auth_enabled", "linked_devices_re_auth_enabled", false);
    public static final C21130yi A0W = A00("syncd_android_unsupported_mutation_enabled", "syncd_android_unsupported_mutation_enabled", false);
    public static final C21130yi A0X = A00("syncd_clear_chat_delete_chat_enabled", "syncd_clear_chat_delete_chat_enabled", false);
    public static final C21130yi A0Y = A00("syncd_patch_device_index_included", "syncd_patch_device_index_included", false);
    public static final C21130yi A0Z = A00("md_pin_chat_enabled", "md_pin_chat_enabled", false);
    public static final C21130yi A0a = A00("mms_forward_uploading_media_enabled", "mms_forward_uploading_media_enabled", false);
    public static final C21130yi A0b = A00("p2m_pay", "p2m_pay", false);
    public static final C21130yi A0c = A00("p2p_pay", "p2p_pay", false);
    public static final C21130yi A0d = A00("payments_cs_email_disabled", "payments_cs_email_disabled", false);
    public static final C21130yi A0e = A00("async_init_fts_migration", "async_init_fts_migration", false);
    public static final C21130yi A0f = A00("payments_deeplink_signup_enabled", "payments_deeplink_signup_enabled", false);
    public static final C21130yi A0g = A00("payments_request_messages", "payments_request_messages", true);
    public static final C21130yi A0h = A00("payments_upi_qr_signing", "payments_upi_qr_signing", false);
    public static final C21130yi A0i = A00("payments_upi_settings_privacy_banner_enabled", "payments_upi_settings_privacy_banner_enabled", true);
    public static final C21130yi A0j = A00("payments_upi_enable_sim_swap_detection", "payments_upi_enable_sim_swap_detection", false);
    public static final C21130yi A0k = A00("payments_upi_view_in_inbox", "payments_upi_view_in_inbox", false);
    public static final C21130yi A0l = A00("payment_history_fts_enabled", "payment_history_fts_enabled", false);
    public static final C21130yi A0m = A00("wa_msys_crypto", "wa_msys_crypto", true);
    public static final C21130yi A0n = A00("profilo_enabled", "profilo_enabled", false);
    public static final C21130yi A0o = A00("qr_scanning", "qr_scanning", false);
    public static final C21130yi A0p = A00("audio_data_for_notification", "audio_data_for_notification", true);
    public static final C21130yi A0q = A00("quick_message_search_enabled", "quick_message_search_enabled", false);
    public static final C21130yi A0r = A00("receipt_processing_dedup", "receipt_processing_dedup", true);
    public static final C21130yi A0s = A00("reg_log_advertiser_id", "reg_log_advertiser_id", false);
    public static final C21130yi A0t = A00("smb_upsell_chat_banner_enabled", "smb_upsell_chat_banner_enabled", false);
    public static final C21130yi A0u = A00("enhanced_storage_mgmt_sort_fw_score", "enhanced_storage_mgmt_sort_fw_score", false);
    public static final C21130yi A0v;
    public static final C21130yi A0w = A00("force_long_connect", "force_long_connect", false);
    public static final C21130yi A0x = A00("frequently_forwarded_group_setting", "frequently_forwarded_group_setting", false);
    public static final C21130yi A0y = A00("gif_search_v2", "gif_search_v2", false);
    public static final C21130yi A0z = A00("google_drive_enabled", "google_drive_enabled", true);
    public static final C21150yk A10;
    public static final C21120yh A11 = A01((Integer) null, (Integer) null, "hq_image_bw_threshold", "hq_image_bw_threshold", 75);
    public static final C21120yh A12 = A01((Integer) null, (Integer) null, "hq_image_max_edge", "hq_image_max_edge", 0);
    public static final C21120yh A13 = A01((Integer) null, (Integer) null, "hq_image_quality", "hq_image_quality", 0);
    public static final C21120yh A14 = A01(Integer.valueOf(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH), (Integer) null, "image_max_kbytes", "image_max_kbytes", EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final C21120yh A15 = A01(1, 5, "syncd_additional_mutations_for_key_catch_up", "syncd_additional_mutations_for_key_catch_up", 1);
    public static final C21120yh A16 = A01(0, 7, "syncd_fatal_error_timeout_days", "syncd_fatal_error_timeout_days", 0);
    public static final C21120yh A17 = A01(16, (Integer) null, "media_limit_mb", "media", 16);
    public static final C21120yh A18 = A01((Integer) null, (Integer) null, "mms_hot_content_time_span", "mms_hot_content_timespan_in_seconds", 0);
    public static final C21120yh A19 = A01((Integer) null, (Integer) null, "partial_pjpeg_bw_threshold", "partial_pjpeg_bw_threshold", 125);
    public static final C21120yh A1A = A01(257, (Integer) null, "participants_size_limit", "max_participants", 257);
    public static final C21120yh A1B = A01((Integer) null, (Integer) null, "ptt_playback_speed_hide_delay", "ptt_playback_speed_hide_delay", 1500);
    public static final C21120yh A1C = A01((Integer) null, (Integer) null, "status_image_max_edge", "status_image_max_edge", VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH);
    public static final C21120yh A1D = A01((Integer) null, (Integer) null, "status_image_quality", "status_image_quality", 50);
    public static final C21120yh A1E = A01((Integer) null, (Integer) null, "status_video_max_duration", "status_video_max_duration", 45);
    public static final C21120yh A1F = A01(0, 20, "stella_addressbook_restriction_type", "stella_addressbook_restriction_type", 10);
    public static final C21120yh A1G = A01((Integer) null, (Integer) null, "template_doc_mime_types_int", "template_doc_mime_types", 0);
    public static final C21120yh A1H = A01((Integer) null, (Integer) null, "video_max_bitrate", "video_max_bitrate", 5000);
    public static final C21120yh A1I = A01(0, 500, "web_max_size_kb", "web_max_size_kb", 100);
    public static final C21120yh A1J = A01((Integer) null, (Integer) null, "web_service_delay", "web_service_delay", 120);
    public static final C21120yh A1K = A01((Integer) null, (Integer) null, "abprops_revert_bg_crash_count", "abprops_revert_bg_crash_count", 10);
    public static final C21120yh A1L = A01((Integer) null, (Integer) null, "abprops_revert_fg_crash_count", "abprops_revert_fg_crash_count", 5);
    public static final C21120yh A1M = A01((Integer) null, (Integer) null, "image_max_edge", "image_max_edge", 1600);
    public static final C21120yh A1N = A01((Integer) null, (Integer) null, "linked_device_max_count", "linked_device_max_count", 4);
    public static final C21120yh A1O = A01((Integer) null, (Integer) null, "md_mhfs_days", "md_mhfs_days", 732);
    public static final C21120yh A1P = A01((Integer) null, (Integer) null, "md_mhfs_limit", "md_mhfs_limit", 200);
    public static final C21120yh A1Q = A01(0, 100, "md_mhfs_start_progress", "md_mhfs_start_progress", 70);
    public static final C21120yh A1R = A01((Integer) null, (Integer) null, "md_mhrs_days", "md_mhrs_days", 90);
    public static final C21120yh A1S = A01(100, 5000, "syncd_critical_contacts_limit", "syncd_critical_contacts_limit", 1000);
    public static final C21120yh A1T = A01(100, 2000, "syncd_inline_mutations_max_count", "syncd_inline_mutations_max_count", 100);
    public static final C21120yh A1U = A01(0, 43200, "syncd_keep_alive_mins", "syncd_keep_alive_mins", 1440);
    public static final C21120yh A1V = A01(1, 90, "syncd_key_max_use_days", "syncd_key_max_use_days", 30);
    public static final C21120yh A1W = A01((Integer) null, (Integer) null, "announcement_toggle_time_hours", "announcement_toggle_time_hours", 72);
    public static final C21120yh A1X = A01(15, 90, "syncd_key_stale_days", "syncd_key_stale_days", 31);
    public static final C21120yh A1Y = A01(10, 100, "syncd_patch_protobuf_max_size", "syncd_patch_protobuf_max_size", 10);
    public static final C21120yh A1Z = A01(0, 20, "syncd_sentinel_timeout_seconds", "syncd_sentinel_timeout_seconds", 3);
    public static final C21120yh A1a = A01(1, 15, "syncd_wait_for_key_timeout_days", "syncd_wait_for_key_timeout_days", 7);
    public static final C21120yh A1b = A01(10, 300, "critical_payload_download_and_applied_timeout_secs", "critical_payload_download_and_applied_timeout_secs", 120);
    public static final C21120yh A1c = A01(10, 300, "critical_payload_upload_timeout_secs", "critical_payload_upload_timeout_secs", 60);
    public static final C21120yh A1d = A01(0, (Integer) null, "media_limit_auto_download_mb", "media_max_autodownload", 32);
    public static final C21120yh A1e = A01((Integer) null, (Integer) null, "media_limit_auto_download_wifi_mb", "media_max_autodownload_wifi_mb", 100);
    public static final C21120yh A1f = A01((Integer) null, (Integer) null, "mms_vcard_autodownload_size_kb", "mms_vcard_autodownload_size_kb", EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final C21120yh A1g = A01((Integer) null, (Integer) null, "one_tap_calling_in_group_chat_size", "one_tap_calling_in_group_chat_size", 4);
    public static final C21120yh A1h = A01((Integer) null, (Integer) null, "biz_block_reasons_version", "biz_block_reasons_version", 0);
    public static final C21120yh A1i = A01(0, 300, "overnight_alarms_jitter_limit_in_sec", "overnight_alarms_jitter_limit_in_sec", 0);
    public static final C21120yh A1j = A01((Integer) null, (Integer) null, "payments_br_transaction_limit", "payments_transaction_limit", 1000);
    public static final C21120yh A1k = A01((Integer) null, (Integer) null, "payments_upi_first_day_max_transaction_limit", "payments_upi_first_day_max_transaction_limit", 5000);
    public static final C21120yh A1l = A01((Integer) null, (Integer) null, "payments_upi_generate_qr_amount_limit", "payments_upi_generate_qr_amount_limit", 5000);
    public static final C21120yh A1m = A01((Integer) null, (Integer) null, "payments_upi_intent_transaction_limit", "payments_upi_intent_transaction_limit", 2000);
    public static final C21120yh A1n = A01((Integer) null, (Integer) null, "payments_upi_transaction_limit", "payments_upi_transaction_limit", 5000);
    public static final C21120yh A1o = A01((Integer) null, (Integer) null, "payments_upi_transaction_limit_request", "payments_upi_transaction_limit_request", 5000);
    public static final C21120yh A1p = A01((Integer) null, (Integer) null, "ping_timeout_s", "ping_timeout_s", 32);
    public static final C21120yh A1q = A01((Integer) null, (Integer) null, "vname_cert_staleness_threshold", "vname_cert_staleness_threshold", 43200);
    public static final C21120yh A1r = A01((Integer) null, (Integer) null, "vcard_max_size_kb", "vcard_max_size_kb", EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final C21120yh A1s = A01(256, (Integer) null, "broadcast_list_size_limit", "max_list_recipients", 256);
    public static final C21120yh A1t = A01(30, 180, "prekey_expiration_days", "prekey_expiration_days", 60);
    public static final C21120yh A1u = A01((Integer) null, (Integer) null, "shops_required_tos_version", "shops_required_tos_version", 0);
    public static final C21120yh A1v = A01(25, (Integer) null, "subject_length_limit", "max_subject", 25);
    public static final C21120yh A1w = A01((Integer) null, (Integer) null, "sync_wifi_threshold_kb", "sync_wifi_threshold_kb", 5000);
    public static final C21120yh A1x = A01((Integer) null, (Integer) null, "vcard_as_document_size_kb", "vcard_as_document_size_kb", 0);
    public static final C21120yh A1y = A01((Integer) null, (Integer) null, "biz_profile_options", "biz_profile_options", 4);
    public static final C21120yh A1z = A01((Integer) null, (Integer) null, "max_keys", "max_keys", 812);
    public static final C21120yh A20 = A01((Integer) null, (Integer) null, "direct_db_migration_timeout_in_secs", "direct_db_migration_timeout_in_secs", VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT);
    public static final C21120yh A21 = A01((Integer) null, (Integer) null, "gif_provider", "gif_provider", -1);
    public static final C21120yh A22 = A01((Integer) null, (Integer) null, "group_description_length", "group_description_length", 0);
    public static final C21140yj A23;
    public static final C21140yj A24;
    public static final C21140yj A25;
    public static final C21140yj A26;
    public static final List A27 = new ArrayList();
    public static final List A28 = new ArrayList();
    public final SharedPreferences A00;
    public final C21180yn A01;
    public final C21170ym A02;
    public final C21160yl A03;
    public final C19630wG A04;
    public final C20920yN A05;

    public static final void A02(C20920yN r2, String str) {
        AnonymousClass00C.A0D(r2, 0);
        r2.BqE(str, 2141, 0);
        r2.BqE(str, 2141, 1);
    }

    static {
        C21140yj r1 = new C21140yj("payments_cs_faq_url", "https://faq.whatsapp.com/payments");
        A28.add(r1);
        A25 = r1;
        C21140yj r12 = new C21140yj("payments_cs_email_address", (String) null);
        A28.add(r12);
        A24 = r12;
        C21140yj r13 = new C21140yj("payments_cs_phone_number", (String) null);
        A28.add(r13);
        A26 = r13;
        C21140yj r14 = new C21140yj("ephemeral_messages_allowed_values", C19430v1.A06);
        A28.add(r14);
        A23 = r14;
        C21130yi r15 = new C21130yi("enable_export", "enable_export", true);
        A27.add(r15);
        A0v = r15;
        C21150yk r16 = new C21150yk();
        A28.add(r16);
        A10 = r16;
    }

    public static C21130yi A00(String str, String str2, boolean z) {
        C21130yi r1 = new C21130yi(str, str2, z);
        A28.add(r1);
        return r1;
    }

    public static C21120yh A01(Integer num, Integer num2, String str, String str2, int i) {
        C21120yh r1 = new C21120yh(num, num2, str, str2, i);
        A28.add(r1);
        return r1;
    }

    public int A03() {
        return this.A00.getInt("server_props:last_version", 0);
    }

    public int A04(C21120yh r5) {
        int i;
        synchronized (C21100yf.class) {
            SharedPreferences sharedPreferences = this.A00;
            Boolean bool = C18750th.A03;
            i = sharedPreferences.getInt(r5.A00, r5.A00);
        }
        return i;
    }

    public long A05() {
        return this.A00.getLong("server_props:refresh", 86400000);
    }

    public long A06() {
        return this.A00.getLong("groups_server_props_last_refresh_time", 0);
    }

    public String A07(C21140yj r5) {
        String string;
        synchronized (C21100yf.class) {
            SharedPreferences sharedPreferences = this.A00;
            Boolean bool = C18750th.A03;
            string = sharedPreferences.getString(r5.A00, r5.A00);
        }
        return string;
    }

    public void A08(C19970wo r10, String str, String str2, Map map, int i, int i2, long j) {
        boolean z;
        SharedPreferences sharedPreferences;
        ArrayList arrayList;
        SharedPreferences sharedPreferences2 = this.A00;
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        synchronized (C21100yf.class) {
            edit.putLong("groups_server_props_last_refresh_time", C19970wo.A00(r10));
            edit.putInt("server_props:last_version", i);
            edit.putLong("server_props:refresh", Math.max(j, 600000));
            z = false;
            if (i2 == 1 || !TextUtils.isEmpty(str)) {
                Iterator it = this.A02.getObservers().iterator();
                while (it.hasNext()) {
                    it.next();
                }
                for (C21110yg A002 : A28) {
                    A002.A00(edit, map);
                }
                C21160yl r2 = this.A03;
                synchronized (r2) {
                    sharedPreferences = r2.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = r2.A01.A00(C19430v1.A0A);
                        r2.A00 = sharedPreferences;
                    }
                }
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                synchronized (r2.A02) {
                    try {
                        arrayList = new ArrayList(C21160yl.A03.values());
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    it2.next();
                    th = new NullPointerException("remoteKey");
                    throw th;
                }
                edit2.apply();
                if (sharedPreferences2.getBoolean("server_props:one_time_unlocked", true)) {
                    for (C21110yg A003 : A27) {
                        A003.A00(edit, map);
                    }
                    edit.putBoolean("server_props:one_time_unlocked", false);
                }
                z = true;
            }
            if (i2 == 2) {
                edit.putString("server_props:config_key", str2);
                A02(this.A05, str2);
                if (!TextUtils.isEmpty(str)) {
                    edit.putString("server_props:config_hash", str);
                }
            } else {
                edit.remove("server_props:config_key");
                A02(this.A05, (String) null);
                edit.remove("server_props:config_hash");
            }
            edit.apply();
        }
        C21180yn r1 = this.A01;
        ((SharedPreferences) r1.A00.get()).edit().putString("server_props:hash", C21190yo.A00(((SharedPreferences) r1.A01.get()).getAll())).apply();
        if (z) {
            for (AnonymousClass196 r3 : this.A02.getObservers()) {
                r3.A0W.Boy(new C35671j4(r3, 30));
            }
        }
    }

    public boolean A09(C21130yi r5) {
        boolean z;
        synchronized (C21100yf.class) {
            SharedPreferences sharedPreferences = this.A00;
            Boolean bool = C18750th.A03;
            z = sharedPreferences.getBoolean(r5.A00, r5.A00);
        }
        return z;
    }

    public void BXs(C20920yN r5) {
        synchronized (C21100yf.class) {
            A02(r5, this.A00.getString("server_props:config_key", (String) null));
        }
    }

    public C21100yf(C21180yn r2, C21170ym r3, C21160yl r4, C19630wG r5, C20920yN r6, C19890wg r7) {
        SharedPreferences A002 = r7.A00("server_prop_preferences");
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = A002;
        this.A02 = r3;
        this.A01 = r2;
    }
}
