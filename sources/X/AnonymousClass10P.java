package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.10P  reason: invalid class name */
public class AnonymousClass10P implements C19710wO {
    public final C19630wG A00;
    public final C19700wN A01;
    public final C19970wo A02;
    public final C19420v0 A03;

    public String BIB() {
        return "SafeModuleLoader";
    }

    public /* synthetic */ void BRM() {
    }

    public static File A00(C19630wG r2, String str) {
        File cacheDir = r2.A00.getCacheDir();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".health");
        return new File(cacheDir, sb.toString());
    }

    public ArrayList A01() {
        ArrayList arrayList = new ArrayList();
        if (!A04("breakpad")) {
            arrayList.add("breakpad");
        }
        if (!A04("anr_detector")) {
            arrayList.add("anr_detector");
        }
        if (!A04("abort_hook")) {
            arrayList.add("abort_hook");
        }
        return arrayList;
    }

    public void A03(String str) {
        boolean delete = A00(this.A00, str).delete();
        StringBuilder sb = new StringBuilder();
        sb.append("Module ");
        sb.append(str);
        sb.append(" health file deleted: ");
        sb.append(delete);
        Log.i(sb.toString());
    }

    public boolean A04(String str) {
        return !A00(this.A00, str).exists();
    }

    public void BRL() {
        C19420v0 r8 = this.A03;
        if (((SharedPreferences) r8.A00.get()).getBoolean("report_unhealthy_module", true)) {
            ArrayList A012 = A01();
            Iterator it = A012.iterator();
            while (it.hasNext()) {
                C19700wN r2 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("app-init-module-unhealthy-");
                sb.append((String) it.next());
                r2.A0E(sb.toString(), C131896Re.A02(), false);
            }
            if (!A012.isEmpty()) {
                C19420v0.A00(r8).putBoolean("report_unhealthy_module", false).apply();
            }
        }
    }

    public AnonymousClass10P(C19700wN r1, C19970wo r2, C19630wG r3, C19420v0 r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
        this.A03 = r4;
    }

    public void A02(Runnable runnable, String str) {
        StringBuilder sb;
        if (!A04(str)) {
            sb.append("Skipping module ");
            sb.append(str);
            sb.append(" since its unhealthy");
            Log.w(sb.toString());
            return;
        }
        sb = new StringBuilder();
        sb.append("Loading module: ");
        sb.append(str);
        Log.i(sb.toString());
        try {
            A00(this.A00, str).createNewFile();
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error creating health file for ");
            sb2.append(str);
            Log.e(sb2.toString(), e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        runnable.run();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        A03(str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Module loaded: ");
        sb3.append(str);
        sb3.append(" load time: ");
        sb3.append(elapsedRealtime2 - elapsedRealtime);
        Log.i(sb3.toString());
        return;
    }
}
