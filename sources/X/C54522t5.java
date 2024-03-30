package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.2t5  reason: invalid class name and case insensitive filesystem */
public abstract class C54522t5 {
    public static void A00(Context context, String str) {
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.Main");
        A0D.setAction("android.intent.action.MAIN");
        A0D.addCategory("android.intent.category.LAUNCHER");
        A0D.addFlags(268435456);
        A0D.addFlags(2097152);
        Intent A0D2 = C36431kI.A0D();
        A0D2.putExtra("android.intent.extra.shortcut.INTENT", A0D);
        A0D2.putExtra("duplicate", false);
        A0D2.putExtra("android.intent.extra.shortcut.NAME", str);
        A0D2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, R.mipmap.icon));
        A0D2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        context.sendBroadcast(A0D2);
    }
}
