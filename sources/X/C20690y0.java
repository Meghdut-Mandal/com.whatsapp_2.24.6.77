package X;

import android.media.MediaScannerConnection;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0y0  reason: invalid class name and case insensitive filesystem */
public class C20690y0 implements AnonymousClass00O, AnonymousClass00M {
    public static SimpleDateFormat A07 = new SimpleDateFormat("yyyyww", Locale.US);
    public static final String A08;
    public static final String A09;
    public static final String A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public static final String A0F;
    public static final String A0G;
    public static final String A0H;
    public static final String A0I;
    public AnonymousClass3BP A00;
    public final C19630wG A01;
    public final C20810yC A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final Object A06 = new Object();

    public static File A02(File file, String str) {
        boolean z = false;
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                z = true;
            }
        }
        if (!z && !file.mkdirs()) {
            Log.e("app/extsharedfile/folder/created/false");
        }
        return new File(file, str);
    }

    public File A0K(C25471Gl r5, C51622o7 r6, String str, String str2, String str3, boolean z) {
        File A0E2;
        File filesDir;
        String str4;
        File A002 = A00(this, r6, true);
        if (A002 != null) {
            return A002;
        }
        if (z) {
            filesDir = this.A01.A00.getFilesDir();
            str4 = "business_activity_report.zip.enc.tmp";
        } else if (C25471Gl.A0Z == r5) {
            filesDir = this.A01.A00.getFilesDir();
            str4 = "payment_background_img.enc.tmp";
        } else {
            if (C25471Gl.A0N == r5) {
                A0E2 = new File(this.A01.A00.getFilesDir(), A08);
                A07(A0E2, false);
            } else {
                A0E2 = A0E();
                if (str != null) {
                    return A03(A0E2, str, str3, ".enc.tmp");
                }
            }
            return A03(A0E2, str2, str3, ".enc.tmp");
        }
        return new File(filesDir, str4);
    }

    public File A0L(C25471Gl r7, C51622o7 r8, String str, String str2, boolean z, boolean z2) {
        File A0E2;
        File filesDir;
        String str3;
        File A002 = A00(this, r8, false);
        if (A002 != null) {
            return A002;
        }
        if (z) {
            filesDir = this.A01.A00.getFilesDir();
            str3 = "business_activity_report.zip.tmp";
        } else {
            if (C25471Gl.A0N == r7) {
                A0E2 = new File(this.A01.A00.getFilesDir(), A08);
                A07(A0E2, false);
            } else if (C25471Gl.A0Z == r7) {
                filesDir = this.A01.A00.getFilesDir();
                str3 = "payment_background_img.tmp";
            } else if (z2) {
                String l = Long.toString(System.currentTimeMillis(), 36);
                File file = A08().A09;
                StringBuilder sb = new StringBuilder();
                String str4 = r7.A02;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append("-");
                sb2.append(l);
                sb.append(sb2.toString());
                sb.append(".tmp");
                return new File(file, sb.toString());
            } else {
                A0E2 = A0E();
            }
            return A03(A0E2, str, str2, ".tmp");
        }
        return new File(filesDir, str3);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("WhatsApp");
        sb.append(" Audio");
        A0A = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WhatsApp");
        sb2.append(" Animated Gifs");
        A09 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("WhatsApp");
        sb3.append(" Voice Notes");
        A0I = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("WhatsApp");
        sb4.append(" Video Notes");
        A0F = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("WhatsApp");
        sb5.append(" Video");
        A0H = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("WhatsApp");
        sb6.append(" Images");
        A0D = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append("WhatsApp");
        sb7.append(" Documents");
        A0C = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append("WhatsApp");
        sb8.append(" Profile Photos");
        A0E = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append("WhatsApp");
        sb9.append(" Calls");
        A0B = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append("WhatsApp");
        sb10.append(" Stickers");
        A0G = sb10.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append("WhatsApp");
        sb11.append(" History Sync");
        A08 = sb11.toString();
    }

    public static File A00(C20690y0 r4, C51622o7 r5, boolean z) {
        String str;
        File filesDir;
        StringBuilder sb;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            str = ".enc";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(".tmp");
        String obj = sb2.toString();
        if (r5 == C51622o7.ACCOUNT) {
            filesDir = r4.A01.A00.getFilesDir();
            sb = new StringBuilder();
            str2 = "gdpr.zip";
        } else if (r5 != C51622o7.NEWSLETTER) {
            return null;
        } else {
            filesDir = r4.A01.A00.getFilesDir();
            sb = new StringBuilder();
            str2 = "channels_gdpr.zip";
        }
        sb.append(str2);
        sb.append(obj);
        return new File(filesDir, sb.toString());
    }

    public static File A03(File file, String str, String str2, String str3) {
        String name;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.replace('/', '-'));
            sb.append(str3);
            name = sb.toString();
        } else if (str2 != null) {
            name = new File(str2).getName();
        } else {
            Log.e("fmessageio/getDownloadFile/no_url");
            return null;
        }
        return A02(file, name);
    }

    public static synchronized String A04(File file, String str) {
        String obj;
        boolean z;
        synchronized (C20690y0.class) {
            String l = Long.toString(System.currentTimeMillis(), 36);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            sb.append(l);
            obj = sb.toString();
            File[] listFiles = file.listFiles(new C164267rX(obj, 0));
            if (listFiles != null) {
                do {
                    z = false;
                    for (File name : listFiles) {
                        if (name.getName().equals(obj)) {
                            StringBuilder sb2 = new StringBuilder();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str);
                            sb3.append("-");
                            sb3.append(l);
                            sb2.append(sb3.toString());
                            sb2.append(UUID.randomUUID().toString());
                            obj = sb2.toString();
                            z = true;
                        }
                    }
                } while (z);
            }
        }
        return obj;
    }

    public static void A05(C20690y0 r2, File file) {
        File[] listFiles;
        File file2 = new File(file, ".nomedia");
        if (file2.exists() && file2.delete() && (listFiles = file.listFiles()) != null) {
            r2.A0g((Runnable) null, Arrays.asList(listFiles));
        }
    }

    public static void A06(File file) {
        File file2 = new File(file, ".nomedia");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("fmessageio/prepareFolder ");
                sb.append(file);
                Log.e(sb.toString(), e);
            }
        }
    }

    public AnonymousClass3BP A08() {
        AnonymousClass3BP r0;
        synchronized (this.A06) {
            if (this.A00 == null) {
                Log.i("fmessageio/media-dirs-null");
                A0d();
            }
            r0 = this.A00;
            C18740tg.A06(r0);
        }
        return r0;
    }

    public File A09() {
        return new File(this.A01.A00.getFilesDir(), "business_activity_report.zip");
    }

    public File A0A() {
        File file = new File(this.A01.A00.getCacheDir(), "export_chat_folder");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0B() {
        File file = new File(this.A01.A00.getCacheDir(), "export_chats");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0C() {
        File file = new File(this.A01.A00.getCacheDir(), "export_business_activity");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0D() {
        File file = new File(this.A01.A00.getCacheDir(), "export_gdpr");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0F() {
        File file = new File(this.A01.A00.getFilesDir(), "Payment Backgrounds");
        A07(file, false);
        return file;
    }

    public File A0G() {
        File file = new File(this.A01.A00.getFilesDir(), "Stickers");
        A07(file, false);
        return file;
    }

    public File A0J(AnonymousClass3L1 r4) {
        String str = r4.A04;
        if (str != null) {
            return A0Z(str);
        }
        String str2 = r4.A07;
        if (str2 == null) {
            return null;
        }
        File file = A08().A0Q;
        A07(file, false);
        C18740tg.A06(str2);
        return A02(file, str2);
    }

    public File A0M(AnonymousClass2bU r5) {
        if (!(r5.A1J.A00 instanceof C177548dy) || r5.A1b() == null) {
            return A03(A0E(), r5.A04, r5.A07, ".tmp");
        }
        File filesDir = this.A01.A00.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(r5.A1b());
        sb.append(".tmp");
        return new File(filesDir, sb.toString());
    }

    public File A0N(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(".chck");
        return A02(A0E(), sb.toString());
    }

    public File A0O(String str) {
        StringBuilder sb = new StringBuilder();
        String A042 = C18750th.A04(str);
        C18740tg.A06(A042);
        sb.append(A042);
        sb.append("-profilephoto");
        return A02(A0E(), sb.toString());
    }

    public File A0P(String str) {
        StringBuilder sb = new StringBuilder();
        String A042 = C18750th.A04(str);
        C18740tg.A06(A042);
        sb.append(A042);
        sb.append("-hqthumb");
        return A02(A0E(), sb.toString());
    }

    public File A0Q(String str) {
        String str2;
        File filesDir = this.A01.A00.getFilesDir();
        if ("personal".equals(str)) {
            str2 = "dyi.zip";
        } else {
            str2 = "business_dyi.zip";
        }
        return new File(filesDir, str2);
    }

    public File A0U(String str) {
        String str2;
        File cacheDir = this.A01.A00.getCacheDir();
        if ("personal".equals(str)) {
            str2 = "export_personal_dyi";
        } else {
            str2 = "export_business_dyi";
        }
        File file = new File(cacheDir, str2);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A0W(String str) {
        File file = new File(this.A01.A00.getCacheDir(), "support");
        if (!file.exists()) {
            file.mkdir();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(file, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0b(String str, String str2) {
        return A03(((AnonymousClass179) this.A03.get()).A07(".Thumbs"), str, str2, ".prog.thumb.jpg");
    }

    public File A0c(String str, String str2) {
        File A072 = ((AnonymousClass179) this.A03.get()).A07(".StickerThumbs");
        A07(A072, false);
        return A03(A072, str, str2, ".thumb.webp");
    }

    public void A0d() {
        synchronized (this.A06) {
            Log.i("fmessageio/initExternalStorageDirectory");
            this.A00 = new AnonymousClass3BP(this);
        }
    }

    public void A0e(File file, File file2) {
        AnonymousClass6YY.A0B((C24051Aw) this.A04.get(), file, file2);
    }

    public void A0f(File file, File file2) {
        AnonymousClass6YY.A0C((C24051Aw) this.A04.get(), file, file2);
    }

    public C20690y0(C19630wG r2, C20810yC r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r5;
        this.A04 = r6;
    }

    public static File A01(C20690y0 r3, File file, String str) {
        if (C19550w8.A07()) {
            if (C20800yB.A01(C21000yV.A02, r3.A02, 7735)) {
                return AnonymousClass3LP.A00(r3.A01.A00, str);
            }
        }
        file.getAbsolutePath();
        A07(file, true);
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r2.isDirectory() != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(java.io.File r2, boolean r3) {
        /*
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x000f
            boolean r0 = r2.isFile()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x002a
            r2.delete()     // Catch:{ all -> 0x0036 }
        L_0x000f:
            boolean r0 = r2.mkdirs()     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0030
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "fmessageio/prepareFolder/mkdirs failed: "
            r1.append(r0)     // Catch:{ all -> 0x0036 }
            r1.append(r2)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0036 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0036 }
            goto L_0x0030
        L_0x002a:
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x000f
        L_0x0030:
            if (r3 == 0) goto L_0x0035
            A06(r2)     // Catch:{ all -> 0x0036 }
        L_0x0035:
            return
        L_0x0036:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20690y0.A07(java.io.File, boolean):void");
    }

    public File A0E() {
        File file = A08().A03;
        A07(file, true);
        return file;
    }

    public File A0H() {
        File file = A08().A0R;
        A07(file, false);
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r9 != 3) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0I(int r7, int r8, int r9) {
        /*
            r6 = this;
            X.3BP r1 = r6.A08()
            r2 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r7 == r3) goto L_0x00b5
            if (r7 == r4) goto L_0x008e
            if (r7 == r5) goto L_0x007a
            r0 = 9
            if (r7 == r0) goto L_0x0068
            r0 = 13
            if (r7 == r0) goto L_0x005c
            r0 = 20
            if (r7 == r0) goto L_0x0059
            r0 = 23
            if (r7 == r0) goto L_0x00b5
            r0 = 37
            if (r7 == r0) goto L_0x00b5
            r0 = 65
            if (r7 == r0) goto L_0x00cd
            r0 = 81
            if (r7 == r0) goto L_0x0093
            r0 = 25
            if (r7 == r0) goto L_0x00b5
            r0 = 26
            if (r7 == r0) goto L_0x0068
            r0 = 28
            if (r7 == r0) goto L_0x007a
            r0 = 29
            if (r7 == r0) goto L_0x005c
            r0 = 42
            if (r7 == r0) goto L_0x0056
            r0 = 43
            if (r7 == r0) goto L_0x0056
        L_0x0042:
            X.005 r0 = r6.A03
            java.lang.Object r0 = r0.get()
            X.179 r0 = (X.AnonymousClass179) r0
            java.io.File r1 = r0.A04()
        L_0x004e:
            if (r9 == r4) goto L_0x0052
            if (r9 != r5) goto L_0x00cb
        L_0x0052:
            A07(r1, r3)
            return r1
        L_0x0056:
            java.io.File r1 = r1.A08
            goto L_0x004e
        L_0x0059:
            java.io.File r1 = r1.A04
            goto L_0x004e
        L_0x005c:
            if (r9 == r3) goto L_0x00c9
            if (r9 == r4) goto L_0x0065
            if (r9 != r5) goto L_0x0042
            java.io.File r1 = r1.A0H
            goto L_0x0052
        L_0x0065:
            java.io.File r1 = r1.A0A
            goto L_0x0052
        L_0x0068:
            r0 = 7
            if (r8 == r0) goto L_0x0077
            if (r9 == r3) goto L_0x0074
            if (r9 == r4) goto L_0x0077
            if (r9 != r5) goto L_0x0042
            java.io.File r1 = r1.A0J
            goto L_0x0052
        L_0x0074:
            java.io.File r1 = r1.A02
            goto L_0x00cb
        L_0x0077:
            java.io.File r1 = r1.A0C
            goto L_0x004e
        L_0x007a:
            if (r9 == r3) goto L_0x008b
            if (r9 == r4) goto L_0x0088
            if (r9 == r5) goto L_0x0085
            if (r9 != r2) goto L_0x0042
            java.io.File r1 = r1.A07
            goto L_0x00cb
        L_0x0085:
            java.io.File r1 = r1.A0L
            goto L_0x0052
        L_0x0088:
            java.io.File r1 = r1.A0E
            goto L_0x0052
        L_0x008b:
            java.io.File r1 = r1.A0N
            goto L_0x00cb
        L_0x008e:
            if (r8 != r3) goto L_0x00a6
            java.io.File r2 = r1.A0O
            goto L_0x0095
        L_0x0093:
            java.io.File r2 = r1.A0G
        L_0x0095:
            java.text.SimpleDateFormat r1 = A07
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r1.format(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            goto L_0x004e
        L_0x00a6:
            if (r9 == r3) goto L_0x00b2
            if (r9 == r4) goto L_0x00af
            if (r9 != r5) goto L_0x0042
            java.io.File r1 = r1.A0I
            goto L_0x0052
        L_0x00af:
            java.io.File r1 = r1.A0B
            goto L_0x0052
        L_0x00b2:
            java.io.File r1 = r1.A01
            goto L_0x00cb
        L_0x00b5:
            if (r9 == r3) goto L_0x00c6
            if (r9 == r4) goto L_0x00c3
            if (r9 == r5) goto L_0x00c0
            if (r9 != r2) goto L_0x0042
            java.io.File r1 = r1.A06
            goto L_0x00cb
        L_0x00c0:
            java.io.File r1 = r1.A0K
            goto L_0x0052
        L_0x00c3:
            java.io.File r1 = r1.A0D
            goto L_0x0052
        L_0x00c6:
            java.io.File r1 = r1.A05
            goto L_0x00cb
        L_0x00c9:
            java.io.File r1 = r1.A00
        L_0x00cb:
            r3 = 0
            goto L_0x0052
        L_0x00cd:
            java.io.File r1 = r6.A0F()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20690y0.A0I(int, int, int):java.io.File");
    }

    public File A0R(String str) {
        File A0A2 = A0A();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A0A2, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0S(String str) {
        File A0B2 = A0B();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".txt");
        return new File(A0B2, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0T(String str) {
        File A0C2 = A0C();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A0C2, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0V(String str) {
        File A0D2 = A0D();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A0D2, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public File A0X(String str) {
        return A02(A0E(), str);
    }

    public File A0Y(String str) {
        File file = A08().A09;
        A07(file, false);
        return A02(file, str);
    }

    public File A0Z(String str) {
        String A042 = C18750th.A04(str);
        File file = A08().A0Q;
        A07(file, false);
        C18740tg.A06(A042);
        return A02(file, A042);
    }

    public File A0a(String str, String str2) {
        File A0U = A0U(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A0U, sb.toString().replaceAll("[?:\\\\/*\"<>|\n\t\r]", ""));
    }

    public void A0g(Runnable runnable, List list) {
        int size = list.size();
        String[] strArr = new String[list.size()];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((File) list.get(i)).getAbsolutePath();
        }
        MediaScannerConnection.scanFile(this.A01.A00, strArr, (String[]) null, new AnonymousClass3WU(runnable, new AtomicInteger(size)));
    }

    public boolean A0h(File file) {
        return file.getCanonicalPath().startsWith(A08().A0R.getCanonicalPath());
    }

    public boolean A0i(File file) {
        if (file.getCanonicalPath().startsWith(A08().A03.getCanonicalPath()) || file.getCanonicalPath().startsWith(A08().A09.getCanonicalPath())) {
            return true;
        }
        return false;
    }

    public boolean A0j(File file) {
        if (!A0h(file)) {
            return false;
        }
        String canonicalPath = file.getCanonicalPath();
        AnonymousClass3BP A082 = A08();
        if (canonicalPath.startsWith(A082.A0H.getCanonicalPath()) || canonicalPath.startsWith(A082.A0I.getCanonicalPath()) || canonicalPath.startsWith(A082.A0J.getCanonicalPath()) || canonicalPath.startsWith(A082.A0K.getCanonicalPath()) || canonicalPath.startsWith(A082.A0L.getCanonicalPath()) || canonicalPath.startsWith(A082.A0M.getCanonicalPath()) || canonicalPath.startsWith(A082.A0A.getCanonicalPath()) || canonicalPath.startsWith(A082.A0B.getCanonicalPath()) || canonicalPath.startsWith(A082.A0C.getCanonicalPath()) || canonicalPath.startsWith(A082.A0D.getCanonicalPath()) || canonicalPath.startsWith(A082.A0E.getCanonicalPath()) || canonicalPath.startsWith(A082.A04.getCanonicalPath()) || canonicalPath.startsWith(A082.A0G.getCanonicalPath()) || canonicalPath.startsWith(A082.A0O.getCanonicalPath())) {
            return false;
        }
        return true;
    }
}
