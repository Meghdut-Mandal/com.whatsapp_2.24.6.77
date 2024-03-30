package androidx.appcompat.widget;

import X.AnonymousClass02T;
import X.AnonymousClass02X;
import X.AnonymousClass04F;
import X.AnonymousClass04u;
import X.AnonymousClass07G;
import X.AnonymousClass07I;
import X.AnonymousClass07J;
import X.AnonymousClass07N;
import X.AnonymousClass07P;
import X.AnonymousClass0EG;
import X.AnonymousClass0HP;
import X.AnonymousClass0YO;
import X.C012605m;
import X.C013005q;
import X.C013405v;
import X.C013505w;
import X.C016307a;
import X.C09430cM;
import X.C09460cP;
import X.C16990qX;
import X.C18330sz;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Toolbar extends ViewGroup {
    public int A00;
    public View A01;
    public ImageButton A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public ImageView A08;
    public ActionMenuView A09;
    public C013005q A0A;
    public C09430cM A0B;
    public AnonymousClass07G A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public boolean A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public Context A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public Drawable A0P;
    public ImageButton A0Q;
    public TextView A0R;
    public AnonymousClass02T A0S;
    public C16990qX A0T;
    public C09460cP A0U;
    public AnonymousClass07J A0V;
    public CharSequence A0W;
    public boolean A0X;
    public boolean A0Y;
    public final Runnable A0Z;
    public final ArrayList A0a;
    public final C012605m A0b;
    public final ArrayList A0c;
    public final int[] A0d;
    public TextView mTitleTextView;

    public static C013505w A05(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C013505w) {
            return new C013505w((C013505w) layoutParams);
        }
        if (layoutParams instanceof C013405v) {
            return new C013505w((C013405v) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C013505w((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C013505w(layoutParams);
    }

    private void A07() {
        if (this.A09 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.A09 = actionMenuView;
            actionMenuView.setPopupTheme(this.A0J);
            ActionMenuView actionMenuView2 = this.A09;
            actionMenuView2.A05 = this.A0b;
            actionMenuView2.setMenuCallbacks(this.A0T, this.A0S);
            C013505w r2 = new C013505w();
            r2.A00 = 8388613 | (this.A00 & 112);
            this.A09.setLayoutParams(r2);
            A0A(this.A09, false);
        }
    }

    private void A08() {
        if (this.A0Q == null) {
            this.A0Q = new AnonymousClass07N(getContext(), (AttributeSet) null, R.attr.f4nameremoved);
            C013505w r2 = new C013505w();
            r2.A00 = 8388611 | (this.A00 & 112);
            this.A0Q.setLayoutParams(r2);
        }
    }

    private boolean A0D(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    public void A0E() {
        if (this.A02 == null) {
            AnonymousClass07N r1 = new AnonymousClass07N(getContext(), (AttributeSet) null, R.attr.f4nameremoved);
            this.A02 = r1;
            r1.setImageDrawable(this.A0P);
            this.A02.setContentDescription(this.A0W);
            C013505w r2 = new C013505w();
            r2.A00 = 8388611 | (this.A00 & 112);
            r2.A00 = 2;
            this.A02.setLayoutParams(r2);
            this.A02.setOnClickListener(new C18330sz(this, 0));
        }
    }

    public void A0F() {
        C013005q r1 = this.A0A;
        if (r1 == null) {
            r1 = new C013005q();
            this.A0A = r1;
        }
        r1.A06 = false;
        r1.A01 = 0;
        r1.A03 = 0;
        r1.A02 = 0;
        r1.A04 = 0;
    }

    public void A0H(int i, int i2) {
        C013005q r0 = this.A0A;
        if (r0 == null) {
            r0 = new C013005q();
            this.A0A = r0;
        }
        r0.A00(i, i2);
    }

    public void A0I(Context context, int i) {
        this.A0K = i;
        TextView textView = this.A0R;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void A0J(Context context, int i) {
        this.A0L = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C013505w();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.A02;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.A02;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C013005q r1 = this.A0A;
        if (r1 == null) {
            return 0;
        }
        if (r1.A07) {
            return r1.A03;
        }
        return r1.A04;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A0G;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i;
    }

    public int getContentInsetLeft() {
        C013005q r0 = this.A0A;
        if (r0 != null) {
            return r0.A03;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C013005q r0 = this.A0A;
        if (r0 != null) {
            return r0.A04;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C013005q r1 = this.A0A;
        if (r1 == null) {
            return 0;
        }
        if (r1.A07) {
            return r1.A04;
        }
        return r1.A03;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.A0H;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i;
    }

    public int getCurrentContentInsetEnd() {
        C016307a r0;
        ActionMenuView actionMenuView = this.A09;
        if (actionMenuView == null || (r0 = actionMenuView.A03) == null || !r0.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.A0G, 0));
    }

    public Drawable getLogo() {
        ImageView imageView = this.A08;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.A08;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.A0Q;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.A0Q;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public AnonymousClass07I getWrapper() {
        AnonymousClass07J r1 = this.A0V;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass07J r12 = new AnonymousClass07J(this, true);
        this.A0V = r12;
        return r12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x028a A[LOOP:1: B:102:0x0288->B:103:0x028a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a7 A[LOOP:2: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f0 A[LOOP:3: B:113:0x02ee->B:114:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a2 A[LOOP:0: B:67:0x01a0->B:68:0x01a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            r21 = this;
            r8 = r21
            int r1 = X.AnonymousClass04F.A01(r8)
            r0 = 1
            r5 = 0
            r20 = 0
            if (r1 != r0) goto L_0x000e
            r20 = 1
        L_0x000e:
            int r19 = r8.getWidth()
            int r3 = r8.getHeight()
            int r10 = r8.getPaddingLeft()
            int r18 = r8.getPaddingRight()
            int r1 = r8.getPaddingTop()
            int r17 = r8.getPaddingBottom()
            int r4 = r19 - r18
            int[] r7 = r8.A0d
            r7[r0] = r5
            r7[r5] = r5
            int r0 = X.C011504z.A01(r8)
            if (r0 < 0) goto L_0x027c
            int r2 = r26 - r24
            int r9 = java.lang.Math.min(r0, r2)
        L_0x003a:
            android.widget.ImageButton r0 = r8.A0Q
            boolean r0 = r8.A0D(r0)
            if (r0 == 0) goto L_0x0273
            android.widget.ImageButton r0 = r8.A0Q
            if (r20 == 0) goto L_0x0275
            int r11 = r8.A03(r0, r7, r4, r9)
            r6 = r10
        L_0x004b:
            android.widget.ImageButton r0 = r8.A02
            boolean r0 = r8.A0D(r0)
            if (r0 == 0) goto L_0x005b
            android.widget.ImageButton r0 = r8.A02
            if (r20 == 0) goto L_0x026d
            int r11 = r8.A03(r0, r7, r11, r9)
        L_0x005b:
            androidx.appcompat.widget.ActionMenuView r0 = r8.A09
            boolean r0 = r8.A0D(r0)
            if (r0 == 0) goto L_0x006b
            androidx.appcompat.widget.ActionMenuView r0 = r8.A09
            if (r20 == 0) goto L_0x0267
            int r6 = r8.A02(r0, r7, r6, r9)
        L_0x006b:
            int r2 = r8.getCurrentContentInsetLeft()
            int r12 = r8.getCurrentContentInsetRight()
            int r0 = r2 - r6
            int r0 = java.lang.Math.max(r5, r0)
            r7[r5] = r0
            int r0 = r4 - r11
            int r0 = r12 - r0
            int r0 = java.lang.Math.max(r5, r0)
            r16 = 1
            r7[r16] = r0
            int r6 = java.lang.Math.max(r6, r2)
            int r4 = r4 - r12
            int r11 = java.lang.Math.min(r11, r4)
            android.view.View r0 = r8.A01
            boolean r0 = r8.A0D(r0)
            if (r0 == 0) goto L_0x00a0
            android.view.View r0 = r8.A01
            if (r20 == 0) goto L_0x0261
            int r11 = r8.A03(r0, r7, r11, r9)
        L_0x00a0:
            android.widget.ImageView r0 = r8.A08
            boolean r0 = r8.A0D(r0)
            if (r0 == 0) goto L_0x00b0
            android.widget.ImageView r0 = r8.A08
            if (r20 == 0) goto L_0x025b
            int r11 = r8.A03(r0, r7, r11, r9)
        L_0x00b0:
            android.widget.TextView r0 = r8.mTitleTextView
            boolean r15 = r8.A0D(r0)
            android.widget.TextView r0 = r8.A0R
            boolean r14 = r8.A0D(r0)
            if (r15 == 0) goto L_0x00d2
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r5 = r2.topMargin
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredHeight()
            int r5 = r5 + r0
            int r0 = r2.bottomMargin
            int r5 = r5 + r0
        L_0x00d2:
            if (r14 == 0) goto L_0x00e9
            android.widget.TextView r0 = r8.A0R
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r2 = r4.topMargin
            android.widget.TextView r0 = r8.A0R
            int r0 = r0.getMeasuredHeight()
            int r2 = r2 + r0
            int r0 = r4.bottomMargin
            int r2 = r2 + r0
            int r5 = r5 + r2
        L_0x00e9:
            if (r15 != 0) goto L_0x0254
            if (r14 == 0) goto L_0x0194
            android.widget.TextView r2 = r8.A0R
        L_0x00ef:
            android.widget.TextView r0 = r8.A0R
        L_0x00f1:
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            android.view.ViewGroup$LayoutParams r12 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            if (r15 == 0) goto L_0x0107
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L_0x0111
        L_0x0107:
            if (r14 == 0) goto L_0x0250
            android.widget.TextView r0 = r8.A0R
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0250
        L_0x0111:
            int r0 = r8.A03
            r2 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r2 == r0) goto L_0x0244
            r0 = 80
            if (r2 == r0) goto L_0x0238
            int r0 = r3 - r1
            int r0 = r0 - r17
            int r0 = r0 - r5
            int r4 = r0 / 2
            int r2 = r13.topMargin
            int r0 = r8.A07
            int r2 = r2 + r0
            if (r4 >= r2) goto L_0x0220
            r4 = r2
        L_0x012c:
            int r1 = r1 + r4
        L_0x012d:
            if (r20 == 0) goto L_0x01b6
            if (r16 == 0) goto L_0x01b3
            int r4 = r8.A06
        L_0x0133:
            r3 = 1
            r0 = r7[r3]
            int r4 = r4 - r0
            r2 = 0
            int r0 = java.lang.Math.max(r2, r4)
            int r11 = r11 - r0
            int r0 = -r4
            int r0 = java.lang.Math.max(r2, r0)
            r7[r3] = r0
            if (r15 == 0) goto L_0x01b1
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredWidth()
            int r4 = r11 - r0
            android.widget.TextView r0 = r8.mTitleTextView
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.mTitleTextView
            r0.layout(r4, r1, r11, r2)
            int r0 = r8.A05
            int r4 = r4 - r0
            int r0 = r3.bottomMargin
            int r1 = r2 + r0
        L_0x0169:
            if (r14 == 0) goto L_0x01af
            android.widget.TextView r0 = r8.A0R
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            int r1 = r1 + r0
            android.widget.TextView r0 = r8.A0R
            int r0 = r0.getMeasuredWidth()
            int r3 = r11 - r0
            android.widget.TextView r0 = r8.A0R
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0R
            r0.layout(r3, r1, r11, r2)
            int r0 = r8.A05
            int r0 = r11 - r0
        L_0x018e:
            if (r16 == 0) goto L_0x0194
            int r11 = java.lang.Math.min(r4, r0)
        L_0x0194:
            r5 = 0
        L_0x0195:
            java.util.ArrayList r4 = r8.A0c
            r0 = 3
            r8.A0B(r4, r0)
            int r2 = r4.size()
            r1 = 0
        L_0x01a0:
            if (r1 >= r2) goto L_0x027f
            java.lang.Object r0 = r4.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r6 = r8.A02(r0, r7, r6, r9)
            int r1 = r1 + 1
            goto L_0x01a0
        L_0x01af:
            r0 = r11
            goto L_0x018e
        L_0x01b1:
            r4 = r11
            goto L_0x0169
        L_0x01b3:
            r4 = 0
            goto L_0x0133
        L_0x01b6:
            if (r16 == 0) goto L_0x021d
            int r2 = r8.A06
            r5 = 0
        L_0x01bb:
            r0 = r7[r5]
            int r2 = r2 - r0
            int r0 = java.lang.Math.max(r5, r2)
            int r6 = r6 + r0
            int r0 = -r2
            int r0 = java.lang.Math.max(r5, r0)
            r7[r5] = r0
            if (r15 == 0) goto L_0x021b
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.widget.TextView r0 = r8.mTitleTextView
            int r4 = r0.getMeasuredWidth()
            int r4 = r4 + r6
            android.widget.TextView r0 = r8.mTitleTextView
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.mTitleTextView
            r0.layout(r6, r1, r4, r2)
            int r0 = r8.A05
            int r4 = r4 + r0
            int r0 = r3.bottomMargin
            int r1 = r2 + r0
        L_0x01ee:
            if (r14 == 0) goto L_0x0219
            android.widget.TextView r0 = r8.A0R
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            int r1 = r1 + r0
            android.widget.TextView r0 = r8.A0R
            int r3 = r0.getMeasuredWidth()
            int r3 = r3 + r6
            android.widget.TextView r0 = r8.A0R
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0R
            r0.layout(r6, r1, r3, r2)
            int r0 = r8.A05
            int r3 = r3 + r0
        L_0x0211:
            if (r16 == 0) goto L_0x0195
            int r6 = java.lang.Math.max(r4, r3)
            goto L_0x0195
        L_0x0219:
            r3 = r6
            goto L_0x0211
        L_0x021b:
            r4 = r6
            goto L_0x01ee
        L_0x021d:
            r5 = 0
            r2 = 0
            goto L_0x01bb
        L_0x0220:
            int r3 = r3 - r17
            int r3 = r3 - r5
            int r3 = r3 - r4
            int r3 = r3 - r1
            int r0 = r13.bottomMargin
            int r2 = r8.A04
            int r0 = r0 + r2
            if (r3 >= r0) goto L_0x012c
            int r0 = r12.bottomMargin
            int r0 = r0 + r2
            int r0 = r0 - r3
            int r4 = r4 - r0
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            goto L_0x012c
        L_0x0238:
            int r3 = r3 - r17
            int r0 = r12.bottomMargin
            int r3 = r3 - r0
            int r0 = r8.A04
            int r3 = r3 - r0
            int r1 = r3 - r5
            goto L_0x012d
        L_0x0244:
            int r1 = r8.getPaddingTop()
            int r0 = r13.topMargin
            int r1 = r1 + r0
            int r0 = r8.A07
            int r1 = r1 + r0
            goto L_0x012d
        L_0x0250:
            r16 = 0
            goto L_0x0111
        L_0x0254:
            android.widget.TextView r2 = r8.mTitleTextView
            if (r14 != 0) goto L_0x00ef
            r0 = r2
            goto L_0x00f1
        L_0x025b:
            int r6 = r8.A02(r0, r7, r6, r9)
            goto L_0x00b0
        L_0x0261:
            int r6 = r8.A02(r0, r7, r6, r9)
            goto L_0x00a0
        L_0x0267:
            int r11 = r8.A03(r0, r7, r11, r9)
            goto L_0x006b
        L_0x026d:
            int r6 = r8.A02(r0, r7, r6, r9)
            goto L_0x005b
        L_0x0273:
            r6 = r10
            goto L_0x0279
        L_0x0275:
            int r6 = r8.A02(r0, r7, r10, r9)
        L_0x0279:
            r11 = r4
            goto L_0x004b
        L_0x027c:
            r9 = 0
            goto L_0x003a
        L_0x027f:
            r0 = 5
            r8.A0B(r4, r0)
            int r2 = r4.size()
            r1 = 0
        L_0x0288:
            if (r1 >= r2) goto L_0x0297
            java.lang.Object r0 = r4.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r11 = r8.A03(r0, r7, r11, r9)
            int r1 = r1 + 1
            goto L_0x0288
        L_0x0297:
            r0 = 1
            r8.A0B(r4, r0)
            r17 = r7[r5]
            r16 = r7[r0]
            int r13 = r4.size()
            r12 = 0
            r3 = 0
        L_0x02a5:
            if (r12 >= r13) goto L_0x02d7
            java.lang.Object r14 = r4.get(r12)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.leftMargin
            int r0 = r0 - r17
            int r15 = r1.rightMargin
            int r15 = r15 - r16
            int r2 = java.lang.Math.max(r5, r0)
            int r1 = java.lang.Math.max(r5, r15)
            int r0 = -r0
            int r17 = java.lang.Math.max(r5, r0)
            int r0 = -r15
            int r16 = java.lang.Math.max(r5, r0)
            int r0 = r14.getMeasuredWidth()
            int r2 = r2 + r0
            int r2 = r2 + r1
            int r3 = r3 + r2
            int r12 = r12 + 1
            goto L_0x02a5
        L_0x02d7:
            int r19 = r19 - r10
            int r19 = r19 - r18
            int r0 = r19 / 2
            int r10 = r10 + r0
            int r0 = r3 / 2
            int r10 = r10 - r0
            int r3 = r3 + r10
            if (r10 < r6) goto L_0x02ea
            r6 = r10
            if (r3 <= r11) goto L_0x02ea
            int r3 = r3 - r11
            int r6 = r10 - r3
        L_0x02ea:
            int r1 = r4.size()
        L_0x02ee:
            if (r5 >= r1) goto L_0x02fd
            java.lang.Object r0 = r4.get(r5)
            android.view.View r0 = (android.view.View) r0
            int r6 = r8.A02(r0, r7, r6, r9)
            int r5 = r5 + 1
            goto L_0x02ee
        L_0x02fd:
            r4.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.A0d;
        Method method = AnonymousClass04u.A00;
        char c = 1;
        if (AnonymousClass04F.A01(this) != 1) {
            c = 0;
        }
        int i9 = 0;
        char c2 = c ^ 1;
        int i10 = i;
        int i11 = i2;
        if (A0D(this.A0Q)) {
            A09(this.A0Q, i10, 0, i11, this.A0I);
            int measuredWidth = this.A0Q.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0Q.getLayoutParams();
            i3 = measuredWidth + AnonymousClass0YO.A01(marginLayoutParams) + AnonymousClass0YO.A00(marginLayoutParams);
            i4 = Math.max(0, this.A0Q.getMeasuredHeight() + A00(this.A0Q));
            i5 = View.combineMeasuredStates(0, this.A0Q.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (A0D(this.A02)) {
            A09(this.A02, i10, 0, i11, this.A0I);
            int measuredWidth2 = this.A02.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A02.getLayoutParams();
            i3 = measuredWidth2 + AnonymousClass0YO.A01(marginLayoutParams2) + AnonymousClass0YO.A00(marginLayoutParams2);
            i4 = Math.max(i4, this.A02.getMeasuredHeight() + A00(this.A02));
            i5 = View.combineMeasuredStates(i5, this.A02.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        iArr[c] = Math.max(0, currentContentInsetStart - i3);
        if (A0D(this.A09)) {
            A09(this.A09, i10, max, i11, this.A0I);
            int measuredWidth3 = this.A09.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.A09.getLayoutParams();
            i6 = measuredWidth3 + AnonymousClass0YO.A01(marginLayoutParams3) + AnonymousClass0YO.A00(marginLayoutParams3);
            i4 = Math.max(i4, this.A09.getMeasuredHeight() + A00(this.A09));
            i5 = View.combineMeasuredStates(i5, this.A09.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (A0D(this.A01)) {
            max2 += A04(this.A01, iArr, i10, max2, i11, 0);
            i4 = Math.max(i4, this.A01.getMeasuredHeight() + A00(this.A01));
            i5 = View.combineMeasuredStates(i5, this.A01.getMeasuredState());
        }
        if (A0D(this.A08)) {
            max2 += A04(this.A08, iArr, i10, max2, i11, 0);
            i4 = Math.max(i4, this.A08.getMeasuredHeight() + A00(this.A08));
            i5 = View.combineMeasuredStates(i5, this.A08.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C013505w) childAt.getLayoutParams()).A00 == 0 && A0D(childAt)) {
                max2 += A04(childAt, iArr, i10, max2, i11, 0);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + A00(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.A07 + this.A04;
        int i14 = this.A06 + this.A05;
        if (A0D(this.mTitleTextView)) {
            A04(this.mTitleTextView, iArr, i10, max2 + i14, i11, i13);
            int measuredWidth4 = this.mTitleTextView.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.mTitleTextView.getLayoutParams();
            i7 = measuredWidth4 + AnonymousClass0YO.A01(marginLayoutParams4) + AnonymousClass0YO.A00(marginLayoutParams4);
            i8 = this.mTitleTextView.getMeasuredHeight() + A00(this.mTitleTextView);
            i5 = View.combineMeasuredStates(i5, this.mTitleTextView.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (A0D(this.A0R)) {
            i7 = Math.max(i7, A04(this.A0R, iArr, i10, max2 + i14, i11, i8 + i13));
            i8 += this.A0R.getMeasuredHeight() + A00(this.A0R);
            i5 = View.combineMeasuredStates(i5, this.A0R.getMeasuredState());
        }
        int max3 = Math.max(i4, i8);
        int paddingLeft = max2 + i7 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, -16777216 & i5);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i5 << 16);
        if (this.A0F) {
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (A0D(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i15++;
            }
        }
        i9 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i9);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C016307a r2;
        MenuItem findItem;
        if (!(parcelable instanceof AnonymousClass0HP)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass0HP r4 = (AnonymousClass0HP) parcelable;
        super.onRestoreInstanceState(r4.A00);
        ActionMenuView actionMenuView = this.A09;
        if (actionMenuView != null) {
            r2 = actionMenuView.A03;
        } else {
            r2 = null;
        }
        int i = r4.A00;
        if (!(i == 0 || this.A0B == null || r2 == null || (findItem = r2.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (r4.A01) {
            Runnable runnable = this.A0Z;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r1 == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable$Creator r0 = X.AnonymousClass0HP.CREATOR
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.0HP r2 = new X.0HP
            r2.<init>(r0)
            X.0cM r0 = r3.A0B
            if (r0 == 0) goto L_0x0019
            X.07z r0 = r0.A01
            if (r0 == 0) goto L_0x0019
            int r0 = r0.getItemId()
            r2.A00 = r0
        L_0x0019:
            androidx.appcompat.widget.ActionMenuView r0 = r3.A09
            if (r0 == 0) goto L_0x0028
            X.0cP r0 = r0.A04
            if (r0 == 0) goto L_0x0028
            boolean r1 = r0.A02()
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r2.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            A0E();
            this.A02.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.A02;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.A0P);
        }
    }

    public void setCollapsible(boolean z) {
        this.A0F = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A0G) {
            this.A0G = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A0H) {
            this.A0H = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A08;
            if (imageView == null) {
                imageView = new AppCompatImageView(getContext(), (AttributeSet) null);
                this.A08 = imageView;
            }
            if (!A0C(imageView)) {
                A0A(this.A08, true);
            }
        } else {
            ImageView imageView2 = this.A08;
            if (imageView2 != null && A0C(imageView2)) {
                removeView(this.A08);
                this.A0a.remove(this.A08);
            }
        }
        ImageView imageView3 = this.A08;
        if (imageView3 != null) {
            imageView3.setImageDrawable(drawable);
        }
    }

    public void setMenu(C016307a r5, C09460cP r6) {
        if (r5 != null || this.A09 != null) {
            A07();
            C016307a r1 = this.A09.A03;
            if (r1 != r5) {
                if (r1 != null) {
                    r1.A0D(this.A0U);
                    r1.A0D(this.A0B);
                }
                if (this.A0B == null) {
                    this.A0B = new C09430cM(this);
                }
                r6.A0G = true;
                Context context = this.A0M;
                if (r5 != null) {
                    r5.A08(context, r6);
                    r5.A08(this.A0M, this.A0B);
                } else {
                    r6.BKa(context, (C016307a) null);
                    this.A0B.BKa(this.A0M, (C016307a) null);
                    r6.Bwl(true);
                    this.A0B.Bwl(true);
                }
                this.A09.setPopupTheme(this.A0J);
                this.A09.setPresenter(r6);
                this.A0U = r6;
            }
        }
    }

    public void setMenuCallbacks(C16990qX r2, AnonymousClass02T r3) {
        this.A0T = r2;
        this.A0S = r3;
        ActionMenuView actionMenuView = this.A09;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(r2, r3);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            A08();
            if (!A0C(this.A0Q)) {
                A0A(this.A0Q, true);
            }
        } else {
            ImageButton imageButton = this.A0Q;
            if (imageButton != null && A0C(imageButton)) {
                removeView(this.A0Q);
                this.A0a.remove(this.A0Q);
            }
        }
        ImageButton imageButton2 = this.A0Q;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setPopupTheme(int i) {
        Context contextThemeWrapper;
        if (this.A0J != i) {
            this.A0J = i;
            if (i == 0) {
                contextThemeWrapper = getContext();
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
            this.A0M = contextThemeWrapper;
        }
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A0N = colorStateList;
        TextView textView = this.A0R;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitleMarginBottom(int i) {
        this.A04 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.A05 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.A06 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.A07 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A0O = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public static int A00(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1 != 80) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A01(android.view.View r9, int r10) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r5 = r9.getLayoutParams()
            X.05v r5 = (X.C013405v) r5
            int r7 = r9.getMeasuredHeight()
            r6 = 0
            if (r10 <= 0) goto L_0x0053
            int r0 = r7 - r10
            int r3 = r0 / 2
        L_0x0011:
            int r0 = r5.A00
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L_0x002b
            r0 = 48
            if (r1 == r0) goto L_0x0064
            r2 = 80
            if (r1 == r2) goto L_0x0055
            int r0 = r8.A03
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r1 == r0) goto L_0x0064
            if (r1 == r2) goto L_0x0055
        L_0x002b:
            int r4 = r8.getPaddingTop()
            int r3 = r8.getPaddingBottom()
            int r2 = r8.getHeight()
            int r0 = r2 - r4
            int r0 = r0 - r3
            int r0 = r0 - r7
            int r1 = r0 / 2
            int r0 = r5.topMargin
            if (r1 >= r0) goto L_0x0044
            r1 = r0
        L_0x0042:
            int r4 = r4 + r1
            return r4
        L_0x0044:
            int r2 = r2 - r3
            int r2 = r2 - r7
            int r2 = r2 - r1
            int r2 = r2 - r4
            int r0 = r5.bottomMargin
            if (r2 >= r0) goto L_0x0042
            int r0 = r0 - r2
            int r1 = r1 - r0
            int r1 = java.lang.Math.max(r6, r1)
            goto L_0x0042
        L_0x0053:
            r3 = 0
            goto L_0x0011
        L_0x0055:
            int r1 = r8.getHeight()
            int r0 = r8.getPaddingBottom()
            int r1 = r1 - r0
            int r1 = r1 - r7
            int r0 = r5.bottomMargin
            int r1 = r1 - r0
            int r1 = r1 - r3
            return r1
        L_0x0064:
            int r0 = r8.getPaddingTop()
            int r0 = r0 - r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A01(android.view.View, int):int");
    }

    private int A02(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int A012 = A01(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, A012, max + measuredWidth, view.getMeasuredHeight() + A012);
        return max + measuredWidth + marginLayoutParams.rightMargin;
    }

    private int A03(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int A012 = A01(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, A012, max, view.getMeasuredHeight() + A012);
        return max - (measuredWidth + marginLayoutParams.leftMargin);
    }

    private int A04(View view, int[] iArr, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void A06() {
        A07();
        ActionMenuView actionMenuView = this.A09;
        if (actionMenuView.A03 == null) {
            C016307a r3 = (C016307a) actionMenuView.getMenu();
            C09430cM r2 = this.A0B;
            if (r2 == null) {
                r2 = new C09430cM(this);
                this.A0B = r2;
            }
            this.A09.setExpandedActionViewsExclusive(true);
            r3.A08(this.A0M, r2);
        }
    }

    private void A09(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void A0A(View view, boolean z) {
        C013505w r1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            r1 = new C013505w();
        } else if (!checkLayoutParams(layoutParams)) {
            r1 = A05(layoutParams);
        } else {
            r1 = (C013505w) layoutParams;
        }
        r1.A00 = 1;
        if (!z || this.A01 == null) {
            addView(view, r1);
            return;
        }
        view.setLayoutParams(r1);
        this.A0a.add(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B(java.util.List r10, int r11) {
        /*
            r9 = this;
            int r0 = X.AnonymousClass04F.A01(r9)
            r7 = 0
            r6 = 1
            r1 = 0
            if (r0 != r6) goto L_0x000a
            r1 = 1
        L_0x000a:
            int r5 = r9.getChildCount()
            int r0 = X.AnonymousClass04F.A01(r9)
            int r8 = android.view.Gravity.getAbsoluteGravity(r11, r0)
            r10.clear()
            if (r1 == 0) goto L_0x0053
            int r5 = r5 - r6
        L_0x001c:
            if (r5 < 0) goto L_0x008a
            android.view.View r4 = r9.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.05w r1 = (X.C013505w) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x004e
            boolean r0 = r9.A0D(r4)
            if (r0 == 0) goto L_0x004e
            int r0 = r1.A00
            int r3 = X.AnonymousClass04F.A01(r9)
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L_0x0051
            r1 = 3
            if (r2 == r1) goto L_0x0051
            r0 = 5
            if (r2 == r0) goto L_0x0051
            if (r3 != r6) goto L_0x0049
            r1 = 5
        L_0x0049:
            if (r1 != r8) goto L_0x004e
            r10.add(r4)
        L_0x004e:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0051:
            r1 = r2
            goto L_0x0049
        L_0x0053:
            if (r7 >= r5) goto L_0x008a
            android.view.View r4 = r9.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.05w r1 = (X.C013505w) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0085
            boolean r0 = r9.A0D(r4)
            if (r0 == 0) goto L_0x0085
            int r0 = r1.A00
            int r3 = X.AnonymousClass04F.A01(r9)
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L_0x0088
            r1 = 3
            if (r2 == r1) goto L_0x0088
            r0 = 5
            if (r2 == r0) goto L_0x0088
            if (r3 != r6) goto L_0x0080
            r1 = 5
        L_0x0080:
            if (r1 != r8) goto L_0x0085
            r10.add(r4)
        L_0x0085:
            int r7 = r7 + 1
            goto L_0x0053
        L_0x0088:
            r1 = r2
            goto L_0x0080
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0B(java.util.List, int):void");
    }

    private boolean A0C(View view) {
        if (view.getParent() == this || this.A0a.contains(view)) {
            return true;
        }
        return false;
    }

    private MenuInflater getMenuInflater() {
        return new AnonymousClass0EG(getContext());
    }

    public void A0G(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof C013505w)) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C013505w(getContext(), attributeSet);
    }

    public int getCurrentContentInsetLeft() {
        if (AnonymousClass04F.A01(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (AnonymousClass04F.A01(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        Drawable navigationIcon = getNavigationIcon();
        int contentInsetStart = getContentInsetStart();
        if (navigationIcon != null) {
            return Math.max(contentInsetStart, Math.max(this.A0H, 0));
        }
        return contentInsetStart;
    }

    public Menu getMenu() {
        A06();
        return this.A09.getMenu();
    }

    public Drawable getOverflowIcon() {
        A06();
        return this.A09.getOverflowIcon();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.A0Z);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0X = false;
        }
        if (!this.A0X) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0X = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0X = false;
            return true;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r0 != Integer.MIN_VALUE) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r5) {
        /*
            r4 = this;
            super.onRtlPropertiesChanged(r5)
            X.05q r3 = r4.A0A
            if (r3 != 0) goto L_0x000e
            X.05q r3 = new X.05q
            r3.<init>()
            r4.A0A = r3
        L_0x000e:
            r2 = 1
            if (r5 == r2) goto L_0x0012
            r2 = 0
        L_0x0012:
            boolean r0 = r3.A07
            if (r2 == r0) goto L_0x002e
            r3.A07 = r2
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x003a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x002f
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0026
            int r0 = r3.A01
        L_0x0026:
            r3.A03 = r0
            int r0 = r3.A05
        L_0x002a:
            if (r0 == r1) goto L_0x003e
        L_0x002c:
            r3.A04 = r0
        L_0x002e:
            return
        L_0x002f:
            int r0 = r3.A05
            if (r0 != r1) goto L_0x0035
            int r0 = r3.A01
        L_0x0035:
            r3.A03 = r0
            int r0 = r3.A00
            goto L_0x002a
        L_0x003a:
            int r0 = r3.A01
            r3.A03 = r0
        L_0x003e:
            int r0 = r3.A02
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0Y = false;
        }
        if (!this.A0Y) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0Y = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0Y = false;
            return true;
        }
        return true;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A0E();
        }
        ImageButton imageButton = this.A02;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A08 == null) {
            this.A08 = new AppCompatImageView(getContext(), (AttributeSet) null);
        }
        ImageView imageView = this.A08;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A08();
        }
        ImageButton imageButton = this.A0Q;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        A08();
        this.A0Q.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        A06();
        this.A09.setOverflowIcon(drawable);
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A0R;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AnonymousClass07P r0 = new AnonymousClass07P(context, (AttributeSet) null);
                this.A0R = r0;
                r0.setSingleLine();
                this.A0R.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A0K;
                if (i != 0) {
                    this.A0R.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0N;
                if (colorStateList != null) {
                    this.A0R.setTextColor(colorStateList);
                }
            }
            if (!A0C(this.A0R)) {
                A0A(this.A0R, true);
            }
        } else if (textView != null && A0C(textView)) {
            removeView(this.A0R);
            this.A0a.remove(this.A0R);
        }
        TextView textView2 = this.A0R;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0D = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mTitleTextView;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AnonymousClass07P r0 = new AnonymousClass07P(context, (AttributeSet) null);
                this.mTitleTextView = r0;
                r0.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A0L;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0O;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!A0C(this.mTitleTextView)) {
                A0A(this.mTitleTextView, true);
            }
        } else if (textView != null && A0C(textView)) {
            removeView(this.mTitleTextView);
            this.A0a.remove(this.mTitleTextView);
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0E = charSequence;
    }

    public void setOnMenuItemClickListener(AnonymousClass07G r1) {
        this.A0C = r1;
    }

    public C09460cP getOuterActionMenuPresenter() {
        return this.A0U;
    }

    public Context getPopupContext() {
        return this.A0M;
    }

    public int getPopupTheme() {
        return this.A0J;
    }

    public CharSequence getSubtitle() {
        return this.A0D;
    }

    public final TextView getSubtitleTextView() {
        return this.A0R;
    }

    public CharSequence getTitle() {
        return this.A0E;
    }

    public int getTitleMarginBottom() {
        return this.A04;
    }

    public int getTitleMarginEnd() {
        return this.A05;
    }

    public int getTitleMarginStart() {
        return this.A06;
    }

    public int getTitleMarginTop() {
        return this.A07;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Toolbar(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r10 = r13
            r7 = r14
            r9 = r15
            r12 = r16
            r13.<init>(r14, r15, r12)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r13.A03 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A0c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A0a = r0
            r0 = 2
            int[] r0 = new int[r0]
            r13.A0d = r0
            X.05n r0 = new X.05n
            r0.<init>(r13)
            r13.A0b = r0
            X.05o r0 = new X.05o
            r0.<init>(r13)
            r13.A0Z = r0
            android.content.Context r1 = r13.getContext()
            int[] r11 = X.AnonymousClass1MJ.A0N
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r15, r11, r12, r2)
            X.04j r3 = new X.04j
            r3.<init>(r1, r0)
            android.content.res.TypedArray r8 = r3.A02
            X.C012005e.A0E(r7, r8, r9, r10, r11, r12)
            r0 = 28
            int r0 = r8.getResourceId(r0, r2)
            r13.A0L = r0
            r0 = 19
            int r0 = r8.getResourceId(r0, r2)
            r13.A0K = r0
            int r0 = r13.A03
            int r0 = r8.getInteger(r2, r0)
            r13.A03 = r0
            r1 = 2
            r0 = 48
            int r0 = r8.getInteger(r1, r0)
            r13.A00 = r0
            r0 = 22
            int r1 = r8.getDimensionPixelOffset(r0, r2)
            r0 = 27
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x0078
            r0 = 27
            int r1 = r8.getDimensionPixelOffset(r0, r1)
        L_0x0078:
            r13.A04 = r1
            r13.A07 = r1
            r13.A05 = r1
            r13.A06 = r1
            r0 = 25
            r1 = -1
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x008b
            r13.A06 = r0
        L_0x008b:
            r0 = 24
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x0095
            r13.A05 = r0
        L_0x0095:
            r0 = 26
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x009f
            r13.A07 = r0
        L_0x009f:
            r0 = 23
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x00a9
            r13.A04 = r0
        L_0x00a9:
            r0 = 13
            int r0 = r8.getDimensionPixelSize(r0, r1)
            r13.A0I = r0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 9
            int r6 = r8.getDimensionPixelOffset(r0, r7)
            r0 = 5
            int r5 = r8.getDimensionPixelOffset(r0, r7)
            r0 = 7
            int r4 = r8.getDimensionPixelSize(r0, r2)
            r0 = 8
            int r1 = r8.getDimensionPixelSize(r0, r2)
            X.05q r0 = r13.A0A
            if (r0 != 0) goto L_0x00d4
            X.05q r0 = new X.05q
            r0.<init>()
            r13.A0A = r0
        L_0x00d4:
            r0.A06 = r2
            if (r4 == r7) goto L_0x00dc
            r0.A01 = r4
            r0.A03 = r4
        L_0x00dc:
            if (r1 == r7) goto L_0x00e2
            r0.A02 = r1
            r0.A04 = r1
        L_0x00e2:
            if (r6 != r7) goto L_0x00e6
            if (r5 == r7) goto L_0x00e9
        L_0x00e6:
            r0.A00(r6, r5)
        L_0x00e9:
            r0 = 10
            int r0 = r8.getDimensionPixelOffset(r0, r7)
            r13.A0H = r0
            r0 = 6
            int r0 = r8.getDimensionPixelOffset(r0, r7)
            r13.A0G = r0
            r0 = 4
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            r13.A0P = r0
            r0 = 3
            java.lang.CharSequence r0 = r8.getText(r0)
            r13.A0W = r0
            r0 = 21
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0115
            r13.setTitle((java.lang.CharSequence) r1)
        L_0x0115:
            r0 = 18
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0124
            r13.setSubtitle((java.lang.CharSequence) r1)
        L_0x0124:
            android.content.Context r0 = r13.getContext()
            r13.A0M = r0
            r0 = 17
            int r0 = r8.getResourceId(r0, r2)
            r13.setPopupTheme(r0)
            r0 = 16
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x013e
            r13.setNavigationIcon((android.graphics.drawable.Drawable) r0)
        L_0x013e:
            r0 = 15
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x014d
            r13.setNavigationContentDescription((java.lang.CharSequence) r1)
        L_0x014d:
            r0 = 11
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x0158
            r13.setLogo((android.graphics.drawable.Drawable) r0)
        L_0x0158:
            r0 = 12
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0167
            r13.setLogoDescription((java.lang.CharSequence) r1)
        L_0x0167:
            r1 = 29
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x0176
            android.content.res.ColorStateList r0 = r3.A01(r1)
            r13.setTitleTextColor((android.content.res.ColorStateList) r0)
        L_0x0176:
            r1 = 20
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x0185
            android.content.res.ColorStateList r0 = r3.A01(r1)
            r13.setSubtitleTextColor((android.content.res.ColorStateList) r0)
        L_0x0185:
            r0 = 14
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x0196
            r0 = 14
            int r0 = r8.getResourceId(r0, r2)
            r13.A0G(r0)
        L_0x0196:
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A05(layoutParams);
    }

    public void setCollapseContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setCollapseContentDescription(charSequence);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AnonymousClass02X.A03().A08(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(AnonymousClass02X.A03().A08(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setNavigationContentDescription(charSequence);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AnonymousClass02X.A03().A08(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }
}
