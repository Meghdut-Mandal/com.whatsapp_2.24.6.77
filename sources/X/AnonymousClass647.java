package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.647  reason: invalid class name */
public abstract class AnonymousClass647 {
    public File A00;
    public File A01;
    public final AnonymousClass5TI A02;
    public final AnonymousClass5TJ A03;
    public final String A04;

    public File A01(Context context) {
        File file;
        File file2 = this.A01;
        if (file2 == null || !file2.exists() || (file = this.A00) == null || !file.exists()) {
            return null;
        }
        if (AnonymousClass1RC.A0A(context)) {
            return this.A00;
        }
        return this.A01;
    }

    public AnonymousClass647(AnonymousClass5TI r1, AnonymousClass5TJ r2, String str) {
        this.A04 = str;
        this.A02 = r1;
        this.A03 = r2;
    }
}
