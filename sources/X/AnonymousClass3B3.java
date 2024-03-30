package X;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.status.ContactStatusThumbnail;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.3B3  reason: invalid class name */
public class AnonymousClass3B3 {
    public final View A00;
    public final LinearLayout A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final ProgressBar A05;
    public final TextView A06;
    public final WaTextView A07;
    public final SelectionCheckView A08;
    public final ContactStatusThumbnail A09;
    public final /* synthetic */ MyStatusesActivity A0A;

    public AnonymousClass3B3(View view, MyStatusesActivity myStatusesActivity) {
        this.A0A = myStatusesActivity;
        this.A02 = view;
        ContactStatusThumbnail contactStatusThumbnail = (ContactStatusThumbnail) view.findViewById(R.id.contact_photo);
        this.A09 = contactStatusThumbnail;
        contactStatusThumbnail.setClickable(false);
        View findViewById = view.findViewById(R.id.contact_selector);
        this.A00 = findViewById;
        findViewById.setClickable(false);
        this.A06 = C36391kE.A0P(view, R.id.date_time);
        ImageView A0N = C36391kE.A0N(view, R.id.overflow_icon);
        this.A04 = A0N;
        if (myStatusesActivity.A0D.A0E(6685)) {
            A0N.setColorFilter(AnonymousClass00F.A00(A0N.getContext(), R.color.f6nameremoved), PorterDuff.Mode.SRC_IN);
        }
        A0N.setOnClickListener(myStatusesActivity.A0r);
        WaTextView A0Z = C36411kG.A0Z(view, R.id.views_count);
        this.A07 = A0Z;
        View findViewById2 = view.findViewById(R.id.retry_button);
        this.A03 = findViewById2;
        findViewById2.setOnClickListener(myStatusesActivity.A0s);
        this.A05 = (ProgressBar) view.findViewById(R.id.progress);
        AnonymousClass00F.A00(view.getContext(), C36381kD.A02(view.getContext()));
        this.A08 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A01 = C36441kJ.A0U(view, R.id.title_container);
        C33511fU.A03(A0Z);
    }
}
