package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.6oM  reason: invalid class name and case insensitive filesystem */
public class C142116oM implements C160607lH {
    public C142146oP A00;
    public Integer A01;
    public String A02;
    public final JsonReader A03;

    public Integer BQE() {
        Integer num;
        this.A02 = null;
        this.A00 = null;
        JsonReader jsonReader = this.A03;
        JsonToken peek = jsonReader.peek();
        int[] iArr = AnonymousClass99T.A00;
        switch (C90524aI.A03(peek, iArr)) {
            case 1:
                num = C023109s.A0R;
                break;
            case 2:
                num = C023109s.A0W;
                break;
            case 3:
                num = C023109s.A0Y;
                break;
            case 4:
                num = C023109s.A00;
                break;
            case 5:
                num = C023109s.A01;
                break;
            case 6:
                num = C023109s.A0C;
                break;
            case 7:
                num = C023109s.A0G;
                break;
            case 8:
                num = C023109s.A02;
                break;
            case 9:
                num = C023109s.A0X;
                break;
            case 10:
                num = C023109s.A0S;
                break;
            default:
                throw AnonymousClass000.A0f(peek, "unknown JsonToken ", AnonymousClass000.A0u());
        }
        this.A01 = num;
        switch (C90524aI.A03(jsonReader.peek(), iArr)) {
            case 1:
                this.A02 = jsonReader.nextName();
                break;
            case 2:
            case 3:
            case 9:
            case 10:
                this.A00 = new C142146oP(jsonReader);
                break;
            case 4:
                jsonReader.beginArray();
                break;
            case 5:
                jsonReader.endArray();
                break;
            case 6:
                jsonReader.beginObject();
                break;
            case 7:
                jsonReader.endObject();
                break;
            case 8:
                break;
            default:
                throw AnonymousClass001.A09("unknown JsonToken ");
        }
        return this.A01;
    }

    public void BuF() {
        Integer num = this.A01;
        Integer num2 = C023109s.A00;
        if (num == num2 || num == C023109s.A0C) {
            int i = 1;
            while (true) {
                Integer BQE = BQE();
                if (BQE == num2 || BQE == C023109s.A0C) {
                    i++;
                } else if (BQE == C023109s.A01 || BQE == C023109s.A0G) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public C142116oM(JsonReader jsonReader) {
        this.A03 = jsonReader;
    }

    public String BlN() {
        return this.A02;
    }

    public Integer BlO() {
        return this.A01;
    }

    public C160707lS BlP() {
        return this.A00;
    }
}
