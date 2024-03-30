package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.135  reason: invalid class name */
public final class AnonymousClass135 extends C20890yK {
    public Long A00;
    public String A01;
    public String A02;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(2, this.A02);
    }

    public AnonymousClass135() {
        super(2052, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, this.A00);
        linkedHashMap.put(3, this.A01);
        linkedHashMap.put(2, this.A02);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WamAndroidPerfTimer {");
        C20910yM.A00(this.A00, "androidPerfDuration", sb);
        C20910yM.A00(this.A01, "androidPerfExtraData", sb);
        C20910yM.A00(this.A02, "androidPerfName", sb);
        sb.append("}");
        String obj = sb.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }
}
