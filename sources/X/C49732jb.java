package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.bonsai.BonsaiConversationTitleViewModel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.lang.ref.WeakReference;

/* renamed from: X.2jb  reason: invalid class name and case insensitive filesystem */
public final class C49732jb extends C132446Tt {
    public final float A00;
    public final int A01;
    public final AnonymousClass1Pp A02;
    public final C27761Ps A03;
    public final AnonymousClass141 A04;
    public final AnonymousClass1EM A05;
    public final WeakReference A06;
    public final WeakReference A07;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        View A0Y = AnonymousClass000.A0Y(this.A07);
        if (A0Y == null) {
            return null;
        }
        return this.A03.A07(A0Y.getContext(), this.A04, this.A00, this.A01, false);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A07.get();
        if (imageView != null) {
            if (bitmap == null) {
                AnonymousClass1Pp r4 = this.A02;
                bitmap = AnonymousClass1Pp.A01(imageView.getContext(), r4, this.A00, r4.A02(this.A04), this.A01);
                AnonymousClass00C.A08(bitmap);
            }
            imageView.setImageBitmap(bitmap);
            if ((imageView instanceof WDSProfilePhoto) && this.A00 == -2.14748365E9f) {
                ((WDSProfilePhoto) imageView).setProfilePhotoShape(C108525Tv.SQUIRCLE);
            }
            AnonymousClass316 r0 = (AnonymousClass316) this.A06.get();
            if (r0 != null) {
                AnonymousClass28d r1 = r0.A00;
                if (r1 instanceof C43312Gv) {
                    BonsaiConversationTitleViewModel.A02(AnonymousClass28d.A00((C43312Gv) r1));
                } else {
                    r1.A09().setVisibility(0);
                }
            }
        }
    }

    public C49732jb(ImageView imageView, AnonymousClass1Pp r4, C27761Ps r5, AnonymousClass316 r6, AnonymousClass141 r7, AnonymousClass1EM r8) {
        float dimension;
        this.A02 = r4;
        this.A05 = r8;
        this.A03 = r5;
        this.A04 = r7;
        this.A06 = AnonymousClass001.A0F(r6);
        this.A07 = AnonymousClass001.A0F(imageView);
        this.A01 = C36341k9.A0F(imageView).getDimensionPixelSize(R.dimen.f7nameremoved);
        AnonymousClass1EM r1 = this.A05;
        C65533Sl r0 = AnonymousClass147.A01;
        if (r1.A06(C65533Sl.A03(r7.A0H))) {
            dimension = -2.14748365E9f;
        } else {
            dimension = C36341k9.A0F(imageView).getDimension(R.dimen.f7nameremoved);
        }
        this.A00 = dimension;
    }
}
