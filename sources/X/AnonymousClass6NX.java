package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6NX  reason: invalid class name */
public class AnonymousClass6NX {
    public File A00;
    public File A01;
    public File A02;
    public final C19730wQ A03;
    public final AnonymousClass179 A04;
    public final C19420v0 A05;
    public final C220712t A06;
    public final AnonymousClass1Q9 A07;
    public final AnonymousClass12P A08;
    public final AnonymousClass1QN A09;
    public final C20280xJ A0A;
    public final C133236Xj A0B;
    public final AnonymousClass6F7 A0C;
    public final C1268465w A0D;
    public final AnonymousClass5FY A0E;
    public final AnonymousClass6F6 A0F;
    public final C105535Fa A0G;
    public final AnonymousClass6TQ A0H;
    public final C122705vI A0I;
    public final C119865qa A0J;
    public final C29501Ww A0K;
    public final C19770wU A0L;
    public final AnonymousClass005 A0M;
    public final AnonymousClass17Z A0N;

    public void A01() {
        this.A0F.A04();
        this.A0D.A01();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        Log.i("fpm/ExportHelper/reset()/success");
    }

    public AnonymousClass6NX(C19730wQ r2, AnonymousClass179 r3, AnonymousClass17Z r4, C19420v0 r5, C220712t r6, AnonymousClass1Q9 r7, AnonymousClass12P r8, AnonymousClass1QN r9, C20280xJ r10, C133236Xj r11, AnonymousClass6F7 r12, C1268465w r13, AnonymousClass5FY r14, AnonymousClass6F6 r15, C105535Fa r16, AnonymousClass6TQ r17, C122705vI r18, C119865qa r19, C29501Ww r20, C19770wU r21, AnonymousClass005 r22) {
        this.A0L = r21;
        this.A03 = r2;
        this.A06 = r6;
        this.A04 = r3;
        this.A0H = r17;
        this.A0M = r22;
        this.A0B = r11;
        this.A0D = r13;
        this.A0A = r10;
        this.A07 = r7;
        this.A0K = r20;
        this.A05 = r5;
        this.A08 = r8;
        this.A0G = r16;
        this.A0F = r15;
        this.A0I = r18;
        this.A0C = r12;
        this.A0E = r14;
        this.A09 = r9;
        this.A0J = r19;
        this.A0N = r4;
    }

    public static void A00(AnonymousClass6NX r9, File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile() && !file2.getName().startsWith(".")) {
                        long A022 = r9.A0F.A02(file2, file2.getPath().replace(((File) r9.A04.A01.get()).getPath(), ""), false);
                        if (A022 < 0) {
                            C36341k9.A1M("fpm/ExportHelper/exportMessagesWithDb()/Failed to register optional file: ", AnonymousClass000.A0u(), A022);
                        }
                    } else if (file2.isDirectory()) {
                        A00(r9, file2);
                    }
                }
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unable to list files in the directory: ");
            throw AnonymousClass000.A0c(file.getPath(), A0u);
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("The specified path is not a directory: ");
        throw AnonymousClass000.A0c(file.getPath(), A0u2);
    }
}
