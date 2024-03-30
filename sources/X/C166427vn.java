package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.7vn  reason: invalid class name and case insensitive filesystem */
public class C166427vn extends LinearLayout implements C18700tb {
    public View A00;
    public View A01;
    public LinearLayout A02;
    public TextEmojiLabel A03;
    public WaImageView A04;
    public C21060yb A05;
    public C20810yC A06;
    public C32681e1 A07;
    public AnonymousClass1QZ A08;
    public boolean A09;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A08;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public C166427vn(Context context, C18820ts r12, AnonymousClass16X r13, C198299dE r14, int i, boolean z) {
        super(context);
        if (!this.A09) {
            this.A09 = true;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            this.A06 = C36341k9.A0V(r1);
            this.A07 = C36351kA.A0p(r1.A00);
            this.A05 = C36351kA.A0U(r1);
        }
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A01 = C012005e.A02(this, R.id.incentive_info_container);
        this.A00 = C012005e.A02(this, R.id.incentive_message_divider);
        this.A04 = C36431kI.A0X(this, R.id.incentive_icon);
        this.A03 = C36401kF.A0O(this, R.id.incentive_info_text);
        this.A02 = C90514aH.A0U(this, R.id.incentive_blurb_container);
        this.A01.setVisibility(0);
        if (z) {
            this.A00.setVisibility(0);
        }
        AnonymousClass16X r4 = r14.A09.A00.A02;
        String str = r14.A0C;
        String string = context.getString(R.string.f12nameremoved);
        if (i != 0) {
            if (i != 1) {
                if (!(i == 2 || i == 3)) {
                    if (i != 4) {
                        if (!(i == 5 || i == 7)) {
                            return;
                        }
                    } else if (r14.A01 != 0) {
                        return;
                    }
                }
                Runnable[] runnableArr = {C21702AWw.A00};
                SpannableString A012 = this.A07.A01(this.A03.getContext(), string, runnableArr, new String[]{"fine-print"}, new String[]{str});
                C36331k8.A16(this.A03, this.A05);
                C36331k8.A1A(this.A06, this.A03);
                this.A03.setText(A012);
                this.A02.getBackground().setLevel(1);
            } else if (r14.A00 == 0) {
                this.A03.setText(R.string.f12nameremoved);
                this.A02.getBackground().setLevel(1);
            } else {
                return;
            }
            this.A04.setVisibility(8);
        } else if (r13.A00.compareTo(r4.A00) >= 0) {
            String str2 = r14.A0E;
            C207119ua r15 = r14.A07;
            Runnable[] runnableArr2 = {C21701AWv.A00};
            SpannableString A013 = this.A07.A01(this.A03.getContext(), C36351kA.A0w(context, AnonymousClass9Zb.A00(context, r12, r15.A01, r15.A02).toString(), 1, R.string.f12nameremoved), runnableArr2, new String[]{"cashback-terms"}, new String[]{str2});
            C36331k8.A16(this.A03, this.A05);
            C36331k8.A1A(this.A06, this.A03);
            this.A03.setText(A013);
            this.A02.getBackground().setLevel(0);
            this.A04.setVisibility(0);
        } else {
            C207119ua r2 = r14.A07;
            AnonymousClass16U r16 = r2.A01;
            String obj = AnonymousClass9Zb.A00(context, r12, r16, r4).toString();
            String obj2 = AnonymousClass9Zb.A00(context, r12, r16, r2.A02).toString();
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1N(obj2, obj, A0M);
            this.A03.setText(context.getString(R.string.f12nameremoved, A0M));
            this.A02.getBackground().setLevel(0);
            this.A04.setVisibility(0);
        }
    }
}
