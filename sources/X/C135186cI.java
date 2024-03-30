package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.6cI  reason: invalid class name and case insensitive filesystem */
public class C135186cI implements TextWatcher {
    public final /* synthetic */ TextInputEditText A00;
    public final /* synthetic */ TextInputLayout A01;
    public final /* synthetic */ C132376Ti A02;
    public final /* synthetic */ boolean A03;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C135186cI(TextInputEditText textInputEditText, TextInputLayout textInputLayout, C132376Ti r3, boolean z) {
        this.A02 = r3;
        this.A01 = textInputLayout;
        this.A00 = textInputEditText;
        this.A03 = z;
    }

    public void afterTextChanged(Editable editable) {
        C132376Ti.A00(this.A00, this.A01, this.A03);
    }
}
