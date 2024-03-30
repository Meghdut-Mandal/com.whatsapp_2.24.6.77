package X;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.R;

/* renamed from: X.21U  reason: invalid class name */
public class AnonymousClass21U extends C129176Fq {
    public EditText A00;
    public int A01 = R.drawable.design_password_eye;
    public final View.OnClickListener A02 = new C66923Xv(this, 6);

    public boolean A0A() {
        return true;
    }

    public void A06() {
        EditText editText = this.A00;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.A00.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public void A07() {
        EditText editText = this.A00;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public void A08(EditText editText) {
        this.A00 = editText;
        this.A02.A09(false);
    }

    public void A09(CharSequence charSequence, int i, int i2, int i3) {
        this.A02.A09(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B() {
        /*
            r2 = this;
            android.widget.EditText r0 = r2.A00
            if (r0 == 0) goto L_0x000d
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r1 = r0 instanceof android.text.method.PasswordTransformationMethod
            r0 = 1
            if (r1 != 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass21U.A0B():boolean");
    }

    public AnonymousClass21U(C93014fP r3, int i) {
        super(r3);
        if (i != 0) {
            this.A01 = i;
        }
    }

    public int A02() {
        return R.string.f12nameremoved;
    }

    public int A03() {
        return this.A01;
    }

    public View.OnClickListener A04() {
        return this.A02;
    }
}
