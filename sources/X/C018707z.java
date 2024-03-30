package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.ArrayList;

/* renamed from: X.07z  reason: invalid class name and case insensitive filesystem */
public final class C018707z implements AnonymousClass07L {
    public char A00;
    public char A01;
    public int A02 = 16;
    public int A03 = ZipDecompressor.UNZIP_BUFFER_SIZE;
    public int A04 = ZipDecompressor.UNZIP_BUFFER_SIZE;
    public int A05;
    public Intent A06;
    public ColorStateList A07 = null;
    public PorterDuff.Mode A08 = null;
    public MenuItem.OnMenuItemClickListener A09;
    public C016307a A0A;
    public AnonymousClass0FZ A0B;
    public C06030Sa A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public int A0H = 0;
    public Drawable A0I;
    public MenuItem.OnActionExpandListener A0J;
    public View A0K;
    public CharSequence A0L;
    public CharSequence A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;

    public MenuItem setIcon(int i) {
        this.A0I = null;
        this.A0H = i;
        this.A0G = true;
        this.A0A.A0E(false);
        return this;
    }

    public void A00(View view) {
        int i;
        this.A0K = view;
        this.A0C = null;
        if (view != null && view.getId() == -1 && (i = this.A0S) > 0) {
            view.setId(i);
        }
        C016307a r1 = this.A0A;
        r1.A0A = true;
        r1.A0E(true);
    }

    public boolean A01() {
        if ((this.A05 & 8) == 0) {
            return false;
        }
        if (this.A0K == null) {
            C06030Sa r0 = this.A0C;
            if (r0 == null) {
                return false;
            }
            View onCreateActionView = ((AnonymousClass0Gt) r0).A00.onCreateActionView(this);
            this.A0K = onCreateActionView;
            if (onCreateActionView != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    public AnonymousClass07L Bqb(CharSequence charSequence) {
        this.A0L = charSequence;
        this.A0A.A0E(false);
        return this;
    }

    public AnonymousClass07L BsQ(C06030Sa r3) {
        C06030Sa r1 = this.A0C;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A0K = null;
        this.A0C = r3;
        this.A0A.A0E(true);
        C06030Sa r12 = this.A0C;
        if (r12 != null) {
            AnonymousClass0Fa r13 = (AnonymousClass0Fa) r12;
            r13.A00 = new C09690cm(this);
            r13.A00.setVisibilityListener(r13);
        }
        return this;
    }

    public AnonymousClass07L BsV(CharSequence charSequence) {
        this.A0O = charSequence;
        this.A0A.A0E(false);
        return this;
    }

    public boolean collapseActionView() {
        if ((this.A05 & 8) != 0) {
            if (this.A0K == null) {
                return true;
            }
            MenuItem.OnActionExpandListener onActionExpandListener = this.A0J;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
                return this.A0A.A0L(this);
            }
        }
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A0K;
        if (view != null) {
            return view;
        }
        C06030Sa r0 = this.A0C;
        if (r0 == null) {
            return null;
        }
        View onCreateActionView = ((AnonymousClass0Gt) r0).A00.onCreateActionView(this);
        this.A0K = onCreateActionView;
        return onCreateActionView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r1 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable getIcon() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r1 = r3.A0I
            if (r1 != 0) goto L_0x001b
            int r2 = r3.A0H
            if (r2 == 0) goto L_0x0045
            X.07a r0 = r3.A0A
            android.content.Context r1 = r0.A0N
            X.02X r0 = X.AnonymousClass02X.A03()
            android.graphics.drawable.Drawable r1 = r0.A08(r1, r2)
            r0 = 0
            r3.A0H = r0
            r3.A0I = r1
            if (r1 == 0) goto L_0x0044
        L_0x001b:
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x0044
            boolean r0 = r3.A0D
            if (r0 != 0) goto L_0x0027
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0044
        L_0x0027:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass08I.A01(r1)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r3.A07
            X.AnonymousClass076.A01(r0, r1)
        L_0x0038:
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0041
            android.graphics.PorterDuff$Mode r0 = r3.A08
            X.AnonymousClass076.A04(r0, r1)
        L_0x0041:
            r0 = 0
            r3.A0G = r0
        L_0x0044:
            return r1
        L_0x0045:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018707z.getIcon():android.graphics.drawable.Drawable");
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0N;
        if (charSequence == null) {
            return this.A0M;
        }
        return charSequence;
    }

    public boolean hasSubMenu() {
        if (this.A0B != null) {
            return true;
        }
        return false;
    }

    public boolean isCheckable() {
        if ((this.A02 & 1) != 1) {
            return false;
        }
        return true;
    }

    public boolean isChecked() {
        if ((this.A02 & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.A02 & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        C06030Sa r0 = this.A0C;
        if (r0 == null || !((AnonymousClass0Gt) r0).A00.overridesItemVisibility()) {
            if ((this.A02 & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.A02 & 8) != 0 || !((AnonymousClass0Gt) this.A0C).A00.isVisible()) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.A0A.A0N;
        A00(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.A00 == c && this.A03 == i) {
            return this;
        }
        this.A00 = Character.toLowerCase(c);
        this.A03 = KeyEvent.normalizeMetaState(i);
        this.A0A.A0E(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.A02;
        boolean z2 = z | (i & true);
        this.A02 = z2 ? 1 : 0;
        if (i != z2) {
            this.A0A.A0E(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        int i = this.A02;
        if ((i & 4) != 0) {
            C016307a r9 = this.A0A;
            int groupId = getGroupId();
            ArrayList arrayList = r9.A07;
            int size = arrayList.size();
            r9.A07();
            for (int i2 = 0; i2 < size; i2++) {
                C018707z r10 = (C018707z) arrayList.get(i2);
                if (r10.getGroupId() == groupId && (r10.A02 & 4) != 0 && r10.isCheckable()) {
                    boolean z2 = false;
                    if (r10 == this) {
                        z2 = true;
                    }
                    int i3 = r10.A02;
                    int i4 = i3 & -3;
                    int i5 = 0;
                    if (z2) {
                        i5 = 2;
                    }
                    int i6 = i5 | i4;
                    r10.A02 = i6;
                    if (i3 != i6) {
                        r10.A0A.A0E(false);
                    }
                }
            }
            r9.A06();
        } else {
            int i7 = i & -3;
            int i8 = 0;
            if (z) {
                i8 = 2;
            }
            int i9 = i8 | i7;
            this.A02 = i9;
            if (i != i9) {
                this.A0A.A0E(false);
                return this;
            }
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.A02;
        if (z) {
            i = i2 | 16;
        } else {
            i = i2 & -17;
        }
        this.A02 = i;
        this.A0A.A0E(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        this.A0D = true;
        this.A0G = true;
        this.A0A.A0E(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A08 = mode;
        this.A0E = true;
        this.A0G = true;
        this.A0A.A0E(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.A01 == c && this.A04 == i) {
            return this;
        }
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        this.A0A.A0E(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        this.A00 = Character.toLowerCase(c2);
        this.A03 = KeyEvent.normalizeMetaState(i2);
        this.A0A.A0E(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.A05 = i;
            C016307a r1 = this.A0A;
            r1.A0A = true;
            r1.A0E(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.A0M = charSequence;
        this.A0A.A0E(false);
        AnonymousClass0FZ r0 = this.A0B;
        if (r0 != null) {
            r0.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0N = charSequence;
        this.A0A.A0E(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = this.A02;
        int i2 = i & -9;
        int i3 = 8;
        if (z) {
            i3 = 0;
        }
        int i4 = i3 | i2;
        this.A02 = i4;
        if (i != i4) {
            C016307a r1 = this.A0A;
            r1.A0B = true;
            r1.A0E(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.A0M;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public C018707z(C016307a r3, CharSequence charSequence, int i, int i2, int i3, int i4, int i5) {
        this.A0A = r3;
        this.A0S = i2;
        this.A0R = i;
        this.A0Q = i3;
        this.A0P = i4;
        this.A0M = charSequence;
        this.A05 = i5;
    }

    public boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        if (!A01() || ((onActionExpandListener = this.A0J) != null && !onActionExpandListener.onMenuItemActionExpand(this))) {
            return false;
        }
        return this.A0A.A0M(this);
    }

    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        Bqb(charSequence);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A06 = intent;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A0J = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A09 = onMenuItemClickListener;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        BsV(charSequence);
        return this;
    }

    public C06030Sa BI1() {
        return this.A0C;
    }

    public int getAlphabeticModifiers() {
        return this.A03;
    }

    public char getAlphabeticShortcut() {
        return this.A00;
    }

    public CharSequence getContentDescription() {
        return this.A0L;
    }

    public int getGroupId() {
        return this.A0R;
    }

    public ColorStateList getIconTintList() {
        return this.A07;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    public Intent getIntent() {
        return this.A06;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.A0S;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.A04;
    }

    public char getNumericShortcut() {
        return this.A01;
    }

    public int getOrder() {
        return this.A0Q;
    }

    public SubMenu getSubMenu() {
        return this.A0B;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.A0M;
    }

    public CharSequence getTooltipText() {
        return this.A0O;
    }

    public boolean isActionViewExpanded() {
        return this.A0F;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        A00(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.A00 != c) {
            this.A00 = Character.toLowerCase(c);
            this.A0A.A0E(false);
        }
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.A0H = 0;
        this.A0I = drawable;
        this.A0G = true;
        this.A0A.A0E(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.A01 != c) {
            this.A01 = c;
            this.A0A.A0E(false);
        }
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.A01 = c;
        this.A00 = Character.toLowerCase(c2);
        this.A0A.A0E(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.A0A.A0N.getString(i));
        return this;
    }
}
