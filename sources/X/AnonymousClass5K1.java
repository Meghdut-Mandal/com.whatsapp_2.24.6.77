package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.5K1  reason: invalid class name */
public class AnonymousClass5K1 extends AnonymousClass5K2 {
    public AnonymousClass17Y A00;
    public C18820ts A01;
    public C19770wU A02;
    public boolean A03;
    public final LinearLayout A04;
    public final WaTextView A05 = C36401kF.A0Q(this, R.id.media_time);
    public final MessageThumbView A06;

    public float getRatio() {
        return 1.0f;
    }

    public void setMessage(C181798o3 r7) {
        super.setMessage(r7);
        MessageThumbView messageThumbView = this.A06;
        messageThumbView.setVisibility(0);
        messageThumbView.A00 = this.A00;
        messageThumbView.setMessage(r7);
        C18820ts r3 = this.A01;
        C19770wU r5 = this.A02;
        AnonymousClass17Y r1 = this.A00;
        C53882s3.A00(this.A05, r1, new C144476sJ(this), r3, r7, r5);
    }

    public AnonymousClass5K1(Context context) {
        super(context);
        A01();
        MessageThumbView messageThumbView = (MessageThumbView) C012005e.A02(this, R.id.thumb_view);
        this.A06 = messageThumbView;
        this.A04 = C90514aH.A0U(this, R.id.button_frame);
        C36331k8.A0q(context, messageThumbView, R.string.f12nameremoved);
    }

    public int getMark() {
        return R.drawable.mark_video;
    }
}
