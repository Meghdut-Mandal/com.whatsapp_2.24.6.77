package com.facebook.soloader;

import X.C023109s;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class SysUtil$MarshmallowSysdeps {
    public static boolean A02(Context context, int i) {
        if (i == 2) {
            return A01(context);
        }
        return A00(context);
    }

    public static boolean A00(Context context) {
        if (context == null || (context.getApplicationInfo().flags & 268435456) != 0) {
            return false;
        }
        return true;
    }

    public static String[] getSupportedAbis() {
        String str;
        String[] strArr = Build.SUPPORTED_ABIS;
        TreeSet treeSet = new TreeSet();
        if (is64Bit()) {
            Integer num = C023109s.A0R;
            treeSet.add("arm64-v8a");
            Integer num2 = C023109s.A0G;
            str = "x86_64";
        } else {
            Integer num3 = C023109s.A0C;
            treeSet.add("armeabi-v7a");
            Integer num4 = C023109s.A01;
            str = "x86";
        }
        treeSet.add(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (treeSet.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean A01(Context context) {
        boolean z;
        ZipFile zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir));
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (true) {
                z = false;
                if (!entries.hasMoreElements()) {
                    break;
                }
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                if (zipEntry != null && zipEntry.getName().endsWith(".so") && zipEntry.getName().contains("/lib")) {
                    if (zipEntry.getMethod() == 0) {
                        z = true;
                    }
                }
            }
            zipFile.close();
            return z;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static boolean is64Bit() {
        return Process.is64Bit();
    }
}
