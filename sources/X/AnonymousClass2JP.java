package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversation.CommentsBottomSheet;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.2JP  reason: invalid class name */
public final class AnonymousClass2JP extends C70813fl {
    public final MediaAlbumActivity A00;
    public final C43642Jg A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JP(AnonymousClass3C3 r4, MediaAlbumActivity mediaAlbumActivity, C43642Jg r6) {
        super(r4.A00(mediaAlbumActivity));
        C36341k9.A1E(r4, 1, r6);
        this.A00 = mediaAlbumActivity;
        this.A01 = r6;
    }

    public boolean B73(AnonymousClass4Q1 r9, Collection collection, int i) {
        MediaAlbumActivity mediaAlbumActivity;
        DialogFragment dialogFragment;
        AnonymousClass00C.A0D(collection, 1);
        if (i == 1) {
            C43732Jp r1 = this.A01.A05;
            AnonymousClass3T1 A0S = C36421kH.A0S(collection);
            mediaAlbumActivity = this.A00;
            AnonymousClass00C.A0D(A0S, 0);
            if (r1.A00.A00(A0S)) {
                AnonymousClass11F r2 = mediaAlbumActivity.A0N;
                if (r2 == null) {
                    Log.i("Unable to launch bottom sheet due to null chatJid");
                    return true;
                }
                Bundle A07 = AnonymousClass001.A07();
                AnonymousClass3UJ.A08(A07, A0S.A1J);
                C36371kC.A1B(A07, r2);
                dialogFragment = new CommentsBottomSheet();
                dialogFragment.A17(A07);
            } else {
                AnonymousClass11F A012 = C64933Qa.A01(A0S);
                if (mediaAlbumActivity.A0D.A0E(6650)) {
                    C80403vL.A01(mediaAlbumActivity.A04, mediaAlbumActivity, A012, A0S, 10);
                    return true;
                }
                MediaAlbumActivity.A0x(mediaAlbumActivity, mediaAlbumActivity.A00.A0C.A0D(A012), A012, A0S);
                return true;
            }
        } else if (i == 12) {
            return this.A01.A04.A02(this.A00, C36421kH.A0S(collection));
        } else if (i == 15) {
            C43812Jx r3 = this.A01.A06;
            AnonymousClass3T1 A0S2 = C36421kH.A0S(collection);
            MediaAlbumActivity mediaAlbumActivity2 = this.A00;
            AnonymousClass00C.A0D(A0S2, 0);
            C83804Au r7 = new C83804Au(mediaAlbumActivity2);
            AnonymousClass11F r4 = A0S2.A1J.A00;
            if (r4 == null) {
                return false;
            }
            r3.A01.A07().A0A(new C79553tu(mediaAlbumActivity2, r3, r4, A0S2, "album_media_menu_report", r7));
            return true;
        } else if (i != 31) {
            return super.B73(r9, collection, i);
        } else {
            AnonymousClass2K4 r5 = this.A01.A07;
            AnonymousClass3T1 A0S3 = C36421kH.A0S(collection);
            mediaAlbumActivity = this.A00;
            AnonymousClass00C.A0D(A0S3, 0);
            AnonymousClass11F r0 = A0S3.A1J.A00;
            if (r0 == null) {
                return false;
            }
            r5.A04.A00(1, r0.getRawString());
            dialogFragment = r5.A03.A00(A0S3);
        }
        mediaAlbumActivity.Btm(dialogFragment);
        return true;
    }
}
