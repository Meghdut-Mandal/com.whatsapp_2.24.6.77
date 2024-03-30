package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1AP  reason: invalid class name */
public class AnonymousClass1AP {
    public AnonymousClass6CW A00;
    public byte[] A01;
    public final C20690y0 A02;
    public final AnonymousClass17Y A03;
    public final C24041Av A04;
    public final C19970wo A05;
    public final C19630wG A06;
    public final C19420v0 A07;
    public final C20810yC A08;
    public final C21010yW A09;
    public final C23871Ae A0A;
    public final C24031Au A0B;
    public final C23981Ap A0C;
    public final AnonymousClass1BB A0D;
    public final AnonymousClass1BR A0E;
    public final AnonymousClass1BC A0F;
    public final AnonymousClass1BG A0G;
    public final C24001Ar A0H;
    public final AnonymousClass1BD A0I;
    public final AnonymousClass1B5 A0J;
    public final C23991Aq A0K;
    public final AnonymousClass1BI A0L;
    public final AnonymousClass1BH A0M;
    public final C19770wU A0N;
    public final AnonymousClass005 A0O;
    public final C19700wN A0P;
    public final C20050ww A0Q;
    public final C21060yb A0R;
    public final C20840yF A0S;
    public final AnonymousClass13E A0T;
    public final AnonymousClass1BF A0U;
    public final AnonymousClass1BA A0V;
    public final WebpUtils A0W;
    public final AnonymousClass1C2 A0X;
    public final C24171Bj A0Y;
    public final C24181Bk A0Z;
    public final AnonymousClass1BP A0a;

    public static File A00(AnonymousClass1AP r2, String str) {
        File A0G2 = r2.A04.A00.A0G();
        if (!A0G2.exists() && !A0G2.mkdirs()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".png");
        return new File(A0G2, sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(X.C135066c4 r8) {
        /*
            r7 = this;
            java.lang.String r4 = r8.A0E
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x005c }
            r6 = r7
            monitor-enter(r6)     // Catch:{ NoSuchAlgorithmException -> 0x005c }
            byte[] r0 = r7.A01     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0039
            X.0v0 r5 = r7.A07     // Catch:{ all -> 0x0059 }
            X.005 r0 = r5.A00     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "sticker_hash_salt"
            r0 = 0
            java.lang.String r1 = r1.getString(r2, r0)     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x003c
            r0 = 32
            byte[] r1 = X.C18750th.A0H(r0)     // Catch:{ all -> 0x0059 }
            r7.A01 = r1     // Catch:{ all -> 0x0059 }
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r5)     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)     // Catch:{ all -> 0x0059 }
            r0.apply()     // Catch:{ all -> 0x0059 }
        L_0x0039:
            byte[] r0 = r7.A01     // Catch:{ all -> 0x0059 }
            goto L_0x0044
        L_0x003c:
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x0059 }
            r7.A01 = r0     // Catch:{ all -> 0x0059 }
            goto L_0x0039
        L_0x0044:
            monitor-exit(r6)     // Catch:{ NoSuchAlgorithmException -> 0x005c }
            r3.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x005c }
            byte[] r0 = r4.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x005c }
            r3.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x005c }
            byte[] r1 = r3.digest()     // Catch:{ NoSuchAlgorithmException -> 0x005c }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x005c }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ NoSuchAlgorithmException -> 0x005c }
            throw r0     // Catch:{ NoSuchAlgorithmException -> 0x005c }
        L_0x005c:
            r0 = 0
        L_0x005d:
            r8.A0F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AP.A01(X.6c4):void");
    }

    public Pair A02(C135066c4 r6) {
        String str;
        InputStream A062;
        String str2;
        C18740tg.A06(r6.A0E);
        String str3 = null;
        try {
            C20840yF r2 = this.A0S;
            File A012 = r2.A00.A01(AnonymousClass14B.A0A(Base64.encodeToString(C18750th.A0H(32), 2)));
            if (!(r6.A01 == 3 || (str2 = r6.A0A) == null)) {
                try {
                    this.A02.A0e(new File(str2), A012);
                    if (A012.exists()) {
                        return new Pair(A012, r6.A0E);
                    }
                } catch (IOException e) {
                    e = e;
                    str = "StickerRepository/moveThirdPartyStickerToTempStorage failed to copy cached file";
                    Log.e(str, e);
                    return null;
                }
            }
            boolean z = false;
            try {
                A062 = this.A0R.A0O().A06(Uri.parse(r6.A0A));
                if (A062 != null) {
                    z = AnonymousClass6YY.A0S(A012, A062);
                }
                if (A062 != null) {
                    A062.close();
                }
                if (z) {
                    try {
                        WebpUtils webpUtils = this.A0W;
                        AnonymousClass6HK.A00(webpUtils, A012, (Boolean) null, (String) null);
                        AnonymousClass3S2 r0 = r6.A04;
                        if (r0 == null || webpUtils.A02(A012, r0.A02())) {
                            try {
                                str3 = AnonymousClass6UG.A00(A012);
                            } catch (IOException e2) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("StickerRepository/moveThirdPartyStickerToTempStorage could not get file hash; file=");
                                sb.append(A012);
                                Log.e(sb.toString(), e2);
                            }
                        } else {
                            Log.e("StickerRepository/moveThirdPartyStickerToTempStorage failed to insert metadata");
                            AnonymousClass6YY.A0P(A012);
                            return null;
                        }
                    } catch (AnonymousClass1AU e3) {
                        Log.e("StickerRepository/moveThirdPartyStickerToTempStorage sticker file failed validation", e3);
                        AnonymousClass6YY.A0P(A012);
                        return null;
                    }
                }
                return new Pair(A012, str3);
            } catch (IOException e4) {
                Log.e("StickerRepository/moveThirdPartyStickerToTempStorage failed to copy external file", e4);
                AnonymousClass6YY.A0P(A012);
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        } catch (IOException e5) {
            e = e5;
            str = "StickerRepository/moveThirdPartyStickerToTempStorage failed to generate internal temp file";
            Log.e(str, e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r4 == null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass68B A03(X.C159687jl r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            X.1B5 r3 = r6.A0J
            X.68B r4 = r3.A03(r8)
            if (r4 != 0) goto L_0x000c
            X.68B r4 = r3.A02(r8)
        L_0x000c:
            if (r9 == 0) goto L_0x002a
            if (r4 != 0) goto L_0x0070
            java.lang.String r0 = " "
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x002c
            X.1Bk r0 = r6.A0Z
            r0.A00()
            X.68B r4 = r3.A02(r8)
            if (r4 != 0) goto L_0x0070
            X.1BR r0 = r6.A0E
            X.68B r0 = r0.A02(r7, r8)
            return r0
        L_0x002a:
            if (r4 != 0) goto L_0x0070
        L_0x002c:
            java.lang.String r0 = " "
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0093
            android.util.Pair r5 = X.AnonymousClass1BM.A00(r8)     // Catch:{ Exception -> 0x0059 }
            if (r5 == 0) goto L_0x0093
            X.1BP r2 = r6.A0a     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r1 = r5.first     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r0 = r5.second     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0059 }
            boolean r0 = r2.A03(r1, r0)     // Catch:{ Exception -> 0x0059 }
            if (r0 == 0) goto L_0x0093
            X.1BI r2 = r6.A0L     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r1 = r5.first     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r0 = r5.second     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0059 }
            X.68B r4 = r2.A00(r1, r0)     // Catch:{ Exception -> 0x0059 }
            goto L_0x008d
        L_0x0059:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "StickerRepository/getStickerPackByIdSync/error fetching sticker pack: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 0
            return r0
        L_0x0070:
            java.lang.String r0 = r4.A03
            if (r0 == 0) goto L_0x007a
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x008d
        L_0x007a:
            X.1BR r2 = r6.A0E
            java.lang.String r1 = r4.A0F
            r0 = 0
            X.68B r1 = r2.A02(r0, r1)
            if (r1 == 0) goto L_0x008d
            java.util.List r0 = r1.A04
            r4.A04 = r0
            java.util.List r0 = r1.A05
            r4.A05 = r0
        L_0x008d:
            int r0 = r3.A01(r8)
            r4.A00 = r0
        L_0x0093:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AP.A03(X.7jl, java.lang.String, boolean):X.68B");
    }

    public AnonymousClass6CW A04() {
        AnonymousClass6CW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        Context context = this.A06.A00;
        File file = new File(context.getCacheDir(), "stickers_preview_images");
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder sb = new StringBuilder();
            sb.append("StickerRepository/getPreviewImageLoader/could not create diskcache directory:");
            sb.append(file.getAbsolutePath());
            Log.w(sb.toString());
        }
        long min = Math.min(4194304, file.getFreeSpace() / 16);
        AnonymousClass17Y r7 = this.A03;
        C102144zN r6 = new C102144zN(r7, new C142866pb(AnonymousClass00E.A00(context, R.drawable.sticker_store_error), AnonymousClass00E.A00(context, R.drawable.sticker_store_error)), this.A0E, file, min);
        AnonymousClass658 r13 = new AnonymousClass658(r7, this.A0Q, this.A0T, file, "sticker-repository");
        r13.A04 = r6;
        r13.A00 = Integer.MAX_VALUE;
        r13.A01 = min;
        r13.A03 = AnonymousClass00E.A00(context, R.drawable.sticker_store_error);
        r13.A02 = AnonymousClass00E.A00(context, R.drawable.sticker_store_error);
        r13.A05 = true;
        AnonymousClass6CW A012 = r13.A01();
        this.A00 = A012;
        return A012;
    }

    public File A05(C135066c4 r8) {
        Object obj;
        Object obj2;
        File file;
        String str = r8.A0E;
        C18740tg.A06(str);
        C24041Av r6 = this.A04;
        File A032 = r6.A03(str, r8.A0D);
        if (A032 == null) {
            Pair A022 = A02(r8);
            String str2 = r8.A0D;
            if (!(A022 == null || (obj = A022.first) == null || (obj2 = A022.second) == null)) {
                try {
                    file = (File) obj;
                    File A042 = r6.A04((String) obj2, str2);
                    C18740tg.A06(A042);
                    this.A02.A0f(file, A042);
                    File file2 = A042;
                    r6.A03((String) A022.second, str2);
                    return file2;
                } catch (IOException e) {
                    Log.e("StickerRepository/moveTempStickerFileToInternalStorage failed to copy resulting file");
                    AnonymousClass6YY.A0P(file);
                    throw e;
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("StickerRepository/incrementReferenceCountOnThirdPartySticker unable to move ");
                    sb.append(((File) A022.first).getAbsolutePath());
                    sb.append(" to internal storage");
                    Log.e(sb.toString());
                }
            }
        }
        return A032;
    }

    public File A06(C135066c4 r5, File file) {
        File A002 = this.A0Y.A00(r5, file, false);
        if (A002 != null) {
            r5.A02(A002.getAbsolutePath(), 1);
            r5.A04 = this.A0C.A01(r5.A01(), A002.getAbsolutePath());
            StringBuilder sb = new StringBuilder();
            sb.append("StickerRepository/downloadSticker/downloaded sticker, file_hash:");
            sb.append(r5.A0E);
            sb.append(",media_key:");
            sb.append(r5.A0C);
            sb.append(",file:");
            sb.append(A002.getAbsolutePath());
            sb.append(", direct_path:");
            sb.append(r5.A07);
            Log.i(sb.toString());
            return A002;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StickerRepository/downloadSticker/sticker file is null for: ");
        sb2.append(r5.A0E);
        Log.e(sb2.toString());
        return A002;
    }

    public ArrayList A07() {
        ArrayList A012 = this.A0a.A01();
        LinkedHashSet A002 = this.A0M.A00();
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            AnonymousClass68B r2 = (AnonymousClass68B) it.next();
            AnonymousClass1B5 r0 = this.A0J;
            String str = r2.A0F;
            r2.A00 = r0.A01(str);
            r2.A09 = A002.contains(str);
        }
        A012.size();
        return A012;
    }

    public ArrayList A08(int i) {
        C24001Ar r0 = this.A0H;
        C18740tg.A00();
        ArrayList A012 = r0.A05.A01(Integer.MAX_VALUE, i);
        ArrayList arrayList = new ArrayList();
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            AnonymousClass6EB r5 = (AnonymousClass6EB) it.next();
            C24041Av r02 = this.A04;
            String str = r5.A0B;
            String str2 = r5.A0D;
            File A042 = r02.A04(str, str2);
            if (A042.exists()) {
                C135066c4 r3 = new C135066c4();
                r3.A02(A042.getAbsolutePath(), 1);
                r3.A0E = str;
                r3.A0H = r5.A0E;
                r3.A09 = r5.A0A;
                r3.A07 = r5.A08;
                r3.A0N = r5.A03;
                if (str2 != null) {
                    r3.A0D = str2;
                } else {
                    r3.A0D = "image/webp";
                }
                r3.A0C = r5.A0C;
                r3.A00 = r5.A04;
                r3.A03 = r5.A06;
                r3.A02 = r5.A05;
                C23981Ap r2 = this.A0C;
                r3.A04 = r2.A01(r3.A01(), A042.getAbsolutePath());
                r2.A04(r3);
                r3.A0B = r5.A01;
                A01(r3);
                arrayList.add(r3);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0087 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A09(X.C117885mz r9) {
        /*
            r8 = this;
            X.1BP r0 = r8.A0a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r6 = r0.get()
            X.14e r4 = r6.A02     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = "SELECT authority, sticker_pack_id FROM third_party_whitelist_packs"
            java.lang.String r1 = "getWhitelistedPacks/QUERY_THIRD_PARTY_WHITELIST_PACKS"
            r0 = 0
            android.database.Cursor r7 = r4.A09(r2, r1, r0)     // Catch:{ all -> 0x00fe }
            java.lang.String r0 = "authority"
            int r5 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "sticker_pack_id"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f7 }
        L_0x002a:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r2 = r7.getString(r5)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = r7.getString(r4)     // Catch:{ all -> 0x00f7 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x00f7 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00f7 }
            r3.add(r0)     // Catch:{ all -> 0x00f7 }
            goto L_0x002a
        L_0x0041:
            r7.close()     // Catch:{ all -> 0x00fe }
            r6.close()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r2 = r3.iterator()
        L_0x0050:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r2.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = X.AnonymousClass1BM.A01(r1, r0)
            X.1B5 r0 = r8.A0J
            int r0 = r0.A01(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.put(r1, r0)
            goto L_0x0050
        L_0x0076:
            X.75Y r0 = new X.75Y
            r0.<init>(r8, r5)
            java.util.Collections.sort(r3, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r3.iterator()
        L_0x0087:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r6.next()
            android.util.Pair r0 = (android.util.Pair) r0
            r3 = 0
            X.1BI r2 = r8.A0L     // Catch:{ 1AS -> 0x00a3, Exception -> 0x00a7 }
            java.lang.Object r1 = r0.first     // Catch:{ 1AS -> 0x00a3, Exception -> 0x00a7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 1AS -> 0x00a3, Exception -> 0x00a7 }
            java.lang.Object r0 = r0.second     // Catch:{ 1AS -> 0x00a3, Exception -> 0x00a7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 1AS -> 0x00a3, Exception -> 0x00a7 }
            X.68B r3 = r2.A00(r1, r0)     // Catch:{ 1AS -> 0x00a3, Exception -> 0x00a7 }
            goto L_0x00ad
        L_0x00a3:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/getInstalledThirdPartyStickerPacksSync/fetch of sticker pack restricted"
            goto L_0x00aa
        L_0x00a7:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/getInstalledThirdPartyStickerPacksSync/failed to fetch sticker pack"
        L_0x00aa:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ad:
            if (r3 == 0) goto L_0x0087
            r4.add(r3)
            X.1BH r0 = r8.A0M
            java.util.LinkedHashSet r0 = r0.A00()
            java.lang.String r2 = r3.A0F
            boolean r0 = r0.contains(r2)
            r3.A09 = r0
            java.util.List r0 = r3.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x00c6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r0 = r1.next()
            X.6c4 r0 = (X.C135066c4) r0
            r8.A01(r0)
            goto L_0x00c6
        L_0x00d6:
            java.lang.Object r0 = r5.get(r2)
            X.C18740tg.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3.A00 = r0
            if (r9 == 0) goto L_0x0087
            X.5Mv r2 = r9.A00
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r3
            r2.A0F(r1)
            goto L_0x0087
        L_0x00f3:
            r4.size()
            return r4
        L_0x00f7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x00fe }
            throw r0     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0100 }
        L_0x0100:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AP.A09(X.5mz):java.util.ArrayList");
    }

    public List A0A() {
        Map map;
        ArrayList arrayList;
        ArrayList arrayList2;
        AnonymousClass1BG r5 = this.A0G;
        synchronized (r5) {
            map = r5.A00;
            if (map.containsKey(0)) {
                arrayList = (List) ((WeakReference) map.get(0)).get();
            } else {
                arrayList = null;
            }
        }
        if (arrayList == null) {
            AnonymousClass1B5 r7 = this.A0J;
            C18740tg.A00();
            ArrayList A012 = AnonymousClass1B6.A01(r7.A03, (String) null);
            HashSet hashSet = new HashSet();
            LinkedHashSet A002 = this.A0M.A00();
            Iterator it = A012.iterator();
            while (it.hasNext()) {
                AnonymousClass68B r10 = (AnonymousClass68B) it.next();
                String str = r10.A0F;
                if (hashSet.contains(str)) {
                    Log.e("StickerRepository/getInstalledFirstPartyStickerPacksSync duplicate sticker pack");
                } else {
                    hashSet.add(str);
                    C18740tg.A00();
                    C23991Aq r0 = r7.A05;
                    AnonymousClass00C.A08(str);
                    ArrayList A022 = r0.A02(str);
                    Iterator it2 = A022.iterator();
                    while (it2.hasNext()) {
                        C135066c4 r1 = (C135066c4) it2.next();
                        if (!TextUtils.isEmpty(r1.A0A)) {
                            this.A0C.A04(r1);
                        }
                    }
                    r10.A05 = A022;
                    r10.A09 = A002.contains(str);
                    for (C135066c4 A013 : r10.A05) {
                        A01(A013);
                    }
                }
            }
            Iterator it3 = A012.iterator();
            while (it3.hasNext()) {
                AnonymousClass68B r12 = (AnonymousClass68B) it3.next();
                r12.A00 = r7.A01(r12.A0F);
            }
            Collections.sort(A012, new AnonymousClass75V());
            A012.size();
            synchronized (r5) {
                map.put(0, new WeakReference(A012));
                arrayList2 = A012;
            }
        }
        return arrayList2;
    }

    public void A0B(AnonymousClass68B r5, C160167kZ r6) {
        if (C20800yB.A01(C21000yV.A02, this.A08, 575)) {
            AnonymousClass1BC r1 = this.A0F;
            String str = r5.A0F;
            AnonymousClass00C.A0D(str, 0);
            AnonymousClass1SZ A042 = r1.A00.A04();
            AnonymousClass00C.A08(A042);
            Bitmap bitmap = (Bitmap) A042.A09(str);
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    A042.A0C(str);
                } else {
                    r6.Ba3(bitmap);
                    return;
                }
            }
        }
        this.A0N.Box(new C107045Mi(this, r6), r5);
    }

    public void A0C(C159687jl r5, String str, boolean z) {
        this.A0N.Box(new AnonymousClass5MA(this.A0V, r5, this), new Pair(str, Boolean.valueOf(z)));
    }

    public void A0D(Collection collection) {
        this.A0N.Boy(new C35771jE(this, collection, 5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(X.C135066c4 r6) {
        /*
            r5 = this;
            boolean r0 = r6.A0L
            if (r0 == 0) goto L_0x004c
            java.lang.String r3 = r6.A06
            if (r3 == 0) goto L_0x004c
            X.1Ar r0 = r5.A0H
            X.1As r2 = r0.A05
            r1 = 0
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r4[r1] = r3
            X.005 r0 = r2.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r3 = r0.get()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers WHERE avatar_template_id = ? ORDER BY timestamp DESC"
            java.lang.String r0 = "getStarredStickerDataFromFileHash/QUERY_STARRED_STICKER"
            android.database.Cursor r2 = r2.A09(r1, r0, r4)     // Catch:{ all -> 0x0045 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 == 0) goto L_0x0033
            X.6EB r1 = X.C24011As.A00(r2)     // Catch:{ all -> 0x003e }
        L_0x0033:
            r2.close()     // Catch:{ all -> 0x0045 }
            r3.close()
            r0 = 0
            if (r1 == 0) goto L_0x003d
            r0 = 1
        L_0x003d:
            return r0
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x004c:
            X.1Ar r1 = r5.A0H
            java.lang.String r0 = r6.A0E
            boolean r0 = r1.A03(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AP.A0G(X.6c4):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0218, code lost:
        if (r0 != false) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(X.C135066c4 r40, java.lang.Long r41, boolean r42, boolean r43) {
        /*
            r39 = this;
            r11 = r40
            boolean r0 = r11.A0L
            r10 = 0
            r9 = r39
            if (r0 == 0) goto L_0x0238
            X.1BF r0 = r9.A0U
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0238
            boolean r0 = r11.A0K
            if (r0 != 0) goto L_0x0238
            java.lang.String r1 = r11.A06
            if (r1 == 0) goto L_0x022a
            X.1Aq r0 = r9.A0K
            X.6c4 r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x022a
            r11 = r0
        L_0x0022:
            java.lang.String r3 = r11.A0E
            java.lang.String r8 = r11.A0D
            if (r3 == 0) goto L_0x0237
            X.1Ar r7 = r9.A0H
            boolean r0 = r7.A03(r3)
            if (r0 != 0) goto L_0x0237
            X.1Av r6 = r9.A04
            java.io.File r5 = r6.A04(r3, r8)
            X.C18740tg.A06(r5)
            boolean r0 = r5.exists()
            r4 = 1
            if (r0 != 0) goto L_0x0091
            boolean r0 = r11.A03()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = r11.A0A
            if (r0 == 0) goto L_0x0091
            android.util.Pair r0 = r9.A02(r11)
            if (r0 == 0) goto L_0x0237
            java.lang.Object r2 = r0.first
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r3 = r0.second
            java.lang.String r3 = (java.lang.String) r3
            if (r2 == 0) goto L_0x0237
            if (r3 == 0) goto L_0x0237
            boolean r0 = r7.A03(r3)
            if (r0 != 0) goto L_0x0237
            r11.A0E = r3
            java.io.File r0 = r6.A04(r3, r8)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0091
            java.io.File r5 = r6.A04(r3, r8)     // Catch:{ IOException -> 0x0247 }
            X.C18740tg.A06(r5)     // Catch:{ IOException -> 0x0247 }
            X.0y0 r0 = r9.A02     // Catch:{ IOException -> 0x023d }
            r0.A0f(r2, r5)     // Catch:{ IOException -> 0x023d }
            goto L_0x0094
        L_0x007b:
            java.io.File r5 = r6.A04(r3, r8)
            X.C18740tg.A06(r5)
            java.lang.String r2 = r11.A0A
            if (r2 == 0) goto L_0x0237
            X.0y0 r1 = r9.A02     // Catch:{ IOException -> 0x024d }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x024d }
            r0.<init>(r2)     // Catch:{ IOException -> 0x024d }
            r1.A0e(r0, r5)     // Catch:{ IOException -> 0x024d }
            goto L_0x0094
        L_0x0091:
            r19 = 0
            goto L_0x0096
        L_0x0094:
            r19 = 1
        L_0x0096:
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0237
            X.005 r0 = r9.A0O
            java.lang.Object r2 = r0.get()
            if (r41 == 0) goto L_0x00c8
            long r17 = r41.longValue()
        L_0x00a8:
            if (r2 == 0) goto L_0x00c1
            if (r43 != 0) goto L_0x00c1
            r16 = 1
            X.C18740tg.A06(r2)
            r12 = r2
            X.196 r12 = (X.AnonymousClass196) r12
            r0 = r17
            java.util.Set r14 = r12.A0A(r11, r0, r4)
        L_0x00ba:
            X.C18740tg.A00()
            X.C24001Ar.A00(r7)
            goto L_0x00cf
        L_0x00c1:
            r16 = 0
            java.util.Set r14 = java.util.Collections.emptySet()
            goto L_0x00ba
        L_0x00c8:
            X.0wo r0 = r9.A05
            long r17 = X.C19970wo.A00(r0)
            goto L_0x00a8
        L_0x00cf:
            java.lang.String r1 = r11.A0E     // Catch:{ FileNotFoundException -> 0x01b3 }
            if (r1 == 0) goto L_0x01b1
            X.1B4 r13 = r7.A01     // Catch:{ FileNotFoundException -> 0x01b3 }
            monitor-enter(r13)     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x01a6 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x01a6 }
            monitor-exit(r13)     // Catch:{ FileNotFoundException -> 0x01b3 }
            if (r0 != 0) goto L_0x01b1
            X.1B3 r12 = r7.A04     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.lang.String r15 = r11.A0E     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.lang.String r1 = r11.A0D     // Catch:{ FileNotFoundException -> 0x01b3 }
            X.1Av r0 = r12.A00     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.io.File r0 = r0.A04(r15, r1)     // Catch:{ FileNotFoundException -> 0x01b3 }
            boolean r15 = r0.exists()     // Catch:{ FileNotFoundException -> 0x01b3 }
            if (r15 == 0) goto L_0x01a9
            X.1B0 r12 = r12.A01     // Catch:{ FileNotFoundException -> 0x01b3 }
            X.6FM r1 = r12.A00(r0, r1)     // Catch:{ FileNotFoundException -> 0x01b3 }
            if (r1 == 0) goto L_0x0115
            java.lang.String r12 = r1.A01(r0)     // Catch:{ FileNotFoundException -> 0x01b3 }
            if (r12 == 0) goto L_0x0116
            monitor-enter(r13)     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.util.Map r0 = r13.A01     // Catch:{ all -> 0x01a6 }
            java.lang.Object r1 = r0.get(r12)     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01a6 }
            monitor-exit(r13)     // Catch:{ FileNotFoundException -> 0x01b3 }
            if (r1 == 0) goto L_0x0116
            java.lang.String r0 = r11.A0E     // Catch:{ FileNotFoundException -> 0x01b3 }
            boolean r0 = r0.equals(r1)     // Catch:{ FileNotFoundException -> 0x01b3 }
            if (r0 != 0) goto L_0x0116
            goto L_0x01b1
        L_0x0115:
            r12 = 0
        L_0x0116:
            java.lang.String r0 = r11.A0E     // Catch:{ FileNotFoundException -> 0x01b3 }
            r13.A01(r0, r12)     // Catch:{ FileNotFoundException -> 0x01b3 }
            X.1Av r13 = r7.A00     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.lang.String r1 = r11.A0E     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.lang.String r0 = r11.A0D     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.io.File r0 = r13.A04(r1, r0)     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x01b3 }
            r11.A02(r0, r4)     // Catch:{ FileNotFoundException -> 0x01b3 }
            X.1Ap r0 = r7.A03     // Catch:{ FileNotFoundException -> 0x01b3 }
            r0.A04(r11)     // Catch:{ FileNotFoundException -> 0x01b3 }
            X.1As r13 = r7.A05     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.lang.String r0 = r11.A0E     // Catch:{ FileNotFoundException -> 0x01b3 }
            r21 = r0
            java.lang.String r0 = r11.A0H     // Catch:{ FileNotFoundException -> 0x01b3 }
            r23 = r0
            java.lang.String r0 = r11.A09     // Catch:{ FileNotFoundException -> 0x01b3 }
            r24 = r0
            java.lang.String r0 = r11.A07     // Catch:{ FileNotFoundException -> 0x01b3 }
            r25 = r0
            java.lang.String r0 = r11.A0D     // Catch:{ FileNotFoundException -> 0x01b3 }
            r26 = r0
            java.lang.String r0 = r11.A0C     // Catch:{ FileNotFoundException -> 0x01b3 }
            r27 = r0
            int r0 = r11.A00     // Catch:{ FileNotFoundException -> 0x01b3 }
            r30 = r0
            int r0 = r11.A03     // Catch:{ FileNotFoundException -> 0x01b3 }
            r31 = r0
            int r0 = r11.A02     // Catch:{ FileNotFoundException -> 0x01b3 }
            r32 = r0
            java.lang.String r0 = r11.A08     // Catch:{ FileNotFoundException -> 0x01b3 }
            r28 = r0
            boolean r0 = r11.A0M     // Catch:{ FileNotFoundException -> 0x01b3 }
            r35 = r0
            boolean r0 = r11.A0L     // Catch:{ FileNotFoundException -> 0x01b3 }
            r36 = r0
            java.lang.String r0 = r11.A06     // Catch:{ FileNotFoundException -> 0x01b3 }
            r29 = r0
            boolean r15 = r11.A0I     // Catch:{ FileNotFoundException -> 0x01b3 }
            boolean r1 = r11.A0N     // Catch:{ FileNotFoundException -> 0x01b3 }
            X.6EB r0 = new X.6EB     // Catch:{ FileNotFoundException -> 0x01b3 }
            r20 = r0
            r22 = r12
            r33 = r17
            r37 = r15
            r38 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38)     // Catch:{ FileNotFoundException -> 0x01b3 }
            r13.A02(r0)     // Catch:{ FileNotFoundException -> 0x01b3 }
            X.1Au r0 = r7.A02     // Catch:{ FileNotFoundException -> 0x01b3 }
            X.1At r1 = r0.A01     // Catch:{ FileNotFoundException -> 0x01b3 }
            java.lang.Object r7 = r1.A01     // Catch:{ FileNotFoundException -> 0x01b3 }
            monitor-enter(r7)     // Catch:{ FileNotFoundException -> 0x01b3 }
            android.content.SharedPreferences r0 = X.C24021At.A00(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r12 = "sticker_add_to_favorites_count"
            int r13 = r0.getInt(r12, r10)     // Catch:{ all -> 0x01a1 }
            android.content.SharedPreferences r0 = X.C24021At.A00(r1)     // Catch:{ all -> 0x01a3 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x01a3 }
            int r0 = r13 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r12, r0)     // Catch:{ all -> 0x01a3 }
            r0.apply()     // Catch:{ all -> 0x01a3 }
            monitor-exit(r7)     // Catch:{ all -> 0x01a3 }
            goto L_0x01bb
        L_0x01a1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01a3 }
        L_0x01a3:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01a3 }
            goto L_0x01b0
        L_0x01a6:
            r1 = move-exception
            monitor-exit(r13)     // Catch:{ FileNotFoundException -> 0x01b3 }
            goto L_0x01b0
        L_0x01a9:
            java.lang.String r0 = "StickerImageHashCalculator/getImageHash/could not get internally managed media file for sticker"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x01b3 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x01b3 }
        L_0x01b0:
            throw r1     // Catch:{ FileNotFoundException -> 0x01b3 }
        L_0x01b1:
            r0 = 0
            goto L_0x01bc
        L_0x01b3:
            r1 = move-exception
            java.lang.String r0 = "StarredStickers/starSticker/could not find sticker file corresponding to that sticker file"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x01bc
        L_0x01bb:
            r0 = 1
        L_0x01bc:
            if (r16 == 0) goto L_0x0218
            X.C18740tg.A06(r2)
            X.196 r2 = (X.AnonymousClass196) r2
            if (r0 == 0) goto L_0x021b
            r2.A0Q(r14)
        L_0x01c8:
            X.2R6 r2 = new X.2R6
            r2.<init>()
            boolean r0 = r11.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            java.lang.Integer r0 = r11.A05
            r2.A04 = r0
            boolean r0 = r11.A0I
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            X.3S2 r0 = r11.A04
            if (r0 == 0) goto L_0x0216
            java.lang.String r1 = r0.A06
        L_0x01e7:
            java.lang.String r0 = "Giphy"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            X.3S2 r0 = r11.A04
            if (r0 == 0) goto L_0x0214
            java.lang.String r1 = r0.A06
        L_0x01f9:
            java.lang.String r0 = "Tenor"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r0
            X.0yW r0 = r9.A09
            r0.Bly(r2)
            if (r42 == 0) goto L_0x0213
            java.lang.String r1 = r11.A0E
            java.lang.String r0 = r11.A0D
            r6.A03(r1, r0)
        L_0x0213:
            return r4
        L_0x0214:
            r1 = 0
            goto L_0x01f9
        L_0x0216:
            r1 = 0
            goto L_0x01e7
        L_0x0218:
            if (r0 == 0) goto L_0x021e
            goto L_0x01c8
        L_0x021b:
            r2.A0P(r14)
        L_0x021e:
            if (r19 == 0) goto L_0x0224
            X.AnonymousClass6YY.A0P(r5)
            return r10
        L_0x0224:
            if (r42 != 0) goto L_0x0237
            r6.A07(r3, r8)
            return r10
        L_0x022a:
            X.1C2 r0 = r9.A0X
            X.6c4 r11 = r0.A01(r11)
            if (r11 != 0) goto L_0x0022
            java.lang.String r0 = "RecentStickers/unable to find ondemand sticker matching avatar stable id"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0237:
            return r10
        L_0x0238:
            boolean r0 = r11.A0L
            if (r0 == 0) goto L_0x0022
            return r10
        L_0x023d:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveTempStickerFileToInternalStorage failed to copy resulting file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0247 }
            X.AnonymousClass6YY.A0P(r2)     // Catch:{ IOException -> 0x0247 }
            throw r1     // Catch:{ IOException -> 0x0247 }
        L_0x0247:
            java.lang.String r0 = "StickerRepository/starStickersSync failed to copy external file to internal storage"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r10
        L_0x024d:
            java.lang.String r0 = "StickerRepository/starStickersSync failed to copy internal file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AP.A0H(X.6c4, java.lang.Long, boolean, boolean):boolean");
    }

    public void A0E(Collection collection) {
        String str;
        Set emptySet;
        String str2;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C135066c4 r6 = (C135066c4) it.next();
            if ((!r6.A0L || (str2 = r6.A06) == null || (r6 = this.A0K.A00(str2)) != null) && (str = r6.A0E) != null) {
                String str3 = r6.A0D;
                C24001Ar r4 = this.A0H;
                if (r4.A03(str)) {
                    this.A04.A07(str, str3);
                    AnonymousClass196 r3 = (AnonymousClass196) this.A0O.get();
                    if (r3 != null) {
                        emptySet = r3.A0A(r6, C19970wo.A00(this.A05), false);
                    } else {
                        emptySet = Collections.emptySet();
                    }
                    r4.A02(str);
                    if (r3 != null) {
                        r3.A0Q(emptySet);
                    }
                }
            }
        }
        this.A03.A0H(new C35771jE(this, collection, 8));
    }

    public void A0F(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0H((C135066c4) it.next(), (Long) null, z, false);
        }
        this.A03.A0H(new C35771jE(this, collection, 6));
    }

    public AnonymousClass1AP(C19700wN r2, C20690y0 r3, AnonymousClass17Y r4, C24041Av r5, C20050ww r6, C21060yb r7, C19970wo r8, C19630wG r9, C19420v0 r10, C20810yC r11, C21010yW r12, C20840yF r13, AnonymousClass13E r14, AnonymousClass1BF r15, C23871Ae r16, C24031Au r17, C23981Ap r18, AnonymousClass1BB r19, AnonymousClass1BA r20, AnonymousClass1BR r21, WebpUtils webpUtils, AnonymousClass1C2 r23, AnonymousClass1BC r24, C24171Bj r25, AnonymousClass1BG r26, C24001Ar r27, AnonymousClass1BD r28, AnonymousClass1B5 r29, C24181Bk r30, C23991Aq r31, AnonymousClass1BI r32, AnonymousClass1BP r33, AnonymousClass1BH r34, C19770wU r35, AnonymousClass005 r36) {
        this.A05 = r8;
        this.A08 = r11;
        this.A03 = r4;
        this.A0P = r2;
        this.A06 = r9;
        this.A0N = r35;
        this.A0W = webpUtils;
        this.A02 = r3;
        this.A0Q = r6;
        this.A09 = r12;
        this.A0A = r16;
        this.A0T = r14;
        this.A0K = r31;
        this.A0C = r18;
        this.A0R = r7;
        this.A0H = r27;
        this.A0J = r29;
        this.A0D = r19;
        this.A0G = r26;
        this.A07 = r10;
        this.A0F = r24;
        this.A0I = r28;
        this.A0U = r15;
        this.A0O = r36;
        this.A0M = r34;
        this.A0B = r17;
        this.A0L = r32;
        this.A0V = r20;
        this.A0E = r21;
        this.A0Y = r25;
        this.A04 = r5;
        this.A0Z = r30;
        this.A0S = r13;
        this.A0X = r23;
        this.A0a = r33;
    }
}
