package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1EV  reason: invalid class name */
public class AnonymousClass1EV extends C24591Da {
    public final AnonymousClass185 A00;
    public final AnonymousClass1EZ A01;

    public AnonymousClass1EV(C21100yf r8, AnonymousClass185 r9, C19970wo r10, C20810yC r11, AnonymousClass1EZ r12, C24601Db r13, C24631De r14, C24641Df r15) {
        super(r8, r10, r11, r13, r14, r15);
        this.A01 = r12;
        this.A00 = r9;
    }

    public boolean A0B() {
        if (!A04(1)) {
            return false;
        }
        return C20800yB.A01(C21000yV.A02, this.A02, 1586);
    }

    public boolean A0D() {
        if (!A04(0) || C202159l8.A0E != this.A04.A02() || !A0E()) {
            return false;
        }
        return true;
    }

    public HashMap A07() {
        HashMap hashMap = new HashMap();
        String A09 = this.A02.A09(2351);
        if (!TextUtils.isEmpty(A09)) {
            try {
                JSONArray optJSONArray = new JSONObject(A09).optJSONArray("psp_list");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        String optString2 = jSONObject.optString("display_name");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            hashMap.put(optString, optString2);
                        }
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentsGatingManager/getP2mLitePspMap can't construct psp json map from abprops");
            }
        }
        return hashMap;
    }

    public boolean A08() {
        if (C202159l8.A0F != this.A04.A02()) {
            return false;
        }
        AnonymousClass1EZ r1 = this.A01;
        if (r1.A0F() || r1.A0E()) {
            return true;
        }
        return false;
    }

    public boolean A0A() {
        return !this.A02.A09(3690).isEmpty();
    }

    public boolean A0C() {
        if (this.A00.A09(C21100yf.A0b)) {
            if (!C20800yB.A01(C21000yV.A02, this.A02, 3461)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0E() {
        if (this.A04.A03() && this.A00.A09(C21100yf.A0b)) {
            if (!C20800yB.A01(C21000yV.A02, this.A02, 1158)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0F() {
        JSONObject A0A = this.A02.A0A(4252);
        if (!A0A.has("buyer_ed_order_content_update_enabled")) {
            return false;
        }
        try {
            if (A0A.getInt("buyer_ed_order_content_update_enabled") == 1) {
                return true;
            }
            return false;
        } catch (JSONException e) {
            Log.e("failed to parse config for ab prop BR_BUYER_ED_CAPABILITIES_CODE#isUpdateOrderContentEnabled", e);
            return false;
        }
    }

    public boolean A0H(AnonymousClass11F r4, String str, String str2) {
        if (!C20800yB.A01(C21000yV.A02, this.A02, 4924) || r4 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str2.equals("GALLERY_QR_CODE") || A08()) {
            return false;
        }
        AnonymousClass185 r1 = this.A00;
        C222813r r0 = UserJid.Companion;
        AnonymousClass3L0 A012 = r1.A01(C222813r.A00(r4));
        if (A012 == null) {
            return false;
        }
        if (A012.A01() || A012.A02()) {
            return true;
        }
        return false;
    }

    public boolean A0J(String str, List list) {
        C20810yC r2 = this.A02;
        if (C20800yB.A01(C21000yV.A02, r2, 3740)) {
            String A09 = r2.A09(3885);
            if (!TextUtils.isEmpty(A09)) {
                List<String> asList = Arrays.asList(A09.split(","));
                for (String append : asList) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("payment_gateway:");
                    sb.append(append);
                    if (sb.toString().equals(str)) {
                        return true;
                    }
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C206909uC r0 = (C206909uC) it.next();
                        B5M b5m = r0.A00;
                        if (b5m != null && r0.A01.equals("payment_gateway")) {
                            return asList.contains(((C21332AHk) b5m).A01);
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean A0K(List list) {
        if (!C20800yB.A01(C21000yV.A02, this.A02, 4295) || list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C206909uC r1 = (C206909uC) it.next();
            if (r1.A00 != null && r1.A01.equals("payment_link")) {
                return true;
            }
        }
        return false;
    }

    public static String A00(AnonymousClass11F r0) {
        String A02 = AnonymousClass3SI.A02(AnonymousClass3U8.A07(r0));
        if (A02 != null) {
            return AnonymousClass1M4.A00(A02);
        }
        return null;
    }

    public int A05(AnonymousClass11F r4) {
        ArrayList arrayList;
        String A002 = A00(r4);
        if (A002 == null) {
            return 2;
        }
        String A09 = this.A02.A09(3690);
        if (!TextUtils.isEmpty(A09)) {
            arrayList = new ArrayList(Arrays.asList(A09.split(",")));
        } else {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(A002)) {
                return 1;
            }
        }
        return 2;
    }

    public int A06(UserJid userJid) {
        AnonymousClass3L0 A012;
        boolean z;
        String A07 = AnonymousClass3U8.A07(userJid);
        AnonymousClass185 r1 = this.A00;
        AnonymousClass3L0 A013 = r1.A01(userJid);
        if ((A013 == null || !A013.A02()) && ((A012 = r1.A01(userJid)) == null || !A012.A01())) {
            z = false;
        } else {
            z = true;
        }
        C24601Db r3 = this.A03;
        if (!r3.A03().getBoolean("pref_dogfooding_enabled", false) || r3.A03().getBoolean("pref_mocking_enabled", false)) {
            String A02 = AnonymousClass3SI.A02(A07);
            Set<C202159l8> set = (Set) C56422wG.A00.get(C202159l8.A01(A02));
            C24631De r4 = this.A04;
            C202159l8 A022 = r4.A02();
            if (set == null || A022 == null) {
                return 1;
            }
            for (C202159l8 r0 : set) {
                if (r0.A03.equals(A022.A03)) {
                    r4.A02();
                    if (z && "91".equals(A02)) {
                        if (C20800yB.A01(C21000yV.A02, this.A02, 5415)) {
                            return 2;
                        }
                        return 1;
                    }
                }
            }
            return 1;
        }
        return 2;
    }

    public boolean A09() {
        if (A0B()) {
            if (!C20800yB.A01(C21000yV.A02, this.A02, 1746)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0G() {
        if (!A02()) {
            return false;
        }
        C24601Db r3 = this.A03;
        if (r3.A03().getBoolean("has_p2mlite_account", false) || r3.A03().getBoolean("has_p2mlite_transactions", false)) {
            return true;
        }
        return false;
    }

    public boolean A0I(String str) {
        if (!TextUtils.isEmpty(str)) {
            return A07().containsKey(str);
        }
        return false;
    }
}
