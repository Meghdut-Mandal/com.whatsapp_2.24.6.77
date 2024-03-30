package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.8mT  reason: invalid class name and case insensitive filesystem */
public abstract class C180818mT extends C173898To {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public AnonymousClass16L A03;
    public AnonymousClass16D A04;
    public AnonymousClass171 A05;
    public AnonymousClass16K A06;
    public C24341Cb A07;
    public C20830yE A08;
    public AnonymousClass141 A09;
    public C20500xf A0A;
    public PhotoView A0B;
    public AnonymousClass1X7 A0C;
    public boolean A0D;
    public boolean A0E;

    public final void A3l(boolean z, String str) {
        AnonymousClass00C.A0D(str, 1);
        if (z) {
            A3k().setVisibility(4);
            A3i().setVisibility(0);
            C011004s.A08(A3i(), str);
            return;
        }
        A3i().setVisibility(8);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onRestoreInstanceState(bundle);
        this.A0E = bundle.getBoolean("photo_change_requested_externally");
        this.A0D = bundle.getBoolean("photo_change_requested_by_phone");
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("photo_change_requested_externally", this.A0E);
        bundle.putBoolean("photo_change_requested_by_phone", this.A0D);
    }

    public final void setProgressView(View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A00 = view;
    }

    public final ImageView A3i() {
        ImageView imageView = this.A01;
        if (imageView != null) {
            return imageView;
        }
        throw C36331k8.A0d("animationView");
    }

    public final AnonymousClass141 A3j() {
        AnonymousClass141 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contact");
    }

    public final PhotoView A3k() {
        PhotoView photoView = this.A0B;
        if (photoView != null) {
            return photoView;
        }
        throw C36331k8.A0d("pictureView");
    }

    public C18950u5 BGv() {
        C18950u5 r0 = C19430v1.A02;
        AnonymousClass00C.A09(r0);
        return r0;
    }
}
