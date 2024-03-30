package X;

import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$2$onMessagesDeleted$1;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4a4  reason: invalid class name and case insensitive filesystem */
public class C90384a4 implements AnonymousClass191 {
    public Object A00;
    public Object A01;
    public final int A02;

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public C90384a4(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Bas(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Bau(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r6) {
        if (this.A02 != 0) {
            AnonymousClass00C.A0D(r6, 0);
            if (AnonymousClass00C.A0J(((AnonymousClass3T1) this.A00).A1J.A00, r6)) {
                C40001uV r4 = (C40001uV) this.A01;
                C36381kD.A1R(r4.A0H, new CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(r4, (C023509x) null), C109325Xd.A00(r4));
            }
        }
    }

    public void Bb6(Collection collection, Map map) {
        if (this.A02 != 0) {
            AnonymousClass00C.A0D(collection, 0);
            if (collection.contains(this.A00)) {
                C40001uV r4 = (C40001uV) this.A01;
                C36381kD.A1R(r4.A0H, new CommentsBottomSheetViewModel$1$2$onMessagesDeleted$1(r4, (C023509x) null), C109325Xd.A00(r4));
                return;
            }
            return;
        }
        C62473Gh r42 = (C62473Gh) this.A00;
        if (!r42.A00) {
            boolean z = false;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (r42.A03.remove(C36391kE.A0l(it).A1J) != null) {
                    z = true;
                }
            }
            if (z) {
                AnonymousClass4Y1 r0 = (AnonymousClass4Y1) ((AnonymousClass4Q3) this.A01);
                int i = r0.A01;
                Object obj = r0.A00;
                switch (i) {
                    case 0:
                        C001700s r1 = ((MessageSelectionViewModel) obj).A00;
                        AnonymousClass00C.A0D(r1, 0);
                        r1.A0D(r1.A04());
                        return;
                    case 1:
                        MediaGalleryActivity.A07((MediaGalleryActivity) obj);
                        return;
                    default:
                        StorageUsageGalleryActivity.A0F((StorageUsageGalleryActivity) obj);
                        return;
                }
            }
        }
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb9(Collection collection) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }
}
