package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: X.0cC  reason: invalid class name and case insensitive filesystem */
public class C09330cC implements C021809f {
    public final ActionMode.Callback A00;
    public final ArrayList A01 = AnonymousClass001.A0I();
    public final Context A02;
    public final AnonymousClass007 A03 = new AnonymousClass007(0);

    public AnonymousClass0EE A00(AnonymousClass0V9 r6) {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0EE r1 = (AnonymousClass0EE) arrayList.get(i);
            if (r1 != null && r1.A01 == r6) {
                return r1;
            }
        }
        AnonymousClass0EE r0 = new AnonymousClass0EE(this.A02, r6);
        arrayList.add(r0);
        return r0;
    }

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r6) {
        return this.A00.onActionItemClicked(A00(r6), new AnonymousClass0FY(this.A02, (AnonymousClass07L) menuItem));
    }

    public boolean BUq(Menu menu, AnonymousClass0V9 r8) {
        ActionMode.Callback callback = this.A00;
        AnonymousClass0EE A002 = A00(r8);
        AnonymousClass007 r3 = this.A03;
        Menu menu2 = (Menu) r3.get(menu);
        if (menu2 == null) {
            menu2 = new AnonymousClass0FX(this.A02, (AnonymousClass07Z) menu);
            r3.put(menu, menu2);
        }
        return callback.onCreateActionMode(A002, menu2);
    }

    public void BVS(AnonymousClass0V9 r3) {
        this.A00.onDestroyActionMode(A00(r3));
    }

    public boolean BdJ(Menu menu, AnonymousClass0V9 r8) {
        ActionMode.Callback callback = this.A00;
        AnonymousClass0EE A002 = A00(r8);
        AnonymousClass007 r3 = this.A03;
        Menu menu2 = (Menu) r3.get(menu);
        if (menu2 == null) {
            menu2 = new AnonymousClass0FX(this.A02, (AnonymousClass07Z) menu);
            r3.put(menu, menu2);
        }
        return callback.onPrepareActionMode(A002, menu2);
    }

    public C09330cC(Context context, ActionMode.Callback callback) {
        this.A02 = context;
        this.A00 = callback;
    }
}
