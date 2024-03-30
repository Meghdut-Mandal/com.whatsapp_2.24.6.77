package com.whatsapp.migration.transfer.ui;

import X.AnonymousClass000;
import X.AnonymousClass04R;
import X.AnonymousClass17Z;
import X.AnonymousClass5FW;
import X.AnonymousClass5FY;
import X.AnonymousClass5V3;
import X.AnonymousClass6FO;
import X.AnonymousClass6JX;
import X.AnonymousClass6NX;
import X.AnonymousClass6TQ;
import X.AnonymousClass6XZ;
import X.AnonymousClass7h5;
import X.AnonymousClass7h6;
import X.AnonymousClass9S4;
import X.C001700s;
import X.C105535Fa;
import X.C111795cr;
import X.C116425kZ;
import X.C116435ka;
import X.C124275xs;
import X.C125005zA;
import X.C125055zF;
import X.C130446Lc;
import X.C146936wP;
import X.C1497272n;
import X.C159597jc;
import X.C163117pg;
import X.C163127ph;
import X.C163137pi;
import X.C18740tg;
import X.C1901797e;
import X.C19420v0;
import X.C19430v1;
import X.C19630wG;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C21060yb;
import X.C21520zN;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C90464aC;
import X.C90504aG;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.migration.transfer.service.WifiGroupCreatorP2pTransferService;
import com.whatsapp.migration.transfer.service.WifiGroupScannerP2pTransferService;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class ChatTransferViewModel extends AnonymousClass04R {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass9S4 A03;
    public C159597jc A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C001700s A0A = C36441kJ.A0t();
    public final C001700s A0B = C36441kJ.A0t();
    public final C001700s A0C = C36431kI.A0S();
    public final C001700s A0D = C36431kI.A0S();
    public final C001700s A0E = C36441kJ.A0t();
    public final C001700s A0F = C36441kJ.A0t();
    public final C001700s A0G = C36441kJ.A0t();
    public final C001700s A0H = C36431kI.A0S();
    public final C001700s A0I;
    public final C116425kZ A0J;
    public final C116435ka A0K;
    public final C19730wQ A0L;
    public final C21060yb A0M;
    public final C19630wG A0N;
    public final C19420v0 A0O;
    public final C21520zN A0P;
    public final C20810yC A0Q;
    public final AnonymousClass5FW A0R;
    public final AnonymousClass6FO A0S;
    public final AnonymousClass5FY A0T;
    public final AnonymousClass6NX A0U;
    public final C125055zF A0V;
    public final C105535Fa A0W;
    public final AnonymousClass6JX A0X;
    public final AnonymousClass6TQ A0Y;
    public final C146936wP A0Z;
    public final C19770wU A0a;
    public final C19770wU A0b;
    public final AnonymousClass17Z A0c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r1 != 10) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (X.C90494aF.A1U(r8.A0B, java.lang.Boolean.TRUE) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(com.whatsapp.migration.transfer.ui.ChatTransferViewModel r8) {
        /*
            int r4 = r8.A01
            r5 = 6
            r0 = 3
            r3 = 4
            r1 = 1
            r2 = 2
            if (r4 != r1) goto L_0x004b
            X.00s r0 = r8.A0D
            java.lang.Number r0 = X.C36441kJ.A0z(r0)
            if (r0 == 0) goto L_0x0025
            int r1 = r0.intValue()
            r0 = 9
            if (r1 == r2) goto L_0x0049
            if (r1 == r3) goto L_0x0046
            if (r1 == r5) goto L_0x0043
            if (r1 == r0) goto L_0x0037
            r0 = 10
            r5 = 11
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            X.6TQ r4 = r8.A0Y
            int r0 = r8.A00
            long r7 = (long) r0
            X.0wU r0 = r4.A05
            r6 = 1
            X.734 r3 = new X.734
            r3.<init>(r4, r5, r6, r7)
            r0.Boy(r3)
            return
        L_0x0037:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.00s r0 = r8.A0B
            boolean r0 = X.C90494aF.A1U(r0, r1)
            r5 = 1
            if (r0 != 0) goto L_0x0026
            goto L_0x0025
        L_0x0043:
            r5 = 8
            goto L_0x0026
        L_0x0046:
            r5 = 9
            goto L_0x0026
        L_0x0049:
            r5 = 7
            goto L_0x0026
        L_0x004b:
            if (r4 != r2) goto L_0x004f
            r5 = 2
            goto L_0x0026
        L_0x004f:
            if (r4 != r0) goto L_0x0053
            r5 = 3
            goto L_0x0026
        L_0x0053:
            if (r4 != r3) goto L_0x0025
            int r0 = r8.A02
            if (r0 == 0) goto L_0x005d
            if (r0 != r1) goto L_0x0026
            r5 = 5
            goto L_0x0026
        L_0x005d:
            r5 = 4
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.ChatTransferViewModel.A02(com.whatsapp.migration.transfer.ui.ChatTransferViewModel):void");
    }

    public void A0R() {
        C105535Fa r0 = this.A0W;
        C146936wP r1 = this.A0Z;
        r0.unregisterObserver(r1);
        this.A0R.unregisterObserver(r1);
        this.A0T.unregisterObserver(r1);
    }

    public void A0U() {
        C36341k9.A19(this.A0F, false);
        C36331k8.A13(this.A0B);
        this.A0Y.A02(5);
    }

    public void A0V() {
        C36341k9.A0u(C90464aC.A0C(this.A0S.A01), "/export/logging/attemptId");
        this.A05 = null;
        A0W();
        A0X(1);
        C001700s r1 = this.A0D;
        C36341k9.A17(r1, 0);
        C36341k9.A17(r1, 1);
    }

    public void A0W() {
        Context context;
        Class cls;
        C159597jc r0 = this.A04;
        if (r0 != null) {
            r0.cancel();
        }
        if (!this.A06 || this.A08) {
            context = this.A0N.A00;
            cls = WifiGroupCreatorP2pTransferService.class;
        } else {
            context = this.A0N.A00;
            cls = WifiGroupScannerP2pTransferService.class;
        }
        context.startService(C36441kJ.A0H(context, cls).setAction("com.whatsapp.migration.STOP"));
    }

    public void A0X(int i) {
        AnonymousClass7h6 r0;
        String str;
        int i2;
        int i3;
        int i4;
        int i5 = this.A01;
        if (i != i5) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("fpm/P2pTransferViewModel/change state from ");
            A0u.append(i5);
            C36321k7.A1T(" to ", A0u, i);
            this.A01 = i;
            C125005zA r3 = new C125005zA();
            C124275xs r6 = new C124275xs(new C163127ph(this, 0), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, true, true);
            if (i != 1) {
                if (i == 2) {
                    this.A0Y.A02(5);
                    if (this.A06) {
                        str = "fpm/ChatTransferViewModel/Receiver should not be in authentication state";
                        Log.e(str);
                        return;
                    }
                    r3.A0B = R.string.f12nameremoved;
                    boolean z = this.A09;
                    int i6 = R.string.f12nameremoved;
                    if (z) {
                        i6 = R.string.f12nameremoved;
                    }
                    r3.A0A = i6;
                    r3.A0G = true;
                    r3.A00 = 8;
                    r3.A0C = this.A03;
                    r3.A04 = 8;
                    r3.A0F = new C163117pg(r6, this, 1);
                    i2 = 2;
                } else if (i != 3) {
                    boolean z2 = this.A06;
                    if (i != 4) {
                        if (z2) {
                            r3.A0B = R.string.f12nameremoved;
                            r3.A0A = R.string.f12nameremoved;
                            i4 = R.string.f12nameremoved;
                        } else {
                            r3.A0B = R.string.f12nameremoved;
                            r3.A0A = R.string.f12nameremoved;
                            i4 = R.string.f12nameremoved;
                        }
                        r3.A03 = i4;
                        r3.A02 = 411;
                        r3.A01 = 495;
                        r3.A09 = 8;
                        r3.A0E = new C163137pi(this, 1);
                        r3.A0D = new C163137pi(this, 2);
                    } else {
                        if (z2) {
                            r3.A0A = R.string.f12nameremoved;
                            i3 = R.string.f12nameremoved;
                        } else {
                            r3.A0A = R.string.f12nameremoved;
                            i3 = R.string.f12nameremoved;
                        }
                        r3.A05 = i3;
                        r3.A0B = R.string.f12nameremoved;
                        r3.A02 = 0;
                        r3.A01 = 351;
                        r3.A0I = true;
                        r3.A07 = 0;
                        r3.A06 = 0;
                        r3.A04 = 8;
                        r3.A0F = new C163117pg(r6, this, 5);
                        i2 = 6;
                    }
                } else if (this.A06) {
                    r3.A02 = 0;
                    r3.A01 = 351;
                    r3.A0I = true;
                    r3.A0B = R.string.f12nameremoved;
                    r3.A0A = R.string.f12nameremoved;
                    r3.A05 = R.string.f12nameremoved;
                    r3.A07 = 0;
                    r3.A06 = 0;
                    r3.A04 = 8;
                    r3.A0F = new C163117pg(r6, this, 3);
                    i2 = 4;
                } else {
                    str = "fpm/ChatTransferViewModel/Receiver should not be in pairing state";
                    Log.e(str);
                    return;
                }
                r3.A0D = new C163117pg(r6, this, i2);
                r3.A0H = true;
            } else {
                if (this.A06) {
                    r0 = new C163137pi(this, 0);
                    r3.A0F = r0;
                } else {
                    r3.A0B = R.string.f12nameremoved;
                    r3.A0A = R.string.f12nameremoved;
                    r3.A03 = R.string.f12nameremoved;
                    r3.A0F = new C163117pg(r6, this, 7);
                    r0 = new C163117pg(r6, this, 0);
                }
                r3.A0D = r0;
                r3.A08 = R.string.f12nameremoved;
                r3.A0E = new C163137pi(this, 6);
            }
            this.A0H.A0C(r3);
        }
    }

    public void A0Y(int i, int i2) {
        if (this.A01 != 5) {
            C001700s r2 = this.A0C;
            if (r2.A04() == null || !C1901797e.A00(Integer.valueOf(i), ((Pair) r2.A04()).first) || !C1901797e.A00(Integer.valueOf(i2), ((Pair) r2.A04()).second)) {
                if (i2 > 100) {
                    i2 = 100;
                } else if (i2 < 0) {
                    i2 = 0;
                }
                r2.A0C(C36341k9.A0I(Integer.valueOf(i), i2));
            }
        }
    }

    public void A0Z(Bundle bundle) {
        C18740tg.A0E(bundle.containsKey("is_donor"), "getIntent().getExtras()[IS_DONOR_ARG] is required but is not present");
        this.A06 = bundle.getBoolean("is_donor");
        this.A08 = bundle.getBoolean("should_donor_generate_qr_code", false);
        C18740tg.A0E(bundle.containsKey("started_on_receiver"), "getIntent().getExtras()[STARTED_ON_RECEIVER_ARG] is required but is not present");
        boolean z = bundle.getBoolean("started_on_receiver");
        this.A09 = z;
        if (z) {
            this.A05 = bundle.getString("qr_code_data");
        }
    }

    public void A0a(String str) {
        C124275xs r2;
        C001700s r1;
        String A0t;
        try {
            C130446Lc A002 = C130446Lc.A00(str);
            try {
                PhoneUserJid A0n = C36441kJ.A0n(this.A0L);
                if (A0n != null) {
                    A0t = A0n.user;
                } else {
                    A0t = C36371kC.A0t(C36341k9.A0E(this.A0O), "saved_user_before_logout");
                    if (A0t == null) {
                        throw new Exception("fpm/ChatTransferViewModel/getUserJid currentUser and savedUser both null");
                    }
                }
                byte[] bArr = AnonymousClass6XZ.A00;
                String A13 = C36441kJ.A13(C90504aG.A1a(A0t.getBytes(C19430v1.A0B), "SHA-256"));
                AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
                if (!A13.equals(A002.A01)) {
                    Log.e("fpm/ChatTransferViewModel/phone number mismatch");
                    this.A0Y.A03(0, 0, 4);
                    r1 = this.A0E;
                    r2 = A0S();
                    r1.A0C(r2);
                    return;
                }
                Context context = this.A0N.A00;
                Intent A0I2 = C36441kJ.A0I("com.whatsapp.migration.START");
                A0I2.putExtra("details_key", str);
                A0I2.setClass(context, WifiGroupScannerP2pTransferService.class);
                C111795cr.A01(context, A0I2);
                C1497272n.A00(this.A0a, this, 37);
                A0X(3);
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
                r1 = this.A0E;
                r2 = A0T();
            } catch (Exception e) {
                C36321k7.A1W("fpm/ChatTransferViewModel/", AnonymousClass000.A0u(), e);
                r1 = this.A0E;
                r2 = A0S();
            }
        } catch (AnonymousClass5V3 e2) {
            C36321k7.A1W("fpm/ChatTransferViewModel/Unable to parse QR code, reason: ", AnonymousClass000.A0u(), e2);
            AnonymousClass6TQ r3 = this.A0Y;
            e2.getMessage();
            r3.A03(0, 0, 3);
            int i = e2.invalidQrType;
            int i2 = R.string.f12nameremoved;
            if (i == 1) {
                i2 = R.string.f12nameremoved;
            }
            r1 = this.A0E;
            r2 = new C124275xs(new C163127ph(this, 5), R.string.f12nameremoved, i2, R.string.f12nameremoved, 0, false, true);
        }
    }

    public ChatTransferViewModel(C116425kZ r3, C116435ka r4, C19730wQ r5, C21060yb r6, C19630wG r7, AnonymousClass17Z r8, C19420v0 r9, C21520zN r10, C20810yC r11, AnonymousClass5FW r12, AnonymousClass6FO r13, AnonymousClass5FY r14, AnonymousClass6NX r15, C125055zF r16, C105535Fa r17, AnonymousClass6JX r18, AnonymousClass6TQ r19, C19770wU r20) {
        this.A0N = r7;
        C19770wU r1 = r20;
        this.A0a = r1;
        this.A0M = r6;
        this.A0W = r17;
        this.A0X = r18;
        this.A0I = C36441kJ.A0t();
        this.A0Q = r11;
        this.A0b = r1;
        this.A0L = r5;
        this.A0U = r15;
        this.A0V = r16;
        this.A0Y = r19;
        this.A0P = r10;
        this.A0O = r9;
        this.A0R = r12;
        this.A0T = r14;
        this.A0S = r13;
        this.A0J = r3;
        this.A0c = r8;
        this.A0K = r4;
        this.A0Z = new C146936wP(this);
    }

    public static C124275xs A01() {
        return new C124275xs((AnonymousClass7h5) null, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, 0, false, false);
    }

    public C124275xs A0S() {
        return new C124275xs(new C163127ph(this, 6), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, 0, false, true);
    }

    public C124275xs A0T() {
        return new C124275xs(new C163127ph(this, 4), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, 0, false, true);
    }
}
