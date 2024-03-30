package com.whatsapp.media.magi;

import java.io.Closeable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Magi implements Closeable {
    public static long A00;

    public static native MagiClassifyResult classify(long j, String str, String str2, String str3);

    public static native long create(int i);

    public static native void destroy(long j);

    public final class MagiCheckResult {
        public String errorMsg;
        public List extensions;
        public String mimetype;

        public MagiCheckResult(String str) {
            this.extensions = Collections.emptyList();
            this.mimetype = "application/octet-stream";
            this.errorMsg = str;
        }

        public MagiCheckResult(String str, String str2) {
            this.extensions = Collections.emptyList();
            this.mimetype = "application/octet-stream";
            this.errorMsg = null;
            if (str != null) {
                this.extensions = Arrays.asList(str.split("/"));
            }
            if (str2 != null) {
                this.mimetype = str2;
            }
        }
    }

    public final class MagiClassifyResult {
        public final MagiCheckResult checkResult;
        public final int returnValue;

        public MagiClassifyResult(int i, String str, String str2) {
            this.returnValue = i;
            this.checkResult = new MagiCheckResult(str, str2);
        }
    }

    public void close() {
        long j = A00;
        if (j != 0) {
            destroy(j);
            A00 = 0;
        }
    }
}
