package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3op  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C76413op implements AnonymousClass7hL {
    public final /* synthetic */ C45292Qu A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ CountDownLatch A04;

    public /* synthetic */ C76413op(C45292Qu r1, UserJid userJid, Boolean bool, Boolean bool2, CountDownLatch countDownLatch) {
        this.A02 = bool;
        this.A00 = r1;
        this.A03 = bool2;
        this.A01 = userJid;
        this.A04 = countDownLatch;
    }

    public final void Ba6(Integer num) {
        int intValue;
        Boolean bool = this.A02;
        C45292Qu r4 = this.A00;
        Boolean bool2 = this.A03;
        UserJid userJid = this.A01;
        CountDownLatch countDownLatch = this.A04;
        if (bool.booleanValue()) {
            r4.A00 = num;
        }
        if (bool2.booleanValue() && num != null && ((intValue = num.intValue()) == 2 || intValue == 3)) {
            r4.A04 = userJid.getRawString();
        }
        countDownLatch.countDown();
    }
}
