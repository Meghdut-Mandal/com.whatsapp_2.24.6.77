package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: X.0FX  reason: invalid class name */
public class AnonymousClass0FX extends C06440Tp implements Menu {
    public final AnonymousClass07Z A00;

    public MenuItem add(int i, int i2, int i3, int i4) {
        return A00(this.A00.add(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.A00.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = A00(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.A00.addSubMenu(i, i2, i3, i4);
    }

    public void clear() {
        AnonymousClass007 r0 = this.A00;
        if (r0 != null) {
            r0.clear();
        }
        this.A00.clear();
    }

    public void close() {
        this.A00.close();
    }

    public MenuItem findItem(int i) {
        return A00(this.A00.findItem(i));
    }

    public MenuItem getItem(int i) {
        return A00(this.A00.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.A00.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.A00.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.A00.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.A00.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        if (this.A00 != null) {
            int i2 = 0;
            while (true) {
                AnonymousClass007 r1 = this.A00;
                if (i2 >= r1.size()) {
                    break;
                }
                if (((MenuItem) r1.A04(i2)).getGroupId() == i) {
                    this.A00.A05(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.A00.removeGroup(i);
    }

    public void removeItem(int i) {
        if (this.A00 != null) {
            int i2 = 0;
            while (true) {
                AnonymousClass007 r1 = this.A00;
                if (i2 >= r1.size()) {
                    break;
                } else if (((MenuItem) r1.A04(i2)).getItemId() == i) {
                    this.A00.A05(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.A00.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.A00.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.A00.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.A00.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.A00.setQwertyMode(z);
    }

    public int size() {
        return this.A00.size();
    }

    public AnonymousClass0FX(Context context, AnonymousClass07Z r3) {
        super(context);
        if (r3 != null) {
            this.A00 = r3;
            return;
        }
        throw AnonymousClass001.A08("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return A00(this.A00.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return this.A00.addSubMenu(i);
    }

    public MenuItem add(CharSequence charSequence) {
        return A00(this.A00.add(charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.A00.addSubMenu(charSequence);
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A00(this.A00.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.A00.addSubMenu(i, i2, i3, charSequence);
    }
}
