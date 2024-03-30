package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.6OP  reason: invalid class name */
public class AnonymousClass6OP {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final C21060yb A02;
    public final C19630wG A03;
    public final C19420v0 A04;
    public final C20810yC A05;
    public final C21010yW A06;
    public final C19770wU A07;

    public static void A00(AnonymousClass6OP r11) {
        ActivityManager A042 = r11.A02.A04();
        if (A042 == null) {
            Log.e("Android11ExitReasonReporter Could not get activity manager");
            return;
        }
        ListIterator listIterator = A042.getHistoricalProcessExitReasons((String) null, 0, 100).listIterator();
        ArrayList A0I = AnonymousClass001.A0I();
        HashMap A0J = AnonymousClass001.A0J();
        C19420v0 r4 = r11.A04;
        long A0V = r4.A0V("last_exit_reason_sync_timestamp");
        while (listIterator.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) listIterator.next();
            if (applicationExitInfo.getTimestamp() <= A0V) {
                break;
            }
            A0I.add(applicationExitInfo);
            Integer valueOf = Integer.valueOf(applicationExitInfo.getReason());
            int i = 1;
            if (A0J.containsKey(valueOf)) {
                i = AnonymousClass000.A0I(A0J.get(valueOf)) + 1;
            }
            C36341k9.A1K(valueOf, A0J, i);
        }
        ListIterator listIterator2 = A0I.listIterator(A0I.size());
        while (listIterator2.hasPrevious()) {
            ApplicationExitInfo applicationExitInfo2 = (ApplicationExitInfo) listIterator2.previous();
            AnonymousClass58L r2 = new AnonymousClass58L();
            r2.A00 = Boolean.valueOf(ActivityManager.isLowMemoryKillReportSupported());
            r2.A01 = C90524aI.A0Z(applicationExitInfo2.getPss());
            r2.A04 = C36441kJ.A0y(applicationExitInfo2.getReason());
            r2.A07 = applicationExitInfo2.getDescription();
            r2.A05 = Long.valueOf(applicationExitInfo2.getTimestamp());
            r2.A02 = C90524aI.A0Z(applicationExitInfo2.getRss());
            r2.A06 = C36441kJ.A0y(applicationExitInfo2.getStatus());
            r2.A03 = C36441kJ.A0y(applicationExitInfo2.getImportance());
            r11.A06.Bly(r2);
            r4.A1h("last_exit_reason_sync_timestamp", applicationExitInfo2.getTimestamp());
        }
        AnonymousClass2OQ r22 = new AnonymousClass2OQ();
        r22.A01 = A0J.toString();
        r22.A00 = Long.valueOf(r4.A0V("last_exit_reason_sync_timestamp"));
        r11.A06.Bly(r22);
    }

    public File A01(String str) {
        Integer valueOf;
        int A072 = this.A05.A07(7849);
        File A0w = C36441kJ.A0w(C90524aI.A0R(this.A03), "traces");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("os_stacktrace_");
        A0u.append(str);
        File A0K = C90464aC.A0K(A0w, ".stacktrace", A0u);
        if (!A0K.exists()) {
            AnonymousClass005 r7 = this.A01;
            int i = C36411kG.A0E(((C21370z6) r7.get()).A01).getInt("appexitinfo_stack_top_hashcode", -1);
            if (i == -1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(i);
            }
            ActivityManager A042 = this.A02.A04();
            if (A042 == null) {
                return null;
            }
            int i2 = 0;
            List historicalProcessExitReasons = A042.getHistoricalProcessExitReasons((String) null, 0, A072);
            if (valueOf != null) {
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext() && it.next().hashCode() != valueOf.intValue()) {
                    i2++;
                }
            } else {
                i2 = historicalProcessExitReasons.size();
            }
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) historicalProcessExitReasons.get(i3);
                if (applicationExitInfo.getReason() == 6 && applicationExitInfo.getDescription() != null) {
                    StringBuilder A0i = C90524aI.A0i(applicationExitInfo.getDescription());
                    A0i.append(10);
                    A0i.append(10);
                    String str2 = null;
                    try {
                        InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                        if (traceInputStream != null) {
                            BufferedReader A0b = C90484aE.A0b(traceInputStream);
                            while (true) {
                                String readLine = A0b.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (str2 == null && readLine.contains("job-anomaly-detector-")) {
                                    int indexOf = readLine.indexOf("job-anomaly-detector-") + 21;
                                    if (indexOf < 21) {
                                        str2 = null;
                                    } else {
                                        str2 = readLine.substring(indexOf, indexOf + 7);
                                    }
                                }
                                A0i.append(readLine);
                                A0i.append(10);
                            }
                            if (str2 != null) {
                                try {
                                    ((AnonymousClass11c) this.A00.get()).A03(A0i.toString(), C36321k7.A0D("os_stacktrace_", str2), (String) null);
                                } catch (IOException e) {
                                    C90464aC.A1L("ANRHelper/failed-to-save/os_trace/", str2, AnonymousClass000.A0u(), e);
                                }
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("Android11ExitReasonReporter/could not get exit info", e2);
                    }
                    C36341k9.A0v(C36351kA.A0A(((C21370z6) r7.get()).A01), "appexitinfo_stack_top_hashcode", applicationExitInfo.hashCode());
                }
            }
            if (!A0K.exists()) {
                return null;
            }
        }
        return A0K;
    }

    public void A02() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.A07.Boy(new C81113wU((Object) this, 15));
        }
    }

    public AnonymousClass6OP(C21060yb r1, C19630wG r2, C19420v0 r3, C20810yC r4, C21010yW r5, C19770wU r6, AnonymousClass005 r7, AnonymousClass005 r8) {
        this.A05 = r4;
        this.A03 = r2;
        this.A02 = r1;
        this.A07 = r6;
        this.A00 = r7;
        this.A06 = r5;
        this.A04 = r3;
        this.A01 = r8;
    }
}
