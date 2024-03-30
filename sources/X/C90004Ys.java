package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.R;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ys  reason: invalid class name and case insensitive filesystem */
public class C90004Ys implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C90004Ys(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        switch (this.A02) {
            case 0:
                View view = (View) this.A01;
                C36351kA.A1D(view, this);
                C68273bd r0 = (C68273bd) this.A00;
                view.post(new C1503374w(this, r0.A02, r0.A04, 26));
                return true;
            case 1:
                C36351kA.A1D((View) this.A00, this);
                ((AnonymousClass02E) this.A01).A0i().A1q();
                return true;
            case 2:
                View view2 = (View) this.A01;
                int height = view2.getHeight();
                View findViewById = ((AnonymousClass01L) this.A00).findViewById(R.id.faq_screen_content);
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom() + height);
                C36351kA.A1D(view2, this);
                return false;
            case 3:
                C605338f r2 = (C605338f) this.A00;
                C18740tg.A01();
                if (r2.A01) {
                    C36351kA.A1D((View) this.A01, this);
                    return true;
                }
                r2.A00 = SystemClock.elapsedRealtime();
                return true;
            case 4:
                UpdatesFragment updatesFragment = (UpdatesFragment) this.A01;
                ObservableRecyclerView observableRecyclerView = updatesFragment.A0E;
                if (!(observableRecyclerView == null || (viewTreeObserver = observableRecyclerView.getViewTreeObserver()) == null)) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                List list = (List) this.A00;
                if (list == null) {
                    return false;
                }
                AnonymousClass005 r02 = updatesFragment.A0k;
                if (r02 != null) {
                    C36481kN r5 = (C36481kN) C36411kG.A0v(r02);
                    ArrayList A0I = AnonymousClass001.A0I();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        View A0K = C36431kI.A0K(it);
                        A0K.measure(0, 0);
                        int measuredHeight = A0K.getMeasuredHeight();
                        int[] A1O = C36441kJ.A1O();
                        A1O[0] = 0;
                        A1O[1] = measuredHeight;
                        ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
                        ofInt.addListener(new AnonymousClass4VI(A0K, measuredHeight, 5));
                        C53562rW.A00(ofInt, A0K, 16);
                        A0I.add(ofInt);
                    }
                    AnimatorSet animatorSet = r5.A00;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet A0C = C36441kJ.A0C();
                    A0C.setInterpolator(new DecelerateInterpolator());
                    A0C.setDuration(250);
                    A0C.playTogether(A0I);
                    A0C.addListener(r5);
                    A0C.start();
                    r5.A00 = A0C;
                    return false;
                }
                throw C36331k8.A0d("collapseSublistAnimatorLazy");
            default:
                C36351kA.A1D((View) this.A01, this);
                C36411kG.A1O(this.A00);
                return true;
        }
    }
}
