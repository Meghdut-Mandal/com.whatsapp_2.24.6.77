package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.group.GroupProfileEmojiEditor;
import com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;
import java.util.List;

/* renamed from: X.4Yd  reason: invalid class name and case insensitive filesystem */
public class C89854Yd implements AnonymousClass026 {
    public Object A00;
    public final int A01;

    public C89854Yd(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        Bitmap bitmap;
        switch (this.A01) {
            case 0:
                C39971uO r2 = (C39971uO) this.A00;
                List list = ((AnonymousClass345) obj).A00;
                if (list.size() > 0) {
                    C39971uO.A01(r2, ((AnonymousClass344) C36391kE.A0t(list)).A00);
                    return;
                }
                C36341k9.A19(r2.A03, false);
                C36331k8.A13(r2.A02);
                return;
            case 1:
                C39971uO.A01((C39971uO) this.A00, AnonymousClass000.A0I(obj));
                return;
            case 2:
                ((C40051uf) this.A00).A00 = AnonymousClass000.A0I(obj);
                return;
            case 3:
                ((C001600r) this.A00).A0C(obj);
                return;
            case 4:
                ((C40041ue) this.A00).A0S((AnonymousClass3B2) obj);
                return;
            case 5:
                AnonymousClass28d r0 = (AnonymousClass28d) this.A00;
                AnonymousClass141 r7 = (AnonymousClass141) obj;
                if (r7 != null) {
                    r0.A0D.A0I(r0.A0Z.A0H(r7));
                    return;
                }
                return;
            case 6:
                ((AnonymousClass2Gw) this.A00).A0J((AnonymousClass141) obj);
                return;
            case 7:
                C70803fk r5 = (C70803fk) this.A00;
                AnonymousClass155 A0C = C70803fk.A0C(r5);
                for (C63033Im r22 : (List) obj) {
                    C62723Hh r1 = r22.A02;
                    AnonymousClass00C.A0D(A0C, 0);
                    if (r1.A00.contains(A0C)) {
                        boolean A1R = AnonymousClass000.A1R((r22.A00 > 0.0f ? 1 : (r22.A00 == 0.0f ? 0 : -1)));
                        r5.A6G = A1R;
                        r5.A2W(A1R);
                        return;
                    }
                }
                return;
            case 8:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                List<C63033Im> list2 = (List) obj;
                boolean z = false;
                if (!list2.isEmpty()) {
                    for (C63033Im r12 : list2) {
                        if (r12.A02.A00.contains(mediaGalleryActivity)) {
                            if (r12.A00 > 0.0f) {
                                z = true;
                            }
                        }
                    }
                    return;
                }
                mediaGalleryActivity.A0i = z;
                View findViewById = mediaGalleryActivity.findViewById(R.id.split_view_divider);
                if (findViewById != null) {
                    findViewById.setVisibility(C36351kA.A00(mediaGalleryActivity.A0i ? 1 : 0));
                    return;
                }
                return;
            case 9:
                C49922ju r23 = (C49922ju) this.A00;
                GroupProfileEmojiEditor groupProfileEmojiEditor = (GroupProfileEmojiEditor) obj;
                r23.A00 = C36341k9.A07(groupProfileEmojiEditor.A0C.A00);
                r23.A01 = groupProfileEmojiEditor.A00;
                r23.A03 = (Uri) groupProfileEmojiEditor.getIntent().getParcelableExtra("emojiEditorImageResult");
                r23.A04 = groupProfileEmojiEditor.A08.A0O();
                try {
                    bitmap = Bitmap.createBitmap(640, 640, Bitmap.Config.ARGB_8888);
                } catch (OutOfMemoryError unused) {
                    bitmap = null;
                }
                r23.A02 = bitmap;
                return;
            case 10:
                AnonymousClass2Vx r4 = (AnonymousClass2Vx) this.A00;
                for (C63033Im r24 : (List) obj) {
                    Activity activity = r4.A00;
                    if (activity != null && r24.A02.A00.contains(activity)) {
                        r4.A06(AnonymousClass000.A1R((r24.A00 > 0.0f ? 1 : (r24.A00 == 0.0f ? 0 : -1))));
                        return;
                    }
                }
                return;
            case 11:
                ((C132356Tf) this.A00).A02((Handler) obj);
                return;
            case 14:
                WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity = (WallpaperCurrentPreviewActivity) this.A00;
                AnonymousClass1R1.A03(wallpaperCurrentPreviewActivity);
                WallpaperCurrentPreviewActivity.A0F(wallpaperCurrentPreviewActivity);
                return;
            default:
                AnonymousClass1R1.A03((Context) this.A00);
                return;
        }
    }
}
