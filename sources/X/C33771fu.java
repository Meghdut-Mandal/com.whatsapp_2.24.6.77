package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.1fu  reason: invalid class name and case insensitive filesystem */
public class C33771fu {
    public final AnonymousClass179 A00;
    public final C19420v0 A01;
    public final C20050ww A02;
    public final C19600wD A03;
    public final C19970wo A04;
    public final C19630wG A05;
    public final C21080yd A06;
    public final AnonymousClass13J A07;
    public final C20020wt A08;
    public final C19770wU A09;

    public boolean A02() {
        try {
            PackageManager packageManager = this.A05.A00.getPackageManager();
            packageManager.getPackageInfo("com.android.vending", 0);
            return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp")).resolveActivity(packageManager) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void A01() {
        try {
            boolean createNewFile = this.A00.A07("WhatsApp.upgrade").createNewFile();
            StringBuilder sb = new StringBuilder();
            sb.append("upgrade sentinel file created; success=");
            sb.append(createNewFile);
            Log.i(sb.toString());
        } catch (IOException e) {
            Log.e("upgrade/sentinel/fail", e);
        }
    }

    public C33771fu(C20050ww r1, C19600wD r2, AnonymousClass179 r3, C19970wo r4, C19630wG r5, C19420v0 r6, C21080yd r7, AnonymousClass13J r8, C20020wt r9, C19770wU r10) {
        this.A05 = r5;
        this.A04 = r4;
        this.A08 = r9;
        this.A09 = r10;
        this.A02 = r1;
        this.A00 = r3;
        this.A06 = r7;
        this.A01 = r6;
        this.A03 = r2;
        this.A07 = r8;
    }

    public Uri A00() {
        String str;
        if (!A02()) {
            str = "https://www.whatsapp.com/android/current/WhatsApp.apk";
        } else {
            str = "market://details?id=com.whatsapp";
        }
        return Uri.parse(str);
    }
}
