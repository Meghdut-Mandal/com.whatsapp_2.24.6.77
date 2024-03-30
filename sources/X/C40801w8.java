package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaMediaThumbnailView;
import java.util.List;

/* renamed from: X.1w8  reason: invalid class name and case insensitive filesystem */
public class C40801w8 extends AnonymousClass0CZ {
    public final LayoutInflater A00;
    public final AnonymousClass3K8 A01;
    public final List A02 = AnonymousClass001.A0I();

    public C40801w8(LayoutInflater layoutInflater, AnonymousClass3K8 r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = layoutInflater;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        return new C42271yY(C36371kC.A0J(this.A00, viewGroup, R.layout.f9nameremoved, false), this.A01);
    }

    public int A0J() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r3) {
        C42271yY r32 = (C42271yY) r3;
        AnonymousClass00C.A0D(r32, 0);
        WaMediaThumbnailView waMediaThumbnailView = r32.A03;
        waMediaThumbnailView.setImageDrawable((Drawable) null);
        waMediaThumbnailView.A01 = null;
        waMediaThumbnailView.setThumbnail((Bitmap) null);
        waMediaThumbnailView.setTag((Object) null);
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r6, int i) {
        AnonymousClass4TB r2;
        C42271yY r62 = (C42271yY) r6;
        AnonymousClass00C.A0D(r62, 0);
        AnonymousClass4V2 r4 = (AnonymousClass4V2) this.A02.get(i);
        WaMediaThumbnailView waMediaThumbnailView = r62.A03;
        waMediaThumbnailView.A01 = r4;
        Object tag = waMediaThumbnailView.getTag();
        if ((tag instanceof AnonymousClass4TB) && (r2 = (AnonymousClass4TB) tag) != null) {
            r62.A04.A01(r2);
        }
        if (r4 != null) {
            C36411kG.A1D(waMediaThumbnailView);
            C89544Wy r22 = new C89544Wy(r4, r62, 1);
            waMediaThumbnailView.setTag(r22);
            r62.A04.A02(r22, new AnonymousClass4X1(r22, r62, r4, 1));
            return;
        }
        C36441kJ.A1D(waMediaThumbnailView);
        waMediaThumbnailView.setBackgroundColor(r62.A01);
        waMediaThumbnailView.setImageDrawable((Drawable) null);
    }
}
