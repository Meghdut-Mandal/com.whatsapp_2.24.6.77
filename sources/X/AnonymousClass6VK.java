package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6VK  reason: invalid class name */
public abstract class AnonymousClass6VK {
    public Set A00;
    public final C19460v5 A01;
    public final C19460v5 A02;
    public final C120375rP A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;
    public final AnonymousClass005 A0C;
    public final AnonymousClass005 A0D;
    public final AnonymousClass005 A0E;
    public final AnonymousClass005 A0F;
    public final AnonymousClass005 A0G;
    public final AnonymousClass005 A0H;
    public final AnonymousClass005 A0I;
    public final AnonymousClass005 A0J;
    public final AnonymousClass005 A0K;
    public final AnonymousClass005 A0L;
    public final AnonymousClass005 A0M;
    public final AnonymousClass005 A0N;
    public final AnonymousClass005 A0O;
    public final AnonymousClass005 A0P;
    public final AnonymousClass005 A0Q;
    public final AnonymousClass005 A0R;
    public final AnonymousClass005 A0S;
    public final AnonymousClass005 A0T;
    public final AnonymousClass005 A0U;
    public final AnonymousClass005 A0V;
    public final AnonymousClass005 A0W;
    public final AnonymousClass005 A0X;
    public final AnonymousClass005 A0Y;
    public final AnonymousClass005 A0Z;
    public final AnonymousClass005 A0a;
    public final AnonymousClass005 A0b;
    public final AnonymousClass005 A0c;
    public final AnonymousClass005 A0d;
    public final AnonymousClass005 A0e;

    public void A05(Activity activity, C158077fl r5, String str, String str2) {
        List A042 = ((AnonymousClass01I) activity).getSupportFragmentManager().A0T.A04();
        C99304t3 A022 = C99304t3.A02(((AnonymousClass02E) A042.get(C36431kI.A07(A042))).A0F, str, 0);
        A022.A0Z(str2, new C135496cn(r5, activity, 7));
        A022.A0P();
    }

    public void A03(int i, int i2, int i3) {
        C21430zE r0;
        C120375rP r1 = this.A03;
        short s = (short) i3;
        AnonymousClass005 r02 = r1.A00;
        int A002 = AnonymousClass61J.A00(r02, i2, i);
        int A003 = C122885va.A00(r02, i);
        AnonymousClass005 r2 = r1.A01;
        int A012 = C122885va.A01(r2, i);
        if (1 == A012) {
            r0 = C90514aH.A0h(r2).A03;
        } else if (2 == A012) {
            r0 = C90514aH.A0h(r2).A02;
        } else {
            return;
        }
        r0.markerEnd(A003, A002, s);
    }

    public void A04(Activity activity, C158067fk r7, String[] strArr) {
        if (this.A00 == null) {
            HashSet A16 = C36441kJ.A16();
            this.A00 = A16;
            LinkedHashSet A17 = C36441kJ.A17();
            AnonymousClass03Y.A0D(A17, AnonymousClass3TA.A00());
            AnonymousClass03Y.A0D(A17, AnonymousClass3TA.A03());
            A16.addAll(Arrays.asList(A17.toArray(new String[0])));
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str = strArr[i];
                if (!this.A00.contains(str)) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Unauthorized permission request ");
                    A0u.append(str);
                    A0u.append(", Bloks allowed to request only whitelisted permissions ");
                    C36331k8.A1P(this.A00, A0u);
                    break;
                }
                i++;
            } else if (activity instanceof AnonymousClass155) {
                AnonymousClass155 r4 = (AnonymousClass155) activity;
                Intent A0B2 = RequestPermissionActivity.A0B.A0B(activity, (C20830yE) this.A0e.get(), 30);
                if (A0B2 == null) {
                    r7.BfK(true);
                    return;
                }
                r4.A3Z(new C164147rL(r4, r7, this, 0));
                r4.startActivityForResult(A0B2, 30);
                return;
            }
        }
        r7.BfK(false);
    }

    public void A06(C158057fj r7, int i, int i2) {
        C21430zE r2;
        if (r7 != null) {
            C140456lc.A0I(r7.B7w(), 38);
        }
        C120375rP r1 = this.A03;
        AnonymousClass005 r0 = r1.A00;
        int A002 = AnonymousClass61J.A00(r0, i2, i);
        int A003 = C122885va.A00(r0, i);
        AnonymousClass005 r3 = r1.A01;
        int A012 = C122885va.A01(r3, i);
        if (1 == A012) {
            r2 = C90514aH.A0h(r3).A03;
        } else if (2 == A012) {
            r2 = C90514aH.A0h(r3).A02;
        } else {
            return;
        }
        r2.markerStart(A003, A002);
        r2.markerAnnotate(A003, A002, "bloks_display_name", C133056Wm.A00(C90514aH.A0h(r3).A06, i).A02);
    }

    public static UserJid A00(AnonymousClass6VK r3, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C222813r r0 = UserJid.Companion;
                return C222813r.A01(str);
            } catch (C19740wR e) {
                C222913s r02 = PhoneUserJid.Companion;
                PhoneUserJid A002 = C222913s.A00(str);
                ((C19700wN) r3.A0N.get()).A0E("bloks/openchat - Jid missing suffix", e.getMessage(), true);
                return A002;
            }
        } else {
            throw new C19740wR("Jid is Empty");
        }
    }

    public static String A01(HashMap hashMap) {
        ArrayList A15 = C36441kJ.A15(hashMap.keySet());
        try {
            JSONObject A1B = C36441kJ.A1B();
            Collections.sort(A15);
            for (int i = 0; i < A15.size(); i++) {
                A1B.put((String) A15.get(i), hashMap.get(A15.get(i)));
            }
            return A1B.toString();
        } catch (JSONException e) {
            Log.e("Failed to Convert Map to JSON object.", e);
            return null;
        }
    }

    public static void A02(Activity activity, String str) {
        Intent A0D2 = C36431kI.A0D();
        A0D2.setAction("android.intent.action.SEND");
        A0D2.putExtra("android.intent.extra.TEXT", str);
        A0D2.setType("text/plain");
        activity.startActivity(Intent.createChooser(A0D2, (CharSequence) null));
    }

    public AnonymousClass6VK(C19460v5 r3, C19460v5 r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9, AnonymousClass005 r10, AnonymousClass005 r11, AnonymousClass005 r12, AnonymousClass005 r13, AnonymousClass005 r14, AnonymousClass005 r15, AnonymousClass005 r16, AnonymousClass005 r17, AnonymousClass005 r18, AnonymousClass005 r19, AnonymousClass005 r20, AnonymousClass005 r21, AnonymousClass005 r22, AnonymousClass005 r23, AnonymousClass005 r24, AnonymousClass005 r25, AnonymousClass005 r26, AnonymousClass005 r27, AnonymousClass005 r28, AnonymousClass005 r29, AnonymousClass005 r30, AnonymousClass005 r31, AnonymousClass005 r32, AnonymousClass005 r33, AnonymousClass005 r34, AnonymousClass005 r35, AnonymousClass005 r36, AnonymousClass005 r37, AnonymousClass005 r38, AnonymousClass005 r39, AnonymousClass005 r40, AnonymousClass005 r41, AnonymousClass005 r42, AnonymousClass005 r43) {
        this.A03 = new C120375rP(r6, r32);
        this.A0X = r5;
        this.A04 = r7;
        this.A0C = r8;
        this.A0Q = r9;
        this.A0N = r10;
        this.A0R = r11;
        this.A0b = r12;
        this.A05 = r13;
        this.A0c = r14;
        this.A0D = r15;
        this.A0V = r16;
        this.A0Y = r17;
        this.A0U = r18;
        this.A0I = r19;
        this.A0K = r20;
        this.A0W = r21;
        this.A0T = r22;
        this.A06 = r23;
        this.A0L = r24;
        this.A0O = r25;
        this.A0M = r26;
        this.A0Z = r27;
        this.A07 = r28;
        this.A0G = r29;
        this.A0F = r30;
        this.A0d = r31;
        this.A0H = r33;
        this.A0J = r34;
        this.A0A = r41;
        this.A0E = r35;
        this.A0B = r36;
        this.A08 = r37;
        this.A0e = r38;
        this.A0P = r39;
        this.A0a = r40;
        this.A09 = r42;
        this.A0S = r43;
        this.A02 = r3;
        this.A01 = r4;
    }
}
