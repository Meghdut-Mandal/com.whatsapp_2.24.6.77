package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.4rZ  reason: invalid class name and case insensitive filesystem */
public class C98524rZ extends C125255za implements C157927eu {
    public final C125255za A00;
    public final String A01;

    public JSONObject Bvk() {
        JSONObject Bvk = ((C157927eu) this.A00).Bvk();
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            Bvk.put("feature_name", str);
        }
        return Bvk;
    }

    public C98524rZ(C125255za r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
