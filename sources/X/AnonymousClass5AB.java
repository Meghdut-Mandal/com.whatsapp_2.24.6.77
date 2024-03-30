package X;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5AB  reason: invalid class name */
public final class AnonymousClass5AB extends C1257160z {
    public final C23871Ae A00;
    public final C24281Bv A01;

    public static final C134836bg A00(AnonymousClass5AB r14, JSONObject jSONObject) {
        int i;
        JSONObject jSONObject2;
        boolean z;
        boolean z2;
        JSONArray jSONArray = jSONObject.getJSONArray("emojis");
        ArrayList A0I = AnonymousClass001.A0I();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2 = C90484aE.A0E(A0I, jSONArray, i2)) {
        }
        if (jSONObject.has("file_size")) {
            i = jSONObject.getInt("file_size");
        } else {
            i = 0;
        }
        if (jSONObject.has("metadata")) {
            jSONObject2 = jSONObject.getJSONObject("metadata");
        } else {
            jSONObject2 = null;
        }
        String A0e = C90474aD.A0e("url", jSONObject);
        String join = TextUtils.join(" ", A0I);
        AnonymousClass00C.A08(join);
        String A0e2 = C90474aD.A0e("mimetype", jSONObject);
        int i3 = jSONObject.getInt("height");
        int i4 = jSONObject.getInt("width");
        String A0e3 = C90474aD.A0e("file_hash", jSONObject);
        String A0e4 = C90474aD.A0e("stable_id", jSONObject);
        if (jSONObject2 == null || !jSONObject2.has("country_specific")) {
            z = false;
        } else {
            z = jSONObject2.getBoolean("country_specific");
        }
        C20810yC r3 = r14.A01.A00;
        if (!r3.A0E(5979) || jSONObject2 == null || !jSONObject2.has("social")) {
            z2 = false;
        } else {
            z2 = jSONObject2.getBoolean("social");
        }
        String[] strArr = null;
        if (r3.A0E(5979) && jSONObject2 != null && jSONObject2.has("social_fbids")) {
            JSONArray jSONArray2 = jSONObject2.getJSONArray("social_fbids");
            AnonymousClass00C.A0B(jSONArray2);
            strArr = C36431kI.A1b(C15060md.A00(new C12790if(new AnonymousClass7TO(jSONArray2), C90514aH.A0X(C15040mb.A05(0, jSONArray2.length())))));
        }
        return new C134836bg(A0e, join, A0e2, A0e3, A0e4, strArr, i, i3, i4, z, z2);
    }

    public AnonymousClass5AB(C23871Ae r1, C24281Bv r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
