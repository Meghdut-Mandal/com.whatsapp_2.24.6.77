package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;

/* renamed from: X.1wA  reason: invalid class name and case insensitive filesystem */
public class C40821wA extends AnonymousClass0CZ {
    public final Context A00;
    public final int[] A01;
    public final /* synthetic */ SolidColorWallpaper A02;

    public C40821wA(Context context, SolidColorWallpaper solidColorWallpaper, int[] iArr) {
        this.A02 = solidColorWallpaper;
        this.A00 = context;
        this.A01 = iArr;
    }

    public long A0E(int i) {
        return (long) this.A01[i];
    }

    public int A0J() {
        return this.A01.length;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r4, int i) {
        C41891xw r42 = (C41891xw) r4;
        C40821wA r1 = r42.A00;
        int i2 = r1.A01[i];
        View view = r42.A0H;
        view.setBackgroundColor(i2);
        C36331k8.A0q(r1.A02, view, SolidColorWallpaper.A04[i]);
        C67143Yr.A00(view, r42, i, 23);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        C39041qx r2 = new C39041qx(this.A00);
        r2.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        return new C41891xw(r2, this);
    }
}
