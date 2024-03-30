package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;

/* renamed from: X.1m4  reason: invalid class name and case insensitive filesystem */
public class C37251m4 extends ClickableSpan {
    public final /* synthetic */ C37031lh A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C37251m4(C37031lh r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public void onClick(View view) {
        RegisterPhone registerPhone = this.A00.A00;
        AnonymousClass1N4 r1 = registerPhone.A02;
        String str = this.A01;
        String str2 = this.A02;
        registerPhone.A0O.A03.setText(C65983Uf.A0A(r1, str, str2).substring(str.length() + 2));
        EditText editText = registerPhone.A0O.A03;
        editText.setSelection(C36381kD.A06(editText));
        registerPhone.A3n();
        registerPhone.A05.A06(R.string.f12nameremoved, 1);
        C36321k7.A1Q("RegisterPhone/suggested/tapped ", str2, AnonymousClass000.A0u());
        registerPhone.A0j = true;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
