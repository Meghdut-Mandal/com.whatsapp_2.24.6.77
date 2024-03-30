package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1ZA  reason: invalid class name */
public final class AnonymousClass1ZA extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1Z9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1ZA(AnonymousClass1Z9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C29391Wl r0 = this.this$0.A04;
        HashMap hashMap = new HashMap();
        String string = C29391Wl.A01(r0).getString("user_notices_metadata", (String) null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C65613Su A00 = C65613Su.A00(new JSONObject(jSONObject.get(next).toString()));
                    if (A00 == null || A00.A02 == 1) {
                        hashMap.put(Integer.valueOf(next), A00);
                    } else {
                        hashMap.put(Integer.valueOf(next), new C65613Su(A00.A01, A00.A00, A00.A03, A00.A04, 1));
                    }
                }
            } catch (JSONException e) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e);
            }
        }
        linkedHashMap.putAll(hashMap);
        return linkedHashMap;
    }
}
