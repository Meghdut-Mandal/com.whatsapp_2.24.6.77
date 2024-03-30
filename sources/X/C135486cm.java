package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import org.npci.upi.security.pinactivitycomponent.Keypad;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

/* renamed from: X.6cm  reason: invalid class name and case insensitive filesystem */
public class C135486cm implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C135486cm(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        switch (this.A01) {
            case 0:
                C88284Sc r1 = ((Keypad) this.A00).A04;
                if (r1 != null) {
                    r1.Azl(view, 66);
                    return;
                }
                return;
            case 1:
                ((Context) this.A00).startActivity(C36441kJ.A0I("android.settings.SETTINGS"));
                return;
            case 2:
                ((Activity) this.A00).finish();
                return;
            case 3:
                FormItemEditText formItemEditText = (FormItemEditText) this.A00;
                formItemEditText.setSelection(C36381kD.A06(formItemEditText));
                View.OnClickListener onClickListener = formItemEditText.A0B;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                Bundle A07 = AnonymousClass001.A07();
                A07.putString("action", "FORGOT_UPI_PIN");
                Context context = ((C93104fl) this.A00).A03;
                C124765yl.A0B.send(3, A07);
                ((Activity) context).finish();
                return;
        }
    }
}
