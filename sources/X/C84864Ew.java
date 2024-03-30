package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4Ew  reason: invalid class name and case insensitive filesystem */
public final class C84864Ew extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass16D $contactManager;
    public final /* synthetic */ C232317r $participantUserStore;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84864Ew(AnonymousClass16D r2, C232317r r3) {
        super(0);
        this.$contactManager = r2;
        this.$participantUserStore = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList A0I = this.$contactManager.A0I();
        C232317r r4 = this.$participantUserStore;
        ArrayList A0J = C36321k7.A0J(A0I);
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            A0J.add(r4.A0C((AnonymousClass144) C36391kE.A0f(it).A06(AnonymousClass147.class)));
        }
        return A0J;
    }
}
