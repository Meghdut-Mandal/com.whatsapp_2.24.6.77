package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3BP  reason: invalid class name */
public class AnonymousClass3BP {
    public final File A00;
    public final File A01;
    public final File A02;
    public final File A03;
    public final File A04;
    public final File A05;
    public final File A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0A;
    public final File A0B;
    public final File A0C;
    public final File A0D;
    public final File A0E;
    public final File A0F;
    public final File A0G;
    public final File A0H;
    public final File A0I;
    public final File A0J;
    public final File A0K;
    public final File A0L;
    public final File A0M;
    public final File A0N;
    public final File A0O;
    public final File A0P;
    public final File A0Q;
    public final File A0R;
    public final /* synthetic */ C20690y0 A0S;

    public AnonymousClass3BP(C20690y0 r13) {
        this.A0S = r13;
        AnonymousClass005 r3 = r13.A03;
        File A042 = ((AnonymousClass179) r3.get()).A04();
        C20690y0.A07(A042, false);
        this.A0R = A042;
        File A072 = ((AnonymousClass179) r3.get()).A07(".Shared");
        C20690y0.A07(A072, true);
        this.A03 = A072;
        Context context = r13.A01.A00;
        this.A09 = A00(context.getFilesDir(), ".Shared", false);
        File A002 = A00(A042, C20690y0.A0A, false);
        this.A01 = A002;
        File A003 = A00(A042, C20690y0.A09, false);
        this.A00 = A003;
        this.A0O = A00(A042, C20690y0.A0I, true);
        this.A0G = A00(A042, C20690y0.A0F, true);
        String str = C20690y0.A0H;
        File A004 = A00(A042, str, false);
        this.A0N = A004;
        String str2 = C20690y0.A0D;
        File A005 = A00(A042, str2, false);
        this.A05 = A005;
        File A006 = A00(A042, C20690y0.A0C, false);
        this.A02 = A006;
        this.A0P = A00(A042, "WallPaper", false);
        this.A0F = A00(A042, C20690y0.A0E, false);
        this.A0Q = A00(A042, ".Links", true);
        this.A0M = A00(A042, ".Statuses", true);
        this.A08 = A00(context.getFilesDir(), "ViewOnce", true);
        this.A06 = A00(context.getFilesDir(), str2, true);
        this.A07 = A00(context.getFilesDir(), str, true);
        File A0w = C36441kJ.A0w(A042, C20690y0.A0B);
        if (A0w.exists()) {
            AnonymousClass6YY.A0Q(A0w);
            Log.i("fmessageio/initExternalStorageDirectory calls dir removed");
        }
        this.A0I = A00(A002, "Sent", true);
        this.A0H = A00(A003, "Sent", true);
        this.A0L = A00(A004, "Sent", true);
        this.A0K = A00(A005, "Sent", true);
        this.A0J = A00(A006, "Sent", true);
        this.A0D = C20690y0.A01(r13, C36441kJ.A0w(A005, "Private"), " Images");
        this.A0B = C20690y0.A01(r13, C36441kJ.A0w(A002, "Private"), " Audio");
        this.A0A = C20690y0.A01(r13, C36441kJ.A0w(A003, "Private"), " Animated Gifs");
        this.A0E = C20690y0.A01(r13, C36441kJ.A0w(A004, "Private"), " Video");
        this.A0C = C20690y0.A01(r13, C36441kJ.A0w(A006, "Private"), " Documents");
        this.A04 = C20690y0.A01(r13, C36441kJ.A0w(A042, C20690y0.A0G), " Stickers");
    }

    public static File A00(File file, String str, boolean z) {
        File file2 = new File(file, str);
        C20690y0.A07(file2, z);
        return file2;
    }
}
