package com.facebook.primitive.textinput;

import X.AnonymousClass00C;
import X.C012005e;
import X.C05250Oz;
import X.C157807ei;
import X.C159057ij;
import X.C163517qK;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;

public final class TextInputView extends EditText implements C159057ij {
    public C157807ei A00;
    public String[] A01;

    public TextInputView(Context context) {
        super(context, (AttributeSet) null);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArr;
        AnonymousClass00C.A0D(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C157807ei r3 = this.A00;
        if (onCreateInputConnection == null || r3 == null || ((strArr = this.A01) != null && strArr.length == 0)) {
            return onCreateInputConnection;
        }
        EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        InputConnection createWrapper = InputConnectionCompat.createWrapper((View) this, onCreateInputConnection, editorInfo);
        C012005e.A0W(this, new C163517qK(r3, 1), this.A01);
        return createWrapper;
    }

    public void setAllowedContentTypes(String[] strArr) {
        this.A01 = strArr;
    }

    public void setContentCommittedListener(C157807ei r1) {
        this.A00 = r1;
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public /* synthetic */ TextInputView(Context context, C05250Oz r3) {
        super(context, (AttributeSet) null);
    }

    public TextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
