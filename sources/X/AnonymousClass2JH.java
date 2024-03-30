package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2JH  reason: invalid class name */
public class AnonymousClass2JH extends C39301rf {
    public final Resources A00;
    public final LayoutInflater A01;
    public final AnonymousClass171 A02;

    public AnonymousClass2JH(Context context, C19730wQ r12, AnonymousClass16D r13, AnonymousClass171 r14, AnonymousClass1RY r15, AnonymousClass3QY r16, C89004Uw r17, AnonymousClass1A1 r18, C48812i6 r19) {
        super(context, r12, r13, r15, r16, r17, r18, r19);
        this.A01 = LayoutInflater.from(context);
        this.A00 = context.getResources();
        this.A02 = r14;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        UserJid A0L;
        if (view != null) {
            inflate = view;
        } else {
            inflate = this.A01.inflate(R.layout.f9nameremoved, viewGroup, false);
        }
        ViewGroup A0P = C36411kG.A0P(inflate, R.id.chat_bubble_container);
        TextView A0P2 = C36391kE.A0P(inflate, R.id.kept_by_footer_tv);
        if (A0P == null || A0P2 == null) {
            return super.getView(i, view, viewGroup);
        }
        View view2 = super.getView(i, A0P.getChildAt(0), viewGroup);
        if (view == null) {
            A0P.addView(view2);
        }
        AnonymousClass3T1 BD6 = BD6(this.A02, i);
        C18740tg.A06(BD6);
        C46752bc r2 = BD6.A1U;
        if (r2 != null && !r2.A1J.A02) {
            Resources resources = this.A00;
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass16D r10 = this.A02;
            AnonymousClass171 r6 = this.A02;
            C36321k7.A0z(r10, r6);
            String str = null;
            if (!(r2.A0L() == null || (A0L = r2.A0L()) == null)) {
                str = r6.A0R(r10.A0D(A0L), C36391kE.A00(AnonymousClass143.A0G(BD6.A1J.A00) ? 1 : 0), false);
            }
            A0P2.setText(C36411kG.A0w(resources, str, A0L2, 0, R.string.f12nameremoved));
        }
        return inflate;
    }
}
