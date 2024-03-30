package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

public final /* synthetic */ class A9C implements C22916AyS {
    public final /* synthetic */ C22916AyS A00;
    public final /* synthetic */ C196089Xp A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ Integer A03;

    public /* synthetic */ A9C(C22916AyS ayS, C196089Xp r2, UserJid userJid, Integer num) {
        this.A01 = r2;
        this.A02 = userJid;
        this.A03 = num;
        this.A00 = ayS;
    }

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        C196089Xp r2 = this.A01;
        UserJid userJid = this.A02;
        Integer num = this.A03;
        C22916AyS ayS = this.A00;
        if (!z) {
            r2.A03.remove(a8i);
        }
        if (!(userJid == null || num == null)) {
            AnonymousClass9R1 r5 = r2.A02;
            int intValue = num.intValue();
            Number A10 = C36441kJ.A10(num, r5.A01);
            if (A10 != null) {
                r5.A00.A04(new C122765vO(userJid, (String) null, z, false), A10.intValue(), intValue);
            }
        }
        ayS.Ba4(bitmap, a8i, z);
    }
}
