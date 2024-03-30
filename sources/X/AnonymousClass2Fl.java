package X;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;

/* renamed from: X.2Fl  reason: invalid class name */
public final class AnonymousClass2Fl extends C65043Qm {
    public EditText A00;
    public WaEditText A01;
    public LinearLayout A02;
    public TextInputLayout A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Fl(Activity activity, View view, AnonymousClass1N4 r9, AnonymousClass17Y r10, C87524Pd r11, C21060yb r12, C18820ts r13, AnonymousClass1M4 r14, C19770wU r15) {
        super(activity, view, r9, r10, r11, r12, r13, r14, r15);
        AnonymousClass00C.A0D(view, 1);
        this.A01 = (WaEditText) C36361kB.A0G(view, R.id.phone_field);
        this.A03 = (TextInputLayout) C36361kB.A0G(view, R.id.phone_input_layout);
        this.A00 = (EditText) C36361kB.A0G(view, R.id.country_code_field);
        LinearLayout linearLayout = (LinearLayout) C36361kB.A0F(view, R.id.cc_phone_container);
        this.A02 = linearLayout;
        WaEditText waEditText = this.A01;
        TextInputLayout textInputLayout = this.A03;
        EditText editText = this.A00;
        AnonymousClass00C.A0D(waEditText, 0);
        C36321k7.A12(textInputLayout, editText, linearLayout);
        this.A05 = waEditText;
        this.A03 = null;
        this.A01 = editText;
        this.A04 = textInputLayout;
        this.A02 = linearLayout;
        A04();
    }
}
