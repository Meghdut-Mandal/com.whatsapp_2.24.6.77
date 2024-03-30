package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6mI  reason: invalid class name and case insensitive filesystem */
public abstract class C140866mI implements FileStash {
    public final FileStash A00;

    public Set B8W() {
        LinkedHashSet linkedHashSet;
        if (!(this instanceof C98434rQ)) {
            return this.A00.B8W();
        }
        C98434rQ r9 = (C98434rQ) this;
        C159017ie r10 = r9.A00;
        long now = r10.now();
        long j = C98434rQ.A04;
        if (r10.now() - r9.A02 > j) {
            Set set = r9.A01;
            synchronized (set) {
                if (r10.now() - r9.A02 > j) {
                    set.clear();
                    set.addAll(r9.A00.B8W());
                    r9.A02 = now;
                }
            }
        }
        Set set2 = r9.A01;
        synchronized (set2) {
            linkedHashSet = new LinkedHashSet(set2);
        }
        return linkedHashSet;
    }

    public long BD7(String str) {
        return this.A00.BD7(str);
    }

    public long BHe() {
        return this.A00.BHe();
    }

    public boolean BJu(String str) {
        if (!(this instanceof C98434rQ)) {
            return this.A00.BJu(str);
        }
        C98434rQ r5 = (C98434rQ) this;
        if (r5.A02 == C98434rQ.A03) {
            Set set = r5.A01;
            if (!set.contains(str)) {
                if (!r5.A00.BJu(str)) {
                    return false;
                }
                set.add(str);
                return true;
            }
        }
        return r5.A01.contains(str);
    }

    public long BNw(String str) {
        return this.A00.BNw(str);
    }

    public boolean Bng() {
        FileStash fileStash;
        if (this instanceof C98434rQ) {
            C98434rQ r1 = (C98434rQ) this;
            r1.A01.clear();
            fileStash = r1.A00;
        } else {
            fileStash = this.A00;
        }
        return fileStash.Bng();
    }

    public File getFilePath(String str) {
        return this.A00.getFilePath(str);
    }

    public C140866mI(FileStash fileStash) {
        this.A00 = fileStash;
    }
}
