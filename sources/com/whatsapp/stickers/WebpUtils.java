package com.whatsapp.stickers;

import X.AnonymousClass1AV;
import X.AnonymousClass6YY;
import X.C18750th;
import X.C19430v1;
import X.C45692Si;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class WebpUtils {
    public Random A00 = new Random();
    public final AnonymousClass1AV A01;

    public static native int createFirstThumbnail(byte[] bArr, int i, String str);

    public static native ExifMetadata fetchWebpMetadata(String str);

    public static native int getFirstWebpThumbnailMinimumFileLength(String str);

    public static native int insertWebpMetadata(String str, String str2, byte[] bArr);

    public static native WebpInfoResult verifyWebpFileIntegrity(String str);

    public class ExifMetadata {
        public final int length;
        public final byte[] metadata;
        public final int returnCode;

        public ExifMetadata(int i) {
            this.metadata = null;
            this.returnCode = i;
            this.length = 0;
        }

        private byte[] getMetadata() {
            return this.metadata;
        }

        public ExifMetadata(byte[] bArr) {
            this.metadata = bArr;
            this.returnCode = 0;
            this.length = bArr.length;
        }
    }

    public class WebpInfoResult {
        public final int returnCode;
        public final WebpInfo webpInfo;

        public WebpInfoResult(int i) {
            this.webpInfo = null;
            this.returnCode = i;
        }

        public WebpInfoResult(int i, int i2, int i3, int i4, long j) {
            this.webpInfo = new WebpInfo(i, i2, i3, i4, j);
            this.returnCode = 0;
        }
    }

    public int A00(String str) {
        C45692Si r3;
        AnonymousClass1AV r4 = this.A01;
        if (!AnonymousClass1AV.A01(r4, 6)) {
            r3 = null;
        } else {
            r3 = new C45692Si();
            File file = new File(str);
            r3.A03 = 0L;
            r3.A04 = 0L;
            r3.A05 = Long.valueOf(file.length());
            r3.A06 = 0L;
            r3.A00 = 1;
            r3.A07 = 0L;
            r3.A08 = 0L;
            r3.A09 = 0L;
            r3.A0A = 0L;
            r3.A0B = 0L;
            r3.A0C = Long.valueOf(System.nanoTime());
            r3.A02 = 6;
            Boolean bool = C18750th.A03;
            r3.A01 = Integer.valueOf(Mp4Ops.getMp4opsImpl());
        }
        int firstWebpThumbnailMinimumFileLength = getFirstWebpThumbnailMinimumFileLength(str);
        if (r3 != null) {
            r3.A0B = Long.valueOf((long) firstWebpThumbnailMinimumFileLength);
        }
        r4.A05(r3);
        if (firstWebpThumbnailMinimumFileLength < 0) {
            return -1;
        }
        return firstWebpThumbnailMinimumFileLength;
    }

    public boolean A03(String str, byte[] bArr, int i) {
        C45692Si r2;
        AnonymousClass1AV r3 = this.A01;
        long j = (long) i;
        if (!AnonymousClass1AV.A01(r3, 7)) {
            r2 = null;
        } else {
            r2 = new C45692Si();
            File file = new File(str);
            r2.A03 = 0L;
            r2.A04 = 0L;
            r2.A05 = Long.valueOf(file.length());
            r2.A06 = Long.valueOf(file.length() + j);
            r2.A00 = 1;
            r2.A07 = 0L;
            r2.A08 = 0L;
            r2.A09 = 0L;
            r2.A0A = 0L;
            r2.A0B = 0L;
            r2.A0C = Long.valueOf(System.nanoTime());
            r2.A02 = 7;
            Boolean bool = C18750th.A03;
            r2.A01 = Integer.valueOf(Mp4Ops.getMp4opsImpl());
        }
        int createFirstThumbnail = createFirstThumbnail(bArr, i, str);
        if (r2 != null) {
            r2.A0B = Long.valueOf((long) createFirstThumbnail);
        }
        r3.A05(r2);
        if (createFirstThumbnail != 0) {
            return false;
        }
        return true;
    }

    public byte[] A04(String str) {
        C45692Si r3;
        AnonymousClass1AV r4 = this.A01;
        if (!AnonymousClass1AV.A01(r4, 4)) {
            r3 = null;
        } else {
            r3 = new C45692Si();
            File file = new File(str);
            r3.A03 = 0L;
            r3.A04 = 0L;
            r3.A05 = Long.valueOf(file.length());
            r3.A06 = 0L;
            r3.A00 = 1;
            r3.A07 = 0L;
            r3.A08 = 0L;
            r3.A09 = 0L;
            r3.A0A = 0L;
            r3.A0B = 0L;
            r3.A0C = Long.valueOf(System.nanoTime());
            r3.A02 = 4;
            Boolean bool = C18750th.A03;
            r3.A01 = Integer.valueOf(Mp4Ops.getMp4opsImpl());
        }
        ExifMetadata fetchWebpMetadata = fetchWebpMetadata(str);
        int i = fetchWebpMetadata.returnCode;
        long j = (long) fetchWebpMetadata.length;
        if (r3 != null) {
            r3.A0B = Long.valueOf((long) i);
            r3.A06 = Long.valueOf(j);
        }
        r4.A05(r3);
        if (fetchWebpMetadata.returnCode != 0) {
            return null;
        }
        return fetchWebpMetadata.metadata;
    }

    public WebpUtils(AnonymousClass1AV r2) {
        this.A01 = r2;
    }

    public WebpInfo A01(String str) {
        C45692Si r2;
        WebpInfoResult verifyWebpFileIntegrity = verifyWebpFileIntegrity(str);
        AnonymousClass1AV r3 = this.A01;
        if (!AnonymousClass1AV.A01(r3, 0)) {
            r2 = null;
        } else {
            r2 = new C45692Si();
            File file = new File(str);
            r2.A03 = 0L;
            r2.A04 = 0L;
            r2.A05 = Long.valueOf(file.length());
            r2.A06 = 0L;
            r2.A00 = 1;
            r2.A07 = 0L;
            r2.A08 = 0L;
            r2.A09 = 0L;
            r2.A0A = 0L;
            r2.A0B = 0L;
            r2.A0C = Long.valueOf(System.nanoTime());
            r2.A02 = 0;
            Boolean bool = C18750th.A03;
            r2.A01 = Integer.valueOf(Mp4Ops.getMp4opsImpl());
            r2.A0B = Long.valueOf((long) verifyWebpFileIntegrity.returnCode);
            WebpInfo webpInfo = verifyWebpFileIntegrity.webpInfo;
            if (webpInfo != null) {
                r2.A09 = Long.valueOf((long) webpInfo.width);
                r2.A08 = Long.valueOf((long) webpInfo.height);
                r2.A07 = Long.valueOf((long) webpInfo.minFrameDurationMS);
                r2.A0A = Long.valueOf((long) webpInfo.numFrames);
            }
        }
        r3.A05(r2);
        if (verifyWebpFileIntegrity.returnCode != 0) {
            return null;
        }
        return verifyWebpFileIntegrity.webpInfo;
    }

    public boolean A02(File file, byte[] bArr) {
        int length;
        C45692Si r2;
        if (!file.exists()) {
            return false;
        }
        if (bArr == null || (length = bArr.length) == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append(".");
        sb.append(this.A00.nextLong());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        try {
            new String(bArr, C19430v1.A0B);
            int insertWebpMetadata = insertWebpMetadata(file.getAbsolutePath(), file2.getAbsolutePath(), bArr);
            file.getAbsolutePath();
            AnonymousClass1AV r4 = this.A01;
            String absolutePath = file.getAbsolutePath();
            long j = (long) length;
            if (!AnonymousClass1AV.A01(r4, 3)) {
                r2 = null;
            } else {
                r2 = new C45692Si();
                File file3 = new File(absolutePath);
                r2.A03 = 0L;
                r2.A04 = 0L;
                r2.A05 = Long.valueOf(file3.length());
                r2.A06 = Long.valueOf(file3.length() + j);
                r2.A00 = 1;
                r2.A07 = 0L;
                r2.A08 = 0L;
                r2.A09 = 0L;
                r2.A0A = 0L;
                r2.A0B = 0L;
                r2.A0C = Long.valueOf(System.nanoTime());
                r2.A02 = 3;
                Boolean bool = C18750th.A03;
                r2.A01 = Integer.valueOf(Mp4Ops.getMp4opsImpl());
                r2.A0B = Long.valueOf((long) insertWebpMetadata);
            }
            r4.A05(r2);
            if (insertWebpMetadata == 0) {
                boolean renameTo = file2.renameTo(file);
                file2.getAbsolutePath();
                file.getAbsolutePath();
                AnonymousClass6YY.A0P(file2);
                return renameTo;
            }
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WebpUtils/insertWebpMetadata/error when converting bytes to string, input file:");
            sb2.append(file);
            Log.e(sb2.toString(), e);
        } catch (Throwable th) {
            AnonymousClass6YY.A0P(file2);
            throw th;
        }
        AnonymousClass6YY.A0P(file2);
        return false;
    }
}
