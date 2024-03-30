package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.4fP  reason: invalid class name and case insensitive filesystem */
public class C93014fP extends LinearLayout {
    public int A00;
    public int A01 = 0;
    public ColorStateList A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04;
    public PorterDuff.Mode A05;
    public View.OnLongClickListener A06;
    public View.OnLongClickListener A07;
    public EditText A08;
    public ImageView.ScaleType A09;
    public C16700pw A0A;
    public CharSequence A0B;
    public boolean A0C;
    public final TextWatcher A0D = new C99284t1(this);
    public final AccessibilityManager A0E;
    public final TextView A0F;
    public final CheckableImageButton A0G;
    public final CheckableImageButton A0H;
    public final C122195uS A0I;
    public final TextInputLayout A0J;
    public final LinkedHashSet A0K = C36441kJ.A17();
    public final FrameLayout A0L;
    public final AnonymousClass7f9 A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A0H.getVisibility() == 0) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r4.A0C != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r4 = this;
            android.widget.FrameLayout r3 = r4.A0L
            com.google.android.material.internal.CheckableImageButton r0 = r4.A0G
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 != 0) goto L_0x0015
            com.google.android.material.internal.CheckableImageButton r0 = r4.A0H
            int r1 = r0.getVisibility()
            r0 = 0
            if (r1 != 0) goto L_0x0017
        L_0x0015:
            r0 = 8
        L_0x0017:
            r3.setVisibility(r0)
            java.lang.CharSequence r0 = r4.A0B
            if (r0 == 0) goto L_0x0023
            boolean r0 = r4.A0C
            r1 = 0
            if (r0 == 0) goto L_0x0025
        L_0x0023:
            r1 = 8
        L_0x0025:
            boolean r0 = r4.A0B()
            if (r0 != 0) goto L_0x0035
            com.google.android.material.internal.CheckableImageButton r0 = r4.A0H
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0035
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            r4.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93014fP.A00():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1.A07() != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C93014fP r4) {
        /*
            com.google.android.material.internal.CheckableImageButton r3 = r4.A0H
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            r2 = 0
            if (r0 == 0) goto L_0x002a
            com.google.android.material.textfield.TextInputLayout r0 = r4.A0J
            X.6VJ r1 = r0.A16
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x002a
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002a
        L_0x0017:
            r3.setVisibility(r2)
            r4.A00()
            r4.A04()
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0029
            com.google.android.material.textfield.TextInputLayout r0 = r4.A0J
            r0.A0J()
        L_0x0029:
            return
        L_0x002a:
            r2 = 8
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93014fP.A01(X.4fP):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5.A0C != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C93014fP r5) {
        /*
            android.widget.TextView r4 = r5.A0F
            int r1 = r4.getVisibility()
            java.lang.CharSequence r0 = r5.A0B
            r3 = 0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r5.A0C
            r2 = 0
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r2 = 8
        L_0x0012:
            if (r1 == r2) goto L_0x002a
            X.6Fq r1 = r5.A03()
            if (r2 != 0) goto L_0x001b
            r3 = 1
        L_0x001b:
            boolean r0 = r1 instanceof X.C99374tB
            if (r0 == 0) goto L_0x002a
            X.4tB r1 = (X.C99374tB) r1
            X.4fP r0 = r1.A02
            java.lang.CharSequence r0 = r0.A0B
            if (r0 == 0) goto L_0x002a
            X.C99374tB.A00(r1, r3)
        L_0x002a:
            r5.A00()
            r4.setVisibility(r2)
            com.google.android.material.textfield.TextInputLayout r0 = r5.A0J
            r0.A0J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93014fP.A02(X.4fP):void");
    }

    public C129176Fq A03() {
        C122195uS r5 = this.A0I;
        int i = this.A01;
        SparseArray sparseArray = r5.A02;
        C129176Fq r2 = (C129176Fq) sparseArray.get(i);
        if (r2 == null) {
            if (i == -1) {
                r2 = new C99364tA(r5.A03);
            } else if (i == 0) {
                r2 = new C99354t9(r5.A03);
            } else if (i == 1) {
                r2 = new AnonymousClass21U(r5.A03, r5.A01);
            } else if (i == 2) {
                r2 = new C99374tB(r5.A03);
            } else if (i == 3) {
                r2 = new C99384tC(r5.A03);
            } else {
                throw AnonymousClass000.A0d("Invalid end icon mode: ", AnonymousClass000.A0u(), i);
            }
            sparseArray.append(i, r2);
        }
        return r2;
    }

    public void A04() {
        int i;
        TextInputLayout textInputLayout = this.A0J;
        if (textInputLayout.A0B != null) {
            if (A0B() || this.A0H.getVisibility() == 0) {
                i = 0;
            } else {
                i = AnonymousClass04F.A02(textInputLayout.A0B);
            }
            AnonymousClass04F.A06(this.A0F, C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved), textInputLayout.A0B.getPaddingTop(), i, textInputLayout.A0B.getPaddingBottom());
        }
    }

    public void A05(int i) {
        if (i < 0) {
            throw AnonymousClass001.A08("endIconSize cannot be less than 0");
        } else if (i != this.A00) {
            this.A00 = i;
            CheckableImageButton checkableImageButton = this.A0G;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = this.A0H;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void A06(int i) {
        Drawable A012;
        C16700pw r0;
        View.OnFocusChangeListener onFocusChangeListener;
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        if (this.A01 != i) {
            C129176Fq A032 = A03();
            C16700pw r1 = this.A0A;
            if (!(r1 == null || (accessibilityManager2 = this.A0E) == null)) {
                AnonymousClass0VP.A01(accessibilityManager2, r1);
            }
            this.A0A = null;
            A032.A07();
            this.A01 = i;
            Iterator it = this.A0K.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("onEndIconChanged");
            }
            A0A(AnonymousClass000.A1P(i));
            C129176Fq A033 = A03();
            int i2 = this.A0I.A00;
            if (i2 == 0 && (i2 = A033.A03()) == 0) {
                A012 = null;
            } else {
                A012 = C013105r.A01(getContext(), i2);
            }
            A07(A012);
            CharSequence A0R = C90494aF.A0R(this, A033.A02());
            CheckableImageButton checkableImageButton = this.A0G;
            C90504aG.A15(checkableImageButton, A0R);
            checkableImageButton.setCheckable(A033.A0A());
            TextInputLayout textInputLayout = this.A0J;
            int i3 = textInputLayout.A01;
            boolean z = A033 instanceof C99384tC;
            if (!z || AnonymousClass000.A1P(i3)) {
                A033.A06();
                if (z) {
                    r0 = ((C99384tC) A033).A0D;
                } else {
                    r0 = null;
                }
                this.A0A = r0;
                if (!(r0 == null || (accessibilityManager = this.A0E) == null || !C011304x.A02(this))) {
                    AnonymousClass0VP.A00(accessibilityManager, this.A0A);
                }
                View.OnClickListener A042 = A033.A04();
                View.OnLongClickListener onLongClickListener = this.A06;
                checkableImageButton.setOnClickListener(A042);
                C132756Vd.A03(onLongClickListener, checkableImageButton);
                EditText editText = this.A08;
                if (editText != null) {
                    A033.A08(editText);
                    EditText editText2 = this.A08;
                    if (editText2 != null) {
                        View.OnFocusChangeListener A052 = A033.A05();
                        if (A052 != null) {
                            editText2.setOnFocusChangeListener(A052);
                        }
                        if ((A033 instanceof C99374tB) && (onFocusChangeListener = ((C99374tB) A033).A08) != null) {
                            checkableImageButton.setOnFocusChangeListener(onFocusChangeListener);
                        }
                    }
                }
                C132756Vd.A01(this.A02, this.A04, checkableImageButton, textInputLayout);
                A09(true);
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("The current box background mode ");
            A0u.append(i3);
            throw C90464aC.A0R(" is not supported by the end icon mode ", A0u, i);
        }
    }

    public void A07(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A0G;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            TextInputLayout textInputLayout = this.A0J;
            C132756Vd.A01(this.A02, this.A04, checkableImageButton, textInputLayout);
            C132756Vd.A02(this.A02, checkableImageButton, textInputLayout);
        }
    }

    public void A08(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A0H;
        checkableImageButton.setImageDrawable(drawable);
        A01(this);
        C132756Vd.A01(this.A03, this.A05, checkableImageButton, this.A0J);
    }

    public boolean A0B() {
        if (this.A0L.getVisibility() == 0 && this.A0G.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public C93014fP(C010404j r12, TextInputLayout textInputLayout) {
        super(textInputLayout.getContext());
        C141706ng r9 = new C141706ng(this);
        this.A0M = r9;
        this.A0E = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.A0J = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.A0L = frameLayout;
        frameLayout.setVisibility(8);
        C90514aH.A1J(frameLayout, -2, -1);
        LayoutInflater A0C2 = C36351kA.A0C(this);
        CheckableImageButton checkableImageButton = (CheckableImageButton) A0C2.inflate(R.layout.f9nameremoved, this, false);
        checkableImageButton.setId(R.id.text_input_error_icon);
        C132756Vd.A04(checkableImageButton);
        if (AnonymousClass061.A03(getContext())) {
            AnonymousClass0YO.A03(AnonymousClass000.A0a(checkableImageButton), 0);
        }
        this.A0H = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) A0C2.inflate(R.layout.f9nameremoved, frameLayout, false);
        checkableImageButton2.setId(R.id.text_input_end_icon);
        C132756Vd.A04(checkableImageButton2);
        if (AnonymousClass061.A03(getContext())) {
            AnonymousClass0YO.A03(AnonymousClass000.A0a(checkableImageButton2), 0);
        }
        this.A0G = checkableImageButton2;
        this.A0I = new C122195uS(r12, this);
        AnonymousClass07P r3 = new AnonymousClass07P(getContext(), (AttributeSet) null);
        this.A0F = r3;
        TypedArray typedArray = r12.A02;
        if (typedArray.hasValue(36)) {
            this.A03 = AnonymousClass061.A01(getContext(), r12, 36);
        }
        if (typedArray.hasValue(37)) {
            this.A05 = AnonymousClass062.A01((PorterDuff.Mode) null, typedArray.getInt(37, -1));
        }
        if (typedArray.hasValue(35)) {
            A08(r12.A02(35));
        }
        CheckableImageButton checkableImageButton3 = this.A0H;
        checkableImageButton3.setContentDescription(getResources().getText(R.string.f12nameremoved));
        C011504z.A06(checkableImageButton3, 2);
        checkableImageButton3.setClickable(false);
        checkableImageButton3.A01 = false;
        checkableImageButton3.setFocusable(false);
        if (!typedArray.hasValue(51)) {
            if (typedArray.hasValue(30)) {
                this.A02 = AnonymousClass061.A01(getContext(), r12, 30);
            }
            if (typedArray.hasValue(31)) {
                this.A04 = AnonymousClass062.A01((PorterDuff.Mode) null, typedArray.getInt(31, -1));
            }
        }
        if (typedArray.hasValue(28)) {
            A06(typedArray.getInt(28, 0));
            if (typedArray.hasValue(25)) {
                C90504aG.A15(this.A0G, typedArray.getText(25));
            }
            this.A0G.setCheckable(typedArray.getBoolean(24, true));
        } else if (typedArray.hasValue(51)) {
            if (typedArray.hasValue(52)) {
                this.A02 = AnonymousClass061.A01(getContext(), r12, 52);
            }
            if (typedArray.hasValue(53)) {
                this.A04 = AnonymousClass062.A01((PorterDuff.Mode) null, typedArray.getInt(53, -1));
            }
            A06(typedArray.getBoolean(51, false) ? 1 : 0);
            C90504aG.A15(this.A0G, typedArray.getText(49));
        }
        A05(typedArray.getDimensionPixelSize(27, getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
        if (typedArray.hasValue(29)) {
            ImageView.ScaleType A002 = C132756Vd.A00(typedArray.getInt(29, -1));
            this.A09 = A002;
            this.A0G.setScaleType(A002);
            this.A0H.setScaleType(A002);
        }
        TextView textView = this.A0F;
        textView.setVisibility(8);
        textView.setId(R.id.textinput_suffix_text);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        C011304x.A01(textView, 1);
        AnonymousClass088.A06(textView, typedArray.getResourceId(70, 0));
        if (typedArray.hasValue(71)) {
            textView.setTextColor(r12.A01(71));
        }
        CharSequence text = typedArray.getText(69);
        this.A0B = TextUtils.isEmpty(text) ? null : text;
        textView.setText(text);
        A02(this);
        frameLayout.addView(checkableImageButton2);
        addView(r3);
        addView(frameLayout);
        addView(checkableImageButton);
        textInputLayout.A18.add(r9);
        if (textInputLayout.A0B != null) {
            r9.BWM(textInputLayout);
        }
        addOnAttachStateChangeListener(new C163397q8(this, 2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r6.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r2 = r6.A0G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(boolean r7) {
        /*
            r6 = this;
            X.6Fq r5 = r6.A03()
            boolean r0 = r5.A0A()
            r4 = 1
            if (r0 == 0) goto L_0x0042
            com.google.android.material.internal.CheckableImageButton r2 = r6.A0G
            boolean r1 = r2.isChecked()
            boolean r0 = r5.A0B()
            if (r1 == r0) goto L_0x0042
            r0 = r1 ^ 1
            r2.setChecked(r0)
            r3 = 1
        L_0x001d:
            boolean r0 = r5 instanceof X.C99384tC
            if (r0 == 0) goto L_0x0040
            com.google.android.material.internal.CheckableImageButton r2 = r6.A0G
            boolean r1 = r2.isActivated()
            X.4tC r5 = (X.C99384tC) r5
            boolean r0 = r5.A06
            if (r1 == r0) goto L_0x0040
            r0 = r1 ^ 1
            r2.setActivated(r0)
        L_0x0032:
            if (r7 != 0) goto L_0x0036
            if (r4 == 0) goto L_0x003f
        L_0x0036:
            com.google.android.material.textfield.TextInputLayout r2 = r6.A0J
            com.google.android.material.internal.CheckableImageButton r1 = r6.A0G
            android.content.res.ColorStateList r0 = r6.A02
            X.C132756Vd.A02(r0, r1, r2)
        L_0x003f:
            return
        L_0x0040:
            r4 = r3
            goto L_0x0032
        L_0x0042:
            r3 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93014fP.A09(boolean):void");
    }

    public void A0A(boolean z) {
        if (A0B() != z) {
            this.A0G.setVisibility(C36351kA.A00(z ? 1 : 0));
            A00();
            A04();
            this.A0J.A0J();
        }
    }
}
