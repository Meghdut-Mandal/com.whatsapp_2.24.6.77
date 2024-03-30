package com.facebook.msys.mci;

import X.AnonymousClass00h;
import X.AnonymousClass4YY;
import X.C000600g;
import android.content.ContentResolver;
import android.os.Build;
import android.util.Log;
import com.facebook.msys.mcf.MsysError;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.ZipException;

public class FileManager {
    public static final String TAG = "FileManager";
    public static File mCacheDir = null;
    public static ContentResolver mContentResolver = null;
    public static final String sFileManagerErrorDomain = "com.facebook.msys.filesystem";
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static void copyFile(String str, String str2) {
        Method method = C000600g.A03;
        AnonymousClass00h.A01("FileManager.copyFile");
        try {
            File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str2);
            if (!fileFromPathWithOptionalScheme.exists()) {
                tryToCreateDirectoryOfFile(str2);
                if (!str.startsWith("content://")) {
                    copyFileUsingFilePath(str, fileFromPathWithOptionalScheme);
                    return;
                }
                throw createFileManagerError(1, (Throwable) null);
            }
            throw createFileManagerError(2, (Throwable) null);
        } finally {
            AnonymousClass00h.A00();
        }
    }

    public static void copyInputStreamIntoOutputStream(InputStream inputStream, OutputStream outputStream) {
        Method method = C000600g.A03;
        AnonymousClass00h.A01("FileManager.copyInputStreamIntoOutputStream");
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                AnonymousClass00h.A00();
                return;
            }
        }
    }

    public static String createCacheDirectory(String str) {
        File file = new File(mCacheDir, str);
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            return file.toString();
        }
        throw createFileManagerError(7, (Throwable) null);
    }

    public static MsysError createFileManagerError(int i, Throwable th) {
        Map map;
        if (th != null) {
            map = Collections.singletonMap(MsysError.getLocalizedFailureReasonKey(), th.toString());
        } else {
            map = null;
        }
        return new MsysError(sFileManagerErrorDomain, i, map);
    }

    public static String getCacheDirectory() {
        return mCacheDir.toString();
    }

    public static synchronized File getFileFromPathWithOptionalScheme(String str) {
        File file;
        synchronized (FileManager.class) {
            if (str.startsWith("file://")) {
                file = new File(URI.create(str));
            } else if (str.startsWith("cache://")) {
                file = new File(mCacheDir, str.substring(8));
            } else {
                file = new File(str);
            }
        }
        return file;
    }

    public static synchronized boolean initialize(File file) {
        boolean initialize;
        synchronized (FileManager.class) {
            initialize = initialize(file, (ContentResolver) null);
        }
        return initialize;
    }

    public static void moveFile(String str, String str2) {
        Method method = C000600g.A03;
        AnonymousClass00h.A01("FileManager.moveFile");
        try {
            File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
            File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
            if (!fileFromPathWithOptionalScheme.equals(fileFromPathWithOptionalScheme2) && !fileFromPathWithOptionalScheme.renameTo(fileFromPathWithOptionalScheme2)) {
                copyFile(str, str2);
                if (!fileFromPathWithOptionalScheme.delete()) {
                    throw createFileManagerError(8, (Throwable) null);
                }
            }
        } finally {
            AnonymousClass00h.A00();
        }
    }

    public static File[] sortFilesByNewestFirst(File[] fileArr) {
        int length;
        if (fileArr != null && (length = fileArr.length) > 1) {
            HashMap hashMap = new HashMap(length + 1, 1.0f);
            int i = 0;
            do {
                File file = fileArr[i];
                hashMap.put(file, Long.valueOf(file.lastModified()));
                i++;
            } while (i < length);
            Arrays.sort(fileArr, new AnonymousClass4YY(hashMap, 0));
        }
        return fileArr;
    }

    public static void copyFileUsingFilePath(String str, File file) {
        int i;
        FileOutputStream fileOutputStream;
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        try {
            FileInputStream fileInputStream = new FileInputStream(fileFromPathWithOptionalScheme);
            try {
                fileOutputStream = new FileOutputStream(file);
                if (Build.VERSION.SDK_INT >= 26) {
                    Files.copy(fileInputStream, file.toPath(), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
                } else {
                    copyInputStreamIntoOutputStream(fileInputStream, fileOutputStream);
                }
                fileOutputStream.close();
                fileInputStream.close();
                return;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            throw th;
        } catch (FileNotFoundException e) {
            String generateFileNotFoundError = generateFileNotFoundError(file);
            String generateFileNotFoundError2 = generateFileNotFoundError(fileFromPathWithOptionalScheme);
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append(" --Destination file is ");
            sb.append(generateFileNotFoundError);
            sb.append(" --Source file is ");
            sb.append(generateFileNotFoundError2);
            sb.append(" --Stack trace ");
            sb.append(Log.getStackTraceString(e));
            throw createFileManagerError(3, new FileNotFoundException(sb.toString()));
        } catch (CharConversionException e2) {
            e = e2;
            i = 10;
            throw createFileManagerError(i, e);
        } catch (EOFException e3) {
            e = e3;
            i = 11;
            throw createFileManagerError(i, e);
        } catch (InterruptedIOException e4) {
            e = e4;
            i = 12;
            throw createFileManagerError(i, e);
        } catch (ObjectStreamException e5) {
            e = e5;
            i = 13;
            throw createFileManagerError(i, e);
        } catch (SyncFailedException e6) {
            e = e6;
            i = 14;
            throw createFileManagerError(i, e);
        } catch (UTFDataFormatException e7) {
            e = e7;
            i = 15;
            throw createFileManagerError(i, e);
        } catch (UnsupportedEncodingException e8) {
            e = e8;
            i = 16;
            throw createFileManagerError(i, e);
        } catch (ZipException e9) {
            e = e9;
            i = 17;
            throw createFileManagerError(i, e);
        } catch (IOException e10) {
            throw createFileManagerMaybeDiskSpaceError(e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static void createDirectory(String str) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        if ((!fileFromPathWithOptionalScheme.exists() || !fileFromPathWithOptionalScheme.isDirectory()) && !fileFromPathWithOptionalScheme.mkdirs()) {
            throw createFileManagerError(7, (Throwable) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1.contains("space") == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.msys.mcf.MsysError createFileManagerMaybeDiskSpaceError(java.io.IOException r2) {
        /*
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = "space"
            boolean r1 = r1.contains(r0)
            r0 = 4
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            com.facebook.msys.mcf.MsysError r0 = createFileManagerError(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.createFileManagerMaybeDiskSpaceError(java.io.IOException):com.facebook.msys.mcf.MsysError");
    }

    public static void deleteItem(String str) {
        if (!deleteItemRecursive(getFileFromPathWithOptionalScheme(str))) {
            throw createFileManagerError(8, (Throwable) null);
        }
    }

    public static boolean deleteItemRecursive(File file) {
        boolean delete;
        if (!file.isDirectory()) {
            return file.delete();
        }
        boolean z = true;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                if (z) {
                    delete = deleteItemRecursive(file2);
                }
                z = false;
            } else {
                if (z) {
                    delete = file2.delete();
                }
                z = false;
            }
            z = true;
            if (delete) {
            }
            z = false;
        }
        if (!file.delete() || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r8.canWrite() != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r8 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r8.isDirectory() != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r3 = java.util.Locale.ROOT;
        r2 = new java.lang.Object[12];
        r2[0] = r17;
        r2[1] = java.lang.Boolean.valueOf(r15);
        r2[2] = java.lang.Boolean.valueOf(r16);
        r2[3] = java.lang.Boolean.valueOf(r14);
        r2[4] = java.lang.Long.valueOf(r12);
        r2[5] = java.lang.Long.valueOf(r10);
        r2[6] = java.lang.Boolean.valueOf(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (r8 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        r0 = r8.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        r2[7] = r0;
        r2[8] = java.lang.Boolean.valueOf(r7);
        r2[9] = java.lang.Boolean.valueOf(r6);
        r2[10] = java.lang.Boolean.valueOf(r5);
        r2[11] = java.lang.Boolean.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00aa, code lost:
        return java.lang.String.format(r3, "File Error: Path = %s, Exists = %b, Can Read = %b, Can Write = %b, Size = %d, Last Modified = %d, Is Directory = %b, Parent Path = %s, Parent Exists = %b, Parent Can Read = %b, Parent Can Write = %b, Parent Is Directory = %b", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ab, code lost:
        r0 = "<null>";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r8.exists() == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r8 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r8.canRead() != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r8 == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String generateFileNotFoundError(java.io.File r18) {
        /*
            java.lang.String r17 = r18.getAbsolutePath()
            boolean r16 = r18.canRead()
            boolean r15 = r18.exists()
            boolean r14 = r18.canWrite()
            long r12 = r18.length()
            long r10 = r18.lastModified()
            boolean r9 = r18.isDirectory()
            java.io.File r8 = r18.getParentFile()
            r1 = 0
            if (r8 == 0) goto L_0x002a
            boolean r0 = r8.exists()
            r7 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002a:
            r7 = 0
            if (r8 == 0) goto L_0x0034
        L_0x002d:
            boolean r0 = r8.canRead()
            r6 = 1
            if (r0 != 0) goto L_0x0037
        L_0x0034:
            r6 = 0
            if (r8 == 0) goto L_0x003e
        L_0x0037:
            boolean r0 = r8.canWrite()
            r5 = 1
            if (r0 != 0) goto L_0x0041
        L_0x003e:
            r5 = 0
            if (r8 == 0) goto L_0x0048
        L_0x0041:
            boolean r0 = r8.isDirectory()
            r4 = 1
            if (r0 != 0) goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            java.util.Locale r3 = java.util.Locale.ROOT
            r0 = 12
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r1] = r17
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            r0 = 1
            r2[r0] = r1
            r1 = 2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            r2[r1] = r0
            r1 = 3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r2[r1] = r0
            r1 = 4
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r2[r1] = r0
            r1 = 5
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r2[r1] = r0
            r1 = 6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r2[r1] = r0
            r1 = 7
            if (r8 == 0) goto L_0x00ab
            java.lang.String r0 = r8.getAbsolutePath()
        L_0x0082:
            r2[r1] = r0
            r1 = 8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r2[r1] = r0
            r1 = 9
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2[r1] = r0
            r1 = 10
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2[r1] = r0
            r1 = 11
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2[r1] = r0
            java.lang.String r0 = "File Error: Path = %s, Exists = %b, Can Read = %b, Can Write = %b, Size = %d, Last Modified = %d, Is Directory = %b, Parent Path = %s, Parent Exists = %b, Parent Can Read = %b, Parent Can Write = %b, Parent Is Directory = %b"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            return r0
        L_0x00ab:
            java.lang.String r0 = "<null>"
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.generateFileNotFoundError(java.io.File):java.lang.String");
    }

    public static boolean itemExists(String str) {
        return getFileFromPathWithOptionalScheme(str).exists();
    }

    public static /* synthetic */ int lambda$sortFilesByNewestFirst$0(Map map, File file, File file2) {
        Object obj = map.get(file2);
        Objects.requireNonNull(obj);
        long longValue = ((Number) obj).longValue();
        Object obj2 = map.get(file);
        Objects.requireNonNull(obj2);
        return Long.compare(longValue, ((Number) obj2).longValue());
    }

    public static String[] listDirectory(File file) {
        File[] listFiles = file.listFiles();
        sortFilesByNewestFirst(listFiles);
        if (listFiles != null) {
            int length = listFiles.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = listFiles[i].getAbsolutePath();
            }
            return strArr;
        }
        throw createFileManagerError(6, (Throwable) null);
    }

    public static byte[] readFile(String str) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(getFileFromPathWithOptionalScheme(str), "r");
            long length = randomAccessFile.length();
            if (length <= 2147483647L) {
                byte[] bArr = new byte[((int) length)];
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                return bArr;
            }
            Log.e("FileUtils", "Cannot read more than 2GB into an array");
            throw new IOException("Cannot read more than 2GB into an array");
        } catch (IOException e) {
            throw createFileManagerError(6, e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void tryToCreateDirectoryOfFile(String str) {
        File parentFile = getFileFromPathWithOptionalScheme(str).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
    }

    public static void writeDataToFile(byte[] bArr, String str, boolean z) {
        FileOutputStream fileOutputStream;
        tryToCreateDirectoryOfFile(str);
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                fileOutputStream = new FileOutputStream(fileFromPathWithOptionalScheme, z);
                copyInputStreamIntoOutputStream(byteArrayInputStream, fileOutputStream);
                fileOutputStream.close();
                byteArrayInputStream.close();
                return;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
            throw th;
        } catch (FileNotFoundException e) {
            throw createFileManagerError(3, e);
        } catch (IOException e2) {
            throw createFileManagerMaybeDiskSpaceError(e2);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static synchronized boolean initialize(File file, ContentResolver contentResolver) {
        boolean z;
        synchronized (FileManager.class) {
            Method method = C000600g.A03;
            AnonymousClass00h.A01("FileManager.initialize");
            try {
                if (sInitialized) {
                    z = false;
                } else {
                    mCacheDir = file;
                    mContentResolver = contentResolver;
                    nativeInitialize();
                    z = true;
                    sInitialized = true;
                }
            } finally {
                AnonymousClass00h.A00();
            }
        }
        return z;
    }

    public static String[] listDirectory(String str) {
        return listDirectory(getFileFromPathWithOptionalScheme(str));
    }
}
