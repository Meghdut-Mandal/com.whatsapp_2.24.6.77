package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1LC  reason: invalid class name */
public final class AnonymousClass1LC implements C236119d {
    public AnonymousClass1LD A00;
    public final C18820ts A01;
    public final AnonymousClass19A A02;

    public AnonymousClass1LC(C18820ts r2, AnonymousClass19A r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BVN(String str) {
        AnonymousClass00C.A0D(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("GetCommerceTranslationsMetadataProtocolHelper/onDeliveryFailure: Network failed  while sending the payload: ");
        sb.append(str);
        Log.e(sb.toString());
        AnonymousClass1LD r0 = this.A00;
        if (r0 == null) {
            AnonymousClass00C.A0G("listener");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            r0.A00.A05.set(false);
        }
    }

    public void BWw(C203399nx r4, String str) {
        AnonymousClass00C.A0D(r4, 1);
        Log.e("GetCommerceTranslationsMetadataProtocolHelper/response-error");
        C203399nx A0c = r4.A0c("error");
        if (A0c != null) {
            A0c.A0S("code", 0);
        }
        AnonymousClass1LD r0 = this.A00;
        if (r0 == null) {
            AnonymousClass00C.A0G("listener");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            r0.A00.A05.set(false);
        }
    }

    public void BiM(C203399nx r13, String str) {
        String str2;
        C203399nx A0c;
        C203399nx[] r9;
        C203399nx A0c2;
        String A0i;
        Long A04;
        C203399nx A0c3;
        AnonymousClass00C.A0D(r13, 1);
        C203399nx A0c4 = r13.A0c("commerce_metadata");
        if (A0c4 == null || (A0c3 = A0c4.A0c("translations")) == null || (str2 = A0c3.A0i("locale", (String) null)) == null) {
            str2 = "";
        }
        boolean z = false;
        if (str2.length() == 0) {
            z = true;
        }
        if (z) {
            Log.e("GetCommerceTranslationsMetadataProtocolHelper/onSuccess can not find locale value in response!");
            AnonymousClass1LD r0 = this.A00;
            if (r0 == null) {
                AnonymousClass00C.A0G("listener");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                r0.A00.A05.set(false);
            }
        } else {
            long time = (new Date().getTime() / 1000) + 86400000;
            if (!(A0c4 == null || (A0c2 = A0c4.A0c("translations")) == null || (A0i = A0c2.A0i("expires_at", (String) null)) == null || (A04 = AnonymousClass097.A04(A0i)) == null)) {
                time = A04.longValue();
            }
            HashMap hashMap = new HashMap();
            if (!(A0c4 == null || (A0c = A0c4.A0c("translations")) == null || (r9 = A0c.A02) == null)) {
                ArrayList arrayList = new ArrayList();
                for (C203399nx r4 : r9) {
                    if (AnonymousClass00C.A0J(r4.A00, "string")) {
                        arrayList.add(r4);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C203399nx r6 = (C203399nx) it.next();
                    if (!(r6.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null) == null || r6.A0i("value", (String) null) == null)) {
                        String A0i2 = r6.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null);
                        AnonymousClass00C.A0B(A0i2);
                        String A0i3 = r6.A0i("value", (String) null);
                        AnonymousClass00C.A0B(A0i3);
                        hashMap.put(A0i2, A0i3);
                    }
                    arrayList2.add(AnonymousClass0AJ.A00);
                }
            }
            AnonymousClass1LD r02 = this.A00;
            if (r02 == null) {
                AnonymousClass00C.A0G("listener");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C192999Jl r3 = new C192999Jl(str2, hashMap, time);
            AnonymousClass1LB r1 = r02.A00;
            r1.A05.set(false);
            C19420v0 r62 = r1.A03;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("locale", r3.A01);
            jSONObject.put("expiresAt", r3.A00);
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : r3.A02.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, entry.getKey());
                jSONObject2.put("value", entry.getValue());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("strings", jSONArray);
            C19420v0.A00(r62).putString("commerce_metadata_tanslations", jSONObject.toString()).apply();
        }
    }
}
