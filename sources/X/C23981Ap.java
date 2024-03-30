package X;

import android.util.Base64;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Ap  reason: invalid class name and case insensitive filesystem */
public final class C23981Ap {
    public final C23971Ao A00;
    public final WebpUtils A01;
    public final C20810yC A02;

    public C23981Ap(C20810yC r2, C23971Ao r3, WebpUtils webpUtils) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(webpUtils, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A02 = r2;
        this.A01 = webpUtils;
        this.A00 = r3;
    }

    public final C135066c4 A00(C46962bx r31) {
        String str;
        C46962bx r2 = r31;
        AnonymousClass00C.A0D(r2, 0);
        C135066c4 r7 = r2.A00;
        int i = 1;
        if (!(r7 == null || r7.A04 == null || r7.A0E == null)) {
            if (C20800yB.A01(C21000yV.A02, this.A02, 6590)) {
                return r7;
            }
        }
        C135066c4 r72 = new C135066c4((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false);
        C65013Qj r4 = r2.A01;
        if (r4 != null) {
            File file = r4.A0I;
            String A1b = r2.A1b();
            if (file != null && file.exists()) {
                r72.A02(file.getAbsolutePath(), 1);
            } else if (A1b != null) {
                r72.A02(A1b, 3);
            }
            r72.A0E = r2.A04;
            r72.A09 = r2.A03;
            r72.A03 = r4.A0A;
            r72.A02 = r4.A06;
            r72.A0D = r2.A05;
            byte[] bArr = r4.A0a;
            if (bArr != null) {
                str = Base64.encodeToString(bArr, 1);
            } else {
                str = null;
            }
            r72.A0C = str;
            if (r2.A1J.A02) {
                i = 2;
            }
            r72.A05 = Integer.valueOf(i);
            String str2 = r4.A0J;
            if (str2 != null) {
                r72.A07 = str2;
            }
        }
        r72.A0N = r2.A1l();
        A04(r72);
        r2.A00 = r72;
        return r72;
    }

    public final AnonymousClass3S2 A01(C108045Ry r2, String str) {
        AnonymousClass00C.A0D(str, 0);
        if (r2 == C108045Ry.LOTTIE) {
            return this.A00.A03(str);
        }
        return AnonymousClass3S2.A01(this.A01.A04(str));
    }

    public final AnonymousClass3S2 A03(String str, byte[] bArr) {
        StringBuilder sb;
        String str2;
        AnonymousClass00C.A0D(bArr, 0);
        if (!"application/was".equals(str)) {
            return AnonymousClass3S2.A01(bArr);
        }
        try {
            return AnonymousClass3S2.A00(new JSONObject(new String(bArr, AnonymousClass0S4.A05)).getJSONObject("metadata").getJSONObject("customProps"));
        } catch (JSONException e) {
            e = e;
            sb = new StringBuilder();
            str2 = "LottieUtils/getMetadataFromBytes error getting metadata json ";
            sb.append(str2);
            sb.append(e.getMessage());
            Log.w(sb.toString());
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str2 = "LottieUtils/getMetadataFromBytes exception retrieving lottie file ";
            sb.append(str2);
            sb.append(e.getMessage());
            Log.w(sb.toString());
            return null;
        }
    }

    public final void A05(List list) {
        String str;
        AnonymousClass00C.A0D(list, 0);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C135066c4 r1 = (C135066c4) it.next();
                if (!(r1.A04 != null || (str = r1.A0A) == null || str.length() == 0)) {
                    A04(r1);
                }
            }
        }
    }

    public final AnonymousClass3S2 A02(File file, String str) {
        C108045Ry r0;
        boolean equalsIgnoreCase = "application/was".equalsIgnoreCase(str);
        String absolutePath = file.getAbsolutePath();
        if (equalsIgnoreCase) {
            AnonymousClass00C.A08(absolutePath);
            r0 = C108045Ry.LOTTIE;
        } else {
            AnonymousClass00C.A08(absolutePath);
            r0 = C108045Ry.WEBP;
        }
        return A01(r0, absolutePath);
    }

    public final void A04(C135066c4 r4) {
        AnonymousClass3S2 A012;
        AnonymousClass3S2 r1 = r4.A04;
        if (r1 != null) {
            String str = r4.A08;
            if (str == null || str.length() == 0) {
                AnonymousClass1XQ[] r0 = r1.A0D;
                if (r0 != null) {
                    r4.A08 = C55532um.A00(r0);
                }
            }
            r4.A0L = r1.A0A;
            r4.A0I = r1.A07;
            r4.A06 = r1.A01;
            r4.A0J = r1.A08;
            r4.A0K = r1.A09;
            return;
        }
        String str2 = r4.A0A;
        if (str2 == null || str2.length() == 0) {
            Log.w("StickerFactory/fillStickerMetadataFromFile Unable to fill metadata, file path is null or empty.");
            return;
        }
        if (r4.A01() == C108045Ry.LOTTIE) {
            C23971Ao r02 = this.A00;
            if (str2 != null) {
                A012 = r02.A03(str2);
            } else {
                return;
            }
        } else {
            WebpUtils webpUtils = this.A01;
            C18740tg.A06(str2);
            A012 = AnonymousClass3S2.A01(webpUtils.A04(str2));
        }
        if (A012 != null) {
            r4.A04 = A012;
            r4.A0I = A012.A07;
            r4.A0L = A012.A0A;
            r4.A06 = A012.A01;
            r4.A0J = A012.A08;
            r4.A0K = A012.A09;
            AnonymousClass1XQ[] r03 = A012.A0D;
            if (r03 != null) {
                r4.A08 = C55532um.A00(r03);
            }
        }
    }
}
