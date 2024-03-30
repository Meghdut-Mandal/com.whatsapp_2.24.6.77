package com.facebook.jni;

import X.AnonymousClass9LH;
import X.AnonymousClass9WV;
import java.util.LinkedList;

public final class NativeSoftErrorReporterProxy {
    public static final LinkedList sSoftErrorCache = new LinkedList();

    public static native void generateNativeSoftError();

    public static void softReport(int i, String str, String str2, Throwable th, int i2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("[Native] ");
        if (i == 1) {
            str3 = "<level:warning> ";
        } else if (i != 2) {
            str3 = "<level:unknown> ";
        } else {
            str3 = "<level:mustfix> ";
        }
        sb.append(str3);
        sb.append(str);
        String obj = sb.toString();
        Class<NativeSoftErrorReporterProxy> cls = NativeSoftErrorReporterProxy.class;
        synchronized (cls) {
            LinkedList linkedList = sSoftErrorCache;
            synchronized (linkedList) {
                AnonymousClass9LH r1 = new AnonymousClass9LH();
                r1.A01 = obj;
                r1.A02 = str2;
                r1.A03 = th;
                r1.A00 = i2;
                linkedList.addLast(new AnonymousClass9WV(r1));
                while (linkedList.size() >= 50) {
                    linkedList.removeFirst();
                }
            }
        }
        synchronized (cls) {
        }
    }

    public static void softReport(int i, String str, String str2, int i2) {
        softReport(i, str, str2, (Throwable) null, i2);
    }
}
