package X;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.gallery.GalleryTabHostFragment;
import java.util.List;

/* renamed from: X.4M8  reason: invalid class name */
public final class AnonymousClass4M8 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SubMenu $overflowSubMenu;
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4M8(SubMenu subMenu, GalleryTabHostFragment galleryTabHostFragment) {
        super(1);
        this.this$0 = galleryTabHostFragment;
        this.$overflowSubMenu = subMenu;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        List<C601436q> A0h = C36421kH.A0h(obj);
        this.this$0.A0H = C36401kF.A1a(A0h);
        SubMenu subMenu = this.$overflowSubMenu;
        GalleryTabHostFragment galleryTabHostFragment = this.this$0;
        for (C601436q r3 : A0h) {
            MenuItem add = subMenu.add(r3.A02);
            AnonymousClass00C.A08(add);
            add.setIcon(r3.A01);
            add.setOnMenuItemClickListener(new AnonymousClass4YB((Object) galleryTabHostFragment, (Object) r3, 7));
        }
        GalleryTabHostFragment galleryTabHostFragment2 = this.this$0;
        ViewPager viewPager = galleryTabHostFragment2.A05;
        if (viewPager != null) {
            i = viewPager.getCurrentItem();
        } else {
            i = 0;
        }
        GalleryTabHostFragment.A0A(galleryTabHostFragment2, i);
        return AnonymousClass0AJ.A00;
    }
}
