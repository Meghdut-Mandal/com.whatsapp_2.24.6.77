package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.5Jy  reason: invalid class name and case insensitive filesystem */
public class C106505Jy extends C102254zZ {
    public boolean A00;
    public final WaImageView A01 = C36431kI.A0X(this, R.id.kept_status);
    public final WaImageView A02 = C36431kI.A0X(this, R.id.starred_status);
    public final MessageThumbView A03;

    public void setMessage(C46882bp r6) {
        this.A01 = r6;
        WaImageView waImageView = this.A02;
        WaImageView waImageView2 = this.A01;
        if (r6 != null) {
            C36421kH.A0v(waImageView, r6.A15 ? 1 : 0, 0, 8);
            C36421kH.A0v(waImageView2, C65453Sc.A03(this.A01) ? 1 : 0, 0, 8);
        }
        MessageThumbView messageThumbView = this.A03;
        messageThumbView.A00 = this.A00;
        messageThumbView.setMessage(r6);
    }

    public C106505Jy(Context context) {
        super(context);
        A01();
        this.A00 = 1.0f;
        View.inflate(context, R.layout.f9nameremoved, this);
        MessageThumbView messageThumbView = (MessageThumbView) C012005e.A02(this, R.id.thumb_view);
        this.A03 = messageThumbView;
        C36331k8.A0q(context, messageThumbView, R.string.f12nameremoved);
    }
}
