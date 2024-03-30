package com.whatsapp.wds.components.search;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RB;
import X.AnonymousClass1RC;
import X.AnonymousClass3GV;
import X.AnonymousClass4VL;
import X.C18700tb;
import X.C18820ts;
import X.C19550w8;
import X.C21060yb;
import X.C27991Qq;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36441kJ;
import X.C51112nI;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.WaEditText;

public final class WDSSearchBar extends FrameLayout implements C18700tb {
    public C18820ts A00;
    public AnonymousClass3GV A01;
    public C51112nI A02;
    public AnonymousClass1QZ A03;
    public boolean A04;
    public int A05;
    public final Toolbar A06;
    public final WDSSearchView A07;

    public final void setVariant(C51112nI r4) {
        AnonymousClass00C.A0D(r4, 0);
        boolean A1W = C36371kC.A1W(this.A02, r4);
        this.A02 = r4;
        if (A1W) {
            this.A01 = new AnonymousClass3GV(C36371kC.A0B(this), this.A02);
            this.A07.setVariant(this.A02);
        }
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void A02(boolean z) {
        int i;
        InputMethodManager A0N;
        this.A06.setVisibility(0);
        WDSSearchView wDSSearchView = this.A07;
        wDSSearchView.setText((CharSequence) "");
        WaEditText waEditText = wDSSearchView.A08;
        C21060yb r0 = wDSSearchView.A00;
        if (!(r0 == null || (A0N = r0.A0N()) == null)) {
            A0N.hideSoftInputFromWindow(waEditText.getWindowToken(), 0);
        }
        if (!z || !isAttachedToWindow()) {
            wDSSearchView.setVisibility(4);
        } else {
            int i2 = this.A05;
            int width = wDSSearchView.getWidth();
            int i3 = this.A05;
            int A022 = AnonymousClass001.A02(width, i3, i2);
            if (i3 == 0) {
                this.A05 = wDSSearchView.getWidth() / 2;
            }
            if (C36351kA.A1Y(getWhatsAppLocale())) {
                i = wDSSearchView.getWidth() - this.A05;
            } else {
                i = this.A05;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(wDSSearchView, i, C36441kJ.A07(this), (float) A022, 0.0f);
            createCircularReveal.setDuration(250);
            AnonymousClass4VL.A00(createCircularReveal, this, 31);
            createCircularReveal.start();
        }
        A00();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass3GV getStyle() {
        AnonymousClass3GV r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("style");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            CharSequence charSequence = bundle.getCharSequence("search_text");
            if (!(charSequence == null || charSequence.length() == 0)) {
                A01();
                this.A05 = bundle.getInt("search_button_x_pos");
                this.A07.setText(charSequence);
            }
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public WDSSearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            this.A00 = C36331k8.A0C(generatedComponent());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r6 = this;
            android.app.Activity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x005e
            android.view.Window r4 = r0.getWindow()
            android.content.Context r5 = r4.getContext()
            X.AnonymousClass00C.A0B(r5)
            r3 = 2130970996(0x7f040974, float:1.7550718E38)
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            android.util.TypedValue r2 = new android.util.TypedValue     // Catch:{ Exception -> 0x0030 }
            r2.<init>()     // Catch:{ Exception -> 0x0030 }
            android.content.res.Resources$Theme r1 = r5.getTheme()     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x0027
            r0 = 1
            r1.resolveAttribute(r3, r2, r0)     // Catch:{ Exception -> 0x0030 }
        L_0x0027:
            int r3 = r2.resourceId     // Catch:{ Exception -> 0x0030 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            r1 = 2130971180(0x7f040a2c, float:1.7551091E38)
            r0 = 2131102663(0x7f060bc7, float:1.781777E38)
            int r3 = X.C224514j.A00(r5, r1, r0)
        L_0x003a:
            androidx.appcompat.widget.Toolbar r1 = r6.A06
            boolean r0 = r1 instanceof com.whatsapp.wds.components.topbar.WDSToolbar
            r2 = 0
            if (r0 == 0) goto L_0x005a
            com.whatsapp.wds.components.topbar.WDSToolbar r1 = (com.whatsapp.wds.components.topbar.WDSToolbar) r1
            X.1Qh r0 = r1.A08
            X.1Qr r1 = r0.A00
            if (r1 == 0) goto L_0x005a
            X.1Qs r0 = X.C28011Qs.A00
            boolean r0 = r1.equals(r0)
            X.AnonymousClass1RC.A09(r4, r0)
        L_0x0052:
            int r0 = X.AnonymousClass00F.A00(r5, r3)
            X.AnonymousClass1RB.A00(r4, r0, r2)
            return
        L_0x005a:
            X.AnonymousClass1RC.A09(r4, r2)
            goto L_0x0052
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.search.WDSSearchBar.A00():void");
    }

    private final Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public final void A01() {
        int width;
        int i;
        if (isAttachedToWindow()) {
            WDSSearchView wDSSearchView = this.A07;
            wDSSearchView.setVisibility(0);
            wDSSearchView.A01();
            View findViewById = this.A06.findViewById(R.id.menuitem_search);
            if (findViewById != null) {
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                if (C36351kA.A1Y(getWhatsAppLocale())) {
                    width = (getWidth() - iArr[0]) - (findViewById.getWidth() / 2);
                } else {
                    width = iArr[0] + (findViewById.getWidth() / 2);
                }
            } else {
                width = getWidth() / 2;
            }
            this.A05 = width;
            int A022 = AnonymousClass001.A02(wDSSearchView.getWidth(), this.A05, width);
            if (C36351kA.A1Y(getWhatsAppLocale())) {
                i = wDSSearchView.getWidth() - this.A05;
            } else {
                i = this.A05;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(wDSSearchView, i, getHeight() / 2, 0.0f, (float) A022);
            createCircularReveal.setDuration(250);
            AnonymousClass4VL.A00(createCircularReveal, this, 32);
            createCircularReveal.start();
            Activity activity = getActivity();
            if (activity != null) {
                Window window = activity.getWindow();
                Context context = window.getContext();
                int i2 = getStyle().A00;
                if (C19550w8.A01()) {
                    AnonymousClass1RC.A07(context, window, i2);
                } else {
                    AnonymousClass1RB.A00(window, AnonymousClass00F.A00(context, i2), false);
                }
            }
        }
    }

    public final WDSSearchView getSearchView() {
        return this.A07;
    }

    public final Toolbar getToolbar() {
        return this.A06;
    }

    public final C51112nI getVariant() {
        return this.A02;
    }

    public Parcelable onSaveInstanceState() {
        Bundle A072 = AnonymousClass001.A07();
        A072.putCharSequence("search_text", this.A07.A08.getText());
        A072.putInt("search_button_x_pos", this.A05);
        A072.putParcelable("superState", super.onSaveInstanceState());
        return A072;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSSearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A04) {
            this.A04 = true;
            this.A00 = C36331k8.A0C(generatedComponent());
        }
        C51112nI r6 = C51112nI.NORMAL;
        this.A02 = r6;
        View.inflate(context, R.layout.f9nameremoved, this);
        WDSSearchView wDSSearchView = (WDSSearchView) C36361kB.A0F(this, R.id.wds_search_view);
        this.A07 = wDSSearchView;
        this.A06 = (Toolbar) C36361kB.A0F(this, R.id.toolbar);
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A0C;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (obtainStyledAttributes.getResourceId(0, 0) != 0) {
                wDSSearchView.setHint((CharSequence) obtainStyledAttributes.getString(1));
            }
            int i = obtainStyledAttributes.getInt(4, 0);
            C51112nI[] values = C51112nI.values();
            if (i >= 0) {
                AnonymousClass00C.A0D(values, 0);
                if (i <= values.length - 1) {
                    r6 = values[i];
                }
            }
            setVariant(r6);
            this.A01 = new AnonymousClass3GV(C36371kC.A0B(this), this.A02);
            this.A07.setVariant(this.A02);
            wDSSearchView.setTrailingButtonIconWithEnumIndex$app_ui_wds_wds_non_modified(obtainStyledAttributes.getInt(3, -1));
            obtainStyledAttributes.recycle();
        }
        C36351kA.A1E(wDSSearchView.A07, this, 34);
        if (!AnonymousClass000.A1Q(this.A07.getVisibility())) {
            A00();
        }
    }
}
