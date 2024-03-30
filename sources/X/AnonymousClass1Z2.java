package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.1Z2  reason: invalid class name */
public final class AnonymousClass1Z2 {
    public final C19730wQ A00;
    public final AnonymousClass1RU A01;
    public final AnonymousClass1Z0 A02;
    public final C19770wU A03;

    public AnonymousClass1Z2(C19730wQ r2, AnonymousClass1RU r3, AnonymousClass1Z0 r4, C19770wU r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r4, 4);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void A01(Context context, Runnable runnable, String str, String str2) {
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00C.A0D(str, 1);
        AnonymousClass00C.A0D(str2, 2);
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0r(false);
        A002.A0d(R.string.f12nameremoved);
        A002.A0p(context.getString(R.string.f12nameremoved, new Object[]{str2}));
        A002.A0h(new C133546Yy(context, this, runnable, str), R.string.f12nameremoved);
        A002.A0f(new AnonymousClass4XK(runnable, 4), R.string.f12nameremoved);
        A002.A0b();
    }

    public final boolean A02(AnonymousClass7hE r5) {
        AnonymousClass00C.A0D(r5, 0);
        if (!this.A01.A0A()) {
            return false;
        }
        this.A03.Box(new C162947pP(r5, this, 0), new Void[0]);
        return true;
    }

    public final void A00() {
        if (this.A01.A0B()) {
            this.A03.Boy(new C35711j8(this, 47));
        }
    }
}
