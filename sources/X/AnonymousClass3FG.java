package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.3FG  reason: invalid class name */
public class AnonymousClass3FG {
    public final AnonymousClass1RJ A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final /* synthetic */ CallLogActivity A0B;

    public AnonymousClass3FG(View view, CallLogActivity callLogActivity) {
        this.A0B = callLogActivity;
        this.A01 = view;
        this.A03 = C36391kE.A0N(view, R.id.call_type_icon);
        this.A08 = C36391kE.A0P(view, R.id.call_type);
        this.A06 = C36391kE.A0P(view, R.id.call_date);
        this.A02 = C36391kE.A0N(view, R.id.call_av_icon);
        this.A07 = C36391kE.A0P(view, R.id.call_duration);
        this.A05 = C36391kE.A0P(view, R.id.call_data);
        this.A09 = C36391kE.A0O(view, R.id.caller_info);
        this.A00 = C36341k9.A0X(view, R.id.selection_check);
        this.A04 = C36401kF.A0G(view, R.id.silenced_reason_icon);
        this.A0A = C36391kE.A0O(view, R.id.silenced_reason_label);
        if (this.A0B.A0D.A0E(4004)) {
            C34081gQ.A02(view);
        }
    }

    public void A00(boolean z, boolean z2, boolean z3) {
        CallLogActivity callLogActivity = this.A0B;
        if (callLogActivity.A0D.A0E(4004)) {
            AnonymousClass1RJ r2 = this.A00;
            if ((r2.A00 != null || z) && ((SelectionCheckView) r2.A01()).A0D != z) {
                View view = this.A01;
                if (callLogActivity.A0D.A0E(4004)) {
                    if (z) {
                        view.setBackgroundResource(C36391kE.A08(view));
                    } else if (z3) {
                        C34081gQ.A03(view);
                    } else {
                        C34081gQ.A02(view);
                    }
                }
                ((SelectionCheckView) r2.A01()).A04(z, z2);
            }
        }
    }
}
