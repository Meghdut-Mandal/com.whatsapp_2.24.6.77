package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1AP;
import X.AnonymousClass1BB;
import X.AnonymousClass1GX;
import X.AnonymousClass1H2;
import X.AnonymousClass1HA;
import X.AnonymousClass1LX;
import X.AnonymousClass1N2;
import X.AnonymousClass2XH;
import X.AnonymousClass3T1;
import X.AnonymousClass3UT;
import X.AnonymousClass5Co;
import X.AnonymousClass64H;
import X.AnonymousClass6FL;
import X.AnonymousClass6SU;
import X.AnonymousClass6V4;
import X.AnonymousClass6VT;
import X.AnonymousClass6XN;
import X.AnonymousClass6vC;
import X.C007103b;
import X.C104635An;
import X.C104655Aq;
import X.C117425mF;
import X.C121575tM;
import X.C1270866x;
import X.C129126Fh;
import X.C129196Ft;
import X.C146636vv;
import X.C146806wC;
import X.C1503074t;
import X.C158457gx;
import X.C160827le;
import X.C18820ts;
import X.C18910u1;
import X.C19420v0;
import X.C19630wG;
import X.C19700wN;
import X.C19770wU;
import X.C19960wn;
import X.C20810yC;
import X.C21060yb;
import X.C21100yf;
import X.C28081Rg;
import X.C28331Sf;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C36551kU;
import X.C595134f;
import X.C65083Qq;
import X.C90504aG;
import X.C90714ab;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.whatsapp.ClearableEditText;
import com.whatsapp.R;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import java.util.List;
import java.util.Objects;

public abstract class MediaComposerFragment extends Hilt_MediaComposerFragment implements C158457gx {
    public Uri A00;
    public C19700wN A01;
    public AnonymousClass17Y A02;
    public C21100yf A03;
    public C21060yb A04;
    public C19630wG A05;
    public C19420v0 A06;
    public C18820ts A07;
    public AnonymousClass1H2 A08;
    public C121575tM A09;
    public C20810yC A0A;
    public AnonymousClass190 A0B;
    public AnonymousClass2XH A0C;
    public C117425mF A0D;
    public C146806wC A0E;
    public C104655Aq A0F;
    public AnonymousClass6vC A0G;
    public C104635An A0H;
    public AnonymousClass1LX A0I;
    public C28331Sf A0J;
    public AnonymousClass1HA A0K;
    public AnonymousClass1BB A0L;
    public AnonymousClass1AP A0M;
    public C28081Rg A0N;
    public AnonymousClass1N2 A0O;
    public AnonymousClass1GX A0P;
    public C1270866x A0Q;
    public C19770wU A0R;
    public AnonymousClass005 A0S;
    public AnonymousClass005 A0T;
    public AnonymousClass005 A0U;
    public boolean A0V;
    public Toast A0W;
    public AnonymousClass6FL A0X;
    public final int[] A0Y = C36441kJ.A1O();

    public void A1A(Bundle bundle) {
        this.A0Y = true;
        C146806wC r3 = this.A0E;
        if (r3 != null) {
            r3.A0N.BsM(r3.A0L.A00, r3.A0K.A03.A00);
            r3.A07 = true;
        }
    }

    public void A1N(int i, int i2, Intent intent) {
        Bundle extras;
        C129126Fh r0;
        if (i == 2) {
            C160827le A1a = A1a();
            if (!(A1a == null || (r0 = ((MediaComposerActivity) A1a).A10) == null)) {
                r0.A07(0);
            }
            if (i2 == -1 && intent != null && (extras = intent.getExtras()) != null) {
                String string = extras.getString("locations_string");
                if (string == null || string.length() == 0) {
                    string = A0n(R.string.f12nameremoved);
                }
                double d = extras.getDouble("longitude");
                double d2 = extras.getDouble("latitude");
                Context A0a = A0a();
                C18820ts r6 = this.A07;
                if (r6 != null) {
                    AnonymousClass00C.A0D(string, 3);
                    AnonymousClass5Co r1 = new AnonymousClass5Co(A0a, r6, string, false);
                    r1.A01 = d;
                    r1.A00 = d2;
                    C146806wC r02 = this.A0E;
                    if (r02 != null) {
                        r02.A0C(r1);
                        return;
                    }
                    return;
                }
                throw C36321k7.A09();
            }
            return;
        }
        super.A1N(i, i2, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
        if (r1.A0E(1493) == false) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r52, android.view.View r53) {
        /*
            r51 = this;
            r1 = 0
            r26 = r53
            r0 = r26
            X.AnonymousClass00C.A0D(r0, r1)
            r13 = r51
            android.os.Bundle r1 = r13.A0A
            if (r1 == 0) goto L_0x0119
            java.lang.String r0 = "uri"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
        L_0x0016:
            r13.A00 = r0
            X.7le r0 = r13.A1a()
            if (r0 == 0) goto L_0x00f5
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.6Fh r0 = r0.A10
            r23 = r0
            if (r0 == 0) goto L_0x00f5
            boolean r1 = r13 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r1 == 0) goto L_0x0104
            r0 = r13
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            X.7pG r12 = new X.7pG
            r12.<init>((com.whatsapp.mediacomposer.VideoComposerFragment) r0)
        L_0x0032:
            X.0yC r0 = r13.A0A
            r22 = r0
            if (r0 == 0) goto L_0x0199
            X.1N2 r0 = r13.A0O
            r21 = r0
            if (r0 == 0) goto L_0x0192
            X.0wU r0 = r13.A0R
            r20 = r0
            if (r0 == 0) goto L_0x018d
            X.1H2 r0 = r13.A08
            r19 = r0
            if (r0 == 0) goto L_0x0186
            X.5Aq r0 = r13.A0F
            r18 = r0
            if (r0 == 0) goto L_0x017f
            X.0yb r0 = r13.A04
            r17 = r0
            if (r0 == 0) goto L_0x017a
            X.0ts r0 = r13.A07
            r16 = r0
            if (r0 == 0) goto L_0x0175
            X.1BB r15 = r13.A0L
            if (r15 == 0) goto L_0x016e
            X.1AP r14 = r13.A0M
            if (r14 == 0) goto L_0x0167
            X.5An r11 = r13.A0H
            if (r11 == 0) goto L_0x0160
            X.0v0 r10 = r13.A06
            if (r10 == 0) goto L_0x0159
            X.6vC r9 = r13.A0G
            if (r9 == 0) goto L_0x0152
            X.1HA r8 = r13.A0K
            if (r8 == 0) goto L_0x014b
            X.005 r7 = r13.A0S
            if (r7 == 0) goto L_0x0144
            X.005 r0 = r13.A0T
            if (r0 == 0) goto L_0x013d
            java.lang.Object r6 = r0.get()
            X.3UT r6 = (X.AnonymousClass3UT) r6
            X.01I r24 = r13.A0i()
            if (r1 == 0) goto L_0x00f6
            r0 = r13
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            X.6cX r5 = new X.6cX
            r5.<init>(r0)
        L_0x0090:
            X.5mF r4 = r13.A0D
            if (r4 == 0) goto L_0x0136
            X.66x r3 = r13.A0Q
            if (r3 == 0) goto L_0x012f
            boolean r0 = r13 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x00aa
            X.0yC r1 = r13.A0A
            if (r1 == 0) goto L_0x012a
            r0 = 1493(0x5d5, float:2.092E-42)
            boolean r0 = r1.A0E(r0)
            r50 = 1
            if (r0 != 0) goto L_0x00ac
        L_0x00aa:
            r50 = 0
        L_0x00ac:
            X.1Sf r2 = r13.A0J
            if (r2 == 0) goto L_0x0123
            X.5tM r1 = r13.A09
            if (r1 == 0) goto L_0x011c
            X.6wC r0 = new X.6wC
            r35 = r13
            r39 = r13
            r25 = r13
            r36 = r4
            r37 = r18
            r38 = r9
            r40 = r11
            r41 = r23
            r42 = r2
            r43 = r8
            r44 = r15
            r45 = r14
            r46 = r21
            r47 = r3
            r48 = r20
            r49 = r7
            r23 = r26
            r26 = r13
            r27 = r17
            r28 = r10
            r29 = r16
            r30 = r19
            r31 = r1
            r32 = r6
            r33 = r22
            r34 = r12
            r21 = r0
            r22 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r13.A0E = r0
            r13.A0X = r12
        L_0x00f5:
            return
        L_0x00f6:
            boolean r0 = r13 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x0102
            r0 = r13
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = (com.whatsapp.mediacomposer.ImageComposerFragment) r0
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r0.A04
            X.6cY r5 = r0.A02
            goto L_0x0090
        L_0x0102:
            r5 = 0
            goto L_0x0090
        L_0x0104:
            boolean r0 = r13 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x0112
            r0 = r13
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = (com.whatsapp.mediacomposer.ImageComposerFragment) r0
            X.7pG r12 = new X.7pG
            r12.<init>((com.whatsapp.mediacomposer.ImageComposerFragment) r0)
            goto L_0x0032
        L_0x0112:
            X.6FL r12 = new X.6FL
            r12.<init>(r13)
            goto L_0x0032
        L_0x0119:
            r0 = 0
            goto L_0x0016
        L_0x011c:
            java.lang.String r0 = "shapeStickerLayoutDataProvider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0123:
            java.lang.String r0 = "statusConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x012a:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x012f:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0136:
            java.lang.String r0 = "colorPickerStateManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x013d:
            java.lang.String r0 = "expressionsTrayControllerLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0144:
            java.lang.String r0 = "expressionsShapeCreatorLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x014b:
            java.lang.String r0 = "stickerImageFileLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0152:
            java.lang.String r0 = "shapeDictionaryStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0159:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0160:
            java.lang.String r0 = "shapeSearchProvider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0167:
            java.lang.String r0 = "stickerRepository"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x016e:
            java.lang.String r0 = "stickerObservers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0175:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x017a:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x017f:
            java.lang.String r0 = "recentShapes"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0186:
            java.lang.String r0 = "emojiLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x018d:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x0192:
            java.lang.String r0 = "imeUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0199:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A1S(android.os.Bundle, android.view.View):void");
    }

    public void A1h(AnonymousClass6VT r5, C146636vv r6, C129126Fh r7) {
        int i;
        Intent intent;
        AnonymousClass00C.A0D(r7, 0);
        this.A0V = true;
        C146806wC r2 = this.A0E;
        if (r2 != null) {
            C129126Fh r1 = r2.A0V;
            r1.A05 = r2.A0I;
            r1.A06 = r2;
        }
        AnonymousClass01I A0h = A0h();
        if ((A0h == null || (intent = A0h.getIntent()) == null || !intent.getBooleanExtra("disable_tools_for_newsletter_forward", false)) && (this instanceof ImageComposerFragment)) {
            i = 0;
        } else {
            i = 8;
        }
        r7.A0I.setCropToolVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r2 == 180) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r6) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            super.onConfigurationChanged(r6)
            X.0yb r0 = r5.A04
            if (r0 == 0) goto L_0x007d
            android.content.Context r1 = r5.A0a()
            java.lang.String r0 = "window"
            java.lang.Object r0 = X.C21060yb.A02(r1, r0)
            X.C18740tg.A06(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            X.AnonymousClass00C.A08(r0)
            android.view.Display r0 = r0.getDefaultDisplay()
            int r2 = r0.getRotation()
            X.6wC r4 = r5.A0E
            if (r4 == 0) goto L_0x007a
            int r1 = r6.orientation
            r0 = 2
            if (r1 != r0) goto L_0x0035
            if (r2 == 0) goto L_0x0035
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 1
            if (r2 != r0) goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            boolean r0 = r4.A06
            if (r0 == r1) goto L_0x007a
            r4.A06 = r1
            X.C146806wC.A02(r4)
            X.1kU r0 = r4.A05
            if (r0 == 0) goto L_0x007a
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x007a
            X.1kU r3 = r4.A05
            android.view.View r0 = r4.A0A
            android.view.LayoutInflater r1 = X.C36351kA.A0C(r0)
            r0 = 2131624850(0x7f0e0392, float:1.8876891E38)
            android.view.View r1 = X.C36381kD.A0K(r1, r0)
            r0 = 2131431353(0x7f0b0fb9, float:1.8484433E38)
            android.view.View r2 = r1.findViewById(r0)
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r2 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r2
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x007b
            X.6Fh r0 = r4.A0V
            android.graphics.Rect r0 = r0.A04
            int r1 = r0.top
        L_0x006b:
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r3.A02 = r2
            r3.A00 = r1
            X.3nZ r0 = r3.A03
            r0.A01 = r2
            X.C36551kU.A00(r3)
        L_0x007a:
            return
        L_0x007b:
            r1 = 0
            goto L_0x006b
        L_0x007d:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public void A19() {
        C146806wC r2 = this.A0E;
        if (r2 != null) {
            r2.A0K.A04(false);
            r2.A0I.A00();
        }
        super.A19();
    }

    public void A1J() {
        C160827le A1a;
        C129126Fh r1;
        AnonymousClass6FL r2 = this.A0X;
        if (!(r2 == null || (A1a = A1a()) == null || (r1 = ((MediaComposerActivity) A1a).A10) == null || r1.A05 != r2)) {
            r1.A05 = null;
        }
        C146806wC r4 = this.A0E;
        if (r4 != null) {
            DoodleView doodleView = r4.A0N;
            AnonymousClass6V4 r22 = doodleView.A0E;
            Bitmap bitmap = r22.A07;
            if (bitmap != null) {
                bitmap.recycle();
                r22.A07 = null;
            }
            Bitmap bitmap2 = r22.A08;
            if (bitmap2 != null) {
                bitmap2.recycle();
                r22.A08 = null;
            }
            Bitmap bitmap3 = r22.A06;
            if (bitmap3 != null) {
                bitmap3.recycle();
                r22.A06 = null;
            }
            Bitmap bitmap4 = r22.A05;
            if (bitmap4 != null) {
                bitmap4.recycle();
                r22.A05 = null;
            }
            doodleView.setEnabled(false);
            r4.A09.removeCallbacksAndMessages((Object) null);
            C18910u1 r12 = r4.A0Y;
            if (r12.A01()) {
                AnonymousClass6XN r23 = (AnonymousClass6XN) r12.get();
                C36331k8.A1E(r23.A02);
                r23.A06.quit();
                r23.A0J.removeMessages(0);
                r23.A0c.clear();
                r23.A0R.A00 = null;
                r23.A0V.unregisterObserver(r23.A0U);
                r23.A0Q.A02();
            }
            r4.A0V.A0I.setToolbarExtraVisibility(8);
        }
        Toast toast = this.A0W;
        if (toast != null) {
            toast.cancel();
        }
        this.A0W = null;
        this.A00 = null;
        super.A1J();
    }

    public final C19700wN A1Z() {
        C19700wN r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("crashLogs");
    }

    public void A1b() {
        View A082;
        AnonymousClass01I A0h;
        View A083;
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            VideoComposerFragment.A07(videoComposerFragment.A0d().findViewById(R.id.content), 300);
            C65083Qq r0 = videoComposerFragment.A0L;
            if (r0 != null && (A083 = r0.A08()) != null) {
                A083.setAlpha(1.0f);
            }
        } else if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            imageComposerFragment.A06.setVisibility(0);
            if (imageComposerFragment.A0E != null && (A0h = imageComposerFragment.A0h()) != null && A0h.getIntent().getIntExtra("origin", 1) == 29) {
                AnonymousClass17Y r3 = imageComposerFragment.A02;
                C146806wC r2 = imageComposerFragment.A0E;
                Objects.requireNonNull(r2);
                r3.A0H(new C1503074t((Object) r2, 27));
            }
        } else {
            C65083Qq r02 = ((GifComposerFragment) this).A00;
            if (r02 != null && (A082 = r02.A08()) != null) {
                A082.setAlpha(1.0f);
                A082.setVisibility(0);
            }
        }
    }

    public void A1c() {
        if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            imageComposerFragment.A06.setVisibility(4);
            AnonymousClass01I A0h = imageComposerFragment.A0h();
            if (A0h != null && A0h.getIntent().getIntExtra("origin", 1) == 29) {
                ImageComposerFragment.A0A(imageComposerFragment, false, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r4.A0O != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1d() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x005a
            r4 = r5
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            X.1V6 r0 = r4.A0B
            if (r0 == 0) goto L_0x0084
            r0.A06()
            X.6wC r0 = r4.A0E
            if (r0 == 0) goto L_0x001f
            com.whatsapp.mediacomposer.doodle.DoodleView r2 = r0.A0N
            X.6V4 r1 = r2.A0E
            r0 = 1
            r1.A0A = r0
            android.os.SystemClock.elapsedRealtime()
            r2.invalidate()
        L_0x001f:
            X.3Qq r3 = r4.A0L
            if (r3 == 0) goto L_0x0045
            boolean r0 = r4.A0Q
            r2 = 1
            if (r0 != 0) goto L_0x002d
            boolean r1 = r4.A0O
            r0 = 0
            if (r1 == 0) goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            r3.A0V(r0)
            r3.A0C()
            android.view.View r3 = r3.A08()
            r3.setKeepScreenOn(r2)
            java.lang.Runnable r2 = r4.A0a
            r3.removeCallbacks(r2)
            r0 = 50
            r3.postDelayed(r2, r0)
        L_0x0045:
            android.view.View r3 = r4.A07
            r1 = 200(0xc8, double:9.9E-322)
            android.view.animation.AlphaAnimation r0 = X.C36371kC.A0L()
            r0.setDuration(r1)
            if (r3 == 0) goto L_0x0059
            r3.startAnimation(r0)
            r0 = 4
            r3.setVisibility(r0)
        L_0x0059:
            return
        L_0x005a:
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 != 0) goto L_0x0059
            r2 = r5
            com.whatsapp.mediacomposer.GifComposerFragment r2 = (com.whatsapp.mediacomposer.GifComposerFragment) r2
            java.lang.Boolean r0 = X.C18750th.A01
            X.3Qq r0 = r2.A00
            if (r0 == 0) goto L_0x0072
            r0.A0C()
            android.view.View r1 = r0.A08()
            r0 = 1
            r1.setKeepScreenOn(r0)
        L_0x0072:
            X.6wC r0 = r2.A0E
            if (r0 == 0) goto L_0x0059
            com.whatsapp.mediacomposer.doodle.DoodleView r2 = r0.A0N
            X.6V4 r1 = r2.A0E
            r0 = 1
            r1.A0A = r0
            android.os.SystemClock.elapsedRealtime()
            r2.invalidate()
            return
        L_0x0084:
            java.lang.String r0 = "messageAudioPlayerProvider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A1d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (X.AnonymousClass000.A1X(r1.A00()) != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r10 = (com.whatsapp.mediacomposer.VideoComposerFragment) r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1e() {
        /*
            r14 = this;
            boolean r0 = r14 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x0066
            r10 = r14
            com.whatsapp.mediacomposer.VideoComposerFragment r10 = (com.whatsapp.mediacomposer.VideoComposerFragment) r10
            android.widget.ImageView r4 = r10.A09
            if (r4 == 0) goto L_0x0066
            boolean r1 = r10.A0Q
            r0 = 2131232329(0x7f080649, float:1.8080764E38)
            if (r1 == 0) goto L_0x0015
            r0 = 2131232331(0x7f08064b, float:1.8080768E38)
        L_0x0015:
            r4.setImageResource(r0)
            X.0wn r1 = r10.A0J
            java.lang.Object r0 = r1.A00
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r9 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r1.A00()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r13 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r13 = 1
        L_0x002f:
            long r6 = r10.A06
            long r0 = r10.A05
            long r6 = r6 - r0
            r11 = 7000(0x1b58, double:3.4585E-320)
            r8 = 8
            r5 = 0
            r2 = 100
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0067
            boolean r0 = r10.A0P
            if (r0 != 0) goto L_0x0067
            if (r13 == 0) goto L_0x0067
            int r0 = r4.getVisibility()
            if (r0 != r8) goto L_0x005e
            r4.measure(r9, r9)
            int r0 = r4.getMeasuredWidth()
            float r1 = (float) r0
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            r0.<init>(r1, r5, r5, r5)
            r0.setDuration(r2)
            r4.startAnimation(r0)
        L_0x005e:
            android.view.View$OnClickListener r0 = r10.A0Z
            r4.setOnClickListener(r0)
            r4.setVisibility(r9)
        L_0x0066:
            return
        L_0x0067:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x007d
            int r0 = r4.getMeasuredWidth()
            float r1 = (float) r0
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            r0.<init>(r5, r1, r5, r5)
            r0.setDuration(r2)
            r4.startAnimation(r0)
        L_0x007d:
            r0 = 0
            r4.setOnClickListener(r0)
            r4.setVisibility(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A1e():void");
    }

    public final void A1f() {
        C146806wC r3 = this.A0E;
        if (r3 != null) {
            r3.A06 = AnonymousClass000.A1S(C36341k9.A04(A0a()), 2);
            C129126Fh r2 = r3.A0V;
            r2.A02 = r3.A0L.A00;
            int i = 0;
            r3.A0K.A04(false);
            r3.A0I.A00();
            if (!C36401kF.A1a(r3.A0T.A03.A00)) {
                i = 4;
            }
            r2.A0I.setUndoButtonVisibility(i);
            C146806wC.A02(r3);
            C146806wC.A03(r3);
            C36551kU r0 = r3.A05;
            if (r0 != null && r0.isShowing()) {
                DoodleEditText doodleEditText = r3.A05.A02.A03;
                if (doodleEditText == null) {
                    throw C36331k8.A0d("doodleEditText");
                }
                doodleEditText.A0C(true);
            }
        }
    }

    public void A1g(Rect rect) {
        C146806wC r3;
        if (this.A0F != null && rect != null && (r3 = this.A0E) != null) {
            View view = r3.A0W.A03;
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
            A0a.leftMargin = rect.left;
            A0a.topMargin = rect.top;
            A0a.rightMargin = rect.right;
            A0a.bottomMargin = rect.bottom;
            view.setLayoutParams(A0a);
            r3.A0K.setInsets(rect);
            C18910u1 r1 = r3.A0Y;
            if (r1.A01()) {
                C90504aG.A14(rect, ((AnonymousClass6XN) r1.get()).A0Q);
            }
            r3.A08.set(rect);
        }
    }

    public void A1i(boolean z) {
        Integer num;
        int i;
        Toast A012;
        List A0w;
        int captionTop;
        AnonymousClass64H r0;
        int i2;
        Toast toast = this.A0W;
        if (toast != null) {
            toast.cancel();
        }
        C160827le A1a = A1a();
        if (A1a != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1a;
            C90714ab r02 = mediaComposerActivity.A0v;
            if (r02 == null || (r0 = r02.A01) == null || r0.A03.getCaptionTop() == 0) {
                captionTop = mediaComposerActivity.A0u.A03.A03.getCaptionTop();
            } else {
                int captionTop2 = mediaComposerActivity.A0u.A03.A03.getCaptionTop();
                AnonymousClass64H r03 = mediaComposerActivity.A0v.A01;
                if (r03 != null) {
                    i2 = r03.A03.getCaptionTop();
                } else {
                    i2 = 0;
                }
                captionTop = Math.min(captionTop2, i2);
            }
            num = Integer.valueOf(captionTop);
        } else {
            num = null;
        }
        if (z && A1D() != null && num != null) {
            Context A0a = A0a();
            int intValue = num.intValue();
            C160827le A1a2 = A1a();
            if (!(A1a2 == null || (A0w = C36401kF.A0w(((MediaComposerActivity) A1a2).A0s.A02)) == null || A0w.size() != 1)) {
                int i3 = 42;
                if (this instanceof VideoComposerFragment) {
                    i3 = 43;
                }
                C595134f r2 = new C595134f((AnonymousClass11F) C007103b.A0L(A0w), i3);
                A012 = null;
                AnonymousClass1LX r1 = this.A0I;
                if (r1 != null) {
                    if (!ViewOnceNuxBottomSheet.A06(A0k(), r2, r1, (AnonymousClass3T1) null)) {
                        C19420v0 r04 = this.A06;
                        if (r04 == null) {
                            throw C36331k8.A0d("waSharedPreferences");
                        } else if (!C36371kC.A1U(C36341k9.A0E(r04), "view_once_nux_secondary")) {
                            ViewOnceSecondaryNuxBottomSheet.A03(A0k(), r2);
                        }
                    }
                    this.A0W = A012;
                    return;
                }
                throw C36331k8.A0d("nuxManagerBridge");
            }
            AnonymousClass17Y r5 = this.A02;
            if (r5 != null) {
                if (this instanceof VideoComposerFragment) {
                    i = R.string.f12nameremoved;
                } else if (this instanceof ImageComposerFragment) {
                    i = R.string.f12nameremoved;
                } else {
                    i = 0;
                }
                A012 = r5.A01(A0a.getString(i));
                A012.setGravity(49, 0, intValue / 2);
                A012.show();
                this.A0W = A012;
                return;
            }
            throw C36321k7.A06();
        }
    }

    public void A1j(boolean z) {
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            videoComposerFragment.A0J = new C19960wn(Boolean.valueOf(z));
            ImageView imageView = videoComposerFragment.A09;
            if (imageView != null) {
                imageView.setVisibility(C36351kA.A00(z ? 1 : 0));
            }
        }
    }

    public boolean A1k() {
        Integer num;
        C146806wC r2 = this.A0E;
        if (r2 == null) {
            return false;
        }
        if (r2.A0H.A0E(5976)) {
            AnonymousClass3UT r1 = r2.A0G;
            ExpressionsBottomSheetView expressionsBottomSheetView = r1.A0E;
            if (expressionsBottomSheetView != null) {
                num = Integer.valueOf(expressionsBottomSheetView.getVisibility());
            } else {
                num = null;
            }
            if (num.intValue() == 0) {
                r1.A08();
                return true;
            }
        }
        if (!C146806wC.A06(r2)) {
            C129126Fh r3 = r2.A0V;
            if (C36341k9.A07(r3.A0G.A06) != 2) {
                return false;
            }
            r3.A07(0);
            r2.A08();
        }
        AnonymousClass6SU r32 = ((AnonymousClass6XN) r2.A0Y.get()).A0M;
        ClearableEditText clearableEditText = r32.A0A;
        if (clearableEditText.getVisibility() == 0) {
            C36391kE.A1K(clearableEditText);
        } else {
            ValueAnimator valueAnimator = r32.A01;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                C129126Fh r12 = r2.A0V;
                r12.A0I.setBackButtonDrawable(false);
                r12.A05(r12.A01);
                C146806wC.A01(r2);
                return true;
            }
            long currentPlayTime = r32.A01.getCurrentPlayTime();
            r32.A01.cancel();
            AnonymousClass6SU.A01(r32, currentPlayTime, false);
        }
        C36341k9.A18(r32.A0C.A00, false);
        return true;
    }

    public boolean A1l() {
        long j;
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            C65083Qq r0 = videoComposerFragment.A0L;
            boolean z = true;
            if (r0 == null || !r0.A0X()) {
                z = false;
            }
            C65083Qq r02 = videoComposerFragment.A0L;
            if (r02 != null) {
                r02.A0A();
                r02.A08().setKeepScreenOn(false);
            }
            C65083Qq r03 = videoComposerFragment.A0L;
            if (r03 != null) {
                j = (long) r03.A04();
            } else {
                j = 0;
            }
            videoComposerFragment.A04 = j;
            C146806wC r04 = videoComposerFragment.A0E;
            if (r04 != null) {
                DoodleView doodleView = r04.A0N;
                doodleView.A0E.A0A = false;
                doodleView.invalidate();
            }
            VideoComposerFragment.A07(videoComposerFragment.A07, 200);
            return z;
        } else if (this instanceof ImageComposerFragment) {
            return false;
        } else {
            GifComposerFragment gifComposerFragment = (GifComposerFragment) this;
            C65083Qq r05 = gifComposerFragment.A00;
            if (r05 != null) {
                r05.A0A();
                r05.A08().setKeepScreenOn(false);
            }
            C146806wC r06 = gifComposerFragment.A0E;
            if (r06 != null) {
                DoodleView doodleView2 = r06.A0N;
                doodleView2.A0E.A0A = false;
                doodleView2.invalidate();
            }
            C65083Qq r07 = gifComposerFragment.A00;
            if (r07 != null) {
                return r07.A0X();
            }
            return false;
        }
    }

    public void A1V(boolean z) {
        try {
            super.A1V(z);
        } catch (NullPointerException unused) {
            A1Z().A0E("MediaComposerFragment-visibility-npe", (String) null, true);
        }
    }

    public final C160827le A1a() {
        AnonymousClass01I A0h = A0h();
        if (A0h instanceof C160827le) {
            return (C160827le) A0h;
        }
        return null;
    }

    public void BgS(C129196Ft r6) {
        String str;
        Context A1D = A1D();
        if (A1D != null) {
            AnonymousClass2XH r0 = this.A0C;
            if (r0 != null) {
                boolean A052 = r0.A05(A1D);
                if (this.A0B != null) {
                    Intent A0D2 = C36431kI.A0D();
                    A0D2.putExtra("mode", 1);
                    String packageName = A1D.getPackageName();
                    if (A052) {
                        str = "com.whatsapp.location.LocationPicker2";
                    } else {
                        str = "com.whatsapp.location.LocationPicker";
                    }
                    A0D2.setClassName(packageName, str);
                    startActivityForResult(A0D2, 2);
                    return;
                }
                throw C36331k8.A0X();
            }
            throw C36331k8.A0d("locationUtils");
        }
    }
}
