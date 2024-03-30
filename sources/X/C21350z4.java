package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: X.0z4  reason: invalid class name and case insensitive filesystem */
public class C21350z4 implements C19710wO {
    public final C21390zA A00;
    public final C19700wN A01;
    public final C21100yf A02;
    public final C19630wG A03;
    public final C21370z6 A04;
    public final C20810yC A05;
    public final C19890wg A06;
    public final C21380z9 A07;
    public final C21360z5 A08;
    public final C21060yb A09;
    public final C19420v0 A0A;
    public final C19770wU A0B;
    public volatile C21400zB A0C;

    public String BIB() {
        return "CrashStateManager";
    }

    public /* synthetic */ void BRM() {
    }

    public File A00() {
        File file = new File(this.A03.A00.getFilesDir(), "crash_in_video_sentinel");
        if (!file.createNewFile()) {
            StringBuilder sb = new StringBuilder();
            sb.append("mediatranscodequeue/failed-to-create/");
            sb.append(file.getAbsolutePath());
            Log.w(sb.toString());
        }
        return file;
    }

    public void A01() {
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        C21100yf r7 = this.A02;
        if (r7.A09(C21100yf.A0T)) {
            File file = new File(this.A03.A00.getFilesDir(), "crash_counter");
            int[] iArr = new int[2];
            try {
                if (!file.exists()) {
                    file.createNewFile();
                } else {
                    try {
                        objectInputStream = new ObjectInputStream(new FileInputStream(file));
                        String[] split = ((String) objectInputStream.readObject()).split(",");
                        for (int i = 0; i < split.length; i++) {
                            iArr[i] = Integer.parseInt(split[i]);
                        }
                        objectInputStream.close();
                    } catch (Exception e) {
                        Log.e("Unable to read from crash counter file", e);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                if (this.A00.A00) {
                    iArr[0] = iArr[0] + 1;
                } else {
                    iArr[1] = iArr[1] + 1;
                }
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                StringBuilder sb = new StringBuilder();
                sb.append(iArr[0]);
                sb.append(",");
                sb.append(iArr[1]);
                objectOutputStream.writeObject(sb.toString());
                objectOutputStream.close();
                if (this.A06.A01()) {
                    if (iArr[0] >= r7.A04(C21100yf.A1L)) {
                        C19700wN r8 = this.A01;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Crashes count foreground: ");
                        sb2.append(iArr[0]);
                        sb2.append(" Crashes count background: ");
                        sb2.append(iArr[1]);
                        r8.A0E("ForegroundAppCrashLoop", sb2.toString(), false);
                    } else if (iArr[1] >= r7.A04(C21100yf.A1K)) {
                        C19700wN r82 = this.A01;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Crashes count foreground: ");
                        sb3.append(iArr[0]);
                        sb3.append(" Crashes count background: ");
                        sb3.append(iArr[1]);
                        r82.A0E("BackgroundAppCrashLoop", sb3.toString(), false);
                    }
                }
            } catch (Exception e2) {
                Log.e("Unable to use crash counter file", e2);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            if (r7.A09(C21100yf.A0S)) {
                C19890wg r2 = this.A06;
                if (!r2.A01()) {
                    return;
                }
                if (iArr[0] >= r7.A04(C21100yf.A1L) || iArr[1] >= r7.A04(C21100yf.A1K)) {
                    Context context = r2.A00;
                    File file2 = new File(context.getFilesDir().getParent(), "shared_prefs");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("ab-props-backup");
                    sb4.append(".xml");
                    File file3 = new File(file2, sb4.toString());
                    File file4 = new File(context.getFilesDir().getParent(), "shared_prefs");
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("ab-props");
                    sb5.append(".xml");
                    File file5 = new File(file4, sb5.toString());
                    if (file3.exists()) {
                        file3.renameTo(file5);
                    }
                    C19700wN r22 = this.A01;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Crashes count foreground:");
                    sb6.append(iArr[0]);
                    sb6.append(" Crashes count background: ");
                    sb6.append(iArr[1]);
                    r22.A0E("RevertToPreviousStableABPropsCopy", sb6.toString(), false);
                    return;
                }
                return;
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    public void A02() {
        File file = new File(this.A03.A00.getFilesDir(), "crash_in_video_sentinel");
        if (file.exists() && !file.delete()) {
            Log.w("crashlogs/failed-delete-crash-sentinel-file");
        }
    }

    public void A03(String str) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.A0A.A00.get()).edit();
        edit.putString("crash_state_manager:system_exit", str);
        if (!edit.commit()) {
            Log.w("reportSystemExit/failed-to-save-preferences");
        }
        System.exit(0);
    }

    public void BRL() {
        this.A0B.BpM(new C35691j6(this, 27), "AppAsyncInit/clear-crash-count", 10000);
    }

    public C21350z4(C21390zA r1, C19700wN r2, C21360z5 r3, C21100yf r4, C21060yb r5, C19630wG r6, C19420v0 r7, C21370z6 r8, C20810yC r9, C19890wg r10, C19770wU r11, C21380z9 r12) {
        this.A05 = r9;
        this.A03 = r6;
        this.A0B = r11;
        this.A01 = r2;
        this.A08 = r3;
        this.A02 = r4;
        this.A09 = r5;
        this.A0A = r7;
        this.A04 = r8;
        this.A07 = r12;
        this.A06 = r10;
        this.A00 = r1;
    }
}
