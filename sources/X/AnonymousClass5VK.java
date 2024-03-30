package X;

import android.text.TextUtils;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5VK  reason: invalid class name */
public class AnonymousClass5VK extends Exception {
    public static final Set A00 = C36421kH.A0g(new String[]{"error_code", "error_domain", "description"});
    public final Map mAdditionalAnnotations;
    public String mStatusCode;
    public final C108395Ti mType;

    public String A00() {
        String message;
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            jsonWriter.name("error_domain").value(this.mType.name());
            if (!TextUtils.isEmpty(this.mStatusCode)) {
                jsonWriter.name("error_code").value(this.mStatusCode);
            }
            if (!TextUtils.isEmpty(getMessage())) {
                JsonWriter name = jsonWriter.name("description");
                if (getMessage().length() > 200) {
                    message = C90514aH.A0z(getMessage(), 200);
                } else {
                    message = getMessage();
                }
                name.value(message);
            }
            Map map = this.mAdditionalAnnotations;
            if (map != null && !map.isEmpty()) {
                Iterator A0y = AnonymousClass000.A0y(this.mAdditionalAnnotations);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    if (!A00.contains(A11.getKey())) {
                        jsonWriter.name(C90494aF.A0f(A11)).value(C90514aH.A10(A11));
                    }
                }
            }
            jsonWriter.endObject();
            return stringWriter.toString();
        } catch (IOException unused) {
            return "";
        }
    }

    public AnonymousClass5VK(C108395Ti r1, String str, String str2, Throwable th, Map map) {
        super(str, th);
        this.mType = r1;
        this.mStatusCode = str2;
        this.mAdditionalAnnotations = map;
    }
}
