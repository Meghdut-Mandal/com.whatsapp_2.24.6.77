package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6VJ  reason: invalid class name */
public final class AnonymousClass6VJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Animator A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public Typeface A08;
    public LinearLayout A09;
    public TextView A0A;
    public TextView A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public boolean A0F;
    public boolean A0G;
    public int A0H;
    public FrameLayout A0I;
    public final float A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final TimeInterpolator A0N;
    public final TimeInterpolator A0O;
    public final TimeInterpolator A0P;
    public final Context A0Q;
    public final TextInputLayout A0R;

    public static void A01(AnonymousClass6VJ r11, int i, int i2, boolean z) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        int i3 = i;
        int i4 = i2;
        if (i != i2) {
            AnonymousClass6VJ r2 = r11;
            if (z) {
                AnimatorSet A0C2 = C36441kJ.A0C();
                r11.A05 = A0C2;
                ArrayList A0I2 = AnonymousClass001.A0I();
                r2.A00(r11.A0B, A0I2, 2, i3, i4, r11.A0G);
                r2.A00(r11.A0A, A0I2, 1, i3, i4, r11.A0F);
                C05520Qa.A00(A0C2, A0I2);
                if (i == 1) {
                    textView3 = r11.A0A;
                } else if (i != 2) {
                    textView3 = null;
                } else {
                    textView3 = r11.A0B;
                }
                if (i2 == 1) {
                    textView4 = r11.A0A;
                } else if (i2 != 2) {
                    textView4 = null;
                } else {
                    textView4 = r11.A0B;
                }
                A0C2.addListener(new C90654aV(textView3, textView4, r11, i2, i3));
                A0C2.start();
            } else if (i != i2) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        textView2 = r11.A0B;
                    } else {
                        textView2 = r11.A0A;
                    }
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        textView2.setAlpha(1.0f);
                    }
                }
                if (i != 0) {
                    if (i != 1) {
                        textView = r11.A0B;
                    } else {
                        textView = r11.A0A;
                    }
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i == 1) {
                            textView.setText((CharSequence) null);
                        }
                    }
                }
                r11.A00 = i2;
            }
            TextInputLayout textInputLayout = r11.A0R;
            textInputLayout.A0D();
            TextInputLayout.A0A(textInputLayout, z, false);
            textInputLayout.A0E();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (android.text.TextUtils.isEmpty(r4.A0E) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r4 = this;
            r0 = 0
            r4.A0C = r0
            android.animation.Animator r0 = r4.A05
            if (r0 == 0) goto L_0x000a
            r0.cancel()
        L_0x000a:
            int r1 = r4.A00
            r0 = 1
            if (r1 != r0) goto L_0x001f
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.A0E
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 2
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r4.A01 = r0
        L_0x001f:
            int r3 = r4.A00
            int r2 = r4.A01
            android.widget.TextView r1 = r4.A0A
            java.lang.String r0 = ""
            boolean r0 = A02(r1, r4, r0)
            A01(r4, r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VJ.A04():void");
    }

    private void A00(TextView textView, List list, int i, int i2, int i3, boolean z) {
        int i4;
        TimeInterpolator timeInterpolator;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                boolean z2 = false;
                float f = 0.0f;
                if (i3 == i) {
                    z2 = true;
                    f = 1.0f;
                }
                ObjectAnimator A082 = C90524aI.A08(View.ALPHA, textView, new float[1], f, 0);
                if (z2) {
                    i4 = this.A0K;
                } else {
                    i4 = this.A0L;
                }
                A082.setDuration((long) i4);
                if (z2) {
                    timeInterpolator = this.A0N;
                } else {
                    timeInterpolator = this.A0O;
                }
                A082.setInterpolator(timeInterpolator);
                if (i == i3 && i2 != 0) {
                    A082.setStartDelay((long) this.A0L);
                }
                list.add(A082);
                if (i3 == i && i2 != 0) {
                    Property property = View.TRANSLATION_Y;
                    float[] A0v = C90524aI.A0v();
                    A0v[0] = -this.A0J;
                    ObjectAnimator A083 = C90524aI.A08(property, textView, A0v, 0.0f, 1);
                    A083.setDuration((long) this.A0M);
                    A083.setInterpolator(this.A0P);
                    A083.setStartDelay((long) this.A0L);
                    list.add(A083);
                }
            }
        }
    }

    public static boolean A02(TextView textView, AnonymousClass6VJ r3, CharSequence charSequence) {
        TextInputLayout textInputLayout = r3.A0R;
        if (!C011304x.A03(textInputLayout) || !textInputLayout.isEnabled()) {
            return false;
        }
        if (r3.A01 != r3.A00 || textView == null || !TextUtils.equals(textView.getText(), charSequence)) {
            return true;
        }
        return false;
    }

    public void A03() {
        EditText editText;
        if (this.A09 != null && (editText = this.A0R.A0B) != null) {
            Context context = this.A0Q;
            boolean A032 = AnonymousClass061.A03(context);
            LinearLayout linearLayout = this.A09;
            int A033 = AnonymousClass04F.A03(editText);
            if (A032) {
                A033 = C36361kB.A02(context, R.dimen.f7nameremoved);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            if (A032) {
                dimensionPixelSize = C36361kB.A02(context, R.dimen.f7nameremoved);
            }
            int A022 = AnonymousClass04F.A02(editText);
            if (A032) {
                A022 = C36361kB.A02(context, R.dimen.f7nameremoved);
            }
            AnonymousClass04F.A06(linearLayout, A033, dimensionPixelSize, A022, 0);
        }
    }

    public void A05(TextView textView, int i) {
        if (this.A09 == null && this.A0I == null) {
            Context context = this.A0Q;
            LinearLayout linearLayout = new LinearLayout(context);
            this.A09 = linearLayout;
            linearLayout.setOrientation(0);
            TextInputLayout textInputLayout = this.A0R;
            textInputLayout.addView(this.A09, -1, -2);
            this.A0I = new FrameLayout(context);
            this.A09.addView(this.A0I, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.A0B != null) {
                A03();
            }
        }
        if (i == 0 || i == 1) {
            this.A0I.setVisibility(0);
            this.A0I.addView(textView);
        } else {
            this.A09.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.A09.setVisibility(0);
        this.A0H++;
    }

    public void A06(TextView textView, int i) {
        ViewGroup viewGroup;
        LinearLayout linearLayout = this.A09;
        if (linearLayout != null) {
            if (!(i == 0 || i == 1) || (viewGroup = this.A0I) == null) {
                viewGroup = linearLayout;
            }
            viewGroup.removeView(textView);
            int i2 = this.A0H - 1;
            this.A0H = i2;
            LinearLayout linearLayout2 = this.A09;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public boolean A07() {
        if (this.A01 != 1 || this.A0A == null || TextUtils.isEmpty(this.A0C)) {
            return false;
        }
        return true;
    }

    public AnonymousClass6VJ(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.A0Q = context;
        this.A0R = textInputLayout;
        this.A0J = C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved);
        this.A0M = C014506h.A00(context, R.attr.f4nameremoved, 217);
        this.A0K = C014506h.A00(context, R.attr.f4nameremoved, 167);
        this.A0L = C014506h.A00(context, R.attr.f4nameremoved, 167);
        this.A0P = C017807p.A01(AnonymousClass064.A04, context, R.attr.f4nameremoved);
        TimeInterpolator timeInterpolator = AnonymousClass064.A03;
        this.A0N = C017807p.A01(timeInterpolator, context, R.attr.f4nameremoved);
        this.A0O = C017807p.A01(timeInterpolator, context, R.attr.f4nameremoved);
    }
}
