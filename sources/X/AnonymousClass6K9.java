package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.IOException;

/* renamed from: X.6K9  reason: invalid class name */
public class AnonymousClass6K9 {
    public int A00;
    public int A01;
    public String A02;

    public static AnonymousClass6K9 A00(String str) {
        String string;
        C114965i7 r5 = new C114965i7(new MediaExtractor());
        try {
            MediaExtractor mediaExtractor = r5.A00;
            mediaExtractor.setDataSource(str);
            C121025sT A002 = C131726Qh.A00(r5);
            if (A002 != null) {
                MediaFormat mediaFormat = A002.A01;
                AnonymousClass6K9 r1 = new AnonymousClass6K9();
                if (mediaFormat.containsKey("channel-count")) {
                    r1.A00 = mediaFormat.getInteger("channel-count");
                    if (mediaFormat.containsKey("sample-rate")) {
                        r1.A01 = mediaFormat.getInteger("sample-rate");
                        if (mediaFormat.containsKey("mime") && (string = mediaFormat.getString("mime")) != null) {
                            r1.A02 = string;
                            mediaExtractor.release();
                            return r1;
                        }
                    }
                }
            }
            mediaExtractor.release();
            return null;
        } catch (C98584rf | IOException unused) {
            r5.A00.release();
            return null;
        } catch (Throwable th) {
            r5.A00.release();
            throw th;
        }
    }
}
