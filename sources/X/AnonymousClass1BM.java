package X;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1BM  reason: invalid class name */
public class AnonymousClass1BM {
    public final C19700wN A00;
    public final AnonymousClass1BN A01;
    public final C21060yb A02;
    public final C19630wG A03;
    public final C20840yF A04;
    public final WebpUtils A05;
    public final AnonymousClass1B0 A06;

    public static Pair A00(String str) {
        int indexOf = str.indexOf(" ");
        if (indexOf < 0) {
            return null;
        }
        return new Pair(URLDecoder.decode(str.substring(0, indexOf)), str.substring(indexOf + 1));
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(URLEncoder.encode(str));
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public AnonymousClass68B A02(String str, String str2) {
        IllegalArgumentException th;
        AnonymousClass1XQ[] r6;
        InputStream A062;
        String str3 = str;
        String str4 = str2;
        AnonymousClass68B A032 = A03(str3, str4);
        ArrayList arrayList = new ArrayList();
        String A012 = A01(str3, str4);
        C21060yb r34 = this.A02;
        Cursor A033 = r34.A0O().A03(new Uri.Builder().scheme("content").authority(str3).appendPath("stickers").appendPath(str4).build(), new String[]{"sticker_file_name", "sticker_emoji"}, (String) null, (String[]) null, (String) null);
        if (A033 != null) {
            try {
                if (A033.getCount() < 3 || A033.getCount() > 30) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("sticker count should be between 3 to 30 inclusive, it currently has ");
                    sb.append(A033.getCount());
                    sb.append(", sticker pack: ");
                    sb.append(str4);
                    th = new IllegalArgumentException(sb.toString());
                } else {
                    A033.moveToFirst();
                    do {
                        String string = A033.getString(A033.getColumnIndexOrThrow("sticker_file_name"));
                        String string2 = A033.getString(A033.getColumnIndexOrThrow("sticker_emoji"));
                        if (!AnonymousClass6YY.A0U(string)) {
                            String str5 = null;
                            if (!TextUtils.isEmpty(string2)) {
                                String[] split = string2.split(",");
                                int length = split.length;
                                r6 = new AnonymousClass1XQ[length];
                                for (int i = 0; i < length; i++) {
                                    r6[i] = C63873Lt.A00(split[i]);
                                }
                            } else {
                                r6 = null;
                            }
                            Uri build = new Uri.Builder().scheme("content").authority(str3).appendPath("stickers_asset").appendPath(str4).appendPath(string).build();
                            AnonymousClass3S2 r19 = new AnonymousClass3S2(A012, A032.A0H, A032.A0J, A032.A0I, A032.A0E, (String) null, r6, 0, false, false, false, false, false, false);
                            try {
                                C21050ya A0O = r34.A0O();
                                C18740tg.A06(A0O);
                                A062 = A0O.A06(build);
                                if (A062 != null) {
                                    File A013 = this.A04.A00.A01(AnonymousClass14B.A0A(Base64.encodeToString(C18750th.A0H(32), 2)));
                                    if (AnonymousClass6YY.A0S(A013, A062)) {
                                        A062.close();
                                        try {
                                            WebpUtils webpUtils = this.A05;
                                            String path = build.getPath();
                                            Boolean valueOf = Boolean.valueOf(A032.A0P);
                                            AnonymousClass1XQ[] r62 = r19.A0D;
                                            if (r62 == null || r62.length <= 3) {
                                                AnonymousClass6HK.A00(webpUtils, A013, valueOf, path);
                                                if (webpUtils.A02(A013, r19.A02())) {
                                                    String A002 = AnonymousClass6UG.A00(A013);
                                                    if (A002 != null) {
                                                        C135066c4 r12 = new C135066c4();
                                                        r12.A0G = A012;
                                                        r12.A02(build.toString(), 3);
                                                        r12.A0E = A002;
                                                        r12.A0D = "image/webp";
                                                        AnonymousClass6FM A003 = this.A06.A00(A013, "image/webp");
                                                        if (A003 != null) {
                                                            str5 = A003.A01(A013);
                                                        }
                                                        r12.A0B = str5;
                                                        r12.A00 = (int) A013.length();
                                                        r12.A04 = r19;
                                                        arrayList.add(r12);
                                                    }
                                                } else {
                                                    Log.e("ThirdPartyStickerFetcher/calculatePlainTextHash/failed to insert metadata");
                                                }
                                                AnonymousClass6YY.A0P(A013);
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("emoji count exceed limit, sticker name:");
                                                sb2.append(path);
                                                throw new AnonymousClass1AU(sb2.toString());
                                            }
                                        } catch (IOException e) {
                                            Log.e("ThirdPartyStickerFetcher/fetchStickersForStickerPack/exception when operating on sticker file", e);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            AnonymousClass6YY.A0P(A013);
                                        }
                                    } else {
                                        A062.close();
                                    }
                                }
                            } catch (IOException e2) {
                                Log.e("ThirdPartyStickerFetcher/saveStickerFileToTempLocation/io exception when fetching sticker", e2);
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("sticker file name: ");
                            sb3.append(string);
                            sb3.append(" is invalid, authority: ");
                            sb3.append(str3);
                            sb3.append(",identifier: ");
                            sb3.append(str4);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    } while (A033.moveToNext());
                    A033.close();
                    Iterator it = arrayList.iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        j += (long) ((C135066c4) it.next()).A00;
                    }
                    A032.A05 = arrayList;
                    A032.A01 = j;
                    return A032;
                }
            } catch (Throwable th4) {
                if (A033 != null) {
                    try {
                        A033.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
                throw th4;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("could not find stickers for sticker pack: ");
            sb4.append(A012);
            th = new IllegalArgumentException(sb4.toString());
        }
        throw th;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f7, code lost:
        if (r1 <= 0) goto L_0x01f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass68B A03(java.lang.String r36, java.lang.String r37) {
        /*
            r35 = this;
            r10 = r36
            boolean r0 = X.AnonymousClass6YY.A0U(r10)
            if (r0 != 0) goto L_0x03bf
            r9 = r37
            boolean r0 = X.AnonymousClass6YY.A0U(r9)
            if (r0 != 0) goto L_0x03a8
            int r3 = r9.length()
            r2 = 128(0x80, float:1.794E-43)
            if (r3 > r2) goto L_0x0389
            r8 = r35
            X.0wG r0 = r8.A03
            android.content.Context r0 = r0.A00
            android.content.pm.PackageManager r4 = r0.getPackageManager()
            if (r4 == 0) goto L_0x005b
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r2 = r4.resolveContentProvider(r10, r2)
            if (r2 == 0) goto L_0x005b
            java.lang.String r1 = r2.readPermission
            java.lang.String r0 = "com.whatsapp.sticker.READ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005b
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0043 }
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x0043 }
            java.lang.String r7 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0043 }
            goto L_0x0061
        L_0x0043:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "StickerContentProviderFetcher/getThirdPartyAppVersionCode/package name not found, content provider:"
            r1.append(r0)
            int r0 = r10.hashCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x005b:
            java.lang.String r0 = "StickerContentProviderFetcher/getThirdPartyAppVersionCode/app may have been deleted"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r7 = 0
        L_0x0061:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0342
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r6 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r6)
            android.net.Uri$Builder r1 = r0.authority(r10)
            java.lang.String r0 = "metadata"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendPath(r9)
            android.net.Uri r30 = r0.build()
            java.lang.String r12 = "sticker_pack_identifier"
            java.lang.String r11 = "sticker_pack_name"
            java.lang.String r5 = "sticker_pack_publisher"
            java.lang.String r1 = "sticker_pack_icon"
            java.lang.String r20 = "android_play_store_link"
            java.lang.String r0 = "ios_app_download_link"
            java.lang.String r19 = "image_data_version"
            java.lang.String r18 = "whatsapp_will_not_cache_stickers"
            java.lang.String r17 = "animated_sticker_pack"
            r25 = r20
            r26 = r0
            r27 = r19
            r28 = r18
            r29 = r17
            r23 = r5
            r24 = r1
            r21 = r12
            r22 = r11
            java.lang.String[] r31 = new java.lang.String[]{r21, r22, r23, r24, r25, r26, r27, r28, r29}
            java.lang.String r4 = "/"
            X.0yb r2 = r8.A02
            X.0ya r29 = r2.A0O()
            X.C18740tg.A06(r29)
            r3 = 0
            r33 = r3
            r34 = r3
            r32 = r3
            android.database.Cursor r13 = r29.A03(r30, r31, r32, r33, r34)
            r2 = 0
            if (r13 == 0) goto L_0x0342
            int r14 = r13.getCount()     // Catch:{ all -> 0x0335 }
            if (r14 <= 0) goto L_0x033f
            r13.moveToFirst()     // Catch:{ all -> 0x0335 }
            int r12 = r13.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x0335 }
            java.lang.String r12 = r13.getString(r12)     // Catch:{ all -> 0x0335 }
            boolean r14 = r9.equals(r12)     // Catch:{ all -> 0x0335 }
            if (r14 == 0) goto L_0x0311
            int r11 = r13.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x0335 }
            java.lang.String r16 = r13.getString(r11)     // Catch:{ all -> 0x0335 }
            int r5 = r13.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0335 }
            java.lang.String r11 = r13.getString(r5)     // Catch:{ all -> 0x0335 }
            int r1 = r13.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0335 }
            java.lang.String r12 = r13.getString(r1)     // Catch:{ all -> 0x0335 }
            boolean r1 = X.AnonymousClass6YY.A0U(r12)     // Catch:{ all -> 0x0335 }
            java.lang.String r5 = ", identifier: "
            java.lang.String r15 = "ThirdPartyStickerFetcher/tray image name: ("
            if (r1 == 0) goto L_0x0135
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r2.<init>()     // Catch:{ all -> 0x0335 }
            r2.append(r15)     // Catch:{ all -> 0x0335 }
            r2.append(r12)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = ") contains invalid characters, from authority: "
        L_0x010b:
            r2.append(r0)     // Catch:{ all -> 0x0335 }
            r2.append(r10)     // Catch:{ all -> 0x0335 }
            r2.append(r5)     // Catch:{ all -> 0x0335 }
            r2.append(r9)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0335 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0335 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r1.<init>()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "tray image name invalid, tray image name: "
            r1.append(r0)     // Catch:{ all -> 0x0335 }
            r1.append(r12)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0335 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0335 }
            r1.<init>(r0)     // Catch:{ all -> 0x0335 }
        L_0x0134:
            throw r1     // Catch:{ all -> 0x0335 }
        L_0x0135:
            int r14 = r12.length()     // Catch:{ all -> 0x0335 }
            r1 = 128(0x80, float:1.794E-43)
            if (r14 <= r1) goto L_0x015b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r2.<init>()     // Catch:{ all -> 0x0335 }
            r2.append(r15)     // Catch:{ all -> 0x0335 }
            r2.append(r12)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = ") has "
            r2.append(r0)     // Catch:{ all -> 0x0335 }
            r2.append(r14)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = " characters, limit is: "
            r2.append(r0)     // Catch:{ all -> 0x0335 }
            r2.append(r1)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = ", from authority: "
            goto L_0x010b
        L_0x015b:
            r1 = r20
            int r1 = r13.getColumnIndex(r1)     // Catch:{ all -> 0x0335 }
            java.lang.String r5 = " is invalid"
            if (r1 <= 0) goto L_0x0191
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x0335 }
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0335 }
            if (r1 != 0) goto L_0x0191
            java.lang.String r1 = "play.google.com"
            boolean r1 = X.AnonymousClass6HK.A01(r3, r1)     // Catch:{ all -> 0x0335 }
            if (r1 != 0) goto L_0x0191
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r1.<init>()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "play link: "
            r1.append(r0)     // Catch:{ all -> 0x0335 }
            r1.append(r3)     // Catch:{ all -> 0x0335 }
            r1.append(r5)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0335 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0335 }
            r1.<init>(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x0134
        L_0x0191:
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0335 }
            if (r0 <= 0) goto L_0x01cc
            java.lang.String r2 = r13.getString(r0)     // Catch:{ all -> 0x0335 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0335 }
            if (r0 != 0) goto L_0x01cc
            java.lang.String r0 = "itunes.apple.com"
            boolean r0 = X.AnonymousClass6HK.A01(r2, r0)     // Catch:{ all -> 0x0335 }
            if (r0 != 0) goto L_0x01cc
            java.lang.String r0 = "apps.apple.com"
            boolean r0 = X.AnonymousClass6HK.A01(r2, r0)     // Catch:{ all -> 0x0335 }
            if (r0 != 0) goto L_0x01cc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r1.<init>()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "apple store link: "
            r1.append(r0)     // Catch:{ all -> 0x0335 }
            r1.append(r2)     // Catch:{ all -> 0x0335 }
            r1.append(r5)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0335 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0335 }
            r1.<init>(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x0134
        L_0x01cc:
            java.lang.String r14 = ""
            r0 = r19
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0335 }
            if (r0 <= 0) goto L_0x01e9
            java.lang.String r14 = r13.getString(r0)     // Catch:{ all -> 0x0335 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0335 }
            if (r0 == 0) goto L_0x01e9
            java.lang.String r0 = "image_data_version should not be empty"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0335 }
            r1.<init>(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x0134
        L_0x01e9:
            r0 = r18
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0335 }
            r15 = 0
            if (r0 <= 0) goto L_0x01f9
            short r1 = r13.getShort(r0)     // Catch:{ all -> 0x0335 }
            r0 = 1
            if (r1 > 0) goto L_0x01fa
        L_0x01f9:
            r0 = 0
        L_0x01fa:
            r1 = r17
            int r1 = r13.getColumnIndex(r1)     // Catch:{ all -> 0x0335 }
            if (r1 <= 0) goto L_0x0209
            short r1 = r13.getShort(r1)     // Catch:{ all -> 0x0335 }
            if (r1 <= 0) goto L_0x0209
            r15 = 1
        L_0x0209:
            X.65S r5 = new X.65S     // Catch:{ all -> 0x0335 }
            r5.<init>()     // Catch:{ all -> 0x0335 }
            java.lang.String r1 = A01(r10, r9)     // Catch:{ all -> 0x0335 }
            r5.A0Q = r15     // Catch:{ all -> 0x0335 }
            r5.A0P = r0     // Catch:{ all -> 0x0335 }
            r5.A0E = r1     // Catch:{ all -> 0x0335 }
            r0 = r16
            r5.A0G = r0     // Catch:{ all -> 0x0335 }
            r5.A0I = r11     // Catch:{ all -> 0x0335 }
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ all -> 0x0335 }
            r0.<init>()     // Catch:{ all -> 0x0335 }
            android.net.Uri$Builder r0 = r0.scheme(r6)     // Catch:{ all -> 0x0335 }
            android.net.Uri$Builder r6 = r0.authority(r10)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "stickers_asset"
            android.net.Uri$Builder r0 = r6.appendPath(r0)     // Catch:{ all -> 0x0335 }
            android.net.Uri$Builder r0 = r0.appendPath(r9)     // Catch:{ all -> 0x0335 }
            android.net.Uri$Builder r0 = r0.appendPath(r12)     // Catch:{ all -> 0x0335 }
            android.net.Uri r0 = r0.build()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0335 }
            r5.A0K = r0     // Catch:{ all -> 0x0335 }
            r0 = 1
            r5.A0V = r0     // Catch:{ all -> 0x0335 }
            r5.A0H = r3     // Catch:{ all -> 0x0335 }
            r5.A0D = r2     // Catch:{ all -> 0x0335 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r0.<init>()     // Catch:{ all -> 0x0335 }
            r0.append(r1)     // Catch:{ all -> 0x0335 }
            r0.append(r4)     // Catch:{ all -> 0x0335 }
            r0.append(r7)     // Catch:{ all -> 0x0335 }
            r0.append(r4)     // Catch:{ all -> 0x0335 }
            r0.append(r14)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = X.C18750th.A05(r0)     // Catch:{ all -> 0x0335 }
            r5.A0F = r0     // Catch:{ all -> 0x0335 }
            X.68B r4 = r5.A00()     // Catch:{ all -> 0x0335 }
            java.lang.String r2 = r4.A0F     // Catch:{ all -> 0x0335 }
            java.lang.String r1 = r4.A0J     // Catch:{ all -> 0x0335 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0335 }
            if (r0 != 0) goto L_0x02f9
            int r0 = r1.length()     // Catch:{ all -> 0x0335 }
            r3 = 128(0x80, float:1.794E-43)
            if (r0 > r3) goto L_0x02e1
            java.lang.String r1 = r4.A0H     // Catch:{ all -> 0x0335 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0335 }
            if (r0 != 0) goto L_0x02c9
            int r0 = r1.length()     // Catch:{ all -> 0x0335 }
            if (r0 > r3) goto L_0x02b1
            java.lang.String r0 = r4.A0L     // Catch:{ all -> 0x0335 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0335 }
            if (r0 != 0) goto L_0x0299
            r8.A04(r4)     // Catch:{ all -> 0x0335 }
            goto L_0x0331
        L_0x0299:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r1.<init>()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "Third party sticker pack tray id is empty,"
            r1.append(r0)     // Catch:{ all -> 0x0335 }
            r1.append(r2)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0335 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0335 }
            r1.<init>(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x0134
        L_0x02b1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r1.<init>()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "Third party sticker pack name cannot exceed 128 characters,"
            r1.append(r0)     // Catch:{ all -> 0x0335 }
            r1.append(r2)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0335 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0335 }
            r1.<init>(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x0134
        L_0x02c9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r1.<init>()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "Third party sticker pack name is empty,"
            r1.append(r0)     // Catch:{ all -> 0x0335 }
            r1.append(r2)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0335 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0335 }
            r1.<init>(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x0134
        L_0x02e1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r1.<init>()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "Third party sticker pack publisher cannot exceed 128 characters,"
            r1.append(r0)     // Catch:{ all -> 0x0335 }
            r1.append(r2)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0335 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0335 }
            r1.<init>(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x0134
        L_0x02f9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r1.<init>()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "Third party sticker pack publisher is empty,"
            r1.append(r0)     // Catch:{ all -> 0x0335 }
            r1.append(r2)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0335 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0335 }
            r1.<init>(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x0134
        L_0x0311:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0335 }
            r1.<init>()     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "the pack returned was not what was requested, request identifier: "
            r1.append(r0)     // Catch:{ all -> 0x0335 }
            r1.append(r9)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = ",result identifier: "
            r1.append(r0)     // Catch:{ all -> 0x0335 }
            r1.append(r12)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0335 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0335 }
            r1.<init>(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x0134
        L_0x0331:
            r13.close()
            return r4
        L_0x0335:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x033a }
            throw r1
        L_0x033a:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x033f:
            r13.close()
        L_0x0342:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ThirdPartyStickerFetcher/fetchStickerPackMetadata/fetched sticker pack is null, authority: "
            r1.append(r0)
            int r0 = r10.hashCode()
            r1.append(r0)
            java.lang.String r0 = ", thirdPartyAppVersionCode: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Third party pack cannot be found likely because the corresponding app is restricted, sdk: "
            r1.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.append(r0)
            java.lang.String r0 = " ,power saving mode: "
            r1.append(r0)
            X.1BN r0 = r8.A01
            boolean r0 = r0.A00()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1AS r0 = new X.1AS
            r0.<init>(r1)
            throw r0
        L_0x0389:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "identifier length is: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", limit is: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03a8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "identifier contains invalid characters: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "authority contains invalid characters: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BM.A03(java.lang.String, java.lang.String):X.68B");
    }

    public byte[] A04(AnonymousClass68B r11) {
        InputStream A062;
        Throwable th;
        try {
            A062 = this.A02.A0O().A06(Uri.parse(r11.A0L));
            if (A062 != null) {
                byte[] bArr = new byte[51201];
                int read = A062.read(bArr, 0, 51201);
                if (read != 51201) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, read);
                    if (decodeByteArray.getWidth() <= 512) {
                        if (decodeByteArray.getHeight() >= 24) {
                            if (decodeByteArray.getHeight() > 512 || decodeByteArray.getHeight() < 24) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("tray icon height incorrect, it is currently ");
                                sb.append(decodeByteArray.getHeight());
                                sb.append(", should be between ");
                                sb.append(24);
                                sb.append(" and ");
                                sb.append(512);
                                sb.append(" pixels, sticker pack: ");
                                sb.append(r11.A0F);
                                th = new IllegalArgumentException(sb.toString());
                            } else {
                                A062.close();
                                return bArr;
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("tray icon width incorrect, it is currently ");
                    sb2.append(decodeByteArray.getWidth());
                    sb2.append(", should be between ");
                    sb2.append(24);
                    sb2.append(" and ");
                    sb2.append(512);
                    sb2.append(" pixels, sticker pack: ");
                    sb2.append(r11.A0F);
                    th = new IllegalArgumentException(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("tray icon file size too big, limit is 50 KB, sticker pack: ");
                    sb3.append(r11.A0F);
                    th = new IllegalArgumentException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("failed to fetch sticker tray icon, inputstream is null: ");
                sb4.append(r11.A0F);
                th = new IOException(sb4.toString());
            }
            throw th;
        } catch (IOException | IllegalArgumentException e) {
            throw e;
        } catch (Exception e2) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("failed to fetch sticker tray icon, sticker pack:");
            sb5.append(r11.A0F);
            throw new IOException(sb5.toString(), e2);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public AnonymousClass1BM(C19700wN r1, AnonymousClass1BN r2, C21060yb r3, C19630wG r4, C20840yF r5, WebpUtils webpUtils, AnonymousClass1B0 r7) {
        this.A03 = r4;
        this.A00 = r1;
        this.A05 = webpUtils;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A06 = r7;
    }
}
