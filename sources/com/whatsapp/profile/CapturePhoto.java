package com.whatsapp.profile;

import X.AnonymousClass01I;
import X.AnonymousClass04G;
import X.AnonymousClass12U;
import X.AnonymousClass17Y;
import X.C18700tb;
import X.C20810yC;
import X.C20830yE;
import X.C27011Mj;
import X.C28721Tt;
import X.C36431kI;
import X.C36441kJ;
import X.C89354Wf;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;

public class CapturePhoto extends AnonymousClass01I implements C18700tb {
    public AnonymousClass17Y A00;
    public C20830yE A01;
    public C20810yC A02;
    public AnonymousClass12U A03;
    public boolean A04;
    public final Object A05;
    public volatile C27011Mj A06;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (getIntent() != null && getIntent().getBooleanExtra("should_return_photo_source", false)) {
                if (intent == null) {
                    intent = C36431kI.A0D();
                }
                intent.putExtra("photo_source", 1);
            }
            setResult(i2, intent);
        } else if (i != 30) {
            super.onActivityResult(i, i2, intent);
            return;
        } else if (i2 == -1) {
            A01();
            return;
        }
        finish();
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new C27011Mj(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public CapturePhoto(int i) {
        this.A05 = C36441kJ.A11();
        this.A04 = false;
        C89354Wf.A00(this, 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r9.A01.A0D() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r9 = this;
            boolean r0 = X.C19550w8.A07()
            r2 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0011
            X.0yE r0 = r9.A01
            boolean r0 = r0.A0D()
            r5 = 1
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r5 = 0
        L_0x0012:
            X.0yE r1 = r9.A01
            java.lang.String[] r0 = X.AnonymousClass3TA.A01()
            int r0 = r1.A03(r0)
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r1 = r0 ^ 1
            r3 = 30
            java.util.Map r0 = com.whatsapp.RequestPermissionActivity.A0C
            java.lang.Object r6 = X.C36371kC.A0r(r0, r3)
            int[] r6 = (int[]) r6
            if (r6 != 0) goto L_0x0042
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RequestPermissionActivity/buildCameraProfileIntent/camera/storage/permissions/unexpected request code "
            X.C36321k7.A1S(r0, r1, r3)
        L_0x0037:
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "target_file_uri"
            android.os.Parcelable r3 = r1.getParcelableExtra(r0)
            goto L_0x009b
        L_0x0042:
            r8 = 2
            r7 = 3
            if (r1 == 0) goto L_0x0074
            if (r5 == 0) goto L_0x0074
            X.3FM r5 = new X.3FM
            r5.<init>(r9)
            int[] r1 = new int[r7]
            r0 = 2131233487(0x7f080acf, float:1.8083113E38)
            X.C36421kH.A1O(r1, r0, r2, r4)
            r0 = 2131233468(0x7f080abc, float:1.8083074E38)
            r1[r8] = r0
            r5.A09 = r1
            java.lang.String[] r0 = X.AnonymousClass3TA.A00()
            r5.A0C = r0
            r0 = r6[r2]
            r5.A02 = r0
            r0 = r6[r4]
            r5.A03 = r0
        L_0x006a:
            r5.A06 = r2
            android.content.Intent r0 = r5.A02()
        L_0x0070:
            r9.startActivityForResult(r0, r3)
            return
        L_0x0074:
            boolean r0 = X.C19550w8.A07()
            if (r0 != 0) goto L_0x0085
            if (r5 == 0) goto L_0x0085
            r1 = r6[r8]
            r0 = r6[r7]
            android.content.Intent r0 = X.AnonymousClass3US.A03(r9, r1, r0, r2)
            goto L_0x0070
        L_0x0085:
            if (r1 == 0) goto L_0x0037
            X.3FM r5 = X.AnonymousClass3FM.A00(r9)
            r0 = 4
            r0 = r6[r0]
            r5.A02 = r0
            r0 = 5
            r0 = r6[r0]
            r5.A03 = r0
            java.lang.String r0 = "android.permission.CAMERA"
            X.AnonymousClass3FM.A01(r5, r0)
            goto L_0x006a
        L_0x009b:
            java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)     // Catch:{ ActivityNotFoundException -> 0x00b0 }
            java.lang.String r0 = "output"
            android.content.Intent r1 = r1.putExtra(r0, r3)     // Catch:{ ActivityNotFoundException -> 0x00b0 }
            r0 = 2
            android.content.Intent r0 = r1.setFlags(r0)     // Catch:{ ActivityNotFoundException -> 0x00b0 }
            r9.startActivityForResult(r0, r4)     // Catch:{ ActivityNotFoundException -> 0x00b0 }
            return
        L_0x00b0:
            r1 = move-exception
            java.lang.String r0 = "capturephoto/start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            X.17Y r1 = r9.A00
            r0 = 2131886365(0x7f12011d, float:1.9407307E38)
            r1.A06(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.CapturePhoto.A01():void");
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A00(this, super.BAw());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        if (getCallingPackage() == null || !getCallingPackage().equals(getPackageName())) {
            finish();
        } else if (bundle == null) {
            A01();
        }
    }

    public CapturePhoto() {
        this(0);
    }
}
