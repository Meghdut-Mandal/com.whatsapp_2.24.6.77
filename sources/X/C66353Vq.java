package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Vq  reason: invalid class name and case insensitive filesystem */
public class C66353Vq implements C25711Hj {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C66353Vq(Context context, AnonymousClass9XI r2, C199439fJ r3, UserJid userJid, int i) {
        this.A04 = i;
        this.A00 = r2;
        this.A01 = context;
        this.A02 = userJid;
        this.A03 = r3;
    }

    public final void accept(Object obj) {
        String str;
        if (this.A04 != 0) {
            AnonymousClass9XI r3 = (AnonymousClass9XI) this.A00;
            Context context = (Context) this.A01;
            UserJid userJid = (UserJid) this.A02;
            C199439fJ r4 = (C199439fJ) this.A03;
            String str2 = (String) obj;
            switch (str2.hashCode()) {
                case -839883634:
                    str = "PERMANENT";
                    break;
                case 181990675:
                    if (str2.equals("UNBLOCKED")) {
                        r3.A01(userJid).A0A(new C66353Vq(context, r3, r4, userJid, 0));
                        return;
                    }
                    return;
                case 476614193:
                    str = "TEMPORARY";
                    break;
                default:
                    return;
            }
            if (str2.equals(str)) {
                r4.A02(context, str2);
                return;
            }
            return;
        }
        AnonymousClass9XI r42 = (AnonymousClass9XI) this.A00;
        Context context2 = (Context) this.A01;
        AnonymousClass11F r2 = (AnonymousClass11F) this.A02;
        if (AnonymousClass000.A1X(obj)) {
            r42.A02.A0M(r2);
            r42.A00.A06(context2, AnonymousClass190.A0m(context2, r2, (Integer) null, 16));
            return;
        }
        C199439fJ.A00(context2);
    }
}
