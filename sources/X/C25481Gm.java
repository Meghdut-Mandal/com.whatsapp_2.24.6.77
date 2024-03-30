package X;

import android.os.PowerManager;
import com.whatsapp.Mp4Ops;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1Gm  reason: invalid class name and case insensitive filesystem */
public final class C25481Gm {
    public PowerManager.WakeLock A00;
    public final C21060yb A01;
    public final C19700wN A02;
    public final C20690y0 A03;
    public final Mp4Ops A04;
    public final C24041Av A05;
    public final AnonymousClass1AV A06;
    public final C24341Cb A07;
    public final C19630wG A08;
    public final C19420v0 A09;
    public final C20060wx A0A;
    public final C21350z4 A0B;
    public final AnonymousClass1DF A0C;
    public final C20810yC A0D;
    public final C21010yW A0E;
    public final C25521Gq A0F;
    public final AnonymousClass1EJ A0G;
    public final C25501Go A0H;
    public final C25531Gr A0I;
    public final AnonymousClass1GJ A0J;
    public final C25511Gp A0K;
    public final WebpUtils A0L;
    public final AnonymousClass1B0 A0M;
    public final C24051Aw A0N;
    public final AnonymousClass1GX A0O;
    public final AnonymousClass1DC A0P;
    public final C19770wU A0Q;

    public final AnonymousClass75H A00(AnonymousClass64a r37) {
        PowerManager.WakeLock wakeLock;
        AnonymousClass64a r7 = r37;
        synchronized (this) {
            if (this.A00 == null) {
                PowerManager A0G2 = this.A01.A0G();
                if (A0G2 != null) {
                    this.A00 = C111765co.A00(A0G2, "mediatranscode", 1);
                } else {
                    Log.w("media-transcode-queue/get-transcode-wakelock pm=null");
                }
            }
            wakeLock = this.A00;
        }
        if (r7 instanceof AnonymousClass5BX) {
            C19630wG r14 = this.A08;
            C19770wU r13 = this.A0Q;
            Mp4Ops mp4Ops = this.A04;
            C20810yC r11 = this.A0D;
            C19700wN r10 = this.A02;
            C20690y0 r9 = this.A03;
            AnonymousClass1GJ r6 = this.A0J;
            AnonymousClass1AV r5 = this.A06;
            C21350z4 r4 = this.A0B;
            C24341Cb r3 = this.A07;
            AnonymousClass1DC r2 = this.A0P;
            return new C104785Bj(wakeLock, r10, r9, mp4Ops, r5, r3, r14, this.A09, r4, r11, this.A0E, (AnonymousClass5BX) r7, r6, this.A0K, r2, r13);
        } else if (r7 instanceof AnonymousClass5BY) {
            C19630wG r21 = this.A08;
            C19770wU r16 = this.A0Q;
            Mp4Ops mp4Ops2 = this.A04;
            C20810yC r25 = this.A0D;
            C19700wN r142 = this.A02;
            C20690y0 r132 = this.A03;
            C21010yW r12 = this.A0E;
            AnonymousClass1GX r112 = this.A0O;
            AnonymousClass1GJ r102 = this.A0J;
            AnonymousClass1AV r92 = this.A06;
            C21350z4 r62 = this.A0B;
            AnonymousClass1DF r52 = this.A0C;
            C24341Cb r42 = this.A07;
            AnonymousClass1DC r32 = this.A0P;
            C19420v0 r22 = this.A09;
            C24051Aw r1 = this.A0N;
            C25511Gp r0 = this.A0K;
            C19770wU r34 = r16;
            return new C104805Bl(wakeLock, r142, r132, mp4Ops2, r92, r42, r21, r22, r62, r52, r25, r12, this.A0G, (AnonymousClass5BY) r7, r102, r0, r1, r112, r32, r34);
        } else if (r7 instanceof AnonymousClass5BU) {
            C19630wG r43 = this.A08;
            return new C104765Bh(wakeLock, this.A02, this.A03, this.A06, r43, (AnonymousClass5BU) r7, this.A0P);
        } else if (r7 instanceof AnonymousClass5BV) {
            C20810yC r103 = this.A0D;
            C19700wN r93 = this.A02;
            C20060wx r63 = this.A0A;
            AnonymousClass1GX r53 = this.A0O;
            C21060yb r44 = this.A01;
            AnonymousClass1DF r33 = this.A0C;
            C25501Go r23 = this.A0H;
            return new C104795Bk(wakeLock, r93, r44, r63, r33, r103, this.A0F, this.A0G, r23, (AnonymousClass5BV) r7, r53);
        } else if (r7 instanceof AnonymousClass5BW) {
            C19700wN r64 = this.A02;
            WebpUtils webpUtils = this.A0L;
            C20690y0 r45 = this.A03;
            C21060yb r35 = this.A01;
            return new C104775Bi(r64, r45, this.A05, r35, this.A0I, (AnonymousClass5BW) r7, webpUtils, this.A0M);
        } else if (r7 instanceof AnonymousClass5BT) {
            return new C104755Bg(this.A01, (AnonymousClass5BT) r7);
        } else {
            throw new AssertionError("Unreachable code");
        }
    }

    public C25481Gm(C19700wN r27, C20690y0 r28, Mp4Ops mp4Ops, C24041Av r30, AnonymousClass1AV r31, C24341Cb r32, C21060yb r33, C19630wG r34, C19420v0 r35, C20060wx r36, C21350z4 r37, AnonymousClass1DF r38, C20810yC r39, C21010yW r40, C25521Gq r41, AnonymousClass1EJ r42, C25501Go r43, C25531Gr r44, AnonymousClass1GJ r45, C25511Gp r46, WebpUtils webpUtils, AnonymousClass1B0 r48, C24051Aw r49, AnonymousClass1GX r50, AnonymousClass1DC r51, C19770wU r52) {
        C19630wG r18 = r34;
        AnonymousClass00C.A0D(r18, 1);
        C19770wU r15 = r52;
        AnonymousClass00C.A0D(r15, 2);
        Mp4Ops mp4Ops2 = mp4Ops;
        AnonymousClass00C.A0D(mp4Ops2, 3);
        C20810yC r14 = r39;
        AnonymousClass00C.A0D(r14, 4);
        C19700wN r25 = r27;
        AnonymousClass00C.A0D(r25, 5);
        WebpUtils webpUtils2 = webpUtils;
        AnonymousClass00C.A0D(webpUtils2, 6);
        C20690y0 r24 = r28;
        AnonymousClass00C.A0D(r24, 7);
        C21010yW r12 = r40;
        AnonymousClass00C.A0D(r12, 8);
        C20060wx r16 = r36;
        AnonymousClass00C.A0D(r16, 9);
        AnonymousClass1GX r3 = r50;
        AnonymousClass00C.A0D(r3, 10);
        C21060yb r19 = r33;
        AnonymousClass00C.A0D(r19, 11);
        AnonymousClass1GJ r6 = r45;
        AnonymousClass00C.A0D(r6, 12);
        AnonymousClass1AV r21 = r31;
        AnonymousClass00C.A0D(r21, 13);
        C21350z4 r11 = r37;
        AnonymousClass00C.A0D(r11, 14);
        AnonymousClass1DF r10 = r38;
        AnonymousClass00C.A0D(r10, 15);
        C24341Cb r20 = r32;
        AnonymousClass00C.A0D(r20, 17);
        AnonymousClass1DC r2 = r51;
        AnonymousClass00C.A0D(r2, 18);
        C19420v0 r17 = r35;
        AnonymousClass00C.A0D(r17, 19);
        C24051Aw r4 = r49;
        AnonymousClass00C.A0D(r4, 20);
        C25501Go r7 = r43;
        AnonymousClass00C.A0D(r7, 21);
        C25511Gp r5 = r46;
        AnonymousClass00C.A0D(r5, 22);
        AnonymousClass1EJ r8 = r42;
        AnonymousClass00C.A0D(r8, 23);
        C24041Av r22 = r30;
        AnonymousClass00C.A0D(r22, 24);
        C25521Gq r9 = r41;
        AnonymousClass00C.A0D(r9, 25);
        this.A08 = r18;
        this.A0Q = r15;
        this.A04 = mp4Ops2;
        this.A0D = r14;
        this.A02 = r25;
        this.A0L = webpUtils2;
        this.A03 = r24;
        this.A0E = r12;
        this.A0A = r16;
        this.A0O = r3;
        this.A01 = r19;
        this.A0J = r6;
        this.A06 = r21;
        this.A0B = r11;
        this.A0C = r10;
        this.A0M = r48;
        this.A07 = r20;
        this.A0P = r2;
        this.A09 = r17;
        this.A0N = r4;
        this.A0H = r7;
        this.A0K = r5;
        this.A0G = r8;
        this.A05 = r22;
        this.A0F = r9;
        this.A0I = r44;
    }
}
