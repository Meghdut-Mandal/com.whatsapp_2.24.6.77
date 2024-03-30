package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* renamed from: X.1nn  reason: invalid class name and case insensitive filesystem */
public abstract class C38151nn extends FrameLayout {
    public AnonymousClass1LI A00;
    public AnonymousClass1Pp A01;
    public C27761Ps A02;
    public C21060yb A03;
    public C220412q A04;
    public C64633Ov A05;
    public C19890wg A06;

    public abstract CardView getCardView();

    public abstract TextView getFollowersView();

    public abstract AnonymousClass3SF getNameViewController();

    public abstract ImageView getThumbnailView();

    public final void setChatsCache(C220412q r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setContactAvatars(AnonymousClass1Pp r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setContactPhotosBitmapManager(C27761Ps r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setNewsletterNumberFormatter(C64633Ov r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setSharedPreferencesFactory(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setTextEmojiLabelViewControllerFactory(AnonymousClass1LI r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final C220412q getChatsCache() {
        C220412q r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatsCache");
    }

    public final AnonymousClass1Pp getContactAvatars() {
        AnonymousClass1Pp r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactAvatars");
    }

    public final C27761Ps getContactPhotosBitmapManager() {
        C27761Ps r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactPhotosBitmapManager");
    }

    public final C64633Ov getNewsletterNumberFormatter() {
        C64633Ov r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterNumberFormatter");
    }

    public final C19890wg getSharedPreferencesFactory() {
        C19890wg r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("sharedPreferencesFactory");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final AnonymousClass1LI getTextEmojiLabelViewControllerFactory() {
        AnonymousClass1LI r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("textEmojiLabelViewControllerFactory");
    }

    public C38151nn(Context context) {
        super(context);
    }
}
