package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1BJ  reason: invalid class name */
public class AnonymousClass1BJ {
    public static final Comparator A05 = AnonymousClass1BK.A00;
    public final C20690y0 A00;
    public final C23981Ap A01;
    public final AnonymousClass1BL A02;
    public final WebpUtils A03;
    public final AnonymousClass1B0 A04;

    public static synchronized List A01(AnonymousClass1BJ r11, String str, String str2, String str3) {
        List list;
        String str4;
        synchronized (r11) {
            File A002 = A00(r11, str, str2);
            if (A002.exists()) {
                File[] listFiles = A002.listFiles();
                Arrays.sort(listFiles, A05);
                int length = listFiles.length;
                ArrayList arrayList = new ArrayList(length);
                String A012 = AnonymousClass1BM.A01(str, str2);
                int i = 0;
                while (true) {
                    if (i >= length) {
                        arrayList.size();
                        list = Collections.unmodifiableList(arrayList);
                        break;
                    }
                    File file = listFiles[i];
                    String name = file.getName();
                    String decode = Uri.decode(AnonymousClass6YY.A08(name.substring(3)));
                    C135066c4 r3 = new C135066c4();
                    r3.A0E = decode;
                    r3.A02(new File(A002, name).getAbsolutePath(), 2);
                    r3.A0D = "image/webp";
                    r3.A03 = 512;
                    r3.A02 = 512;
                    AnonymousClass6FM A003 = r11.A04.A00(file, "image/webp");
                    if (A003 != null) {
                        str4 = A003.A01(file);
                    } else {
                        str4 = null;
                    }
                    r3.A0B = str4;
                    r3.A0G = A012;
                    AnonymousClass3S2 A013 = r11.A01.A01(r3.A01(), file.getAbsolutePath());
                    if (A013 != null) {
                        r3.A04 = A013;
                    }
                    boolean z = false;
                    if (str3 != null) {
                        z = true;
                    }
                    if (z && TextUtils.equals(str3, decode)) {
                        arrayList.size();
                        list = Collections.singletonList(r3);
                        break;
                    }
                    arrayList.add(r3);
                    i++;
                }
            } else {
                list = Collections.emptyList();
            }
        }
        return list;
    }

    public synchronized void A02(String str, String str2, List list) {
        IllegalStateException illegalStateException;
        StringBuilder sb;
        InputStream inputStream;
        if (list.size() < 100) {
            File A002 = A00(this, str, str2);
            AnonymousClass6YY.A0H(A002, (Set) null);
            if (A002.exists() || A002.mkdirs()) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    C135066c4 r6 = (C135066c4) list.get(i);
                    String str3 = r6.A0E;
                    if (i >= 100) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("ThirdPartyStickerStorage/createStickerFileName/sticker index is more more than 100. Index: ");
                        sb2.append(i);
                        illegalStateException = new IllegalStateException(sb2.toString());
                        break;
                    }
                    if (i < 10) {
                        sb = new StringBuilder();
                        sb.append("0");
                    } else {
                        sb = new StringBuilder();
                    }
                    sb.append(i);
                    sb.append("_");
                    sb.append(Uri.encode(str3));
                    sb.append(".webp");
                    File file = new File(A002, sb.toString());
                    try {
                        AnonymousClass1BL r4 = this.A02;
                        Uri parse = Uri.parse(r6.A0A);
                        try {
                            C21050ya A0O = r4.A00.A0O();
                            C18740tg.A06(A0O);
                            inputStream = A0O.A06(parse);
                            if (inputStream != null) {
                                if (AnonymousClass6YY.A0S(file, inputStream)) {
                                    if (r6.A04 != null) {
                                        this.A03.A02(file, r6.A04.A02());
                                    }
                                    file.getAbsolutePath();
                                    inputStream.close();
                                    i++;
                                }
                            }
                        } catch (FileNotFoundException e) {
                            Log.e("error openUri", e);
                            inputStream = null;
                        }
                        AnonymousClass6YY.A0H(A002, (Set) null);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException e2) {
                        Log.e("error closing the input stream.", e2);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                }
            } else {
                A002.getAbsolutePath();
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ThirdPartyStickerStorage/addStickersInPack/total amount of stickers in pack is more than 100, size: ");
            sb3.append(list.size());
            illegalStateException = new IllegalStateException(sb3.toString());
        }
        throw illegalStateException;
        return;
        throw th;
    }

    public AnonymousClass1BJ(C20690y0 r2, C21060yb r3, C23981Ap r4, WebpUtils webpUtils, AnonymousClass1B0 r6) {
        AnonymousClass1BL r0 = new AnonymousClass1BL(r3);
        this.A03 = webpUtils;
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = r0;
        this.A04 = r6;
    }

    public static File A00(AnonymousClass1BJ r2, String str, String str2) {
        File file = new File(r2.A00.A01.A00.getCacheDir(), "stickers_cache");
        C20690y0.A07(file, false);
        StringBuilder sb = new StringBuilder();
        sb.append(Uri.encode(str));
        sb.append(File.separatorChar);
        sb.append(Uri.encode(str2));
        return new File(file, sb.toString());
    }
}
