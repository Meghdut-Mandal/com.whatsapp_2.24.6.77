package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1L1  reason: invalid class name */
public final class AnonymousClass1L1 {
    public AnonymousClass1L8 A00 = new AnonymousClass1L8(this);
    public final C19420v0 A01;
    public final C20810yC A02;
    public final AnonymousClass1L3 A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AnonymousClass00T A05 = new AnonymousClass00U(new AnonymousClass1L7(this));
    public final AnonymousClass1L2 A06;
    public final C18820ts A07;

    public AnonymousClass1L1(AnonymousClass1L2 r3, C19420v0 r4, C18820ts r5, C20810yC r6, AnonymousClass1L3 r7) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r7, 5);
        this.A01 = r4;
        this.A07 = r5;
        this.A06 = r3;
        this.A02 = r6;
        this.A03 = r7;
    }

    public static final C131576Pp A01(JSONObject jSONObject) {
        String str;
        String str2;
        List list;
        JSONObject jSONObject2 = jSONObject;
        AnonymousClass00C.A0D(jSONObject2, 0);
        String optString = jSONObject2.optString("url");
        String optString2 = jSONObject2.optString("locale");
        long optLong = jSONObject2.optLong("expiresData", 0);
        String optString3 = jSONObject2.optString("appId");
        String optString4 = jSONObject2.optString("version");
        String optString5 = jSONObject2.optString("platform");
        String optString6 = jSONObject2.optString("bizJid");
        long optLong2 = jSONObject2.optLong("flowVersionId");
        String optString7 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
        if (!jSONObject2.has("minAppVersion") || jSONObject2.isNull("minAppVersion")) {
            str = null;
        } else {
            str = jSONObject2.getString("minAppVersion");
        }
        if (!jSONObject2.has("bloksVersionId") || jSONObject2.isNull("bloksVersionId")) {
            str2 = null;
        } else {
            str2 = jSONObject2.getString("bloksVersionId");
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("extraVersions");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            C12320hr A012 = C63893Lv.A01(optJSONArray);
            while (A012.hasNext()) {
                arrayList.add(A01((JSONObject) A012.next()));
            }
            list = C007103b.A0Y(arrayList);
        } else {
            list = null;
        }
        AnonymousClass00C.A0B(optString);
        AnonymousClass00C.A0B(optString2);
        AnonymousClass00C.A0B(optString3);
        AnonymousClass00C.A0B(optString5);
        return new C131576Pp(Long.valueOf(optLong2), optString, optString2, optString3, optString4, optString5, optString6, optString7, str, str2, list, optLong);
    }

    public final C116625kt A03() {
        String string = ((SharedPreferences) this.A01.A00.get()).getString("commerce_metadata", (String) null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("bloksLinks");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            arrayList.add(A01(optJSONObject));
                        }
                    }
                }
                return new C116625kt(arrayList);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void A04(C1262863h r15) {
        if (this.A04.compareAndSet(false, true)) {
            AnonymousClass1L2 r8 = this.A06;
            AnonymousClass1L8 r0 = this.A00;
            AnonymousClass00C.A0D(r0, 0);
            r8.A00 = r0;
            r8.A01 = r15;
            AnonymousClass19A r7 = r8.A02;
            String A09 = r7.A09();
            r7.A0E(r8, new C203399nx(new C203399nx(new C203399nx("bloks_links", new AnonymousClass1AL[0]), "commerce_metadata", new AnonymousClass1AL[0]), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL("xmlns", "fb:thrift_iq"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL("smax_id", "91"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09)}), A09, 326, 32000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r3 == null) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C131576Pp A00(X.AnonymousClass1L1 r8, java.util.List r9) {
        /*
            java.util.Iterator r2 = r9.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x0095
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.6Pp r0 = (X.C131576Pp) r0
            java.lang.String r1 = r0.A06
            X.0ts r0 = r8.A07
            java.lang.String r0 = r0.A07()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0004
        L_0x0020:
            X.6Pp r3 = (X.C131576Pp) r3
            if (r3 != 0) goto L_0x0074
            java.util.Iterator r2 = r9.iterator()
        L_0x0028:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.6Pp r0 = (X.C131576Pp) r0
            java.lang.String r1 = r0.A06
            X.0ts r0 = r8.A07
            android.content.Context r0 = r0.A00
            java.util.Locale r0 = X.C18820ts.A01(r0)
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0028
        L_0x0049:
            X.6Pp r3 = (X.C131576Pp) r3
            if (r3 != 0) goto L_0x0074
            java.util.Iterator r2 = r9.iterator()
        L_0x0051:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.6Pp r0 = (X.C131576Pp) r0
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "en"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0051
        L_0x0068:
            X.6Pp r3 = (X.C131576Pp) r3
            if (r3 != 0) goto L_0x0074
            java.lang.Object r3 = X.C007103b.A0M(r9)
            X.6Pp r3 = (X.C131576Pp) r3
            if (r3 == 0) goto L_0x0097
        L_0x0074:
            java.lang.String r0 = "2.24.6.77"
            java.util.Objects.requireNonNull(r0)
            X.6Pp r6 = r3.A01()
            long r4 = r6.A01
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r2 = r0.getTime()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0097
            return r6
        L_0x0091:
            r3 = r7
            goto L_0x0068
        L_0x0093:
            r3 = r7
            goto L_0x0049
        L_0x0095:
            r3 = r7
            goto L_0x0020
        L_0x0097:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L1.A00(X.1L1, java.util.List):X.6Pp");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C131576Pp A02(java.lang.String r7) {
        /*
            r6 = this;
            X.5kt r0 = r6.A03()
            r5 = 0
            if (r0 == 0) goto L_0x0035
            java.util.List r0 = r0.A00
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.6Pp r1 = (X.C131576Pp) r1
            java.lang.String r0 = r1.A03
            boolean r0 = X.AnonymousClass00C.A0J(r0, r7)
            if (r0 == 0) goto L_0x0012
            java.lang.String r1 = r1.A08
            java.lang.String r0 = "android"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0012
            r4.add(r2)
            goto L_0x0012
        L_0x0035:
            X.09w r4 = X.C023409w.A00
        L_0x0037:
            X.6Pp r2 = A00(r6, r4)
            X.00T r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r0.get(r7)
            if (r1 == 0) goto L_0x0054
            if (r2 == 0) goto L_0x0054
            java.lang.String r0 = r2.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 != 0) goto L_0x0054
            return r5
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L1.A02(java.lang.String):X.6Pp");
    }
}
