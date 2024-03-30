package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.7zd  reason: invalid class name and case insensitive filesystem */
public final class C168057zd extends AnonymousClass0CZ {
    public List A00 = AnonymousClass001.A0I();
    public final Context A01;
    public final GridLayoutManager A02;
    public final AnonymousClass1RY A03;
    public final C20810yC A04;
    public final AnonymousClass9FP A05;
    public final boolean A06;

    public void BSE(AnonymousClass0D3 r5, int i) {
        TextEmojiLabel textEmojiLabel;
        String A0K;
        AnonymousClass00C.A0D(r5, 0);
        int i2 = r5.A01;
        if (i2 == 0) {
            AnonymousClass80O r52 = (AnonymousClass80O) r5;
            AnonymousClass141 r2 = (AnonymousClass141) this.A00.get(i);
            this.A03.A08(r52.A00, r2);
            String A0J = r2.A0J();
            if (A0J == null || A0J.length() == 0) {
                textEmojiLabel = r52.A02;
                A0K = r2.A0K();
            } else {
                textEmojiLabel = r52.A02;
                A0K = r2.A0J();
            }
            textEmojiLabel.setText(A0K);
            if (r2.A0N()) {
                int A002 = C55832vG.A00(this.A04);
                ImageView imageView = r52.A01;
                imageView.setImageResource(A002);
                imageView.setVisibility(0);
                return;
            }
            r52.A01.setVisibility(8);
        } else if (i2 == 1 && i == 3) {
            AnonymousClass80M r53 = (AnonymousClass80M) r5;
            r53.A01.setText(R.string.f12nameremoved);
            r53.A00.setImageResource(R.drawable.ic_view_all);
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass0D3 r2;
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            List list = AnonymousClass0D3.A0I;
            r2 = new AnonymousClass80O(C36371kC.A0J(LayoutInflater.from(this.A01), viewGroup, R.layout.f9nameremoved, false), this.A05);
        } else if (i == 1) {
            List list2 = AnonymousClass0D3.A0I;
            r2 = new AnonymousClass80M(C36371kC.A0J(LayoutInflater.from(this.A01), viewGroup, R.layout.f9nameremoved, false), this.A05);
        } else {
            throw AnonymousClass001.A08("Invalid view type");
        }
        return r2;
    }

    public int getItemViewType(int i) {
        return i < 3 ? 0 : 1;
    }

    public int A0J() {
        int size = this.A00.size();
        if ((!this.A06 || size != 3) && size <= 3) {
            return size;
        }
        return this.A02.A01;
    }

    public C168057zd(Context context, GridLayoutManager gridLayoutManager, AnonymousClass1RY r4, C20810yC r5, AnonymousClass9FP r6, boolean z) {
        C36321k7.A18(context, r5, gridLayoutManager, r4);
        this.A01 = context;
        this.A04 = r5;
        this.A02 = gridLayoutManager;
        this.A03 = r4;
        this.A06 = z;
        this.A05 = r6;
    }
}
