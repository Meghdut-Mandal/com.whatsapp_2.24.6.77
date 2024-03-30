package X;

import android.view.Choreographer;
import android.view.View;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.6hL  reason: invalid class name and case insensitive filesystem */
public final class C138126hL implements C157057bl {
    public C131186Ob A00;
    public AnonymousClass6P4 A01;
    public List A02;
    public C006302t A03 = AnonymousClass7XK.A00;
    public C006302t A04 = AnonymousClass7XL.A00;
    public final View A05;
    public final C1506776e A06;
    public final C123605wm A07;
    public final C157047bk A08;
    public final Executor A09;
    public final AnonymousClass00T A0A;

    public C138126hL(View view, C158847iK r8) {
        C138116hK r5 = new C138116hK(view);
        C164217rS r0 = new C164217rS(Choreographer.getInstance(), 0);
        this.A05 = view;
        this.A08 = r5;
        this.A09 = r0;
        long j = AnonymousClass6TT.A01;
        C023409w r02 = C023409w.A00;
        this.A01 = new AnonymousClass6P4(new AnonymousClass72L("", r02, r02), j);
        this.A00 = C131186Ob.A00;
        this.A02 = AnonymousClass001.A0I();
        this.A0A = C001400p.A00(C000800j.NONE, new AnonymousClass7JJ(this));
        this.A07 = new C123605wm(r8, r5);
        this.A06 = C1506776e.A02(new C107955Rn[16]);
    }
}
