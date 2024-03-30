package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1oA  reason: invalid class name and case insensitive filesystem */
public class C38281oA extends FrameLayout implements C18700tb {
    public C63193Jc A00;
    public C18820ts A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public final Runnable A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public C38281oA(Context context, Runnable runnable) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A01 = C36341k9.A0T(A0W);
            this.A00 = C36371kC.A0V(A0W);
        }
        this.A04 = runnable;
        View.inflate(context, R.layout.f9nameremoved, this);
        C36441kJ.A0T(this, R.id.quoted_message_frame).setForeground(AnonymousClass3UF.A04(context, C36381kD.A0H(context, R.drawable.balloon_incoming_frame), R.color.f6nameremoved));
        AnonymousClass1JZ.A05(C012005e.A02(this, R.id.quoted_title_frame), this.A01, 0, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        C36351kA.A1A(this, R.id.cancel, 0);
        AnonymousClass3Y5.A00(C012005e.A02(this, R.id.cancel), this, 42);
        TextView A0O = C36391kE.A0O(this, R.id.quoted_title);
        A0O.setTextSize(this.A00.A02(context.getResources()));
        C33511fU.A03(A0O);
    }
}
