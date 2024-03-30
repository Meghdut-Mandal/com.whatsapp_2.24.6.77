package com.whatsapp.base;

import X.AnonymousClass00F;
import X.AnonymousClass01z;
import X.AnonymousClass0FM;
import X.AnonymousClass0YZ;
import X.AnonymousClass1QS;
import X.AnonymousClass5ZU;
import X.C18820ts;
import X.C20810yC;
import X.C225114s;
import X.C32181d7;
import X.C34301gn;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public abstract class WaDialogFragment extends Hilt_WaDialogFragment implements C225114s {
    public int A00 = 0;
    public C18820ts A01;
    public C20810yC A02;
    public C32181d7 A03;
    public C34301gn A04;

    public boolean A1j() {
        return false;
    }

    public /* synthetic */ void BQ6(String str) {
    }

    public /* synthetic */ void Bln(String str) {
    }

    public /* synthetic */ void Btr(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, List list) {
        int i;
        AnonymousClass01z A0k = A0k();
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = R.string.f12nameremoved;
        }
        AnonymousClass5ZU.A00(A0k, num, num2, (Integer) null, (Integer) null, (String) null, (String) null, list, i);
    }

    public void A1V(boolean z) {
        C32181d7 r1 = this.A03;
        if (r1 != null) {
            r1.A00(this, this.A0l, z);
        }
        super.A1V(z);
    }

    public void A1M() {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        super.A1M();
        Dialog dialog = this.A02;
        if (dialog instanceof AnonymousClass0FM) {
            AnonymousClass0FM r2 = (AnonymousClass0FM) dialog;
            Button button = r2.A00.A0H;
            if (!(button == null || button.getText() == null)) {
                button.setText(button.getText());
            }
            AnonymousClass0YZ r3 = r2.A00;
            Button button2 = r3.A0F;
            if (!(button2 == null || button2.getText() == null)) {
                button2.setText(button2.getText());
            }
            Button button3 = r3.A0G;
            if (!(button3 == null || button3.getText() == null)) {
                button3.setText(button3.getText());
            }
            Button button4 = r3.A0H;
            if (!(button4 == null || (text3 = button4.getText()) == null)) {
                button4.setContentDescription(text3);
            }
            Button button5 = r3.A0F;
            if (!(button5 == null || (text2 = button5.getText()) == null)) {
                button5.setContentDescription(text2);
            }
            Button button6 = r3.A0G;
            if (!(button6 == null || (text = button6.getText()) == null)) {
                button6.setContentDescription(text);
            }
            View findViewById = r2.findViewById(16908299);
            if (findViewById != null) {
                int i = 5;
                if (A1j()) {
                    i = 3;
                }
                findViewById.setTextDirection(i);
            }
            Button button7 = r3.A0F;
            int i2 = this.A00;
            if (!(button7 instanceof WDSButton) && i2 != 0) {
                button7.setTextColor(AnonymousClass00F.A00(A0a(), i2));
            }
            Button button8 = r3.A0H;
            C34301gn r1 = this.A04;
            if ((button8 instanceof WDSButton) && r1 != null) {
                ((WDSButton) button8).setAction(r1);
            }
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        AnonymousClass1QS.A00(this);
    }

    public void A1i(AnonymousClass01z r2, String str) {
        if (!r2.A0r()) {
            A1f(r2, str);
        }
    }

    public AnonymousClass01z BI2() {
        return A0k();
    }
}
