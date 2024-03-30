package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4rP  reason: invalid class name and case insensitive filesystem */
public class C98424rP extends C140866mI {
    public final List A00 = C90524aI.A0l();
    public final List A01 = C90524aI.A0l();
    public final List A02 = C90524aI.A0l();

    public boolean Bnd(String str) {
        return Bne(str, 0);
    }

    public boolean Bne(String str, int i) {
        List list = this.A02;
        boolean isEmpty = list.isEmpty();
        FileStash fileStash = this.A00;
        if (isEmpty) {
            return fileStash.Bne(str, 0);
        }
        boolean Bne = fileStash.Bne(str, 0);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return Bne;
        }
        it.next();
        throw AnonymousClass001.A0A("onRemove");
    }

    public File getFile(String str) {
        String str2;
        boolean hasNext;
        List list = this.A00;
        if (list.isEmpty()) {
            return this.A00.getFile(str);
        }
        try {
            FileStash fileStash = this.A00;
            File file = fileStash.getFile(str);
            fileStash.BJu(str);
            if (!hasNext) {
                return file;
            }
            throw AnonymousClass001.A0A(str2);
        } finally {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                str2 = "onGet";
                throw AnonymousClass001.A0A(str2);
            }
        }
    }

    public File insertFile(String str) {
        String str2;
        boolean hasNext;
        List list = this.A01;
        boolean isEmpty = list.isEmpty();
        FileStash fileStash = this.A00;
        if (isEmpty) {
            return fileStash.insertFile(str);
        }
        fileStash.BJu(str);
        try {
            if (!hasNext) {
                return fileStash.insertFile(str);
            }
            throw AnonymousClass001.A0A(str2);
        } finally {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                str2 = "onInsert";
                throw AnonymousClass001.A0A(str2);
            }
        }
    }

    public C98424rP(FileStash fileStash, List list) {
        super(fileStash);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0A("attach");
        }
    }
}
