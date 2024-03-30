package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass14B;
import X.AnonymousClass1SC;
import X.C02470Al;
import X.C18820ts;
import X.C19430v1;
import X.C20810yC;
import X.C222013h;
import X.C33491fR;
import X.C33511fU;
import X.C53162qs;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.whatsapp.util.Log;

public class WaTextView extends C33491fR {
    public int A00;
    public C18820ts A01;
    public C20810yC A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A08(context, attributeSet);
    }

    public final void A0C() {
        getContext();
        setTypeface(C33511fU.A01(), 0);
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setTextAsError(CharSequence charSequence, C18820ts r5) {
        AnonymousClass00C.A0D(r5, 1);
        super.setContentDescription(r5.A0D(R.string.f12nameremoved, charSequence));
        super.setText(charSequence);
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    private final void A08(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && !isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1SC.A05);
            AnonymousClass00C.A08(obtainStyledAttributes);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(7, 0);
                if (resourceId != 0) {
                    setContentDescription(getWhatsAppLocale().A0B(resourceId));
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId2 != 0) {
                    setHint(getWhatsAppLocale().A0B(resourceId2));
                }
                int resourceId3 = obtainStyledAttributes.getResourceId(6, 0);
                if (resourceId3 != 0) {
                    setImeActionLabel(getWhatsAppLocale().A0B(resourceId3), getImeActionId());
                }
                this.A03 = obtainStyledAttributes.getBoolean(8, false);
                int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId4 != 0) {
                    setText(getWhatsAppLocale().A0B(resourceId4));
                }
                if (C222013h.A07) {
                    int resourceId5 = obtainStyledAttributes.getResourceId(4, 0);
                    int resourceId6 = obtainStyledAttributes.getResourceId(2, 0);
                    int resourceId7 = obtainStyledAttributes.getResourceId(5, 0);
                    int resourceId8 = obtainStyledAttributes.getResourceId(3, 0);
                    if (!(resourceId5 == 0 && resourceId6 == 0 && resourceId7 == 0 && resourceId8 == 0)) {
                        setCompoundDrawablesWithIntrinsicBounds(resourceId5, resourceId6, resourceId7, resourceId8);
                    }
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        A06();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("abProps");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("whatsAppLocale");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r2.A03 == false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAllCaps(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0007
            boolean r1 = r2.A03
            r0 = 1
            if (r1 != 0) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            super.setAllCaps(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.WaTextView.setAllCaps(boolean):void");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence != null && charSequence.length() >= 3000) {
            StringBuilder sb = new StringBuilder();
            sb.append("WaTextView/maybePrintDebugInfoForLongText length=");
            sb.append(charSequence.length() / 1000);
            sb.append('k');
            Log.i(sb.toString());
            C53162qs.A00(this, "WaTextView/maybePrintDebugInfoForLongText/");
        }
        super.setText(AnonymousClass14B.A02(charSequence), bufferType);
        A07();
    }

    private final void A06() {
        if (getTransformationMethod() == null) {
            return;
        }
        if (((getTransformationMethod() instanceof C02470Al) || AnonymousClass00C.A0J(getTransformationMethod().getClass().getName(), "android.text.method.AllCapsTransformationMethod")) && !this.A03) {
            setAllCaps(false);
        }
    }

    private final void A07() {
        boolean z;
        int desiredWidth;
        if (getText() != null && (getText() instanceof Spanned)) {
            CharSequence text = getText();
            AnonymousClass00C.A0E(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            AnonymousClass00C.A0D(spanned, 0);
            Class<StyleSpan> cls = StyleSpan.class;
            StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, 1, cls);
            StyleSpan[] styleSpanArr2 = (StyleSpan[]) spanned.getSpans(spanned.length() - 1, spanned.length(), cls);
            if (styleSpanArr != null) {
                int length = styleSpanArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StyleSpan styleSpan = styleSpanArr[i];
                    if (styleSpan.getStyle() == 2 || styleSpan.getStyle() == 3) {
                        break;
                    }
                    i++;
                }
                z = true;
                if ((getTypeface() == null || !getTypeface().isItalic()) && !z) {
                    desiredWidth = 0;
                } else {
                    desiredWidth = (int) Layout.getDesiredWidth(C19430v1.A09, getPaint());
                }
                this.A00 = desiredWidth;
                invalidate();
            }
            if (styleSpanArr2 != null) {
                int length2 = styleSpanArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    StyleSpan styleSpan2 = styleSpanArr2[i2];
                    if (styleSpan2.getStyle() == 2 || styleSpan2.getStyle() == 3) {
                        break;
                    }
                    i2++;
                }
                z = true;
                if (getTypeface() == null || !getTypeface().isItalic()) {
                    desiredWidth = 0;
                    this.A00 = desiredWidth;
                    invalidate();
                }
                desiredWidth = (int) Layout.getDesiredWidth(C19430v1.A09, getPaint());
                this.A00 = desiredWidth;
                invalidate();
            }
        }
        z = false;
        desiredWidth = 0;
        this.A00 = desiredWidth;
        invalidate();
    }

    public final void A0A() {
        getContext();
        setTypeface(C33511fU.A00());
    }

    public final void A0B() {
        getContext();
        setTypeface(C33511fU.A01(), 2);
    }

    public final int getItalicPadding() {
        return this.A00;
    }

    public final boolean getOverrideTextAllCaps() {
        return this.A03;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + this.A00, getMeasuredHeight());
    }

    public void setTypeface(Typeface typeface, int i) {
        super.setTypeface(typeface, i);
        A07();
    }

    public final void setItalicPadding(int i) {
        this.A00 = i;
    }

    public final void setOverrideTextAllCaps(boolean z) {
        this.A03 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A08(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaTextView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A06();
    }
}
