package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.70X  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70X implements C25711Hj {
    public final /* synthetic */ AnonymousClass11F A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C146506vi A02;
    public final /* synthetic */ C122725vK A03;
    public final /* synthetic */ C29951Yq A04;
    public final /* synthetic */ AnonymousClass3T1 A05;
    public final /* synthetic */ C135066c4 A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ CountDownLatch A08;

    public /* synthetic */ AnonymousClass70X(AnonymousClass11F r1, UserJid userJid, C146506vi r3, C122725vK r4, C29951Yq r5, AnonymousClass3T1 r6, C135066c4 r7, Integer num, CountDownLatch countDownLatch) {
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = userJid;
        this.A05 = r6;
        this.A07 = num;
        this.A02 = r3;
        this.A08 = countDownLatch;
    }

    public final void accept(Object obj) {
        C29951Yq r4 = this.A04;
        C122725vK r3 = this.A03;
        C135066c4 r8 = this.A06;
        AnonymousClass11F r5 = this.A00;
        UserJid userJid = this.A01;
        AnonymousClass3T1 r7 = this.A05;
        Integer num = this.A07;
        C146506vi r2 = this.A02;
        CountDownLatch countDownLatch = this.A08;
        if (AnonymousClass000.A0I(obj) == 0) {
            r3.A01 = 1;
            r3.A03 = r4.A02(r5, userJid, r7, r8, num);
            r3.A02 = r2;
        } else {
            r3.A01 = 3;
        }
        countDownLatch.countDown();
    }
}
