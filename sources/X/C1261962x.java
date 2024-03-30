package X;

/* renamed from: X.62x  reason: invalid class name and case insensitive filesystem */
public class C1261962x {
    public final /* synthetic */ AnonymousClass3DG A00;
    public final /* synthetic */ AnonymousClass3P5 A01;
    public final /* synthetic */ byte[][] A02;

    public C1261962x(AnonymousClass3DG r1, AnonymousClass3P5 r2, byte[][] bArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = bArr;
    }

    public void A00(String str, String str2, int i) {
        Integer num;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("keytransparencymanager/serializedlookup IQ with id: ");
        A0u.append(str);
        A0u.append(" received error code: ");
        A0u.append(i);
        C36321k7.A1P(" and error text: ", str2, A0u);
        C87954Qv r1 = this.A00.A01;
        if (i == 16792) {
            num = C023109s.A01;
        } else {
            num = C023109s.A0C;
        }
        r1.BU5(num);
    }
}
