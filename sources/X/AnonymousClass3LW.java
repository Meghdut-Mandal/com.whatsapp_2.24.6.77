package X;

import android.content.Context;
import androidx.appcompat.app.AlertDialog$Builder;

/* renamed from: X.3LW  reason: invalid class name */
public abstract class AnonymousClass3LW {
    public static final C39001qm A00(Context context) {
        AlertDialog$Builder alertDialog$Builder;
        AnonymousClass00C.A0D(context, 0);
        if (AnonymousClass1MI.A02(((C18800tq) C19570wA.A00(C18800tq.class, context.getApplicationContext())).Azp(), (C21000yV) null, 4240)) {
            alertDialog$Builder = AnonymousClass21S.A00(context);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context);
        }
        return new C39001qm(alertDialog$Builder);
    }

    public static final C39001qm A01(Context context, int i) {
        AlertDialog$Builder alertDialog$Builder;
        if (AnonymousClass1MI.A02(((C18800tq) C19570wA.A00(C18800tq.class, context.getApplicationContext())).Azp(), (C21000yV) null, 4240)) {
            alertDialog$Builder = new AnonymousClass21S(context, i);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, i);
        }
        return new C39001qm(alertDialog$Builder);
    }

    public static C39001qm A02(AnonymousClass02E r0) {
        return A00(r0.A1D());
    }

    public static C39001qm A03(AnonymousClass02E r0) {
        return A00(r0.A0h());
    }

    public static C39001qm A04(AnonymousClass02E r0) {
        return A00(r0.A0a());
    }

    public static C39001qm A05(AnonymousClass02E r0) {
        return A00(r0.A0i());
    }
}
