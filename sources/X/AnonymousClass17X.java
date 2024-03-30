package X;

import android.content.ContentValues;
import android.os.ConditionVariable;
import android.os.Parcelable;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.17X  reason: invalid class name */
public class AnonymousClass17X {
    public final C19700wN A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final AnonymousClass16D A03;
    public final C220412q A04;
    public final C232617u A05;
    public final AnonymousClass12P A06;
    public final C232317r A07;
    public final C233017y A08;
    public final AnonymousClass12O A09;
    public final C231417i A0A;
    public final C20810yC A0B;
    public final C230717b A0C;
    public final C233117z A0D;
    public final AnonymousClass182 A0E;
    public final AnonymousClass180 A0F;
    public final C230917d A0G;
    public final C231017e A0H;
    public final C19770wU A0I;

    private void A00(AnonymousClass144 r5, List list) {
        AnonymousClass3QK A002;
        Parcelable.Creator creator = AnonymousClass147.CREATOR;
        AnonymousClass147 A032 = C65533Sl.A03(r5);
        if (A032 != null) {
            C230917d r2 = this.A0G;
            r2.A03();
            AnonymousClass147 r1 = (AnonymousClass147) r2.A02.get(A032);
            if (r1 != null && (A002 = r2.A00(r1)) != null && A032.equals(A002.A02)) {
                this.A0F.A01(r1, list);
            }
        }
    }

    public int A01(AnonymousClass147 r5) {
        int A052 = this.A04.A05(r5);
        C20810yC r2 = this.A0B;
        int i = 1304;
        if (A052 == 3) {
            i = 2774;
        }
        return C20800yB.A00(C21000yV.A02, r2, i);
    }

    public C001700s A02(AnonymousClass11F r6, GroupJid groupJid) {
        String str;
        C19960wn r0;
        AnonymousClass11F BQG = this.A0H.BQG(r6);
        C001700s r3 = new C001700s();
        if (groupJid == null) {
            str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat groupJid null";
        } else if (!(BQG instanceof C223313w)) {
            str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat chatJid not LID";
        } else {
            if (C20800yB.A01(C21000yV.A02, this.A0B, 3876)) {
                str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat force create LID chat";
            } else if (!A0B(groupJid)) {
                str = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat chatJid not a LID group";
            } else {
                this.A01.A05(0, R.string.f12nameremoved);
                this.A0I.Bp1(new C35631j0(this, BQG, r3, 13));
                return r3;
            }
        }
        Log.i(str);
        if (BQG == null) {
            r0 = C19960wn.A01;
        } else {
            r0 = new C19960wn(BQG);
        }
        r3.A0D(r0);
        return r3;
    }

    public AnonymousClass6PM A03(AnonymousClass144 r2, UserJid userJid) {
        return this.A07.A0C(r2).A08(userJid);
    }

    public String A04(AnonymousClass144 r2, boolean z) {
        AnonymousClass6X6 A0C2 = this.A07.A0C(r2);
        if (z) {
            return A0C2.A0C();
        }
        return A0C2.A0E();
    }

    public HashSet A05(AnonymousClass11F r3) {
        if (!(r3 instanceof AnonymousClass144)) {
            return new HashSet();
        }
        AnonymousClass6X6 A0C2 = this.A07.A0C((AnonymousClass144) r3);
        if (A0C2.A00 != 0) {
            return A0C2.A0G();
        }
        return A0C2.A0H();
    }

    public void A06(AnonymousClass6X6 r5) {
        C1495671s B1k;
        AnonymousClass1M0 A052 = this.A06.A05();
        try {
            B1k = A052.B1k();
            this.A07.A0I(r5);
            B1k.A00();
            B1k.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A07(AnonymousClass6X6 r24) {
        C1495671s B1k;
        C20760y7 r0;
        AnonymousClass1M0 A052 = this.A06.A05();
        try {
            C1495671s B1k2 = A052.B1k();
            try {
                C232317r r7 = this.A07;
                AnonymousClass6X6 r9 = r24;
                boolean z = false;
                if (r9.A00 != 0) {
                    z = true;
                }
                C219712j r02 = r7.A05;
                AnonymousClass144 r5 = r9.A05;
                long A072 = r02.A07(r5);
                AnonymousClass1M0 A053 = r7.A06.A05();
                try {
                    B1k = A053.B1k();
                    C224114e r3 = A053.A02;
                    r3.A03("group_participant_user", "group_jid_row_id=?", "saveGroupParticipants/DELETE_GROUP_PARTICIPANT_USER", new String[]{String.valueOf(A072)});
                    if (z) {
                        r0 = C20760y7.copyOf(r9.A07.values());
                    } else {
                        r0 = r9.A07();
                    }
                    C225614x it = r0.iterator();
                    while (it.hasNext()) {
                        AnonymousClass6PM r92 = (AnonymousClass6PM) it.next();
                        UserJid userJid = r92.A03;
                        long A002 = C232317r.A00(r7, userJid);
                        ContentValues contentValues = new ContentValues(4);
                        contentValues.put("group_jid_row_id", Long.valueOf(A072));
                        contentValues.put("user_jid_row_id", Long.valueOf(A002));
                        contentValues.put("rank", Integer.valueOf(r92.A01));
                        int i = 0;
                        if (r92.A02) {
                            i = 1;
                        }
                        contentValues.put("pending", Integer.valueOf(i));
                        r3.A04("group_participant_user", "saveGroupParticipants/INSERT_GROUP_PARTICIPANT_USER", contentValues);
                        r7.A07.A01(C20760y7.copyOf(r92.A04.values()), r5, userJid, A002);
                    }
                    B1k.A00();
                    B1k.close();
                    A053.close();
                    B1k2.A00();
                    B1k2.close();
                    A052.close();
                    return;
                } catch (Throwable th) {
                    A053.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                B1k2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A052.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public void A08(AnonymousClass144 r6, Collection collection) {
        C1495671s B1k;
        AnonymousClass1M0 A052 = this.A06.A05();
        try {
            B1k = A052.B1k();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.A07.A0N(r6, (UserJid) it.next());
            }
            B1k.A00();
            B1k.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A09(AnonymousClass144 r8, List list) {
        C1495671s B1k;
        AnonymousClass1M0 A052 = this.A06.A05();
        try {
            C1495671s B1k2 = A052.B1k();
            try {
                C232317r r4 = this.A07;
                StringBuilder sb = new StringBuilder();
                sb.append("participant-user-store/updateGroupParticipants/");
                sb.append(r8);
                sb.append(" ");
                sb.append(list);
                Log.i(sb.toString());
                AnonymousClass1M0 A053 = r4.A06.A05();
                try {
                    B1k = A053.B1k();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r4.A0H((AnonymousClass6PM) it.next(), r8);
                    }
                    B1k.A00();
                    B1k.close();
                    A053.close();
                    B1k2.A00();
                    B1k2.close();
                    A052.close();
                    return;
                } catch (Throwable th) {
                    A053.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                B1k2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A052.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:169:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.AnonymousClass2bI r19) {
        /*
            r18 = this;
            r6 = r19
            X.3Qa r1 = r6.A1J
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x02fa
            X.11F r1 = r1.A00
            boolean r0 = r1 instanceof X.AnonymousClass144
            if (r0 == 0) goto L_0x02fa
            X.13q r0 = X.AnonymousClass11F.A00
            X.144 r4 = X.AnonymousClass6H4.A00(r1)
            X.C18740tg.A06(r4)
            r3 = r18
            X.12P r0 = r3.A06
            X.1M0 r11 = r0.A05()
            X.71s r10 = r11.B1k()     // Catch:{ all -> 0x02f0 }
            boolean r0 = r6 instanceof X.C181758nz     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x002f
            r0 = r6
            X.8nz r0 = (X.C181758nz) r0     // Catch:{ all -> 0x02e6 }
            java.util.List r7 = r0.A01     // Catch:{ all -> 0x02e6 }
        L_0x002c:
            int r2 = r6.A00     // Catch:{ all -> 0x02e6 }
            goto L_0x0031
        L_0x002f:
            r7 = 0
            goto L_0x002c
        L_0x0031:
            r0 = 2
            if (r2 == r0) goto L_0x0295
            r0 = 3
            if (r2 == r0) goto L_0x0295
            r0 = 4
            if (r2 == r0) goto L_0x0262
            r0 = 5
            if (r2 == r0) goto L_0x0226
            r0 = 7
            if (r2 == r0) goto L_0x0226
            r0 = 20
            if (r2 == r0) goto L_0x01bc
            r0 = 52
            if (r2 == r0) goto L_0x01bc
            r0 = 79
            if (r2 == r0) goto L_0x01bc
            r0 = 90
            if (r2 == r0) goto L_0x01bc
            r0 = 106(0x6a, float:1.49E-43)
            if (r2 == r0) goto L_0x01bc
            r0 = 144(0x90, float:2.02E-43)
            if (r2 == r0) goto L_0x01bc
            r0 = 149(0x95, float:2.09E-43)
            if (r2 == r0) goto L_0x01bc
            r0 = 9
            if (r2 == r0) goto L_0x018c
            r0 = 10
            if (r2 == r0) goto L_0x0153
            r0 = 93
            if (r2 == r0) goto L_0x01bc
            r0 = 94
            if (r2 == r0) goto L_0x01bc
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L_0x01bc
            r0 = 124(0x7c, float:1.74E-43)
            if (r2 == r0) goto L_0x01bc
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L_0x01bc
            r0 = 127(0x7f, float:1.78E-43)
            if (r2 == r0) goto L_0x01bc
            switch(r2) {
                case 12: goto L_0x01bc;
                case 13: goto L_0x00ed;
                case 14: goto L_0x00ed;
                case 15: goto L_0x0295;
                case 16: goto L_0x0295;
                case 17: goto L_0x0081;
                default: goto L_0x007f;
            }     // Catch:{ all -> 0x02e6 }
        L_0x007f:
            goto L_0x02a1
        L_0x0081:
            X.17r r6 = r3.A07     // Catch:{ all -> 0x02e6 }
            X.12j r0 = r6.A05     // Catch:{ all -> 0x02e6 }
            long r0 = r0.A07(r4)     // Catch:{ all -> 0x02e6 }
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02e6 }
            r0 = 3
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x02e6 }
            r13.<init>(r0)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "group_jid_row_id"
            r13.put(r0, r7)     // Catch:{ all -> 0x02e6 }
            r9 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "rank"
            r13.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            java.lang.String r0 = "pending"
            r13.put(r0, r1)     // Catch:{ all -> 0x02e6 }
            X.12P r0 = r6.A06     // Catch:{ all -> 0x02e6 }
            X.1M0 r5 = r0.A05()     // Catch:{ all -> 0x02e6 }
            X.71s r8 = r5.B1k()     // Catch:{ all -> 0x021c }
            X.0wQ r1 = r6.A01     // Catch:{ all -> 0x00e7 }
            X.13w r0 = r1.A08()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00c0
            X.13w r0 = r1.A08()     // Catch:{ all -> 0x00e7 }
            r6.A0N(r4, r0)     // Catch:{ all -> 0x00e7 }
        L_0x00c0:
            r1.A0G()     // Catch:{ all -> 0x00e7 }
            com.whatsapp.jid.PhoneUserJid r0 = r1.A03     // Catch:{ all -> 0x00e7 }
            r6.A0N(r4, r0)     // Catch:{ all -> 0x00e7 }
            X.14e r12 = r5.A02     // Catch:{ all -> 0x00e7 }
            java.lang.String r14 = "group_participant_user"
            java.lang.String r15 = "group_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00e7 }
            r0[r9] = r7     // Catch:{ all -> 0x00e7 }
            java.lang.String r16 = "onGroupEnded/UPDATE_GROUP_PARTICIPANT_USER"
            r17 = r0
            r12.A01(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00e7 }
            X.17w r0 = r6.A07     // Catch:{ all -> 0x00e7 }
            r0.A03(r4)     // Catch:{ all -> 0x00e7 }
            r8.A00()     // Catch:{ all -> 0x00e7 }
            r8.close()     // Catch:{ all -> 0x021c }
            goto L_0x0181
        L_0x00e7:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0217 }
            goto L_0x021b
        L_0x00ed:
            X.17r r1 = r3.A07     // Catch:{ all -> 0x02e6 }
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x02e6 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02e6 }
            r0.<init>(r7)     // Catch:{ all -> 0x02e6 }
            r1.A0K(r4, r0)     // Catch:{ all -> 0x02e6 }
            r3.A00(r4, r7)     // Catch:{ all -> 0x02e6 }
            X.17y r12 = r3.A08     // Catch:{ all -> 0x02e6 }
            X.0yC r5 = r12.A02     // Catch:{ all -> 0x02e6 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x02e6 }
            boolean r0 = X.C20800yB.A01(r0, r5, r1)     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x02a1
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x02e6 }
            java.util.Set r0 = X.C56672wh.A01     // Catch:{ all -> 0x02e6 }
            r0 = 13
            r17 = 0
            if (r2 != r0) goto L_0x0118
            r17 = 1
        L_0x0118:
            long r0 = r6.A0I     // Catch:{ all -> 0x02e6 }
            X.12P r5 = r12.A01     // Catch:{ all -> 0x02e6 }
            X.1M0 r9 = r5.A05()     // Catch:{ all -> 0x02e6 }
            X.71s r8 = r9.B1k()     // Catch:{ all -> 0x014d }
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x0143 }
        L_0x0128:
            boolean r5 = r6.hasNext()     // Catch:{ all -> 0x0143 }
            if (r5 == 0) goto L_0x013b
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0143 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x0143 }
            r13 = r4
            r14 = r5
            r15 = r0
            r12.A04(r13, r14, r15, r17)     // Catch:{ all -> 0x0143 }
            goto L_0x0128
        L_0x013b:
            r8.A00()     // Catch:{ all -> 0x0143 }
            r8.close()     // Catch:{ all -> 0x014d }
            goto L_0x029e
        L_0x0143:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0148 }
            goto L_0x014c
        L_0x0148:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x014d }
        L_0x014c:
            throw r1     // Catch:{ all -> 0x014d }
        L_0x014d:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0221 }
            goto L_0x0225
        L_0x0153:
            X.8nA r6 = (X.C181248nA) r6     // Catch:{ all -> 0x02e6 }
            X.17r r7 = r3.A07     // Catch:{ all -> 0x02e6 }
            com.whatsapp.jid.UserJid r1 = r6.A00     // Catch:{ all -> 0x02e6 }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x02e6 }
            com.whatsapp.jid.UserJid r6 = r6.A01     // Catch:{ all -> 0x02e6 }
            X.C18740tg.A06(r6)     // Catch:{ all -> 0x02e6 }
            X.6X6 r0 = r7.A0C(r4)     // Catch:{ all -> 0x02e6 }
            X.6PM r1 = r0.A08(r1)     // Catch:{ all -> 0x02e6 }
            X.12P r0 = r7.A06     // Catch:{ all -> 0x02e6 }
            X.1M0 r5 = r0.A05()     // Catch:{ all -> 0x02e6 }
            X.71s r0 = r5.B1k()     // Catch:{ all -> 0x021c }
            r7.A0N(r4, r6)     // Catch:{ all -> 0x0186 }
            if (r1 == 0) goto L_0x017b
            r7.A0H(r1, r4)     // Catch:{ all -> 0x0186 }
        L_0x017b:
            r0.A00()     // Catch:{ all -> 0x0186 }
            r0.close()     // Catch:{ all -> 0x021c }
        L_0x0181:
            r5.close()     // Catch:{ all -> 0x02e6 }
            goto L_0x02a1
        L_0x0186:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0217 }
            goto L_0x021b
        L_0x018c:
            boolean r0 = r3.A0B(r4)     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x01b1
            X.0wQ r0 = r3.A02     // Catch:{ all -> 0x02e6 }
            X.13w r5 = r0.A09()     // Catch:{ all -> 0x02e6 }
        L_0x0198:
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x02e6 }
            r1 = r7
            boolean r0 = r7.contains(r5)     // Catch:{ all -> 0x02e6 }
            if (r0 != 0) goto L_0x01aa
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x02e6 }
            r1.<init>(r7)     // Catch:{ all -> 0x02e6 }
            r1.add(r5)     // Catch:{ all -> 0x02e6 }
        L_0x01aa:
            X.17r r0 = r3.A07     // Catch:{ all -> 0x02e6 }
            r0.A0J(r4, r1)     // Catch:{ all -> 0x02e6 }
            goto L_0x02a1
        L_0x01b1:
            X.0wQ r0 = r3.A02     // Catch:{ all -> 0x02e6 }
            r0.A0G()     // Catch:{ all -> 0x02e6 }
            com.whatsapp.jid.PhoneUserJid r5 = r0.A03     // Catch:{ all -> 0x02e6 }
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x02e6 }
            goto L_0x0198
        L_0x01bc:
            X.17r r0 = r3.A07     // Catch:{ all -> 0x02e6 }
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x02e6 }
            r0.A0J(r4, r7)     // Catch:{ all -> 0x02e6 }
            X.17y r8 = r3.A08     // Catch:{ all -> 0x02e6 }
            X.0yC r5 = r8.A02     // Catch:{ all -> 0x02e6 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x02e6 }
            boolean r0 = X.C20800yB.A01(r0, r5, r1)     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x02a1
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x02e6 }
            X.12P r0 = r8.A01     // Catch:{ all -> 0x02e6 }
            X.1M0 r5 = r0.A05()     // Catch:{ all -> 0x02e6 }
            X.71s r6 = r5.B1k()     // Catch:{ all -> 0x021c }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0212 }
        L_0x01e3:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0212 }
            if (r0 == 0) goto L_0x01f3
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0212 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0212 }
            r8.A03(r4, r0)     // Catch:{ all -> 0x0212 }
            goto L_0x01e3
        L_0x01f3:
            r6.A00()     // Catch:{ all -> 0x0212 }
            r6.close()     // Catch:{ all -> 0x021c }
            r5.close()     // Catch:{ all -> 0x02e6 }
            X.0wQ r5 = r3.A02     // Catch:{ all -> 0x02e6 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x02e6 }
            r1 = 0
            X.3Tw r0 = new X.3Tw     // Catch:{ all -> 0x02e6 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x02e6 }
            boolean r0 = X.AnonymousClass6XG.A02(r0, r7)     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x02a1
            r8.A02(r4)     // Catch:{ all -> 0x02e6 }
            goto L_0x02a1
        L_0x0212:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0217 }
            goto L_0x021b
        L_0x0217:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x021c }
        L_0x021b:
            throw r1     // Catch:{ all -> 0x021c }
        L_0x021c:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0221 }
            goto L_0x0225
        L_0x0221:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02e6 }
        L_0x0225:
            throw r1     // Catch:{ all -> 0x02e6 }
        L_0x0226:
            X.11F r1 = r6.A0J()     // Catch:{ all -> 0x02e6 }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x02e6 }
            com.whatsapp.jid.UserJid r14 = X.C222813r.A00(r1)     // Catch:{ all -> 0x02e6 }
            X.C18740tg.A06(r14)     // Catch:{ all -> 0x02e6 }
            X.17r r1 = r3.A07     // Catch:{ all -> 0x02e6 }
            java.util.List r0 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x02e6 }
            r1.A0K(r4, r0)     // Catch:{ all -> 0x02e6 }
            java.util.List r0 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x02e6 }
            r3.A00(r4, r0)     // Catch:{ all -> 0x02e6 }
            X.17y r12 = r3.A08     // Catch:{ all -> 0x02e6 }
            X.0yC r5 = r12.A02     // Catch:{ all -> 0x02e6 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x02e6 }
            boolean r0 = X.C20800yB.A01(r0, r5, r1)     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x02a1
            java.util.Set r0 = X.C56672wh.A01     // Catch:{ all -> 0x02e6 }
            r0 = 5
            r17 = 1
            if (r2 == r0) goto L_0x025a
            r17 = 0
        L_0x025a:
            long r0 = r6.A0I     // Catch:{ all -> 0x02e6 }
            r13 = r4
            r15 = r0
            r12.A04(r13, r14, r15, r17)     // Catch:{ all -> 0x02e6 }
            goto L_0x02a1
        L_0x0262:
            X.11F r1 = r6.A0J()     // Catch:{ all -> 0x02e6 }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x02e6 }
            com.whatsapp.jid.UserJid r7 = X.C222813r.A00(r1)     // Catch:{ all -> 0x02e6 }
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x02e6 }
            X.17r r1 = r3.A07     // Catch:{ all -> 0x02e6 }
            java.util.List r0 = java.util.Collections.singletonList(r7)     // Catch:{ all -> 0x02e6 }
            r1.A0J(r4, r0)     // Catch:{ all -> 0x02e6 }
            X.17y r6 = r3.A08     // Catch:{ all -> 0x02e6 }
            X.0yC r5 = r6.A02     // Catch:{ all -> 0x02e6 }
            r1 = 1613(0x64d, float:2.26E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x02e6 }
            boolean r0 = X.C20800yB.A01(r0, r5, r1)     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x02a1
            r6.A03(r4, r7)     // Catch:{ all -> 0x02e6 }
            X.0wQ r0 = r3.A02     // Catch:{ all -> 0x02e6 }
            boolean r0 = r0.A0M(r7)     // Catch:{ all -> 0x02e6 }
            if (r0 == 0) goto L_0x02a1
            r6.A02(r4)     // Catch:{ all -> 0x02e6 }
            goto L_0x02a1
        L_0x0295:
            X.17r r0 = r3.A07     // Catch:{ all -> 0x02e6 }
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x02e6 }
            r0.A0J(r4, r7)     // Catch:{ all -> 0x02e6 }
            goto L_0x02a1
        L_0x029e:
            r9.close()     // Catch:{ all -> 0x02e6 }
        L_0x02a1:
            r10.A00()     // Catch:{ all -> 0x02e6 }
            r10.close()     // Catch:{ all -> 0x02f0 }
            r11.close()
            boolean r0 = r4 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x02fa
            java.util.Set r0 = X.C56672wh.A01
            r0 = 4
            if (r2 == r0) goto L_0x02d9
            r0 = 12
            if (r2 == r0) goto L_0x02d9
            r0 = 52
            if (r2 == r0) goto L_0x02d9
            r0 = 20
            if (r2 == r0) goto L_0x02d9
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L_0x02d9
            r0 = 7
            if (r2 == r0) goto L_0x02d9
            r0 = 14
            if (r2 == r0) goto L_0x02d9
            r0 = 5
            if (r2 == r0) goto L_0x02d9
            r0 = 13
            if (r2 == r0) goto L_0x02d9
            r0 = 93
            if (r2 == r0) goto L_0x02d9
            r0 = 94
            if (r2 != r0) goto L_0x02fa
        L_0x02d9:
            X.17Y r2 = r3.A01
            r1 = 13
            X.1j7 r0 = new X.1j7
            r0.<init>(r3, r4, r1)
            r2.A0H(r0)
            return
        L_0x02e6:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x02eb }
            goto L_0x02ef
        L_0x02eb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02f0 }
        L_0x02ef:
            throw r1     // Catch:{ all -> 0x02f0 }
        L_0x02f0:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x02f5 }
            throw r1
        L_0x02f5:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x02fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17X.A0A(X.2bI):void");
    }

    public boolean A0B(AnonymousClass11F r4) {
        if (r4 instanceof AnonymousClass144) {
            if (3 != this.A07.A0C((AnonymousClass144) r4).A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0C(GroupJid groupJid) {
        return this.A07.A0C(groupJid).A0O(this.A02);
    }

    public boolean A0D(GroupJid groupJid) {
        return this.A07.A0C(groupJid).A0P(this.A02);
    }

    @Deprecated
    public boolean A0E(GroupJid groupJid, UserJid userJid) {
        AnonymousClass6X6 A0C2 = this.A07.A0C(groupJid);
        if (A0C2.A0Q(userJid)) {
            return true;
        }
        if (!(userJid instanceof PhoneUserJid) || A0C2.A00 == 0) {
            return false;
        }
        return A0C2.A0Q(this.A09.A09((PhoneUserJid) userJid));
    }

    public boolean A0F(AnonymousClass144 r4) {
        C225614x it = this.A07.A0C(r4).A07().iterator();
        while (it.hasNext()) {
            AnonymousClass141 A082 = this.A03.A08(((AnonymousClass6PM) it.next()).A03);
            if (A082 != null && A082.A0C()) {
                return true;
            }
        }
        return false;
    }

    public boolean A0G(AnonymousClass144 r4, UserJid userJid) {
        UserJid A0B2;
        AnonymousClass6X6 A0C2 = this.A07.A0C(r4);
        boolean z = false;
        if (A0C2.A08(userJid) != null) {
            z = true;
        }
        if (z || ((A0B2 = this.A09.A0B(userJid)) != null && A0C2.A08(A0B2) != null)) {
            return true;
        }
        return false;
    }

    public boolean A0H(AnonymousClass147 r4) {
        AnonymousClass141 A082;
        Iterator it = this.A07.A0C(r4).A0F().iterator();
        while (it.hasNext()) {
            C19730wQ r0 = this.A02;
            UserJid userJid = ((AnonymousClass6PM) it.next()).A03;
            if (!r0.A0M(userJid) && (A082 = this.A03.A08(userJid)) != null && A082.A0F != null) {
                return true;
            }
        }
        return false;
    }

    public boolean A0I(AnonymousClass147 r5) {
        AnonymousClass6PM r0;
        AnonymousClass6X6 A0C2 = this.A07.A0C(r5);
        C19730wQ r02 = this.A02;
        r02.A0G();
        PhoneUserJid phoneUserJid = r02.A03;
        if (phoneUserJid == null || (r0 = (AnonymousClass6PM) A0C2.A08.get(phoneUserJid)) == null || r0.A01 != 2) {
            return false;
        }
        return true;
    }

    public AnonymousClass17X(C19700wN r2, AnonymousClass17Y r3, C19730wQ r4, AnonymousClass16D r5, C220412q r6, AnonymousClass182 r7, C232617u r8, AnonymousClass12P r9, AnonymousClass180 r10, C232317r r11, C233017y r12, AnonymousClass12O r13, C231417i r14, C20810yC r15, C230717b r16, C233117z r17, C230917d r18, C231017e r19, C19770wU r20) {
        this.A0B = r15;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A0I = r20;
        this.A04 = r6;
        this.A0C = r16;
        this.A0G = r18;
        this.A03 = r5;
        this.A09 = r13;
        this.A0H = r19;
        this.A0A = r14;
        this.A06 = r9;
        this.A07 = r11;
        this.A05 = r8;
        this.A08 = r12;
        this.A0D = r17;
        this.A0F = r10;
        this.A0E = r7;
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    public boolean A0J(AnonymousClass147 r3, UserJid userJid) {
        AnonymousClass6PM A032 = A03(r3, userJid);
        if (A032 == null || A032.A01 == 0) {
            return false;
        }
        return true;
    }
}
