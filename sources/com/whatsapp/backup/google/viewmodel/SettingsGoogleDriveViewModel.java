package com.whatsapp.backup.google.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass04R;
import X.AnonymousClass17Y;
import X.AnonymousClass1Q9;
import X.AnonymousClass2PD;
import X.AnonymousClass3K7;
import X.AnonymousClass3S1;
import X.AnonymousClass6FS;
import X.C001700s;
import X.C101944yX;
import X.C101974ya;
import X.C101984yb;
import X.C109815Zf;
import X.C110185aG;
import X.C119015p6;
import X.C142826pX;
import X.C1497072l;
import X.C19420v0;
import X.C19600wD;
import X.C19680wL;
import X.C19770wU;
import X.C21010yW;
import X.C24431Ck;
import X.C24461Cn;
import X.C33101ei;
import X.C33151eo;
import X.C33161ep;
import X.C33171eq;
import X.C36341k9;
import X.C36371kC;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C90504aG;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class SettingsGoogleDriveViewModel extends AnonymousClass04R implements C19680wL {
    public static final int[] A0e;
    public static final int[] A0f = {0, 4, 1, 2, 3};
    public final ServiceConnection A00 = new C110185aG(this, 2);
    public final ConditionVariable A01 = new ConditionVariable(false);
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final C001700s A04 = C36431kI.A0S();
    public final C001700s A05 = C36441kJ.A0Z(C36371kC.A0m());
    public final C001700s A06 = C36431kI.A0S();
    public final C001700s A07 = C36431kI.A0S();
    public final C001700s A08 = C36431kI.A0S();
    public final C001700s A09 = C36431kI.A0S();
    public final C001700s A0A = C36431kI.A0S();
    public final C001700s A0B = C36431kI.A0S();
    public final C001700s A0C = C36431kI.A0S();
    public final C001700s A0D = C36441kJ.A0Z(10);
    public final C001700s A0E = C36441kJ.A0Z(new C119015p6(10, (Bundle) null));
    public final C001700s A0F = C36431kI.A0S();
    public final C001700s A0G = C36441kJ.A0Z(false);
    public final C001700s A0H = C36441kJ.A0Z(C36411kG.A0t());
    public final C001700s A0I = C36431kI.A0S();
    public final C001700s A0J = C36431kI.A0S();
    public final C001700s A0K = C36431kI.A0S();
    public final C001700s A0L = C36431kI.A0S();
    public final C001700s A0M = C36431kI.A0S();
    public final C001700s A0N = C36431kI.A0S();
    public final C001700s A0O = C36431kI.A0S();
    public final C24461Cn A0P;
    public final C24431Ck A0Q;
    public final AnonymousClass3S1 A0R;
    public final C33101ei A0S;
    public final AnonymousClass6FS A0T;
    public final C33171eq A0U;
    public final C33161ep A0V;
    public final C33151eo A0W;
    public final C19600wD A0X;
    public final C19420v0 A0Y;
    public final AnonymousClass1Q9 A0Z;
    public final C21010yW A0a;
    public final C19770wU A0b;
    public final AtomicBoolean A0c = new AtomicBoolean();
    public final AtomicBoolean A0d = new AtomicBoolean();

    static {
        int[] iArr = new int[5];
        C90504aG.A1S(iArr);
        A0e = iArr;
    }

    public SettingsGoogleDriveViewModel(AnonymousClass17Y r8, C24461Cn r9, C24431Ck r10, AnonymousClass3S1 r11, C33101ei r12, AnonymousClass6FS r13, C33171eq r14, C33161ep r15, C19600wD r16, C19420v0 r17, AnonymousClass1Q9 r18, C21010yW r19, C19770wU r20) {
        this.A0b = r20;
        this.A0a = r19;
        this.A0Q = r10;
        this.A0Z = r18;
        this.A0T = r13;
        C19420v0 r6 = r17;
        this.A0Y = r6;
        this.A0P = r9;
        this.A0R = r11;
        C19600wD r5 = r16;
        this.A0X = r5;
        this.A0S = r12;
        this.A0V = r15;
        this.A0U = r14;
        AnonymousClass17Y r2 = r8;
        this.A0W = new C142826pX(r2, r15, this, r5, r6);
    }

    public void A0R() {
        this.A0X.unregisterObserver(this);
        this.A0U.A02(this.A0W);
    }

    public void A0S() {
        C001700s r1;
        C101984yb r0;
        C19420v0 r12 = this.A0Y;
        String A0c2 = r12.A0c();
        if (!TextUtils.isEmpty(A0c2)) {
            long j = C36341k9.A0E(r12).getLong(AnonymousClass000.A0p("gdrive_last_successful_backup_video_size:", A0c2, AnonymousClass000.A0u()), -1);
            if (j > 0) {
                r1 = this.A0O;
                r0 = new C101984yb(j);
                r1.A0D(r0);
                return;
            }
        }
        Object A042 = this.A0F.A04();
        Boolean bool = Boolean.TRUE;
        r1 = this.A0O;
        if (A042 != bool) {
            r0 = null;
            r1.A0D(r0);
            return;
        }
        r1.A0D(new C101974ya());
        C1497072l.A00(this.A0b, this, 32);
    }

    public void A0T() {
        C1497072l.A00(this.A0b, this, 33);
        A0S();
        C19420v0 r4 = this.A0Y;
        String A0c2 = r4.A0c();
        int i = 0;
        if (A0c2 != null) {
            boolean A2T = r4.A2T(A0c2);
            int A0N2 = r4.A0N(A0c2);
            if (A2T || A0N2 == 0) {
                i = A0N2;
            } else {
                r4.A1b(A0c2, 0);
            }
        }
        C36341k9.A16(this.A0J, i);
    }

    public void A0U(int i, int i2) {
        AnonymousClass2PD r1 = new AnonymousClass2PD();
        r1.A02 = String.valueOf(1);
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(i2);
        this.A0a.Blw(r1);
    }

    public boolean A0V(int i) {
        if (!this.A0Y.A2R(i)) {
            return false;
        }
        C36341k9.A16(this.A04, i);
        return true;
    }

    public void BUP(AnonymousClass3K7 r5) {
        int A032 = this.A0X.A03(true);
        C36341k9.A17(this.A03, A032);
        if (A032 == 0 || A032 == 2) {
            C109815Zf r1 = (C109815Zf) this.A08.A04();
            if (r1 instanceof C101944yX) {
                int i = ((C101944yX) r1).A00;
                if (i == 0) {
                    this.A0W.Bah(0, 0);
                } else if (i == 6 || i == 7) {
                    this.A0W.BRw(0, 0);
                }
            }
        }
    }
}
