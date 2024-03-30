package X;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: X.10L  reason: invalid class name */
public final class AnonymousClass10L implements Closeable {
    public FileOutputStream A00;
    public FileLock A01;

    public void close() {
        try {
            FileLock fileLock = this.A01;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.A00.close();
        }
    }

    public AnonymousClass10L(File file, boolean z) {
        FileLock fileLock;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.A00 = fileOutputStream;
        if (z) {
            try {
                fileLock = fileOutputStream.getChannel().tryLock();
            } catch (IOException unused) {
                fileLock = null;
            }
        } else {
            try {
                fileLock = fileOutputStream.getChannel().lock();
            } catch (Throwable th) {
                this.A00.close();
                throw th;
            }
        }
        if (fileLock == null) {
            this.A00.close();
        }
        this.A01 = fileLock;
    }
}
