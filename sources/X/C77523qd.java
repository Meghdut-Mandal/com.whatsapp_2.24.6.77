package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$fillBubble$1;
import java.util.concurrent.CancellationException;

/* renamed from: X.3qd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C77523qd implements C88084Ri {
    public final /* synthetic */ MediaGalleryFragmentBase A00;

    public /* synthetic */ C77523qd(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        this.A00 = mediaGalleryFragmentBase;
    }

    public final void Bwb() {
        int i;
        AnonymousClass4V2 BDy;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A00;
        StickyHeadersRecyclerView stickyHeadersRecyclerView = mediaGalleryFragmentBase.A08;
        AnonymousClass0CP r1 = null;
        if (stickyHeadersRecyclerView != null) {
            r1 = stickyHeadersRecyclerView.getLayoutManager();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r1;
        if (linearLayoutManager != null && mediaGalleryFragmentBase.A0G != null) {
            int A1T = linearLayoutManager.A1T();
            StickyHeadersRecyclerView stickyHeadersRecyclerView2 = mediaGalleryFragmentBase.A08;
            if (stickyHeadersRecyclerView2 != null) {
                while (true) {
                    long A002 = C96094mm.A00((C96094mm) stickyHeadersRecyclerView2.A0G, A1T) & 4294967295L;
                    if (AnonymousClass000.A1Q((A002 > 4294967295L ? 1 : (A002 == 4294967295L ? 0 : -1)))) {
                        if (A1T >= stickyHeadersRecyclerView2.A0G.A0J() - 1) {
                            i = stickyHeadersRecyclerView2.A0G.A0J() - ((C160717lT) ((C96094mm) stickyHeadersRecyclerView2.A0G).A00).BCL();
                            break;
                        }
                        A1T++;
                    } else {
                        i = (int) A002;
                        break;
                    }
                }
            } else {
                i = 0;
            }
            C88924Uo r0 = mediaGalleryFragmentBase.A0G;
            if (r0 != null && (BDy = r0.BDy(i)) != null) {
                MediaGalleryFragmentBase.A07(BDy, mediaGalleryFragmentBase);
            } else if (AnonymousClass1Ax.A03(mediaGalleryFragmentBase.A1Z(), 6789)) {
                MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = (MediaGalleryFragmentViewModel) mediaGalleryFragmentBase.A0e.getValue();
                C88924Uo r3 = mediaGalleryFragmentBase.A0G;
                C007403e r02 = mediaGalleryFragmentViewModel.A00;
                if (r02 != null) {
                    r02.B2S((CancellationException) null);
                }
                mediaGalleryFragmentViewModel.A00 = C36391kE.A12(new MediaGalleryFragmentViewModel$fillBubble$1(r3, mediaGalleryFragmentViewModel, (C023509x) null, i), C109325Xd.A00(mediaGalleryFragmentViewModel));
            } else {
                C19930wk r2 = mediaGalleryFragmentBase.A0N;
                if (r2 != null) {
                    r2.execute(new C81283wl((Object) mediaGalleryFragmentBase, i, 32));
                }
            }
        }
    }
}
