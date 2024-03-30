package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

/* renamed from: X.4fl  reason: invalid class name and case insensitive filesystem */
public class C93104fl extends LinearLayout implements C88984Uu {
    public int A00;
    public int A01;
    public int A02 = 0;
    public Context A03;
    public Button A04;
    public ImageView A05;
    public LinearLayout A06;
    public ProgressBar A07;
    public RelativeLayout A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public Object A0C;
    public String A0D;
    public String A0E = "";
    public String A0F;
    public FormItemEditText A0G;
    public AnonymousClass7dR A0H;
    public boolean A0I = false;
    public boolean A0J = false;
    public boolean A0K = false;
    public boolean A0L = false;
    public boolean A0M;
    public boolean A0N = true;
    public boolean A0O;

    public AnonymousClass0V7 A00(View view, boolean z) {
        AnonymousClass0V7 A072 = C012005e.A07(view);
        float f = 0.0f;
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (z) {
            f3 = 1.0f;
        }
        A072.A04(f3);
        if (z) {
            f = 1.0f;
        }
        A072.A03(f);
        A072.A08(new AccelerateInterpolator());
        A072.A09(new C95194kD(this, z));
        if (!z) {
            f2 = 0.5f;
        }
        A072.A02(f2);
        return A072;
    }

    public void A01() {
        AnonymousClass0V7 A002 = A00(this.A07, false);
        A002.A08(new AccelerateDecelerateInterpolator());
        A002.A01();
    }

    public void A02(String str, boolean z) {
        Button button = this.A04;
        C36351kA.A15(getResources(), button, R.color.f6nameremoved);
        if (!TextUtils.isEmpty(str)) {
            button.setText(str);
        }
        A00(button, z);
        button.setEnabled(false);
        button.setOnClickListener((View.OnClickListener) null);
    }

    public void Azm(String str) {
    }

    public boolean Azn() {
        this.A0G.requestFocus();
        return true;
    }

    public void B1f() {
    }

    public boolean B28() {
        if (!this.A0J) {
            this.A0J = true;
            setText(this.A0E);
        } else {
            this.A0J = false;
            this.A0G.setText(this.A0E.replaceAll(".", "●"));
        }
        return this.A0J;
    }

    public int B6H() {
        return this.A02;
    }

    public Object getFormDataTag() {
        return this.A0C;
    }

    public FormItemEditText getFormInputView() {
        return this.A0G;
    }

    public AnonymousClass7dR getFormItemListener() {
        return this.A0H;
    }

    public int getInputLength() {
        return this.A00;
    }

    public String getSubType() {
        return this.A0F;
    }

    public String getSubtype() {
        return this.A0F;
    }

    public boolean getTextEntered() {
        return this.A0L;
    }

    public boolean getToggleCheckBox() {
        return this.A0K;
    }

    public boolean getToggleCheckbox() {
        return this.A0K;
    }

    public void setActionBarPositionTop(boolean z) {
        this.A0O = z;
        LinearLayout linearLayout = this.A06;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (this.A0O) {
            layoutParams.addRule(10);
            layoutParams.addRule(8, 0);
        } else {
            layoutParams.addRule(10, 0);
            layoutParams.addRule(8, R.id.form_item_input);
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    public void setFormDataTag(Object obj) {
        this.A0C = obj;
    }

    public void setFormItemListener(AnonymousClass7dR r1) {
        this.A0H = r1;
    }

    public void setFormItemTag(int i) {
        this.A01 = i;
    }

    public void setInputLength(int i) {
        this.A0G.setMaxLength(i);
        this.A00 = i;
    }

    public void setIsStateUnmasked(boolean z) {
        this.A0J = z;
    }

    public void setSubtype(String str) {
        this.A0F = str;
    }

    public void setText(String str) {
        FormItemEditText formItemEditText = this.A0G;
        formItemEditText.setText(str);
        formItemEditText.setSelection(str.length());
    }

    public void setTextEntered(boolean z) {
        this.A0L = z;
    }

    public void setTitle(String str) {
        this.A09.setText(str);
        this.A0D = str;
    }

    public void setToggleCheckBox(boolean z) {
        this.A0K = z;
    }

    public void setToggleCheckbox(Boolean bool) {
        this.A0K = bool.booleanValue();
    }

    public boolean B54() {
        boolean A1Q = AnonymousClass000.A1Q(this.A0K ? 1 : 0);
        this.A0K = A1Q;
        return A1Q;
    }

    public String getInputValue() {
        if (this.A0I || this.A0J) {
            return C36361kB.A0n(this.A0G);
        }
        return this.A0E;
    }

    public C93104fl(Context context, Context context2) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C56822ww.A01);
        if (obtainStyledAttributes != null) {
            this.A0D = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.getString(3);
            this.A00 = obtainStyledAttributes.getInteger(1, 6);
            this.A0M = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A08 = (RelativeLayout) findViewById(R.id.form_item_root);
        this.A06 = C36441kJ.A0U(this, R.id.form_item_action_bar);
        this.A09 = C36391kE.A0P(this, R.id.form_item_title);
        this.A0G = (FormItemEditText) findViewById(R.id.form_item_input);
        this.A04 = (Button) findViewById(R.id.form_item_button);
        this.A07 = (ProgressBar) findViewById(R.id.form_item_progress);
        this.A05 = C36391kE.A0N(this, R.id.form_item_image);
        this.A0G.setInputType(0);
        this.A0A = C36391kE.A0P(this, R.id.educational_info);
        this.A0B = C36391kE.A0P(this, R.id.forgot_upi);
        C36351kA.A15(getResources(), this.A04, R.color.f6nameremoved);
        setTitle(this.A0D);
        setInputLength(this.A00);
        this.A0G.addTextChangedListener(new C165097ss(this, 3));
        AnonymousClass6UI.A00(this.A0G, this, 13);
        setActionBarPositionTop(this.A0M);
        this.A0B.setOnClickListener(new C135486cm(this, 4));
        this.A03 = context2;
    }

    public void Azo(Drawable drawable, View.OnClickListener onClickListener, String str, int i, boolean z, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            this.A04.setText(str);
        }
        if (str.equals(getResources().getString(R.string.f12nameremoved)) || str.equals(getContext().getString(R.string.f12nameremoved)) || str.equals(getResources().getString(R.string.f12nameremoved))) {
            C36351kA.A15(getResources(), this.A04, R.color.f6nameremoved);
            this.A0N = false;
        }
        Button button = this.A04;
        button.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        button.setOnClickListener(onClickListener);
        button.setEnabled(z2);
        A00(button, z);
    }

    public void setEducationalText(String str) {
        boolean contains = str.contains(C36411kG.A0w(getResources(), "", AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
        TextView textView = this.A0A;
        if (contains) {
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
            textView.setText(str);
            C36351kA.A15(getResources(), textView, R.color.f6nameremoved);
            textView.setBackgroundResource(R.drawable.rounded_corner);
            return;
        }
        textView.setText(str);
    }

    public void setForgotUpi(Boolean bool) {
        this.A0B.setVisibility(C36351kA.A00(bool.booleanValue() ? 1 : 0));
    }
}
