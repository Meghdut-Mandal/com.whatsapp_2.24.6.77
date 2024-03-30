package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.5Jz  reason: invalid class name and case insensitive filesystem */
public class C106515Jz extends AnonymousClass5K2 {
    public boolean A00;
    public final WaTextView A01 = C36401kF.A0Q(this, R.id.media_time);
    public final MessageThumbView A02;

    public float getRatio() {
        return 1.0f;
    }

    public C106515Jz(Context context) {
        super(context);
        A01();
        MessageThumbView messageThumbView = (MessageThumbView) C012005e.A02(this, R.id.thumb_view);
        this.A02 = messageThumbView;
        C36331k8.A0q(context, messageThumbView, R.string.f12nameremoved);
    }

    public int getMark() {
        return R.drawable.msg_status_gif;
    }

    public void setMessage(C181788o2 r3) {
        super.setMessage(r3);
        MessageThumbView messageThumbView = this.A02;
        messageThumbView.setVisibility(0);
        messageThumbView.A00 = this.A00;
        messageThumbView.setMessage(r3);
        WaTextView waTextView = this.A01;
        C36391kE.A1K(waTextView);
        waTextView.setVisibility(8);
    }
}
