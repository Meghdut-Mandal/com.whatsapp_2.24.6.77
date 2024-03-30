package X;

import android.content.Context;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;

/* renamed from: X.67X  reason: invalid class name */
public class AnonymousClass67X {
    public final AnonymousClass16D A00;
    public final C20430xY A01;
    public final C25851Hx A02;
    public final C24801Dv A03;
    public final C19970wo A04;

    public void A00(Context context, C144416s9 r16) {
        AnonymousClass16D r4 = this.A00;
        String str = r16.A0F;
        C222713q r3 = AnonymousClass11F.A00;
        AnonymousClass141 A0i = C36441kJ.A0i(r4, r3.A02(str));
        UserJid A0l = C36431kI.A0l(str);
        C18740tg.A06(A0l);
        this.A02.A02(A0l, "directory", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
        this.A01.A09(C36441kJ.A0i(r4, r3.A02(str)));
        this.A03.A07(context, C90504aG.A0G(context, A0i));
    }

    public void A01(Context context, AnonymousClass141 r10) {
        this.A02.A02((UserJid) r10.A0H, "directory", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, System.currentTimeMillis(), System.currentTimeMillis());
        this.A03.A07(context, C90504aG.A0G(context, r10));
    }

    public AnonymousClass67X(C24801Dv r1, AnonymousClass16D r2, C20430xY r3, C19970wo r4, C25851Hx r5) {
        this.A04 = r4;
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r5;
    }
}
