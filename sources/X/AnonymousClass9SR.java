package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.9SR  reason: invalid class name */
public final class AnonymousClass9SR {
    public final C200049gU A00;
    public final C24611Dc A01 = C165597tg.A0S("PaymentProviderKeyAction");
    public final Context A02;
    public final AnonymousClass17Y A03;
    public final C29221Vu A04;
    public final C29121Vk A05;
    public final String A06;

    public final void A00(B1Q b1q, String str) {
        AnonymousClass00C.A0D(str, 0);
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("action", "get-provider-key", A0I);
        C36381kD.A1M("provider", str, A0I);
        C36381kD.A1M("key-scope", this.A06, A0I);
        C203399nx A042 = C203399nx.A04("account", C165577te.A1a(A0I, 0));
        C29121Vk r0 = this.A05;
        Context context = this.A02;
        AnonymousClass17Y r5 = this.A03;
        C165597tg.A1C(r0, new B7J(context, this.A04, r5, b1q, this, 15), A042);
    }

    public AnonymousClass9SR(Context context, AnonymousClass17Y r3, C29221Vu r4, C29121Vk r5, C200049gU r6, String str) {
        C36321k7.A1B(context, r3, r5, r4, r6);
        this.A02 = context;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A00 = r6;
        this.A06 = str;
    }
}
