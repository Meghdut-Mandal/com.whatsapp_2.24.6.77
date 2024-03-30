package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6uv  reason: invalid class name and case insensitive filesystem */
public abstract class C146036uv implements C159497jS {
    public String A00 = "";
    public final long A01;
    public final C19420v0 A02;
    public final C20810yC A03;
    public final String A04;
    public final C20050ww A05;
    public final AnonymousClass1WF A06;
    public final AnonymousClass005 A07;
    public final Map A08;
    public final AnonymousClass004 A09;
    public final AnonymousClass004 A0A;

    public String A02() {
        int i;
        if (this instanceof AnonymousClass5AY) {
            return C36391kE.A0y("%sfacebook.com", Locale.ENGLISH, new Object[]{""}, 1);
        } else if (this instanceof C1024950f) {
            if (((C1024950f) this).A00 == null) {
                return null;
            }
            AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
            return null;
        } else if (this instanceof AnonymousClass5AW) {
            String string = C36341k9.A0E(this.A02).getString("pref_fb_graphql_domain", "facebook.com");
            AnonymousClass00C.A08(string);
            return string;
        } else {
            if (this instanceof AnonymousClass5PA) {
                i = ((AnonymousClass5PA) this).A00;
            } else if (!(this instanceof AnonymousClass5P9)) {
                return null;
            } else {
                i = ((AnonymousClass5P9) this).A00;
            }
            if (i == 0) {
                return "facebook.com";
            }
            return "instagram.com";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.5AX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: X.5Ac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: X.5AX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: X.5AX} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A03() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass5AY
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3 instanceof X.AnonymousClass5AQ
            if (r0 == 0) goto L_0x0016
            r1 = r3
            X.5AQ r1 = (X.AnonymousClass5AQ) r1
            boolean r0 = r1 instanceof X.AnonymousClass5PB
            if (r0 != 0) goto L_0x0064
            X.0wt r0 = r1.A00
        L_0x0011:
            java.lang.String r0 = r0.A03()
            return r0
        L_0x0016:
            boolean r0 = r3 instanceof X.C104535Ab
            if (r0 != 0) goto L_0x0061
            boolean r0 = r3 instanceof X.C104545Ac
            if (r0 == 0) goto L_0x002c
            r0 = r3
            X.5Ac r0 = (X.C104545Ac) r0
            X.0wt r2 = r0.A03
        L_0x0023:
            java.util.HashMap r0 = r0.A06()
        L_0x0027:
            java.lang.String r0 = r2.A04(r0)
            return r0
        L_0x002c:
            boolean r0 = r3 instanceof X.AnonymousClass5AZ
            if (r0 != 0) goto L_0x0061
            boolean r0 = r3 instanceof X.AnonymousClass5AV
            if (r0 != 0) goto L_0x0061
            boolean r0 = r3 instanceof X.AnonymousClass5AX
            if (r0 == 0) goto L_0x003e
            r0 = r3
            X.5AX r0 = (X.AnonymousClass5AX) r0
            X.0wt r2 = r0.A00
            goto L_0x0023
        L_0x003e:
            boolean r0 = r3 instanceof X.C104555Ad
            if (r0 == 0) goto L_0x005f
            r1 = r3
            X.5Ad r1 = (X.C104555Ad) r1
            boolean r0 = r1 instanceof X.C1024950f
            if (r0 != 0) goto L_0x0061
            boolean r0 = r1 instanceof X.C1024550b
            if (r0 != 0) goto L_0x0061
            boolean r0 = r1 instanceof X.AnonymousClass50Z
            if (r0 != 0) goto L_0x0061
            boolean r0 = r1 instanceof X.C1024650c
            if (r0 == 0) goto L_0x0058
            X.0wt r0 = r1.A00
            goto L_0x0011
        L_0x0058:
            X.0wt r2 = r1.A00
            java.util.HashMap r0 = r1.A06()
            goto L_0x0027
        L_0x005f:
            r0 = 0
            return r0
        L_0x0061:
            java.lang.String r0 = ""
            return r0
        L_0x0064:
            java.lang.String r0 = "WhatsApp"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146036uv.A03():java.lang.String");
    }

    public final HashMap A06() {
        C20810yC r1 = this.A03;
        HashMap A0J = AnonymousClass001.A0J();
        try {
            JSONObject A1C = C36441kJ.A1C(C36431kI.A19(r1, 2014));
            Iterator<String> keys = A1C.keys();
            AnonymousClass00C.A08(keys);
            while (keys.hasNext()) {
                String A0C = AnonymousClass001.A0C(keys);
                JSONArray jSONArray = A1C.getJSONArray(A0C);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    AnonymousClass00C.A08(string);
                    AnonymousClass00C.A0B(A0C);
                    A0J.put(string, A0C);
                }
            }
        } catch (JSONException e) {
            C36321k7.A1J(e, "GraphqlRequestBase/getLocaleFallbackMap/failed to parse locale fallback map from JSON/", AnonymousClass000.A0u());
        }
        return A0J;
    }

    public final void A07(String str) {
        if (!AnonymousClass098.A07(str, "/", false)) {
            str = C90464aC.A0f(str, AnonymousClass000.A0u(), '/');
        }
        this.A00 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:255:0x082e, code lost:
        if (r0 != null) goto L_0x0830;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(org.json.JSONObject r12) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C107675Qk
            if (r0 == 0) goto L_0x00a5
            r3 = r11
            X.5Qk r3 = (X.C107675Qk) r3
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            org.json.JSONArray r7 = X.C90524aI.A0u()
            org.json.JSONArray r6 = X.C90524aI.A0u()
            java.util.List r9 = r3.A03
            java.util.Iterator r10 = r9.iterator()
        L_0x0019:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r10.next()
            X.6Ap r1 = (X.C128036Ap) r1
            int r0 = r1.A00
            r7.put(r0)
            X.6bk r8 = r1.A01
            X.1UJ r5 = r3.A00
            java.lang.String r4 = "XFAM_CROSSPOSTING_ELIGIBILITY_GQL"
            r1 = 2
            X.AnonymousClass00C.A0D(r5, r1)
            X.7OO r0 = new X.7OO
            r0.<init>(r8, r4)
            java.lang.Object r1 = X.C131886Rd.A00(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x004f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r5.A00(r1)
        L_0x004b:
            r6.put(r0)
            goto L_0x0019
        L_0x004f:
            java.lang.String r0 = "0"
            goto L_0x004b
        L_0x0052:
            int r1 = r9.size()
            java.lang.String r0 = "whatsapp_status_unique_fbids_count"
            r2.put(r0, r1)
            java.lang.String r0 = "whatsapp_status_object_expiration_time"
            r2.put(r0, r7)
            java.lang.String r0 = "whatsapp_status_unique_fbids"
            r2.put(r0, r6)
            X.77f r1 = r3.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x009e
            byte[] r0 = r1.A02
            java.lang.String r1 = X.C90504aG.A0o(r0)
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "purpose_client_pub_key"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "session_id"
            r2.put(r0, r1)
            java.lang.String r1 = "wa_device_os"
            java.lang.String r0 = "android"
            r2.put(r1, r0)
            java.lang.String r1 = "2.24.6.77"
            java.util.Objects.requireNonNull(r1)
            java.lang.String r0 = "wa_mobile_app_version"
            org.json.JSONObject r1 = X.C90484aE.A0x(r1, r0, r2)
            java.lang.String r0 = "input_params"
            X.AnonymousClass5AN.A00(r2, r0, r1, r12)
            return
        L_0x009e:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00a5:
            boolean r0 = r11 instanceof X.C107665Qj
            if (r0 == 0) goto L_0x011a
            r5 = r11
            X.5Qj r5 = (X.C107665Qj) r5
            org.json.JSONObject r3 = X.C90464aC.A0q(r12)
            org.json.JSONArray r4 = X.C90524aI.A0u()
            java.util.List r0 = r5.A02
            java.util.Iterator r9 = r0.iterator()
        L_0x00ba:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x094a
            java.lang.Object r6 = r9.next()
            X.6D6 r6 = (X.AnonymousClass6D6) r6
            X.1UJ r8 = r5.A00
            X.C36321k7.A0w(r6, r8)
            X.6bk r7 = r6.A00
            java.lang.String r2 = "XFAM_CROSSPOSTING_REQUEST_GQL"
            r1 = 2
            X.7OO r0 = new X.7OO
            r0.<init>(r7, r2)
            java.lang.Object r1 = X.C131886Rd.A00(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0118
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0118
            java.lang.String r2 = r8.A00(r1)
        L_0x00e7:
            org.json.JSONObject r1 = X.C36441kJ.A1B()
            java.lang.String r0 = "wa_status_id"
            org.json.JSONObject r2 = r1.put(r0, r2)
            java.lang.String r1 = r6.A04
            java.lang.String r0 = "message"
            org.json.JSONObject r2 = r2.put(r0, r1)
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "link_url"
            org.json.JSONObject r2 = r2.put(r0, r1)
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "media_type"
            org.json.JSONObject r2 = r2.put(r0, r1)
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "media_everstore_direct_path"
            org.json.JSONObject r0 = r2.put(r0, r1)
            X.AnonymousClass00C.A08(r0)
            r4.put(r0)
            goto L_0x00ba
        L_0x0118:
            r2 = 0
            goto L_0x00e7
        L_0x011a:
            boolean r0 = r11 instanceof X.C107655Qi
            if (r0 == 0) goto L_0x0141
            r3 = r11
            X.5Qi r3 = (X.C107655Qi) r3
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            java.lang.String r1 = "app_id"
            java.lang.String r0 = "3402315746664947"
            r2.put(r1, r0)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "request_token"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "blob"
            org.json.JSONObject r1 = X.C90484aE.A0x(r1, r0, r2)
            java.lang.String r0 = "web_auth_params"
            X.AnonymousClass5AN.A00(r2, r0, r1, r12)
            return
        L_0x0141:
            boolean r0 = r11 instanceof X.C107645Qh
            if (r0 == 0) goto L_0x0157
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            java.lang.String r1 = "app_id"
            java.lang.String r0 = "3402315746664947"
            org.json.JSONObject r1 = X.C90484aE.A0x(r0, r1, r2)
            java.lang.String r0 = "input_params"
            X.AnonymousClass5AN.A00(r2, r0, r1, r12)
            return
        L_0x0157:
            boolean r0 = r11 instanceof X.C104525Aa
            if (r0 == 0) goto L_0x022b
            r7 = r11
            X.5Aa r7 = (X.C104525Aa) r7
            r3 = 0
            X.AnonymousClass00C.A0D(r12, r3)
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            java.lang.String r6 = X.AnonymousClass6JD.A0C
            java.lang.String r5 = "app_id"
            r2.put(r5, r6)
            java.lang.String r1 = "name"
            java.lang.String r0 = "mobile_uitracker_events"
            org.json.JSONObject r4 = X.C90484aE.A0x(r0, r1, r2)
            X.6Mr r0 = r7.A00
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getCacheDir()
            java.lang.String r0 = "wds_metrics"
            java.io.File r1 = X.C36441kJ.A0w(r1, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0194
            X.720 r0 = new X.720
            r0.<init>()
            java.io.File[] r10 = r1.listFiles(r0)
            if (r10 != 0) goto L_0x0196
        L_0x0194:
            java.io.File[] r10 = new java.io.File[r3]
        L_0x0196:
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            int r8 = r10.length
            r7 = 0
        L_0x019c:
            if (r7 >= r8) goto L_0x01bc
            r0 = r10[r7]
            byte[] r2 = X.AnonymousClass14R.A00(r0)     // Catch:{ IOException -> 0x01af }
            X.AnonymousClass00C.A08(r2)     // Catch:{ IOException -> 0x01af }
            java.nio.charset.Charset r1 = X.AnonymousClass0S4.A05     // Catch:{ IOException -> 0x01af }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x01af }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x01af }
            goto L_0x01b6
        L_0x01af:
            r1 = move-exception
            java.lang.String r0 = "FileUtils/readFile/ioerror"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x01b9
        L_0x01b6:
            r9.add(r0)
        L_0x01b9:
            int r7 = r7 + 1
            goto L_0x019c
        L_0x01bc:
            org.json.JSONArray r2 = X.C90524aI.A0u()
            java.util.Iterator r1 = r9.iterator()
        L_0x01c4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01d6
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)
            r2.put(r0)
            goto L_0x01c4
        L_0x01d6:
            java.lang.String r0 = "batches"
            org.json.JSONObject r2 = X.C90484aE.A0x(r2, r0, r4)
            java.lang.String r1 = "2.24.6.77"
            java.util.Objects.requireNonNull(r1)
            java.lang.String r0 = "app_ver"
            r2.put(r0, r1)
            r2.put(r5, r6)
            java.lang.String r1 = "config_version"
            java.lang.String r0 = "v2"
            r2.put(r1, r0)
            java.lang.String r0 = "config"
            org.json.JSONObject r2 = X.C90484aE.A0x(r2, r0, r4)
            java.lang.String r1 = "channel"
            java.lang.String r0 = "unified_micro_batch"
            r2.put(r1, r0)
            java.lang.String r0 = "request_info"
            java.lang.String r1 = X.C90484aE.A0l(r2, r0, r4)
            java.lang.String r0 = "message"
            r12.put(r0, r1)
            java.lang.String r1 = "format"
            java.lang.String r0 = "json"
            r12.put(r1, r0)
            java.lang.String r1 = "multi_batch"
            r0 = 1
            r12.put(r1, r0)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "system_uptime"
            r12.put(r0, r1)
            java.lang.String r0 = "requestType"
            r12.put(r0, r3)
            java.lang.String r1 = "sdk"
            java.lang.String r0 = "android"
            r12.put(r1, r0)
            return
        L_0x022b:
            boolean r0 = r11 instanceof X.C104535Ab
            if (r0 == 0) goto L_0x02d6
            r4 = r11
            X.5Ab r4 = (X.C104535Ab) r4
            org.json.JSONObject r3 = X.C36441kJ.A1B()
            java.lang.String r7 = r4.A00
            java.lang.String r1 = "AesKey="
            r6 = 2
            r0 = 0
            boolean r0 = X.AnonymousClass098.A07(r7, r1, r0)
            if (r0 == 0) goto L_0x029c
            java.lang.String r0 = ";IV="
            r2 = 0
            int r1 = X.AnonymousClass099.A0C(r7, r0, r2, r2)
            if (r1 <= 0) goto L_0x029c
            java.lang.String r0 = ";Data="
            int r5 = X.AnonymousClass099.A0C(r7, r0, r2, r2)
            if (r5 <= 0) goto L_0x029c
            r0 = 7
            java.lang.String r2 = X.C36431kI.A16(r0, r1, r7)
            int r0 = r1 + 4
            java.lang.String r1 = X.C36431kI.A16(r0, r5, r7)
            int r0 = r5 + 6
            java.lang.String r0 = X.C90494aF.A0d(r7, r0)
            byte[] r5 = android.util.Base64.decode(r2, r6)
            byte[] r1 = android.util.Base64.decode(r1, r6)
            byte[] r0 = android.util.Base64.decode(r0, r6)
            if (r5 == 0) goto L_0x029c
            if (r1 == 0) goto L_0x029c
            if (r0 == 0) goto L_0x029c
            X.5tL r2 = new X.5tL
            r2.<init>(r5, r0, r1)
            byte[] r0 = r2.A00
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "encrypted_flow_data"
            r3.put(r0, r1)
            byte[] r0 = r2.A01
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "encrypted_aes_key"
            r3.put(r0, r1)
            byte[] r0 = r2.A02
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)
            java.lang.String r0 = "initial_vector"
            r3.put(r0, r1)
        L_0x029c:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02ae
            java.lang.String r0 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02cc
        L_0x02ae:
            java.lang.String r2 = "extension_id"
            java.lang.String r0 = r4.A01     // Catch:{ NumberFormatException -> 0x02bd }
            X.C18740tg.A06(r0)     // Catch:{ NumberFormatException -> 0x02bd }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x02bd }
            r3.put(r2, r0)     // Catch:{ NumberFormatException -> 0x02bd }
            goto L_0x02cc
        L_0x02bd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsDataExchangeGraphqlRequest/addVersionSpecificVariables: Exception when parsing extensionId:"
            r1.append(r0)
            java.lang.String r0 = r4.A01
            X.C36351kA.A1P(r0, r1, r2)
        L_0x02cc:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "variables"
            r12.put(r0, r1)
            return
        L_0x02d6:
            boolean r0 = r11 instanceof X.AnonymousClass5AU
            if (r0 == 0) goto L_0x039d
            r4 = r11
            X.5AU r4 = (X.AnonymousClass5AU) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            X.0yC r6 = r4.A03
            r0 = 3231(0xc9f, float:4.528E-42)
            java.lang.String r1 = r6.A09(r0)
            if (r1 == 0) goto L_0x0323
            boolean r0 = X.AnonymousClass098.A06(r1)
            if (r0 != 0) goto L_0x0323
        L_0x02f1:
            org.json.JSONObject r3 = X.C36441kJ.A1B()
            java.lang.String r0 = "sticker_pack"
            r3.put(r0, r1)
            boolean r1 = r4.A05
            java.lang.String r0 = "default_pack"
            r3.put(r0, r1)
            java.util.Set r1 = r4.A04
            boolean r0 = X.C90514aH.A1a(r1)
            if (r0 == 0) goto L_0x032b
            org.json.JSONArray r2 = X.C90524aI.A0u()
            java.util.Iterator r1 = r1.iterator()
        L_0x0311:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0326
            java.lang.Object r0 = r1.next()
            X.690 r0 = (X.AnonymousClass690) r0
            java.lang.String r0 = r0.A00
            r2.put(r0)
            goto L_0x0311
        L_0x0323:
            java.lang.String r1 = "v5_stickers"
            goto L_0x02f1
        L_0x0326:
            java.lang.String r0 = "stable_ids"
            r3.put(r0, r2)
        L_0x032b:
            X.5TK r0 = r4.A00
            java.lang.String r1 = r0.value
            java.lang.String r0 = "request_type"
            r3.put(r0, r1)
            X.1Bv r0 = r4.A01
            X.0yC r5 = r0.A00
            r0 = 5979(0x175b, float:8.378E-42)
            boolean r2 = r5.A0E(r0)
            X.0k2 r1 = new X.0k2
            r1.<init>()
            java.lang.String r0 = "expresso"
            r1.add(r0)
            if (r2 == 0) goto L_0x034f
            java.lang.String r0 = "SOCIAL_STICKERS"
            r1.add(r0)
        L_0x034f:
            r0 = 7949(0x1f0d, float:1.1139E-41)
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x035c
            java.lang.String r0 = "squidF"
            r1.add(r0)
        L_0x035c:
            X.0k2 r2 = X.AnonymousClass03S.A00(r1)
            boolean r0 = X.C36411kG.A1a(r2)
            if (r0 == 0) goto L_0x0370
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r2)
            java.lang.String r0 = "experiments"
            r3.put(r0, r1)
        L_0x0370:
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x0379
            java.lang.String r0 = "revision_id"
            r3.put(r0, r1)
        L_0x0379:
            r0 = 5979(0x175b, float:8.378E-42)
            boolean r0 = r5.A0E(r0)
            if (r0 == 0) goto L_0x0393
            java.util.List r2 = r4.A03
            boolean r0 = X.C36401kF.A1a(r2)
            if (r0 == 0) goto L_0x0393
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r2)
            java.lang.String r0 = "social_avatar_users"
            r3.put(r0, r1)
        L_0x0393:
            org.json.JSONObject r1 = X.C36441kJ.A1B()
            java.lang.String r0 = "params"
            X.AnonymousClass5AN.A00(r3, r0, r1, r12)
            return
        L_0x039d:
            boolean r0 = r11 instanceof X.AnonymousClass5AM
            if (r0 == 0) goto L_0x03d5
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            X.0k2 r1 = new X.0k2
            r1.<init>()
            java.lang.String r0 = "expresso"
            r1.add(r0)
            X.0k2 r3 = X.AnonymousClass03S.A00(r1)
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            java.lang.String r1 = "default_pack"
            r0 = 1
            r2.put(r1, r0)
            java.lang.String r1 = "sticker_pack"
            java.lang.String r0 = "v4_profile_photos"
            r2.put(r1, r0)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r3)
            java.lang.String r0 = "experiments"
            org.json.JSONObject r1 = X.C90484aE.A0x(r1, r0, r2)
            java.lang.String r0 = "params"
            X.AnonymousClass5AN.A00(r2, r0, r1, r12)
            return
        L_0x03d5:
            boolean r0 = r11 instanceof X.AnonymousClass5AL
            if (r0 == 0) goto L_0x03ed
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            java.lang.String r1 = "version"
            r0 = 1
            r2.put(r1, r0)
            org.json.JSONObject r1 = X.C36441kJ.A1B()
            java.lang.String r0 = "params"
            X.AnonymousClass5AN.A00(r2, r0, r1, r12)
            return
        L_0x03ed:
            boolean r0 = r11 instanceof X.AnonymousClass5AK
            if (r0 != 0) goto L_0x096d
            boolean r0 = r11 instanceof X.AnonymousClass5AW
            if (r0 != 0) goto L_0x096d
            boolean r0 = r11 instanceof X.AnonymousClass5AT
            if (r0 == 0) goto L_0x0442
            r4 = r11
            X.5AT r4 = (X.AnonymousClass5AT) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            org.json.JSONArray r3 = X.C90524aI.A0u()
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "name"
            r2.put(r0, r1)
            int r1 = r4.A00
            java.lang.String r0 = "version"
            r2.put(r0, r1)
            org.json.JSONArray r3 = r3.put(r2)
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            org.json.JSONArray r1 = X.C90524aI.A0u()
            java.lang.String r0 = "bytecodeVersion"
            r2.put(r0, r1)
            org.json.JSONArray r1 = X.C90524aI.A0u()
            java.lang.String r0 = "NONE"
            org.json.JSONArray r1 = r1.put(r0)
            java.lang.String r0 = "supportedCompressions"
            org.json.JSONObject r1 = X.C90484aE.A0x(r1, r0, r2)
            java.lang.String r0 = "model_request_metadatas"
            r1.put(r0, r3)
            java.lang.String r0 = "client_capability_metadata"
            X.AnonymousClass5AN.A00(r2, r0, r1, r12)
            return
        L_0x0442:
            boolean r0 = r11 instanceof X.C104545Ac
            if (r0 == 0) goto L_0x04aa
            r0 = r11
            X.5Ac r0 = (X.C104545Ac) r0
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            X.6Da r4 = r0.A04
            com.whatsapp.jid.UserJid r0 = r4.A03
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "wa_business_jid"
            org.json.JSONObject r5 = X.C90484aE.A0x(r1, r0, r2)
            int r1 = r4.A01
            java.lang.String r0 = "height"
            r5.put(r0, r1)
            int r1 = r4.A02
            java.lang.String r0 = "width"
            r5.put(r0, r1)
            org.json.JSONObject r3 = X.C36441kJ.A1B()
            r1 = 12
            java.lang.String r0 = "limit"
            r3.put(r0, r1)
            java.lang.String r0 = "image_dimensions"
            org.json.JSONObject r1 = X.C90484aE.A0x(r5, r0, r3)
            java.lang.String r0 = "posts"
            r1.put(r0, r3)
            int r0 = r4.A00
            if (r0 != 0) goto L_0x04a7
            java.lang.String r0 = "linked_fb_page"
        L_0x0485:
            r2.put(r0, r1)
            boolean r1 = r4.A06
            java.lang.String r0 = "filter_sensitive_content"
            r2.put(r0, r1)
            boolean r1 = r4.A05
            java.lang.String r0 = "filter_ineligible_posts"
            r2.put(r0, r1)
            boolean r1 = r4.A04
            java.lang.String r0 = "is_trust_card"
            r2.put(r0, r1)
            org.json.JSONObject r1 = X.C36441kJ.A1B()
            java.lang.String r0 = "request"
            X.AnonymousClass5AN.A00(r2, r0, r1, r12)
            return
        L_0x04a7:
            java.lang.String r0 = "linked_ig_professional"
            goto L_0x0485
        L_0x04aa:
            boolean r0 = r11 instanceof X.AnonymousClass5AP
            if (r0 == 0) goto L_0x04da
            r2 = r11
            X.5AP r2 = (X.AnonymousClass5AP) r2
            org.json.JSONObject r3 = X.C90464aC.A0q(r12)
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "prompt"
            r3.put(r0, r1)
            X.0yC r2 = r2.A03
            r0 = 4889(0x1319, float:6.851E-42)
            boolean r1 = r2.A0E(r0)
            java.lang.String r0 = "include_animated"
            r3.put(r0, r1)
            r0 = 6469(0x1945, float:9.065E-42)
            int r1 = r2.A07(r0)
            java.lang.String r0 = "version"
            r3.put(r0, r1)
            java.lang.String r0 = "variables"
            r12.put(r0, r3)
            return
        L_0x04da:
            boolean r0 = r11 instanceof X.AnonymousClass5AZ
            if (r0 == 0) goto L_0x051e
            r7 = r11
            X.5AZ r7 = (X.AnonymousClass5AZ) r7
            org.json.JSONObject r6 = X.C90464aC.A0q(r12)
            org.json.JSONObject r5 = X.C36441kJ.A1B()
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "biz_jid"
            r5.put(r0, r1)
            long r3 = r7.A00
            r1 = 6712734982081747(0x17d93268140cd3, double:3.316531744283347E-308)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0506
            java.lang.String r1 = r7.A02
            if (r1 != 0) goto L_0x0501
            java.lang.Object r1 = org.json.JSONObject.NULL
        L_0x0501:
            java.lang.String r0 = "flow_id"
            r5.put(r0, r1)
        L_0x0506:
            org.json.JSONObject r1 = X.C36441kJ.A1B()
            java.lang.String r0 = "extensions"
            r1.put(r0, r5)
            java.lang.String r0 = "request"
            r6.put(r0, r1)
            java.lang.String r1 = X.C36381kD.A0y(r6)
            java.lang.String r0 = "variables"
            r12.put(r0, r1)
            return
        L_0x051e:
            boolean r0 = r11 instanceof X.AnonymousClass5AV
            if (r0 != 0) goto L_0x096d
            boolean r0 = r11 instanceof X.AnonymousClass5AS
            if (r0 == 0) goto L_0x0540
            r3 = r11
            X.5AS r3 = (X.AnonymousClass5AS) r3
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "query"
            r2.put(r0, r1)
            X.0ts r0 = r3.A00
            java.lang.String r1 = r0.A08()
            java.lang.String r0 = "locale"
            X.AnonymousClass5AN.A00(r1, r0, r2, r12)
            return
        L_0x0540:
            boolean r0 = r11 instanceof X.AnonymousClass5AO
            if (r0 == 0) goto L_0x0557
            r0 = r11
            X.5AO r0 = (X.AnonymousClass5AO) r0
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            X.0ts r0 = r0.A00
            java.lang.String r1 = r0.A08()
            java.lang.String r0 = "locale"
            X.AnonymousClass5AN.A00(r1, r0, r2, r12)
            return
        L_0x0557:
            boolean r0 = r11 instanceof X.AnonymousClass5AJ
            if (r0 == 0) goto L_0x0567
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "device_model"
            X.AnonymousClass5AN.A00(r1, r0, r2, r12)
            return
        L_0x0567:
            boolean r0 = r11 instanceof X.AnonymousClass51j
            if (r0 == 0) goto L_0x0580
            r0 = r11
            X.51j r0 = (X.AnonymousClass51j) r0
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "country_code"
            org.json.JSONObject r1 = X.C90484aE.A0x(r1, r0, r2)
            java.lang.String r0 = "args"
            X.AnonymousClass5AN.A00(r2, r0, r1, r12)
            return
        L_0x0580:
            boolean r0 = r11 instanceof X.AnonymousClass51i
            if (r0 == 0) goto L_0x0665
            r4 = r11
            X.51i r4 = (X.AnonymousClass51i) r4
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            X.6Df r3 = r4.A00
            java.lang.String r5 = r3.A06
            java.lang.String r0 = "query_type"
            r2.put(r0, r5)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "country_code"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "search_query"
            r2.put(r0, r1)
            X.0yC r4 = r4.A03
            r0 = 5257(0x1489, float:7.367E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x05b3
            java.lang.String r1 = "version"
            java.lang.String r0 = "2.0"
            r2.put(r1, r0)
        L_0x05b3:
            r0 = 5857(0x16e1, float:8.207E-42)
            java.lang.String r1 = r4.A09(r0)
            java.lang.String r0 = "experiment_flag"
            r2.put(r0, r1)
            X.6QG r7 = r3.A00
            boolean r0 = r7.A04()
            if (r0 != 0) goto L_0x0604
            java.lang.String r0 = "business_search"
            boolean r0 = X.AnonymousClass00C.A0J(r5, r0)
            if (r0 == 0) goto L_0x0604
            org.json.JSONObject r5 = X.C36441kJ.A1B()
            boolean r6 = r7.A05()
            if (r6 == 0) goto L_0x0661
            java.lang.Double r1 = r7.A03
        L_0x05da:
            java.lang.String r0 = "latitude"
            r5.put(r0, r1)
            if (r6 == 0) goto L_0x065e
            java.lang.Double r1 = r7.A04
        L_0x05e3:
            java.lang.String r0 = "longitude"
            r5.put(r0, r1)
            boolean r1 = r7.A06()
            java.lang.String r0 = "has_accurate_location"
            r5.put(r0, r1)
            java.lang.Double r1 = r7.A05
            java.lang.String r0 = "radius"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "location_type"
            r5.put(r0, r1)
            java.lang.String r0 = "location"
            r2.put(r0, r5)
        L_0x0604:
            org.json.JSONArray r1 = X.C90524aI.A0u()
            r0 = 7384(0x1cd8, float:1.0347E-41)
            java.lang.String r0 = r4.A09(r0)
            r1.put(r0)
            r0 = 7385(0x1cd9, float:1.0349E-41)
            java.lang.String r0 = r4.A09(r0)
            r1.put(r0)
            r0 = 7386(0x1cda, float:1.035E-41)
            java.lang.String r0 = r4.A09(r0)
            r1.put(r0)
            java.lang.String r0 = "experiment_flags"
            r2.put(r0, r1)
            r0 = 6743(0x1a57, float:9.449E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x063b
            r0 = 6744(0x1a58, float:9.45E-42)
            java.lang.String r1 = r4.A09(r0)
            java.lang.String r0 = "token"
            r2.put(r0, r1)
        L_0x063b:
            boolean r1 = r3.A07
            java.lang.String r0 = "is_test"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "query_id"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "search_id"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A05
            java.lang.String r0 = "search_session_id"
            org.json.JSONObject r1 = X.C90484aE.A0x(r1, r0, r2)
            java.lang.String r0 = "args"
            X.AnonymousClass5AN.A00(r2, r0, r1, r12)
            return
        L_0x065e:
            java.lang.Double r1 = r7.A02
            goto L_0x05e3
        L_0x0661:
            java.lang.Double r1 = r7.A01
            goto L_0x05da
        L_0x0665:
            boolean r0 = r11 instanceof X.AnonymousClass5P7
            if (r0 == 0) goto L_0x0685
            r3 = r11
            X.5P7 r3 = (X.AnonymousClass5P7) r3
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            java.lang.String r1 = "app_id"
            java.lang.String r0 = "dev.app.id"
            r2.put(r1, r0)
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "request_token"
            java.lang.String r1 = X.C90484aE.A0l(r1, r0, r2)
            java.lang.String r0 = "variables"
            r12.put(r0, r1)
            return
        L_0x0685:
            boolean r0 = r11 instanceof X.AnonymousClass5P8
            if (r0 == 0) goto L_0x073d
            r3 = r11
            X.5P8 r3 = (X.AnonymousClass5P8) r3
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            org.json.JSONArray r6 = X.C90524aI.A0u()
            java.util.List r0 = r3.A02
            java.util.Iterator r5 = r0.iterator()
        L_0x069a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x06bc
            java.lang.Object r0 = r5.next()
            X.5Tq r0 = (X.C108475Tq) r0
            org.json.JSONObject r4 = X.C36441kJ.A1B()
            java.lang.String r1 = r0.gqlValue
            java.lang.String r0 = "waffle_xan"
            r4.put(r0, r1)
            java.lang.String r1 = "waffle_xs"
            java.lang.String r0 = "S"
            r4.put(r1, r0)
            r6.put(r4)
            goto L_0x069a
        L_0x06bc:
            java.lang.String r0 = "waffle_xas"
            r2.put(r0, r6)
            java.util.List r4 = r3.A03
            int r1 = r4.size()
            java.lang.String r0 = "waffle_unique_id_count"
            r2.put(r0, r1)
            org.json.JSONArray r6 = X.C90524aI.A0u()
            org.json.JSONArray r5 = X.C90524aI.A0u()
            java.util.Iterator r4 = r4.iterator()
        L_0x06d8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x06f3
            java.lang.Object r1 = r4.next()
            X.6Al r1 = (X.C127996Al) r1
            int r0 = r1.A00
            r6.put(r0)
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L_0x06ef
            java.lang.String r0 = "0"
        L_0x06ef:
            r5.put(r0)
            goto L_0x06d8
        L_0x06f3:
            java.lang.String r0 = "exp_time"
            r2.put(r0, r6)
            java.lang.String r0 = "waffle_unique_ids"
            r2.put(r0, r5)
            X.77e r1 = r3.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0736
            byte[] r0 = r1.A02
            java.lang.String r1 = X.C90504aG.A0o(r0)
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "purpose_client_pub_key"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "session_id"
            r2.put(r0, r1)
            java.lang.String r1 = "wa_device_os"
            java.lang.String r0 = "android"
            r2.put(r1, r0)
            java.lang.String r1 = "2.24.6.77"
            java.util.Objects.requireNonNull(r1)
            java.lang.String r0 = "wa_mobile_app_version"
            org.json.JSONObject r1 = X.C90484aE.A0x(r1, r0, r2)
            java.lang.String r0 = "input_params"
            X.AnonymousClass5AN.A00(r2, r0, r1, r12)
            return
        L_0x0736:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x073d:
            boolean r0 = r11 instanceof X.AnonymousClass5PA
            if (r0 == 0) goto L_0x0758
            r1 = r11
            X.5PA r1 = (X.AnonymousClass5PA) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            int r0 = r1.A00
            if (r0 == 0) goto L_0x096d
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            java.lang.String r1 = r1.A04
            java.lang.String r0 = "ACCESS_TOKEN"
            X.AnonymousClass5AN.A00(r1, r0, r2, r12)
            return
        L_0x0758:
            boolean r0 = r11 instanceof X.AnonymousClass5P6
            if (r0 == 0) goto L_0x0768
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            java.lang.String r1 = "caller_name"
            java.lang.String r0 = "cross_app_creation_wa_crossposting"
            X.AnonymousClass5AN.A00(r0, r1, r2, r12)
            return
        L_0x0768:
            boolean r0 = r11 instanceof X.AnonymousClass5PB
            if (r0 == 0) goto L_0x07ca
            r3 = r11
            X.5PB r3 = (X.AnonymousClass5PB) r3
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            java.lang.String r1 = "b3ee4083bc5153a49b8915306fcb062aac140bd37f9c3c5b42e55d85397fdf0c"
            java.lang.String r0 = "bloks_versioning_id"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "bloks_app_id"
            r2.put(r0, r1)
            java.lang.String r1 = "2.24.6.77"
            java.lang.String r0 = "app_version"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A04()
            java.lang.String r0 = "locale"
            r2.put(r0, r1)
            int r1 = r3.A01
            java.lang.String r0 = "disclosure_id"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "entry_point"
            r2.put(r0, r1)
            boolean r1 = r3.A06
            java.lang.String r0 = "is_paused"
            r2.put(r0, r1)
            int r1 = r3.A00
            r0 = -1
            if (r0 == r1) goto L_0x07b4
            X.5Tq r1 = X.C110595av.A00(r1)
            java.lang.String r0 = "account_type"
            r2.put(r0, r1)
        L_0x07b4:
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "df_token"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x07c4
            java.lang.String r0 = "logging_event"
            r2.put(r0, r1)
        L_0x07c4:
            java.lang.String r0 = "variables"
            r12.put(r0, r2)
            return
        L_0x07ca:
            boolean r0 = r11 instanceof X.AnonymousClass5P9
            if (r0 == 0) goto L_0x07e5
            r1 = r11
            X.5P9 r1 = (X.AnonymousClass5P9) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            int r0 = r1.A00
            if (r0 == 0) goto L_0x096d
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            java.lang.String r1 = r1.A04
            java.lang.String r0 = "ACCESS_TOKEN"
            X.AnonymousClass5AN.A00(r1, r0, r2, r12)
            return
        L_0x07e5:
            boolean r0 = r11 instanceof X.C104555Ad
            if (r0 == 0) goto L_0x085d
            r1 = r11
            X.5Ad r1 = (X.C104555Ad) r1
            boolean r0 = r1 instanceof X.C1024950f
            if (r0 == 0) goto L_0x084c
            X.50f r1 = (X.C1024950f) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            java.util.Map r4 = r1.A01
            java.lang.String r0 = "flow_message_version"
            java.lang.Object r2 = r4.get(r0)
            org.json.JSONObject r3 = X.C36441kJ.A1B()
            java.lang.String r1 = "bloks_version"
            java.lang.String r0 = "b3ee4083bc5153a49b8915306fcb062aac140bd37f9c3c5b42e55d85397fdf0c"
            r3.put(r1, r0)
            java.lang.String r0 = "3"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0845
            r0 = 1
        L_0x0812:
            java.lang.String r1 = "extension_id"
            java.lang.String r2 = "screen_id"
            if (r0 == 0) goto L_0x0839
            java.lang.String r0 = "flow_id"
            java.lang.Object r0 = r4.get(r0)
            r3.put(r1, r0)
            java.lang.String r1 = "business_jid"
            java.lang.Object r0 = r4.get(r1)
            r3.put(r1, r0)
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0833
        L_0x0830:
            r3.put(r2, r0)
        L_0x0833:
            java.lang.String r0 = "variables"
            X.C90504aG.A1J(r3, r0, r12)
            return
        L_0x0839:
            java.lang.Object r0 = r4.get(r1)
            r3.put(r1, r0)
            java.lang.Object r0 = r4.get(r2)
            goto L_0x0830
        L_0x0845:
            java.lang.String r0 = "2"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            goto L_0x0812
        L_0x084c:
            org.json.JSONObject r0 = X.C36441kJ.A1B()
            r1.A09(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "variables"
            r12.put(r0, r1)
            return
        L_0x085d:
            boolean r0 = r11 instanceof X.AnonymousClass5AI
            if (r0 == 0) goto L_0x086d
            org.json.JSONObject r2 = X.C90464aC.A0q(r12)
            java.lang.String r1 = "fc31f4292caeeaa72f54b7e2c74bcca7963280c3"
            java.lang.String r0 = "package_hash"
            X.AnonymousClass5AN.A00(r1, r0, r2, r12)
            return
        L_0x086d:
            r7 = r11
            X.5AR r7 = (X.AnonymousClass5AR) r7
            org.json.JSONObject r4 = X.C90464aC.A0q(r12)
            java.util.List r0 = r7.A01
            java.util.ArrayList r6 = X.C36321k7.A0J(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x087e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x08a0
            java.lang.Object r3 = r5.next()
            X.69Z r3 = (X.AnonymousClass69Z) r3
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "name"
            r2.put(r0, r1)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "version"
            r2.put(r0, r1)
            r6.add(r2)
            goto L_0x087e
        L_0x08a0:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r6)
            java.lang.String r0 = "model_request_metadatas"
            r4.put(r0, r1)
            X.6Ck r5 = r7.A00
            org.json.JSONObject r3 = X.C36441kJ.A1B()
            java.util.List r0 = r5.A00
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r0)
            java.lang.String r0 = "bytecodeVersion"
            r3.put(r0, r1)
            java.util.List r0 = r5.A01
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r0)
            java.lang.String r0 = "cachedModelAssets"
            r3.put(r0, r1)
            java.util.List r0 = r5.A02
            java.util.ArrayList r2 = X.C36351kA.A0z(r0)
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08e2
            r1.next()
            java.lang.String r0 = "getModelName"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x08e2:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r2)
            java.lang.String r0 = "cachedModelMetadatas"
            r3.put(r0, r1)
            java.util.List r0 = r5.A03
            java.util.ArrayList r2 = X.C36351kA.A0z(r0)
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0906
            r1.next()
            java.lang.String r0 = "getName"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0906:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r2)
            java.lang.String r0 = "operators"
            r3.put(r0, r1)
            r1 = 0
            java.lang.String r0 = "operatorsHash"
            r3.put(r0, r1)
            java.util.List r0 = r5.A04
            java.util.ArrayList r2 = X.C36351kA.A0z(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0920:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0934
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r0 = (com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod) r0
            java.lang.String r0 = r0.getCompressionMethod()
            r2.add(r0)
            goto L_0x0920
        L_0x0934:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r2)
            java.lang.String r0 = "supportedCompressions"
            r3.put(r0, r1)
            r1 = 0
            java.lang.String r0 = "vulkan_version"
            r3.put(r0, r1)
            java.lang.String r0 = "client_capability_metadata"
            X.AnonymousClass5AN.A00(r3, r0, r4, r12)
            return
        L_0x094a:
            java.lang.String r0 = "statuses"
            r3.put(r0, r4)
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "session_id"
            r3.put(r0, r1)
            java.lang.String r1 = "wa_device_os"
            java.lang.String r0 = "android"
            r3.put(r1, r0)
            java.lang.String r1 = "2.24.6.77"
            java.util.Objects.requireNonNull(r1)
            java.lang.String r0 = "wa_mobile_app_version"
            org.json.JSONObject r1 = X.C90484aE.A0x(r1, r0, r3)
            java.lang.String r0 = "input_params"
            X.AnonymousClass5AN.A00(r3, r0, r1, r12)
        L_0x096d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146036uv.A08(org.json.JSONObject):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:32|33|34|35|36|37|45|46|47|48|(6:50|(1:52)|53|54|55|56)(3:57|58|59)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:106|107|108|109|(6:111|(1:113)|114|115|116|117)(3:118|119|120)) */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01dc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r4 = new X.AnonymousClass5RE(r4.A05, r9.getErrorStream(), 1, 15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r0 = X.AnonymousClass14X.A01(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f0, code lost:
        if (r0 != null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01f2, code lost:
        r2 = new X.C132286Sy(r0.getJSONObject("error"));
        r1 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01fd, code lost:
        if (r1 != 190) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ff, code lost:
        X.C90464aC.A1M("unknown error: ", X.AnonymousClass000.A0u(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0206, code lost:
        r3.BWk(new X.AnonymousClass5V0(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0211, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0216, code lost:
        throw X.AnonymousClass001.A09("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0219, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x021d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x021e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x021f, code lost:
        r1 = X.AnonymousClass000.A0u();
        r0 = "Failed to parse the error response: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0251, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0252, code lost:
        r1 = X.AnonymousClass000.A0u();
        r0 = "Exception in Decompression: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0258, code lost:
        X.C36321k7.A1J(r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0106, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r4.A03.A0E(539) != false) goto L_0x0020;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x01dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c1 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db A[Catch:{ all -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fb A[SYNTHETIC, Splitter:B:57:0x00fb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Blp(X.C160087kR r21) {
        /*
            r20 = this;
            r4 = r20
            r3 = r21
            java.lang.String r0 = r4.A05()     // Catch:{ MalformedURLException -> 0x024c }
            java.net.URL r8 = X.C90524aI.A0j(r0)     // Catch:{ MalformedURLException -> 0x024c }
            boolean r0 = r4 instanceof X.C104525Aa
            if (r0 == 0) goto L_0x0023
            r0 = 1
        L_0x0011:
            r2 = 1
            if (r0 != 0) goto L_0x0020
            X.0yC r1 = r4.A03
            r0 = 539(0x21b, float:7.55E-43)
            boolean r0 = r1.A0E(r0)
            r19 = 0
            if (r0 == 0) goto L_0x0025
        L_0x0020:
            r19 = 1
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0011
        L_0x0025:
            org.json.JSONObject r7 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            r4.A08(r7)     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            java.lang.String r1 = r4.A04     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = "WA|1015890928915437|3201f239340c1c8ec6262a6dad04200e"
        L_0x0032:
            java.lang.String r0 = "access_token"
            r7.put(r0, r1)     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            long r0 = r4.A01     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            java.lang.String r5 = "doc_id"
            r7.put(r5, r0)     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            java.lang.String r6 = r4.A04()     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            java.lang.String r5 = "lang"
            r7.put(r5, r6)     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            java.lang.String r6 = "Content-Type"
            java.lang.String r5 = "application/json"
            r7.put(r6, r5)     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            java.lang.String r15 = X.C36381kD.A0y(r7)     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            r5 = 22
            android.net.TrafficStats.setThreadStatsTag(r5)     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            X.005 r5 = r4.A07     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            java.lang.Object r12 = r5.get()     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            X.13E r12 = (X.AnonymousClass13E) r12     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            java.lang.String r14 = r8.toString()     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            java.lang.String r16 = r4.A03()     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            boolean r5 = r4 instanceof X.C1024950f     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            if (r5 != 0) goto L_0x0072
            boolean r5 = r4 instanceof X.C1024650c     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            if (r5 != 0) goto L_0x0072
            r18 = 0
            goto L_0x0074
        L_0x0072:
            r18 = 1
        L_0x0074:
            java.util.Map r6 = r4.A08     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            r5 = 15
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            r17 = r6
            X.6v1 r11 = r12.A03(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ JSONException -> 0x023c, IOException -> 0x0237 }
            android.net.TrafficStats.clearThreadStatsTag()
            java.net.HttpURLConnection r9 = r11.A01     // Catch:{ OutOfMemoryError -> 0x0226 }
            java.lang.String r10 = r9.getContentEncoding()     // Catch:{ OutOfMemoryError -> 0x0226 }
            java.lang.String r5 = "unknown error: "
            r7 = 190(0xbe, float:2.66E-43)
            java.lang.String r6 = "error"
            java.lang.String r12 = "Required value was null."
            if (r10 == 0) goto L_0x010f
            int r8 = r10.length()
            if (r8 == 0) goto L_0x010f
            java.lang.String r8 = "gzip"
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x0107
            X.0ww r10 = r4.A05     // Catch:{ Exception -> 0x00c1 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00c1 }
            X.5RE r10 = r11.B8D(r10, r8, r13)     // Catch:{ Exception -> 0x00c1 }
            java.util.zip.GZIPInputStream r8 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x00c1 }
            r8.<init>(r10)     // Catch:{ Exception -> 0x00c1 }
            org.json.JSONObject r15 = X.AnonymousClass14X.A01(r8)     // Catch:{ all -> 0x00ba }
            r8.close()     // Catch:{ Exception -> 0x00c1 }
            goto L_0x0120
        L_0x00ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ Exception -> 0x00c1 }
            throw r0     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            X.0ww r4 = r4.A05     // Catch:{ Exception -> 0x0251 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0251 }
            java.io.InputStream r1 = r9.getErrorStream()     // Catch:{ Exception -> 0x0251 }
            X.5RE r0 = new X.5RE     // Catch:{ Exception -> 0x0251 }
            r0.<init>(r4, r1, r2, r13)     // Catch:{ Exception -> 0x0251 }
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x0251 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0251 }
            org.json.JSONObject r0 = X.AnonymousClass14X.A01(r4)     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00fb
            org.json.JSONObject r0 = r0.getJSONObject(r6)     // Catch:{ all -> 0x0100 }
            X.6Sy r2 = new X.6Sy     // Catch:{ all -> 0x0100 }
            r2.<init>((org.json.JSONObject) r0)     // Catch:{ all -> 0x0100 }
            int r1 = r2.A01     // Catch:{ all -> 0x0100 }
            if (r1 == r7) goto L_0x00ef
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0100 }
            X.C90464aC.A1M(r5, r0, r1)     // Catch:{ all -> 0x0100 }
        L_0x00ef:
            X.5V0 r0 = new X.5V0     // Catch:{ all -> 0x0100 }
            r0.<init>(r2)     // Catch:{ all -> 0x0100 }
            r3.BWk(r0)     // Catch:{ all -> 0x0100 }
            r4.close()     // Catch:{ Exception -> 0x0251 }
            return
        L_0x00fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r12)     // Catch:{ all -> 0x0100 }
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x0100:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ Exception -> 0x0251 }
            throw r0     // Catch:{ Exception -> 0x0251 }
        L_0x0107:
            java.lang.String r0 = "Unknown Content-Encoding sent by server"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A09(r0)
            goto L_0x025b
        L_0x010f:
            X.0ww r10 = r4.A05     // Catch:{ Exception -> 0x01dd }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01dd }
            X.5RE r8 = r11.B8D(r10, r8, r13)     // Catch:{ Exception -> 0x01dd }
            org.json.JSONObject r15 = X.AnonymousClass14X.A01(r8)     // Catch:{ all -> 0x01d6 }
            r8.close()     // Catch:{ Exception -> 0x01dd }
        L_0x0120:
            X.004 r5 = r4.A09
            java.lang.Object r13 = r5.get()
            X.60z r13 = (X.C1257160z) r13
            X.004 r4 = r4.A0A
            java.lang.Object r14 = r4.get()
            X.66O r14 = (X.AnonymousClass66O) r14
            if (r15 == 0) goto L_0x01d1
            int r4 = r9.getContentLength()
            long r4 = (long) r4
            X.5x8 r12 = new X.5x8
            r16 = r4
            r12.<init>(r13, r14, r15, r16)
            r12.A01 = r0
            org.json.JSONObject r1 = r12.A05     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r0 = "errors"
            org.json.JSONArray r8 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x01cc }
            if (r8 == 0) goto L_0x017a
            r12.A00 = r2     // Catch:{ JSONException -> 0x01cc }
            X.66O r7 = r12.A04     // Catch:{ JSONException -> 0x01cc }
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ JSONException -> 0x01cc }
            r7.A00 = r0     // Catch:{ JSONException -> 0x01cc }
            int r6 = r8.length()     // Catch:{ JSONException -> 0x01cc }
            r5 = 0
        L_0x0159:
            if (r5 >= r6) goto L_0x0196
            org.json.JSONObject r4 = r8.getJSONObject(r5)     // Catch:{ JSONException -> 0x01cc }
            X.6Sy r2 = new X.6Sy     // Catch:{ JSONException -> 0x01cc }
            r2.<init>((org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x01cc }
            java.util.Map r1 = r7.A00     // Catch:{ JSONException -> 0x01cc }
            int r0 = r2.A01     // Catch:{ JSONException -> 0x01cc }
            X.C90504aG.A1K(r2, r1, r0)     // Catch:{ JSONException -> 0x01cc }
            X.5AD r2 = new X.5AD     // Catch:{ JSONException -> 0x01cc }
            r2.<init>(r4)     // Catch:{ JSONException -> 0x01cc }
            java.util.Map r1 = r7.A01     // Catch:{ JSONException -> 0x01cc }
            int r0 = r2.A00     // Catch:{ JSONException -> 0x01cc }
            X.C90504aG.A1K(r2, r1, r0)     // Catch:{ JSONException -> 0x01cc }
            int r5 = r5 + 1
            goto L_0x0159
        L_0x017a:
            org.json.JSONObject r4 = r1.optJSONObject(r6)     // Catch:{ JSONException -> 0x01cc }
            if (r4 == 0) goto L_0x019a
            r12.A00 = r2     // Catch:{ JSONException -> 0x01cc }
            X.66O r1 = r12.A04     // Catch:{ JSONException -> 0x01cc }
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ JSONException -> 0x01cc }
            r1.A00 = r0     // Catch:{ JSONException -> 0x01cc }
            X.6Sy r2 = new X.6Sy     // Catch:{ JSONException -> 0x01cc }
            r2.<init>((org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x01cc }
            java.util.Map r1 = r1.A00     // Catch:{ JSONException -> 0x01cc }
            int r0 = r2.A01     // Catch:{ JSONException -> 0x01cc }
            X.C90504aG.A1K(r2, r1, r0)     // Catch:{ JSONException -> 0x01cc }
        L_0x0196:
            r3.B2J(r12)     // Catch:{ JSONException -> 0x01cc }
            goto L_0x01cb
        L_0x019a:
            java.lang.String r0 = "data"
            org.json.JSONObject r5 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x01ab }
            X.60z r4 = r12.A03     // Catch:{ JSONException -> 0x01ab }
            long r0 = r12.A01     // Catch:{ JSONException -> 0x01ab }
            r4.A03(r5, r0)     // Catch:{ JSONException -> 0x01ab }
            r0 = 0
            r12.A00 = r0     // Catch:{ JSONException -> 0x01ab }
            goto L_0x0196
        L_0x01ab:
            r4 = move-exception
            X.66O r5 = r12.A04     // Catch:{ JSONException -> 0x01cc }
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ JSONException -> 0x01cc }
            r5.A00 = r0     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r1 = r4.getMessage()     // Catch:{ JSONException -> 0x01cc }
            java.lang.String r0 = android.util.Log.getStackTraceString(r4)     // Catch:{ JSONException -> 0x01cc }
            X.6Sy r4 = new X.6Sy     // Catch:{ JSONException -> 0x01cc }
            r4.<init>(r1, r0)     // Catch:{ JSONException -> 0x01cc }
            java.util.Map r1 = r5.A00     // Catch:{ JSONException -> 0x01cc }
            r0 = -20
            X.C90504aG.A1K(r4, r1, r0)     // Catch:{ JSONException -> 0x01cc }
            r12.A00 = r2     // Catch:{ JSONException -> 0x01cc }
            goto L_0x0196
        L_0x01cb:
            return
        L_0x01cc:
            r0 = move-exception
            r3.BWk(r0)
            return
        L_0x01d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r12)
            throw r0
        L_0x01d6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01d8 }
        L_0x01d8:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ Exception -> 0x01dd }
            throw r0     // Catch:{ Exception -> 0x01dd }
        L_0x01dd:
            X.0ww r8 = r4.A05     // Catch:{ Exception -> 0x021e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x021e }
            java.io.InputStream r0 = r9.getErrorStream()     // Catch:{ Exception -> 0x021e }
            X.5RE r4 = new X.5RE     // Catch:{ Exception -> 0x021e }
            r4.<init>(r8, r0, r1, r13)     // Catch:{ Exception -> 0x021e }
            org.json.JSONObject r0 = X.AnonymousClass14X.A01(r4)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x0212
            org.json.JSONObject r0 = r0.getJSONObject(r6)     // Catch:{ all -> 0x0217 }
            X.6Sy r2 = new X.6Sy     // Catch:{ all -> 0x0217 }
            r2.<init>((org.json.JSONObject) r0)     // Catch:{ all -> 0x0217 }
            int r1 = r2.A01     // Catch:{ all -> 0x0217 }
            if (r1 == r7) goto L_0x0206
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0217 }
            X.C90464aC.A1M(r5, r0, r1)     // Catch:{ all -> 0x0217 }
        L_0x0206:
            X.5V0 r0 = new X.5V0     // Catch:{ all -> 0x0217 }
            r0.<init>(r2)     // Catch:{ all -> 0x0217 }
            r3.BWk(r0)     // Catch:{ all -> 0x0217 }
            r4.close()     // Catch:{ Exception -> 0x021e }
            return
        L_0x0212:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r12)     // Catch:{ all -> 0x0217 }
            throw r0     // Catch:{ all -> 0x0217 }
        L_0x0217:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0219 }
        L_0x0219:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ Exception -> 0x021e }
            throw r0     // Catch:{ Exception -> 0x021e }
        L_0x021e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to parse the error response: "
            goto L_0x0258
        L_0x0226:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "OutOfMemoryError in parsing the response: "
            X.C36321k7.A1J(r2, r0, r1)
            java.lang.String r0 = "OutOfMemoryError while parsing response "
            java.lang.RuntimeException r2 = X.C90524aI.A0e(r0, r2)
            goto L_0x025b
        L_0x0237:
            r0 = move-exception
            r3.BVL(r0)     // Catch:{ all -> 0x0247 }
            goto L_0x0243
        L_0x023c:
            r0 = move-exception
            X.C18740tg.A0A(r0)     // Catch:{ all -> 0x0247 }
            r3.BWk(r0)     // Catch:{ all -> 0x0247 }
        L_0x0243:
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x0247:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x024c:
            r2 = move-exception
            X.C18740tg.A0A(r2)
            goto L_0x025b
        L_0x0251:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Exception in Decompression: "
        L_0x0258:
            X.C36321k7.A1J(r2, r0, r1)
        L_0x025b:
            r3.BWk(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146036uv.Blp(X.7kR):void");
    }

    public C146036uv(C20050ww r2, C19420v0 r3, C20810yC r4, AnonymousClass1WF r5, AnonymousClass005 r6, String str, Map map, AnonymousClass004 r9, AnonymousClass004 r10, long j) {
        C36321k7.A1B(r4, r2, r3, r6, r9);
        AnonymousClass00C.A0D(r10, 6);
        this.A03 = r4;
        this.A05 = r2;
        this.A02 = r3;
        this.A07 = r6;
        this.A09 = r9;
        this.A0A = r10;
        this.A01 = j;
        this.A04 = str;
        this.A08 = map;
        this.A06 = r5;
    }

    public static String A01(C146036uv r1, String str) {
        HashMap A062 = r1.A06();
        if (!A062.containsKey(str)) {
            return str;
        }
        String str2 = (String) A062.get(str);
        if (str2 == null) {
            return "en_US";
        }
        return str2;
    }

    public String A04() {
        return C36381kD.A0y(Locale.getDefault());
    }

    public String A05() {
        String str;
        String str2;
        String A022 = A02();
        if (A022 == null || A022.length() == 0) {
            A022 = C36341k9.A0E(this.A02).getString("pref_graphql_domain", "whatsapp.com");
        }
        AnonymousClass00C.A0B(A022);
        if (this.A03.A0E(549)) {
            str = "?_emp=1";
        } else {
            str = "";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("https://graph.");
        A0u.append(A022);
        if (this instanceof C104525Aa) {
            str2 = "";
        } else {
            str2 = "/graphql";
        }
        A0u.append(str2);
        return AnonymousClass000.A0p(this.A00, str, A0u);
    }
}
