package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3TY  reason: invalid class name */
public abstract class AnonymousClass3TY {
    public static int[] A05(C19890wg r1, int[] iArr) {
        return AnonymousClass3UO.A08(iArr, C36371kC.A01(r1.A00("emoji_modifiers"), A01(iArr)));
    }

    public static String A00(int[] iArr) {
        int[] A07 = AnonymousClass3UO.A07(iArr);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("multi_skin_");
        C36351kA.A1K(new AnonymousClass1XQ(A07), A0u);
        return A0u.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (X.AnonymousClass3UO.A00(r3) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(int[] r4) {
        /*
            boolean r1 = X.AnonymousClass3UO.A03(r4)
            java.lang.String r0 = "must be skin tone"
            X.C18740tg.A0D(r1, r0)
            int[] r3 = X.AnonymousClass3TC.A04(r4)
            int r2 = r3.length
            r0 = 3
            if (r2 == r0) goto L_0x0014
            r0 = 4
            if (r2 != r0) goto L_0x004f
        L_0x0014:
            int r0 = r2 + -2
            r1 = r3[r0]
            r0 = 8205(0x200d, float:1.1498E-41)
            if (r1 != r0) goto L_0x004f
            int r0 = r2 + -1
            r3 = r3[r0]
            boolean r0 = X.AnonymousClass3UO.A00(r3)
            if (r0 == 0) goto L_0x004f
        L_0x0026:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r0 = 0
            r0 = r4[r0]
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r2.append(r0)
            if (r3 != 0) goto L_0x003d
            java.lang.String r0 = ""
        L_0x0038:
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            return r0
        L_0x003d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "_"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toString(r3)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x0038
        L_0x004f:
            r3 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TY.A01(int[]):java.lang.String");
    }

    public static void A02(C19890wg r4, int[] iArr) {
        String join;
        int[] A06 = AnonymousClass3UO.A06(iArr);
        if (!AnonymousClass3UO.A02(A06)) {
            Log.e("EmojiSkinTonePreferenceManager/savePreferredMultiSkinTone/emoji is not a multi skin tone emoji");
            return;
        }
        String A00 = A00(A06);
        List<Pair> list = new C64913Px(iArr).A01;
        ArrayList A0r = C36361kB.A0r(list);
        for (Pair A03 : list) {
            int A032 = C36381kD.A03(A03);
            if (A032 > 0) {
                A0r.add(Integer.toString(A032));
            }
        }
        if (A0r.size() == 0) {
            join = "";
        } else {
            join = TextUtils.join("_", A0r);
        }
        C36341k9.A0x(C36381kD.A0G(r4, "emoji_modifiers"), A00, join);
    }

    public static void A03(C19890wg r3, int[] iArr) {
        int i;
        String A01 = A01(iArr);
        if (AnonymousClass3UO.A01(iArr)) {
            i = iArr[1];
        } else {
            i = 0;
        }
        C36341k9.A0v(C36381kD.A0G(r3, "emoji_modifiers"), A01, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r4 = android.text.TextUtils.split(r1, "_");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A04(X.C19890wg r4, int[] r5) {
        /*
            java.lang.String r2 = A00(r5)
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r4.A00(r0)     // Catch:{ ClassCastException -> 0x0043 }
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r2, r0)     // Catch:{ ClassCastException -> 0x0043 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "_"
            java.lang.String[] r4 = android.text.TextUtils.split(r1, r0)
            int r3 = r4.length
            r0 = 2
            if (r3 < r0) goto L_0x0042
            int[] r0 = X.AnonymousClass3UO.A06(r5)
            int[] r0 = X.AnonymousClass3UO.A05(r0)
            X.3Px r2 = new X.3Px
            r2.<init>(r0)
            r1 = 1
        L_0x002e:
            int r0 = r1 + -1
            r0 = r4[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            X.3Px r2 = r2.A00(r1, r0)
            int r1 = r1 + 1
            if (r1 <= r3) goto L_0x002e
            int[] r5 = r2.A01()
        L_0x0042:
            return r5
        L_0x0043:
            r1 = move-exception
            java.lang.String r0 = "EmojiSkinTonePreferenceManager/getPreferredMultiSkinTone"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TY.A04(X.0wg, int[]):int[]");
    }
}
