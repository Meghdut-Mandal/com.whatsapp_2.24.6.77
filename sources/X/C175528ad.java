package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.8ad  reason: invalid class name and case insensitive filesystem */
public class C175528ad extends AnonymousClass80C {
    public final View A00;
    public final TextView A01;

    public C175528ad(View view) {
        super(view);
        this.A00 = C012005e.A02(view, R.id.icebreaker_question_root);
        this.A01 = C36391kE.A0O(view, R.id.icebreaker_question);
        ImageView A0G = C36401kF.A0G(view, R.id.icebreaker_questions_send_icon);
        A0G.setClickable(false);
        C90504aG.A11(view.getContext(), A0G, C36381kD.A02(view.getContext()));
    }
}
