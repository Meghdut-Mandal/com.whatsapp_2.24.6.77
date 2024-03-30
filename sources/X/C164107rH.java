package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7rH  reason: invalid class name and case insensitive filesystem */
public class C164107rH implements C161317mY {
    public Object A00;
    public final int A01;

    public C164107rH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BRG(String str) {
        boolean z;
        switch (this.A01) {
            case 0:
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A00;
                C132306Ta r0 = (C132306Ta) avatarProfilePhotoViewModel.A00.A04();
                int i = 0;
                if (r0 != null) {
                    Iterator it = r0.A03.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C101414xW r1 = (C101414xW) it.next();
                            if (r1 instanceof C101404xV) {
                                z = ((C101404xV) r1).A01;
                            } else {
                                z = ((C101394xU) r1).A03;
                            }
                            if (!z) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                }
                AvatarProfilePhotoViewModel.A01(avatarProfilePhotoViewModel);
                AvatarProfilePhotoViewModel.A02(avatarProfilePhotoViewModel, "avatar_art_update", i, true);
                return;
            case 1:
                AnonymousClass00C.A0D(str, 0);
                ((C17300r3) this.A00).BwE(new AnonymousClass5IQ(str));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BRg(String str) {
        switch (this.A01) {
            case 1:
                AnonymousClass00C.A0D(str, 0);
                ((C17300r3) this.A00).BwE(AnonymousClass5IU.A00);
                return;
            case 3:
                ((StickerStorePackPreviewActivity) this.A00).A0Q = true;
                return;
            default:
                return;
        }
    }

    public void BRh() {
        switch (this.A01) {
            case 0:
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A00;
                if (!avatarProfilePhotoViewModel.A04.A01()) {
                    avatarProfilePhotoViewModel.A08.A0D(AnonymousClass5Rr.CLOSE_SCREEN);
                    return;
                }
                return;
            case 1:
                ((C17300r3) this.A00).BwE(AnonymousClass5IV.A00);
                return;
            case 2:
                return;
            default:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) this.A00;
                if (stickerStorePackPreviewActivity.A0Q) {
                    if (stickerStorePackPreviewActivity.A0S) {
                        stickerStorePackPreviewActivity.A0C.A00(8);
                    }
                    stickerStorePackPreviewActivity.finish();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ void BRi(String str) {
        if (1 - this.A01 == 0) {
            ((C17300r3) this.A00).BwE(new AnonymousClass5IR(str));
        }
    }

    public /* synthetic */ void BRj(String str, Map map) {
        if (1 - this.A01 == 0) {
            ((C17300r3) this.A00).BwE(new AnonymousClass5IS(str, map));
        }
    }

    public void BRk(boolean z, boolean z2) {
        boolean z3;
        switch (this.A01) {
            case 0:
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A00;
                C001700s r4 = avatarProfilePhotoViewModel.A00;
                C132306Ta A0a = C90514aH.A0a(r4);
                int i = 0;
                boolean z4 = A0a.A06;
                List list = A0a.A03;
                List list2 = A0a.A02;
                C101424xX r7 = A0a.A00;
                C101394xU r8 = A0a.A01;
                boolean z5 = A0a.A04;
                C36321k7.A0v(list, 1, list2);
                C132306Ta r6 = new C132306Ta(r7, r8, list, list2, z4, true, z5);
                Iterator it = r6.A03.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C101414xW r1 = (C101414xW) it.next();
                        if (r1 instanceof C101404xV) {
                            z3 = ((C101404xV) r1).A01;
                        } else {
                            z3 = ((C101394xU) r1).A03;
                        }
                        if (!z3) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                r4.A0C(r6);
                AvatarProfilePhotoViewModel.A02(avatarProfilePhotoViewModel, "avatar_update", i, true);
                return;
            case 1:
                ((C17300r3) this.A00).BwE(new AnonymousClass5IT(z, z2));
                return;
            case 2:
                AvatarStickerUpsellViewController A002 = ((AvatarStickerUpsellView) this.A00).getViewController();
                A002.A03.A02();
                A002.A01.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
