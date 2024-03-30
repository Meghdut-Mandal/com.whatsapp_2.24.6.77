package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9hT  reason: invalid class name and case insensitive filesystem */
public final class C200479hT {
    public static final C197849cT A00(C200479hT r14, JSONObject jSONObject) {
        C188148z7 r3;
        String str;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (string == null) {
            try {
                r3 = C188148z7.UNKNOWN;
            } catch (IllegalArgumentException unused) {
                r3 = C188148z7.UNKNOWN;
            }
        } else {
            Locale locale = Locale.US;
            AnonymousClass00C.A09(locale);
            r3 = C188148z7.valueOf(C165607th.A0v(locale, string));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("filters");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            AnonymousClass00C.A08(jSONObject2);
            boolean optBoolean = jSONObject2.optBoolean("passIfNotSupported", false);
            JSONObject optJSONObject = jSONObject2.optJSONObject("extra_data");
            if (optJSONObject != null) {
                str = optJSONObject.toString();
            } else {
                str = null;
            }
            HashMap A01 = C131866Qy.A01(str);
            ArrayList A14 = C36441kJ.A14(A01.size());
            Iterator A10 = C36371kC.A10(A01);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                C90494aF.A1F(A11.getKey(), A11.getValue().toString(), A14);
            }
            A0I.add(new C193229Kn(new C192089Fq(C90474aD.A0e(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject2)), C000400e.A09(A14), optBoolean));
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("clauses");
        int length2 = jSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
            AnonymousClass00C.A08(jSONObject3);
            A0I2.add(A00(r14, jSONObject3));
        }
        return new C197849cT(r3, A0I, A0I2);
    }

    public static final JSONObject A01(C200479hT r8, C197849cT r9) {
        JSONObject A1B = C36441kJ.A1B();
        String name = r9.A00.name();
        if (name == null) {
            name = "UNKNOWN";
        }
        A1B.putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, name);
        JSONArray A0u = C90524aI.A0u();
        Iterator it = r9.A02.iterator();
        while (it.hasNext()) {
            C193229Kn r4 = (C193229Kn) it.next();
            JSONObject A0q = C90464aC.A0q(r4);
            A0q.putOpt("passIfNotSupported", Boolean.valueOf(r4.A02));
            A0q.putOpt("extra_data", new JSONObject(r4.A01));
            A0q.putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A00.A00);
            A0u.put(A0q);
        }
        A1B.putOpt("filters", A0u);
        JSONArray A0u2 = C90524aI.A0u();
        Iterator it2 = r9.A01.iterator();
        while (it2.hasNext()) {
            A0u2.put(A01(r8, (C197849cT) it2.next()));
        }
        A1B.putOpt("clauses", A0u2);
        return A1B;
    }
}
