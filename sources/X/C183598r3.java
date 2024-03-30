package X;

/* renamed from: X.8r3  reason: invalid class name and case insensitive filesystem */
public class C183598r3 extends C132446Tt {
    public final /* synthetic */ AnonymousClass9SA A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;

    public C183598r3(AnonymousClass9SA r1, Runnable runnable, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = runnable;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A02.A0K(this.A02);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C202319lY r6 = (C202319lY) obj;
        if (r6 != null) {
            AnonymousClass9SA r4 = this.A00;
            C23031B1c b1c = r4.A03;
            if (b1c.BtR(r6.A02)) {
                AnonymousClass2bZ r0 = r4.A00;
                C18740tg.A06(r0);
                b1c.Bts(r6, r4.A00.A1J.A00, r0.A1N);
                this.A00.A01 = null;
            }
        }
        this.A01.run();
        this.A00.A01 = null;
    }
}
