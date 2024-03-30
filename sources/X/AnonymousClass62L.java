package X;

import android.util.Base64;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.62L  reason: invalid class name */
public class AnonymousClass62L {
    public AnonymousClass684 A00;
    public String A01;

    public String A00(JSONObject jSONObject) {
        try {
            String str = this.A01;
            if (str.isEmpty()) {
                return null;
            }
            Matcher matcher = Pattern.compile("\\[([^\\]]*)\\]").matcher(str);
            StringBuffer stringBuffer = new StringBuffer(1000);
            while (matcher.find()) {
                String group = matcher.group();
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(jSONObject.optString(group.substring(1, group.length() - 1))));
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public AnonymousClass62L(AnonymousClass684 r8) {
        String str;
        this.A00 = r8;
        String str2 = "";
        for (String str3 : new String(Base64.decode("MS03LTItNA==", -1)).split("-")) {
            StringBuilder A0v = AnonymousClass000.A0v(str2);
            Properties properties = this.A00.A00;
            if (properties != null) {
                str = properties.getProperty(str3);
            } else {
                str = null;
            }
            str2 = AnonymousClass000.A0q(str, A0v);
        }
        this.A01 = new String(Base64.decode(str2, -1));
    }
}
