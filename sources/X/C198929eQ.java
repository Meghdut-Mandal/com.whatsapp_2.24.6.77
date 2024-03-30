package X;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.9eQ  reason: invalid class name and case insensitive filesystem */
public class C198929eQ {
    public static final FilenameFilter A07 = new B99(0);
    public static final FilenameFilter A08 = new B99(1);
    public int A00 = 0;
    public long A01 = 0;
    public AnonymousClass9NU A02 = new AnonymousClass9NU();
    public File A03;
    public File A04;
    public File A05;
    public final File A06;

    public C198929eQ(Context context, File file) {
        if (file.exists() || file.mkdirs()) {
            this.A06 = file;
        } else {
            File A0w = C36441kJ.A0w(context.getFilesDir(), "profilo");
            this.A06 = A0w;
            File A0w2 = C36441kJ.A0w(context.getCacheDir(), "profilo");
            if (A0w2.exists()) {
                A0w2.renameTo(A0w);
            }
            if (!A0w.exists() && !A0w.mkdirs()) {
                throw AnonymousClass001.A09("Unable to initialize Profilo folder");
            }
        }
        this.A04 = C36441kJ.A0w(this.A06, "upload");
        this.A05 = C36441kJ.A0w(this.A06, "crash_dumps");
        this.A03 = C36441kJ.A0w(this.A06, "mmap_buffer");
    }
}
