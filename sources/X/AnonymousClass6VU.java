package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6VU  reason: invalid class name */
public abstract class AnonymousClass6VU {
    public String A00;
    public String A01;
    public final C19700wN A02;
    public final C159487jR A03;
    public final C1265464l A04;
    public final C132406Tm A05;
    public final C132446Tt A06 = new C106945Ly(this);
    public final C19770wU A07;
    public final AnonymousClass7fQ A08;

    public static void A03(AnonymousClass6VU r13) {
        int i;
        int i2;
        AnonymousClass6VU r8 = r13;
        if ((r13 instanceof C1043959n) || !(((C1044059o) r8) instanceof AnonymousClass518)) {
            C36331k8.A1F(r13.A06, r13.A07);
            return;
        }
        C122545v1 r3 = new C122545v1();
        try {
            C1265464l r9 = r13.A04;
            String str = AnonymousClass6JD.A0M;
            String str2 = AnonymousClass6JD.A09;
            JSONObject A0A = r13.A0A();
            String A082 = r8.A08();
            C1259461y r7 = new C1259461y(r8, r3);
            if (!r9.A01.A09()) {
                i = -1;
                i2 = 2;
            } else if (TextUtils.isEmpty(A0A.toString())) {
                i = 3;
                i2 = 1;
            } else {
                AnonymousClass54K r2 = r9.A02;
                C1266664y r6 = new C1266664y(r7, r8, r9, str, str2, A082, A0A);
                synchronized (r2) {
                    if (C132946Vx.A02()) {
                        r2.A00();
                        r6.A00();
                    } else {
                        synchronized (AnonymousClass1BY.class) {
                            if (!C132946Vx.A02()) {
                                C132946Vx.A00(r2.A00.A00).addOnCompleteListener(new C141556nR(r2, r6));
                            } else {
                                r2.A00();
                                r6.A00();
                            }
                        }
                    }
                }
                return;
            }
            r7.A00(new AnonymousClass6KG(i, i2));
        } catch (Exception e) {
            if (e instanceof JSONException) {
                r8.A02.A0E("GraphApiACSNetworkRequest/startCronetRequest: Error while generating the JSON: ", e.getMessage(), true);
            } else {
                Log.e("GraphApiACSNetworkRequest/startCronetRequest: generic error - ", e);
            }
            r8.A0E(C90484aE.A0k(e));
            r3.A00 = 3;
            C36341k9.A0H().post(new C81193wc(r8, r3, 46));
        }
    }

    public static void A02(C119215pS r3, AbstractMap abstractMap) {
        if (r3 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page_id", r3.A01);
            jSONObject.put("page_size", r3.A00);
            abstractMap.put("pagination", jSONObject);
        }
    }

    public static void A04(AnonymousClass6VU r8, C122545v1 r9) {
        C123295wG r1;
        C159487jR r4 = r8.A03;
        if (r4 != null) {
            int i = r9.A00;
            if (i == 0) {
                Object obj = r9.A03;
                if (obj != null) {
                    r4.onSuccess(obj);
                } else {
                    r8.A02.A0E("GraphApiACSNetworkRequest/postNetworkResult: Null response content", (String) null, true);
                }
            } else {
                C1261662u r12 = r9.A01;
                if (r12 == null) {
                    r12 = new C1261662u((Integer) null, (String) null, 10);
                }
                r4.BWx(r12, i);
                if (r9.A00 != 4 && (r1 = r9.A02) != null && !(r8 instanceof C1043959n)) {
                    C1044059o r82 = (C1044059o) r8;
                    r82.A02.BOy(r1.A02, r1.A00, r1.A01, r82.A08(), r1.A04, r1.A03, 0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
        r0.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r5 = X.AnonymousClass001.A0E(X.AnonymousClass000.A0p("UnifiedHomeRequest/parseDynamicWidget: widget not supported: ", r7, X.AnonymousClass000.A0u()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A07(org.json.JSONObject r21) {
        /*
            r20 = this;
            r4 = r20
            boolean r0 = r4 instanceof X.AnonymousClass510
            r3 = r21
            if (r0 == 0) goto L_0x0106
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            java.lang.String r1 = "widgets_order"
            org.json.JSONArray r4 = r3.getJSONArray(r1)
            java.lang.String r1 = "widgets"
            org.json.JSONObject r3 = r3.getJSONObject(r1)
            r2 = 0
        L_0x0019:
            int r1 = r4.length()
            if (r2 >= r1) goto L_0x0391
            java.lang.String r7 = r4.getString(r2)
            org.json.JSONObject r6 = r3.getJSONObject(r7)
            java.lang.String r5 = X.C90514aH.A0y(r7)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            int r1 = r5.hashCode()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            switch(r1) {
                case -1049482625: goto L_0x0057;
                case -805635793: goto L_0x0041;
                case 1594529602: goto L_0x0076;
                case 2000104852: goto L_0x0093;
                default: goto L_0x0032;
            }     // Catch:{ UnsupportedOperationException -> 0x00fa }
        L_0x0032:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            java.lang.String r1 = "UnifiedHomeRequest/parseDynamicWidget: widget not supported: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r1, r7, r5)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            java.lang.UnsupportedOperationException r5 = X.AnonymousClass001.A0E(r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
        L_0x0040:
            throw r5     // Catch:{ UnsupportedOperationException -> 0x00fa }
        L_0x0041:
            java.lang.String r1 = "frequently_contacted_biz"
            boolean r1 = r5.equals(r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            if (r1 == 0) goto L_0x0032
            java.lang.String r5 = "max_items"
            r1 = 3
            int r1 = r6.optInt(r5, r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            X.50s r5 = new X.50s     // Catch:{ UnsupportedOperationException -> 0x00fa }
            r5.<init>(r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            goto L_0x00f6
        L_0x0057:
            java.lang.String r1 = "nearby"
            boolean r1 = r5.equals(r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            if (r1 == 0) goto L_0x0032
            java.util.ArrayList r15 = X.AnonymousClass001.A0I()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            java.lang.String r1 = "businesses"
            org.json.JSONArray r7 = r6.getJSONArray(r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            r5 = 0
        L_0x006a:
            int r1 = r7.length()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            if (r5 >= r1) goto L_0x00af
            A05(r15, r7, r5)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            int r5 = r5 + 1
            goto L_0x006a
        L_0x0076:
            java.lang.String r1 = "popular_categories"
            boolean r1 = r5.equals(r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "categories"
            org.json.JSONArray r7 = r6.getJSONArray(r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            if (r7 == 0) goto L_0x008b
            goto L_0x00d6
        L_0x008b:
            java.lang.String r1 = "PopularCategoriesWidget/fromJson categories not found"
            org.json.JSONException r5 = new org.json.JSONException     // Catch:{ UnsupportedOperationException -> 0x00fa }
            r5.<init>(r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            goto L_0x0040
        L_0x0093:
            java.lang.String r1 = "popular_businesses"
            boolean r1 = r5.equals(r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            if (r1 == 0) goto L_0x0032
            r1 = 0
            X.AnonymousClass00C.A0D(r6, r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            java.lang.String r1 = "businesses"
            org.json.JSONArray r7 = r6.getJSONArray(r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            java.util.ArrayList r6 = X.C36411kG.A13(r7)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            int r5 = r7.length()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            r1 = 0
            goto L_0x00e9
        L_0x00af:
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            java.util.ArrayList r16 = X.AnonymousClass001.A0I()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            r8 = 0
            java.lang.String r1 = "csvm_config"
            java.lang.String r9 = ""
            java.lang.String r12 = r6.optString(r1, r9)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            X.6Oz r7 = new X.6Oz     // Catch:{ UnsupportedOperationException -> 0x00fa }
            r7.<init>()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            X.6Du r6 = new X.6Du     // Catch:{ UnsupportedOperationException -> 0x00fa }
            r10 = r9
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            X.50t r5 = new X.50t     // Catch:{ UnsupportedOperationException -> 0x00fa }
            r5.<init>(r6)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            goto L_0x00f6
        L_0x00d6:
            r5 = 0
        L_0x00d7:
            int r1 = r7.length()     // Catch:{ UnsupportedOperationException -> 0x00fa }
            if (r5 >= r1) goto L_0x00e3
            X.AnonymousClass544.A01(r6, r7, r5)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            int r5 = r5 + 1
            goto L_0x00d7
        L_0x00e3:
            X.50v r5 = new X.50v     // Catch:{ UnsupportedOperationException -> 0x00fa }
            r5.<init>(r6)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            goto L_0x00f6
        L_0x00e9:
            if (r1 >= r5) goto L_0x00f1
            A05(r6, r7, r1)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            int r1 = r1 + 1
            goto L_0x00e9
        L_0x00f1:
            X.50u r5 = new X.50u     // Catch:{ UnsupportedOperationException -> 0x00fa }
            r5.<init>(r6)     // Catch:{ UnsupportedOperationException -> 0x00fa }
        L_0x00f6:
            r0.add(r5)     // Catch:{ UnsupportedOperationException -> 0x00fa }
            goto L_0x0102
        L_0x00fa:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0102:
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0106:
            boolean r0 = r4 instanceof X.AnonymousClass513
            if (r0 == 0) goto L_0x014e
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "popular_categories"
            org.json.JSONArray r4 = r3.getJSONArray(r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            if (r4 == 0) goto L_0x0146
            r1 = 0
        L_0x011b:
            int r0 = r4.length()
            if (r1 >= r0) goto L_0x0127
            X.AnonymousClass544.A01(r2, r4, r1)
            int r1 = r1 + 1
            goto L_0x011b
        L_0x0127:
            X.50v r0 = new X.50v
            r0.<init>(r2)
            r5.add(r0)
            java.lang.String r0 = "popular_biz"
            org.json.JSONArray r3 = r3.getJSONArray(r0)
            java.util.ArrayList r2 = X.C36341k9.A0l(r3)
            int r1 = r3.length()
            r0 = 0
        L_0x013e:
            if (r0 >= r1) goto L_0x022f
            A05(r2, r3, r0)
            int r0 = r0 + 1
            goto L_0x013e
        L_0x0146:
            java.lang.String r1 = "PopularCategoriesWidget/fromJson categories not found"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x014e:
            boolean r0 = r4 instanceof X.AnonymousClass512
            if (r0 == 0) goto L_0x017f
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            java.lang.String r0 = "tiles"
            org.json.JSONArray r4 = r3.getJSONArray(r0)
            r3 = 0
        L_0x015d:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x0179
            org.json.JSONObject r2 = r4.getJSONObject(r3)
            java.lang.String r0 = "tile_id"
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "imprecise_location_tile_level"
            int r0 = r2.getInt(r0)
            X.C36341k9.A1K(r1, r5, r0)
            int r3 = r3 + 1
            goto L_0x015d
        L_0x0179:
            X.5lB r0 = new X.5lB
            r0.<init>(r5)
            return r0
        L_0x017f:
            boolean r0 = r4 instanceof X.AnonymousClass515
            if (r0 == 0) goto L_0x01ef
            java.util.LinkedHashMap r7 = X.C36431kI.A1G()
            java.lang.String r0 = "business_profiles"
            org.json.JSONArray r8 = r3.getJSONArray(r0)
            int r6 = r8.length()
            r5 = 0
        L_0x0192:
            if (r5 >= r6) goto L_0x01ee
            org.json.JSONObject r9 = r8.getJSONObject(r5)
            java.lang.String r0 = "full_details"
            org.json.JSONObject r0 = r9.optJSONObject(r0)
            if (r0 == 0) goto L_0x01eb
            X.6s9 r4 = X.C144416s9.A01(r0)
            java.lang.String r0 = "description"
            java.lang.String r0 = r9.optString(r0)
            r4.A04 = r0
            java.lang.String r0 = "product_images"
            org.json.JSONArray r3 = r9.optJSONArray(r0)
            if (r3 == 0) goto L_0x01c6
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            int r1 = r3.length()
            r0 = 0
        L_0x01bd:
            if (r0 >= r1) goto L_0x01c4
            int r0 = X.C90484aE.A0E(r2, r3, r0)
            goto L_0x01bd
        L_0x01c4:
            r4.A06 = r2
        L_0x01c6:
            java.lang.String r0 = "post_images"
            org.json.JSONArray r3 = r9.optJSONArray(r0)
            if (r3 == 0) goto L_0x01e0
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            int r1 = r3.length()
            r0 = 0
        L_0x01d7:
            if (r0 >= r1) goto L_0x01de
            int r0 = X.C90484aE.A0E(r2, r3, r0)
            goto L_0x01d7
        L_0x01de:
            r4.A05 = r2
        L_0x01e0:
            r0 = 1
            r4.A01 = r0
            java.lang.String r0 = r4.A0E
            X.AnonymousClass00C.A07(r0)
            r7.put(r0, r4)
        L_0x01eb:
            int r5 = r5 + 1
            goto L_0x0192
        L_0x01ee:
            return r7
        L_0x01ef:
            boolean r0 = r4 instanceof X.AnonymousClass511
            if (r0 == 0) goto L_0x0238
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "categories"
            org.json.JSONArray r4 = r3.getJSONArray(r0)
            r3 = 0
        L_0x01fe:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x0237
            org.json.JSONObject r1 = r4.getJSONObject(r3)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getString(r0)
            X.C18740tg.A05(r2)
            X.AnonymousClass00C.A08(r2)
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.getString(r0)
            X.C18740tg.A05(r1)
            X.AnonymousClass00C.A08(r1)
            X.6bw r0 = new X.6bw
            r0.<init>(r2, r1)
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x01fe
        L_0x022f:
            X.50u r0 = new X.50u
            r0.<init>(r2)
            r5.add(r0)
        L_0x0237:
            return r5
        L_0x0238:
            boolean r0 = r4 instanceof X.AnonymousClass518
            if (r0 == 0) goto L_0x02f9
            X.518 r4 = (X.AnonymousClass518) r4
            java.util.ArrayList r15 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "categories"
            org.json.JSONArray r2 = r3.getJSONArray(r0)
            r8 = 0
            r1 = 0
        L_0x024a:
            int r0 = r2.length()
            if (r1 >= r0) goto L_0x0256
            X.AnonymousClass544.A01(r15, r2, r1)
            int r1 = r1 + 1
            goto L_0x024a
        L_0x0256:
            java.lang.String r0 = "request_id"
            java.lang.String r12 = r3.optString(r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "businesses"
            org.json.JSONArray r5 = r3.getJSONArray(r0)
            r1 = 0
        L_0x0267:
            int r0 = r5.length()
            if (r1 >= r0) goto L_0x0272
            int r1 = X.AnonymousClass517.A00(r12, r2, r5, r1)
            goto L_0x0267
        L_0x0272:
            java.lang.String r0 = "suggested_queries"
            org.json.JSONArray r7 = r3.optJSONArray(r0)
            r6 = 0
            if (r7 == 0) goto L_0x0290
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            r1 = 0
        L_0x0280:
            int r0 = r7.length()
            if (r1 >= r0) goto L_0x0291
            java.lang.String r0 = r7.getString(r1)
            r5.add(r0)
            int r1 = r1 + 1
            goto L_0x0280
        L_0x0290:
            r5 = r6
        L_0x0291:
            java.lang.String r0 = "alternative_queries"
            org.json.JSONArray r7 = r3.optJSONArray(r0)
            if (r7 == 0) goto L_0x02ae
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            r1 = 0
        L_0x029e:
            int r0 = r7.length()
            if (r1 >= r0) goto L_0x02ae
            java.lang.String r0 = r7.getString(r1)
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x029e
        L_0x02ae:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "filter_categories"
            org.json.JSONArray r7 = r3.optJSONArray(r0)
            if (r7 == 0) goto L_0x02c6
        L_0x02ba:
            int r0 = r7.length()
            if (r8 >= r0) goto L_0x02c6
            X.AnonymousClass544.A01(r1, r7, r8)
            int r8 = r8 + 1
            goto L_0x02ba
        L_0x02c6:
            java.lang.String r0 = "proximity_weight"
            java.lang.Double r8 = X.C90504aG.A0b(r0, r3)
            java.lang.String r0 = "ranking_logic_ver"
            java.lang.String r13 = r3.optString(r0)
            java.lang.String r0 = "page_id"
            java.lang.String r9 = r3.optString(r0)
            java.lang.String r0 = "csvm_config"
            java.lang.String r14 = r3.getString(r0)
            java.util.ArrayList r16 = X.AnonymousClass001.A0I()
            X.6P1 r7 = new X.6P1
            r7.<init>(r5, r6)
            java.lang.String r10 = r4.A07
            java.lang.String r11 = r4.A08
            int r0 = r4.A01
            X.5yw r6 = new X.5yw
            r19 = r0
            r18 = r1
            r17 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r6
        L_0x02f9:
            boolean r0 = r4 instanceof X.AnonymousClass516
            if (r0 == 0) goto L_0x0392
            X.516 r4 = (X.AnonymousClass516) r4
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "request_id"
            java.lang.String r6 = r3.optString(r0)
            java.lang.String r0 = "business_profiles"
            org.json.JSONArray r2 = r3.getJSONArray(r0)
            r10 = 0
            r1 = 0
        L_0x0311:
            int r0 = r2.length()
            if (r1 >= r0) goto L_0x031c
            int r1 = X.AnonymousClass517.A00(r6, r7, r2, r1)
            goto L_0x0311
        L_0x031c:
            r0 = 0
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            X.0yC r8 = r4.A03
            r4 = 3400(0xd48, float:4.764E-42)
            boolean r4 = r8.A0E(r4)
            r12 = 0
            if (r4 == 0) goto L_0x035e
            java.lang.String r4 = "filter_categories"
            org.json.JSONArray r11 = r3.optJSONArray(r4)
            java.lang.String r4 = "subcategories"
            org.json.JSONArray r9 = r3.optJSONArray(r4)
            if (r9 == 0) goto L_0x0350
            r8 = 0
        L_0x0344:
            int r4 = r9.length()
            if (r8 >= r4) goto L_0x0350
            X.AnonymousClass544.A01(r5, r9, r8)
            int r8 = r8 + 1
            goto L_0x0344
        L_0x0350:
            if (r11 == 0) goto L_0x0360
        L_0x0352:
            int r4 = r11.length()
            if (r10 >= r4) goto L_0x0360
            X.AnonymousClass544.A01(r2, r11, r10)
            int r10 = r10 + 1
            goto L_0x0352
        L_0x035e:
            r10 = r12
            goto L_0x0376
        L_0x0360:
            java.lang.String r4 = "proximity_weight"
            double r0 = r3.optDouble(r4, r0)
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "ranking_logic_ver"
            java.lang.String r12 = r3.optString(r0)
            java.lang.String r0 = "page_id"
            java.lang.String r10 = r3.optString(r0)
        L_0x0376:
            java.lang.String r0 = "csvm_config"
            java.lang.String r13 = r3.getString(r0)
            java.util.ArrayList r15 = X.AnonymousClass001.A0I()
            X.6Oz r8 = new X.6Oz
            r8.<init>()
            X.6Du r0 = new X.6Du
            r14 = r5
            r16 = r7
            r17 = r2
            r7 = r0
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0391:
            return r0
        L_0x0392:
            boolean r0 = r4 instanceof X.AnonymousClass514
            if (r0 == 0) goto L_0x03fb
            java.lang.String r0 = "business_profiles"
            org.json.JSONArray r11 = r3.getJSONArray(r0)
            java.util.LinkedHashMap r10 = X.C36431kI.A1G()
            int r9 = r11.length()
            r8 = 0
        L_0x03a5:
            if (r8 >= r9) goto L_0x03fa
            org.json.JSONObject r1 = r11.getJSONObject(r8)
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "jid"
            java.lang.String r12 = r1.getString(r0)
            java.lang.String r0 = "description"
            java.lang.String r7 = r1.optString(r0)
            java.lang.String r0 = "product_images"
            org.json.JSONArray r6 = r1.optJSONArray(r0)
            java.lang.String r0 = "post_images"
            org.json.JSONArray r5 = r1.optJSONArray(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r2 = 0
            if (r5 == 0) goto L_0x03dd
            int r1 = r5.length()
            r0 = 0
        L_0x03d6:
            if (r0 >= r1) goto L_0x03dd
            int r0 = X.C90484aE.A0E(r3, r5, r0)
            goto L_0x03d6
        L_0x03dd:
            if (r6 == 0) goto L_0x03ea
            int r0 = r6.length()
        L_0x03e3:
            if (r2 >= r0) goto L_0x03ea
            int r2 = X.C90484aE.A0E(r4, r6, r2)
            goto L_0x03e3
        L_0x03ea:
            X.AnonymousClass00C.A0B(r12)
            X.6CB r1 = new X.6CB
            r1.<init>(r12, r7, r3, r4)
            java.lang.String r0 = r1.A00
            r10.put(r0, r1)
            int r8 = r8 + 1
            goto L_0x03a5
        L_0x03fa:
            return r10
        L_0x03fb:
            boolean r0 = r4 instanceof X.AnonymousClass5DN
            if (r0 == 0) goto L_0x0428
            X.64n r5 = new X.64n
            r5.<init>()
            java.lang.String r0 = "businesses"
            java.util.ArrayList r4 = X.C36341k9.A0l(r3)
            org.json.JSONArray r2 = r3.getJSONArray(r0)
            X.AnonymousClass00C.A08(r2)
            int r1 = r2.length()
            r0 = 0
        L_0x0416:
            if (r0 >= r1) goto L_0x041e
            A05(r4, r2, r0)
            int r0 = r0 + 1
            goto L_0x0416
        L_0x041e:
            r5.A04 = r4
            r0 = 4
            r5.A00 = r0
            X.5yw r0 = r5.A00()
            return r0
        L_0x0428:
            boolean r0 = r4 instanceof X.AnonymousClass5DO
            if (r0 == 0) goto L_0x050a
            X.5DO r4 = (X.AnonymousClass5DO) r4
            r5 = 0
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "biz_categories"
            org.json.JSONArray r10 = r3.optJSONArray(r0)
            r11 = 0
            if (r10 == 0) goto L_0x0482
            int r9 = r10.length()
            r8 = 0
        L_0x0441:
            if (r8 >= r9) goto L_0x0482
            org.json.JSONObject r13 = r10.getJSONObject(r8)
            X.AnonymousClass00C.A08(r13)
            java.lang.String r0 = "id"
            java.lang.String r7 = r13.getString(r0)
            X.C18740tg.A05(r7)
            X.AnonymousClass00C.A08(r7)
            java.lang.String r0 = "name"
            java.lang.String r6 = r13.getString(r0)
            X.C18740tg.A05(r6)
            X.AnonymousClass00C.A08(r6)
            java.lang.String r1 = "icon_url"
            java.lang.String r0 = ""
            java.lang.String r2 = r13.optString(r1, r0)
            java.lang.String r0 = "num_of_biz"
            int r0 = r13.optInt(r0)
            X.AnonymousClass00C.A0B(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.543 r0 = new X.543
            r0.<init>(r1, r7, r6, r2)
            r12.add(r0)
            int r8 = r8 + 1
            goto L_0x0441
        L_0x0482:
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "popular_biz"
            org.json.JSONArray r2 = r3.optJSONArray(r0)
            if (r2 == 0) goto L_0x049b
            int r1 = r2.length()
            r0 = 0
        L_0x0493:
            if (r0 >= r1) goto L_0x049b
            A05(r10, r2, r0)
            int r0 = r0 + 1
            goto L_0x0493
        L_0x049b:
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            org.json.JSONArray r4 = r4.A02
            if (r4 == 0) goto L_0x0504
            int r0 = r4.length()
            X.0mZ r0 = X.C15040mb.A05(r5, r0)
            X.0tV r2 = X.C90514aH.A0X(r0)
            X.7S4 r1 = new X.7S4
            r1.<init>(r4)
            X.0if r0 = new X.0if
            r0.<init>(r1, r2)
            java.util.List r0 = X.C15060md.A00(r0)
            java.lang.String[] r13 = X.C36431kI.A1b(r0)
            int r8 = r13.length
        L_0x04c2:
            if (r11 >= r8) goto L_0x0504
            r7 = r13[r11]
            org.json.JSONObject r1 = r3.optJSONObject(r7)
            if (r1 == 0) goto L_0x0501
            r0 = 1
            X.AnonymousClass00C.A0D(r7, r0)
            java.lang.String r0 = "browsable_category"
            java.lang.String r6 = r1.getString(r0)
            java.lang.String r0 = "list_name"
            java.lang.String r5 = r1.getString(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "businesses"
            org.json.JSONArray r2 = r1.getJSONArray(r0)
            int r1 = r2.length()
            r0 = 0
        L_0x04eb:
            if (r0 >= r1) goto L_0x04f3
            A05(r4, r2, r0)
            int r0 = r0 + 1
            goto L_0x04eb
        L_0x04f3:
            X.AnonymousClass00C.A0B(r6)
            X.AnonymousClass00C.A0B(r5)
            X.6CA r0 = new X.6CA
            r0.<init>(r6, r5, r7, r4)
            r9.add(r0)
        L_0x0501:
            int r11 = r11 + 1
            goto L_0x04c2
        L_0x0504:
            X.6BE r0 = new X.6BE
            r0.<init>(r10, r12, r9)
            return r0
        L_0x050a:
            X.5DP r4 = (X.AnonymousClass5DP) r4
            java.lang.String r0 = "businesses"
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            org.json.JSONArray r2 = r3.getJSONArray(r0)
            X.AnonymousClass00C.A08(r2)
            int r1 = r2.length()
            r0 = 0
        L_0x051e:
            if (r0 >= r1) goto L_0x0526
            A05(r5, r2, r0)
            int r0 = r0 + 1
            goto L_0x051e
        L_0x0526:
            java.lang.String r2 = r4.A03
            java.lang.String r0 = "search_by_category"
            boolean r0 = r0.equals(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0537
            java.lang.String r0 = "page_id"
            java.lang.String r1 = r3.optString(r0, r1)
        L_0x0537:
            X.6BF r0 = new X.6BF
            r0.<init>(r2, r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VU.A07(org.json.JSONObject):java.lang.Object");
    }

    public String A08() {
        if (this instanceof AnonymousClass510) {
            return "unified_home";
        }
        if (this instanceof AnonymousClass513) {
            return "home";
        }
        if (this instanceof AnonymousClass512) {
            return "imprecise_location_tile";
        }
        if (this instanceof AnonymousClass515) {
            return "business_info";
        }
        if (this instanceof AnonymousClass511) {
            return "categories";
        }
        if (this instanceof AnonymousClass518) {
            return "query";
        }
        if (this instanceof AnonymousClass516) {
            return "recommendations";
        }
        if (this instanceof AnonymousClass517) {
            return "businesses";
        }
        if (this instanceof AnonymousClass514) {
            return "cached_data";
        }
        if (this instanceof AnonymousClass5DN) {
            return "query";
        }
        if (this instanceof AnonymousClass5DO) {
            return "home";
        }
        return "businesses";
    }

    public Map A09() {
        HashMap hashMap;
        JSONObject jSONObject;
        C20810yC r1;
        int i;
        HashMap A0J;
        Object A002;
        String str;
        String str2;
        HashMap A0J2;
        Object A09;
        String str3;
        HashMap A0J3;
        String str4;
        String str5;
        String A092;
        String str6;
        Object obj;
        String str7;
        String str8;
        Double d;
        Double d2;
        Object obj2;
        String str9;
        String str10;
        String str11;
        Double d3;
        Double d4;
        if (this instanceof AnonymousClass510) {
            AnonymousClass510 r2 = (AnonymousClass510) this;
            HashMap A0J4 = AnonymousClass001.A0J();
            A0J4.put("module_config_ver", r2.A02.A09(4385));
            A0J4.put("flavour", "DIRECTORY");
            if (AnonymousClass000.A0X(r2.A01.A00).densityDpi <= 240) {
                str11 = "hdpi";
            } else {
                str11 = "xxhdpi";
            }
            A0J4.put("icon_spec", str11);
            A0J4.put("country_code", AnonymousClass3N5.A00(r2.A03.A00));
            AnonymousClass6QG r3 = r2.A00;
            String str12 = r3.A08;
            A0J4.put("location_type", str12);
            if (!str12.equals("country_default")) {
                boolean A052 = r3.A05();
                if (A052) {
                    d3 = r3.A03;
                } else {
                    d3 = r3.A01;
                }
                A0J4.put("latitude", d3);
                if (A052) {
                    d4 = r3.A04;
                } else {
                    d4 = r3.A02;
                }
                A0J4.put("longitude", d4);
                A0J4.put("radius", r3.A05);
            }
            return A0J4;
        }
        if (this instanceof AnonymousClass513) {
            AnonymousClass513 r32 = (AnonymousClass513) this;
            A0J2 = AnonymousClass001.A0J();
            AnonymousClass6QG r5 = r32.A01;
            String str13 = r5.A08;
            A0J2.put("location_type", str13);
            if (str13.equals("country_default")) {
                obj2 = r5.A06;
                C18740tg.A06(obj2);
                str9 = "country_code";
            } else {
                boolean A053 = r5.A05();
                if (A053) {
                    d = r5.A03;
                } else {
                    d = r5.A01;
                }
                A0J2.put("wa_biz_directory_lat", d);
                if (A053) {
                    d2 = r5.A04;
                } else {
                    d2 = r5.A02;
                }
                A0J2.put("wa_biz_directory_long", d2);
                obj2 = r5.A05;
                str9 = "radius";
            }
            A0J2.put(str9, obj2);
            C20810yC r6 = r32.A02;
            A0J2.put("ranking_logic_ver", r6.A09(2878));
            ArrayList A0I = AnonymousClass001.A0I();
            if (r32.A00 <= 240) {
                str10 = "hdpi";
            } else {
                str10 = "xxhdpi";
            }
            A0J2.put("screen_res", str10);
            C123375wO r12 = new C123375wO("popular_categories");
            r12.A00 = str10;
            r12.A01 = "screen_res";
            r12.A02 = r6.A09(4040);
            A0I.add(r12);
            if (r6.A0E(3161)) {
                C123375wO r13 = new C123375wO("popular_biz");
                r13.A02 = r6.A09(3173);
                A0I.add(r13);
            }
            A09 = C111165bq.A00(A0I);
            str3 = "module_config";
        } else {
            if (this instanceof AnonymousClass512) {
                AnonymousClass512 r52 = (AnonymousClass512) this;
                A0J = AnonymousClass001.A0J();
                JSONObject A1B = C36441kJ.A1B();
                LatLng latLng = r52.A01;
                A1B.put("wa_biz_directory_lat", latLng.A00);
                A1B.put("wa_biz_directory_long", latLng.A01);
                A0J.put("location", A1B);
                A002 = Integer.valueOf(r52.A00);
                str = "max_tiles";
            } else {
                if (this instanceof AnonymousClass515) {
                    AnonymousClass515 r53 = (AnonymousClass515) this;
                    hashMap = AnonymousClass001.A0J();
                    JSONArray A0u = C90524aI.A0u();
                    Iterator it = r53.A03.iterator();
                    while (it.hasNext()) {
                        A06(hashMap, it, A0u);
                    }
                    jSONObject = C36441kJ.A1B();
                    jSONObject.put("requested_fields", A0u);
                    JSONArray A0u2 = C90524aI.A0u();
                    for (Object put : r53.A02) {
                        A0u2.put(put);
                    }
                    String str14 = r53.A01;
                    if (str14 != null) {
                        hashMap.put("request_query", str14);
                    }
                    String A093 = r53.A00.A09(4384);
                    if (A093 != null) {
                        hashMap.put("experiment_ver", A093);
                    }
                    hashMap.put("business_ids", A0u2);
                } else {
                    if (this instanceof AnonymousClass511) {
                        A0J3 = AnonymousClass001.A0J();
                        C1044059o.A01(((AnonymousClass511) this).A00, A0J3);
                        obj = C36371kC.A0m();
                        str7 = "tiered_onboarding_supported";
                    } else if (this instanceof AnonymousClass518) {
                        AnonymousClass518 r33 = (AnonymousClass518) this;
                        A0J3 = AnonymousClass001.A0J();
                        C1044059o.A01(r33.A04, A0J3);
                        A0J3.put("query", r33.A06);
                        int i2 = r33.A01;
                        if (i2 == 1) {
                            str5 = "typeahead_category";
                        } else if (i2 != 2) {
                            str5 = null;
                        } else {
                            str5 = "typeahead_business";
                        }
                        A0J3.put("search_type", str5);
                        boolean z = r33.A0B;
                        A0J3.put("business_load_all", Boolean.valueOf(z));
                        A0J3.put("search_by_business_enabled", Boolean.valueOf(r33.A0A));
                        C20810yC r4 = r33.A05;
                        if (z) {
                            A092 = r4.A09(1413);
                            str6 = "ranking_logic_ver";
                        } else {
                            A092 = r4.A09(3440);
                            str6 = "typeahead_experiment_ver";
                        }
                        A0J3.put(str6, A092);
                        A0J3.put("tiered_onboarding_supported", C36371kC.A0m());
                        A02(r33.A02, A0J3);
                        if (r4.A0E(3250)) {
                            if (r33.A00 <= 240) {
                                str8 = "hdpi";
                            } else {
                                str8 = "xxhdpi";
                            }
                            A0J3.put("category_icons_resolution", str8);
                        }
                        C1260462i r0 = r33.A03;
                        if (r0 != null) {
                            A0J3.put("filters", r0.A00());
                        }
                        String str15 = r33.A09;
                        if (str15 != null) {
                            A0J3.put("search_session_id", str15);
                        }
                        A0J3.put("query_id", r33.A07);
                        obj = r33.A08;
                        str7 = "search_id";
                    } else {
                        if (this instanceof AnonymousClass516) {
                            AnonymousClass516 r34 = (AnonymousClass516) this;
                            A0J3 = AnonymousClass001.A0J();
                            A0J3.put("business_jid", r34.A04.getRawString());
                            C20810yC r14 = r34.A03;
                            if (r14.A0E(3400)) {
                                A0J3.put("ranking_logic_ver", r14.A09(3399));
                                AnonymousClass6QG r02 = r34.A02;
                                if (r02 != null) {
                                    C1044059o.A01(r02, A0J3);
                                }
                                C1260462i r03 = r34.A01;
                                if (r03 != null) {
                                    A0J3.put("filters", r03.A00());
                                }
                                A02(r34.A00, A0J3);
                                return A0J3;
                            }
                        } else if (this instanceof AnonymousClass517) {
                            AnonymousClass517 r35 = (AnonymousClass517) this;
                            A0J3 = AnonymousClass001.A0J();
                            C1044059o.A01(r35.A05, A0J3);
                            C134986bw r04 = r35.A06;
                            if (r04 != null) {
                                A0J3.put("category_id", r04.A00);
                            }
                            A0J3.put("businesses_list_inclusion_level", r35.A00);
                            A0J3.put("subcategories_list_inclusion_level", r35.A01);
                            String str16 = r35.A08;
                            if (str16 != null) {
                                A0J3.put("browse_use_case", str16);
                                if ("map_view_serp".equals(str16)) {
                                    A0J3.put("map_view_config_version", r35.A07.A09(4461));
                                }
                            }
                            A0J3.put("ranking_formula_ver", "linear_weights_v1");
                            A0J3.put("ranking_logic_ver", r35.A07.A09(1412));
                            A0J3.put("tiered_onboarding_supported", C36371kC.A0m());
                            if (r35.A02 <= 240) {
                                str4 = "hdpi";
                            } else {
                                str4 = "xxhdpi";
                            }
                            A0J3.put("category_icons_resolution", str4);
                            C1260462i r05 = r35.A04;
                            if (r05 != null) {
                                A0J3.put("filters", r05.A00());
                            }
                            A02(r35.A03, A0J3);
                            String str17 = r35.A09;
                            if (str17 != null) {
                                A0J3.put("search_session_id", str17);
                                return A0J3;
                            }
                        } else if (this instanceof AnonymousClass514) {
                            AnonymousClass514 r54 = (AnonymousClass514) this;
                            hashMap = AnonymousClass001.A0J();
                            JSONArray A0u3 = C90524aI.A0u();
                            Iterator it2 = r54.A03.iterator();
                            while (it2.hasNext()) {
                                A06(hashMap, it2, A0u3);
                            }
                            jSONObject = C36441kJ.A1B();
                            jSONObject.put("requested_fields", A0u3);
                            hashMap.put("request_id", r54.A01);
                            String str18 = r54.A02;
                            if (str18 != null && r54.A00.A0E(3225)) {
                                hashMap.put("request_query", str18);
                            }
                            String A094 = r54.A00.A09(3226);
                            if (A094 != null) {
                                hashMap.put("experiment_ver", A094);
                            }
                        } else if (this instanceof AnonymousClass5DN) {
                            AnonymousClass5DN r36 = (AnonymousClass5DN) this;
                            A0J2 = AnonymousClass001.A0J();
                            A0J2.put("query", r36.A01);
                            List list = new C117565mT().A00;
                            list.add("profile_pic");
                            JSONObject A1B2 = C36441kJ.A1B();
                            A1B2.put("requested_fields", new JSONArray(list));
                            A0J2.put("fields_config", A1B2);
                            A09 = r36.A00.A09(2969);
                            str3 = "ranking_logic_ver";
                        } else if (this instanceof AnonymousClass5DO) {
                            AnonymousClass5DO r22 = (AnonymousClass5DO) this;
                            A0J = AnonymousClass001.A0J();
                            ArrayList A0I2 = AnonymousClass001.A0I();
                            C20810yC r55 = r22.A01;
                            if (r55.A0E(2270)) {
                                C123375wO r37 = new C123375wO("biz_categories");
                                if (r22.A00 <= 240) {
                                    str2 = "hdpi";
                                } else {
                                    str2 = "xxhdpi";
                                }
                                r37.A00 = str2;
                                r37.A01 = "icon_spec";
                                r37.A02 = r55.A09(3111);
                                A0I2.add(r37);
                            }
                            if (r55.A0E(2948)) {
                                C123375wO r15 = new C123375wO("popular_biz");
                                r15.A02 = r55.A09(2970);
                                A0I2.add(r15);
                            }
                            JSONArray jSONArray = r22.A02;
                            if (jSONArray != null) {
                                for (String r06 : C36431kI.A1b(C15060md.A00(new C12790if(new AnonymousClass7S3(jSONArray), C90514aH.A0X(C15040mb.A05(0, jSONArray.length())))))) {
                                    C123375wO r16 = new C123375wO(r06);
                                    r16.A03 = "ENTERPRISE";
                                    r16.A02 = r55.A09(4312);
                                    A0I2.add(r16);
                                }
                            }
                            A002 = C111165bq.A00(A0I2);
                            str = "module_config";
                        } else {
                            AnonymousClass5DP r56 = (AnonymousClass5DP) this;
                            HashMap A0J5 = AnonymousClass001.A0J();
                            C134986bw r07 = r56.A00;
                            if (r07 != null) {
                                A0J5.put("category_id", r07.A00);
                            }
                            AnonymousClass6AS r38 = r56.A02;
                            if (r38 != null) {
                                JSONObject A1B3 = C36441kJ.A1B();
                                A1B3.put("page_size", r38.A00);
                                A1B3.put("page_id", r38.A01);
                                A0J5.put("pagination", A1B3);
                            }
                            List list2 = new C117565mT().A00;
                            list2.add("profile_pic");
                            JSONObject A1B4 = C36441kJ.A1B();
                            A1B4.put("requested_fields", new JSONArray(list2));
                            A0J5.put("fields_config", A1B4);
                            String str19 = r56.A03;
                            A0J5.put("use_case", str19);
                            if (AnonymousClass00C.A0J(str19, "search_by_category")) {
                                r1 = r56.A01;
                                i = 2968;
                            } else if (AnonymousClass00C.A0J(str19, "popular_biz")) {
                                r1 = r56.A01;
                                i = 2970;
                            } else {
                                C36321k7.A1P("BusinessApiBusinessesListRequest/getInternalParams unknown search use case ", str19, AnonymousClass000.A0u());
                                return A0J5;
                            }
                            A0J5.put("ranking_logic_ver", r1.A09(i));
                            return A0J5;
                        }
                        return A0J3;
                    }
                    A0J3.put(str7, obj);
                    return A0J3;
                }
                hashMap.put("fields_config", jSONObject);
                return hashMap;
            }
            A0J.put(str, A002);
            return A0J;
        }
        A0J2.put(str3, A09);
        return A0J2;
    }

    public JSONObject A0A() {
        JSONObject jSONObject;
        if (this instanceof C1043959n) {
            C1043959n r2 = (C1043959n) this;
            jSONObject = C36441kJ.A1B();
            String A002 = AnonymousClass3N5.A00(r2.A01.A00);
            String A0y = C36381kD.A0y(new Locale(r2.A00.A06(), A002));
            if ("in_ID".equalsIgnoreCase(A0y)) {
                A0y = "id_ID";
            } else if ("en".equalsIgnoreCase(A0y)) {
                A0y = "en_US";
            } else if ("iw_IL".equalsIgnoreCase(A0y)) {
                A0y = "he_IL";
            } else if ("ES".equalsIgnoreCase(A0y)) {
                A0y = "es_ES";
            }
            jSONObject.put("locale", A0y);
            jSONObject.put("country_code", A002);
            if (!TextUtils.isEmpty(r2.A01)) {
                jSONObject.put("credential", r2.A01);
            }
            jSONObject.put("version", "1.0");
            Iterator A0y2 = AnonymousClass000.A0y(r2.A09());
            while (A0y2.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y2);
                jSONObject.put(C90494aF.A0f(A11), A11.getValue());
            }
        } else {
            C1044059o r22 = (C1044059o) this;
            jSONObject = C36441kJ.A1B();
            jSONObject.put("locale", C36401kF.A0x(r22.A03).toString());
            jSONObject.put("version", r22.A00);
            if (!TextUtils.isEmpty(r22.A01)) {
                jSONObject.put("credential", r22.A01);
            }
            Iterator A0y3 = AnonymousClass000.A0y(r22.A09());
            while (A0y3.hasNext()) {
                Map.Entry A112 = AnonymousClass000.A11(A0y3);
                jSONObject.put(C90494aF.A0f(A112), A112.getValue());
            }
        }
        return jSONObject;
    }

    public void A0B() {
        C132406Tm r4 = this.A05;
        if (r4 != null) {
            Integer num = r4.A00;
            if (num != null) {
                C132406Tm.A01(r4, num, "graphapi_request_start");
            } else {
                r4.A03.markerPoint(r4.A02, C132406Tm.A00("graphapi_request_start", r4.A02()));
            }
        }
        this.A08.B7m((C124405y8) null, this, this.A00);
    }

    public void A0C(int i) {
        String str;
        if (!C36431kI.A1Y(this.A06)) {
            C159487jR r4 = this.A03;
            if (r4 != null) {
                if (i == 4) {
                    r4.BWx(new C1261662u((Integer) null, (String) null, 0), -1);
                } else {
                    A03(this);
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (!(this instanceof C1043959n)) {
                ((C1044059o) this).A02.BOY(valueOf, (Integer) null);
            } else if (valueOf != null && valueOf.intValue() != 4) {
                C19700wN r3 = this.A02;
                JSONObject A1B = C36441kJ.A1B();
                try {
                    A1B.put("error_code", valueOf);
                } catch (JSONException e) {
                    e.getMessage();
                } catch (Throwable unused) {
                    str = A1B.toString();
                }
                str = A1B.toString();
                r3.A0E("BusinessApiSearchNetworkRequest/onAcsError", str, false);
            }
        }
    }

    public void A0D(C122545v1 r8, AnonymousClass6KG r9) {
        JSONObject optJSONObject;
        Integer num;
        Integer num2;
        String str;
        String str2;
        int i = r9.A01;
        if (i == -1 || i == 3) {
            r8.A00 = i;
            r8.A01 = new C1261662u(Integer.valueOf(i), (String) null, r9.A00);
        } else if (i / 100 == 2) {
            JSONObject jSONObject = r9.A02;
            if (jSONObject != null) {
                r8.A03 = A07(jSONObject);
                r8.A00 = 0;
                return;
            }
            this.A02.A0E("GraphApiACSNetworkRequest/parseNetworkResponse: cannot parse empty response from server", "", true);
            r8.A01 = new C1261662u(Integer.valueOf(i), (String) null, 4);
            r8.A00 = 1;
        } else if (i == 410) {
            r8.A01 = new C1261662u(Integer.valueOf(i), (String) null, 5);
            r8.A00 = 4;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GraphApiACSNetworkRequest/parseNetworkResponse Request has failed with code ");
            A0u.append(i);
            C36321k7.A1Z(A0u, "");
            r8.A00 = 2;
            Integer valueOf = Integer.valueOf(i);
            r8.A01 = new C1261662u(valueOf, (String) null, 9);
            C123295wG r2 = new C123295wG(valueOf);
            JSONObject jSONObject2 = r9.A02;
            if (!(jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("error")) == null)) {
                if (optJSONObject.has("code")) {
                    num = Integer.valueOf(optJSONObject.optInt("code"));
                } else {
                    num = null;
                }
                r2.A00 = num;
                if (optJSONObject.has("error_subcode")) {
                    num2 = Integer.valueOf(optJSONObject.optInt("error_subcode"));
                } else {
                    num2 = null;
                }
                r2.A01 = num2;
                if (optJSONObject.has("message")) {
                    str = optJSONObject.optString("message");
                } else {
                    str = null;
                }
                r2.A04 = str;
                if (optJSONObject.has("fbtrace_id")) {
                    str2 = optJSONObject.optString("fbtrace_id");
                } else {
                    str2 = null;
                }
                r2.A03 = str2;
            }
            r8.A02 = r2;
        }
    }

    public void A0E(String str) {
        if (!(this instanceof C1043959n)) {
            C1044059o r0 = (C1044059o) this;
            r0.A02.BOy((Integer) null, (Integer) null, (Integer) null, r0.A08(), str, (String) null, 0);
        }
    }

    public AnonymousClass6VU(C19700wN r3, AnonymousClass7fQ r4, C159487jR r5, C1265464l r6, C132406Tm r7, C19770wU r8, String str) {
        this.A02 = r3;
        this.A07 = r8;
        this.A04 = r6;
        this.A08 = r4;
        this.A03 = r5;
        this.A00 = str;
        this.A05 = r7;
        if (r7 != null) {
            r7.A01 = A08();
        }
    }

    public static void A05(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        abstractCollection.add(C144416s9.A01(jSONArray.getJSONObject(i)));
    }

    public static void A06(AbstractMap abstractMap, Iterator it, JSONArray jSONArray) {
        String str;
        C125335zk r2 = (C125335zk) it.next();
        boolean z = r2 instanceof C1026250x;
        if (z) {
            str = "product_images";
        } else if (r2 instanceof C1026450z) {
            str = "description";
        } else if (r2 instanceof C1026150w) {
            str = "post_images";
        } else {
            str = "full_details";
        }
        jSONArray.put(str);
        if (z) {
            C1026250x r22 = (C1026250x) r2;
            abstractMap.put("product_image_width", Integer.valueOf(r22.A01));
            abstractMap.put("product_image_height", Integer.valueOf(r22.A00));
        }
    }
}
