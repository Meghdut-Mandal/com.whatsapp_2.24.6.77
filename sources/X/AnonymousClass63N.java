package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.63N  reason: invalid class name */
public final class AnonymousClass63N {
    public long A00;
    public long A01;
    public String A02;
    public String A03;

    public AnonymousClass63N(long j, String str, long j2, String str2) {
        C36321k7.A0x(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        JSONObject A1B = C36441kJ.A1B();
        try {
            A1B.put("shard-key", this.A03);
            A1B.put("entry-key", this.A02);
            A1B.put("expiration-time", this.A01);
            A1B.put("create-time", this.A00);
        } catch (JSONException unused) {
            Log.e("BkCacheSaveOnDiskHelper:BkCacheValueHelper/toJson threw exception");
        }
        return C36381kD.A0y(A1B);
    }
}
