package X;

import android.os.ConditionVariable;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.19x  reason: invalid class name and case insensitive filesystem */
public class C238019x {
    public final C19700wN A00;
    public final C237919w A01;
    public final C19730wQ A02;
    public final AnonymousClass17K A03;

    public C181758nz A05(GroupJid groupJid, String str, List list, int i, int i2, long j) {
        C181758nz r0;
        ConditionVariable conditionVariable = C18740tg.A00;
        C237919w r2 = this.A01;
        C64933Qa A022 = r2.A02(groupJid, true);
        if (i == 2) {
            r0 = new C181758nz(r2.A02(groupJid, true), i, j);
        } else {
            AnonymousClass2cR r02 = new AnonymousClass2cR(A022, j);
            r02.A00 = i2;
            r0 = r02;
        }
        r0.A16(str);
        if (list != null) {
            r0.A01 = list;
        }
        return r0;
    }

    public static void A01(UserJid userJid, C181758nz r2, C238019x r3, boolean z) {
        if (r3.A02.A0M(userJid)) {
            r2.A00 = 1;
        }
        if (!z) {
            r2.A0q(userJid);
        }
    }

    public AnonymousClass2bI A02(AnonymousClass11F r4, int i, long j) {
        return this.A03.A00(this.A01.A02(r4, true), i, j);
    }

    public C181758nz A03(AnonymousClass6X6 r9, AnonymousClass144 r10, UserJid userJid, C207209uj r12, List list, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemMessageFactory/newParticipantsStatusMessage; stanzaKey=");
        sb.append(r12);
        sb.append("; gjid=");
        sb.append(r10);
        sb.append("; action=");
        sb.append(i);
        sb.append("; author=");
        sb.append(userJid);
        Log.i(sb.toString());
        AnonymousClass6X6 r2 = r9;
        C181758nz A04 = A04(r2, r10, r12, i, j);
        A00(userJid, A04, this, list, i);
        return A04;
    }

    public C181758nz A04(AnonymousClass6X6 r9, AnonymousClass144 r10, C207209uj r11, int i, long j) {
        C181758nz r2;
        Set set = C56672wh.A01;
        boolean z = true;
        int i2 = i;
        if (!(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8 || i == 9 || i == 11 || i == 167 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17 || i == 20 || i == 21 || i == 27 || i == 29 || i == 30 || i == 31 || i == 32 || i == 33 || i == 51 || i == 52 || i == 53 || i == 54 || i == 56 || i == 73 || i == 74 || i == 79 || i == 81 || i == 82 || i == 83 || i == 84 || i == 85 || i == 86 || i == 90 || i == 91 || i == 92 || i == 93 || i == 94 || i == 99 || i == 100 || i == 101 || i == 106 || i == 107 || i == 120 || i == 122 || i == 123 || i == 124 || i == 144 || i == 125 || i == 126 || i == 127 || i == 131 || i == 137 || i == 138 || i == 140 || i == 141 || i == 139 || i == 142 || i == 143 || i == 145 || i == 148 || i == 149 || i == 150 || i == 151 || i == 152 || i == 159 || i == 160 || i == 161)) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not supposed to be used for action = ");
        sb.append(i);
        C18740tg.A0D(z, sb.toString());
        boolean z2 = true;
        C207209uj r4 = r11;
        long j2 = j;
        if (r11 != null) {
            AnonymousClass6X6 r3 = r9;
            if (i == 1) {
                r2 = new C181478nX(r9, r11, j);
            } else if (i == 56) {
                r2 = new C181458nV(r9, r11, j);
            } else {
                r2 = new C181758nz(r3, r4, i2, j2);
            }
            r2.A1Q = r11.A00;
            return r2;
        }
        if (r10 == null) {
            z2 = false;
        }
        C18740tg.A0C(z2);
        return (C181758nz) this.A03.A00(this.A01.A02(r10, true), i, j);
    }

    public C181758nz A06(AnonymousClass144 r10, UserJid userJid, C207209uj r12, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemMessageFactory/newParticipantStatusMessage; stanzaKey=");
        sb.append(r12);
        sb.append("; gjid=");
        sb.append(r10);
        sb.append("; action=");
        sb.append(i);
        Log.i(sb.toString());
        C181758nz A04 = A04((AnonymousClass6X6) null, r10, r12, i, j);
        A04.A0q(userJid);
        if (i == 4 && this.A02.A0M(userJid)) {
            A04.A00 = 1;
        }
        return A04;
    }

    public C181758nz A07(AnonymousClass147 r4, UserJid userJid, long j, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("SystemMessageFactory/newReportToAdminStatusChangeSystemMessage/gjid=");
        sb.append(r4);
        Log.i(sb.toString());
        C64933Qa A022 = this.A01.A02(r4, true);
        int i = 141;
        if (z) {
            i = 140;
        }
        C181758nz r0 = new C181758nz(A022, i, j);
        r0.A0q(userJid);
        return r0;
    }

    public C181758nz A08(AnonymousClass147 r8, AnonymousClass3QL r9, C207209uj r10, boolean z) {
        long millis = TimeUnit.SECONDS.toMillis(r9.A00);
        int i = 27;
        if (z) {
            i = 131;
        }
        C181758nz A04 = A04((AnonymousClass6X6) null, r8, r10, i, millis);
        A04.A16(r9.A03);
        A04.A0q(r9.A02);
        return A04;
    }

    public C181458nV A09(AnonymousClass147 r8, UserJid userJid, C207209uj r10, int i, long j) {
        C181458nV r0 = (C181458nV) A04((AnonymousClass6X6) null, r8, r10, 56, j);
        r0.A0q(userJid);
        r0.A00 = i;
        return r0;
    }

    public C181248nA A0A(AnonymousClass11F r6, UserJid userJid, UserJid userJid2, long j) {
        C19700wN r2;
        C181248nA r3 = new C181248nA(this.A01.A02(r6, true), 28, j);
        if (userJid == null && (r2 = r3.A02) != null) {
            r2.A0E("InvalidNumberChangeJid", "oldJid = null", true);
        }
        r3.A01 = userJid;
        r3.A1Z(userJid2);
        return r3;
    }

    public C181688ns A0B(GroupJid groupJid, AnonymousClass147 r7, UserJid userJid, C207209uj r9, String str, String str2, long j) {
        C181688ns r4 = new C181688ns(this.A01.A02(groupJid, true), j);
        r4.A03 = r9;
        r4.A1g(r7, str2);
        if (r7 != null) {
            if (r4.A1e(4).size() > 0) {
                C18740tg.A0D(false, "FMessageSystemParentGroupNameChanged/setOldParentInfo/old parent info should only be set once");
            }
            r4.A00.add(new C195869Wj(r7, str, 4, 0));
        }
        r4.A0q(userJid);
        return r4;
    }

    public C238019x(C19700wN r1, C19730wQ r2, C237919w r3, AnonymousClass17K r4) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
    }

    public static void A00(UserJid userJid, C181758nz r1, C238019x r2, List list, int i) {
        r1.A0q(userJid);
        r1.A19(list);
        if (C66013Ui.A0I(i)) {
            C19730wQ r0 = r2.A02;
            r0.A0G();
            if (list.contains(r0.A03)) {
                r1.A00 = 1;
            }
        }
    }
}
