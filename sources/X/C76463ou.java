package X;

import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.3ou  reason: invalid class name and case insensitive filesystem */
public final class C76463ou implements C159657ji {
    public final /* synthetic */ AnonymousClass1K7 A00;
    public final /* synthetic */ AnonymousClass369 A01;
    public final /* synthetic */ Integer A02;

    public void BXS(AnonymousClass6PH r4, Map map) {
        C36321k7.A1J(r4, "bonsaiblokslauncher/flow failure: error=", C36401kF.A0t(r4, 1));
        this.A01.A01.A00.A02();
        this.A00.A01.A06(R.string.f12nameremoved, 0);
    }

    public C76463ou(AnonymousClass1K7 r1, AnonymousClass369 r2, Integer num) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = num;
    }

    public void BiH(Map map) {
        if (map == null) {
            C21010yW r3 = this.A00.A05;
            C45162Qh r2 = new C45162Qh();
            Integer num = this.A02;
            r2.A00 = 34;
            r2.A02 = 36;
            r2.A01 = num;
            r3.Bly(r2);
            AnonymousClass369 r22 = this.A01;
            r22.A01.A02.A01(r22.A02);
        } else if (map.get("bonsai_tos_accepted_type") != null) {
            C21010yW r32 = this.A00.A05;
            C45162Qh r23 = new C45162Qh();
            Integer num2 = this.A02;
            r23.A00 = 33;
            r23.A02 = 36;
            r23.A01 = num2;
            r32.Bly(r23);
            this.A01.A00.BjC(true);
        } else {
            Object obj = map.get(C52122ov.A02.key);
            if (obj instanceof C128176Bf) {
                C128176Bf r4 = (C128176Bf) obj;
                BXS(new AnonymousClass6PH(Integer.valueOf((int) r4.A00), "IQ_ERROR", r4.A01), map);
            }
        }
    }
}
