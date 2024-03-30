package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Db  reason: invalid class name and case insensitive filesystem */
public class C24601Db {
    public SharedPreferences A00;
    public final C19970wo A01;
    public final C24611Dc A02 = C24611Dc.A00("PaymentSharedPrefs", "infra", "COMMON");
    public final C19890wg A03;

    public synchronized SharedPreferences A03() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A00("com.whatsapp_payment_preferences");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A0A() {
        A03().edit().putBoolean("pref_p2m_hybrid_tos_accepted", true).apply();
    }

    public static String A01(Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put(((Jid) entry.getKey()).getRawString(), entry.getValue());
            }
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: PaymentSharedPrefs/getRawFromJidsWithExpiration/exception: ");
            sb.append(e);
            Log.e(sb.toString());
        }
        return jSONObject.toString();
    }

    public static HashMap A02(C24601Db r9, String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                long A002 = C19970wo.A00(r9.A01);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    UserJid A022 = UserJid.Companion.A02(next);
                    long j = jSONObject.getLong(next);
                    if (A022 != null && j >= A002) {
                        hashMap.put(A022, Long.valueOf(j));
                    }
                }
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentSharedPrefs/getJidsWithExpirationFromRaw/exception: ");
                sb.append(e);
                Log.e(sb.toString());
            }
        }
        return hashMap;
    }

    public void A0B() {
        long A002 = C19970wo.A00(this.A01);
        A0H(A002);
        C24611Dc r2 = this.A02;
        StringBuilder sb = new StringBuilder();
        sb.append("setIsPaymentAccountRecoverableTimeMs to: ");
        sb.append(A002);
        r2.A06(sb.toString());
    }

    public void A0C() {
        long A002 = C19970wo.A00(this.A01);
        A03().edit().putLong("payments_methods_last_sync_time", A002).apply();
        C24611Dc r2 = this.A02;
        StringBuilder sb = new StringBuilder();
        sb.append("updateMethodsLastSyncTimeMilli to: ");
        sb.append(A002);
        r2.A06(sb.toString());
    }

    public void A0E(int i, long j) {
        String str;
        if (i == 0 || i == 1) {
            str = "payments_enabled_till";
        } else {
            str = "merchant_payments_enabled_till";
        }
        A03().edit().putLong(str, j).apply();
    }

    public void A0I(String str) {
        SharedPreferences.Editor remove;
        String str2;
        boolean equals = "merchant_account_linking_context".equals(str);
        SharedPreferences.Editor edit = A03().edit();
        if (equals) {
            remove = edit.remove("payments_merchant_setup_completed_steps").remove("payment_smb_upsell_view_count").remove("business_payment_dyi_report_expiration_timestamp").remove("business_payment_dyi_report_timestamp");
            str2 = "business_payment_dyi_report_state";
        } else {
            remove = edit.remove("payments_setup_completed_steps").remove("payments_p2m_setup_completed_steps").remove("payments_methods_last_sync_time").remove("payments_card_can_receive_payment").remove("payments_all_transactions_last_sync_time").remove("payments_pending_transactions_last_sync_time").remove("payments_nagged_transactions").remove("payments_sent_payment_with_account").remove("payments_sandbox").remove("payments_invitee_jids").remove("payments_inviter_jids").remove("payments_enabled_till").remove("merchant_payments_enabled_till").remove("payments_support_phone_number").remove("payments_device_id").remove("payments_network_id_map").remove("payment_trusted_device_credential").remove("payment_trusted_device_credential_encrypted_aes").remove("payments_trusted_device_credential_network_map").remove("payment_kyc_info").remove("payment_step_up_info").remove("payment_dyi_report_expiration_timestamp").remove("payment_dyi_report_timestamp").remove("payment_dyi_report_state").remove("payments_invitee_jids_with_expiry").remove("payments_inviter_jids_with_expiry").remove("payment_usync_triggered").remove("payment_incentive_offer_details").remove("payment_incentive_user_claim_info").remove("payment_incentive_tooltip_viewed").remove("payments_last_two_factor_nudge_time").remove("payments_two_factor_nudge_count").remove("payments_upi_pin_primer_dialog_shown").remove("payment_trusted_device_elo_wallet_store").remove("payment_account_recovered").remove("payments_home_account_recovery_banner_dismissed").remove("payments_upi_transactions_sync_status").remove("payments_upi_last_transactions_sync_time").remove("payments_resume_onboarding_banner_started").remove("payment_account_recoverable").remove("payment_account_recoverable_time_ms").remove("is_payment_account_created").remove("has_p2mlite_account").remove("payments_home_scan_to_pay_banner_dismissed").remove("payments_home_recovery_2fa_upsell_banner_impression").remove("payments_home_recovery_upin_upsell_banner_impression").remove("payments_home_recovery_2fa_upsell_banner_display").remove("payments_home_recovery_upin_upsell_banner_display").remove("payments_home_recovery_2fa_upsell_banner_impression_update_timestamp").remove("payments_home_recovery_upin_upsell_banner_impression_update_timestamp").remove("pref_p2m_hybrid_tos_accepted").remove("pref_p2m_hybrid_v2_tos_accepted").remove("pref_p2m_hybrid_last_used_payment_option").remove("pref_br_onboarding_add_kyc_step_migration").remove("pref_payments_custom_payment_method_tos_completed_steps");
            str2 = "pref_income_verification_state";
        }
        remove.remove(str2).apply();
    }

    public C24601Db(C19970wo r4, C19890wg r5) {
        this.A01 = r4;
        this.A03 = r5;
    }

    public static String A00(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1060082597:
                if (str.equals("p2m_context")) {
                    return "payments_p2m_setup_completed_steps";
                }
                break;
            case -467703759:
                if (str.equals("custom_payment_method_linking")) {
                    return "pref_payments_custom_payment_method_tos_completed_steps";
                }
                break;
            case 610582159:
                if (str.equals("merchant_account_linking_context")) {
                    return "payments_merchant_setup_completed_steps";
                }
                break;
            case 1692409671:
                str2 = "generic_context";
                break;
            case 2107488606:
                str2 = "p2p_context";
                break;
        }
        if (str.equals(str2)) {
            return "payments_setup_completed_steps";
        }
        throw new IllegalArgumentException("Unsupported flow. See PaymentConstants.PaymentFlow for all supported flows");
    }

    public C206359tF A04() {
        String string = A03().getString("payment_step_up_info", (String) null);
        if (string != null) {
            return AnonymousClass9ZX.A01(string);
        }
        return null;
    }

    public Boolean A05() {
        if (A03().contains("payment_is_first_send")) {
            return Boolean.valueOf(A03().getBoolean("payment_is_first_send", false));
        }
        return null;
    }

    public String A06() {
        return A03().getString("payments_setup_country_specific_info", "");
    }

    public String A07() {
        JSONObject jSONObject;
        String string = A03().getString("payment_trusted_device_elo_wallet_store", (String) null);
        if (string != null) {
            jSONObject = new JSONObject(string);
        } else {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException unused) {
                this.A02.A06("Failed to get the wallet_id");
                return null;
            }
        }
        return jSONObject.getString("wallet_id");
    }

    public void A08() {
        A03().edit().remove("payment_step_up_info").apply();
    }

    public void A09() {
        A03().edit().putBoolean("payments_resume_onboarding_banner_started", true).apply();
    }

    public void A0D(int i) {
        A03().edit().putInt("payments_upi_transactions_sync_status", i).apply();
    }

    public void A0F(int i, String str) {
        String str2;
        SharedPreferences.Editor edit = A03().edit();
        if ("personal".equals(str)) {
            str2 = "payment_dyi_report_state";
        } else {
            str2 = "business_payment_dyi_report_state";
        }
        edit.putInt(str2, i).apply();
    }

    public void A0G(long j) {
        A03().edit().putLong("payments_upi_last_transactions_sync_time", j).apply();
    }

    public void A0H(long j) {
        A03().edit().putLong("payment_account_recoverable_time_ms", j).apply();
    }

    public void A0J(String str) {
        SharedPreferences.Editor remove;
        String str2;
        SharedPreferences.Editor edit = A03().edit();
        if ("personal".equals(str)) {
            remove = edit.remove("payment_dyi_report_state").remove("payment_dyi_report_timestamp");
            str2 = "payment_dyi_report_expiration_timestamp";
        } else {
            remove = edit.remove("business_payment_dyi_report_state").remove("business_payment_dyi_report_timestamp");
            str2 = "business_payment_dyi_report_expiration_timestamp";
        }
        remove.remove(str2).apply();
    }

    public void A0K(String str) {
        A03().edit().putString("payments_setup_country_specific_info", str).apply();
    }

    public void A0L(String str) {
        A03().edit().putString("payments_block_list", str).apply();
    }

    public void A0M(String str) {
        A03().edit().putString("payments_sent_payment_with_account", str).apply();
    }

    public void A0N(String str) {
        A03().edit().putString("pref_income_verification_state", str).apply();
    }

    public void A0O(boolean z) {
        A03().edit().putBoolean("payments_has_unseen_requests", z).apply();
    }

    public void A0P(boolean z) {
        A03().edit().putBoolean("payments_sandbox", z).apply();
    }
}
