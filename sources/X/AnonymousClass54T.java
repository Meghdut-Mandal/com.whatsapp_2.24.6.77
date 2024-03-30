package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Environment;
import android.view.WindowManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.54T  reason: invalid class name */
public class AnonymousClass54T extends AnonymousClass1CP {
    public final C19730wQ A00;
    public final C24341Cb A01;
    public final C19630wG A02;
    public final C20830yE A03;
    public final AnonymousClass1CY A04;
    public final C24391Cg A05;
    public final AnonymousClass1CS A06;

    public String A0J() {
        return "wallpaper-v2";
    }

    public ArrayList A0K(File file) {
        return AnonymousClass6YO.A07(file, "wallpaper.bkup", AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT14));
    }

    public AnonymousClass54T(C19730wQ r1, C24341Cb r2, C19630wG r3, C20830yE r4, AnonymousClass1CY r5, C24421Cj r6, C24391Cg r7, AnonymousClass1CS r8) {
        super(r6);
        this.A02 = r3;
        this.A06 = r8;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r7;
    }

    public void A0H(C1042758y r2, double d) {
        r2.A0S = Double.valueOf(d);
    }

    public void A0L(C1042758y r2, double d) {
        r2.A0T = Double.valueOf(d);
    }

    public void A0M(C1042758y r2, double d) {
        r2.A0R = Double.valueOf(d);
    }

    public boolean A0N(Context context, File file) {
        AnonymousClass5U6 r9;
        int i;
        String str;
        File A0w = C36441kJ.A0w(context.getFilesDir(), "wallpaper.jpg");
        File A0w2 = C36441kJ.A0w(context.getFilesDir(), "wallpaper.bkup");
        File file2 = file;
        try {
            int A012 = AnonymousClass6YO.A01(file2.getName(), "wallpaper.bkup");
            if (A012 <= 0 || (r9 = AnonymousClass5U6.A02(A012)) == null) {
                r9 = AnonymousClass5U6.UNENCRYPTED;
            }
            AnonymousClass1CS r10 = this.A06;
            C19730wQ r2 = this.A00;
            AnonymousClass1CY r6 = this.A04;
            C1257861g A052 = C109765Za.A00(r2, (C132716Uy) null, this.A01, this.A01, r6, this.A04, this.A05, r9, r10, file2, (Boolean) null).A05(this.A02, (C158587hk) null, A0w2, 0, 0, false);
            if (A052.A00 != 1) {
                str = AnonymousClass000.A0l(A052, "wallpaper/restore/failed to restore ", AnonymousClass000.A0u());
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(A0w2.getAbsolutePath(), options);
                int i2 = options.outWidth;
                WindowManager A013 = C21060yb.A01(context);
                Point point = new Point();
                A013.getDefaultDisplay().getSize(point);
                if (C36341k9.A04(context) == 1) {
                    i = point.x;
                } else {
                    i = point.y;
                }
                if (i != i2) {
                    str = "wallpaper/restore skipping final rename due to size mismatch";
                } else if (!A0w2.renameTo(A0w)) {
                    Log.e("wallpaper/restore could not rename tmp file");
                    return false;
                } else {
                    Log.i("wallpaper/restore complete");
                    return true;
                }
            }
            Log.w(str);
            return false;
        } catch (Exception e) {
            Log.w("wallpaper/restore/ioerror ", e);
            return false;
        }
    }

    public AnonymousClass6PN A0O(AnonymousClass5U6 r21) {
        AnonymousClass5U6 r12 = r21;
        File A032 = AnonymousClass5U6.A03(this, r12, "wallpaper.bkup.crypt", AnonymousClass000.A0u());
        Iterator it = AnonymousClass6YO.A07(A0E(r12), "wallpaper.bkup", AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT14)).iterator();
        while (it.hasNext()) {
            File A0a = C90504aG.A0a(it);
            if (!A0a.equals(A032) && A0a.exists()) {
                AnonymousClass6YY.A0Q(A0a);
            }
        }
        Context context = this.A02.A00;
        File A0w = C36441kJ.A0w(context.getFilesDir(), "wallpaper.jpg");
        if (!A0w.exists()) {
            return null;
        }
        File parentFile = A032.getParentFile();
        C18740tg.A06(parentFile);
        C90474aD.A15(parentFile);
        if (!this.A03.A0I(Environment.getExternalStorageState())) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("wallpaper/backup/sdcard_unavailable ");
            C36321k7.A1a(A0u, Environment.getExternalStorageState());
            return new AnonymousClass6PN("wallpaper-v2");
        }
        try {
            AnonymousClass1CS r13 = this.A06;
            C19730wQ r5 = this.A00;
            AnonymousClass1CY r9 = this.A04;
            AnonymousClass6QE A002 = C109765Za.A00(r5, (C132716Uy) null, this.A01, this.A01, r9, this.A04, this.A05, r12, r13, A032, (Boolean) null);
            if (!A002.A08(context)) {
                Log.e("wallpaper/backup/failed to prepare for backup");
                return new AnonymousClass6PN("wallpaper-v2");
            }
            A002.A07((AnonymousClass7fT) null, A0w);
            return new AnonymousClass6PN(A032, (Long) null, "wallpaper-v2", C90514aH.A0K(this, r12), true);
        } catch (Exception e) {
            Log.w("wallpaper/backup/error ", e);
            return new AnonymousClass6PN("wallpaper-v2");
        }
    }
}
