package com.bloks.stdlib.components.bkcomponentstextinput;

import X.C012005e;
import X.C125115zL;
import X.C139116jG;
import X.C157197bz;
import X.C157807ei;
import X.C159057ij;
import X.C163517qK;
import X.C36361kB;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.whatsapp.R;

public class BloksEditText extends EditText implements C159057ij {
    public C157197bz A00;
    public C157807ei A01;
    public String[] A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public BloksEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public static BloksEditText A00(Context context) {
        try {
            BloksEditText bloksEditText = new BloksEditText(context, (AttributeSet) null);
            bloksEditText.setBackgroundResource(17170445);
            return bloksEditText;
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message != null && message.contains("ConstantState.newDrawable")) {
                return (BloksEditText) C36361kB.A0E(LayoutInflater.from(context), (ViewGroup) null, R.layout.f9nameremoved);
            }
            throw e;
        }
    }

    public int getDefaultGravity() {
        return this.A05;
    }

    public int getDefaultImeOptions() {
        return this.A06;
    }

    public float getDefaultLineSpacing() {
        return this.A03;
    }

    public float getDefaultLineSpacingMultiplier() {
        return this.A04;
    }

    public int getDefaultShadowColor() {
        return this.A07;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArr;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null || this.A01 == null || (strArr = this.A02) == null || strArr.length == 0) {
            return onCreateInputConnection;
        }
        EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        InputConnection createWrapper = InputConnectionCompat.createWrapper((View) this, onCreateInputConnection, editorInfo);
        C012005e.A0W(this, new C163517qK(this, 0), this.A02);
        return createWrapper;
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C157197bz r0 = this.A00;
        if (r0 != null) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            C125115zL r02 = ((C139116jG) r0).A00;
            r02.A0I = selectionStart;
            r02.A0H = selectionEnd;
        }
    }

    public void setAllowedContentTypes(String[] strArr) {
        this.A02 = strArr;
    }

    public void setContentCommittedListener(C157807ei r1) {
        this.A01 = r1;
    }

    public void setOnSelectionChangedListener(C157197bz r1) {
        this.A00 = r1;
    }

    public BloksEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A07 = getShadowColor();
        this.A05 = getGravity();
        this.A06 = getImeOptions();
        Pair A0Q = C36441kJ.A0Q(Float.valueOf(getLineSpacingExtra()), Float.valueOf(getLineSpacingMultiplier()));
        this.A03 = C36441kJ.A03(A0Q.first);
        this.A04 = C36441kJ.A03(A0Q.second);
    }
}
