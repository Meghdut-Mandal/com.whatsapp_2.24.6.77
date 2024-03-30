package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;
import java.util.List;

/* renamed from: X.2eu  reason: invalid class name and case insensitive filesystem */
public class C47522eu extends AnonymousClass3LJ {
    public float A00;
    public AnonymousClass3ES A01;
    public C65083Qq A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = true;
    public final View A08;
    public final FrameLayout A09;
    public final FrameLayout A0A;
    public final C19970wo A0B;
    public final C19630wG A0C;
    public final C20810yC A0D;
    public final AnonymousClass6KH A0E;
    public final DoodleView A0F;
    public final PhotoView A0G;
    public final C47002cZ A0H;
    public final AnonymousClass3S6 A0I;
    public final C19770wU A0J;
    public final ExoPlayerErrorFrame A0K;
    public final AnonymousClass3OH A0L;
    public final AnonymousClass2XH A0M;
    public final NewsletterLinkLauncher A0N;
    public final C88584Tg A0O;
    public final AnonymousClass1SV A0P;

    public static final int A00(C47522eu r9) {
        C65083Qq r3 = r9.A02;
        if (r3 == null) {
            return 0;
        }
        C47002cZ r0 = r9.A0H;
        C65013Qj A002 = AnonymousClass2bU.A00(r0);
        boolean z = r0.A1J.A02;
        boolean z2 = A002.A0V;
        boolean z3 = A002.A0U;
        int A042 = r3.A04();
        if (!z || z2 || z3) {
            return A042;
        }
        long j = A002.A0F;
        if (j < 0 || A002.A0G <= 0) {
            return A042;
        }
        return A042 - ((int) j);
    }

    public static final void A01(Context context, InteractiveAnnotation interactiveAnnotation, C47522eu r11) {
        C28711Ts r7;
        Object obj = interactiveAnnotation.data;
        AnonymousClass00C.A07(obj);
        Context context2 = context;
        if (obj instanceof SerializableLocation) {
            SerializableLocation serializableLocation = (SerializableLocation) obj;
            r11.A0M.A08(context2, serializableLocation.name, (String) null, serializableLocation.latitude, serializableLocation.longitude);
        } else if (obj instanceof C63393Jw) {
            C63393Jw r3 = (C63393Jw) obj;
            C52332pG r0 = r3.A02;
            boolean z = interactiveAnnotation.skipConfirmation;
            if (r0 != null) {
                int ordinal = r0.ordinal();
                if (ordinal == 0) {
                    r7 = C28711Ts.FORWARDED_MESSAGE;
                } else if (ordinal == 1) {
                    r7 = C28711Ts.STATUS_POST_TOOLTIP;
                } else if (ordinal != 2) {
                    return;
                } else {
                    if (z) {
                        r7 = C28711Ts.STATUS_LINK_BUTTON;
                    } else {
                        r7 = C28711Ts.STATUS_LINK_TOOLTIP;
                    }
                }
                r11.A0N.A03(context2, r3.A01, r7, 3, (long) r3.A00);
            }
        }
    }

    public static final void A02(C47522eu r6) {
        PhotoView photoView = r6.A0G;
        if (photoView.getVisibility() == 0) {
            View A0C2 = C36361kB.A0C(C24801Dv.A00(r6.A0B()));
            AnonymousClass00C.A08(A0C2);
            r6.A0P.A0C(photoView, r6.A0H, new C53752rp(r6, Math.max(A0C2.getWidth(), A0C2.getHeight()), 2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C47522eu r44) {
        /*
            r3 = r44
            X.3Qq r0 = r3.A02
            if (r0 != 0) goto L_0x0025
            A04(r3)
            X.2cZ r5 = r3.A0H
            X.3Qj r10 = r5.A01
            if (r10 == 0) goto L_0x036e
            java.io.File r0 = r10.A0I
            r7 = 1
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x002c
        L_0x001a:
            com.whatsapp.mediaview.PhotoView r2 = r3.A0G
            X.0wo r1 = r3.A0B
            X.2kd r0 = new X.2kd
            r0.<init>(r2, r1)
            r3.A02 = r0
        L_0x0025:
            android.widget.FrameLayout r1 = r3.A0A
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x002c:
            X.0yC r2 = r3.A0D
            r0 = 5913(0x1719, float:8.286E-42)
            java.lang.String r0 = r2.A09(r0)
            boolean r0 = X.AnonymousClass6YG.A0D(r0)
            if (r0 != 0) goto L_0x0345
            r0 = 2917(0xb65, float:4.088E-42)
            java.lang.String r0 = r2.A09(r0)
            boolean r0 = X.AnonymousClass6YG.A0C(r0)
            if (r0 != 0) goto L_0x0345
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r0 = r3.A0K
            r1 = 0
            r0.setVisibility(r1)
            X.3OH r2 = r3.A0L
            android.widget.FrameLayout r1 = r3.A09
            android.content.Context r17 = X.C36371kC.A0B(r1)
            X.5NR r1 = r2.A00
            r8 = 0
            if (r1 != 0) goto L_0x0229
            X.0yC r11 = r2.A0B
            r1 = 6394(0x18fa, float:8.96E-42)
            boolean r16 = r11.A0E(r1)
            X.0wo r1 = r2.A06
            r35 = r1
            X.17Y r1 = r2.A01
            r44 = r1
            X.0yW r1 = r2.A0C
            r18 = r1
            X.1SU r6 = r2.A0E
            X.0yb r1 = r2.A05
            r40 = r1
            X.0wU r1 = r2.A0I
            r43 = r1
            X.005 r1 = r2.A0J
            java.lang.Object r15 = X.C36411kG.A0v(r1)
            X.6KH r15 = (X.AnonymousClass6KH) r15
            X.3Qj r4 = X.AnonymousClass2bU.A00(r5)
            X.4xN r9 = r6.A00(r4)
            java.io.File r12 = r4.A0I
            boolean r1 = r4.A0f
            if (r1 == 0) goto L_0x0194
            if (r9 == 0) goto L_0x0194
            X.6Fc r1 = r9.A0q
            if (r1 == 0) goto L_0x0194
        L_0x0093:
            X.1DW r11 = r2.A0A
            if (r9 == 0) goto L_0x0191
            X.6Fk r9 = r9.A0j
        L_0x0099:
            r36 = 2
            r37 = 3
            r38 = 5
            X.1AW r4 = r2.A0G
            X.1EO r1 = r2.A0H
            X.5NM r29 = new X.5NM
            r30 = r11
            r31 = r18
            r32 = r9
            r33 = r5
            r34 = r4
            r35 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            android.app.Activity r31 = X.C24801Dv.A00(r17)
            X.0wG r1 = r2.A07
            r23 = r1
            X.1X4 r14 = r2.A02
            X.0wx r13 = r2.A08
            X.171 r12 = r2.A04
            X.1ST r11 = r2.A0F
            X.0wD r9 = r2.A03
            X.1A5 r1 = r2.A09
            X.14u r18 = X.C36381kD.A0S(r17)
            X.5NW r4 = new X.5NW
            r22 = r12
            r24 = r13
            r25 = r1
            r26 = r6
            r27 = r11
            r28 = r5
            r17 = r4
            r19 = r44
            r20 = r14
            r21 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6 = 0
            X.5NR r1 = new X.5NR
            r38 = 0
            r39 = 0
            r30 = r1
            r32 = r44
            r33 = r40
            r34 = r23
            r35 = r15
            r36 = r43
            r37 = r29
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r1.A0e(r4)
            X.6D2 r4 = new X.6D2
            r4.<init>(r0, r8, r6)
            r4.A01()
            r1.A0Q(r4)
            r1.A0F()
            r1.A09 = r7
        L_0x0110:
            r2.A00 = r1
            if (r1 == 0) goto L_0x011b
            r1.A0K = r7
            if (r16 == 0) goto L_0x011a
            r1.A0F = r7
        L_0x011a:
            r8 = r1
        L_0x011b:
            r3.A02 = r8
        L_0x011d:
            X.3Qq r8 = r3.A02
            if (r8 == 0) goto L_0x001a
            X.3u5 r0 = new X.3u5
            r0.<init>(r3)
            r8.A06 = r0
            X.3u9 r0 = new X.3u9
            r0.<init>(r3)
            r8.A07 = r0
            X.3u2 r0 = new X.3u2
            r0.<init>(r3)
            r8.A04 = r0
            boolean r0 = r3.A05
            r8.A0V(r0)
            X.3Qa r0 = r5.A1J
            boolean r2 = r0.A02
            boolean r1 = r10.A0V
            boolean r0 = r10.A0U
            if (r2 == 0) goto L_0x018f
            if (r1 != 0) goto L_0x018f
            if (r0 != 0) goto L_0x018f
            long r4 = r10.A0F
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x018f
            long r1 = r10.A0G
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x018f
            int r0 = (int) r4
        L_0x0158:
            r8.A0L(r0)
            r0 = 7
            r8.A0O(r0)
            boolean r0 = r3 instanceof X.C47552ex
            if (r0 == 0) goto L_0x016b
            X.3Qq r1 = r3.A02
            if (r1 == 0) goto L_0x016b
            r0 = 1
            r1.A0V(r0)
        L_0x016b:
            X.3Qq r0 = r3.A02
            r5 = 0
            if (r0 == 0) goto L_0x017c
            android.view.View r5 = r0.A08()
            if (r5 == 0) goto L_0x017c
            android.view.ViewParent r0 = r5.getParent()
            if (r0 != 0) goto L_0x0025
        L_0x017c:
            android.widget.FrameLayout r4 = r3.A0A
            r4.removeAllViews()
            r2 = 17
            r0 = -1
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0, r2)
            r0 = 0
            r4.addView(r5, r0, r1)
            goto L_0x0025
        L_0x018f:
            r0 = 0
            goto L_0x0158
        L_0x0191:
            r9 = r8
            goto L_0x0099
        L_0x0194:
            r41 = 0
            r1 = 0
            boolean r13 = X.C65703Td.A02(r11, r5)
            if (r13 != 0) goto L_0x0093
            if (r12 == 0) goto L_0x0110
            android.net.Uri r14 = android.net.Uri.fromFile(r12)
            X.1Y4 r0 = r2.A0D
            X.37b r6 = new X.37b
            r1 = r44
            r6.<init>(r1, r0, r5)
            android.app.Activity r34 = X.C24801Dv.A00(r17)
            X.0wG r13 = r2.A07
            X.5NX r9 = new X.5NX
            r9.<init>(r13, r0, r5, r6)
            int r0 = r5.A0B
            long r0 = (long) r0
            r28 = r0
            X.3Qa r0 = r5.A1J
            boolean r0 = r0.A02
            r22 = 1
            if (r0 == 0) goto L_0x01c6
            r22 = 3
        L_0x01c6:
            java.io.File r0 = r4.A0I
            if (r0 == 0) goto L_0x0226
            long r26 = r0.lastModified()
        L_0x01ce:
            java.lang.Integer r21 = X.C36371kC.A0p()
            r23 = 3
            long r0 = r5.A00
            r30 = r0
            int r0 = r4.A0A
            long r0 = (long) r0
            r32 = r0
            int r0 = r4.A06
            long r0 = (long) r0
            X.5NL r17 = new X.5NL
            r19 = r11
            r20 = r18
            r24 = r28
            r28 = r30
            r30 = r32
            r32 = r0
            r18 = r35
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32)
            X.5NR r1 = new X.5NR
            r42 = 0
            r33 = r1
            r35 = r44
            r36 = r40
            r37 = r13
            r38 = r15
            r39 = r43
            r40 = r17
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r1.A04 = r14
            r1.A0e(r9)
            X.6FG r9 = r1.A0A
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.videoplayback.VideoLocalStat"
            X.AnonymousClass00C.A0E(r9, r0)
            r0 = 18
            X.737 r4 = new X.737
            r4.<init>(r9, r2, r12, r0)
            r0 = r43
            r0.Boy(r4)
            r6.A01 = r1
            r1.A09 = r7
            goto L_0x0110
        L_0x0226:
            r26 = 0
            goto L_0x01ce
        L_0x0229:
            X.3Qj r7 = X.AnonymousClass2bU.A00(r5)
            X.1SU r4 = r2.A0E
            X.4xN r6 = r4.A00(r7)
            X.AnonymousClass00C.A0B(r7)
            boolean r1 = r7.A0f
            if (r1 == 0) goto L_0x02bd
            if (r6 == 0) goto L_0x02bd
            X.6Fc r1 = r6.A0q
            if (r1 == 0) goto L_0x02bd
        L_0x0240:
            X.0yW r12 = r2.A0C
            X.1DW r11 = r2.A0A
            if (r6 == 0) goto L_0x02bb
            X.6Fk r7 = r6.A0j
        L_0x0248:
            r25 = 2
            r26 = 3
            r27 = 5
            X.1AW r6 = r2.A0G
            X.1EO r1 = r2.A0H
            X.5NM r9 = new X.5NM
            r18 = r9
            r19 = r11
            r20 = r12
            r21 = r7
            r22 = r5
            r23 = r6
            r24 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r6 = 0
            X.6D2 r1 = new X.6D2
            r1.<init>(r0, r8, r6)
            X.5NR r0 = r2.A00
            if (r0 == 0) goto L_0x0272
            r0.A0Q(r1)
        L_0x0272:
            r1.A01()
            X.5NR r14 = r2.A00
            if (r14 == 0) goto L_0x02b7
            X.0wG r0 = r2.A07
            r16 = r0
            X.17Y r15 = r2.A01
            X.1X4 r13 = r2.A02
            X.0wx r12 = r2.A08
            X.171 r11 = r2.A04
            X.1ST r8 = r2.A0F
            X.0wD r7 = r2.A03
            X.1A5 r6 = r2.A09
            android.app.Activity r1 = X.C36381kD.A0A(r17)
            X.14u r1 = (X.C225314u) r1
            X.5NW r0 = new X.5NW
            r21 = r16
            r22 = r12
            r23 = r6
            r24 = r4
            r25 = r8
            r26 = r5
            r27 = r9
            r17 = r15
            r18 = r13
            r19 = r7
            r20 = r11
            r16 = r1
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r14.A0A = r9
            r14.A0e(r0)
            r14.A0I()
        L_0x02b7:
            X.5NR r8 = r2.A00
            goto L_0x011b
        L_0x02bb:
            r7 = 0
            goto L_0x0248
        L_0x02bd:
            X.0yC r11 = r2.A0B
            boolean r1 = X.C65703Td.A02(r11, r5)
            if (r1 != 0) goto L_0x0240
            java.io.File r9 = r7.A0I
            if (r9 == 0) goto L_0x011b
            X.17Y r0 = r2.A01
            X.1Y4 r8 = r2.A0D
            X.37b r6 = new X.37b
            r6.<init>(r0, r8, r5)
            X.5NR r4 = r2.A00
            if (r4 == 0) goto L_0x02b7
            X.0wo r0 = r2.A06
            r30 = r0
            X.0yW r0 = r2.A0C
            r29 = r0
            int r0 = r5.A0B
            long r0 = (long) r0
            r23 = r0
            X.3Qa r0 = r5.A1J
            boolean r0 = r0.A02
            r17 = 1
            if (r0 == 0) goto L_0x02ed
            r17 = 3
        L_0x02ed:
            java.io.File r0 = r7.A0I
            if (r0 == 0) goto L_0x0342
            long r21 = r0.lastModified()
        L_0x02f5:
            java.lang.Integer r16 = X.C36371kC.A0p()
            r18 = 3
            long r0 = r5.A00
            r25 = r0
            int r0 = r7.A0A
            long r14 = (long) r0
            int r0 = r7.A06
            long r12 = (long) r0
            X.5NL r0 = new X.5NL
            r19 = r23
            r23 = r25
            r25 = r14
            r27 = r12
            r12 = r0
            r13 = r30
            r14 = r11
            r15 = r29
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21, r23, r25, r27)
            r4.A0A = r0
            X.0wU r12 = r2.A0I
            r11 = 18
            X.737 r1 = new X.737
            r1.<init>(r0, r2, r9, r11)
            r12.Boy(r1)
            java.io.File r0 = r7.A0I
            if (r0 == 0) goto L_0x032d
            r4.A0T(r0)
        L_0x032d:
            X.0wG r1 = r2.A07
            X.5NX r0 = new X.5NX
            r0.<init>(r1, r8, r5, r6)
            r4.A0e(r0)
            r6.A01 = r4
            r0 = 0
            r4.A0Q(r0)
            r4.A0I()
            goto L_0x02b7
        L_0x0342:
            r21 = 0
            goto L_0x02f5
        L_0x0345:
            java.io.File r4 = r10.A0I
            if (r4 == 0) goto L_0x011d
            X.17Y r12 = r3.A01
            X.0yb r13 = r3.A02
            android.widget.FrameLayout r0 = r3.A09
            android.content.Context r11 = r0.getContext()
            X.0wG r14 = r3.A0C
            r18 = 0
            X.0wU r1 = r3.A0J
            X.6KH r0 = r3.A0E
            r20 = 0
            r21 = 1
            r22 = 0
            r19 = r4
            r15 = r2
            r16 = r0
            r17 = r1
            X.3Qq r8 = X.C65083Qq.A03(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x011b
        L_0x036e:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47522eu.A03(X.2eu):void");
    }

    public static final void A06(C47522eu r1) {
        if (!r1.A05 && !r1.A03 && r1.A05.A01.A06) {
            r1.A03 = true;
            r1.A0I.A03(r1);
        }
    }

    public static final void A07(C47522eu r2) {
        PhotoView photoView = r2.A0G;
        if (photoView.getVisibility() != 0) {
            A04(r2);
            photoView.setVisibility(0);
        }
    }

    public long A0A() {
        int i;
        long j;
        C47002cZ r0 = this.A0H;
        C65013Qj A002 = AnonymousClass2bU.A00(r0);
        if (r0.A1J.A02 && !A002.A0V && !A002.A0U) {
            long j2 = A002.A0F;
            if (j2 >= 0) {
                long j3 = A002.A0G;
                if (j3 > 0) {
                    j = j3 - j2;
                    return Math.min(C36371kC.A07(this.A0D.A07(7902)), j);
                }
            }
        }
        C65083Qq r02 = this.A02;
        if (r02 != null) {
            i = r02.A05();
        } else {
            i = 0;
        }
        j = (long) i;
        return Math.min(C36371kC.A07(this.A0D.A07(7902)), j);
    }

    public void A0G() {
        C88584Tg r2 = this.A0O;
        if (r2 != null) {
            AnonymousClass3S6 r1 = this.A0I;
            List list = r1.A02;
            if (list == null) {
                list = AnonymousClass001.A0I();
                r1.A02 = list;
            }
            list.add(r2);
        }
        A0K(this.A0I.A03);
        int i = 0;
        if (this.A06) {
            this.A06 = false;
            A02(this);
        }
        if (!this.A04) {
            A03(this);
            C65083Qq r11 = this.A02;
            if (r11 != null) {
                C47002cZ r0 = this.A0H;
                C65013Qj r10 = r0.A01;
                if (r10 != null) {
                    boolean z = r10.A0V;
                    boolean z2 = r10.A0U;
                    boolean z3 = r0.A1J.A02;
                    if (z3 && !z2) {
                        long j = r10.A0F;
                        if (j >= 0 && r10.A0G > 0) {
                            i = (int) j;
                        }
                    }
                    r11.A0L(i);
                    if (z3 && !z && !z2 && r10.A0T) {
                        A0K(true);
                    }
                    C65083Qq r02 = this.A02;
                    if (r02 != null) {
                        r02.A0C();
                    }
                    DoodleView doodleView = this.A0F;
                    if (doodleView != null) {
                        doodleView.A0E.A0A = true;
                        SystemClock.elapsedRealtime();
                        doodleView.invalidate();
                    }
                    A06(this);
                    return;
                }
                throw C36381kD.A0k();
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("video player is null for ");
            throw AnonymousClass001.A09(AnonymousClass000.A0o(this.A0H.A1J, A0u));
        }
    }

    public void A0K(boolean z) {
        if (!(this instanceof C47552ex)) {
            this.A05 = z;
            C65083Qq r0 = this.A02;
            if (r0 != null) {
                r0.A0V(z);
            }
            A06(this);
        }
    }

    public static final void A04(C47522eu r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("videoContainer=");
        boolean z = true;
        A0u.append(AnonymousClass000.A1Q(r3.A0A.getVisibility()));
        A0u.append("videoPlaybackContainerOverlay=");
        A0u.append(AnonymousClass000.A1Q(r3.A08.getVisibility()));
        A0u.append("photoView=");
        A0u.append(AnonymousClass000.A1Q(r3.A0G.getVisibility()));
        A0u.append("mainView=");
        if (r3.A09.getVisibility() != 0) {
            z = false;
        }
        A0u.append(z);
        A0u.append(" isPlaybackStarted=");
        A0u.append(r3.A05.A01.A06);
        A0u.toString();
    }

    public static final void A05(C47522eu r3) {
        A04(r3);
        r3.A0K.setVisibility(8);
        C65083Qq r2 = r3.A02;
        if (r2 != null) {
            r2.A05 = null;
            r2.A07 = null;
            r2.A06 = null;
            r2.A04 = null;
            if (r2.A0Z()) {
                AnonymousClass5NR r0 = r3.A0L.A00;
                if (r0 != null) {
                    r0.A0K();
                }
            } else {
                r2.A0D();
            }
            try {
                r2.A0B();
            } catch (Exception unused) {
                Log.w("Failed to post field stats from status player release");
            }
        }
        r3.A02 = null;
    }

    public void A0H() {
        List list;
        A04(this);
        C65083Qq r1 = this.A02;
        if (r1 != null && !r1.A0Z()) {
            r1.A0D();
        }
        DoodleView doodleView = this.A0F;
        if (doodleView != null) {
            doodleView.A0E.A0A = false;
            doodleView.invalidate();
        }
        AnonymousClass3S6 r2 = this.A0I;
        r2.A02(this);
        this.A03 = false;
        A05(this);
        this.A08.setVisibility(0);
        A07(this);
        this.A00 = 0.0f;
        this.A07 = true;
        C88584Tg r12 = this.A0O;
        if (r12 != null && (list = r2.A02) != null) {
            list.remove(r12);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47522eu(X.C24801Dv r18, X.C20690y0 r19, X.AnonymousClass17Y r20, X.C21060yb r21, X.C19970wo r22, X.C19630wG r23, X.C18820ts r24, X.AnonymousClass1H2 r25, X.C20810yC r26, X.AnonymousClass6KH r27, X.AnonymousClass2XH r28, X.AnonymousClass1SU r29, com.whatsapp.newsletter.NewsletterLinkLauncher r30, X.AnonymousClass3T1 r31, X.AnonymousClass3G7 r32, X.AnonymousClass3S6 r33, X.AnonymousClass1HA r34, X.AnonymousClass1SV r35, X.C19770wU r36, X.AnonymousClass3OH r37) {
        /*
            r17 = this;
            r8 = r31
            r6 = 1
            r5 = 17
            r9 = r17
            r14 = r29
            r13 = r24
            r10 = r18
            r12 = r21
            r11 = r20
            r15 = r32
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0 = r22
            r9.A0B = r0
            r0 = r26
            r9.A0D = r0
            r0 = r23
            r9.A0C = r0
            r0 = r36
            r9.A0J = r0
            r0 = r28
            r9.A0M = r0
            r0 = r35
            r9.A0P = r0
            r0 = r37
            r9.A0L = r0
            r0 = r30
            r9.A0N = r0
            r0 = r33
            r9.A0I = r0
            r0 = r27
            r9.A0E = r0
            r9.A07 = r6
            X.C18740tg.A06(r8)
            X.2cZ r8 = (X.C47002cZ) r8
            r9.A0H = r8
            android.content.Context r0 = r9.A0B()
            android.app.Activity r1 = X.C24801Dv.A00(r0)
            r0 = 2131435127(0x7f0b1e77, float:1.8492087E38)
            android.view.View r0 = r1.findViewById(r0)
            X.AnonymousClass00C.A08(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r9.A0A = r0
            android.content.Context r0 = r9.A0B()
            android.app.Activity r1 = X.C24801Dv.A00(r0)
            r0 = 2131435128(0x7f0b1e78, float:1.849209E38)
            android.view.View r0 = r1.findViewById(r0)
            X.AnonymousClass00C.A08(r0)
            r9.A08 = r0
            android.content.Context r0 = r9.A0B()
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r0)
            r9.A09 = r4
            android.content.Context r0 = r9.A0B()
            com.whatsapp.mediaview.PhotoView r7 = new com.whatsapp.mediaview.PhotoView
            r7.<init>(r0)
            r9.A0G = r7
            r0 = 0
            r7.A01 = r0
            r3 = 0
            r7.A0A(r3)
            r7.A0N = r3
            r7.setEnabled(r3)
            android.content.Context r0 = r9.A0B()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131099848(0x7f0600c8, float:1.781206E38)
            X.C36391kE.A1C(r1, r7, r0)
            android.content.Context r1 = r9.A0B()
            r2 = 0
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r0 = new com.whatsapp.videoplayback.ExoPlayerErrorFrame
            r0.<init>(r1, r2, r3)
            r9.A0K = r0
            r4.addView(r7)
            r4.addView(r0)
            r0 = 2131434281(0x7f0b1b29, float:1.8490372E38)
            r4.setId(r0)
            r0 = 2
            X.C011504z.A06(r4, r0)
            A07(r9)
            X.3Qj r7 = r8.A01
            if (r7 == 0) goto L_0x0113
            X.3Qa r0 = r8.A1J
            boolean r0 = r0.A02
            r1 = 0
            if (r0 == 0) goto L_0x0109
            boolean r0 = r7.A0V
            if (r0 != 0) goto L_0x0109
            boolean r0 = r7.A0U
            if (r0 != 0) goto L_0x0109
            java.lang.String r0 = r7.A0K
            if (r0 == 0) goto L_0x0109
            r7 = r19
            java.io.File r16 = X.AnonymousClass1GW.A0H(r7, r0)
            boolean r0 = r16.exists()
            if (r0 == 0) goto L_0x0109
            android.content.Context r0 = r9.A0B()
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = new com.whatsapp.mediacomposer.doodle.DoodleView
            r1.<init>(r0)
            X.6Nc r11 = X.AnonymousClass6VQ.A05
            android.content.Context r12 = r9.A0B()
            r14 = r25
            r15 = r34
            X.6VQ r0 = r11.A01(r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x0109
            r1.setLayerType(r6, r2)
            r1.setEnabled(r3)
            r1.setDoodle(r0)
            r0 = -1
            X.C36391kE.A1G(r1, r4, r0, r5)
        L_0x0109:
            r9.A0F = r1
            X.4Y9 r0 = new X.4Y9
            r0.<init>(r9, r3)
            r9.A0O = r0
            return
        L_0x0113:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47522eu.<init>(X.1Dv, X.0y0, X.17Y, X.0yb, X.0wo, X.0wG, X.0ts, X.1H2, X.0yC, X.6KH, X.2XH, X.1SU, com.whatsapp.newsletter.NewsletterLinkLauncher, X.3T1, X.3G7, X.3S6, X.1HA, X.1SV, X.0wU, X.3OH):void");
    }
}
