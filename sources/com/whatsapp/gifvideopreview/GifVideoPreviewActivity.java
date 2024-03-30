package com.whatsapp.gifvideopreview;

import X.AnonymousClass000;
import X.AnonymousClass00F;
import X.AnonymousClass06T;
import X.AnonymousClass143;
import X.AnonymousClass1D5;
import X.AnonymousClass1GX;
import X.AnonymousClass1GZ;
import X.AnonymousClass1SV;
import X.AnonymousClass1UM;
import X.AnonymousClass1X4;
import X.AnonymousClass2NS;
import X.AnonymousClass3SC;
import X.AnonymousClass3T1;
import X.AnonymousClass59h;
import X.AnonymousClass6CW;
import X.C011504z;
import X.C03570Gk;
import X.C100794vk;
import X.C1042358u;
import X.C106755Lf;
import X.C119685qH;
import X.C121635tS;
import X.C133646Zl;
import X.C145756uT;
import X.C163027pX;
import X.C177528dw;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19970wo;
import X.C21010yW;
import X.C21710zg;
import X.C25541Gs;
import X.C27111My;
import X.C28781Ua;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C60963Aa;
import X.C64883Pu;
import X.C65013Qj;
import X.C65713Te;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import X.C90524aI;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.io.File;
import java.util.List;

public class GifVideoPreviewActivity extends C100794vk {
    public View A00;
    public AnonymousClass1X4 A01;
    public C21010yW A02;
    public AnonymousClass1GZ A03;
    public AnonymousClass1D5 A04;
    public C119685qH A05;
    public VideoSurfaceView A06;
    public int A07;
    public boolean A08;

    public int A2I() {
        return 78318969;
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r3 = r2.A00;
            C90464aC.A0y(r2, r3, this, C36321k7.A05(r2, r3, this));
            C100794vk.A07(r2, this, C36351kA.A0a(r2));
            this.A09 = C36371kC.A0b(r3);
            this.A0K = (C28781Ua) r2.A9d.get();
            this.A03 = C36341k9.A0R(r2);
            this.A04 = C36341k9.A0S(r2);
            this.A0J = (AnonymousClass1UM) r2.A3S.get();
            this.A0I = (AnonymousClass1GX) r2.A4k.get();
            this.A0C = C36351kA.A0f(r3);
            this.A0E = C36351kA.A0m(r2);
            this.A0F = (C64883Pu) r3.ACT.get();
            this.A0A = C36351kA.A0c(r3);
            this.A0D = C27111My.A2d(A0L);
            this.A05 = C90474aD.A0R(r3);
            this.A03 = (AnonymousClass1GZ) r2.AOO.get();
            this.A02 = C36351kA.A0g(r2);
            this.A01 = C36361kB.A0T(r2);
            this.A04 = (AnonymousClass1D5) r2.A4j.get();
            this.A05 = C27111My.A2a(A0L);
        }
    }

    public void A3j(File file, boolean z) {
        String path;
        Uri parse;
        byte[] bArr;
        File file2 = this.A0L;
        if (file2 == null) {
            path = null;
        } else {
            path = file2.getPath();
        }
        if (this.A0N.size() == 0) {
            A3k(false);
            return;
        }
        VideoSurfaceView.A03(this.A06, false);
        if (z) {
            C65013Qj r11 = new C65013Qj();
            byte[] bArr2 = null;
            if (path != null) {
                File A0S = C90524aI.A0S(path);
                r11.A0I = A0S;
                bArr = C25541Gs.A04(A0S);
                parse = null;
            } else {
                parse = Uri.parse(getIntent().getStringExtra("media_url"));
                r11.A0A = getIntent().getIntExtra("media_width", -1);
                r11.A06 = getIntent().getIntExtra("media_height", -1);
                String stringExtra = getIntent().getStringExtra("preview_media_url");
                if (stringExtra != null) {
                    bArr2 = this.A03.A03(stringExtra);
                }
                bArr = bArr2;
            }
            r11.A05 = this.A07;
            AnonymousClass3SC A042 = this.A04.A04(parse, r11, this.A07, (AnonymousClass3T1) null, this.A0H.A05.getStringText(), this.A0N, this.A0H.A05.getMentions(), (List) null, 13, 0, 0, getIntent().getBooleanExtra("number_from_url", false));
            A042.A00 = 1;
            this.A01.A0b(A042, bArr, this.A0R, !this.A0M.equals(this.A0N));
            if (r11.A05 != 0) {
                AnonymousClass2NS r5 = new AnonymousClass2NS();
                int i = r11.A05;
                int i2 = 0;
                if (i != 1) {
                    if (i == 2) {
                        i2 = 1;
                    } else {
                        throw AnonymousClass000.A0d("Unexpected provider type ", AnonymousClass000.A0u(), i);
                    }
                }
                r5.A00 = Integer.valueOf(i2);
                this.A02.Bly(r5);
            }
            if (this.A0N.size() > 1 || (this.A0N.size() == 1 && (this.A0N.get(0) instanceof C177528dw))) {
                Bvu(this.A0N);
            }
            setResult(-1);
        } else {
            Intent A0D = C36431kI.A0D();
            A0D.putExtra("file_path", path);
            A0D.putExtra("jids", AnonymousClass143.A07(this.A0N));
            this.A0F.A02(A0D, this.A07);
            A0D.putExtra("audience_clicked", this.A0R);
            A0D.putExtra("audience_updated", !this.A0M.equals(this.A0N));
            if (path == null) {
                A0D.putExtra("media_url", getIntent().getStringExtra("media_url"));
                A0D.putExtra("media_width", getIntent().getIntExtra("media_width", -1));
                A0D.putExtra("media_height", getIntent().getIntExtra("media_height", -1));
                A0D.putExtra("preview_media_url", getIntent().getStringExtra("preview_media_url"));
            }
            A0D.putExtra("provider", getIntent().getIntExtra("provider", 0));
            A0D.putExtra("caption", this.A0H.A05.getStringText());
            A0D.putExtra("mentions", C65713Te.A01(this.A0H.A05.getMentions()));
            A0D.putExtra("clear_message_after_send", getIntent().getBooleanExtra("clear_message_after_send", false));
            setResult(-1, A0D);
        }
        int intExtra = getIntent().getIntExtra("origin", 23);
        boolean contains = this.A0N.contains(C177528dw.A00);
        int A062 = C36421kH.A06(this.A0N, contains ? 1 : 0);
        C119685qH r6 = this.A05;
        boolean z2 = this.A0R;
        boolean z3 = !this.A0M.equals(this.A0N);
        C1042358u r3 = new C1042358u();
        r3.A07 = 11;
        r3.A06 = Integer.valueOf(intExtra);
        r3.A0Q = C36441kJ.A0y(contains);
        r3.A0A = C36441kJ.A0y(A062);
        Long A0y = C36441kJ.A0y(1);
        r3.A0H = A0y;
        r3.A0I = A0y;
        Long A0y2 = C36441kJ.A0y(0);
        r3.A0C = A0y2;
        r3.A0E = A0y2;
        r3.A0D = A0y2;
        r3.A0F = A0y2;
        r3.A0J = A0y2;
        r3.A0L = A0y2;
        r3.A04 = false;
        r3.A03 = false;
        r3.A00 = Boolean.valueOf(z2);
        r3.A01 = Boolean.valueOf(z3);
        r6.A00.Blw(r3);
        finish();
    }

    public void BaW(File file, String str) {
        String path;
        byte[] A032;
        super.BaW(file, str);
        if (!isFinishing()) {
            File file2 = this.A0L;
            if (file2 == null) {
                path = null;
            } else {
                path = file2.getPath();
            }
            if (TextUtils.isEmpty(path)) {
                String stringExtra = getIntent().getStringExtra("preview_media_url");
                if (stringExtra == null || (A032 = this.A03.A03(stringExtra)) == null) {
                    this.A03.A02(this.A02, getIntent().getStringExtra("static_preview_url"));
                } else {
                    this.A02.setImageBitmap(BitmapFactory.decodeByteArray(A032, 0, A032.length, AnonymousClass1SV.A08));
                }
                AnonymousClass1GZ r2 = this.A03;
                String stringExtra2 = getIntent().getStringExtra("media_url");
                C145756uT r13 = new C145756uT(this);
                C18740tg.A01();
                C106755Lf A002 = AnonymousClass1GZ.A00(r2);
                C121635tS B81 = A002.B81(stringExtra2);
                if (B81 != null) {
                    String str2 = B81.A00;
                    if (C90484aE.A1W(str2) && B81.A02 != null) {
                        r13.BXx(C90524aI.A0S(str2), stringExtra2, B81.A02);
                    }
                }
                C19970wo r10 = r2.A0B;
                new AnonymousClass59h(r2.A03, r2.A05, r2.A07, r2.A08, r2.A09, r2.A0A, r10, r2.A0D, A002, r13, stringExtra2).A02.executeOnExecutor(AnonymousClass1GZ.A01(r2), new Void[0]);
                return;
            }
            this.A06.setVideoPath(path);
            this.A06.start();
            this.A00.setVisibility(8);
        }
    }

    public GifVideoPreviewActivity(int i) {
        this.A08 = false;
        C163027pX.A00(this, 28);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        ImageView imageView = (ImageView) C03570Gk.A0B(this, R.id.view_once_toggle);
        View A0B = C03570Gk.A0B(this, R.id.view_once_toggle_spacer);
        if (this.A0D.A0E(2832)) {
            C36391kE.A18(this, imageView, R.drawable.view_once_selector_v2);
        } else {
            C36391kE.A18(this, imageView, R.drawable.view_once_selector);
            AnonymousClass06T.A00(AnonymousClass00F.A04(this, R.color.f6nameremoved), imageView);
        }
        imageView.setEnabled(false);
        imageView.setVisibility(0);
        A0B.setVisibility(8);
        View view = new View(this);
        this.A00 = view;
        view.setId(R.id.gif_preview_shutter);
        C36341k9.A0q(this, this.A00, R.color.f6nameremoved);
        C36331k8.A0q(this, this.A00, R.string.f12nameremoved);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.A01.addView(this.A00, 0);
        VideoSurfaceView videoSurfaceView = new VideoSurfaceView(this);
        this.A06 = videoSurfaceView;
        videoSurfaceView.setId(R.id.gif_preview_video);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A06.setLayoutParams(layoutParams);
        VideoSurfaceView videoSurfaceView2 = this.A06;
        videoSurfaceView2.A0A = C133646Zl.A00;
        this.A01.addView(videoSurfaceView2, 0);
        int intExtra = getIntent().getIntExtra("provider", 0);
        int i = 1;
        if (intExtra != 1) {
            i = 2;
            if (intExtra != 2) {
                i = 0;
            }
        }
        this.A07 = i;
        C011504z.A06(this.A06, 2);
        A2O(this.A00, this.A05);
    }

    public void onDestroy() {
        super.onDestroy();
        C60963Aa r2 = this.A0H;
        if (r2 != null) {
            r2.A00.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A01);
            r2.A05.A0F();
            r2.A03.dismiss();
            this.A0H = null;
        }
        AnonymousClass1GZ r22 = this.A03;
        AnonymousClass6CW r0 = r22.A01;
        if (r0 != null) {
            r0.A02.A02(false);
            r22.A01 = null;
        }
    }

    public void onStop() {
        super.onStop();
        this.A06.A04();
    }

    public GifVideoPreviewActivity() {
        this(0);
    }
}
