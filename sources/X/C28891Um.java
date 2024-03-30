package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Um  reason: invalid class name and case insensitive filesystem */
public final class C28891Um extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;
    public String A0D;
    public String A0E;

    public C28891Um() {
        super(4334, new C18950u5(1, 1, 1, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(19, this.A0C);
        r3.Bpz(23, this.A04);
        r3.Bpz(24, this.A0D);
        r3.Bpz(25, this.A0E);
        r3.Bpz(1, this.A09);
        r3.Bpz(29, this.A00);
        r3.Bpz(26, this.A01);
        r3.Bpz(27, this.A02);
        r3.Bpz(28, this.A03);
        r3.Bpz(2, this.A05);
        r3.Bpz(3, this.A06);
        r3.Bpz(4, this.A0A);
        r3.Bpz(7, this.A07);
        r3.Bpz(5, this.A0B);
        r3.Bpz(6, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(19, this.A0C);
        linkedHashMap.put(23, this.A04);
        linkedHashMap.put(24, this.A0D);
        linkedHashMap.put(25, this.A0E);
        linkedHashMap.put(1, this.A09);
        linkedHashMap.put(29, this.A00);
        linkedHashMap.put(26, this.A01);
        linkedHashMap.put(27, this.A02);
        linkedHashMap.put(28, this.A03);
        linkedHashMap.put(2, this.A05);
        linkedHashMap.put(3, this.A06);
        linkedHashMap.put(4, this.A0A);
        linkedHashMap.put(20, (Object) null);
        linkedHashMap.put(21, (Object) null);
        linkedHashMap.put(22, (Object) null);
        linkedHashMap.put(7, this.A07);
        linkedHashMap.put(5, this.A0B);
        linkedHashMap.put(6, this.A08);
        return linkedHashMap;
    }

    public String toString() {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        StringBuilder sb = new StringBuilder();
        sb.append("WamTsNavigation {");
        C20910yM.A00(this.A0C, "cid", sb);
        Integer num = this.A04;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        C20910yM.A00(obj, "entryPointConversationInitiated", sb);
        C20910yM.A00(this.A0D, "entryPointConversionApp", sb);
        C20910yM.A00(this.A0E, "entryPointConversionSource", sb);
        C20910yM.A00(this.A09, "groupSize", sb);
        C20910yM.A00(this.A00, "isCatalogVisible", sb);
        C20910yM.A00(this.A01, "isCloudapi", sb);
        C20910yM.A00(this.A02, "isOnpremises", sb);
        C20910yM.A00(this.A03, "isSmb", sb);
        Integer num2 = this.A05;
        if (num2 == null) {
            obj2 = null;
        } else {
            obj2 = num2.toString();
        }
        C20910yM.A00(obj2, "navigationDestination", sb);
        Integer num3 = this.A06;
        if (num3 == null) {
            obj3 = null;
        } else {
            obj3 = num3.toString();
        }
        C20910yM.A00(obj3, "navigationSource", sb);
        C20910yM.A00(this.A0A, "relativeTimestampMs", sb);
        Integer num4 = this.A07;
        if (num4 == null) {
            obj4 = null;
        } else {
            obj4 = num4.toString();
        }
        C20910yM.A00(obj4, "threadType", sb);
        C20910yM.A00(this.A0B, "tsSessionId", sb);
        Integer num5 = this.A08;
        if (num5 == null) {
            obj5 = null;
        } else {
            obj5 = num5.toString();
        }
        C20910yM.A00(obj5, "typeOfGroup", sb);
        sb.append("}");
        String obj6 = sb.toString();
        AnonymousClass00C.A08(obj6);
        return obj6;
    }
}
