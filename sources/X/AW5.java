package X;

import com.whatsapp.jid.Jid;

public final /* synthetic */ class AW5 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C201549jr A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ AW5(C201549jr r1, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A07 = str;
        this.A00 = i;
        this.A02 = num;
        this.A08 = z;
        this.A03 = num2;
        this.A04 = num3;
        this.A05 = num4;
        this.A09 = z2;
        this.A06 = num5;
    }

    public final void run() {
        C201549jr r7 = this.A01;
        String str = this.A07;
        int i = this.A00;
        Integer num = this.A02;
        boolean z = this.A08;
        Integer num2 = this.A03;
        Integer num3 = this.A04;
        Integer num4 = this.A05;
        boolean z2 = this.A09;
        Integer num5 = this.A06;
        Jid A0i = C36411kG.A0i(str);
        C176668cU r1 = new C176668cU();
        AnonymousClass9Y1 r11 = r7.A00;
        r1.A09 = C36441kJ.A0y(r11.A0D.getAndIncrement());
        r1.A06 = Integer.valueOf(i);
        r1.A0B = r11.A02;
        r1.A0A = r7.A02.A00(A0i);
        r1.A07 = num;
        r1.A01 = Boolean.valueOf(z);
        r1.A02 = num2;
        r1.A03 = num3;
        r1.A04 = num4;
        r1.A00 = Boolean.valueOf(z2);
        r1.A05 = num5;
        r7.A01.Bly(r1);
    }
}
