package X;

import android.content.Context;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.1a7  reason: invalid class name and case insensitive filesystem */
public class C30381a7 implements C236319f {
    public final AnonymousClass1VX A00;
    public final C19700wN A01;
    public final C26861Lu A02;
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final C24361Cd A05;
    public final AnonymousClass196 A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass16I A08;
    public final AnonymousClass16K A09;
    public final AnonymousClass1O7 A0A;
    public final C20430xY A0B;
    public final AnonymousClass1O6 A0C;
    public final AnonymousClass1G5 A0D;
    public final C19630wG A0E;
    public final AnonymousClass1C7 A0F;
    public final AnonymousClass1HT A0G;
    public final AnonymousClass12O A0H;
    public final C30391a8 A0I;
    public final C20810yC A0J;
    public final C27621Oz A0K;
    public final C27601Ox A0L;
    public final AnonymousClass19A A0M;
    public final AnonymousClass1C4 A0N;
    public final AnonymousClass19L A0O;
    public final AnonymousClass1ML A0P;
    public final C27361Nx A0Q;
    public final AnonymousClass1O8 A0R;
    public final AnonymousClass1AQ A0S;
    public final C19770wU A0T;
    public final C30401a9 A0U;

    public int[] BCF() {
        return new int[]{25};
    }

    public boolean BJl(Message message, int i) {
        String string;
        String string2;
        C19770wU r7;
        Runnable r6;
        AnonymousClass3A3 r4;
        String str;
        boolean z = false;
        if (i != 25) {
            return false;
        }
        Message message2 = message;
        Parcelable parcelable = message2.getData().getParcelable("stanzaKey");
        C18740tg.A07(parcelable, "stanzaKey is null");
        C207209uj r3 = (C207209uj) parcelable;
        C203399nx r62 = (C203399nx) message2.obj;
        C203399nx A0b = r62.A0b(0);
        C177798eO r42 = (C177798eO) AnonymousClass19L.A00(this.A0O, 2, r3.A00);
        if (r42 != null) {
            if (A0b != null) {
                str = A0b.A00;
            } else {
                str = null;
            }
            r42.A00 = str;
            r42.A04(3);
        }
        if (A0b != null) {
            if (C203399nx.A0I(A0b, "add")) {
                C18740tg.A0F(!this.A04.A0L(), "ContactUpdateNotificationHandler/handleContactAdd/add notification should only be sent to primary");
                byte[] bArr = A0b.A01;
                C131666Pz r43 = new C131666Pz(C108515Tu.A0G);
                r43.A02 = true;
                r43.A00 = AnonymousClass6NS.A0C;
                r43.A05(bArr);
                this.A0T.Boy(new C35681j5(this, r43.A01(), 3));
            } else {
                if (C203399nx.A0I(A0b, "remove")) {
                    C18740tg.A0F(!this.A04.A0L(), "ContactUpdateNotificationHandler/handleContactRemove/remove notification should only be sent to primary");
                    Jid A0X = A0b.A0X(UserJid.class, "jid");
                    this.A0F.A01(new C35681j5(this, A0X, 4), 45);
                    this.A0T.Boy(new C35321iV(this, A0X, r3, 33));
                } else if (C203399nx.A0I(A0b, "update")) {
                    String A0i = A0b.A0i("hash", (String) null);
                    if (A0i == null) {
                        AnonymousClass11F r2 = (AnonymousClass11F) A0b.A0X(UserJid.class, "jid");
                        AnonymousClass16D r8 = this.A07;
                        AnonymousClass141 A082 = r8.A08(r2);
                        if (A082 != null) {
                            this.A02.A01(new C35321iV(this, A082, r2, 32));
                            C27361Nx r12 = this.A0Q;
                            if (!AnonymousClass143.A0G(r2) && ((r4 = (AnonymousClass3A3) r12.A04.get(r2)) == null || r4.A04 != 1)) {
                                r12.A04(r2, 2, 0);
                                this.A03.Bp3(new C35681j5(this, r2, 5));
                            }
                            if (this.A0D.A00().A01(r2) && this.A0P.A00 != 3) {
                                this.A03.A0H(new C35681j5(this, r2, 6));
                            }
                            if (C20800yB.A01(C21000yV.A02, this.A0J, 4921)) {
                                C30391a8 r5 = this.A0I;
                                AnonymousClass00C.A0D(r2, 0);
                                r7 = r5.A03;
                                r6 = new C35701j7(r5, r2, 49);
                            } else {
                                C19630wG r10 = this.A0E;
                                C19770wU r15 = this.A0T;
                                C19700wN r9 = this.A01;
                                AnonymousClass19A r13 = this.A0M;
                                AnonymousClass17Y r72 = this.A03;
                                AnonymousClass17Y r17 = r72;
                                C193909Nj r82 = new C193909Nj(r9, r10, this.A0K, this.A0L, r13, new C77103px(r17, this.A06, r8, this.A08, r15), r15);
                                r82.A06.Boy(new AnonymousClass735(r82, r2, 6, A082.A0D));
                            }
                        }
                    } else if (!TextUtils.isEmpty(A0i)) {
                        byte[] decode = Base64.decode(A0i.getBytes(), 0);
                        Arrays.toString(decode);
                        C131666Pz r22 = new C131666Pz(C108515Tu.A0I);
                        r22.A02 = true;
                        r22.A00 = new AnonymousClass6NS(false, false, true, true, false, false, false, false, false, false, false, true);
                        r22.A05(decode);
                        C131586Pq A012 = r22.A01();
                        r7 = this.A0T;
                        r6 = new C35681j5(this, A012, 3);
                    }
                    r7.Boy(r6);
                } else if (C203399nx.A0I(A0b, "sync")) {
                    long j = 0;
                    long A013 = AnonymousClass6R8.A01(A0b.A0i("after", (String) null), 0) * 1000;
                    long A014 = AnonymousClass6R8.A01(r62.A0i("t", (String) null), 0) * 1000;
                    AnonymousClass17Y r73 = this.A03;
                    C35671j4 r63 = new C35671j4(this, 45);
                    if (A013 > A014 && A014 > 0) {
                        j = A013 - A014;
                    }
                    r73.A0I(r63, j);
                } else if (C203399nx.A0I(A0b, "modify")) {
                    long A015 = AnonymousClass6R8.A01(r62.A0i("t", (String) null), 0) * 1000;
                    Class<UserJid> cls = UserJid.class;
                    UserJid userJid = (UserJid) A0b.A0X(cls, "old");
                    UserJid userJid2 = (UserJid) A0b.A0X(cls, "new");
                    Class<C223313w> cls2 = C223313w.class;
                    UserJid userJid3 = (UserJid) A0b.A0X(cls2, "old_lid");
                    Jid A0X2 = A0b.A0X(cls2, "new_lid");
                    StringBuilder sb = new StringBuilder();
                    sb.append("contactupdatenotificationhandler/handleContactModify oldUserJid=");
                    sb.append(userJid);
                    sb.append(" newUserJid=");
                    sb.append(userJid2);
                    Log.i(sb.toString());
                    AnonymousClass1VX r64 = this.A00;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ChangeNumberManager/onContactNumberChanged/oldPnJid=");
                    sb2.append(userJid);
                    sb2.append("; newPnJid=");
                    sb2.append(userJid2);
                    sb2.append("/oldLidJid=");
                    sb2.append(userJid3);
                    sb2.append("; newLidJid=");
                    sb2.append(A0X2);
                    Log.i(sb2.toString());
                    C238019x r11 = r64.A05;
                    UserJid userJid4 = userJid;
                    UserJid userJid5 = userJid2;
                    C181248nA A0A2 = r11.A0A(userJid, userJid4, userJid5, A015);
                    C20310xM r52 = r64.A02;
                    r52.A0h(A0A2);
                    C24531Cu r44 = r64.A01;
                    r44.A01(userJid, A0A2);
                    C181248nA A0A3 = r11.A0A(userJid2, userJid4, userJid5, A015);
                    r52.A0h(A0A3);
                    r44.A01(userJid2, A0A3);
                    if (!(userJid3 == null || A0X2 == null)) {
                        C181248nA A0A4 = r11.A0A(userJid3, userJid3, userJid2, A015);
                        r52.A0h(A0A4);
                        r44.A01(userJid3, A0A4);
                        r64.A06.Boy(new C35421if(r64, userJid3, A0X2, userJid, userJid2, 0));
                    }
                } else if (C203399nx.A0I(A0b, "invite")) {
                    C30401a9 r122 = this.A0U;
                    try {
                        C186158vV r112 = new C186158vV(r62);
                        UserJid userJid6 = r112.A00;
                        if (userJid6 != null && !r122.A06.A0M(userJid6)) {
                            C25271Fq r20 = r122.A05;
                            boolean equalsIgnoreCase = "clicked_invite_link".equalsIgnoreCase(r112.A02);
                            Context context = r122.A04.A00;
                            AnonymousClass171 r45 = r122.A02;
                            AnonymousClass16D r23 = r122.A01;
                            C18740tg.A06(userJid6);
                            String A0H2 = r45.A0H(r23.A0D(userJid6));
                            String string3 = context.getString(R.string.f12nameremoved);
                            if (equalsIgnoreCase) {
                                string = context.getString(R.string.f12nameremoved, new Object[]{A0H2});
                                string2 = context.getString(R.string.f12nameremoved, new Object[]{A0H2, string3});
                            } else {
                                string = context.getString(R.string.f12nameremoved, new Object[]{A0H2, string3});
                                string2 = context.getString(R.string.f12nameremoved);
                            }
                            C07700Yy A022 = C20600xp.A02(context);
                            A022.A0M = "other_notifications@1";
                            A022.A09 = 1;
                            A022.A0G(string);
                            C19970wo r19 = r122.A03;
                            A022.A09(C19970wo.A00(r19));
                            A022.A06(3);
                            A022.A0I(true);
                            A022.A0F(string);
                            A022.A0E(string2);
                            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
                            notificationCompat$BigTextStyle.A0C(context.getString(R.string.f12nameremoved, new Object[]{A0H2, string3}));
                            A022.A0C(notificationCompat$BigTextStyle);
                            A022.A0D = C65743Th.A00(context, 1, new AnonymousClass190().A1Z(context, userJid6, 0), 0);
                            A022.A0B.icon = R.drawable.notifybar;
                            r20.A02(62, A022.A05());
                            C238019x r24 = r122.A0A;
                            C181078mt r65 = new C181078mt(r24.A01.A02(userJid6, true), C19970wo.A00(r19));
                            r65.A16(Boolean.toString(equalsIgnoreCase));
                            r122.A07.A0h(r65);
                            r122.A00.A01(new C35321iV(r122, r112, userJid6, 34));
                        }
                        r122.A09.A01(r3);
                    } catch (C235919b unused) {
                    }
                }
                z = true;
            }
            this.A0N.A01(r3);
            z = true;
        }
        if (!z) {
            this.A0N.A01(r3);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ContactUpdateNotificationHandler/handleXmppMessage/handled-issue/operation was not handled: ");
            sb3.append(A0b);
            Log.w(sb3.toString());
            this.A01.A0E("ContactUpdateNotificationHandler/handleXmppMessage", "handled-issue", true);
        }
        return true;
    }

    public C30381a7(AnonymousClass1VX r2, C19700wN r3, C26861Lu r4, AnonymousClass17Y r5, C19730wQ r6, C24361Cd r7, AnonymousClass196 r8, AnonymousClass16D r9, AnonymousClass16I r10, AnonymousClass16K r11, AnonymousClass1O7 r12, C30401a9 r13, C20430xY r14, AnonymousClass1O6 r15, AnonymousClass1G5 r16, C19630wG r17, AnonymousClass1C7 r18, AnonymousClass1HT r19, AnonymousClass12O r20, C30391a8 r21, C20810yC r22, C27621Oz r23, C27601Ox r24, AnonymousClass19A r25, AnonymousClass1C4 r26, AnonymousClass19L r27, AnonymousClass1ML r28, C27361Nx r29, AnonymousClass1O8 r30, AnonymousClass1AQ r31, C19770wU r32) {
        this.A0J = r22;
        this.A0E = r17;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A0T = r32;
        this.A0N = r26;
        this.A06 = r8;
        this.A0M = r25;
        this.A07 = r9;
        this.A02 = r4;
        this.A0P = r28;
        this.A0Q = r29;
        this.A08 = r10;
        this.A0S = r31;
        this.A0H = r20;
        this.A0F = r18;
        this.A05 = r7;
        this.A09 = r11;
        this.A0B = r14;
        this.A0G = r19;
        this.A0I = r21;
        this.A00 = r2;
        this.A0A = r12;
        this.A0O = r27;
        this.A0R = r30;
        this.A0K = r23;
        this.A0L = r24;
        this.A0C = r15;
        this.A0D = r16;
        this.A0U = r13;
    }
}
