package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.6gv  reason: invalid class name and case insensitive filesystem */
public final class C137906gv implements C156957bb {
    public final AccessibilityManager A00;

    public C137906gv(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.A00 = (AccessibilityManager) systemService;
    }
}
