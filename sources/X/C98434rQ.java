package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4rQ  reason: invalid class name and case insensitive filesystem */
public class C98434rQ extends C140866mI {
    public static final long A03;
    public static final long A04;
    public final C159017ie A00;
    public final Set A01 = Collections.synchronizedSet(C36441kJ.A16());
    public volatile long A02 = A03;

    public boolean Bne(String str, int i) {
        this.A01.remove(str);
        return this.A00.Bne(str, 0);
    }

    static {
        long millis = TimeUnit.HOURS.toMillis(4);
        A04 = millis;
        A03 = millis * -2;
    }

    public boolean Bnd(String str) {
        this.A01.remove(str);
        return this.A00.Bnd(str);
    }

    public File getFile(String str) {
        if (this.A02 == A03 || this.A01.contains(str)) {
            return this.A00.getFile(str);
        }
        return null;
    }

    public File insertFile(String str) {
        this.A01.add(str);
        return this.A00.insertFile(str);
    }

    public C98434rQ(C159017ie r3, FileStash fileStash) {
        super(fileStash);
        this.A00 = r3;
    }
}
