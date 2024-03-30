package X;

import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.4YP  reason: invalid class name */
public class AnonymousClass4YP implements AnonymousClass4PC {
    public Object A00;
    public final int A01;

    public AnonymousClass4YP(ConversationsFragment conversationsFragment, int i) {
        this.A01 = i;
        this.A00 = conversationsFragment;
    }

    public final void BV4(AnonymousClass3KG r5) {
        if (this.A01 != 0) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
            AnonymousClass01I A0h = conversationsFragment.A0h();
            if (A0h != null && !A0h.isFinishing()) {
                if (conversationsFragment.A0c.A03(r5)) {
                    conversationsFragment.A0c.A02(r5);
                    conversationsFragment.A08.setVisibility(0);
                    conversationsFragment.A1r(true);
                    C19460v5 r1 = conversationsFragment.A0c.A02;
                    if (r1.A05()) {
                        r1.A02();
                        throw AnonymousClass001.A0A("getSmbBannerType");
                    }
                    return;
                }
                conversationsFragment.A08.setVisibility(8);
                conversationsFragment.A1r(false);
                return;
            }
            return;
        }
        ConversationsFragment conversationsFragment2 = (ConversationsFragment) this.A00;
        AnonymousClass01I A0h2 = conversationsFragment2.A0h();
        if (A0h2 != null && !A0h2.isFinishing()) {
            conversationsFragment2.A0b.A02(r5);
            C19460v5 r12 = conversationsFragment2.A0b.A02;
            if (r12.A05()) {
                r12.A02();
                throw AnonymousClass001.A0A("getSmbBannerType");
            }
        }
    }
}
