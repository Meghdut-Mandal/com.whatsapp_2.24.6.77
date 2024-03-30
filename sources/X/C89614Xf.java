package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.status.playback.fragment.OpenLinkDialogFragment;
import com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.4Xf  reason: invalid class name and case insensitive filesystem */
public class C89614Xf implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public C89614Xf(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent A002;
        C87334Oj r1;
        switch (this.A02) {
            case 0:
                ((AnonymousClass02E) this.A00).A1C(C36331k8.A04(this.A01));
                return;
            case 1:
                OpenLinkDialogFragment openLinkDialogFragment = (OpenLinkDialogFragment) this.A00;
                String str = this.A01;
                C88574Tf r0 = openLinkDialogFragment.A04;
                if (r0 != null) {
                    r0.BTk();
                }
                C32691e2 r12 = openLinkDialogFragment.A01;
                if (r12 != null) {
                    C36331k8.A0t(openLinkDialogFragment.A0a(), r12, str);
                    return;
                }
                throw C36331k8.A0d("linkLauncher");
            case 2:
                AnonymousClass02E r2 = (AnonymousClass02E) this.A00;
                r2.A1C(AnonymousClass190.A15(r2.A1D(), this.A01));
                return;
            case 3:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A00;
                String str2 = this.A01;
                if (AnonymousClass1L0.A02(deepLinkActivity, "com.whatsapp.w4b") != null) {
                    A002 = C36331k8.A04(str2);
                } else {
                    A002 = deepLinkActivity.A0x.A00("smb_linking_back2wa");
                }
                deepLinkActivity.A01.A06(deepLinkActivity, A002);
                C36351kA.A11(deepLinkActivity);
                return;
            case 4:
                AnonymousClass2d9 r22 = (AnonymousClass2d9) this.A00;
                String str3 = this.A01;
                AnonymousClass3SJ.A00(r22, 22);
                C62603Gu.A00(r22, r22.A0A, str3);
                return;
            case 5:
                OpenLinkDialogFragment openLinkDialogFragment2 = (OpenLinkDialogFragment) this.A00;
                String str4 = this.A01;
                C88574Tf r02 = openLinkDialogFragment2.A04;
                if (r02 != null) {
                    r02.BTk();
                }
                Context A1D = openLinkDialogFragment2.A1D();
                if (A1D != null) {
                    C32691e2 r3 = openLinkDialogFragment2.A01;
                    if (r3 != null) {
                        r3.Bp9(A1D, Uri.parse(str4), (AnonymousClass3T1) null, 0, 1);
                    } else {
                        throw C36331k8.A0d("linkLauncher");
                    }
                }
                openLinkDialogFragment2.A1c();
                return;
            default:
                ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment = (ConfirmPackDeleteDialogFragment) this.A00;
                String str5 = this.A01;
                if (i == -1) {
                    confirmPackDeleteDialogFragment.A00.A02(C36391kE.A0r(), 1, 7);
                    try {
                        r1 = (C87334Oj) confirmPackDeleteDialogFragment.A0h();
                        if (r1 != null) {
                            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r1;
                            stickerStorePackPreviewActivity.A0R = true;
                            StickerStorePackPreviewActivity.A0G(stickerStorePackPreviewActivity);
                        }
                    } catch (ClassCastException unused) {
                        r1 = null;
                    }
                    WeakReference A0F = AnonymousClass001.A0F(r1);
                    AnonymousClass1AP r32 = confirmPackDeleteDialogFragment.A01;
                    AnonymousClass5MC r23 = new AnonymousClass5MC(r32.A0D, new C78023rR(A0F), r32);
                    String[] A1R = C36441kJ.A1R();
                    A1R[0] = str5;
                    r32.A0N.Box(r23, A1R);
                    confirmPackDeleteDialogFragment.A1b();
                    return;
                }
                return;
        }
    }
}
