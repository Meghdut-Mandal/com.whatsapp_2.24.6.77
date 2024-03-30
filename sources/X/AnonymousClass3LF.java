package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3LF  reason: invalid class name */
public class AnonymousClass3LF {
    public AnonymousClass3T1 A00;
    public final C19730wQ A01;
    public final C21100yf A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final C19630wG A05;
    public final C18820ts A06;
    public final C20600xp A07;
    public final C19700wN A08;
    public final C21060yb A09;
    public final AnonymousClass1TA A0A;
    public final C20810yC A0B;
    public final C23971Ao A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bb, code lost:
        r6 = r6 * 3;
        r5 = r6 / 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C07700Yy r15, X.AnonymousClass141 r16, java.lang.StringBuilder r17, boolean r18) {
        /*
            r14 = this;
            r7 = 1
            r1 = 0
            if (r18 == 0) goto L_0x002e
            r0 = r16
            java.lang.CharSequence r2 = r14.A05(r0, r1)
        L_0x000a:
            X.3T1 r3 = r14.A00
            boolean r0 = r3 instanceof X.C46882bp
            r4 = r17
            if (r0 == 0) goto L_0x0069
            r0 = r3
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.3Qj r8 = r0.A01
            if (r8 == 0) goto L_0x0069
            X.0xp r9 = r14.A07
            X.C18740tg.A06(r8)
            boolean r0 = r8.A0V
            r3 = 0
            if (r0 == 0) goto L_0x010f
            java.io.File r0 = r8.A0I
            if (r0 == 0) goto L_0x010f
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x010f
            goto L_0x003e
        L_0x002e:
            X.0ts r5 = r14.A06
            r4 = 2131755239(0x7f1000e7, float:1.9141352E38)
            long r2 = (long) r7
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.AnonymousClass000.A1L(r0, r7, r1)
            java.lang.String r2 = r5.A0L(r0, r4, r2)
            goto L_0x000a
        L_0x003e:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x00f1 }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x00f1 }
            r6.inJustDecodeBounds = r7     // Catch:{ OutOfMemoryError -> 0x00f1 }
            java.io.File r0 = r8.A0I     // Catch:{ OutOfMemoryError -> 0x00f1 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x00f1 }
            android.graphics.BitmapFactory.decodeFile(r0, r6)     // Catch:{ OutOfMemoryError -> 0x00f1 }
            int r5 = r6.outWidth     // Catch:{ OutOfMemoryError -> 0x00f1 }
            int r0 = r6.outHeight     // Catch:{ OutOfMemoryError -> 0x00f1 }
            int r5 = r9.A0B(r5, r0)     // Catch:{ OutOfMemoryError -> 0x00f1 }
            r6.inSampleSize = r5     // Catch:{ OutOfMemoryError -> 0x00f1 }
            r0 = -1
            if (r5 == r0) goto L_0x010f
            r6.inJustDecodeBounds = r1     // Catch:{ OutOfMemoryError -> 0x00f1 }
            java.io.File r0 = r8.A0I     // Catch:{ OutOfMemoryError -> 0x00f1 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x00f1 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r0, r6)     // Catch:{ OutOfMemoryError -> 0x00f1 }
            goto L_0x00f1
        L_0x0069:
            boolean r0 = r3 instanceof X.C46962bx
            if (r0 == 0) goto L_0x010f
            X.9lY r0 = r3.A0M
            if (r0 != 0) goto L_0x010f
            X.0xp r8 = r14.A07
            X.2bx r3 = (X.C46962bx) r3
            X.1Ap r0 = r8.A0J
            X.6c4 r10 = r0.A00(r3)
            X.0wG r0 = r8.A08
            android.content.res.Resources r3 = X.C36421kH.A0B(r0)
            r0 = 2131168501(0x7f070cf5, float:1.7951306E38)
            int r6 = r3.getDimensionPixelSize(r0)
            r11 = 0
            com.whatsapp.stickers.WebpUtils r13 = r8.A0L     // Catch:{ OutOfMemoryError -> 0x010f }
            X.1Ao r9 = r8.A0I     // Catch:{ OutOfMemoryError -> 0x010f }
            X.0yb r12 = r8.A07     // Catch:{ OutOfMemoryError -> 0x010f }
            X.1HB r5 = r8.A0K     // Catch:{ OutOfMemoryError -> 0x010f }
            X.0y0 r0 = r8.A02     // Catch:{ OutOfMemoryError -> 0x010f }
            java.lang.String r3 = X.AnonymousClass1HA.A03(r10, r6, r6, r1)     // Catch:{ OutOfMemoryError -> 0x010f }
            byte[] r1 = X.AnonymousClass1HA.A05(r0, r12, r10, r13)     // Catch:{ OutOfMemoryError -> 0x010f }
            if (r1 == 0) goto L_0x010f
            boolean r0 = r10.A0N     // Catch:{ OutOfMemoryError -> 0x010f }
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r10.A0E     // Catch:{ OutOfMemoryError -> 0x010f }
            X.7u4 r0 = r9.A02(r0, r1)     // Catch:{ OutOfMemoryError -> 0x00ae }
            if (r0 == 0) goto L_0x010f
            android.graphics.Bitmap r10 = X.C23971Ao.A00(r0, r6, r6)     // Catch:{ OutOfMemoryError -> 0x00ae }
            goto L_0x00b9
        L_0x00ae:
            r1 = move-exception
            java.lang.String r0 = "LottieUtils/getResizedLottieBitmapFromData OOM getting thumbnail bitmap"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ OutOfMemoryError -> 0x010f }
            goto L_0x010f
        L_0x00b5:
            android.graphics.Bitmap r10 = r5.A07(r3, r1, r6, r6)     // Catch:{ OutOfMemoryError -> 0x010f }
        L_0x00b9:
            if (r10 == 0) goto L_0x010f
            int r6 = r6 * 3
            int r5 = r6 / 2
            int r1 = r8.A0B(r6, r5)     // Catch:{ OutOfMemoryError -> 0x010f }
            r0 = -1
            if (r1 == r0) goto L_0x010f
            int r6 = r6 / r1
            int r5 = r5 / r1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x010f }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r6, r5, r0)     // Catch:{ OutOfMemoryError -> 0x010f }
            android.graphics.Canvas r9 = new android.graphics.Canvas     // Catch:{ OutOfMemoryError -> 0x010f }
            r9.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x010f }
            float r12 = (float) r6     // Catch:{ OutOfMemoryError -> 0x010f }
            r13 = 1077936128(0x40400000, float:3.0)
            float r8 = r12 / r13
            float r6 = (float) r5     // Catch:{ OutOfMemoryError -> 0x010f }
            r1 = 1086324736(0x40c00000, float:6.0)
            float r5 = r6 / r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r0
            float r12 = r12 / r13
            r0 = 1084227584(0x40a00000, float:5.0)
            float r6 = r6 * r0
            float r6 = r6 / r1
            android.graphics.RectF r1 = new android.graphics.RectF     // Catch:{ OutOfMemoryError -> 0x010f }
            r1.<init>(r8, r5, r12, r6)     // Catch:{ OutOfMemoryError -> 0x010f }
            android.graphics.Paint r0 = X.C36441kJ.A0K()     // Catch:{ OutOfMemoryError -> 0x010f }
            r9.drawBitmap(r10, r11, r1, r0)     // Catch:{ OutOfMemoryError -> 0x010f }
        L_0x00f1:
            if (r3 == 0) goto L_0x010f
            java.lang.String r0 = " bigpicture"
            r4.append(r0)
            androidx.core.app.NotificationCompat$BigPictureStyle r1 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r1.<init>()
            java.lang.CharSequence r0 = X.C07700Yy.A04(r2)
            r1.A01 = r0
            r1.A02 = r7
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A03(r3)
            r1.A00 = r0
            r15.A0C(r1)
            return
        L_0x010f:
            java.lang.String r0 = " bigtext:"
            r4.append(r0)
            int r0 = r2.length()
            r4.append(r0)
            androidx.core.app.NotificationCompat$BigTextStyle r6 = new androidx.core.app.NotificationCompat$BigTextStyle
            r6.<init>()
            r6.A0C(r2)
            X.0ts r5 = r14.A06
            r4 = 2131755239(0x7f1000e7, float:1.9141352E38)
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.C36331k8.A1W(r0, r7)
            java.lang.String r0 = r5.A0L(r0, r4, r2)
            java.lang.CharSequence r0 = X.C07700Yy.A04(r0)
            r6.A01 = r0
            r6.A02 = r7
            r15.A0C(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LF.A07(X.0Yy, X.141, java.lang.StringBuilder, boolean):void");
    }

    public long A02() {
        AnonymousClass3T1 r0;
        if (this instanceof AnonymousClass2Z6) {
            r0 = ((AnonymousClass2Z6) this).A00.A00;
        } else if (this instanceof AnonymousClass2Z8) {
            return ((AnonymousClass2Z8) this).A00.A02;
        } else {
            if (this instanceof AnonymousClass2Z7) {
                r0 = ((AnonymousClass2Z7) this).A00.A01;
            } else {
                r0 = this.A00;
            }
        }
        return r0.A1N;
    }

    public AnonymousClass141 A03() {
        AnonymousClass11F A0L = this.A00.A0L();
        if (A0L == null) {
            A0L = this.A00.A1J.A00;
        }
        C18740tg.A06(A0L);
        return this.A03.A0D(A0L);
    }

    public AnonymousClass356 A04(AnonymousClass141 r11) {
        String str;
        String A002;
        if (this instanceof AnonymousClass2Z6) {
            AnonymousClass2Z6 r7 = (AnonymousClass2Z6) this;
            AnonymousClass37G r5 = r7.A00;
            C46752bc r1 = r5.A01;
            int A003 = C36391kE.A00(AnonymousClass143.A0G(r1.A1J.A00) ? 1 : 0);
            AnonymousClass11F A0J = r1.A0J();
            AnonymousClass171 r2 = r7.A04;
            String A0R = r2.A0R(r11, A003, false);
            if (r11.A0G() && A0J != null) {
                A0R = AnonymousClass000.A0p(" @ ", A0R, AnonymousClass000.A0v(r2.A0R(r7.A03.A0D(A0J), A003, false)));
            }
            C18740tg.A06(A0R);
            return new AnonymousClass356(A0R, C36321k7.A0A(r7.A01.A00, r7.A07.A0G(r5.A00), R.string.f12nameremoved));
        }
        if (this instanceof AnonymousClass2Z8) {
            AnonymousClass2Z8 r72 = (AnonymousClass2Z8) this;
            AnonymousClass171 r4 = r72.A04;
            int A082 = r4.A08((AnonymousClass141) null, r72.A00.A04.A00);
            UserJid A0L = r72.A00.A03.A0L();
            str = r4.A0R(r11, A082, false);
            if (r11.A0G() && A0L != null) {
                Integer num = r72.A00.A01;
                if (num == null) {
                    str = "";
                    A002 = AnonymousClass2Z8.A00(r72);
                } else {
                    String A0R2 = r4.A0R(r72.A03.A0D(A0L), A082, false);
                    int intValue = num.intValue() - 1;
                    if (intValue > 0) {
                        Resources A0B2 = C36421kH.A0B(r72.A05);
                        Object[] A1Q = C36441kJ.A1Q();
                        A1Q[0] = A0R2;
                        AnonymousClass000.A1L(A1Q, intValue, 1);
                        A1Q[2] = str;
                        str = A0B2.getQuantityString(R.plurals.f10nameremoved, intValue, A1Q);
                    } else {
                        str = AnonymousClass000.A0p(" @ ", str, AnonymousClass000.A0v(A0R2));
                    }
                }
            }
            C18740tg.A06(str);
            A002 = AnonymousClass2Z8.A00(r72);
        } else if (!(this instanceof AnonymousClass2Z7)) {
            return this.A07.A0E(r11, this.A00);
        } else {
            AnonymousClass2Z7 r73 = (AnonymousClass2Z7) this;
            AnonymousClass171 r3 = r73.A04;
            int A083 = r3.A08((AnonymousClass141) null, r73.A00.A02.A1J.A00);
            AnonymousClass11F A0J2 = r73.A00.A02.A0J();
            String A0R3 = r3.A0R(r11, A083, false);
            if (r11.A0G() && A0J2 != null) {
                String A0R4 = r3.A0R(r73.A03.A0D(A0J2), A083, false);
                int i = r73.A00.A00 - 1;
                if (i != 0) {
                    Resources A0B3 = C36421kH.A0B(r73.A01);
                    Object[] A1Q2 = C36441kJ.A1Q();
                    A1Q2[0] = A0R4;
                    AnonymousClass000.A1L(A1Q2, i, 1);
                    A1Q2[2] = A0R3;
                    A0R3 = A0B3.getQuantityString(R.plurals.f10nameremoved, i, A1Q2);
                } else {
                    A0R3 = AnonymousClass000.A0p(" @ ", A0R3, AnonymousClass000.A0v(A0R4));
                }
            }
            C18740tg.A06(str);
            A002 = AnonymousClass2Z7.A00(r73);
        }
        return new AnonymousClass356(str, A002);
    }

    public CharSequence A05(AnonymousClass141 r16, boolean z) {
        StringBuilder A0u;
        CharSequence charSequence;
        StringBuilder A0u2;
        CharSequence A0p;
        StringBuilder A0u3;
        CharSequence A0q;
        AnonymousClass141 r10 = r16;
        boolean z2 = z;
        if (this instanceof AnonymousClass2Z6) {
            AnonymousClass2Z6 r3 = (AnonymousClass2Z6) this;
            CharSequence[] charSequenceArr = new CharSequence[2];
            AnonymousClass37G r2 = r3.A00;
            AnonymousClass11F r9 = r2.A01.A1J.A00;
            AnonymousClass171 r8 = r3.A04;
            int A082 = r8.A08(r10, r9);
            if (r10.A0G()) {
                String A0I = r3.A07.A0I(r3.A00.A0J(), r9);
                boolean z3 = r3.A00.A1J.A02;
                if (z) {
                    if (!z3) {
                        A0u3 = C36381kD.A11(A0I);
                        A0u3.append(" @ ");
                    }
                } else if (!z3) {
                    A0q = C20600xp.A00(AnonymousClass000.A0q(": ", C36381kD.A11(A0I)));
                    charSequenceArr[0] = A0q;
                    charSequenceArr[1] = C36351kA.A0w(r3.A01.A00, r3.A07.A0G(r2.A00), 1, R.string.f12nameremoved);
                    return TextUtils.concat(charSequenceArr);
                }
                A0u3 = AnonymousClass000.A0u();
            } else {
                String A0R = r8.A0R(r10, A082, false);
                C18740tg.A06(A0R);
                if (z) {
                    A0q = AnonymousClass000.A0q(": ", C36381kD.A11(A0R));
                    charSequenceArr[0] = A0q;
                    charSequenceArr[1] = C36351kA.A0w(r3.A01.A00, r3.A07.A0G(r2.A00), 1, R.string.f12nameremoved);
                    return TextUtils.concat(charSequenceArr);
                }
                A0u3 = AnonymousClass000.A0u();
            }
            A0q = AnonymousClass000.A0p(r8.A0R(r10, A082, false), ": ", A0u3);
            charSequenceArr[0] = A0q;
            charSequenceArr[1] = C36351kA.A0w(r3.A01.A00, r3.A07.A0G(r2.A00), 1, R.string.f12nameremoved);
            return TextUtils.concat(charSequenceArr);
        } else if (this instanceof AnonymousClass2Z8) {
            AnonymousClass2Z8 r4 = (AnonymousClass2Z8) this;
            CharSequence[] charSequenceArr2 = new CharSequence[2];
            AnonymousClass11F r82 = r4.A00.A04.A00;
            if (r82 == null) {
                A0p = "";
            } else {
                AnonymousClass171 r7 = r4.A04;
                int A083 = r7.A08((AnonymousClass141) null, r82);
                if (r10.A0G()) {
                    AnonymousClass3T1 r92 = r4.A00;
                    boolean z4 = r92.A1J.A02;
                    if (z) {
                        if (!z4) {
                            A0u2 = AnonymousClass000.A0v(AnonymousClass2Z8.A01(r4, r4.A07.A0I(r92.A0J(), r82)));
                            A0u2.append(" @ ");
                            A0p = AnonymousClass000.A0p(r7.A0R(r10, A083, false), ": ", A0u2);
                        }
                    } else if (!z4) {
                        A0p = C20600xp.A00(AnonymousClass000.A0q(": ", C36381kD.A11(AnonymousClass2Z8.A01(r4, r4.A07.A0I(r92.A0J(), r82)))));
                    }
                }
                A0u2 = AnonymousClass000.A0u();
                A0p = AnonymousClass000.A0p(r7.A0R(r10, A083, false), ": ", A0u2);
            }
            charSequenceArr2[0] = A0p;
            charSequenceArr2[1] = AnonymousClass2Z8.A00(r4);
            return TextUtils.concat(charSequenceArr2);
        } else if (!(this instanceof AnonymousClass2Z7)) {
            return this.A07.A0F(r10, this.A00, z2, false, true);
        } else {
            AnonymousClass2Z7 r42 = (AnonymousClass2Z7) this;
            CharSequence[] charSequenceArr3 = new CharSequence[2];
            AnonymousClass11F r83 = r42.A00.A02.A1J.A00;
            AnonymousClass171 r72 = r42.A04;
            int A084 = r72.A08((AnonymousClass141) null, r83);
            if (r10.A0G()) {
                AnonymousClass3T1 r93 = r42.A00;
                boolean z5 = r93.A1J.A02;
                if (z) {
                    if (!z5) {
                        A0u = C36381kD.A11(AnonymousClass2Z7.A01(r42, r42.A07.A0I(r93.A0J(), r83)));
                        A0u.append(" @ ");
                    }
                } else if (!z5) {
                    charSequence = C20600xp.A00(AnonymousClass000.A0q(": ", C36381kD.A11(AnonymousClass2Z7.A01(r42, r42.A07.A0I(r93.A0J(), r83)))));
                    charSequenceArr3[0] = charSequence;
                    charSequenceArr3[1] = AnonymousClass2Z7.A00(r42);
                    return TextUtils.concat(charSequenceArr3);
                }
                A0u = AnonymousClass000.A0u();
            } else {
                if (z) {
                    String A0R2 = r72.A0R(r10, A084, false);
                    C18740tg.A06(A0R2);
                    A0u = C36381kD.A11(AnonymousClass2Z7.A01(r42, A0R2));
                    charSequence = AnonymousClass000.A0q(": ", A0u);
                    charSequenceArr3[0] = charSequence;
                    charSequenceArr3[1] = AnonymousClass2Z7.A00(r42);
                    return TextUtils.concat(charSequenceArr3);
                }
                A0u = AnonymousClass000.A0u();
            }
            A0u.append(r72.A0R(r10, A084, false));
            charSequence = AnonymousClass000.A0q(": ", A0u);
            charSequenceArr3[0] = charSequence;
            charSequenceArr3[1] = AnonymousClass2Z7.A00(r42);
            return TextUtils.concat(charSequenceArr3);
        }
    }

    public String A06() {
        C21050ya A0O = this.A09.A0O();
        if (A0O == null) {
            Log.w("messagenotification cr=null");
        } else {
            Uri A042 = this.A03.A04(A03(), A0O);
            if (A042 != null) {
                return A042.toString();
            }
        }
        return null;
    }

    public boolean A08(Context context, C07700Yy r7, AnonymousClass141 r8) {
        C65013Qj r1;
        File file;
        AnonymousClass3T1 r12 = this.A00;
        if ((!(r12 instanceof C46812bi) && !(r12 instanceof C46882bp)) || (r1 = ((AnonymousClass2bU) r12).A01) == null || !r1.A0V || (file = r1.A0I) == null || !file.exists()) {
            return false;
        }
        Intent action = C36441kJ.A0j().A1W(context, r8).setAction(C56682wi.A01);
        AnonymousClass3M9.A02(action, "UpdateMessageNotificationRunnable");
        AnonymousClass3UJ.A00(action, this.A00.A1J);
        PendingIntent A032 = C65743Th.A03(context, action, 4);
        AnonymousClass3T1 r13 = this.A00;
        boolean z = r13 instanceof C46882bp;
        int i = R.drawable.notification_action_audio;
        if (z) {
            i = R.drawable.notification_action_image;
        }
        int i2 = r13.A1I;
        int i3 = R.string.f12nameremoved;
        if (i2 == 1) {
            i3 = R.string.f12nameremoved;
        }
        r7.A08(i, context.getString(i3), A032);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C07700Yy r12, androidx.core.app.NotificationCompat$MessagingStyle r13, X.AnonymousClass141 r14) {
        /*
            r11 = this;
            X.3T1 r1 = r11.A00
            boolean r0 = r1 instanceof X.AnonymousClass2bZ
            if (r0 != 0) goto L_0x0159
            boolean r0 = r1 instanceof X.C46852bm
            if (r0 != 0) goto L_0x0159
            r0 = 8
            boolean r0 = r1.A1R(r0)
            if (r0 != 0) goto L_0x0159
        L_0x0012:
            X.356 r0 = r11.A04(r14)
            X.0UW r7 = r11.A09()
            java.lang.CharSequence r2 = r0.A00
            X.3T1 r0 = r11.A00
            long r0 = r0.A0I
            X.0Wt r6 = new X.0Wt
            r6.<init>(r7, r2, r0)
            X.3T1 r2 = r11.A00
            X.0yf r1 = r11.A02
            int r0 = r2.A1I
            boolean r0 = X.C66013Ui.A0K(r0)
            if (r0 != 0) goto L_0x007d
            boolean r0 = r2 instanceof X.C46882bp
            if (r0 != 0) goto L_0x0051
            boolean r0 = r2 instanceof X.C46812bi
            if (r0 == 0) goto L_0x0041
            X.0yi r0 = X.C21100yf.A0p
            boolean r0 = r1.A09(r0)
            if (r0 != 0) goto L_0x0051
        L_0x0041:
            boolean r0 = r2 instanceof X.C46962bx
            if (r0 == 0) goto L_0x007d
            X.9lY r0 = r2.A0M
            if (r0 != 0) goto L_0x007d
            X.2bx r2 = (X.C46962bx) r2
            boolean r0 = r2.A1l()
            if (r0 != 0) goto L_0x007d
        L_0x0051:
            X.3T1 r2 = r11.A00
            boolean r0 = r2 instanceof X.C46852bm
            if (r0 != 0) goto L_0x007d
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.3Qj r1 = r2.A01
            if (r1 == 0) goto L_0x0079
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x0079
            java.io.File r0 = r1.A0I
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0079
            X.0wN r1 = r11.A08
            X.1TA r0 = r11.A0A
            android.net.Uri r1 = com.whatsapp.contentprovider.MediaProvider.A03(r1, r0, r2)
            java.lang.String r0 = r2.A05
        L_0x0075:
            r6.A02 = r0
            r6.A00 = r1
        L_0x0079:
            r13.A0C(r6)
            return
        L_0x007d:
            X.3T1 r2 = r11.A00
            boolean r0 = r2 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0111
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.3Qj r1 = r2.A01
            if (r1 == 0) goto L_0x0079
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x0079
            java.io.File r0 = r1.A0I
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0079
            X.1Ao r10 = r11.A0C
            X.1TA r8 = r11.A0A
            java.io.File r1 = X.AnonymousClass2bU.A01(r2)
            X.C18740tg.A06(r1)
            java.lang.String r4 = X.C36361kB.A0l()
            java.lang.String r7 = r1.getName()
            java.lang.String r9 = r2.A04
            r3 = 0
            X.1Ah r0 = r10.A01     // Catch:{ OutOfMemoryError -> 0x00ea }
            X.9Y2 r0 = r0.A09(r1, r9)     // Catch:{ OutOfMemoryError -> 0x00ea }
            if (r0 == 0) goto L_0x00f0
            X.7u4 r2 = X.C1901397a.A00(r0)     // Catch:{ OutOfMemoryError -> 0x00ea }
            int r1 = r2.getIntrinsicWidth()     // Catch:{ OutOfMemoryError -> 0x00ea }
            int r0 = r2.getIntrinsicHeight()     // Catch:{ OutOfMemoryError -> 0x00ea }
            android.graphics.Bitmap r5 = X.C23971Ao.A00(r2, r1, r0)     // Catch:{ OutOfMemoryError -> 0x00ea }
            X.0y0 r0 = r10.A00     // Catch:{ OutOfMemoryError -> 0x00ea }
            java.io.File r1 = r0.A0E()     // Catch:{ OutOfMemoryError -> 0x00ea }
            java.lang.String r0 = ".thumb.lottie.tmp"
            java.io.File r3 = X.C20690y0.A03(r1, r9, r3, r0)     // Catch:{ OutOfMemoryError -> 0x00ea }
            if (r3 == 0) goto L_0x00f0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ OutOfMemoryError -> 0x00ea }
            r2.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x00ea }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x00e3 }
            r0 = 100
            r5.compress(r1, r0, r2)     // Catch:{ all -> 0x00e3 }
            r2.close()     // Catch:{ OutOfMemoryError -> 0x00ea }
            goto L_0x00f2
        L_0x00e3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ OutOfMemoryError -> 0x00ea }
            throw r0     // Catch:{ OutOfMemoryError -> 0x00ea }
        L_0x00ea:
            r1 = move-exception
            java.lang.String r0 = "LottieUtils/getStickerAsWebPForNotification error getting png sticker "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00f0:
            r1 = 0
            goto L_0x010d
        L_0x00f2:
            java.lang.String r1 = r3.getAbsolutePath()
            java.lang.String r0 = "image/png"
            r8.A01(r4, r1, r0, r7)
            android.net.Uri$Builder r1 = X.C36401kF.A0C()
            java.lang.String r0 = "item"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendEncodedPath(r4)
            android.net.Uri r1 = r0.build()
        L_0x010d:
            java.lang.String r0 = "image/webp"
            goto L_0x0075
        L_0x0111:
            boolean r0 = r2 instanceof X.AnonymousClass2bZ
            if (r0 == 0) goto L_0x0079
            r0 = r2
            X.2bZ r0 = (X.AnonymousClass2bZ) r0
            X.9uk r0 = r0.A00
            if (r0 == 0) goto L_0x0079
            byte[] r0 = r0.A06()
            if (r0 == 0) goto L_0x0079
            long r0 = r2.A1N
            X.1TA r3 = r11.A0A
            java.lang.String r2 = X.C36361kB.A0l()
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r5 = "image/jpeg"
            java.lang.String r4 = ""
            r3.A01(r2, r0, r5, r4)
            android.net.Uri$Builder r1 = X.C36401kF.A0C()
            java.lang.String r0 = "thumbnail"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendEncodedPath(r2)
            android.net.Uri r3 = r0.build()
            X.3T1 r0 = r11.A00
            long r1 = r0.A0I
            X.0Wt r0 = new X.0Wt
            r0.<init>(r7, r4, r1)
            r0.A02 = r5
            r0.A00 = r3
            r13.A0C(r0)
            goto L_0x0079
        L_0x0159:
            r0 = 0
            r12.A0T = r0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LF.A0A(X.0Yy, androidx.core.app.NotificationCompat$MessagingStyle, X.141):void");
    }

    public AnonymousClass3LF(C19700wN r1, C19730wQ r2, C21100yf r3, AnonymousClass16D r4, AnonymousClass171 r5, C21060yb r6, C19630wG r7, C18820ts r8, AnonymousClass1TA r9, C20810yC r10, C20600xp r11, AnonymousClass3T1 r12, C23971Ao r13) {
        this.A0B = r10;
        this.A08 = r1;
        this.A01 = r2;
        this.A05 = r7;
        this.A02 = r3;
        this.A0C = r13;
        this.A03 = r4;
        this.A09 = r6;
        this.A04 = r5;
        this.A06 = r8;
        this.A07 = r11;
        this.A0A = r9;
        this.A00 = r12;
    }

    public AnonymousClass0UW A09() {
        boolean z;
        String A0R;
        C19630wG r1;
        int i;
        AnonymousClass141 A032 = A03();
        AnonymousClass3T1 r2 = this.A00;
        if ((r2 instanceof C181758nz) && ((AnonymousClass2bI) r2).A00 == 143) {
            A032 = this.A03.A0D(C64933Qa.A01(r2));
        }
        String A062 = A06();
        AnonymousClass11F r0 = this.A00.A1J.A00;
        AnonymousClass171 r7 = this.A04;
        int A082 = r7.A08(A032, r0);
        AnonymousClass3T1 r4 = this.A00;
        if (!this.A02.A09(C21100yf.A0G) || !(r4 instanceof C181758nz)) {
            z = r4.A1J.A02;
        } else {
            z = C36361kB.A1X(this.A01, A032);
        }
        if (z) {
            return this.A07.A0D();
        }
        AnonymousClass3T1 r5 = this.A00;
        C20810yC r42 = this.A0B;
        C19730wQ r12 = this.A01;
        if (r42.A0E(4927) && C65713Te.A05(r12, r5.A0w)) {
            r1 = this.A05;
            i = R.string.f12nameremoved;
        } else if (C20600xp.A09(r42, this.A00)) {
            r1 = this.A05;
            i = R.string.f12nameremoved;
        } else {
            A0R = r7.A0R(A032, A082, false);
            AnonymousClass0TO r13 = new AnonymousClass0TO();
            r13.A01 = A0R;
            r13.A00 = IconCompat.A03(this.A07.A0C(A032));
            r13.A03 = A062;
            return new AnonymousClass0UW(r13);
        }
        A0R = r1.A01(i);
        AnonymousClass0TO r132 = new AnonymousClass0TO();
        r132.A01 = A0R;
        r132.A00 = IconCompat.A03(this.A07.A0C(A032));
        r132.A03 = A062;
        return new AnonymousClass0UW(r132);
    }
}
