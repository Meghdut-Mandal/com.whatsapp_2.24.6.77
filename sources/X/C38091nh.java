package X;

import android.widget.Filter;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.1nh  reason: invalid class name and case insensitive filesystem */
public class C38091nh extends Filter {
    public int A00 = 0;
    public final /* synthetic */ DocumentPickerActivity A01;

    public C38091nh(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Comparator r2;
        if (charSequence != null) {
            arrayList = C202859mm.A03(this.A01.A0E, charSequence.toString());
        } else {
            arrayList = null;
        }
        int i = this.A00;
        DocumentPickerActivity documentPickerActivity = this.A01;
        int i2 = documentPickerActivity.A00;
        if (i != i2) {
            this.A00 = i2;
            C18820ts r1 = documentPickerActivity.A0E;
            List list = documentPickerActivity.A0P;
            if (i2 == 0) {
                Collator A0p = C36361kB.A0p(r1);
                A0p.setDecomposition(1);
                r2 = new AnonymousClass4YZ(A0p, 8);
            } else if (i2 == 1) {
                r2 = C81623xJ.A00;
            }
            Collections.sort(list, r2);
        }
        if (arrayList == null || arrayList.isEmpty()) {
            arrayList2 = documentPickerActivity.A0P;
        } else {
            ArrayList A0I = AnonymousClass001.A0I();
            for (AnonymousClass3GY r3 : documentPickerActivity.A0P) {
                if (C202859mm.A04(documentPickerActivity.A0E, r3.A03, arrayList, true)) {
                    A0I.add(r3);
                }
            }
            arrayList2 = A0I;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = arrayList2;
        filterResults.count = arrayList2.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults != null) {
            this.A01.A0Q = (ArrayList) filterResults.values;
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        documentPickerActivity.A0F.notifyDataSetChanged();
        DocumentPickerActivity.A0z(documentPickerActivity);
    }
}
