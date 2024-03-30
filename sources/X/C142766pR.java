package X;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6pR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C142766pR implements AnonymousClass4PB {
    public final /* synthetic */ File A00;
    public final /* synthetic */ File A01;

    public /* synthetic */ C142766pR(File file, File file2) {
        this.A00 = file;
        this.A01 = file2;
    }

    public final Object apply(Object obj) {
        File file = this.A00;
        File file2 = this.A01;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            if (file.getName().equals(str)) {
                return file;
            }
            try {
                return AnonymousClass6YY.A05(file2.getCanonicalPath(), str);
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
