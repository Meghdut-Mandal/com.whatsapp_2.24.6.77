package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.concurrent.Callable;

/* renamed from: X.76i  reason: invalid class name and case insensitive filesystem */
public class C1507176i implements Callable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ String A01;

    public C1507176i(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ Object call() {
        return this.A00.A04.get(this.A01);
    }
}
