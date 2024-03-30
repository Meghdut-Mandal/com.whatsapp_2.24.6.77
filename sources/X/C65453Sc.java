package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.3Sc  reason: invalid class name and case insensitive filesystem */
public abstract class C65453Sc {
    public static final int A00(int i, boolean z) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 11;
            case 2:
                return 14;
            case 3:
                return 10;
            case 4:
                return 8;
            case 5:
                return z ? 12 : 4;
            case 6:
                return 13;
            case 7:
                return 9;
            default:
                return 15;
        }
    }

    public static final void A01(Activity activity, View view, int i) {
        View view2;
        AnonymousClass00C.A0D(activity, 0);
        Window window = activity.getWindow();
        if (view != null) {
            view2 = view;
        } else if (window != null) {
            view2 = window.getDecorView();
        } else {
            return;
        }
        C99304t3 A00 = C99304t3.A00(view2, i, -1);
        AnonymousClass0Eq r2 = A00.A0J;
        AnonymousClass00C.A08(r2);
        if (view == null) {
            C90204Zm.A00(r2.getViewTreeObserver(), activity, r2, 8);
        }
        TextView A0P = C36391kE.A0P(r2, R.id.snackbar_text);
        if (A0P != null) {
            A0P.setSingleLine(false);
        }
        A00.A0P();
    }

    public static final boolean A02(C19970wo r5, C20810yC r6, AnonymousClass3T1 r7) {
        C36331k8.A1I(r6, r5);
        Long l = r7.A0g;
        if (l != null && C36391kE.A0B(C36441kJ.A0A(l.longValue())) > C36441kJ.A0B(r6, 1698)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(AnonymousClass3T1 r1) {
        AnonymousClass00C.A0D(r1, 0);
        if (1 != r1.A0E()) {
            return false;
        }
        return true;
    }
}
