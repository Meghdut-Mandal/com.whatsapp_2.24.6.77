package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import com.whatsapp.stickers.StickerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4mr  reason: invalid class name and case insensitive filesystem */
public class C96144mr extends AnonymousClass0CZ {
    public int A00;
    public int A01;
    public View A02;
    public RecyclerView A03;
    public AnonymousClass68B A04;
    public AnonymousClass337 A05;
    public List A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C20810yC A0A;
    public final C24121Be A0B;
    public final AnonymousClass1HA A0C;
    public final StickerView A0D;
    public final AnonymousClass6CW A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final AnonymousClass0UE A0H = new C162517oi(this, 17);

    public static List A00(C96144mr r0) {
        List list = r0.A06;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public static void A01(C96144mr r10) {
        RecyclerView recyclerView = r10.A03;
        C18740tg.A04(recyclerView);
        StickerView stickerView = r10.A0D;
        if (stickerView != null) {
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(recyclerView);
            int i = A0a.leftMargin;
            int i2 = A0a.rightMargin;
            int width = r10.A03.getWidth();
            int height = r10.A03.getHeight();
            AnonymousClass0D3 A0Q = r10.A03.A0Q(r10.A01);
            if (A0Q == null) {
                r10.A0L();
                return;
            }
            View view = A0Q.A0H;
            r10.A02 = view;
            float x = view.getX() + ((float) i) + (C36441kJ.A01(r10.A02) / 2.0f);
            float y = r10.A02.getY() + (C36441kJ.A02(r10.A02) / 2.0f);
            float max = Math.max(x - (C36441kJ.A01(stickerView) / 2.0f), 0.0f);
            float max2 = Math.max(y - (C36441kJ.A02(stickerView) / 2.0f), 0.0f);
            stickerView.setX(max - Math.max(((C36441kJ.A01(stickerView) + max) - ((float) width)) - ((float) i2), 0.0f));
            stickerView.setY(max2 - Math.max((C36441kJ.A02(stickerView) + max2) - ((float) height), 0.0f));
        }
    }

    public static boolean A03(C96144mr r4, int i) {
        boolean z;
        DialogFragment starStickerFromPickerDialogFragment;
        if (r4.A05 == null || A02(r4, i)) {
            return true;
        }
        StickerView stickerView = r4.A0D;
        if (stickerView != null && stickerView.getVisibility() == 0 && r4.A01 != i) {
            return true;
        }
        AnonymousClass68B r2 = r4.A04;
        C18740tg.A06(r2);
        if (r2.A05.size() <= i) {
            return false;
        }
        List A002 = A00(r4);
        if (i >= A002.size()) {
            z = false;
        } else {
            z = ((AnonymousClass6CV) A002.get(i)).A02;
        }
        AnonymousClass337 r42 = r4.A05;
        C135066c4 r3 = (C135066c4) r2.A05.get(i);
        r3.A05 = C36371kC.A0o();
        if (z) {
            starStickerFromPickerDialogFragment = C55522ul.A00(r3);
        } else {
            starStickerFromPickerDialogFragment = new StarStickerFromPickerDialogFragment();
            Bundle A072 = AnonymousClass001.A07();
            A072.putParcelable("sticker", r3);
            A072.putInt("position", i);
            starStickerFromPickerDialogFragment.A17(A072);
        }
        r42.A00.Btm(starStickerFromPickerDialogFragment);
        return true;
    }

    public void A0H(RecyclerView recyclerView) {
        this.A03 = recyclerView;
        recyclerView.A0v(this.A0H);
    }

    public void A0I(RecyclerView recyclerView) {
        recyclerView.A0w(this.A0H);
        this.A03 = null;
    }

    public int A0J() {
        List list;
        AnonymousClass68B r1 = this.A04;
        if (r1 == null) {
            return 0;
        }
        if (r1.A0S || (r1.A0G == null && !r1.A05.isEmpty())) {
            list = this.A04.A05;
        } else {
            list = this.A04.A04;
        }
        int size = list.size();
        int i = this.A00;
        if (i > 0) {
            return Math.min(size, i);
        }
        return size;
    }

    public void A0L() {
        C18740tg.A04(this.A03);
        StickerView stickerView = this.A0D;
        if (stickerView != null && stickerView.getVisibility() == 0) {
            stickerView.setSelected(false);
            this.A02.setVisibility(0);
            stickerView.setVisibility(4);
            this.A03.setAlpha(1.0f);
            stickerView.A05();
        }
    }

    public void A0N(C135066c4 r10, AnonymousClass68B r11, int i) {
        RecyclerView recyclerView = this.A03;
        C18740tg.A04(recyclerView);
        AnonymousClass0D3 A0Q = recyclerView.A0Q(i);
        if (A0Q == null) {
            A0L();
            return;
        }
        View view = A0Q.A0H;
        this.A02 = view;
        ImageView A0N = C36391kE.A0N(view, R.id.sticker_preview);
        this.A01 = i;
        A01(this);
        StickerView stickerView = this.A0D;
        if (stickerView != null) {
            C135066c4 r3 = r10;
            if (r10 == null || r10.A0A == null || (this.A0G ? !r11.A0P : r11.A01() || !r11.A0N)) {
                stickerView.setImageDrawable(A0N.getDrawable());
                stickerView.setSelected(true);
            } else {
                this.A0C.A09(stickerView, r3, new C164777sM(this, 1), stickerView.getWidth(), stickerView.getHeight(), true, false);
            }
            C18740tg.A04(this.A03);
            this.A02.setVisibility(4);
            stickerView.setVisibility(0);
            this.A03.setAlpha(0.2f);
        }
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r12, int i) {
        C135066c4 r4;
        C96714nm r122 = (C96714nm) r12;
        ImageView imageView = r122.A01;
        imageView.setImageResource(this.A09);
        boolean A022 = A02(this, i);
        r122.A00.setVisibility(C36351kA.A00(A022 ? 1 : 0));
        imageView.setAlpha(C90514aH.A03(A022));
        AnonymousClass68B r0 = this.A04;
        if (r0 != null) {
            if (r0.A05.size() > i) {
                r4 = (C135066c4) this.A04.A05.get(i);
                if (r4 != null) {
                    imageView.setContentDescription(AnonymousClass3RT.A00(imageView.getContext(), r4));
                }
            } else {
                r4 = null;
            }
            AnonymousClass68B r1 = this.A04;
            if (r1.A0S || ((r1.A0G == null && !r1.A05.isEmpty()) || !(r4 == null || r4.A0A == null || (!this.A0G && r1.A01())))) {
                AnonymousClass1HA r2 = this.A0C;
                C18740tg.A06(r4);
                int i2 = this.A08;
                r2.A09(imageView, r4, new C148536z1(this, i), i2, i2, false, false);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("https://static.whatsapp.net/sticker?img=");
                A0u.append(C36401kF.A0s(this.A04.A04, r122.A04()));
                ImageView imageView2 = imageView;
                this.A0E.A00((Drawable) null, (Drawable) null, imageView2, new C148876zZ(this, r122), this.A0B.A01(AnonymousClass000.A0q(this.A0A.A09(6785), A0u)));
            }
            if (this.A0F) {
                View view = r122.A0H;
                view.setOnLongClickListener(new C135696d7(this, i));
                view.setOnClickListener(new AnonymousClass3YL(this, i, 18, r4));
            }
        }
    }

    public C96144mr(C20810yC r4, C24121Be r5, AnonymousClass1HA r6, StickerView stickerView, AnonymousClass6CW r8, int i, int i2, boolean z, boolean z2) {
        this.A0A = r4;
        this.A0C = r6;
        this.A0E = r8;
        this.A08 = i;
        this.A07 = i2;
        this.A00 = 0;
        this.A09 = R.drawable.sticker_store_error;
        this.A0F = z;
        this.A0G = z2;
        this.A0D = stickerView;
        this.A0B = r5;
        if (stickerView != null) {
            C67103Yn.A00(stickerView, this, 23);
            stickerView.setOnLongClickListener(new C163337q2(this, 6));
        }
    }

    public static boolean A02(C96144mr r1, int i) {
        List A002 = A00(r1);
        if (i < 0 || i >= A002.size()) {
            return false;
        }
        return ((AnonymousClass6CV) A002.get(i)).A00;
    }

    public void A0M(int i, boolean z) {
        List A002 = A00(this);
        if (i >= 0 && i < A002.size()) {
            ((AnonymousClass6CV) A002.get(i)).A00 = z;
            A07(i);
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        C96714nm r5 = new C96714nm(C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved));
        ImageView imageView = r5.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i2 = this.A08;
        layoutParams.height = i2;
        layoutParams.width = i2;
        imageView.setLayoutParams(layoutParams);
        int i3 = this.A07;
        imageView.setPadding(i3, i3, i3, i3);
        View view = r5.A00;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i2;
        view.setLayoutParams(layoutParams);
        view.setPadding(i3, i3, i3, i3);
        return r5;
    }
}
