package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Mh  reason: invalid class name and case insensitive filesystem */
public class C130756Mh {
    public static final Set A02 = Collections.unmodifiableSet(new AnonymousClass5Z3(4));
    public final SimpleDateFormat A00 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
    public final boolean A01;

    public ArrayList A00(JSONArray jSONArray) {
        long j;
        if (!this.A01 || jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Date parse = this.A00.parse(jSONObject.getString("expires"));
                C124055xW r3 = new C124055xW();
                r3.A00 = Boolean.valueOf(jSONObject.optBoolean("secure"));
                if (parse == null) {
                    j = 0;
                } else {
                    j = parse.getTime();
                }
                r3.A01 = Long.valueOf(j);
                r3.A03 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                r3.A05 = jSONObject.getString("value");
                r3.A02 = jSONObject.getString("domain");
                r3.A04 = jSONObject.getString("path");
                Objects.requireNonNull(r3.A00);
                Objects.requireNonNull(r3.A01);
                Objects.requireNonNull(r3.A02);
                Objects.requireNonNull(r3.A03);
                Objects.requireNonNull(r3.A04);
                Objects.requireNonNull(r3.A05);
                A0I.add(new C112045dG());
            } catch (NullPointerException | ParseException | JSONException unused) {
            }
        }
        return A0I;
    }

    public C130756Mh(String str) {
        this.A01 = A02.contains(str);
    }
}
