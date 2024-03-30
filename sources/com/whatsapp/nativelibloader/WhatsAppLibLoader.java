package com.whatsapp.nativelibloader;

import X.AnonymousClass101;
import X.AnonymousClass107;
import X.C131896Re;
import X.C19420v0;
import X.C19700wN;
import X.C20060wx;
import X.C20580xn;
import android.content.Context;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class WhatsAppLibLoader {
    public static Map A07;
    public static final String[] A08 = {"vlc", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, "curve25519"};
    public Boolean A00 = null;
    public final C19700wN A01;
    public final AnonymousClass107 A02;
    public final C19420v0 A03;
    public final C20060wx A04;
    public final C20580xn A05;
    public final AnonymousClass101 A06;

    public static boolean A03() {
        String str;
        byte[] bArr = new byte[3];
        try {
            testLibraryUsable(bArr);
            if (!Arrays.equals(new byte[]{31, 41, 59}, bArr)) {
                Log.w("whatsapplibloader/usable test array does not match");
                return false;
            }
            try {
                String jNICodeVersion = getJNICodeVersion();
                StringBuilder sb = new StringBuilder();
                sb.append("whatsapplibloader/usable jniVersion: ");
                sb.append(jNICodeVersion);
                Log.i(sb.toString());
                Objects.requireNonNull("2.24.6.77");
                if (!"2.24.6.77".equals(jNICodeVersion)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("whatsapplibloader/usable version does not match. JAVA version: ");
                    Objects.requireNonNull("2.24.6.77");
                    sb2.append("2.24.6.77");
                    sb2.append(", JNI version: ");
                    sb2.append(jNICodeVersion);
                    Log.w(sb2.toString());
                    return false;
                }
                Log.i("whatsapplibloader/usable isLibraryUsable: True");
                return true;
            } catch (UnsatisfiedLinkError e) {
                e = e;
                str = "whatsapplibloader/usable error while testing library usability getJNICodeVersion";
                Log.w(str, e);
                return false;
            }
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            str = "whatsapplibloader/usable error while testing library usability testLibraryUsable";
            Log.w(str, e);
            return false;
        }
    }

    public static native String getJNICodeVersion();

    public static native void testLibraryUsable(byte[] bArr);

    public synchronized boolean A04() {
        boolean z;
        if (this.A00 == null) {
            Log.e("whatsapplibloader/is-loaded: isLoaded() was called before load was attempted");
        }
        z = false;
        if (this.A00 == Boolean.TRUE) {
            z = true;
        }
        return z;
    }

    public static void A01(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("whatsapplibloader/system-load-library-with-install start, loading: ");
        sb.append(str);
        Log.i(sb.toString());
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e) {
            Log.w("whatsapplibloader/system-load-library-with-install error", e);
            A02(context, Arrays.asList(new String[]{str}));
        }
        Log.i("whatsapplibloader/system-load-library-with-install end");
    }

    public static synchronized void A02(Context context, List list) {
        UnsatisfiedLinkError unsatisfiedLinkError;
        FileOutputStream fileOutputStream;
        synchronized (WhatsAppLibLoader.class) {
            StringBuilder sb = new StringBuilder();
            sb.append("whatsapplibloader/try-install start, loading: ");
            sb.append(list.size());
            Log.i(sb.toString());
            String A022 = C131896Re.A02();
            String str = "x86";
            if (A022.startsWith("armeabi-v7")) {
                str = "armeabi-v7a";
            } else if (A022.startsWith("arm64-v8a")) {
                str = "arm64-v8a";
            } else if (A022.startsWith("x86_64")) {
                str = "x86_64";
            } else if (!A022.startsWith(str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("can not find lib folder for ABI ");
                sb2.append(A022);
                unsatisfiedLinkError = new UnsatisfiedLinkError(sb2.toString());
                throw unsatisfiedLinkError;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("whatsapplibloader/arch resolved to ");
            sb3.append(str);
            Log.i(sb3.toString());
            try {
                ZipFile zipFile = new ZipFile(context.getPackageCodePath());
                try {
                    if (A07 == null) {
                        HashMap hashMap = new HashMap(8);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("lib/");
                        sb4.append(str);
                        sb4.append("/lib");
                        String obj = sb4.toString();
                        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                            String name = zipEntry.getName();
                            if (name.endsWith(".so")) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("whatsapplibloader/extractLibs found ");
                                sb5.append(name);
                                Log.i(sb5.toString());
                                if (name.startsWith(obj)) {
                                    String[] split = name.split("/");
                                    String str2 = split[split.length - 1];
                                    File file = new File(context.getFilesDir(), str2);
                                    if ("libunwindstack.so".equals(str2)) {
                                        file.delete();
                                    } else {
                                        InputStream inputStream = zipFile.getInputStream(zipEntry);
                                        try {
                                            fileOutputStream = new FileOutputStream(file);
                                            while (true) {
                                                int read = inputStream.read(bArr);
                                                if (read <= 0) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, read);
                                            }
                                            fileOutputStream.close();
                                            inputStream.close();
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append("whatsapplibloader/extractLibs copied ");
                                            sb6.append(file.getAbsolutePath());
                                            sb6.append(" from apk");
                                            Log.i(sb6.toString());
                                            hashMap.put(str2.substring(3, str2.length() - 3), file);
                                        } catch (Throwable th) {
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                        A07 = hashMap;
                    } else {
                        Log.i("whatsapplibloader/try-install No need to extract libs again");
                    }
                    Map map = A07;
                    ArrayList arrayList = new ArrayList(list);
                    for (String remove : map.keySet()) {
                        arrayList.remove(remove);
                    }
                    if (arrayList.isEmpty()) {
                        Map map2 = A07;
                        LinkedList linkedList = new LinkedList();
                        for (Object obj2 : list) {
                            linkedList.add(map2.get(obj2));
                        }
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            String absolutePath = ((File) it.next()).getAbsolutePath();
                            System.load(absolutePath);
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("whatsapplibloader/try-install loaded: ");
                            sb7.append(absolutePath);
                            Log.i(sb7.toString());
                        }
                        zipFile.close();
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Libraries not found: ");
                        sb8.append(arrayList.toString());
                        throw new UnsatisfiedLinkError(sb8.toString());
                    }
                } catch (Throwable th2) {
                    zipFile.close();
                    throw th2;
                }
            } catch (IOException e) {
                Log.e("whatsapplibloader/try-install ioerror", e);
                unsatisfiedLinkError = new UnsatisfiedLinkError("IOException when install native library");
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        }
        return;
        throw th;
    }

    public WhatsAppLibLoader(C19700wN r2, AnonymousClass107 r3, C19420v0 r4, C20060wx r5, C20580xn r6, AnonymousClass101 r7) {
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
        this.A02 = r3;
    }

    public static void A00(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        StringBuilder sb = new StringBuilder();
        sb.append("whatsapplibloader/load-startup-libs: install source ");
        sb.append(installerPackageName);
        Log.i(sb.toString());
    }
}
