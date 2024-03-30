package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto;

public final /* synthetic */ class AA0 implements AnonymousClass4Q6 {
    public final /* synthetic */ ViewNewsletterProfilePhoto A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AA0(ViewNewsletterProfilePhoto viewNewsletterProfilePhoto, boolean z) {
        this.A01 = z;
        this.A00 = viewNewsletterProfilePhoto;
    }

    public final void BU2(Object obj) {
        String str;
        boolean z = this.A01;
        ViewNewsletterProfilePhoto viewNewsletterProfilePhoto = this.A00;
        Bitmap bitmap = (Bitmap) obj;
        int i = 8;
        if (bitmap != null || z) {
            viewNewsletterProfilePhoto.A3k().setVisibility(0);
            TextView textView = viewNewsletterProfilePhoto.A02;
            if (textView != null) {
                textView.setVisibility(8);
                View view = viewNewsletterProfilePhoto.A00;
                if (view != null) {
                    C44072La A012 = ViewNewsletterProfilePhoto.A01(viewNewsletterProfilePhoto);
                    if ((A012 == null || (str = A012.A0M) == null || str.length() == 0) && !z) {
                        i = 0;
                    }
                    view.setVisibility(i);
                    viewNewsletterProfilePhoto.A3i().setVisibility(0);
                    if (bitmap != null) {
                        viewNewsletterProfilePhoto.A3k().A08(bitmap);
                        viewNewsletterProfilePhoto.A3i().setImageBitmap(bitmap);
                        return;
                    }
                    return;
                }
                throw C36331k8.A0d("progressView");
            }
            throw C36331k8.A0d("messageView");
        }
        viewNewsletterProfilePhoto.A3k().setVisibility(8);
        View view2 = viewNewsletterProfilePhoto.A00;
        if (view2 != null) {
            view2.setVisibility(8);
            TextView textView2 = viewNewsletterProfilePhoto.A02;
            if (textView2 != null) {
                textView2.setVisibility(0);
                viewNewsletterProfilePhoto.A3i().setVisibility(8);
                TextView textView3 = viewNewsletterProfilePhoto.A02;
                if (textView3 != null) {
                    textView3.setText(R.string.f12nameremoved);
                    return;
                }
                throw C36331k8.A0d("messageView");
            }
            throw C36331k8.A0d("messageView");
        }
        throw C36331k8.A0d("progressView");
    }
}
