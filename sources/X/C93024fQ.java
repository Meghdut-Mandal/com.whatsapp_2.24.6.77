package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;

/* renamed from: X.4fQ  reason: invalid class name and case insensitive filesystem */
public final class C93024fQ extends LinearLayout {
    public Drawable A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public AnonymousClass08H A06;
    public AnonymousClass6DR A07;
    public int A08 = 2;
    public View A09;
    public final /* synthetic */ TabLayout A0A;

    public int getContentHeight() {
        int i = 0;
        View[] viewArr = {this.A05, this.A03, this.A09};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getTop());
                    i2 = Math.max(i2, view.getBottom());
                } else {
                    i3 = view.getTop();
                    i2 = view.getBottom();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    public int getContentWidth() {
        int i = 0;
        View[] viewArr = {this.A05, this.A03, this.A09};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getLeft());
                    i2 = Math.max(i2, view.getRight());
                } else {
                    i3 = view.getLeft();
                    i2 = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93024fQ(Context context, TabLayout tabLayout) {
        super(context);
        this.A0A = tabLayout;
        A03(context, this);
        AnonymousClass04F.A06(this, tabLayout.A08, tabLayout.A09, tabLayout.A07, tabLayout.A06);
        setGravity(17);
        setOrientation(tabLayout.A0N ^ true ? 1 : 0);
        setClickable(true);
        C012005e.A0X(this, AnonymousClass08C.A00(getContext()));
    }

    private void A01() {
        if (this.A06 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.A01;
            if (view != null) {
                AnonymousClass0VX.A01(view, this.A06);
                this.A01 = null;
            }
        }
    }

    private void A02() {
        TextView textView;
        AnonymousClass08H r3 = this.A06;
        if (r3 == null) {
            return;
        }
        if (this.A09 != null || (textView = this.A05) == null || this.A07 == null) {
            A01();
            return;
        }
        View view = this.A01;
        if (view != textView) {
            A01();
            TextView textView2 = this.A05;
            if (this.A06 != null && textView2 != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                AnonymousClass0VX.A00(textView2, this.A06);
                this.A01 = textView2;
            }
        } else if (textView == view) {
            Rect A062 = AnonymousClass001.A06();
            textView.getDrawingRect(A062);
            r3.setBounds(A062);
            r3.A07(textView, (FrameLayout) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.content.Context r6, X.C93024fQ r7) {
        /*
            com.google.android.material.tabs.TabLayout r5 = r7.A0A
            int r0 = r5.A0a
            r4 = 0
            if (r0 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r6, r0)
            r7.A00 = r0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x001a
            android.graphics.drawable.Drawable r0 = r7.A00
            X.AnonymousClass000.A13(r0, r7)
        L_0x001a:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r0 = 0
            r3.setColor(r0)
            android.content.res.ColorStateList r0 = r5.A0B
            if (r0 == 0) goto L_0x0047
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r0 = 925353388(0x3727c5ac, float:1.0E-5)
            r2.setCornerRadius(r0)
            r0 = -1
            r2.setColor(r0)
            android.content.res.ColorStateList r0 = r5.A0B
            android.content.res.ColorStateList r1 = X.C014906l.A01(r0)
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x004e
            r3 = r4
        L_0x0041:
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            r0.<init>(r1, r3, r4)
            r3 = r0
        L_0x0047:
            X.C011504z.A04(r3, r7)
            r5.invalidate()
            return
        L_0x004e:
            r4 = r2
            goto L_0x0041
        L_0x0050:
            r7.A00 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93024fQ.A03(android.content.Context, X.4fQ):void");
    }

    public static void A04(ImageView imageView, TextView textView, C93024fQ r10, boolean z) {
        CharSequence charSequence;
        int i;
        AnonymousClass6DR r0 = r10.A07;
        CharSequence charSequence2 = null;
        if (r0 != null) {
            charSequence = r0.A05;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable((Drawable) null);
        }
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            CharSequence charSequence3 = charSequence;
            if (!z3) {
                z2 = false;
                charSequence3 = null;
            }
            textView.setText(charSequence3);
            textView.setVisibility(C36381kD.A09(z2));
            if (z3) {
                r10.setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(imageView);
            if (!z2 || imageView.getVisibility() != 0) {
                i = 0;
            } else {
                i = (int) AnonymousClass062.A00(r10.getContext(), 8);
            }
            if (r10.A0A.A0N) {
                if (i != AnonymousClass0YO.A00(A0a)) {
                    AnonymousClass0YO.A02(A0a, i);
                    A0a.bottomMargin = 0;
                    imageView.setLayoutParams(A0a);
                    imageView.requestLayout();
                }
            } else if (i != A0a.bottomMargin) {
                A0a.bottomMargin = i;
                AnonymousClass0YO.A02(A0a, 0);
                imageView.setLayoutParams(A0a);
                imageView.requestLayout();
            }
        }
        AnonymousClass6DR r02 = r10.A07;
        if (r02 != null) {
            charSequence2 = r02.A04;
        }
        if (Build.VERSION.SDK_INT > 23) {
            if (!z3) {
                charSequence = charSequence2;
            }
            AnonymousClass08F.A00(r10, charSequence);
        }
    }

    private AnonymousClass08H getOrCreateBadge() {
        if (this.A06 == null) {
            this.A06 = new AnonymousClass08H(getContext(), (C08800bL) null);
        }
        A02();
        AnonymousClass08H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A09("Unable to create badge");
    }

    public final void A05() {
        TextView textView;
        int i;
        View view;
        ViewParent parent;
        AnonymousClass6DR r3 = this.A07;
        ImageView imageView = null;
        if (r3 == null || (view = r3.A01) == null) {
            View view2 = this.A09;
            if (view2 != null) {
                removeView(view2);
                this.A09 = null;
            }
            this.A04 = null;
        } else {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view3 = this.A09;
                if (!(view3 == null || (parent = view3.getParent()) == null)) {
                    ((ViewGroup) parent).removeView(this.A09);
                }
                addView(view);
            }
            this.A09 = view;
            TextView textView2 = this.A05;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            ImageView imageView2 = this.A03;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                this.A03.setImageDrawable((Drawable) null);
            }
            TextView A0P = C36391kE.A0P(view, 16908308);
            this.A04 = A0P;
            if (A0P != null) {
                this.A08 = A00(A0P);
            }
            imageView = C36391kE.A0N(view, 16908294);
        }
        this.A02 = imageView;
        if (this.A09 == null) {
            if (this.A03 == null) {
                ImageView imageView3 = (ImageView) C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, false);
                this.A03 = imageView3;
                addView(imageView3, 0);
            }
            if (this.A05 == null) {
                TextView textView3 = (TextView) C36361kB.A0E(C36351kA.A0C(this), this, R.layout.f9nameremoved);
                this.A05 = textView3;
                addView(textView3);
                this.A08 = A00(this.A05);
            }
            TextView textView4 = this.A05;
            TabLayout tabLayout = this.A0A;
            AnonymousClass088.A06(textView4, tabLayout.A0b);
            if (!isSelected() || (i = tabLayout.A0I) == -1) {
                textView = this.A05;
                i = tabLayout.A0c;
            } else {
                textView = this.A05;
            }
            AnonymousClass088.A06(textView, i);
            ColorStateList colorStateList = tabLayout.A0C;
            if (colorStateList != null) {
                this.A05.setTextColor(colorStateList);
            }
            A04(this.A03, this.A05, this, true);
            A02();
            ImageView imageView4 = this.A03;
            if (imageView4 != null) {
                imageView4.addOnLayoutChangeListener(new C163657qY(imageView4, this, 0));
            }
            TextView textView5 = this.A05;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new C163657qY(textView5, this, 0));
            }
        } else {
            TextView textView6 = this.A04;
            if (!(textView6 == null && imageView == null)) {
                A04(imageView, textView6, this, false);
            }
        }
        if (r3 != null && !TextUtils.isEmpty(r3.A04)) {
            setContentDescription(r3.A04);
        }
    }

    public void setTab(AnonymousClass6DR r2) {
        if (r2 != this.A07) {
            this.A07 = r2;
            A06();
        }
    }

    public static int A00(TextView textView) {
        return textView.getMaxLines();
    }

    private AnonymousClass08H getBadge() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2 != r1.A00) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r3 = this;
            r3.A05()
            X.6DR r1 = r3.A07
            if (r1 == 0) goto L_0x0017
            com.google.android.material.tabs.TabLayout r0 = r1.A03
            if (r0 == 0) goto L_0x001c
            int r2 = r0.getSelectedTabPosition()
            r0 = -1
            if (r2 == r0) goto L_0x0017
            int r1 = r1.A00
            r0 = 1
            if (r2 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.setSelected(r0)
            return
        L_0x001c:
            java.lang.String r0 = "Tab not attached to a TabLayout"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93024fQ.A06():void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful() && (false || this.A00.setState(drawableState))) {
            invalidate();
            this.A0A.invalidate();
        }
    }

    public AnonymousClass6DR getTab() {
        return this.A07;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AnonymousClass08H r0 = this.A06;
        if (r0 != null && r0.isVisible()) {
            StringBuilder A11 = C36381kD.A11(getContentDescription());
            C90504aG.A1M(A11);
            accessibilityNodeInfo.setContentDescription(AnonymousClass000.A0o(this.A06.A05(), A11));
        }
        C07650Ys r2 = new C07650Ys(accessibilityNodeInfo);
        r2.A0K(new AnonymousClass0SL(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.A07.A00, 1, false, isSelected())));
        if (isSelected()) {
            r2.A0L(false);
            r2.A0B(AnonymousClass0Yd.A08);
        }
        r2.A0G(getResources().getString(R.string.f12nameremoved));
    }

    public void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.A0A;
        int i3 = tabLayout.A0K;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.A05 != null) {
            float f = tabLayout.A01;
            int i4 = this.A08;
            ImageView imageView = this.A03;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.A05;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.A00;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.A05.getTextSize();
            int lineCount = this.A05.getLineCount();
            int A002 = A00(this.A05);
            int i5 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
            if (i5 == 0 && (A002 < 0 || i4 == A002)) {
                return;
            }
            if (tabLayout.A0H != 1 || i5 <= 0 || lineCount != 1 || ((layout = this.A05.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= ((float) C36331k8.A00(this, getMeasuredWidth())))) {
                this.A05.setTextSize(0, f);
                this.A05.setMaxLines(i4);
                super.onMeasure(i, i2);
            }
        }
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.A07 == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.A07.A00();
        return true;
    }

    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.A05;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.A03;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.A09;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
