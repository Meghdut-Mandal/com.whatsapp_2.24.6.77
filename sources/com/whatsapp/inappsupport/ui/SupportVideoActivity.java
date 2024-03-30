package com.whatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass1AV;
import X.AnonymousClass38P;
import X.AnonymousClass3Y3;
import X.AnonymousClass4XB;
import X.AnonymousClass5NI;
import X.AnonymousClass5NR;
import X.AnonymousClass5NV;
import X.AnonymousClass6D2;
import X.AnonymousClass6FG;
import X.AnonymousClass6KH;
import X.AnonymousClass9SQ;
import X.C100744vb;
import X.C18800tq;
import X.C18830tt;
import X.C19630wG;
import X.C19700wN;
import X.C19770wU;
import X.C21060yb;
import X.C33761ft;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36411kG;
import X.C36431kI;
import X.C45582Rx;
import X.C65083Qq;
import X.C67113Yo;
import X.C79673u6;
import X.C79753uE;
import X.C89344We;
import X.C89774Xv;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.Mp4Ops;
import com.whatsapp.R;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;

public final class SupportVideoActivity extends AnonymousClass155 {
    public FrameLayout A00;
    public Mp4Ops A01;
    public AnonymousClass1AV A02;
    public C19630wG A03;
    public AnonymousClass6KH A04;
    public C33761ft A05;
    public AnonymousClass9SQ A06;
    public ExoPlayerErrorFrame A07;
    public C65083Qq A08;
    public AnonymousClass5NI A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A03 = C36351kA.A0W(A0B2);
            this.A01 = (Mp4Ops) A0B2.ATn.get();
            this.A05 = (C33761ft) A0B2.Abq.get();
            this.A02 = (AnonymousClass1AV) A0B2.A9R.get();
            this.A06 = (AnonymousClass9SQ) r1.ACl.get();
            this.A04 = (AnonymousClass6KH) r1.A1z.get();
        }
    }

    public final C65083Qq A3i() {
        C65083Qq r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("videoPlayer");
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Uri uri;
        String str4;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        FrameLayout frameLayout = (FrameLayout) C36361kB.A0H(this, R.id.rootView);
        this.A00 = frameLayout;
        if (frameLayout == null) {
            throw C36331k8.A0d("rootView");
        }
        frameLayout.setClipChildren(false);
        Toolbar A0R = C36411kG.A0R(this);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, A0R);
        if (A0Q != null) {
            A0Q.A0X(false);
        }
        C36321k7.A0P(this);
        C100744vb r3 = new C100744vb(AnonymousClass00E.A00(this, R.drawable.ic_back), this.A00);
        r3.setColorFilter(getResources().getColor(R.color.f6nameremoved), PorterDuff.Mode.SRC_ATOP);
        A0R.setNavigationIcon((Drawable) r3);
        Bundle A0H = C36371kC.A0H(this);
        String str5 = null;
        if (A0H == null || (str = A0H.getString("video_url", "")) == null) {
            str = "";
        }
        Bundle A0H2 = C36371kC.A0H(this);
        if (A0H2 != null) {
            str2 = A0H2.getString("captions_url", (String) null);
        } else {
            str2 = null;
        }
        Bundle A0H3 = C36371kC.A0H(this);
        if (A0H3 != null) {
            str3 = A0H3.getString("media_group_id", "");
        } else {
            str3 = null;
        }
        this.A0A = str3;
        Bundle A0H4 = C36371kC.A0H(this);
        if (A0H4 != null) {
            str5 = A0H4.getString("video_locale", "");
        }
        this.A0B = str5;
        AnonymousClass17Y r14 = this.A05;
        C21060yb r15 = this.A08;
        C19630wG r9 = this.A03;
        if (r9 != null) {
            Mp4Ops mp4Ops = this.A01;
            if (mp4Ops != null) {
                C19700wN r6 = this.A03;
                AnonymousClass1AV r8 = this.A02;
                if (r8 != null) {
                    C19770wU r32 = this.A04;
                    AnonymousClass6KH r0 = this.A04;
                    if (r0 != null) {
                        AnonymousClass5NR r12 = new AnonymousClass5NR(this, r14, r15, r9, r0, r32, (AnonymousClass6FG) null, 0, false);
                        r12.A04 = Uri.parse(str);
                        if (str2 != null) {
                            uri = Uri.parse(str2);
                        } else {
                            uri = null;
                        }
                        r12.A03 = uri;
                        String string = getString(R.string.f12nameremoved);
                        try {
                            str4 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException unused) {
                            str4 = "?";
                        }
                        StringBuilder A0v = AnonymousClass000.A0v(string);
                        A0v.append("/");
                        A0v.append(str4);
                        A0v.append(" (Linux;Android ");
                        A0v.append(Build.VERSION.RELEASE);
                        A0v.append(") ");
                        r12.A0e(new AnonymousClass5NV(r6, mp4Ops, r8, r9, AnonymousClass000.A0q("ExoPlayerLib/2.13.3", A0v)));
                        this.A08 = r12;
                        FrameLayout frameLayout2 = this.A00;
                        if (frameLayout2 == null) {
                            throw C36331k8.A0d("rootView");
                        }
                        frameLayout2.addView(A3i().A08(), 0);
                        AnonymousClass9SQ r33 = this.A06;
                        if (r33 != null) {
                            AnonymousClass38P r4 = new AnonymousClass38P(r33, A3i());
                            int intExtra = getIntent().getIntExtra("video_start_position", 0);
                            boolean A1R = AnonymousClass000.A1R(intExtra);
                            A3i().A0C = A1R;
                            this.A09 = (AnonymousClass5NI) C36361kB.A0H(this, R.id.controlView);
                            C65083Qq A3i = A3i();
                            AnonymousClass5NI r02 = this.A09;
                            if (r02 == null) {
                                throw C36331k8.A0d("videoPlayerControllerView");
                            }
                            A3i.A0S(r02);
                            FrameLayout frameLayout3 = this.A00;
                            if (frameLayout3 == null) {
                                throw C36331k8.A0d("rootView");
                            }
                            ExoPlayerErrorFrame exoPlayerErrorFrame = (ExoPlayerErrorFrame) C36361kB.A0F(frameLayout3, R.id.exoplayer_error_elements);
                            this.A07 = exoPlayerErrorFrame;
                            if (exoPlayerErrorFrame == null) {
                                throw C36331k8.A0d("exoPlayerErrorFrame");
                            }
                            AnonymousClass5NI r7 = this.A09;
                            if (r7 == null) {
                                throw C36331k8.A0d("videoPlayerControllerView");
                            }
                            A3i().A0Q(new AnonymousClass6D2(exoPlayerErrorFrame, r7, true));
                            AnonymousClass5NI r34 = this.A09;
                            if (r34 == null) {
                                throw C36331k8.A0d("videoPlayerControllerView");
                            }
                            r34.A06 = new C79753uE(this);
                            FrameLayout frameLayout4 = this.A00;
                            if (frameLayout4 == null) {
                                throw C36331k8.A0d("rootView");
                            }
                            AnonymousClass3Y3.A00(frameLayout4, this, 28);
                            A3i().A0R(new AnonymousClass4XB(this, r4, 3));
                            A3i().A05 = new C89774Xv(r4, 0);
                            A3i().A06 = new C79673u6(this, str);
                            AnonymousClass5NI r03 = this.A09;
                            if (r03 == null) {
                                throw C36331k8.A0d("videoPlayerControllerView");
                            }
                            r03.A0E.setVisibility(8);
                            A3i().A0C();
                            if (A1R) {
                                A3i().A0L(intExtra);
                            }
                            if (str2 != null) {
                                View A0K = C36341k9.A0K(this, R.id.hidden_captions_img_stub);
                                AnonymousClass00C.A08(A0K);
                                ImageView imageView = (ImageView) A0K;
                                A3i().A0W(false);
                                imageView.setImageResource(R.drawable.vec_ic_caption_disabled);
                                imageView.setOnClickListener(new C67113Yo((Object) this, (Object) imageView, (Object) r4, 47));
                            }
                            C33761ft r5 = this.A05;
                            if (r5 != null) {
                                String str6 = this.A0A;
                                String str7 = this.A0B;
                                C45582Rx r2 = new C45582Rx();
                                r2.A00 = 27;
                                r2.A07 = str;
                                r2.A04 = str6;
                                r2.A06 = str7;
                                r5.A00.Blv(r2);
                                return;
                            }
                            throw C36331k8.A0d("supportLogging");
                        }
                        throw C36331k8.A0d("supportVideoLogger");
                    }
                    throw C36331k8.A0d("heroSettingProvider");
                }
                throw C36331k8.A0d("wamediaWamLogger");
            }
            throw C36331k8.A0d("mp4Ops");
        }
        throw C36331k8.A0d("waContext");
    }

    public SupportVideoActivity(int i) {
        this.A0C = false;
        C89344We.A00(this, 0);
    }

    public void onBackPressed() {
        Intent A0D = C36431kI.A0D();
        A0D.putExtra("video_start_position", A3i().A04());
        setResult(-1, A0D);
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        A3i().A0D();
    }

    public void onPause() {
        super.onPause();
        A3i().A0A();
    }

    public void onResume() {
        super.onResume();
        AnonymousClass5NI r0 = this.A09;
        if (r0 == null) {
            throw C36331k8.A0d("videoPlayerControllerView");
        } else if (!r0.A0A()) {
            AnonymousClass5NI r02 = this.A09;
            if (r02 == null) {
                throw C36331k8.A0d("videoPlayerControllerView");
            }
            r02.A03();
        }
    }

    public SupportVideoActivity() {
        this(0);
    }
}
