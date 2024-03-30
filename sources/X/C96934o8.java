package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.stickers.store.StickerStoreTabFragment;

/* renamed from: X.4o8  reason: invalid class name and case insensitive filesystem */
public class C96934o8 extends AnonymousClass0D3 {
    public C96144mr A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ProgressBar A08;
    public final ProgressBar A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final GridLayoutManager A0D;
    public final CircularProgressBar A0E;
    public final WaTextView A0F;
    public final View A0G;
    public final RecyclerView A0H;
    public final /* synthetic */ StickerStoreTabFragment A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96934o8(View view, StickerStoreTabFragment stickerStoreTabFragment) {
        super(view);
        this.A0I = stickerStoreTabFragment;
        this.A0G = view;
        this.A0C = C36391kE.A0P(view, R.id.sticker_pack_title);
        this.A0A = C36391kE.A0P(view, R.id.sticker_pack_author);
        this.A0B = C36391kE.A0P(view, R.id.sticker_pack_filesize);
        this.A05 = C36391kE.A0N(view, R.id.button_one);
        this.A06 = C36391kE.A0N(view, R.id.button_two);
        this.A07 = C36401kF.A0G(view, R.id.sticker_pack_avatar_info_button);
        this.A08 = (ProgressBar) view.findViewById(R.id.pack_download_progress);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_row_recycler);
        this.A0H = recyclerView;
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(stickerStoreTabFragment.A00);
        this.A0D = gridLayoutManager;
        gridLayoutManager.A1f(1);
        recyclerView.setLayoutManager(gridLayoutManager);
        this.A01 = view.findViewById(R.id.bullet_file_size);
        this.A03 = view.findViewById(R.id.sticker_update_button);
        WaTextView waTextView = (WaTextView) view.findViewById(R.id.sticker_update_text);
        this.A0F = waTextView;
        this.A09 = (ProgressBar) view.findViewById(R.id.pack_update_progress);
        this.A0E = (CircularProgressBar) view.findViewById(R.id.sticker_row_loading);
        this.A02 = view.findViewById(R.id.new_pack_badge);
        this.A04 = C36391kE.A0N(view, R.id.sticker_animationlist);
        C33511fU.A03(waTextView);
    }
}
