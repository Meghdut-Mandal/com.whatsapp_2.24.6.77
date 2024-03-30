package com.whatsapp.wds.components.search;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass088;
import X.AnonymousClass1QZ;
import X.AnonymousClass3GV;
import X.AnonymousClass4MP;
import X.AnonymousClass4SY;
import X.C006302t;
import X.C011504z;
import X.C18700tb;
import X.C21060yb;
import X.C27991Qq;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import X.C39321ri;
import X.C50942mt;
import X.C50952mu;
import X.C50962mv;
import X.C51112nI;
import X.C592533f;
import X.C89384Wi;
import X.C89574Xb;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;

public final class WDSSearchView extends FrameLayout implements C18700tb {
    public C21060yb A00;
    public C592533f A01;
    public AnonymousClass3GV A02;
    public AnonymousClass1QZ A03;
    public String A04;
    public boolean A05;
    public C51112nI A06;
    public final ImageButton A07;
    public final WaEditText A08;
    public final WaImageButton A09;
    public final LinearLayout A0A;

    public static final void setUpTrailingButtonIcon$lambda$4$lambda$3(WDSSearchView wDSSearchView, View view) {
        AnonymousClass00C.A0D(wDSSearchView, 0);
        C592533f r1 = wDSSearchView.A01;
        if (AnonymousClass00C.A0J(r1, C50942mt.A00)) {
            C36391kE.A1K(wDSSearchView.A08);
            return;
        }
        C592533f r2 = C50962mv.A00;
        boolean A0J = AnonymousClass00C.A0J(r1, r2);
        WaEditText waEditText = wDSSearchView.A08;
        if (A0J) {
            waEditText.setInputType(1);
            r2 = C50952mu.A00;
        } else {
            waEditText.setInputType(3);
        }
        wDSSearchView.setTrailingButtonIcon(r2);
    }

    public final void setOnQueryTextSubmitListener(C006302t r3) {
        AnonymousClass00C.A0D(r3, 0);
        WaEditText waEditText = this.A08;
        waEditText.setImeOptions(3);
        C89384Wi.A00(waEditText, r3, 10);
    }

    public final void setTrailingButtonIconWithEnumIndex$app_ui_wds_wds_non_modified(int i) {
        C592533f r0;
        if (i != -1) {
            if (i == 0) {
                r0 = C50942mt.A00;
            } else if (i == 1) {
                r0 = C50952mu.A00;
            } else if (i == 2) {
                r0 = C50962mv.A00;
            }
            setTrailingButtonIcon(r0);
        }
        r0 = null;
        setTrailingButtonIcon(r0);
    }

    public final void setVariant(C51112nI r2) {
        AnonymousClass00C.A0D(r2, 0);
        boolean A1W = C36371kC.A1W(this.A06, r2);
        this.A06 = r2;
        if (A1W) {
            A00();
        }
    }

    public final void A01() {
        InputMethodManager A0N;
        C21060yb r0 = this.A00;
        if (r0 != null && (A0N = r0.A0N()) != null && !A0N.isFullscreenMode()) {
            WaEditText waEditText = this.A08;
            if (A0N.isActive(waEditText)) {
                A0N.showSoftInput(waEditText, 0);
            } else {
                waEditText.requestFocus();
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final Editable getText() {
        return this.A08.getText();
    }

    public final void setBackImageDrawableRes(int i) {
        ImageButton imageButton = this.A07;
        AnonymousClass3GV r1 = this.A02;
        if (r1 == null) {
            throw C36331k8.A0d("style");
        }
        imageButton.setImageDrawable(r1.A00(AnonymousClass00E.A00(getContext(), i)));
    }

    public final void setHint(int i) {
        this.A08.setHint(i);
    }

    public final void setOnQueryTextChangeListener(AnonymousClass4SY r5) {
        this.A08.addTextChangedListener(new C39321ri(new AnonymousClass4MP(r5, this), 5));
    }

    public final void setText(int i) {
        this.A08.setText(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTrailingButtonIcon(X.C592533f r5) {
        /*
            r4 = this;
            r4.A01 = r5
            if (r5 == 0) goto L_0x0074
            X.2mt r0 = X.C50942mt.A00
            boolean r0 = r5.equals(r0)
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x005a
            com.whatsapp.WaEditText r0 = r4.A08
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x001c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x005a
        L_0x001c:
            com.whatsapp.WaImageButton r3 = r4.A09
            r1 = 4
        L_0x001f:
            r3.setVisibility(r1)
            X.33f r1 = r4.A01
            X.2mv r0 = X.C50962mv.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0047
            com.whatsapp.WaEditText r1 = r4.A08
            r0 = 3
            r1.setInputType(r0)
            r1 = 2131886165(0x7f120055, float:1.9406901E38)
        L_0x0035:
            android.content.Context r0 = r3.getContext()
            X.C36331k8.A0q(r0, r3, r1)
        L_0x003c:
            X.3GV r2 = r4.A02
            if (r2 != 0) goto L_0x005d
            java.lang.String r0 = "style"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0047:
            X.33f r1 = r4.A01
            X.2mu r0 = X.C50952mu.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x003c
            com.whatsapp.WaEditText r0 = r4.A08
            r0.setInputType(r2)
            r1 = 2131886164(0x7f120054, float:1.94069E38)
            goto L_0x0035
        L_0x005a:
            com.whatsapp.WaImageButton r3 = r4.A09
            goto L_0x001f
        L_0x005d:
            android.content.Context r1 = r4.getContext()
            int r0 = r5.A00
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            r3.setImageDrawable(r0)
            r0 = 35
            X.C36351kA.A1E(r3, r4, r0)
            return
        L_0x0074:
            com.whatsapp.WaImageButton r1 = r4.A09
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.search.WDSSearchView.setTrailingButtonIcon(X.33f):void");
    }

    public WDSSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A00 = C36351kA.A0U(C36391kE.A0W(generatedComponent()));
        }
    }

    private final void A00() {
        AnonymousClass3GV r0 = new AnonymousClass3GV(C36371kC.A0B(this), this.A06);
        this.A02 = r0;
        C011504z.A04(AnonymousClass00E.A00(r0.A02, r0.A00), this);
        LinearLayout linearLayout = this.A0A;
        AnonymousClass3GV r02 = this.A02;
        if (r02 == null) {
            throw C36331k8.A0d("style");
        }
        C011504z.A04(r02.A01(), linearLayout);
    }

    public final ImageButton getBackButton() {
        return this.A07;
    }

    public final C21060yb getSystemServices() {
        return this.A00;
    }

    public final C592533f getTrailingButtonIcon() {
        return this.A01;
    }

    public final C51112nI getVariant() {
        return this.A06;
    }

    public final void setSystemServices(C21060yb r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A05) {
            this.A05 = true;
            this.A00 = C36351kA.A0U(C36391kE.A0W(generatedComponent()));
        }
        this.A04 = "";
        C51112nI r4 = C51112nI.NORMAL;
        this.A06 = r4;
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A09 = (WaImageButton) C36361kB.A0F(this, R.id.trailing_button);
        this.A08 = (WaEditText) C36361kB.A0F(this, R.id.search_src_text);
        ImageButton imageButton = (ImageButton) C36361kB.A0F(this, R.id.back);
        this.A07 = imageButton;
        this.A0A = (LinearLayout) C36361kB.A0F(this, R.id.backgroundHolder);
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A0D;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (obtainStyledAttributes.getResourceId(1, 0) != 0) {
                setHint((CharSequence) obtainStyledAttributes.getString(1));
            }
            if (obtainStyledAttributes.getResourceId(0, 0) != 0) {
                setText((CharSequence) obtainStyledAttributes.getString(1));
            }
            setTrailingButtonIconWithEnumIndex$app_ui_wds_wds_non_modified(obtainStyledAttributes.getInt(2, -1));
            int i = obtainStyledAttributes.getInt(3, 0);
            C51112nI[] values = C51112nI.values();
            if (i >= 0) {
                AnonymousClass00C.A0D(values, 0);
                if (i <= values.length - 1) {
                    r4 = values[i];
                }
            }
            setVariant(r4);
            obtainStyledAttributes.recycle();
        }
        A00();
        WaEditText waEditText = this.A08;
        if (this.A02 == null) {
            throw C36331k8.A0d("style");
        }
        AnonymousClass088.A06(waEditText, R.style.f13nameremoved);
        waEditText.addTextChangedListener(new C39321ri(this, 6));
        C89574Xb.A00(waEditText, this, 10);
        AnonymousClass3GV r1 = this.A02;
        if (r1 == null) {
            throw C36331k8.A0d("style");
        }
        imageButton.setImageDrawable(r1.A00(AnonymousClass00E.A00(context, R.drawable.ic_back)));
    }

    public final void setHint(CharSequence charSequence) {
        this.A08.setHint(charSequence);
    }

    public final void setText(CharSequence charSequence) {
        this.A08.setText(charSequence);
    }
}
