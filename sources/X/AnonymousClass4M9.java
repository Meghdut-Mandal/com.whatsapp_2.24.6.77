package X;

import android.os.Message;
import com.whatsapp.R;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4M9  reason: invalid class name */
public class AnonymousClass4M9 implements C25711Hj {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public final int A05;

    public AnonymousClass4M9(DeepLinkActivity deepLinkActivity, UserJid userJid, int i, int i2, boolean z, boolean z2) {
        this.A05 = i2;
        this.A01 = deepLinkActivity;
        this.A02 = userJid;
        this.A00 = i;
        if (i2 != 0) {
            this.A03 = z;
            this.A04 = z2;
            return;
        }
        this.A04 = z;
        this.A03 = z2;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        if (this.A05 != 0) {
            DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A01;
            UserJid userJid = (UserJid) this.A02;
            int i = this.A00;
            boolean z = this.A03;
            boolean z2 = this.A04;
            String str3 = (String) obj;
            switch (str3.hashCode()) {
                case -839883634:
                    str2 = "PERMANENT";
                    break;
                case 181990675:
                    if (str3.equals("UNBLOCKED")) {
                        deepLinkActivity.A0D.A01(userJid).A0A(new AnonymousClass4M9(deepLinkActivity, userJid, i, 0, z, z2));
                        return;
                    }
                    return;
                case 476614193:
                    str2 = "TEMPORARY";
                    break;
                default:
                    return;
            }
            if (str3.equals(str2)) {
                deepLinkActivity.A0H.A01(deepLinkActivity, new C89754Xt(deepLinkActivity, 0), str3);
                return;
            }
            return;
        }
        DeepLinkActivity deepLinkActivity2 = (DeepLinkActivity) this.A01;
        UserJid userJid2 = (UserJid) this.A02;
        int i2 = this.A00;
        boolean z3 = this.A04;
        boolean z4 = this.A03;
        if (AnonymousClass000.A1X(obj)) {
            deepLinkActivity2.A0v.A00();
            C79593ty A002 = deepLinkActivity2.A0D.A00(deepLinkActivity2, userJid2, i2, 11);
            Message obtain = Message.obtain(deepLinkActivity2.A00, 1);
            obtain.arg1 = R.string.f12nameremoved;
            deepLinkActivity2.A00.sendMessageDelayed(obtain, 500);
            A002.A0A(new AnonymousClass3IU(deepLinkActivity2, R.string.f12nameremoved, 0));
            if (z3) {
                str = "wa_pages";
            } else {
                str = "catalog_link";
            }
            DeepLinkActivity.A0H(deepLinkActivity2, userJid2, str, z4);
            return;
        }
        C39001qm A003 = AnonymousClass3LW.A00(deepLinkActivity2);
        A003.A0c(R.string.f12nameremoved);
        A003.A0d(R.string.f12nameremoved);
        A003.A0m(deepLinkActivity2, new C66033Uk(deepLinkActivity2, 34), R.string.f12nameremoved);
        A003.A0k(deepLinkActivity2, new C66033Uk(deepLinkActivity2, 31));
        C36341k9.A11(A003);
    }
}
