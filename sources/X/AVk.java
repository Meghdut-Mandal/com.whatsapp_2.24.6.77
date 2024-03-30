package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

public class AVk implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public AVk(Object obj, Object obj2, String str, int i, boolean z) {
        this.A04 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
        this.A03 = z;
    }

    public final void run() {
        String str;
        switch (this.A04) {
            case 0:
                C201549jr r6 = (C201549jr) this.A00;
                String str2 = this.A02;
                boolean z = this.A03;
                Jid A0i = C36411kG.A0i(str2);
                C176668cU r2 = new C176668cU();
                AnonymousClass9Y1 r1 = r6.A00;
                r2.A09 = C36441kJ.A0y(r1.A0D.getAndIncrement());
                r2.A06 = 18;
                r2.A08 = (Long) this.A01;
                r2.A0B = r1.A02;
                r2.A01 = Boolean.valueOf(z);
                r2.A0A = r6.A02.A00(A0i);
                r6.A01.Bly(r2);
                return;
            case 1:
                AnonymousClass9XY r62 = (AnonymousClass9XY) this.A00;
                boolean z2 = this.A03;
                Object obj = this.A01;
                String str3 = this.A02;
                AnonymousClass1NG r3 = r62.A05;
                if (z2) {
                    r3.A0K((AnonymousClass3EB) null);
                } else {
                    synchronized (r3) {
                        AnonymousClass00C.A0D(obj, 0);
                        r3.A0J.Boy(new C35491im(r3, obj, str3, 0));
                    }
                }
                r62.A0E.run();
                return;
            default:
                UserJid userJid = (UserJid) this.A01;
                String str4 = this.A02;
                boolean z3 = this.A03;
                C25851Hx r12 = ((DeepLinkActivity) this.A00).A0V;
                if (z3) {
                    str = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                } else {
                    str = null;
                }
                r12.A02(userJid, str4, str, System.currentTimeMillis(), System.currentTimeMillis());
                return;
        }
    }
}
