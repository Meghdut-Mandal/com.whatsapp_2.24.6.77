package X;

import android.text.TextUtils;
import android.view.MenuItem;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.3bo  reason: invalid class name and case insensitive filesystem */
public class C68383bo implements C17690rq {
    public String A00 = "";
    public boolean A01 = true;
    public final /* synthetic */ ViewPager A02;
    public final /* synthetic */ MediaGalleryActivity A03;

    public void Biu(AnonymousClass6DR r1) {
    }

    public C68383bo(ViewPager viewPager, MediaGalleryActivity mediaGalleryActivity) {
        this.A03 = mediaGalleryActivity;
        this.A02 = viewPager;
    }

    public void Biv(AnonymousClass6DR r7) {
        this.A02.setCurrentItem(r7.A00);
        MediaGalleryActivity mediaGalleryActivity = this.A03;
        int i = r7.A00;
        mediaGalleryActivity.A00 = i;
        if (i != mediaGalleryActivity.A02) {
            RequestPermissionActivity.A0B.A0J(mediaGalleryActivity, mediaGalleryActivity.A0J);
        }
        int i2 = mediaGalleryActivity.A00;
        int i3 = mediaGalleryActivity.A03;
        MenuItem menuItem = mediaGalleryActivity.A04;
        if (i2 == i3) {
            if (menuItem != null) {
                if (menuItem.isActionViewExpanded()) {
                    this.A00 = mediaGalleryActivity.A0g;
                    mediaGalleryActivity.A04.collapseActionView();
                }
                mediaGalleryActivity.A04.setVisible(false);
            }
            this.A01 = true;
            return;
        }
        if (menuItem != null) {
            menuItem.setVisible(true);
            if (!TextUtils.isEmpty(mediaGalleryActivity.A0g) || TextUtils.isEmpty(this.A00) || !this.A01) {
                AnonymousClass4TA A012 = MediaGalleryActivity.A01(mediaGalleryActivity);
                if (A012 != null) {
                    AnonymousClass1S3 r1 = mediaGalleryActivity.A0Z;
                    r1.A04(mediaGalleryActivity.A0g);
                    r1.A05(mediaGalleryActivity.A0h);
                    A012.Bfy(r1);
                }
            } else {
                mediaGalleryActivity.A0g = this.A00;
                mediaGalleryActivity.A04.expandActionView();
                C36391kE.A0P(mediaGalleryActivity.A04.getActionView(), R.id.search_src_text).setText(mediaGalleryActivity.A0g);
            }
        }
        this.A01 = false;
    }
}
