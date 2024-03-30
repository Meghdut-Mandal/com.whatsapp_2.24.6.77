package X;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.community.NewCommunityActivity;

/* renamed from: X.2Es  reason: invalid class name */
public abstract class AnonymousClass2Es extends AnonymousClass24L {
    public int A00 = 1;
    public View.OnClickListener A01;
    public View A02;
    public ImageView A03;
    public ScrollView A04;
    public AnonymousClass060 A05;
    public TextInputLayout A06;
    public WaEditText A07;
    public WaEditText A08;
    public C28421Sp A09;
    public AnonymousClass1Sk A0A;
    public AnonymousClass16K A0B;
    public C27761Ps A0C;
    public C27751Pr A0D;
    public C19890wg A0E;
    public AnonymousClass1P3 A0F;
    public final View.OnFocusChangeListener A0G = new C89574Xb(this, 0);
    public final ViewTreeObserver.OnGlobalLayoutListener A0H = new C90104Zc(this, 10);

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A02 = findViewById(R.id.new_or_edit_community);
        this.A03 = C36431kI.A0P(this, R.id.icon);
        this.A08 = (WaEditText) C03570Gk.A0B(this, R.id.group_name);
        this.A07 = (WaEditText) C03570Gk.A0B(this, R.id.community_description);
        this.A05 = (AnonymousClass060) C03570Gk.A0B(this, R.id.new_community_next_button);
        C36341k9.A12(this);
        boolean z = this instanceof NewCommunityActivity;
        AnonymousClass07B A0O = C36381kD.A0O(this);
        if (z) {
            C36421kH.A19(A0O);
            i = R.string.f12nameremoved;
        } else {
            C36421kH.A19(A0O);
            i = R.string.f12nameremoved;
        }
        A0O.A0I(i);
        ImageView imageView = this.A03;
        C27751Pr r4 = this.A0D;
        C36391kE.A1B(getTheme(), getResources(), imageView, C68443bu.A00, r4);
        C66933Xw r2 = new C66933Xw(this, 43);
        this.A01 = r2;
        this.A03.setOnClickListener(r2);
        int max = Math.max(0, this.A06.A04(C21100yf.A1v));
        TextInputLayout textInputLayout = (TextInputLayout) C03570Gk.A0B(this, R.id.name_text_container);
        this.A06 = textInputLayout;
        textInputLayout.setCounterEnabled(true);
        this.A06.setCounterMaxLength(max);
        this.A06.A0K = C68423bs.A00;
        AnonymousClass4WJ.A00(this.A08, this, 2);
        this.A08.setFilters(new InputFilter[]{new C66763Xf(max)});
        ((TextInputLayout) C03570Gk.A0B(this, R.id.name_text_container)).setHint((CharSequence) getString(R.string.f12nameremoved));
        this.A07 = (WaEditText) C03570Gk.A0B(this, R.id.community_description);
        this.A04 = (ScrollView) C03570Gk.A0B(this, R.id.new_community_scrollView);
        int max2 = Math.max(0, this.A06.A04(C21100yf.A22));
        TextView A0Q = C36391kE.A0Q(this, R.id.description_counter);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.description_hint);
        A0Q2.setVisibility(8);
        this.A07.setHint(R.string.f12nameremoved);
        AnonymousClass1H2 r15 = this.A0C;
        C21060yb r12 = this.A08;
        C18820ts r13 = this.A00;
        C19890wg r1 = this.A0E;
        C110945bU.A00(this, this.A04, A0Q, A0Q2, this.A07, r12, r13, this.A0B, r15, r1, max2);
        AnonymousClass1H2 r152 = this.A0C;
        C21060yb r122 = this.A08;
        C18820ts r132 = this.A00;
        C19890wg r14 = this.A0E;
        this.A07.addTextChangedListener(new C47902fz(this.A07, (TextView) null, r122, r132, this.A0B, r152, r14, max2, 0, true));
        if (z) {
            C36321k7.A0L(this, this.A05, this.A00, R.drawable.ic_fab_next);
            this.A05.setOnClickListener(new C48912iG(this, 7));
        } else {
            C36391kE.A18(this, this.A05, R.drawable.ic_fab_check);
            C48892iE.A00(this.A05, this, 48);
        }
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(this.A0H);
        WaEditText waEditText = this.A07;
        View.OnFocusChangeListener onFocusChangeListener = this.A0G;
        waEditText.setOnFocusChangeListener(onFocusChangeListener);
        this.A08.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void A3i(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A06.setError((CharSequence) null);
            return;
        }
        this.A06.setError(str);
        this.A06.requestFocus();
        this.A04.smoothScrollTo(0, this.A06.getTop());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
