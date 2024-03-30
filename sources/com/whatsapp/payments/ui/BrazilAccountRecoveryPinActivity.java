package com.whatsapp.payments.ui;

import X.AGJ;
import X.AnonymousClass17Y;
import X.AnonymousClass6YV;
import X.B1Z;
import X.C18740tg;
import X.C19420v0;
import X.C202199lE;
import X.C20810yC;
import X.C21060yb;
import X.C23075B3f;
import X.C23189B8x;
import X.C24801Dv;
import X.C36331k8;
import X.C36391kE;
import X.C36421kH;
import X.C430424q;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilAccountRecoveryPinActivity extends C430424q {
    public TextView A00;
    public CodeInputField A01;
    public C23075B3f A02;
    public B1Z A03;
    public C202199lE A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C20810yC r12 = this.A0D;
        AnonymousClass17Y r9 = this.A05;
        C24801Dv r8 = this.A01;
        C21060yb r11 = this.A08;
        AnonymousClass6YV.A0E(this, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r8, r9, C36421kH.A0I(this, R.id.subtitle), r11, r12, C36391kE.A0v(this, "learn-more", new Object[1], 0, R.string.f12nameremoved), "learn-more");
        this.A00 = C36391kE.A0Q(this, R.id.pin_error_text);
        CodeInputField codeInputField = (CodeInputField) findViewById(R.id.code);
        this.A01 = codeInputField;
        codeInputField.A0G(new C23189B8x(this, 1), 6, getResources().getColor(R.color.f6nameremoved));
        ((NumberEntryKeyboard) findViewById(R.id.number_entry_keyboard)).A04 = this.A01;
        C36391kE.A1I(findViewById(R.id.account_recovery_skip), this, 11);
        this.A03 = new AGJ(this, (PinBottomSheetDialogFragment) null, this.A04, true, false);
        C36331k8.A0w(C19420v0.A00(this.A09), "payments_account_recovery_screen_shown", true);
        C23075B3f b3f = this.A02;
        C18740tg.A06(b3f);
        b3f.BOm(0, (Integer) null, "recover_payments_registration", "wa_registration");
    }
}
