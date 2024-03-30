package X;

import android.view.View;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1rS  reason: invalid class name and case insensitive filesystem */
public class C39181rS extends C06580Ud {
    public final /* synthetic */ MediaAlbumActivity A00;

    public C39181rS(MediaAlbumActivity mediaAlbumActivity) {
        this.A00 = mediaAlbumActivity;
    }

    public void A01(List list, List list2, List list3) {
        MediaAlbumActivity mediaAlbumActivity = this.A00;
        if (mediaAlbumActivity.A0M.A0C()) {
            Map map = mediaAlbumActivity.A00.A0P.A0E;
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                ((C89014Ux) A11.getKey()).Br0(AnonymousClass000.A0I(A11.getValue()));
            }
            map.clear();
        }
    }

    public void A02(List list, Map map) {
        View A06;
        View A062;
        MediaAlbumActivity mediaAlbumActivity = this.A00;
        List list2 = mediaAlbumActivity.A0B.A00;
        if (list2 != null) {
            Iterator it = list2.iterator();
            int i = 0;
            boolean z = false;
            while (it.hasNext()) {
                AnonymousClass3T1 A0l = C36391kE.A0l(it);
                i++;
                if (i <= 3) {
                    View findViewWithTag = mediaAlbumActivity.getListView().findViewWithTag(A0l.A1J);
                    if (findViewWithTag == null || z || (findViewWithTag.getTop() < 0 && (findViewWithTag.getTop() >= 0 || findViewWithTag.getBottom() < mediaAlbumActivity.getListView().getHeight()))) {
                        map.remove(AnonymousClass3RL.A01(A0l));
                        map.remove(AnonymousClass3RL.A00(A0l));
                    } else {
                        String A01 = AnonymousClass3RL.A01(A0l);
                        if (!map.containsKey(A01) && (A062 = AnonymousClass3U9.A06(mediaAlbumActivity.getListView(), A01)) != null) {
                            list.add(A01);
                            map.put(A01, A062);
                        }
                        String A002 = AnonymousClass3RL.A00(A0l);
                        if (!map.containsKey(A002) && (A06 = AnonymousClass3U9.A06(mediaAlbumActivity.getListView(), A002)) != null) {
                            list.add(A002);
                            map.put(A002, A06);
                        }
                        z = true;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
