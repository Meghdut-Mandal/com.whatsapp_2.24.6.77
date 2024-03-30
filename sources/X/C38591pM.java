package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.chatinfo.EphemeralMessagesInfoView;
import com.whatsapp.chatinfo.view.custom.PnhListItem;
import com.whatsapp.dmsetting.EphemeralSettingListItem;
import com.whatsapp.info.views.CustomNotificationsInfoView;
import com.whatsapp.info.views.EncryptionInfoView;
import com.whatsapp.info.views.NotificationsAndSoundsInfoView;
import com.whatsapp.info.views.PhoneNumberPrivacyInfoView;

/* renamed from: X.1pM  reason: invalid class name and case insensitive filesystem */
public abstract class C38591pM extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public static void A00(C18800tq r1, AnonymousClass22V r2) {
        r2.A04 = (C20810yC) r1.A02.get();
        r2.A03 = (C18820ts) r1.A9X.get();
        r2.A02 = (C21060yb) r1.A8W.get();
    }

    public void A03() {
        if (this instanceof EncryptionInfoView) {
            EncryptionInfoView encryptionInfoView = (EncryptionInfoView) this;
            if (!encryptionInfoView.A02) {
                encryptionInfoView.A02 = true;
                C18800tq A0W = C36391kE.A0W(encryptionInfoView.generatedComponent());
                A00(A0W, encryptionInfoView);
                encryptionInfoView.A00 = C36351kA.A0b(A0W);
                encryptionInfoView.A01 = C18840tu.A00(A0W.A2i);
            }
        } else if (this instanceof EphemeralSettingListItem) {
            EphemeralSettingListItem ephemeralSettingListItem = (EphemeralSettingListItem) this;
            if (!ephemeralSettingListItem.A00) {
                ephemeralSettingListItem.A00 = true;
                A00(C36391kE.A0W(ephemeralSettingListItem.generatedComponent()), ephemeralSettingListItem);
            }
        } else if (this instanceof AnonymousClass231) {
            AnonymousClass231 r2 = (AnonymousClass231) this;
            if (r2 instanceof C46302Wj) {
                C46302Wj r22 = (C46302Wj) r2;
                if (!r22.A02) {
                    r22.A02 = true;
                    C27861Qc r1 = (C27861Qc) ((C27851Qb) r22.generatedComponent());
                    A00(r1.A0M, r22);
                    r22.A00 = (AnonymousClass4OA) r1.A0L.A2n.get();
                }
            } else if (!r2.A00) {
                r2.A00 = true;
                A00(C36391kE.A0W(r2.generatedComponent()), r2);
            }
        } else if (this instanceof AnonymousClass230) {
            AnonymousClass230 r23 = (AnonymousClass230) this;
            if (r23 instanceof C46292Wh) {
                C46292Wh r24 = (C46292Wh) r23;
                if (!r24.A02) {
                    r24.A02 = true;
                    C18800tq A0W2 = C36391kE.A0W(r24.generatedComponent());
                    A00(A0W2, r24);
                    r24.A00 = C36351kA.A0N(A0W2);
                    r24.A04 = C36341k9.A0Z(A0W2);
                    r24.A01 = C36351kA.A0a(A0W2);
                    r24.A03 = (AnonymousClass1YC) A0W2.AWZ.get();
                    r24.A02 = C36351kA.A0b(A0W2);
                    r24.A05 = C18840tu.A00(A0W2.A2i);
                    r24.A01 = C36381kD.A0c(A0W2);
                }
            } else if (!r23.A00) {
                r23.A00 = true;
                PhoneNumberPrivacyInfoView phoneNumberPrivacyInfoView = (PhoneNumberPrivacyInfoView) r23;
                C18800tq r12 = ((C27861Qc) ((C27851Qb) r23.generatedComponent())).A0M;
                A00(r12, phoneNumberPrivacyInfoView);
                phoneNumberPrivacyInfoView.A00 = C36351kA.A0N(r12);
                phoneNumberPrivacyInfoView.A04 = C36341k9.A0Z(r12);
                phoneNumberPrivacyInfoView.A01 = C36351kA.A0a(r12);
                phoneNumberPrivacyInfoView.A03 = (AnonymousClass1YC) r12.AWZ.get();
                phoneNumberPrivacyInfoView.A02 = C36351kA.A0b(r12);
                phoneNumberPrivacyInfoView.A05 = C18840tu.A00(r12.A2i);
            }
        } else if (this instanceof AnonymousClass22z) {
            AnonymousClass22z r25 = (AnonymousClass22z) this;
            if (r25 instanceof C46282Wg) {
                C46282Wg r26 = (C46282Wg) r25;
                if (!r26.A00) {
                    r26.A00 = true;
                    C18800tq A0W3 = C36391kE.A0W(r26.generatedComponent());
                    A00(A0W3, r26);
                    r26.A00 = C36351kA.A0h(A0W3);
                    r26.A01 = C36371kC.A0j(A0W3);
                }
            } else if (!r25.A00) {
                r25.A00 = true;
                NotificationsAndSoundsInfoView notificationsAndSoundsInfoView = (NotificationsAndSoundsInfoView) r25;
                C18800tq r13 = ((C27861Qc) ((C27851Qb) r25.generatedComponent())).A0M;
                A00(r13, notificationsAndSoundsInfoView);
                notificationsAndSoundsInfoView.A00 = C36351kA.A0h(r13);
                notificationsAndSoundsInfoView.A01 = C36371kC.A0j(r13);
            }
        } else if (this instanceof AnonymousClass237) {
            AnonymousClass237 r3 = (AnonymousClass237) this;
            if (!r3.A09) {
                r3.A09 = true;
                C27861Qc r27 = (C27861Qc) ((C27851Qb) r3.generatedComponent());
                C18800tq r14 = r27.A0M;
                A00(r14, r3);
                r3.A08 = C36341k9.A0Z(r14);
                r3.A00 = C36361kB.A0T(r14);
                r3.A07 = (C32641dx) r14.A00.A4F.get();
                r3.A04 = C36371kC.A0Y(r14);
                r3.A01 = (AnonymousClass4PX) r27.A0L.A2f.get();
            }
        } else if (this instanceof AnonymousClass232) {
            AnonymousClass232 r28 = (AnonymousClass232) this;
            if (!r28.A03) {
                r28.A03 = true;
                C27861Qc r15 = (C27861Qc) ((C27851Qb) r28.generatedComponent());
                C18800tq r0 = r15.A0M;
                A00(r0, r28);
                r28.A02 = C36371kC.A0j(r0);
                r28.A00 = (AnonymousClass4PW) r15.A0L.A2Q.get();
            }
        } else if (this instanceof AnonymousClass22y) {
            AnonymousClass22y r16 = (AnonymousClass22y) this;
            if (r16 instanceof C46272Wc) {
                C46272Wc r17 = (C46272Wc) r16;
                if (!r17.A01) {
                    r17.A01 = true;
                    C18800tq A0W4 = C36391kE.A0W(r17.generatedComponent());
                    A00(A0W4, r17);
                    r17.A00 = C36371kC.A0j(A0W4);
                }
            } else if (!r16.A00) {
                r16.A00 = true;
                CustomNotificationsInfoView customNotificationsInfoView = (CustomNotificationsInfoView) r16;
                C18800tq r02 = ((C27861Qc) ((C27851Qb) r16.generatedComponent())).A0M;
                A00(r02, customNotificationsInfoView);
                customNotificationsInfoView.A00 = C36371kC.A0j(r02);
            }
        } else if (this instanceof AnonymousClass236) {
            AnonymousClass236 r29 = (AnonymousClass236) this;
            if (!r29.A03) {
                r29.A03 = true;
                C27861Qc r18 = (C27861Qc) ((C27851Qb) r29.generatedComponent());
                A00(r18.A0M, r29);
                C27111My r19 = r18.A0L;
                r29.A02 = (AnonymousClass4O9) r19.A0a.get();
                r29.A00 = (AnonymousClass4PU) r19.A2O.get();
            }
        } else if (this instanceof PnhListItem) {
            PnhListItem pnhListItem = (PnhListItem) this;
            if (!pnhListItem.A00) {
                pnhListItem.A00 = true;
                A00(C36391kE.A0W(pnhListItem.generatedComponent()), pnhListItem);
            }
        } else if (this instanceof AnonymousClass22x) {
            AnonymousClass22x r210 = (AnonymousClass22x) this;
            if (r210 instanceof AnonymousClass2Dq) {
                AnonymousClass2Dq r211 = (AnonymousClass2Dq) r210;
                if (!r211.A05) {
                    r211.A05 = true;
                    C27861Qc r32 = (C27861Qc) ((C27851Qb) r211.generatedComponent());
                    C18800tq r110 = r32.A0M;
                    A00(r110, r211);
                    r211.A00 = C36351kA.A0a(r110);
                    r211.A03 = (AnonymousClass1NN) r110.A3q.get();
                    r211.A02 = C36361kB.A0a(r110);
                    r211.A04 = C36381kD.A0d(r110);
                    r211.A01 = C36351kA.A0b(r110);
                    r211.A00 = C36351kA.A0M(r110);
                    r211.A04 = C36341k9.A0Z(r110);
                    r211.A01 = C36341k9.A0R(r110);
                    r211.A02 = (AnonymousClass4O9) r32.A0L.A0a.get();
                }
            } else if (!r210.A00) {
                r210.A00 = true;
                EphemeralMessagesInfoView ephemeralMessagesInfoView = (EphemeralMessagesInfoView) r210;
                C18800tq r111 = ((C27861Qc) ((C27851Qb) r210.generatedComponent())).A0M;
                A00(r111, ephemeralMessagesInfoView);
                ephemeralMessagesInfoView.A00 = C36351kA.A0a(r111);
                ephemeralMessagesInfoView.A03 = (AnonymousClass1NN) r111.A3q.get();
                ephemeralMessagesInfoView.A02 = C36361kB.A0a(r111);
                ephemeralMessagesInfoView.A04 = C36381kD.A0d(r111);
                ephemeralMessagesInfoView.A01 = C36351kA.A0b(r111);
            }
        } else if (this instanceof AnonymousClass22w) {
            AnonymousClass22w r112 = (AnonymousClass22w) this;
            if (!r112.A00) {
                r112.A00 = true;
                A00(C36391kE.A0W(r112.generatedComponent()), r112);
            }
        } else if (!this.A01) {
            this.A01 = true;
            A00(((C27861Qc) ((C27851Qb) generatedComponent())).A0M, (AnonymousClass22V) this);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38591pM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }
}
