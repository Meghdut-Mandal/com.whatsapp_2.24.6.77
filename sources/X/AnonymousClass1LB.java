package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1LB  reason: invalid class name */
public class AnonymousClass1LB {
    public boolean A00;
    public AnonymousClass1LD A01 = new AnonymousClass1LD(this);
    public final C19630wG A02;
    public final C19420v0 A03;
    public final C20810yC A04;
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final AnonymousClass1LC A06;
    public final C18820ts A07;

    public AnonymousClass1LB(AnonymousClass1LC r3, C19630wG r4, C19420v0 r5, C18820ts r6, C20810yC r7) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r4, 5);
        this.A03 = r5;
        this.A07 = r6;
        this.A06 = r3;
        this.A04 = r7;
        this.A02 = r4;
    }

    public final C192999Jl A00() {
        String string = ((SharedPreferences) this.A03.A00.get()).getString("commerce_metadata_tanslations", (String) null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONArray optJSONArray = jSONObject.optJSONArray("strings");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String string2 = optJSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                            AnonymousClass00C.A08(string2);
                            String string3 = optJSONObject.getString("value");
                            AnonymousClass00C.A08(string3);
                            linkedHashMap.put(string2, string3);
                        }
                    }
                }
                String string4 = jSONObject.getString("locale");
                AnonymousClass00C.A08(string4);
                C192999Jl r2 = new C192999Jl(string4, linkedHashMap, jSONObject.getLong("expiresAt"));
                if (AnonymousClass00C.A0J(r2.A01, C18820ts.A01(this.A07.A00).getLanguage())) {
                    return r2;
                }
                Log.e("CommerceTranslationsMetadataManager/CommerceMetadataTranslations/translation locale is different than system locale ");
                return null;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void A01() {
        AtomicBoolean atomicBoolean = this.A05;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            AnonymousClass1LC r9 = this.A06;
            AnonymousClass1LD r0 = this.A01;
            AnonymousClass00C.A0D(r0, 0);
            r9.A00 = r0;
            AnonymousClass19A r8 = r9.A02;
            String A09 = r8.A09();
            r8.A0E(r9, new C203399nx(new C203399nx(new C203399nx("translations", new AnonymousClass1AL[]{new AnonymousClass1AL("locale", r9.A01.A06())}), "commerce_metadata", new AnonymousClass1AL[0]), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL("xmlns", "fb:thrift_iq"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL("smax_id", "91"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09)}), A09, 334, 32000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r0.A00 < (new java.util.Date().getTime() / 1000)) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r7 = this;
            X.9Jl r0 = r7.A00()
            r6 = 0
            if (r0 == 0) goto L_0x001a
            long r4 = r0.A00
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r2 = r0.getTime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L_0x001b
        L_0x001a:
            r2 = 1
        L_0x001b:
            X.9Jl r0 = r7.A00()
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = r0.A01
            X.0ts r0 = r7.A07
            android.content.Context r0 = r0.A00
            java.util.Locale r0 = X.C18820ts.A01(r0)
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
        L_0x0033:
            if (r2 != 0) goto L_0x0037
            if (r0 != 0) goto L_0x0038
        L_0x0037:
            r6 = 1
        L_0x0038:
            return r6
        L_0x0039:
            r0 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LB.A02():boolean");
    }
}
