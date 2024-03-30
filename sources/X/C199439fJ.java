package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.9fJ  reason: invalid class name and case insensitive filesystem */
public final class C199439fJ {
    public final AnonymousClass16D A00;
    public final AnonymousClass185 A01;
    public final AnonymousClass171 A02;

    public static final void A00(Context context) {
        AnonymousClass00C.A0D(context, 0);
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0c(R.string.f12nameremoved);
        A002.A0d(R.string.f12nameremoved);
        A002.A0h(C204059pO.A00, R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public final void A01(Context context, C22920AyW ayW, String str) {
        int i;
        int i2;
        AnonymousClass00C.A0D(str, 0);
        if (str.equals("PERMANENT")) {
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
        } else if (str.equals("TEMPORARY")) {
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
        } else {
            return;
        }
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0c(i2);
        A002.A0d(i);
        A002.A0h(new B8F(ayW, this, 1), R.string.f12nameremoved);
        B87.A00(A002, ayW, 2);
        C36341k9.A11(A002);
    }

    public C199439fJ(AnonymousClass16D r1, AnonymousClass185 r2, AnonymousClass171 r3) {
        C36321k7.A11(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A02(Context context, String str) {
        C36321k7.A0w(str, context);
        A01(context, (C22920AyW) null, str);
    }
}
