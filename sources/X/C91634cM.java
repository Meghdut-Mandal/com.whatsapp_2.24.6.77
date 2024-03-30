package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;

/* renamed from: X.4cM  reason: invalid class name and case insensitive filesystem */
public final class C91634cM extends Handler {
    public final /* synthetic */ AnonymousClass6XN A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91634cM(Looper looper, AnonymousClass6XN r2) {
        super(looper);
        this.A00 = r2;
        C18740tg.A06(looper);
    }

    public void handleMessage(Message message) {
        if (message.obj != null) {
            String A17 = C36431kI.A17(message.getData(), "tag_bundle_key");
            ShapeItemView shapeItemView = (ShapeItemView) message.obj;
            if (A17.equals(shapeItemView.A00)) {
                C119815qV r1 = (C119815qV) shapeItemView.getTag();
                shapeItemView.setImageDrawable(r1.A00);
                shapeItemView.setContentDescription(r1.A01);
            }
        }
    }
}
