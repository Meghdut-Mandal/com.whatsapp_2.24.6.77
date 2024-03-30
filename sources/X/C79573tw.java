package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3tw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79573tw implements C25711Hj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass9XI A02;
    public final /* synthetic */ C199439fJ A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ C79573tw(Context context, AnonymousClass9XI r2, C199439fJ r3, UserJid userJid, Integer num, Integer num2, String str, int i, boolean z, boolean z2) {
        this.A01 = context;
        this.A04 = userJid;
        this.A07 = str;
        this.A08 = z;
        this.A09 = z2;
        this.A00 = i;
        this.A05 = num;
        this.A06 = num2;
        this.A02 = r2;
        this.A03 = r3;
    }

    public final void accept(Object obj) {
        String str;
        Context context = this.A01;
        UserJid userJid = this.A04;
        String str2 = this.A07;
        boolean z = this.A08;
        boolean z2 = this.A09;
        int i = this.A00;
        Integer num = this.A05;
        Integer num2 = this.A06;
        AnonymousClass9XI r1 = this.A02;
        C199439fJ r3 = this.A03;
        String str3 = (String) obj;
        switch (str3.hashCode()) {
            case -839883634:
                str = "PERMANENT";
                break;
            case 181990675:
                if (str3.equals("UNBLOCKED")) {
                    r1.A01(userJid).A0A(new C79563tv(context, r3, userJid, num, num2, str2, i, z, z2));
                    return;
                }
                return;
            case 476614193:
                str = "TEMPORARY";
                break;
            default:
                return;
        }
        if (str3.equals(str)) {
            r3.A02(context, str3);
        }
    }
}
