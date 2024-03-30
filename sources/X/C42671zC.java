package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.1zC  reason: invalid class name and case insensitive filesystem */
public class C42671zC extends AnonymousClass0D3 {
    public final FrameLayout A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass3SF A03;
    public final ThumbnailButton A04;
    public final AnonymousClass1RJ A05;
    public final View A06;
    public final /* synthetic */ C41091wb A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42671zC(FrameLayout frameLayout, C41091wb r7) {
        super(frameLayout);
        this.A07 = r7;
        this.A00 = frameLayout;
        this.A02 = C36401kF.A0P(frameLayout, R.id.text_status);
        ThumbnailButton thumbnailButton = (ThumbnailButton) frameLayout.findViewById(R.id.contact_photo);
        this.A04 = thumbnailButton;
        thumbnailButton.setEnabled(false);
        this.A05 = C36341k9.A0Y(frameLayout, R.id.subgroup_photo);
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(frameLayout, r7.A0E, R.id.primary_name);
        this.A03 = A012;
        A012.A01.setTextColor(r7.A00);
        TextEmojiLabel A0P = C36401kF.A0P(frameLayout, R.id.secondary_name);
        this.A01 = A0P;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(419430400));
        frameLayout.setForeground(stateListDrawable);
        this.A06 = frameLayout.findViewById(R.id.separator);
        A0P.setTextColor(r7.A02);
    }

    public static void A00(C42671zC r5, int i) {
        View view = r5.A06;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
        C41091wb r2 = r5.A07;
        if (i == r2.A01) {
            A0a.setMarginStart(0);
        } else {
            A0a.setMarginStart(r2.A0A);
        }
        view.setBackgroundColor(r2.A09);
        view.setLayoutParams(A0a);
        if (!r2.A07) {
            return;
        }
        if (i == C36431kI.A07(r2.A06)) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }
}
