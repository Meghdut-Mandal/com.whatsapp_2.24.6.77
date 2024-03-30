package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5DS  reason: invalid class name */
public class AnonymousClass5DS extends C95774mG {
    public AnonymousClass7h9 A00;
    public final C115475iw A01;

    public AnonymousClass5DS(C115475iw r2) {
        super(C162467od.A00(5));
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        C115475iw r5 = this.A01;
        List list = AnonymousClass0D3.A0I;
        View A0J = C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false);
        AnonymousClass7h9 r3 = this.A00;
        C18800tq r0 = r5.A00.A01;
        return new AnonymousClass5F9(A0J, C36361kB.A0S(r0), C36351kA.A0T(r0), r3);
    }
}
