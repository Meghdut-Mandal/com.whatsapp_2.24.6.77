package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* renamed from: X.1Ps  reason: invalid class name and case insensitive filesystem */
public class C27761Ps {
    public final C19730wQ A00;
    public final AnonymousClass1LV A01;
    public final AnonymousClass16K A02;
    public final AnonymousClass1O8 A03;
    public final C19770wU A04;
    public final C27771Pt A05;
    public final AnonymousClass1O7 A06;
    public final C20830yE A07;

    public static void A03(AnonymousClass026 r6, C27761Ps r7, AnonymousClass141 r8, C124245xp r9, Runnable runnable, boolean z) {
        Object A09;
        AnonymousClass1SZ A012;
        if (!(r8 == null || r8.A07() == null)) {
            String A072 = r8.A07();
            if (r9.A00 != null) {
                r7.A06.A03(r9);
                A09 = A01(new C53992sE(r9, 0));
                if (A09 != null) {
                    A012 = r7.A02.A02.A01();
                }
                r6.accept(A09);
                return;
            } else if (r9.A01 == -1) {
                Log.e("contactPhotosBitmapManager/handleProfilePhoto/group-removed-photo");
                r7.A06.A02(r9.A03);
            } else {
                AnonymousClass16K r1 = r7.A02;
                AnonymousClass16L r3 = r1.A02;
                A09 = r3.A01().A09(A072);
                if (A09 == null) {
                    File A013 = r1.A01(r8);
                    if (A013 != null && (A09 = A01(new C53992sE(A013, 1))) != null) {
                        A012 = r3.A01();
                    } else if (z) {
                        runnable.run();
                        return;
                    }
                }
                r6.accept(A09);
                return;
            }
            A012.A0D(A072, A09);
            r6.accept(A09);
            return;
        }
        r6.accept((Object) null);
    }

    public Bitmap A05(Context context, AnonymousClass141 r10, float f, int i) {
        return A00(context, r10, f, i, 604800000, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r2 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A06(android.content.Context r12, X.AnonymousClass141 r13, float r14, int r15, long r16, boolean r18, boolean r19) {
        /*
            r11 = this;
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            if (r18 == 0) goto L_0x001b
            X.16K r0 = r11.A02
            java.lang.String r1 = r13.A08(r14, r15)
            X.16L r0 = r0.A02
            X.1SZ r0 = r0.A01()
            java.lang.Object r2 = r0.A09(r1)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x001b
        L_0x001a:
            return r2
        L_0x001b:
            r4 = r12
            r8 = r16
            r10 = r19
            android.graphics.Bitmap r2 = r3.A00(r4, r5, r6, r7, r8, r10)
            if (r18 == 0) goto L_0x001a
            if (r2 == 0) goto L_0x001a
            X.16K r0 = r11.A02
            java.lang.String r1 = r13.A08(r14, r15)
            X.16L r0 = r0.A02
            X.1SZ r0 = r0.A01()
            r0.A0D(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27761Ps.A06(android.content.Context, X.141, float, int, long, boolean, boolean):android.graphics.Bitmap");
    }

    public Bitmap A07(Context context, AnonymousClass141 r11, float f, int i, boolean z) {
        return A06(context, r11, f, i, 604800000, z, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.35K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.147} */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (X.C28981Uw.A00(r10) != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r0.A0z == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00db, code lost:
        if (r6 == 6) goto L_0x00dd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap A00(android.content.Context r18, X.AnonymousClass141 r19, float r20, int r21, long r22, boolean r24) {
        /*
            r17 = this;
            java.lang.Class<X.11F> r1 = X.AnonymousClass11F.class
            r0 = r19
            com.whatsapp.jid.Jid r10 = r0.A06(r1)
            X.11F r10 = (X.AnonymousClass11F) r10
            r14 = r21
            float r3 = (float) r14
            r13 = 0
            android.content.res.Resources r1 = r18.getResources()     // Catch:{ OutOfMemoryError -> 0x017b }
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch:{ OutOfMemoryError -> 0x017b }
            float r2 = r1.density     // Catch:{ OutOfMemoryError -> 0x017b }
            r1 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2 * r1
            r4 = 0
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r3 = 0
            if (r1 < 0) goto L_0x0022
            r3 = 1
        L_0x0022:
            r8 = r17
            if (r24 == 0) goto L_0x00ee
            if (r10 == 0) goto L_0x00ee
            boolean r1 = r0.A0G()     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 == 0) goto L_0x0034
            X.11F r1 = r0.A0H     // Catch:{ OutOfMemoryError -> 0x017b }
            boolean r1 = r1 instanceof X.AnonymousClass146     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 == 0) goto L_0x0058
        L_0x0034:
            boolean r5 = r10 instanceof X.C28981Uw     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r5 == 0) goto L_0x003f
            boolean r2 = X.C28981Uw.A00(r10)     // Catch:{ OutOfMemoryError -> 0x017b }
            r1 = 1
            if (r2 == 0) goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 != 0) goto L_0x0058
            boolean r1 = r0.A0G()     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 != 0) goto L_0x00ee
            if (r5 != 0) goto L_0x00ee
            X.11F r1 = r0.A0H     // Catch:{ OutOfMemoryError -> 0x017b }
            boolean r1 = r1 instanceof X.C177618e5     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 != 0) goto L_0x00ee
            boolean r1 = r10 instanceof X.C177638e7     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 != 0) goto L_0x00ee
            boolean r1 = r0.A0z     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 == 0) goto L_0x00ee
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            int r11 = r0.A05     // Catch:{ OutOfMemoryError -> 0x017b }
            goto L_0x005f
        L_0x005d:
            int r11 = r0.A06     // Catch:{ OutOfMemoryError -> 0x017b }
        L_0x005f:
            X.0wQ r2 = r8.A00     // Catch:{ OutOfMemoryError -> 0x017b }
            X.11F r1 = r0.A0H     // Catch:{ OutOfMemoryError -> 0x017b }
            boolean r1 = r2.A0M(r1)     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r0 instanceof X.C44112Le     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 != 0) goto L_0x00a5
            X.11F r1 = r0.A0H     // Catch:{ OutOfMemoryError -> 0x017b }
            boolean r1 = r1 instanceof X.C28981Uw     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 != 0) goto L_0x00a5
            long r1 = r0.A0C     // Catch:{ OutOfMemoryError -> 0x017b }
            long r1 = r1 + r22
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ OutOfMemoryError -> 0x017b }
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00a5
        L_0x007f:
            X.1LV r7 = r8.A01     // Catch:{ OutOfMemoryError -> 0x017b }
            X.11F r6 = r0.A0H     // Catch:{ OutOfMemoryError -> 0x017b }
            boolean r1 = r6 instanceof X.AnonymousClass147     // Catch:{ OutOfMemoryError -> 0x017b }
            r5 = 0
            if (r1 == 0) goto L_0x00a9
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.AnonymousClass00C.A0E(r6, r1)     // Catch:{ OutOfMemoryError -> 0x017b }
            X.147 r6 = (X.AnonymousClass147) r6     // Catch:{ OutOfMemoryError -> 0x017b }
            X.12q r1 = r7.A02     // Catch:{ OutOfMemoryError -> 0x017b }
            int r2 = r1.A05(r6)     // Catch:{ OutOfMemoryError -> 0x017b }
            boolean r1 = X.C63833Lp.A00(r2)     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 == 0) goto L_0x009f
            X.147 r5 = r7.A02(r6)     // Catch:{ OutOfMemoryError -> 0x017b }
        L_0x009f:
            X.35K r1 = new X.35K     // Catch:{ OutOfMemoryError -> 0x017b }
            r1.<init>(r5, r2)     // Catch:{ OutOfMemoryError -> 0x017b }
            goto L_0x00a8
        L_0x00a5:
            if (r11 == 0) goto L_0x007f
            goto L_0x00ee
        L_0x00a8:
            r5 = r1
        L_0x00a9:
            r12 = 1
            r9 = 2
            if (r3 == 0) goto L_0x00ae
            r9 = 1
        L_0x00ae:
            if (r5 != 0) goto L_0x00b2
            r6 = 0
            goto L_0x00b4
        L_0x00b2:
            int r6 = r5.A00     // Catch:{ OutOfMemoryError -> 0x017b }
        L_0x00b4:
            boolean r1 = r0.A0G()     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 == 0) goto L_0x00d6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x017b }
            r2.<init>()     // Catch:{ OutOfMemoryError -> 0x017b }
            java.lang.String r1 = "ContactPhotosBitmapManager/getGroupProfilePictureFromServerIfNeeded/fetching group image from server/groupType = "
            r2.append(r1)     // Catch:{ OutOfMemoryError -> 0x017b }
            r2.append(r6)     // Catch:{ OutOfMemoryError -> 0x017b }
            java.lang.String r1 = " group jid = "
            r2.append(r1)     // Catch:{ OutOfMemoryError -> 0x017b }
            r2.append(r10)     // Catch:{ OutOfMemoryError -> 0x017b }
            java.lang.String r1 = r2.toString()     // Catch:{ OutOfMemoryError -> 0x017b }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ OutOfMemoryError -> 0x017b }
        L_0x00d6:
            r1 = 2
            if (r6 == r1) goto L_0x00dd
            r2 = 6
            r1 = 0
            if (r6 != r2) goto L_0x00de
        L_0x00dd:
            r1 = 1
        L_0x00de:
            if (r1 == 0) goto L_0x00f3
            if (r5 == 0) goto L_0x00f3
            X.147 r5 = r5.A01     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r5 == 0) goto L_0x00f3
            X.1O8 r2 = r8.A03     // Catch:{ OutOfMemoryError -> 0x017b }
            r1 = r10
            X.147 r1 = (X.AnonymousClass147) r1     // Catch:{ OutOfMemoryError -> 0x017b }
            r2.A02(r5, r1, r11, r9)     // Catch:{ OutOfMemoryError -> 0x017b }
        L_0x00ee:
            boolean r1 = r0.A0f     // Catch:{ OutOfMemoryError -> 0x017b }
            if (r1 == 0) goto L_0x017a
            goto L_0x0106
        L_0x00f3:
            if (r6 != r12) goto L_0x00fb
            X.1O8 r1 = r8.A03     // Catch:{ OutOfMemoryError -> 0x017b }
            r1.A02(r10, r13, r11, r9)     // Catch:{ OutOfMemoryError -> 0x017b }
            goto L_0x00ee
        L_0x00fb:
            X.0wU r1 = r8.A04     // Catch:{ OutOfMemoryError -> 0x017b }
            X.1iQ r7 = new X.1iQ     // Catch:{ OutOfMemoryError -> 0x017b }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ OutOfMemoryError -> 0x017b }
            r1.Boy(r7)     // Catch:{ OutOfMemoryError -> 0x017b }
            goto L_0x00ee
        L_0x0106:
            java.io.FileInputStream r2 = r8.A08(r0, r3)     // Catch:{ IOException -> 0x017a }
            if (r2 != 0) goto L_0x010f
            r0.A0f = r4     // Catch:{ all -> 0x016e }
            return r13
        L_0x010f:
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x016e }
            r12.<init>()     // Catch:{ all -> 0x016e }
            r1 = 1
            r12.inDither = r1     // Catch:{ all -> 0x016e }
            r12.inScaled = r4     // Catch:{ all -> 0x016e }
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x016e }
            r12.inPreferredConfig = r1     // Catch:{ all -> 0x016e }
            r16 = 1
            X.6Kx r11 = new X.6Kx     // Catch:{ all -> 0x016e }
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x016e }
            X.5sn r1 = X.AnonymousClass6Y8.A0A(r11, r2)     // Catch:{ all -> 0x016e }
            android.graphics.Bitmap r1 = r1.A02     // Catch:{ all -> 0x016e }
            if (r1 != 0) goto L_0x012e
            goto L_0x0135
        L_0x012e:
            r4 = r20
            android.graphics.Bitmap r5 = X.C27731Pn.A00(r1, r4, r14)     // Catch:{ all -> 0x016e }
            goto L_0x0136
        L_0x0135:
            r5 = r13
        L_0x0136:
            if (r5 != 0) goto L_0x016a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r4.<init>()     // Catch:{ all -> 0x016e }
            java.lang.String r1 = "contactPhotosBitmapManager/getphotofast/"
            r4.append(r1)     // Catch:{ all -> 0x016e }
            r4.append(r10)     // Catch:{ all -> 0x016e }
            java.lang.String r1 = " decodeStream returns null"
            r4.append(r1)     // Catch:{ all -> 0x016e }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x016e }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x016e }
            X.11F r1 = r0.A0H     // Catch:{ all -> 0x016e }
            boolean r1 = r1 instanceof X.C28981Uw     // Catch:{ all -> 0x016e }
            if (r1 == 0) goto L_0x016a
            r1 = -1
            if (r3 == 0) goto L_0x015b
            goto L_0x015e
        L_0x015b:
            r0.A06 = r1     // Catch:{ all -> 0x016e }
            goto L_0x0160
        L_0x015e:
            r0.A05 = r1     // Catch:{ all -> 0x016e }
        L_0x0160:
            X.1O7 r1 = r8.A06     // Catch:{ all -> 0x016e }
            X.16K r1 = r1.A03     // Catch:{ all -> 0x016e }
            r1.A04(r0)     // Catch:{ all -> 0x016e }
            r1.A03(r0)     // Catch:{ all -> 0x016e }
        L_0x016a:
            r2.close()     // Catch:{ IOException -> 0x017a }
            return r5
        L_0x016e:
            r1 = move-exception
            if (r2 == 0) goto L_0x0179
            r2.close()     // Catch:{ all -> 0x0175 }
            goto L_0x0179
        L_0x0175:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x017a }
        L_0x0179:
            throw r1     // Catch:{ IOException -> 0x017a }
        L_0x017a:
            return r13
        L_0x017b:
            r1 = move-exception
            java.lang.String r0 = "contactPhotosBitmapManager/getphotofast/out-of-memory "
            com.whatsapp.util.Log.e(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27761Ps.A00(android.content.Context, X.141, float, int, long, boolean):android.graphics.Bitmap");
    }

    public static void A02(AnonymousClass026 r10, C27761Ps r11, AnonymousClass141 r12, GroupJid groupJid, AnonymousClass147 r14, String str) {
        C27771Pt r1 = r11.A05;
        C138286hc r9 = new C138286hc(r10, r11, r12, groupJid, r14, str);
        B90 b90 = new B90(r10, 1);
        AnonymousClass00C.A0D(r14, 1);
        AnonymousClass00C.A0D(groupJid, 2);
        C62393Fz r3 = new C62393Fz(new C23224BAg(r9, b90, 0), (AnonymousClass19A) r1.A02.A00.A00.A4x.get());
        r3.A00(r14, groupJid, r3.A00.A09(), (String) null, str, "image", "blob");
    }

    public static void A04(AnonymousClass026 r9, C27761Ps r10, AnonymousClass141 r11, String str, String str2) {
        GroupJid groupJid;
        C27771Pt r1 = r10.A05;
        if (r11 != null) {
            groupJid = (GroupJid) r11.A06(GroupJid.class);
        } else {
            groupJid = null;
        }
        C138276hb r8 = new C138276hb(r9, r10, r11, str, str2);
        B90 b90 = new B90(r9, 0);
        AnonymousClass00C.A0D(str2, 2);
        C62393Fz r2 = new C62393Fz(new C23224BAg(r8, b90, 1), (AnonymousClass19A) r1.A02.A00.A00.A4x.get());
        String A09 = r2.A00.A09();
        r2.A00((GroupJid) null, groupJid, A09, str2, str, "preview", "blob");
    }

    public FileInputStream A08(AnonymousClass141 r6, boolean z) {
        File A012;
        if (!r6.A0f) {
            return null;
        }
        AnonymousClass16K r1 = this.A02;
        if (z) {
            A012 = r1.A00(r6);
            if (A012 == null || !A012.exists()) {
                A012 = r1.A01(r6);
                if (r6.A05 > 0 && this.A07.A0I(Environment.getExternalStorageState())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("contactPhotosBitmapManager/getphotostream/");
                    sb.append(r6.A0H);
                    sb.append(" full file missing id:");
                    sb.append(r6.A05);
                    Log.e(sb.toString());
                    r6.A05 = 0;
                }
            }
        } else {
            A012 = r1.A01(r6);
            if (A012 == null || !A012.exists()) {
                A012 = r1.A00(r6);
                if (r6.A06 > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("contactPhotosBitmapManager/getphotostream/");
                    sb2.append(r6.A0H);
                    sb2.append(" thumb file missing id:");
                    sb2.append(r6.A06);
                    Log.e(sb2.toString());
                    r6.A06 = 0;
                }
            }
        }
        if (A012 == null || !A012.exists()) {
            return null;
        }
        try {
            return new FileInputStream(A012);
        } catch (FileNotFoundException e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("contactPhotosBitmapManager/getphotostream/");
            sb3.append(r6.A0H);
            sb3.append(" photo file not found");
            Log.e(sb3.toString(), e);
            return null;
        }
    }

    public C27761Ps(C19730wQ r1, AnonymousClass1LV r2, C27771Pt r3, AnonymousClass16K r4, AnonymousClass1O7 r5, C20830yE r6, AnonymousClass1O8 r7, C19770wU r8) {
        this.A00 = r1;
        this.A04 = r8;
        this.A02 = r4;
        this.A06 = r5;
        this.A03 = r7;
        this.A07 = r6;
        this.A01 = r2;
        this.A05 = r3;
    }

    public static Bitmap A01(C16680pu r1) {
        try {
            return (Bitmap) r1.get();
        } catch (OutOfMemoryError e) {
            Log.e("contactPhotosBitmapManager/decode-bitmap/out-of-memory ", e);
            return null;
        }
    }
}
