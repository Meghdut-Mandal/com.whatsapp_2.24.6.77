package X;

import android.content.Context;
import android.view.TextureView;

/* renamed from: X.5YG  reason: invalid class name */
public abstract class AnonymousClass5YG {
    public static C20952A0j A00(Context context, TextureView textureView) {
        AnonymousClass5RY r0;
        C140236lG r7 = new C140236lG(false);
        boolean A00 = C112785eS.A00(context);
        Context applicationContext = context.getApplicationContext();
        if (A00) {
            r0 = AnonymousClass5RY.CAMERA2;
        } else {
            r0 = AnonymousClass5RY.CAMERA1;
        }
        TextureView textureView2 = textureView;
        C20952A0j a0j = new C20952A0j(applicationContext, textureView2, new C204339pq(), AnonymousClass94V.A00(context, r0), r7, A00);
        a0j.A0F = false;
        return a0j;
    }
}
