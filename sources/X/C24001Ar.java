package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

/* renamed from: X.1Ar  reason: invalid class name and case insensitive filesystem */
public class C24001Ar {
    public final C24041Av A00;
    public final AnonymousClass1B4 A01;
    public final C24031Au A02;
    public final C23981Ap A03;
    public final AnonymousClass1B3 A04;
    public final C24011As A05;
    public volatile boolean A06 = false;

    public static void A00(C24001Ar r8) {
        String str;
        if (!r8.A06) {
            AnonymousClass1B4 r2 = r8.A01;
            synchronized (r2) {
                if (!r8.A06) {
                    C24011As r3 = r8.A05;
                    Iterator it = r3.A01(Integer.MAX_VALUE, 0).iterator();
                    while (it.hasNext()) {
                        AnonymousClass6EB r5 = (AnonymousClass6EB) it.next();
                        if (r5.A01 == null) {
                            try {
                                AnonymousClass1B3 r6 = r8.A04;
                                String str2 = r5.A0B;
                                String str3 = r5.A0D;
                                File A042 = r6.A00.A04(str2, str3);
                                if (A042.exists()) {
                                    AnonymousClass6FM A002 = r6.A01.A00(A042, str3);
                                    if (A002 != null) {
                                        str = A002.A01(A042);
                                    } else {
                                        str = null;
                                    }
                                    r5.A01 = str;
                                    r3.A02(r5);
                                } else {
                                    throw new FileNotFoundException("StickerImageHashCalculator/getImageHash/could not get internally managed media file for sticker");
                                }
                            } catch (FileNotFoundException e) {
                                Log.e("StarredStickers/initStickerDedupeMappings/could not get internally managed media file for sticker, dropping it from starred", e);
                                r3.A03(r5.A0B);
                            }
                        }
                        r2.A01(r5.A0B, r5.A01);
                    }
                    r8.A06 = true;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C135066c4 A01(java.lang.String r6) {
        /*
            r5 = this;
            X.1As r2 = r5.A05
            r1 = 0
            X.AnonymousClass00C.A0D(r6, r1)
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r3[r1] = r6
            X.005 r0 = r2.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r4 = r0.get()
            X.14e r2 = r4.A02     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers WHERE plaintext_hash = ? ORDER BY timestamp DESC"
            java.lang.String r0 = "getStarredStickerDataFromFileHash/QUERY_STARRED_STICKER"
            android.database.Cursor r3 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x0046 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r0 == 0) goto L_0x002c
            X.6EB r2 = X.C24011As.A00(r3)     // Catch:{ all -> 0x003f }
        L_0x002c:
            r3.close()     // Catch:{ all -> 0x0046 }
            r4.close()
            if (r2 != 0) goto L_0x0036
            r0 = 0
            return r0
        L_0x0036:
            X.1Ap r1 = r5.A03
            X.1Av r0 = r5.A00
            X.6c4 r0 = X.C111675cf.A00(r0, r1, r2)
            return r0
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24001Ar.A01(java.lang.String):X.6c4");
    }

    public C24001Ar(C24041Av r2, C24031Au r3, C23981Ap r4, AnonymousClass1B3 r5, C24011As r6) {
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r2;
        this.A01 = new AnonymousClass1B4();
    }

    public void A02(String str) {
        C18740tg.A00();
        A00(this);
        AnonymousClass1B4 r1 = this.A01;
        r1.A02(str, r1.A00(str));
        this.A05.A03(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
        X.C05600Qi.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0051, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(java.lang.String r7) {
        /*
            r6 = this;
            X.C18740tg.A00()
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x0015
            X.1B4 r2 = r6.A01
            monitor-enter(r2)
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x0012 }
            boolean r5 = r0.containsKey(r7)     // Catch:{ all -> 0x0012 }
            monitor-exit(r2)
            return r5
        L_0x0012:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0015:
            X.1As r1 = r6.A05
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            r5 = 1
            java.lang.String[] r4 = new java.lang.String[r5]
            r4[r0] = r7
            X.005 r0 = r1.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r3 = r0.get()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers WHERE plaintext_hash = ? ORDER BY timestamp DESC"
            java.lang.String r0 = "checkStickerHashIsStarred/QUERY_STARRED_STICKER"
            android.database.Cursor r2 = r2.A09(r1, r0, r4)     // Catch:{ all -> 0x004b }
            int r0 = r2.getCount()     // Catch:{ all -> 0x0044 }
            if (r0 > 0) goto L_0x003d
            r5 = 0
        L_0x003d:
            r2.close()     // Catch:{ all -> 0x004b }
            r3.close()
            return r5
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1 = move-exception
            X.C05600Qi.A00(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24001Ar.A03(java.lang.String):boolean");
    }
}
