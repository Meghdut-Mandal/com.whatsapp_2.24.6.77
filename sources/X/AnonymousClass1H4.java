package X;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1H4  reason: invalid class name */
public class AnonymousClass1H4 extends AnonymousClass1H3 {
    public final SparseArray A00 = new SparseArray();
    public final AnonymousClass1H6 A01;
    public final Set A02 = new HashSet();

    public static synchronized void A04(AnonymousClass1H4 r11, String str, int i) {
        synchronized (r11) {
            if (!TextUtils.isEmpty(str)) {
                File A03 = A03(r11, str, i, false);
                if (!A03.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DoodleEmojiManager/loadFilePaths subdirectory for bundle=");
                    sb.append(i);
                    sb.append(" hash=");
                    sb.append(str);
                    sb.append(" doesn't exist");
                    Log.e(sb.toString());
                } else {
                    String[] list = A03.list();
                    if (list == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("DoodleEmojiManager/loadFilePaths no files found in ");
                        sb2.append(A03);
                        Log.e(sb2.toString());
                    } else {
                        String absolutePath = A03.getAbsolutePath();
                        for (String str2 : list) {
                            int parseInt = Integer.parseInt(str2.split("\\.")[0].split("e")[1]);
                            SparseArray sparseArray = r11.A00;
                            if (AnonymousClass6YY.A07(str2).equals("obi")) {
                                AnonymousClass1H6 r2 = r11.A01;
                                Set set = r2.A00;
                                if (set == null) {
                                    set = new HashSet(Collections.emptyList());
                                    r2.A00 = set;
                                }
                                if (set.contains(Integer.valueOf(parseInt))) {
                                    if (!C20800yB.A01(C21000yV.A02, r2.A01, 2025)) {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else if (sparseArray.indexOfKey(parseInt) >= 0) {
                                continue;
                            }
                            sparseArray.put(parseInt, new File(absolutePath, str2));
                        }
                        r11.A02.add(Integer.valueOf(i));
                    }
                }
            }
        }
    }

    public Map A0G(String str, String str2, String str3, String str4, int i) {
        Map A0G = super.A0G(str, str2, str3, (String) null, i);
        A0G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.toString(i));
        return A0G;
    }

    public synchronized void A0H(int i) {
        C131636Pw A06;
        if (!this.A02.contains(Integer.valueOf(i)) && (A06 = A06()) != null) {
            A04(this, A06.A03(i), i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1H4(X.C19700wN r17, X.C20050ww r18, X.C19600wD r19, X.C19970wo r20, X.C19630wG r21, X.AnonymousClass17Z r22, X.C19420v0 r23, X.AnonymousClass1H5 r24, X.C20810yC r25, X.C21010yW r26, X.AnonymousClass13E r27, X.C24121Be r28, X.C21080yd r29, X.AnonymousClass1H6 r30, X.C19770wU r31) {
        /*
            r16 = this;
            r13 = r28
            r12 = r27
            r11 = r26
            r15 = r31
            r3 = r18
            r2 = r17
            r14 = r29
            r1 = r16
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.A00 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.A02 = r0
            r0 = r30
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1H4.<init>(X.0wN, X.0ww, X.0wD, X.0wo, X.0wG, X.17Z, X.0v0, X.1H5, X.0yC, X.0yW, X.13E, X.1Be, X.0yd, X.1H6, X.0wU):void");
    }

    public static File A03(AnonymousClass1H4 r2, String str, int i, boolean z) {
        String str2;
        File filesDir = r2.A07.A00.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append("downloadable/doodle_emoji_");
        sb.append(i);
        sb.append("_");
        sb.append(str);
        if (z) {
            str2 = "_temp";
        } else {
            str2 = "";
        }
        sb.append(str2);
        return new File(filesDir, sb.toString());
    }
}
