package X;

import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.EmojiPopupFooter;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.mentions.MentionPickerView;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.scroller.RecyclerFastScroller;
import com.whatsapp.search.IteratingPlayer;

/* renamed from: X.4Vk  reason: invalid class name and case insensitive filesystem */
public class C89144Vk extends AnonymousClass0UE {
    public Object A00;
    public final int A01;

    public C89144Vk(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A03(RecyclerView recyclerView, int i) {
        EmojiPopupFooter emojiPopupFooter;
        C37651mz r0;
        switch (this.A01) {
            case 0:
                if (i == 0) {
                    AnonymousClass2IE r02 = (AnonymousClass2IE) this.A00;
                    AnonymousClass3CQ r3 = r02.A0C;
                    C64933Qa r2 = r02.A06;
                    int currentPosition = r02.A01.getCurrentPosition();
                    AnonymousClass00C.A0D(r2, 0);
                    r3.A00.put(r2, Integer.valueOf(currentPosition));
                    return;
                }
                return;
            case 2:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                MenuItem menuItem = mediaGalleryActivity.A04;
                if (menuItem != null && menuItem.isActionViewExpanded() && mediaGalleryActivity.getCurrentFocus() != null) {
                    InputMethodManager A0N = mediaGalleryActivity.A08.A0N();
                    C18740tg.A06(A0N);
                    A0N.hideSoftInputFromWindow(recyclerView.getWindowToken(), 2);
                    return;
                }
                return;
            case 3:
                int i2 = 0;
                if (i == 0) {
                    AnonymousClass22t r4 = (AnonymousClass22t) this.A00;
                    int height = r4.A08.getHeight();
                    if (r4.A04 > 0 && r4.A08.A00 > height / 2) {
                        i2 = height;
                    }
                    emojiPopupFooter = r4.A08;
                    if (i2 != emojiPopupFooter.A00) {
                        r0 = new C37651mz(r4, i2);
                    } else {
                        return;
                    }
                } else if (i == 1 && recyclerView.computeVerticalScrollRange() <= recyclerView.getHeight()) {
                    AnonymousClass22t r1 = (AnonymousClass22t) this.A00;
                    emojiPopupFooter = r1.A08;
                    if (emojiPopupFooter.A00 != 0) {
                        r0 = new C37651mz(r1, 0);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                emojiPopupFooter.startAnimation(r0);
                return;
            case 5:
                if (i == 0) {
                    MentionPickerView.A01((MentionPickerView) this.A00);
                    return;
                }
                return;
            case 9:
                IteratingPlayer iteratingPlayer = (IteratingPlayer) this.A00;
                if (i == 0) {
                    IteratingPlayer.A03(iteratingPlayer);
                    IteratingPlayer.A04(iteratingPlayer, iteratingPlayer.A01);
                    IteratingPlayer.A01(iteratingPlayer);
                    return;
                }
                IteratingPlayer.A02(iteratingPlayer);
                return;
            default:
                super.A03(recyclerView, i);
                return;
        }
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        WaEditText waEditText;
        C604938b r0;
        switch (this.A01) {
            case 1:
                AnonymousClass02E r3 = (AnonymousClass02E) this.A00;
                if (r3.A0F != null) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(-1);
                    View findViewById = r3.A0F.findViewById(R.id.shadow_top);
                    int i3 = 4;
                    if (canScrollVertically) {
                        i3 = 0;
                    }
                    findViewById.setVisibility(i3);
                }
                if (r3.A0F != null) {
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(1);
                    View findViewById2 = r3.A0F.findViewById(R.id.shadow_bottom);
                    int i4 = 4;
                    if (canScrollVertically2) {
                        i4 = 0;
                    }
                    findViewById2.setVisibility(i4);
                    return;
                }
                return;
            case 3:
                AnonymousClass22t r32 = (AnonymousClass22t) this.A00;
                if (i2 == 0) {
                    EmojiPopupFooter emojiPopupFooter = r32.A08;
                    if (emojiPopupFooter.A00 != 0) {
                        emojiPopupFooter.startAnimation(new C37651mz(r32, 0));
                        r32.A04 = 0;
                        return;
                    }
                    return;
                }
                Animation animation = r32.A08.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                EmojiPopupFooter emojiPopupFooter2 = r32.A08;
                emojiPopupFooter2.setTopOffset(emojiPopupFooter2.A00 + i2);
                r32.A04 = i2;
                return;
            case 4:
                AnonymousClass00C.A0D(recyclerView, 0);
                if (i2 != 0) {
                    waEditText = ((GifSearchContainer) this.A00).A06;
                    break;
                } else {
                    return;
                }
            case 6:
                AnonymousClass00C.A0D(recyclerView, 0);
                AnonymousClass0CP layoutManager = recyclerView.getLayoutManager();
                AnonymousClass00C.A0E(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int A1V = ((LinearLayoutManager) layoutManager).A1V();
                NewsletterDirectoryActivity newsletterDirectoryActivity = (NewsletterDirectoryActivity) this.A00;
                RecyclerView recyclerView2 = newsletterDirectoryActivity.A01;
                if (recyclerView2 == null) {
                    throw C36331k8.A0d("directoryRecyclerView");
                } else if (recyclerView2.getScrollState() != 0 || A1V != -1) {
                    if (!newsletterDirectoryActivity.A3k().A02 || !((r0 = (C604938b) newsletterDirectoryActivity.A3k().A03.A04()) == null || r0.A02 == null)) {
                        C41051wX r02 = newsletterDirectoryActivity.A07;
                        if (r02 == null) {
                            throw C36331k8.A0d("newsletterDirectoryAdapter");
                        } else if (r02.getItemViewType(A1V) == 2) {
                            newsletterDirectoryActivity.A3t((Integer) null, true);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        C41051wX r03 = newsletterDirectoryActivity.A07;
                        if (r03 == null) {
                            throw C36331k8.A0d("newsletterDirectoryAdapter");
                        }
                        r03.A0L();
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                AnonymousClass00C.A0D(recyclerView, 0);
                if (i2 != 0) {
                    waEditText = ((StickerSearchDialogFragment) this.A00).A05;
                    break;
                } else {
                    return;
                }
            case 8:
                if (i2 != 0) {
                    RecyclerFastScroller recyclerFastScroller = (RecyclerFastScroller) this.A00;
                    RecyclerFastScroller.A01(recyclerFastScroller);
                    if (recyclerFastScroller.A06 != null && recyclerFastScroller.A01.getVisibility() == 0) {
                        recyclerFastScroller.A06.Bwb();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.A04(recyclerView, i, i2);
                return;
        }
        if (waEditText != null) {
            waEditText.A0B();
        }
    }
}
