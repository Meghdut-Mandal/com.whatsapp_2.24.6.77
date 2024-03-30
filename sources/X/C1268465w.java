package X;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: X.65w  reason: invalid class name and case insensitive filesystem */
public class C1268465w {
    public final Context A00;

    public File A00(String str) {
        Context context = this.A00;
        C36441kJ.A0w(context.getFilesDir(), "migration/export/sandbox").mkdirs();
        return File.createTempFile("sandbox", str, C36441kJ.A0w(context.getFilesDir(), "migration/export/sandbox"));
    }

    public void A01() {
        AnonymousClass6YY.A0H(C36441kJ.A0w(this.A00.getFilesDir(), "migration/export/sandbox"), (Set) null);
    }

    public C1268465w(Context context) {
        this.A00 = context;
    }
}
