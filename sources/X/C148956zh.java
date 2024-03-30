package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.6zh  reason: invalid class name and case insensitive filesystem */
public class C148956zh implements C160527l9 {
    public final /* synthetic */ MessageThumbView A00;

    public /* synthetic */ void BXv() {
    }

    public C148956zh(MessageThumbView messageThumbView) {
        this.A00 = messageThumbView;
    }

    private void A00(Bitmap bitmap) {
        MessageThumbView messageThumbView = this.A00;
        Drawable drawable = messageThumbView.getDrawable();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(messageThumbView.getResources(), bitmap);
        if (drawable == null || (drawable instanceof ColorDrawable)) {
            messageThumbView.setImageDrawable(bitmapDrawable);
            return;
        }
        Drawable[] drawableArr = new Drawable[2];
        C36331k8.A1N(drawable, bitmapDrawable, drawableArr);
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        messageThumbView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(150);
    }

    public int BHb() {
        return this.A00.getWidth();
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r6) {
        MessageThumbView messageThumbView = this.A00;
        if (messageThumbView.A00 > 0) {
            A00(AnonymousClass1GW.A07(bitmap, (float) messageThumbView.A00, messageThumbView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
            return;
        }
        A00(bitmap);
    }

    public void Btu(View view) {
        MessageThumbView messageThumbView = this.A00;
        messageThumbView.setImageDrawable(new ColorDrawable(view.getResources().getColor(C224514j.A00(messageThumbView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved))));
    }
}
