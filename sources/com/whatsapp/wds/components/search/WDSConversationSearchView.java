package com.whatsapp.wds.components.search;

import X.AnonymousClass00C;
import X.AnonymousClass07G;
import X.AnonymousClass088;
import X.AnonymousClass1QZ;
import X.AnonymousClass3GV;
import X.C011504z;
import X.C013105r;
import X.C18700tb;
import X.C18800tq;
import X.C20810yC;
import X.C21060yb;
import X.C27991Qq;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import X.C39321ri;
import X.C51112nI;
import X.C89574Xb;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

public final class WDSConversationSearchView extends FrameLayout implements C18700tb {
    public Drawable A00;
    public EditText A01;
    public ImageButton A02;
    public Toolbar A03;
    public WaImageButton A04;
    public C21060yb A05;
    public C20810yC A06;
    public AnonymousClass3GV A07;
    public C51112nI A08;
    public AnonymousClass1QZ A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public View.OnClickListener A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSConversationSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f4nameremoved);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A0F) {
            this.A0F = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A06 = C36341k9.A0V(A0W);
            this.A05 = C36351kA.A0U(A0W);
        }
        C51112nI r3 = C51112nI.NORMAL;
        this.A08 = r3;
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A06;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (obtainStyledAttributes.getResourceId(1, 0) != 0) {
                this.A0A = obtainStyledAttributes.getString(1);
            }
            if (obtainStyledAttributes.getResourceId(0, 0) != 0) {
                this.A0B = obtainStyledAttributes.getString(1);
            }
            this.A00 = obtainStyledAttributes.getDrawable(2);
            this.A0D = obtainStyledAttributes.getBoolean(4, false);
            this.A0E = obtainStyledAttributes.getBoolean(5, false);
            this.A0C = obtainStyledAttributes.getBoolean(3, false);
            int i = obtainStyledAttributes.getInt(6, 0);
            C51112nI[] values = C51112nI.values();
            if (i >= 0) {
                AnonymousClass00C.A0D(values, 0);
                if (i <= values.length - 1) {
                    r3 = values[i];
                }
            }
            setVariant(r3);
            obtainStyledAttributes.recycle();
        }
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        this.A03 = (Toolbar) C36361kB.A0F(this, R.id.search_view_toolbar);
        this.A02 = (ImageButton) C36361kB.A0F(this, R.id.search_view_clear_button);
        this.A01 = (EditText) C36361kB.A0F(this, R.id.search_view_edit_text);
        this.A04 = (WaImageButton) C36361kB.A0F(this, R.id.search_by_date_button);
        AnonymousClass3GV r0 = new AnonymousClass3GV(C36371kC.A0B(this), this.A08);
        this.A07 = r0;
        C011504z.A04(r0.A01(), this.A03);
        Drawable drawable = this.A00;
        if (drawable == null && !this.A0D) {
            drawable = C013105r.A01(getContext(), R.drawable.vec_ic_nav_search);
            this.A00 = drawable;
        }
        setNavigationIcon(drawable);
        Toolbar toolbar = this.A03;
        if (this.A07 == null) {
            throw C36331k8.A0d("style");
        }
        toolbar.setPopupTheme(R.style.f13nameremoved);
        EditText editText = this.A01;
        if (this.A07 == null) {
            throw C36331k8.A0d("style");
        }
        AnonymousClass088.A06(editText, R.style.f13nameremoved);
        setHint(this.A0A);
        setText(this.A0B);
        if (this.A0C) {
            editText.setClickable(false);
            editText.setFocusable(false);
            editText.setKeyListener((KeyListener) null);
            editText.setCursorVisible(false);
        } else {
            editText.addTextChangedListener(new C39321ri(this, 4));
            C89574Xb.A00(editText, this, 9);
        }
        if (!this.A0E && !this.A0C) {
            ImageButton imageButton = this.A02;
            AnonymousClass3GV r1 = this.A07;
            if (r1 == null) {
                throw C36331k8.A0d("style");
            }
            imageButton.setImageDrawable(r1.A00(imageButton.getDrawable()));
            C36351kA.A1E(imageButton, this, 33);
        }
    }

    public static final void setUpClearButton$lambda$5(WDSConversationSearchView wDSConversationSearchView, View view) {
        AnonymousClass00C.A0D(wDSConversationSearchView, 0);
        C36391kE.A1K(wDSConversationSearchView.A01);
        wDSConversationSearchView.A02();
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        AnonymousClass00C.A0D(onClickListener, 0);
        this.A03.setNavigationOnClickListener(onClickListener);
    }

    public final void setOnSearchByDateListener(View.OnClickListener onClickListener) {
        AnonymousClass00C.A0D(onClickListener, 0);
        this.A04.setOnClickListener(onClickListener);
    }

    public final void setSearchByDate(WaImageButton waImageButton) {
        AnonymousClass00C.A0D(waImageButton, 0);
        this.A04 = waImageButton;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setVariant(C51112nI r4) {
        AnonymousClass00C.A0D(r4, 0);
        boolean A1W = C36371kC.A1W(this.A08, r4);
        this.A08 = r4;
        if (A1W) {
            AnonymousClass3GV r0 = new AnonymousClass3GV(C36371kC.A0B(this), this.A08);
            this.A07 = r0;
            C011504z.A04(r0.A01(), this.A03);
        }
    }

    public final void A00() {
        EditText editText = this.A01;
        InputMethodManager A0N = getSystemServices().A0N();
        if (A0N != null) {
            A0N.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        if (this.A0C && motionEvent != null && motionEvent.getAction() == 1 && (onClickListener = this.A0G) != null) {
            onClickListener.onClick(this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final CharSequence getHint() {
        return this.A01.getHint();
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final Editable getText() {
        return this.A01.getText();
    }

    public final void setHint(int i) {
        this.A01.setHint(i);
    }

    public final void setNavigationIcon(Drawable drawable) {
        Toolbar toolbar = this.A03;
        AnonymousClass3GV r0 = this.A07;
        if (r0 == null) {
            throw C36331k8.A0d("style");
        }
        toolbar.setNavigationIcon(r0.A00(drawable));
    }

    public final void setOnMenuItemClickListener(AnonymousClass07G r2) {
        this.A03.A0C = r2;
    }

    public final void setText(int i) {
        this.A01.setText(i);
    }

    public final void A01() {
        if (getAbProps().A0E(6478)) {
            this.A04.setVisibility(0);
            WaImageButton waImageButton = this.A04;
            AnonymousClass3GV r1 = this.A07;
            if (r1 == null) {
                throw C36331k8.A0d("style");
            }
            waImageButton.setImageDrawable(r1.A00(waImageButton.getDrawable()));
            this.A04.setContentDescription(super.getResources().getString(R.string.f12nameremoved));
        }
    }

    public final void A02() {
        InputMethodManager A0N = getSystemServices().A0N();
        if (A0N != null && !A0N.isFullscreenMode()) {
            EditText editText = this.A01;
            if (A0N.isActive(editText)) {
                A0N.showSoftInput(editText, 0);
            } else {
                editText.requestFocus();
            }
        }
    }

    public final EditText getEditText() {
        return this.A01;
    }

    public final WaImageButton getSearchByDate() {
        return this.A04;
    }

    public final Toolbar getToolbar() {
        return this.A03;
    }

    public final C51112nI getVariant() {
        return this.A08;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0G = onClickListener;
    }

    public final void setHint(CharSequence charSequence) {
        this.A01.setHint(charSequence);
    }

    public final void setNavigationIcon(int i) {
        setNavigationIcon(C013105r.A01(getContext(), i));
    }

    public final void setText(CharSequence charSequence) {
        this.A01.setText(charSequence);
    }
}
