package androidx.profileinstaller;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass93P;
import X.AnonymousClass93Q;
import X.AnonymousClass9BH;
import X.AnonymousClass9O0;
import X.C023109s;
import X.C129906Iy;
import X.C192799Ip;
import X.C196399Zm;
import X.C202819mi;
import X.C202929mx;
import X.C208019xV;
import X.C21739AYt;
import X.C36351kA;
import X.C36371kC;
import X.C36441kJ;
import X.C81333wq;
import X.C90464aC;
import X.C90484aE;
import X.C90514aH;
import X.C90524aI;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class ProfileInstallReceiver extends BroadcastReceiver {
    public static byte[] A01(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream A0Q = C90524aI.A0Q();
        try {
            deflaterOutputStream = new DeflaterOutputStream(A0Q, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return A0Q.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    /* JADX INFO: finally extract failed */
    public void onReceive(Context context, Intent intent) {
        Context context2;
        Bundle extras;
        File cacheDir;
        int i;
        C21739AYt aYt;
        C208019xV r4;
        Object obj;
        int i2;
        boolean z;
        C202929mx A06;
        FileOutputStream fileOutputStream;
        IllegalStateException th;
        long j;
        int i3;
        if (intent != null) {
            String action = intent.getAction();
            context2 = context;
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                C21739AYt aYt2 = C21739AYt.A00;
                C208019xV r5 = new C208019xV(this);
                Context applicationContext = context2.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
                AssetManager assets = applicationContext.getAssets();
                String name = C90524aI.A0S(applicationInfo.sourceDir).getName();
                z = false;
                try {
                    PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName, 0);
                    File filesDir = context2.getFilesDir();
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Installing profile for ");
                    Log.d("ProfileInstaller", AnonymousClass000.A0q(context2.getPackageName(), A0u));
                    C202929mx r3 = new C202929mx(assets, r5, C36441kJ.A0w(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"), name, aYt2);
                    if (r3.A07()) {
                        A06 = r3.A06();
                        AnonymousClass9O0[] r42 = A06.A02;
                        byte[] bArr = A06.A07;
                        if (!(r42 == null || bArr == null)) {
                            if (A06.A00) {
                                try {
                                    ByteArrayOutputStream A0Q = C90524aI.A0Q();
                                    try {
                                        A0Q.write(C202819mi.A00);
                                        A0Q.write(bArr);
                                        byte[] bArr2 = AnonymousClass9BH.A06;
                                        if (Arrays.equals(bArr, bArr2)) {
                                            ArrayList A14 = C36441kJ.A14(3);
                                            ArrayList A142 = C36441kJ.A14(3);
                                            ByteArrayOutputStream A0Q2 = C90524aI.A0Q();
                                            try {
                                                AnonymousClass93Q.A00(A0Q2, r6);
                                                int i4 = 2;
                                                for (AnonymousClass9O0 r10 : r42) {
                                                    AnonymousClass93Q.A01(A0Q2, 4, r10.A05);
                                                    AnonymousClass93Q.A01(A0Q2, 4, r10.A01);
                                                    AnonymousClass93Q.A01(A0Q2, 4, (long) r10.A04);
                                                    String A00 = C202819mi.A00(r10.A06, r10.A07, bArr2);
                                                    int length = A00.getBytes(StandardCharsets.UTF_8).length;
                                                    AnonymousClass93Q.A00(A0Q2, length);
                                                    i4 = i4 + 4 + 4 + 4 + 2 + length;
                                                    A0Q2.write(A00.getBytes(StandardCharsets.UTF_8));
                                                }
                                                byte[] byteArray = A0Q2.toByteArray();
                                                int length2 = byteArray.length;
                                                if (i4 == length2) {
                                                    C192799Ip r9 = new C192799Ip(C023109s.A00, byteArray, false);
                                                    A0Q2.close();
                                                    A14.add(r9);
                                                    A0Q2 = C90524aI.A0Q();
                                                    int i5 = 0;
                                                    for (int i6 = 0; i6 < r6; i6++) {
                                                        AnonymousClass9O0 r11 = r42[i6];
                                                        AnonymousClass93Q.A01(A0Q2, 2, (long) i6);
                                                        AnonymousClass93Q.A01(A0Q2, 2, (long) r11.A00);
                                                        i5 = i5 + 2 + 2 + (r11.A00 * 2);
                                                        int i7 = 0;
                                                        for (int i8 : r11.A02) {
                                                            Integer valueOf = Integer.valueOf(i8);
                                                            AnonymousClass93Q.A01(A0Q2, 2, (long) (i8 - i7));
                                                            i7 = valueOf.intValue();
                                                        }
                                                    }
                                                    byte[] byteArray2 = A0Q2.toByteArray();
                                                    int length3 = byteArray2.length;
                                                    if (i5 == length3) {
                                                        C192799Ip r0 = new C192799Ip(C023109s.A0C, byteArray2, true);
                                                        A0Q2.close();
                                                        A14.add(r0);
                                                        A0Q2 = C90524aI.A0Q();
                                                        int i9 = 0;
                                                        int i10 = 0;
                                                        while (i9 < r6) {
                                                            AnonymousClass9O0 r1 = r42[i9];
                                                            Iterator A10 = C36371kC.A10(r1.A08);
                                                            int i11 = 0;
                                                            while (A10.hasNext()) {
                                                                i11 |= C90514aH.A0H(C36351kA.A0u(A10));
                                                            }
                                                            ByteArrayOutputStream A0Q3 = C90524aI.A0Q();
                                                            try {
                                                                C202819mi.A01(r1, A0Q3);
                                                                byte[] byteArray3 = A0Q3.toByteArray();
                                                                A0Q3.close();
                                                                A0Q3 = C90524aI.A0Q();
                                                                C202819mi.A02(r1, A0Q3);
                                                                byte[] byteArray4 = A0Q3.toByteArray();
                                                                A0Q3.close();
                                                                AnonymousClass93Q.A00(A0Q2, i9);
                                                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                                                AnonymousClass93Q.A01(A0Q2, 4, (long) length4);
                                                                AnonymousClass93Q.A00(A0Q2, i11);
                                                                A0Q2.write(byteArray3);
                                                                A0Q2.write(byteArray4);
                                                                i10 = i10 + 2 + 4 + length4;
                                                                i9++;
                                                            } catch (Throwable th2) {
                                                                th.addSuppressed(th2);
                                                            }
                                                        }
                                                        byte[] byteArray5 = A0Q2.toByteArray();
                                                        int length5 = byteArray5.length;
                                                        if (i10 == length5) {
                                                            C192799Ip r02 = new C192799Ip(C023109s.A0G, byteArray5, true);
                                                            A0Q2.close();
                                                            A14.add(r02);
                                                            long j2 = (long) 4;
                                                            long size = j2 + j2 + 4 + ((long) (A14.size() * 16));
                                                            AnonymousClass93Q.A01(A0Q, 4, (long) A14.size());
                                                            for (int i12 = 0; i12 < A14.size(); i12++) {
                                                                C192799Ip r8 = (C192799Ip) A14.get(i12);
                                                                switch (r8.A00.intValue()) {
                                                                    case 0:
                                                                        j = 0;
                                                                        break;
                                                                    case 1:
                                                                        j = 1;
                                                                        break;
                                                                    case 2:
                                                                        j = 2;
                                                                        break;
                                                                    default:
                                                                        j = 3;
                                                                        break;
                                                                }
                                                                AnonymousClass93Q.A01(A0Q, 4, j);
                                                                AnonymousClass93Q.A01(A0Q, 4, size);
                                                                boolean z2 = r8.A01;
                                                                byte[] bArr3 = r8.A02;
                                                                if (z2) {
                                                                    long length6 = (long) bArr3.length;
                                                                    byte[] A01 = A01(bArr3);
                                                                    A142.add(A01);
                                                                    i3 = A01.length;
                                                                    AnonymousClass93Q.A01(A0Q, 4, (long) i3);
                                                                    AnonymousClass93Q.A01(A0Q, 4, length6);
                                                                } else {
                                                                    A142.add(bArr3);
                                                                    i3 = bArr3.length;
                                                                    AnonymousClass93Q.A01(A0Q, 4, (long) i3);
                                                                    AnonymousClass93Q.A01(A0Q, 4, 0);
                                                                }
                                                                size += (long) i3;
                                                            }
                                                            for (int i13 = 0; i13 < A142.size(); i13++) {
                                                                A0Q.write((byte[]) A142.get(i13));
                                                            }
                                                        } else {
                                                            StringBuilder A0u2 = AnonymousClass000.A0u();
                                                            A0u2.append("Expected size ");
                                                            A0u2.append(i10);
                                                            th = C90464aC.A0R(", does not match actual size ", A0u2, length5);
                                                        }
                                                    } else {
                                                        StringBuilder A0u3 = AnonymousClass000.A0u();
                                                        A0u3.append("Expected size ");
                                                        A0u3.append(i5);
                                                        th = C90464aC.A0R(", does not match actual size ", A0u3, length3);
                                                    }
                                                } else {
                                                    StringBuilder A0u4 = AnonymousClass000.A0u();
                                                    A0u4.append("Expected size ");
                                                    A0u4.append(i4);
                                                    th = C90464aC.A0R(", does not match actual size ", A0u4, length2);
                                                }
                                                throw th;
                                            } catch (Throwable th3) {
                                                A0Q2.close();
                                                throw th3;
                                            }
                                        } else {
                                            byte[] bArr4 = AnonymousClass9BH.A05;
                                            if (!Arrays.equals(bArr, bArr4)) {
                                                byte[] bArr5 = AnonymousClass9BH.A03;
                                                if (Arrays.equals(bArr, bArr5)) {
                                                    AnonymousClass93Q.A01(A0Q, 1, (long) r7);
                                                    for (AnonymousClass9O0 r2 : r42) {
                                                        int size2 = r2.A08.size() * 4;
                                                        String A002 = C202819mi.A00(r2.A06, r2.A07, bArr5);
                                                        AnonymousClass93Q.A01(A0Q, 2, (long) A002.getBytes(StandardCharsets.UTF_8).length);
                                                        AnonymousClass93Q.A01(A0Q, 2, (long) r2.A02.length);
                                                        AnonymousClass93Q.A01(A0Q, 4, (long) size2);
                                                        AnonymousClass93Q.A01(A0Q, 4, r2.A05);
                                                        A0Q.write(A002.getBytes(StandardCharsets.UTF_8));
                                                        Iterator A0s = C90484aE.A0s(r2.A08);
                                                        while (A0s.hasNext()) {
                                                            AnonymousClass93Q.A01(A0Q, 2, (long) C90514aH.A0H(A0s.next()));
                                                            AnonymousClass93Q.A01(A0Q, 2, (long) 0);
                                                        }
                                                        for (int A003 : r2.A02) {
                                                            AnonymousClass93Q.A00(A0Q, A003);
                                                        }
                                                    }
                                                } else {
                                                    bArr4 = AnonymousClass9BH.A04;
                                                    if (!Arrays.equals(bArr, bArr4)) {
                                                        byte[] bArr6 = AnonymousClass9BH.A02;
                                                        if (Arrays.equals(bArr, bArr6)) {
                                                            AnonymousClass93Q.A00(A0Q, r6);
                                                            for (AnonymousClass9O0 r82 : r42) {
                                                                String A004 = C202819mi.A00(r82.A06, r82.A07, bArr6);
                                                                AnonymousClass93Q.A01(A0Q, 2, (long) A004.getBytes(StandardCharsets.UTF_8).length);
                                                                TreeMap treeMap = r82.A08;
                                                                AnonymousClass93Q.A01(A0Q, 2, (long) treeMap.size());
                                                                AnonymousClass93Q.A01(A0Q, 2, (long) r82.A02.length);
                                                                AnonymousClass93Q.A01(A0Q, 4, r82.A05);
                                                                A0Q.write(A004.getBytes(StandardCharsets.UTF_8));
                                                                Iterator A0s2 = C90484aE.A0s(treeMap);
                                                                while (A0s2.hasNext()) {
                                                                    AnonymousClass93Q.A00(A0Q, C90514aH.A0H(A0s2.next()));
                                                                }
                                                                for (int A005 : r82.A02) {
                                                                    AnonymousClass93Q.A00(A0Q, A005);
                                                                }
                                                            }
                                                        } else {
                                                            A06.A04.BfO(5, (Object) null);
                                                            A06.A02 = null;
                                                            A0Q.close();
                                                        }
                                                    }
                                                }
                                            }
                                            int i14 = 0;
                                            int i15 = 0;
                                            for (AnonymousClass9O0 r6 : r42) {
                                                i15 += C202819mi.A00(r6.A06, r6.A07, bArr4).getBytes(StandardCharsets.UTF_8).length + 16 + (r6.A00 * 2) + r6.A03 + (((((r6.A04 * 2) + 8) - 1) & -8) / 8);
                                            }
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i15);
                                            if (!Arrays.equals(bArr4, AnonymousClass9BH.A04)) {
                                                for (AnonymousClass9O0 r22 : r42) {
                                                    C202819mi.A03(r22, byteArrayOutputStream, C202819mi.A00(r22.A06, r22.A07, bArr4));
                                                }
                                                while (i14 < r13) {
                                                    AnonymousClass9O0 r112 = r42[i14];
                                                    C202819mi.A02(r112, byteArrayOutputStream);
                                                    int i16 = 0;
                                                    for (int i17 : r112.A02) {
                                                        Integer valueOf2 = Integer.valueOf(i17);
                                                        AnonymousClass93Q.A00(byteArrayOutputStream, i17 - i16);
                                                        i16 = valueOf2.intValue();
                                                    }
                                                    C202819mi.A01(r112, byteArrayOutputStream);
                                                    i14++;
                                                }
                                            } else {
                                                while (i14 < r13) {
                                                    AnonymousClass9O0 r15 = r42[i14];
                                                    C202819mi.A03(r15, byteArrayOutputStream, C202819mi.A00(r15.A06, r15.A07, bArr4));
                                                    C202819mi.A02(r15, byteArrayOutputStream);
                                                    int i18 = 0;
                                                    for (int i19 : r15.A02) {
                                                        Integer valueOf3 = Integer.valueOf(i19);
                                                        AnonymousClass93Q.A00(byteArrayOutputStream, i19 - i18);
                                                        i18 = valueOf3.intValue();
                                                    }
                                                    C202819mi.A01(r15, byteArrayOutputStream);
                                                    i14++;
                                                }
                                            }
                                            if (byteArrayOutputStream.size() == i15) {
                                                byte[] byteArray6 = byteArrayOutputStream.toByteArray();
                                                AnonymousClass93Q.A01(A0Q, 1, (long) r13);
                                                AnonymousClass93Q.A01(A0Q, 4, (long) byteArray6.length);
                                                byte[] A012 = A01(byteArray6);
                                                AnonymousClass93Q.A01(A0Q, 4, (long) A012.length);
                                                A0Q.write(A012);
                                            } else {
                                                StringBuilder A0u5 = AnonymousClass000.A0u();
                                                A0u5.append("The bytes saved do not match expectation. actual=");
                                                A0u5.append(byteArrayOutputStream.size());
                                                throw C90464aC.A0R(" expected=", A0u5, i15);
                                            }
                                        }
                                        A06.A01 = A0Q.toByteArray();
                                        A0Q.close();
                                    } catch (Throwable th4) {
                                        A0Q.close();
                                        throw th4;
                                    }
                                } catch (IOException e) {
                                    A06.A04.BfO(7, e);
                                } catch (IllegalStateException e2) {
                                    A06.A04.BfO(8, e2);
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                A06.A02 = null;
                            } else {
                                throw AnonymousClass001.A09("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                        }
                        byte[] bArr7 = A06.A01;
                        if (bArr7 != null) {
                            if (A06.A00) {
                                try {
                                    ByteArrayInputStream A0P = C90524aI.A0P(bArr7);
                                    try {
                                        fileOutputStream = new FileOutputStream(A06.A05);
                                        byte[] bArr8 = new byte[512];
                                        while (true) {
                                            int read = A0P.read(bArr8);
                                            if (read > 0) {
                                                fileOutputStream.write(bArr8, 0, read);
                                            } else {
                                                C202929mx.A03(A06, (Object) null, 1);
                                                fileOutputStream.close();
                                                A0P.close();
                                                A06.A01 = null;
                                                A06.A02 = null;
                                                C196399Zm.A00(packageInfo, filesDir);
                                                z = true;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        A0P.close();
                                        throw th6;
                                    }
                                } catch (FileNotFoundException e3) {
                                    C202929mx.A03(A06, e3, 6);
                                } catch (IOException e4) {
                                    try {
                                        C202929mx.A03(A06, e4, 7);
                                    } catch (Throwable th7) {
                                        A06.A01 = null;
                                        A06.A02 = null;
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    th6.addSuppressed(th8);
                                }
                            } else {
                                throw AnonymousClass001.A09("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                        }
                    }
                    C129906Iy.A00(context2, z);
                    return;
                } catch (PackageManager.NameNotFoundException e5) {
                    r5.BfO(7, e5);
                    C129906Iy.A00(context2, false);
                    return;
                }
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        aYt = C21739AYt.A00;
                        r4 = new C208019xV(this);
                        try {
                            C196399Zm.A00(context2.getPackageManager().getPackageInfo(context2.getApplicationContext().getPackageName(), 0), context2.getFilesDir());
                            obj = null;
                            i2 = 10;
                        } catch (PackageManager.NameNotFoundException e6) {
                            aYt.execute(new C81333wq(r4, 7, 3, e6));
                            return;
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        aYt = C21739AYt.A00;
                        r4 = new C208019xV(this);
                        C36441kJ.A0w(context2.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        obj = null;
                        i2 = 11;
                    } else {
                        return;
                    }
                    aYt.execute(new C81333wq(r4, i2, 3, obj));
                    return;
                }
                return;
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                C208019xV r32 = new C208019xV(this);
                if (Build.VERSION.SDK_INT >= 24) {
                    Process.sendSignal(Process.myPid(), 10);
                    i = 12;
                } else {
                    i = 13;
                }
                r32.BfO(i, (Object) null);
                return;
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                C208019xV r33 = new C208019xV(this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    int i20 = Build.VERSION.SDK_INT;
                    if (i20 >= 24) {
                        cacheDir = AnonymousClass93P.A00(context2);
                    } else if (i20 >= 23) {
                        cacheDir = context2.getCodeCacheDir();
                    } else {
                        cacheDir = context2.getCacheDir();
                    }
                    boolean A006 = A00(cacheDir);
                    int i21 = 15;
                    if (A006) {
                        i21 = 14;
                    }
                    r33.BfO(i21, (Object) null);
                    return;
                }
                r33.BfO(16, (Object) null);
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        A06.A01 = null;
        A06.A02 = null;
        C129906Iy.A00(context2, z);
        return;
        throw th;
    }

    public static boolean A00(File file) {
        boolean z = true;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            z = false;
            if (listFiles != null) {
                boolean z2 = true;
                for (File A00 : listFiles) {
                    if (A00(A00)) {
                        boolean z3 = z2;
                        z2 = true;
                        if (z3) {
                        }
                    }
                    z2 = false;
                }
                return z2;
            }
        } else {
            file.delete();
        }
        return z;
    }
}
