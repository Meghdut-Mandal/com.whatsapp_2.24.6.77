package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;

/* renamed from: X.4fL  reason: invalid class name and case insensitive filesystem */
public class C92984fL extends LinearLayout {
    public int A00;
    public ColorStateList A01;
    public PorterDuff.Mode A02;
    public View.OnLongClickListener A03;
    public ImageView.ScaleType A04;
    public CharSequence A05;
    public boolean A06;
    public final TextView A07;
    public final CheckableImageButton A08;
    public final TextInputLayout A09;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r3.A06 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C92984fL r3) {
        /*
            java.lang.CharSequence r0 = r3.A05
            r2 = 8
            if (r0 == 0) goto L_0x000b
            boolean r0 = r3.A06
            r1 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            r1 = 8
        L_0x000d:
            com.google.android.material.internal.CheckableImageButton r0 = r3.A08
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0017
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r3.setVisibility(r2)
            android.widget.TextView r0 = r3.A07
            r0.setVisibility(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.A09
            r0.A0J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92984fL.A00(X.4fL):void");
    }

    public void A01() {
        int A032;
        EditText editText = this.A09.A0B;
        if (editText != null) {
            if (this.A08.getVisibility() == 0) {
                A032 = 0;
            } else {
                A032 = AnonymousClass04F.A03(editText);
            }
            AnonymousClass04F.A06(this.A07, A032, editText.getCompoundPaddingTop(), C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved), editText.getCompoundPaddingBottom());
        }
    }

    public void A02(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A08;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            TextInputLayout textInputLayout = this.A09;
            C132756Vd.A01(this.A01, this.A02, checkableImageButton, textInputLayout);
            A03(true);
            C132756Vd.A02(this.A01, checkableImageButton, textInputLayout);
            return;
        }
        A03(false);
        View.OnLongClickListener onLongClickListener = this.A03;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        C132756Vd.A03(onLongClickListener, checkableImageButton);
        this.A03 = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        C132756Vd.A03((View.OnLongClickListener) null, checkableImageButton);
        C90504aG.A15(checkableImageButton, (CharSequence) null);
    }

    public void A03(boolean z) {
        CheckableImageButton checkableImageButton = this.A08;
        if (AnonymousClass000.A1Q(checkableImageButton.getVisibility()) != z) {
            checkableImageButton.setVisibility(C36351kA.A00(z ? 1 : 0));
            A01();
            A00(this);
        }
    }

    public C92984fL(C010404j r10, TextInputLayout textInputLayout) {
        super(textInputLayout.getContext());
        this.A09 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, false);
        this.A08 = checkableImageButton;
        C132756Vd.A04(checkableImageButton);
        AnonymousClass07P r4 = new AnonymousClass07P(getContext(), (AttributeSet) null);
        this.A07 = r4;
        if (AnonymousClass061.A03(getContext())) {
            AnonymousClass0YO.A02(AnonymousClass000.A0a(this.A08), 0);
        }
        CheckableImageButton checkableImageButton2 = this.A08;
        View.OnLongClickListener onLongClickListener = this.A03;
        checkableImageButton2.setOnClickListener((View.OnClickListener) null);
        C132756Vd.A03(onLongClickListener, checkableImageButton2);
        this.A03 = null;
        checkableImageButton2.setOnLongClickListener((View.OnLongClickListener) null);
        C132756Vd.A03((View.OnLongClickListener) null, checkableImageButton2);
        TypedArray typedArray = r10.A02;
        if (typedArray.hasValue(67)) {
            this.A01 = AnonymousClass061.A01(getContext(), r10, 67);
        }
        if (typedArray.hasValue(68)) {
            this.A02 = AnonymousClass062.A01((PorterDuff.Mode) null, typedArray.getInt(68, -1));
        }
        if (typedArray.hasValue(64)) {
            A02(r10.A02(64));
            if (typedArray.hasValue(63)) {
                C90504aG.A15(checkableImageButton2, typedArray.getText(63));
            }
            checkableImageButton2.setCheckable(typedArray.getBoolean(62, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(65, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.A00) {
                this.A00 = dimensionPixelSize;
                checkableImageButton2.setMinimumWidth(dimensionPixelSize);
                checkableImageButton2.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(66)) {
                ImageView.ScaleType A002 = C132756Vd.A00(typedArray.getInt(66, -1));
                this.A04 = A002;
                checkableImageButton2.setScaleType(A002);
            }
            TextView textView = this.A07;
            textView.setVisibility(8);
            textView.setId(R.id.textinput_prefix_text);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            C011304x.A01(textView, 1);
            AnonymousClass088.A06(textView, typedArray.getResourceId(58, 0));
            if (typedArray.hasValue(59)) {
                textView.setTextColor(r10.A01(59));
            }
            CharSequence text = typedArray.getText(57);
            this.A05 = TextUtils.isEmpty(text) ? null : text;
            textView.setText(text);
            A00(this);
            addView(checkableImageButton);
            addView(r4);
            return;
        }
        throw AnonymousClass001.A08("startIconSize cannot be less than 0");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        A01();
    }
}
