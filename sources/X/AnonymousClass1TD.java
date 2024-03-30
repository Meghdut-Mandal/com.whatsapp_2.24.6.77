package X;

import android.content.SharedPreferences;

/* renamed from: X.1TD  reason: invalid class name */
public class AnonymousClass1TD {
    public final AnonymousClass1TC A00;

    public synchronized void A00(String str) {
        AnonymousClass1TC r0 = this.A00;
        SharedPreferences.Editor edit = AnonymousClass1TC.A00(r0).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("KeepInChatNotif");
        sb.append("::");
        sb.append(str);
        edit.putLong(sb.toString(), r0.A01(str) + 1).apply();
    }

    public AnonymousClass1TD(AnonymousClass1TC r1) {
        this.A00 = r1;
    }
}
