package X;

import android.view.View;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.3mR  reason: invalid class name and case insensitive filesystem */
public class C74953mR implements C160647lM {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ MediaAlbumActivity A02;

    public void BWD(int i) {
    }

    public void BgQ(View view) {
    }

    public C74953mR(View view, View view2, MediaAlbumActivity mediaAlbumActivity) {
        this.A02 = mediaAlbumActivity;
        this.A00 = view;
        this.A01 = view2;
    }

    public void BVs(View view) {
        this.A02.onBackPressed();
    }

    public void Bgp(View view, float f) {
        float f2;
        float f3 = 1.0f - f;
        if (f3 < 0.8f) {
            f2 = 0.0f;
        } else {
            f2 = (f3 - 0.8f) / 0.19999999f;
        }
        this.A00.setAlpha(f2);
        this.A01.setAlpha(f2);
        this.A02.A03.setAlpha(f2);
    }

    public /* synthetic */ boolean BLc(View view) {
        return true;
    }
}
