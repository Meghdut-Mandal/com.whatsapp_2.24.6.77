package com.whatsapp.superpack;

import X.C120235rB;
import java.io.InputStream;

public class WhatsAppObiInputStream extends InputStream {
    public byte[] backingArray;
    public final byte[] oneByte = new byte[1];
    public long ptr;

    public static native void closeNative(long j, byte[] bArr);

    public static native long openBytesNative(byte[] bArr, int i, int i2);

    public static native long openInputStreamNative(InputStream inputStream, int i);

    public static native long openRawBytesNative(long j, int i);

    public static native int readNative(long j, byte[] bArr, int i, int i2);

    public synchronized void close() {
        closeNative(this.ptr, this.backingArray);
        this.backingArray = null;
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            if (i2 + i <= bArr.length) {
                if (readNative(this.ptr, bArr, i, i2) <= 0) {
                    return -1;
                }
                return i2;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public static WhatsAppObiInputStream openBytes(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 <= 0 || i + i2 > bArr.length) {
            throw new IllegalArgumentException("Invalid byte array offset/length");
        }
        long openBytesNative = openBytesNative(bArr, i, i2);
        if (openBytesNative != 0) {
            return new WhatsAppObiInputStream(openBytesNative, bArr);
        }
        throw new IllegalStateException("Failed to open OBI input stream");
    }

    public static WhatsAppObiInputStream openOpenboxArchiveFile(C120235rB r5) {
        long openRawBytesNative = openRawBytesNative(r5.A00, (int) r5.A01);
        if (openRawBytesNative != 0) {
            return new WhatsAppObiInputStream(openRawBytesNative, (byte[]) null);
        }
        throw new IllegalStateException("Failed to open OBI input stream");
    }

    public WhatsAppObiInputStream(long j, byte[] bArr) {
        if (j != 0) {
            this.ptr = j;
            this.backingArray = bArr;
            return;
        }
        throw null;
    }

    public static WhatsAppObiInputStream openStream(InputStream inputStream, int i) {
        long openInputStreamNative = openInputStreamNative(inputStream, i);
        if (openInputStreamNative != 0) {
            return new WhatsAppObiInputStream(openInputStreamNative, (byte[]) null);
        }
        throw new IllegalStateException("Failed to open OBI input stream");
    }

    public static WhatsAppObiInputStream openBytes(byte[] bArr) {
        return openBytes(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r2 = this;
            monitor-enter(r2)
            byte[] r0 = r2.oneByte     // Catch:{ all -> 0x0021 }
            int r1 = r2.read(r0)     // Catch:{ all -> 0x0021 }
            r0 = -1
            if (r1 == r0) goto L_0x001f
            r0 = 1
            if (r1 != r0) goto L_0x0015
            byte[] r1 = r2.oneByte     // Catch:{ all -> 0x0021 }
            r0 = 0
            byte r0 = r1[r0]     // Catch:{ all -> 0x0021 }
            if (r0 >= 0) goto L_0x001f
            goto L_0x001d
        L_0x0015:
            java.lang.String r1 = "Unexpected number of bytes read"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0021 }
            r0.<init>(r1)     // Catch:{ all -> 0x0021 }
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x001d:
            int r0 = r0 + 256
        L_0x001f:
            monitor-exit(r2)
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.superpack.WhatsAppObiInputStream.read():int");
    }
}
