package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Objects;

/* renamed from: X.11c  reason: invalid class name */
public class AnonymousClass11c {
    public final C19630wG A00;
    public final C21370z6 A01;

    public static String A00(String str) {
        int indexOf;
        int indexOf2 = str.indexOf("_") + 1;
        if (indexOf2 < 1 || ((indexOf = str.indexOf("_", indexOf2)) < 0 && (indexOf = str.indexOf(".", indexOf2)) < 0)) {
            return null;
        }
        return str.substring(indexOf2, indexOf);
    }

    public static File[] A01(C19630wG r2) {
        File[] fileArr;
        File file = new File(r2.A00.getCacheDir(), "traces");
        if (!file.exists() || (fileArr = file.listFiles(AnonymousClass722.A00)) == null) {
            fileArr = new File[0];
        }
        if (fileArr.length <= 0) {
            return new File[0];
        }
        return fileArr;
    }

    public File A02(String str, String str2) {
        File file = new File(this.A00.A00.getCacheDir(), "traces");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str2);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file2));
        try {
            printWriter.write(str);
            printWriter.flush();
            printWriter.close();
            StringBuilder sb = new StringBuilder();
            sb.append("anr-helper/stored anr report: ");
            sb.append(file2.getName());
            Log.i(sb.toString());
            return file2;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public File A03(String str, String str2, String str3) {
        String A012;
        String str4 = C21870zw.A00;
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
        } else {
            Objects.requireNonNull("2.24.6.77");
            sb.append("2.24.6.77");
            sb.append("_");
            sb.append(str4);
        }
        Context context = this.A00.A00;
        if (C18760tj.A02(context) && (A012 = C18760tj.A01(context)) != null) {
            sb.append("_");
            sb.append(A012);
        }
        sb.append(".stacktrace");
        File A02 = A02(str, sb.toString());
        if (str3 != null) {
            SharedPreferences.Editor edit = ((SharedPreferences) this.A01.A01.getValue()).edit();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("running_tasks_");
            sb2.append(str4);
            edit.putString(sb2.toString(), str3).apply();
        }
        return A02;
    }

    public void A04(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append("anr-helper/discarding anr report: ");
        sb.append(file.getName());
        Log.i(sb.toString());
        file.delete();
        String A002 = A00(file.getName());
        if (A002 != null) {
            this.A01.A00(A002);
        }
    }

    public AnonymousClass11c(C19630wG r1, C21370z6 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
