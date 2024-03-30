package X;

/* renamed from: X.1jM  reason: invalid class name and case insensitive filesystem */
public class C35851jM extends C118095nK {
    public Object A00;
    public Object A01;
    public Object A02;

    public C35851jM(C203399nx r11, int i) {
        int i2;
        C22993Azj azj;
        Object obj;
        Object obj2;
        Object obj3;
        C203399nx r3 = r11;
        switch (i) {
            case 0:
                C203399nx.A0A(r11, "sub_group_suggestion");
                i2 = 0;
                this.A02 = C203539oF.A06(r11, C147956y4.A00, new String[0]);
                AOU aou = AOU.A00;
                String[] strArr = new String[0];
                AnonymousClass00C.A0D(r11, 0);
                try {
                    obj3 = C203539oF.A06(r11, aou, strArr);
                } catch (C235919b unused) {
                    obj3 = null;
                }
                this.A01 = obj3;
                azj = C147966y5.A00;
                break;
            case 1:
                C203399nx.A0A(r11, "sub_group_suggestion");
                i2 = 0;
                this.A01 = C203539oF.A06(r11, AOW.A00, new String[0]);
                AOX aox = AOX.A00;
                String[] strArr2 = new String[0];
                AnonymousClass00C.A0D(r11, 0);
                try {
                    obj2 = C203539oF.A06(r11, aox, strArr2);
                } catch (C235919b unused2) {
                    obj2 = null;
                }
                this.A02 = obj2;
                azj = C147976y6.A00;
                break;
            default:
                C203399nx.A0A(r11, "messages");
                this.A00 = C203539oF.A07(r3, C28981Uw.class, -9007199254740991L, 9007199254740991L, (Object) null, new String[]{"jid"}, false);
                this.A02 = C203539oF.A07(r3, Long.class, 0L, 9007199254740991L, (Object) null, new String[]{"t"}, false);
                C148026yC r4 = C148026yC.A00;
                AnonymousClass00C.A0D(r11, 0);
                this.A01 = C203539oF.A09(r3, r4, new String[]{"message"}, 0, 300);
                break;
        }
        try {
            obj = C203539oF.A06(r11, azj, new String[i2]);
        } catch (C235919b unused3) {
            obj = null;
        }
        this.A00 = obj;
        this.A00 = r11;
    }
}
