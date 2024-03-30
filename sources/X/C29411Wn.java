package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.1Wn  reason: invalid class name and case insensitive filesystem */
public class C29411Wn implements C19710wO {
    public final C19460v5 A00;
    public final C19700wN A01;
    public final C19730wQ A02;
    public final AnonymousClass1NG A03;
    public final AnonymousClass1Pp A04;
    public final AnonymousClass16D A05;
    public final AnonymousClass171 A06;
    public final C27761Ps A07;
    public final C21060yb A08;
    public final C19630wG A09;
    public final C20830yE A0A;
    public final C19420v0 A0B;
    public final C220412q A0C;
    public final AnonymousClass1A5 A0D;
    public final AnonymousClass1FI A0E;
    public final AnonymousClass17X A0F;
    public final AnonymousClass17Y A0G;
    public final C19770wU A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r7 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.content.Context r9, X.AnonymousClass141 r10, java.lang.String r11) {
        /*
            r8 = this;
            r6 = r10
            r7 = r11
            if (r11 != 0) goto L_0x000d
            X.171 r0 = r8.A06
            java.lang.String r7 = r0.A0H(r10)
            r2 = 0
            if (r7 == 0) goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x002a
            if (r2 == 0) goto L_0x002c
            java.lang.String r0 = "WaShortcutsHelper/publishShortcut"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Pp r1 = r8.A04
            X.16D r2 = r8.A05
            X.171 r3 = r8.A06
            X.0yb r5 = r8.A08
            X.1Ps r4 = r8.A07
            r0 = r9
            X.C65953Uc.A0G(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0029:
            return
        L_0x002a:
            if (r2 != 0) goto L_0x0029
        L_0x002c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "No valid display name for contact "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            com.whatsapp.util.Log.e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29411Wn.A04(android.content.Context, X.141, java.lang.String):void");
    }

    public String BIB() {
        return "WaShortcutsHelper";
    }

    public /* synthetic */ void BRL() {
    }

    public static AnonymousClass0X5 A00(Context context) {
        AnonymousClass0Y4 r5 = new AnonymousClass0Y4(context, "open_camera");
        String string = context.getString(R.string.f12nameremoved);
        AnonymousClass0X5 r4 = r5.A00;
        r4.A0K = string;
        Objects.requireNonNull(context);
        r4.A0I = IconCompat.A02(context.getResources(), context.getPackageName(), R.drawable.ic_shortcut_camera_alt);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.camera.LauncherCameraActivity");
        intent.putExtra("media_sharing_user_journey_origin", 31);
        r4.A0P = new Intent[]{intent.addFlags(268435456).setAction("android.intent.action.VIEW")};
        return r5.A00();
    }

    public static AnonymousClass0X5 A01(C29411Wn r12, AnonymousClass141 r13, boolean z, boolean z2) {
        Intent intent;
        Bitmap bitmap;
        Context context = r12.A09.A00;
        AnonymousClass141 r8 = r13;
        String A022 = AnonymousClass3TB.A02(r12.A06.A0H(r13));
        if (z2) {
            AnonymousClass11F r0 = r13.A0H;
            C18740tg.A06(r0);
            String rawString = r0.getRawString();
            intent = AnonymousClass190.A0F(context, 0);
            intent.setAction("android.intent.action.MAIN");
            intent.addFlags(335544320);
            intent.putExtra("jid", rawString);
        } else {
            intent = new Intent();
            intent.setAction("com.whatsapp.Conversation");
            intent.addFlags(335544320);
            AnonymousClass11F r02 = r13.A0H;
            C18740tg.A06(r02);
            intent.putExtra("jid", r02.getRawString());
        }
        intent.putExtra("displayname", A022);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        if (z) {
            bitmap = r12.A07.A07(context, r8, context.getResources().getDimension(R.dimen.f7nameremoved), dimensionPixelSize, false);
            if (bitmap == null) {
                AnonymousClass1Pp r1 = r12.A04;
                bitmap = r1.A03(context, r1.A02(r13));
                if (!(bitmap.getWidth() == dimensionPixelSize && bitmap.getHeight() == dimensionPixelSize)) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true);
                }
            }
        } else {
            bitmap = null;
        }
        AnonymousClass3M9.A02(intent, "ShortcutIntentHelper");
        if (A022 == null) {
            r12.A01.A0E("UnexpectedNull/WaShortcutsHelper/ShortcutName", (String) null, true);
        }
        AnonymousClass11F r03 = r13.A0H;
        C18740tg.A06(r03);
        AnonymousClass0Y4 r5 = new AnonymousClass0Y4(context, r03.getRawString());
        AnonymousClass0X5 r14 = r5.A00;
        r14.A0P = new Intent[]{intent};
        r14.A0K = A022;
        if (bitmap != null) {
            r14.A0I = IconCompat.A03(bitmap);
        }
        return r5.A00();
    }

    public void A02() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            Log.i("WaShortcutsHelper/deletealldynamicshortcuts");
            AnonymousClass0Z4.A05(this.A09.A00);
        }
        if (i >= 30) {
            Log.i("WaShortcutsHelper/deleteallcachedshortcuts");
            C65953Uc.A0A(this.A09.A00);
        }
    }

    public void A03() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0H.Boz(new C35671j4(this, 3), "WaShortcutsHelper/updateAppShortcuts");
        }
    }

    public void A05(AnonymousClass141 r5) {
        Context context = this.A09.A00;
        AnonymousClass0X5 A012 = A01(this, r5, true, false);
        if (AnonymousClass0Z4.A08(context)) {
            AnonymousClass0Z4.A06(context, A012);
            if (Build.VERSION.SDK_INT >= 26) {
                return;
            }
        } else {
            Intent A013 = AnonymousClass0Z4.A01(context, A012);
            A013.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
            context.sendBroadcast(A013);
        }
        this.A0G.A06(R.string.f12nameremoved, 1);
    }

    public void A06(AnonymousClass141 r4) {
        Context context = this.A09.A00;
        if (Build.VERSION.SDK_INT >= 26) {
            C65953Uc.A0H(context, r4);
            return;
        }
        Intent A012 = AnonymousClass0Z4.A01(context, A01(this, r4, false, false));
        A012.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        context.sendBroadcast(A012);
    }

    public void A07(AnonymousClass11F r3) {
        if (Build.VERSION.SDK_INT >= 30) {
            Log.i("WaShortcutsHelper/removeShortcutFromCache");
            C65953Uc.A0I(this.A09.A00, r3);
        }
    }

    public void BRM() {
        if (Build.VERSION.SDK_INT >= 23) {
            C19730wQ r0 = this.A02;
            r0.A0G();
            if (r0.A03 != null) {
                C19420v0 r13 = this.A0B;
                if (((SharedPreferences) r13.A00.get()).getInt("sharing_shortcuts_version", 0) != 1) {
                    Context context = this.A09.A00;
                    C19700wN r15 = this.A01;
                    C220412q r10 = this.A0C;
                    AnonymousClass1Pp r9 = this.A04;
                    AnonymousClass16D r8 = this.A05;
                    AnonymousClass171 r7 = this.A06;
                    C21060yb r6 = this.A08;
                    AnonymousClass1NG r5 = this.A03;
                    C19460v5 r4 = this.A00;
                    C20830yE r3 = this.A0A;
                    AnonymousClass1FI r2 = this.A0E;
                    AnonymousClass17X r1 = this.A0F;
                    C27761Ps r02 = this.A07;
                    AnonymousClass1A5 r25 = this.A0D;
                    C20830yE r23 = r3;
                    C21060yb r22 = r6;
                    C27761Ps r21 = r02;
                    AnonymousClass171 r20 = r7;
                    AnonymousClass16D r19 = r8;
                    AnonymousClass1Pp r18 = r9;
                    AnonymousClass1NG r17 = r5;
                    C19700wN r16 = r15;
                    C19460v5 r152 = r4;
                    Context context2 = context;
                    C65953Uc.A0E(context2, r152, r16, r17, r18, r19, r20, r21, r22, r23, r10, r25, r2, r1);
                    C19420v0.A00(r13).putInt("sharing_shortcuts_version", 1).apply();
                }
            }
        }
    }

    public C29411Wn(C19460v5 r2, C19700wN r3, AnonymousClass17Y r4, C19730wQ r5, AnonymousClass1NG r6, AnonymousClass1Pp r7, AnonymousClass16D r8, AnonymousClass171 r9, C27761Ps r10, C21060yb r11, C19630wG r12, C20830yE r13, C19420v0 r14, C220412q r15, AnonymousClass1A5 r16, AnonymousClass1FI r17, AnonymousClass17X r18, C19770wU r19) {
        this.A0G = r4;
        this.A09 = r12;
        this.A01 = r3;
        this.A0H = r19;
        this.A02 = r5;
        this.A0C = r15;
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r9;
        this.A08 = r11;
        this.A03 = r6;
        this.A0A = r13;
        this.A00 = r2;
        this.A0B = r14;
        this.A0E = r17;
        this.A0F = r18;
        this.A07 = r10;
        this.A0D = r16;
    }
}
