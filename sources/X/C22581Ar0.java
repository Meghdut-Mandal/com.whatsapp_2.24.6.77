package X;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: X.Ar0  reason: case insensitive filesystem */
public final class C22581Ar0 extends UploadDataProvider {
    public final Object A00 = new Object();
    public final B0H A01;
    public volatile FileChannel A02;

    private FileChannel A00() {
        FileChannel fileChannel;
        if (this.A02 == null) {
            synchronized (this.A00) {
                if (this.A02 == null) {
                    B8O b8o = (B8O) this.A01;
                    switch (b8o.A01) {
                        case 0:
                            fileChannel = new FileInputStream((File) b8o.A00).getChannel();
                            break;
                        case 1:
                            if (((ParcelFileDescriptor) b8o.A00).getStatSize() != -1) {
                                fileChannel = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) b8o.A00).getChannel();
                                break;
                            } else {
                                ((ParcelFileDescriptor) b8o.A00).close();
                                StringBuilder sb = new StringBuilder();
                                sb.append("Not a file: ");
                                sb.append((ParcelFileDescriptor) b8o.A00);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        default:
                            fileChannel = null;
                            break;
                    }
                    this.A02 = fileChannel;
                }
            }
        }
        return this.A02;
    }

    public void close() {
        FileChannel fileChannel = this.A02;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    public C22581Ar0(B0H b0h) {
        this.A01 = b0h;
    }

    public long getLength() {
        return A00().size();
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int read;
        if (byteBuffer.hasRemaining()) {
            FileChannel A002 = A00();
            int i = 0;
            do {
                read = A002.read(byteBuffer);
                if (read == -1 || (i = i + read) != 0) {
                    uploadDataSink.onReadSucceeded(false);
                }
                read = A002.read(byteBuffer);
                break;
            } while ((i = i + read) != 0);
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    public void rewind(UploadDataSink uploadDataSink) {
        A00().position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
