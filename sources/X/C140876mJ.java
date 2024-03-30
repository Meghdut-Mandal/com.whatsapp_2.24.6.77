package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6mJ  reason: invalid class name and case insensitive filesystem */
public class C140876mJ implements FileStash {
    public final C157757ed A00;
    public final C157957ey A01;
    public final File A02;

    public C140876mJ(C157957ey r2, File file) {
        C139616kB r0 = C139616kB.A00;
        this.A02 = file;
        this.A01 = r2;
        this.A00 = r0;
    }

    public Set B8W() {
        int length;
        String[] list = this.A02.list();
        if (list == null || (length = list.length) == 0) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(length);
        for (String str : list) {
            Set set = C112875eb.A00;
            char[] charArray = str.toCharArray();
            StringBuilder A0u = AnonymousClass000.A0u();
            int i = 0;
            while (i < charArray.length) {
                char c = charArray[i];
                if (c == '%') {
                    try {
                        A0u.append((char) Integer.parseInt(new String(charArray, i + 1, 2), 16));
                        i += 2;
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    A0u.append(c);
                }
                i++;
            }
            str = A0u.toString();
            linkedHashSet.add(str);
        }
        return linkedHashSet;
    }

    public long BHe() {
        return AnonymousClass6Qf.A00(this.A02);
    }

    public boolean Bnd(String str) {
        return this.A01.B5E(getFilePath(str));
    }

    public boolean Bng() {
        C157957ey r0 = this.A01;
        File file = this.A02;
        if (!r0.B5E(file)) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    public File getFilePath(String str) {
        File file = this.A02;
        Set set = C112875eb.A00;
        char[] charArray = str.toCharArray();
        StringBuilder A0u = AnonymousClass000.A0u();
        for (char c : charArray) {
            if (c == '%' || C112875eb.A00.contains(Character.valueOf(c))) {
                A0u.append('%');
                C90504aG.A0z(c, A0u);
            } else {
                A0u.append(c);
            }
        }
        return C36441kJ.A0w(file, A0u.toString());
    }

    public File insertFile(String str) {
        this.A02.mkdirs();
        File filePath = getFilePath(str);
        filePath.setLastModified(this.A00.now());
        return filePath;
    }

    public long BD7(String str) {
        return AnonymousClass6Qf.A00(getFilePath(str));
    }

    public boolean BJu(String str) {
        return getFilePath(str).exists();
    }

    public long BNw(String str) {
        return getFilePath(str).lastModified();
    }

    public boolean Bne(String str, int i) {
        return Bnd(str);
    }

    public File getFile(String str) {
        File filePath = getFilePath(str);
        if (!filePath.exists()) {
            return null;
        }
        filePath.setLastModified(this.A00.now());
        return filePath;
    }
}
