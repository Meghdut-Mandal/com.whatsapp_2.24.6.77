package X;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5vB  reason: invalid class name and case insensitive filesystem */
public class C122635vB {
    public final long A00;
    public final File A01;
    public final AtomicBoolean A02;
    public final AtomicInteger A03 = new AtomicInteger();

    public C122635vB(File file, boolean z) {
        this.A01 = file;
        this.A02 = new AtomicBoolean(z);
        long length = file.length();
        this.A00 = length;
        if (length == 0 && !file.exists()) {
            C36321k7.A1J(file, "mediafilereference/file does not exist: ", AnonymousClass000.A0u());
        }
    }
}
