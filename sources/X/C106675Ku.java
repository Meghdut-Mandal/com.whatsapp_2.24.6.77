package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;

/* renamed from: X.5Ku  reason: invalid class name and case insensitive filesystem */
public class C106675Ku extends C147396x9 {
    public View A00;
    public int A01;
    public TextView A02;
    public CircularProgressBar A03;
    public AnonymousClass68B A04;
    public final AnonymousClass1HA A05;
    public final AnonymousClass1AP A06;
    public final C88234Rx A07;
    public final StickerPackDownloader A08;

    public C106675Ku(Context context, LayoutInflater layoutInflater, C20810yC r9, AnonymousClass1HA r10, AnonymousClass68B r11, AnonymousClass1AP r12, C88234Rx r13, StickerPackDownloader stickerPackDownloader, int i, int i2) {
        super(context, layoutInflater, r9, i, i2);
        this.A06 = r12;
        this.A08 = stickerPackDownloader;
        this.A05 = r10;
        this.A04 = r11;
        this.A07 = r13;
    }

    public void A05() {
        View view;
        if (this instanceof C106635Kq) {
            C106635Kq r4 = (C106635Kq) this;
            CircularProgressBar circularProgressBar = r4.A03;
            if (!(circularProgressBar == null || r4.A02 == null)) {
                if (r4.A02) {
                    circularProgressBar.setVisibility(0);
                    r4.A02.setVisibility(0);
                    boolean isEmpty = TextUtils.isEmpty(r4.A04.A0H);
                    TextView textView = r4.A02;
                    if (isEmpty) {
                        textView.setText(R.string.f12nameremoved);
                    } else {
                        Context context = r4.A0B;
                        Object[] A0L = AnonymousClass001.A0L();
                        A0L[0] = r4.A04.A0H;
                        C36341k9.A0s(context, textView, A0L, R.string.f12nameremoved);
                    }
                } else {
                    circularProgressBar.setVisibility(8);
                    r4.A02.setVisibility(8);
                }
            }
            if (r4.A00 == null) {
                return;
            }
            if (r4.A04.A05.size() != 0 || r4.A02) {
                r4.A00.setVisibility(8);
                return;
            }
            r4.A00.setVisibility(0);
            C67103Yn.A00(r4.A01, r4, 19);
            return;
        }
        CircularProgressBar circularProgressBar2 = this.A03;
        if (circularProgressBar2 != null && this.A02 != null && (view = this.A00) != null) {
            if (this.A04.A06) {
                circularProgressBar2.setVisibility(0);
                this.A02.setVisibility(0);
                this.A00.setVisibility(0);
                boolean isEmpty2 = TextUtils.isEmpty(this.A04.A0H);
                TextView textView2 = this.A02;
                if (isEmpty2) {
                    textView2.setText(R.string.f12nameremoved);
                } else {
                    C36341k9.A0s(this.A0B, textView2, new Object[]{this.A04.A0H}, R.string.f12nameremoved);
                }
                int i = this.A01;
                CircularProgressBar circularProgressBar3 = this.A03;
                if (i >= 0) {
                    circularProgressBar3.setIndeterminate(false);
                    this.A03.setProgress(this.A01);
                    return;
                }
                circularProgressBar3.setIndeterminate(true);
                return;
            }
            view.setVisibility(8);
            this.A03.setVisibility(8);
            this.A02.setVisibility(8);
        }
    }

    public void A06(AnonymousClass68B r3) {
        this.A04 = r3;
        A00().A0L(r3.A05);
    }

    public void A03(View view) {
        this.A03 = (CircularProgressBar) C012005e.A02(view, R.id.pack_loading);
        this.A02 = C36391kE.A0O(view, R.id.pack_loading_text);
        View A022 = C012005e.A02(view, R.id.cancel_button);
        this.A00 = A022;
        C48772i1.A00(A022, this, 25);
        A05();
    }
}
