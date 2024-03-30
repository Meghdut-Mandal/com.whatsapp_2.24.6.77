package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1YS  reason: invalid class name */
public class AnonymousClass1YS {
    public final C24601Db A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final C19970wo A02;

    private void A00() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.A01.entrySet()) {
                String l = Long.toString(((Number) entry.getKey()).longValue());
                C198299dE r2 = (C198299dE) entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                C199359fB r3 = r2.A08;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("update_count", r3.A00);
                jSONObject3.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.A01);
                jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject3.toString());
                jSONObject2.put("state", r2.A03);
                jSONObject2.put("title", r2.A0F);
                jSONObject2.put("end_ts", r2.A04);
                jSONObject2.put("locale", r2.A0D);
                jSONObject2.put("start_ts", r2.A06);
                jSONObject2.put("terms_url", r2.A0E);
                jSONObject2.put("description", r2.A0B);
                jSONObject2.put("redeem_limit", r2.A05);
                jSONObject2.put("fine_print_url", r2.A0C);
                jSONObject2.put("interactive_sync_done", r2.A02);
                jSONObject2.put("kill_switch_info_viewed", r2.A00);
                jSONObject2.put("sender_maxed_info_viewed", r2.A01);
                jSONObject2.put("offer_amount", r2.A07.A02().toString());
                C197219bK r0 = r2.A09;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("min_amount", r0.A00.A02().toString());
                jSONObject2.put("payment", jSONObject4.toString());
                C197609bz r32 = r2.A0A;
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("max_from_sender", r32.A00);
                jSONObject5.put("usync_pay_eligible_offers_includes_current_offer_id", r32.A01);
                jSONObject2.put("receiver", jSONObject5.toString());
                jSONObject.put(l, jSONObject2.toString());
            }
            C24601Db r02 = this.A00;
            r02.A03().edit().putString("payment_incentive_offer_details", jSONObject.toString()).apply();
        } catch (JSONException unused) {
            this.A01.clear();
            this.A00.A03().edit().putString("payment_incentive_offer_details", (String) null).apply();
        }
    }

    public void A01() {
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            if (((C198299dE) ((Map.Entry) it.next()).getValue()).A04 + TimeUnit.DAYS.toSeconds((long) 14) < TimeUnit.MILLISECONDS.toSeconds(C19970wo.A00(this.A02))) {
                it.remove();
            }
        }
        A00();
    }

    public void A02() {
        C24601Db r7 = this.A00;
        String string = r7.A03().getString("payment_incentive_offer_details", (String) null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                ConcurrentHashMap concurrentHashMap = this.A01;
                concurrentHashMap.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    long A012 = AnonymousClass6R8.A01(next, 0);
                    if (A012 > 0) {
                        concurrentHashMap.put(Long.valueOf(A012), new C198299dE(jSONObject.getString(next)));
                    }
                }
            } catch (JSONException unused) {
                Log.e("PAY: PaymentIncentiveOfferMap/loadFromSharedPref failed to load the current offer details");
                this.A01.clear();
                r7.A03().edit().putString("payment_incentive_offer_details", (String) null).apply();
            }
        }
    }

    public AnonymousClass1YS(C19970wo r2, C24601Db r3) {
        this.A02 = r2;
        this.A00 = r3;
    }

    public void A03(C198299dE r12, long j) {
        A02();
        ConcurrentHashMap concurrentHashMap = this.A01;
        concurrentHashMap.put(Long.valueOf(j), r12);
        for (int size = concurrentHashMap.size() - 2; size > 0; size--) {
            long j2 = 0;
            long j3 = Long.MAX_VALUE;
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((Number) entry.getKey()).longValue() != j && ((C198299dE) entry.getValue()).A04 < j3) {
                    j2 = ((Number) entry.getKey()).longValue();
                    j3 = ((C198299dE) entry.getValue()).A04;
                }
            }
            concurrentHashMap.remove(Long.valueOf(j2));
        }
        A00();
    }
}
