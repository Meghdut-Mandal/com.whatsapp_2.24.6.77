package X;

import android.view.View;
import android.widget.PopupWindow;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.3TC  reason: invalid class name */
public abstract class AnonymousClass3TC {
    public static void A01(View view, View view2, PopupWindow popupWindow) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getRootView().getLocationOnScreen(iArr2);
        popupWindow.showAtLocation(view2, 51, ((iArr[0] - Math.max(0, iArr2[0])) + (view.getMeasuredWidth() / 2)) - (popupWindow.getContentView().getMeasuredWidth() / 2), ((iArr[1] - Math.max(0, iArr2[1])) - popupWindow.getContentView().getMeasuredHeight()) - C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    public static int[] A04(int[] iArr) {
        ArrayList A14 = C36441kJ.A14(r5);
        for (int i : iArr) {
            if (i != 65039) {
                AnonymousClass000.A1F(A14, i);
            }
        }
        int size = A14.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = AnonymousClass000.A0I(A14.get(i2));
        }
        return iArr2;
    }

    public static String A00(String str) {
        return new AnonymousClass1XQ(A04(new AnonymousClass1XQ(str).A00)).toString();
    }

    public static boolean A02(CharSequence charSequence) {
        AnonymousClass2MA r9 = new AnonymousClass2MA(charSequence);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            r9.A00 = i;
            long A00 = C1898996a.A00(r9, false);
            int A03 = r9.A03(A00, i);
            if (A00 != -1) {
                return true;
            }
            i += A03;
        }
        return false;
    }

    public static boolean A03(CharSequence charSequence) {
        AnonymousClass2MA r5 = new AnonymousClass2MA(charSequence);
        long A00 = C1898996a.A00(r5, false);
        if (!AnonymousClass000.A1P((A00 > -1 ? 1 : (A00 == -1 ? 0 : -1))) || r5.A03(A00, 0) != r5.A01().length) {
            return false;
        }
        return true;
    }
}
