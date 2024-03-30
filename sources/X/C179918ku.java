package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.8ku  reason: invalid class name and case insensitive filesystem */
public class C179918ku extends AnonymousClass80F {
    public final Context A00;
    public final View A01;
    public final ImageView A02;
    public final ProgressBar A03;
    public final RelativeLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextEmojiLabel A08;
    public final WaImageView A09;
    public final AnonymousClass1N3 A0A;
    public final AnonymousClass1Pp A0B;
    public final C27731Pn A0C;
    public final C21060yb A0D;
    public final C20810yC A0E;
    public final C32681e1 A0F;

    public C179918ku(View view, AnonymousClass1N3 r4, AnonymousClass1Pp r5, C27731Pn r6, C21060yb r7, C20810yC r8, C32681e1 r9) {
        super(view);
        this.A0E = r8;
        this.A0F = r9;
        this.A0C = r6;
        this.A0A = r4;
        this.A0B = r5;
        this.A0D = r7;
        this.A00 = view.getContext();
        this.A06 = C36391kE.A0O(view, R.id.payment_send_action);
        this.A07 = C36391kE.A0O(view, R.id.payment_send_action_time);
        this.A05 = C36391kE.A0O(view, R.id.payment_people_info);
        this.A04 = (RelativeLayout) C012005e.A02(view, R.id.payment_people_container);
        this.A02 = C36401kF.A0G(view, R.id.payment_people_icon);
        this.A03 = (ProgressBar) C012005e.A02(view, R.id.payment_people_progress_bar);
        View A022 = C012005e.A02(view, R.id.incentive_info_container);
        this.A01 = A022;
        this.A08 = C36401kF.A0O(A022, R.id.incentive_info_text);
        this.A09 = C36431kI.A0X(view, R.id.open_indicator);
    }
}
