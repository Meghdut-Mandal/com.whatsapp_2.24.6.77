package X;

import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.1le  reason: invalid class name and case insensitive filesystem */
public class C37001le extends MediaMetadataRetriever implements Closeable {
    public void close() {
        try {
            release();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}