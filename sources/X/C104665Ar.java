package X;

import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5Ar  reason: invalid class name and case insensitive filesystem */
public final class C104665Ar extends AnonymousClass1XM {
    public final C20690y0 A00;
    public final AnonymousClass17Y A01;
    public final C24041Av A02;
    public final AnonymousClass1DF A03;
    public final AnonymousClass1BF A04;
    public final AnonymousClass1B4 A05 = new AnonymousClass1B4();
    public final C23981Ap A06;
    public final AnonymousClass1BB A07;
    public final AnonymousClass1AP A08;
    public final AnonymousClass1C2 A09;
    public final C24231Bq A0A;
    public final C23991Aq A0B;
    public final C19930wk A0C;
    public final Map A0D = AnonymousClass001.A0J();
    public final boolean A0E;
    public final AnonymousClass1B0 A0F;

    public final Pair A0C(String str) {
        Object A0t;
        AnonymousClass00C.A0D(str, 0);
        Iterator it = A0F().iterator();
        while (it.hasNext()) {
            C135066c4 A0U = C90504aG.A0U(it);
            if (str.equals(A0U.A0E)) {
                Map map = this.A0D;
                if (map.containsKey(str)) {
                    A0t = map.get(str);
                } else {
                    A0t = C36411kG.A0t();
                }
                return C36441kJ.A0Q(A0U, A0t);
            }
        }
        return null;
    }

    public final C135066c4 A0D(String str) {
        AnonymousClass00C.A0D(str, 0);
        Iterator it = A0F().iterator();
        while (it.hasNext()) {
            C135066c4 A0U = C90504aG.A0U(it);
            if (str.equals(A0U.A0E)) {
                return A0U;
            }
        }
        return null;
    }

    public final void A0I(C158497hb r4, C135066c4 r5) {
        AnonymousClass00C.A0D(r5, 0);
        this.A0C.execute(new AnonymousClass737(this, r5, r4, 6));
    }

    public final void A0J(C158497hb r11, C135066c4 r12) {
        C135066c4 r4 = r12;
        AnonymousClass00C.A0D(r12, 0);
        String str = r12.A0E;
        if (str != null) {
            A08(new C1271367c(r4, str, this.A05.A00(str), r12.A06, 0));
            if (r11 != null) {
                r11.BVC(str);
            }
            this.A01.A0H(new C81183wb(this, 0));
        }
    }

    public final void A0K(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, boolean z, boolean z2) {
        String str8 = str;
        AnonymousClass00C.A0D(str8, 0);
        C135066c4 r4 = new C135066c4((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false);
        r4.A0E = str8;
        String str9 = str2;
        if (str2 != null) {
            r4.A0H = str9;
        }
        String str10 = str3;
        if (str3 != null) {
            r4.A09 = str10;
        }
        String str11 = str4;
        if (str4 != null) {
            r4.A07 = str11;
        }
        String str12 = str5;
        if (str5 != null) {
            r4.A0D = str12;
        }
        String str13 = str6;
        if (str6 != null) {
            r4.A0C = str13;
        }
        r4.A00 = i;
        r4.A03 = i2;
        r4.A02 = i3;
        r4.A08 = str7;
        r4.A0M = z;
        r4.A0N = z2;
        this.A0A.A02(r4);
        Iterator it = super.A04().iterator();
        while (it.hasNext()) {
            C1271367c r1 = (C1271367c) it.next();
            if (str8.equals(r1.A02)) {
                r1.A00(r4);
            }
        }
    }

    public final boolean A0L(String str) {
        Map map;
        int size;
        boolean containsKey;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass1B4 r2 = this.A05;
        synchronized (r2) {
            map = r2.A00;
            size = map.size();
        }
        if (size <= 0) {
            return AnonymousClass000.A1V(A0D(str));
        }
        synchronized (r2) {
            containsKey = map.containsKey(str);
        }
        return containsKey;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104665Ar(X.C24211Bo r15, X.C116075ju r16, X.C20690y0 r17, X.AnonymousClass17Y r18, X.C24041Av r19, X.AnonymousClass1DF r20, X.AnonymousClass1BF r21, X.C23981Ap r22, X.AnonymousClass1BB r23, X.AnonymousClass1AP r24, X.AnonymousClass1C2 r25, X.AnonymousClass1B0 r26, X.C23991Aq r27, X.C19770wU r28, boolean r29) {
        /*
            r14 = this;
            r3 = r28
            r4 = r27
            r8 = r22
            r12 = r18
            r13 = r17
            X.C36321k7.A1B(r12, r3, r13, r4, r8)
            r6 = r24
            r7 = r23
            r9 = r21
            r10 = r20
            X.C36321k7.A1C(r7, r6, r10, r9, r15)
            r5 = r25
            r11 = r19
            r0 = r16
            X.C36321k7.A15(r5, r0, r11)
            X.0w4 r0 = r0.A00
            X.0tq r0 = r0.A00
            X.004 r0 = r0.A3P
            java.lang.Object r0 = r0.get()
            X.1Bo r0 = (X.C24211Bo) r0
            X.6vD r1 = new X.6vD
            r2 = r29
            r1.<init>(r0, r2)
            r0 = 32
            r14.<init>(r1, r0)
            r14.A01 = r12
            r14.A00 = r13
            r14.A0B = r4
            r14.A06 = r8
            r14.A07 = r7
            r14.A08 = r6
            r14.A03 = r10
            r14.A04 = r9
            r14.A09 = r5
            r14.A02 = r11
            r0 = r26
            r14.A0F = r0
            r14.A0E = r2
            X.1Bq r0 = r15.A00(r2)
            r14.A0A = r0
            X.0wk r0 = X.C36411kG.A0r(r3)
            r14.A0C = r0
            X.1B4 r0 = new X.1B4
            r0.<init>()
            r14.A05 = r0
            java.util.HashMap r0 = X.AnonymousClass001.A0J()
            r14.A0D = r0
            android.os.ConditionVariable r0 = X.C18740tg.A00
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104665Ar.<init>(X.1Bo, X.5ju, X.0y0, X.17Y, X.1Av, X.1DF, X.1BF, X.1Ap, X.1BB, X.1AP, X.1C2, X.1B0, X.1Aq, X.0wU, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r4.A0L != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010e, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0111, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C158497hb r16, X.C104665Ar r17, X.C135066c4 r18, long r19) {
        /*
            r4 = r18
            r10 = r4
            boolean r0 = r4.A0L
            r5 = r17
            if (r0 == 0) goto L_0x0041
            X.1BF r0 = r5.A04
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0041
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x0041
            java.lang.String r1 = r4.A06
            if (r1 != 0) goto L_0x002e
            java.lang.String r0 = "RecentStickers/ sent sticker avatar sticker stable id is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r1 = "Avatar Sticker with NULL stable ID found"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
        L_0x0024:
            java.lang.String r0 = r4.A0E
            if (r0 == 0) goto L_0x002d
            r1 = r16
            r1.BVC(r0)
        L_0x002d:
            return
        L_0x002e:
            X.1Aq r0 = r5.A0B
            X.6c4 r10 = r0.A00(r1)
            if (r10 != 0) goto L_0x0046
            X.1C2 r0 = r5.A09
            X.6c4 r10 = r0.A01(r4)
            if (r10 != 0) goto L_0x0046
            java.lang.String r0 = "RecentStickers/unable to find ondemand sticker matching avatar stable id"
            goto L_0x004c
        L_0x0041:
            boolean r0 = r4.A0L
            if (r0 == 0) goto L_0x0046
            goto L_0x0024
        L_0x0046:
            java.lang.String r0 = r10.A0A
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "RecentStickers/add file path is null"
        L_0x004c:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0024
        L_0x0050:
            java.lang.String r3 = r10.A0E
            if (r3 != 0) goto L_0x0057
            java.lang.String r0 = "RecentStickers/add file hash is null"
            goto L_0x004c
        L_0x0057:
            boolean r2 = r5.A0L(r3)
            r8 = 1
            r0 = r19
            if (r2 == 0) goto L_0x00df
            java.util.Map r9 = r5.A0D
            java.lang.Number r2 = X.C90524aI.A0b(r3, r9)
            long r6 = X.C36371kC.A0A(r2)
            long r2 = java.lang.Math.max(r0, r6)
            boolean r3 = r5.A01(r10, r2)
            int r2 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x00af
            if (r3 == 0) goto L_0x00af
            java.lang.String r6 = r10.A0E
            X.C18740tg.A06(r6)
            X.1Bq r2 = r5.A0A
            r7 = 0
            if (r6 != 0) goto L_0x00bb
            java.lang.String r2 = "RecentStickerDBStorage/updateLastStickerSentTs/sticker filehash is null, could not be updated"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0087:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.AnonymousClass00C.A0B(r6)
            r9.put(r6, r2)
            java.util.ArrayList r2 = super.A04()
            java.util.Iterator r7 = r2.iterator()
        L_0x0099:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x00af
            java.lang.Object r3 = r7.next()
            X.67c r3 = (X.C1271367c) r3
            java.lang.String r2 = r3.A02
            boolean r2 = X.AnonymousClass00C.A0J(r6, r2)
            if (r2 == 0) goto L_0x0099
            r3.A00 = r0
        L_0x00af:
            X.17Y r2 = r5.A01
            X.3wb r1 = new X.3wb
            r1.<init>(r5, r8)
        L_0x00b6:
            r2.Bp3(r1)
            goto L_0x0024
        L_0x00bb:
            X.005 r2 = r2.A01
            X.1M0 r2 = X.C90494aF.A0K(r2)
            java.lang.String r13 = "plaintext_hash = ?"
            java.lang.String[] r15 = new java.lang.String[r8]     // Catch:{ all -> 0x010b }
            java.lang.String r3 = r10.A0E     // Catch:{ all -> 0x010b }
            r15[r7] = r3     // Catch:{ all -> 0x010b }
            android.content.ContentValues r11 = X.C36441kJ.A0E()     // Catch:{ all -> 0x010b }
            java.lang.String r3 = "last_sticker_sent_ts"
            X.C36341k9.A0p(r11, r3, r0)     // Catch:{ all -> 0x010b }
            X.14e r10 = r2.A02     // Catch:{ all -> 0x010b }
            java.lang.String r12 = "recent_stickers"
            java.lang.String r14 = "updateSticker/UPDATE_RECENT_STICKERS_LAST_SENT_TS"
            r10.A01(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x010b }
            r2.close()
            goto L_0x0087
        L_0x00df:
            boolean r2 = r10.A03()
            if (r2 == 0) goto L_0x0106
            X.1AP r2 = r5.A08
            java.io.File r2 = r2.A05(r10)
        L_0x00eb:
            if (r2 == 0) goto L_0x00fc
            java.lang.String r2 = r2.getAbsolutePath()
            r10.A02(r2, r8)
            X.1Ap r2 = r5.A06
            r2.A04(r10)
            r5.A01(r10, r0)
        L_0x00fc:
            X.17Y r2 = r5.A01
            r0 = 48
            X.3wa r1 = new X.3wa
            r1.<init>((java.lang.Object) r5, (int) r0)
            goto L_0x00b6
        L_0x0106:
            java.io.File r2 = r5.A0E(r10)
            goto L_0x00eb
        L_0x010b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010d }
        L_0x010d:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104665Ar.A00(X.7hb, X.5Ar, X.6c4, long):void");
    }

    private final boolean A01(C135066c4 r19, long j) {
        String A1A;
        String str;
        AnonymousClass6FM A002;
        C135066c4 r7 = r19;
        String str2 = r7.A0E;
        if (str2 != null) {
            AnonymousClass1B4 r5 = this.A05;
            String A003 = r5.A00(str2);
            String str3 = r7.A0A;
            if (A003 == null) {
                if (!(str3 == null || (A002 = this.A0F.A00(C90524aI.A0S(str3), r7.A0D)) == null)) {
                    File A0S = C90524aI.A0S(str3);
                    if (!A0S.exists()) {
                        C36321k7.A1P("StickerHandler/getFileHashExcludingMetadata/file does not exist, ", str3, AnonymousClass000.A0u());
                    } else {
                        A003 = A002.A01(A0S);
                        if (A003 == null) {
                            return false;
                        }
                    }
                }
            }
            synchronized (r5) {
                A1A = C36431kI.A1A(A003, r5.A01);
            }
            if (A1A != null && !AnonymousClass00C.A0J(r7.A0E, A1A)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("RecentStickers/dedupeStickerFilesBasedOnImageHash/Removing old sticker from recents:");
                A0u.append(A1A);
                A0u.append(", with the same image hash:");
                A0u.append(A003);
                A0u.append(", with the new sticker:");
                C36321k7.A1a(A0u, r7.A0E);
                A08(new C1271367c(r7, A1A, A003, r7.A06, 0));
            }
            if (r7.A0D == null) {
                if (r7.A0N) {
                    str = "application/was";
                } else {
                    str = "image/webp";
                }
                r7.A0D = str;
            }
            return super.A09(new C1271367c(r7, str2, A003, r7.A06, j));
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void A0B(C88794Ub r5) {
        C146226vG r52 = (C146226vG) r5;
        AnonymousClass00C.A0D(r52, 0);
        C18740tg.A00();
        C36321k7.A1K(r52, "RecentStickers/addEntry/adding entry: ", AnonymousClass000.A0u());
        AnonymousClass1B4 r2 = this.A05;
        C1271367c r1 = r52.A01;
        String str = r1.A02;
        r2.A01(str, r1.A03);
        Map map = this.A0D;
        AnonymousClass00C.A08(str);
        map.put(str, Long.valueOf(r1.A00));
        super.A0B(r52);
    }

    public void A0A(int i) {
        C18740tg.A00();
        C1271367c r3 = (C1271367c) A03(i);
        if (r3 != null) {
            C36321k7.A1K(r3, "RecentStickers/removeEntry/removing entry: ", AnonymousClass000.A0u());
            String str = r3.A04.A0D;
            C24041Av r0 = this.A02;
            String str2 = r3.A02;
            r0.A07(str2, str);
            this.A05.A02(str2, r3.A03);
            this.A0D.remove(str2);
            super.A0A(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r0 == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A0E(X.C135066c4 r7) {
        /*
            r6 = this;
            X.C18740tg.A00()
            java.lang.String r3 = r7.A0E
            r5 = 0
            if (r3 == 0) goto L_0x0062
            X.1Av r2 = r6.A02
            java.lang.String r0 = r7.A0D
            java.io.File r4 = r2.A04(r3, r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0020
            r4.getAbsolutePath()
        L_0x0019:
            java.lang.String r0 = r7.A0D
            java.io.File r0 = r2.A03(r3, r0)
            return r0
        L_0x0020:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x0062
            java.lang.String r1 = r4.getAbsolutePath()
            java.lang.String r0 = r7.A0A
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = r7.A0A
            if (r0 == 0) goto L_0x0062
            X.C18740tg.A00()
            java.lang.String r0 = r7.A0A
            if (r0 == 0) goto L_0x005c
            r4.getAbsolutePath()     // Catch:{ IOException -> 0x004a }
            X.0y0 r1 = r6.A00     // Catch:{ IOException -> 0x004a }
            java.io.File r0 = X.C90524aI.A0S(r0)     // Catch:{ IOException -> 0x004a }
            r1.A0e(r0, r4)     // Catch:{ IOException -> 0x004a }
            goto L_0x005e
        L_0x004a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RecentStickers/copyFile/error copying file sticker"
            r1.append(r0)
            java.lang.String r0 = r7.A0F
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = ""
        L_0x0059:
            X.C36321k7.A1Z(r1, r0)
        L_0x005c:
            r0 = 0
            goto L_0x005f
        L_0x005e:
            r0 = 1
        L_0x005f:
            if (r0 == 0) goto L_0x0062
            goto L_0x0019
        L_0x0062:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104665Ar.A0E(X.6c4):java.io.File");
    }

    public final ArrayList A0F() {
        String str;
        ArrayList A042 = super.A04();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            C1271367c r3 = (C1271367c) it.next();
            AnonymousClass1B4 r1 = this.A05;
            String str2 = r3.A02;
            r1.A01(str2, r3.A03);
            Map map = this.A0D;
            AnonymousClass00C.A07(str2);
            map.put(str2, Long.valueOf(r3.A00));
            C135066c4 r32 = r3.A04;
            String str3 = r32.A0E;
            if (str3 == null) {
                r32.A0E = str2;
                str3 = str2;
            }
            if (r32.A0N) {
                str = "application/was";
            } else {
                str = "image/webp";
            }
            r32.A0D = str;
            File A043 = this.A02.A04(str3, str);
            r32.A02(A043.getAbsolutePath(), 1);
            if (A043.getAbsolutePath() != null) {
                this.A06.A04(r32);
            }
            A0I.add(r32.A00());
        }
        return A0I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A0G() {
        /*
            r10 = this;
            java.util.ArrayList r9 = super.A04()
            java.util.Iterator r8 = r9.iterator()
        L_0x0008:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r5 = r8.next()
            X.67c r5 = (X.C1271367c) r5
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.1Bq r4 = r10.A0A
            java.lang.String r7 = r5.A02
            X.AnonymousClass00C.A07(r7)
            java.lang.String[] r3 = X.C36441kJ.A1R()
            r3[r0] = r7
            X.005 r0 = r4.A01
            X.1M0 r6 = X.C90484aE.A0W(r0)
            X.14e r2 = r6.A02     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id, is_fun_sticker, is_lottie FROM recent_stickers WHERE plaintext_hash = ?"
            java.lang.String r0 = "getStickerFromFileHash/QUERY_RECENT_STICKER"
            android.database.Cursor r2 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x00d0 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x004b
            X.005 r0 = r4.A00     // Catch:{ all -> 0x00c9 }
            java.lang.Object r0 = X.C36411kG.A0v(r0)     // Catch:{ all -> 0x00c9 }
            X.1Ap r0 = (X.C23981Ap) r0     // Catch:{ all -> 0x00c9 }
            X.6c4 r3 = X.C24231Bq.A00(r2, r0)     // Catch:{ all -> 0x00c9 }
            r2.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x0060
        L_0x004b:
            r2.close()     // Catch:{ all -> 0x00d0 }
            r6.close()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RecentStickerDBStorage/getStickerFromFileHash/sticker unable to be retrieved from recent stickers db: filehash = "
            X.C36321k7.A1P(r0, r7, r1)
            java.lang.String r0 = "RecentStickers/getStickerListAndWeights/recent sticker not found in db"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00b6
        L_0x0060:
            r6.close()
            java.lang.String r0 = r3.A07
            if (r0 != 0) goto L_0x00b3
            X.1DF r6 = r10.A03
            r1 = 20
            r0 = 1
            X.5x5 r1 = r6.A09(r7, r1, r0)
            if (r1 == 0) goto L_0x00b6
            X.6c4 r3 = new X.6c4
            r3.<init>()
            r3.A0E = r7
            java.lang.String r0 = r1.A04
            r3.A0H = r0
            java.lang.String r0 = r1.A03
            r3.A09 = r0
            X.3Qj r7 = r1.A02
            java.lang.String r0 = r7.A0J
            r3.A07 = r0
            java.lang.String r1 = r1.A05
            r3.A0D = r1
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equals(r1)
            r3.A0N = r0
            byte[] r1 = r7.A0a
            if (r1 == 0) goto L_0x009e
            r0 = 3
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            r3.A0C = r0
        L_0x009e:
            long r1 = r7.A0C
            int r0 = (int) r1
            r3.A00 = r0
            int r0 = r7.A0A
            r3.A03 = r0
            int r0 = r7.A06
            r3.A02 = r0
            X.1Ap r0 = r6.A0C
            r0.A04(r3)
            r4.A02(r3)
        L_0x00b3:
            r5.A00(r3)
        L_0x00b6:
            X.6c4 r1 = r5.A04
            java.lang.String r0 = r1.A0D
            if (r0 != 0) goto L_0x0008
            boolean r0 = r1.A0N
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "application/was"
        L_0x00c2:
            r1.A0D = r0
            goto L_0x0008
        L_0x00c6:
            java.lang.String r0 = "image/webp"
            goto L_0x00c2
        L_0x00c9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x00d0 }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        L_0x00d7:
            java.util.HashMap r7 = super.A06()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r9.iterator()
        L_0x00e3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x011a
            java.lang.Object r4 = r5.next()
            X.67c r4 = (X.C1271367c) r4
            X.6c4 r0 = r4.A04
            X.6c4 r3 = r0.A00()
            java.lang.String r2 = r3.A0E
            if (r2 != 0) goto L_0x0106
            java.lang.String r0 = "RecentStickers/setRecentStickerFilePath/sticker param has null file hash"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00fe:
            java.lang.Object r0 = r7.get(r4)
            X.C36361kB.A1O(r3, r0, r6)
            goto L_0x00e3
        L_0x0106:
            X.1Av r1 = r10.A02
            java.lang.String r0 = r3.A0D
            java.io.File r2 = r1.A04(r2, r0)
            java.lang.String r1 = r2.getAbsolutePath()
            r0 = 1
            r3.A02(r1, r0)
            r2.getAbsolutePath()
            goto L_0x00fe
        L_0x011a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104665Ar.A0G():java.util.ArrayList");
    }

    public final HashMap A0H() {
        ArrayList A042 = super.A04();
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            C1271367c r0 = (C1271367c) it.next();
            String str = r0.A02;
            if (str != null) {
                C36421kH.A1K(str, A0J, r0.A00);
            }
        }
        return A0J;
    }
}
