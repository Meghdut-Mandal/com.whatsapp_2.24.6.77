package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3UL  reason: invalid class name */
public abstract class AnonymousClass3UL {
    public static int A00(TelephonyManager telephonyManager, C20830yE r3) {
        if (telephonyManager != null && !r3.A0G()) {
            try {
                if (C19550w8.A08()) {
                    return telephonyManager.getCallStateForSubscription();
                }
                return telephonyManager.getCallState();
            } catch (SecurityException unused) {
                Log.w("voip/getTelephonyState SecurityException is caught");
            }
        }
        return 0;
    }

    public static AnonymousClass141 A01(AnonymousClass16D r4, C20350xQ r5, GroupJid groupJid, AnonymousClass1C6 r7, boolean z) {
        AnonymousClass141 A0A;
        AnonymousClass147 A0j;
        if (groupJid == null || (A0A = r4.A0A(groupJid)) == null || (A0j = C36431kI.A0j(A0A)) == null || A0A.A0J() == null || (!z && r7.A09(A0j, Boolean.valueOf(r5.A0U.A0H(A0j))))) {
            return null;
        }
        return A0A;
    }

    public static boolean A07(C19730wQ r6, C21100yf r7, AnonymousClass1MK r8, AnonymousClass16D r9, AnonymousClass17X r10, AnonymousClass141 r11, C20810yC r12, GroupJid groupJid, AnonymousClass1EM r14, boolean z) {
        if (groupJid != null && !r8.A00() && !r14.A04(r11, groupJid)) {
            C20760y7 A05 = r10.A07.A0C(groupJid).A05();
            if (A05.size() != 1 || !A05.contains(C36441kJ.A0n(r6))) {
                if (!z) {
                    if (A05.size() > Math.min(64, r7.A04(C21100yf.A1g))) {
                        C225614x it = A05.iterator();
                        while (it.hasNext()) {
                            if (r9.A0q(C36441kJ.A0o(it))) {
                            }
                        }
                    }
                    return true;
                } else if (C34681hT.A0C(r6, r12, A05.size()) || !r8.A00()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String A02(Context context, AnonymousClass16D r7, AnonymousClass171 r8, C18820ts r9, AnonymousClass11F r10, UserJid userJid, long j, boolean z) {
        String A0Q;
        int i;
        Object[] A1a;
        if (userJid == null) {
            A0Q = context.getString(R.string.f12nameremoved);
        } else {
            A0Q = r8.A0Q(r7.A0D(userJid), r8.A0A(r10));
        }
        String A07 = C20040wv.A07(r9, j);
        String A00 = AnonymousClass3UM.A00(r9, j);
        if (z) {
            i = R.string.f12nameremoved;
            A1a = C36431kI.A1a(A07, A00, 2);
        } else {
            i = R.string.f12nameremoved;
            A1a = C36431kI.A1a(A0Q, A07, 3);
            A1a[2] = A00;
        }
        return context.getString(i, A1a);
    }

    public static ArrayList A03(C19730wQ r2, AnonymousClass17X r3, GroupJid groupJid) {
        ArrayList A15 = C36441kJ.A15(r3.A07.A0C(groupJid).A05());
        A15.remove(C36441kJ.A0n(r2));
        return A15;
    }

    public static boolean A08(C21100yf r3, C220412q r4, AnonymousClass17X r5, AnonymousClass141 r6, GroupJid groupJid) {
        if (groupJid == null || r6.A0i || r4.A05(groupJid) == 3 || !r5.A0C(groupJid) || C36401kF.A01(r5, groupJid) > Math.min(64, r3.A04(C21100yf.A1g))) {
            return false;
        }
        return true;
    }

    public static boolean A09(AnonymousClass185 r2, CallInfo callInfo) {
        if (callInfo != null) {
            boolean z = callInfo.isGroupCall;
            UserJid peerJid = callInfo.getPeerJid();
            if (z || !r2.A04(peerJid)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static List A04(C19730wQ r3, AnonymousClass16D r4, AnonymousClass17X r5, AnonymousClass141 r6) {
        GroupJid A0P = C36421kH.A0P(r6);
        if (A0P == null) {
            return Collections.singletonList(r6);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A03(r3, r5, A0P).iterator();
        while (it.hasNext()) {
            C36381kD.A1H(r4, C36401kF.A0a(it), A0I);
        }
        return A0I;
    }

    public static void A05(Context context, AnonymousClass17Y r8, AnonymousClass1ND r9, C20530xi r10, C19970wo r11, AnonymousClass1HJ r12, AnonymousClass1HO r13, C26211Jh r14, GroupJid groupJid, int i, long j) {
        AnonymousClass3KV A01;
        C107265Nh r6;
        C36321k7.A1K(groupJid, "scheduled-call/joinScheduledCall groupJid=", AnonymousClass000.A0u());
        AnonymousClass5Ng A03 = r13.A03(groupJid);
        if (A03 != null) {
            r6 = r12.A06(A03.A02());
            A01 = null;
        } else {
            A01 = r14.A01(j);
            r6 = null;
        }
        r8.A0H(new C1503674z(context, r9, r10, r11, A01, r6, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if ("video".equals(r4) != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(android.net.Uri r8, X.C225314u r9, X.AnonymousClass17Y r10, X.AnonymousClass1ND r11, int r12) {
        /*
            java.lang.String r1 = r8.getScheme()
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r1)
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = r8.getHost()
            java.lang.String r0 = "call"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003e
        L_0x001a:
            java.lang.String r1 = r8.getScheme()
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0032
            java.lang.String r1 = r8.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
        L_0x0032:
            java.lang.String r1 = r8.getHost()
            java.lang.String r0 = "call.whatsapp.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
        L_0x003e:
            java.util.List r8 = r8.getPathSegments()
            int r0 = r8.size()
            r5 = 0
            if (r0 <= 0) goto L_0x0088
            java.lang.Object r4 = r8.get(r6)
        L_0x004d:
            int r0 = r8.size()
            if (r0 <= r7) goto L_0x0057
            java.lang.String r5 = X.C36401kF.A0s(r8, r7)
        L_0x0057:
            java.lang.String r0 = "voice"
            boolean r0 = r0.equals(r4)
            java.lang.String r3 = "video"
            if (r0 != 0) goto L_0x0068
            boolean r0 = r3.equals(r4)
            r2 = 0
            if (r0 == 0) goto L_0x0069
        L_0x0068:
            r2 = 1
        L_0x0069:
            if (r5 == 0) goto L_0x0086
            int r1 = r5.length()
            r0 = 22
            if (r1 != r0) goto L_0x0086
        L_0x0073:
            int r1 = r8.size()
            r0 = 2
            if (r1 != r0) goto L_0x008a
            if (r2 == 0) goto L_0x008a
            if (r7 == 0) goto L_0x008a
            boolean r0 = r3.equals(r4)
            r11.BmF(r9, r5, r12, r0)
        L_0x0085:
            return
        L_0x0086:
            r7 = 0
            goto L_0x0073
        L_0x0088:
            r4 = r5
            goto L_0x004d
        L_0x008a:
            r0 = 2131890540(0x7f12116c, float:1.9415775E38)
            r10.A06(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UL.A06(android.net.Uri, X.14u, X.17Y, X.1ND, int):void");
    }
}
