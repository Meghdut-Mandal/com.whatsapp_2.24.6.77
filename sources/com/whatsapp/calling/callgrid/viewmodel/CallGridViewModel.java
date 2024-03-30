package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass004;
import X.AnonymousClass00C;
import X.AnonymousClass04S;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass1C6;
import X.AnonymousClass1PZ;
import X.AnonymousClass53T;
import X.AnonymousClass6EE;
import X.AnonymousClass6ND;
import X.AnonymousClass6OZ;
import X.AnonymousClass711;
import X.AnonymousClass798;
import X.C001700s;
import X.C105545Fb;
import X.C108275Sw;
import X.C116965lU;
import X.C119385pj;
import X.C123235wA;
import X.C124545yN;
import X.C1258961t;
import X.C1269766l;
import X.C129066Eu;
import X.C131176Oa;
import X.C145156tR;
import X.C1493670y;
import X.C1501574e;
import X.C18740tg;
import X.C1901797e;
import X.C19630wG;
import X.C19730wQ;
import X.C19770wU;
import X.C19930wk;
import X.C20350xQ;
import X.C20810yC;
import X.C24801Dv;
import X.C25841Hw;
import X.C28201Rs;
import X.C34831hi;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import X.C61693Db;
import X.C90474aD;
import X.C90494aF;
import X.C90504aG;
import X.C90524aI;
import X.C95504lc;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import android.util.Rational;
import com.whatsapp.R;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class CallGridViewModel extends C95504lc {
    public int A00;
    public Rect A01;
    public Handler A02;
    public AnonymousClass141 A03;
    public UserJid A04;
    public UserJid A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public Rational A0E;
    public AnonymousClass04S A0F;
    public final C001700s A0G = C36441kJ.A0Z(C36411kG.A0t());
    public final C001700s A0H = C36441kJ.A0Z(new C119385pj());
    public final C001700s A0I = C36441kJ.A0Z((Object) null);
    public final C001700s A0J;
    public final C001700s A0K = C36441kJ.A0Z((Object) null);
    public final C001700s A0L;
    public final C001700s A0M;
    public final C001700s A0N;
    public final C001700s A0O = C36441kJ.A0Z(new C124545yN());
    public final C19730wQ A0P;
    public final C105545Fb A0Q;
    public final C123235wA A0R;
    public final AnonymousClass6ND A0S;
    public final AnonymousClass1PZ A0T;
    public final C131176Oa A0U;
    public final AnonymousClass798 A0V;
    public final AnonymousClass53T A0W;
    public final C1258961t A0X = new C1258961t();
    public final AnonymousClass711 A0Y;
    public final AnonymousClass16D A0Z;
    public final AnonymousClass171 A0a;
    public final AnonymousClass17X A0b;
    public final C25841Hw A0c;
    public final C20810yC A0d;
    public final C20350xQ A0e;
    public final AnonymousClass1C6 A0f;
    public final C34831hi A0g;
    public final C34831hi A0h;
    public final C34831hi A0i;
    public final C34831hi A0j;
    public final C34831hi A0k;
    public final C34831hi A0l = C36441kJ.A0s(true);
    public final C34831hi A0m;
    public final C34831hi A0n = C36441kJ.A0s(false);
    public final C34831hi A0o = C36441kJ.A0s(false);
    public final C34831hi A0p;
    public final C34831hi A0q;
    public final C34831hi A0r;
    public final C34831hi A0s;
    public final C34831hi A0t;
    public final C28201Rs A0u;
    public final C28201Rs A0v;
    public final C28201Rs A0w;
    public final C19770wU A0x;
    public final VoipCameraManager A0y;
    public final LinkedHashMap A0z;
    public final AnonymousClass004 A10;
    public final AnonymousClass004 A11;
    public final AnonymousClass004 A12;
    public final boolean A13;
    public final C24801Dv A14;
    public final C61693Db A15;
    public final C145156tR A16;
    public final C19630wG A17;
    public final AnonymousClass13J A18;

    public void A0T(int i, int i2) {
        Rect rect = new Rect(0, i, 0, i2);
        if (!C1901797e.A00(this.A01, rect)) {
            this.A01 = rect;
            this.A0r.A0D(rect);
        }
    }

    public static int A06(AnonymousClass6EE r2) {
        if (r2.A0C) {
            return 2;
        }
        if (r2.A0G) {
            return 3;
        }
        int i = r2.A06;
        if (i == 2) {
            return 9;
        }
        if (r2.A0F) {
            return 5;
        }
        if (AnonymousClass000.A1S(i, 6)) {
            return 7;
        }
        return 0;
    }

    public static Bitmap A07(CallGridViewModel callGridViewModel, UserJid userJid, boolean z) {
        Bitmap bitmap;
        if (z && callGridViewModel.A07 && (bitmap = callGridViewModel.A0R.A00) != null) {
            return bitmap;
        }
        C123235wA r1 = callGridViewModel.A0R;
        AnonymousClass00C.A0D(userJid, 0);
        if (((Set) C36381kD.A0p(r1.A03)).contains(userJid)) {
            return (Bitmap) r1.A01.get(userJid);
        }
        return null;
    }

    private Point A08(AnonymousClass6EE r5) {
        int i;
        int i2;
        int i3;
        if (r5.A0J) {
            VoipCameraManager voipCameraManager = this.A0y;
            Point adjustedCameraPreviewSize = voipCameraManager.getAdjustedCameraPreviewSize(C1493670y.A00);
            if (adjustedCameraPreviewSize != null || !AnonymousClass000.A1S(r5.A06, 6)) {
                return adjustedCameraPreviewSize;
            }
            return voipCameraManager.lastAdjustedCameraPreviewSize;
        }
        int i4 = 0;
        if (r5.A0K && (i3 = this.A00) >= 0) {
            i4 = i3 * 90;
        }
        if (((((r5.A05 * 90) - i4) + 360) % 360) % 180 != 0) {
            i = r5.A04;
            i2 = r5.A07;
        } else {
            i = r5.A07;
            i2 = r5.A04;
        }
        return new Point(i, i2);
    }

    private Rational A0A(AnonymousClass6EE r6) {
        Rational rational;
        Point A082;
        if (r6 == null || (A082 = A08(r6)) == null) {
            rational = null;
        } else {
            rational = new Rational(A082.x, A082.y);
        }
        Rational rational2 = this.A0E;
        C18740tg.A07(rational2, "CallGridViewModel/getPictureInPictureTargetSize defaultPipSize cannot be null");
        if (rational == null) {
            rational = rational2;
        }
        Rational rational3 = new Rational(100, 239);
        Rational rational4 = new Rational(239, 100);
        if (rational.compareTo(rational3) < 0) {
            C36321k7.A1L(rational, "CallGridViewModel/getPictureInPictureTargetSize aspect ratio too small ", AnonymousClass000.A0u());
            rational = rational3;
        }
        if (rational.compareTo(rational4) <= 0) {
            return rational;
        }
        C36321k7.A1L(rational, "CallGridViewModel/getPictureInPictureTargetSize aspect ratio too large ", AnonymousClass000.A0u());
        return rational4;
    }

    public static void A0C(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth() / 40;
            int i = 8;
            if (width >= 8) {
                i = Math.min(width, 16);
            }
            FilterUtils.blurNative(bitmap, i, 2);
            return;
        }
        Log.i("voip/CallGridViewModel/cacheLastFrame no bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.AnonymousClass000.A1S(r8.A06, 6) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0D(X.AnonymousClass6EE r8) {
        /*
            r7 = this;
            X.5pj r5 = new X.5pj
            r5.<init>()
            boolean r0 = r8.A0J
            if (r0 == 0) goto L_0x0016
            int r1 = r8.A06
            r0 = 6
            boolean r2 = X.AnonymousClass000.A1S(r1, r0)
            r1 = 9
            r0 = 16
            if (r2 == 0) goto L_0x0018
        L_0x0016:
            r1 = 5
            r0 = 7
        L_0x0018:
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>(r1, r0)
            int r1 = r8.A06
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 != 0) goto L_0x0046
            boolean r0 = r8.A0I
            if (r0 != 0) goto L_0x0046
            android.graphics.Point r0 = r7.A08(r8)
            if (r0 == 0) goto L_0x0046
            int r4 = r0.x
            float r3 = (float) r4
            int r2 = r0.y
            float r0 = (float) r2
            float r3 = r3 / r0
            int r0 = r6.x
            float r1 = (float) r0
            int r0 = r6.y
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
            r6.x = r4
            r6.y = r2
        L_0x0046:
            int r0 = r6.x
            r5.A01 = r0
            int r0 = r6.y
            r5.A00 = r0
            X.00s r0 = r7.A0H
            r0.A0D(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0D(X.6EE):void");
    }

    private void A0E(AnonymousClass6EE r4) {
        if (C36351kA.A1W(this.A0o) && A0B(this.A0Q.A05()).size() <= 2) {
            if (r4.A0J) {
                this.A0m.A0D(this.A0k.A04());
                return;
            }
            Point A082 = A08(r4);
            if (A082 != null) {
                C36341k9.A18(this.A0m, C90474aD.A1T(A082.x, A082.y));
            }
        }
    }

    public static void A0F(AnonymousClass6EE r4, CallGridViewModel callGridViewModel) {
        C001700s r3 = callGridViewModel.A0O;
        C124545yN r2 = (C124545yN) C90524aI.A0c(r3);
        Point A082 = callGridViewModel.A08(r4);
        if (A082 != null) {
            r2.A05 = A082.x;
            r2.A03 = A082.y;
            r3.A0D(r2);
        }
    }

    public static void A0G(AnonymousClass6OZ r7, CallGridViewModel callGridViewModel) {
        if (!callGridViewModel.A08) {
            C34831hi r6 = callGridViewModel.A0q;
            Object A042 = r6.A04();
            C108275Sw A0S2 = callGridViewModel.A0S(r7);
            C108275Sw r1 = C108275Sw.NONE;
            boolean A1W = C36371kC.A1W(A042, r1);
            boolean A1W2 = C36371kC.A1W(A0S2, r1);
            if (A1W != A1W2) {
                C001700s r2 = callGridViewModel.A0O;
                C124545yN r12 = (C124545yN) C90524aI.A0c(r2);
                int i = R.dimen.f7nameremoved;
                if (A1W2) {
                    i = R.dimen.f7nameremoved;
                }
                r12.A01 = i;
                r2.A0D(r12);
            }
            if (A0S2 != A042) {
                r6.A0D(A0S2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: X.6EE[][]} */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02c3, code lost:
        if (r8.equals(r12.A05) == false) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02e3, code lost:
        if (X.C90494aF.A1U(r1, r8) == false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x038c, code lost:
        if (r17 >= -1) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03c6, code lost:
        if (r4 == 2) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03d2, code lost:
        if (r20 != false) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03eb, code lost:
        if (r9.A0B != false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0438, code lost:
        if (r5 >= r0) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x044f, code lost:
        if (r0 == false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x045e, code lost:
        if (r2 == null) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x046c, code lost:
        if (r12.A07 != false) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x047e, code lost:
        if (r32 == 1) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x04bd, code lost:
        if (r6 == false) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x050b, code lost:
        if (r9.A01 == 2) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0525, code lost:
        if (r2 != 4) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x05c4, code lost:
        if (r26 == false) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0602, code lost:
        if (r11 == false) goto L_0x0604;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0919, code lost:
        if (r2 <= X.C36381kD.A04(r17)) goto L_0x091b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x062b A[LOOP:6: B:384:0x0625->B:386:0x062b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x064e A[LOOP:7: B:394:0x0648->B:396:0x064e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x065e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x07df  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x086b  */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x08da  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x095f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:562:0x096c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:566:0x0975  */
    /* JADX WARNING: Removed duplicated region for block: B:575:0x0993  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:589:0x09d8  */
    /* JADX WARNING: Removed duplicated region for block: B:592:0x09e5  */
    /* JADX WARNING: Removed duplicated region for block: B:595:0x09ec  */
    /* JADX WARNING: Removed duplicated region for block: B:596:0x09fb  */
    /* JADX WARNING: Removed duplicated region for block: B:608:0x00e2 A[EDGE_INSN: B:608:0x00e2->B:44:0x00e2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:650:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(X.AnonymousClass6OZ r34, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r35, boolean r36) {
        /*
            r12 = r35
            X.1hi r1 = r12.A0p
            r13 = r34
            boolean r0 = r13.A0E
            r21 = r0
            X.C36341k9.A18(r1, r0)
            if (r0 == 0) goto L_0x0013
            boolean r0 = r12 instanceof com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel
            if (r0 == 0) goto L_0x09fa
        L_0x0013:
            boolean r0 = r12 instanceof com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel
            r29 = r0
            if (r0 == 0) goto L_0x00a8
            r1 = r12
            com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel) r1
            com.whatsapp.voipcalling.CallState r2 = r13.A09
            X.AnonymousClass00C.A07(r2)
            X.7K0 r0 = new X.7K0
            r0.<init>(r1)
            X.00U r1 = X.C36431kI.A1I(r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r2 == r0) goto L_0x0074
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r2 == r0) goto L_0x0074
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r2 != r0) goto L_0x00a8
            java.lang.Object r0 = r1.getValue()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x00a8
            X.0wy r0 = r13.A04
            X.AnonymousClass00C.A07(r0)
            java.util.LinkedHashMap r15 = X.C36431kI.A1G()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0051:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r3)
            java.lang.Object r0 = r2.getValue()
            X.6EE r0 = (X.AnonymousClass6EE) r0
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x0070
            java.lang.Object r0 = r2.getValue()
            X.6EE r0 = (X.AnonymousClass6EE) r0
            int r1 = r0.A02
            r0 = 1
            if (r1 != r0) goto L_0x0051
        L_0x0070:
            X.C36411kG.A1T(r15, r2)
            goto L_0x0051
        L_0x0074:
            X.0wy r0 = r13.A04
            X.AnonymousClass00C.A07(r0)
            java.util.LinkedHashMap r15 = X.C36431kI.A1G()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0085:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r3)
            java.lang.Object r0 = r2.getValue()
            X.6EE r0 = (X.AnonymousClass6EE) r0
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x0085
            java.lang.Object r0 = r2.getValue()
            X.6EE r0 = (X.AnonymousClass6EE) r0
            int r1 = r0.A02
            r0 = 1
            if (r1 != r0) goto L_0x0085
            X.C36411kG.A1T(r15, r2)
            goto L_0x0085
        L_0x00a8:
            java.util.LinkedHashMap r15 = A0B(r13)
        L_0x00ac:
            int r2 = r15.size()
            X.0yC r0 = r12.A0d
            r35 = r0
            r1 = 5055(0x13bf, float:7.084E-42)
            boolean r1 = r0.A0E(r1)
            r0 = 2
            if (r1 == 0) goto L_0x00be
            r0 = 3
        L_0x00be:
            boolean r11 = r13.A0N
            if (r11 != 0) goto L_0x00e3
            if (r2 > r0) goto L_0x00e3
            if (r21 != 0) goto L_0x00e3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r15)
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r15)
        L_0x00cf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e2
            X.6EE r1 = X.C90524aI.A0J(r2)
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x00cf
            com.whatsapp.jid.UserJid r0 = r1.A08
            r3.remove(r0)
        L_0x00e2:
            r15 = r3
        L_0x00e3:
            com.whatsapp.voipcalling.CallState r0 = r13.A09
            r34 = r0
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            r30 = 0
            if (r0 == r1) goto L_0x010f
            X.1hi r3 = r12.A0g
            java.lang.Object r0 = r3.A04()
            X.69u r0 = (X.C1278269u) r0
            int r0 = r0.A00
            r2 = 8
            if (r0 != r2) goto L_0x0105
            java.lang.Object r0 = r3.A04()
            X.69u r0 = (X.C1278269u) r0
            android.graphics.Bitmap r0 = r0.A01
            if (r0 == 0) goto L_0x010f
        L_0x0105:
            X.69u r1 = new X.69u
            r0 = r30
            r1.<init>(r2, r0)
            r3.A0D(r1)
        L_0x010f:
            X.1hi r0 = r12.A0n
            r33 = r0
            boolean r0 = X.C36351kA.A1W(r33)
            if (r11 == r0) goto L_0x0130
            X.5wA r1 = r12.A0R
            java.util.Map r0 = r1.A01
            r0.clear()
            java.util.Set r0 = r1.A02
            r0.clear()
            X.00T r0 = r1.A03
            java.lang.Object r0 = X.C36381kD.A0p(r0)
            java.util.Set r0 = (java.util.Set) r0
            r0.clear()
        L_0x0130:
            r0 = r30
            r12.A04 = r0
            X.13J r0 = r12.A18
            boolean r0 = r0.BN6()
            if (r0 == 0) goto L_0x0152
            java.util.Iterator r2 = X.C36391kE.A10(r15)
        L_0x0140:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0152
            X.6EE r1 = X.C90524aI.A0J(r2)
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x0140
            com.whatsapp.jid.UserJid r0 = r1.A08
            r12.A04 = r0
        L_0x0152:
            int r2 = r15.size()
            boolean r0 = r13.A0K
            r31 = r0
            com.whatsapp.jid.UserJid r0 = r12.A04
            r1 = 0
            if (r0 == 0) goto L_0x0235
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x0169
            X.53T r0 = r12.A0W
            com.whatsapp.jid.UserJid r1 = r0.A0S()
        L_0x0169:
            r12.A05 = r1
        L_0x016b:
            A0G(r13, r12)
            r4 = 0
            r10 = 1
            if (r11 == 0) goto L_0x0268
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r7 = X.C36391kE.A10(r15)
        L_0x017a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x024e
            X.6EE r1 = X.C90524aI.A0J(r7)
            boolean r2 = r1.A0J
            if (r2 == 0) goto L_0x022d
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r12.A0y
            X.5xS r0 = r0.getLastCachedFrame()
            if (r0 == 0) goto L_0x0233
        L_0x0190:
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x0233
            int r3 = r1.A06
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r3, r0)
            if (r0 != 0) goto L_0x01ba
            r0 = 2
            if (r3 == r0) goto L_0x01ba
            if (r2 == 0) goto L_0x01b2
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x01ba
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r12.A0y
            boolean r0 = r0.isCameraOpen()
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r12.A07
            if (r0 != 0) goto L_0x01ba
        L_0x01b2:
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x01ba
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0233
        L_0x01ba:
            r0 = 1
        L_0x01bb:
            X.5wA r2 = r12.A0R
            if (r0 == 0) goto L_0x0211
            com.whatsapp.jid.UserJid r6 = r1.A08
            X.AnonymousClass00C.A0D(r6, r4)
            X.00T r3 = r2.A03
            java.lang.Object r0 = X.C36381kD.A0p(r3)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x01ee
            java.util.Map r0 = r2.A01
            r0.remove(r6)
            java.util.Set r0 = r2.A02
            r0.remove(r6)
            java.lang.Object r0 = X.C36381kD.A0p(r3)
            java.util.Set r0 = (java.util.Set) r0
            r0.remove(r6)
            java.lang.Object r0 = X.C36381kD.A0p(r3)
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r6)
        L_0x01ee:
            java.lang.Object r0 = X.C36381kD.A0p(r3)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x020c
            java.util.Map r0 = r2.A01
            boolean r0 = r0.containsKey(r6)
            if (r0 != 0) goto L_0x017a
            java.util.Set r0 = r2.A02
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x020c
            goto L_0x017a
        L_0x020c:
            r5.add(r1)
            goto L_0x017a
        L_0x0211:
            com.whatsapp.jid.UserJid r1 = r1.A08
            X.AnonymousClass00C.A0D(r1, r4)
            java.util.Map r0 = r2.A01
            r0.remove(r1)
            java.util.Set r0 = r2.A02
            r0.remove(r1)
            X.00T r0 = r2.A03
            java.lang.Object r0 = X.C36381kD.A0p(r0)
            java.util.Set r0 = (java.util.Set) r0
            r0.remove(r1)
            goto L_0x017a
        L_0x022d:
            boolean r0 = r1.A0O
            if (r0 == 0) goto L_0x0233
            goto L_0x0190
        L_0x0233:
            r0 = 0
            goto L_0x01bb
        L_0x0235:
            if (r31 == 0) goto L_0x023d
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x023d
            goto L_0x0169
        L_0x023d:
            com.whatsapp.jid.UserJid r0 = r12.A05
            if (r0 == 0) goto L_0x0244
            r0 = 2
            if (r2 <= r0) goto L_0x016b
        L_0x0244:
            X.53T r0 = r12.A0W
            com.whatsapp.jid.UserJid r0 = r0.A0S()
            r12.A05 = r0
            goto L_0x016b
        L_0x024e:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0268
            X.0wU r3 = r12.A0x
            X.5Ls r2 = new X.5Ls
            r2.<init>(r12)
            X.6EE[][] r1 = new X.AnonymousClass6EE[r10][]
            X.6EE[] r0 = new X.AnonymousClass6EE[r4]
            java.lang.Object[] r0 = r5.toArray(r0)
            r1[r4] = r0
            r3.Bp0(r2, r1)
        L_0x0268:
            java.util.ArrayList r23 = X.AnonymousClass001.A0I()
            java.util.ArrayList r22 = X.AnonymousClass001.A0I()
            java.util.Iterator r28 = X.C36391kE.A10(r15)
        L_0x0274:
            boolean r0 = r28.hasNext()
            if (r0 == 0) goto L_0x05d7
            X.6EE r9 = X.C90524aI.A0J(r28)
            java.util.LinkedHashMap r2 = r12.A0z
            com.whatsapp.jid.UserJid r8 = r9.A08
            boolean r0 = r2.containsKey(r8)
            if (r0 == 0) goto L_0x05ca
            java.lang.Object r0 = X.C90514aH.A0o(r8, r2)
            X.6Eu r0 = (X.C129066Eu) r0
            android.util.Pair r0 = r0.A08
            r27 = r0
        L_0x0292:
            boolean r0 = r2.containsKey(r8)
            if (r0 != 0) goto L_0x029d
            r0 = r22
            r0.add(r8)
        L_0x029d:
            int r1 = r15.size()
            if (r11 == 0) goto L_0x02c5
            if (r31 == 0) goto L_0x02a9
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x02ab
        L_0x02a9:
            if (r1 <= r10) goto L_0x02c5
        L_0x02ab:
            r0 = 4
            if (r1 < r0) goto L_0x02bc
            boolean r0 = r12.A0C
            if (r0 == 0) goto L_0x02c5
            X.0wQ r1 = r12.A0P
            com.whatsapp.jid.UserJid r0 = r12.A04
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x02c5
        L_0x02bc:
            com.whatsapp.jid.UserJid r0 = r12.A05
            boolean r0 = r8.equals(r0)
            r7 = 1
            if (r0 != 0) goto L_0x02c6
        L_0x02c5:
            r7 = 0
        L_0x02c6:
            int r0 = r15.size()
            boolean r0 = r12.A0M(r0)
            if (r0 != 0) goto L_0x02d2
            if (r31 == 0) goto L_0x02e5
        L_0x02d2:
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x02e5
            X.00s r1 = r12.A0I
            java.lang.Object r0 = r1.A04()
            if (r0 == 0) goto L_0x02e5
            boolean r0 = X.C90494aF.A1U(r1, r8)
            r6 = 1
            if (r0 != 0) goto L_0x02e6
        L_0x02e5:
            r6 = 0
        L_0x02e6:
            boolean r0 = r13.A0J
            r26 = r0
            int r5 = r15.size()
            X.147 r0 = r13.A06
            r17 = r0
            boolean r0 = r13.A0H
            r25 = r0
            X.16D r0 = r12.A0Z
            X.141 r16 = r0.A0D(r8)
            int r4 = A06(r9)
            int r0 = r9.A06
            r32 = r0
            r1 = 6
            boolean r24 = X.AnonymousClass000.A1S(r0, r1)
            boolean r3 = r9.A0J
            boolean r0 = r12.A08
            r20 = r0
            r2 = 0
            if (r26 != 0) goto L_0x0573
            if (r11 != 0) goto L_0x0573
            if (r0 == 0) goto L_0x0573
        L_0x0316:
            r19 = 1
            if (r11 == 0) goto L_0x0561
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x056f
            boolean r0 = r9.A0F
            if (r0 == 0) goto L_0x056f
            if (r2 != 0) goto L_0x056f
        L_0x0324:
            android.graphics.Bitmap r18 = A07(r12, r8, r3)
            X.6NY r1 = new X.6NY
            r0 = r16
            r1.<init>(r0, r8)
            r1.A0J = r3
            r0 = r27
            r1.A08 = r0
            r1.A0F = r7
            r1.A0B = r6
            r1.A0K = r11
            boolean r0 = r9.A0K
            r1.A0G = r0
            if (r11 != 0) goto L_0x055d
            X.798 r0 = r12.A0V
            r27 = r0
            boolean r0 = r0.A01(r8)
            if (r0 != 0) goto L_0x0379
            r16 = 0
            if (r17 == 0) goto L_0x035f
            X.17X r0 = r12.A0b
            r14 = r17
            X.6PM r0 = r0.A03(r14, r8)
            if (r0 == 0) goto L_0x035f
            int r0 = r0.A00
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
        L_0x035f:
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            if (r16 == 0) goto L_0x0551
            int r14 = r16.intValue()
        L_0x0369:
            java.util.List r0 = X.AnonymousClass798.A00
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0374
            X.C90474aD.A0u()
        L_0x0374:
            r0 = r27
            X.C36341k9.A1K(r8, r0, r14)
        L_0x0379:
            r0 = r27
            java.lang.Integer r0 = r0.A00(r8)
            X.C18740tg.A06(r0)
            int r17 = r0.intValue()
            r16 = 0
            r0 = -1
            r14 = r0
            r0 = r17
            if (r0 < r14) goto L_0x0390
        L_0x038e:
            r16 = 1
        L_0x0390:
            java.lang.String r0 = "colorIndex should be no less than -1"
            r14 = r0
            r0 = r16
            X.C18740tg.A0D(r0, r14)
            r0 = r17
            r1.A02 = r0
            r0 = r26
            r1.A0C = r0
            r14 = 2131103036(0x7f060d3c, float:1.7818527E38)
            if (r19 != 0) goto L_0x03b2
            r14 = 2131103017(0x7f060d29, float:1.7818488E38)
            r0 = 2
            if (r4 == r0) goto L_0x03b2
            r14 = -1
            r0 = 3
            if (r4 != r0) goto L_0x03b2
            r14 = 2131103013(0x7f060d25, float:1.781848E38)
        L_0x03b2:
            r1.A01 = r14
            r0 = r19
            r1.A0U = r0
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1S(r4, r0)
            r1.A0O = r0
            if (r19 != 0) goto L_0x03c8
            r0 = 3
            if (r4 == r0) goto L_0x03c8
            r14 = 0
            r0 = 2
            if (r4 != r0) goto L_0x03c9
        L_0x03c8:
            r14 = 1
        L_0x03c9:
            r1.A0N = r14
            r1.A09 = r2
            if (r26 != 0) goto L_0x03d4
            if (r2 != 0) goto L_0x03d4
            r0 = 1
            if (r20 == 0) goto L_0x03d5
        L_0x03d4:
            r0 = 0
        L_0x03d5:
            r1.A0R = r0
            if (r6 != 0) goto L_0x054e
            if (r20 == 0) goto L_0x03dd
            if (r26 == 0) goto L_0x054e
        L_0x03dd:
            r0 = 1
        L_0x03de:
            r1.A0V = r0
            r16 = 0
            if (r24 != 0) goto L_0x03ed
            if (r25 == 0) goto L_0x03e8
            if (r18 == 0) goto L_0x03ed
        L_0x03e8:
            boolean r4 = r9.A0B
            r0 = 0
            if (r4 == 0) goto L_0x03ee
        L_0x03ed:
            r0 = 1
        L_0x03ee:
            r1.A0A = r0
            int r0 = r12.A00
            int r0 = r0 * -90
            r1.A03 = r0
            r0 = r18
            r1.A07 = r0
            r0 = 1
            if (r11 == 0) goto L_0x054b
            if (r7 == 0) goto L_0x0401
            if (r5 > r10) goto L_0x0403
        L_0x0401:
            if (r6 == 0) goto L_0x054b
        L_0x0403:
            r1.A0P = r0
            r14 = 1
            if (r11 == 0) goto L_0x0538
            boolean r0 = r12.A0M(r5)
            if (r0 != 0) goto L_0x0418
            X.1hi r0 = r12.A0q
            java.lang.Object r0 = r0.A04()
            X.5Sw r4 = X.C108275Sw.NONE
            if (r0 == r4) goto L_0x0548
        L_0x0418:
            r1.A0Q = r14
            boolean r0 = r9.A0E
            r1.A0E = r0
            if (r11 == 0) goto L_0x0424
            if (r24 == 0) goto L_0x0424
            r16 = 1
        L_0x0424:
            r0 = r16
            r1.A0Y = r0
            r4 = 2388(0x954, float:3.346E-42)
            r0 = r35
            int r0 = r0.A07(r4)
            r4 = 1
            if (r11 == 0) goto L_0x0535
            if (r5 < r0) goto L_0x0532
            if (r6 != 0) goto L_0x043a
            r0 = 4
        L_0x0438:
            if (r5 < r0) goto L_0x0532
        L_0x043a:
            r1.A0M = r4
            int r0 = r9.A00
            r1.A05 = r0
            r4 = 1
            if (r5 <= r10) goto L_0x052f
            if (r3 == 0) goto L_0x052b
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r12.A0y
            X.5xS r0 = r0.getLastCachedFrame()
            if (r0 != 0) goto L_0x052f
            boolean r0 = r12.A07
        L_0x044f:
            if (r0 != 0) goto L_0x052f
        L_0x0451:
            r1.A0Z = r4
            boolean r4 = r12.A0A
            r1.A0D = r4
            boolean r0 = r12.A13
            r1.A0L = r0
            if (r4 == 0) goto L_0x0460
            r0 = 1
            if (r2 != 0) goto L_0x0461
        L_0x0460:
            r0 = 0
        L_0x0461:
            r1.A0W = r0
            if (r4 != 0) goto L_0x046e
            if (r11 == 0) goto L_0x046e
            if (r3 == 0) goto L_0x046e
            boolean r2 = r12.A07
            r0 = 1
            if (r2 != 0) goto L_0x046f
        L_0x046e:
            r0 = 0
        L_0x046f:
            r1.A0T = r0
            if (r4 != 0) goto L_0x0528
            if (r11 == 0) goto L_0x0528
            if (r3 != 0) goto L_0x0528
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x0528
            r2 = 1
            r0 = r32
            if (r0 != r10) goto L_0x0528
        L_0x0480:
            r1.A0S = r2
            r2 = 0
            if (r11 == 0) goto L_0x049c
            X.004 r0 = r12.A11
            boolean r0 = X.C90474aD.A1X(r0)
            if (r0 == 0) goto L_0x049c
            r4 = 3153(0xc51, float:4.418E-42)
            r0 = r35
            int r4 = r0.A07(r4)
            r0 = 2
            if (r4 >= r0) goto L_0x049a
            if (r24 != 0) goto L_0x049c
        L_0x049a:
            int r2 = r12.A00
        L_0x049c:
            r1.A06 = r2
            X.6ND r2 = r12.A0S
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            java.util.Set r0 = r2.A03
            boolean r0 = r0.contains(r8)
            r1.A0X = r0
            if (r3 == 0) goto L_0x04bf
            r0 = 2
            if (r5 != r0) goto L_0x04b5
            if (r7 != 0) goto L_0x04b5
            if (r6 == 0) goto L_0x04bf
        L_0x04b5:
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x04bf
            boolean r0 = r12.A0D
            if (r0 != 0) goto L_0x0506
            if (r6 != 0) goto L_0x0511
        L_0x04bf:
            r4 = 0
        L_0x04c0:
            r1.A04 = r4
            if (r29 == 0) goto L_0x0503
            r2 = 0
            r0 = r34
            X.AnonymousClass00C.A0D(r0, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r3 != 0) goto L_0x04dd
            boolean r0 = X.C34681hT.A0N(r35)
            if (r0 == 0) goto L_0x04dd
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.REJOINING
            r0 = r34
            if (r0 != r3) goto L_0x04fb
            r2 = 1060320051(0x3f333333, float:0.7)
        L_0x04dd:
            r1.A00 = r2
            X.6Eu r1 = r1.A00()
            r0 = r23
            r0.add(r1)
            if (r6 == 0) goto L_0x04ef
            r12.A0D(r9)
            r30 = r8
        L_0x04ef:
            if (r7 == 0) goto L_0x04f6
            A0F(r9, r12)
            goto L_0x0274
        L_0x04f6:
            r12.A0E(r9)
            goto L_0x0274
        L_0x04fb:
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r0 != r3) goto L_0x04dd
            r2 = 1050253722(0x3e99999a, float:0.3)
            goto L_0x04dd
        L_0x0503:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x04dd
        L_0x0506:
            if (r6 != 0) goto L_0x0511
            int r2 = r9.A01
            r0 = 2
            if (r2 != r0) goto L_0x04bf
        L_0x050d:
            r4 = 2131234199(0x7f080d97, float:1.8084557E38)
            goto L_0x04c0
        L_0x0511:
            int r2 = r9.A01
            r4 = 2131234196(0x7f080d94, float:1.808455E38)
            if (r2 == r10) goto L_0x04c0
            r0 = 2
            if (r2 == r0) goto L_0x050d
            r4 = 2131234192(0x7f080d90, float:1.8084543E38)
            r0 = 3
            if (r2 == r0) goto L_0x04c0
            r0 = 4
            r4 = 2131234194(0x7f080d92, float:1.8084547E38)
            if (r2 == r0) goto L_0x04c0
            goto L_0x04bf
        L_0x0528:
            r2 = 0
            goto L_0x0480
        L_0x052b:
            boolean r0 = r9.A0O
            goto L_0x044f
        L_0x052f:
            r4 = 0
            goto L_0x0451
        L_0x0532:
            r4 = 0
            goto L_0x043a
        L_0x0535:
            r0 = 3
            goto L_0x0438
        L_0x0538:
            r0 = 1111(0x457, float:1.557E-42)
            r4 = r35
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x0548
            if (r3 != 0) goto L_0x0548
            if (r21 != 0) goto L_0x0548
            goto L_0x0418
        L_0x0548:
            r14 = 0
            goto L_0x0418
        L_0x054b:
            r0 = 0
            goto L_0x0403
        L_0x054e:
            r0 = 0
            goto L_0x03de
        L_0x0551:
            java.util.List r0 = X.AnonymousClass798.A00
            java.lang.Object r0 = X.AnonymousClass03Y.A09(r0)
            int r14 = X.AnonymousClass000.A0I(r0)
            goto L_0x0369
        L_0x055d:
            r17 = -1
            goto L_0x038e
        L_0x0561:
            boolean r0 = r9.A0F
            if (r0 == 0) goto L_0x056f
            r1 = 2
            if (r5 <= r1) goto L_0x0324
            r0 = 3
            if (r4 == r0) goto L_0x056f
            if (r4 == r1) goto L_0x056f
            goto L_0x0324
        L_0x056f:
            r19 = 0
            goto L_0x0324
        L_0x0573:
            r14 = 2
            r1 = 0
            if (r4 != r14) goto L_0x0582
            r0 = 2131896026(0x7f1226da, float:1.9426902E38)
        L_0x057a:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.2ft r2 = X.C90524aI.A0O(r1, r0)
            goto L_0x0316
        L_0x0582:
            r0 = 3
            if (r4 != r0) goto L_0x058e
            r0 = 2131895865(0x7f122639, float:1.9426575E38)
            if (r11 == 0) goto L_0x057a
            r0 = 2131896040(0x7f1226e8, float:1.942693E38)
            goto L_0x057a
        L_0x058e:
            r0 = 9
            if (r4 != r0) goto L_0x0596
            r0 = 2131896038(0x7f1226e6, float:1.9426926E38)
            goto L_0x057a
        L_0x0596:
            r0 = 5
            if (r4 != r0) goto L_0x0316
            if (r7 != 0) goto L_0x0316
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x05c2
            if (r24 != 0) goto L_0x05c2
            if (r5 != r14) goto L_0x05c2
            if (r6 != 0) goto L_0x05c2
            com.whatsapp.jid.UserJid r0 = r12.A04
            if (r0 != 0) goto L_0x05c2
            X.171 r2 = r12.A0a
            r0 = r16
            java.lang.String r2 = X.C36381kD.A0v(r2, r0)
            if (r2 == 0) goto L_0x05c6
            if (r3 != 0) goto L_0x05c6
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r1] = r2
            r1 = 2131896028(0x7f1226dc, float:1.9426906E38)
            X.2ft r2 = X.C90524aI.A0O(r0, r1)
            goto L_0x0316
        L_0x05c2:
            if (r11 != 0) goto L_0x0316
            if (r26 != 0) goto L_0x0316
        L_0x05c6:
            r0 = 2131896036(0x7f1226e4, float:1.9426922E38)
            goto L_0x057a
        L_0x05ca:
            java.lang.Integer r1 = X.C90494aF.A0U()
            android.util.Pair r27 = new android.util.Pair
            r0 = r27
            r0.<init>(r1, r1)
            goto L_0x0292
        L_0x05d7:
            X.00s r2 = r12.A0I
            java.lang.Object r1 = r2.A04()
            r0 = r30
            if (r1 == r0) goto L_0x05e4
            r2.A0D(r0)
        L_0x05e4:
            boolean r0 = X.C36351kA.A1W(r33)
            if (r0 == r11) goto L_0x060e
            r0 = r33
            X.C36341k9.A18(r0, r11)
            X.1hi r1 = r12.A0o
            X.1Hw r0 = r12.A0c
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0604
            X.004 r0 = r12.A12
            boolean r0 = X.C90474aD.A1X(r0)
            if (r0 == 0) goto L_0x0604
            r0 = 1
            if (r11 != 0) goto L_0x0605
        L_0x0604:
            r0 = 0
        L_0x0605:
            X.C36341k9.A18(r1, r0)
            A0I(r12)
            A0K(r12)
        L_0x060e:
            java.util.LinkedHashMap r0 = r12.A0z
            r24 = r0
            java.util.Set r0 = r24.keySet()
            java.util.HashSet r3 = X.C90524aI.A0k(r0)
            java.util.Set r0 = r15.keySet()
            r3.removeAll(r0)
            java.util.Iterator r2 = r3.iterator()
        L_0x0625:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0635
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r2)
            X.711 r0 = r12.A0Y
            r0.A07(r1)
            goto L_0x0625
        L_0x0635:
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L_0x065c
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x065c
            if (r36 != 0) goto L_0x065c
            r4 = 0
        L_0x0644:
            java.util.Iterator r3 = r23.iterator()
        L_0x0648:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0971
            java.lang.Object r2 = r3.next()
            X.6Eu r2 = (X.C129066Eu) r2
            com.whatsapp.jid.UserJid r1 = r2.A0b
            r0 = r24
            r0.put(r1, r2)
            goto L_0x0648
        L_0x065c:
            if (r21 != 0) goto L_0x0959
            X.6tR r2 = r12.A16
            X.1hi r0 = r12.A0j
            boolean r1 = X.C36351kA.A1W(r0)
            if (r11 == 0) goto L_0x0793
            int r3 = r23.size()
            r0 = 8
            if (r3 <= r0) goto L_0x0793
            r3 = 0
            r4 = 0
        L_0x0672:
            int r0 = r23.size()
            if (r4 >= r0) goto L_0x0718
            r0 = r23
            java.lang.Object r0 = r0.get(r4)
            X.6Eu r0 = (X.C129066Eu) r0
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x0714
            r0 = r23
            java.lang.Object r9 = r0.get(r4)
            X.6Eu r9 = (X.C129066Eu) r9
            r0.remove(r4)
        L_0x068f:
            X.C18740tg.A06(r9)
            X.75s r4 = X.C1505575s.A00
            r0 = r23
            java.util.Collections.sort(r0, r4)
            r6 = 5
            java.util.List r0 = r0.subList(r3, r6)
            java.util.ArrayList r8 = X.C36441kJ.A15(r0)
            int r0 = r8.size()
            int r7 = r0 + 1
            int r5 = r2.A01(r7, r1)
            int r15 = r2.A02(r7, r1)
            X.6Eu[] r14 = new X.C129066Eu[r7]
            android.util.Pair r1 = r9.A08
            int r4 = r7 + -1
            int r0 = X.C36381kD.A04(r1)
            int r2 = r15 + -1
            if (r0 != r2) goto L_0x06fe
            int r1 = X.C36381kD.A03(r1)
            int r0 = r5 + -1
            if (r1 != r0) goto L_0x06fe
        L_0x06c6:
            r14[r4] = r9
            r9 = 0
        L_0x06c9:
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x071b
            java.lang.Object r2 = r8.get(r9)
            X.6Eu r2 = (X.C129066Eu) r2
            android.util.Pair r1 = r2.A08
            int r0 = X.C36381kD.A04(r1)
            if (r0 >= r15) goto L_0x06fb
            int r0 = X.C36381kD.A03(r1)
            if (r0 >= r5) goto L_0x06fb
            int r0 = X.C36381kD.A04(r1)
            int r0 = r0 * r5
            int r1 = X.C36381kD.A03(r1)
            int r0 = r0 + r1
            if (r0 < 0) goto L_0x06fb
            if (r0 >= r4) goto L_0x06fb
            r1 = r14[r0]
            if (r1 != 0) goto L_0x06fb
            r14[r0] = r2
            r8.remove(r9)
            goto L_0x06c9
        L_0x06fb:
            int r9 = r9 + 1
            goto L_0x06c9
        L_0x06fe:
            X.6NY r0 = new X.6NY
            r0.<init>(r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r1 = r5 + -1
            android.util.Pair r1 = X.C36341k9.A0I(r2, r1)
            r0.A08 = r1
            X.6Eu r9 = r0.A00()
            goto L_0x06c6
        L_0x0714:
            int r4 = r4 + 1
            goto L_0x0672
        L_0x0718:
            r9 = 0
            goto L_0x068f
        L_0x071b:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0750
            r1 = 0
        L_0x0722:
            if (r1 >= r7) goto L_0x0750
            r0 = r14[r1]
            if (r0 != 0) goto L_0x0790
            java.lang.Object r0 = r8.get(r3)
            X.6Eu r0 = (X.C129066Eu) r0
            X.6NY r2 = new X.6NY
            r2.<init>(r0)
            int r0 = r1 / r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r0 = r1 % r5
            android.util.Pair r0 = X.C36341k9.A0I(r4, r0)
            r2.A08 = r0
            X.6Eu r0 = r2.A00()
            r14[r1] = r0
            r8.remove(r3)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0790
        L_0x0750:
            java.util.ArrayList r1 = X.C36351kA.A10(r14)
            int r2 = r23.size()
            r0 = r23
            java.util.List r0 = r0.subList(r6, r2)
            java.util.ArrayList r2 = X.C36441kJ.A15(r0)
            X.75t r0 = X.C1505675t.A00
            java.util.Collections.sort(r2, r0)
            java.util.Iterator r4 = r2.iterator()
        L_0x076b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0957
            java.lang.Object r0 = r4.next()
            X.6Eu r0 = (X.C129066Eu) r0
            X.6NY r2 = new X.6NY
            r2.<init>(r0)
            java.lang.Integer r0 = X.C90494aF.A0U()
            android.util.Pair r0 = X.C36341k9.A0I(r0, r3)
            r2.A08 = r0
            X.6Eu r0 = r2.A00()
            r1.add(r0)
            int r3 = r3 + 1
            goto L_0x076b
        L_0x0790:
            int r1 = r1 + 1
            goto L_0x0722
        L_0x0793:
            int r0 = r23.size()
            if (r0 == 0) goto L_0x0943
            int r0 = r23.size()
            if (r0 == r10) goto L_0x0943
            int r0 = r23.size()
            int r20 = r2.A01(r0, r1)
            int r0 = r23.size()
            int r19 = r2.A02(r0, r1)
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.util.ArrayList r18 = X.AnonymousClass001.A0I()
            int r8 = r23.size()
            java.lang.Integer r5 = X.C36381kD.A0m()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            if (r8 == r10) goto L_0x07cc
            r3 = 2
            if (r8 != r3) goto L_0x081a
            java.lang.Integer r5 = X.C90494aF.A0U()
        L_0x07cc:
            android.util.Pair r17 = new android.util.Pair
            r0 = r17
            r0.<init>(r5, r5)
        L_0x07d3:
            java.util.Iterator r14 = r23.iterator()
            r3 = 0
        L_0x07d8:
            boolean r0 = r14.hasNext()
            r5 = -1
            if (r0 == 0) goto L_0x0866
            java.lang.Object r6 = r14.next()
            X.6Eu r6 = (X.C129066Eu) r6
            boolean r0 = r6.A0J
            if (r0 == 0) goto L_0x07eb
            r3 = r6
            goto L_0x07d8
        L_0x07eb:
            android.util.Pair r9 = r6.A08
            int r0 = X.C36381kD.A04(r9)
            if (r0 == r5) goto L_0x0814
            java.lang.Object r8 = r9.second
            int r7 = X.AnonymousClass000.A0I(r8)
            if (r7 == r5) goto L_0x0814
            r0 = r20
            if (r7 >= r0) goto L_0x0814
            boolean r0 = r4.containsKey(r8)
            if (r0 != 0) goto L_0x080a
            java.lang.Object r0 = r9.second
            X.C90514aH.A1P(r0, r4)
        L_0x080a:
            java.lang.Object r0 = r9.second
            java.util.List r0 = X.C90524aI.A0n(r0, r4)
            r0.add(r6)
            goto L_0x07d8
        L_0x0814:
            r0 = r18
            r0.add(r6)
            goto L_0x07d8
        L_0x081a:
            r7 = 3
            if (r8 != r7) goto L_0x0824
            if (r1 != 0) goto L_0x0842
            android.util.Pair r17 = X.C36441kJ.A0Q(r0, r5)
            goto L_0x07d3
        L_0x0824:
            r0 = 12
            if (r8 >= r0) goto L_0x0856
            int r6 = r2.A01(r8, r1)
            int r7 = r6 - r10
            int r5 = r2.A02(r8, r1)
            if (r8 == r10) goto L_0x0854
            if (r7 >= r6) goto L_0x0854
            r0 = 3
            if (r8 > r0) goto L_0x0847
            r5 = 1
        L_0x083a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x083e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
        L_0x0842:
            android.util.Pair r17 = X.C36441kJ.A0Q(r5, r0)
            goto L_0x07d3
        L_0x0847:
            int r3 = r5 + -1
            int r0 = r3 * r6
            int r8 = r8 - r0
            if (r8 > r7) goto L_0x084f
            r5 = r3
        L_0x084f:
            if (r7 != r7) goto L_0x083a
            int r5 = r5 + -1
            goto L_0x083a
        L_0x0854:
            r5 = 0
            goto L_0x083a
        L_0x0856:
            if (r1 == 0) goto L_0x085d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto L_0x083e
        L_0x085d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0842
        L_0x0866:
            int r14 = r20 + -1
        L_0x0868:
            r6 = 0
            if (r14 < 0) goto L_0x08d1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L_0x087c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            X.C90514aH.A1P(r0, r4)
        L_0x087c:
            java.lang.Object r9 = X.C90484aE.A0j(r4, r14)
            java.util.List r9 = (java.util.List) r9
            X.75r r0 = X.C1505475r.A00
            java.util.Collections.sort(r9, r0)
            int r15 = r23.size()
            int r8 = r2.A02(r15, r1)
            int r7 = r2.A01(r15, r1)
            if (r15 == r10) goto L_0x08cf
            if (r14 >= r7) goto L_0x08cf
            r0 = 3
            if (r15 > r0) goto L_0x08c0
            r8 = 1
        L_0x089b:
            int r0 = r9.size()
            if (r8 > r0) goto L_0x08bc
            int r0 = r9.size()
            java.util.List r7 = r9.subList(r8, r0)
            r0 = r18
            r0.addAll(r6, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            java.util.List r0 = r9.subList(r6, r8)
            r4.put(r7, r0)
        L_0x08b9:
            int r14 = r14 + -1
            goto L_0x0868
        L_0x08bc:
            X.C36331k8.A1Q(r9, r4, r14)
            goto L_0x08b9
        L_0x08c0:
            int r16 = r8 + -1
            int r0 = r16 * r7
            int r15 = r15 - r0
            if (r15 > r14) goto L_0x08c9
            r8 = r16
        L_0x08c9:
            int r7 = r7 - r10
            if (r14 != r7) goto L_0x089b
            int r8 = r8 + -1
            goto L_0x089b
        L_0x08cf:
            r8 = 0
            goto L_0x089b
        L_0x08d1:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r2 = 0
        L_0x08d6:
            r0 = r19
            if (r2 >= r0) goto L_0x0946
            r7 = 0
        L_0x08db:
            r0 = r20
            if (r7 >= r0) goto L_0x0940
            java.lang.Object r9 = X.C90484aE.A0j(r4, r7)
            java.util.List r9 = (java.util.List) r9
            if (r3 == 0) goto L_0x090d
            int r0 = X.C36381kD.A04(r17)
            if (r2 != r0) goto L_0x090d
            int r0 = X.C36381kD.A03(r17)
            if (r7 != r0) goto L_0x090d
            r0 = r3
        L_0x08f4:
            X.6NY r8 = new X.6NY
            r8.<init>(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.util.Pair r0 = X.C36341k9.A0I(r0, r7)
            r8.A08 = r0
            X.6Eu r0 = r8.A00()
            r1.add(r0)
        L_0x090a:
            int r7 = r7 + 1
            goto L_0x08db
        L_0x090d:
            int r0 = X.C36381kD.A03(r17)
            if (r7 != r0) goto L_0x091b
            int r0 = X.C36381kD.A04(r17)
            int r8 = r2 + -1
            if (r2 > r0) goto L_0x091c
        L_0x091b:
            r8 = r2
        L_0x091c:
            if (r9 == 0) goto L_0x0933
            int r0 = r9.size()
            if (r8 >= r0) goto L_0x0933
            java.lang.Object r0 = r9.get(r8)
            if (r0 == 0) goto L_0x0933
            java.lang.Object r0 = r9.get(r8)
        L_0x092e:
            X.6Eu r0 = (X.C129066Eu) r0
            if (r0 == 0) goto L_0x090a
            goto L_0x08f4
        L_0x0933:
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x090a
            r0 = r18
            java.lang.Object r0 = r0.remove(r6)
            goto L_0x092e
        L_0x0940:
            int r2 = r2 + 1
            goto L_0x08d6
        L_0x0943:
            r1 = r23
            goto L_0x0957
        L_0x0946:
            if (r3 == 0) goto L_0x0957
            int r0 = X.C36381kD.A04(r17)
            if (r0 != r5) goto L_0x0957
            int r0 = X.C36381kD.A03(r17)
            if (r0 != r5) goto L_0x0957
            r1.add(r3)
        L_0x0957:
            r23 = r1
        L_0x0959:
            int r0 = r24.size()
            if (r11 == 0) goto L_0x096c
            if (r0 != r10) goto L_0x096f
        L_0x0961:
            r4 = 1
        L_0x0962:
            r24.clear()
            X.1hi r0 = r12.A0s
            X.C36341k9.A18(r0, r10)
            goto L_0x0644
        L_0x096c:
            if (r0 != 0) goto L_0x096f
            goto L_0x0961
        L_0x096f:
            r4 = 0
            goto L_0x0962
        L_0x0971:
            r1 = 12
            if (r11 == 0) goto L_0x0977
            r1 = 9
        L_0x0977:
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x098c
            if (r4 != 0) goto L_0x098c
            int r0 = r24.size()
            if (r0 <= r1) goto L_0x098c
            X.1Rs r1 = r12.A0w
            r0 = r22
            r1.A0D(r0)
        L_0x098c:
            A0J(r12)
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x0a04
            X.0wQ r5 = r12.A0P
            com.whatsapp.jid.UserJid r0 = r12.A04
            boolean r2 = r5.A0M(r0)
            int r1 = r24.size()
            r0 = 8
            if (r1 > r0) goto L_0x09b6
            boolean r0 = r12.A0C
            if (r0 == 0) goto L_0x0a02
            com.whatsapp.jid.UserJid r0 = r12.A04
            boolean r0 = r5.A0M(r0)
            if (r0 != 0) goto L_0x0a02
            int r1 = r24.size()
            r0 = 2
            if (r1 <= r0) goto L_0x0a02
        L_0x09b6:
            r4 = 1
        L_0x09b7:
            if (r2 != 0) goto L_0x09bb
            if (r4 == 0) goto L_0x0a04
        L_0x09bb:
            int r3 = r12.A00
            int r1 = r24.size()
            com.whatsapp.jid.UserJid r0 = r12.A04
            boolean r0 = r5.A0M(r0)
            X.6CD r2 = new X.6CD
            r2.<init>(r3, r1, r0, r4)
        L_0x09cc:
            X.00s r1 = r12.A0N
            java.lang.Object r0 = r1.A04()
            boolean r0 = X.C1901797e.A00(r0, r2)
            if (r0 != 0) goto L_0x09db
            r1.A0D(r2)
        L_0x09db:
            boolean r0 = r13.A0J
            r12.A09 = r0
            X.147 r4 = r13.A06
            X.141 r1 = r12.A03
            if (r1 != 0) goto L_0x09fb
            r0 = 0
        L_0x09e6:
            boolean r0 = X.C1901797e.A00(r0, r4)
            if (r0 != 0) goto L_0x09fa
            X.16D r3 = r12.A0Z
            X.1C6 r2 = r12.A0f
            X.0xQ r1 = r12.A0e
            r0 = r21
            X.141 r0 = X.AnonymousClass3UL.A01(r3, r1, r4, r2, r0)
            r12.A03 = r0
        L_0x09fa:
            return
        L_0x09fb:
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            goto L_0x09e6
        L_0x0a02:
            r4 = 0
            goto L_0x09b7
        L_0x0a04:
            r2 = 0
            goto L_0x09cc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0H(X.6OZ, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel, boolean):void");
    }

    public static void A0I(CallGridViewModel callGridViewModel) {
        int i;
        C34831hi r4 = callGridViewModel.A0h;
        if (callGridViewModel.A0A) {
            i = R.dimen.f7nameremoved;
        } else {
            boolean A1W = C36351kA.A1W(callGridViewModel.A0n);
            i = R.dimen.f7nameremoved;
            if (A1W) {
                i = R.dimen.f7nameremoved;
            }
        }
        boolean A1W2 = C36351kA.A1W(callGridViewModel.A0j);
        int i2 = 0;
        if (!C36351kA.A1W(callGridViewModel.A0n)) {
            i2 = 14;
        }
        r4.A0D(new C1269766l(i, i2, A1W2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        if (r2 > r3.size()) goto L_0x00ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0J(com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8) {
        /*
            java.util.LinkedHashMap r5 = r8.A0z
            java.util.Collection r0 = r5.values()
            java.util.ArrayList r3 = X.C36441kJ.A15(r0)
            com.whatsapp.jid.UserJid r1 = r8.A04
            if (r1 == 0) goto L_0x003a
            boolean r0 = r8.A0A
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0064
            X.0wQ r0 = r8.A0P
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x0064
            com.whatsapp.jid.UserJid r0 = r8.A04
            android.util.Pair r0 = A09(r0, r3)
            if (r0 == 0) goto L_0x003a
            int r2 = X.C36381kD.A04(r0)
            java.lang.Object r1 = r0.second
            X.6Eu r1 = (X.C129066Eu) r1
            X.6NY r0 = new X.6NY
            r0.<init>(r1)
            r0.A0A = r4
            X.6Eu r0 = r0.A00()
            r3.add(r2, r0)
        L_0x003a:
            X.1hi r0 = r8.A0n
            boolean r0 = X.C36351kA.A1W(r0)
            r4 = 0
            if (r0 == 0) goto L_0x00af
            int r1 = r5.size()
            r0 = 8
            if (r1 <= r0) goto L_0x00af
            X.00s r1 = r8.A0L
            r0 = 6
            r2 = 6
            java.util.List r0 = r3.subList(r4, r0)
            r1.A0D(r0)
            X.00s r1 = r8.A0J
            int r0 = r3.size()
            java.util.List r0 = r3.subList(r2, r0)
        L_0x0060:
            r1.A0D(r0)
            return
        L_0x0064:
            com.whatsapp.jid.UserJid r0 = r8.A04
            android.util.Pair r7 = A09(r0, r3)
            if (r7 == 0) goto L_0x003a
            java.lang.Object r0 = r7.second
            X.6Eu r0 = (X.C129066Eu) r0
            if (r0 == 0) goto L_0x003a
            X.6NY r2 = new X.6NY
            r2.<init>(r0)
            X.0wQ r1 = r8.A0P
            com.whatsapp.jid.UserJid r0 = r8.A04
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x00ac
            r2.A0I = r4
        L_0x0083:
            X.6Eu r5 = r2.A00()
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x00bb
            java.util.ArrayList r4 = X.C90484aE.A0r(r5)
            java.util.Iterator r2 = r3.iterator()
        L_0x0093:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r1 = r2.next()
            X.6Eu r1 = (X.C129066Eu) r1
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x0093
            r4.add(r1)
        L_0x00a6:
            X.00s r0 = r8.A0L
            r0.A0D(r4)
            goto L_0x00b4
        L_0x00ac:
            r2.A0H = r4
            goto L_0x0083
        L_0x00af:
            X.00s r0 = r8.A0L
            r0.A0D(r3)
        L_0x00b4:
            X.00s r1 = r8.A0J
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            goto L_0x0060
        L_0x00bb:
            X.6NY r0 = new X.6NY
            r0.<init>(r5)
            r0.A0A = r4
            r0.A0X = r6
            X.6Eu r4 = r0.A00()
            com.whatsapp.jid.UserJid r0 = r8.A04
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x00e2
            r3.add(r6, r4)
        L_0x00d3:
            X.00s r1 = r8.A0L
            java.util.List r0 = java.util.Collections.singletonList(r5)
            r1.A0D(r0)
            X.00s r0 = r8.A0J
            r0.A0D(r3)
            return
        L_0x00e2:
            int r2 = X.C36381kD.A04(r7)
            if (r2 < 0) goto L_0x00ef
            int r0 = r3.size()
            r1 = 1
            if (r2 <= r0) goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            java.lang.String r0 = "updateParticipantsList: Invalid position for view state"
            X.C18740tg.A0D(r1, r0)
            int r0 = X.C36381kD.A04(r7)
            r3.add(r0, r4)
            X.53T r0 = r8.A0W
            com.whatsapp.jid.UserJid r0 = r0.A0S()
            java.util.Objects.requireNonNull(r0)
            android.util.Pair r0 = A09(r0, r3)
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r0.second
            r3.add(r6, r0)
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0J(com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel):void");
    }

    public static void A0K(CallGridViewModel callGridViewModel) {
        int i;
        if (callGridViewModel.A0A) {
            i = R.style.f13nameremoved;
        } else {
            boolean A1W = C36351kA.A1W(callGridViewModel.A0n);
            i = R.style.f13nameremoved;
            if (A1W) {
                i = R.style.f13nameremoved;
            }
        }
        C36341k9.A16(callGridViewModel.A0t, i);
    }

    public static void A0L(CallGridViewModel callGridViewModel, UserJid userJid) {
        C001700s r3 = callGridViewModel.A0I;
        Object A042 = r3.A04();
        if (A042 == null || userJid.equals(A042)) {
            C129066Eu r0 = (C129066Eu) callGridViewModel.A0z.get(userJid);
            if (r0 == null) {
                Log.w("voip/CallGridViewModel//toggleFocusedView participant not found");
                if (A042 != null) {
                    r3.A0D((Object) null);
                } else {
                    return;
                }
            } else {
                if (r0.A0B) {
                    userJid = null;
                }
                r3.A0D(userJid);
            }
            C95504lc.A04(callGridViewModel);
            return;
        }
        Log.e("voip/CallGridViewModel//toggleFocusedView previous focused participant must be cleared before switching");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0M(int r7) {
        /*
            r6 = this;
            X.0yC r1 = r6.A0d
            r0 = 2331(0x91b, float:3.266E-42)
            int r5 = r1.A07(r0)
            r0 = 3807(0xedf, float:5.335E-42)
            int r1 = r1.A07(r0)
            r4 = 0
            r3 = 1
            r0 = 2
            boolean r2 = X.C36371kC.A1T(r1, r0)
            if (r5 == 0) goto L_0x0029
            X.3Db r0 = r6.A15
            X.0yC r1 = r0.A00
            r0 = 1756(0x6dc, float:2.46E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0029
            if (r2 != 0) goto L_0x0029
            if (r7 < r5) goto L_0x0028
        L_0x0027:
            r4 = 1
        L_0x0028:
            return r4
        L_0x0029:
            if (r7 <= r3) goto L_0x0028
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0M(int):boolean");
    }

    public void A0R() {
        AnonymousClass04S r1;
        this.A0Q.unregisterObserver(this);
        AnonymousClass711 r0 = this.A0Y;
        r0.A01 = null;
        r0.A04();
        if (this.A18.BN6() && (r1 = this.A0F) != null) {
            this.A0S.A00.A0B(r1);
            this.A0F = null;
        }
    }

    public C108275Sw A0S(AnonymousClass6OZ r3) {
        if (this.A0A || !r3.A0K) {
            return C108275Sw.NONE;
        }
        if (this.A0B) {
            return C108275Sw.RINGING;
        }
        if (!r3.A0D || !this.A0d.A0E(3551)) {
            return C108275Sw.GO_TO_CHAT;
        }
        return C108275Sw.RING_ALL;
    }

    public void A0U(Context context) {
        C116965lU r2;
        Context A1D;
        if (this instanceof VoiceChatGridViewModel) {
            VoiceChatGridViewModel voiceChatGridViewModel = (VoiceChatGridViewModel) this;
            AnonymousClass141 r5 = voiceChatGridViewModel.A03;
            if (r5 != null && (r2 = voiceChatGridViewModel.A00) != null) {
                boolean A012 = voiceChatGridViewModel.A01.A00().A01(r5.A0H);
                AudioChatBottomSheetDialog audioChatBottomSheetDialog = r2.A00;
                audioChatBottomSheetDialog.A1m().A00(14, 35);
                if (!A012 && (A1D = audioChatBottomSheetDialog.A1D()) != null) {
                    C24801Dv r22 = audioChatBottomSheetDialog.A02;
                    if (r22 != null) {
                        r22.A08(A1D, C36441kJ.A0j().A1Y(A1D, r5.A0H), "AudioChatBottomSheetDialog/onGoToChatButtonClicked");
                    } else {
                        throw C36331k8.A0d("activityUtils");
                    }
                }
                audioChatBottomSheetDialog.A1c();
                return;
            }
            return;
        }
        AnonymousClass141 r0 = this.A03;
        if (r0 != null) {
            this.A14.A08(context, C90504aG.A0G(context, r0), "CallGridViewModel/onGoToChatButtonClicked");
        }
    }

    public void A0V(Rational rational) {
        AnonymousClass6EE r2;
        this.A0E = rational;
        if (this.A04 != null) {
            r2 = (AnonymousClass6EE) this.A0Q.A05().A04.get(this.A04);
        } else {
            r2 = null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.A0M.A0D(A0A(r2));
        }
    }

    public void BcG(UserJid userJid) {
        AnonymousClass6EE r2 = (AnonymousClass6EE) this.A0Q.A05().A04.get(userJid);
        if (r2 != null) {
            if (userJid.equals(this.A04) && Build.VERSION.SDK_INT >= 26) {
                this.A0M.A0D(A0A(r2));
            }
            if (userJid.equals(this.A05)) {
                A0F(r2, this);
            } else {
                A0E(r2);
            }
            if (C90494aF.A1U(this.A0I, userJid)) {
                A0D(r2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r9 == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bfs(com.whatsapp.jid.UserJid r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            r7.A0C = r9
            r7.A06 = r10
            com.whatsapp.jid.UserJid r0 = r7.A04
            X.0wQ r6 = r7.A0P
            boolean r3 = r6.A0M(r0)
            boolean r2 = r6.A0M(r8)
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0026
            X.6Oa r1 = r7.A0U
            if (r3 == 0) goto L_0x00db
            X.6Ea r0 = r1.A0N
        L_0x001a:
            r0.A00()
            if (r9 == 0) goto L_0x0026
            if (r2 == 0) goto L_0x00d7
            X.6Ea r0 = r1.A0N
        L_0x0023:
            r0.A02()
        L_0x0026:
            int r1 = r7.A00
            r0 = 1
            if (r1 == r0) goto L_0x002e
            r0 = 3
            if (r1 != r0) goto L_0x0041
        L_0x002e:
            X.6Oa r1 = r7.A0U
            if (r2 != 0) goto L_0x0035
            r0 = 1
            if (r9 != 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            X.6Ea r1 = r1.A0J
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0041
            r1.A02()
        L_0x0041:
            if (r9 == 0) goto L_0x0063
            com.whatsapp.jid.UserJid r5 = r7.A04
            if (r5 == 0) goto L_0x0063
            X.6ND r4 = r7.A0S
            java.util.Set r0 = r4.A03
            r0.add(r5)
            java.util.Map r3 = r4.A02
            X.02l r0 = r4.A04
            X.041 r2 = X.C009403z.A02(r0)
            r1 = 0
            com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1 r0 = new com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1
            r0.<init>(r4, r5, r1)
            X.0A6 r0 = X.C36391kE.A12(r0, r2)
            r3.put(r5, r0)
        L_0x0063:
            boolean r0 = r6.A0M(r8)
            if (r0 != 0) goto L_0x0085
            X.6ND r4 = r7.A0S
            java.util.Set r0 = r4.A03
            r0.add(r8)
            java.util.Map r3 = r4.A02
            X.02l r0 = r4.A04
            X.041 r2 = X.C009403z.A02(r0)
            r1 = 0
            com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1 r0 = new com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1
            r0.<init>(r4, r8, r1)
            X.0A6 r0 = X.C36391kE.A12(r0, r2)
            r3.put(r8, r0)
        L_0x0085:
            if (r9 == 0) goto L_0x00d0
            X.5Fb r0 = r7.A0Q
            X.6OZ r0 = r0.A05()
            X.0wy r0 = r0.A04
            java.lang.Object r2 = r0.get(r8)
            X.6EE r2 = (X.AnonymousClass6EE) r2
        L_0x0095:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00a4
            X.00s r1 = r7.A0M
            android.util.Rational r0 = r7.A0A(r2)
            r1.A0D(r0)
        L_0x00a4:
            X.C95504lc.A03(r7)
            X.00s r1 = r7.A0J
            java.lang.Object r0 = r1.A04()
            if (r0 == 0) goto L_0x00cf
            java.util.List r0 = X.C36401kF.A0w(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00cf
            java.util.LinkedHashMap r0 = r7.A0z
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = X.C36441kJ.A15(r0)
            X.53T r0 = r7.A0W
            com.whatsapp.jid.UserJid r0 = r0.A0S()
            r1.remove(r0)
            r7.A0W(r1)
        L_0x00cf:
            return
        L_0x00d0:
            r2 = 0
            goto L_0x0095
        L_0x00d2:
            r1.A00()
            goto L_0x0041
        L_0x00d7:
            X.6Ea r0 = r1.A0K
            goto L_0x0023
        L_0x00db:
            X.6Ea r0 = r1.A0K
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.Bfs(com.whatsapp.jid.UserJid, boolean, boolean):void");
    }

    public static Pair A09(UserJid userJid, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C129066Eu r1 = (C129066Eu) it.next();
            if (userJid.equals(r1.A0b)) {
                it.remove();
                return C36441kJ.A0Q(Integer.valueOf(i), r1);
            }
            i++;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r6.A0I != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.LinkedHashMap A0B(X.AnonymousClass6OZ r6) {
        /*
            java.util.LinkedHashMap r5 = X.C36431kI.A1G()
            com.whatsapp.voipcalling.CallState r1 = r6.A09
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x000f
            boolean r0 = r6.A0I
            r4 = 1
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r4 = 0
        L_0x0010:
            X.0wy r0 = r6.A04
            X.0y7 r0 = r0.entrySet()
            X.14x r3 = r0.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003f
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r3)
            java.lang.Object r0 = r2.getValue()
            X.6EE r0 = (X.AnonymousClass6EE) r0
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x003b
            java.lang.Object r0 = r2.getValue()
            X.6EE r0 = (X.AnonymousClass6EE) r0
            int r1 = r0.A02
            r0 = 1
            if (r1 != r0) goto L_0x001a
            if (r4 == 0) goto L_0x001a
        L_0x003b:
            X.C36411kG.A1T(r5, r2)
            goto L_0x001a
        L_0x003f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0B(X.6OZ):java.util.LinkedHashMap");
    }

    public void A0W(List list) {
        if (list.size() > 1) {
            C105545Fb r3 = this.A0Q;
            Set set = r3.A0C;
            if (!set.containsAll(list) || set.size() != list.size()) {
                set.clear();
                set.addAll(list);
                C19930wk r0 = r3.A09;
                r0.A02();
                C1501574e.A00(r0, r3, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0178, code lost:
        if (r1 == false) goto L_0x017a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CallGridViewModel(X.C24801Dv r10, X.C19730wQ r11, X.C61693Db r12, X.C105545Fb r13, X.C145156tR r14, X.AnonymousClass6ND r15, X.AnonymousClass1PZ r16, X.C131176Oa r17, X.AnonymousClass798 r18, X.AnonymousClass53T r19, X.AnonymousClass711 r20, X.AnonymousClass16D r21, X.AnonymousClass185 r22, X.AnonymousClass171 r23, X.C19630wG r24, X.C18820ts r25, X.AnonymousClass17X r26, X.C25841Hw r27, X.C20810yC r28, X.C20350xQ r29, X.AnonymousClass1C6 r30, X.AnonymousClass13J r31, X.C19770wU r32, com.whatsapp.voipcalling.camera.VoipCameraManager r33, X.AnonymousClass004 r34, X.AnonymousClass004 r35, X.AnonymousClass004 r36) {
        /*
            r9 = this;
            r9.<init>()
            r4 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.1hi r0 = X.C36441kJ.A0s(r0)
            r9.A0l = r0
            X.5yN r0 = new X.5yN
            r0.<init>()
            X.00s r0 = X.C36441kJ.A0Z(r0)
            r9.A0O = r0
            X.5pj r0 = new X.5pj
            r0.<init>()
            X.00s r0 = X.C36441kJ.A0Z(r0)
            r9.A0H = r0
            r6 = 0
            X.00s r0 = X.C36441kJ.A0Z(r6)
            r9.A0I = r0
            r2 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            X.1hi r0 = X.C36441kJ.A0s(r8)
            r9.A0n = r0
            X.1hi r0 = X.C36441kJ.A0s(r8)
            r9.A0o = r0
            X.61t r0 = new X.61t
            r0.<init>()
            r9.A0X = r0
            java.lang.Long r0 = X.C36411kG.A0t()
            X.00s r0 = X.C36441kJ.A0Z(r0)
            r9.A0G = r0
            X.00s r0 = X.C36441kJ.A0Z(r6)
            r9.A0K = r0
            X.1Rs r1 = X.C36441kJ.A0t()
            r9.A0w = r1
            X.1hi r0 = X.C36441kJ.A0s(r8)
            r9.A0k = r0
            X.1hi r3 = X.C36441kJ.A0s(r8)
            r9.A0j = r3
            X.1hi r0 = X.C36441kJ.A0s(r8)
            r9.A0m = r0
            X.6PI r0 = X.AnonymousClass6PI.A04
            X.1hi r0 = X.C36441kJ.A0s(r0)
            r9.A0i = r0
            X.00s r0 = X.C36441kJ.A0Z(r6)
            r9.A0N = r0
            X.1hi r0 = X.C36441kJ.A0s(r8)
            r9.A0s = r0
            r0 = 2132084193(0x7f1505e1, float:1.980855E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1hi r0 = X.C36441kJ.A0s(r0)
            r9.A0t = r0
            X.00s r0 = X.C36431kI.A0S()
            r9.A0M = r0
            r5 = 2131168784(0x7f070e10, float:1.795188E38)
            boolean r7 = X.C36351kA.A1W(r3)
            X.1hi r0 = r9.A0n
            boolean r0 = X.C36351kA.A1W(r0)
            r3 = 0
            if (r0 != 0) goto L_0x00a4
            r3 = 14
        L_0x00a4:
            X.66l r0 = new X.66l
            r0.<init>(r5, r3, r7)
            X.1hi r0 = X.C36441kJ.A0s(r0)
            r9.A0h = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            X.1hi r0 = X.C36441kJ.A0s(r0)
            r9.A0r = r0
            X.5Sw r0 = X.C108275Sw.NONE
            X.1hi r0 = X.C36441kJ.A0s(r0)
            r9.A0q = r0
            r3 = 8
            X.69u r0 = new X.69u
            r0.<init>(r3, r6)
            X.1hi r0 = X.C36441kJ.A0s(r0)
            r9.A0g = r0
            X.1Rs r0 = X.C36441kJ.A0t()
            r9.A0u = r0
            X.1hi r0 = X.C36441kJ.A0s(r8)
            r9.A0p = r0
            X.1Rs r0 = X.C36441kJ.A0t()
            r9.A0v = r0
            r9.A0B = r2
            r9.A0D = r4
            r3 = r28
            r9.A0d = r3
            r9.A0P = r11
            r0 = r24
            r9.A17 = r0
            r0 = r32
            r9.A0x = r0
            r0 = r30
            r9.A0f = r0
            r0 = r27
            r9.A0c = r0
            r9.A14 = r10
            r9.A16 = r14
            r6 = r31
            r9.A18 = r6
            r0 = r21
            r9.A0Z = r0
            r0 = r19
            r9.A0W = r0
            r0 = r33
            r9.A0y = r0
            r0 = r23
            r9.A0a = r0
            r0 = r29
            r9.A0e = r0
            r9.A15 = r12
            r0 = r16
            r9.A0T = r0
            r0 = r26
            r9.A0b = r0
            r0 = r17
            r9.A0U = r0
            r0 = r34
            r9.A10 = r0
            r0 = r35
            r9.A11 = r0
            r0 = r36
            r9.A12 = r0
            r8 = r20
            r9.A0Y = r8
            r0 = r18
            r9.A0V = r0
            r9.A0S = r15
            r0 = 2594(0xa22, float:3.635E-42)
            boolean r0 = r3.A0E(r0)
            r9.A13 = r0
            X.5wA r0 = new X.5wA
            r0.<init>()
            r9.A0R = r0
            java.util.LinkedHashMap r0 = X.C36431kI.A1G()
            r9.A0z = r0
            X.00s r0 = X.C36431kI.A0S()
            r9.A0L = r0
            X.00s r0 = X.C36431kI.A0S()
            r9.A0J = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r1.A0D(r0)
            r9.A0Q = r13
            r13.registerObserver(r9)
            X.6OZ r7 = r13.A05()
            boolean r1 = r7.A0J
            com.whatsapp.jid.UserJid r0 = r7.A08
            if (r1 != 0) goto L_0x017a
            r1 = r22
            boolean r1 = r1.A04(r0)
            r0 = 1
            if (r1 != 0) goto L_0x017b
        L_0x017a:
            r0 = 0
        L_0x017b:
            boolean r0 = X.C34681hT.A0R(r3, r0)
            r9.A08 = r0
            A0H(r7, r9, r2)
            r8.A01 = r9
            boolean r3 = X.C36351kA.A1Y(r25)
            X.00s r2 = r9.A0O
            java.lang.Object r1 = X.C90524aI.A0c(r2)
            X.5yN r1 = (X.C124545yN) r1
            r1.A01 = r5
            boolean r0 = r1.A08
            if (r0 != r3) goto L_0x019c
            boolean r0 = r1.A07
            if (r0 == r4) goto L_0x01a3
        L_0x019c:
            r1.A08 = r3
            r1.A07 = r4
            r2.A0D(r1)
        L_0x01a3:
            boolean r0 = r6.BN6()
            if (r0 == 0) goto L_0x01b6
            r0 = 0
            X.7t4 r1 = new X.7t4
            r1.<init>(r13, r9, r0)
            r9.A0F = r1
            X.00r r0 = r15.A00
            r0.A0A(r1)
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.<init>(X.1Dv, X.0wQ, X.3Db, X.5Fb, X.6tR, X.6ND, X.1PZ, X.6Oa, X.798, X.53T, X.711, X.16D, X.185, X.171, X.0wG, X.0ts, X.17X, X.1Hw, X.0yC, X.0xQ, X.1C6, X.13J, X.0wU, com.whatsapp.voipcalling.camera.VoipCameraManager, X.004, X.004, X.004):void");
    }
}
