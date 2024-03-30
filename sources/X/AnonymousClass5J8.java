package X;

import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5J8  reason: invalid class name */
public class AnonymousClass5J8 extends C181018mn implements C22992Azi {
    public int A00 = -1;
    public Set A01 = C36441kJ.A16();

    public AnonymousClass5J8(C64933Qa r2, long j) {
        super(r2, 70, j);
    }

    public String A1X() {
        JsonWriter jsonWriter;
        StringWriter stringWriter = new StringWriter();
        try {
            jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            jsonWriter.name("requestType").value((long) this.A00);
            jsonWriter.name("identifierSet").beginArray();
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                jsonWriter.value(AnonymousClass001.A0C(it));
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            Log.e("FMessagePeerDataOperationRequest/writeData failed", e);
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
                    if (hashCode != 569764601) {
                        if (hashCode == 1150097001 && nextName.equals("requestType")) {
                            this.A00 = A0Q.nextInt();
                        }
                    } else if (nextName.equals("identifierSet")) {
                        HashSet A16 = C36441kJ.A16();
                        A0Q.beginArray();
                        while (A0Q.hasNext()) {
                            A16.add(A0Q.nextString());
                        }
                        A0Q.endArray();
                        this.A01 = A16;
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("FMessagePeerDataOperationRequest/readData/unexpected name \"");
                    A0u.append(nextName);
                    C36341k9.A1O(A0u, "\"");
                }
                A0Q.endObject();
                A0Q.close();
                return;
            } catch (IOException e) {
                Log.e("FMessagePeerDataOperationRequest/readData failed", e);
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
