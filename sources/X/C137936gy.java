package X;

import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: X.6gy  reason: invalid class name and case insensitive filesystem */
public final class C137936gy implements C156967bc {
    public final ClipboardManager A00;

    public C137936gy(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.A00 = (ClipboardManager) systemService;
    }
}
