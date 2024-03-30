package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.9UF  reason: invalid class name */
public class AnonymousClass9UF {
    public final AnonymousClass171 A00;
    public final C18820ts A01;
    public final AnonymousClass1Pp A02;

    public AnonymousClass9UF(AnonymousClass1Pp r1, AnonymousClass171 r2, C18820ts r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A00(Activity activity, View.OnClickListener onClickListener, ViewGroup viewGroup, AnonymousClass1RY r12, AnonymousClass141 r13, C135086c7 r14, C135086c7 r15, boolean z, boolean z2) {
        String A0H;
        View inflate = activity.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, true);
        ImageView A0G = C36401kF.A0G(inflate, R.id.payment_recipient_profile_pic);
        TextView A0O = C36391kE.A0O(inflate, R.id.payment_recipient_name);
        TextView A0O2 = C36391kE.A0O(inflate, R.id.payment_recipient_vpa);
        View A022 = C012005e.A02(inflate, R.id.expand_receiver_details_button);
        if (z) {
            A022.setVisibility(0);
        } else {
            A022.setVisibility(8);
        }
        inflate.setOnClickListener(onClickListener);
        if (r13 != null) {
            r12.A08(A0G, r13);
            if (r14 == null || !z2) {
                A0H = this.A00.A0H(r13);
            } else {
                A0H = (String) r14.A00;
            }
            if (A0H == null) {
                A0H = "";
            }
            A0O.setText(A0H);
            if (C202349ld.A02(r15)) {
                A0O2.setVisibility(8);
                return;
            }
        } else {
            this.A02.A06(A0G, R.drawable.avatar_contact);
            if (!C202349ld.A02(r14)) {
                C165607th.A1A(A0O, C165577te.A0g(r14));
            } else {
                A0O.setVisibility(8);
            }
        }
        Object obj = r15.A00;
        C18740tg.A06(obj);
        C36341k9.A0s(activity, A0O2, new Object[]{obj}, R.string.f12nameremoved);
    }
}
