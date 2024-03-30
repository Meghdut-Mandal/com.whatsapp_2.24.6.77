package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: X.741  reason: invalid class name */
public class AnonymousClass741 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public AnonymousClass741(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A07 = i;
        this.A05 = obj;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A00 = obj5;
        this.A02 = obj6;
        this.A06 = str;
    }

    public void run() {
        switch (this.A07) {
            case 0:
                AnonymousClass6OQ r7 = new AnonymousClass6OQ(C145546u7.A0B, 0L, "", "", (String) null, 0, 0);
                C128936Ee r9 = (C128936Ee) this.A02;
                Integer num = (Integer) this.A03;
                C160057kO r8 = (C160057kO) this.A00;
                ((C145546u7) this.A05).BlX(r7, r8, r9, num, this.A06, (PublicKey) this.A04, (X509Certificate) this.A01);
                return;
            case 1:
                List list = (List) this.A01;
                String str = this.A06;
                C1272667p r2 = (C1272667p) this.A02;
                C1508977e r4 = (C1508977e) this.A03;
                C128936Ee r1 = (C128936Ee) this.A04;
                C36321k7.A0y(list, r2);
                AnonymousClass00C.A0D(r4, 4);
                C130276Kl.A00(r1, r2, (C130276Kl) this.A00, r4, str, list, (List) this.A05);
                return;
            default:
                C134876bk r22 = (C134876bk) this.A01;
                AnonymousClass63j r3 = (AnonymousClass63j) this.A03;
                C1509077f r5 = (C1509077f) this.A04;
                C128936Ee r12 = (C128936Ee) this.A05;
                AnonymousClass00C.A0D(r22, 1);
                C130296Kn.A00(r12, r22, r3, (C130296Kn) this.A00, r5, this.A06, (List) this.A02);
                return;
        }
    }
}
