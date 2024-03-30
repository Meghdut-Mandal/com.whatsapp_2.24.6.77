package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Collection;

/* renamed from: X.6mQ  reason: invalid class name and case insensitive filesystem */
public class C140946mQ implements C160597lG {
    public final FileStash A00;

    public Collection B8V() {
        return this.A00.B8W();
    }

    public boolean BNZ(String str) {
        File filePath = this.A00.getFilePath(str);
        if (!filePath.exists() || filePath.canExecute()) {
            return false;
        }
        return true;
    }

    public long BNm(String str) {
        return this.A00.BNw(str);
    }

    public long BNn(String str) {
        return this.A00.BD7(str);
    }

    public boolean Bnd(String str) {
        return this.A00.Bnd(str);
    }

    public C140946mQ(FileStash fileStash) {
        this.A00 = fileStash;
    }
}
