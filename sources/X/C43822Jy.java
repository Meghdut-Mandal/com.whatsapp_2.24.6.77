package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.2Jy  reason: invalid class name and case insensitive filesystem */
public final class C43822Jy extends C70693fZ {
    public final C24801Dv A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass17X A02;
    public final C20500xf A03;
    public final AnonymousClass1EL A04;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.vec_ic_chat_filled);
    }

    public String BIN(C88744Tw r5) {
        String A0w;
        AnonymousClass00C.A0D(r5, 0);
        String BBB = r5.BBB();
        Context context = r5.getContext();
        if (BBB == null) {
            A0w = context.getString(R.string.f12nameremoved);
        } else {
            A0w = C36351kA.A0w(context, BBB, 1, R.string.f12nameremoved);
        }
        AnonymousClass00C.A08(A0w);
        return A0w;
    }

    public C43822Jy(C24801Dv r1, AnonymousClass16D r2, AnonymousClass17X r3, C20500xf r4, AnonymousClass1EL r5) {
        C36321k7.A1B(r4, r1, r2, r5, r3);
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
    }

    public boolean BBr() {
        return true;
    }

    public int getId() {
        return 11;
    }
}
