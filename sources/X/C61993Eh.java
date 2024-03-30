package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Eh  reason: invalid class name and case insensitive filesystem */
public final class C61993Eh {
    public final C19730wQ A00;
    public final AnonymousClass155 A01;
    public final C61703Dc A02 = new C61703Dc(this);
    public final C586430m A03;
    public final AnonymousClass00T A04;
    public final AnonymousClass00T A05;

    public static AnonymousClass3KY A00(C61993Eh r1, Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        return (AnonymousClass3KY) r1.A04.getValue();
    }

    public C61993Eh(C19730wQ r2, AnonymousClass155 r3, C87104Nm r4, C87814Qg r5, AnonymousClass147 r6, int i) {
        C36321k7.A1B(r3, r2, r4, r5, r6);
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = C36431kI.A1I(new AnonymousClass4FJ(r4, i));
        this.A04 = C36431kI.A1I(new AnonymousClass4HT(this, r5, r6));
        this.A03 = new C586430m(this);
    }

    public final void A01(UserJid userJid) {
        if (!A00(this, userJid).A02()) {
            AnonymousClass3D3 r5 = new AnonymousClass3D3(3);
            AnonymousClass155 r4 = this.A01;
            C19730wQ r3 = this.A00;
            boolean A0M = r3.A0M(userJid);
            int i = R.string.f12nameremoved;
            if (A0M) {
                i = R.string.f12nameremoved;
            }
            String string = r4.getString(i);
            Bundle bundle = r5.A01;
            bundle.putString("title", string);
            boolean A0M2 = r3.A0M(userJid);
            int i2 = R.string.f12nameremoved;
            if (A0M2) {
                i2 = R.string.f12nameremoved;
            }
            bundle.putCharSequence("message", C36361kB.A0m(r4, i2));
            AnonymousClass3D3.A01(bundle, r5, this, userJid);
            AnonymousClass3D3.A00(bundle, r4, r5, R.string.f12nameremoved);
        }
    }
}
