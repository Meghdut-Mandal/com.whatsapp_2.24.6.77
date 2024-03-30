package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.1nV  reason: invalid class name and case insensitive filesystem */
public class C37971nV extends BaseAdapter {
    public int A00 = 4;
    public int A01 = 3;
    public List A02;
    public boolean A03;
    public final Activity A04;
    public final LayoutInflater A05;
    public final AnonymousClass1LI A06;
    public final AnonymousClass3CG A07;
    public final AnonymousClass171 A08;
    public final AnonymousClass1RY A09;
    public final AnonymousClass1H2 A0A;
    public final C19770wU A0B;

    public C37971nV(Activity activity, AnonymousClass1LI r3, AnonymousClass3CG r4, AnonymousClass171 r5, AnonymousClass1RY r6, AnonymousClass1H2 r7, C19770wU r8) {
        this.A0A = r7;
        this.A04 = activity;
        this.A0B = r8;
        this.A08 = r5;
        this.A06 = r3;
        this.A07 = r4;
        this.A09 = r6;
        this.A05 = LayoutInflater.from(activity);
        this.A02 = AnonymousClass001.A0I();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C603637o r0;
        AnonymousClass141 r1;
        int i2;
        if (view == null) {
            view = this.A05.inflate(R.layout.f9nameremoved, viewGroup, false);
            r0 = new C603637o();
            r0.A02 = AnonymousClass3SF.A01(view, this.A06, R.id.name);
            r0.A01 = C36401kF.A0O(view, R.id.aboutInfo);
            r0.A03 = C36401kF.A0G(view, R.id.avatar);
            r0.A00 = C012005e.A02(view, R.id.divider);
            view.setTag(r0);
        } else {
            r0 = (C603637o) view.getTag();
        }
        int count = getCount() - 1;
        View view2 = r0.A00;
        if (i == count) {
            view2.setVisibility(8);
        } else {
            view2.setVisibility(0);
        }
        if (this.A03 || C36371kC.A06(this.A02) <= this.A00 || i != (i2 = this.A01)) {
            List list = this.A02;
            if (list == null) {
                r1 = null;
            } else {
                r1 = (AnonymousClass141) list.get(i);
            }
            C18740tg.A06(r1);
            AnonymousClass3SF r6 = r0.A02;
            r6.A01.setTextColor(C36351kA.A01(this.A04, R.attr.f4nameremoved, R.color.f6nameremoved));
            r0.A02.A05(r1);
            ImageView imageView = r0.A03;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C36401kF.A0o(this.A07.A00, R.string.f12nameremoved));
            C011004s.A08(imageView, AnonymousClass000.A0q(C36351kA.A0y(r1), A0u));
            r0.A01.setVisibility(0);
            r0.A01.setTag(r1.A0H);
            AnonymousClass171 r8 = this.A08;
            String str = (String) r8.A08.get(C36381kD.A0e(r1, AnonymousClass144.class));
            if (str != null) {
                TextEmojiLabel textEmojiLabel = r0.A01;
                textEmojiLabel.setText(AnonymousClass3UG.A05(textEmojiLabel.getContext(), this.A0A, str));
            } else {
                C36391kE.A1K(r0.A01);
                C36391kE.A1Q(new C49342ix(r0.A01, r8, this.A0A, (AnonymousClass147) C36381kD.A0e(r1, AnonymousClass147.class)), this.A0B);
            }
            this.A09.A08(r0.A03, r1);
            r0.A03.setClickable(true);
            C48932iI.A00(r0.A03, r1, this, r0, 7);
            return view;
        }
        AnonymousClass3SF r7 = r0.A02;
        Activity activity = this.A04;
        r7.A01.setText(C36321k7.A0B(activity.getResources(), C36371kC.A06(this.A02) - i2, 0, R.plurals.f10nameremoved));
        AnonymousClass3SF r3 = r0.A02;
        r3.A01.setTextColor(AnonymousClass00F.A00(activity, R.color.f6nameremoved));
        r0.A01.setVisibility(8);
        boolean z = C222013h.A07;
        ImageView imageView2 = r0.A03;
        if (z) {
            AnonymousClass3UF.A0B(imageView2.getContext(), imageView2, R.drawable.ic_more_participants, R.color.f6nameremoved);
        } else {
            imageView2.setImageResource(R.drawable.ic_more_participants);
        }
        r0.A03.setClickable(false);
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public int getCount() {
        int i;
        if (this.A03 || C36371kC.A06(this.A02) <= (i = this.A00)) {
            return C36371kC.A06(this.A02);
        }
        return i;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        List list = this.A02;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }
}
