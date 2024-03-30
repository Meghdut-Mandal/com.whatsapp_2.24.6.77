package com.whatsapp;

import X.AnonymousClass17Y;
import X.AnonymousClass2xF;
import X.C18800tq;
import X.C21060yb;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class CopyableTextView extends WaTextView implements View.OnClickListener {
    public AnonymousClass17Y A00;
    public C21060yb A01;
    public String A02;
    public String A03;
    public boolean A04;

    private void A06(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setTextIsSelectable(true);
        setOnClickListener(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A06);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                this.A03 = context.getString(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void A09() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0P = C36361kB.A0P(this);
            C36321k7.A0e(A0P, this);
            this.A00 = C36351kA.A0M(A0P);
            this.A01 = C36351kA.A0U(A0P);
        }
    }

    public void onClick(View view) {
        ClipboardManager A09;
        CharSequence charSequence;
        if (!TextUtils.isEmpty(this.A03) && (A09 = this.A01.A09()) != null) {
            CharSequence text = getText();
            if (TextUtils.isEmpty(this.A02)) {
                charSequence = getText();
            } else {
                charSequence = this.A02;
            }
            try {
                A09.setPrimaryClip(ClipData.newPlainText(text, charSequence));
                this.A00.A0E(this.A03, 0);
            } catch (NullPointerException | SecurityException unused) {
            }
        }
    }

    public CopyableTextView(Context context) {
        super(context);
        A09();
        A06(context, (AttributeSet) null);
    }

    public void setDataToCopy(String str) {
        this.A02 = str;
    }

    public void setToastString(String str) {
        this.A03 = str;
    }

    public CopyableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A09();
        A06(context, attributeSet);
    }

    public CopyableTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A09();
    }

    public CopyableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A09();
        A06(context, attributeSet);
    }
}
