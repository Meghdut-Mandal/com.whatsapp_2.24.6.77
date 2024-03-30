package X;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.StickerView;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.1wV  reason: invalid class name and case insensitive filesystem */
public final class C41031wV extends AnonymousClass0CZ {
    public Cursor A00;
    public Map A01 = C000400e.A0D();
    public final C57242xv A02;
    public final AnonymousClass1RY A03;
    public final AnonymousClass3QY A04;
    public final C89004Uw A05;
    public final AnonymousClass1A1 A06;
    public final C48812i6 A07;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        LayoutInflater A0C = C36351kA.A0C(viewGroup);
        if (i == -1) {
            return new C41441xD(C36371kC.A0I(A0C, viewGroup, R.layout.f9nameremoved));
        }
        View inflate = A0C.inflate(R.layout.f9nameremoved, viewGroup, false);
        C57242xv r1 = this.A02;
        AnonymousClass00C.A0B(inflate);
        AnonymousClass1RY r5 = this.A03;
        AnonymousClass3QY r6 = this.A04;
        C89004Uw r7 = this.A05;
        C48812i6 r8 = this.A07;
        List list = AnonymousClass0D3.A0I;
        C18800tq r0 = r1.A00.A01;
        return new AnonymousClass2JJ(inflate, C36351kA.A0N(r0), C36341k9.A0R(r0), r5, r6, r7, r8);
    }

    public int A0J() {
        int count;
        Cursor cursor = this.A00;
        if (cursor == null || (count = cursor.getCount()) == 0) {
            return 0;
        }
        return count + 1;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r10, int i) {
        String str;
        AnonymousClass141 A08;
        C64933Qa r0;
        C41441xD r102 = (C41441xD) r10;
        AnonymousClass00C.A0D(r102, 0);
        if (r102 instanceof AnonymousClass2JJ) {
            Cursor cursor = this.A00;
            C18740tg.A06(cursor);
            cursor.moveToPosition(i - 1);
            AnonymousClass3T1 A002 = this.A06.A00(cursor);
            C18740tg.A06(A002);
            AnonymousClass00C.A08(A002);
            AnonymousClass2JJ r103 = (AnonymousClass2JJ) r102;
            Map map = this.A01;
            AnonymousClass37F A0X = A002.A0X();
            if (A0X == null || (r0 = A0X.A02) == null || (str = r0.A01) == null) {
                str = A002.A1J.A01;
            }
            AnonymousClass00C.A0B(str);
            AbstractCollection abstractCollection = (AbstractCollection) map.get(str);
            if (abstractCollection == null) {
                abstractCollection = AnonymousClass001.A0I();
            }
            int size = abstractCollection.size();
            Context A0B = C36371kC.A0B(r103.A0H);
            AnonymousClass2IR r4 = r103.A00;
            if (r4 == null) {
                r4 = r103.A06.A03(A0B, r103.A07, A002);
                r4.setRecipientNameVisibility(false);
            } else {
                r4.A22(A002, true);
            }
            ImageView A0N = C36391kE.A0N(r4, R.id.profile_picture);
            C011504z.A06(A0N, 2);
            if (A002.A1J.A02) {
                C19730wQ r02 = r103.A02;
                r02.A0G();
                A08 = r02.A0E;
            } else {
                UserJid A0L = A002.A0L();
                Objects.requireNonNull(A0L, "senderUserJid can't be null since it is a groupJid");
                A08 = r103.A04.A08(A0L);
            }
            Objects.requireNonNull(A08, "sender can't be null");
            r103.A05.A08(A0N, A08);
            r4.setOnClickListener(r103.A08);
            if (r4 instanceof AnonymousClass2IL) {
                AnonymousClass2IL r1 = (AnonymousClass2IL) r4;
                if (((C46962bx) ((AnonymousClass2bU) r1.A0K)).A03) {
                    r1.A02 = true;
                    StickerView stickerView = r1.A03.A0G;
                    if (stickerView != null) {
                        stickerView.A02 = true;
                        stickerView.A04();
                    }
                }
            }
            if (r103.A00 == null) {
                r103.A01.addView(r4);
                r103.A00 = r4;
            }
            WaTextView waTextView = r103.A03;
            C66963Xz.A00(waTextView, abstractCollection, 12);
            Context context = r103.A01.getContext();
            Object[] A0M = AnonymousClass001.A0M();
            A0M[0] = AnonymousClass14B.A03(context, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
            AnonymousClass000.A1L(A0M, size, 1);
            C36361kB.A1P(context.getResources().getQuantityString(R.plurals.f10nameremoved, size, AnonymousClass14B.A0I(A0M)), waTextView);
        }
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return -1;
        }
        AnonymousClass3QY r2 = this.A04;
        Cursor cursor = this.A00;
        C18740tg.A06(cursor);
        cursor.moveToPosition(i - 1);
        AnonymousClass3T1 A002 = this.A06.A00(cursor);
        C18740tg.A06(A002);
        AnonymousClass00C.A08(A002);
        return r2.A01(A002);
    }

    public C41031wV(C57242xv r2, AnonymousClass1RY r3, AnonymousClass3QY r4, C89004Uw r5, AnonymousClass1A1 r6, C48812i6 r7) {
        C36321k7.A0x(r6, r2);
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = r7;
    }
}
