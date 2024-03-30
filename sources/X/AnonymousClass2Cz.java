package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2Cz  reason: invalid class name */
public class AnonymousClass2Cz extends C142266ob {
    public final C61053Aj A00;

    public AnonymousClass2Cz(C61053Aj r2) {
        super("bk.action.support.OpenContactSupport");
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object B6u(AnonymousClass6MO r21, C115215iW r22, C124125xd r23) {
        C100674vP r4 = (C100674vP) r23;
        if (r22.A00.equals("bk.action.support.OpenContactSupport")) {
            List list = r21.A00;
            String A0s = C36401kF.A0s(list, 0);
            String A0s2 = C36401kF.A0s(list, 1);
            C61053Aj r3 = this.A00;
            Activity A01 = C142326oh.A01(r4);
            AnonymousClass00C.A0D(A01, 0);
            C36321k7.A0v(A0s, 1, A0s2);
            C19600wD r10 = r3.A01;
            if (!r10.A09()) {
                Log.i("about/no-connectivity");
                AnonymousClass3P9 A002 = AnonymousClass3P9.A00(C36341k9.A0e(A01, new Object[1], R.string.f12nameremoved, 0, R.string.f12nameremoved));
                C66333Vo r1 = C66333Vo.A00;
                A002.A03 = R.string.f12nameremoved;
                A002.A06 = r1;
                C36421kH.A1A(A002.A02(), (AnonymousClass01I) A01);
            } else {
                AnonymousClass3XH r13 = new AnonymousClass3XH(A0s2, A0s);
                if (r3.A04.A0E(7752)) {
                    Intent A0D = C36431kI.A0D();
                    A0D.setClassName(A01.getPackageName(), "com.whatsapp.inappsupport.ui.SupportAiActivity");
                    A0D.putExtra("com.whatsapp.inappsupport.ui.SupportAiActivity.supportUserContext", r13);
                    A01.startActivity(A0D);
                    r3.A06.A02(1, r13.A01);
                    return null;
                }
                C36441kJ.A1E(new C50072kA((Bundle) null, (C225314u) A01, r3.A00, r10, r3.A02, r3.A03, r13, r3.A05, r3.A07, "bloks/support", false, true, false), r3.A08);
                return null;
            }
        }
        return null;
    }
}
