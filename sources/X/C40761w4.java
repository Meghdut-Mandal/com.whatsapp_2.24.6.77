package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1w4  reason: invalid class name and case insensitive filesystem */
public final class C40761w4 extends AnonymousClass0CZ {
    public final ArrayList A00 = AnonymousClass001.A0I();
    public final /* synthetic */ GalleryPickerFragment A01;

    public long A0E(int i) {
        return (long) i;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        List list = AnonymousClass0D3.A0I;
        return new C42701zF(C36371kC.A0J(C36351kA.A0C(viewGroup), (ViewGroup) null, R.layout.f9nameremoved, false), this.A01);
    }

    public C40761w4(GalleryPickerFragment galleryPickerFragment) {
        this.A01 = galleryPickerFragment;
        A0B(true);
    }

    public int A0J() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r17, int i) {
        int i2;
        AnonymousClass4TB r5;
        C42701zF r7 = (C42701zF) r17;
        AnonymousClass00C.A0D(r7, 0);
        Object obj = this.A00.get(i);
        AnonymousClass00C.A08(obj);
        C62613Gv r8 = (C62613Gv) obj;
        AnonymousClass00C.A0D(r8, 0);
        r7.A00 = r8;
        TextView textView = r7.A03;
        GalleryPickerFragment galleryPickerFragment = r7.A05;
        C18820ts r0 = galleryPickerFragment.A0C;
        if (r0 != null) {
            C36411kG.A1E(textView, r0.A0M(), (long) r8.A00);
            r7.A04.A0I(r8.A05);
            ImageView imageView = r7.A01;
            int i3 = r8.A02;
            switch (i3) {
                case 0:
                case 4:
                case 7:
                    i2 = R.drawable.frame_overlay_gallery_camera;
                    break;
                case 1:
                case 5:
                    i2 = R.drawable.frame_overlay_gallery_video;
                    break;
                case 9:
                    i2 = R.drawable.frame_overlay_gallery_whatsapp;
                    break;
                default:
                    i2 = R.drawable.frame_overlay_gallery_folder;
                    break;
            }
            imageView.setImageResource(i2);
            Context A1D = galleryPickerFragment.A1D();
            if (A1D != null && C222013h.A07) {
                C36361kB.A10(A1D.getResources(), imageView, R.dimen.f7nameremoved);
            }
            ImageView imageView2 = r7.A02;
            Object tag = imageView2.getTag();
            String str = null;
            if (tag instanceof AnonymousClass4TB) {
                r5 = (AnonymousClass4TB) tag;
                if (r5 != null) {
                    str = r5.BIB();
                }
            } else {
                r5 = null;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(i3);
            A0u.append('-');
            A0u.append(r8.A04);
            A0u.append('-');
            A0u.append(r8.A01);
            A0u.append('-');
            if (!AnonymousClass00C.A0J(str, C36421kH.A0d(A0u, r8.A06))) {
                AnonymousClass3K8 r02 = galleryPickerFragment.A0I;
                if (r02 != null) {
                    r02.A01(r5);
                }
                AnonymousClass4V2 r6 = r8.A03;
                C89554Wz r52 = new C89554Wz(r6, r7, r8, galleryPickerFragment, 1);
                AnonymousClass4X0 r10 = new AnonymousClass4X0(r7, galleryPickerFragment, r6, r52, 1);
                imageView2.setTag(r52);
                AnonymousClass3K8 r03 = galleryPickerFragment.A0I;
                if (r03 != null) {
                    r03.A02(r52, r10);
                    return;
                }
                return;
            }
            return;
        }
        throw C36321k7.A09();
    }
}
