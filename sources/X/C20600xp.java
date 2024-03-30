package X;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.0xp  reason: invalid class name and case insensitive filesystem */
public final class C20600xp implements AnonymousClass00M {
    public static final HashMap A0W = new HashMap();
    public static final String[] A0X = {"_id"};
    public AnonymousClass0UW A00;
    public final C19700wN A01;
    public final C20690y0 A02;
    public final C19730wQ A03;
    public final AnonymousClass1T1 A04;
    public final AnonymousClass16D A05;
    public final AnonymousClass171 A06;
    public final C21060yb A07;
    public final C19630wG A08;
    public final C18820ts A09;
    public final AnonymousClass17X A0A;
    public final C20810yC A0B;
    public final C28371Sj A0C;
    public final AnonymousClass1FR A0D;
    public final C19890wg A0E;
    public final C28471Su A0F;
    public final AnonymousClass1AW A0G;
    public final AnonymousClass1CR A0H;
    public final C23971Ao A0I;
    public final C23981Ap A0J;
    public final AnonymousClass1HB A0K;
    public final WebpUtils A0L;
    public final HashMap A0M;
    public final AnonymousClass1LV A0N;
    public final AnonymousClass1Pp A0O;
    public final C27731Pn A0P;
    public final C220412q A0Q;
    public final C20310xM A0R;
    public final AnonymousClass17U A0S;
    public final C20500xf A0T;
    public final C28491Sw A0U;
    public final AnonymousClass1A1 A0V;

    public static C07700Yy A02(Context context) {
        C07700Yy r1 = new C07700Yy(context, (String) null);
        r1.A06 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0.booleanValue() != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(android.content.Context r10, android.net.Uri r11, X.C07700Yy r12, X.C21060yb r13, X.AnonymousClass1Q0 r14, X.C34071gP r15) {
        /*
            r5 = r11
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 >= r0) goto L_0x001f
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x001f
            java.util.HashMap r3 = A0W
            java.lang.Object r0 = r3.get(r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0051
        L_0x001f:
            boolean r0 = r15.A00
            if (r0 != 0) goto L_0x0054
            r0 = 26
            if (r1 >= r0) goto L_0x0054
            java.io.File r2 = X.AnonymousClass6YY.A03(r11)
            if (r2 == 0) goto L_0x003b
            r0 = 24
            if (r1 < r0) goto L_0x003b
            android.net.Uri r5 = X.AnonymousClass6YY.A01(r10, r2)     // Catch:{ IllegalArgumentException -> 0x007f }
            java.lang.String r1 = "com.android.systemui"
            r0 = 1
            r10.grantUriPermission(r1, r5, r0)     // Catch:{ IllegalArgumentException -> 0x007f }
        L_0x003b:
            if (r5 == 0) goto L_0x0054
            r12.A0B(r5)
            return
        L_0x0041:
            X.0ya r4 = r13.A0O()
            if (r4 != 0) goto L_0x0055
            java.lang.String r0 = "messagenotification/is-notification-tone cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.put(r11, r0)
        L_0x0051:
            r14.A02(r11)
        L_0x0054:
            return
        L_0x0055:
            java.lang.String[] r6 = A0X     // Catch:{ Exception -> 0x004c }
            java.lang.String r7 = "is_notification=1"
            r8 = 0
            java.lang.String r9 = "title_key"
            android.database.Cursor r2 = r4.A03(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x004c }
            if (r2 == 0) goto L_0x004c
            int r0 = r2.getCount()     // Catch:{ all -> 0x0075 }
            if (r0 <= 0) goto L_0x0071
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0075 }
            r3.put(r11, r0)     // Catch:{ all -> 0x0075 }
            r2.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x001f
        L_0x0071:
            r2.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x004c
        L_0x0075:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x004c }
        L_0x007e:
            throw r1     // Catch:{ Exception -> 0x004c }
        L_0x007f:
            r1 = move-exception
            java.lang.String r0 = "notification/"
            com.whatsapp.util.Log.w(r0, r1)
            r14.A02(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20600xp.A07(android.content.Context, android.net.Uri, X.0Yy, X.0yb, X.1Q0, X.1gP):void");
    }

    public AnonymousClass356 A0E(AnonymousClass141 r11, AnonymousClass3T1 r12) {
        CharSequence A0F2;
        AnonymousClass3T1 r6 = r12;
        if (r12 == null) {
            return new AnonymousClass356("", "");
        }
        C20810yC r3 = this.A0B;
        C19730wQ r2 = this.A03;
        AnonymousClass141 r5 = r11;
        if ((!C20800yB.A01(C21000yV.A02, r3, 4927) || !C65713Te.A05(r2, r12.A0w)) && !A09(r3, r12)) {
            A0F2 = A0G(r12);
        } else {
            A0F2 = A0F(r5, r6, false, false, false);
        }
        return new AnonymousClass356(A0H(r11, r12), A0F2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (X.C65713Te.A05(r8.A03, r1) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0N(X.AnonymousClass3LF r9, boolean r10) {
        /*
            r8 = this;
            r4 = 0
            if (r9 == 0) goto L_0x002d
            X.3T1 r2 = r9.A00
            int r6 = r2.A1I
            r0 = 36
            if (r6 == r0) goto L_0x002d
            r0 = 77
            if (r6 == r0) goto L_0x002d
            r0 = 90
            if (r6 == r0) goto L_0x002d
            X.0xf r1 = r8.A0T
            X.3Qa r0 = r2.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass3M3.A01(r1, r0)
            if (r0 != 0) goto L_0x002d
            X.3Qa r0 = r2.A1J
            X.11F r5 = r0.A00
            if (r10 != 0) goto L_0x002e
            X.12q r0 = r8.A0Q
            boolean r0 = r0.A0Q(r5)
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            return r4
        L_0x002e:
            X.C18740tg.A06(r9)
            X.3T1 r7 = r9.A00
            java.util.List r1 = r7.A0w
            r3 = 1
            if (r1 == 0) goto L_0x0041
            X.0wQ r0 = r8.A03
            boolean r0 = X.C65713Te.A05(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            X.3T1 r0 = r7.A0S()
            if (r0 == 0) goto L_0x00bd
            X.11F r0 = r0.A0J()
            if (r0 != 0) goto L_0x00bd
        L_0x004e:
            X.3Qa r1 = r7.A1J
            X.11F r0 = r1.A00
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 == 0) goto L_0x00bb
            if (r3 != 0) goto L_0x005c
            if (r2 == 0) goto L_0x00bb
        L_0x005c:
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00bb
            X.1CR r1 = r8.A0H
            X.11F r0 = r7.A0J()
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.getRawString()
            X.3LI r0 = X.AnonymousClass1CR.A02(r1, r0)
            boolean r3 = r0.A0B()
        L_0x0075:
            if (r5 == 0) goto L_0x0080
            X.12q r0 = r8.A0Q
            boolean r0 = r0.A0N(r5)
            if (r0 == 0) goto L_0x0080
        L_0x007f:
            return r3
        L_0x0080:
            boolean r0 = r5 instanceof X.C28981Uw
            r2 = 1
            if (r0 == 0) goto L_0x00a3
            X.12q r0 = r8.A0Q
            X.3Qp r1 = r0.A09(r5, r4)
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x002d
            boolean r0 = r1.A0N()
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1.A0O
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r1.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            r4 = 1
            return r4
        L_0x00a3:
            r0 = 95
            if (r6 == r0) goto L_0x002d
            X.1CR r1 = r8.A0H
            X.C18740tg.A06(r5)
            java.lang.String r0 = r5.getRawString()
            X.3LI r0 = X.AnonymousClass1CR.A02(r1, r0)
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x007f
            return r2
        L_0x00bb:
            r3 = 0
            goto L_0x0075
        L_0x00bd:
            r3 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20600xp.A0N(X.3LF, boolean):boolean");
    }

    public static SpannableStringBuilder A00(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder A01(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(2), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }

    public static Integer A03(String str) {
        int i;
        if (str == null) {
            return null;
        }
        try {
            i = Integer.parseInt(str, 16);
        } catch (NumberFormatException unused) {
            i = 16777215;
        }
        int i2 = i | -16777216;
        if (i2 != -16777216) {
            return Integer.valueOf(i2);
        }
        return null;
    }

    public static String A04(Context context, C18820ts r8, C20810yC r9, C46952bw r10) {
        if (C20800yB.A01(C21000yV.A02, r9, 4893)) {
            return context.getString(R.string.f12nameremoved);
        }
        int i = r10.A00;
        Object[] objArr = {Integer.valueOf(i)};
        String A0L2 = r8.A0L(objArr, R.plurals.f10nameremoved, (long) i);
        if (TextUtils.isEmpty(r10.A06)) {
            return A0L2;
        }
        return context.getString(R.string.f12nameremoved, new Object[]{A0L2, r10.A06});
    }

    public static String A05(Context context, AnonymousClass3T1 r4, AnonymousClass1AW r5) {
        AnonymousClass2bU r42;
        if (r4 instanceof C23043B1o) {
            C200259gz A012 = r5.A01((C23043B1o) r4);
            if (A012 != null) {
                return A012.A0E(context);
            }
            return null;
        } else if ((r4 instanceof C46892bq) || (r4 instanceof C47012ca) || (r4 instanceof C88854Uh)) {
            return null;
        } else {
            if (r4 instanceof C46852bm) {
                C46852bm r43 = (C46852bm) r4;
                String str = r43.A09;
                String str2 = r43.A02;
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" ");
                    sb.append(str2);
                    str = sb.toString();
                }
                String str3 = r43.A05;
                if (TextUtils.isEmpty(str3)) {
                    return str;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" ");
                sb2.append(str3);
                return sb2.toString();
            } else if (r4 instanceof C46952bw) {
                return null;
            } else {
                if (r4 instanceof C46882bp) {
                    AnonymousClass2bU r1 = (AnonymousClass2bU) r4;
                    boolean A042 = C202359le.A04(r4);
                    r42 = r4;
                    if (!A042) {
                        return r1.A1a();
                    }
                } else if (r4 instanceof C46812bi) {
                    return null;
                } else {
                    if (r4 instanceof C181788o2) {
                        return ((AnonymousClass2bU) r4).A1a();
                    }
                    if (r4 instanceof C181798o3) {
                        AnonymousClass2bU r44 = (AnonymousClass2bU) r4;
                        boolean A043 = C202359le.A04(r44);
                        r42 = r44;
                        if (!A043) {
                            return r44.A1a();
                        }
                    } else {
                        if (r4 instanceof C46972by) {
                            if (C131806Qs.A02(r4)) {
                                return null;
                            }
                        } else if ((r4 instanceof C46962bx) || (r4 instanceof AnonymousClass2bQ) || (r4 instanceof AnonymousClass2bP) || (r4 instanceof AnonymousClass2bW) || (r4 instanceof AnonymousClass2bX)) {
                            return null;
                        } else {
                            if (!(r4 instanceof C46912bs)) {
                                if (r4 instanceof C46902br) {
                                    return ((C46902br) r4).A03;
                                }
                                return null;
                            }
                        }
                        return C202359le.A00(r4);
                    }
                }
                return C202359le.A00(r42);
            }
        }
    }

    public static void A08(Context context, C07700Yy r4, AnonymousClass141 r5, int i) {
        Intent A1X = new AnonymousClass190().A1X(context, r5, Integer.valueOf(i));
        A1X.addFlags(335544320);
        A1X.putExtra("should_show_block_report_dialog", true);
        r4.A08(R.drawable.ic_spam_block, context.getString(R.string.f12nameremoved), C65743Th.A00(context, 0, A1X, 134217728));
    }

    public static boolean A09(C20810yC r2, AnonymousClass3T1 r3) {
        AnonymousClass3T1 A0S2;
        if (!C20800yB.A01(C21000yV.A02, r2, 5194) || !AnonymousClass143.A0G(r3.A1J.A00) || (A0S2 = r3.A0S()) == null || !A0S2.A1J.A02) {
            return false;
        }
        return true;
    }

    public static long[] A0A(String str) {
        int i;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    i = 0;
                    break;
                } else {
                    return null;
                }
            case 50:
                if (str.equals("2")) {
                    i = 1;
                    break;
                } else {
                    return null;
                }
            case 51:
                if (str.equals("3")) {
                    i = 2;
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        long[] jArr = {0, 750, 250, 750, 250};
        if (2 - i != 0) {
            // fill-array-data instruction
            jArr[0] = 0;
            jArr[1] = 300;
            jArr[2] = 200;
            jArr[3] = 300;
            jArr[4] = 200;
            return jArr;
        }
        return jArr;
    }

    public int A0B(int i, int i2) {
        Point point = new Point();
        this.A07.A0L().getDefaultDisplay().getSize(point);
        int i3 = point.x;
        int i4 = point.y / 3;
        int i5 = 1;
        if (i != 0 && i2 != 0) {
            while (true) {
                if (i2 <= i4 && i <= i3) {
                    break;
                }
                i5 *= 2;
                i2 = (i2 + 1) / 2;
                i = (i + 1) / 2;
            }
        }
        return i5;
    }

    public Bitmap A0C(AnonymousClass141 r9) {
        float f;
        AnonymousClass147 A022;
        AnonymousClass141 A082;
        Context context = this.A08.A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(17104902);
        AnonymousClass11F r3 = r9.A0H;
        boolean z = false;
        if ((r3 instanceof GroupJid) && this.A0Q.A05((GroupJid) r3) == 1) {
            z = true;
        }
        boolean A0O2 = this.A0Q.A0O(r3);
        if (!(!A0O2 || (A022 = this.A0N.A02((AnonymousClass147) r3)) == null || (A082 = this.A05.A08(A022)) == null)) {
            r9 = A082;
        }
        Bitmap A023 = this.A0P.A02(context, r9, dimensionPixelSize, dimensionPixelSize2);
        if (A023 != null) {
            return A023;
        }
        AnonymousClass1Pp r32 = this.A0O;
        int min = Math.min(dimensionPixelSize, dimensionPixelSize2);
        if (A0O2 || z) {
            f = -2.14748365E9f;
        } else {
            f = context.getResources().getDimension(R.dimen.f7nameremoved);
        }
        return r32.A04(r9, f, min);
    }

    public AnonymousClass0UW A0D() {
        AnonymousClass0UW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0TO r2 = new AnonymousClass0TO();
        r2.A01 = this.A08.A00.getString(R.string.f12nameremoved);
        C19730wQ r02 = this.A03;
        r02.A0G();
        AnonymousClass142 r03 = r02.A0E;
        C18740tg.A06(r03);
        r2.A00 = IconCompat.A03(A0C(r03));
        AnonymousClass0UW r04 = new AnonymousClass0UW(r2);
        this.A00 = r04;
        return r04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001f, code lost:
        if (r21 != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015c, code lost:
        if (r0 != null) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A0F(X.AnonymousClass141 r19, X.AnonymousClass3T1 r20, boolean r21, boolean r22, boolean r23) {
        /*
            r18 = this;
            r11 = r20
            X.3Qa r10 = r11.A1J
            X.11F r9 = r10.A00
            r8 = r18
            X.171 r7 = r8.A06
            r12 = r19
            int r6 = r7.A08(r12, r9)
            X.0wG r0 = r8.A08
            android.content.Context r5 = r0.A00
            java.lang.CharSequence r4 = r8.A0G(r11)
            boolean r0 = r11 instanceof X.AnonymousClass2bI
            java.lang.String r3 = ": "
            r2 = 0
            if (r0 == 0) goto L_0x003e
            if (r21 == 0) goto L_0x0037
        L_0x0021:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x0026:
            java.lang.String r0 = r7.A0R(r12, r6, r2)
        L_0x002a:
            r1.append(r0)
            r1.append(r3)
        L_0x0030:
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L_0x0037:
            X.1Sj r0 = r8.A0C
            java.lang.CharSequence r0 = r0.A01(r5, r11, r4)
            return r0
        L_0x003e:
            int r14 = r11.A1I
            java.lang.String r13 = " @ "
            java.lang.String r1 = " "
            r0 = 2
            r17 = 1
            if (r14 != 0) goto L_0x0069
            boolean r14 = r12.A0G()
            if (r14 == 0) goto L_0x01b5
            if (r21 == 0) goto L_0x0171
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x0021
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            X.11F r0 = r11.A0J()
            java.lang.String r0 = r8.A0I(r0, r9)
            r1.append(r0)
            r1.append(r13)
            goto L_0x0026
        L_0x0069:
            r15 = 12
            r16 = 0
            if (r14 != r15) goto L_0x0071
            r16 = 1
        L_0x0071:
            boolean r14 = r12.A0G()
            if (r14 == 0) goto L_0x00a1
            if (r21 == 0) goto L_0x00ca
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x00c4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            X.11F r0 = r11.A0J()
            java.lang.String r0 = r8.A0I(r0, r9)
            r1.append(r0)
            r1.append(r13)
        L_0x0090:
            java.lang.String r0 = r7.A0R(r12, r6, r2)
            r1.append(r0)
            r1.append(r3)
            if (r16 == 0) goto L_0x0030
            android.text.SpannableStringBuilder r4 = A01(r4)
            goto L_0x0030
        L_0x00a1:
            if (r21 != 0) goto L_0x00c4
            if (r22 == 0) goto L_0x0215
            boolean r9 = r10.A02
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r9 != 0) goto L_0x0131
            r3.<init>()
            java.lang.String r0 = r7.A0R(r12, r6, r2)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = X.AnonymousClass3TB.A02(r0)
            goto L_0x015e
        L_0x00c4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0090
        L_0x00ca:
            if (r22 == 0) goto L_0x0105
            boolean r6 = r10.A02
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r6 != 0) goto L_0x0146
            r3.<init>()
            X.11F r0 = r11.A0J()
            java.lang.String r0 = r8.A0I(r0, r9)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = X.AnonymousClass3TB.A02(r0)
            if (r23 == 0) goto L_0x00f5
            if (r0 == 0) goto L_0x00f5
            android.text.SpannableStringBuilder r0 = A00(r0)
        L_0x00f5:
            r13[r2] = r0
            java.lang.String r0 = X.AnonymousClass3TB.A02(r4)
            if (r16 == 0) goto L_0x0101
            android.text.SpannableStringBuilder r0 = A01(r0)
        L_0x0101:
            r13[r17] = r0
            goto L_0x01a0
        L_0x0105:
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            X.11F r0 = r11.A0J()
            java.lang.String r0 = r8.A0I(r0, r9)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            if (r23 == 0) goto L_0x0126
            if (r0 == 0) goto L_0x0126
            android.text.SpannableStringBuilder r0 = A00(r0)
        L_0x0126:
            r13[r2] = r0
            if (r16 == 0) goto L_0x012e
            android.text.SpannableStringBuilder r4 = A01(r4)
        L_0x012e:
            r13[r17] = r4
            goto L_0x01a0
        L_0x0131:
            r3.<init>()
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r0 = r5.getString(r0)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            goto L_0x015e
        L_0x0146:
            r3.<init>()
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r0 = r5.getString(r0)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            if (r23 == 0) goto L_0x0162
            if (r0 == 0) goto L_0x0162
        L_0x015e:
            android.text.SpannableStringBuilder r0 = A00(r0)
        L_0x0162:
            r13[r2] = r0
            java.lang.String r0 = X.AnonymousClass3TB.A02(r4)
            if (r16 == 0) goto L_0x016e
            android.text.SpannableStringBuilder r0 = A01(r0)
        L_0x016e:
            r13[r17] = r0
            goto L_0x01a0
        L_0x0171:
            boolean r6 = r10.A02
            if (r22 == 0) goto L_0x01d3
            if (r6 != 0) goto L_0x01a6
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            X.11F r0 = r11.A0J()
            java.lang.String r0 = r8.A0I(r0, r9)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = X.AnonymousClass3TB.A02(r0)
        L_0x0194:
            if (r23 == 0) goto L_0x019c
            if (r0 == 0) goto L_0x019c
            android.text.SpannableStringBuilder r0 = A00(r0)
        L_0x019c:
            r13[r2] = r0
            r13[r17] = r4
        L_0x01a0:
            java.lang.CharSequence r4 = android.text.TextUtils.concat(r13)
            goto L_0x0037
        L_0x01a6:
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r0 = r5.getString(r0)
            goto L_0x01cc
        L_0x01b5:
            if (r21 != 0) goto L_0x0021
            if (r22 == 0) goto L_0x0037
            boolean r3 = r10.A02
            if (r3 != 0) goto L_0x01a6
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = r7.A0R(r12, r6, r2)
            java.lang.String r0 = X.AnonymousClass3TB.A02(r0)
        L_0x01cc:
            r10.append(r0)
            r10.append(r1)
            goto L_0x01ea
        L_0x01d3:
            if (r6 != 0) goto L_0x01ef
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            X.11F r0 = r11.A0J()
            java.lang.String r0 = r8.A0I(r0, r9)
            r10.append(r0)
            r10.append(r3)
        L_0x01ea:
            java.lang.String r0 = r10.toString()
            goto L_0x0194
        L_0x01ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "messagePreview/missing_rmt_src:"
            r1.append(r0)
            java.lang.String r0 = X.C66013Ui.A0F(r11)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 2131888236(0x7f12086c, float:1.9411102E38)
            java.lang.String r0 = r5.getString(r0)
            goto L_0x002a
        L_0x0215:
            if (r16 == 0) goto L_0x0037
            android.text.SpannableStringBuilder r4 = A01(r4)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20600xp.A0F(X.141, X.3T1, boolean, boolean, boolean):java.lang.CharSequence");
    }

    public CharSequence A0G(AnonymousClass3T1 r7) {
        Object A002;
        C28491Sw r3 = this.A0U;
        AnonymousClass00C.A0D(r7, 0);
        C52112ou r4 = C52112ou.A02;
        if (((Set) r3.A04.getValue()).contains(r4) && !AnonymousClass00C.A0J(C28491Sw.A00(r3, r7), C28491Sw.A01(r3, r7))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Mismatch in text resolution for message with type ");
            sb.append(r7.A1I);
            String obj = sb.toString();
            r3.A00.A0E("preview-subsystem/notification", obj, false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FMessagePreviewSubsystem/compareNotification; ");
            sb2.append(obj);
            Log.w(sb2.toString());
        }
        if (((Set) r3.A03.getValue()).contains(r4)) {
            A002 = C28491Sw.A01(r3, r7);
        } else {
            A002 = C28491Sw.A00(r3, r7);
        }
        if (A002 instanceof AH9) {
            return ((AH9) A002).A00;
        }
        return "";
    }

    public String A0H(AnonymousClass141 r6, AnonymousClass3T1 r7) {
        AnonymousClass11F A0J2;
        AnonymousClass171 r4 = this.A06;
        AnonymousClass11F r1 = r7.A1J.A00;
        int A082 = r4.A08(r6, r1);
        if (!r6.A0G() || (r7 instanceof AnonymousClass2bI) || (A0J2 = r7.A0J()) == null) {
            return r4.A0R(r6, A082, false);
        }
        String A0I2 = A0I(A0J2, r1);
        StringBuilder sb = new StringBuilder();
        sb.append(A0I2);
        sb.append(" @ ");
        sb.append(r4.A0R(r6, A082, false));
        return sb.toString();
    }

    public String A0I(AnonymousClass11F r5, AnonymousClass11F r6) {
        if (r5 == null) {
            Log.w("notification/messagepreview/getname remote_resource null");
            return "";
        }
        AnonymousClass141 A0D2 = this.A05.A0D(r5);
        AnonymousClass171 r2 = this.A06;
        return r2.A0R(A0D2, r2.A08(A0D2, r6), false);
    }

    public void A0J(C07700Yy r17, AnonymousClass141 r18, AnonymousClass3LF r19, boolean z, boolean z2, boolean z3, boolean z4) {
        Bitmap bitmap;
        AnonymousClass3LF r10 = r19;
        if (A0N(r10, this.A0Q.A0Q(r10.A00.A1J.A00))) {
            Context context = this.A08.A00;
            C20810yC r9 = this.A0B;
            AnonymousClass17U r7 = this.A0S;
            AnonymousClass171 r4 = this.A06;
            C18820ts r5 = this.A09;
            C20310xM r6 = this.A0R;
            AnonymousClass1A1 r12 = this.A0V;
            AnonymousClass141 r8 = r18;
            boolean z5 = z3;
            if (!z3 || !z2) {
                bitmap = null;
            } else {
                bitmap = this.A0P.A02(context, r8, 400, 400);
            }
            AndroidWear.A02(context, bitmap, r4, r5, r6, r7, r8, r9, r10, this, r12, z, z5, z4).A04(r17);
        }
    }

    public boolean A0K(AnonymousClass11F r7) {
        if (this.A0H.A0j(r7)) {
            return true;
        }
        if (!(r7 instanceof AnonymousClass147)) {
            return false;
        }
        HashMap hashMap = this.A0M;
        Number number = (Number) hashMap.get(r7);
        if (number == null) {
            return false;
        }
        if (number.longValue() > System.currentTimeMillis()) {
            return true;
        }
        hashMap.remove(r7);
        return false;
    }

    public boolean A0L(UserJid userJid) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((C47192dt) AnonymousClass1CR.A02(this.A0H, userJid.getRawString())).A0G();
        }
        return false;
    }

    public StatusBarNotification[] A0O() {
        NotificationManager A072 = this.A07.A07();
        if (A072 != null) {
            try {
                return A072.getActiveNotifications();
            } catch (Exception e) {
                Log.w("notification-utils/failed to get active notifications: ", e);
            }
        }
        return new StatusBarNotification[0];
    }

    public static String A06(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return context.getString(R.string.f12nameremoved);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse(str));
        if (ringtone == null) {
            return null;
        }
        try {
            return ringtone.getTitle(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean A0M(UserJid userJid) {
        int currentInterruptionFilter;
        Cursor A032;
        C18740tg.A00();
        AnonymousClass16D r4 = this.A05;
        AnonymousClass141 A0D2 = r4.A0D(userJid);
        C21060yb r6 = this.A07;
        NotificationManager A072 = r6.A07();
        if (!(A072 == null || Build.VERSION.SDK_INT < 28 || (currentInterruptionFilter = A072.getCurrentInterruptionFilter()) == 1 || currentInterruptionFilter == 0)) {
            NotificationManager.Policy notificationPolicy = A072.getNotificationPolicy();
            if (notificationPolicy == null) {
                Log.i("NotificationUtils/shouldCallBeSilencedByDNDMode NotificationManager policy is null");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("NotificationUtils/shouldCallBeSilencedByDNDMode NotificationManager policy ");
                sb.append(notificationPolicy);
                Log.i(sb.toString());
                if ((notificationPolicy.priorityCategories & 8) == 0) {
                    Log.i("NotificationUtils/shouldCallBeSilencedByDNDMode Calls not allowed in DND");
                    return true;
                }
                int i = notificationPolicy.priorityCallSenders;
                if (i == 1) {
                    if (A0D2.A0F == null) {
                        return true;
                    }
                } else if (i == 2) {
                    C21050ya A0O2 = r6.A0O();
                    C18740tg.A00();
                    Uri A042 = r4.A04(A0D2, A0O2);
                    boolean z = false;
                    if (A042 == null || (A032 = A0O2.A03(A042, (String[]) null, "starred==1", (String[]) null, (String) null)) == null) {
                        return true;
                    }
                    try {
                        if (A032.moveToNext()) {
                            z = true;
                        }
                        A032.close();
                        if (!z) {
                            return true;
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    public C20600xp(C19700wN r2, C20690y0 r3, C19730wQ r4, AnonymousClass1T1 r5, AnonymousClass1LV r6, AnonymousClass1Pp r7, AnonymousClass16D r8, AnonymousClass171 r9, C27731Pn r10, C21060yb r11, C19630wG r12, C18820ts r13, C220412q r14, C20310xM r15, AnonymousClass17X r16, AnonymousClass17U r17, C20810yC r18, C20500xf r19, C28371Sj r20, AnonymousClass1FR r21, C19890wg r22, C28491Sw r23, C28471Su r24, AnonymousClass1AW r25, AnonymousClass1CR r26, C23971Ao r27, C23981Ap r28, AnonymousClass1HB r29, WebpUtils webpUtils, AnonymousClass1A1 r31) {
        this.A0M = new HashMap();
        this.A08 = r12;
        this.A0B = r18;
        this.A0C = r20;
        this.A03 = r4;
        this.A01 = r2;
        this.A0L = webpUtils;
        this.A0Q = r14;
        this.A02 = r3;
        this.A0S = r17;
        this.A0I = r27;
        this.A0T = r19;
        this.A0P = r10;
        this.A0D = r21;
        this.A0O = r7;
        this.A05 = r8;
        this.A0J = r28;
        this.A07 = r11;
        this.A06 = r9;
        this.A09 = r13;
        this.A0K = r29;
        this.A0R = r15;
        this.A0V = r31;
        this.A0H = r26;
        this.A0N = r6;
        this.A0F = r24;
        this.A0U = r23;
        this.A0A = r16;
        this.A0E = r22;
        this.A04 = r5;
        this.A0G = r25;
    }

    public C20600xp() {
    }
}
