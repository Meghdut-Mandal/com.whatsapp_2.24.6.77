package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.2Jq  reason: invalid class name and case insensitive filesystem */
public final class C43742Jq extends C43752Jr {
    public final C235718z A00;
    public final C199859g8 A01;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_action_reply);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43742Jq(C24801Dv r1, C235718z r2, AnonymousClass319 r3, AnonymousClass17X r4, C199859g8 r5) {
        super(r1, r3, r4);
        C36321k7.A1B(r1, r5, r2, r4, r3);
        this.A01 = r5;
        this.A00 = r2;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 12;
    }
}
