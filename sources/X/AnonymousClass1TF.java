package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1TF  reason: invalid class name */
public final class AnonymousClass1TF {
    public final C19970wo A00;
    public final AnonymousClass1J3 A01;
    public final AnonymousClass1J1 A02;
    public final AnonymousClass1TH A03;
    public final AnonymousClass1C6 A04;
    public final AnonymousClass17Y A05;
    public final C21060yb A06;
    public final C19420v0 A07;
    public final C20810yC A08;
    public final AnonymousClass1TG A09;
    public final C19770wU A0A;

    public AnonymousClass1TF(AnonymousClass17Y r2, C21060yb r3, C19970wo r4, C19420v0 r5, C20810yC r6, AnonymousClass1J3 r7, AnonymousClass1J1 r8, AnonymousClass1TH r9, AnonymousClass1TG r10, AnonymousClass1C6 r11, C19770wU r12) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r12, 3);
        AnonymousClass00C.A0D(r10, 4);
        AnonymousClass00C.A0D(r11, 5);
        AnonymousClass00C.A0D(r8, 6);
        AnonymousClass00C.A0D(r3, 7);
        AnonymousClass00C.A0D(r9, 8);
        AnonymousClass00C.A0D(r7, 9);
        AnonymousClass00C.A0D(r5, 10);
        AnonymousClass00C.A0D(r4, 11);
        this.A08 = r6;
        this.A05 = r2;
        this.A0A = r12;
        this.A09 = r10;
        this.A04 = r11;
        this.A02 = r8;
        this.A06 = r3;
        this.A03 = r9;
        this.A01 = r7;
        this.A07 = r5;
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r10 = r20;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r19, X.AnonymousClass3T1 r20) {
        /*
            r18 = this;
            r0 = 0
            r3 = r19
            X.AnonymousClass00C.A0D(r3, r0)
            r7 = r18
            X.1J3 r0 = r7.A01
            X.0yC r8 = r0.A00
            r0 = 3176(0xc68, float:4.45E-42)
            X.0yV r6 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r6, r8, r0)
            if (r0 == 0) goto L_0x008e
            r10 = r20
            X.3P8 r0 = A00(r10)
            if (r0 == 0) goto L_0x008e
            boolean r0 = r7.A09(r0)
            if (r0 == 0) goto L_0x008e
            X.1J1 r9 = r7.A02
            r11 = 0
            r16 = 11
            r2 = 0
            r17 = 8
            r13 = r11
            r14 = r11
            r15 = r11
            r12 = r11
            X.AnonymousClass1J1.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.3P8 r4 = A00(r10)
            if (r4 == 0) goto L_0x008f
            java.lang.String r5 = r4.A02
            if (r5 != 0) goto L_0x0049
            java.lang.String r0 = r4.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "package_name"
            java.lang.String r5 = r1.getQueryParameter(r0)
        L_0x0049:
            java.lang.String r4 = r7.A02(r4)
            if (r5 == 0) goto L_0x008f
            if (r4 == 0) goto L_0x008f
            r0 = 6758(0x1a66, float:9.47E-42)
            boolean r0 = X.C20800yB.A01(r6, r8, r0)
            if (r0 == 0) goto L_0x0063
            X.1TH r0 = r7.A03
            java.util.Map r0 = r0.A01
            java.lang.Object r2 = r0.get(r5)
            java.lang.String r2 = (java.lang.String) r2
        L_0x0063:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.setPackage(r5)
            java.lang.String r0 = "com.whatsapp.otp.OTP_RETRIEVED"
            r1.setAction(r0)
            java.lang.String r0 = "code"
            r1.putExtra(r0, r4)
            X.C54922tm.A00(r3, r1)
            if (r2 == 0) goto L_0x007f
            java.lang.String r0 = "request_id"
            r1.putExtra(r0, r2)
        L_0x007f:
            r3.sendBroadcast(r1)
            r13 = 3
        L_0x0083:
            r8 = r11
            r14 = 8
            r6 = r9
            r7 = r10
            r9 = r11
            r10 = r11
            r12 = r2
            X.AnonymousClass1J1.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x008e:
            return
        L_0x008f:
            r13 = 13
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TF.A03(android.content.Context, X.3T1):void");
    }

    public final void A04(Context context, AnonymousClass2cW r14, int i) {
        AnonymousClass2cW r4 = r14;
        AnonymousClass00C.A0D(r14, 0);
        AnonymousClass00C.A0D(context, 1);
        UserJid A0L = r14.A0L();
        if (A0L != null) {
            this.A04.A08(A0L, 1);
        }
        AnonymousClass1J1 r3 = this.A02;
        int i2 = i;
        AnonymousClass1J1.A02(r3, r4, 1, (Integer) null, (Long) null, (String) null, (String) null, 0, i2);
        Intent A012 = A01(context, r14);
        if (A012 != null) {
            context.startActivity(A012);
            AnonymousClass1J1.A02(r3, r4, 1, (Integer) null, (Long) null, (String) null, (String) null, 3, i2);
        }
    }

    public final boolean A06(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (A00(r4) != null) {
            if (C20800yB.A01(C21000yV.A02, this.A01.A00, 1023)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A07(AnonymousClass3P8 r5) {
        AnonymousClass00C.A0D(r5, 0);
        if (r5.A0A.get() != 1) {
            return false;
        }
        if (!C20800yB.A01(C21000yV.A02, this.A01.A00, 1023)) {
            return true;
        }
        return false;
    }

    public final boolean A09(AnonymousClass3P8 r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (r4.A0A.get() == 3) {
            if (C20800yB.A01(C21000yV.A02, this.A01.A00, 1023)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.3P8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.3P8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.3P8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.3P8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3P8 A00(X.AnonymousClass3T1 r4) {
        /*
            boolean r0 = r4 instanceof X.AnonymousClass2cW
            r3 = 0
            if (r0 == 0) goto L_0x0029
            X.2cW r4 = (X.AnonymousClass2cW) r4
            X.3F4 r0 = r4.A00
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x0029
            java.util.Iterator r2 = r0.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3P8 r0 = (X.AnonymousClass3P8) r0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0A
            int r0 = r0.get()
            if (r0 == 0) goto L_0x0011
            r3 = r1
        L_0x0027:
            X.3P8 r3 = (X.AnonymousClass3P8) r3
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TF.A00(X.3T1):X.3P8");
    }

    public final String A02(AnonymousClass3P8 r5) {
        String queryParameter;
        C20810yC r1 = this.A08;
        if (C65773Tk.A01(r1, r5)) {
            String A092 = r1.A09(3827);
            if (A092 == null) {
                return null;
            }
            String str = r5.A01;
            AnonymousClass00C.A07(str);
            return AnonymousClass098.A05(str, A092, "", false);
        } else if (!C65773Tk.A02(r1, r5) || (queryParameter = Uri.parse(r5.A01).getQueryParameter("code")) == null) {
            return null;
        } else {
            return AnonymousClass098.A05(queryParameter, "otp", "", true);
        }
    }

    public final void A05(AnonymousClass2cW r6, int i) {
        String str;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass3P8 A002 = A00(r6);
        UserJid A0L = r6.A0L();
        if (A0L != null) {
            this.A04.A08(A0L, 1);
        }
        if (A002 != null) {
            str = A02(A002);
        } else {
            str = null;
        }
        try {
            ClipData newPlainText = ClipData.newPlainText(str, str);
            ClipboardManager A092 = this.A06.A09();
            if (A092 != null) {
                A092.setPrimaryClip(newPlainText);
            }
            this.A05.A07(R.string.f12nameremoved, 1);
        } catch (NullPointerException | SecurityException e) {
            Log.e("OtpMessageService/copycode", e);
        }
        this.A0A.Boy(new C35261iP((Object) this, i, 33, (Object) r6));
    }

    public final boolean A08(AnonymousClass3P8 r4) {
        if (r4.A0A.get() == 2) {
            if (C20800yB.A01(C21000yV.A02, this.A01.A00, 1023)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Intent A01(Context context, AnonymousClass3T1 r9) {
        String str;
        String A022;
        AnonymousClass3P8 A002 = A00(r9);
        if (A002 == null || (((str = A002.A02) == null && (str = Uri.parse(A002.A01).getQueryParameter("package_name")) == null) || (A022 = A02(A002)) == null)) {
            return null;
        }
        String queryParameter = Uri.parse(A002.A01).getQueryParameter("cta_display_name");
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("com.whatsapp.otp.OTP_RETRIEVED");
        intent.putExtra("code", A022);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        AnonymousClass00C.A08(queryIntentActivities);
        if (queryIntentActivities.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("OtpClient/autofill: no activity for ");
            sb.append(queryParameter);
            Log.e(sb.toString());
            return null;
        }
        intent.setClassName(str, queryIntentActivities.get(0).activityInfo.name);
        intent.setFlags(268435456);
        C54922tm.A00(context, intent);
        return intent;
    }
}
