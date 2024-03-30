package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

/* renamed from: X.1O2  reason: invalid class name */
public class AnonymousClass1O2 {
    public HashSet A00;
    public final C19630wG A01;

    public HashSet A00() {
        ObjectInputStream objectInputStream;
        HashSet hashSet = this.A00;
        if (hashSet != null) {
            return hashSet;
        }
        File file = new File(this.A01.A00.getFilesDir(), "invalid_numbers");
        if (file.exists() && file.canRead()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    objectInputStream = new ObjectInputStream(fileInputStream);
                    this.A00 = (HashSet) objectInputStream.readObject();
                    objectInputStream.close();
                    fileInputStream.close();
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException | ClassNotFoundException | IllegalArgumentException e) {
                Log.e(e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        HashSet hashSet2 = this.A00;
        if (hashSet2 != null) {
            return hashSet2;
        }
        HashSet hashSet3 = new HashSet();
        this.A00 = hashSet3;
        return hashSet3;
        throw th;
    }

    public AnonymousClass1O2(C19630wG r1) {
        this.A01 = r1;
    }
}
