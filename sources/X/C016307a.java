package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.07a  reason: invalid class name and case insensitive filesystem */
public class C016307a implements AnonymousClass07Z {
    public static final int[] A0P = {1, 4, 5, 3, 2, 0};
    public int A00 = 0;
    public Drawable A01;
    public View A02;
    public AnonymousClass02T A03;
    public C018707z A04;
    public CharSequence A05;
    public ArrayList A06;
    public ArrayList A07;
    public ArrayList A08;
    public CopyOnWriteArrayList A09 = new CopyOnWriteArrayList();
    public boolean A0A;
    public boolean A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public ArrayList A0F = new ArrayList();
    public ArrayList A0G;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = false;
    public boolean A0K = false;
    public boolean A0L;
    public boolean A0M = false;
    public final Context A0N;
    public final Resources A0O;

    public C016307a A01() {
        return this;
    }

    public String A03() {
        return "android:menu:actionviewstates";
    }

    public void A06() {
        this.A0K = false;
        if (this.A0J) {
            this.A0J = false;
            A0E(this.A0M);
        }
    }

    public void clearHeader() {
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        A0E(false);
    }

    public void close() {
        A0F(true);
    }

    public void removeGroup(int i) {
        int i2 = 0;
        int size = size();
        while (i2 < size) {
            ArrayList arrayList = this.A07;
            if (((C018707z) arrayList.get(i2)).getGroupId() != i) {
                i2++;
            } else if (i2 >= 0) {
                int size2 = arrayList.size() - i2;
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (i3 >= size2 || ((C018707z) arrayList.get(i2)).getGroupId() != i) {
                        A0E(true);
                    } else {
                        if (i2 < arrayList.size()) {
                            arrayList.remove(i2);
                        }
                        i3 = i4;
                    }
                }
                A0E(true);
                return;
            } else {
                return;
            }
        }
    }

    public MenuItem A00(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3;
        int i6 = (-65536 & i3) >> 16;
        if (i6 >= 0) {
            int[] iArr = A0P;
            if (i6 < 6) {
                int i7 = (i3 & 65535) | (iArr[i6] << 16);
                C018707z r3 = new C018707z(this, charSequence, i, i2, i5, i7, this.A00);
                ArrayList arrayList = this.A07;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((C018707z) arrayList.get(size)).A0P <= i7) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, r3);
                A0E(true);
                return r3;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public C018707z A02(KeyEvent keyEvent, int i) {
        char numericShortcut;
        ArrayList arrayList = this.A0F;
        arrayList.clear();
        A0B(keyEvent, arrayList, i);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return (C018707z) arrayList.get(0);
            }
            boolean A0H2 = A0H();
            for (int i2 = 0; i2 < size; i2++) {
                C018707z r2 = (C018707z) arrayList.get(i2);
                if (A0H2) {
                    numericShortcut = r2.getAlphabeticShortcut();
                } else {
                    numericShortcut = r2.getNumericShortcut();
                }
                char[] cArr = keyData.meta;
                if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (A0H2 && numericShortcut == 8 && i == 67))) {
                    return r2;
                }
            }
        }
        return null;
    }

    public ArrayList A04() {
        if (this.A0B) {
            ArrayList arrayList = this.A0G;
            arrayList.clear();
            ArrayList arrayList2 = this.A07;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C018707z r1 = (C018707z) arrayList2.get(i);
                if (r1.isVisible()) {
                    arrayList.add(r1);
                }
            }
            this.A0B = false;
            this.A0A = true;
        }
        return this.A0G;
    }

    public void A07() {
        if (!this.A0K) {
            this.A0K = true;
            this.A0J = false;
            this.A0M = false;
        }
    }

    public void A08(Context context, AnonymousClass07X r4) {
        this.A09.add(new WeakReference(r4));
        r4.BKa(context, this);
        this.A0A = true;
    }

    public void A0B(KeyEvent keyEvent, List list, int i) {
        char numericShortcut;
        int numericModifiers;
        boolean A0H2 = A0H();
        KeyEvent keyEvent2 = keyEvent;
        int modifiers = keyEvent2.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        int i2 = i;
        if (keyEvent2.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList = this.A07;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C018707z r2 = (C018707z) arrayList.get(i3);
                List list2 = list;
                if (r2.hasSubMenu()) {
                    ((C016307a) r2.getSubMenu()).A0B(keyEvent2, list2, i2);
                }
                if (A0H2) {
                    numericShortcut = r2.getAlphabeticShortcut();
                    numericModifiers = r2.getAlphabeticModifiers();
                } else {
                    numericShortcut = r2.getNumericShortcut();
                    numericModifiers = r2.getNumericModifiers();
                }
                if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (A0H2 && numericShortcut == 8 && i2 == 67)) && r2.isEnabled()) {
                        list2.add(r2);
                    }
                }
            }
        }
    }

    public void A0D(AnonymousClass07X r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj == null || obj == r5) {
                copyOnWriteArrayList.remove(reference);
            }
        }
    }

    public void A0E(boolean z) {
        if (!this.A0K) {
            if (z) {
                this.A0B = true;
                this.A0A = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
            if (!copyOnWriteArrayList.isEmpty()) {
                A07();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    AnonymousClass07X r0 = (AnonymousClass07X) reference.get();
                    if (r0 == null) {
                        copyOnWriteArrayList.remove(reference);
                    } else {
                        r0.Bwl(z);
                    }
                }
                A06();
                return;
            }
            return;
        }
        this.A0J = true;
        if (z) {
            this.A0M = true;
        }
    }

    public final void A0F(boolean z) {
        if (!this.A0I) {
            this.A0I = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                AnonymousClass07X r0 = (AnonymousClass07X) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    r0.BTt(this, z);
                }
            }
            this.A0I = false;
        }
    }

    public boolean A0J(MenuItem menuItem, C016307a r4) {
        AnonymousClass02T r0 = this.A03;
        if (r0 == null || !r0.Baq(menuItem, r4)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (((X.AnonymousClass0Gt) r4).A00.hasSubMenu() == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r7 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        if ((r11 & 1) == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        if (r7 == false) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(android.view.MenuItem r9, X.AnonymousClass07X r10, int r11) {
        /*
            r8 = this;
            X.07z r9 = (X.C018707z) r9
            r3 = 0
            if (r9 == 0) goto L_0x00d5
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00d5
            android.view.MenuItem$OnMenuItemClickListener r0 = r9.A09
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r0.onMenuItemClick(r9)
            if (r0 == 0) goto L_0x00a7
        L_0x0015:
            r7 = 1
        L_0x0016:
            X.0Sa r4 = r9.A0C
            r6 = 1
            if (r4 == 0) goto L_0x0027
            r0 = r4
            X.0Gt r0 = (X.AnonymousClass0Gt) r0
            android.view.ActionProvider r0 = r0.A00
            boolean r0 = r0.hasSubMenu()
            r2 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x0039
            boolean r0 = r9.expandActionView()
            r7 = r7 | r0
            if (r7 == 0) goto L_0x0038
        L_0x0035:
            r8.A0F(r6)
        L_0x0038:
            return r7
        L_0x0039:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L_0x0046
            if (r2 != 0) goto L_0x0046
            r0 = r11 & 1
            if (r0 != 0) goto L_0x0038
            goto L_0x0035
        L_0x0046:
            r0 = r11 & 4
            if (r0 != 0) goto L_0x004d
            r8.A0F(r3)
        L_0x004d:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L_0x0063
            android.content.Context r0 = r8.A0N
            X.0FZ r1 = new X.0FZ
            r1.<init>(r0, r8, r9)
            r9.A0B = r1
            java.lang.CharSequence r0 = r9.getTitle()
            r1.setHeaderTitle((java.lang.CharSequence) r0)
        L_0x0063:
            android.view.SubMenu r5 = r9.getSubMenu()
            X.0FZ r5 = (X.AnonymousClass0FZ) r5
            if (r2 == 0) goto L_0x0072
            X.0Gt r4 = (X.AnonymousClass0Gt) r4
            android.view.ActionProvider r0 = r4.A00
            r0.onPrepareSubMenu(r5)
        L_0x0072:
            java.util.concurrent.CopyOnWriteArrayList r4 = r8.A09
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00a3
            if (r10 == 0) goto L_0x0080
            boolean r3 = r10.Bhy(r5)
        L_0x0080:
            java.util.Iterator r2 = r4.iterator()
        L_0x0084:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r1 = r2.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.07X r0 = (X.AnonymousClass07X) r0
            if (r0 != 0) goto L_0x009c
            r4.remove(r1)
            goto L_0x0084
        L_0x009c:
            if (r3 != 0) goto L_0x0084
            boolean r3 = r0.Bhy(r5)
            goto L_0x0084
        L_0x00a3:
            r7 = r7 | r3
            if (r7 != 0) goto L_0x0038
            goto L_0x0035
        L_0x00a7:
            X.07a r2 = r9.A0A
            boolean r0 = r2.A0J(r9, r2)
            if (r0 != 0) goto L_0x0015
            android.content.Intent r1 = r9.A06
            if (r1 == 0) goto L_0x00c2
            android.content.Context r0 = r2.A0N     // Catch:{ ActivityNotFoundException -> 0x00ba }
            r0.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x00ba }
            goto L_0x0015
        L_0x00ba:
            r2 = move-exception
            java.lang.String r1 = "MenuItemImpl"
            java.lang.String r0 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r1, r0, r2)
        L_0x00c2:
            X.0Sa r0 = r9.A0C
            if (r0 == 0) goto L_0x00d2
            X.0Gt r0 = (X.AnonymousClass0Gt) r0
            android.view.ActionProvider r0 = r0.A00
            boolean r0 = r0.onPerformDefaultAction()
            if (r0 == 0) goto L_0x00d2
            goto L_0x0015
        L_0x00d2:
            r7 = 0
            goto L_0x0016
        L_0x00d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016307a.A0K(android.view.MenuItem, X.07X, int):boolean");
    }

    public boolean A0L(C018707z r6) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.A04 == r6) {
            A07();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                AnonymousClass07X r0 = (AnonymousClass07X) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z = r0.B35(this, r6);
                    if (z) {
                        break;
                    }
                }
            }
            A06();
            if (z) {
                this.A04 = null;
            }
        }
        return z;
    }

    public boolean A0M(C018707z r6) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty()) {
            A07();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                AnonymousClass07X r0 = (AnonymousClass07X) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z = r0.B77(this, r6);
                    if (z) {
                        break;
                    }
                }
            }
            A06();
            if (z) {
                this.A04 = r6;
            }
        }
        return z;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return A00(i, i2, i3, this.A0O.getString(i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.A0N.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i5;
    }

    public void clear() {
        C018707z r0 = this.A04;
        if (r0 != null) {
            A0L(r0);
        }
        this.A07.clear();
        A0E(true);
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.A07.get(i);
    }

    public boolean hasVisibleItems() {
        if (!this.A0D) {
            int size = size();
            int i = 0;
            while (i < size) {
                if (!((C018707z) this.A07.get(i)).isVisible()) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C018707z r2 = (C018707z) arrayList.get(i2);
            if (r2.getGroupId() == i) {
                int i3 = r2.A02 & -5;
                int i4 = 0;
                if (z2) {
                    i4 = 4;
                }
                r2.A02 = i4 | i3;
                r2.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C018707z r1 = (C018707z) arrayList.get(i2);
            if (r1.getGroupId() == i) {
                r1.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C018707z r3 = (C018707z) arrayList.get(i2);
            if (r3.getGroupId() == i) {
                int i3 = r3.A02;
                int i4 = i3 & -9;
                int i5 = 8;
                if (z) {
                    i5 = 0;
                }
                int i6 = i5 | i4;
                r3.A02 = i6;
                if (i3 != i6) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            A0E(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.A0L = z;
        A0E(false);
    }

    public int size() {
        return this.A07.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005c, code lost:
        if (X.C016507c.A04(r1, android.view.ViewConfiguration.get(r1)) != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C016307a(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            r1 = 0
            r4.A00 = r1
            r4.A0K = r1
            r4.A0J = r1
            r4.A0M = r1
            r4.A0C = r1
            r4.A0I = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A0F = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.A09 = r0
            r4.A0H = r1
            r4.A0N = r5
            android.content.res.Resources r3 = r5.getResources()
            r4.A0O = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A07 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A0G = r0
            r1 = 1
            r4.A0B = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A06 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A08 = r0
            r4.A0A = r1
            r2 = 1
            android.content.res.Configuration r0 = r3.getConfiguration()
            int r0 = r0.keyboard
            if (r0 == r1) goto L_0x0061
            android.content.Context r1 = r4.A0N
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r1)
            boolean r0 = X.C016507c.A04(r1, r0)
            if (r0 == 0) goto L_0x0061
        L_0x005e:
            r4.A0E = r2
            return
        L_0x0061:
            r2 = 0
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016307a.<init>(android.content.Context):void");
    }

    public void A05() {
        ArrayList A042 = A04();
        if (this.A0A) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                AnonymousClass07X r0 = (AnonymousClass07X) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z |= r0.B7R();
                }
            }
            if (z) {
                ArrayList arrayList = this.A06;
                arrayList.clear();
                ArrayList arrayList2 = this.A08;
                arrayList2.clear();
                int size = A042.size();
                for (int i = 0; i < size; i++) {
                    C018707z r3 = (C018707z) A042.get(i);
                    ArrayList arrayList3 = arrayList2;
                    if ((r3.A02 & 32) == 32) {
                        arrayList3 = arrayList;
                    }
                    arrayList3.add(r3);
                }
            } else {
                this.A06.clear();
                ArrayList arrayList4 = this.A08;
                arrayList4.clear();
                arrayList4.addAll(A04());
            }
            this.A0A = false;
        }
    }

    public void A09(Bundle bundle) {
        MenuItem findItem;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(A03());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C016307a) item.getSubMenu()).A09(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public void A0A(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C016307a) item.getSubMenu()).A0A(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(A03(), sparseArray);
        }
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C018707z r2 = (C018707z) A00(i, i2, i3, charSequence);
        AnonymousClass0FZ r1 = new AnonymousClass0FZ(this.A0N, this, r2);
        r2.A0B = r1;
        r1.setHeaderTitle(r2.getTitle());
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r1 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.MenuItem findItem(int r5) {
        /*
            r4 = this;
            int r3 = r4.size()
            r2 = 0
        L_0x0005:
            if (r2 >= r3) goto L_0x0029
            java.util.ArrayList r0 = r4.A07
            java.lang.Object r1 = r0.get(r2)
            X.07z r1 = (X.C018707z) r1
            int r0 = r1.getItemId()
            if (r0 == r5) goto L_0x0025
            boolean r0 = r1.hasSubMenu()
            if (r0 == 0) goto L_0x0026
            android.view.SubMenu r0 = r1.getSubMenu()
            android.view.MenuItem r1 = r0.findItem(r5)
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            return r1
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0029:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016307a.findItem(int):android.view.MenuItem");
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (A02(keyEvent, i) != null) {
            return true;
        }
        return false;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return A0K(findItem(i), (AnonymousClass07X) null, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C018707z A022 = A02(keyEvent, i);
        if (A022 != null) {
            z = A0K(A022, (AnonymousClass07X) null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            A0F(true);
        }
        return z;
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            ArrayList arrayList = this.A07;
            if (((C018707z) arrayList.get(i2)).getItemId() != i) {
                i2++;
            } else if (i2 >= 0 && i2 < arrayList.size()) {
                arrayList.remove(i2);
                A0E(true);
                return;
            } else {
                return;
            }
        }
    }

    public void A0C(AnonymousClass02T r1) {
        this.A03 = r1;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.A0H = z;
    }

    public boolean A0G() {
        return this.A0H;
    }

    public boolean A0H() {
        return this.A0L;
    }

    public boolean A0I() {
        return this.A0E;
    }

    public MenuItem add(int i) {
        return A00(0, 0, 0, this.A0O.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.A0O.getString(i));
    }

    public MenuItem add(CharSequence charSequence) {
        return A00(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A00(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.A0O.getString(i4));
    }
}
