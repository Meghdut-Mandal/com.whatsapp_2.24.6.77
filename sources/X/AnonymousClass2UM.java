package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.2UM  reason: invalid class name */
public class AnonymousClass2UM extends C45962Tx {
    public Drawable A00;

    public void setMediaItem(AnonymousClass4V2 r4) {
        Context context;
        int i;
        super.setMediaItem(r4);
        if (r4 != null) {
            int type = r4.getType();
            if (type == 1) {
                context = getContext();
                i = R.drawable.mark_video;
            } else if (type == 2) {
                context = getContext();
                i = R.drawable.mark_gif;
            }
            this.A00 = AnonymousClass00E.A00(context, i);
            return;
        }
        this.A00 = null;
    }

    public AnonymousClass2UM(Context context) {
        super(context);
    }
}
