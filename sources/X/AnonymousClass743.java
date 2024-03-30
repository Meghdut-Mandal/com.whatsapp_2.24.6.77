package X;

import android.os.Message;
import com.whatsapp.calling.CallSummary;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallParticipant;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.743  reason: invalid class name */
public final /* synthetic */ class AnonymousClass743 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CallSummary A02;
    public final /* synthetic */ AnonymousClass6Ts A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ CallParticipant[] A07;

    public /* synthetic */ AnonymousClass743(CallSummary callSummary, AnonymousClass6Ts r2, UserJid userJid, String str, CallParticipant[] callParticipantArr, int i, int i2, boolean z) {
        this.A03 = r2;
        this.A05 = str;
        this.A04 = userJid;
        this.A06 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = callParticipantArr;
        this.A02 = callSummary;
    }

    public final void run() {
        AnonymousClass6Ts r9 = this.A03;
        String str = this.A05;
        UserJid userJid = this.A04;
        boolean z = this.A06;
        int i = this.A00;
        int i2 = this.A01;
        CallParticipant[] callParticipantArr = this.A07;
        CallSummary callSummary = this.A02;
        C107265Nh A042 = r9.A04(str);
        if (A042 != null || (userJid != null && (A042 = r9.A03(userJid, str, i, z)) != null)) {
            C36321k7.A1T("updateJoinableCallLogOnCurrentThread updateType=", AnonymousClass000.A0u(), i2);
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C36321k7.A1S("updateJoinableCallLogOnCurrentThread unknown type: ", AnonymousClass000.A0u(), i2);
                    } else {
                        String str2 = A042.A04.A02;
                        String A08 = C34681hT.A08(str2);
                        if (callSummary != null) {
                            Log.i("updateJoinableCallLogOnCurrentThread updating call summary");
                            int i3 = callSummary.durationMs / 1000;
                            synchronized (A042) {
                                if (A042.A09 != i3) {
                                    A042.A09 = i3;
                                    A042.A03();
                                }
                            }
                            r9.A08(A042, callSummary.callSummaryUsers);
                        }
                        r9.A07(A042, false);
                        r9.A06.A09(A042);
                        r9.A04.A00(A042);
                        r9.A05.A04(27, C34681hT.A08(str2), "joinable call");
                        if (A042.A0N() && !A042.A0O()) {
                            Message.obtain(r9.A03.A0c, 5, 1, 0, A042).sendToTarget();
                        }
                        C36341k9.A0u(C90474aD.A0F(r9.A02), AnonymousClass000.A0p("ad_hoc_call_invitor_", A08, AnonymousClass000.A0u()));
                    }
                }
                r9.A08(A042, callParticipantArr);
                r9.A06.A0A(A042);
            } else {
                if (A042.A0D != null) {
                    C20810yC r1 = r9.A09;
                    GroupJid groupJid = A042.A0D;
                    C232317r r10 = r9.A08;
                    if (C34681hT.A0O(r1, r10.A0A(groupJid))) {
                        if (A042.A0D == null) {
                            C18740tg.A0D(false, "CallLogHelper/updateInvitedParticipantsUsingGroupMembership/ Group jid cannot be null");
                        } else {
                            HashSet A16 = C36441kJ.A16();
                            for (CallParticipant callParticipant : callParticipantArr) {
                                if (callParticipant.isCallConnected()) {
                                    A16.add(callParticipant.jid);
                                }
                            }
                            C225614x it = r10.A0C(A042.A0D).A07().iterator();
                            while (it.hasNext()) {
                                C19730wQ r0 = r9.A01;
                                UserJid userJid2 = ((AnonymousClass6PM) it.next()).A03;
                                if (!r0.A0M(userJid2)) {
                                    int i4 = 2;
                                    if (A16.contains(userJid2)) {
                                        i4 = 5;
                                    }
                                    A042.A0K(userJid2, i4);
                                }
                            }
                        }
                    }
                }
                r9.A07(A042, true);
                r9.A08(A042, callParticipantArr);
                r9.A06.A0A(A042);
            }
            AnonymousClass6YM r12 = r9.A03;
            if (str.equals(r12.A18)) {
                r12.A18 = null;
                AnonymousClass6X4 r4 = (AnonymousClass6X4) r12.A3A.get();
                AnonymousClass00T r02 = AnonymousClass6X4.A0E;
                AnonymousClass00C.A0D(callParticipantArr, 0);
                ArrayList A14 = C36441kJ.A14(r3);
                for (CallParticipant callParticipant2 : callParticipantArr) {
                    A14.add(callParticipant2.jid);
                }
                r4.A08(AnonymousClass5SD.ADD_ONLY, A042, C007103b.A0f(A14));
            }
        }
    }
}
