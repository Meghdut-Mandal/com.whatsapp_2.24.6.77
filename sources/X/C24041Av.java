package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1Av  reason: invalid class name and case insensitive filesystem */
public class C24041Av {
    public final C20690y0 A00;
    public final C19630wG A01;
    public final C24061Ay A02;
    public final AnonymousClass1Ax A03;
    public final C19890wg A04;
    public final AnonymousClass164 A05;
    public final C24071Az A06;

    public static boolean A02(C24041Av r4, File file) {
        try {
            C20690y0 r2 = r4.A00;
            return r2.A0i(file) || r2.A0h(file) || file.getCanonicalPath().startsWith(r2.A08().A08.getCanonicalPath());
        } catch (IOException e) {
            Log.e("ReferenceCountedFileManager/isExternalManagedMediaFile ", e);
            return false;
        }
    }

    public static int A00(C24041Av r9, File file, int i) {
        C1495671s B1k;
        int i2;
        C24061Ay r1 = r9.A02;
        String absolutePath = file.getAbsolutePath();
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        C18740tg.A0C(z);
        AnonymousClass1M0 A052 = r1.A00.A05();
        try {
            B1k = A052.B1k();
            int A002 = r1.A00(absolutePath);
            if (A002 <= i) {
                A052.A02.A03("media_refs", "path = ?", "DELETE_MEDIA_REF_SQL", new String[]{absolutePath});
            } else {
                AnonymousClass6QI A0C = A052.A02.A0C("UPDATE media_refs SET ref_count = ref_count + ? WHERE path = ?", "UPDATE_MEDIA_REF_SQL");
                A0C.A05(1, (long) (-i));
                A0C.A06(2, absolutePath);
                if (A0C.A01() == 0) {
                    i2 = -1;
                    B1k.A00();
                    B1k.close();
                    A052.close();
                    return i2;
                }
            }
            i2 = A002 - i;
            B1k.A00();
            B1k.close();
            A052.close();
            return i2;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A01(C24041Av r6, File file, int i, boolean z) {
        C1495671s B1k;
        if (!z) {
            i--;
        }
        C24061Ay r1 = r6.A02;
        String absolutePath = file.getAbsolutePath();
        if (i != 0) {
            boolean z2 = false;
            if (i > 0) {
                z2 = true;
            }
            C18740tg.A0C(z2);
            AnonymousClass1M0 A052 = r1.A00.A05();
            try {
                B1k = A052.B1k();
                C224114e r4 = A052.A02;
                AnonymousClass6QI A0C = r4.A0C("UPDATE media_refs SET ref_count = ref_count + ? WHERE path = ?", "UPDATE_MEDIA_REF_SQL");
                A0C.A05(1, (long) i);
                A0C.A06(2, absolutePath);
                if (A0C.A01() == 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("path", absolutePath);
                    contentValues.put("ref_count", Integer.valueOf(i));
                    r4.A04("media_refs", "INSERT_TABLE_MEDIA_REFS", contentValues);
                }
                B1k.A00();
                B1k.close();
                A052.close();
                return;
            } catch (Throwable th) {
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public File A04(String str, String str2) {
        String str3;
        File A0G = this.A00.A0G();
        if ("application/was".equalsIgnoreCase(str2)) {
            str3 = ".was";
        } else {
            str3 = ".webp";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace('/', '-'));
        sb.append(str3);
        return new File(A0G, sb.toString());
    }

    public C24041Av(C20690y0 r1, AnonymousClass164 r2, C19630wG r3, C24061Ay r4, AnonymousClass1Ax r5, C19890wg r6, C24071Az r7) {
        this.A01 = r3;
        this.A00 = r1;
        this.A03 = r5;
        this.A05 = r2;
        this.A02 = r4;
        this.A04 = r6;
        this.A06 = r7;
    }

    public File A03(String str, String str2) {
        File A042 = A04(str, str2);
        if (!A042.exists()) {
            return null;
        }
        A01(this, A042, 1, true);
        return A042;
    }

    public void A05(File file, int i, int i2, boolean z, boolean z2) {
        if (A02(this, file)) {
            int A002 = A00(this, file, i2);
            if (z && A002 < 0) {
                if (z2) {
                    this.A05.A01(new C156767af(file, i));
                    return;
                }
                Log.i("ReferenceCountedFileManager/deleteManagedFile actually deleting file");
                AnonymousClass1Ax r0 = this.A03;
                AnonymousClass6YY.A0P(file);
                r0.A08(file, i);
            }
        }
    }

    public void A06(File file, int i, boolean z) {
        if (A02(this, file)) {
            A01(this, file, i, z);
        }
    }

    public void A07(String str, String str2) {
        File A042 = A04(str, str2);
        if (A00(this, A042, 1) < 0) {
            AnonymousClass6YY.A0P(A042);
        }
    }
}
