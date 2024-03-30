package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.R;
import com.whatsapp.greenalert.GreenAlertActivity;

/* renamed from: X.4Zm  reason: invalid class name and case insensitive filesystem */
public class C90204Zm implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C90204Zm(View view, Runnable runnable, int i) {
        this.A02 = i;
        if (7 - i != 0) {
            this.A00 = runnable;
            this.A01 = view;
        } else {
            this.A01 = view;
            this.A00 = runnable;
        }
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, Object obj2, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new C90204Zm(obj, obj2, i));
    }

    public final void onGlobalLayout() {
        float f;
        View view;
        switch (this.A02) {
            case 0:
                C46472Xu r0 = (C46472Xu) this.A00;
                View view2 = (View) this.A01;
                AnonymousClass0CP r4 = r0.A01;
                if (!r0.A05.A01()) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) r4;
                    Resources resources = view2.getResources();
                    int floor = (int) Math.floor((double) (((float) (resources.getDisplayMetrics().widthPixels - (AnonymousClass04F.A03(view2) + AnonymousClass04F.A02(view2)))) / C36441kJ.A00(resources, R.dimen.f7nameremoved)));
                    if (floor != gridLayoutManager.A01) {
                        gridLayoutManager.A1o(floor);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C36351kA.A1C(((AnonymousClass3AC) this.A01).A02, this);
                ((ViewTreeObserver.OnGlobalLayoutListener) this.A00).onGlobalLayout();
                return;
            case 2:
                C70803fk r3 = (C70803fk) this.A00;
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.A01;
                Rect A06 = AnonymousClass001.A06();
                r3.A0R.getWindowVisibleDisplayFrame(A06);
                int height = A06.height() + r3.A05;
                if (height != r3.A03) {
                    layoutParams.height = height;
                    r3.A0I.requestLayout();
                    r3.A03 = height;
                    return;
                }
                return;
            case 3:
                C36351kA.A1C((View) this.A01, this);
                GreenAlertActivity greenAlertActivity = (GreenAlertActivity) this.A00;
                GreenAlertActivity.A0F(greenAlertActivity, greenAlertActivity.A02.getCurrentLogicalItem());
                return;
            case 4:
                View view3 = (View) this.A01;
                C36361kB.A16(view3, this);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(200);
                view3.startAnimation(translateAnimation);
                return;
            case 5:
                View view4 = (View) this.A00;
                C36351kA.A1C(view4, this);
                ViewParent parent = view4.getParent();
                while ((parent instanceof View) && (view = (View) parent) != null) {
                    if (view instanceof ScrollView) {
                        ScrollView scrollView = (ScrollView) view;
                        if (scrollView != null) {
                            scrollView.smoothScrollTo(0, view4.getTop());
                            return;
                        }
                        return;
                    }
                    parent = view.getParent();
                }
                return;
            case 6:
                View view5 = (View) this.A00;
                C36351kA.A1C(view5, this);
                LinearLayout A0U = C36441kJ.A0U(view5, R.id.report_spam_dialog_success_button_layout);
                View findViewById = view5.findViewById(R.id.report_spam_dialog_success_view_report);
                if (((double) (findViewById.getMeasuredWidth() + view5.findViewById(R.id.report_spam_dialog_success_close).getMeasuredWidth())) >= ((double) view5.getMeasuredWidth()) * 0.7d) {
                    A0U.setOrientation(1);
                    AnonymousClass1JZ.A03(findViewById, 0, 0);
                    return;
                }
                return;
            case 7:
                C36361kB.A16((View) this.A01, this);
                C36411kG.A1O(this.A00);
                return;
            case 8:
                View view6 = (View) this.A01;
                C36351kA.A1C(view6, this);
                view6.animate().translationY(-((Context) this.A00).getResources().getDimension(R.dimen.f7nameremoved)).setDuration(250).setInterpolator(new AnonymousClass065()).start();
                return;
            case 9:
                ScrollView scrollView2 = (ScrollView) this.A00;
                boolean A002 = AnonymousClass3MY.A00(scrollView2);
                View view7 = (View) this.A01;
                if (A002) {
                    f = view7.getResources().getDimension(R.dimen.f7nameremoved);
                } else {
                    f = 0.0f;
                }
                view7.setElevation(f);
                C36361kB.A16(scrollView2, this);
                return;
            case 10:
                C36411kG.A1O(this.A00);
                C36351kA.A1C((View) this.A01, this);
                return;
            default:
                C36351kA.A1C((View) this.A01, this);
                ((AnonymousClass00S) this.A00).invoke();
                return;
        }
    }

    public C90204Zm(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }
}
