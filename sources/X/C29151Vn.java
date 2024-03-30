package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Vn  reason: invalid class name and case insensitive filesystem */
public class C29151Vn {
    public final C20810yC A00;
    public final C29171Vp A01;
    public final C29211Vt A02;
    public final C29191Vr A03;
    public final C19730wQ A04;
    public final C19970wo A05;
    public final C29201Vs A06;

    public void A01(C135106c9 r10, AnonymousClass3T1 r11) {
        C202319lY r0 = r11.A0M;
        if (r0 != null) {
            String A022 = C203419nz.A02(r0.A03);
            if ("p2p".equals(A022) || "p2m".equals(A022)) {
                C29171Vp r5 = this.A01;
                boolean z = false;
                if (r10 != null) {
                    z = true;
                }
                boolean z2 = r11 instanceof C46962bx;
                synchronized (r5) {
                    C29161Vo r6 = r5.A01;
                    C202009kr A002 = r6.A00();
                    A002.A05++;
                    if (z) {
                        A002.A0A++;
                    }
                    if (z2) {
                        A002.A0B++;
                        if (z) {
                            A002.A09++;
                        }
                    }
                    r6.A01(A002);
                }
            }
        }
    }

    public void A02(AnonymousClass3T1 r10) {
        C202319lY r0;
        if (!r10.A1J.A02 && (r0 = r10.A0M) != null) {
            UserJid userJid = r0.A0D;
            C19730wQ r02 = this.A04;
            r02.A0G();
            if (userJid == r02.A03) {
                AnonymousClass3T1 A0S = r10.A0S();
                if (!(A0S instanceof C46962bx)) {
                    A0S = null;
                }
                C29171Vp r6 = this.A01;
                boolean z = true;
                boolean z2 = false;
                if (r10.A0M.A05() != null) {
                    z2 = true;
                }
                if (A0S == null) {
                    z = false;
                }
                synchronized (r6) {
                    C29161Vo r5 = r6.A01;
                    C202009kr A002 = r5.A00();
                    A002.A04++;
                    if (z2) {
                        A002.A07++;
                    }
                    if (z) {
                        A002.A08++;
                        if (z2) {
                            A002.A06++;
                        }
                    }
                    r5.A01(A002);
                }
            }
        }
    }

    public void A03(String str, String str2, String str3, int i) {
        JSONArray jSONArray;
        String str4;
        try {
            C29201Vs r1 = this.A06;
            AnonymousClass00C.A0D(str, 0);
            AnonymousClass00C.A0D(str2, 1);
            C19890wg r3 = r1.A00;
            SharedPreferences A002 = r3.A00("hybrid_payment_methods_used");
            AnonymousClass00C.A08(A002);
            String string = A002.getString(str, (String) null);
            if (string == null) {
                string = "{}";
            }
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has(str2)) {
                i = jSONObject.getInt(str2) + 1;
            }
            jSONObject.put(str2, i);
            SharedPreferences A003 = r3.A00("hybrid_payment_methods_used");
            AnonymousClass00C.A08(A003);
            A003.edit().putString(str, jSONObject.toString()).apply();
            C29161Vo r2 = this.A01.A01;
            C202009kr A004 = r2.A00();
            try {
                if (!TextUtils.isEmpty(A004.A0C)) {
                    jSONArray = new JSONArray(A004.A0C);
                } else {
                    jSONArray = new JSONArray();
                }
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    if (!str.equals(((JSONObject) jSONArray.get(i2)).optString("business_owner_jid"))) {
                        i2++;
                    } else if (i2 != -1) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i2);
                        jSONArray.remove(i2);
                        int i3 = 0;
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            i3 += jSONObject.getInt(keys.next());
                        }
                        if (str3.equals("VPA")) {
                            str4 = "vpa_successful_transactions_count";
                        } else {
                            str4 = "successful_transactions_count";
                        }
                        jSONObject2.put(str4, i3);
                        jSONObject2.put("payment_method_used", jSONObject);
                        jSONArray.put(jSONObject2);
                        A004.A0C = jSONArray.toString();
                        r2.A01(A004);
                        return;
                    } else {
                        return;
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentDailyUsageSync/onTransactionSuccess Error building json payload.");
                A004.A0C = new JSONArray().toString();
                r2.A01(A004);
            }
        } catch (Exception unused2) {
            Log.e("PaymentDailyUsageManager/onTransactionSuccess error updating transaction count.");
        }
    }

    public C29151Vn(C19730wQ r1, C19970wo r2, C20810yC r3, C29201Vs r4, C29171Vp r5, C29211Vt r6, C29191Vr r7) {
        this.A05 = r2;
        this.A00 = r3;
        this.A04 = r1;
        this.A01 = r5;
        this.A03 = r7;
        this.A06 = r4;
        this.A02 = r6;
    }

    public static boolean A00(C29151Vn r10, C29181Vq r11, String str, String str2, String str3, long j) {
        Set<String> set;
        Set set2;
        String str4;
        Set set3;
        SharedPreferences A022 = r11.A02();
        C004702c r3 = C004702c.A00;
        Set<String> stringSet = A022.getStringSet(str, r3);
        if (stringSet != null) {
            set = C007103b.A0f(stringSet);
        } else {
            set = r3;
        }
        for (String str5 : set) {
            AnonymousClass00C.A0D(str5, 0);
            Set<String> stringSet2 = r11.A01().getStringSet(str5, r3);
            if (stringSet2 != null) {
                set2 = C007103b.A0f(stringSet2);
            } else {
                set2 = r3;
            }
            Iterator it = set2.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str6 = (String) it.next();
                    AnonymousClass00C.A0D(str6, 0);
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        try {
                            if (str.equals(jSONObject.getString("handle"))) {
                                if (C19970wo.A00(r10.A05) < jSONObject.getLong("ts") + j) {
                                    Set<String> stringSet3 = r11.A03().getStringSet(str5, r3);
                                    if (stringSet3 != null) {
                                        set3 = C007103b.A0f(stringSet3);
                                    } else {
                                        set3 = r3;
                                    }
                                    HashSet hashSet = new HashSet(set3);
                                    hashSet.add(str2);
                                    r11.A03().edit().putStringSet(str5, hashSet).apply();
                                    r10.A03(str5, SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, str3, hashSet.size());
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        } catch (Exception unused) {
                            str4 = "PaymentDailyUsageManager/checkAndUpdateTransactionCount Error in getting handle.";
                            Log.e(str4);
                        }
                    } catch (JSONException unused2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(r11.A01);
                        sb.append("/toJsonObject Error building json object.");
                        str4 = sb.toString();
                        Log.e(str4);
                    }
                }
            }
        }
        return false;
    }
}
