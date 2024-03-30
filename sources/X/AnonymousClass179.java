package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.UserManager;
import java.io.File;

/* renamed from: X.179  reason: invalid class name */
public class AnonymousClass179 {
    public final C19630wG A00;
    public final AnonymousClass005 A01 = new C18910u1((Object) null, new C36251k0(this, 2));
    public final C20830yE A02;
    public final C19420v0 A03;

    public static boolean A01() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return false;
        }
        if (!UserManager.supportsMultipleUsers() || Build.VERSION.PREVIEW_SDK_INT > 0 || i >= 30) {
            return true;
        }
        return false;
    }

    public File A02() {
        return new File((File) this.A01.get(), "Backups");
    }

    public File A03() {
        return new File((File) this.A01.get(), "Databases");
    }

    public File A04() {
        return new File((File) this.A01.get(), "Media");
    }

    public File A06(File file) {
        String substring;
        if (file == null) {
            return null;
        }
        if (!file.isAbsolute()) {
            substring = file.getPath();
        } else {
            int indexOf = file.getAbsolutePath().indexOf("Media/WhatsApp ");
            if (A0B(file) || indexOf <= 0) {
                return file;
            }
            substring = file.getAbsolutePath().substring(indexOf);
        }
        return A07(substring);
    }

    public File A07(String str) {
        return new File((File) this.A01.get(), str);
    }

    public void A09(String str) {
        C19420v0.A00(this.A03).putString("external_storage_type", str).commit();
    }

    public boolean A0A() {
        return "scoped".equals(((SharedPreferences) this.A03.A00.get()).getString("external_storage_type", (String) null));
    }

    public AnonymousClass179(C19630wG r4, C20830yE r5, C19420v0 r6) {
        this.A00 = r4;
        this.A03 = r6;
        this.A02 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if ("legacy".equals(r6) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(X.AnonymousClass179 r7) {
        /*
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = "WhatsApp"
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r0)
            X.0v0 r0 = r7.A03
            X.005 r0 = r0.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "external_storage_type"
            r0 = 0
            java.lang.String r6 = r2.getString(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "externaldir/saved storage is "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = A01()
            java.lang.String r4 = "legacy"
            if (r0 != 0) goto L_0x0042
            boolean r0 = r4.equals(r6)
            if (r0 != 0) goto L_0x0041
        L_0x003e:
            r7.A09(r4)
        L_0x0041:
            return r5
        L_0x0042:
            java.io.File r3 = r7.A05()
            if (r3 != 0) goto L_0x004e
            java.lang.String r0 = "externaldir/scoped dir is supported, but isn't provided by the system"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r5
        L_0x004e:
            java.lang.String r2 = "scoped"
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L_0x006a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x006b
            boolean r0 = X.C54062sL.A00()
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "externaldir/switching to scoped since os disabled legacy storage"
        L_0x0064:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r7.A09(r2)
        L_0x006a:
            return r3
        L_0x006b:
            X.0yE r0 = r7.A02
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x007c
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "externaldir/no legacy root so switching to scoped"
            goto L_0x0064
        L_0x007c:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x003e
            if (r6 != 0) goto L_0x003e
            java.lang.String r0 = "externaldir/it is a new installation so switching to scoped"
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass179.A00(X.179):java.io.File");
    }

    public File A05() {
        File[] externalMediaDirs;
        File file;
        if (!A01() || (externalMediaDirs = this.A00.A00.getExternalMediaDirs()) == null || externalMediaDirs.length <= 0 || (file = externalMediaDirs[0]) == null) {
            return null;
        }
        return new File(file, "WhatsApp");
    }

    public String A08(File file) {
        if (!file.isAbsolute()) {
            return file.getPath();
        }
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(((File) this.A01.get()).getAbsolutePath());
        sb.append("/");
        return absolutePath.replace(sb.toString(), "");
    }

    public boolean A0B(File file) {
        return file.getAbsolutePath().startsWith(((File) this.A01.get()).getAbsolutePath());
    }
}
