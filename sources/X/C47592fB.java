package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.ui.media.MediaCaptionTextView;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2fB  reason: invalid class name and case insensitive filesystem */
public abstract class C47592fB extends AnonymousClass3LC implements C88574Tf {
    public boolean A00;
    public BottomSheetBehavior A01;
    public AnonymousClass3BK A02;
    public StatusPlaybackProgressView A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public final C224214g A09 = new C224214g(true);
    public final Handler A0A = C36341k9.A0H();
    public final C24801Dv A0B;
    public final AnonymousClass17Y A0C;
    public final C21060yb A0D;
    public final AnonymousClass1QO A0E;
    public final AnonymousClass16E A0F;
    public final C20810yC A0G;
    public final AnonymousClass3JQ A0H;
    public final C87294Of A0I = new C77943rJ(this);
    public final AnonymousClass1A1 A0J;
    public final AnonymousClass1X7 A0K;
    public final C224214g A0L = new C224214g(true);
    public final C224214g A0M = new C224214g(true);
    public final C19770wU A0N;
    public final C65813To A0O;
    public final Runnable A0P = new C81173wa((Object) this, 41);
    public final C87414Os A0Q = new C68593c9(this);
    public final C19970wo A0R;
    public final C24791Du A0S;
    public final AnonymousClass1XY A0T;
    public final AnonymousClass1X4 A0U;
    public final C18820ts A0V;
    public final C20310xM A0W;
    public final C32731e6 A0X;
    public final AnonymousClass1DW A0Y;
    public final AnonymousClass2XH A0Z;
    public final AnonymousClass1SU A0a;
    public final AnonymousClass1CR A0b;
    public final C29731Xt A0c;

    public void A0F() {
        this.A04 = true;
        AnonymousClass3JQ r1 = this.A0H;
        StatusPlaybackContactFragment statusPlaybackContactFragment = r1.A02;
        List list = statusPlaybackContactFragment.A0n;
        if (list != null) {
            C28301Sc r4 = statusPlaybackContactFragment.A0Z;
            if (r4 != null) {
                r4.A01.A01(new C35661j3(r1.A00, r4, list, 16), 51);
                return;
            }
            throw C36331k8.A0d("statusManager");
        }
    }

    public abstract void A0J();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (X.C65703Td.A04((X.C46932bu) r8) == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Q(boolean r12) {
        /*
            r11 = this;
            r0 = r11
            X.2fA r0 = (X.C47582fA) r0
            X.3Sn r3 = r0.A06
            X.3T1 r8 = r0.A05
            X.333 r1 = new X.333
            r1.<init>(r0)
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)
            boolean r0 = r8 instanceof X.AnonymousClass2bU
            r7 = 0
            if (r0 == 0) goto L_0x003c
            java.util.concurrent.ConcurrentHashMap r0 = r3.A05
            r0.put(r8, r1)
            X.3Qa r5 = r8.A1J
            boolean r0 = r5.A02
            r4 = 1
            if (r0 == 0) goto L_0x003e
            r2 = r8
            X.2bU r2 = (X.AnonymousClass2bU) r2
            boolean r0 = r2.A1g()
            if (r0 == 0) goto L_0x003e
            boolean r0 = r8 instanceof X.C181798o3
            if (r0 == 0) goto L_0x0037
            r0 = r8
            X.2bu r0 = (X.C46932bu) r0
            boolean r0 = X.C65703Td.A04(r0)
            if (r0 != 0) goto L_0x003e
        L_0x0037:
            X.6Wx r0 = X.C65553Sn.A07
        L_0x0039:
            X.C65553Sn.A00(r0, r2, r3)
        L_0x003c:
            r0 = 0
            return r0
        L_0x003e:
            r2 = r8
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.3Qj r1 = X.AnonymousClass2bU.A00(r2)
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x0056
            int r0 = r1.A09
            if (r0 == r4) goto L_0x0053
            boolean r0 = r2.A1h()
            if (r0 != 0) goto L_0x0037
        L_0x0053:
            X.6Wx r0 = X.C65553Sn.A08
            goto L_0x0039
        L_0x0056:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "statusdownload/downloadifneeded "
            r1.append(r0)
            r1.append(r12)
            r4 = 32
            r1.append(r4)
            java.lang.String r0 = r5.A01
            r1.append(r0)
            r1.append(r4)
            X.11F r0 = r2.A0J()
            X.C36321k7.A1N(r0, r1)
            if (r12 == 0) goto L_0x00cc
            X.1ST r7 = r3.A03
            java.util.ArrayList r0 = r7.A0B()
            java.util.Iterator r10 = r0.iterator()
        L_0x0082:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00c8
            X.2bU r8 = X.C36441kJ.A0r(r10)
            X.3Qa r9 = r8.A1J
            X.11F r0 = r9.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r9.equals(r5)
            if (r0 != 0) goto L_0x00bb
            r7.A0E(r8)
            java.util.ArrayList r0 = r3.A04
            r0.add(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "statusdownload/cancel "
        L_0x00a8:
            r1.append(r0)
            java.lang.String r0 = r9.A01
            r1.append(r0)
            r1.append(r4)
            X.11F r0 = r8.A0J()
            X.C36321k7.A1N(r0, r1)
            goto L_0x0082
        L_0x00bb:
            boolean r0 = r9.equals(r5)
            if (r0 == 0) goto L_0x0082
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "statusdownload/is-current "
            goto L_0x00a8
        L_0x00c8:
            X.C65553Sn.A01(r2, r3, r6)
            goto L_0x00dc
        L_0x00cc:
            X.2bU r0 = r3.A00
            if (r0 != 0) goto L_0x00de
            X.0yC r0 = r3.A02
            boolean r0 = X.C65703Td.A01(r0, r8)
            if (r0 == 0) goto L_0x00d9
            r7 = 3
        L_0x00d9:
            X.C65553Sn.A01(r2, r3, r7)
        L_0x00dc:
            r0 = 1
            return r0
        L_0x00de:
            java.util.ArrayList r0 = r3.A04
            r0.add(r8)
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47592fB.A0Q(boolean):boolean");
    }

    public void BTk() {
    }

    public static void A03(C47592fB r5) {
        AnonymousClass3BI r3;
        C18740tg.A04(r5.A00);
        r5.A0A.removeCallbacks(r5.A0P);
        if (r5.A02.A0D.getVisibility() != 0) {
            AlphaAnimation A0D2 = C36351kA.A0D();
            A0D2.setDuration(300);
            if (r5.A02.A09.getVisibility() != 0) {
                r5.A02.A09.startAnimation(A0D2);
                r5.A02.A09.setVisibility(0);
            }
            if (r5.A02.A0F.getVisibility() == 0 && r5.A02.A0A.getVisibility() != 0) {
                r5.A02.A0A.startAnimation(A0D2);
                r5.A02.A0A.setVisibility(0);
            }
            if (r5.A02.A0D.getVisibility() == 4) {
                r5.A02.A0D.startAnimation(A0D2);
                r5.A02.A0D.setVisibility(0);
            }
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = r5.A0H.A01;
            AnonymousClass3BI r0 = statusPlaybackBaseFragment.A04;
            if ((r0 == null || r0.A06.getVisibility() != 0) && (r3 = statusPlaybackBaseFragment.A04) != null) {
                AlphaAnimation A0D3 = C36351kA.A0D();
                A0D3.setDuration(300);
                View view = r3.A06;
                view.startAnimation(A0D3);
                StatusPlaybackProgressView statusPlaybackProgressView = r3.A0F;
                statusPlaybackProgressView.startAnimation(A0D3);
                view.setVisibility(0);
                statusPlaybackProgressView.setVisibility(0);
                Button button = r3.A00;
                if (button != null) {
                    button.startAnimation(A0D3);
                }
                Button button2 = r3.A00;
                if (button2 != null) {
                    button2.setVisibility(0);
                }
            }
            r5.A00.setSystemUiVisibility(1792);
        }
    }

    public View A0C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C29731Xt r6 = this.A0c;
        AnonymousClass3T1 r1 = ((C47582fA) this).A05;
        C64933Qa r2 = r1.A1J;
        int hashCode = r2.A01.hashCode();
        int i = r1.A1I;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 13) {
                            if (i != 15) {
                                if (i != 25) {
                                    switch (i) {
                                        case 27:
                                            break;
                                        case 28:
                                            break;
                                        case 29:
                                            break;
                                        default:
                                            str = "UNKNOWN";
                                            break;
                                    }
                                }
                            } else {
                                str = "DELETING";
                            }
                        }
                        str = "GIF";
                    }
                    str = "VIDEO";
                } else {
                    str = "VOICE";
                }
                boolean z = r2.A02;
                C21690ze r22 = r6.A09;
                r22.markerStart(453119185, hashCode);
                r22.markerAnnotate(453119185, hashCode, "is_outgoing", z);
                r22.markerAnnotate(453119185, hashCode, "media_type", str);
                r22.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_START");
                this.A03 = (StatusPlaybackProgressView) this.A0H.A01.A0d().findViewById(R.id.playback_progress);
                View A0E2 = C36361kB.A0E(layoutInflater, (ViewGroup) null, R.layout.f9nameremoved);
                AnonymousClass3BK A0E3 = A0E();
                A0E3.A01 = A0E2.findViewById(R.id.content_sheet);
                A0E3.A04 = C36411kG.A0P(A0E2, R.id.content);
                A0E3.A0C = A0E2.findViewById(R.id.click_handler);
                A0E3.A05 = C36391kE.A0P(A0E2, R.id.control_btn);
                A0E3.A02 = A0E2.findViewById(R.id.control_frame);
                A0E3.A0F = (MediaCaptionTextView) A0E2.findViewById(R.id.caption);
                A0E3.A09 = A0E2.findViewById(R.id.caption_container);
                A0E3.A0A = A0E2.findViewById(R.id.caption_padding);
                A0E3.A0D = C36411kG.A0P(A0E2, R.id.bottom_sheet);
                A0E3.A0B = A0E2.findViewById(R.id.status_details_background);
                A0E3.A00 = A0E2.findViewById(R.id.cancel_btn);
                A0E3.A07 = (CircularProgressBar) A0E2.findViewById(R.id.progress_bar);
                A0E3.A06 = C36391kE.A0P(A0E2, R.id.error);
                A0E3.A0E = C36411kG.A0P(A0E2, R.id.info);
                A0E3.A08 = C36411kG.A0Z(A0E2, R.id.info_btn);
                A0E3.A0G = C36341k9.A0Y(A0E2, R.id.reply_bar);
                A0E3.A03 = A0E2.findViewById(R.id.extra_padding);
                r22.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_END");
                return A0E2;
            }
            str = "IMAGE";
            boolean z2 = r2.A02;
            C21690ze r222 = r6.A09;
            r222.markerStart(453119185, hashCode);
            r222.markerAnnotate(453119185, hashCode, "is_outgoing", z2);
            r222.markerAnnotate(453119185, hashCode, "media_type", str);
            r222.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_START");
            this.A03 = (StatusPlaybackProgressView) this.A0H.A01.A0d().findViewById(R.id.playback_progress);
            View A0E22 = C36361kB.A0E(layoutInflater, (ViewGroup) null, R.layout.f9nameremoved);
            AnonymousClass3BK A0E32 = A0E();
            A0E32.A01 = A0E22.findViewById(R.id.content_sheet);
            A0E32.A04 = C36411kG.A0P(A0E22, R.id.content);
            A0E32.A0C = A0E22.findViewById(R.id.click_handler);
            A0E32.A05 = C36391kE.A0P(A0E22, R.id.control_btn);
            A0E32.A02 = A0E22.findViewById(R.id.control_frame);
            A0E32.A0F = (MediaCaptionTextView) A0E22.findViewById(R.id.caption);
            A0E32.A09 = A0E22.findViewById(R.id.caption_container);
            A0E32.A0A = A0E22.findViewById(R.id.caption_padding);
            A0E32.A0D = C36411kG.A0P(A0E22, R.id.bottom_sheet);
            A0E32.A0B = A0E22.findViewById(R.id.status_details_background);
            A0E32.A00 = A0E22.findViewById(R.id.cancel_btn);
            A0E32.A07 = (CircularProgressBar) A0E22.findViewById(R.id.progress_bar);
            A0E32.A06 = C36391kE.A0P(A0E22, R.id.error);
            A0E32.A0E = C36411kG.A0P(A0E22, R.id.info);
            A0E32.A08 = C36411kG.A0Z(A0E22, R.id.info_btn);
            A0E32.A0G = C36341k9.A0Y(A0E22, R.id.reply_bar);
            A0E32.A03 = A0E22.findViewById(R.id.extra_padding);
            r222.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_END");
            return A0E22;
        }
        str = "TEXT";
        boolean z22 = r2.A02;
        C21690ze r2222 = r6.A09;
        r2222.markerStart(453119185, hashCode);
        r2222.markerAnnotate(453119185, hashCode, "is_outgoing", z22);
        r2222.markerAnnotate(453119185, hashCode, "media_type", str);
        r2222.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_START");
        this.A03 = (StatusPlaybackProgressView) this.A0H.A01.A0d().findViewById(R.id.playback_progress);
        View A0E222 = C36361kB.A0E(layoutInflater, (ViewGroup) null, R.layout.f9nameremoved);
        AnonymousClass3BK A0E322 = A0E();
        A0E322.A01 = A0E222.findViewById(R.id.content_sheet);
        A0E322.A04 = C36411kG.A0P(A0E222, R.id.content);
        A0E322.A0C = A0E222.findViewById(R.id.click_handler);
        A0E322.A05 = C36391kE.A0P(A0E222, R.id.control_btn);
        A0E322.A02 = A0E222.findViewById(R.id.control_frame);
        A0E322.A0F = (MediaCaptionTextView) A0E222.findViewById(R.id.caption);
        A0E322.A09 = A0E222.findViewById(R.id.caption_container);
        A0E322.A0A = A0E222.findViewById(R.id.caption_padding);
        A0E322.A0D = C36411kG.A0P(A0E222, R.id.bottom_sheet);
        A0E322.A0B = A0E222.findViewById(R.id.status_details_background);
        A0E322.A00 = A0E222.findViewById(R.id.cancel_btn);
        A0E322.A07 = (CircularProgressBar) A0E222.findViewById(R.id.progress_bar);
        A0E322.A06 = C36391kE.A0P(A0E222, R.id.error);
        A0E322.A0E = C36411kG.A0P(A0E222, R.id.info);
        A0E322.A08 = C36411kG.A0Z(A0E222, R.id.info_btn);
        A0E322.A0G = C36341k9.A0Y(A0E222, R.id.reply_bar);
        A0E322.A03 = A0E222.findViewById(R.id.extra_padding);
        r2222.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_END");
        return A0E222;
    }

    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r15v9, types: [X.2ev] */
    /* JADX WARNING: type inference failed for: r15v10, types: [X.2et] */
    /* JADX WARNING: type inference failed for: r15v11, types: [X.2ew] */
    /* JADX WARNING: type inference failed for: r15v12, types: [X.2es] */
    /* JADX WARNING: type inference failed for: r15v13, types: [X.2eu] */
    /* JADX WARNING: type inference failed for: r15v14, types: [X.2ex] */
    /* JADX WARNING: type inference failed for: r15v15, types: [X.2er] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3LJ A0D() {
        /*
            r37 = this;
            r14 = r37
            X.2fA r14 = (X.C47582fA) r14
            X.3LJ r11 = r14.A01
            if (r11 != 0) goto L_0x01f4
            X.3BQ r0 = r14.A07
            X.3T1 r13 = r14.A05
            X.3G7 r12 = new X.3G7
            r12.<init>(r14)
            X.1RY r8 = r14.A03
            X.1Dv r1 = r14.A0B
            r36 = r1
            X.AnonymousClass00C.A07(r36)
            r1 = 0
            X.AnonymousClass00C.A0D(r13, r1)
            r4 = 1
            r3 = 2
            X.AnonymousClass00C.A0D(r8, r3)
            r1 = 3
            int r2 = r13.A1I
            if (r2 == 0) goto L_0x01bc
            if (r2 == r4) goto L_0x0186
            if (r2 == r3) goto L_0x014c
            if (r2 == r1) goto L_0x00f6
            r1 = 13
            if (r2 == r1) goto L_0x00a2
            r1 = 15
            if (r2 == r1) goto L_0x007a
            r1 = 25
            if (r2 == r1) goto L_0x0186
            switch(r2) {
                case 27: goto L_0x01bc;
                case 28: goto L_0x00f6;
                case 29: goto L_0x00a2;
                default: goto L_0x003d;
            }
        L_0x003d:
            X.0wo r9 = r0.A09
            X.0yC r8 = r0.A0F
            X.1fu r7 = r0.A05
            X.17Y r6 = r0.A03
            X.1e2 r5 = r0.A04
            X.0yb r4 = r0.A08
            X.0ts r3 = r0.A0B
            X.1SU r2 = r0.A0J
            X.3Jc r1 = r0.A07
            X.1fs r0 = r0.A06
            X.2es r11 = new X.2es
            r26 = r13
            r27 = r12
            r17 = r5
            r18 = r7
            r19 = r0
            r20 = r1
            r21 = r4
            r22 = r9
            r23 = r3
            r24 = r8
            r25 = r2
            r15 = r11
            r16 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x006f:
            X.3LJ r11 = (X.AnonymousClass3LJ) r11
            r14.A01 = r11
            if (r11 != 0) goto L_0x01f4
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        L_0x007a:
            X.17Y r8 = r0.A03
            X.1e2 r7 = r0.A04
            X.0yb r6 = r0.A08
            X.0ts r5 = r0.A0B
            X.1SU r4 = r0.A0J
            X.0wo r3 = r0.A09
            r1 = 4500(0x1194, double:2.2233E-320)
            X.3Jy r0 = new X.3Jy
            r0.<init>(r3, r1)
            X.2er r11 = new X.2er
            r15 = r11
            r16 = r8
            r17 = r7
            r18 = r6
            r19 = r5
            r20 = r4
            r21 = r0
            r22 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x006f
        L_0x00a2:
            X.0wo r1 = r0.A09
            r20 = r1
            X.0yC r1 = r0.A0F
            r24 = r1
            X.17Y r1 = r0.A03
            r18 = r1
            X.0wG r1 = r0.A0A
            r21 = r1
            X.0wU r1 = r0.A0R
            r16 = r1
            X.0y0 r15 = r0.A02
            X.1H2 r10 = r0.A0E
            X.2XH r9 = r0.A0I
            X.0yb r8 = r0.A08
            X.0ts r7 = r0.A0B
            X.1SU r6 = r0.A0J
            X.1SV r5 = r0.A0Q
            X.3OH r4 = r0.A0S
            com.whatsapp.newsletter.NewsletterLinkLauncher r3 = r0.A0L
            X.1HA r2 = r0.A0N
            X.3S6 r1 = r0.A0M
            X.6KH r0 = r0.A0G
            X.2ex r11 = new X.2ex
            r26 = r9
            r27 = r6
            r28 = r3
            r29 = r13
            r30 = r12
            r31 = r1
            r32 = r2
            r33 = r5
            r34 = r16
            r35 = r4
            r17 = r15
            r19 = r8
            r22 = r7
            r23 = r10
            r25 = r0
            r15 = r11
            r16 = r36
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x006f
        L_0x00f6:
            X.0wo r1 = r0.A09
            r20 = r1
            X.0yC r1 = r0.A0F
            r24 = r1
            X.0wG r1 = r0.A0A
            r21 = r1
            X.0wU r1 = r0.A0R
            r17 = r1
            X.17Y r1 = r0.A03
            r16 = r1
            X.0y0 r15 = r0.A02
            X.1H2 r10 = r0.A0E
            X.2XH r9 = r0.A0I
            X.0yb r8 = r0.A08
            X.0ts r7 = r0.A0B
            X.1SU r6 = r0.A0J
            X.1SV r5 = r0.A0Q
            X.3OH r4 = r0.A0S
            com.whatsapp.newsletter.NewsletterLinkLauncher r3 = r0.A0L
            X.1HA r2 = r0.A0N
            X.3S6 r1 = r0.A0M
            X.6KH r0 = r0.A0G
            X.2eu r11 = new X.2eu
            r26 = r9
            r27 = r6
            r28 = r3
            r29 = r13
            r30 = r12
            r31 = r1
            r32 = r2
            r33 = r5
            r34 = r17
            r35 = r4
            r17 = r15
            r18 = r16
            r19 = r8
            r22 = r7
            r23 = r10
            r25 = r0
            r15 = r11
            r16 = r36
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x006f
        L_0x014c:
            X.0yC r3 = r0.A0F
            X.0yV r2 = X.C21000yV.A01
            r1 = 1875(0x753, float:2.627E-42)
            boolean r1 = X.C20800yB.A01(r2, r3, r1)
            if (r1 == 0) goto L_0x003d
            X.17Y r7 = r0.A03
            X.0yb r6 = r0.A08
            X.0ts r5 = r0.A0B
            X.1SU r4 = r0.A0J
            X.1e2 r3 = r0.A04
            X.3S6 r2 = r0.A0M
            X.30J r1 = r0.A00
            X.3QH r0 = r0.A0O
            X.2ew r11 = new X.2ew
            r15 = r11
            r16 = r3
            r17 = r1
            r18 = r7
            r19 = r8
            r20 = r6
            r21 = r5
            r22 = r4
            r23 = r13
            r24 = r12
            r25 = r2
            r26 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x006f
        L_0x0186:
            X.0wo r9 = r0.A09
            X.0yC r8 = r0.A0F
            X.17Y r7 = r0.A03
            X.1D1 r6 = r0.A0K
            X.2XH r5 = r0.A0I
            X.0yb r4 = r0.A08
            X.0ts r3 = r0.A0B
            X.1SU r2 = r0.A0J
            X.1SV r1 = r0.A0Q
            com.whatsapp.newsletter.NewsletterLinkLauncher r0 = r0.A0L
            X.2et r11 = new X.2et
            r26 = r13
            r27 = r12
            r28 = r1
            r17 = r7
            r18 = r4
            r19 = r9
            r20 = r3
            r21 = r8
            r22 = r5
            r23 = r2
            r24 = r6
            r25 = r0
            r15 = r11
            r16 = r36
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x006f
        L_0x01bc:
            X.0yC r10 = r0.A0F
            X.17Y r9 = r0.A03
            X.1DU r8 = r0.A0H
            X.1e2 r7 = r0.A04
            X.0yb r6 = r0.A08
            X.0ts r5 = r0.A0B
            X.1EM r4 = r0.A0P
            X.1SU r3 = r0.A0J
            X.1e6 r2 = r0.A0C
            X.1SV r1 = r0.A0Q
            X.1DW r0 = r0.A0D
            X.2ev r11 = new X.2ev
            r15 = r11
            r16 = r9
            r17 = r7
            r18 = r6
            r19 = r5
            r20 = r2
            r21 = r0
            r22 = r10
            r23 = r8
            r24 = r3
            r25 = r13
            r26 = r12
            r27 = r4
            r28 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x006f
        L_0x01f4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47592fB.A0D():X.3LJ");
    }

    public AnonymousClass3BK A0E() {
        if (this instanceof C47572f9) {
            return ((C47572f9) this).A0S();
        }
        AnonymousClass3BK r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3BK r02 = new AnonymousClass3BK();
        this.A02 = r02;
        return r02;
    }

    public void A0G() {
        if (this.A06 && !this.A05) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C36331k8.A1O(this, "playbackPage/pausePlayback page=", A0u);
            C36321k7.A1N(this.A0H.A01, A0u);
            this.A05 = true;
            A0D().A0D();
            this.A0M.A03();
        }
    }

    public void A0H() {
        if (this.A04 && this.A06 && !this.A02 && this.A01.A0J == 4 && !this.A02.A0F.A0K()) {
            A0D();
            StringBuilder A0u = AnonymousClass000.A0u();
            C36331k8.A1O(this, "playbackPage/resumePlayback page=", A0u);
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A0H.A01;
            C36321k7.A1N(statusPlaybackBaseFragment, A0u);
            AnonymousClass01I A0h = statusPlaybackBaseFragment.A0h();
            if (A0h instanceof StatusPlaybackActivity) {
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) A0h;
                if (statusPlaybackActivity.A0I) {
                    statusPlaybackActivity.A0I = false;
                    new Handler().postDelayed(new C81173wa((Object) this, 42), 1000);
                    return;
                }
            }
            this.A05 = false;
            A0D().A0E();
            this.A0M.A01();
            A03(this);
        }
    }

    public void A0I() {
        if (!this.A04 || this.A06 || !A0D().A0J()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("playbackPage/startPlayback not possible page=");
            A0u.append(this);
            A0u.append("; host=");
            C36351kA.A1L(this.A0H.A01, A0u);
            return;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("playbackPage/startPlayback page=");
        A0u2.append(this);
        A0u2.append("; host=");
        C36321k7.A1N(this.A0H.A01, A0u2);
        this.A06 = true;
        this.A05 = false;
        A0D().A0G();
        Boolean bool = C18750th.A03;
        this.A03.setProgressProvider(this.A0I);
        A03(this);
        this.A0L.A01();
        this.A09.A03();
        if (this.A02 || !this.A03 || this.A01.A0J != 4 || this.A02.A0F.A0K()) {
            A0G();
        } else {
            A0D();
        }
    }

    public C47592fB(C24791Du r3, C24801Dv r4, AnonymousClass17Y r5, AnonymousClass1XY r6, AnonymousClass1X4 r7, C21060yb r8, C19970wo r9, C18820ts r10, C20310xM r11, C32731e6 r12, AnonymousClass1QO r13, AnonymousClass16E r14, AnonymousClass1DW r15, C20810yC r16, AnonymousClass2XH r17, AnonymousClass1SU r18, AnonymousClass1CR r19, C29731Xt r20, AnonymousClass3JQ r21, AnonymousClass1A1 r22, AnonymousClass1X7 r23, C19770wU r24, C65813To r25) {
        this.A0R = r9;
        C20810yC r1 = r16;
        this.A0G = r1;
        this.A0K = r23;
        this.A0C = r5;
        this.A0T = r6;
        this.A0N = r24;
        this.A0F = r14;
        this.A0U = r7;
        this.A0B = r4;
        this.A0Z = r17;
        this.A0E = r13;
        this.A0V = r10;
        this.A0Y = r15;
        this.A0a = r18;
        this.A0X = r12;
        this.A0S = r3;
        this.A0W = r11;
        this.A0J = r22;
        this.A0b = r19;
        this.A0O = r25;
        this.A0c = r20;
        this.A0D = r8;
        this.A0H = r21;
        this.A00 = r1.A0E(6828);
    }

    public static void A02(C47592fB r1) {
        r1.A0D().A0F();
        r1.A0O(r1.A0P());
    }

    public static void A04(C47592fB r5, boolean z, boolean z2) {
        AnonymousClass3BI r3;
        AnonymousClass3BK A0E2 = r5.A0E();
        C18740tg.A04(r5.A00);
        if (A0E2.A0D.getVisibility() != 4 || A0E2.A09.getVisibility() != 4) {
            AlphaAnimation A0L2 = C36371kC.A0L();
            A0L2.setDuration(300);
            if (z) {
                A0E2.A09.startAnimation(A0L2);
                A0E2.A09.setVisibility(4);
            }
            if (z2) {
                r5.A00.setSystemUiVisibility(1798);
                if (A0E2.A0A.getVisibility() == 0) {
                    A0E2.A0A.startAnimation(A0L2);
                    A0E2.A0A.setVisibility(4);
                }
            }
            if (A0E2.A0D.getVisibility() == 0) {
                A0E2.A0D.startAnimation(A0L2);
                A0E2.A0D.setVisibility(4);
            }
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = r5.A0H.A01;
            AnonymousClass3BI r0 = statusPlaybackBaseFragment.A04;
            if ((r0 == null || r0.A06.getVisibility() != 4) && (r3 = statusPlaybackBaseFragment.A04) != null) {
                AlphaAnimation A0L3 = C36371kC.A0L();
                A0L3.setDuration(300);
                View view = r3.A06;
                view.startAnimation(A0L3);
                StatusPlaybackProgressView statusPlaybackProgressView = r3.A0F;
                statusPlaybackProgressView.startAnimation(A0L3);
                view.setVisibility(4);
                statusPlaybackProgressView.setVisibility(4);
                Button button = r3.A00;
                if (button != null) {
                    button.startAnimation(A0L3);
                }
                Button button2 = r3.A00;
                if (button2 != null) {
                    button2.setVisibility(4);
                }
            }
        }
    }

    public void A05() {
        AnonymousClass3ES r0;
        super.A05();
        AnonymousClass3LJ A0D2 = A0D();
        if (A0D2 instanceof C47522eu) {
            r0 = ((C47522eu) A0D2).A01;
        } else if (A0D2 instanceof C47532ev) {
            C47532ev.A01((C47532ev) A0D2);
            return;
        } else if (A0D2 instanceof C47512et) {
            r0 = ((C47512et) A0D2).A00;
        } else {
            return;
        }
        if (r0 != null) {
            r0.A03.dismiss();
        }
    }

    public void A06() {
        AnonymousClass3ES r0;
        Handler handler;
        super.A06();
        StatusPlaybackProgressView statusPlaybackProgressView = this.A03;
        if (statusPlaybackProgressView != null) {
            C87294Of r1 = this.A0I;
            AnonymousClass00C.A0D(r1, 0);
            if (statusPlaybackProgressView.A00 == r1) {
                statusPlaybackProgressView.A00 = null;
            }
            statusPlaybackProgressView.invalidate();
        }
        AnonymousClass3LJ A0D2 = A0D();
        if (A0D2 instanceof C47542ew) {
            C47542ew r3 = (C47542ew) A0D2;
            C37161lu r2 = r3.A01;
            if (!(r2 == null || (handler = r2.A02) == null)) {
                C81173wa.A00(handler, r2, 35);
            }
            r3.A01 = null;
            r3.A0A.A02(r3);
            r3.A02 = false;
            return;
        }
        if (A0D2 instanceof C47522eu) {
            C47522eu r32 = (C47522eu) A0D2;
            C47522eu.A05(r32);
            r32.A0I.A02(r32);
            r32.A03 = false;
            r0 = r32.A01;
        } else if (!(A0D2 instanceof C47502es) && !(A0D2 instanceof C47532ev) && (A0D2 instanceof C47512et)) {
            r0 = ((C47512et) A0D2).A00;
        } else {
            return;
        }
        if (r0 != null) {
            r0.A03.dismiss();
        }
    }

    public void A07() {
        super.A07();
        A0G();
        if (this.A04) {
            this.A09.A01();
            this.A0M.A01();
        }
    }

    public void A08() {
        super.A08();
        A0H();
        if (this.A04) {
            this.A09.A03();
        }
    }

    public void A09() {
        super.A09();
        C47582fA r0 = (C47582fA) this;
        this.A07 = r0.A0F.A0J(r0.A05);
        C224214g r2 = this.A0L;
        r2.A01 = 0;
        r2.A00 = 0;
        if (A0Q(true)) {
            r2.A03();
        }
        A0J();
        A0I();
    }

    public void A0A() {
        super.A0A();
        this.A09.A01();
        this.A0L.A01();
        StringBuilder A0u = AnonymousClass000.A0u();
        C36331k8.A1O(this, "playbackPage/stopPlayback page=", A0u);
        C36321k7.A1N(this.A0H.A01, A0u);
        this.A06 = false;
        this.A05 = false;
        StatusPlaybackProgressView statusPlaybackProgressView = this.A03;
        C87294Of r1 = this.A0I;
        AnonymousClass00C.A0D(r1, 0);
        if (statusPlaybackProgressView.A00 == r1) {
            statusPlaybackProgressView.A00 = null;
        }
        statusPlaybackProgressView.invalidate();
        A0D().A0H();
        A03(this);
        A03(this);
    }

    public void A0B(Rect rect) {
        super.A0B(rect);
        AnonymousClass3BK A0E2 = A0E();
        A0E2.A09.setPadding(rect.left, 0, rect.right, rect.bottom);
        A0E2.A03.setPadding(rect.left, 0, rect.right, rect.bottom);
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        View view = this.A00;
        C18740tg.A04(view);
        bottomSheetBehavior.A0V(C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved) + rect.bottom);
        ViewGroup viewGroup = this.A02.A0D;
        Rect rect2 = this.A06;
        viewGroup.setPadding(rect2.left, viewGroup.getPaddingTop(), rect2.right, rect2.bottom);
        AnonymousClass3LJ A0D2 = A0D();
        if (A0D2 instanceof C47532ev) {
            C47532ev r2 = (C47532ev) A0D2;
            int dimensionPixelSize = r2.A0B().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            r2.A0E.setPadding(rect.left, rect.top + dimensionPixelSize, rect.right, dimensionPixelSize + rect.bottom);
        }
    }

    public void A0K(int i) {
        AnonymousClass3BK A0E2 = A0E();
        if (i == 4) {
            A0E2.A0B.setVisibility(8);
            A0E2.A0E.setAlpha(1.0f);
            A0E2.A0G.A01().setAlpha(1.0f);
            A0H();
        } else if (i != 3) {
            A0G();
            ViewGroup viewGroup = this.A02.A0D;
            Rect rect = this.A06;
            viewGroup.setPadding(rect.left, viewGroup.getPaddingTop(), rect.right, rect.bottom);
        }
    }

    public void A0L(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("playbackPage/reportStatusExitStats exit-method=");
        String str = "UNKNOWN";
        switch (i) {
            case 1:
                str = "SWIPE_DOWN";
                break;
            case 2:
                str = "BACK_ARROW_TAP";
                break;
            case 3:
                str = "BACK_BUTTON_TAP";
                break;
            case 4:
                str = "STATUS_TIMEOUT";
                break;
            case 5:
                str = "STATUS_DISMISSED";
                break;
            case 6:
                str = "BACKWARD_SWIPE";
                break;
            case 7:
                str = "FORWARD_SWIPE";
                break;
            case 8:
                str = "BACKWARD_TAP";
                break;
            case 9:
                str = "FORWARD_TAP";
                break;
        }
        A0u.append(str);
        C36331k8.A1O(this, "; page=", A0u);
        C36321k7.A1N(this.A0H.A01, A0u);
    }

    public void A0M(int i, boolean z) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("playbackPage/reportStatusEnterStats entry-method=");
        String str = "UNKNOWN";
        switch (i) {
            case 1:
                str = "DIRECT_TAP";
                break;
            case 2:
                str = "BACKWARD_SWIPE";
                break;
            case 3:
                str = "FORWARD_SWIPE";
                break;
            case 4:
                str = "BACKWARD_TAP";
                break;
            case 5:
                str = "FORWARD_TAP";
                break;
            case 6:
                str = "PREVIOUS_STATUS_TIMEOUT";
                break;
            case 7:
                str = "PREVIOUS_STATUS_DISMISSED";
                break;
        }
        A0u.append(str);
        C36331k8.A1O(this, "; page=", A0u);
        C36321k7.A1N(this.A0H.A01, A0u);
    }

    public void A0N(View view) {
        AnonymousClass2bV r4;
        AnonymousClass2bU r0;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36331k8.A1O(this, "StatusPlaybackPage/onViewCreated page=", A0u);
        C36321k7.A1N(this.A0H.A01, A0u);
        C29731Xt r1 = this.A0c;
        AnonymousClass3T1 r42 = ((C47582fA) this).A05;
        int hashCode = r42.A1J.A01.hashCode();
        C21690ze r2 = r1.A09;
        r2.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_VIEW_CREATED_START");
        AnonymousClass3BK r11 = this.A02;
        C18740tg.A06(r11);
        String str = null;
        r11.A0F.setOnClickListener((View.OnClickListener) null);
        r11.A0F.setClickable(false);
        r11.A0F.A02 = new AnonymousClass4XU(this, r11, 0);
        this.A01 = new AnonymousClass21K(this);
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        ((C02460Ak) r11.A0D.getLayoutParams()).A00(bottomSheetBehavior);
        C89194Vp.A00(bottomSheetBehavior, this, 12);
        AnonymousClass21L r12 = new AnonymousClass21L(this);
        ((C02460Ak) r11.A01.getLayoutParams()).A00(r12);
        r12.A0a(new AnonymousClass21G(r11, this));
        r11.A07.setMax(100);
        r11.A04.addView(A0D().A0C());
        if (!(A0D() instanceof C47532ev) && ((r42 instanceof C88854Uh) || !(r42 instanceof AnonymousClass2bU) || (r0 = (AnonymousClass2bU) r42) == null || (str = r0.A1a()) == null)) {
            str = null;
            if ((r42 instanceof AnonymousClass2bV) && (r4 = (AnonymousClass2bV) r42) != null) {
                str = r4.A05;
            }
        }
        r11.A0F.A0L(this.A0Q, AnonymousClass14B.A0D(str, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH), this.A0G.A0E(2032));
        r11.A0A.setVisibility(r11.A0F.getVisibility());
        PointF pointF = new PointF();
        AtomicLong atomicLong = new AtomicLong();
        r11.A0C.setOnTouchListener(new C53812rv(pointF, this, atomicLong, 1));
        A0D().A0C().setOnClickListener(new AnonymousClass3YT(this, atomicLong, r11, pointF, 11));
        AnonymousClass3LJ A0D2 = A0D();
        if (A0D2 instanceof C47512et) {
            C47512et r6 = (C47512et) A0D2;
            C65013Qj r02 = r6.A06.A01;
            if (r02 != null) {
                AnonymousClass1D1 r5 = r6.A04;
                if (r5.A03(new AnonymousClass3IX(r02.A0A, r02.A06), true)) {
                    if (C20800yB.A01(C21000yV.A01, r5.A02, 6033)) {
                        C36331k8.A0q(r6.A0B(), r6.A05, R.string.f12nameremoved);
                    }
                }
            }
        }
        r2.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_VIEW_CREATED_END");
        r2.markerEnd(453119185, hashCode, 2);
    }

    public void A0O(boolean z) {
        Drawable drawable;
        AnonymousClass3BK A0E2 = A0E();
        ViewGroup viewGroup = A0E2.A0E;
        Drawable drawable2 = null;
        if (z) {
            View view = this.A00;
            C18740tg.A04(view);
            drawable = AnonymousClass00E.A00(view.getContext(), R.drawable.ic_center_shadow);
        } else {
            drawable = null;
        }
        viewGroup.setBackground(drawable);
        View A012 = A0E2.A0G.A01();
        if (z) {
            View view2 = this.A00;
            C18740tg.A04(view2);
            drawable2 = AnonymousClass00E.A00(view2.getContext(), R.drawable.ic_center_shadow);
        }
        A012.setBackground(drawable2);
    }

    public boolean A0P() {
        AnonymousClass2bU r2;
        if (!(A0D() instanceof C47532ev)) {
            AnonymousClass3T1 r22 = ((C47582fA) this).A05;
            String str = null;
            if (!(r22 instanceof C88854Uh) && (r22 instanceof AnonymousClass2bU) && (r2 = (AnonymousClass2bU) r22) != null) {
                str = r2.A1a();
            }
            if (!TextUtils.isEmpty(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BVf() {
        A0H();
    }
}
