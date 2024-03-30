package X;

import android.util.Pair;
import android.widget.SectionIndexer;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.List;

/* renamed from: X.2G2  reason: invalid class name */
public class AnonymousClass2G2 extends AnonymousClass2Gc implements SectionIndexer {
    public List A00 = AnonymousClass001.A0I();
    public List A01 = AnonymousClass001.A0I();

    public int getPositionForSection(int i) {
        List list = this.A00;
        AnonymousClass00C.A0D(list, 1);
        if (i >= list.size() || i < 0) {
            return -1;
        }
        return C36351kA.A06(list, i);
    }

    public int getSectionForPosition(int i) {
        List list = this.A02;
        List list2 = this.A01;
        List list3 = this.A00;
        C36321k7.A11(list, list2, list3);
        if (i < 0) {
            return 0;
        }
        if (i >= list.size()) {
            return C36431kI.A07(list2);
        }
        int A07 = C36431kI.A07(list3);
        if (A07 < 0) {
            return 0;
        }
        while (true) {
            int i2 = A07 - 1;
            if (C36351kA.A06(list3, A07) <= i) {
                return A07;
            }
            if (i2 < 0) {
                return 0;
            }
            A07 = i2;
        }
    }

    public Object[] getSections() {
        return this.A01.toArray(C36441kJ.A1R());
    }

    public AnonymousClass2G2(WfalManager wfalManager, ContactPickerFragment contactPickerFragment, C19970wo r4, C20810yC r5, AnonymousClass1NN r6, C26371Jx r7, AnonymousClass1EM r8, C28781Ua r9, AnonymousClass005 r10) {
        super(wfalManager, contactPickerFragment, r4, r5, r6, r7, r8, r9, r10);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A002 = C63703Lb.A00(this.A05.A1D, this.A02);
        this.A01 = (List) A002.first;
        this.A00 = (List) A002.second;
    }
}
