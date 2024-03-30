package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Vo  reason: invalid class name and case insensitive filesystem */
public class C29161Vo {
    public SharedPreferences A00;
    public final C19970wo A01;
    public final C19890wg A02;

    public C202009kr A00() {
        C202009kr A002;
        C19970wo r5 = this.A01;
        long A003 = C19970wo.A00(r5);
        long j = A003 - (A003 % 86400000);
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("payment_daily_usage_preferences");
            this.A00 = sharedPreferences;
        }
        String string = sharedPreferences.getString(Long.toString(j), (String) null);
        if (TextUtils.isEmpty(string) || (A002 = C202009kr.A00(string)) == null) {
            return new C202009kr(j, C19970wo.A00(r5));
        }
        return A002;
    }

    public void A01(C202009kr r6) {
        long A002 = C19970wo.A00(this.A01);
        String l = Long.toString(A002 - (A002 % 86400000));
        try {
            JSONObject put = new JSONObject().put("start_ts", r6.A0H).put("log_start_date", r6.A0G).put("total_one_time_mandate_cnt", r6.A02).put("total_transaction_sent_cnt", r6.A05).put("total_recurring_mandate_cnt", r6.A03).put("total_transaction_received_cnt", r6.A04).put("transaction_sent_with_sticker_cnt", r6.A0B).put("transaction_sent_with_background_cnt", r6.A0A).put("transaction_received_with_sticker_cnt", r6.A08).put("transaction_received_with_background_cnt", r6.A07).put("transaction_sent_with_background_and_sticker_cnt", r6.A09).put("transaction_received_with_background_and_sticker_cnt", r6.A06).put("invites_sent_to_user_cnt", r6.A01);
            Set<Object> set = r6.A0D;
            JSONArray jSONArray = new JSONArray();
            for (Object put2 : set) {
                jSONArray.put(put2);
            }
            JSONObject put3 = put.put("invited_user_cnt", jSONArray);
            Set<Object> set2 = r6.A0F;
            JSONArray jSONArray2 = new JSONArray();
            for (Object put4 : set2) {
                jSONArray2.put(put4);
            }
            JSONObject put5 = put3.put("invited_user_registered_cnt", jSONArray2).put("invites_received_to_user_cnt", r6.A00);
            Set<Object> set3 = r6.A0E;
            JSONArray jSONArray3 = new JSONArray();
            for (Object put6 : set3) {
                jSONArray3.put(put6);
            }
            String obj = put5.put("inviter_user_cnt", jSONArray3).put("biz_qr_code_received", r6.A0C).toString();
            SharedPreferences sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A02.A00("payment_daily_usage_preferences");
                this.A00 = sharedPreferences;
            }
            sharedPreferences.edit().putString(l, obj).apply();
        } catch (JSONException e) {
            e.getMessage();
        }
    }

    public C29161Vo(C19970wo r1, C19890wg r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
