package X;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.3LE  reason: invalid class name */
public class AnonymousClass3LE {
    public SearchView A00;
    public int A01;
    public View.OnClickListener A02 = new C67133Yq(this, 32);
    public final Activity A03;
    public final View A04;
    public final C17020qa A05;
    public final Toolbar A06;
    public final C18820ts A07;

    public void A01() {
    }

    public void A02() {
    }

    public void A03(Bundle bundle) {
        CharSequence charSequence;
        if (bundle != null && (charSequence = bundle.getCharSequence("search_text")) != null) {
            A06(false);
            this.A01 = bundle.getInt("search_button_x_pos");
            this.A00.A0I(charSequence);
        }
    }

    public void A04(Bundle bundle) {
        if (this.A00 != null && A07()) {
            bundle.putCharSequence("search_text", this.A00.A0d.getText());
            bundle.putInt("search_button_x_pos", this.A01);
        }
    }

    public boolean A07() {
        return AnonymousClass000.A1Q(this.A04.getVisibility());
    }

    public AnonymousClass3LE(Activity activity, View view, C17020qa r5, Toolbar toolbar, C18820ts r7) {
        this.A03 = activity;
        this.A07 = r7;
        this.A04 = view;
        this.A06 = toolbar;
        this.A05 = r5;
    }

    public int A00() {
        return R.layout.f9nameremoved;
    }

    public void A05(boolean z) {
        int i;
        if (A07()) {
            this.A00.A0I("");
            this.A06.setVisibility(0);
            View view = this.A04;
            if (!view.isAttachedToWindow() || !z) {
                this.A00.A0D();
                view.setVisibility(4);
            } else {
                int i2 = this.A01;
                int width = view.getWidth();
                int i3 = this.A01;
                int A022 = AnonymousClass001.A02(width, i3, i2);
                if (i3 == 0) {
                    this.A01 = view.getWidth() / 2;
                }
                if (C36351kA.A1Y(this.A07)) {
                    i = view.getWidth() - this.A01;
                } else {
                    i = this.A01;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, C36441kJ.A07(view), (float) A022, 0.0f);
                createCircularReveal.setDuration(250);
                AnonymousClass4VL.A00(createCircularReveal, this, 17);
                createCircularReveal.start();
            }
            Activity activity = this.A03;
            AnonymousClass1RC.A09(activity.getWindow(), false);
            C36391kE.A14(activity);
        }
    }

    public void A06(boolean z) {
        int width;
        int i;
        if (!A07()) {
            if (this.A00 == null) {
                View view = this.A04;
                int i2 = R.drawable.search_background;
                if (z) {
                    i2 = R.drawable.search_background_bottom_sheet;
                }
                view.setBackgroundResource(i2);
                Activity activity = this.A03;
                activity.getLayoutInflater().inflate(A00(), (ViewGroup) view, true);
                SearchView searchView = (SearchView) C012005e.A02(view, R.id.search_view);
                this.A00 = searchView;
                TextView A0O = C36391kE.A0O(searchView, R.id.search_src_text);
                C36321k7.A0M(activity, A0O, R.attr.f4nameremoved, R.color.f6nameremoved);
                A0O.setHintTextColor(AnonymousClass00F.A00(activity, R.color.f6nameremoved));
                this.A00.setIconifiedByDefault(false);
                this.A00.setQueryHint(activity.getString(R.string.f12nameremoved));
                SearchView searchView2 = this.A00;
                searchView2.A06 = this.A05;
                C36391kE.A0N(searchView2, R.id.search_mag_icon).setImageDrawable(new C36951lZ(AnonymousClass00E.A00(activity, R.drawable.ic_back), this));
                ImageView A0N = C36391kE.A0N(view, R.id.search_back);
                SearchView searchView3 = this.A00;
                if (!(searchView3 == null || searchView3.getContext() == null)) {
                    C36361kB.A13(AnonymousClass3UF.A02(this.A00.getContext(), R.drawable.ic_back, R.color.f6nameremoved), A0N, this.A07);
                }
                A0N.setOnClickListener(new C67133Yq(this, 31));
            }
            A02();
            View view2 = this.A04;
            view2.setVisibility(0);
            if (view2.isAttachedToWindow()) {
                View findViewById = this.A06.findViewById(R.id.menuitem_search);
                if (findViewById != null) {
                    int[] iArr = new int[2];
                    findViewById.getLocationInWindow(iArr);
                    if (C36351kA.A1Y(this.A07)) {
                        width = (view2.getWidth() - iArr[0]) - (findViewById.getWidth() / 2);
                    } else {
                        width = iArr[0] + (findViewById.getWidth() / 2);
                    }
                } else {
                    width = view2.getWidth() / 2;
                }
                this.A01 = width;
                int A022 = AnonymousClass001.A02(view2.getWidth(), this.A01, width);
                if (C36351kA.A1Y(this.A07)) {
                    i = view2.getWidth() - this.A01;
                } else {
                    i = this.A01;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, view2.getHeight() / 2, 0.0f, (float) A022);
                createCircularReveal.setDuration(250);
                AnonymousClass4VL.A00(createCircularReveal, this, 16);
                createCircularReveal.start();
            }
            boolean A012 = C19550w8.A01();
            Activity activity2 = this.A03;
            if (A012) {
                C36331k8.A0n(activity2);
            } else {
                activity2.getWindow().setStatusBarColor(AnonymousClass00F.A00(activity2, R.color.f6nameremoved));
            }
        }
    }
}
