package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6dO  reason: invalid class name and case insensitive filesystem */
public class C135866dO implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final int A01;
    public final View A02;
    public final List A03 = Collections.synchronizedList(C90524aI.A0l());

    public C135866dO(View view, boolean z) {
        float f;
        this.A02 = view;
        this.A00 = z;
        float A002 = 100.0f * C36341k9.A00(view.getContext());
        if (A002 >= 0.0f) {
            f = A002 + 0.5f;
        } else {
            f = A002 - 0.5f;
        }
        this.A01 = (int) f;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public static int A00(View view) {
        Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (view.getRootWindowInsets() != null) {
            defaultDisplay.getRealSize(point);
            return point.y - view.getRootWindowInsets().getStableInsetBottom();
        }
        defaultDisplay.getSize(point);
        return point.y;
    }

    public void onGlobalLayout() {
        int i;
        C160377ku A0X;
        Rect A06 = AnonymousClass001.A06();
        View view = this.A02;
        view.getWindowVisibleDisplayFrame(A06);
        if (Build.VERSION.SDK_INT >= 23) {
            i = A00(view);
        } else {
            Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        int i2 = i - A06.bottom;
        boolean z = this.A00;
        int i3 = this.A01;
        if (!z) {
            if (i2 > i3) {
                this.A00 = true;
                List<C122075uG> list = this.A03;
                synchronized (list) {
                    for (C122075uG r7 : list) {
                        if (r7 != null) {
                            C140456lc r1 = r7.A03;
                            C160377ku A0X2 = r1.A0X(43);
                            if (A0X2 != null) {
                                C140456lc r4 = r7.A02;
                                C1273868b A012 = C1273868b.A01(r4);
                                C1271967i r2 = r7.A01;
                                A012.A09(r2, 1);
                                A012.A09(Integer.valueOf((int) (((float) i2) / C36341k9.A00(r7.A00))), 2);
                                C1273868b.A06(r2, r4, A012, A0X2);
                            } else {
                                C160377ku A0X3 = r1.A0X(36);
                                if (A0X3 != null) {
                                    C131756Qk.A02(r7.A01, r7.A02, new AnonymousClass6MO(C1273868b.A00().A00), A0X3);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i2 > i3) {
            List<C122075uG> list2 = this.A03;
            synchronized (list2) {
                for (C122075uG r22 : list2) {
                    if (!(r22 == null || (A0X = r22.A03.A0X(38)) == null)) {
                        C140456lc r42 = r22.A02;
                        C1273868b A013 = C1273868b.A01(r42);
                        C1271967i r23 = r22.A01;
                        A013.A09(r23, 1);
                        A013.A09(Integer.valueOf((int) (((float) i2) / C36341k9.A00(r22.A00))), 2);
                        C1273868b.A06(r23, r42, A013, A0X);
                    }
                }
            }
        } else if (i2 < i3) {
            this.A00 = false;
            List<C122075uG> list3 = this.A03;
            synchronized (list3) {
                for (C122075uG r5 : list3) {
                    if (r5 != null) {
                        C140456lc r12 = r5.A03;
                        C160377ku A0X4 = r12.A0X(42);
                        if (A0X4 != null) {
                            C140456lc r3 = r5.A02;
                            C1273868b A022 = C1273868b.A02(r3);
                            C1271967i r0 = r5.A01;
                            A022.A09(r0, 1);
                            C1273868b.A06(r0, r3, A022, A0X4);
                        } else {
                            C160377ku A0E = C140456lc.A0E(r12);
                            if (A0E != null) {
                                C131756Qk.A02(r5.A01, r5.A02, new AnonymousClass6MO(C1273868b.A00().A00), A0E);
                            }
                        }
                    }
                }
            }
        }
    }
}
