package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.1zF  reason: invalid class name and case insensitive filesystem */
public final class C42701zF extends AnonymousClass0D3 implements View.OnClickListener {
    public C62613Gv A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final /* synthetic */ GalleryPickerFragment A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42701zF(View view, GalleryPickerFragment galleryPickerFragment) {
        super(view);
        this.A05 = galleryPickerFragment;
        this.A04 = C36361kB.A0R(view, R.id.title);
        this.A01 = C36361kB.A0M(view, R.id.icon);
        this.A03 = C36351kA.A0F(view, R.id.count);
        this.A02 = C36361kB.A0M(view, R.id.thumbnail);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        GalleryPickerFragment galleryPickerFragment = this.A05;
        C1270866x r3 = galleryPickerFragment.A0L;
        if (r3 != null) {
            r3.A02(C36361kB.A0j(), 1, 15);
            C62613Gv r4 = this.A00;
            if (r4 == null) {
                return;
            }
            if (galleryPickerFragment.A0J != null) {
                AnonymousClass01I A0i = galleryPickerFragment.A0i();
                Bundle bundle = galleryPickerFragment.A0A;
                C20810yC r1 = galleryPickerFragment.A0D;
                if (r1 != null) {
                    r4.A00(A0i, bundle, r1.A07(2614));
                    return;
                }
                throw C36321k7.A07();
            }
            throw C36331k8.A0X();
        }
        throw C36331k8.A0d("mediaSharingUserJourneyLogger");
    }
}
