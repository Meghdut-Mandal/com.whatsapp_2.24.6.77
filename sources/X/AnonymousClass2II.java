package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2II  reason: invalid class name */
public class AnonymousClass2II extends AnonymousClass8ZA {
    public AnonymousClass1EZ A00;
    public AnonymousClass1EV A01;
    public AnonymousClass1EU A02;
    public final TextView A03 = C36391kE.A0P(this, R.id.setup_payment_account_button);

    public boolean A1G() {
        return true;
    }

    public int getBackgroundResource() {
        return 0;
    }

    private void A0B() {
        TextView textView;
        int i;
        View view;
        boolean z = true;
        int i2 = 8;
        if (!this.A01.A03()) {
            Log.i("PAY: Cannot render payment invite system messages because payment is not enabled");
            C36341k9.A10(this, R.id.divider, 8);
            this.A03.setVisibility(8);
            this.A07.A0E("ConversationRowPaymentInviteSystemMessage/fillView", "Cannot render payment invite message because payment is disabled", true);
            return;
        }
        AnonymousClass2bI r3 = (AnonymousClass2bI) this.A0K;
        int i3 = r3.A00;
        if (i3 != 40) {
            if (i3 != 41) {
                if (i3 == 64) {
                    if (!(r3 instanceof C181208n6) || !((C181208n6) r3).A01) {
                        z = false;
                    }
                } else if (i3 == 42 || i3 == 65 || i3 == 66) {
                    C36341k9.A10(this, R.id.divider, 8);
                    view = this.A03;
                } else {
                    return;
                }
            }
            findViewById(R.id.divider).setVisibility(C36381kD.A09(z));
            textView = this.A03;
            if (z) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            textView.setText(R.string.f12nameremoved);
            i = 30;
            if (!this.A00.A0F()) {
                i = 29;
            }
            AnonymousClass3YF.A00(textView, this, r3, i);
            return;
        } else if (this.A00.A0F()) {
            this.A03.setVisibility(8);
            view = findViewById(R.id.divider);
        } else {
            C36341k9.A10(this, R.id.divider, 0);
            textView = this.A03;
            textView.setVisibility(0);
            textView.setText(R.string.f12nameremoved);
            i = 28;
            AnonymousClass3YF.A00(textView, this, r3, i);
            return;
        }
        view.setVisibility(8);
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public AnonymousClass2II(Context context, C89004Uw r3, AnonymousClass2bI r4) {
        super(context, r3, r4);
        A0B();
    }

    public void A1Y() {
        A0B();
        super.A1Y();
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getMainChildMaxWidth() {
        return C36441kJ.A05(getResources(), R.dimen.f7nameremoved) + (C36441kJ.A05(getResources(), R.dimen.f7nameremoved) * 2);
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
