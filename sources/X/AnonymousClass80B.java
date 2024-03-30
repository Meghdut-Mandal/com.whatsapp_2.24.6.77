package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.jid.UserJid;

/* renamed from: X.80B  reason: invalid class name */
public abstract class AnonymousClass80B extends AnonymousClass0D3 {
    public void A0B(AnonymousClass9EP r13) {
        CategoryThumbnailLoader categoryThumbnailLoader;
        UserJid userJid;
        C206759tv r5;
        C006302t alS;
        AnonymousClass00S ahB;
        AnonymousClass00S ahC;
        if (this instanceof AnonymousClass8X1) {
            AnonymousClass8X1 r4 = (AnonymousClass8X1) this;
            AnonymousClass00C.A0D(r13, 0);
            C174428Wv r52 = (C174428Wv) r13;
            C128506Cn r3 = r52.A00;
            ((TextView) r4.A02.getValue()).setText(r3.A02);
            View view = r4.A0H;
            view.setOnClickListener(new AnonymousClass3YE(r4, r13, 14));
            C34081gQ.A02(view);
            CategoryThumbnailLoader categoryThumbnailLoader2 = r4.A00;
            UserJid userJid2 = r52.A01;
            categoryThumbnailLoader2.A00(r3.A00, userJid2, new C22138AhN(r4), new C22139AhO(r4), new C22367AlU(r4));
        } else if (this instanceof C174448Wx) {
            ((ShimmerFrameLayout) ((C174448Wx) this).A00.getValue()).A03();
        } else if (this instanceof C174468Wz) {
            C174468Wz r32 = (C174468Wz) this;
            AnonymousClass00C.A0D(r13, 0);
            ((TextView) r32.A01.getValue()).setText(((C174418Wu) r13).A00.A02);
            View view2 = r32.A0H;
            view2.setOnClickListener(new AnonymousClass3YE(r32, r13, 13));
            ((WaImageView) r32.A00.getValue()).A01 = true;
            C34081gQ.A02(view2);
        } else if (!(this instanceof C174438Ww)) {
            if (this instanceof AnonymousClass8X0) {
                AnonymousClass8X0 r33 = (AnonymousClass8X0) this;
                AnonymousClass00C.A0D(r13, 0);
                C174408Wt r132 = (C174408Wt) r13;
                C128506Cn r1 = r132.A00;
                ((TextView) r33.A03.getValue()).setText(r1.A02);
                categoryThumbnailLoader = r33.A00;
                userJid = r132.A01;
                r5 = r1.A00;
                alS = new C22366AlT(r33);
                ahB = new C22130AhF(r33);
                ahC = new C22131AhG(r33);
            } else {
                C174458Wy r34 = (C174458Wy) this;
                AnonymousClass00C.A0D(r13, 0);
                C174398Ws r133 = (C174398Ws) r13;
                C128506Cn r12 = r133.A00;
                ((TextView) r34.A02.getValue()).setText(r12.A02);
                C34081gQ.A02(r34.A0H);
                categoryThumbnailLoader = r34.A00;
                userJid = r133.A01;
                r5 = r12.A00;
                alS = new C22365AlS(r34);
                ahB = new C22126AhB(r34);
                ahC = new C22127AhC(r34);
            }
            categoryThumbnailLoader.A00(r5, userJid, ahB, ahC, alS);
        }
    }

    public AnonymousClass80B(View view) {
        super(view);
    }
}
