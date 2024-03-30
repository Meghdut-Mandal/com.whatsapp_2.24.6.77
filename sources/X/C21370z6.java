package X;

import android.content.SharedPreferences;

/* renamed from: X.0z6  reason: invalid class name and case insensitive filesystem */
public final class C21370z6 {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new AnonymousClass0z7(this));

    public C21370z6(C19890wg r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public final void A00(String str) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("running_tasks_");
        sb.append(str);
        edit.remove(sb.toString()).apply();
    }
}
