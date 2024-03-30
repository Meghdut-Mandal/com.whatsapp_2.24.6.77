package X;

import android.media.MediaPlayer;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.59g  reason: invalid class name and case insensitive filesystem */
public class C1043459g extends C97024oH {
    public final SearchViewModel A00;
    public final C102254zZ A01;

    public void A0D() {
        C102254zZ r1 = this.A01;
        if (r1 instanceof AnonymousClass5K0) {
            MessageGifVideoPlayer messageGifVideoPlayer = ((AnonymousClass5K0) r1).A03;
            messageGifVideoPlayer.setVisibility(8);
            MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                messageGifVideoPlayer.A02 = null;
                messageGifVideoPlayer.A09 = false;
                messageGifVideoPlayer.A0A = false;
                messageGifVideoPlayer.A0B = false;
            }
        }
    }

    public C1043459g(SearchViewModel searchViewModel, C102254zZ r2) {
        super(r2);
        this.A01 = r2;
        this.A00 = searchViewModel;
    }
}
