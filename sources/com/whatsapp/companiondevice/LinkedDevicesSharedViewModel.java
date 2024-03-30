package com.whatsapp.companiondevice;

import X.AnonymousClass08X;
import X.AnonymousClass17Y;
import X.AnonymousClass192;
import X.AnonymousClass196;
import X.AnonymousClass1AB;
import X.AnonymousClass3EC;
import X.AnonymousClass3K7;
import X.AnonymousClass411;
import X.AnonymousClass4YH;
import X.AnonymousClass751;
import X.C001700s;
import X.C19420v0;
import X.C19460v5;
import X.C19600wD;
import X.C19680wL;
import X.C19770wU;
import X.C20810yC;
import X.C21100yf;
import X.C231517j;
import X.C236419g;
import X.C236919l;
import X.C25701Hi;
import X.C25711Hj;
import X.C28201Rs;
import X.C31651cA;
import X.C36341k9;
import X.C36431kI;
import X.C36441kJ;
import X.C51192nQ;
import X.C90024Yu;
import android.app.Application;
import com.whatsapp.R;

public class LinkedDevicesSharedViewModel extends AnonymousClass08X {
    public C51192nQ A00;
    public Boolean A01;
    public Runnable A02;
    public boolean A03;
    public final Application A04;
    public final C001700s A05 = C36431kI.A0S();
    public final C19460v5 A06;
    public final AnonymousClass17Y A07;
    public final C21100yf A08;
    public final C31651cA A09;
    public final AnonymousClass196 A0A;
    public final AnonymousClass1AB A0B;
    public final C19680wL A0C = new AnonymousClass4YH(this, 1);
    public final C19600wD A0D;
    public final C19420v0 A0E;
    public final AnonymousClass192 A0F = new C90024Yu(this, 1);
    public final C236419g A0G;
    public final C25701Hi A0H;
    public final C236919l A0I;
    public final AnonymousClass3EC A0J;
    public final C28201Rs A0K = C36441kJ.A0t();
    public final C28201Rs A0L = C36441kJ.A0t();
    public final C28201Rs A0M = C36441kJ.A0t();
    public final C28201Rs A0N = C36441kJ.A0t();
    public final C28201Rs A0O = C36441kJ.A0t();
    public final C28201Rs A0P = C36441kJ.A0t();
    public final C28201Rs A0Q = C36441kJ.A0t();
    public final C28201Rs A0R = C36441kJ.A0t();
    public final C28201Rs A0S = C36441kJ.A0t();
    public final C28201Rs A0T = C36441kJ.A0t();
    public final C28201Rs A0U = C36441kJ.A0t();
    public final C19770wU A0V;
    public final C25711Hj A0W = new AnonymousClass411(this, 5);
    public final C19460v5 A0X;
    public final C231517j A0Y;
    public final C20810yC A0Z;

    public void A0S() {
        Boolean valueOf;
        this.A0H.A05(this.A0W, this.A07.A04);
        C19600wD r2 = this.A0D;
        r2.registerObserver(this.A0C);
        this.A0G.registerObserver(this.A0F);
        AnonymousClass3K7 A052 = r2.A05();
        if (A052 == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(A052.A05);
        }
        this.A01 = valueOf;
    }

    public void A0U(String str) {
        if (!this.A0D.A09()) {
            C36341k9.A16(this.A0L, R.string.f12nameremoved);
            return;
        }
        this.A03 = true;
        C36341k9.A18(this.A05, true);
        this.A0V.Boy(new AnonymousClass751(this, str));
    }

    public void A0V(boolean z) {
        C28201Rs r1;
        Integer num;
        if (!this.A0D.A09()) {
            boolean A022 = C19600wD.A02(this.A04);
            r1 = this.A0L;
            int i = R.string.f12nameremoved;
            if (A022) {
                i = R.string.f12nameremoved;
            }
            num = Integer.valueOf(i);
        } else {
            if (this.A08.A09(C21100yf.A0V) && z) {
                r1 = this.A0Q;
            } else if (this.A00 != C51192nQ.PHONE_NUMBER_AND_CODE || !this.A09.A01()) {
                r1 = this.A0S;
            } else {
                r1 = this.A0R;
            }
            num = null;
        }
        r1.A0D(num);
    }

    public LinkedDevicesSharedViewModel(Application application, C19460v5 r5, C19460v5 r6, AnonymousClass17Y r7, C21100yf r8, C31651cA r9, AnonymousClass196 r10, AnonymousClass1AB r11, C19600wD r12, C19420v0 r13, C236419g r14, C231517j r15, C25701Hi r16, C20810yC r17, C236919l r18, AnonymousClass3EC r19, C19770wU r20) {
        super(application);
        this.A0Z = r17;
        this.A07 = r7;
        this.A0V = r20;
        this.A04 = application;
        this.A08 = r8;
        this.A0A = r10;
        this.A0Y = r15;
        this.A0B = r11;
        this.A0I = r18;
        this.A0E = r13;
        this.A0G = r14;
        this.A0J = r19;
        this.A0H = r16;
        this.A0D = r12;
        this.A0X = r5;
        this.A09 = r9;
        this.A06 = r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(X.C51192nQ r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LinkedDevicesSharedViewModel/onLinkNewDeviceClicked devicePairFlowType: "
            X.C36321k7.A1K(r11, r0, r1)
            X.19l r0 = r10.A0I
            X.0v0 r1 = r0.A01
            boolean r0 = r1.A2H()
            if (r0 == 0) goto L_0x001b
            if (r12 < r13) goto L_0x001b
            X.1Rs r0 = r10.A0O
            X.C36341k9.A16(r0, r13)
        L_0x001a:
            return
        L_0x001b:
            r10.A00 = r11
            boolean r0 = r1.A2H()
            if (r0 == 0) goto L_0x007b
            X.0wD r0 = r10.A0D
            r1 = 1
            int r0 = r0.A03(r1)
            if (r0 == r1) goto L_0x007b
            X.0v0 r0 = r10.A0E
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "md_initial_sync_estimate_bytes"
            long r2 = X.C36371kC.A08(r1, r0)
            r4 = 0
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x004f
            long r6 = r2 / r8
            X.0yf r1 = r10.A08
            X.0yh r0 = X.C21100yf.A1w
            int r0 = r1.A04(r0)
            long r4 = (long) r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x007b
        L_0x004f:
            X.1Rs r1 = r10.A0P
            r0 = 0
            r1.A0D(r0)
            X.1AB r4 = r10.A0B
            long r0 = r2 / r8
            long r2 = java.lang.Math.min(r2, r0)
            X.2Nj r1 = new X.2Nj
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.0yW r0 = r4.A06
            r0.Bly(r1)
        L_0x006d:
            X.2nQ r0 = X.C51192nQ.QR_CODE
            if (r11 != r0) goto L_0x001a
            X.3EC r1 = r10.A0J
            X.2Oc r0 = new X.2Oc
            r0.<init>()
            r1.A01 = r0
            return
        L_0x007b:
            r10.A0V(r14)
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDevicesSharedViewModel.A0T(X.2nQ, int, int, boolean):void");
    }
}
