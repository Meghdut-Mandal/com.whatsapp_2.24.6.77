package X;

import android.app.Activity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2KA  reason: invalid class name */
public final class AnonymousClass2KA extends AnonymousClass2KD {
    public final AnonymousClass17Y A00;

    public AnonymousClass2KA(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void A08(Activity activity, AnonymousClass3T1 r27, C206969uL r28, int i) {
        JSONObject jSONObject;
        Activity activity2 = activity;
        AnonymousClass3T1 r23 = r27;
        C206969uL r3 = r28;
        C36321k7.A16(activity2, r23, r3, 0);
        String str = r3.A01;
        if (str != null) {
            jSONObject = C36441kJ.A1C(str);
        } else {
            jSONObject = null;
        }
        C18740tg.A06(jSONObject);
        AnonymousClass00C.A08(jSONObject);
        C207219uk r9 = new C207219uk((C207199ui) null, (C206489tU) null, (C206659tl) null, (C207089uX) null, (C206819u1) null, (C206679tn) null, (AnonymousClass3XY) null, (String) null, (String) null, (String) null, (String) null, C023409w.A00, 8);
        JSONArray jSONArray = new JSONArray(jSONObject.getString("sections"));
        ArrayList A0I = AnonymousClass001.A0I();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            String A10 = C36411kG.A10("title", jSONObject2);
            String optString = jSONObject2.optString("highlight_label");
            JSONArray jSONArray2 = jSONObject2.getJSONArray("rows");
            ArrayList A13 = C36411kG.A13(jSONArray2);
            int length2 = jSONArray2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                String string = jSONObject3.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                AnonymousClass00C.A08(string);
                String optString2 = jSONObject3.optString("header");
                String string2 = jSONObject3.getString("title");
                AnonymousClass00C.A08(string2);
                A13.add(new C206729ts(string, optString2, string2, jSONObject3.optString("description")));
            }
            A0I.add(new C206689to(A10, optString, A13));
        }
        r9.A0C = A0I;
        r9.A08 = jSONObject.getString("title");
        AnonymousClass4V7 A01 = AnonymousClass3SS.A01(activity2);
        if (A01 != null) {
            A01.Bl8(new AnonymousClass2tZ(this, A01, r23, 1), r9);
        } else {
            Log.e("SingleSelectAction/execute/error: not a click in Conversation");
        }
    }

    public int A03() {
        return R.drawable.ic_format_list_bulleted;
    }
}
