package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.5Jw  reason: invalid class name and case insensitive filesystem */
public class C106485Jw extends AnonymousClass3LE {
    public static int A0E;
    public static String A0F;
    public static String A0G;
    public static String A0H;
    public ObjectAnimator A00;
    public ObjectAnimator A01;
    public ObjectAnimator A02;
    public ObjectAnimator A03;
    public TextView A04;
    public TextView A05;
    public SearchView A06;
    public final View A07;
    public final AccelerateInterpolator A08 = new AccelerateInterpolator();
    public final DecelerateInterpolator A09 = new DecelerateInterpolator();
    public final int[] A0A;
    public final int[] A0B;
    public final Activity A0C;
    public final Toolbar A0D;

    public void A02() {
        Activity activity = this.A0C;
        A0G = activity.getString(R.string.f12nameremoved);
        A0H = "";
        A0F = "";
        View view = this.A07;
        this.A04 = C36391kE.A0O(view, R.id.search_hint_fade_in);
        this.A05 = C36391kE.A0O(view, R.id.search_hint_fade_out);
        SearchView searchView = (SearchView) C012005e.A02(view, R.id.search_view);
        this.A06 = searchView;
        if (TextUtils.equals(searchView.getQueryHint(), activity.getString(R.string.f12nameremoved))) {
            this.A06.setQueryHint("");
        }
        C36331k8.A0r(activity, this.A04, R.color.f6nameremoved);
        C36331k8.A0r(activity, this.A05, R.color.f6nameremoved);
        this.A04.setHint("");
        this.A05.setHint("");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A05, "translationY", new float[]{0.0f, 50.0f});
        this.A03 = ofFloat;
        ofFloat.setDuration(300);
        this.A03.setStartDelay(700);
        C162337oQ.A00(this.A03, this, 9);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A04, "translationY", new float[]{-50.0f, 0.0f});
        this.A01 = ofFloat2;
        ofFloat2.setDuration(300);
        this.A01.setStartDelay(700);
        C162337oQ.A00(this.A01, this, 10);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.A04, "alpha", new float[]{0.0f, 1.0f});
        this.A00 = ofFloat3;
        ofFloat3.setInterpolator(this.A08);
        this.A00.setDuration(300);
        this.A00.setStartDelay(700);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.A05, "alpha", new float[]{1.0f, 0.0f});
        this.A02 = ofFloat4;
        ofFloat4.setInterpolator(this.A09);
        this.A02.setDuration(300);
        this.A02.setStartDelay(700);
    }

    public C106485Jw(Activity activity, View view, C17020qa r7, Toolbar toolbar, C18820ts r9) {
        super(activity, view, r7, toolbar, r9);
        this.A0D = toolbar;
        this.A07 = view;
        this.A0C = activity;
        int[] iArr = new int[2];
        this.A0B = iArr;
        iArr[0] = -1;
        int[] iArr2 = new int[2];
        this.A0A = iArr2;
        iArr2[0] = -1;
    }

    public int A00() {
        return R.layout.f9nameremoved;
    }

    public void A01() {
        if (!A07()) {
            this.A0D.setVisibility(0);
        }
    }
}
