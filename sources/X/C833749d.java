package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.49d  reason: invalid class name and case insensitive filesystem */
public final class C833749d extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C80053ui this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C833749d(C80053ui r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C80053ui r0 = this.this$0;
        AnonymousClass147 r5 = r0.A00;
        String str = r0.A01;
        List list = r0.A02;
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0J.add(new C185648uZ(C36441kJ.A0o(it)));
        }
        return new C186018vH(r5, str, (List) A0J);
    }
}
