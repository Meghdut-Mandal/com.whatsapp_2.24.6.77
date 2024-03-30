package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3rz  reason: invalid class name and case insensitive filesystem */
public final class C78363rz implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;

    public void B7J(AnonymousClass3T1 r15) {
        Cursor A09;
        AnonymousClass00C.A0D(r15, 0);
        AnonymousClass1F8 r11 = (AnonymousClass1F8) this.A02.get();
        AnonymousClass2bQ r152 = (AnonymousClass2bQ) r15;
        String[] A1R = C36441kJ.A1R();
        C36401kF.A1T(A1R, 0, r152.A1N);
        AnonymousClass1M0 A04 = r11.A01.get();
        try {
            A09 = A04.A02.A09("SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration , expired , group_type FROM message_group_invite WHERE message_row_id = ?", "GET_GROUP_INVITE_MESSAGE_BY_ROW_ID_SQL", A1R);
            if (A09.moveToNext()) {
                long A07 = C36351kA.A07(A09, "expiration");
                long A072 = C36351kA.A07(A09, "group_jid_row_id");
                long A073 = C36351kA.A07(A09, "admin_jid_row_id");
                String A0f = C36341k9.A0f(A09, "group_name");
                String A0f2 = C36341k9.A0f(A09, "invite_code");
                int A03 = C36351kA.A03(A09, "expired");
                int A032 = C36351kA.A03(A09, "group_type");
                C219712j r12 = r11.A00;
                AnonymousClass147 r112 = (AnonymousClass147) r12.A0C(AnonymousClass147.class, A072);
                UserJid userJid = (UserJid) r12.A0C(UserJid.class, A073);
                if (r112 == null || userJid == null) {
                    Log.e("GroupInviteMessageStore/fillGroupInviteInfo/could not fill group invite data as groupJid and/or adminJid are null");
                } else {
                    boolean A1P = AnonymousClass000.A1P(A03);
                    r152.A02 = r112;
                    r152.A03 = userJid;
                    r152.A05 = A0f;
                    r152.A06 = A0f2;
                    r152.A01 = A07;
                    r152.A07 = A1P;
                    r152.A00 = A032;
                }
            }
            A09.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void BKi(AnonymousClass3T1 r6) {
        long A022;
        AnonymousClass2bQ r2;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass2bQ r62 = (AnonymousClass2bQ) r6;
        if (!r62.A07) {
            C64933Qa r4 = r62.A1J;
            boolean z = r4.A02;
            AnonymousClass1F8 r22 = (AnonymousClass1F8) this.A02.get();
            AnonymousClass147 r1 = r62.A02;
            if (!z) {
                A022 = r22.A01(r1, r62.A03);
            } else {
                C222813r r0 = UserJid.Companion;
                A022 = r22.A02(r1, C222813r.A00(r4.A00));
            }
            if (!(A022 == -1 || (r2 = (AnonymousClass2bQ) C36421kH.A0R((AnonymousClass1A1) this.A01.get(), A022)) == null)) {
                r2.A07 = true;
                ((C20310xM) this.A00.get()).A0n(r2, 21);
            }
        }
        ((AnonymousClass1F8) this.A02.get()).A03(r62);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((AnonymousClass1F8) this.A02.get()).A03((AnonymousClass2bQ) r2);
    }

    public C78363rz(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3) {
        C36321k7.A11(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
