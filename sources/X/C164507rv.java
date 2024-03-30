package X;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.7rv  reason: invalid class name and case insensitive filesystem */
public class C164507rv implements AnonymousClass4PB {
    public Object A00;
    public final int A01;

    public C164507rv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object apply(Object obj) {
        if (this.A01 != 0) {
            File file = (File) ((Map) this.A00).get(obj);
            if (file == null) {
                return null;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                return file;
            }
            C90474aD.A15(parentFile);
            return file;
        }
        File file2 = (File) this.A00;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return AnonymousClass6YY.A05(file2.getCanonicalPath(), str);
        } catch (IOException unused) {
            return null;
        }
    }
}
