package X;

import androidx.viewpager.widget.ViewPager;
import com.whatsapp.WaEditText;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryActivity;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import com.whatsapp.stickers.store.StickerStoreActivity;

/* renamed from: X.3Ma  reason: invalid class name and case insensitive filesystem */
public class C63943Ma implements C159127ir, C17690rq {
    public Object A00;
    public final int A01;

    public C63943Ma(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Biu(AnonymousClass6DR r4) {
        int A0O;
        if (2 - this.A01 == 0) {
            ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = (ReactionsBottomSheetDialogFragment) this.A00;
            if (r4.A00 >= reactionsBottomSheetDialogFragment.A0K.A0H()) {
                A0O = 0;
            } else {
                A0O = reactionsBottomSheetDialogFragment.A06.A0O(r4.A00);
            }
            reactionsBottomSheetDialogFragment.A06.A0P(A0O);
        }
    }

    public void Biv(AnonymousClass6DR r4) {
        int A0O;
        ViewPager viewPager;
        String str;
        switch (this.A01) {
            case 0:
                BonsaiDiscoveryActivity bonsaiDiscoveryActivity = (BonsaiDiscoveryActivity) this.A00;
                if (!bonsaiDiscoveryActivity.A02) {
                    bonsaiDiscoveryActivity.A02 = true;
                    return;
                } else if (r4 != null) {
                    C21010yW r2 = bonsaiDiscoveryActivity.A01;
                    if (r2 != null) {
                        C45162Qh r1 = new C45162Qh();
                        r1.A00 = 30;
                        CharSequence charSequence = r4.A05;
                        if (charSequence == null || (str = charSequence.toString()) == null) {
                            str = "";
                        }
                        r1.A03 = str;
                        r1.A02 = 36;
                        r2.Bly(r1);
                        return;
                    }
                    throw C36331k8.A0d("wamRuntime");
                } else {
                    return;
                }
            case 1:
                AnonymousClass00C.A0D(r4, 0);
                StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) this.A00;
                WaEditText waEditText = stickerSearchDialogFragment.A05;
                if (waEditText != null) {
                    waEditText.A0B();
                }
                viewPager = stickerSearchDialogFragment.A03;
                if (viewPager == null) {
                    return;
                }
                break;
            case 2:
                ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = (ReactionsBottomSheetDialogFragment) this.A00;
                if (r4.A00 >= reactionsBottomSheetDialogFragment.A0K.A0H()) {
                    A0O = 0;
                } else {
                    A0O = reactionsBottomSheetDialogFragment.A06.A0O(r4.A00);
                }
                reactionsBottomSheetDialogFragment.A06.A0P(A0O);
                return;
            default:
                viewPager = ((StickerStoreActivity) this.A00).A00;
                break;
        }
        viewPager.setCurrentItem(r4.A00);
    }
}
