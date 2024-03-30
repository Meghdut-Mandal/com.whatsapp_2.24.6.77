package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.2e6  reason: invalid class name and case insensitive filesystem */
public class C47232e6 extends AnonymousClass3T0 {
    public static final AnonymousClass37Q A07 = new AnonymousClass37Q(C36381kD.A0m(), "DEFAULT", (String) null);
    public final C001700s A00 = C36441kJ.A0Z(C36381kD.A0m());
    public final AnonymousClass17Y A01;
    public final AnonymousClass2e5 A02;
    public final AnonymousClass1GX A03;
    public final C19770wU A04;
    public final C19460v5 A05;
    public final C19970wo A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47232e6(X.C19460v5 r13, X.AnonymousClass17Y r14, X.C19730wQ r15, X.C24431Ck r16, X.AnonymousClass179 r17, X.C24341Cb r18, X.C19970wo r19, X.C19630wG r20, X.AnonymousClass1CY r21, X.C20840yF r22, X.AnonymousClass2e5 r23, X.AnonymousClass1CQ r24, X.C24391Cg r25, X.AnonymousClass1CS r26, X.AnonymousClass1GX r27, X.C19770wU r28) {
        /*
            r12 = this;
            r11 = r26
            r9 = r24
            r2 = r15
            r1 = r12
            r10 = r25
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Integer r0 = X.C36381kD.A0m()
            X.00s r0 = X.C36441kJ.A0Z(r0)
            r12.A00 = r0
            r0 = r19
            r12.A06 = r0
            r12.A01 = r14
            r0 = r27
            r12.A03 = r0
            r0 = r28
            r12.A04 = r0
            r0 = r23
            r12.A02 = r0
            r12.A05 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47232e6.<init>(X.0v5, X.17Y, X.0wQ, X.1Ck, X.179, X.1Cb, X.0wo, X.0wG, X.1CY, X.0yF, X.2e5, X.1CQ, X.1Cg, X.1CS, X.1GX, X.0wU):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C62413Gb A01(android.content.Context r7, X.AnonymousClass37Q r8, boolean r9) {
        /*
            java.lang.String r2 = r8.A01
            X.C18740tg.A06(r2)
            android.content.res.Resources r5 = r7.getResources()
            int r0 = r2.hashCode()
            r4 = 2
            r3 = 1
            r6 = 0
            switch(r0) {
                case -2032180703: goto L_0x001c;
                case -1770733785: goto L_0x0029;
                case -899329064: goto L_0x002c;
                case 175331287: goto L_0x0076;
                case 1804184360: goto L_0x0095;
                default: goto L_0x0013;
            }
        L_0x0013:
            r3 = 0
        L_0x0014:
            java.lang.Integer r1 = r8.A00
            X.3Gb r0 = new X.3Gb
            r0.<init>(r3, r1, r2, r9)
            return r0
        L_0x001c:
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            android.graphics.drawable.BitmapDrawable r3 = X.AnonymousClass3U7.A02(r7, r5)
            goto L_0x0014
        L_0x0029:
            java.lang.String r0 = "DOWNLOADED"
            goto L_0x0078
        L_0x002c:
            java.lang.String r0 = "COLOR_WITH_WA_OVERLAY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            r5 = 0
            java.lang.String r0 = r8.A02     // Catch:{ NumberFormatException -> 0x003d }
            if (r0 == 0) goto L_0x003d
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x003d }
        L_0x003d:
            r1 = 0
            java.lang.String r0 = r8.A02     // Catch:{ NumberFormatException -> 0x0046 }
            if (r0 == 0) goto L_0x0046
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0046 }
        L_0x0046:
            android.graphics.drawable.BitmapDrawable r0 = X.AnonymousClass3U7.A01(r7, r1, r3)
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
            r4[r6] = r0
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2130903076(0x7f030024, float:1.741296E38)
            int[] r0 = r1.getIntArray(r0)
            r1 = r0[r5]
            r0 = 2131234507(0x7f080ecb, float:1.8085182E38)
            android.graphics.drawable.Drawable r0 = X.C36381kD.A0H(r7, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A08(r0, r1)
            r4[r3] = r0
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r0.<init>(r4)
            android.graphics.Bitmap r0 = X.AnonymousClass3UF.A00(r0)
            android.graphics.drawable.BitmapDrawable r3 = X.C36421kH.A0C(r7, r0)
            goto L_0x0014
        L_0x0076:
            java.lang.String r0 = "USER_PROVIDED"
        L_0x0078:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r8.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getPath()
            X.C18740tg.A06(r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            android.graphics.drawable.BitmapDrawable r3 = X.AnonymousClass3U7.A03(r7, r5, r0)
            goto L_0x0014
        L_0x0095:
            java.lang.String r0 = "COLOR_ONLY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            r1 = 0
            java.lang.String r0 = r8.A02     // Catch:{ NumberFormatException -> 0x00a6 }
            if (r0 == 0) goto L_0x00a6
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00a6 }
        L_0x00a6:
            android.graphics.drawable.BitmapDrawable r3 = X.AnonymousClass3U7.A01(r7, r1, r3)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47232e6.A01(android.content.Context, X.37Q, boolean):X.3Gb");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r6.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r0 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r7 = r10.getResources().getIntArray(com.whatsapp.R.array.f3nameremoved)[r2];
        r4 = r10.getResources().getIntArray(com.whatsapp.R.array.f3nameremoved);
        r3 = r4.length;
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r2 >= r3) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r4[r2] == r7) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        r1 = r1 + 1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r2 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r6.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r1 = X.C36441kJ.A0w(r10.getFilesDir(), "wallpaper.jpg");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (r1.exists() == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        r1 = android.net.Uri.fromFile(r1).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r2 = new X.AnonymousClass37Q(0, r6, r1);
        A04(r10, (X.AnonymousClass11F) null, r2, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass37Q A03(android.content.Context r10, boolean r11) {
        /*
            r9 = this;
            X.1CQ r0 = r9.A08
            r5 = 0
            X.37Q r2 = r0.BJC(r5, r11)
            if (r2 != 0) goto L_0x0027
            X.2e5 r1 = r9.A02
            r0 = 1
            X.2e7 r1 = r1.A0E(r10, r0)
            java.lang.String r6 = r1.A02
            int r0 = r6.hashCode()
            r8 = 0
            switch(r0) {
                case -1770733785: goto L_0x006c;
                case -899329064: goto L_0x002e;
                case 175331287: goto L_0x002b;
                case 1804184360: goto L_0x0028;
                default: goto L_0x001a;
            }
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.37Q r2 = new X.37Q
            r2.<init>(r0, r6, r1)
            A04(r10, r5, r2, r9)
        L_0x0027:
            return r2
        L_0x0028:
            java.lang.String r0 = "COLOR_ONLY"
            goto L_0x0030
        L_0x002b:
            java.lang.String r0 = "USER_PROVIDED"
            goto L_0x006e
        L_0x002e:
            java.lang.String r0 = "COLOR_WITH_WA_OVERLAY"
        L_0x0030:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r0 = r1.A00
            if (r0 != 0) goto L_0x0061
            r2 = 0
        L_0x003b:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903070(0x7f03001e, float:1.7412948E38)
            int[] r0 = r1.getIntArray(r0)
            r7 = r0[r2]
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903071(0x7f03001f, float:1.741295E38)
            int[] r4 = r1.getIntArray(r0)
            int r3 = r4.length
            r2 = 0
            r1 = 0
        L_0x0056:
            if (r2 >= r3) goto L_0x0066
            r0 = r4[r2]
            if (r0 == r7) goto L_0x0067
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0061:
            int r2 = r0.intValue()
            goto L_0x003b
        L_0x0066:
            r1 = 0
        L_0x0067:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x001b
        L_0x006c:
            java.lang.String r0 = "DOWNLOADED"
        L_0x006e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.io.File r1 = r10.getFilesDir()
            java.lang.String r0 = "wallpaper.jpg"
            java.io.File r1 = X.C36441kJ.A0w(r1, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x001a
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            java.lang.String r1 = r0.toString()
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47232e6.A03(android.content.Context, boolean):X.37Q");
    }

    public static void A05(C47232e6 r5) {
        File[] listFiles;
        AnonymousClass1CR r4 = (AnonymousClass1CR) r5.A08;
        AnonymousClass1M0 A042 = r4.A0P().A04();
        try {
            C224114e r2 = A042.A02;
            r2.A0D("UPDATE settings SET wallpaper_light_type = NULL, wallpaper_light_value = NULL, wallpaper_dark_type = NULL, wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid != 'individual_chat_defaults'", "RESET_ALL_CUSTOM_WALLPAPERS");
            r2.A0D("UPDATE settings SET wallpaper_light_type = 'DEFAULT', wallpaper_light_value = NULL, wallpaper_dark_type = 'DEFAULT', wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid = 'individual_chat_defaults'", "RESET_GLOBAL_WALLPAPER_TO_DEFAULT");
            A042.close();
            r4.A0I.clear();
            File A0w = C36441kJ.A0w(r5.A01.A00.getFilesDir(), "Wallpapers");
            if (A0w.exists() && (listFiles = A0w.listFiles()) != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static AnonymousClass00I A00(Context context, AnonymousClass11F r6, C47232e6 r7) {
        AnonymousClass37Q BJC;
        boolean A0A = AnonymousClass1RC.A0A(context);
        boolean z = true;
        boolean A1W = AnonymousClass000.A1W(r6);
        C19460v5 r1 = r7.A05;
        if (r1.A05() && C36441kJ.A0f(r1).BLB(r6)) {
            BJC = A07;
        } else if (r6 == null) {
            BJC = r7.A03(context, A0A);
        } else {
            BJC = r7.A08.BJC(r6, A0A);
            if (BJC == null) {
                BJC = r7.A03(context, A0A);
            } else {
                z = A1W;
            }
            A1W = z;
        }
        return C36441kJ.A0W(BJC, Boolean.valueOf(A1W));
    }

    public static AnonymousClass37Q A02(Context context, BitmapDrawable bitmapDrawable, AnonymousClass11F r7, C47232e6 r8) {
        FileOutputStream fileOutputStream;
        String A042 = C18750th.A04(String.valueOf(System.currentTimeMillis()));
        if (A042 == null) {
            A042 = String.valueOf(System.currentTimeMillis());
        }
        File A0w = C36441kJ.A0w(context.getFilesDir(), "Wallpapers");
        A0w.mkdirs();
        File A0w2 = C36441kJ.A0w(A0w, A042);
        if (!A0w2.exists()) {
            try {
                fileOutputStream = new FileOutputStream(A0w2);
                bitmapDrawable.getBitmap().compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e("wallpaper/v2/save-wallpaper-file/failed to save wallpaper", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        AnonymousClass37Q r0 = new AnonymousClass37Q(C36431kI.A14(), "USER_PROVIDED", Uri.fromFile(A0w2).toString());
        A04(context, r7, r0, r8);
        return r0;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1.equalsIgnoreCase(r8.A02) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r6 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if ("USER_PROVIDED".equalsIgnoreCase(r6.A01) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r2 != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r1 = android.net.Uri.parse(r6.A02).getPath();
        X.C18740tg.A06(r1);
        new java.io.File(r1).delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if ("USER_PROVIDED".equalsIgnoreCase(r8.A01) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.content.Context r6, X.AnonymousClass11F r7, X.AnonymousClass37Q r8, X.C47232e6 r9) {
        /*
            boolean r5 = X.AnonymousClass1RC.A0A(r6)
            X.1CQ r4 = r9.A08
            X.37Q r6 = r4.BJC(r7, r5)
            if (r8 == 0) goto L_0x0017
            java.lang.String r1 = r8.A01
            java.lang.String r0 = "USER_PROVIDED"
            boolean r1 = r0.equalsIgnoreCase(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3 = 1
            if (r0 == 0) goto L_0x002a
            if (r6 == 0) goto L_0x004e
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r8.A02
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002a:
            r2 = 0
            if (r6 == 0) goto L_0x004e
        L_0x002d:
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "USER_PROVIDED"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x004e
            if (r2 != 0) goto L_0x004e
            java.lang.String r0 = r6.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getPath()
            X.C18740tg.A06(r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r0.delete()
        L_0x004e:
            r9.A00 = r3
            r4.BpI(r7, r8, r5)
            if (r7 == 0) goto L_0x005a
            r0 = r5 ^ 1
            r4.BpI(r7, r8, r0)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47232e6.A04(android.content.Context, X.11F, X.37Q, X.2e6):void");
    }
}
