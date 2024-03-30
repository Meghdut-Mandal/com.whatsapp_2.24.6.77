package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.9SK  reason: invalid class name */
public class AnonymousClass9SK {
    public final C22968AzK A00;
    public final C24611Dc A01 = C165597tg.A0S("PaymentGetTokenIdAction");
    public final Context A02;
    public final AnonymousClass17Y A03;
    public final C29221Vu A04;
    public final C29121Vk A05;

    public AnonymousClass9SK(Context context, AnonymousClass17Y r3, C29221Vu r4, C29121Vk r5, C22968AzK azK) {
        this.A02 = context;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A00 = azK;
    }

    public void A00(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A00.BfM((C202059ky) null, (String) null);
            return;
        }
        this.A01.A06("starts to fetch token id");
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("action", "get-token-id", A0I);
        C36381kD.A1M("credential-id", str, A0I);
        C203399nx A06 = C203399nx.A06(A0I);
        this.A05.A0H(new B7H(this.A02, this.A04, this.A03, this, 10), A06, "get", 0);
    }
}
