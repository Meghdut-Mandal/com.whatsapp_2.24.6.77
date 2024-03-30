package X;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.ClearableEditText;
import com.whatsapp.R;

/* renamed from: X.6SU  reason: invalid class name */
public class AnonymousClass6SU {
    public ValueAnimator A00;
    public ValueAnimator A01;
    public final Activity A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final ClearableEditText A0A;
    public final C18820ts A0B;
    public final C95464l7 A0C;
    public final C104635An A0D;
    public final AnonymousClass1N2 A0E;
    public final C34831hi A0F;

    private void A00(AnimatorListenerAdapter animatorListenerAdapter, int i, int i2, long j) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator == null) {
            float[] A0v = C90524aI.A0v();
            // fill-array-data instruction
            A0v[0] = 0;
            A0v[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
            this.A01 = ofFloat;
            C90494aF.A0q(ofFloat);
        } else {
            valueAnimator.removeAllUpdateListeners();
            this.A01.removeAllListeners();
        }
        this.A01.setDuration(j);
        View view = this.A04;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setVisibility(0);
        this.A01.addUpdateListener(new C111815ct(layoutParams, this, i, view.getWidth(), i2, view.getHeight()));
        this.A01.addListener(animatorListenerAdapter);
        this.A01.start();
    }

    public static void A01(AnonymousClass6SU r11, long j, boolean z) {
        C162337oQ r7;
        int A032;
        int A033;
        AnonymousClass6SU r6 = r11;
        long j2 = j;
        if (z) {
            int width = r6.A0A.getWidth();
            View view = r6.A03;
            int A034 = C36371kC.A03(view, R.dimen.f7nameremoved);
            r7 = new C162337oQ(r6, 21);
            r6.A00(r7, width, A034, j2);
            if (!C36351kA.A1W(r6.A0F)) {
                A033 = C36371kC.A03(view, R.dimen.f7nameremoved);
                A032 = C36371kC.A03(view, R.dimen.f7nameremoved);
            } else {
                return;
            }
        } else {
            View view2 = r6.A03;
            int A035 = C36371kC.A03(view2, R.dimen.f7nameremoved);
            int A036 = C36371kC.A03(view2, R.dimen.f7nameremoved);
            r7 = new C162337oQ(r6, 22);
            r6.A00(r7, A035, A036, j2);
            if (!C36351kA.A1W(r6.A0F)) {
                A032 = C36371kC.A03(view2, R.dimen.f7nameremoved);
                A033 = C36371kC.A03(view2, R.dimen.f7nameremoved);
            } else {
                return;
            }
        }
        ValueAnimator valueAnimator = r6.A00;
        if (valueAnimator == null) {
            float[] A0v = C90524aI.A0v();
            // fill-array-data instruction
            A0v[0] = 0;
            A0v[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
            r6.A00 = ofFloat;
            C90494aF.A0q(ofFloat);
        } else {
            valueAnimator.removeAllUpdateListeners();
            r6.A00.removeAllListeners();
        }
        r6.A00.setDuration(j);
        r6.A00.addUpdateListener(new C111545cS(r6.A05.getLayoutParams(), A032, A033, 2));
        r6.A00.addListener(r7);
        r6.A00.start();
    }

    public AnonymousClass6SU(Activity activity, View view, AnonymousClass012 r8, AnonymousClass016 r9, C18820ts r10, C104635An r11, AnonymousClass1N2 r12, C34831hi r13) {
        this.A0E = r12;
        this.A0B = r10;
        this.A0D = r11;
        this.A03 = view;
        this.A02 = activity;
        this.A0F = r13;
        this.A0C = (C95464l7) new AnonymousClass04H(new C138486iB(), r9).A00(C95464l7.class);
        this.A09 = C36391kE.A0O(view, R.id.sticker_tab_button);
        this.A08 = C36391kE.A0O(view, R.id.emoji_tab_button);
        this.A06 = C012005e.A02(view, R.id.tab_buttons_container);
        this.A05 = C012005e.A02(view, R.id.search_container);
        this.A0A = (ClearableEditText) C012005e.A02(view, R.id.search_entry);
        this.A07 = C36401kF.A0G(view, R.id.search_icon);
        this.A04 = C012005e.A02(view, R.id.search_button);
        View view2 = this.A06;
        view2.setVisibility(0);
        TextView textView = this.A09;
        C135466ck.A00(textView, this, 27);
        TextView textView2 = this.A08;
        C135466ck.A00(textView2, this, 28);
        if (C36401kF.A1X(r10)) {
            textView.setBackgroundResource(R.drawable.shape_picker_right_tab_background);
            textView2.setBackgroundResource(R.drawable.shape_picker_left_tab_background);
        }
        view2.addOnLayoutChangeListener(new C163327q1(this, 7));
        ClearableEditText clearableEditText = this.A0A;
        clearableEditText.setHint(R.string.f12nameremoved);
        clearableEditText.getBackground().setAlpha(clearableEditText.hasFocus() ? 230 : 204);
        clearableEditText.setOnFocusChangeListener(new C163347q3(this, 5));
        clearableEditText.addTextChangedListener(new AnonymousClass2g5(clearableEditText, this.A05, this.A0C));
        clearableEditText.A01 = new C135466ck(this, 25);
        clearableEditText.setVisibility(4);
        clearableEditText.setAlwaysShowClearIcon(true);
        View view3 = this.A04;
        C135466ck.A00(view3, this, 26);
        view3.setVisibility(0);
        ImageView imageView = this.A07;
        imageView.setVisibility(0);
        imageView.requestLayout();
        A01(this, 0, false);
        C104635An r2 = this.A0D;
        r2.A00 = new C138176hQ(this, 1);
        C36341k9.A18(this.A0C.A01, r2.A02);
        r2.A01((Integer) null);
        Boolean bool = C18750th.A01;
        C165187t1.A01(r8, this.A0F, this, 2);
        C95464l7 r22 = this.A0C;
        C165187t1.A01(r8, r22.A03, this, 3);
        C165187t1.A01(r8, r22.A01, this, 5);
        C165187t1.A01(r8, r22.A00, this, 4);
    }
}
