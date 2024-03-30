package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.A9o  reason: case insensitive filesystem */
public class C21128A9o implements C88704Ts {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public final C18820ts A03;
    public final C20810yC A04;
    public final C29931Yo A05;
    public final AnonymousClass9P4 A06;

    public /* bridge */ /* synthetic */ void B1n(Object obj) {
        ImageView imageView;
        C135106c9 A052;
        C175708av r0;
        C207079uW A0B;
        int i;
        C207119ua r1;
        C202319lY r13 = (C202319lY) obj;
        this.A02.setVisibility(8);
        if (r13 != null && r13.A08 != null) {
            C20810yC r6 = this.A04;
            if (!r6.A0E(4443) || (r0 = r13.A0A) == null || (A0B = r0.A0B()) == null || (i = A0B.A01) <= 1 || (r1 = A0B.A02) == null) {
                TextView textView = this.A02;
                textView.setText(AnonymousClass9Zb.A00(textView.getContext(), this.A03, r13.A03(), r13.A08));
            } else {
                SpannableStringBuilder A002 = AnonymousClass9Zb.A00(this.A02.getContext(), this.A03, r13.A03(), r1.A02);
                Context context = this.A02.getContext();
                Object[] A0M = AnonymousClass001.A0M();
                C36431kI.A1O(A0M, i, 0);
                this.A02.setText(C36391kE.A0v(context, A002, A0M, 1, R.string.f12nameremoved));
            }
            this.A02.setVisibility(0);
            TextView textView2 = this.A02;
            C36351kA.A15(textView2.getResources(), textView2, C224514j.A00(this.A02.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            this.A02.setAlpha(1.0f);
            boolean A003 = this.A06.A00(r13);
            TextView textView3 = this.A02;
            if (A003) {
                AnonymousClass97F.A00(textView3);
            } else {
                textView3.setPaintFlags(textView3.getPaintFlags() & -17);
            }
            if ((r6.A0E(605) || r6.A0E(629)) && (A052 = r13.A05()) != null) {
                this.A00.setImageDrawable((Drawable) null);
                this.A02.setTextColor(A052.A0C);
                if (A003) {
                    this.A02.setAlpha(0.54f);
                }
                this.A00.setBackgroundColor(A052.A0A);
                ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
                String str = A052.A01;
                if (!TextUtils.isEmpty(str)) {
                    this.A00.setContentDescription(str);
                }
                this.A05.A03(this.A00, A052, layoutParams.width, layoutParams.height, false);
                this.A00.setVisibility(0);
                imageView = this.A01;
            } else {
                this.A01.setVisibility(0);
                imageView = this.A00;
            }
            imageView.setVisibility(8);
        }
    }

    public C21128A9o(C18820ts r1, C20810yC r2, C29931Yo r3, AnonymousClass9P4 r4) {
        this.A04 = r2;
        this.A03 = r1;
        this.A05 = r3;
        this.A06 = r4;
    }

    public int BDU() {
        return R.layout.f9nameremoved;
    }

    public void BkP(View view) {
        this.A02 = C36391kE.A0O(view, R.id.amount_container);
        this.A01 = C36401kF.A0G(view, R.id.conversation_row_payment_pattern);
        this.A00 = C36401kF.A0G(view, R.id.conversation_row_expressive_payment_background);
    }
}
