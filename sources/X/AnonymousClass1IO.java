package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1IO  reason: invalid class name */
public class AnonymousClass1IO {
    public final C19890wg A00;
    public final String A01;

    public static AnonymousClass9Xu A00(String str) {
        StringBuilder sb;
        String str2;
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("uj");
            C222813r r0 = UserJid.Companion;
            UserJid A012 = C222813r.A01(string);
            String string2 = jSONObject.getString("s");
            if (jSONObject.has("a")) {
                str3 = jSONObject.getString("a");
            } else {
                str3 = null;
            }
            AnonymousClass9O3 r5 = new AnonymousClass9O3(A012, string2, str3, jSONObject.getLong("ct"), jSONObject.getLong("lit"));
            r5.A02 = jSONObject.getBoolean("hcslm");
            r5.A00 = jSONObject.optInt("brc", -1);
            r5.A01 = jSONObject.optLong("fmts", -1);
            r5.A03 = jSONObject.optBoolean("wdtb", false);
            return new AnonymousClass9Xu(r5);
        } catch (JSONException e) {
            e = e;
            sb = new StringBuilder();
            str2 = "CTWA: EntryPointConversionStore/getConversion/json error";
            sb.append(str2);
            sb.append(e);
            Log.e(sb.toString());
            return null;
        } catch (C19740wR e2) {
            e = e2;
            sb = new StringBuilder();
            str2 = "CTWA: EntryPointConversionStore/getConversion/invalid jid error";
            sb.append(str2);
            sb.append(e);
            Log.e(sb.toString());
            return null;
        }
    }

    public AnonymousClass9Xu A01(UserJid userJid) {
        String string = this.A00.A00(this.A01).getString(userJid.getRawString(), (String) null);
        if (string != null) {
            return A00(string);
        }
        return null;
    }

    public ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = this.A00.A00(this.A01).getAll();
        for (Map.Entry next : all.entrySet()) {
            Object obj = all.get(next.getKey());
            if (obj != null) {
                AnonymousClass9Xu A002 = A00(obj.toString());
                if (A002 != null) {
                    arrayList.add(A002);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("CTWA: EntryPointConversionStore/getAllConversions/ null pref value for key=");
                sb.append(next);
                Log.e(sb.toString());
            }
        }
        return arrayList;
    }

    public void A03(AnonymousClass9Xu r4) {
        try {
            this.A00.A00("entry_point_conversions_for_sending").edit().putString(r4.A04.getRawString(), r4.A00()).apply();
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("CTWA: EntryPointConversionStore/storeConversion/json error");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public AnonymousClass1IO(C19890wg r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
