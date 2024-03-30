package X;

import android.content.Context;

/* renamed from: X.5NF  reason: invalid class name */
public class AnonymousClass5NF extends C92834eq {
    public final C92474e2 A00;

    public void setIsFullscreen(boolean z) {
        this.A00.A01 = !z;
    }

    public AnonymousClass5NF(Context context, int i) {
        super(context);
        setClipToOutline(true);
        C92474e2 r0 = new C92474e2();
        this.A00 = r0;
        r0.A00 = i;
        setOutlineProvider(r0);
    }
}
