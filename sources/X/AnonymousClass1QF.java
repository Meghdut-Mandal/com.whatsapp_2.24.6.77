package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1QF  reason: invalid class name */
public final class AnonymousClass1QF extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Double A02;
    public Double A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;

    public AnonymousClass1QF() {
        super(2054, new C18950u5(1, 1, 1, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(15, this.A00);
        r3.Bpz(4, this.A04);
        r3.Bpz(9, this.A05);
        r3.Bpz(8, this.A06);
        r3.Bpz(1, this.A09);
        r3.Bpz(2, this.A02);
        r3.Bpz(11, this.A01);
        r3.Bpz(14, this.A0A);
        r3.Bpz(5, this.A07);
        r3.Bpz(7, this.A03);
        r3.Bpz(6, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(13, (Object) null);
        linkedHashMap.put(15, this.A00);
        linkedHashMap.put(17, (Object) null);
        linkedHashMap.put(3, (Object) null);
        linkedHashMap.put(4, this.A04);
        linkedHashMap.put(10, (Object) null);
        linkedHashMap.put(9, this.A05);
        linkedHashMap.put(8, this.A06);
        linkedHashMap.put(1, this.A09);
        linkedHashMap.put(16, (Object) null);
        linkedHashMap.put(2, this.A02);
        linkedHashMap.put(12, (Object) null);
        linkedHashMap.put(11, this.A01);
        linkedHashMap.put(14, this.A0A);
        linkedHashMap.put(5, this.A07);
        linkedHashMap.put(7, this.A03);
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
        sb.append("WamAndroidRegDirectMigrationFlow {");
        C20910yM.A00(this.A00, "didReceiveRcFromConsumer", sb);
        AnonymousClass00C.A0D("enteredSamePhoneNumberAsSisterApp", 1);
        Integer num = this.A04;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        C20910yM.A00(obj, "firstMigrationFailureReason", sb);
        Integer num2 = this.A05;
        if (num2 == null) {
            obj2 = null;
        } else {
            obj2 = num2.toString();
        }
        C20910yM.A00(obj2, "migrateMediaResult", sb);
        Integer num3 = this.A06;
        if (num3 == null) {
            obj3 = null;
        } else {
            obj3 = num3.toString();
        }
        C20910yM.A00(obj3, "migratePhoneNumberScreenAction", sb);
        C20910yM.A00(this.A09, "migrationDurationT", sb);
        C20910yM.A00(this.A02, "migrationTotalSize", sb);
        C20910yM.A00(this.A01, "otherFilesMigrationFailed", sb);
        C20910yM.A00(this.A0A, "providerAppVersionCode", sb);
        Integer num4 = this.A07;
        if (num4 == null) {
            obj4 = null;
        } else {
            obj4 = num4.toString();
        }
        C20910yM.A00(obj4, "secondMigrationFailureReason", sb);
        C20910yM.A00(this.A03, "spacePredictedToNeed", sb);
        Integer num5 = this.A08;
        if (num5 == null) {
            obj5 = null;
        } else {
            obj5 = num5.toString();
        }
        C20910yM.A00(obj5, "thirdMigrationFailureReason", sb);
        sb.append("}");
        String obj6 = sb.toString();
        AnonymousClass00C.A08(obj6);
        return obj6;
    }
}
