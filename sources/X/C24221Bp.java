package X;

import java.io.File;

/* renamed from: X.1Bp  reason: invalid class name and case insensitive filesystem */
public final class C24221Bp {
    public final C20690y0 A00;
    public final C24041Av A01;
    public final C19630wG A02;
    public final C24171Bj A03;

    public C24221Bp(C20690y0 r2, C24041Av r3, C19630wG r4, C24171Bj r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r5, 4);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }

    public File A00(AnonymousClass690 r4, String[] strArr) {
        File cacheDir = this.A02.A00.getCacheDir();
        AnonymousClass00C.A08(cacheDir);
        File file = new File(cacheDir, "avatar-temporary");
        if (!(strArr == null || strArr.length == 0)) {
            file = A02(strArr);
        }
        file.mkdirs();
        StringBuilder sb = new StringBuilder();
        sb.append(r4.A00);
        sb.append(".webp");
        return new File(file, sb.toString());
    }

    public File A01(C135066c4 r8) {
        File A002;
        String str = r8.A06;
        if (str == null) {
            return null;
        }
        File A003 = A00(new AnonymousClass690(str), (String[]) null);
        A003.getAbsolutePath();
        if (!A003.exists() || A003.length() <= 0) {
            A003.createNewFile();
            A002 = this.A03.A00(r8, A003, true);
            if (A002 == null) {
                return null;
            }
        } else {
            A002 = A003;
        }
        r8.A0A = A003.getAbsolutePath();
        return A002;
    }

    public File A02(String[] strArr) {
        String str;
        File cacheDir = this.A02.A00.getCacheDir();
        AnonymousClass00C.A08(cacheDir);
        File file = new File(cacheDir, "avatar-temporary");
        if (strArr != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("social/social-");
            sb.append(AnonymousClass02R.A09("-", "", "", strArr));
            str = sb.toString();
        } else {
            str = "social";
        }
        return new File(file, str);
    }

    public void A03() {
        File cacheDir = this.A02.A00.getCacheDir();
        AnonymousClass00C.A08(cacheDir);
        File file = new File(cacheDir, "avatar-temporary");
        file.mkdirs();
        C14360lV.A00(file);
    }
}
