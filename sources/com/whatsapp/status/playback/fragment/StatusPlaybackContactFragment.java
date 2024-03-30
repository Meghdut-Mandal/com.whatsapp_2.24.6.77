package com.whatsapp.status.playback.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass03T;
import X.AnonymousClass08I;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass155;
import X.AnonymousClass15K;
import X.AnonymousClass16D;
import X.AnonymousClass16E;
import X.AnonymousClass16F;
import X.AnonymousClass16I;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass190;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass1AW;
import X.AnonymousClass1CR;
import X.AnonymousClass1GQ;
import X.AnonymousClass1HT;
import X.AnonymousClass1LI;
import X.AnonymousClass1ND;
import X.AnonymousClass1NM;
import X.AnonymousClass1Q1;
import X.AnonymousClass1RY;
import X.AnonymousClass1X4;
import X.AnonymousClass1XY;
import X.AnonymousClass2bU;
import X.AnonymousClass3BI;
import X.AnonymousClass3BT;
import X.AnonymousClass3CG;
import X.AnonymousClass3LC;
import X.AnonymousClass3LQ;
import X.AnonymousClass3PF;
import X.AnonymousClass3SA;
import X.AnonymousClass3SF;
import X.AnonymousClass3T1;
import X.AnonymousClass3TJ;
import X.AnonymousClass3UJ;
import X.AnonymousClass3UY;
import X.AnonymousClass3XT;
import X.AnonymousClass3YM;
import X.AnonymousClass3ZU;
import X.AnonymousClass4E4;
import X.AnonymousClass4SX;
import X.AnonymousClass4W0;
import X.AnonymousClass4W3;
import X.AnonymousClass4WB;
import X.AnonymousClass4Z4;
import X.AnonymousClass4Z5;
import X.AnonymousClass737;
import X.C002000v;
import X.C005502l;
import X.C007103b;
import X.C022609n;
import X.C022709o;
import X.C023509x;
import X.C05290Pd;
import X.C17730rw;
import X.C177528dw;
import X.C177638e7;
import X.C181798o3;
import X.C18740tg;
import X.C18820ts;
import X.C18950u5;
import X.C19430v1;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C20310xM;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C21010yW;
import X.C21060yb;
import X.C21100yf;
import X.C223613z;
import X.C226815j;
import X.C233117z;
import X.C235718z;
import X.C24361Cd;
import X.C24511Cs;
import X.C25121Fb;
import X.C27731Pn;
import X.C28031Qx;
import X.C28301Sc;
import X.C28781Ua;
import X.C29731Xt;
import X.C32001cn;
import X.C32691e2;
import X.C33311f5;
import X.C34911hq;
import X.C34931hs;
import X.C35011i0;
import X.C35021i1;
import X.C35041i3;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C37351mE;
import X.C39101rC;
import X.C46932bu;
import X.C47532ev;
import X.C47572f9;
import X.C47592fB;
import X.C48902iF;
import X.C49792jh;
import X.C56032vc;
import X.C64883Pu;
import X.C64933Qa;
import X.C65013Qj;
import X.C65703Td;
import X.C66013Ui;
import X.C67153Ys;
import X.C81173wa;
import X.C81203wd;
import X.C87294Of;
import X.C88164Rq;
import X.C90394a5;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class StatusPlaybackContactFragment extends Hilt_StatusPlaybackContactFragment implements AnonymousClass15K, C28031Qx, C022609n, C022709o, C17730rw {
    public int A00;
    public int A01;
    public C32691e2 A02;
    public C19730wQ A03;
    public AnonymousClass1XY A04;
    public C21100yf A05;
    public AnonymousClass1LI A06;
    public AnonymousClass1X4 A07;
    public WfalManager A08;
    public AnonymousClass1ND A09;
    public C24361Cd A0A;
    public C235718z A0B;
    public AnonymousClass16D A0C;
    public AnonymousClass16I A0D;
    public AnonymousClass171 A0E;
    public C27731Pn A0F;
    public AnonymousClass1NM A0G;
    public C19970wo A0H;
    public C20310xM A0I;
    public AnonymousClass16J A0J;
    public AnonymousClass1HT A0K;
    public AnonymousClass16F A0L;
    public AnonymousClass16E A0M;
    public C21010yW A0N;
    public C25121Fb A0O;
    public C233117z A0P;
    public AnonymousClass190 A0Q;
    public UserJid A0R;
    public AnonymousClass1GQ A0S;
    public NewsletterLinkLauncher A0T;
    public AnonymousClass3T1 A0U;
    public AnonymousClass1AW A0V;
    public AnonymousClass1CR A0W;
    public AnonymousClass1Q1 A0X;
    public C64883Pu A0Y;
    public C28301Sc A0Z;
    public C29731Xt A0a;
    public AnonymousClass3BT A0b;
    public AnonymousClass1A1 A0c;
    public AnonymousClass13J A0d;
    public C19770wU A0e;
    public C34911hq A0f;
    public C34931hs A0g;
    public C35011i0 A0h;
    public C35021i1 A0i;
    public C28781Ua A0j;
    public AnonymousClass005 A0k;
    public AnonymousClass005 A0l;
    public String A0m;
    public List A0n;
    public Map A0o;
    public C005502l A0p;
    public C005502l A0q;
    public boolean A0r;
    public boolean A0s;
    public C49792jh A0t;
    public boolean A0u;
    public boolean A0v;
    public final C002000v A0w = new C39101rC(this);
    public final AnonymousClass00T A0x = C36431kI.A1I(new AnonymousClass4E4(this));
    public final C32001cn A0y = new AnonymousClass4W0(this, 16);
    public final C226815j A0z = AnonymousClass4W3.A00(this, 37);
    public final AnonymousClass191 A10 = C90394a5.A00(this, 32);
    public final C24511Cs A11 = new AnonymousClass4WB(this, 22);
    public final AnonymousClass4SX A12 = new AnonymousClass4Z5(this, 1);
    public final C35041i3 A13 = new AnonymousClass4Z4(this, 1);

    public void A1N(int i, int i2, Intent intent) {
        AnonymousClass155 r1;
        Bundle extras;
        if (i != 2) {
            super.A1N(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            ArrayList A0k2 = C36341k9.A0k(intent);
            boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
            String stringExtra = intent.getStringExtra("appended_message");
            AnonymousClass3XT r3 = null;
            if (AnonymousClass143.A0N(A0k2) && (extras = intent.getExtras()) != null) {
                C64883Pu r0 = this.A0Y;
                if (r0 != null) {
                    r3 = r0.A01(extras);
                } else {
                    throw C36331k8.A0d("statusAudienceRepository");
                }
            }
            AnonymousClass1X4 r12 = this.A07;
            if (r12 != null) {
                AnonymousClass1XY r2 = this.A04;
                if (r2 != null) {
                    r12.A0H(r2, r3, stringExtra, C36371kC.A11(this.A0U), A0k2, booleanExtra);
                    if (A0k2.size() != 1 || (C007103b.A0L(A0k2) instanceof C177528dw)) {
                        AnonymousClass01I A0h2 = A0h();
                        if ((A0h2 instanceof StatusPlaybackActivity) && (r1 = (AnonymousClass155) A0h2) != null) {
                            r1.Bvu(A0k2);
                            return;
                        }
                        return;
                    }
                    AnonymousClass190 r22 = this.A0Q;
                    if (r22 != null) {
                        Intent A0F2 = C36391kE.A0F(A0a(), r22, (AnonymousClass11F) C007103b.A0L(A0k2));
                        A1h();
                        AnonymousClass3LQ.A00(A0F2, this);
                        return;
                    }
                    throw C36331k8.A0X();
                }
                throw C36331k8.A0d("sendMedia");
            }
            throw C36331k8.A0d("userActions");
        }
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        AnonymousClass3T1 r0 = this.A0U;
        if (r0 != null) {
            AnonymousClass3UJ.A08(bundle, r0.A1J);
        }
    }

    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        AnonymousClass3BI r0 = this.A04;
        if (r0 != null) {
            View view3 = r0.A03;
            int i = 0;
            if (C36361kB.A1a(this.A0R, C223613z.A00) && !this.A0s) {
                i = 8;
            }
            view3.setVisibility(i);
        }
        A0B(this);
        C64933Qa A042 = AnonymousClass3UJ.A04(this);
        UserJid userJid = this.A0R;
        if (userJid != null) {
            AnonymousClass16E r4 = this.A0M;
            if (r4 != null) {
                C28781Ua r10 = this.A0j;
                if (r10 != null) {
                    AnonymousClass1A1 r9 = this.A0c;
                    if (r9 != null) {
                        WfalManager A1g = A1g();
                        AnonymousClass1HT r2 = this.A0K;
                        if (r2 != null) {
                            AnonymousClass16F r3 = this.A0L;
                            if (r3 != null) {
                                AnonymousClass005 r11 = this.A0k;
                                if (r11 != null) {
                                    AnonymousClass005 r12 = this.A0l;
                                    if (r12 != null) {
                                        C25121Fb r5 = this.A0O;
                                        if (r5 != null) {
                                            this.A0t = new C49792jh(A1g, r2, r3, r4, r5, userJid, A042, this, r9, r10, r11, r12, this.A0u, this.A0v);
                                            return;
                                        }
                                        throw C36331k8.A0d("fMessageLazyDataManager");
                                    }
                                    throw C36331k8.A0d("xFamilyStatusCrosspostStateCacheLazy");
                                }
                                throw C36331k8.A0d("waffleStatusCrosspostStateCacheLazy");
                            }
                            throw C36331k8.A0d("statusPsaCampaignStore");
                        }
                        throw C36331k8.A0d("statusMessageStore");
                    }
                    throw C36331k8.A0d("fMessageDatabase");
                }
                throw C36331k8.A0d("xFamilyGating");
            }
            throw C36331k8.A0d("statusStore");
        }
    }

    public String BCV() {
        return "status_playback_fragment";
    }

    public AnonymousClass3ZU BHi(int i, int i2, boolean z) {
        AnonymousClass3BI r0 = this.A04;
        C18740tg.A06(r0);
        ViewGroup viewGroup = r0.A07;
        View findViewById = A0i().findViewById(R.id.bottom_sheet);
        AnonymousClass00C.A08(findViewById);
        ArrayList A032 = AnonymousClass03T.A03(findViewById);
        C21060yb r5 = this.A01;
        if (r5 != null) {
            AnonymousClass3ZU r2 = new AnonymousClass3ZU((View) viewGroup, (AnonymousClass012) this, r5, (List) A032, i, i2, z);
            r2.A05(new C81173wa((Object) this, 39));
            return r2;
        }
        throw C36331k8.A0W();
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass3LC A052 = A05(this);
        if (A052 != null) {
            A052.A05();
        }
    }

    private final SpannableStringBuilder A00(TextView textView, int i, boolean z) {
        Drawable A002;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context A1D = A1D();
        if (!(A1D == null || (A002 = AnonymousClass00E.A00(A1D, i)) == null)) {
            spannableStringBuilder.append(' ');
            int color = C36341k9.A0G(this).getColor(R.color.f6nameremoved);
            int lineHeight = textView.getLineHeight();
            A002.setBounds(0, 0, lineHeight, lineHeight);
            A002.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
            A002.setAutoMirrored(z);
            AnonymousClass08I.A05(textView.getLayoutDirection(), A002);
            spannableStringBuilder.setSpan(new C37351mE(A002), 0, 1, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [X.2fB, X.3LC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v3, types: [X.2f8] */
    /* JADX WARNING: type inference failed for: r11v3, types: [X.2f9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3LC A03(X.AnonymousClass3T1 r67, com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r68) {
        /*
            r7 = r68
            X.3BI r6 = r7.A04
            X.00v r5 = r7.A0w
            r8 = r67
            X.3Qa r4 = r8.A1J
            X.AnonymousClass00C.A07(r4)
            java.lang.Object r3 = r5.A04(r4)
            if (r3 != 0) goto L_0x0163
            X.3BT r3 = r7.A0b
            if (r3 == 0) goto L_0x01ee
            X.3JQ r2 = new X.3JQ
            r2.<init>(r8, r7)
            X.00T r0 = r7.A0x
            java.lang.Object r1 = r0.getValue()
            X.1RY r1 = (X.AnonymousClass1RY) r1
            int r0 = r7.A01
            r9 = 1
            if (r0 != r9) goto L_0x01eb
            int r0 = r5.A02()
            if (r0 != 0) goto L_0x01eb
        L_0x002f:
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r10 = r4.A02
            X.0wo r0 = r3.A0I
            r51 = r0
            X.0yC r0 = r3.A0R
            if (r10 == 0) goto L_0x0166
            r40 = r0
            X.1X7 r0 = r3.A0g
            r57 = r0
            X.17Y r0 = r3.A04
            r68 = r0
            X.0wQ r0 = r3.A06
            r67 = r0
            X.1XY r0 = r3.A07
            r66 = r0
            X.0wU r0 = r3.A0h
            r58 = r0
            X.16E r0 = r3.A0P
            r38 = r0
            X.1X4 r0 = r3.A08
            r20 = r0
            X.1Dv r0 = r3.A03
            r65 = r0
            X.1Pn r0 = r3.A0E
            r27 = r0
            X.2XH r0 = r3.A0U
            r43 = r0
            X.1Ua r0 = r3.A0m
            r63 = r0
            X.1DW r0 = r3.A0Q
            r39 = r0
            X.16D r0 = r3.A0B
            r23 = r0
            X.1QO r0 = r3.A0O
            r37 = r0
            X.171 r0 = r3.A0D
            r25 = r0
            X.0ts r0 = r3.A0K
            r33 = r0
            X.1SU r0 = r3.A0W
            r45 = r0
            X.1e6 r0 = r3.A0N
            r36 = r0
            X.1GQ r0 = r3.A0X
            r46 = r0
            X.1e2 r0 = r3.A05
            r64 = r0
            X.16I r0 = r3.A0C
            r24 = r0
            X.0xM r0 = r3.A0L
            r34 = r0
            X.1A1 r0 = r3.A0f
            r56 = r0
            X.16J r0 = r3.A0M
            r35 = r0
            X.1CR r0 = r3.A0a
            r50 = r0
            com.whatsapp.bridge.wfal.WfalManager r0 = r3.A09
            r21 = r0
            X.1Cd r0 = r3.A0A
            r22 = r0
            X.0v0 r0 = r3.A0J
            r32 = r0
            X.3To r0 = r3.A0i
            r59 = r0
            X.1Xt r0 = r3.A0c
            r52 = r0
            X.3Sn r0 = r3.A0d
            r53 = r0
            X.1Y4 r0 = r3.A0V
            r44 = r0
            X.1i0 r0 = r3.A0l
            r62 = r0
            X.1dW r0 = r3.A0j
            r60 = r0
            X.17z r0 = r3.A0T
            r42 = r0
            X.3BQ r0 = r3.A0e
            r19 = r0
            X.0wp r0 = r3.A0G
            r18 = r0
            X.33O r0 = r3.A0k
            r17 = r0
            X.0yb r0 = r3.A0H
            r16 = r0
            X.1Fz r14 = r3.A0S
            X.1AW r13 = r3.A0Y
            X.1EO r12 = r3.A0Z
            X.37S r11 = r3.A0b
            X.0v5 r10 = r3.A02
            X.0v5 r9 = r3.A01
            X.3NN r0 = r3.A0F
            X.0v5 r15 = r3.A00
            X.2f9 r3 = new X.2f9
            r26 = r1
            r28 = r0
            r29 = r18
            r30 = r16
            r31 = r51
            r41 = r14
            r47 = r8
            r48 = r13
            r49 = r12
            r51 = r11
            r54 = r19
            r55 = r2
            r61 = r17
            r11 = r3
            r12 = r10
            r13 = r9
            r14 = r15
            r15 = r64
            r16 = r65
            r17 = r68
            r18 = r67
            r19 = r66
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
        L_0x0118:
            if (r6 == 0) goto L_0x0160
            android.view.ViewGroup r8 = r6.A07
            int r1 = r7.A08
            r0 = 7
            boolean r6 = X.C36371kC.A1T(r1, r0)
            android.graphics.Rect r2 = r7.A01
            X.C36321k7.A0y(r8, r2)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0160
            r0 = 1
            r3.A01 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "StatusPlaybackPage/onCreate page="
            X.C36331k8.A1O(r3, r0, r1)
            X.3JQ r0 = r3.A0H
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = r0.A01
            X.C36321k7.A1N(r0, r1)
            android.view.LayoutInflater r0 = X.C36351kA.A0C(r8)
            X.AnonymousClass00C.A08(r0)
            android.view.View r0 = r3.A0C(r0, r8)
            r3.A00 = r0
            r3.A0N(r0)
            X.C47592fB.A02(r3)
            r3.A0B(r2)
            if (r6 == 0) goto L_0x0160
            boolean r0 = r3.A03
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0160
            r3.A08()
        L_0x0160:
            r5.A08(r4, r3)
        L_0x0163:
            X.3LC r3 = (X.AnonymousClass3LC) r3
            return r3
        L_0x0166:
            r34 = r0
            X.1X7 r0 = r3.A0g
            r47 = r0
            X.17Y r0 = r3.A04
            r19 = r0
            X.1XY r0 = r3.A07
            r20 = r0
            X.0wU r0 = r3.A0h
            r48 = r0
            X.16E r0 = r3.A0P
            r32 = r0
            X.1X4 r0 = r3.A08
            r21 = r0
            X.1Dv r0 = r3.A03
            r18 = r0
            X.2XH r0 = r3.A0U
            r35 = r0
            X.1DW r0 = r3.A0Q
            r33 = r0
            X.16D r0 = r3.A0B
            r22 = r0
            X.1QO r0 = r3.A0O
            r31 = r0
            X.171 r0 = r3.A0D
            r23 = r0
            X.0ts r0 = r3.A0K
            r27 = r0
            X.1SU r0 = r3.A0W
            r37 = r0
            X.1e6 r0 = r3.A0N
            r30 = r0
            X.1e2 r0 = r3.A05
            r17 = r0
            X.0xM r0 = r3.A0L
            r28 = r0
            X.1A1 r0 = r3.A0f
            r46 = r0
            X.16J r0 = r3.A0M
            r29 = r0
            X.1CR r0 = r3.A0a
            r41 = r0
            X.3To r0 = r3.A0i
            r49 = r0
            X.1Xt r15 = r3.A0c
            X.3Sn r14 = r3.A0d
            X.1Y4 r13 = r3.A0V
            X.3BQ r12 = r3.A0e
            X.0yb r11 = r3.A0H
            X.1AW r10 = r3.A0Y
            X.1EO r0 = r3.A0Z
            X.2f8 r3 = new X.2f8
            r16 = r3
            r24 = r1
            r25 = r11
            r26 = r51
            r36 = r13
            r38 = r8
            r39 = r10
            r40 = r0
            r42 = r15
            r43 = r14
            r44 = r12
            r45 = r2
            r50 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            goto L_0x0118
        L_0x01eb:
            r9 = 0
            goto L_0x002f
        L_0x01ee:
            java.lang.String r0 = "statusPlaybackPageFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A03(X.3T1, com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment):X.3LC");
    }

    public static final AnonymousClass3LC A05(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        List list;
        List list2;
        int i = statusPlaybackContactFragment.A00;
        if (i < 0 || (list = statusPlaybackContactFragment.A0n) == null || i >= list.size() || (list2 = statusPlaybackContactFragment.A0n) == null) {
            return null;
        }
        C002000v r1 = statusPlaybackContactFragment.A0w;
        C64933Qa r0 = C36411kG.A0n(list2, statusPlaybackContactFragment.A00).A1J;
        AnonymousClass00C.A07(r0);
        return (AnonymousClass3LC) r1.A04(r0);
    }

    private final void A07(SpannableStringBuilder spannableStringBuilder, AnonymousClass3T1 r11, AnonymousClass3BI r12) {
        View view;
        View findViewById;
        TextView textView = r12.A0C;
        if (r11.A0W() != null) {
            C20810yC r1 = this.A03;
            if (r1 == null) {
                throw C36321k7.A07();
            } else if (r1.A0E(6444)) {
                spannableStringBuilder.append(' ').append("•").append(' ');
                SpannableStringBuilder A0P2 = C36441kJ.A0P(A00(textView, R.drawable.vec_ic_newsletter_filled, false));
                A0P2.append(' ');
                String A0a2 = C36421kH.A0a(this, R.string.f12nameremoved);
                A0P2.append(A0a2).setSpan(new StyleSpan(1), A0P2.length() - A0a2.length(), A0P2.length(), 18);
                A0P2.append(A00(textView, R.drawable.vec_ic_chevron_right, true));
                textView.setText(A0P2);
                C48902iF.A00(textView, r11, this, 29);
                AnonymousClass3LC A052 = A05(this);
                if (!(A052 == null || (view = A052.A00) == null || (findViewById = view.findViewById(R.id.click_handler)) == null)) {
                    findViewById.post(new AnonymousClass737(textView, this, findViewById, 4));
                }
                textView.setVisibility(0);
            }
        }
    }

    public static final void A09(AnonymousClass141 r6, StatusPlaybackContactFragment statusPlaybackContactFragment) {
        AnonymousClass3BI r2 = statusPlaybackContactFragment.A04;
        if (r2 != null) {
            ImageView imageView = r2.A0B;
            ((AnonymousClass1RY) statusPlaybackContactFragment.A0x.getValue()).A08(imageView, r6);
            AnonymousClass1LI r3 = statusPlaybackContactFragment.A06;
            if (r3 != null) {
                AnonymousClass3SF A012 = AnonymousClass3SF.A01(r2.A09, r3, R.id.name);
                UserJid userJid = statusPlaybackContactFragment.A0R;
                C223613z r32 = C223613z.A00;
                if (userJid == r32) {
                    TextEmojiLabel textEmojiLabel = A012.A01;
                    textEmojiLabel.setText(R.string.f12nameremoved);
                    textEmojiLabel.A0E();
                } else {
                    AnonymousClass171 r0 = statusPlaybackContactFragment.A0E;
                    if (r0 != null) {
                        A012.A09((List) null, r0.A0L(r6));
                        A012.A03(statusPlaybackContactFragment.A0R instanceof C177638e7 ? 1 : 0);
                    } else {
                        throw C36331k8.A0c();
                    }
                }
                UserJid userJid2 = statusPlaybackContactFragment.A0R;
                if (!(userJid2 instanceof PhoneUserJid) || userJid2 == r32) {
                    imageView.setClickable(false);
                    r2.A04.setClickable(false);
                    return;
                }
                AnonymousClass3YM.A00(imageView, statusPlaybackContactFragment, r2, r6, 30);
                AnonymousClass3YM.A00(r2.A04, statusPlaybackContactFragment, r2, r6, 29);
                return;
            }
            throw C36331k8.A0d("textEmojiLabelViewControllerFactory");
        }
    }

    public static final void A0A(AnonymousClass3T1 r8, StatusPlaybackContactFragment statusPlaybackContactFragment) {
        TextView textView;
        int i;
        AnonymousClass2bU r0;
        C65013Qj r1;
        Context A0a2;
        int lineHeight;
        int color;
        int i2;
        AnonymousClass3BI r12 = statusPlaybackContactFragment.A04;
        TextView textView2 = null;
        if (r12 != null) {
            textView = r12.A0D;
            textView2 = r12.A0C;
        } else {
            textView = null;
        }
        int A042 = C36411kG.A04(textView2);
        if (!(statusPlaybackContactFragment.A0R instanceof C177638e7)) {
            C36361kB.A14(textView);
            if (r8.A1J.A02) {
                AnonymousClass3BI r5 = statusPlaybackContactFragment.A04;
                if (C36401kF.A1U(AnonymousClass3TJ.A00(r8.A0D, 4))) {
                    long j = r8.A0H;
                    if (j <= 0) {
                        j = r8.A0I;
                    }
                    SpannableStringBuilder A0P2 = C36441kJ.A0P(statusPlaybackContactFragment.A06(r8, j));
                    if (r5 != null) {
                        C28781Ua r02 = statusPlaybackContactFragment.A0j;
                        if (r02 != null) {
                            if (r02.A02()) {
                                C35011i0 r03 = statusPlaybackContactFragment.A0h;
                                if (r03 != null) {
                                    boolean A092 = r03.A09(r8);
                                    C35011i0 r04 = statusPlaybackContactFragment.A0h;
                                    if (A092) {
                                        if (r04 != null) {
                                            A0a2 = statusPlaybackContactFragment.A0a();
                                            lineHeight = r5.A0D.getLineHeight();
                                            color = C36341k9.A0G(statusPlaybackContactFragment).getColor(R.color.f6nameremoved);
                                            i2 = R.drawable.ic_settings_fb;
                                        } else {
                                            throw C36331k8.A0d("xFamilyCrosspostManager");
                                        }
                                    } else if (r04 == null) {
                                        throw C36331k8.A0d("xFamilyCrosspostManager");
                                    } else if (r04.A08(r8)) {
                                        if (statusPlaybackContactFragment.A0h != null) {
                                            A0a2 = statusPlaybackContactFragment.A0a();
                                            lineHeight = r5.A0D.getLineHeight();
                                            color = C36341k9.A0G(statusPlaybackContactFragment).getColor(R.color.f6nameremoved);
                                            i2 = R.drawable.ic_settings_fb_hollow;
                                        } else {
                                            throw C36331k8.A0d("xFamilyCrosspostManager");
                                        }
                                    }
                                    A0P2.append(C56032vc.A00(A0a2, lineHeight, i2, color));
                                } else {
                                    throw C36331k8.A0d("xFamilyCrosspostManager");
                                }
                            }
                            statusPlaybackContactFragment.A1g();
                            statusPlaybackContactFragment.A07(A0P2, r8, r5);
                        } else {
                            throw C36331k8.A0d("xFamilyGating");
                        }
                    }
                    if (textView != null) {
                        textView.setText(A0P2);
                        return;
                    }
                    return;
                }
                if (!(r8 instanceof AnonymousClass2bU) || (r0 = (AnonymousClass2bU) r8) == null || (r1 = r0.A01) == null || r1.A0V || r1.A0f) {
                    boolean A0n2 = C66013Ui.A0n(r8);
                    i = R.string.f12nameremoved;
                    if (A0n2) {
                        i = R.string.f12nameremoved;
                    }
                } else {
                    i = R.string.f12nameremoved;
                }
                if (textView != null) {
                    textView.setText(i);
                    return;
                }
                return;
            }
            SpannableStringBuilder A0P3 = C36441kJ.A0P(statusPlaybackContactFragment.A06(r8, statusPlaybackContactFragment.A1h().A08(r8.A0I)));
            AnonymousClass3BI r05 = statusPlaybackContactFragment.A04;
            if (r05 != null) {
                statusPlaybackContactFragment.A07(A0P3, r8, r05);
            }
            if (textView != null) {
                textView.setText(A0P3);
            }
        } else if (textView != null) {
            textView.setVisibility(A042);
        }
    }

    public static final void A0B(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        UserJid userJid = statusPlaybackContactFragment.A0R;
        if (userJid != null) {
            if (userJid == C223613z.A00) {
                C19730wQ r0 = statusPlaybackContactFragment.A03;
                if (r0 != null) {
                    userJid = C36371kC.A0e(r0);
                    AnonymousClass00C.A08(userJid);
                } else {
                    throw C36331k8.A0d("meManager");
                }
            }
            C20810yC r1 = statusPlaybackContactFragment.A03;
            if (r1 == null) {
                throw C36321k7.A07();
            } else if (r1.A0E(7754)) {
                LifecycleCoroutineScopeImpl A002 = C33311f5.A00(statusPlaybackContactFragment);
                C005502l r2 = statusPlaybackContactFragment.A0p;
                if (r2 != null) {
                    C36381kD.A1R(r2, new StatusPlaybackContactFragment$fetchContactAndUpdateUI$1(userJid, statusPlaybackContactFragment, (C023509x) null), A002);
                    return;
                }
                throw C36331k8.A0d("ioDispatcher");
            } else {
                AnonymousClass16D r02 = statusPlaybackContactFragment.A0C;
                if (r02 != null) {
                    A09(r02.A0D(userJid), statusPlaybackContactFragment);
                    return;
                }
                throw C36331k8.A0Z();
            }
        }
    }

    public static final void A0C(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        List list;
        AnonymousClass3T1 A0n2;
        C47572f9 r4;
        Boolean bool;
        int i = statusPlaybackContactFragment.A00;
        if (i >= 0 && (list = statusPlaybackContactFragment.A0n) != null && i < list.size()) {
            List list2 = statusPlaybackContactFragment.A0n;
            if (list2 == null || (A0n2 = C36411kG.A0n(list2, statusPlaybackContactFragment.A00)) == null) {
                Log.w("playbackFragment/refreshCurrentPageSubTitle message is empty");
                return;
            }
            A0A(A0n2, statusPlaybackContactFragment);
            AnonymousClass3LC A032 = A03(A0n2, statusPlaybackContactFragment);
            if ((A032 instanceof C47572f9) && (r4 = (C47572f9) A032) != null) {
                AnonymousClass3PF r3 = r4.A0S().A08;
                if (r3 != null) {
                    if (r4.A0D.A02()) {
                        bool = Boolean.valueOf(r4.A0C.A07(3, Collections.singletonList(r4.A05)));
                    } else {
                        bool = null;
                    }
                    ImageView imageView = r3.A00;
                    if (!(imageView == null || bool == null || !r3.A0K.A02())) {
                        imageView.setVisibility(C36351kA.A00(bool.booleanValue() ? 1 : 0));
                    }
                }
                r4.A0S();
            }
        }
    }

    public static final void A0D(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        C65013Qj r1;
        StatusPlaybackProgressView statusPlaybackProgressView;
        StatusPlaybackProgressView statusPlaybackProgressView2;
        AnonymousClass3BI r5 = statusPlaybackContactFragment.A04;
        List list = statusPlaybackContactFragment.A0n;
        if (list != null) {
            if (!(r5 == null || (statusPlaybackProgressView2 = r5.A0F) == null)) {
                statusPlaybackProgressView2.setCount(list.size());
                statusPlaybackProgressView2.A04.clear();
            }
            if (statusPlaybackContactFragment.A0R == C223613z.A00) {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    AnonymousClass3T1 A0l2 = C36391kE.A0l(it);
                    if ((A0l2 instanceof AnonymousClass2bU) && (r1 = ((AnonymousClass2bU) A0l2).A01) != null && !r1.A0V && !r1.A0f && !(((A0l2 instanceof C181798o3) && C65703Td.A04((C46932bu) A0l2)) || r5 == null || (statusPlaybackProgressView = r5.A0F) == null)) {
                        statusPlaybackProgressView.A04.add(Integer.valueOf(i));
                    }
                    i++;
                }
            }
        }
    }

    public static final void A0E(StatusPlaybackContactFragment statusPlaybackContactFragment, int i) {
        List list;
        AnonymousClass3T1 r4;
        ViewGroup viewGroup;
        int i2;
        Map map;
        AnonymousClass3SA r5;
        Button button;
        StatusPlaybackProgressView statusPlaybackProgressView;
        if (statusPlaybackContactFragment.A00 != i && (list = statusPlaybackContactFragment.A0n) != null) {
            if (list.isEmpty()) {
                C36321k7.A1L(statusPlaybackContactFragment, "playbackFragment/setPageActive no-messages ", AnonymousClass000.A0u());
                return;
            }
            statusPlaybackContactFragment.A00 = i;
            AnonymousClass3BI r0 = statusPlaybackContactFragment.A04;
            if (!(r0 == null || (statusPlaybackProgressView = r0.A0F) == null)) {
                statusPlaybackProgressView.setPosition(i);
                statusPlaybackProgressView.setProgressProvider((C87294Of) null);
            }
            List list2 = statusPlaybackContactFragment.A0n;
            if (list2 != null && (r4 = (AnonymousClass3T1) C007103b.A0P(list2, i)) != null) {
                if (!(!(r4.A0J() instanceof C177638e7) || (map = statusPlaybackContactFragment.A0o) == null || (r5 = (AnonymousClass3SA) map.get(Long.valueOf(r4.A1N))) == null)) {
                    C29731Xt r7 = statusPlaybackContactFragment.A0a;
                    if (r7 != null) {
                        String str = r4.A1J.A01;
                        AnonymousClass00C.A07(str);
                        r7.A0E.put(str, false);
                        String str2 = r5.A03;
                        String str3 = r5.A02;
                        View view = null;
                        if (str2 == null || str3 == null) {
                            AnonymousClass3BI r02 = statusPlaybackContactFragment.A04;
                            if (r02 != null) {
                                C36331k8.A0y(r02.A08);
                            }
                        } else {
                            AnonymousClass3BI r03 = statusPlaybackContactFragment.A04;
                            if (r03 != null) {
                                button = r03.A00;
                                if (button == null) {
                                    ViewStub viewStub = r03.A08;
                                    if (viewStub != null) {
                                        view = viewStub.inflate();
                                    }
                                }
                                button.setText(r5.A02);
                                button.setOnClickListener(new C67153Ys(statusPlaybackContactFragment, r4, str2, 4));
                                button.setVisibility(0);
                            }
                            AnonymousClass00C.A0E(view, "null cannot be cast to non-null type android.widget.Button");
                            button = (Button) view;
                            AnonymousClass3BI r04 = statusPlaybackContactFragment.A04;
                            if (r04 != null) {
                                r04.A00 = button;
                            }
                            button.setText(r5.A02);
                            button.setOnClickListener(new C67153Ys(statusPlaybackContactFragment, r4, str2, 4));
                            button.setVisibility(0);
                        }
                        statusPlaybackContactFragment.A0m = r5.A04;
                    } else {
                        throw C36331k8.A0d("statusesStatsManager");
                    }
                }
                AnonymousClass3LC A032 = A03(r4, statusPlaybackContactFragment);
                AnonymousClass3BI r05 = statusPlaybackContactFragment.A04;
                if (r05 != null) {
                    View view2 = r05.A05;
                    if (((C47592fB) A032).A0D() instanceof C47532ev) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    view2.setVisibility(i2);
                }
                View view3 = A032.A00;
                AnonymousClass3BI r06 = statusPlaybackContactFragment.A04;
                if (!(r06 == null || (viewGroup = r06.A07) == null || (viewGroup.getChildCount() != 0 && viewGroup.getChildAt(0) == view3))) {
                    viewGroup.removeAllViews();
                    viewGroup.addView(view3);
                }
                Collection values = statusPlaybackContactFragment.A0w.A06().values();
                ArrayList<AnonymousClass3LC> A0I2 = AnonymousClass001.A0I();
                for (Object next : values) {
                    C36391kE.A1V(next, A0I2, AnonymousClass00C.A0J(next, A032) ? 1 : 0);
                }
                for (AnonymousClass3LC r1 : A0I2) {
                    if (r1 != null && r1.A04) {
                        r1.A0A();
                    }
                }
                A0A(r4, statusPlaybackContactFragment);
                if (!A032.A04) {
                    A032.A09();
                }
                List list3 = statusPlaybackContactFragment.A0n;
                if (list3 != null) {
                    if (i < C36421kH.A06(list3, 1)) {
                        A03(C36411kG.A0n(list3, i + 1), statusPlaybackContactFragment);
                    }
                    if (i > 0) {
                        A03(C36411kG.A0n(list3, i - 1), statusPlaybackContactFragment);
                    }
                }
                UserJid userJid = statusPlaybackContactFragment.A0R;
                if (userJid != null) {
                    AnonymousClass1NM r12 = statusPlaybackContactFragment.A0G;
                    if (r12 != null) {
                        r12.A09(userJid, 9);
                        return;
                    }
                    throw C36331k8.A0d("chatMessageCounts");
                }
            }
        }
    }

    public static final void A0F(StatusPlaybackContactFragment statusPlaybackContactFragment, AnonymousClass3LC r3, int i, int i2) {
        Collection values = statusPlaybackContactFragment.A0w.A06().values();
        ArrayList<AnonymousClass3LC> A0I2 = AnonymousClass001.A0I();
        for (Object next : values) {
            if (next != r3) {
                A0I2.add(next);
            }
        }
        for (AnonymousClass3LC r1 : A0I2) {
            if (r1 != null && r1.A05) {
                C47592fB r12 = (C47592fB) r1;
                r12.A05 = false;
                r12.A0L(i);
            }
        }
        if (r3 != null && (!r3.A05)) {
            C47592fB r32 = (C47592fB) r3;
            r32.A05 = true;
            r32.A0M(i2, r32.A07);
        }
    }

    public static final boolean A0G(StatusPlaybackContactFragment statusPlaybackContactFragment, int i, int i2) {
        List list = statusPlaybackContactFragment.A0n;
        if (list == null) {
            return false;
        }
        if (statusPlaybackContactFragment.A00 < list.size() - 1) {
            A0E(statusPlaybackContactFragment, statusPlaybackContactFragment.A00 + 1);
            A0F(statusPlaybackContactFragment, A05(statusPlaybackContactFragment), i, i2);
            return true;
        }
        C88164Rq r1 = (C88164Rq) statusPlaybackContactFragment.A0h();
        if (r1 != null) {
            return r1.BZP(statusPlaybackContactFragment.A1Z(), i, i2, true);
        }
        return false;
    }

    public final WfalManager A1g() {
        WfalManager wfalManager = this.A08;
        if (wfalManager != null) {
            return wfalManager;
        }
        throw C36331k8.A0d("wfalManager");
    }

    public final C19970wo A1h() {
        C19970wo r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public AnonymousClass01P BAc() {
        AnonymousClass01P r0 = this.A0P.A02;
        AnonymousClass00C.A08(r0);
        return r0;
    }

    public C18950u5 BGv() {
        C18950u5 r0 = C19430v1.A01;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public void BVg(DialogFragment dialogFragment, boolean z) {
        this.A0r = z;
        A1a();
    }

    public String toString() {
        String str;
        UserJid userJid = this.A0R;
        if ((userJid != null && (str = userJid.toString()) != null) || (str = C36411kG.A0x(this)) != null) {
            return str;
        }
        throw C36381kD.A0k();
    }

    private final String A06(AnonymousClass3T1 r12, long j) {
        String A0B2;
        long currentTimeMillis;
        int i;
        if (r12.A0W() != null) {
            C20810yC r1 = this.A03;
            if (r1 == null) {
                throw C36321k7.A07();
            } else if (r1.A0E(6444)) {
                int i2 = (r12.A0H > 0 ? 1 : (r12.A0H == 0 ? 0 : -1));
                C19970wo A1h = A1h();
                if (i2 > 0) {
                    currentTimeMillis = C19970wo.A00(A1h);
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                C18820ts r7 = this.A02;
                if (r7 != null) {
                    long j2 = currentTimeMillis - j;
                    long days = TimeUnit.MILLISECONDS.toDays(j2);
                    if (days > 0) {
                        i = 276;
                    } else {
                        long millis = j2 - TimeUnit.DAYS.toMillis(days);
                        days = TimeUnit.MILLISECONDS.toHours(millis);
                        if (days > 0) {
                            i = 280;
                        } else {
                            long millis2 = millis - TimeUnit.HOURS.toMillis(days);
                            days = TimeUnit.MILLISECONDS.toMinutes(millis2);
                            if (days > 0) {
                                i = 285;
                            } else {
                                days = TimeUnit.MILLISECONDS.toSeconds(millis2 - TimeUnit.MINUTES.toMillis(days));
                                i = 291;
                            }
                        }
                    }
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1M(objArr, 0, days);
                    A0B2 = r7.A0K(objArr, i, days);
                    AnonymousClass00C.A0B(A0B2);
                    return A0B2;
                }
                throw C36321k7.A09();
            }
        }
        A1h();
        C18820ts r2 = this.A02;
        if (r2 != null) {
            A0B2 = AnonymousClass3UY.A0B(r2, A1h().A08(j));
            AnonymousClass00C.A0B(A0B2);
            return A0B2;
        }
        throw C36321k7.A09();
    }

    public static final void A08(AnonymousClass141 r4, AnonymousClass3BI r5, StatusPlaybackContactFragment statusPlaybackContactFragment) {
        AnonymousClass01I A0i2 = statusPlaybackContactFragment.A0i();
        Bundle A002 = AnonymousClass3CG.A00(A0i2, r5.A0B, new AnonymousClass3CG(A0i2));
        AnonymousClass190 r1 = statusPlaybackContactFragment.A0Q;
        if (r1 != null) {
            C05290Pd.A00(A0i2, r1.A1X(A0i2, r4, C36371kC.A0p()), A002);
            return;
        }
        throw C36331k8.A0X();
    }

    public void A1H() {
        super.A1H();
        AnonymousClass16I r1 = this.A0D;
        if (r1 != null) {
            r1.unregisterObserver(this.A0z);
            AnonymousClass16J r12 = this.A0J;
            if (r12 != null) {
                r12.unregisterObserver(this.A10);
                C24361Cd r13 = this.A0A;
                if (r13 != null) {
                    r13.unregisterObserver(this.A0y);
                    C233117z r14 = this.A0P;
                    if (r14 != null) {
                        r14.unregisterObserver(this.A11);
                        AnonymousClass1Q1 r0 = this.A0X;
                        if (r0 != null) {
                            r0.A02(this);
                            A1g();
                            C28781Ua r02 = this.A0j;
                            if (r02 != null) {
                                if (r02.A02()) {
                                    C35021i1 r15 = this.A0i;
                                    if (r15 != null) {
                                        r15.unregisterObserver(this.A13);
                                    } else {
                                        throw C36331k8.A0d("xFamilyCrosspostEventObservers");
                                    }
                                }
                                C36331k8.A1E(this.A0t);
                                ((AnonymousClass1RY) this.A0x.getValue()).A02();
                                return;
                            }
                            throw C36331k8.A0d("xFamilyGating");
                        }
                        throw C36331k8.A0d("waSnackbarRegistry");
                    }
                    throw C36331k8.A0d("groupParticipantsObservers");
                }
                throw C36331k8.A0d("chatStateObservers");
            }
            throw C36331k8.A0d("messageObservers");
        }
        throw C36331k8.A0d("contactObservers");
    }

    public void A1J() {
        super.A1J();
        this.A0w.A07(-1);
    }

    public void A1K() {
        super.A1K();
        Iterator A0z2 = AnonymousClass000.A0z(this.A0w.A06());
        while (A0z2.hasNext()) {
            AnonymousClass3LC r1 = (AnonymousClass3LC) A0z2.next();
            if (r1 != null && r1.A03) {
                r1.A07();
            }
        }
    }

    public void A1L() {
        super.A1L();
        Iterator A0z2 = AnonymousClass000.A0z(this.A0w.A06());
        while (A0z2.hasNext()) {
            AnonymousClass3LC r1 = (AnonymousClass3LC) A0z2.next();
            if (r1 != null && (!r1.A03)) {
                r1.A08();
            }
        }
    }

    public void A1P(Bundle bundle) {
        super.A1P(bundle);
        AnonymousClass16I r1 = this.A0D;
        if (r1 != null) {
            r1.registerObserver(this.A0z);
            AnonymousClass16J r12 = this.A0J;
            if (r12 != null) {
                r12.registerObserver(this.A10);
                C24361Cd r13 = this.A0A;
                if (r13 != null) {
                    r13.registerObserver(this.A0y);
                    C233117z r14 = this.A0P;
                    if (r14 != null) {
                        r14.registerObserver(this.A11);
                        AnonymousClass1Q1 r0 = this.A0X;
                        if (r0 != null) {
                            r0.A01(this);
                            A1g();
                            C28781Ua r02 = this.A0j;
                            if (r02 != null) {
                                if (r02.A02()) {
                                    C35021i1 r15 = this.A0i;
                                    if (r15 != null) {
                                        r15.registerObserver(this.A13);
                                    } else {
                                        throw C36331k8.A0d("xFamilyCrosspostEventObservers");
                                    }
                                }
                                C49792jh r16 = this.A0t;
                                if (r16 != null) {
                                    C19770wU r03 = this.A0e;
                                    if (r03 != null) {
                                        C36391kE.A1Q(r16, r03);
                                    } else {
                                        throw C36321k7.A08();
                                    }
                                }
                                UserJid userJid = this.A0R;
                                if (userJid != C223613z.A00 && userJid != null) {
                                    C20810yC r17 = this.A03;
                                    if (r17 == null) {
                                        throw C36321k7.A07();
                                    } else if (r17.A0E(7754)) {
                                        LifecycleCoroutineScopeImpl A002 = C33311f5.A00(this);
                                        C005502l r2 = this.A0p;
                                        if (r2 != null) {
                                            C36381kD.A1R(r2, new StatusPlaybackContactFragment$onActivityCreated$2(userJid, this, (C023509x) null), A002);
                                            return;
                                        }
                                        throw C36331k8.A0d("ioDispatcher");
                                    } else {
                                        AnonymousClass16D r04 = this.A0C;
                                        if (r04 != null) {
                                            AnonymousClass141 A0D2 = r04.A0D(userJid);
                                            if (A0D2.A14) {
                                                A0D2.A14 = false;
                                                C19770wU r18 = this.A0e;
                                                if (r18 != null) {
                                                    C81203wd.A02(r18, this, A0D2, 12);
                                                    return;
                                                }
                                                throw C36321k7.A08();
                                            }
                                            return;
                                        }
                                        throw C36331k8.A0Z();
                                    }
                                }
                            } else {
                                throw C36331k8.A0d("xFamilyGating");
                            }
                        } else {
                            throw C36331k8.A0d("waSnackbarRegistry");
                        }
                    } else {
                        throw C36331k8.A0d("groupParticipantsObservers");
                    }
                } else {
                    throw C36331k8.A0d("chatStateObservers");
                }
            } else {
                throw C36331k8.A0d("messageObservers");
            }
        } else {
            throw C36331k8.A0d("contactObservers");
        }
    }

    public void A1Q(Bundle bundle) {
        C64933Qa A032;
        super.A1Q(bundle);
        C20810yC r2 = this.A03;
        if (r2 != null) {
            this.A0v = C20800yB.A01(C21000yV.A01, r2, 1875);
            String A0x2 = C36411kG.A0x(this);
            UserJid userJid = C223613z.A00;
            if (!"".equals(A0x2) && !userJid.getRawString().equals(A0x2)) {
                userJid = C36431kI.A0l(A0x2);
            }
            this.A0R = userJid;
            AnonymousClass1GQ r0 = this.A0S;
            if (r0 != null) {
                this.A0s = C36391kE.A1Z(r0);
                this.A0u = A0b().getBoolean("unseen_only");
                if (bundle != null && (A032 = AnonymousClass3UJ.A03(bundle, "")) != null) {
                    AnonymousClass1A1 r02 = this.A0c;
                    if (r02 != null) {
                        this.A0U = r02.A03(A032);
                        return;
                    }
                    throw C36331k8.A0d("fMessageDatabase");
                }
                return;
            }
            throw C36331k8.A0d("newsletterConfig");
        }
        throw C36321k7.A07();
    }

    public void A1b() {
        super.A1b();
        if (this.A0n != null) {
            int i = this.A00;
            this.A00 = -1;
            if (i == -1) {
                i = 0;
            }
            A0E(this, i);
        }
    }

    public void A1c() {
        super.A1c();
        AnonymousClass3LC A052 = A05(this);
        if (A052 != null && A052.A04) {
            A052.A0A();
        }
    }
}
