package X;

import com.whatsapp.jid.UserJid;

public final /* synthetic */ class AW2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C198849eI A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public /* synthetic */ AW2(C198849eI r1, UserJid userJid, Boolean bool, Integer num, String str, String str2, int i, int i2, int i3) {
        this.A03 = r1;
        this.A04 = userJid;
        this.A07 = str;
        this.A00 = i;
        this.A06 = num;
        this.A01 = i2;
        this.A05 = bool;
        this.A08 = str2;
        this.A02 = i3;
    }

    public final void run() {
        Long l;
        C198849eI r5 = this.A03;
        UserJid userJid = this.A04;
        String str = this.A07;
        int i = this.A00;
        Integer num = this.A06;
        int i2 = this.A01;
        Boolean bool = this.A05;
        String str2 = this.A08;
        int i3 = this.A02;
        C207109uZ A072 = r5.A00.A07(userJid);
        if (A072 != null) {
            if (A072.A0X) {
                str = null;
            }
            AnonymousClass9Y1 r52 = r5.A01;
            Integer valueOf = Integer.valueOf(i);
            if (num != null) {
                l = C90484aE.A0h(num);
            } else {
                l = null;
            }
            Long A0y = C36441kJ.A0y(i2);
            r52.A0A.Boy(new AW3(r52, userJid, bool, valueOf, Integer.valueOf(i3), l, A0y, str, str2));
        }
    }
}
