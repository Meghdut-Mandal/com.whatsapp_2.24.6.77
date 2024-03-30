package X;

import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.6SM  reason: invalid class name */
public class AnonymousClass6SM {
    public boolean A00;
    public final Handler A01;
    public final Vibrator A02;
    public final View A03;
    public final C91094bS A04;
    public final Runnable A05;
    public final Runnable A06;

    public static void A00(AnonymousClass6SM r3) {
        C91094bS r2 = r3.A04;
        r2.A00 = C36341k9.A0F(r3.A03).getColor(R.color.f6nameremoved);
        r2.invalidateSelf();
    }

    public static boolean A01(AnonymousClass6SM r1, float f, float f2) {
        View view = r1.A03;
        if (f < ((float) view.getLeft()) || f > ((float) view.getRight()) || f2 < ((float) view.getTop()) || f2 > ((float) view.getBottom())) {
            return false;
        }
        return true;
    }

    public AnonymousClass6SM(Handler handler, View view, C21060yb r7, C18820ts r8, C91094bS r9) {
        this.A03 = view;
        this.A04 = r9;
        this.A01 = handler;
        C011504z.A04(new C100744vb(r9, r8), view);
        AnonymousClass00C.A0D(view, 0);
        this.A06 = new AnonymousClass73E(view, 0.0f, 1.0f, 0);
        this.A05 = new AnonymousClass73E(view, 1.0f, 0.0f, 4);
        this.A02 = r7.A0H();
        A00(this);
    }
}
