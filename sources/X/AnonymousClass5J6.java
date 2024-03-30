package X;

import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5J6  reason: invalid class name */
public class AnonymousClass5J6 extends C181018mn {
    public long A00;
    public Set A01;

    public AnonymousClass5J6(C64933Qa r2, long j) {
        super(r2, 50, j);
        this.A01 = C36441kJ.A16();
    }

    public String A1X() {
        JsonWriter jsonWriter;
        StringWriter stringWriter = new StringWriter();
        try {
            jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            jsonWriter.name("collection_names").beginArray();
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                if (A0C != null) {
                    jsonWriter.value(A0C);
                }
            }
            jsonWriter.endArray();
            jsonWriter.name("timestamp").value(this.A00);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            Log.e("FMessageAppStateFatalExceptionNotification/writeData failed", e);
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
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1490290073) {
                        if (hashCode == 55126294 && nextName.equals("timestamp")) {
                            this.A00 = A0Q.nextLong();
                        }
                    } else if (nextName.equals("collection_names")) {
                        A0Q.beginArray();
                        while (A0Q.hasNext()) {
                            this.A01.add(A0Q.nextString());
                        }
                        A0Q.endArray();
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("FMessageAppStateFatalExceptionNotification/readData/unexpected name \"");
                    A0u.append(nextName);
                    C36341k9.A1O(A0u, "\"");
                }
                A0Q.endObject();
                A0Q.close();
                return;
            } catch (IOException e) {
                Log.e("FMessageAppStateFatalExceptionNotification/readData failed", e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    public AnonymousClass5J6(C64933Qa r2, Set set, long j, long j2) {
        super(r2, 50, j);
        this.A01 = set;
        this.A00 = j2;
    }
}
