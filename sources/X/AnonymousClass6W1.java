package X;

import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.Map;

/* renamed from: X.6W1  reason: invalid class name */
public final class AnonymousClass6W1 {
    public static final AnonymousClass00T A04 = C36431kI.A1I(AnonymousClass7QK.A00);
    public C128706Dh A00;
    public final AnonymousClass1NX A01;
    public final C21010yW A02;
    public final C19930wk A03;

    public static final void A02(AnonymousClass6O7 r3, C1041558m r4, AnonymousClass11F r5, boolean z) {
        int valueOf;
        boolean z2 = false;
        if (r3 != null && r3.A03.contains(r5)) {
            z2 = true;
        }
        if (z) {
            valueOf = 1;
        } else {
            int i = 3;
            if (z2) {
                i = 2;
            }
            valueOf = Integer.valueOf(i);
        }
        r4.A01 = valueOf;
        if (r3 != null) {
            C108295Sy r1 = C108295Sy.ADHOC_MEMBERS;
            r4.A04 = r3.A00(r1, r5);
            Map map = r3.A02;
            r4.A05 = Long.valueOf(C36431kI.A09(C90494aF.A0Y(r1, map)));
            C108295Sy r12 = C108295Sy.LGC_MEMBERS;
            r4.A08 = r3.A00(r12, r5);
            r4.A09 = Long.valueOf(C36431kI.A09(C90494aF.A0Y(r12, map)));
            C108295Sy r13 = C108295Sy.STARRED_CONTACTS;
            r4.A0C = r3.A00(r13, r5);
            r4.A0D = Long.valueOf(C36431kI.A09(C90494aF.A0Y(r13, map)));
            C108295Sy r14 = C108295Sy.GROUP_CHAT_MEMBERS;
            r4.A06 = r3.A00(r14, r5);
            r4.A07 = Long.valueOf(C36431kI.A09(C90494aF.A0Y(r14, map)));
            C108295Sy r15 = C108295Sy.ONE_ON_ONE;
            r4.A0A = r3.A00(r15, r5);
            r4.A0B = Long.valueOf(C36431kI.A09(C90494aF.A0Y(r15, map)));
        }
    }

    public static final AnonymousClass2RF A00(AnonymousClass6W1 r3, String str) {
        C128706Dh r2 = r3.A00;
        Boolean bool = null;
        if (r2 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("CallUserJourney/");
            A0u.append(str);
            C36341k9.A1O(A0u, " received null event, did you start a session?");
        } else if (r2.A02) {
            AnonymousClass2RF r4 = new AnonymousClass2RF();
            r4.A03 = Integer.valueOf(r2.A04);
            r4.A02 = Integer.valueOf(r2.A03);
            r4.A04 = C36431kI.A1E(r3.A01.A00);
            r4.A05 = r2.A06;
            CallInfo callInfo = r2.A05;
            if (callInfo != null) {
                CallState[] callStateArr = new CallState[2];
                callStateArr[0] = CallState.ACTIVE;
                bool = Boolean.valueOf(C36341k9.A0m(CallState.CONNECTED_LONELY, callStateArr, 1).contains(callInfo.callState));
            }
            r4.A00 = bool;
            return r4;
        }
        return null;
    }

    public static final C1041558m A01(AnonymousClass6W1 r3, String str) {
        C128706Dh r1 = r3.A00;
        if (r1 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("WamSelectParticipantFromPicker/");
            A0u.append(str);
            C36341k9.A1O(A0u, " received null event, did you start a session?");
            return null;
        }
        C1041558m r2 = new C1041558m();
        r2.A0G = r1.A07.toString();
        r2.A0F = r1.A06;
        r2.A0E = C36431kI.A1E(r3.A01.A00);
        r2.A03 = Integer.valueOf(r1.A04);
        r2.A02 = C36381kD.A0n();
        return r2;
    }

    public AnonymousClass6W1(AnonymousClass1NX r2, C21010yW r3, C19770wU r4) {
        C36321k7.A11(r4, r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = C36411kG.A0r(r4);
    }
}
