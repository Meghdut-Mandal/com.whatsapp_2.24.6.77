package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

public class AGS implements C23080B3m {
    public final AnonymousClass4RN A00;
    public final AnonymousClass1RY A01;
    public final AnonymousClass141 A02;
    public final C175758b0 A03;
    public final C207119ua A04;
    public final C135086c7 A05;
    public final AF7 A06;
    public final AnonymousClass9UF A07;
    public final WeakReference A08;
    public final WeakReference A09;

    public /* synthetic */ void BRP(ViewGroup viewGroup) {
    }

    public boolean BtN(C207249un r2) {
        return true;
    }

    public /* synthetic */ void Bti(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    public void B1W(ViewGroup viewGroup) {
        Object obj = this.A08.get();
        C207119ua r2 = this.A04;
        AnonymousClass16X r4 = r2.A02;
        if (r4.A00.compareTo(BigDecimal.ZERO) > 0) {
            AnonymousClass9UF r3 = this.A07;
            C18740tg.A06(obj);
            C36391kE.A0O(C36411kG.A0J(((Activity) obj).getLayoutInflater(), viewGroup, R.layout.f9nameremoved), R.id.amount).setText(r2.A01.B7d(r3.A01, r4));
        }
    }

    public int BA1(C207249un r3) {
        if ("other".equals(((C175758b0) r3).A00.A00)) {
            return 0;
        }
        return R.drawable.ic_link_action;
    }

    public String BA2(C207249un r6, int i) {
        Context context = (Context) this.A08.get();
        if (context == null) {
            return "";
        }
        C175758b0 r62 = (C175758b0) r6;
        if ("other".equals(r62.A00.A00)) {
            return context.getString(R.string.f12nameremoved);
        }
        Object[] A0L = AnonymousClass001.A0L();
        C135086c7 r0 = r62.A09;
        C18740tg.A06(r0);
        return C36391kE.A0v(context, r0.A00, A0L, 0, R.string.f12nameremoved);
    }

    public void BRQ(ViewGroup viewGroup) {
        Activity activity = (Activity) this.A08.get();
        AnonymousClass02E r6 = (AnonymousClass02E) this.A09.get();
        if (activity != null && r6 != null) {
            View inflate = activity.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, true);
            C36391kE.A0O(inflate, R.id.text).setText(R.string.f12nameremoved);
            ImageView A0G = C36401kF.A0G(inflate, R.id.icon);
            int A0I = r6.A0k().A0I();
            int i = R.drawable.ic_back;
            if (A0I <= 1) {
                i = R.drawable.ic_close;
            }
            A0G.setImageResource(i);
            C131606Ps A052 = this.A06.A05(this.A03, (C131606Ps) null);
            AnonymousClass3YM.A00(A0G, this, A052, r6, 9);
            this.A00.BOo(A052, 0, (Integer) null, "payment_confirm_prompt");
        }
    }

    public void BRS(ViewGroup viewGroup) {
        Activity activity = (Activity) this.A08.get();
        if (activity != null) {
            ViewGroup viewGroup2 = viewGroup;
            this.A07.A00(activity, (View.OnClickListener) null, viewGroup2, this.A01, this.A02, (C135086c7) null, this.A05, false, false);
        }
    }

    public void BYH(ViewGroup viewGroup, C207249un r5) {
        Activity activity = (Activity) this.A08.get();
        if (activity != null) {
            activity.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, true);
        }
    }

    public AGS(Activity activity, AnonymousClass1RY r3, AnonymousClass141 r4, C175758b0 r5, C207119ua r6, C135086c7 r7, AF7 af7, AnonymousClass4RN r9, PaymentBottomSheet paymentBottomSheet, AnonymousClass9UF r11) {
        this.A06 = af7;
        this.A07 = r11;
        this.A08 = AnonymousClass001.A0F(activity);
        this.A09 = AnonymousClass001.A0F(paymentBottomSheet);
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
        this.A00 = r9;
    }

    public int BAl() {
        return R.string.f12nameremoved;
    }

    public /* synthetic */ String BEB() {
        return null;
    }

    public /* synthetic */ String BIS() {
        return null;
    }

    public /* synthetic */ boolean BMc() {
        return false;
    }

    public /* synthetic */ boolean Bt5() {
        return false;
    }

    public /* synthetic */ boolean BtO() {
        return false;
    }

    public /* synthetic */ boolean Btt() {
        return true;
    }

    public /* synthetic */ String BAm(C207249un r2) {
        return null;
    }

    public /* synthetic */ int BBP(C207249un r2, int i) {
        return 0;
    }

    public /* synthetic */ boolean Bt8(C207249un r2, String str, int i) {
        return false;
    }
}
