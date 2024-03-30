package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6O6  reason: invalid class name */
public class AnonymousClass6O6 {
    public static AnonymousClass6O6 A03;
    public String A00;
    public final Context A01;
    public final File A02;

    public Set A02(int i) {
        String str;
        int length;
        Object value;
        Map map;
        File A012 = A01(C109555Ya.A00(i));
        if (!A012.isDirectory()) {
            map = Collections.emptyMap();
        } else {
            if (i == 103 || i == 104) {
                str = "__version__";
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                map = Collections.singletonMap(A012, (Object) null);
            } else {
                String[] split = str.split("/");
                HashMap A0J = AnonymousClass001.A0J();
                HashMap A0J2 = AnonymousClass001.A0J();
                A0J.put(A012, (Object) null);
                for (String equals : split) {
                    boolean equals2 = equals.equals((Object) null);
                    Iterator A10 = C36371kC.A10(A0J);
                    while (A10.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A10);
                        File[] listFiles = ((File) A11.getKey()).listFiles();
                        if (listFiles != null && (length = listFiles.length) != 0) {
                            int i2 = 0;
                            do {
                                File file = listFiles[i2];
                                if (file.isDirectory()) {
                                    if (equals2) {
                                        value = file.getName();
                                    } else {
                                        value = A11.getValue();
                                    }
                                    A0J2.put(file, value);
                                }
                                i2++;
                            } while (i2 < length);
                        }
                    }
                    A0J.clear();
                    A0J.putAll(A0J2);
                    A0J2.clear();
                }
                map = A0J;
            }
        }
        return map.keySet();
    }

    public AnonymousClass6O6(Context context) {
        this.A01 = context.getApplicationContext();
        this.A02 = A00(context);
    }

    public static File A00(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && !TextUtils.isEmpty(applicationInfo.dataDir)) {
            return C90524aI.A0S(applicationInfo.dataDir);
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getParentFile();
        }
        throw AnonymousClass001.A09("Path Factory initialised without a valid path");
    }

    public File A01(Pair pair) {
        File file;
        switch (C36381kD.A04(pair)) {
            case -1:
                throw AnonymousClass001.A09("Invalid source path");
            case 0:
            case 1:
                file = this.A02;
                break;
            case 2:
                file = this.A01.getFilesDir();
                break;
            case 3:
                file = this.A01.getCacheDir();
                break;
            case 4:
                file = this.A01.getExternalFilesDir((String) null);
                break;
            case 5:
                file = this.A01.getExternalCacheDir();
                break;
            default:
                throw AnonymousClass001.A08("Cask path factory cannot handle this location");
        }
        if (file == null) {
            String str = this.A00;
            if (str == null) {
                str = C36361kB.A0l();
            }
            this.A00 = str;
            file = C36441kJ.A0w(this.A02, AnonymousClass000.A0p("cache/tmp_invalid_path/", str, AnonymousClass000.A0u()));
        }
        int A04 = C36381kD.A04(pair);
        if (A04 != 0) {
            if (A04 == 1) {
                File file2 = this.A02;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("app_");
                return C90464aC.A0K(file2, (String) pair.second, A0u);
            } else if (!(A04 == 2 || A04 == 3 || A04 == 4 || A04 == 5)) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Cask path factory cannot handle this location = ");
                throw AnonymousClass000.A0c((String) pair.second, A0u2);
            }
        }
        return C36441kJ.A0w(file, (String) pair.second);
    }
}
