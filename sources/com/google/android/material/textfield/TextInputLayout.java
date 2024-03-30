package com.google.android.material.textfield;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass02W;
import X.AnonymousClass046;
import X.AnonymousClass048;
import X.AnonymousClass04F;
import X.AnonymousClass061;
import X.AnonymousClass064;
import X.AnonymousClass06J;
import X.AnonymousClass06K;
import X.AnonymousClass06M;
import X.AnonymousClass06N;
import X.AnonymousClass06P;
import X.AnonymousClass06R;
import X.AnonymousClass06X;
import X.AnonymousClass076;
import X.AnonymousClass07P;
import X.AnonymousClass088;
import X.AnonymousClass08I;
import X.AnonymousClass0YO;
import X.AnonymousClass0Z1;
import X.AnonymousClass6VJ;
import X.AnonymousClass7f8;
import X.AnonymousClass7f9;
import X.C010504k;
import X.C011304x;
import X.C011504z;
import X.C012005e;
import X.C012505l;
import X.C014506h;
import X.C014606i;
import X.C017507m;
import X.C017807p;
import X.C018107s;
import X.C018607y;
import X.C111565cU;
import X.C132756Vd;
import X.C1497572q;
import X.C165097ss;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import X.C90474aD;
import X.C90494aF;
import X.C90504aG;
import X.C90524aI;
import X.C92234dM;
import X.C92984fL;
import X.C93014fP;
import X.C93174g3;
import X.C95174kA;
import X.C95214kF;
import X.C99294t2;
import X.C99344t8;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
    public static final int[][] A1B = {new int[]{16842919}, new int[0]};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public ValueAnimator A09;
    public ColorStateList A0A;
    public EditText A0B;
    public TextView A0C;
    public TextView A0D;
    public C017507m A0E;
    public C017507m A0F;
    public C012505l A0G;
    public C012505l A0H;
    public C012505l A0I;
    public AnonymousClass06J A0J;
    public AnonymousClass7f8 A0K;
    public CharSequence A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public ColorStateList A0j;
    public ColorStateList A0k;
    public ColorStateList A0l;
    public ColorStateList A0m;
    public ColorStateList A0n;
    public Typeface A0o;
    public Drawable A0p;
    public Drawable A0q;
    public Drawable A0r;
    public StateListDrawable A0s;
    public C012505l A0t;
    public CharSequence A0u;
    public CharSequence A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public final int A11;
    public final Rect A12;
    public final FrameLayout A13;
    public final AnonymousClass0Z1 A14;
    public final C93014fP A15;
    public final AnonymousClass6VJ A16;
    public final C92984fL A17;
    public final LinkedHashSet A18;
    public final Rect A19;
    public final RectF A1A;

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0S = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0S = false;
    }

    private int A00() {
        float A072;
        if (this.A0O) {
            int i = this.A01;
            if (i == 0) {
                A072 = this.A14.A07();
            } else if (i == 2) {
                A072 = this.A14.A07() / 2.0f;
            }
            return (int) A072;
        }
        return 0;
    }

    private C017507m A01() {
        C017507m r3 = new C017507m();
        r3.A06((long) C014506h.A00(getContext(), R.attr.f4nameremoved, 87));
        r3.A07(C017807p.A01(AnonymousClass064.A03, getContext(), R.attr.f4nameremoved));
        return r3;
    }

    private void A03() {
        int i;
        int i2;
        int i3;
        C012505l r2 = this.A0G;
        if (r2 != null) {
            AnonymousClass06J r1 = r2.A01.A0K;
            AnonymousClass06J r0 = this.A0J;
            if (r1 != r0) {
                r2.setShapeAppearanceModel(r0);
            }
            if (this.A01 == 2 && (i2 = this.A06) > -1 && (i3 = this.A03) != 0) {
                this.A0G.A0A(i3, (float) i2);
            }
            int i4 = this.A00;
            if (this.A01 == 1) {
                i4 = C018107s.A05(this.A00, C014606i.A01(getContext(), R.attr.f4nameremoved));
            }
            this.A00 = i4;
            this.A0G.A0C(ColorStateList.valueOf(i4));
            C012505l r22 = this.A0H;
            if (!(r22 == null || this.A0I == null)) {
                if (this.A06 > -1 && this.A03 != 0) {
                    if (this.A0B.isFocused()) {
                        i = this.A08;
                    } else {
                        i = this.A03;
                    }
                    r22.A0C(ColorStateList.valueOf(i));
                    this.A0I.A0C(ColorStateList.valueOf(this.A03));
                }
                invalidate();
            }
            A0F();
        }
    }

    private void A04() {
        Drawable orCreateFilledDropDownMenuBackground;
        EditText editText;
        int A032;
        int dimensionPixelSize;
        int A022;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        C012505l r1;
        int i3 = this.A01;
        if (i3 == 0) {
            this.A0G = null;
            this.A0H = null;
            this.A0I = null;
        } else if (i3 == 1) {
            this.A0G = new C012505l(this.A0J);
            this.A0H = new C012505l();
            this.A0I = new C012505l();
        } else if (i3 == 2) {
            if (!this.A0O || (this.A0G instanceof C99294t2)) {
                r1 = new C012505l(this.A0J);
            } else {
                r1 = new C99344t8(this.A0J);
            }
            this.A0G = r1;
            this.A0H = null;
            this.A0I = null;
        } else {
            throw AnonymousClass000.A0c(" is illegal; only @BoxBackgroundMode constants are supported.", C90504aG.A0q(i3));
        }
        A0F();
        A0E();
        if (this.A01 == 1) {
            if (C36341k9.A0F(this).getConfiguration().fontScale >= 2.0f) {
                resources2 = getResources();
                i2 = R.dimen.f7nameremoved;
            } else if (AnonymousClass061.A03(getContext())) {
                resources2 = getResources();
                i2 = R.dimen.f7nameremoved;
            }
            this.A02 = resources2.getDimensionPixelSize(i2);
        }
        if (this.A0B != null && this.A01 == 1) {
            if (C36341k9.A0F(this).getConfiguration().fontScale >= 2.0f) {
                editText = this.A0B;
                A032 = AnonymousClass04F.A03(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                A022 = AnonymousClass04F.A02(this.A0B);
                resources = getResources();
                i = R.dimen.f7nameremoved;
            } else if (AnonymousClass061.A03(getContext())) {
                editText = this.A0B;
                A032 = AnonymousClass04F.A03(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                A022 = AnonymousClass04F.A02(this.A0B);
                resources = getResources();
                i = R.dimen.f7nameremoved;
            }
            AnonymousClass04F.A06(editText, A032, dimensionPixelSize, A022, resources.getDimensionPixelSize(i));
        }
        if (this.A01 != 0) {
            A07();
        }
        EditText editText2 = this.A0B;
        if (editText2 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText2;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.A01;
                if (i4 == 2) {
                    orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                } else if (i4 == 1) {
                    orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                } else {
                    return;
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
            }
        }
    }

    private void A06() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.A0C;
        if (textView != null) {
            if (this.A0y) {
                i = this.A0T;
            } else {
                i = this.A0U;
            }
            A0I(textView, i);
            if (!this.A0y && (colorStateList2 = this.A0k) != null) {
                this.A0C.setTextColor(colorStateList2);
            }
            if (this.A0y && (colorStateList = this.A0j) != null) {
                this.A0C.setTextColor(colorStateList);
            }
        }
    }

    private void A07() {
        if (this.A01 != 1) {
            FrameLayout frameLayout = this.A13;
            ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(frameLayout);
            int A002 = A00();
            if (A002 != A0a2.topMargin) {
                A0a2.topMargin = A002;
                frameLayout.requestLayout();
            }
        }
    }

    public static void A08(Editable editable, TextInputLayout textInputLayout) {
        if (textInputLayout.A0K.B3k(editable) != 0 || textInputLayout.A0P) {
            TextView textView = textInputLayout.A0D;
            if (textView != null && textInputLayout.A0R) {
                textView.setText((CharSequence) null);
                C018607y.A02(textInputLayout.A13, textInputLayout.A0F);
                textInputLayout.A0D.setVisibility(4);
            }
        } else if (textInputLayout.A0D != null && textInputLayout.A0R && !TextUtils.isEmpty(textInputLayout.A0L)) {
            textInputLayout.A0D.setText(textInputLayout.A0L);
            C018607y.A02(textInputLayout.A13, textInputLayout.A0E);
            textInputLayout.A0D.setVisibility(0);
            textInputLayout.A0D.bringToFront();
            textInputLayout.announceForAccessibility(textInputLayout.A0L);
        }
    }

    private boolean A0C() {
        if (!this.A0O || TextUtils.isEmpty(this.A0u) || !(this.A0G instanceof C99294t2)) {
            return false;
        }
        return true;
    }

    private Drawable getEditTextBoxBackground() {
        int i;
        EditText editText = this.A0B;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.A0G;
        }
        int A022 = C014606i.A02(this.A0B, R.attr.f4nameremoved);
        int i2 = this.A01;
        if (i2 == 2) {
            Context context = getContext();
            C012505l r6 = this.A0G;
            int[][] iArr = A1B;
            TypedValue A023 = C014506h.A02(context, "TextInputLayout", R.attr.f4nameremoved);
            int i3 = A023.resourceId;
            if (i3 != 0) {
                i = AnonymousClass00F.A00(context, i3);
            } else {
                i = A023.data;
            }
            C012505l r7 = new C012505l(r6.A01.A0K);
            int A002 = C014606i.A00(0.1f, A022, i);
            r7.A0C(new ColorStateList(iArr, new int[]{A002, 0}));
            r7.setTint(i);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{A002, i});
            C012505l r1 = new C012505l(r6.A01.A0K);
            r1.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, r7, r1), r6});
        } else if (i2 != 1) {
            return null;
        } else {
            C012505l r5 = this.A0G;
            int i4 = this.A00;
            int[][] iArr2 = A1B;
            int A003 = C014606i.A00(0.1f, A022, i4);
            int[] A1O = C36441kJ.A1O();
            A1O[0] = A003;
            A1O[1] = i4;
            return new RippleDrawable(new ColorStateList(iArr2, A1O), r5, r5);
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.A0s == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.A0s = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.A0s.addState(new int[0], A02(false));
        }
        return this.A0s;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        C012505l r0 = this.A0t;
        if (r0 != null) {
            return r0;
        }
        C012505l A022 = A02(true);
        this.A0t = A022;
        return A022;
    }

    private void setEditText(EditText editText) {
        if (this.A0B == null) {
            C93014fP r3 = this.A15;
            if (r3.A01 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.A0B = editText;
            int i = this.A0f;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.A0g);
            }
            int i2 = this.A0d;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.A0e);
            }
            this.A0x = false;
            A04();
            setTextInputAccessibilityDelegate(new C95174kA(this));
            AnonymousClass0Z1 r2 = this.A14;
            Typeface typeface = this.A0B.getTypeface();
            boolean A042 = AnonymousClass0Z1.A04(typeface, r2);
            boolean A052 = AnonymousClass0Z1.A05(typeface, r2);
            if (A042 || A052) {
                r2.A0F(false);
            }
            float textSize = this.A0B.getTextSize();
            if (r2.A0M != textSize) {
                r2.A0M = textSize;
                r2.A0F(false);
            }
            float letterSpacing = this.A0B.getLetterSpacing();
            if (r2.A0H != letterSpacing) {
                r2.A0H = letterSpacing;
                r2.A0F(false);
            }
            int gravity = this.A0B.getGravity();
            r2.A0A((gravity & -113) | 48);
            r2.A0C(gravity);
            this.A0B.addTextChangedListener(new C165097ss(this, 0));
            if (this.A0l == null) {
                this.A0l = this.A0B.getHintTextColors();
            }
            if (this.A0O) {
                if (TextUtils.isEmpty(this.A0u)) {
                    CharSequence hint = this.A0B.getHint();
                    this.A0v = hint;
                    setHint(hint);
                    this.A0B.setHint((CharSequence) null);
                }
                this.A0Q = true;
            }
            if (this.A0C != null) {
                A0H(this.A0B.getText());
            }
            A0D();
            this.A16.A03();
            this.A17.bringToFront();
            r3.bringToFront();
            Iterator it = this.A18.iterator();
            while (it.hasNext()) {
                ((AnonymousClass7f9) it.next()).BWM(this);
            }
            r3.A04();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            A0A(this, false, true);
            return;
        }
        throw AnonymousClass001.A08("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A0u)) {
            this.A0u = charSequence;
            AnonymousClass0Z1 r1 = this.A14;
            if (charSequence == null || !TextUtils.equals(r1.A0j, charSequence)) {
                r1.A0j = charSequence;
                r1.A0k = null;
                r1.A0F(false);
            }
            if (!this.A0P) {
                A05();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.A0R != z) {
            if (z) {
                TextView textView = this.A0D;
                if (textView != null) {
                    this.A13.addView(textView);
                    this.A0D.setVisibility(0);
                }
            } else {
                C36341k9.A0y(this.A0D);
                this.A0D = null;
            }
            this.A0R = z;
        }
    }

    public void A0D() {
        Drawable background;
        int currentTextColor;
        EditText editText = this.A0B;
        if (editText != null && this.A01 == 0 && (background = editText.getBackground()) != null) {
            if (C010504k.A03(background)) {
                background = background.mutate();
            }
            AnonymousClass6VJ r1 = this.A16;
            if (r1.A07()) {
                TextView textView = r1.A0A;
                if (textView == null) {
                    currentTextColor = -1;
                }
                currentTextColor = textView.getCurrentTextColor();
            } else {
                if (!this.A0y || (textView = this.A0C) == null) {
                    AnonymousClass08I.A04(background);
                    this.A0B.refreshDrawableState();
                    return;
                }
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(AnonymousClass02W.A00(PorterDuff.Mode.SRC_IN, currentTextColor));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0113, code lost:
        if (r1 != null) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
            r9 = this;
            X.05l r0 = r9.A0G
            if (r0 == 0) goto L_0x00dd
            int r0 = r9.A01
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r9.isFocused()
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x001a
            android.widget.EditText r0 = r9.A0B
            if (r0 == 0) goto L_0x0155
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x0155
        L_0x001a:
            r8 = 1
        L_0x001b:
            boolean r0 = r9.isHovered()
            if (r0 != 0) goto L_0x002b
            android.widget.EditText r0 = r9.A0B
            if (r0 == 0) goto L_0x0152
            boolean r0 = r0.isHovered()
            if (r0 == 0) goto L_0x0152
        L_0x002b:
            r7 = 1
        L_0x002c:
            X.6VJ r2 = r9.A16
            boolean r0 = r2.A07()
            if (r0 != 0) goto L_0x003c
            android.widget.TextView r0 = r9.A0C
            if (r0 == 0) goto L_0x003d
            boolean r0 = r9.A0y
            if (r0 == 0) goto L_0x003d
        L_0x003c:
            r6 = 1
        L_0x003d:
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto L_0x00f8
            int r0 = r9.A0W
        L_0x0045:
            r9.A03 = r0
        L_0x0047:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0050
            r9.A0B(r6)
        L_0x0050:
            X.4fP r4 = r9.A15
            X.C93014fP.A01(r4)
            com.google.android.material.textfield.TextInputLayout r3 = r4.A0J
            com.google.android.material.internal.CheckableImageButton r1 = r4.A0H
            android.content.res.ColorStateList r0 = r4.A03
            X.C132756Vd.A02(r0, r1, r3)
            com.google.android.material.internal.CheckableImageButton r2 = r4.A0G
            android.content.res.ColorStateList r0 = r4.A02
            X.C132756Vd.A02(r0, r2, r3)
            X.6Fq r0 = r4.A03()
            boolean r0 = r0 instanceof X.C99384tC
            if (r0 == 0) goto L_0x0091
            X.6VJ r0 = r3.A16
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x00f0
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            if (r0 == 0) goto L_0x00f0
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass08I.A01(r0)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            int r0 = r3.getErrorCurrentTextColors()
            X.AnonymousClass076.A06(r1, r0)
            r2.setImageDrawable(r1)
        L_0x0091:
            X.4fL r0 = r9.A17
            com.google.android.material.textfield.TextInputLayout r2 = r0.A09
            com.google.android.material.internal.CheckableImageButton r1 = r0.A08
            android.content.res.ColorStateList r0 = r0.A01
            X.C132756Vd.A02(r0, r1, r2)
            int r1 = r9.A01
            r0 = 2
            if (r1 != r0) goto L_0x00cc
            int r1 = r9.A06
            if (r8 == 0) goto L_0x00ed
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00ed
            int r0 = r9.A05
        L_0x00ad:
            r9.A06 = r0
            if (r0 == r1) goto L_0x00cc
            boolean r0 = r9.A0C()
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r9.A0C()
            if (r0 == 0) goto L_0x00c9
            X.05l r1 = r9.A0G
            X.4t2 r1 = (X.C99294t2) r1
            r0 = 0
            r1.A0F(r0, r0, r0, r0)
        L_0x00c9:
            r9.A05()
        L_0x00cc:
            int r0 = r9.A01
            if (r0 != r5) goto L_0x00da
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto L_0x00de
            int r0 = r9.A0X
        L_0x00d8:
            r9.A00 = r0
        L_0x00da:
            r9.A03()
        L_0x00dd:
            return
        L_0x00de:
            if (r7 == 0) goto L_0x00e5
            if (r8 != 0) goto L_0x00ea
            int r0 = r9.A0b
            goto L_0x00d8
        L_0x00e5:
            if (r8 != 0) goto L_0x00ea
            int r0 = r9.A0V
            goto L_0x00d8
        L_0x00ea:
            int r0 = r9.A0Z
            goto L_0x00d8
        L_0x00ed:
            int r0 = r9.A04
            goto L_0x00ad
        L_0x00f0:
            android.content.res.ColorStateList r1 = r4.A02
            android.graphics.PorterDuff$Mode r0 = r4.A04
            X.C132756Vd.A01(r1, r0, r2, r3)
            goto L_0x0091
        L_0x00f8:
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x0109
            android.content.res.ColorStateList r1 = r9.A0A
            if (r1 != 0) goto L_0x0115
            android.widget.TextView r0 = r2.A0A
            if (r0 != 0) goto L_0x013c
            r0 = -1
            goto L_0x0045
        L_0x0109:
            boolean r0 = r9.A0y
            if (r0 == 0) goto L_0x0142
            android.widget.TextView r0 = r9.A0C
            if (r0 == 0) goto L_0x0142
            android.content.res.ColorStateList r1 = r9.A0A
            if (r1 == 0) goto L_0x013c
        L_0x0115:
            int r4 = r1.getDefaultColor()
            android.content.res.ColorStateList r1 = r9.A0A
            r3 = 2
            int[] r0 = new int[r3]
            r0 = {16843623, 16842910} // fill-array
            int r2 = r1.getColorForState(r0, r4)
            android.content.res.ColorStateList r1 = r9.A0A
            int[] r0 = new int[r3]
            r0 = {16843518, 16842910} // fill-array
            int r0 = r1.getColorForState(r0, r4)
            if (r8 != 0) goto L_0x0045
            if (r7 == 0) goto L_0x0138
            r9.A03 = r2
            goto L_0x0047
        L_0x0138:
            r9.A03 = r4
            goto L_0x0047
        L_0x013c:
            int r0 = r0.getCurrentTextColor()
            goto L_0x0045
        L_0x0142:
            if (r8 == 0) goto L_0x0148
            int r0 = r9.A0a
            goto L_0x0045
        L_0x0148:
            if (r7 == 0) goto L_0x014e
            int r0 = r9.A0c
            goto L_0x0045
        L_0x014e:
            int r0 = r9.A08
            goto L_0x0045
        L_0x0152:
            r7 = 0
            goto L_0x002c
        L_0x0155:
            r8 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0E():void");
    }

    public void A0F() {
        EditText editText = this.A0B;
        if (editText != null && this.A0G != null) {
            if ((this.A0x || editText.getBackground() == null) && this.A01 != 0) {
                C011504z.A04(getEditTextBoxBackground(), this.A0B);
                this.A0x = true;
            }
        }
    }

    public void A0G(float f) {
        AnonymousClass0Z1 r4 = this.A14;
        if (r4.A0G != f) {
            if (this.A09 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A09 = valueAnimator;
                valueAnimator.setInterpolator(C017807p.A01(AnonymousClass064.A02, getContext(), R.attr.f4nameremoved));
                this.A09.setDuration((long) C014506h.A00(getContext(), R.attr.f4nameremoved, 167));
                C111565cU.A00(this.A09, this, 8);
            }
            ValueAnimator valueAnimator2 = this.A09;
            float[] A0v2 = C90524aI.A0v();
            A0v2[0] = r4.A0G;
            A0v2[1] = f;
            valueAnimator2.setFloatValues(A0v2);
            this.A09.start();
        }
    }

    public void A0H(Editable editable) {
        String obj;
        int B3k = this.A0K.B3k(editable);
        boolean z = this.A0y;
        int i = this.A07;
        if (i == -1) {
            this.A0C.setText(String.valueOf(B3k));
            this.A0C.setContentDescription((CharSequence) null);
            this.A0y = false;
        } else {
            this.A0y = C90474aD.A1T(B3k, i);
            Context context = getContext();
            TextView textView = this.A0C;
            int i2 = this.A07;
            boolean z2 = this.A0y;
            int i3 = R.string.f12nameremoved;
            if (z2) {
                i3 = R.string.f12nameremoved;
            }
            Object[] A0M2 = AnonymousClass001.A0M();
            Integer valueOf = Integer.valueOf(B3k);
            A0M2[0] = valueOf;
            AnonymousClass000.A1L(A0M2, i2, 1);
            textView.setContentDescription(context.getString(i3, A0M2));
            if (z != this.A0y) {
                A06();
            }
            AnonymousClass046 A022 = AnonymousClass046.A02();
            TextView textView2 = this.A0C;
            Context context2 = getContext();
            Object[] A1b = C36411kG.A1b(valueOf);
            AnonymousClass000.A1L(A1b, this.A07, 1);
            String string = context2.getString(R.string.f12nameremoved, A1b);
            AnonymousClass048 r0 = A022.A00;
            if (string == null) {
                obj = null;
            } else {
                obj = A022.A03(r0, string).toString();
            }
            textView2.setText(obj);
        }
        if (this.A0B != null && z != this.A0y) {
            A0A(this, false, false);
            A0E();
            A0D();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r2.getMeasuredWidth() <= 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r2.A07.getVisibility() == 0) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J() {
        /*
            r12 = this;
            android.widget.EditText r0 = r12.A0B
            r8 = 0
            if (r0 != 0) goto L_0x0006
            return r8
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r12.getStartIconDrawable()
            if (r0 != 0) goto L_0x001a
            X.4fL r2 = r12.A17
            java.lang.CharSequence r0 = r2.A05
            if (r0 == 0) goto L_0x0023
            android.widget.TextView r0 = r2.A07
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0023
        L_0x001a:
            X.4fL r2 = r12.A17
            int r1 = r2.getMeasuredWidth()
            r0 = 1
            if (r1 > 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r6 = 0
            r11 = 3
            r10 = 2
            r5 = 1
            if (r0 == 0) goto L_0x00cf
            int r1 = r2.getMeasuredWidth()
            android.widget.EditText r0 = r12.A0B
            int r0 = r0.getPaddingLeft()
            int r1 = r1 - r0
            android.graphics.drawable.Drawable r0 = r12.A0r
            if (r0 == 0) goto L_0x003d
            int r0 = r12.A0i
            if (r0 == r1) goto L_0x0049
        L_0x003d:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r12.A0r = r0
            r12.A0i = r1
            r0.setBounds(r8, r8, r1, r5)
        L_0x0049:
            android.widget.EditText r0 = r12.A0B
            android.graphics.drawable.Drawable[] r7 = X.AnonymousClass079.A01(r0)
            r0 = r7[r8]
            android.graphics.drawable.Drawable r4 = r12.A0r
            if (r0 == r4) goto L_0x00e8
            android.widget.EditText r3 = r12.A0B
            r2 = r7[r5]
            r1 = r7[r10]
            r0 = r7[r11]
            X.AnonymousClass079.A00(r4, r2, r1, r0, r3)
        L_0x0060:
            r9 = 1
        L_0x0061:
            X.4fP r1 = r12.A15
            com.google.android.material.internal.CheckableImageButton r3 = r1.A0H
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L_0x0079
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0075
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x0079
        L_0x0075:
            java.lang.CharSequence r0 = r1.A0B
            if (r0 == 0) goto L_0x010c
        L_0x0079:
            int r0 = r1.getMeasuredWidth()
            if (r0 <= 0) goto L_0x010c
            android.widget.TextView r0 = r1.A0F
            int r2 = r0.getMeasuredWidth()
            android.widget.EditText r0 = r12.A0B
            int r0 = r0.getPaddingRight()
            int r2 = r2 - r0
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L_0x00a0
            int r0 = r1.A01
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x00ae
            com.google.android.material.internal.CheckableImageButton r3 = r1.A0G
            if (r3 == 0) goto L_0x00ae
        L_0x00a0:
            int r0 = r3.getMeasuredWidth()
            int r2 = r2 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r3)
            int r0 = X.AnonymousClass0YO.A01(r0)
            int r2 = r2 + r0
        L_0x00ae:
            android.widget.EditText r0 = r12.A0B
            android.graphics.drawable.Drawable[] r6 = X.AnonymousClass079.A01(r0)
            android.graphics.drawable.Drawable r1 = r12.A0p
            if (r1 == 0) goto L_0x00eb
            int r0 = r12.A0Y
            if (r0 == r2) goto L_0x00f7
            r12.A0Y = r2
            r1.setBounds(r8, r8, r2, r5)
            android.widget.EditText r4 = r12.A0B
            r3 = r6[r8]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r1 = r12.A0p
            r0 = r6[r11]
            X.AnonymousClass079.A00(r3, r2, r1, r0, r4)
            return r5
        L_0x00cf:
            android.graphics.drawable.Drawable r0 = r12.A0r
            if (r0 == 0) goto L_0x00e8
            android.widget.EditText r0 = r12.A0B
            android.graphics.drawable.Drawable[] r0 = X.AnonymousClass079.A01(r0)
            android.widget.EditText r3 = r12.A0B
            r2 = r0[r5]
            r1 = r0[r10]
            r0 = r0[r11]
            X.AnonymousClass079.A00(r6, r2, r1, r0, r3)
            r12.A0r = r6
            goto L_0x0060
        L_0x00e8:
            r9 = 0
            goto L_0x0061
        L_0x00eb:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r12.A0p = r0
            r12.A0Y = r2
            r0.setBounds(r8, r8, r2, r5)
        L_0x00f7:
            r0 = r6[r10]
            android.graphics.drawable.Drawable r4 = r12.A0p
            if (r0 == r4) goto L_0x010b
            r12.A0q = r0
            android.widget.EditText r3 = r12.A0B
            r2 = r6[r8]
            r1 = r6[r5]
            r0 = r6[r11]
            X.AnonymousClass079.A00(r2, r1, r4, r0, r3)
            return r5
        L_0x010b:
            return r9
        L_0x010c:
            android.graphics.drawable.Drawable r0 = r12.A0p
            if (r0 == 0) goto L_0x012e
            android.widget.EditText r0 = r12.A0B
            android.graphics.drawable.Drawable[] r7 = X.AnonymousClass079.A01(r0)
            r1 = r7[r10]
            android.graphics.drawable.Drawable r0 = r12.A0p
            if (r1 != r0) goto L_0x012c
            android.widget.EditText r4 = r12.A0B
            r3 = r7[r8]
            r2 = r7[r5]
            android.graphics.drawable.Drawable r1 = r12.A0q
            r0 = r7[r11]
            X.AnonymousClass079.A00(r3, r2, r1, r0, r4)
        L_0x0129:
            r12.A0p = r6
            return r5
        L_0x012c:
            r5 = r9
            goto L_0x0129
        L_0x012e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0J():boolean");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.A13;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            A07();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.A0B;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.A0v != null) {
            boolean z = this.A0Q;
            this.A0Q = false;
            CharSequence hint = editText.getHint();
            this.A0B.setHint(this.A0v);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.A0B.setHint(hint);
                this.A0Q = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            FrameLayout frameLayout = this.A13;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
                View childAt = frameLayout.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.A0B) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void drawableStateChanged() {
        boolean z;
        if (!this.A10) {
            boolean z2 = true;
            this.A10 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            AnonymousClass0Z1 r0 = this.A14;
            if (r0 != null) {
                z = r0.A0G(drawableState);
            } else {
                z = false;
            }
            if (this.A0B != null) {
                if (!C011304x.A03(this) || !isEnabled()) {
                    z2 = false;
                }
                A0A(this, z2, false);
            }
            A0D();
            A0E();
            if (z) {
                invalidate();
            }
            this.A10 = false;
        }
    }

    public int getBaseline() {
        EditText editText = this.A0B;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + A00();
        }
        return super.getBaseline();
    }

    public C012505l getBoxBackground() {
        int i = this.A01;
        if (i == 1 || i == 2) {
            return this.A0G;
        }
        throw new IllegalStateException();
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.A0M || !this.A0y || (textView = this.A0C) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public CharSequence getEndIconContentDescription() {
        return this.A15.A0G.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.A15.A0G.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.A15.A00;
    }

    public int getEndIconMode() {
        return this.A15.A01;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.A15.A09;
    }

    public CheckableImageButton getEndIconView() {
        return this.A15.A0G;
    }

    public CharSequence getError() {
        AnonymousClass6VJ r1 = this.A16;
        if (r1.A0F) {
            return r1.A0C;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.A16.A03;
    }

    public CharSequence getErrorContentDescription() {
        return this.A16.A0D;
    }

    public int getErrorCurrentTextColors() {
        TextView textView = this.A16.A0A;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.A15.A0H.getDrawable();
    }

    public CharSequence getHelperText() {
        AnonymousClass6VJ r1 = this.A16;
        if (r1.A0G) {
            return r1.A0E;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.A16.A0B;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A0O) {
            return this.A0u;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.A14.A07();
    }

    public final int getHintCurrentCollapsedTextColor() {
        AnonymousClass0Z1 r1 = this.A14;
        return AnonymousClass0Z1.A01(r1.A0b, r1);
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.A15.A0G.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.A15.A0G.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.A0R) {
            return this.A0L;
        }
        return null;
    }

    public CharSequence getPrefixText() {
        return this.A17.A05;
    }

    public ColorStateList getPrefixTextColor() {
        return this.A17.A07.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.A17.A07;
    }

    public CharSequence getStartIconContentDescription() {
        return this.A17.A08.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.A17.A08.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.A17.A00;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.A17.A04;
    }

    public CharSequence getSuffixText() {
        return this.A15.A0B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.A15.A0F.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.A15.A0F;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C95214kF)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C95214kF r3 = (C95214kF) parcelable;
        super.onRestoreInstanceState(r3.A00);
        setError(r3.A00);
        if (r3.A01) {
            post(new C1497572q(this, 34));
        }
        requestLayout();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A0V = i;
            this.A0Z = i;
            this.A0b = i;
            A03();
        }
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.A01) {
            this.A01 = i;
            if (this.A0B != null) {
                A04();
            }
        }
    }

    public void setBoxCornerFamily(int i) {
        AnonymousClass06J r3 = this.A0J;
        AnonymousClass06M r2 = new AnonymousClass06M(r3);
        AnonymousClass06K r1 = r3.A06;
        r2.A06 = AnonymousClass06R.A00(i);
        r2.A02 = r1;
        AnonymousClass06K r12 = r3.A07;
        r2.A07 = AnonymousClass06R.A00(i);
        r2.A03 = r12;
        AnonymousClass06K r13 = r3.A04;
        r2.A04 = AnonymousClass06R.A00(i);
        r2.A00 = r13;
        AnonymousClass06K r14 = r3.A05;
        r2.A05 = AnonymousClass06R.A00(i);
        r2.A01 = r14;
        this.A0J = new AnonymousClass06J(r2);
        A03();
    }

    public void setBoxStrokeColor(int i) {
        if (this.A0a != i) {
            this.A0a = i;
            A0E();
        }
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0A != colorStateList) {
            this.A0A = colorStateList;
            A0E();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.A04 = i;
        A0E();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.A05 = i;
        A0E();
    }

    public void setCounterEnabled(boolean z) {
        Editable text;
        if (this.A0M != z) {
            if (z) {
                AnonymousClass07P r1 = new AnonymousClass07P(getContext(), (AttributeSet) null);
                this.A0C = r1;
                r1.setId(R.id.textinput_counter);
                Typeface typeface = this.A0o;
                if (typeface != null) {
                    this.A0C.setTypeface(typeface);
                }
                this.A0C.setMaxLines(1);
                this.A16.A05(this.A0C, 2);
                AnonymousClass0YO.A03(AnonymousClass000.A0a(this.A0C), getResources().getDimensionPixelOffset(R.dimen.f7nameremoved));
                A06();
                if (this.A0C != null) {
                    EditText editText = this.A0B;
                    if (editText == null) {
                        text = null;
                    } else {
                        text = editText.getText();
                    }
                    A0H(text);
                }
            } else {
                this.A16.A06(this.A0C, 2);
                this.A0C = null;
            }
            this.A0M = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable text;
        if (this.A07 != i) {
            if (i <= 0) {
                i = -1;
            }
            this.A07 = i;
            if (this.A0M && this.A0C != null) {
                EditText editText = this.A0B;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                A0H(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.A0T != i) {
            this.A0T = i;
            A06();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A0j != colorStateList) {
            this.A0j = colorStateList;
            A06();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.A0U != i) {
            this.A0U = i;
            A06();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.A0k != colorStateList) {
            this.A0k = colorStateList;
            A06();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0l = colorStateList;
        this.A0m = colorStateList;
        if (this.A0B != null) {
            A0A(this, false, false);
        }
    }

    public void setEndIconActivated(boolean z) {
        this.A15.A0G.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.A15.A0G.setCheckable(z);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.A15.A0G;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        C93014fP r1 = this.A15;
        r1.A07(C90494aF.A0G(r1, i));
    }

    public void setEndIconMinSize(int i) {
        this.A15.A05(i);
    }

    public void setEndIconMode(int i) {
        this.A15.A06(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C93014fP r0 = this.A15;
        CheckableImageButton checkableImageButton = r0.A0G;
        View.OnLongClickListener onLongClickListener = r0.A06;
        checkableImageButton.setOnClickListener(onClickListener);
        C132756Vd.A03(onLongClickListener, checkableImageButton);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C93014fP r0 = this.A15;
        r0.A06 = onLongClickListener;
        CheckableImageButton checkableImageButton = r0.A0G;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C132756Vd.A03(onLongClickListener, checkableImageButton);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C93014fP r1 = this.A15;
        r1.A09 = scaleType;
        r1.A0G.setScaleType(scaleType);
        r1.A0H.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C93014fP r3 = this.A15;
        if (r3.A02 != colorStateList) {
            r3.A02 = colorStateList;
            TextInputLayout textInputLayout = r3.A0J;
            C132756Vd.A01(colorStateList, r3.A04, r3.A0G, textInputLayout);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C93014fP r3 = this.A15;
        if (r3.A04 != mode) {
            r3.A04 = mode;
            TextInputLayout textInputLayout = r3.A0J;
            C132756Vd.A01(r3.A02, mode, r3.A0G, textInputLayout);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.A15.A0A(z);
    }

    public void setError(CharSequence charSequence) {
        AnonymousClass6VJ r3 = this.A16;
        if (!r3.A0F) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Animator animator = r3.A05;
            if (animator != null) {
                animator.cancel();
            }
            r3.A0C = charSequence;
            r3.A0A.setText(charSequence);
            int i = r3.A00;
            if (i != 1) {
                r3.A01 = 1;
            }
            AnonymousClass6VJ.A01(r3, i, r3.A01, AnonymousClass6VJ.A02(r3.A0A, r3, charSequence));
            return;
        }
        r3.A04();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        AnonymousClass6VJ r0 = this.A16;
        r0.A03 = i;
        TextView textView = r0.A0A;
        if (textView != null) {
            C011304x.A01(textView, i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        AnonymousClass6VJ r0 = this.A16;
        r0.A0D = charSequence;
        TextView textView = r0.A0A;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        AnonymousClass6VJ r2 = this.A16;
        if (r2.A0F != z) {
            Animator animator = r2.A05;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AnonymousClass07P r1 = new AnonymousClass07P(r2.A0Q, (AttributeSet) null);
                r2.A0A = r1;
                r1.setId(R.id.textinput_error);
                r2.A0A.setTextAlignment(5);
                Typeface typeface = r2.A08;
                if (typeface != null) {
                    r2.A0A.setTypeface(typeface);
                }
                int i = r2.A02;
                r2.A02 = i;
                TextView textView = r2.A0A;
                if (textView != null) {
                    r2.A0R.A0I(textView, i);
                }
                ColorStateList colorStateList = r2.A06;
                r2.A06 = colorStateList;
                TextView textView2 = r2.A0A;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = r2.A0D;
                r2.A0D = charSequence;
                TextView textView3 = r2.A0A;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                int i2 = r2.A03;
                r2.A03 = i2;
                TextView textView4 = r2.A0A;
                if (textView4 != null) {
                    C011304x.A01(textView4, i2);
                }
                r2.A0A.setVisibility(4);
                r2.A05(r2.A0A, 0);
            } else {
                r2.A04();
                r2.A06(r2.A0A, 0);
                r2.A0A = null;
                TextInputLayout textInputLayout = r2.A0R;
                textInputLayout.A0D();
                textInputLayout.A0E();
            }
            r2.A0F = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        C93014fP r3 = this.A15;
        r3.A08(C90494aF.A0G(r3, i));
        TextInputLayout textInputLayout = r3.A0J;
        C132756Vd.A02(r3.A03, r3.A0H, textInputLayout);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C93014fP r0 = this.A15;
        CheckableImageButton checkableImageButton = r0.A0H;
        View.OnLongClickListener onLongClickListener = r0.A07;
        checkableImageButton.setOnClickListener(onClickListener);
        C132756Vd.A03(onLongClickListener, checkableImageButton);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C93014fP r0 = this.A15;
        r0.A07 = onLongClickListener;
        CheckableImageButton checkableImageButton = r0.A0H;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C132756Vd.A03(onLongClickListener, checkableImageButton);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C93014fP r3 = this.A15;
        if (r3.A03 != colorStateList) {
            r3.A03 = colorStateList;
            TextInputLayout textInputLayout = r3.A0J;
            C132756Vd.A01(colorStateList, r3.A05, r3.A0H, textInputLayout);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C93014fP r3 = this.A15;
        if (r3.A05 != mode) {
            r3.A05 = mode;
            TextInputLayout textInputLayout = r3.A0J;
            C132756Vd.A01(r3.A03, mode, r3.A0H, textInputLayout);
        }
    }

    public void setErrorTextAppearance(int i) {
        AnonymousClass6VJ r0 = this.A16;
        r0.A02 = i;
        TextView textView = r0.A0A;
        if (textView != null) {
            r0.A0R.A0I(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        AnonymousClass6VJ r0 = this.A16;
        r0.A06 = colorStateList;
        TextView textView = r0.A0A;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.A0z != z) {
            this.A0z = z;
            A0A(this, false, false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        AnonymousClass6VJ r0 = this.A16;
        r0.A07 = colorStateList;
        TextView textView = r0.A0B;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        AnonymousClass6VJ r4 = this.A16;
        if (r4.A0G != z) {
            Animator animator = r4.A05;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AnonymousClass07P r1 = new AnonymousClass07P(r4.A0Q, (AttributeSet) null);
                r4.A0B = r1;
                r1.setId(R.id.textinput_helper_text);
                r4.A0B.setTextAlignment(5);
                Typeface typeface = r4.A08;
                if (typeface != null) {
                    r4.A0B.setTypeface(typeface);
                }
                r4.A0B.setVisibility(4);
                C011304x.A01(r4.A0B, 1);
                int i = r4.A04;
                r4.A04 = i;
                TextView textView = r4.A0B;
                if (textView != null) {
                    AnonymousClass088.A06(textView, i);
                }
                ColorStateList colorStateList = r4.A07;
                r4.A07 = colorStateList;
                TextView textView2 = r4.A0B;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                r4.A05(r4.A0B, 1);
                r4.A0B.setAccessibilityDelegate(new C92234dM(r4));
            } else {
                Animator animator2 = r4.A05;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = r4.A00;
                if (i2 == 2) {
                    r4.A01 = 0;
                }
                AnonymousClass6VJ.A01(r4, i2, r4.A01, AnonymousClass6VJ.A02(r4.A0B, r4, ""));
                r4.A06(r4.A0B, 1);
                r4.A0B = null;
                TextInputLayout textInputLayout = r4.A0R;
                textInputLayout.A0D();
                textInputLayout.A0E();
            }
            r4.A0G = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        AnonymousClass6VJ r0 = this.A16;
        r0.A04 = i;
        TextView textView = r0.A0B;
        if (textView != null) {
            AnonymousClass088.A06(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.A0O) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void setHintEnabled(boolean z) {
        if (z != this.A0O) {
            this.A0O = z;
            if (!z) {
                this.A0Q = false;
                if (!TextUtils.isEmpty(this.A0u) && TextUtils.isEmpty(this.A0B.getHint())) {
                    this.A0B.setHint(this.A0u);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.A0B.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A0u)) {
                        setHint(hint);
                    }
                    this.A0B.setHint((CharSequence) null);
                }
                this.A0Q = true;
            }
            if (this.A0B != null) {
                A07();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        AnonymousClass0Z1 r0 = this.A14;
        r0.A09(i);
        this.A0m = r0.A0b;
        if (this.A0B != null) {
            A0A(this, false, false);
            A07();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.A0m != colorStateList) {
            if (this.A0l == null) {
                AnonymousClass0Z1 r1 = this.A14;
                if (r1.A0b != colorStateList) {
                    r1.A0b = colorStateList;
                    r1.A0F(false);
                }
            }
            this.A0m = colorStateList;
            if (this.A0B != null) {
                A0A(this, false, false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.A0d = i;
        EditText editText = this.A0B;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.A0e = i;
        EditText editText = this.A0B;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMinEms(int i) {
        this.A0f = i;
        EditText editText = this.A0B;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.A0g = i;
        EditText editText = this.A0B;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C93014fP r0 = this.A15;
        r0.A0G.setContentDescription(C90494aF.A0R(r0, i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C93014fP r0 = this.A15;
        r0.A0G.setImageDrawable(C90494aF.A0G(r0, i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        int i;
        C93014fP r2 = this.A15;
        if (z) {
            i = 1;
            if (r2.A01 == 1) {
                return;
            }
        } else {
            i = 0;
        }
        r2.A06(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C93014fP r0 = this.A15;
        r0.A02 = colorStateList;
        TextInputLayout textInputLayout = r0.A0J;
        C132756Vd.A01(colorStateList, r0.A04, r0.A0G, textInputLayout);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C93014fP r0 = this.A15;
        r0.A04 = mode;
        TextInputLayout textInputLayout = r0.A0J;
        C132756Vd.A01(r0.A02, mode, r0.A0G, textInputLayout);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable text;
        if (this.A0D == null) {
            AnonymousClass07P r1 = new AnonymousClass07P(getContext(), (AttributeSet) null);
            this.A0D = r1;
            r1.setId(R.id.textinput_placeholder);
            C011504z.A06(this.A0D, 2);
            C017507m A012 = A01();
            this.A0E = A012;
            A012.A02 = 67;
            this.A0F = A01();
            setPlaceholderTextAppearance(this.A0h);
            setPlaceholderTextColor(this.A0n);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.A0R) {
                setPlaceholderTextEnabled(true);
            }
            this.A0L = charSequence;
        }
        EditText editText = this.A0B;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        A08(text, this);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.A0h = i;
        TextView textView = this.A0D;
        if (textView != null) {
            AnonymousClass088.A06(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A0n != colorStateList) {
            this.A0n = colorStateList;
            TextView textView = this.A0D;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C92984fL r2 = this.A17;
        CharSequence charSequence2 = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        }
        r2.A05 = charSequence2;
        r2.A07.setText(charSequence);
        C92984fL.A00(r2);
    }

    public void setPrefixTextAppearance(int i) {
        AnonymousClass088.A06(this.A17.A07, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.A17.A07.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(AnonymousClass06J r2) {
        C012505l r0 = this.A0G;
        if (r0 != null && r0.A01.A0K != r2) {
            this.A0J = r2;
            A03();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.A17.A08.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.A17.A08;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconMinSize(int i) {
        C92984fL r1 = this.A17;
        if (i < 0) {
            throw AnonymousClass001.A08("startIconSize cannot be less than 0");
        } else if (i != r1.A00) {
            r1.A00 = i;
            CheckableImageButton checkableImageButton = r1.A08;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C92984fL r0 = this.A17;
        CheckableImageButton checkableImageButton = r0.A08;
        View.OnLongClickListener onLongClickListener = r0.A03;
        checkableImageButton.setOnClickListener(onClickListener);
        C132756Vd.A03(onLongClickListener, checkableImageButton);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C92984fL r0 = this.A17;
        r0.A03 = onLongClickListener;
        CheckableImageButton checkableImageButton = r0.A08;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C132756Vd.A03(onLongClickListener, checkableImageButton);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C92984fL r0 = this.A17;
        r0.A04 = scaleType;
        r0.A08.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C92984fL r3 = this.A17;
        if (r3.A01 != colorStateList) {
            r3.A01 = colorStateList;
            TextInputLayout textInputLayout = r3.A09;
            C132756Vd.A01(colorStateList, r3.A02, r3.A08, textInputLayout);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C92984fL r3 = this.A17;
        if (r3.A02 != mode) {
            r3.A02 = mode;
            TextInputLayout textInputLayout = r3.A09;
            C132756Vd.A01(r3.A01, mode, r3.A08, textInputLayout);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.A17.A03(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C93014fP r2 = this.A15;
        CharSequence charSequence2 = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        }
        r2.A0B = charSequence2;
        r2.A0F.setText(charSequence);
        C93014fP.A02(r2);
    }

    public void setSuffixTextAppearance(int i) {
        AnonymousClass088.A06(this.A15.A0F, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.A15.A0F.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C95174kA r2) {
        EditText editText = this.A0B;
        if (editText != null) {
            C012005e.A0V(editText, r2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0o) {
            this.A0o = typeface;
            AnonymousClass0Z1 r2 = this.A14;
            boolean A042 = AnonymousClass0Z1.A04(typeface, r2);
            boolean A052 = AnonymousClass0Z1.A05(typeface, r2);
            if (A042 || A052) {
                r2.A0F(false);
            }
            AnonymousClass6VJ r1 = this.A16;
            if (typeface != r1.A08) {
                r1.A08 = typeface;
                TextView textView = r1.A0A;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = r1.A0B;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.A0C;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r6 = 2132084403(0x7f1506b3, float:1.9808976E38)
            r0 = r21
            r8 = r22
            r7 = r23
            android.content.Context r0 = X.C27891Qg.A00(r0, r8, r7, r6)
            r13 = r20
            r13.<init>(r0, r8, r7)
            r0 = -1
            r13.A0f = r0
            r13.A0d = r0
            r13.A0g = r0
            r13.A0e = r0
            X.6VJ r1 = new X.6VJ
            r1.<init>(r13)
            r13.A16 = r1
            X.6nf r1 = X.C141696nf.A00
            r13.A0K = r1
            android.graphics.Rect r1 = X.AnonymousClass001.A06()
            r13.A19 = r1
            android.graphics.Rect r1 = X.AnonymousClass001.A06()
            r13.A12 = r1
            android.graphics.RectF r1 = X.C36441kJ.A0N()
            r13.A1A = r1
            java.util.LinkedHashSet r1 = X.C36441kJ.A17()
            r13.A18 = r1
            X.0Z1 r3 = new X.0Z1
            r3.<init>(r13)
            r13.A14 = r3
            android.content.Context r5 = r13.getContext()
            r4 = 1
            r13.setOrientation(r4)
            r1 = 0
            r13.setWillNotDraw(r1)
            r13.setAddStatesFromChildren(r4)
            android.widget.FrameLayout r12 = new android.widget.FrameLayout
            r12.<init>(r5)
            r13.A13 = r12
            r12.setAddStatesFromChildren(r4)
            android.animation.TimeInterpolator r2 = X.AnonymousClass064.A03
            r3.A0Z = r2
            r3.A0F(r1)
            r3.A0Y = r2
            r3.A0F(r1)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r3.A0A(r2)
            int[] r16 = X.C27931Qk.A0f
            r2 = 5
            int[] r10 = new int[r2]
            r2 = 22
            r10[r1] = r2
            r2 = 20
            r10[r4] = r2
            r2 = 38
            r3 = 2
            r10[r3] = r2
            r9 = 43
            r2 = 3
            r10[r2] = r9
            r9 = 47
            r2 = 4
            r10[r2] = r9
            r19 = 2132084403(0x7f1506b3, float:1.9808976E38)
            r14 = r5
            r15 = r8
            r17 = r10
            r18 = r7
            X.04j r11 = X.C013205s.A01(r14, r15, r16, r17, r18, r19)
            X.4fL r10 = new X.4fL
            r10.<init>(r11, r13)
            r13.A17 = r10
            r2 = 46
            android.content.res.TypedArray r9 = r11.A02
            boolean r2 = r9.getBoolean(r2, r4)
            r13.A0O = r2
            r2 = 4
            java.lang.CharSequence r2 = r9.getText(r2)
            r13.setHint((java.lang.CharSequence) r2)
            r2 = 45
            boolean r2 = r9.getBoolean(r2, r4)
            r13.A0N = r2
            r2 = 40
            boolean r2 = r9.getBoolean(r2, r4)
            r13.A0z = r2
            r2 = 6
            boolean r2 = r9.hasValue(r2)
            if (r2 == 0) goto L_0x035b
            r2 = 6
            int r2 = r9.getInt(r2, r0)
            r13.setMinEms(r2)
        L_0x00d1:
            r2 = 5
            boolean r2 = r9.hasValue(r2)
            if (r2 == 0) goto L_0x034c
            r2 = 5
            int r2 = r9.getInt(r2, r0)
            r13.setMaxEms(r2)
        L_0x00e0:
            X.06M r6 = X.AnonymousClass06J.A01(r5, r8, r7, r6)
            X.06J r2 = new X.06J
            r2.<init>(r6)
            r13.A0J = r2
            android.content.res.Resources r6 = r5.getResources()
            r2 = 2131167603(0x7f070973, float:1.7949484E38)
            int r2 = r6.getDimensionPixelOffset(r2)
            r13.A11 = r2
            r2 = 9
            int r2 = r9.getDimensionPixelOffset(r2, r1)
            r13.A02 = r2
            android.content.res.Resources r6 = r5.getResources()
            r2 = 2131167604(0x7f070974, float:1.7949486E38)
            int r6 = r6.getDimensionPixelSize(r2)
            r2 = 16
            int r2 = r9.getDimensionPixelSize(r2, r6)
            r13.A04 = r2
            android.content.res.Resources r6 = r5.getResources()
            r2 = 2131167605(0x7f070975, float:1.7949488E38)
            int r6 = r6.getDimensionPixelSize(r2)
            r2 = 17
            int r2 = r9.getDimensionPixelSize(r2, r6)
            r13.A05 = r2
            int r2 = r13.A04
            r13.A06 = r2
            r2 = 13
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r15 = r9.getDimension(r2, r6)
            r2 = 12
            float r14 = r9.getDimension(r2, r6)
            r2 = 10
            float r8 = r9.getDimension(r2, r6)
            r2 = 11
            float r7 = r9.getDimension(r2, r6)
            X.06J r2 = r13.A0J
            X.06M r6 = new X.06M
            r6.<init>(r2)
            r16 = 0
            int r2 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x0158
            X.06P r2 = new X.06P
            r2.<init>(r15)
            r6.A02 = r2
        L_0x0158:
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x0163
            X.06P r2 = new X.06P
            r2.<init>(r14)
            r6.A03 = r2
        L_0x0163:
            int r2 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x016e
            X.06P r2 = new X.06P
            r2.<init>(r8)
            r6.A01 = r2
        L_0x016e:
            int r2 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x0179
            X.06P r2 = new X.06P
            r2.<init>(r7)
            r6.A00 = r2
        L_0x0179:
            X.06J r2 = new X.06J
            r2.<init>(r6)
            r13.A0J = r2
            r2 = 7
            android.content.res.ColorStateList r6 = X.AnonymousClass061.A01(r5, r11, r2)
            if (r6 == 0) goto L_0x0340
            int r2 = r6.getDefaultColor()
            r13.A0V = r2
            r13.A00 = r2
            boolean r2 = r6.isStateful()
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r2 == 0) goto L_0x0322
            int[] r2 = new int[r4]
            r2[r1] = r7
            int r2 = r6.getColorForState(r2, r0)
            r13.A0X = r2
            int[] r2 = new int[r3]
            r2 = {16842908, 16842910} // fill-array
            int r2 = r6.getColorForState(r2, r0)
            r13.A0Z = r2
            int[] r3 = new int[r3]
            r3 = {16843623, 16842910} // fill-array
        L_0x01b2:
            int r2 = r6.getColorForState(r3, r0)
            r13.A0b = r2
        L_0x01b8:
            r8 = 1
            boolean r2 = r9.hasValue(r4)
            if (r2 == 0) goto L_0x01c7
            android.content.res.ColorStateList r2 = r11.A01(r4)
            r13.A0m = r2
            r13.A0l = r2
        L_0x01c7:
            r2 = 14
            android.content.res.ColorStateList r3 = X.AnonymousClass061.A01(r5, r11, r2)
            r7 = 0
            int r2 = r9.getColor(r2, r1)
            r13.A0a = r2
            r2 = 2131101749(0x7f060835, float:1.7815916E38)
            int r2 = X.AnonymousClass00F.A00(r5, r2)
            r13.A08 = r2
            r2 = 2131101750(0x7f060836, float:1.7815919E38)
            int r2 = X.AnonymousClass00F.A00(r5, r2)
            r13.A0W = r2
            r2 = 2131101753(0x7f060839, float:1.7815925E38)
            int r2 = X.AnonymousClass00F.A00(r5, r2)
            r13.A0c = r2
            if (r3 == 0) goto L_0x01f4
            r13.setBoxStrokeColorStateList(r3)
        L_0x01f4:
            r3 = 15
            boolean r2 = r9.hasValue(r3)
            if (r2 == 0) goto L_0x0203
            android.content.res.ColorStateList r2 = X.AnonymousClass061.A01(r5, r11, r3)
            r13.setBoxStrokeErrorColor(r2)
        L_0x0203:
            r2 = 47
            int r2 = r9.getResourceId(r2, r0)
            if (r2 == r0) goto L_0x0214
            r2 = 47
            int r2 = r9.getResourceId(r2, r1)
            r13.setHintTextAppearance(r2)
        L_0x0214:
            r2 = 38
            int r18 = r9.getResourceId(r2, r1)
            r2 = 33
            java.lang.CharSequence r17 = r9.getText(r2)
            r2 = 32
            int r16 = r9.getInt(r2, r4)
            r2 = 34
            boolean r6 = r9.getBoolean(r2, r1)
            r2 = 43
            int r14 = r9.getResourceId(r2, r1)
            r2 = 42
            boolean r5 = r9.getBoolean(r2, r1)
            r2 = 41
            java.lang.CharSequence r4 = r9.getText(r2)
            r2 = 55
            int r3 = r9.getResourceId(r2, r1)
            r2 = 54
            java.lang.CharSequence r2 = r9.getText(r2)
            r15 = 18
            boolean r1 = r9.getBoolean(r15, r1)
            r15 = 19
            int r0 = r9.getInt(r15, r0)
            r13.setCounterMaxLength(r0)
            r0 = 22
            int r0 = r9.getResourceId(r0, r7)
            r13.A0U = r0
            r0 = 20
            int r0 = r9.getResourceId(r0, r7)
            r13.A0T = r0
            r0 = 8
            int r0 = r9.getInt(r0, r7)
            r13.setBoxBackgroundMode(r0)
            r0 = r17
            r13.setErrorContentDescription(r0)
            r0 = r16
            r13.setErrorAccessibilityLiveRegion(r0)
            int r0 = r13.A0T
            r13.setCounterOverflowTextAppearance(r0)
            r13.setHelperTextTextAppearance(r14)
            r0 = r18
            r13.setErrorTextAppearance(r0)
            int r0 = r13.A0U
            r13.setCounterTextAppearance(r0)
            r13.setPlaceholderText(r2)
            r13.setPlaceholderTextAppearance(r3)
            r2 = 39
            boolean r0 = r9.hasValue(r2)
            if (r0 == 0) goto L_0x02a3
            android.content.res.ColorStateList r0 = r11.A01(r2)
            r13.setErrorTextColor(r0)
        L_0x02a3:
            r2 = 44
            boolean r0 = r9.hasValue(r2)
            if (r0 == 0) goto L_0x02b2
            android.content.res.ColorStateList r0 = r11.A01(r2)
            r13.setHelperTextColor(r0)
        L_0x02b2:
            r2 = 48
            boolean r0 = r9.hasValue(r2)
            if (r0 == 0) goto L_0x02c1
            android.content.res.ColorStateList r0 = r11.A01(r2)
            r13.setHintTextColor(r0)
        L_0x02c1:
            r2 = 23
            boolean r0 = r9.hasValue(r2)
            if (r0 == 0) goto L_0x02d0
            android.content.res.ColorStateList r0 = r11.A01(r2)
            r13.setCounterTextColor(r0)
        L_0x02d0:
            r2 = 21
            boolean r0 = r9.hasValue(r2)
            if (r0 == 0) goto L_0x02df
            android.content.res.ColorStateList r0 = r11.A01(r2)
            r13.setCounterOverflowTextColor(r0)
        L_0x02df:
            r2 = 56
            boolean r0 = r9.hasValue(r2)
            if (r0 == 0) goto L_0x02ee
            android.content.res.ColorStateList r0 = r11.A01(r2)
            r13.setPlaceholderTextColor(r0)
        L_0x02ee:
            X.4fP r14 = new X.4fP
            r14.<init>(r11, r13)
            r13.A15 = r14
            boolean r3 = r9.getBoolean(r7, r8)
            r9.recycle()
            r0 = 2
            X.C011504z.A06(r13, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L_0x0309
            X.C012005e.A0S(r13, r8)
        L_0x0309:
            r12.addView(r10)
            r12.addView(r14)
            r13.addView(r12)
            r13.setEnabled(r3)
            r13.setHelperTextEnabled(r5)
            r13.setErrorEnabled(r6)
            r13.setCounterEnabled(r1)
            r13.setHelperText(r4)
            return
        L_0x0322:
            int r2 = r13.A0V
            r13.A0Z = r2
            r2 = 2131101722(0x7f06081a, float:1.7815862E38)
            android.content.res.ColorStateList r6 = X.C013105r.A00(r5, r2)
            int[] r2 = new int[r4]
            r2[r1] = r7
            int r2 = r6.getColorForState(r2, r0)
            r13.A0X = r2
            int[] r3 = new int[r4]
            r2 = 16843623(0x1010367, float:2.3696E-38)
            r3[r1] = r2
            goto L_0x01b2
        L_0x0340:
            r13.A00 = r1
            r13.A0V = r1
            r13.A0X = r1
            r13.A0Z = r1
            r13.A0b = r1
            goto L_0x01b8
        L_0x034c:
            boolean r2 = r9.hasValue(r3)
            if (r2 == 0) goto L_0x00e0
            int r2 = r9.getDimensionPixelSize(r3, r0)
            r13.setMaxWidth(r2)
            goto L_0x00e0
        L_0x035b:
            r2 = 3
            boolean r2 = r9.hasValue(r2)
            if (r2 == 0) goto L_0x00d1
            r2 = 3
            int r2 = r9.getDimensionPixelSize(r2, r0)
            r13.setMinWidth(r2)
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private C012505l A02(boolean z) {
        float dimensionPixelOffset;
        int i;
        float dimensionPixelOffset2 = (float) getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        float f = 0.0f;
        if (z) {
            f = dimensionPixelOffset2;
        }
        EditText editText = this.A0B;
        if (editText instanceof C93174g3) {
            dimensionPixelOffset = ((C93174g3) editText).A02;
        } else {
            dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        AnonymousClass06M r1 = new AnonymousClass06M();
        r1.A02 = new AnonymousClass06P(f);
        r1.A03 = new AnonymousClass06P(f);
        r1.A00 = new AnonymousClass06P(dimensionPixelOffset2);
        r1.A01 = new AnonymousClass06P(dimensionPixelOffset2);
        AnonymousClass06J r5 = new AnonymousClass06J(r1);
        Context context = getContext();
        Paint paint = C012505l.A0N;
        TypedValue A022 = C014506h.A02(context, "MaterialShapeDrawable", R.attr.f4nameremoved);
        int i2 = A022.resourceId;
        if (i2 != 0) {
            i = AnonymousClass00F.A00(context, i2);
        } else {
            i = A022.data;
        }
        C012505l r3 = new C012505l();
        r3.A0B(context);
        r3.A0C(ColorStateList.valueOf(i));
        r3.A09(dimensionPixelOffset);
        r3.setShapeAppearanceModel(r5);
        AnonymousClass06X r12 = r3.A01;
        if (r12.A0I == null) {
            r12.A0I = AnonymousClass001.A06();
        }
        r3.A01.A0I.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        r3.invalidateSelf();
        return r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05() {
        /*
            r10 = this;
            boolean r0 = r10.A0C()
            if (r0 == 0) goto L_0x00bf
            android.graphics.RectF r5 = r10.A1A
            X.0Z1 r2 = r10.A14
            android.widget.EditText r0 = r10.A0B
            int r8 = r0.getWidth()
            android.widget.EditText r0 = r10.A0B
            int r4 = r0.getGravity()
            java.lang.CharSequence r0 = r2.A0j
            boolean r3 = X.AnonymousClass0Z1.A06(r2, r0)
            r2.A0o = r3
            r0 = 17
            if (r4 == r0) goto L_0x00d7
            r1 = r4 & 7
            r0 = 1
            if (r1 == r0) goto L_0x00d7
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x00ce
            r1 = 5
            r0 = r4 & 5
            if (r0 == r1) goto L_0x00ce
            if (r3 == 0) goto L_0x00d0
        L_0x0035:
            android.graphics.Rect r0 = r2.A11
            int r0 = r0.right
            float r6 = (float) r0
            float r0 = r2.A08
        L_0x003c:
            float r6 = r6 - r0
        L_0x003d:
            android.graphics.Rect r9 = r2.A11
            int r0 = r9.left
            float r0 = (float) r0
            float r7 = java.lang.Math.max(r6, r0)
            r5.left = r7
            int r0 = r9.top
            float r6 = (float) r0
            r5.top = r6
            r0 = 17
            if (r4 == r0) goto L_0x00c0
            r1 = r4 & 7
            r0 = 1
            if (r1 == r0) goto L_0x00c0
            r1 = 8388613(0x800005, float:1.175495E-38)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x00c8
            r1 = 5
            r0 = r4 & 5
            if (r0 == r1) goto L_0x00c8
            if (r3 == 0) goto L_0x00ca
        L_0x0064:
            int r0 = r9.right
            float r7 = (float) r0
        L_0x0067:
            int r0 = r9.right
            float r0 = (float) r0
            float r0 = java.lang.Math.min(r7, r0)
            r5.right = r0
            float r0 = r2.A07()
            float r6 = r6 + r0
            r5.bottom = r6
            float r0 = r5.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bf
            float r0 = r5.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bf
            float r2 = r5.left
            int r0 = r10.A11
            float r1 = (float) r0
            float r2 = r2 - r1
            r5.left = r2
            float r0 = r5.right
            float r0 = r0 + r1
            r5.right = r0
            int r0 = r10.getPaddingLeft()
            int r0 = -r0
            float r3 = (float) r0
            int r0 = r10.getPaddingTop()
            int r0 = -r0
            float r2 = (float) r0
            float r1 = r5.height()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r2 = r2 - r1
            int r0 = r10.A06
            float r0 = (float) r0
            float r2 = r2 + r0
            r5.offset(r3, r2)
            X.05l r4 = r10.A0G
            X.4t2 r4 = (X.C99294t2) r4
            float r3 = r5.left
            float r2 = r5.top
            float r1 = r5.right
            float r0 = r5.bottom
            r4.A0F(r3, r2, r1, r0)
        L_0x00bf:
            return
        L_0x00c0:
            float r7 = (float) r8
            r1 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r1
            float r0 = r2.A08
            float r0 = r0 / r1
            goto L_0x00cc
        L_0x00c8:
            if (r3 == 0) goto L_0x0064
        L_0x00ca:
            float r0 = r2.A08
        L_0x00cc:
            float r7 = r7 + r0
            goto L_0x0067
        L_0x00ce:
            if (r3 == 0) goto L_0x0035
        L_0x00d0:
            android.graphics.Rect r0 = r2.A11
            int r0 = r0.left
            float r6 = (float) r0
            goto L_0x003d
        L_0x00d7:
            float r6 = (float) r8
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r1
            float r0 = r2.A08
            float r0 = r0 / r1
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A05():void");
    }

    public static void A09(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                A09((ViewGroup) childAt, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (android.text.TextUtils.isEmpty(r0.getText()) != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r0.hasFocus() == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(com.google.android.material.textfield.TextInputLayout r8, boolean r9, boolean r10) {
        /*
            boolean r7 = r8.isEnabled()
            android.widget.EditText r0 = r8.A0B
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0015
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r6 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r6 = 0
        L_0x0016:
            android.widget.EditText r0 = r8.A0B
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.hasFocus()
            r5 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            android.content.res.ColorStateList r2 = r8.A0l
            if (r2 == 0) goto L_0x0037
            X.0Z1 r1 = r8.A14
            android.content.res.ColorStateList r0 = r1.A0b
            if (r0 != r2) goto L_0x0030
            android.content.res.ColorStateList r0 = r1.A0d
            if (r0 == r2) goto L_0x0037
        L_0x0030:
            r1.A0b = r2
            r1.A0d = r2
            r1.A0F(r4)
        L_0x0037:
            if (r7 != 0) goto L_0x012b
            android.content.res.ColorStateList r2 = r8.A0l
            if (r2 == 0) goto L_0x0127
            int[] r1 = new int[r3]
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r1[r4] = r0
            int r0 = r8.A0W
            int r0 = r2.getColorForState(r1, r0)
        L_0x004a:
            X.0Z1 r2 = r8.A14
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
        L_0x0050:
            android.content.res.ColorStateList r0 = r2.A0b
            if (r0 != r1) goto L_0x0058
            android.content.res.ColorStateList r0 = r2.A0d
            if (r0 == r1) goto L_0x005f
        L_0x0058:
            r2.A0b = r1
            r2.A0d = r1
            r2.A0F(r4)
        L_0x005f:
            if (r6 != 0) goto L_0x006d
            boolean r0 = r8.A0z
            if (r0 == 0) goto L_0x006d
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L_0x00ba
            if (r5 == 0) goto L_0x00ba
        L_0x006d:
            if (r10 != 0) goto L_0x0073
            boolean r0 = r8.A0P
            if (r0 == 0) goto L_0x00ae
        L_0x0073:
            android.animation.ValueAnimator r0 = r8.A09
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0082
            android.animation.ValueAnimator r0 = r8.A09
            r0.cancel()
        L_0x0082:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x00b4
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x00b4
            r8.A0G(r1)
        L_0x008d:
            r8.A0P = r4
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x0098
            r8.A05()
        L_0x0098:
            android.widget.EditText r0 = r8.A0B
            if (r0 != 0) goto L_0x00af
            r0 = 0
        L_0x009d:
            A08(r0, r8)
            X.4fL r0 = r8.A17
            r0.A06 = r4
            X.C92984fL.A00(r0)
            X.4fP r0 = r8.A15
            r0.A0C = r4
        L_0x00ab:
            X.C93014fP.A02(r0)
        L_0x00ae:
            return
        L_0x00af:
            android.text.Editable r0 = r0.getText()
            goto L_0x009d
        L_0x00b4:
            X.0Z1 r0 = r8.A14
            r0.A08(r1)
            goto L_0x008d
        L_0x00ba:
            if (r10 != 0) goto L_0x00c0
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x00ae
        L_0x00c0:
            android.animation.ValueAnimator r0 = r8.A09
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x00cf
            android.animation.ValueAnimator r0 = r8.A09
            r0.cancel()
        L_0x00cf:
            r1 = 0
            if (r9 == 0) goto L_0x0121
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x0121
            r8.A0G(r1)
        L_0x00d9:
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x00fa
            X.05l r0 = r8.A0G
            X.4t2 r0 = (X.C99294t2) r0
            android.graphics.RectF r0 = r0.A00
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x00fa
            X.05l r0 = r8.A0G
            X.4t2 r0 = (X.C99294t2) r0
            r0.A0F(r1, r1, r1, r1)
        L_0x00fa:
            r8.A0P = r3
            android.widget.TextView r1 = r8.A0D
            if (r1 == 0) goto L_0x0115
            boolean r0 = r8.A0R
            if (r0 == 0) goto L_0x0115
            r0 = 0
            r1.setText(r0)
            android.widget.FrameLayout r1 = r8.A13
            X.07m r0 = r8.A0F
            X.C018607y.A02(r1, r0)
            android.widget.TextView r1 = r8.A0D
            r0 = 4
            r1.setVisibility(r0)
        L_0x0115:
            X.4fL r0 = r8.A17
            r0.A06 = r3
            X.C92984fL.A00(r0)
            X.4fP r0 = r8.A15
            r0.A0C = r3
            goto L_0x00ab
        L_0x0121:
            X.0Z1 r0 = r8.A14
            r0.A08(r1)
            goto L_0x00d9
        L_0x0127:
            int r0 = r8.A0W
            goto L_0x004a
        L_0x012b:
            X.6VJ r1 = r8.A16
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x013c
            X.0Z1 r2 = r8.A14
            android.widget.TextView r0 = r1.A0A
            if (r0 != 0) goto L_0x0146
            r1 = 0
            goto L_0x0050
        L_0x013c:
            boolean r0 = r8.A0y
            if (r0 == 0) goto L_0x014c
            android.widget.TextView r0 = r8.A0C
            if (r0 == 0) goto L_0x014c
            X.0Z1 r2 = r8.A14
        L_0x0146:
            android.content.res.ColorStateList r1 = r0.getTextColors()
            goto L_0x0050
        L_0x014c:
            if (r5 == 0) goto L_0x005f
            android.content.res.ColorStateList r2 = r8.A0m
            if (r2 == 0) goto L_0x005f
            X.0Z1 r1 = r8.A14
            android.content.res.ColorStateList r0 = r1.A0b
            if (r0 == r2) goto L_0x005f
            r1.A0b = r2
            r1.A0F(r4)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0A(com.google.android.material.textfield.TextInputLayout, boolean, boolean):void");
    }

    private void A0B(boolean z) {
        Context context = getContext();
        TypedValue A012 = C014506h.A01(context, R.attr.f4nameremoved);
        ColorStateList colorStateList = null;
        if (A012 != null) {
            int i = A012.resourceId;
            if (i != 0) {
                colorStateList = AnonymousClass00F.A04(context, i);
            } else {
                int i2 = A012.data;
                if (i2 != 0) {
                    colorStateList = ColorStateList.valueOf(i2);
                }
            }
        }
        EditText editText = this.A0B;
        if (editText != null && editText.getTextCursorDrawable() != null && colorStateList != null) {
            Drawable textCursorDrawable = this.A0B.getTextCursorDrawable();
            if (z && (colorStateList = this.A0A) == null) {
                colorStateList = ColorStateList.valueOf(this.A03);
            }
            AnonymousClass076.A01(colorStateList, textCursorDrawable);
        }
    }

    public void A0I(TextView textView, int i) {
        try {
            AnonymousClass088.A06(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        AnonymousClass088.A06(textView, R.style.f13nameremoved);
        C36331k8.A0r(getContext(), textView, R.color.f6nameremoved);
    }

    public void draw(Canvas canvas) {
        C012505l r0;
        super.draw(canvas);
        if (this.A0O) {
            this.A14.A0E(canvas);
        }
        if (this.A0I != null && (r0 = this.A0H) != null) {
            r0.draw(canvas);
            if (this.A0B.isFocused()) {
                Rect bounds = this.A0I.getBounds();
                Rect bounds2 = this.A0H.getBounds();
                float f = this.A14.A0G;
                int centerX = bounds2.centerX();
                int i = bounds2.left;
                TimeInterpolator timeInterpolator = AnonymousClass064.A02;
                bounds.left = C90504aG.A06(f, i, centerX);
                bounds.right = C90504aG.A06(f, bounds2.right, centerX);
                this.A0I.draw(canvas);
            }
        }
    }

    public int getBoxBackgroundColor() {
        return this.A00;
    }

    public int getBoxBackgroundMode() {
        return this.A01;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.A02;
    }

    public float getBoxCornerRadiusBottomEnd() {
        AnonymousClass06K r1;
        boolean A072 = AnonymousClass04F.A07(this);
        AnonymousClass06J r0 = this.A0J;
        if (A072) {
            r1 = r0.A04;
        } else {
            r1 = r0.A05;
        }
        return r1.BAD(this.A1A);
    }

    public float getBoxCornerRadiusBottomStart() {
        AnonymousClass06K r1;
        boolean A072 = AnonymousClass04F.A07(this);
        AnonymousClass06J r0 = this.A0J;
        if (A072) {
            r1 = r0.A05;
        } else {
            r1 = r0.A04;
        }
        return r1.BAD(this.A1A);
    }

    public float getBoxCornerRadiusTopEnd() {
        AnonymousClass06K r1;
        boolean A072 = AnonymousClass04F.A07(this);
        AnonymousClass06J r0 = this.A0J;
        if (A072) {
            r1 = r0.A06;
        } else {
            r1 = r0.A07;
        }
        return r1.BAD(this.A1A);
    }

    public float getBoxCornerRadiusTopStart() {
        AnonymousClass06K r1;
        boolean A072 = AnonymousClass04F.A07(this);
        AnonymousClass06J r0 = this.A0J;
        if (A072) {
            r1 = r0.A07;
        } else {
            r1 = r0.A06;
        }
        return r1.BAD(this.A1A);
    }

    public int getBoxStrokeColor() {
        return this.A0a;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0A;
    }

    public int getBoxStrokeWidth() {
        return this.A04;
    }

    public int getBoxStrokeWidthFocused() {
        return this.A05;
    }

    public int getCounterMaxLength() {
        return this.A07;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A0j;
    }

    public ColorStateList getCounterTextColor() {
        return this.A0k;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0l;
    }

    public EditText getEditText() {
        return this.A0B;
    }

    public ColorStateList getHintTextColor() {
        return this.A0m;
    }

    public AnonymousClass7f8 getLengthCounter() {
        return this.A0K;
    }

    public int getMaxEms() {
        return this.A0d;
    }

    public int getMaxWidth() {
        return this.A0e;
    }

    public int getMinEms() {
        return this.A0f;
    }

    public int getMinWidth() {
        return this.A0g;
    }

    public int getPlaceholderTextAppearance() {
        return this.A0h;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A0n;
    }

    public AnonymousClass06J getShapeAppearanceModel() {
        return this.A0J;
    }

    public Typeface getTypeface() {
        return this.A0o;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A14.A0D(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            super.onLayout(r10, r11, r12, r13, r14)
            android.widget.EditText r0 = r9.A0B
            if (r0 == 0) goto L_0x014d
            android.graphics.Rect r5 = r9.A19
            X.C07420Xp.A01(r5, r0, r9)
            X.05l r4 = r9.A0H
            if (r4 == 0) goto L_0x001d
            int r3 = r5.bottom
            int r0 = r9.A04
            int r2 = r3 - r0
            int r1 = r5.left
            int r0 = r5.right
            r4.setBounds(r1, r2, r0, r3)
        L_0x001d:
            X.05l r4 = r9.A0I
            if (r4 == 0) goto L_0x002e
            int r3 = r5.bottom
            int r0 = r9.A05
            int r2 = r3 - r0
            int r1 = r5.left
            int r0 = r5.right
            r4.setBounds(r1, r2, r0, r3)
        L_0x002e:
            boolean r0 = r9.A0O
            if (r0 == 0) goto L_0x014d
            X.0Z1 r4 = r9.A14
            android.widget.EditText r0 = r9.A0B
            float r1 = r0.getTextSize()
            float r0 = r4.A0M
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0046
            r4.A0M = r1
            r0 = 0
            r4.A0F(r0)
        L_0x0046:
            android.widget.EditText r0 = r9.A0B
            int r1 = r0.getGravity()
            r0 = r1 & -113(0xffffffffffffff8f, float:NaN)
            r0 = r0 | 48
            r4.A0A(r0)
            r4.A0C(r1)
            android.widget.EditText r0 = r9.A0B
            if (r0 == 0) goto L_0x01bc
            android.graphics.Rect r3 = r9.A12
            boolean r7 = X.AnonymousClass04F.A07(r9)
            int r0 = r5.bottom
            r3.bottom = r0
            int r1 = r9.A01
            r0 = 1
            if (r1 == r0) goto L_0x0190
            r0 = 2
            if (r1 == r0) goto L_0x0171
            int r2 = r5.left
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingLeft()
            int r2 = r2 + r0
            X.4fL r6 = r9.A17
            java.lang.CharSequence r0 = r6.A05
            if (r0 == 0) goto L_0x0089
            if (r7 != 0) goto L_0x0089
            android.widget.TextView r1 = r6.A07
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 - r0
            int r0 = r1.getPaddingLeft()
            int r2 = r2 + r0
        L_0x0089:
            r3.left = r2
            int r1 = r9.getPaddingTop()
        L_0x008f:
            r3.top = r1
            int r8 = r5.right
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingRight()
            int r8 = r8 - r0
            java.lang.CharSequence r0 = r6.A05
            if (r0 == 0) goto L_0x00ac
            if (r7 == 0) goto L_0x00ac
            android.widget.TextView r0 = r6.A07
            int r1 = r0.getMeasuredWidth()
            int r0 = r0.getPaddingRight()
            int r1 = r1 - r0
            int r8 = r8 + r1
        L_0x00ac:
            r3.right = r8
            int r7 = r3.left
            int r6 = r3.top
            int r2 = r3.bottom
            android.graphics.Rect r1 = r4.A11
            int r0 = r1.left
            if (r0 != r7) goto L_0x0169
            int r0 = r1.top
            if (r0 != r6) goto L_0x0169
            int r0 = r1.right
            if (r0 != r8) goto L_0x0169
            int r0 = r1.bottom
            if (r0 != r2) goto L_0x0169
        L_0x00c6:
            android.widget.EditText r0 = r9.A0B
            if (r0 == 0) goto L_0x01b6
            android.text.TextPaint r1 = r4.A15
            float r0 = r4.A0M
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = r4.A0f
            r1.setTypeface(r0)
            float r0 = r4.A0H
            r1.setLetterSpacing(r0)
            float r0 = r1.ascent()
            float r2 = -r0
            int r1 = r5.left
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingLeft()
            int r1 = r1 + r0
            r3.left = r1
            int r0 = r9.A01
            r1 = 1
            if (r0 != r1) goto L_0x015f
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getMinLines()
            if (r0 > r1) goto L_0x015f
            int r0 = r5.centerY()
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r2 / r0
            float r1 = r1 - r0
            int r1 = (int) r1
        L_0x0103:
            r3.top = r1
            int r1 = r5.right
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingRight()
            int r1 = r1 - r0
            r3.right = r1
            int r0 = r9.A01
            r1 = 1
            if (r0 != r1) goto L_0x0155
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getMinLines()
            if (r0 > r1) goto L_0x0155
            int r0 = r3.top
            float r0 = (float) r0
            float r0 = r0 + r2
            int r1 = (int) r0
        L_0x0122:
            r3.bottom = r1
            int r6 = r3.left
            int r5 = r3.top
            int r3 = r3.right
            android.graphics.Rect r2 = r4.A12
            int r0 = r2.left
            if (r0 != r6) goto L_0x014e
            int r0 = r2.top
            if (r0 != r5) goto L_0x014e
            int r0 = r2.right
            if (r0 != r3) goto L_0x014e
            int r0 = r2.bottom
            if (r0 != r1) goto L_0x014e
        L_0x013c:
            r0 = 0
            r4.A0F(r0)
            boolean r0 = r9.A0C()
            if (r0 == 0) goto L_0x014d
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x014d
            r9.A05()
        L_0x014d:
            return
        L_0x014e:
            r2.set(r6, r5, r3, r1)
            r0 = 1
            r4.A0m = r0
            goto L_0x013c
        L_0x0155:
            int r1 = r5.bottom
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingBottom()
            int r1 = r1 - r0
            goto L_0x0122
        L_0x015f:
            int r1 = r5.top
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingTop()
            int r1 = r1 + r0
            goto L_0x0103
        L_0x0169:
            r1.set(r7, r6, r8, r2)
            r0 = 1
            r4.A0m = r0
            goto L_0x00c6
        L_0x0171:
            int r1 = r5.left
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getPaddingLeft()
            int r1 = r1 + r0
            r3.left = r1
            int r1 = r5.top
            int r0 = r9.A00()
            int r1 = r1 - r0
            r3.top = r1
            int r8 = r5.right
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getPaddingRight()
            int r8 = r8 - r0
            goto L_0x00ac
        L_0x0190:
            int r2 = r5.left
            android.widget.EditText r0 = r9.A0B
            int r0 = r0.getCompoundPaddingLeft()
            int r2 = r2 + r0
            X.4fL r6 = r9.A17
            java.lang.CharSequence r0 = r6.A05
            if (r0 == 0) goto L_0x01ad
            if (r7 != 0) goto L_0x01ad
            android.widget.TextView r1 = r6.A07
            int r0 = r1.getMeasuredWidth()
            int r2 = r2 - r0
            int r0 = r1.getPaddingLeft()
            int r2 = r2 + r0
        L_0x01ad:
            r3.left = r2
            int r1 = r5.top
            int r0 = r9.A02
            int r1 = r1 + r0
            goto L_0x008f
        L_0x01b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x01bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        if (this.A0B == null || this.A0B.getMeasuredHeight() >= (max = Math.max(this.A15.getMeasuredHeight(), this.A17.getMeasuredHeight()))) {
            z = false;
        } else {
            this.A0B.setMinimumHeight(max);
            z = true;
        }
        boolean A0J2 = A0J();
        if (z || A0J2) {
            this.A0B.post(new C1497572q(this, 35));
        }
        if (!(this.A0D == null || (editText = this.A0B) == null)) {
            this.A0D.setGravity(editText.getGravity());
            this.A0D.setPadding(this.A0B.getCompoundPaddingLeft(), this.A0B.getCompoundPaddingTop(), this.A0B.getCompoundPaddingRight(), this.A0B.getCompoundPaddingBottom());
        }
        this.A15.A04();
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean A1O = AnonymousClass000.A1O(i);
        if (A1O != this.A0w) {
            AnonymousClass06K r0 = this.A0J.A06;
            RectF rectF = this.A1A;
            float BAD = r0.BAD(rectF);
            float BAD2 = this.A0J.A07.BAD(rectF);
            float BAD3 = this.A0J.A04.BAD(rectF);
            float BAD4 = this.A0J.A05.BAD(rectF);
            AnonymousClass06J r02 = this.A0J;
            AnonymousClass06N r4 = r02.A0A;
            AnonymousClass06N r3 = r02.A0B;
            AnonymousClass06N r2 = r02.A08;
            AnonymousClass06N r03 = r02.A09;
            AnonymousClass06M r1 = new AnonymousClass06M();
            r1.A06 = r3;
            r1.A07 = r4;
            r1.A04 = r03;
            r1.A05 = r2;
            r1.A02 = new AnonymousClass06P(BAD2);
            r1.A03 = new AnonymousClass06P(BAD);
            r1.A00 = new AnonymousClass06P(BAD4);
            r1.A01 = new AnonymousClass06P(BAD3);
            AnonymousClass06J r04 = new AnonymousClass06J(r1);
            this.A0w = A1O;
            setShapeAppearanceModel(r04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r1.A0G.isChecked() == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.4kF r2 = new X.4kF
            r2.<init>(r0)
            X.6VJ r0 = r3.A16
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0017
            java.lang.CharSequence r0 = r3.getError()
            r2.A00 = r0
        L_0x0017:
            X.4fP r1 = r3.A15
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0026
            com.google.android.material.internal.CheckableImageButton r0 = r1.A0G
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r2.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onSaveInstanceState():android.os.Parcelable");
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C36381kD.A05(this, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.A0V = defaultColor;
        this.A00 = defaultColor;
        this.A0X = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.A0Z = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.A0b = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        A03();
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.A08 = colorStateList.getDefaultColor();
            this.A0W = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.A0c = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.A0a != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            A0E();
        }
        this.A0a = defaultColor;
        A0E();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(C36371kC.A03(this, i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(C36371kC.A03(this, i));
    }

    public void setEnabled(boolean z) {
        A09(this, z);
        super.setEnabled(z);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            AnonymousClass6VJ r3 = this.A16;
            if (!r3.A0G) {
                setHelperTextEnabled(true);
            }
            Animator animator = r3.A05;
            if (animator != null) {
                animator.cancel();
            }
            r3.A0E = charSequence;
            r3.A0B.setText(charSequence);
            int i = r3.A00;
            if (i != 2) {
                r3.A01 = 2;
            }
            AnonymousClass6VJ.A01(r3, i, r3.A01, AnonymousClass6VJ.A02(r3.A0B, r3, charSequence));
        } else if (this.A16.A0G) {
            setHelperTextEnabled(false);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(C36341k9.A0F(this).getDimensionPixelSize(i));
    }

    public void setMinWidthResource(int i) {
        setMinWidth(C36341k9.A0F(this).getDimensionPixelSize(i));
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(C90494aF.A0G(this, i));
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.A02 = i;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A0N = z;
    }

    public void setLengthCounter(AnonymousClass7f8 r1) {
        this.A0K = r1;
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public void setEndIconContentDescription(int i) {
        C93014fP r0 = this.A15;
        C90504aG.A15(r0.A0G, C90494aF.A0R(r0, i));
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.A15.A07(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.A15.A08(drawable);
    }

    public void setHint(int i) {
        setHint(C90494aF.A0R(this, i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.A15.A0G.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.A15.A0G.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(C90494aF.A0R(this, i));
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.A17.A02(drawable);
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
