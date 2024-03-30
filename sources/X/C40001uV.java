package X;

import com.whatsapp.R;
import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$executeIfInputIsValid$1;
import com.whatsapp.jid.GroupJid;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1uV  reason: invalid class name and case insensitive filesystem */
public final class C40001uV extends AnonymousClass04R {
    public C65513Sj A00;
    public AnonymousClass191 A01;
    public AtomicBoolean A02 = new AtomicBoolean(false);
    public final C58202zU A03;
    public final C19730wQ A04;
    public final AnonymousClass1X4 A05;
    public final AnonymousClass16D A06;
    public final C21060yb A07;
    public final AnonymousClass16J A08;
    public final C233117z A09;
    public final AnonymousClass4WB A0A = new AnonymousClass4WB(this, 15);
    public final AnonymousClass11F A0B;
    public final AnonymousClass1XS A0C;
    public final C19890wg A0D;
    public final C64933Qa A0E;
    public final AnonymousClass1A1 A0F;
    public final C005502l A0G;
    public final C005502l A0H;
    public final C18010sR A0I;
    public final C18010sR A0J;
    public final C18010sR A0K;
    public final C18010sR A0L;
    public final AnonymousClass05H A0M;
    public final AnonymousClass05H A0N;
    public final AnonymousClass05H A0O;
    public final AnonymousClass05H A0P;
    public final AnonymousClass05L A0Q;
    public final AnonymousClass05K A0R;
    public final MessageCommentsManager A0S;
    public final AnonymousClass17X A0T;
    public final C20810yC A0U;
    public final C20350xQ A0V;
    public final AnonymousClass1EL A0W;

    public C40001uV(C58202zU r20, C19730wQ r21, AnonymousClass1X4 r22, MessageCommentsManager messageCommentsManager, AnonymousClass16D r24, C21060yb r25, AnonymousClass17X r26, AnonymousClass16J r27, C20810yC r28, C20350xQ r29, C233117z r30, AnonymousClass1EL r31, AnonymousClass11F r32, AnonymousClass1XS r33, C19890wg r34, C64933Qa r35, AnonymousClass1A1 r36, C005502l r37, C005502l r38) {
        C20810yC r0 = r28;
        AnonymousClass00C.A0D(r0, 1);
        AnonymousClass1XS r7 = r33;
        AnonymousClass16D r15 = r24;
        C21060yb r14 = r25;
        C19730wQ r17 = r21;
        C36321k7.A19(r17, r7, r15, r14);
        C20350xQ r10 = r29;
        AnonymousClass1EL r8 = r31;
        AnonymousClass1A1 r5 = r36;
        AnonymousClass16J r11 = r27;
        AnonymousClass1X4 r16 = r22;
        C36321k7.A1C(r5, r10, r11, r8, r16);
        C005502l r4 = r37;
        AnonymousClass00C.A0D(r4, 11);
        C19890wg r6 = r34;
        C005502l r3 = r38;
        AnonymousClass17X r12 = r26;
        C58202zU r18 = r20;
        MessageCommentsManager messageCommentsManager2 = messageCommentsManager;
        C36321k7.A1D(r3, r12, r6, r18, messageCommentsManager2);
        C233117z r9 = r30;
        AnonymousClass00C.A0D(r9, 17);
        this.A0U = r0;
        this.A04 = r17;
        this.A0C = r7;
        this.A06 = r15;
        this.A07 = r14;
        this.A0F = r5;
        this.A0V = r10;
        this.A08 = r11;
        this.A0W = r8;
        this.A05 = r16;
        this.A0G = r4;
        this.A0H = r3;
        this.A0T = r12;
        this.A0D = r6;
        this.A03 = r18;
        this.A0S = messageCommentsManager2;
        this.A09 = r9;
        this.A0B = r32;
        this.A0E = r35;
        List emptyList = Collections.emptyList();
        AnonymousClass00C.A08(emptyList);
        AnonymousClass05N r02 = new AnonymousClass05N(new AnonymousClass3QM((AnonymousClass3J2) null, (AnonymousClass141) null, (AnonymousClass3T1) null, emptyList, 1, false));
        this.A0Q = r02;
        this.A0R = r02;
        Integer num = C023109s.A01;
        C12960iw A002 = C05750Qx.A00(num, 1);
        this.A0I = A002;
        this.A0M = C06810Ve.A01(A002);
        C12960iw A003 = C05750Qx.A00(num, 1);
        this.A0J = A003;
        this.A0N = C06810Ve.A01(A003);
        C12960iw A004 = C05750Qx.A00(num, 1);
        this.A0L = A004;
        this.A0P = C06810Ve.A01(A004);
        C12960iw A005 = C05750Qx.A00(num, 1);
        this.A0K = A005;
        this.A0O = C06810Ve.A01(A005);
        C36381kD.A1R(r4, new CommentsBottomSheetViewModel$1(this, (C023509x) null), C109325Xd.A00(this));
    }

    public static final int A01(C40001uV r4, AnonymousClass141 r5) {
        C20810yC r3 = r4.A0U;
        if (!C20800yB.A01(C21000yV.A01, r3, 4727)) {
            return 3;
        }
        GroupJid groupJid = (GroupJid) r5.A06(GroupJid.class);
        if (groupJid == null || !r4.A0T.A0C(groupJid)) {
            return 2;
        }
        C20350xQ r1 = r4.A0V;
        if (r1.A0n.A00(r5) || r1.A0M(r5) == 1) {
            if (r4.A0W.A00(r5)) {
                return 5;
            }
            return 4;
        } else if (r1.A0N(r5.A0H) < r3.A07(4728)) {
            return 1;
        } else {
            return 6;
        }
    }

    public static final AnonymousClass31B A02(C40001uV r4, AnonymousClass3T1 r5) {
        MessageCommentsManager messageCommentsManager = r4.A0S;
        AnonymousClass00C.A0D(r5, 0);
        messageCommentsManager.A04.Boy(new C35651j2(messageCommentsManager, r5, (C009003v) null, 17));
        int i = r5.A1I;
        if (i == 11) {
            return new AnonymousClass2HW(r5);
        }
        if (i == 15 || i == 64) {
            return new AnonymousClass2HX(r5);
        }
        return new AnonymousClass2HV(r5);
    }

    public void A0R() {
        C65513Sj r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("commentListManager");
        }
        r0.A01.unregisterObserver(r0.A00);
        this.A09.unregisterObserver(this.A0A);
        AnonymousClass191 r1 = this.A01;
        if (r1 != null) {
            this.A08.unregisterObserver(r1);
        }
    }

    public final void A0S(String str) {
        AnonymousClass3J2 r4;
        AnonymousClass05K r7 = this.A0R;
        AnonymousClass3T1 r0 = ((AnonymousClass3QM) r7.getValue()).A03;
        if (r0 != null) {
            AnonymousClass4M4 r6 = new AnonymousClass4M4(this, r0);
            String A0B2 = AnonymousClass6YV.A0B(C36371kC.A0y(str), false);
            AnonymousClass00C.A08(A0B2);
            int length = A0B2.length();
            if (AnonymousClass000.A1Q(length)) {
                r4 = new AnonymousClass3J2((Integer) null, (Integer) null, false);
            } else {
                if (AnonymousClass6YV.A0P(this.A07, this.A0D, A0B2)) {
                    if (A0B2.codePointCount(0, length) > 65536) {
                        r4 = new AnonymousClass3J2((Integer) null, C36431kI.A13(), false);
                    } else {
                        AnonymousClass3T1 r02 = ((AnonymousClass3QM) r7.getValue()).A03;
                        if (r02 == null || r02.A1J.A00 != null) {
                            r6.invoke(A0B2);
                            return;
                        }
                    }
                }
                r4 = new AnonymousClass3J2(Integer.valueOf(R.string.f12nameremoved), (Integer) null, false);
            }
            C36381kD.A1R(this.A0H, new CommentsBottomSheetViewModel$executeIfInputIsValid$1(r4, this, (C023509x) null), C109325Xd.A00(this));
        }
    }
}
