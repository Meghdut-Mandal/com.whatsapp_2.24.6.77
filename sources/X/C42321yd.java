package X;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.1yd  reason: invalid class name and case insensitive filesystem */
public class C42321yd extends AnonymousClass0D3 {
    public final ImageButton A00;
    public final ImageButton A01;
    public final ImageView A02;
    public final TextView A03;
    public final AnonymousClass3SF A04;
    public final /* synthetic */ GroupCallLogActivity A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42321yd(View view, GroupCallLogActivity groupCallLogActivity) {
        super(view);
        this.A05 = groupCallLogActivity;
        this.A02 = C36391kE.A0N(view, R.id.contact_photo);
        this.A04 = AnonymousClass3SF.A01(view, groupCallLogActivity.A00, R.id.contact_name);
        this.A01 = (ImageButton) view.findViewById(R.id.call_btn);
        this.A00 = (ImageButton) view.findViewById(R.id.video_call_btn);
        this.A03 = C36391kE.A0P(view, R.id.participant_call_log_result);
    }
}
