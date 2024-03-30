package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1zS  reason: invalid class name and case insensitive filesystem */
public abstract class C42771zS extends AnonymousClass07S {
    public final Context A00;
    public final Resources A01;

    public Object A0I(ViewGroup viewGroup, int i) {
        int i2;
        Pair create;
        Context context;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        boolean z = this instanceof C47272eD;
        if (z) {
            C47272eD r6 = (C47272eD) this;
            if (i == 0) {
                context = r6.A00;
                i3 = R.string.f12nameremoved;
            } else {
                int A0H = r6.A0H() - 1;
                context = r6.A00;
                i3 = R.string.f12nameremoved;
                if (i < A0H) {
                    i3 = R.string.f12nameremoved;
                }
            }
            String string = context.getString(i3);
            if (r6.A00 == null) {
                boolean A0A = AnonymousClass1RC.A0A(context);
                i4 = R.string.f12nameremoved;
                if (A0A) {
                    i4 = R.string.f12nameremoved;
                }
            } else {
                boolean z2 = r6.A07;
                i4 = R.string.f12nameremoved;
                if (z2) {
                    i4 = R.string.f12nameremoved;
                }
            }
            create = Pair.create(string, context.getString(i4));
        } else {
            SolidColorWallpaperPreview solidColorWallpaperPreview = ((C47262eC) this).A02;
            if (i == 0) {
                i2 = R.string.f12nameremoved;
            } else {
                int length = solidColorWallpaperPreview.A0B.length - 1;
                i2 = R.string.f12nameremoved;
                if (i < length) {
                    i2 = R.string.f12nameremoved;
                }
            }
            create = Pair.create(solidColorWallpaperPreview.getString(i2), solidColorWallpaperPreview.A3i());
        }
        C47222e3 r2 = new C47222e3(this.A00, this.A01, (String) create.first, (String) create.second);
        r2.setLayoutParams(layoutParams);
        viewGroup.addView(r2);
        if (z) {
            C47272eD r4 = (C47272eD) this;
            r2.setDownloadClickListener(new AnonymousClass3YL(r4, i, 16, r2));
            List list = r4.A03;
            if (i < list.size()) {
                C47272eD.A00(r2, r4, i);
                return r2;
            }
            int size = i - list.size();
            C49932jv r5 = new C49932jv(r2.getContext(), r2.A00, r2.A06, r2.A04, C36351kA.A06(r4.A05, size), C36351kA.A06(r4.A04, size));
            r2.A02.setVisibility(8);
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = r4.A01.A01;
            Set set = downloadableWallpaperPreviewActivity.A08;
            Integer valueOf = Integer.valueOf(i);
            set.add(valueOf);
            if (downloadableWallpaperPreviewActivity.A00.getCurrentItem() == i) {
                downloadableWallpaperPreviewActivity.A00.setEnabled(true);
            }
            C36331k8.A1E((C132446Tt) r4.A06.put(valueOf, r5));
            C36331k8.A1F(r5, r4.A02);
            return r2;
        }
        C47262eC r42 = (C47262eC) this;
        r2.setBackgroundColor(r42.A02.A0B[i]);
        if (r42.A00) {
            Context context2 = r2.getContext();
            r2.A05.setImageDrawable(AnonymousClass3UF.A08(C36381kD.A0H(context2, R.drawable.whatsapp_doodle), context2.getResources().getIntArray(R.array.f3nameremoved)[i]));
        } else {
            r2.A05.setImageDrawable((Drawable) null);
        }
        Map map = r42.A01;
        Integer valueOf2 = Integer.valueOf(i);
        map.put(valueOf2, Boolean.valueOf(r42.A00));
        r2.setTag(valueOf2);
        return r2;
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) obj);
    }

    public C42771zS(Context context, Resources resources) {
        this.A00 = context;
        this.A01 = resources;
    }
}
