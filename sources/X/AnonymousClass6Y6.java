package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Y6  reason: invalid class name */
public abstract class AnonymousClass6Y6 {
    public static final Executor A00;

    public static int A00(C19420v0 r4, boolean z) {
        if (!z) {
            int A0C = r4.A0C();
            if (A0C != 0) {
                int i = 1;
                if (A0C != 1) {
                    i = 2;
                    if (A0C != 2) {
                        i = 3;
                        if (A0C != 3) {
                            if (A0C != 4) {
                                return 0;
                            }
                        }
                    }
                }
                return i;
            }
            return 0;
        }
        return 4;
    }

    public static boolean A04(C33101ei r9, File file, List list) {
        if (r9 == null || r9.A0E()) {
            LinkedList A0l = C90524aI.A0l();
            A0l.add(file);
            while (A0l.peek() != null) {
                Object poll = A0l.poll();
                C18740tg.A06(poll);
                File file2 = (File) poll;
                if (!file2.exists()) {
                    C36341k9.A1O(AnonymousClass000.A0v("gdrive-util/get-files-in-folder/does-not-exist "), file2.getAbsolutePath());
                } else if (file2.isDirectory()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        for (File file3 : listFiles) {
                            if (!file3.exists()) {
                                C36341k9.A1O(AnonymousClass000.A0v("gdrive-util/get-files-in-folder/does-not-exist "), file3.getAbsolutePath());
                            } else if (file3.isDirectory()) {
                                A0l.add(file3);
                            } else if (file3.length() > 0) {
                                list.add(file3);
                            }
                        }
                    }
                } else if (file2.length() > 0) {
                    list.add(file2);
                }
                list.size();
            }
            return true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1Z(A0u, C90514aH.A0x(file, "gdrive-util/get-files-in-folder/timeout ", A0u));
        return false;
    }

    public static boolean A06(C19420v0 r7, C20810yC r8, long j, long j2, long j3) {
        if (j3 <= 86400000) {
            return true;
        }
        long j4 = j - j2;
        if (j4 < j3 - 86400000) {
            return false;
        }
        if (r7.A0E() != 13) {
            return true;
        }
        long j5 = (j4 - j3) / 86400000;
        long A0B = C36441kJ.A0B(r8, 4917);
        return j5 > 0 && A0B > 0 && j5 % A0B == 0;
    }

    public static boolean A07(AnonymousClass1Q9 r13, File file, String str, boolean z) {
        String str2;
        AnonymousClass5U6 A002;
        byte[] bArr;
        AnonymousClass5RB A0B;
        C99934uC r0;
        File file2 = file;
        if (file == null || !file.exists() || !z) {
            str2 = "gdrive-util/validate local msgstore does not exist or is unusable";
        } else if (file.length() == 0) {
            str2 = "gdrive-util/validate local msgstore exists but is empty.";
        } else {
            if (!(str == null || (A002 = C110565as.A00(file.getName())) == null)) {
                try {
                    AnonymousClass1CS r10 = r13.A0X;
                    C19730wQ r2 = r13.A05;
                    AnonymousClass1CY r6 = r13.A0G;
                    C24431Ck r4 = r13.A06;
                    C24341Cb r5 = r13.A0A;
                    C24391Cg r8 = r13.A0W;
                    AnonymousClass6QE A003 = C109765Za.A00(r2, (C132716Uy) r13.A0b.get(), r4, r5, r6, r13.A0U, r8, A002, r10, file2, (Boolean) null);
                    if (!(A003 instanceof C101434xY)) {
                        C101484xd r42 = (C101484xd) A003;
                        if (r42.A00 == null) {
                            try {
                                A0B = r42.A0B();
                                AnonymousClass6FN A0A = r42.A0A(A0B, false);
                                if (A0A != null) {
                                    if (A0A instanceof C102124yp) {
                                        r0 = ((C102124yp) A0A).A00;
                                    } else {
                                        if (A0A instanceof C102114yo) {
                                            r0 = ((C102114yo) A0A).A00;
                                        }
                                        A0B.close();
                                    }
                                    if (AnonymousClass6YO.A0F(r0, str)) {
                                        A0B.close();
                                    }
                                    A0B.close();
                                } else {
                                    throw C90524aI.A0X("No prefix found");
                                }
                            } catch (C18890tz e) {
                                throw new IOException("failed to read prefix", e);
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        C131406Ox A01 = C101484xd.A01(r42);
                        if (!(A01 == null || (bArr = A01.A01) == null)) {
                            String A004 = C131406Ox.A00(bArr);
                            if (!str.endsWith(A004)) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("BackupFooter/has-jid-user-mismatch/expected-jid-user-ends-with: ");
                                A0u.append(A004);
                                C36321k7.A1P("  actual-jid-user: ", str, A0u);
                            }
                        }
                    }
                } catch (IOException e2) {
                    Log.e("MessageStoreBackup/has-jid-mismatch/failed to read backup footer", e2);
                }
                if (((C132716Uy) r13.A0b.get()).A02(file)) {
                    return true;
                }
                str2 = "gdrive-util/the backup is not supported.";
            }
            str2 = "gdrive-util/validate local msgstore exists but for a different jid.";
        }
        Log.i(str2);
        return false;
        throw th;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, (long) 1, TimeUnit.SECONDS, new AnonymousClass79S(), new AnonymousClass77J("Google Drive Write Worker #"));
        threadPoolExecutor.setRejectedExecutionHandler(AnonymousClass77B.A00);
        A00 = threadPoolExecutor;
    }

    public static boolean A08(C20810yC r2) {
        if (Build.VERSION.SDK_INT < 30 || !r2.A0E(603)) {
            return false;
        }
        return true;
    }

    public static Dialog A01(Activity activity, DialogInterface.OnCancelListener onCancelListener, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gdrive-util/get-error-dialog creating dialog for ");
        C36321k7.A1a(A0u, C34191gb.A01(i));
        AnonymousClass6Yu r4 = new AnonymousClass6Yu(activity, i, i2);
        C39001qm A002 = AnonymousClass3LW.A00(activity);
        A002.A0a(false);
        A002.setNegativeButton(R.string.f12nameremoved, new C163297py(onCancelListener, 13));
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            i3 = R.string.f12nameremoved;
            int i6 = R.string.f12nameremoved;
            if (z) {
                i6 = R.string.f12nameremoved;
            }
            i5 = R.string.f12nameremoved;
        } else if (i == 2) {
            i3 = R.string.f12nameremoved;
            int i7 = R.string.f12nameremoved;
            if (z) {
                i7 = R.string.f12nameremoved;
            }
            i5 = R.string.f12nameremoved;
        } else if (i != 3) {
            boolean z2 = C02620Be.A00;
            if (i == 18 || (i == 1 && true == C02620Be.A03(activity))) {
                i = 18;
            }
            return C02610Bd.A00(activity, onCancelListener, new AnonymousClass0LD(activity, C02610Bd.A00.A03(activity, "d", i), i2), i);
        } else {
            i3 = R.string.f12nameremoved;
            i4 = R.string.f12nameremoved;
            if (z) {
                i4 = R.string.f12nameremoved;
            }
            i5 = R.string.f12nameremoved;
        }
        A002.A0L(i3);
        A002.A0K(i4);
        A002.setPositiveButton(i5, r4);
        return A002.create();
    }

    public static ArrayList A02(C20690y0 r3) {
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(r3.A08().A01);
        A0I.add(r3.A08().A00);
        A0I.add(r3.A08().A0N);
        A0I.add(r3.A08().A05);
        A0I.add(r3.A08().A0O);
        A0I.add(r3.A08().A0G);
        File file = r3.A08().A0P;
        C20690y0.A07(file, false);
        A0I.add(file);
        File file2 = r3.A08().A02;
        C20690y0.A07(file2, false);
        A0I.add(file2);
        File file3 = r3.A08().A0M;
        C20690y0.A07(file3, false);
        A0I.add(file3);
        File file4 = r3.A08().A04;
        C20690y0.A07(file4, false);
        A0I.add(file4);
        ArrayList A15 = C36441kJ.A15(A0I);
        File file5 = r3.A08().A0M;
        C20690y0.A07(file5, false);
        A15.remove(file5);
        return A15;
    }

    public static boolean A03(C20690y0 r2, File file) {
        try {
            return r2.A0h(file);
        } catch (IOException e) {
            C36321k7.A1M(file, "gdrive-util/in-media-folder ", AnonymousClass000.A0u(), e);
            return false;
        }
    }

    public static boolean A05(C19420v0 r1) {
        return AnonymousClass000.A1S(r1.A0F(), 2);
    }
}
