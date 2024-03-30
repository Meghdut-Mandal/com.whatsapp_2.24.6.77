package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.ABt  reason: case insensitive filesystem */
public class C21185ABt implements C22938Ayo, C22942Ays, C17740rx {
    public final AnonymousClass16T A00;
    public final AnonymousClass185 A01;
    public final C20810yC A02;
    public final AnonymousClass1DL A03;
    public final AnonymousClass1AW A04;
    public final AnonymousClass005 A05;
    public final Set A06;

    public AnonymousClass3T1 A00(C20310xM r7, AnonymousClass8SX r8, C64933Qa r9, AnonymousClass2bZ r10, long j, boolean z) {
        C207219uk BA8;
        AnonymousClass8SX r3 = r8;
        if (!z) {
            AnonymousClass11F r1 = r9.A00;
            C18740tg.A06(r1);
            C23043B1o A002 = C202449lr.A00(r7, r1, this.A03, r3, r10, false);
            if (A002 != null) {
                C207219uk r12 = r10.A00;
                if (!(r12 == null || (BA8 = A002.BA8()) == null)) {
                    r12.A01 = BA8.A01;
                    r10.BqZ(r12);
                }
                return r10;
            }
        }
        String A012 = C202869mo.A01(r8);
        if (A012 != null) {
            return C165597tg.A0Y(r9, A012, j);
        }
        throw C165567td.A0J(0);
    }

    public C180938mf A01(AnonymousClass9YL r14) {
        AnonymousClass8SF r2;
        C207089uX r10;
        C64933Qa r6 = r14.A0C;
        long j = r14.A04;
        C173308Re r5 = r14.A0A.buttonsMessage_;
        if (r5 == null) {
            r5 = C173308Re.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r5);
        AnonymousClass16T r8 = this.A00;
        if (C170918Hz.A0E(r5, 0).paramsJson_ == null) {
            Log.e("FMessageCheckoutButtonsProtobuf/parseE2ECheckoutInfo/invalid native flow message does not have parameters json");
        } else {
            C173078Qh r7 = (C173078Qh) r5.buttons_.get(0);
            if (r5.headerCase_ == 3) {
                r2 = (AnonymousClass8SF) r5.header_;
            } else {
                r2 = AnonymousClass8SF.DEFAULT_INSTANCE;
            }
            byte[] A062 = r2.jpegThumbnail_.A06();
            C172718Ox r22 = r7.nativeFlowInfo_;
            if (r22 == null) {
                r22 = C172718Ox.DEFAULT_INSTANCE;
            }
            C207199ui A022 = C203219nY.A02(r8, r22.paramsJson_, A062, false);
            if (A022 != null) {
                C180938mf r3 = new C180938mf(r6, j);
                String str = r5.contentText_;
                String str2 = r5.footerText_;
                if (r5.buttons_.size() > 0) {
                    ArrayList A0I = AnonymousClass001.A0I();
                    for (int i = 0; i < r5.buttons_.size(); i++) {
                        C172718Ox A0E = C170918Hz.A0E(r5, i);
                        A0I.add(new C206569tc(new C206969uL(A0E.name_, A0E.paramsJson_), false));
                    }
                    r10 = new C207089uX(A0I);
                } else {
                    r10 = null;
                }
                r3.BqZ(new C207219uk(A022, (C206659tl) null, r10, str, str2));
                for (C194629Qm A002 : this.A06) {
                    A002.A00(r3);
                }
                return r3;
            }
        }
        C36321k7.A1J(r6, "FMessageCheckoutButtonsProtobuf/parseE2EMessage/invalid message; message.key=", AnonymousClass000.A0u());
        throw C165567td.A0J(26);
    }

    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        C18740tg.A0E(r5 instanceof AnonymousClass2bZ, AnonymousClass000.A0l(r5, "FMessageCheckoutButtonsProtobuf: message type is not supported ", AnonymousClass000.A0u()));
        C207219uk r1 = ((AnonymousClass2bZ) r5).A00;
        if (r1 != null) {
            this.A04.A00(r1).A0F(r4, r5);
        }
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r24) {
        C21674AUx aUx;
        C207089uX r3;
        AnonymousClass9YL r12 = r24;
        AnonymousClass8SX r11 = r12.A0A;
        if (!C203099nI.A05(r11)) {
            return null;
        }
        AnonymousClass8SV r1 = r11.interactiveMessage_;
        if (r1 == null) {
            r1 = AnonymousClass8SV.DEFAULT_INSTANCE;
        }
        AnonymousClass00C.A0D(r1, 0);
        if (!C202419ln.A01(r1, "review_order")) {
            return null;
        }
        AnonymousClass185 r13 = this.A01;
        C64933Qa r10 = r12.A0C;
        if (!r13.A04((UserJid) r10.A00) || !this.A02.A0E(2688)) {
            return null;
        }
        long j = r12.A04;
        AnonymousClass8SV r4 = r11.interactiveMessage_;
        if (r4 == null) {
            r4 = AnonymousClass8SV.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r4);
        if (r4.A0u().buttons_.size() > 0) {
            String str = ((AnonymousClass8P5) r4.A0u().buttons_.get(0)).buttonParamsJson_;
            AnonymousClass8SN r5 = r4.header_;
            if (r5 == null) {
                r5 = AnonymousClass8SN.DEFAULT_INSTANCE;
            }
            if (r5.mediaCase_ == 6) {
                aUx = (C21674AUx) r5.media_;
            } else {
                aUx = C21674AUx.A00;
            }
            C207199ui A022 = C203219nY.A02(this.A00, str, aUx.A06(), true);
            if (A022 != null) {
                C180938mf r9 = new C180938mf(r10, j);
                C172358Nn r0 = r4.body_;
                if (r0 == null) {
                    r0 = C172358Nn.DEFAULT_INSTANCE;
                }
                String str2 = r0.text_;
                C172368No r02 = r4.footer_;
                if (r02 == null) {
                    r02 = C172368No.DEFAULT_INSTANCE;
                }
                String str3 = r02.text_;
                AnonymousClass8Q1 A0u = r4.A0u();
                if (A0u.buttons_.size() > 0) {
                    ArrayList A0I = AnonymousClass001.A0I();
                    for (int i = 0; i < A0u.buttons_.size(); i++) {
                        AnonymousClass8P5 r03 = (AnonymousClass8P5) A0u.buttons_.get(i);
                        A0I.add(new C206569tc(new C206969uL(r03.name_, r03.buttonParamsJson_), false));
                    }
                    r3 = new C207089uX(A0I);
                } else {
                    r3 = null;
                }
                r9.BqZ(new C207219uk(A022, (C206659tl) null, r3, str2, str3));
                C180938mf r19 = r9;
                C64933Qa r18 = r10;
                AnonymousClass8SX r17 = r11;
                return A00((C20310xM) this.A05.get(), r17, r18, r19, j, r12.A0O);
            }
        }
        C36321k7.A1J(r10, "FMessageCheckoutButtonsProtobuf/parseE2EMessage/invalid message; message.key=", AnonymousClass000.A0u());
        throw C165567td.A0J(26);
    }

    public C21185ABt(AnonymousClass185 r1, AnonymousClass16T r2, C20810yC r3, AnonymousClass1DL r4, AnonymousClass1AW r5, AnonymousClass005 r6, Set set) {
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A01 = r1;
        this.A00 = r2;
        this.A06 = set;
        this.A04 = r5;
    }
}
