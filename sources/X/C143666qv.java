package X;

import java.util.List;

/* renamed from: X.6qv  reason: invalid class name and case insensitive filesystem */
public class C143666qv implements C159367jF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C143516qg A02;
    public final /* synthetic */ C144416s9 A03;
    public final /* synthetic */ List A04;

    public C143666qv(C143516qg r1, C144416s9 r2, List list, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = list;
    }

    public void Bav() {
        C143516qg r4 = this.A02;
        C125025zC r3 = r4.A09;
        r3.A03 = 4;
        AnonymousClass63P r2 = new AnonymousClass63P(this.A03, this.A00);
        r3.A07 = r2;
        r2.A00(this.A01, this.A04);
        r4.A0B();
    }

    public void Bdd(Integer num, Integer num2, Integer num3, Integer num4) {
        C143516qg r4 = this.A02;
        C125025zC r3 = r4.A09;
        r3.A03 = 3;
        AnonymousClass63P r2 = new AnonymousClass63P(this.A03, this.A00);
        r3.A07 = r2;
        r2.A00(this.A01, this.A04);
        r3.A09 = num2;
        r3.A0C = num3;
        r3.A0B = num4;
        r3.A0A = num;
        r4.A0B();
    }
}
