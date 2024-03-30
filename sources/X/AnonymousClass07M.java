package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.07M  reason: invalid class name */
public class AnonymousClass07M implements AnonymousClass07L {
    public CharSequence A00;
    public CharSequence A01;
    public char A02;
    public char A03;
    public int A04 = 16;
    public int A05 = ZipDecompressor.UNZIP_BUFFER_SIZE;
    public int A06 = ZipDecompressor.UNZIP_BUFFER_SIZE;
    public Context A07;
    public Intent A08;
    public ColorStateList A09 = null;
    public PorterDuff.Mode A0A = null;
    public Drawable A0B;
    public MenuItem.OnMenuItemClickListener A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public boolean A0F = false;
    public boolean A0G = false;

    public C06030Sa BI1() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public View getActionView() {
        return null;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public void setShowAsAction(int i) {
    }

    private void A00() {
        Drawable drawable = this.A0B;
        if (drawable == null) {
            return;
        }
        if (this.A0F || this.A0G) {
            Drawable A012 = AnonymousClass08I.A01(drawable);
            this.A0B = A012;
            Drawable mutate = A012.mutate();
            this.A0B = mutate;
            if (this.A0F) {
                AnonymousClass076.A01(this.A09, mutate);
            }
            if (this.A0G) {
                AnonymousClass076.A04(this.A0A, this.A0B);
            }
        }
    }

    public AnonymousClass07L BsQ(C06030Sa r2) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0E;
        if (charSequence == null) {
            return this.A0D;
        }
        return charSequence;
    }

    public boolean isCheckable() {
        if ((this.A04 & 1) == 0) {
            return false;
        }
        return true;
    }

    public boolean isChecked() {
        if ((this.A04 & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.A04 & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if ((this.A04 & 8) == 0) {
            return true;
        }
        return false;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setCheckable(boolean z) {
        this.A04 = z | (this.A04 & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        int i = this.A04 & -3;
        int i2 = 0;
        if (z) {
            i2 = 2;
        }
        this.A04 = i2 | i;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        int i = this.A04 & -17;
        int i2 = 0;
        if (z) {
            i2 = 16;
        }
        this.A04 = i2 | i;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.A0B = AnonymousClass00E.A00(this.A07, i);
        A00();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A09 = colorStateList;
        this.A0F = true;
        A00();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A0A = mode;
        this.A0G = true;
        A00();
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.A03 = c;
        this.A06 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A03 = c;
        this.A06 = KeyEvent.normalizeMetaState(i);
        this.A02 = Character.toLowerCase(c2);
        this.A05 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.A0D = this.A07.getResources().getString(i);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.A04 & 8;
        if (z) {
            i = 0;
        }
        this.A04 = i2 | i;
        return this;
    }

    public AnonymousClass07M(Context context, CharSequence charSequence) {
        this.A07 = context;
        this.A0D = charSequence;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.A02 = Character.toLowerCase(c);
        this.A05 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public AnonymousClass07L Bqb(CharSequence charSequence) {
        this.A00 = charSequence;
        return this;
    }

    public AnonymousClass07L BsV(CharSequence charSequence) {
        this.A01 = charSequence;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.A00 = charSequence;
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A08 = intent;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0C = onMenuItemClickListener;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0E = charSequence;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.A01 = charSequence;
        return this;
    }

    public int getAlphabeticModifiers() {
        return this.A05;
    }

    public char getAlphabeticShortcut() {
        return this.A02;
    }

    public CharSequence getContentDescription() {
        return this.A00;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.A0B;
    }

    public ColorStateList getIconTintList() {
        return this.A09;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A0A;
    }

    public Intent getIntent() {
        return this.A08;
    }

    public int getItemId() {
        return 16908332;
    }

    public int getNumericModifiers() {
        return this.A06;
    }

    public char getNumericShortcut() {
        return this.A03;
    }

    public int getOrder() {
        return 0;
    }

    public CharSequence getTitle() {
        return this.A0D;
    }

    public CharSequence getTooltipText() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.A02 = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.A0B = drawable;
        A00();
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.A03 = c;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.A03 = c;
        this.A02 = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.A0D = charSequence;
        return this;
    }
}
