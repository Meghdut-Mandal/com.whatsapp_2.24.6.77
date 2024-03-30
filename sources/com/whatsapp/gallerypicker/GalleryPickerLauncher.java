package com.whatsapp.gallerypicker;

import X.AnonymousClass01I;
import X.AnonymousClass04G;
import X.AnonymousClass1P3;
import X.C18700tb;
import X.C20810yC;
import X.C20830yE;
import X.C27011Mj;
import X.C28721Tt;
import X.C36321k7;
import X.C36331k8;
import X.C36431kI;
import X.C36441kJ;
import X.C51512nw;
import X.C89334Wd;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

public final class GalleryPickerLauncher extends AnonymousClass01I implements C18700tb {
    public C20830yE A00;
    public C20810yC A01;
    public AnonymousClass1P3 A02;
    public boolean A03;
    public final Object A04;
    public volatile C27011Mj A05;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r0.A04() != X.C51512nw.DENIED) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r3) goto L_0x002d
            r0 = 151(0x97, float:2.12E-43)
            if (r5 == r0) goto L_0x000b
            super.onActivityResult(r5, r6, r7)
            return
        L_0x000b:
            r0 = -1
            if (r6 == r0) goto L_0x0022
            boolean r0 = X.C19550w8.A0A()
            if (r0 == 0) goto L_0x004b
            if (r6 != 0) goto L_0x004b
            X.0yE r0 = r4.A00
            if (r0 == 0) goto L_0x0026
            X.2nw r1 = r0.A04()
            X.2nw r0 = X.C51512nw.DENIED
            if (r1 == r0) goto L_0x004b
        L_0x0022:
            r4.A01()
            return
        L_0x0026:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x002d:
            android.content.Intent r1 = r4.getIntent()
            r2 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "should_return_photo_source"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 != r3) goto L_0x004f
            if (r7 != 0) goto L_0x0042
            android.content.Intent r7 = X.C36431kI.A0D()
        L_0x0042:
            r1 = 2
            java.lang.String r0 = "photo_source"
            r7.putExtra(r0, r1)
            r4.setResult(r6, r7)
        L_0x004b:
            r4.finish()
            return
        L_0x004f:
            r4.setResult(r6, r7)
            if (r7 == 0) goto L_0x004b
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "chat_jid"
            java.lang.String r0 = r0.getStringExtra(r1)
            r7.putExtra(r1, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "is_using_global_wallpaper"
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r7.putExtra(r1, r0)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.GalleryPickerLauncher.onActivityResult(int, int, android.content.Intent):void");
    }

    private final void A01() {
        String str;
        C20830yE r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("waPermissionsHelper");
        } else if (r0.A04() != C51512nw.DENIED) {
            int intExtra = getIntent().getIntExtra("max_items", 1);
            boolean booleanExtra = getIntent().getBooleanExtra("skip_max_items_new_limit", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("is_in_multi_select_mode_only", false);
            int intExtra2 = getIntent().getIntExtra("media_sharing_user_journey_origin", -1);
            AnonymousClass1P3 r02 = this.A02;
            if (r02 != null) {
                Uri fromFile = Uri.fromFile(r02.A02());
                C20810yC r1 = this.A01;
                if (r1 != null) {
                    boolean A0E = r1.A0E(7951);
                    Intent A0D = C36431kI.A0D();
                    String packageName = getPackageName();
                    if (A0E) {
                        str = "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity";
                    } else {
                        str = "com.whatsapp.gallerypicker.GalleryPicker";
                    }
                    A0D.setClassName(packageName, str);
                    A0D.putExtra("include_media", 1);
                    A0D.putExtra("max_items", intExtra);
                    A0D.putExtra("skip_max_items_new_limit", booleanExtra);
                    A0D.putExtra("is_in_multi_select_mode_only", booleanExtra2);
                    A0D.putExtra("preview", false);
                    A0D.putExtra("output", fromFile);
                    A0D.putExtra("media_sharing_user_journey_origin", intExtra2);
                    startActivityForResult(A0D, 1);
                    return;
                }
                throw C36321k7.A07();
            }
            throw C36331k8.A0d("profilePhotoUpdater");
        } else {
            RequestPermissionActivity.A0B.A0D(this, 151);
        }
    }

    public final Object generatedComponent() {
        if (this.A05 == null) {
            synchronized (this.A04) {
                if (this.A05 == null) {
                    this.A05 = new C27011Mj(this);
                }
            }
        }
        return this.A05.generatedComponent();
    }

    public GalleryPickerLauncher(int i) {
        this.A04 = C36441kJ.A11();
        this.A03 = false;
        C89334Wd.A00(this, 30);
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A00(this, super.BAw());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        if (bundle == null) {
            A01();
        }
    }

    public GalleryPickerLauncher() {
        this(0);
    }
}
