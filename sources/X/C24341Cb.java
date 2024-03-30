package X;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1Cb  reason: invalid class name and case insensitive filesystem */
public class C24341Cb {
    public final AnonymousClass005 A00;
    public final List A01 = new CopyOnWriteArrayList();
    public final AnonymousClass179 A02;
    public final C19630wG A03;
    public final C20830yE A04;
    public final C20060wx A05;
    public final C20840yF A06;
    public final C19770wU A07;

    public C20850yG A00() {
        return (C20850yG) ((AnonymousClass36X) this.A00.get()).A02.get();
    }

    public File A01(File file) {
        C20850yG r1;
        if (this.A02.A0B(file)) {
            r1 = A00();
        } else {
            r1 = this.A06.A00;
        }
        return r1.A01("");
    }

    public boolean A02() {
        AnonymousClass005 r1 = this.A00;
        if (((AnonymousClass36X) r1.get()).A00 || ((AnonymousClass36X) r1.get()).A01) {
            return true;
        }
        return false;
    }

    public C24341Cb(AnonymousClass179 r4, C19630wG r5, C20830yE r6, C20060wx r7, C20840yF r8, C19770wU r9) {
        this.A03 = r5;
        this.A07 = r9;
        this.A02 = r4;
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = r8;
        this.A00 = new C18910u1((Object) null, new C24351Cc(r4, r6, r7));
    }

    public boolean A03(C226515g r4) {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            r4.Bjm(externalStorageState);
            return false;
        } else if (Build.VERSION.SDK_INT < 23 || C19550w8.A07() || this.A04.A03(AnonymousClass3TA.A04()) != -1) {
            return true;
        } else {
            r4.Bjn();
            return false;
        }
    }

    public boolean A04(C226515g r4) {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted_ro".equals(externalStorageState)) {
            r4.Be9(externalStorageState);
            return false;
        } else if (!"mounted".equals(externalStorageState)) {
            r4.Bjm(externalStorageState);
            return false;
        } else if (C19550w8.A07() || this.A04.A02("android.permission.WRITE_EXTERNAL_STORAGE") != -1) {
            return true;
        } else {
            r4.BeA();
            return false;
        }
    }
}
