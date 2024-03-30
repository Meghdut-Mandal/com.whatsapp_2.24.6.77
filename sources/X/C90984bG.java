package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* renamed from: X.4bG  reason: invalid class name and case insensitive filesystem */
public final class C90984bG extends ContextWrapper {
    public final Resources A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90984bG(Context context, Resources resources) {
        super(context);
        AnonymousClass00C.A0D(resources, 2);
        this.A00 = resources;
    }

    public Resources getResources() {
        return this.A00;
    }
}
