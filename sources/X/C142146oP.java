package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: X.6oP  reason: invalid class name and case insensitive filesystem */
public class C142146oP implements C160707lS {
    public Boolean A00;
    public String A01;
    public final JsonToken A02;

    public static IOException A00(C142146oP r2) {
        StringBuilder sb = new StringBuilder();
        sb.append("type mis matching");
        sb.append(r2.A02);
        return new IOException(sb.toString());
    }

    public boolean B1v() {
        Boolean bool = this.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw A00(this);
    }

    public int BKo() {
        String str = this.A01;
        if (str != null) {
            return Integer.valueOf(str).intValue();
        }
        throw A00(this);
    }

    public boolean BMV() {
        return C36361kB.A1a(this.A02, JsonToken.NULL);
    }

    public long BOz() {
        String str = this.A01;
        if (str != null) {
            return Long.valueOf(str).longValue();
        }
        throw A00(this);
    }

    public Number BQP() {
        String str = this.A01;
        if (str != null) {
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(str);
            }
        } else {
            throw A00(this);
        }
    }

    public String BvC() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        throw A00(this);
    }

    public C142146oP(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        this.A02 = peek;
        int A03 = C90524aI.A03(peek, AnonymousClass99U.A00);
        if (A03 == 1) {
            this.A00 = Boolean.valueOf(jsonReader.nextBoolean());
        } else if (A03 == 2) {
            jsonReader.nextNull();
        } else if (A03 == 3 || A03 == 4) {
            this.A01 = jsonReader.nextString();
        } else {
            throw AnonymousClass001.A09("can't read value");
        }
    }
}
