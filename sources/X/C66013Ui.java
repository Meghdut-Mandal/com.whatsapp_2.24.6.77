package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Ui  reason: invalid class name and case insensitive filesystem */
public abstract class C66013Ui {
    public static AnonymousClass2bM A09(C19730wQ r4, C19970wo r5, C20810yC r6, AnonymousClass19I r7, Collection collection) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 A0l = C36391kE.A0l(it);
                if (A0l != null && A0R(r4, A0l)) {
                    AnonymousClass3T1 A08 = A08(r4, r5, r6, r7, A0l);
                    if (A08 instanceof AnonymousClass2bM) {
                        return (AnonymousClass2bM) A08;
                    }
                }
            }
        }
        return null;
    }

    public static C64933Qa A0A(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        AnonymousClass11F A0i = C36351kA.A0i(bundle, "message_key_jid");
        boolean z = bundle.getBoolean("message_key_from_me");
        String string = bundle.getString("message_key_id");
        if (A0i == null || string == null) {
            return null;
        }
        return new C64933Qa(A0i, string, z);
    }

    public static String A0D(int i) {
        if (i != 0) {
            if (i == 7) {
                return "system";
            }
            if (i == 1 || i == 25 || i == 42) {
                return "image";
            }
            if (i == 82) {
                return "ptt";
            }
            if (i == 2) {
                return "audio";
            }
            if (i == 3 || i == 28 || i == 43) {
                return "video";
            }
            if (i != 13) {
                if (i == 4) {
                    return "vcard";
                }
                if (i != 5) {
                    if (i == 16) {
                        return "livelocation";
                    }
                    if (i != 9) {
                        if (i == 20) {
                            return "sticker";
                        }
                        if (i == 23) {
                            return "product";
                        }
                        if (i == 37) {
                            return "catalog";
                        }
                        if (i == 24) {
                            return "invite";
                        }
                        if (i != 26) {
                            if (i != 29) {
                                if (i != 30) {
                                    if (i == 45) {
                                        return "list";
                                    }
                                    if (i == 46) {
                                        return "list_response";
                                    }
                                    if (i == 52) {
                                        return "product_list";
                                    }
                                    if (i == 81) {
                                        return "ptv";
                                    }
                                }
                            }
                        }
                    }
                    return "document";
                }
                return "location";
            }
            return "gif";
        }
        return null;
    }

    public static boolean A0I(int i) {
        return i == 12 || i == 160 || i == 127 || i == 79 || i == 20 || i == 161 || i == 126 || i == 123 || i == 90 || i == 93 || i == 106 || i == 124 || i == 144 || i == 149;
    }

    public static boolean A0J(int i) {
        return i == 1 || i == 23 || i == 37 || i == 2 || i == 3 || i == 81 || i == 13 || i == 9 || i == 20 || i == 25 || i == 26 || i == 28 || i == 29 || i == 57 || i == 62 || i == 63;
    }

    public static boolean A0K(int i) {
        return i == 42 || i == 43;
    }

    public static boolean A0M(int i) {
        return i == 1 || i == 3 || i == 81 || i == 13 || i == 9 || i == 5 || i == 16 || i == 23 || i == 37 || i == 24 || i == 44 || i == 20 || i == 25 || i == 26 || i == 28 || i == 29 || i == 30 || i == 42 || i == 43 || i == 45 || i == 52 || i == 54 || i == 55 || i == 57 || i == 62 || i == 63 || i == 85 || i == 97 || i == 94;
    }

    public static long A01(C20810yC r3, AnonymousClass3T1 r4) {
        if (!(r4 instanceof C46752bc) || ((C46752bc) r4).A01 != 0) {
            return 86400000;
        }
        long A07 = C36371kC.A07(r3.A07(4042));
        if (A07 < 300000) {
            return 300000;
        }
        return A07;
    }

    public static long A02(AnonymousClass3T1 r5) {
        if (r5 == null || r5.A1N == 0) {
            return Long.MIN_VALUE;
        }
        return r5.A1O;
    }

    public static Bundle A03(C64933Qa r3) {
        if (r3 == null) {
            return null;
        }
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("message_key_jid", AnonymousClass143.A03(r3.A00));
        A07.putBoolean("message_key_from_me", r3.A02);
        A07.putString("message_key_id", r3.A01);
        return A07;
    }

    public static AnonymousClass141 A04(AnonymousClass1A5 r2, AnonymousClass3T1 r3) {
        AnonymousClass11F r1 = r3.A1J.A00;
        if (AnonymousClass143.A0G(r1) || (r1 instanceof C177528dw)) {
            r1 = r3.A0J();
        }
        if (r1 != null) {
            return r2.A01(r1);
        }
        return null;
    }

    public static AnonymousClass147 A06(AnonymousClass3T1 r1) {
        if (r1 instanceof AnonymousClass2c5) {
            return C65533Sl.A01(r1.A1J.A00);
        }
        return null;
    }

    public static UserJid A07(C19730wQ r1, AnonymousClass3T1 r2) {
        if (r2.A1J.A02) {
            return C36441kJ.A0n(r1);
        }
        return r2.A0L();
    }

    public static C590032g A0C(C19730wQ r4, C19970wo r5, C20810yC r6, AnonymousClass19I r7, AnonymousClass3T1 r8) {
        AnonymousClass2bM A09;
        AnonymousClass2bM A092;
        AnonymousClass2bM A093;
        AnonymousClass2bM A094;
        AnonymousClass35L r3 = new AnonymousClass35L();
        AnonymousClass3T1 A08 = A08(r4, r5, r6, r7, r8);
        if (A08 != null) {
            r3.A00 = A08;
        }
        C88944Uq r0 = r8.A0J;
        if (!(r0 == null || (A094 = A09(r4, r5, r6, r7, r0.B8Y())) == null)) {
            r3.A01.add(A094);
        }
        if ((r8 instanceof AnonymousClass2bS) && (A093 = A09(r4, r5, r6, r7, ((AnonymousClass2bS) r8).A04)) != null) {
            r3.A01.add(A093);
        }
        AnonymousClass2bM A095 = A09(r4, r5, r6, r7, Collections.singletonList(r8.A1U));
        if (A095 != null) {
            r3.A01.add(A095);
        }
        AnonymousClass2bM A096 = A09(r4, r5, r6, r7, Collections.singletonList(r8.A1V));
        if (A096 != null) {
            r3.A01.add(A096);
        }
        if ((r8 instanceof AnonymousClass2c9) && (A092 = A09(r4, r5, r6, r7, Collections.singletonList(((AnonymousClass2c9) r8).A00))) != null) {
            r3.A01.add(A092);
        }
        if ((r8 instanceof AnonymousClass2bT) && (A09 = A09(r4, r5, r6, r7, ((AnonymousClass2bT) r8).A1X())) != null) {
            r3.A01.add(A09);
        }
        ArrayList A15 = C36441kJ.A15(r3.A01);
        AnonymousClass3T1 r1 = r3.A00;
        if (r1 != null) {
            A15.add(0, r1);
        }
        return new C590032g(A15);
    }

    public static String A0E(C18820ts r3, long j) {
        if (j <= 0) {
            return "";
        }
        return AnonymousClass3TF.A02(r3, j);
    }

    public static boolean A0O(C19730wQ r2, AnonymousClass3T1 r3) {
        C64933Qa r1 = r3.A1J;
        if (r1.A02 || A0n(r3) || !AnonymousClass143.A0G(r1.A00)) {
            return false;
        }
        List list = r3.A0w;
        if (list != null && C65713Te.A05(r2, list)) {
            return true;
        }
        AnonymousClass3T1 A0S = r3.A0S();
        if (A0S == null || !A0S.A1J.A02) {
            return false;
        }
        return true;
    }

    public static boolean A0P(C19730wQ r2, AnonymousClass3T1 r3) {
        boolean A0M;
        int i = r3.A1I;
        if (i == 15) {
            A0M = r3.A1J.A02;
        } else if (i == 64) {
            A0M = r2.A0M(((AnonymousClass2c8) r3).A00);
        } else if (i != 83 || r2.A0M(r3.A0N)) {
            return false;
        } else {
            return true;
        }
        if (!A0M || r3.A1Y) {
            return true;
        }
        return false;
    }

    public static boolean A0Q(C19730wQ r2, AnonymousClass3T1 r3) {
        if (!(r3 instanceof AnonymousClass2bI)) {
            return false;
        }
        int i = ((AnonymousClass2bI) r3).A00;
        if (A0I(i) || i == 52) {
            return ((C181758nz) r3).A01.contains(C36371kC.A0e(r2));
        }
        if (i == 4) {
            return r2.A0M(r3.A0J());
        }
        return false;
    }

    public static boolean A0R(C19730wQ r2, AnonymousClass3T1 r3) {
        if (r3.A01 != 8) {
            return r3.A1J.A02;
        }
        AnonymousClass11F A0J = r3.A0J();
        if (A0J == null || r2.A0M(A0J)) {
            return true;
        }
        return false;
    }

    public static boolean A0S(C19730wQ r3, AnonymousClass3T1 r4) {
        if (r4.A1J.A02) {
            if (!(r4 instanceof AnonymousClass2bI)) {
                return true;
            }
            int i = ((AnonymousClass2bI) r4).A00;
            if (!(i == 4 || i == 5 || i == 6 || i == 11 || i == 12 || i == 137 || i == 138)) {
                if (i != 143) {
                    if (!(i == 144 || i == 167 || i == 168)) {
                        switch (i) {
                            case 1:
                            case 14:
                            case 17:
                            case 27:
                            case VoipLiteCamera.DEFAULT_SUPERNOVA_ORIENTATION /*90*/:
                            case 99:
                            case 106:
                            case 118:
                            case 131:
                                break;
                            case 20:
                            case AnonymousClass8SX.EXTENDED_TEXT_MESSAGE_WITH_PARENT_KEY_FIELD_NUMBER /*79*/:
                            case 101:
                                break;
                            default:
                                switch (i) {
                                    case 123:
                                    case 125:
                                    case 126:
                                        break;
                                    case 124:
                                    case 127:
                                        break;
                                    default:
                                        switch (i) {
                                            case 149:
                                            case 150:
                                            case 151:
                                            case 152:
                                                break;
                                        }
                                }
                        }
                    }
                }
                return ((C181758nz) r4).A01.contains(C36371kC.A0e(r3));
            }
            return r3.A0M(r4.A0J());
        }
        return false;
    }

    public static boolean A0T(C19730wQ r2, AnonymousClass3T1 r3) {
        if (r3.A1J.A02 || r3.A1I != 64 || !r2.A0M(((AnonymousClass2c8) r3).A00) || r3.A1Y) {
            return false;
        }
        return true;
    }

    public static boolean A0V(C19730wQ r3, AnonymousClass3T1 r4) {
        C64933Qa r2 = r4.A1J;
        if (!r2.A02 || r4.A0D == 6 || !r3.A0M(r2.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0112 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0W(X.C21100yf r7, X.C20810yC r8, X.AnonymousClass3T1 r9, X.AnonymousClass1AW r10) {
        /*
            boolean r0 = r9 instanceof X.C46852bm
            r3 = 0
            if (r0 == 0) goto L_0x000d
            r0 = r9
            X.2bm r0 = (X.C46852bm) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return r3
        L_0x000d:
            boolean r0 = r9 instanceof X.AnonymousClass2cY
            if (r0 == 0) goto L_0x0020
            r0 = 3482(0xd9a, float:4.88E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x000c
            X.3Qa r0 = r9.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0020
            return r3
        L_0x0020:
            boolean r0 = r9 instanceof X.C46952bw
            if (r0 != 0) goto L_0x000c
            boolean r0 = r9 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x003a
            X.B1o r9 = (X.C23043B1o) r9
            X.9gz r0 = r10.A01(r9)
            if (r0 == 0) goto L_0x000c
            X.2nf r1 = r0.A05()
            X.2nf r0 = X.C51342nf.NONE
            if (r1 == r0) goto L_0x000c
        L_0x0038:
            r3 = 1
            return r3
        L_0x003a:
            int r1 = r9.A1I
            boolean r0 = A0L(r1)
            if (r0 != 0) goto L_0x000c
            r0 = 10
            if (r1 == r0) goto L_0x000c
            r0 = 11
            if (r1 == r0) goto L_0x000c
            r0 = 31
            if (r1 == r0) goto L_0x000c
            r0 = 96
            if (r1 == r0) goto L_0x000c
            r0 = 12
            if (r1 == r0) goto L_0x000c
            boolean r0 = A0n(r9)
            if (r0 != 0) goto L_0x000c
            r9.A0b()
            X.9lY r0 = r9.A0M
            if (r0 != 0) goto L_0x000c
            boolean r0 = A0J(r1)
            if (r0 == 0) goto L_0x00e2
            r1 = r9
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.3Qj r4 = r1.A01
            if (r4 != 0) goto L_0x0076
            java.lang.String r0 = "userActionForwardMessage/media_data is null"
        L_0x0072:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x0076:
            boolean r0 = r9 instanceof X.C181798o3
            if (r0 == 0) goto L_0x0088
            r0 = r9
            X.2cZ r0 = (X.C47002cZ) r0
            boolean r0 = X.C65703Td.A03(r0)
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r1.A03
            if (r0 != 0) goto L_0x00e2
            return r3
        L_0x0088:
            java.io.File r0 = r4.A0I
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = "userActionForwardMessage/media_data.file is null"
            goto L_0x0072
        L_0x008f:
            boolean r0 = r4.A03()
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "userActionForwardMessage/media_data.file does not exist"
            goto L_0x0072
        L_0x0098:
            long r1 = r4.A0C
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00ca
            java.io.File r0 = r4.A0I
            if (r0 == 0) goto L_0x00a8
            long r5 = r0.length()     // Catch:{ all -> 0x015d }
        L_0x00a8:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00ca
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "userActionForwardMessage/original_size:"
            r2.append(r0)
            long r0 = r4.A0C
            r2.append(r0)
            java.lang.String r0 = " file_length:"
            r2.append(r0)
            java.io.File r0 = r4.A0I
            long r0 = r0.length()
            java.lang.String r0 = X.C36411kG.A11(r2, r0)
            goto L_0x00de
        L_0x00ca:
            X.3Qa r0 = r9.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x00e2
            X.0yi r0 = X.C21100yf.A0a
            boolean r0 = r7.A09(r0)
            if (r0 != 0) goto L_0x00e2
            java.lang.String r0 = "userActionForwardMessage/cannot forward partially uploaded message."
        L_0x00de:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r3
        L_0x00e2:
            X.AnonymousClass00C.A0D(r8, r3)
            boolean r0 = r9 instanceof X.AnonymousClass2cW
            if (r0 == 0) goto L_0x0112
            r0 = r9
            X.2cW r0 = (X.AnonymousClass2cW) r0
            X.3F4 r0 = r0.A00
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x0112
            java.util.Iterator r2 = r0.iterator()
        L_0x00f6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r1 = r2.next()
            X.3P8 r1 = (X.AnonymousClass3P8) r1
            X.AnonymousClass00C.A0B(r1)
            boolean r0 = X.C65773Tk.A01(r8, r1)
            if (r0 != 0) goto L_0x000c
            boolean r0 = X.C65773Tk.A02(r8, r1)
            if (r0 == 0) goto L_0x00f6
            return r3
        L_0x0112:
            X.3Qa r0 = r9.A1J
            X.11F r1 = r0.A00
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0122
            boolean r1 = r9 instanceof X.AnonymousClass2bS
            r0 = 4338(0x10f2, float:6.079E-42)
            if (r1 == 0) goto L_0x0130
            r0 = 0
            return r0
        L_0x0122:
            boolean r0 = r1 instanceof X.C177638e7
            if (r0 == 0) goto L_0x0135
            r0 = 1844(0x734, float:2.584E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x0135
            r0 = 4033(0xfc1, float:5.651E-42)
        L_0x0130:
            boolean r0 = r8.A0E(r0)
            return r0
        L_0x0135:
            boolean r0 = r9 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0149
            r0 = r9
            X.2bx r0 = (X.C46962bx) r0
            X.3S2 r1 = r0.A05
            if (r1 == 0) goto L_0x0149
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0149
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0149
            return r3
        L_0x0149:
            boolean r0 = X.C54322sl.A00(r9)
            if (r0 != 0) goto L_0x000c
            boolean r0 = r9 instanceof X.AnonymousClass4RV
            if (r0 != 0) goto L_0x0038
            boolean r0 = r9 instanceof X.AnonymousClass2bU
            if (r0 != 0) goto L_0x0038
            boolean r0 = r9 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x000c
            goto L_0x0038
        L_0x015d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66013Ui.A0W(X.0yf, X.0yC, X.3T1, X.1AW):boolean");
    }

    public static boolean A0a(AnonymousClass3T1 r3) {
        int i = r3.A1I;
        if ((i == 2 && (r3.A09 == 1 || C64933Qa.A04(r3) || r3.A0W() != null)) || A0K(i) || i == 82 || i == 78 || i == 81) {
            return true;
        }
        return false;
    }

    public static boolean A0b(AnonymousClass3T1 r2) {
        int i = r2.A0D;
        if (i == 7 || i == 20 || i == 21) {
            return true;
        }
        return false;
    }

    public static boolean A0c(AnonymousClass3T1 r1) {
        if (!r1.A1J.A02 || !A0p(r1)) {
            return false;
        }
        int i = ((AnonymousClass2bI) r1).A00;
        if (i == 147 || i == 155) {
            return true;
        }
        return false;
    }

    public static boolean A0d(AnonymousClass3T1 r6) {
        if (!(r6 instanceof AnonymousClass2bI)) {
            return false;
        }
        long j = (long) ((AnonymousClass2bI) r6).A00;
        if (j == 61 || j == 69) {
            return true;
        }
        return false;
    }

    public static boolean A0e(AnonymousClass3T1 r2) {
        if (!r2.A1J.A02 || !A0p(r2) || ((AnonymousClass2bI) r2).A00 != 67) {
            return false;
        }
        return true;
    }

    public static boolean A0f(AnonymousClass3T1 r1) {
        if (!r1.A1J.A02 || !A0p(r1)) {
            return false;
        }
        int i = ((AnonymousClass2bI) r1).A00;
        if (i == 28 || i == 10) {
            return true;
        }
        return false;
    }

    public static boolean A0g(AnonymousClass3T1 r2) {
        if (!r2.A1J.A02 || !A0p(r2) || ((AnonymousClass2bI) r2).A00 != 57) {
            return false;
        }
        return true;
    }

    public static boolean A0h(AnonymousClass3T1 r2) {
        if (!r2.A1J.A02 || !A0p(r2) || ((AnonymousClass2bI) r2).A00 != 71) {
            return false;
        }
        return true;
    }

    public static boolean A0i(AnonymousClass3T1 r2) {
        if (((r2 instanceof AnonymousClass2bV) || (r2 instanceof AnonymousClass2bU) || r2.A1I == 92) && AnonymousClass000.A1S(r2.A0A & C132986Wc.A0F, C132986Wc.A0F)) {
            return true;
        }
        return false;
    }

    public static boolean A0j(AnonymousClass3T1 r2) {
        if (r2.A1I == 36) {
            return true;
        }
        if (!r2.A1J.A02 || !A0p(r2) || !(r2 instanceof AnonymousClass2bI) || ((AnonymousClass2bI) r2).A00 != 59) {
            return false;
        }
        return true;
    }

    public static boolean A0k(AnonymousClass3T1 r4) {
        C207219uk BA8;
        C207089uX r2;
        if ((r4 instanceof C23043B1o) && (BA8 = ((C23043B1o) r4).BA8()) != null && (r2 = BA8.A04) != null && BA8.A00 == 5) {
            for (C206569tc r0 : r2.A03) {
                if ("galaxy_message".equals(r0.A01.A00)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0l(AnonymousClass3T1 r1) {
        return C36371kC.A1T(r1.A06, 127);
    }

    public static boolean A0m(AnonymousClass3T1 r2) {
        if (!r2.A1J.A02 || !A0p(r2) || ((AnonymousClass2bI) r2).A00 != 18) {
            return false;
        }
        return true;
    }

    public static boolean A0n(AnonymousClass3T1 r2) {
        int i = r2.A1I;
        if (i == 15 || i == 64 || i == 83) {
            return true;
        }
        return false;
    }

    public static boolean A0o(AnonymousClass3T1 r3) {
        if (!(r3 instanceof C181758nz) || ((AnonymousClass2bI) r3).A00 != 145) {
            return false;
        }
        return true;
    }

    public static boolean A0p(AnonymousClass3T1 r3) {
        int i = r3.A1I;
        int i2 = r3.A0D;
        Integer valueOf = Integer.valueOf(i2);
        if (i == 0) {
            if (valueOf == null || i2 != 6) {
                return false;
            }
            return true;
        } else if (i == 7) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean A0q(AnonymousClass3T1 r1) {
        if (!(r1 instanceof AnonymousClass2bV)) {
            return false;
        }
        AnonymousClass2bV r12 = (AnonymousClass2bV) r1;
        String str = r12.A05;
        String str2 = r12.A04;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    public static boolean A0r(AnonymousClass3T1 r6) {
        if (!(r6 instanceof AnonymousClass2bI)) {
            return false;
        }
        long j = (long) ((AnonymousClass2bI) r6).A00;
        if (j == 22 || j == 34 || j == 35 || j == 36 || j == 23 || j == 24 || j == 25 || j == 26 || j == 46 || j == 47 || j == 48 || j == 49 || j == 50 || j == 55) {
            return true;
        }
        return false;
    }

    public static boolean A0s(AnonymousClass3T1 r5) {
        C64933Qa r2 = r5.A1J;
        AnonymousClass11F r1 = r2.A00;
        if ((r5 instanceof AnonymousClass2bI) || !r2.A02 || ((!(r1 instanceof UserJid) && !(r1 instanceof AnonymousClass144)) || AnonymousClass143.A0H(r1) || r5.A0G != 0 || r5.A1T != null || r5.A0C != 0)) {
            return false;
        }
        return true;
    }

    public static boolean A0v(AnonymousClass3T1 r3, long j) {
        if (!AnonymousClass000.A1R(r3.A05)) {
            return false;
        }
        Long l = r3.A0g;
        C18740tg.A06(l);
        if (l.longValue() >= j || r3.A0E() == 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ae, code lost:
        if (r3 != 63) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r7 == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0w(X.AnonymousClass3T1 r6, boolean r7) {
        /*
            boolean r0 = r6.A10
            if (r0 == 0) goto L_0x0012
            X.3Qa r1 = r6.A1J
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0012
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 != 0) goto L_0x0012
            if (r7 == 0) goto L_0x0061
        L_0x0012:
            int r5 = r6.A1I
            r0 = 24
            if (r5 != r0) goto L_0x00d4
            X.3Qa r0 = r6.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0020
            if (r7 == 0) goto L_0x0061
        L_0x0020:
            boolean r0 = A0e(r6)
            if (r0 != 0) goto L_0x0061
            boolean r0 = A0m(r6)
            if (r0 != 0) goto L_0x0061
            boolean r0 = A0g(r6)
            if (r0 != 0) goto L_0x0061
            boolean r0 = A0h(r6)
            if (r0 != 0) goto L_0x0061
            X.3Qa r2 = r6.A1J
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0063
            boolean r0 = A0p(r6)
            if (r0 == 0) goto L_0x0063
            r0 = r6
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r1 = r0.A00
            r0 = 50
            if (r1 == r0) goto L_0x0061
            r0 = 49
            if (r1 == r0) goto L_0x0061
            r0 = 47
            if (r1 == r0) goto L_0x0061
            r0 = 48
            if (r1 == r0) goto L_0x0061
            r0 = 46
            if (r1 == r0) goto L_0x0061
            r0 = 55
            if (r1 != r0) goto L_0x0063
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        L_0x0063:
            boolean r0 = A0r(r6)
            if (r0 != 0) goto L_0x0061
            boolean r0 = A0f(r6)
            if (r0 == 0) goto L_0x0080
            if (r7 == 0) goto L_0x0061
            X.11F r1 = r2.A00
            if (r1 == 0) goto L_0x0061
            r0 = r6
            X.8nA r0 = (X.C181248nA) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
        L_0x0080:
            boolean r0 = r6 instanceof X.AnonymousClass2cL
            if (r0 != 0) goto L_0x0061
            boolean r0 = r6 instanceof X.AnonymousClass2cC
            if (r0 != 0) goto L_0x0061
            boolean r0 = r6 instanceof X.AnonymousClass2cD
            if (r0 != 0) goto L_0x0061
            boolean r0 = A0d(r6)
            if (r0 != 0) goto L_0x0061
            boolean r0 = r6 instanceof X.AnonymousClass5JC
            if (r0 != 0) goto L_0x0061
            boolean r0 = r6 instanceof X.C181368nM
            if (r0 != 0) goto L_0x0061
            boolean r0 = r6 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x00b1
            r0 = r6
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r0 = r0.A00
            long r3 = (long) r0
            r1 = 62
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            r1 = 63
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b1
            goto L_0x0061
        L_0x00b1:
            r0 = 88
            if (r5 == r0) goto L_0x0061
            r0 = 87
            if (r5 == r0) goto L_0x0061
            X.3KQ r0 = r6.A0N()
            if (r0 == 0) goto L_0x00c8
            X.3KQ r0 = r6.A0N()
            X.2p4 r0 = r0.A00
            if (r0 == 0) goto L_0x00c8
            goto L_0x0061
        L_0x00c8:
            boolean r0 = r6 instanceof X.AnonymousClass5JB
            if (r0 != 0) goto L_0x0061
            boolean r0 = A0c(r6)
            r1 = 1
            if (r0 == 0) goto L_0x0062
            goto L_0x0061
        L_0x00d4:
            r0 = 8
            if (r5 == r0) goto L_0x0061
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66013Ui.A0w(X.3T1, boolean):boolean");
    }

    public static boolean A0y(AnonymousClass2bU r3) {
        int i = r3.A1I;
        if (i == 2) {
            if (r3.A09 == 1) {
                return true;
            }
        } else if (i == 20) {
            return true;
        }
        if (A0K(i) || i == 82) {
            return true;
        }
        return false;
    }

    public static int A00(AnonymousClass2bU r1) {
        if (A0z(r1)) {
            return AnonymousClass000.A1P(C54732tQ.A00(r1) ? 1 : 0) ? 1 : 0;
        }
        if (A10(r1)) {
            return 2;
        }
        if (C54732tQ.A00(r1)) {
            return 4;
        }
        return 3;
    }

    public static AnonymousClass11F A05(Collection collection) {
        Object obj;
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            obj = it.next();
        } else {
            obj = null;
        }
        AnonymousClass3T1 r0 = (AnonymousClass3T1) obj;
        if (r0 == null) {
            return null;
        }
        return r0.A1J.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r0 != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3T1 A08(X.C19730wQ r8, X.C19970wo r9, X.C20810yC r10, X.AnonymousClass19I r11, X.AnonymousClass3T1 r12) {
        /*
            long r6 = A01(r10, r12)
            boolean r1 = A0T(r8, r12)
            X.3Qa r5 = r12.A1J
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0010
            if (r1 == 0) goto L_0x0039
        L_0x0010:
            int r1 = r12.A0D
            r0 = 4
            int r0 = X.AnonymousClass3TJ.A00(r1, r0)
            if (r0 >= 0) goto L_0x0032
            long r3 = r12.A0I
            long r3 = r3 + r6
            long r1 = X.C19970wo.A00(r9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
            java.util.Map r1 = r11.A01
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r5)     // Catch:{ all -> 0x002d }
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            goto L_0x0030
        L_0x002d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            throw r0
        L_0x0030:
            if (r0 == 0) goto L_0x0038
        L_0x0032:
            boolean r0 = A0b(r12)
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            return r12
        L_0x0039:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66013Ui.A08(X.0wQ, X.0wo, X.0yC, X.19I, X.3T1):X.3T1");
    }

    public static C64933Qa A0B(AnonymousClass3T1 r2) {
        if (A0i(r2)) {
            AnonymousClass37F A0X = r2.A0X();
            if (A0X != null) {
                return A0X.A02;
            }
            C18740tg.A0D(false, "FMessageUtil/getOriginalMessageKeyIfEdited messageEditInfo missing for edited message");
        }
        return r2.A1J;
    }

    public static String A0F(AnonymousClass3T1 r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("fmsg/status:");
        A0u.append(r3.A0D);
        A0u.append("/type:");
        A0u.append(r3.A1I);
        C64933Qa r1 = r3.A1J;
        if (AnonymousClass143.A0G(r1.A00) && (r3 instanceof AnonymousClass2bI)) {
            A0u.append("/grp_action:");
            A0u.append(((AnonymousClass2bI) r3).A00);
        }
        A0u.append("/rmt-src:");
        A0u.append(r3.A0J());
        C36421kH.A1N(A0u);
        C36351kA.A1K(r1, A0u);
        return A0u.toString();
    }

    public static void A0G(C19730wQ r0, C220412q r1, AnonymousClass3T1 r2) {
        C65073Qp A0W;
        if (A0O(r0, r2) && (A0W = C36371kC.A0W(r1, r2.A1J.A00)) != null) {
            synchronized (A0W) {
                int i = A0W.A06;
                if (i > 0) {
                    A0W.A06 = i - 1;
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("chatInfo/decrementUnseenImportantMessageCount/");
                C36321k7.A1a(A0u, A0W.A09());
            }
        }
    }

    public static boolean A0H(int i) {
        return "gif".equals(A0D(i));
    }

    public static boolean A0L(int i) {
        if (A0K(i) || i == 82 || i == 78) {
            return true;
        }
        return false;
    }

    public static boolean A0N(C19700wN r4, C19730wQ r5, C220412q r6, AnonymousClass17X r7, AnonymousClass3T1 r8) {
        int i;
        if (A0R(r5, r8) || (i = r8.A1I) == 64 || i == 83) {
            AnonymousClass11F r3 = r8.A1J.A00;
            if (!(r3 instanceof GroupJid) || (r8 instanceof AnonymousClass2c7) || (r8 instanceof AnonymousClass2bM) || (r8 instanceof AnonymousClass2bI) || (r8 instanceof AnonymousClass2bK) || AnonymousClass000.A1S(r8.A0A & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) || !r6.A0P(r3) || r7.A0D((GroupJid) r3)) {
                return true;
            }
            Log.e("SendMessageMethods/only admins can send message to CAGs");
            r4.A0E("SendMessageMethods/prohibited send to CAG", (String) null, false);
        }
        return false;
    }

    public static boolean A0U(C19730wQ r2, AnonymousClass3T1 r3) {
        if ((A0o(r3) || (!(r3 instanceof AnonymousClass2cS) ? (r3 instanceof C181608nk) : ((AnonymousClass2bI) r3).A00 == 88)) && !r2.A0M(r3.A0J())) {
            return true;
        }
        return false;
    }

    public static boolean A0X(AnonymousClass1OF r3, AnonymousClass3T1 r4, AnonymousClass005 r5) {
        if (((AnonymousClass1K3) r5.get()).BLB(r4.A1J.A00)) {
            return false;
        }
        if (AnonymousClass000.A1S(r4.A0A & 512, 512) || AnonymousClass000.A1S(r4.A0A & ZipDecompressor.UNZIP_BUFFER_SIZE, ZipDecompressor.UNZIP_BUFFER_SIZE) || (r3.A00.A0E(6939) && AnonymousClass000.A1S(r4.A0A & 33554432, 33554432))) {
            return true;
        }
        return false;
    }

    public static boolean A0Y(C220412q r2, AnonymousClass3T1 r3) {
        if (r3.A1L()) {
            return true;
        }
        if (AnonymousClass000.A1S(r3.A0A & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) && r3.A0P() != null) {
            return true;
        }
        if (!(r3 instanceof AnonymousClass2bM) && r2.A0P(r3.A1J.A00)) {
            return true;
        }
        if (!r3.A1E() || r3.A06 != 0) {
            return false;
        }
        return true;
    }

    public static boolean A0Z(AnonymousClass1GQ r2, AnonymousClass3T1 r3) {
        if (!C64933Qa.A04(r3) || !"video".equals(A0D(r3.A1I)) || ((!AnonymousClass1GQ.A00(r2, 2) && !AnonymousClass1GQ.A00(r2, 3)) || !r2.A00.A0E(6508))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0u(X.AnonymousClass3T1 r4) {
        /*
            boolean r0 = A0l(r4)
            r3 = 0
            if (r0 != 0) goto L_0x0019
            X.3Qa r0 = r4.A1J
            boolean r2 = r0.A02
            r1 = 1
            int r0 = r4.A06
            if (r2 == 0) goto L_0x001a
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 != r0) goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            return r3
        L_0x001a:
            int r0 = r0 + 1
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 5
            if (r1 < r0) goto L_0x0019
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66013Ui.A0u(X.3T1):boolean");
    }

    public static boolean A0x(AnonymousClass2bU r6) {
        int[] A06;
        AnonymousClass6Q6 A1Y = r6.A1Y();
        if (A1Y == null || !A1Y.A04() || (A06 = A1Y.A06()) == null || A06.length < 4) {
            return false;
        }
        if (AnonymousClass2bU.A00(r6).A0B >= ((long) (A06[0] + A06[1] + A06[2]))) {
            return true;
        }
        return false;
    }

    public static boolean A0z(AnonymousClass2bU r1) {
        C65013Qj A00 = AnonymousClass2bU.A00(r1);
        if (!A00.A0f || A00.A0d) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r4.A1J.A02 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A10(X.AnonymousClass2bU r4) {
        /*
            boolean r0 = X.AnonymousClass2tU.A00(r4)
            r3 = 0
            if (r0 != 0) goto L_0x002e
            X.3Qj r2 = X.AnonymousClass2bU.A00(r4)
            boolean r0 = r2.A0c
            if (r0 == 0) goto L_0x0016
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x002d
        L_0x001d:
            boolean r0 = r4.A10
            if (r0 == 0) goto L_0x002e
            X.3Qa r1 = r4.A1J
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x002e
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66013Ui.A10(X.2bU):boolean");
    }

    public static boolean A0t(AnonymousClass3T1 r6) {
        if (1531267200000L <= r6.A0I && AnonymousClass000.A1S(r6.A0A & 1, 1)) {
            if (!C202359le.A04(r6)) {
                int i = r6.A1I;
                if (i != 0) {
                    if (!(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 9 || i == 23 || i == 32 || i == 37 || i == 52 || i == 55 || i == 57 || i == 85 || i == 13 || i == 14 || i == 62 || i == 63)) {
                        switch (i) {
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                                break;
                        }
                    }
                } else if (r6.A0M == null) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
