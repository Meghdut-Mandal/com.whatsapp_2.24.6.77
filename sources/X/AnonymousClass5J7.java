package X;

import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.5J7  reason: invalid class name */
public class AnonymousClass5J7 extends C181018mn implements C22992Azi {
    public boolean A00;

    public AnonymousClass5J7(C64933Qa r2, long j) {
        super(r2, 47, j);
    }

    public String A1X() {
        JsonWriter jsonWriter;
        StringWriter stringWriter = new StringWriter();
        try {
            jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject().name("security_notification_enabled").value(this.A00).endObject();
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            Log.e("FMessageInitialSecurityNotificationSettingSync/writeData failed", e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A1Y(String str) {
        JsonReader A0Q;
        if (!TextUtils.isEmpty(str)) {
            try {
                A0Q = C90484aE.A0Q(str);
                A0Q.beginObject();
                while (A0Q.hasNext()) {
                    String nextName = A0Q.nextName();
                    if (nextName.hashCode() == 1518553996 && nextName.equals("security_notification_enabled")) {
                        this.A00 = A0Q.nextBoolean();
                    }
                }
                A0Q.endObject();
                A0Q.close();
                return;
            } catch (IOException e) {
                Log.e("FMessageInitialSecurityNotificationSettingSync/readData failed", e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    public /* synthetic */ String BE6() {
        return "peer_msg";
    }
}
