package X;

import android.view.View;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.3aL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67703aL implements C010904r {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ MediaAlbumActivity A03;

    public /* synthetic */ C67703aL(View view, View view2, View view3, MediaAlbumActivity mediaAlbumActivity) {
        this.A03 = mediaAlbumActivity;
        this.A00 = view;
        this.A01 = view2;
        this.A02 = view3;
    }

    public final AnonymousClass09H BRE(View view, AnonymousClass09H r9) {
        MediaAlbumActivity mediaAlbumActivity = this.A03;
        View view2 = this.A00;
        View view3 = this.A01;
        View view4 = this.A02;
        AnonymousClass09I r1 = r9.A00;
        int A022 = r1.A0D(7).A03 + C36391kE.A02(mediaAlbumActivity);
        int i = r1.A0D(7).A00;
        view2.setPadding(0, 0, 0, A022);
        view3.setPadding(0, 0, 0, i);
        view4.setPadding(0, 0, 0, A022);
        return r9;
    }
}
