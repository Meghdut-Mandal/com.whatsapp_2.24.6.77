package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.11k  reason: invalid class name */
public final class AnonymousClass11k extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public AnonymousClass11k() {
        super(1094, new C18950u5(1, 200, 1000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A02);
        r3.Bpz(7, this.A00);
        r3.Bpz(1, this.A03);
        r3.Bpz(5, this.A01);
        r3.Bpz(10, this.A04);
        r3.Bpz(8, this.A05);
        r3.Bpz(9, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(2, this.A02);
        linkedHashMap.put(7, this.A00);
        linkedHashMap.put(3, (Object) null);
        linkedHashMap.put(4, (Object) null);
        linkedHashMap.put(1, this.A03);
        linkedHashMap.put(5, this.A01);
        linkedHashMap.put(10, this.A04);
        linkedHashMap.put(8, this.A05);
        linkedHashMap.put(9, this.A06);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        String obj2;
        StringBuilder sb = new StringBuilder();
        sb.append("WamAppLaunch {");
        C20910yM.A00(this.A02, "appLaunchCpuT", sb);
        Integer num = this.A00;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        C20910yM.A00(obj, "appLaunchDestination", sb);
        C20910yM.A00(this.A03, "appLaunchT", sb);
        Integer num2 = this.A01;
        if (num2 == null) {
            obj2 = null;
        } else {
            obj2 = num2.toString();
        }
        C20910yM.A00(obj2, "appLaunchTypeT", sb);
        C20910yM.A00(this.A04, "dbMainThreadCount", sb);
        C20910yM.A00(this.A05, "dbReadsCount", sb);
        C20910yM.A00(this.A06, "dbWritesCount", sb);
        sb.append("}");
        String obj3 = sb.toString();
        AnonymousClass00C.A08(obj3);
        return obj3;
    }
}
