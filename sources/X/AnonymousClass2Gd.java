package X;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.2Gd  reason: invalid class name */
public final class AnonymousClass2Gd extends C37871nL implements SectionIndexer {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final Context A05;
    public final AnonymousClass1Pp A06;
    public final AnonymousClass1RY A07;
    public final C18820ts A08;

    public View getView(int i, View view, ViewGroup viewGroup) {
        C604237u r4;
        TextView textView;
        String A002;
        AnonymousClass00C.A0D(viewGroup, 2);
        C87564Ph r3 = (C87564Ph) this.A01.get(i);
        C18740tg.A06(r3);
        if (r3 instanceof C70213em) {
            if (view == null) {
                view = C36371kC.A0J(LayoutInflater.from(this.A05), viewGroup, R.layout.f9nameremoved, false);
                C011504z.A06(view, 2);
            }
            textView = C36351kA.A0E(view);
            C33511fU.A03(textView);
            A002 = ((C70213em) r3).A00;
        } else {
            if (view == null) {
                view = C36371kC.A0J(LayoutInflater.from(this.A05), viewGroup, R.layout.f9nameremoved, false);
                r4 = new C604237u(view);
                view.setTag(r4);
            } else {
                Object tag = view.getTag();
                AnonymousClass00C.A0E(tag, "null cannot be cast to non-null type com.whatsapp.contact.picker.viewholders.ContactsViewHolder");
                r4 = (C604237u) tag;
            }
            if (r3 instanceof C70203el) {
                AnonymousClass00C.A0B(r3);
                C011504z.A06(view, 2);
                r4.A00.setVisibility(4);
                r4.A01.setText(((C70203el) r3).A00);
                r4.A02.setVisibility(8);
                return view;
            } else if (r3 instanceof C70243ep) {
                AnonymousClass00C.A0B(r3);
                C70243ep r32 = (C70243ep) r3;
                ImageView imageView = r4.A00;
                imageView.setVisibility(0);
                this.A06.A06(imageView, R.drawable.avatar_contact);
                AnonymousClass141 contact = r32.getContact();
                C18740tg.A06(contact);
                this.A07.A08(imageView, contact);
                r4.A01.A0J(r32.A00, this.A00, 0, false);
                textView = r4.A02;
                textView.setVisibility(0);
                A002 = r32.A00();
            } else {
                throw AnonymousClass001.A09(AnonymousClass000.A0l(r3, "unexpected item type: ", AnonymousClass000.A0u()));
            }
        }
        textView.setText(A002);
        return view;
    }

    public int getCount() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    public int getPositionForSection(int i) {
        List list = this.A04;
        AnonymousClass00C.A0D(list, 1);
        if (i >= list.size() || i < 0) {
            return -1;
        }
        return C36351kA.A06(list, i);
    }

    public int getSectionForPosition(int i) {
        List list = this.A02;
        List list2 = this.A03;
        List list3 = this.A04;
        C36321k7.A11(list, list2, list3);
        if (i < 0) {
            return 0;
        }
        if (i >= list.size()) {
            return C36431kI.A07(list2);
        }
        int A072 = C36431kI.A07(list3);
        if (A072 < 0) {
            return 0;
        }
        while (true) {
            int i2 = A072 - 1;
            if (C36351kA.A06(list3, A072) <= i) {
                return A072;
            }
            if (i2 < 0) {
                return 0;
            }
            A072 = i2;
        }
    }

    public /* bridge */ /* synthetic */ Object[] getSections() {
        return this.A03.toArray(new String[0]);
    }

    public AnonymousClass2Gd(Context context, AnonymousClass1Pp r3, AnonymousClass1RY r4, C18820ts r5, List list) {
        this.A05 = context;
        this.A01 = list;
        this.A06 = r3;
        this.A07 = r4;
        this.A02 = list;
        this.A08 = r5;
        C023409w r0 = C023409w.A00;
        this.A03 = r0;
        this.A04 = r0;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A002 = C63703Lb.A00(this.A08, this.A02);
        Object obj = A002.first;
        AnonymousClass00C.A07(obj);
        this.A03 = (List) obj;
        Object obj2 = A002.second;
        AnonymousClass00C.A07(obj2);
        this.A04 = (List) obj2;
    }
}
