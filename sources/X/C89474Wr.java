package X;

import android.content.Context;
import com.whatsapp.conversation.selection.SelectedImageAlbumViewModel;
import com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.4Wr  reason: invalid class name and case insensitive filesystem */
public class C89474Wr implements C88744Tw {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    public C89474Wr(SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity) {
        this.A01 = selectedImageAndVideoAlbumActivity;
        this.A00 = selectedImageAndVideoAlbumActivity;
    }

    public String BBB() {
        AnonymousClass141 r1;
        AnonymousClass171 r0;
        UserJid A03;
        UserJid A032;
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            SingleSelectedMessageActivity singleSelectedMessageActivity = (SingleSelectedMessageActivity) obj;
            C39701tL r02 = singleSelectedMessageActivity.A07;
            if (r02 == null) {
                throw C36331k8.A0d("singleSelectedMessageViewModel");
            }
            AnonymousClass3T1 A0r = C36431kI.A0r(r02.A00);
            if (A0r == null || (A032 = C20350xQ.A03(A0r)) == null) {
                return null;
            }
            AnonymousClass16D r03 = singleSelectedMessageActivity.A03;
            if (r03 != null) {
                r1 = r03.A07(A032);
                if (r1 == null) {
                    return null;
                }
                r0 = singleSelectedMessageActivity.A04;
                if (r0 == null) {
                    throw C36331k8.A0c();
                }
            } else {
                throw C36331k8.A0Z();
            }
        } else {
            SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity = (SelectedImageAndVideoAlbumActivity) obj;
            AnonymousClass2bU A012 = SelectedImageAndVideoAlbumActivity.A01(selectedImageAndVideoAlbumActivity);
            if (A012 == null || (A03 = C20350xQ.A03(A012)) == null) {
                return null;
            }
            AnonymousClass16D r04 = selectedImageAndVideoAlbumActivity.A00;
            if (r04 != null) {
                r1 = r04.A07(A03);
                if (r1 == null) {
                    return null;
                }
                r0 = selectedImageAndVideoAlbumActivity.A01;
                if (r0 == null) {
                    throw C36331k8.A0c();
                }
            } else {
                throw C36331k8.A0Z();
            }
        }
        return C36381kD.A0v(r0, r1);
    }

    public Collection BHB() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            C39701tL r1 = ((SingleSelectedMessageActivity) obj).A07;
            if (r1 == null) {
                throw C36331k8.A0d("singleSelectedMessageViewModel");
            }
            Object A04 = r1.A00.A04();
            if (A04 != null) {
                return C36371kC.A11(A04);
            }
            return null;
        }
        SelectedImageAlbumViewModel selectedImageAlbumViewModel = ((SelectedImageAndVideoAlbumActivity) obj).A03;
        if (selectedImageAlbumViewModel != null) {
            return (Collection) selectedImageAlbumViewModel.A00.A04();
        }
        throw C36331k8.A0d("selectedImageAlbumViewModel");
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return (Context) this.A00;
    }

    public C89474Wr(SingleSelectedMessageActivity singleSelectedMessageActivity) {
        this.A01 = singleSelectedMessageActivity;
        this.A00 = singleSelectedMessageActivity;
    }
}
