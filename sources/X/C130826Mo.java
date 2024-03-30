package X;

import android.os.Build;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.6Mo  reason: invalid class name and case insensitive filesystem */
public class C130826Mo {
    public final MultiBufferLogger A00;
    public final C21060yb A01;
    public final C19890wg A02;

    private void A00(String str, String str2, int i) {
        MultiBufferLogger multiBufferLogger = this.A00;
        multiBufferLogger.writeBytesEntry(1, 57, multiBufferLogger.writeBytesEntry(1, 56, multiBufferLogger.writeStandardEntry(7, 52, 0, 0, i, 0, 0), str), str2);
    }

    public void A01() {
        A00("os_ver", Build.VERSION.RELEASE, 8126483);
        A00("os_sdk", Integer.toString(Build.VERSION.SDK_INT), 8126537);
        A00("device_type", Build.MODEL, 8126478);
        A00("brand", Build.BRAND, 8126479);
        A00("manufacturer", Build.MANUFACTURER, 8126480);
        A00("year_class", Integer.toString(AnonymousClass1K2.A02(this.A01, this.A02)), 8126481);
    }

    public C130826Mo(MultiBufferLogger multiBufferLogger, C21060yb r2, C19890wg r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = multiBufferLogger;
    }
}
