package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import java.util.Map;

/* renamed from: X.2eC  reason: invalid class name and case insensitive filesystem */
public class C47262eC extends C42771zS {
    public boolean A00 = false;
    public final Map A01 = AnonymousClass001.A0J();
    public final /* synthetic */ SolidColorWallpaperPreview A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47262eC(Context context, SolidColorWallpaperPreview solidColorWallpaperPreview) {
        super(context, (Resources) null);
        this.A02 = solidColorWallpaperPreview;
    }

    public int A07(Object obj) {
        if (obj instanceof C47222e3) {
            Object tag = ((View) obj).getTag();
            if (tag instanceof Integer) {
                Map map = this.A01;
                if (!map.containsKey(tag) || Boolean.valueOf(this.A00).equals(map.get(tag))) {
                    return -1;
                }
                return -2;
            }
        }
        return -1;
    }

    public int A0H() {
        return this.A02.A0B.length;
    }

    public boolean A0K(View view, Object obj) {
        return C36361kB.A1a(view, obj);
    }
}
