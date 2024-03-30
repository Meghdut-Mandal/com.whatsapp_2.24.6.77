package X;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Map;

/* renamed from: X.9Mv  reason: invalid class name and case insensitive filesystem */
public class C193779Mv {
    public AnonymousClass93V A00;
    public String A01 = ".ttf";
    public final AssetManager A02;
    public final AnonymousClass9VK A03 = new AnonymousClass9VK();
    public final Map A04 = AnonymousClass001.A0J();
    public final Map A05 = AnonymousClass001.A0J();

    public C193779Mv(Drawable.Callback callback, AnonymousClass93V r3) {
        AssetManager assets;
        this.A00 = r3;
        if (!(callback instanceof View)) {
            AnonymousClass6GP.A00("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.A02 = assets;
    }
}
