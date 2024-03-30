package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.2Jp  reason: invalid class name and case insensitive filesystem */
public final class C43732Jp extends C43752Jr {
    public final C77453qW A00;
    public final C199859g8 A01;
    public final AnonymousClass17X A02;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_action_reply);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43732Jp(C24801Dv r1, AnonymousClass319 r2, AnonymousClass17X r3, C77453qW r4, C199859g8 r5) {
        super(r1, r2, r3);
        C36321k7.A18(r5, r3, r1, r2);
        this.A01 = r5;
        this.A02 = r3;
        this.A00 = r4;
    }

    public String BIN(C88744Tw r3) {
        return C36381kD.A0s(C36341k9.A0C(r3).getResources(), R.string.f12nameremoved);
    }

    public int getId() {
        return 1;
    }
}
