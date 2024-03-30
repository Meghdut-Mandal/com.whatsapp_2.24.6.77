package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4zl  reason: invalid class name and case insensitive filesystem */
public class C102334zl extends AnonymousClass80I {
    public int A00;
    public final Button A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final C24801Dv A04;
    public final C19730wQ A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass185 A07;
    public final AnonymousClass171 A08;
    public final UserJid A09;

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass9EL r11) {
        String str;
        int i;
        View view = this.A0H;
        view.setVisibility(0);
        LinearLayout linearLayout = this.A02;
        linearLayout.setVisibility(8);
        Button button = this.A01;
        button.setVisibility(8);
        TextView textView = this.A03;
        textView.setVisibility(8);
        int i2 = this.A00;
        if (i2 != 1) {
            if (i2 == 2) {
                linearLayout.setVisibility(0);
                textView.setVisibility(0);
                i = R.string.f12nameremoved;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    linearLayout.setVisibility(0);
                    textView.setVisibility(0);
                    i = R.string.f12nameremoved;
                } else if (i2 == 5) {
                    linearLayout.setVisibility(8);
                    textView.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            textView.setText(i);
            return;
        }
        C19730wQ r0 = this.A05;
        UserJid userJid = this.A09;
        if (!r0.A0M(userJid)) {
            linearLayout.setVisibility(0);
            AnonymousClass3L0 A022 = this.A07.A02(userJid);
            if (A022 == null) {
                str = null;
            } else {
                str = A022.A08;
            }
            AnonymousClass141 A0D = this.A06.A0D(userJid);
            Context context = view.getContext();
            Object[] objArr = new Object[1];
            if (AnonymousClass14B.A0F(str)) {
                str = this.A08.A0H(A0D);
            }
            objArr[0] = str;
            C36341k9.A0s(context, textView, objArr, R.string.f12nameremoved);
            button.setText(R.string.f12nameremoved);
            button.setVisibility(0);
            textView.setVisibility(0);
            C48812i6.A00(button, A0D, this, 12);
        }
    }

    public C102334zl(View view, C24801Dv r3, C19730wQ r4, AnonymousClass16D r5, AnonymousClass185 r6, AnonymousClass171 r7, UserJid userJid) {
        super(view);
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = C36441kJ.A0U(view, R.id.catalog_list_footer_end_of_results);
        this.A03 = C36391kE.A0P(view, R.id.catalog_list_footer_end_of_results_title);
        this.A08 = r7;
        this.A07 = r6;
        this.A06 = r5;
        this.A09 = userJid;
        this.A01 = (Button) view.findViewById(R.id.end_of_results_button);
    }
}
