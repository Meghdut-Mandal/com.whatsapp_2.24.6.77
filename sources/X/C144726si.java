package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6si  reason: invalid class name and case insensitive filesystem */
public final class C144726si implements C30631aW {
    public final AnonymousClass1DH A00;
    public final C27631Pa A01;
    public final AnonymousClass6XP A02;
    public final C19630wG A03;
    public final AnonymousClass66Q A04;
    public final AnonymousClass1DE A05;
    public final AnonymousClass1OC A06;
    public final C124825yr A07;
    public final AnonymousClass3O1 A08;
    public final C19770wU A09;

    public void BV2() {
        File[] listFiles;
        C1495671s B1k;
        C1495671s B1k2;
        AnonymousClass1DE r5 = this.A05;
        synchronized (r5) {
            C18740tg.A00();
            r5.A00.A07(-1);
            try {
                AnonymousClass1M0 A042 = r5.A02.A04();
                try {
                    B1k2 = A042.B1k();
                    C224114e r10 = A042.A02;
                    String[] A1R = C36441kJ.A1R();
                    C36351kA.A1V(A1R, 0, C19970wo.A00(r5.A01) - 1209600000);
                    r10.A03("media_job", "last_update_time < ?", "MediaJobDataStore/deleteStaleMediaJobData", A1R);
                    B1k2.A00();
                    B1k2.close();
                    A042.close();
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e("mediajobdb/delete All Older than", e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        AnonymousClass66Q r52 = this.A04;
        synchronized (r52) {
            C18740tg.A00();
            try {
                AnonymousClass1M0 A043 = r52.A01.A04();
                try {
                    B1k = A043.B1k();
                    C224114e r102 = A043.A02;
                    String[] A1R2 = C36441kJ.A1R();
                    C36351kA.A1V(A1R2, 0, C19970wo.A00(r52.A00) - 300000);
                    r102.A03("express_path_download_data", "last_update_time < ?", "ExpressPathDownloadDataStore/deleteStaleExpressPathDownloadData", A1R2);
                    B1k.A00();
                    B1k.close();
                    A043.close();
                } catch (Throwable th3) {
                    A043.close();
                    throw th3;
                }
            } catch (SQLiteDatabaseCorruptException e2) {
                Log.e("expresspathdownloaddb/delete All Older than", e2);
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
        }
        Context context = this.A03.A00;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        HashMap hashMap = C107205My.A0A;
        synchronized (hashMap) {
            Iterator A0s = C90484aE.A0s(hashMap);
            while (A0s.hasNext()) {
                C107205My r2 = (C107205My) hashMap.get(C36401kF.A0a(A0s));
                if (r2 != null) {
                    if (r2.A06() != 1) {
                        C90464aC.A18(C107205My.A00(context, r2));
                        A0I.add(r2);
                    } else {
                        File A002 = C107205My.A00(context, r2);
                        if (A002.exists()) {
                            A0I2.add(A002);
                        }
                    }
                }
            }
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                hashMap.remove(((C107205My) it.next()).A05.A03);
            }
        }
        File A0w = C36441kJ.A0w(context.getCacheDir(), "ProfilePictureTemp");
        A0w.mkdirs();
        File[] listFiles2 = A0w.listFiles();
        if (listFiles2 != null) {
            for (File file : listFiles2) {
                if (!A0I2.contains(file)) {
                    file.delete();
                }
            }
        }
        AnonymousClass1OC r0 = this.A06;
        ArrayList A0I3 = AnonymousClass001.A0I();
        ArrayList A0I4 = AnonymousClass001.A0I();
        HashMap hashMap2 = r0.A0A;
        synchronized (hashMap2) {
            Iterator A10 = C36371kC.A10(hashMap2);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                AnonymousClass5C0 r1 = (AnonymousClass5C0) A11.getValue();
                if (r1 != null) {
                    if (!r1.A0A) {
                        C124245xp r02 = r1.A04;
                        C90464aC.A18(AnonymousClass1OC.A00(context, r02.A04, r02.A06, r02.A02));
                        A0I3.add(C90494aF.A0f(A11));
                    } else {
                        C124245xp r03 = r1.A04;
                        File A003 = AnonymousClass1OC.A00(context, r03.A04, r03.A06, r03.A02);
                        if (A003.exists()) {
                            A0I4.add(A003);
                        }
                    }
                }
            }
            Iterator it2 = A0I3.iterator();
            while (it2.hasNext()) {
                hashMap2.remove(AnonymousClass001.A0C(it2));
            }
        }
        File A0w2 = C36441kJ.A0w(context.getCacheDir(), "ProfilePictureTemp");
        A0w2.mkdirs();
        File[] listFiles3 = A0w2.listFiles();
        if (listFiles3 != null) {
            for (File file2 : listFiles3) {
                if (!A0I4.contains(file2)) {
                    AnonymousClass6YY.A0P(file2);
                }
            }
        }
        C36341k9.A0u(C90474aD.A0F(this.A01), "enable_gcall_codec_nego_fix");
        File A052 = C34681hT.A05(this.A02.A02.A00);
        if (A052 != null && (listFiles = A052.listFiles()) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (File file3 : listFiles) {
                long lastModified = currentTimeMillis - file3.lastModified();
                if (lastModified > C90484aE.A0K(TimeUnit.DAYS) || lastModified < 0) {
                    AnonymousClass6YY.A0Q(file3);
                }
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    public void BV3() {
        this.A09.Boy(new C80253v6(this, 47));
        C124825yr r5 = this.A07;
        if (r5.A08.A0E(394)) {
            C1040958g r4 = new C1040958g();
            C18950u5 r3 = r4.samplingRate;
            if (r3.A00()) {
                r5.A0B.Boy(new AnonymousClass737(r5, r4, r3, 9));
            }
        }
        AnonymousClass3O1 r32 = this.A08;
        Log.i("storage-usage-prefetcher/prefetch storage data");
        r32.A05.Boy(new C81183wb(r32, 17));
    }

    public C144726si(C27631Pa r2, AnonymousClass6XP r3, AnonymousClass1DH r4, C19630wG r5, AnonymousClass66Q r6, AnonymousClass1DE r7, AnonymousClass1OC r8, C124825yr r9, AnonymousClass3O1 r10, C19770wU r11) {
        C36321k7.A1B(r5, r11, r4, r9, r7);
        C36321k7.A13(r3, r2, r10);
        AnonymousClass00C.A0D(r8, 10);
        this.A03 = r5;
        this.A09 = r11;
        this.A00 = r4;
        this.A07 = r9;
        this.A05 = r7;
        this.A02 = r3;
        this.A01 = r2;
        this.A08 = r10;
        this.A04 = r6;
        this.A06 = r8;
    }
}
