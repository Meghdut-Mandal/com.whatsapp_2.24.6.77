package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Wl  reason: invalid class name and case insensitive filesystem */
public class C29391Wl {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static synchronized SharedPreferences.Editor A00(C29391Wl r1) {
        SharedPreferences.Editor edit;
        synchronized (r1) {
            edit = A01(r1).edit();
        }
        return edit;
    }

    public static synchronized SharedPreferences A01(C29391Wl r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("user_notice_cms_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public synchronized void A04(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C64683Pa r6 = (C64683Pa) it.next();
            C605438g r5 = r6.A05;
            int i = r5.A00;
            String valueOf = String.valueOf(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, i);
                jSONObject.put("text", r5.A03);
                jSONObject.put("action", r5.A02);
                jSONObject.put("badgeExpirationInHours", r6.A04);
                jSONObject.put("enabled_time", r6.A02);
                jSONObject.put("selected_time", r6.A03);
                jSONObject.put("stage", r6.A01);
                jSONObject.put("policy_version", r6.A00);
                C131506Pi r52 = r5.A01;
                C1276168z r0 = r52.A02;
                if (r0 != null) {
                    jSONObject.put("start_time", r0.A00);
                }
                AnonymousClass6AX r02 = r52.A00;
                if (r02 != null) {
                    jSONObject.put("static_duration", r02.A00);
                }
                C1276168z r03 = r52.A01;
                if (r03 != null) {
                    jSONObject.put("end_time", r03.A00);
                }
                jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
                SharedPreferences.Editor A002 = A00(this);
                StringBuilder sb = new StringBuilder();
                sb.append("badged_notice_");
                sb.append(valueOf);
                A002.putString(sb.toString(), jSONObject.toString()).apply();
            } catch (JSONException e) {
                Log.e("UserNoticeBadgeContent/toJSON exception: ", e);
            }
        }
    }

    public synchronized void A05(Collection collection) {
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C128646Db r2 = (C128646Db) it.next();
            JSONObject jSONObject = new JSONObject();
            int i = r2.A00;
            jSONObject.put("notice_id", i);
            jSONObject.put("policyVersion", r2.A01);
            jSONObject.put("channel", r2.A06);
            AnonymousClass5HN r7 = r2.A02;
            if (r7 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("text", r7.A04);
                jSONObject2.put("iconDescription", r7.A04);
                jSONObject2.put("action", r7.A01);
                jSONObject2.put("light", r7.A03);
                jSONObject2.put("dark", r7.A02);
                jSONObject2.put("iconRole", r7.A02);
                jSONObject2.put("iconStyle", r7.A03);
                jSONObject2.put("timing", r7.A00.A01());
                jSONObject.put("banner", jSONObject2);
            }
            AnonymousClass5HO r0 = r2.A04;
            if (r0 != null) {
                jSONObject.put("modal", r0.A02());
            }
            AnonymousClass5HO r02 = r2.A03;
            if (r02 != null) {
                jSONObject.put("blocking-modal", r02.A02());
            }
            AnonymousClass6CS r4 = r2.A05;
            if (r4 != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("text", r4.A03);
                jSONObject3.put("action", r4.A02);
                jSONObject3.put("badgeExpirationInHours", r4.A00);
                jSONObject3.put("timing", r4.A01.A01());
                jSONObject.put("badged-notice", jSONObject3);
            }
            hashMap.put(String.valueOf(i), jSONObject.toString());
        }
        A00(this).putString("user_notices_content", new JSONObject(hashMap).toString()).apply();
    }

    public synchronized void A06(Collection collection) {
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C65613Su r0 = (C65613Su) it.next();
            JSONObject A012 = C65613Su.A01(r0);
            if (A012 != null) {
                hashMap.put(String.valueOf(r0.A01), A012.toString());
            }
        }
        A00(this).putString("user_notices_metadata", new JSONObject(hashMap).toString()).apply();
    }

    public ArrayList A03() {
        AnonymousClass5HN r10;
        AnonymousClass5HO r16;
        AnonymousClass5HO r17;
        String str;
        ArrayList arrayList = new ArrayList();
        String string = A01(this).getString("user_notices_content", (String) null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String obj = jSONObject.get(keys.next()).toString();
                    AnonymousClass00C.A0D(obj, 0);
                    JSONObject jSONObject2 = new JSONObject(obj);
                    int i = jSONObject2.getInt("notice_id");
                    int i2 = jSONObject2.getInt("policyVersion");
                    String string2 = jSONObject2.getString("channel");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("banner");
                    AnonymousClass6CS r0 = null;
                    if (optJSONObject != null) {
                        String string3 = optJSONObject.getString("text");
                        String string4 = optJSONObject.getString("iconDescription");
                        String string5 = optJSONObject.getString("action");
                        String string6 = optJSONObject.getString("light");
                        String string7 = optJSONObject.getString("dark");
                        String str2 = null;
                        if (optJSONObject.has("iconRole")) {
                            str = optJSONObject.getString("iconRole");
                        } else {
                            str = null;
                        }
                        if (optJSONObject.has("iconStyle")) {
                            str2 = optJSONObject.getString("iconStyle");
                        }
                        r10 = new AnonymousClass5HN(C131506Pi.A00(optJSONObject.getJSONObject("timing")), C111305c4.A00(str), C111315c5.A00(str2), string3, string6, string7, string4, string5);
                    } else {
                        r10 = null;
                    }
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("modal");
                    if (optJSONObject2 != null) {
                        r16 = AnonymousClass5HO.A00(optJSONObject2);
                    } else {
                        r16 = null;
                    }
                    JSONObject optJSONObject3 = jSONObject2.optJSONObject("blocking-modal");
                    if (optJSONObject3 != null) {
                        r17 = AnonymousClass5HO.A00(optJSONObject3);
                    } else {
                        r17 = null;
                    }
                    JSONObject optJSONObject4 = jSONObject2.optJSONObject("badged-notice");
                    if (optJSONObject4 != null) {
                        String string8 = optJSONObject4.getString("text");
                        String string9 = optJSONObject4.getString("action");
                        int A002 = C55072u1.A00(optJSONObject4);
                        C131506Pi A003 = C131506Pi.A00(optJSONObject4.getJSONObject("timing"));
                        AnonymousClass00C.A0B(string8);
                        AnonymousClass00C.A0B(string9);
                        r0 = new AnonymousClass6CS(A003, string8, string9, A002);
                    }
                    AnonymousClass00C.A0B(string2);
                    arrayList.add(new C128646Db(r10, r16, r17, r0, string2, i, i2));
                }
            } catch (JSONException e) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e);
            }
        }
        return arrayList;
    }

    public C29391Wl(C19890wg r1) {
        this.A01 = r1;
    }

    public ArrayList A02() {
        C64683Pa r13;
        C1276168z r9;
        AnonymousClass6AX r1;
        C1276168z r0;
        Map<String, ?> all = A01(this).getAll();
        ArrayList arrayList = new ArrayList();
        if (all != null) {
            for (Map.Entry next : all.entrySet()) {
                if (next.getValue() != null && (next.getValue() instanceof String) && ((String) next.getKey()).startsWith("badged_notice_")) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) next.getValue());
                        int i = C64683Pa.A06;
                        try {
                            long optLong = jSONObject.optLong("start_time", -1);
                            long optLong2 = jSONObject.optLong("static_duration", -1);
                            long optLong3 = jSONObject.optLong("end_time", -1);
                            if (optLong == -1) {
                                r9 = null;
                            } else {
                                r9 = new C1276168z(optLong);
                            }
                            if (optLong2 == -1) {
                                r1 = null;
                            } else {
                                r1 = new AnonymousClass6AX((long[]) null, optLong2);
                            }
                            if (optLong3 == -1) {
                                r0 = null;
                            } else {
                                r0 = new C1276168z(optLong3);
                            }
                            int A002 = C55072u1.A00(jSONObject);
                            int i2 = jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            r13 = new C64683Pa(new C131506Pi(r1, r9, r0, "onDemand"), jSONObject.getString("text"), jSONObject.getString("action"), i2, jSONObject.getInt("stage"), jSONObject.getInt("policy_version"), A002, jSONObject.getLong("enabled_time"), jSONObject.getLong("selected_time"));
                        } catch (JSONException e) {
                            Log.e("UserNoticeBadgeContent/fromJSON exception: ", e);
                            r13 = null;
                        }
                    } catch (JSONException e2) {
                        Log.e("UserNoticeBadgeSharedPreferences/convertJsonStringToUserNoticeBadgeContent/parsing failed", e2);
                        r13 = null;
                    }
                    if (r13 != null) {
                        arrayList.add(r13);
                    }
                }
            }
        }
        return arrayList;
    }
}
