package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannedString;
import android.text.TextUtils;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.7r4  reason: invalid class name and case insensitive filesystem */
public class C163977r4 implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public C163977r4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass6C8) this.A00).A00("on_dismiss");
                return;
            case 1:
                ((Activity) this.A00).finish();
                return;
            case 2:
                ((AnonymousClass51F) this.A00).A3i();
                return;
            case 3:
                return;
            case 4:
                C36351kA.A11((Activity) this.A00);
                return;
            case 5:
                ((MediaComposerActivity) this.A00).A1Y = false;
                return;
            case 6:
                MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
                if (!AnonymousClass3SJ.A04(mediaComposerActivity)) {
                    mediaComposerActivity.A0u.A03(mediaComposerActivity.A0s.A0C());
                    C146636vv r3 = mediaComposerActivity.A0u;
                    boolean A0B = mediaComposerActivity.A0s.A0B();
                    C119805qU r0 = r3.A04;
                    if (A0B) {
                        r0.A01.setFilterSwipeTextVisibility(0);
                    }
                    C90714ab r02 = mediaComposerActivity.A0v;
                    C121735td r5 = r02.A02;
                    if (r5 == null) {
                        AnonymousClass64H r1 = r02.A01;
                        if (r1 != null) {
                            CaptionView captionView = r1.A03;
                            r5 = new C121735td(new SpannedString(captionView.getCaptionText()), captionView.A0E.getStringText(), captionView.A0E.getMentions());
                        } else {
                            r5 = new C121735td((CharSequence) null, (String) null, (List) null);
                        }
                    }
                    mediaComposerActivity.A0u.A02(r5.A00, false);
                    Uri A08 = mediaComposerActivity.A0s.A08();
                    if (A08 != null) {
                        AnonymousClass6QO A03 = mediaComposerActivity.A1r.A03(A08);
                        A03.A0H(r5.A01);
                        mediaComposerActivity.A13.A01(A03.A0D(), r5.A02);
                        A03.A0J(A03.A0D());
                    } else {
                        Log.e("MediaComposerActivity/captionentry/dismiss/current uri is null");
                    }
                    C90714ab r12 = mediaComposerActivity.A0v;
                    if (r12.A08) {
                        if (mediaComposerActivity.A1G.A00()) {
                            MediaComposerActivity.A0i(mediaComposerActivity);
                            return;
                        } else if (mediaComposerActivity.A1b) {
                            mediaComposerActivity.A03.A0E("MediaComposer/sendMedia/avoided double send", TextUtils.join(", ", (Iterable) mediaComposerActivity.A0s.A04.A04()), true);
                            return;
                        } else {
                            MediaComposerActivity.A0j(mediaComposerActivity);
                            return;
                        }
                    } else if (r12.A07) {
                        MediaComposerActivity.A0r(mediaComposerActivity, r12.A09);
                        return;
                    } else {
                        Integer num = r12.A05;
                        if (num != null) {
                            mediaComposerActivity.Be3(num.intValue());
                            return;
                        }
                        Integer num2 = r12.A06;
                        if (num2 != null) {
                            mediaComposerActivity.Be4(num2.intValue());
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                ((C146806wC) this.A00).A09();
                return;
            case 8:
                ((IndiaUpiQrTabActivity) this.A00).A09.A09 = true;
                return;
            default:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = ((C148576z5) this.A00).A00;
                if (!stickerStorePackPreviewActivity.isFinishing() && !stickerStorePackPreviewActivity.isDestroyed()) {
                    stickerStorePackPreviewActivity.finish();
                    return;
                }
                return;
        }
    }
}
