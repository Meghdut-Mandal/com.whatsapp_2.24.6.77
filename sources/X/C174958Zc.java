package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8Zc  reason: invalid class name and case insensitive filesystem */
public class C174958Zc extends AnonymousClass2IK {
    public boolean A00;

    public void A16() {
        if (!this.A00) {
            this.A00 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
        }
    }

    public C174958Zc(Context context, C89004Uw r2, AnonymousClass2c8 r3) {
        super(context, r2, r3);
        A16();
    }

    public String getMessageString() {
        Context context;
        int i;
        UserJid userJid = ((AnonymousClass2c8) getFMessage()).A00;
        if (this.A0T.A0M(userJid)) {
            context = getContext();
            i = R.string.f12nameremoved;
        } else if (userJid == null) {
            context = getContext();
            i = R.string.f12nameremoved;
        } else {
            return C36351kA.A0w(getContext(), this.A0n.A0X(AnonymousClass6XV.newArrayList(userJid), -1), 1, R.string.f12nameremoved);
        }
        return context.getString(i);
    }
}
