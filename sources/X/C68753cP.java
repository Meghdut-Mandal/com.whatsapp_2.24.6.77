package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3cP  reason: invalid class name and case insensitive filesystem */
public class C68753cP implements AnonymousClass4UK {
    public final C19730wQ A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass185 A02;
    public final AnonymousClass1A6 A03;
    public final C19970wo A04;
    public final C19420v0 A05;
    public final AnonymousClass189 A06;
    public final C20310xM A07;
    public final AnonymousClass17X A08;
    public final AnonymousClass3OB A09;
    public final C231417i A0A;
    public final C238019x A0B;
    public final AnonymousClass164 A0C;
    public final AnonymousClass16D A0D;
    public final AnonymousClass1FN A0E;
    public final AnonymousClass1QO A0F;
    public final AnonymousClass1FL A0G;
    public final C20810yC A0H;
    public final AnonymousClass1P5 A0I;
    public final C30911ay A0J;

    public void BYX(DeviceJid deviceJid, int i) {
    }

    public void BZ1(DeviceJid deviceJid) {
        A00(deviceJid, false);
    }

    public void BZ2(DeviceJid deviceJid) {
        A00(deviceJid, true);
    }

    /* JADX INFO: finally extract failed */
    private void A00(DeviceJid deviceJid, boolean z) {
        AnonymousClass141 A082;
        AnonymousClass3L0 r4;
        AnonymousClass1M0 A052;
        AnonymousClass6PM A083;
        C1495671s B1k;
        DeviceJid deviceJid2;
        Throwable th;
        C1495671s B1k2;
        AnonymousClass3L0 A022;
        C224214g r3 = new C224214g("IdentityChangeManager/handleIdentityChangeSecurityNotification");
        DeviceJid deviceJid3 = deviceJid;
        try {
            if (!C197029b1.A00(deviceJid3.userJid)) {
                if (deviceJid3.getDevice() != 0) {
                    if (!z) {
                        if (!this.A00.A0M(deviceJid3.userJid)) {
                            AnonymousClass3OB r2 = this.A09;
                            C20760y7.copyOf((Collection) this.A0A.A0B(deviceJid3.userJid));
                            C20760y7.of(deviceJid3);
                            C20760y7.of(deviceJid3);
                            r2.A04.A2C();
                        }
                    }
                }
                boolean A2C = this.A05.A2C();
                UserJid userJid = deviceJid3.userJid;
                if (A2C && ((A022 = this.A02.A02(userJid)) == null || C55052tz.A00(A022.A01, A022.A00) == 1)) {
                    C20310xM r8 = this.A07;
                    AnonymousClass2bI r22 = new AnonymousClass2bI(C36411kG.A0o(userJid, this.A0B.A01), 18, C19970wo.A00(this.A04));
                    r22.A0q((AnonymousClass11F) null);
                    r8.A0h(r22);
                }
                HashSet hashSet = new HashSet(this.A03.A06());
                C232317r r82 = this.A08.A07;
                Iterator it = r82.A0F(userJid).iterator();
                while (it.hasNext()) {
                    AnonymousClass144 r5 = (AnonymousClass144) it.next();
                    if (A2C) {
                        AnonymousClass6X6 A0C2 = r82.A0C(r5);
                        if (((r5 instanceof GroupJid) || (r5 instanceof C177538dx)) && hashSet.contains(r5)) {
                            C20760y7 A053 = A0C2.A05();
                            C227315o r42 = new C227315o();
                            C225614x it2 = A053.iterator();
                            while (it2.hasNext()) {
                                Jid jid = (Jid) it2.next();
                                if (!AnonymousClass143.A0I(jid)) {
                                    r42.add((Object) jid);
                                }
                            }
                            C20760y7 build = r42.build();
                            if (build.contains(userJid) && (build.contains(C36441kJ.A0n(this.A00)) || (r5 instanceof C177618e5))) {
                                C20310xM r6 = this.A07;
                                AnonymousClass2bI r0 = new AnonymousClass2bI(C36411kG.A0o(r5, this.A0B.A01), 18, C19970wo.A00(this.A04));
                                r0.A0q(userJid);
                                r6.A0h(r0);
                            }
                        }
                    }
                }
            }
            r3.A01();
            UserJid userJid2 = deviceJid3.userJid;
            boolean z2 = false;
            if (deviceJid3.getDevice() == 0) {
                z2 = true;
            }
            if (z2) {
                if (!this.A00.A0M(userJid2)) {
                    this.A0A.A0F(userJid2, "identity_changed");
                    AnonymousClass1QO r32 = this.A0F;
                    AnonymousClass1FN r1 = r32.A02;
                    DeviceJid primaryDevice = userJid2.getPrimaryDevice();
                    AnonymousClass1FK r9 = r1.A01;
                    HashSet A16 = C36441kJ.A16();
                    AnonymousClass12P r15 = r9.A04;
                    AnonymousClass1M0 A042 = r15.get();
                    try {
                        C224114e r62 = A042.A02;
                        String[] A1R = C36441kJ.A1R();
                        C219712j r7 = r9.A02;
                        C36351kA.A1V(A1R, 0, r7.A07(primaryDevice));
                        Cursor A092 = r62.A09("SELECT message_row_id FROM receipt_device WHERE receipt_device_jid_row_id = ? AND receipt_device_timestamp is NULL", "MessageReceiptDeviceStore/getUndeliveredMessageRowIds", A1R);
                        try {
                            int columnIndex = A092.getColumnIndex("message_row_id");
                            while (A092.moveToNext()) {
                                A16.add(String.valueOf(A092.getLong(columnIndex)));
                            }
                            A092.close();
                            A042.close();
                            AnonymousClass1QP r33 = r32.A03;
                            HashSet A162 = C36441kJ.A16();
                            String valueOf = String.valueOf(r33.A01.A07(userJid2));
                            String[] strArr = C19430v1.A0N;
                            AnonymousClass72Z r12 = new AnonymousClass72Z(A16.toArray(strArr), 975);
                            ArrayList A0I2 = AnonymousClass001.A0I();
                            A042 = r33.A02.get();
                            Iterator it3 = r12.iterator();
                            while (it3.hasNext()) {
                                String[] strArr2 = (String[]) it3.next();
                                A0I2.clear();
                                A0I2.add(valueOf);
                                A0I2.addAll(Arrays.asList(strArr2));
                                C224114e r34 = A042.A02;
                                int length = strArr2.length;
                                StringBuilder A0u = AnonymousClass000.A0u();
                                C36351kA.A1O("SELECT message_row_id FROM receipt_user WHERE receipt_user_jid_row_id =? AND message_row_id IN ", A0u, length);
                                Cursor A093 = r34.A09(A0u.toString(), "getDeliveredMessageIds", (String[]) A0I2.toArray(strArr));
                                try {
                                    int columnIndex2 = A093.getColumnIndex("message_row_id");
                                    while (A093.moveToNext()) {
                                        A162.add(String.valueOf(A093.getLong(columnIndex2)));
                                    }
                                    A093.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            A042.close();
                            DeviceJid primaryDevice2 = userJid2.getPrimaryDevice();
                            AnonymousClass1M0 A054 = r15.A05();
                            try {
                                B1k2 = A054.B1k();
                                ArrayList A0I3 = AnonymousClass001.A0I();
                                String valueOf2 = String.valueOf(r7.A07(primaryDevice2));
                                Iterator it4 = new AnonymousClass72Z((String[]) A162.toArray(strArr), 975).iterator();
                                while (it4.hasNext()) {
                                    String[] strArr3 = (String[]) it4.next();
                                    A0I3.clear();
                                    A0I3.add(valueOf2);
                                    A0I3.addAll(Arrays.asList(strArr3));
                                    C224114e r63 = A054.A02;
                                    StringBuilder A0u2 = AnonymousClass000.A0u();
                                    A0u2.append("receipt_device_jid_row_id = ? AND ");
                                    A0u2.append("message_row_id IN ");
                                    r63.A03("receipt_device", AnonymousClass000.A0q(AnonymousClass1M2.A00(strArr3.length), A0u2), "MessageReceiptDeviceStore/deleteMessageReceipts/DELETE_MESSAGE_RECEIPTS", (String[]) A0I3.toArray(strArr));
                                }
                                B1k2.A00();
                                A054.B5o(new C35701j7(r9, A162, 18));
                                B1k2.close();
                                A054.close();
                                if (!z) {
                                    this.A0J.A00(userJid2);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    A054.close();
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (A092 != null) {
                                A092.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        A042.close();
                        throw th;
                    }
                }
                this.A0G.A02(userJid2);
            }
            this.A0E.A04(Collections.singleton(deviceJid3));
            if (!z2) {
                C36321k7.A1K(deviceJid3, "IdentityChangeManager/onIdentityChangedOrDeleted/rotating sender key deviceJid=", AnonymousClass000.A0u());
                AnonymousClass17X r43 = this.A08;
                Set singleton = Collections.singleton(deviceJid3);
                C232317r r64 = r43.A07;
                HashSet A0G2 = r64.A0G(singleton);
                boolean A1P = AnonymousClass000.A1P(z ? 1 : 0);
                Iterator it5 = A0G2.iterator();
                boolean z3 = false;
                while (it5.hasNext()) {
                    AnonymousClass144 r52 = (AnonymousClass144) it5.next();
                    C36321k7.A1K(r52, "IdentityChangeManager/rotateSenderKey/ gid=", AnonymousClass000.A0u());
                    String rawString = r52.getRawString();
                    boolean A0B2 = r43.A0B(r52);
                    C19730wQ r02 = this.A00;
                    if (A0B2) {
                        deviceJid2 = r02.A07();
                    } else {
                        r02.A0G();
                        deviceJid2 = r02.A02;
                    }
                    C18740tg.A06(deviceJid2);
                    if (this.A06.A0A.A07(new AnonymousClass6EU(C133256Xm.A02(deviceJid2), rawString), false)) {
                        z3 = true;
                        AnonymousClass1DT r13 = this.A01;
                        int i = 3;
                        if (A1P) {
                            i = 2;
                        }
                        r13.A0K(r52, Integer.valueOf(i));
                    }
                }
                if (z3) {
                    AnonymousClass1M0 A055 = r43.A06.A05();
                    try {
                        C1495671s B1k3 = A055.B1k();
                        try {
                            C36321k7.A1K(A0G2, "participant-user-store/resetSentSenderKeyForAllParticipants/", AnonymousClass000.A0u());
                            AnonymousClass1M0 A056 = r64.A06.A05();
                            try {
                                B1k = A056.B1k();
                                Iterator it6 = A0G2.iterator();
                                while (it6.hasNext()) {
                                    AnonymousClass144 r14 = (AnonymousClass144) it6.next();
                                    r64.A07.A03(r14);
                                    AnonymousClass6X6 A094 = r64.A04.A09(r14);
                                    if (A094 != null) {
                                        C232317r.A06(A094);
                                    }
                                }
                                B1k.A00();
                                B1k.close();
                                A056.close();
                                B1k3.A00();
                                B1k3.close();
                                A055.close();
                            } catch (Throwable th7) {
                                A056.close();
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            B1k3.close();
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        A055.close();
                        throw th;
                    }
                }
            } else {
                AnonymousClass17X r16 = this.A08;
                AnonymousClass1M0 A057 = r16.A06.A05();
                try {
                    C1495671s B1k4 = A057.B1k();
                    try {
                        C232317r r72 = r16.A07;
                        C36321k7.A1K(userJid2, "participant-user-store/resetSentSenderKeyFor/", AnonymousClass000.A0u());
                        AnonymousClass1M0 A058 = r72.A06.A05();
                        try {
                            C1495671s B1k5 = A058.B1k();
                            try {
                                C232817w r35 = r72.A07;
                                UserJid userJid3 = userJid2;
                                C36321k7.A1K(userJid2, "participant-device-store/resetSentSenderKey/", AnonymousClass000.A0u());
                                C18740tg.A0E(C36421kH.A1a(userJid2.getRawString()), "participant-user-store/invalid-jid");
                                C219712j r17 = r35.A02;
                                if (r35.A01.A0M(userJid2)) {
                                    userJid3 = C223613z.A00;
                                }
                                long A072 = r17.A07(userJid3);
                                A052 = r35.A03.A05();
                                AnonymousClass6QI A0C3 = A052.A02.A0C("UPDATE group_participant_device SET sent_sender_key = ? WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE user_jid_row_id = ?)", "resetSentSenderKey/UPDATE_GROUP_PARTICIPANT_DEVICES_SENT_SENDER_KEY_FOR_USER_SQL");
                                String[] A1S = C36441kJ.A1S();
                                A1S[0] = "0";
                                C36351kA.A1V(A1S, 1, A072);
                                A0C3.A00.bindAllArgsAsStrings(A1S);
                                int i2 = 2;
                                do {
                                    i2--;
                                } while (i2 != 0);
                                A0C3.A01();
                                A052.close();
                                C232617u r23 = r72.A04;
                                Iterator it7 = new HashSet(r23.A07.keySet()).iterator();
                                while (it7.hasNext()) {
                                    AnonymousClass6X6 A095 = r23.A09((AnonymousClass144) it7.next());
                                    if (!(A095 == null || (A083 = A095.A08(userJid2)) == null)) {
                                        C232317r.A05(A083);
                                    }
                                }
                                B1k5.A00();
                                B1k5.close();
                                A058.close();
                                B1k4.A00();
                                B1k4.close();
                                A057.close();
                            } catch (Throwable th10) {
                                B1k5.close();
                                throw th10;
                            }
                        } catch (Throwable th11) {
                            A058.close();
                            throw th11;
                        }
                    } catch (Throwable th12) {
                        B1k4.close();
                        throw th12;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    A057.close();
                    throw th;
                }
            }
            if (z2) {
                AnonymousClass1P5 r53 = this.A0I;
                C36321k7.A1K(userJid2, "LocationSharingManager/onUserIdentityChange; jid=", AnonymousClass000.A0u());
                ArrayList A0I4 = AnonymousClass001.A0I();
                synchronized (r53.A0R) {
                    Map A062 = AnonymousClass1P5.A06(r53);
                    Iterator A0y = AnonymousClass000.A0y(A062);
                    while (A0y.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A0y);
                        AnonymousClass11F r44 = (AnonymousClass11F) A11.getKey();
                        List list = ((AnonymousClass38X) A11.getValue()).A03;
                        if (list.contains(userJid2)) {
                            list.remove(userJid2);
                            AnonymousClass1P9.A01(r44, r53.A0K, Collections.singletonList(userJid2), true);
                            if (list.isEmpty()) {
                                AnonymousClass38X r03 = (AnonymousClass38X) A062.remove(r44);
                                C18740tg.A06(r03);
                                C46902br A032 = AnonymousClass1P5.A03(r53, r03.A02);
                                if (A032 != null) {
                                    AnonymousClass1P5.A0E(r53, A032);
                                }
                            }
                            A0I4.add(r44);
                        }
                    }
                    AnonymousClass1P5.A0A(r53);
                }
                if (!A0I4.isEmpty()) {
                    AnonymousClass1P5.A0C(r53);
                    Iterator it8 = A0I4.iterator();
                    while (it8.hasNext()) {
                        r53.A06.post(new C35721j9(r53, it8.next(), 32));
                    }
                }
                if (!this.A0H.A0E(5001) && (A082 = this.A0D.A08(userJid2)) != null && (r4 = A082.A0E) != null) {
                    C36321k7.A1K(userJid2, "IdentityChangeManager/onIdentityChangedOrDeleted/attempting to confirm vname cert; jid=", AnonymousClass000.A0u());
                    AnonymousClass185 r36 = this.A02;
                    byte[] A073 = r36.A07(userJid2);
                    if (A073 != null) {
                        if (r36.A06(userJid2, r4.A00(), A073, r4.A03)) {
                            this.A07.A0c(userJid2, AnonymousClass3TT.A00(r4).A02());
                            return;
                        }
                    }
                    C36321k7.A1K(userJid2, "IdentityChangeManager/onIdentityChangedOrDeleted/refreshing verified name due to identity change; jid=", AnonymousClass000.A0u());
                    r36.A07.remove(userJid2);
                    r36.A03(userJid2);
                    this.A0C.A01(new GetVNameCertificateJob(userJid2));
                    return;
                }
                return;
            }
            return;
            throw th;
            throw th;
            throw th;
        } catch (Throwable th14) {
            r3.A01();
            throw th14;
        }
    }

    public void BZ0(DeviceJid deviceJid) {
        AnonymousClass3L0 r6;
        AnonymousClass3TT A002;
        UserJid userJid = deviceJid.userJid;
        AnonymousClass141 A082 = this.A0D.A08(userJid);
        if (!(A082 == null || (r6 = A082.A0E) == null)) {
            C36321k7.A1K(userJid, "IdentityChangeManager/confirming unconfirmed vname cert; jid=", AnonymousClass000.A0u());
            AnonymousClass185 r5 = this.A02;
            AnonymousClass3L0 A0N = r5.A01.A0N(userJid);
            if (A0N != null) {
                A002 = new AnonymousClass3TT();
                A002.A03 = A0N.A03;
                A002.A07 = A0N.A08;
                A002.A05 = A0N.A00();
                A002.A02 = AnonymousClass3U1.A00(A0N);
                A002.A01 = r6.A03;
                A002.A06 = r6.A08;
                A002.A04 = r6.A00();
                A002.A00 = AnonymousClass3U1.A00(r6);
            } else {
                A002 = AnonymousClass3TT.A00(r6);
            }
            AnonymousClass3H2 A022 = A002.A02();
            byte[] A072 = r5.A07(userJid);
            if (A072 != null && !r6.equals(A0N)) {
                r5.A06(userJid, r6.A00(), A072, r6.A03);
            }
            this.A07.A0c(userJid, A022);
        }
        if (deviceJid.getDevice() == 0) {
            this.A0G.A02(userJid);
        }
    }

    public C68753cP(C19730wQ r2, AnonymousClass1DT r3, AnonymousClass164 r4, AnonymousClass16D r5, AnonymousClass185 r6, AnonymousClass1A6 r7, C19970wo r8, C19420v0 r9, AnonymousClass189 r10, C20310xM r11, AnonymousClass17X r12, AnonymousClass1FN r13, AnonymousClass1QO r14, AnonymousClass3OB r15, AnonymousClass1FL r16, C231417i r17, C20810yC r18, AnonymousClass1P5 r19, C30911ay r20, C238019x r21) {
        this.A04 = r8;
        this.A0H = r18;
        this.A00 = r2;
        this.A0C = r4;
        this.A0D = r5;
        this.A01 = r3;
        this.A0F = r14;
        this.A07 = r11;
        this.A0A = r17;
        this.A06 = r10;
        this.A09 = r15;
        this.A02 = r6;
        this.A05 = r9;
        this.A03 = r7;
        this.A0E = r13;
        this.A0B = r21;
        this.A0I = r19;
        this.A0J = r20;
        this.A08 = r12;
        this.A0G = r16;
    }
}
