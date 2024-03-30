package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.6Nh  reason: invalid class name and case insensitive filesystem */
public class C130996Nh {
    public final C131376Ou A00;

    public static String A00(Integer num) {
        if (num == null) {
            return null;
        }
        try {
            return C90484aE.A0l(num, "FDS_INSTANCE_KEY", C36441kJ.A1B());
        } catch (JSONException e) {
            Log.e("PAY: createQplPramsStringFromInstanceKey threw exception ", e);
            return null;
        }
    }

    public void A01(String str) {
        if (str != null) {
            try {
                String string = C36441kJ.A1C(str).getString("FDS_INSTANCE_KEY");
                if (string != null) {
                    A02(string, "OPEN_SCREEN", (Map) null);
                }
            } catch (JSONException unused) {
                Log.e("qpl params parsing failure");
            }
        }
    }

    public void A02(String str, String str2, Map map) {
        if (map == null) {
            map = AnonymousClass001.A0J();
        }
        this.A00.A00().A02(new AnonymousClass70C(str, str2, map));
    }

    public C130996Nh(C131376Ou r1) {
        this.A00 = r1;
    }
}
