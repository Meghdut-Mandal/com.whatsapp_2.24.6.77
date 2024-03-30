package X;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5LE  reason: invalid class name */
public class AnonymousClass5LE extends AnonymousClass6QJ {
    public final List A00;

    public AnonymousClass5LE(List list, int[] iArr, long j) {
        super(iArr, list.size(), j);
        this.A00 = list;
    }

    public static AnonymousClass5LE A00(File file, int[] iArr) {
        DataInputStream dataInputStream;
        try {
            dataInputStream = new DataInputStream(C90474aD.A0U(file));
            long readLong = dataInputStream.readLong();
            ArrayList A002 = C110535ap.A00(Long.valueOf(readLong), iArr);
            int size = A002.size();
            int[] iArr2 = new int[size];
            for (int i = 0; i < size; i++) {
                iArr2[i] = dataInputStream.readInt();
            }
            AnonymousClass5LE r0 = new AnonymousClass5LE(A002, iArr2, readLong);
            dataInputStream.close();
            return r0;
        } catch (IOException e) {
            C36321k7.A1M(file, "ChunkStore/chunk object not found: ", AnonymousClass000.A0u(), e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
