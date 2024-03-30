package X;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.whatsapp.CodeInputField;

/* renamed from: X.1m1  reason: invalid class name and case insensitive filesystem */
public class C37221m1 extends PasswordTransformationMethod {
    public int A00 = -1;
    public Runnable A01;
    public C80123ut A02;
    public String A03 = "";
    public final CodeInputField A04;

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        C80123ut r0 = new C80123ut(this, charSequence);
        this.A02 = r0;
        return r0;
    }

    public C37221m1(CodeInputField codeInputField) {
        this.A04 = codeInputField;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        String str2;
        super.afterTextChanged(editable);
        if (this.A01 == null) {
            this.A01 = new C1497572q(this, 46);
        }
        String str3 = this.A03;
        CodeInputField codeInputField = this.A04;
        int i = codeInputField.A02;
        String obj = editable.toString();
        if (i > 4) {
            str = "[^0-9, ]";
        } else {
            str = "[^0-9]";
        }
        if (!str3.equals(obj.replaceAll(str, ""))) {
            int i2 = codeInputField.A02;
            String obj2 = editable.toString();
            if (i2 > 4) {
                str2 = "[^0-9, ]";
            } else {
                str2 = "[^0-9]";
            }
            this.A03 = obj2.replaceAll(str2, "");
            this.A02.A00(editable);
            if (codeInputField.getHandler() != null) {
                codeInputField.getHandler().removeCallbacks(this.A01);
                codeInputField.getHandler().postDelayed(this.A01, 1500);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.beforeTextChanged(charSequence, i, i2, i3);
        CodeInputField codeInputField = this.A04;
        if (codeInputField.getHandler() != null && this.A01 != null) {
            codeInputField.getHandler().removeCallbacks(this.A01);
        }
    }
}
