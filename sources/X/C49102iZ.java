package X;

import android.view.View;

/* renamed from: X.2iZ  reason: invalid class name and case insensitive filesystem */
public class C49102iZ extends C132446Tt {
    public final C117025la A00;
    public final AnonymousClass6N7 A01;

    public C49102iZ(AnonymousClass012 r2, C117025la r3, AnonymousClass6N7 r4) {
        super(r2, true);
        this.A01 = r4;
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C88924Uo A0c = C36431kI.A0c(this.A01, (String) null, 7, false);
        if (!C36431kI.A1Y(this)) {
            return A0c;
        }
        A0c.close();
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass6F9 r2;
        C88924Uo r5 = (C88924Uo) obj;
        AnonymousClass6YT r3 = this.A00.A00;
        r3.A0g.A02 = r5;
        if (r3.A0O) {
            if (!(r5 == null || (r2 = r3.A0F) == null)) {
                C41041wW r1 = r2.A04;
                if (r1 != null) {
                    r1.A06.A02();
                    C88924Uo r0 = r1.A00;
                    if (r0 != null) {
                        r0.close();
                        r1.A00 = null;
                    }
                    r1.A00 = r5;
                    r1.A06();
                }
                View view = r2.A01;
                if (view != null) {
                    view.setVisibility(C36351kA.A00(r2.A0C ? 1 : 0));
                }
            }
            AnonymousClass02E r12 = r3.A0Y;
            if (r12 instanceof C160017kK) {
                ((C160017kK) r12).Bn7();
            }
        }
    }
}
