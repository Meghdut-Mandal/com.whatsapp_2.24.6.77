package X;

import android.os.Message;
import com.whatsapp.R;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4KR  reason: invalid class name */
public class AnonymousClass4KR implements C25711Hj {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public AnonymousClass4KR(DeepLinkActivity deepLinkActivity, UserJid userJid, String str, int i, boolean z) {
        this.A04 = i;
        this.A00 = deepLinkActivity;
        if (i != 0) {
            this.A03 = z;
            this.A01 = userJid;
            this.A02 = str;
            return;
        }
        this.A01 = userJid;
        this.A02 = str;
        this.A03 = z;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        Object obj2 = obj;
        if (this.A04 != 0) {
            DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A00;
            boolean z = this.A03;
            UserJid userJid = (UserJid) this.A01;
            String str3 = this.A02;
            if (AnonymousClass000.A1X(obj2)) {
                AnonymousClass9Y1 r1 = deepLinkActivity.A0F;
                if (z) {
                    str2 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                } else {
                    str2 = null;
                }
                r1.A02(6, "product_link", str2);
                boolean A1V = C36431kI.A1V(deepLinkActivity, userJid);
                C79593ty A002 = AnonymousClass3SM.A00(deepLinkActivity, AnonymousClass190.A1S(deepLinkActivity, false, false), deepLinkActivity.A05, deepLinkActivity.A0E, deepLinkActivity.A0F, deepLinkActivity.A0G, userJid, str3, A1V);
                Message obtain = Message.obtain(deepLinkActivity.A00, 1);
                obtain.arg1 = R.string.f12nameremoved;
                deepLinkActivity.A00.sendMessageDelayed(obtain, 500);
                A002.A0A(new AnonymousClass3IU(deepLinkActivity, R.string.f12nameremoved, 0));
                DeepLinkActivity.A0H(deepLinkActivity, userJid, "product_link", z);
                return;
            }
            C39001qm A003 = AnonymousClass3LW.A00(deepLinkActivity);
            A003.A0c(R.string.f12nameremoved);
            A003.A0d(R.string.f12nameremoved);
            A003.A0m(deepLinkActivity, new C66033Uk(deepLinkActivity, 32), R.string.f12nameremoved);
            A003.A0k(deepLinkActivity, new C66033Uk(deepLinkActivity, 33));
            C36341k9.A11(A003);
            return;
        }
        DeepLinkActivity deepLinkActivity2 = (DeepLinkActivity) this.A00;
        UserJid userJid2 = (UserJid) this.A01;
        String str4 = this.A02;
        boolean z2 = this.A03;
        String str5 = (String) obj2;
        switch (str5.hashCode()) {
            case -839883634:
                str = "PERMANENT";
                break;
            case 181990675:
                if (str5.equals("UNBLOCKED")) {
                    deepLinkActivity2.A0D.A01(userJid2).A0A(new AnonymousClass4KR(deepLinkActivity2, userJid2, str4, 1, z2));
                    return;
                }
                return;
            case 476614193:
                str = "TEMPORARY";
                break;
            default:
                return;
        }
        if (str5.equals(str)) {
            deepLinkActivity2.A0H.A01(deepLinkActivity2, new C89754Xt(deepLinkActivity2, 1), str5);
        }
    }
}
