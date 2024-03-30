package X;

import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.3Ej  reason: invalid class name and case insensitive filesystem */
public class C62013Ej {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass2IR A04;
    public final /* synthetic */ MediaAlbumActivity A05;

    public C62013Ej(MediaAlbumActivity mediaAlbumActivity) {
        this.A05 = mediaAlbumActivity;
    }

    public int A00(int i, int i2, boolean z) {
        MediaAlbumActivity mediaAlbumActivity = this.A05;
        int max = Math.max(-mediaAlbumActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), (((MediaAlbumActivity.A0u(mediaAlbumActivity) + i) + C36391kE.A02(mediaAlbumActivity)) - i2) / 2);
        if (z) {
            return AnonymousClass001.A02(i, i2, max);
        }
        return max;
    }
}
