package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.gifs.GifExpressionsFragment;
import java.util.List;

/* renamed from: X.4kY  reason: invalid class name and case insensitive filesystem */
public final class C95314kY extends C03890Ih {
    public int A00;
    public SparseArray A01 = new SparseArray();
    public C119575q5 A02;
    public AnonymousClass3XM A03;
    public List A04 = C023409w.A00;
    public boolean A05;
    public final AnonymousClass01z A06;
    public final String A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95314kY(AnonymousClass01z r2, String str, int i, boolean z, boolean z2) {
        super(r2, 0);
        AnonymousClass00C.A0D(r2, 2);
        this.A07 = str;
        this.A06 = r2;
        this.A08 = z;
        this.A00 = i;
        this.A05 = z2;
    }

    public int A07(Object obj) {
        return -2;
    }

    public void A0G(ViewGroup viewGroup) {
        AnonymousClass00C.A0D(viewGroup, 0);
        super.A0G(viewGroup);
    }

    public Object A0I(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        Object A0I = super.A0I(viewGroup, i);
        AnonymousClass00C.A0E(A0I, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        this.A01.put(i, A0I);
        return A0I;
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
        C36321k7.A0v(viewGroup, 0, obj);
        SparseArray sparseArray = this.A01;
        sparseArray.put(i, (Object) null);
        sparseArray.remove(i);
        super.A0J(viewGroup, obj, i);
    }

    public int A0H() {
        return this.A04.size();
    }

    public AnonymousClass02E A0L(int i) {
        AnonymousClass02E A002;
        Bundle A072;
        Object obj = this.A04.get(i);
        if (AnonymousClass00C.A0J(obj, AnonymousClass55N.A00)) {
            A002 = new EmojiExpressionsFragment();
            A072 = AnonymousClass001.A07();
            A072.putBoolean("isCollapsed", this.A05);
        } else {
            AnonymousClass55O r1 = AnonymousClass55O.A00;
            if (AnonymousClass00C.A0J(obj, r1)) {
                boolean A0J = AnonymousClass00C.A0J(this.A02, r1);
                A002 = new GifExpressionsFragment();
                A072 = AnonymousClass001.A07();
                A072.putBoolean("isExpressionsSearch", this.A08);
                A072.putBoolean("isCollapsed", this.A05);
                A072.putBoolean("isSelected", A0J);
            } else {
                AnonymousClass55M r12 = AnonymousClass55M.A00;
                if (AnonymousClass00C.A0J(obj, r12)) {
                    boolean A0J2 = AnonymousClass00C.A0J(this.A02, r12);
                    boolean A1U = C36381kD.A1U(this.A00, 7);
                    A002 = new AvatarExpressionsFragment();
                    Bundle A073 = AnonymousClass001.A07();
                    A073.putString("rawChatJid", this.A07);
                    A073.putBoolean("isExpressionsSearch", this.A08);
                    A073.putBoolean("isCollapsed", this.A05);
                    A073.putBoolean("isSelected", A0J2);
                    A073.putBoolean("shouldAnimateStickers", A1U);
                    A073.putInt("arg_search_opener", this.A00);
                    A002.A17(A073);
                } else if (AnonymousClass00C.A0J(obj, AnonymousClass55P.A00)) {
                    A002 = C110705b6.A00(this.A03, this.A07, this.A00, this.A08, this.A05);
                } else {
                    throw C36441kJ.A18();
                }
                return A002;
            }
        }
        A002.A17(A072);
        return A002;
    }
}
