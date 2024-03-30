package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.12h  reason: invalid class name */
public final class AnonymousClass12h extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A04);
        r3.Bpz(7, this.A03);
        r3.Bpz(3, this.A00);
        r3.Bpz(8, this.A01);
    }

    public AnonymousClass12h() {
        super(2450, new C18950u5(1000, 1000, SearchActionVerificationClientService.NOTIFICATION_ID, false), 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, this.A02);
        linkedHashMap.put(2, this.A04);
        linkedHashMap.put(7, this.A03);
        linkedHashMap.put(6, (Object) null);
        linkedHashMap.put(5, (Object) null);
        linkedHashMap.put(3, this.A00);
        linkedHashMap.put(4, (Object) null);
        linkedHashMap.put(8, this.A01);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append("WamDbPerf {");
        C20910yM.A00(this.A02, "androidPerfDuration", sb);
        C20910yM.A00(this.A04, "androidPerfName", sb);
        C20910yM.A00(this.A03, "dbSizeInMb", sb);
        C20910yM.A00(this.A00, "onMainThread", sb);
        Integer num = this.A01;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        C20910yM.A00(obj, "startupStage", sb);
        sb.append("}");
        String obj2 = sb.toString();
        AnonymousClass00C.A08(obj2);
        return obj2;
    }
}
