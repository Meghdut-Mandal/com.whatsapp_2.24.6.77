package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import java.util.Objects;

/* renamed from: X.1rf  reason: invalid class name and case insensitive filesystem */
public class C39301rf extends C03370Eh implements AnonymousClass4V4 {
    public final Context A00;
    public final C19730wQ A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass1RY A03;
    public final C89004Uw A04;
    public final C48812i6 A05;
    public final AnonymousClass3QY A06;
    public final AnonymousClass1A1 A07;

    public int getViewTypeCount() {
        return 114;
    }

    public View A04(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new AssertionError();
    }

    public void A05(View view, Context context, Cursor cursor) {
        throw new AssertionError();
    }

    public AnonymousClass3T1 BD5(int i) {
        return BD6(this.A02, i);
    }

    public AnonymousClass3T1 BD6(Cursor cursor, int i) {
        if (cursor == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A07.A00(cursor);
    }

    public int BDA(AnonymousClass3T1 r2, int i) {
        AnonymousClass3QY r0 = this.A06;
        C18740tg.A06(r2);
        return r0.A01(r2);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return BD6(this.A02, i);
    }

    public int getItemViewType(int i) {
        AnonymousClass3T1 BD6 = BD6(this.A02, i);
        AnonymousClass3QY r0 = this.A06;
        C18740tg.A06(BD6);
        return r0.A01(BD6);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return BJ5(view, viewGroup, BD6(this.A02, i), i);
    }

    public C39301rf(Context context, C19730wQ r2, AnonymousClass16D r3, AnonymousClass1RY r4, AnonymousClass3QY r5, C89004Uw r6, AnonymousClass1A1 r7, C48812i6 r8) {
        super(context);
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r7;
        this.A03 = r4;
        this.A06 = r5;
        this.A04 = r6;
        this.A05 = r8;
    }

    public View BJ5(View view, ViewGroup viewGroup, AnonymousClass3T1 r9, int i) {
        AnonymousClass2IR r7;
        AnonymousClass141 A0i;
        StringBuilder A0f = C36421kH.A0f(r9);
        A0f.append("ModifiedMessagesAdapter/getView message null, position=");
        A0f.append(i);
        A0f.append(", count=");
        C18740tg.A07(r9, C36381kD.A10(A0f, getCount()));
        if (view == null) {
            AnonymousClass3QY r2 = this.A06;
            Objects.requireNonNull(viewGroup);
            r7 = r2.A03(viewGroup.getContext(), this.A04, r9);
        } else {
            boolean z = false;
            if (getItemViewType(i) <= getViewTypeCount()) {
                z = true;
            }
            C18740tg.A0F(z, "The view type used to find a recycled view (convertView) should correspond to the number of types of conversation rows");
            r7 = (AnonymousClass2IR) view;
            r7.A22(r9, true);
        }
        ImageView A0N = C36391kE.A0N(r7, R.id.profile_picture);
        C011504z.A06(A0N, 2);
        C64933Qa r0 = r9.A1J;
        AnonymousClass11F r5 = r0.A00;
        boolean z2 = r5 instanceof C28981Uw;
        if (z2) {
            AnonymousClass16D r22 = this.A02;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("newsletter chatJid is null, message: ");
            A0u.append(r9);
            C18740tg.A07(r5, C36371kC.A0z(", isNewsletter: ", A0u, z2));
            A0i = r22.A0D(r5);
        } else if (r0.A02) {
            A0i = C36381kD.A0T(this.A01);
        } else {
            A0i = C36441kJ.A0i(this.A02, r9.A0L());
        }
        this.A03.A08(A0N, A0i);
        r7.setOnClickListener(this.A05);
        if ((r7 instanceof AnonymousClass2IL) && ((C46962bx) r7.getFMessage()).A03) {
            AnonymousClass2IL r02 = (AnonymousClass2IL) r7;
            r02.A02 = true;
            StickerView stickerView = r02.A03.A0G;
            if (stickerView != null) {
                stickerView.A02 = true;
                stickerView.A04();
            }
        }
        return r7;
    }
}
