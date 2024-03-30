package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5MY  reason: invalid class name */
public class AnonymousClass5MY extends C132446Tt {
    public final int A00;
    public final C02680Bk A01;
    public final C19700wN A02;
    public final C24041Av A03;
    public final C20310xM A04;
    public final AnonymousClass1DF A05;
    public final C21010yW A06;
    public final AnonymousClass1Ax A07;
    public final File A08;
    public final WeakReference A09 = AnonymousClass001.A0F((Object) null);

    public AnonymousClass5MY(C19700wN r4, C24041Av r5, C20310xM r6, AnonymousClass1DF r7, C21010yW r8, AnonymousClass1Ax r9, C19770wU r10, File file, int i) {
        this.A02 = r4;
        this.A06 = r8;
        this.A07 = r9;
        this.A00 = i;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
        this.A08 = file;
        this.A01 = C55882vL.A00(r10, 20000);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass686 r8 = new AnonymousClass686();
        int i = this.A00;
        r8.A00 = i;
        AnonymousClass1Ax r27 = this.A07;
        C20310xM r26 = this.A04;
        AnonymousClass1DF r15 = this.A05;
        C24041Av r14 = this.A03;
        File file = this.A08;
        C02680Bk r12 = this.A01;
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            r8.A0C = Long.valueOf(SystemClock.uptimeMillis());
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                ArrayList A14 = C36441kJ.A14(r3);
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        A14.add(new C119705qK(file2));
                    }
                }
                Collections.sort(A14, AnonymousClass765.A00);
                r8.A07 += (long) A14.size();
                r8.A0B = Long.valueOf(SystemClock.uptimeMillis());
                r8.A0A = Long.valueOf(SystemClock.uptimeMillis());
                C000700i r5 = new C000700i();
                Iterator it = A14.iterator();
                while (it.hasNext()) {
                    C119705qK r3 = (C119705qK) it.next();
                    long j = r3.A00;
                    C119715qL r2 = (C119715qL) r5.A05(j);
                    if (r2 == null) {
                        r2 = new C119715qL(j);
                        r5.A0A(j, r2);
                    }
                    File file3 = r3.A01;
                    List list = r2.A01;
                    boolean z = true;
                    if (!list.isEmpty() && file3.getName().compareTo(((File) list.get(C36421kH.A06(list, 1))).getName()) < 0) {
                        z = false;
                    }
                    C18740tg.A0C(z);
                    list.add(file3);
                }
                r12.A04();
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (int i2 = 0; i2 < r5.A00(); i2++) {
                    C119715qL r22 = (C119715qL) r5.A04(i2);
                    if (r22.A01.size() >= 2) {
                        A0I2.add(r22);
                        r8.A08 += (long) r22.A01.size();
                    }
                }
                r12.A04();
                Collections.sort(A0I2, AnonymousClass766.A00);
                r12.A04();
                Iterator it2 = A0I2.iterator();
                while (it2.hasNext()) {
                    C119715qL r6 = (C119715qL) it2.next();
                    HashMap A0J = AnonymousClass001.A0J();
                    List list2 = r6.A01;
                    int size = list2.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            File file4 = (File) list2.get(size);
                            try {
                                r12.A04();
                                String A002 = AnonymousClass6UG.A00(file4);
                                long j2 = r6.A00;
                                r8.A04++;
                                r8.A01 += j2;
                                File file5 = (File) A0J.get(A002);
                                if (file5 == null) {
                                    A0J.put(A002, file4);
                                } else {
                                    file4.getParentFile();
                                    file4.getName();
                                    file5.getName();
                                    ArrayList A0C = r15.A0C(r12, file4, A002);
                                    r12.A04();
                                    if (!A0C.isEmpty()) {
                                        ArrayList A0v = C36401kF.A0v(A0C);
                                        r14.A06(file5, A0C.size(), true);
                                        Iterator it3 = A0C.iterator();
                                        while (it3.hasNext()) {
                                            AnonymousClass2bU A0r = C36441kJ.A0r(it3);
                                            AnonymousClass2bU.A00(A0r).A0I = file5;
                                            r26.A0k(A0r);
                                            A0v.add(new C119725qM(file4, file5));
                                        }
                                        r14.A05(file4, i, A0C.size(), false, false);
                                        A0C.size();
                                        A0I.addAll(A0v);
                                        long length = file5.length();
                                        r8.A06++;
                                        r8.A03 += length;
                                    } else {
                                        r27.A08(file4, i);
                                        file4.delete();
                                        long length2 = file5.length();
                                        r8.A05++;
                                        r8.A02 += length2;
                                    }
                                }
                            } catch (IOException e) {
                                Log.e("mediafilemerger/processfileswithsamelength", e);
                            }
                        }
                    }
                }
            }
        } catch (AnonymousClass02S e2) {
            Log.e("mediafilemerger/cancelled", e2);
        } catch (Throwable th) {
            SystemClock.uptimeMillis();
            throw th;
        }
        r8.A09 = Long.valueOf(SystemClock.uptimeMillis());
        return new C119735qN(r8, A0I);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C119735qN r3 = (C119735qN) obj;
        C25711Hj r0 = (C25711Hj) this.A09.get();
        if (r0 != null) {
            r0.accept(r3);
        }
        this.A06.Bly(r3.A00.A01());
    }
}
