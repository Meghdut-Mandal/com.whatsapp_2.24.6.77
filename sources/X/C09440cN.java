package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: X.0cN  reason: invalid class name and case insensitive filesystem */
public class C09440cN implements AnonymousClass07X, AdapterView.OnItemClickListener {
    public Context A00;
    public C016307a A01;
    public LayoutInflater A02;
    public ExpandedMenuView A03;
    public C03330Ed A04;
    public C16990qX A05;

    public boolean B35(C016307a r2, C018707z r3) {
        return false;
    }

    public boolean B77(C016307a r2, C018707z r3) {
        return false;
    }

    public boolean B7R() {
        return false;
    }

    public void BKa(Context context, C016307a r3) {
        if (this.A00 != null) {
            this.A00 = context;
            if (this.A02 == null) {
                this.A02 = LayoutInflater.from(context);
            }
        }
        this.A01 = r3;
        C03330Ed r0 = this.A04;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void BTt(C016307a r2, boolean z) {
        C16990qX r0 = this.A05;
        if (r0 != null) {
            r0.BTt(r2, z);
        }
    }

    public void Bf3(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.A03.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public Parcelable Bfg() {
        if (this.A03 == null) {
            return null;
        }
        Bundle A07 = AnonymousClass001.A07();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.A03;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        A07.putSparseParcelableArray("android:menu:list", sparseArray);
        return A07;
    }

    public void Bwl(boolean z) {
        C03330Ed r0 = this.A04;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A01.A0K(this.A04.getItem(i), this, 0);
    }

    public C09440cN(Context context) {
        this.A00 = context;
        this.A02 = LayoutInflater.from(context);
    }

    public boolean Bhy(AnonymousClass0FZ r7) {
        if (!r7.hasVisibleItems()) {
            return false;
        }
        C09420cL r3 = new C09420cL(r7);
        C016307a r5 = r3.A02;
        Context context = r5.A0N;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        C09440cN r0 = new C09440cN(alertDialog$Builder.getContext());
        r3.A01 = r0;
        r0.A05 = r3;
        r5.A08(context, r0);
        C09440cN r1 = r3.A01;
        C03330Ed r02 = r1.A04;
        if (r02 == null) {
            r02 = new C03330Ed(r1);
            r1.A04 = r02;
        }
        alertDialog$Builder.A0O(r3, r02);
        View view = r5.A02;
        if (view != null) {
            alertDialog$Builder.A0Y(view);
        } else {
            alertDialog$Builder.A00.A0B = r5.A01;
            alertDialog$Builder.setTitle(r5.A05);
        }
        alertDialog$Builder.A0W(r3);
        AnonymousClass0FM create = alertDialog$Builder.create();
        r3.A00 = create;
        create.setOnDismissListener(r3);
        WindowManager.LayoutParams attributes = r3.A00.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= C132986Wc.A0F;
        r3.A00.show();
        C16990qX r03 = this.A05;
        if (r03 == null) {
            return true;
        }
        r03.Bbv(r7);
        return true;
    }

    public void BqL(C16990qX r1) {
        this.A05 = r1;
    }

    public int getId() {
        return 0;
    }
}
