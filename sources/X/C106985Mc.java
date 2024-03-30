package X;

import java.util.Map;

/* renamed from: X.5Mc  reason: invalid class name and case insensitive filesystem */
public class C106985Mc extends C132446Tt {
    public boolean A00 = false;
    public final C20050ww A01;
    public final C160427kz A02;
    public final C26481Ki A03;
    public final AnonymousClass13E A04;
    public final C21080yd A05;
    public final C24111Bd A06 = new C24111Bd(1, 1000);
    public final Integer A07;
    public final Object A08;
    public final String A09;
    public final Map A0A;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Integer num = (Integer) obj;
        this.A03.A09 = false;
        C160427kz r1 = this.A02;
        if (r1 == null) {
            return;
        }
        if (num.intValue() == 0) {
            r1.onSuccess();
        } else if (this.A00) {
            r1.BjA(num);
        } else {
            r1.BWm(num);
        }
    }

    public C106985Mc(C20050ww r6, C160427kz r7, C26481Ki r8, AnonymousClass13E r9, C21080yd r10, Integer num, Object obj, String str, Map map) {
        this.A01 = r6;
        this.A05 = r10;
        this.A03 = r8;
        this.A04 = r9;
        this.A09 = str;
        this.A08 = obj;
        this.A0A = map;
        this.A02 = r7;
        this.A07 = num;
        r8.A07();
    }
}
