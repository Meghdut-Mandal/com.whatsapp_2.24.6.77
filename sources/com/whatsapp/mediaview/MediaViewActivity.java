package com.whatsapp.mediaview;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass09Y;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass15L;
import X.AnonymousClass1N6;
import X.AnonymousClass3UJ;
import X.C18800tq;
import X.C18830tt;
import X.C18950u5;
import X.C19430v1;
import X.C19460v5;
import X.C19470v6;
import X.C21710zg;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36401kF;
import X.C64933Qa;
import X.C89344We;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class MediaViewActivity extends AnonymousClass155 implements AnonymousClass15L {
    public C19460v5 A00;
    public AnonymousClass1N6 A01;
    public MediaViewBaseFragment A02;
    public boolean A03;

    public int A2I() {
        return 703923716;
    }

    public boolean A2g() {
        return true;
    }

    public void BVx() {
    }

    public void Bim() {
    }

    public boolean Bta() {
        return true;
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36361kB.A0e(A0B);
            this.A00 = C19470v6.A00;
        }
    }

    public void A2X() {
        this.A01.A03((AnonymousClass11F) null, 12);
    }

    public void onBackPressed() {
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        if (mediaViewBaseFragment != null) {
            mediaViewBaseFragment.A1i();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        MediaViewBaseFragment.A03(this);
        this.A05 = false;
        super.onCreate(bundle);
        A2T("on_activity_create");
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) supportFragmentManager.A0N("media_view_fragment");
        this.A02 = mediaViewBaseFragment;
        if (mediaViewBaseFragment == null) {
            Intent intent = getIntent();
            C64933Qa A022 = AnonymousClass3UJ.A02(intent);
            if (A022 == null) {
                Log.e("mediaview/message key parameter is missing");
                finish();
                return;
            }
            AnonymousClass11F A0Z = C36401kF.A0Z(intent, "jid");
            boolean booleanExtra = intent.getBooleanExtra("gallery", false);
            boolean booleanExtra2 = intent.getBooleanExtra("nogallery", false);
            int intExtra = intent.getIntExtra("video_play_origin", 5);
            long longExtra = intent.getLongExtra("start_t", 0);
            Bundle bundleExtra = intent.getBundleExtra("animation_bundle");
            int intExtra2 = intent.getIntExtra("menu_style", 1);
            boolean booleanExtra3 = intent.getBooleanExtra("menu_set_wallpaper", false);
            boolean booleanExtra4 = intent.getBooleanExtra("is_premium_message_insight", false);
            intent.getParcelableExtra("temp_fmessage_media_info");
            int intExtra3 = intent.getIntExtra("message_card_index", -1);
            C19460v5 r0 = this.A00;
            if (!r0.A05() || !booleanExtra4) {
                this.A02 = MediaViewFragment.A06(bundleExtra, A0Z, A022, intExtra, intExtra2, 1, intExtra3, longExtra, booleanExtra, booleanExtra2, booleanExtra3);
            } else {
                r0.A02();
                throw AnonymousClass001.A0A("createFragment");
            }
        }
        AnonymousClass09Y r4 = new AnonymousClass09Y(supportFragmentManager);
        r4.A0F(this.A02, "media_view_fragment", R.id.media_view_fragment_container);
        r4.A01();
        A2S("on_activity_create");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r2 = (com.whatsapp.mediaview.MediaViewFragment) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyUp(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            com.whatsapp.mediaview.MediaViewBaseFragment r2 = r3.A02
            if (r2 == 0) goto L_0x0023
            r0 = 62
            if (r4 != r0) goto L_0x0023
            boolean r0 = r2 instanceof com.whatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x001d
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            X.3Qq r0 = r2.A1o
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.A0X()
            X.3Qq r0 = r2.A1o
            if (r1 == 0) goto L_0x001f
            r0.A0A()
        L_0x001d:
            r0 = 1
            return r0
        L_0x001f:
            r0.A0J()
            goto L_0x001d
        L_0x0023:
            boolean r0 = super.onKeyUp(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewActivity.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    public MediaViewActivity(int i) {
        this.A03 = false;
        C89344We.A00(this, 13);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        A2K.A04 = true;
        return A2K;
    }

    public C18950u5 BGv() {
        return C19430v1.A01;
    }

    public void Ban() {
        finish();
    }

    public void Bao() {
        Beg();
    }

    public void finish() {
        super.finish();
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        if (mediaViewBaseFragment != null) {
            mediaViewBaseFragment.A0A.A0B();
        }
    }

    public void onStop() {
        super.onStop();
        C36361kB.A0C(this).setSystemUiVisibility(3840);
    }

    public MediaViewActivity() {
        this(0);
    }
}
