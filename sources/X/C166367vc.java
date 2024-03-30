package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import java.util.List;
import java.util.Map;

/* renamed from: X.7vc  reason: invalid class name and case insensitive filesystem */
public final class C166367vc extends BaseExpandableListAdapter {
    public List A00 = C023409w.A00;
    public Map A01 = C000400e.A0D();
    public final CategoryThumbnailLoader A02;

    public C166367vc(CategoryThumbnailLoader categoryThumbnailLoader) {
        AnonymousClass00C.A0D(categoryThumbnailLoader, 1);
        this.A02 = categoryThumbnailLoader;
    }

    public long getChildId(int i, int i2) {
        return (long) ((i * 1000) + i2);
    }

    public int getChildTypeCount() {
        return 5;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        int i3;
        C006302t r1;
        AnonymousClass00C.A0D(viewGroup, 4);
        AnonymousClass9EP A002 = getChild(i, i2);
        if (A002 instanceof C174398Ws) {
            i3 = R.layout.f9nameremoved;
            r1 = new C22362AlP(this);
        } else if (A002 instanceof C174368Wp) {
            i3 = R.layout.f9nameremoved;
            r1 = C22517Anz.A00;
        } else {
            throw AnonymousClass001.A09("Unhandled group-child type in getChildView()");
        }
        C006302t r12 = r1;
        if (view == null) {
            view = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, i3);
            AnonymousClass00C.A0B(view);
            view.setTag(r12.invoke(view));
        }
        Object tag = view.getTag();
        AnonymousClass00C.A0E(tag, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.viewholder.CatalogCategoryViewHolder");
        ((AnonymousClass80B) tag).A0B(A002);
        return view;
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public int getGroupTypeCount() {
        return 5;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        int i2;
        C006302t r1;
        int i3;
        AnonymousClass00C.A0D(viewGroup, 3);
        AnonymousClass9EP r4 = (AnonymousClass9EP) this.A00.get(i);
        if (r4 instanceof C174408Wt) {
            C22363AlQ alQ = new C22363AlQ(this);
            if (view == null) {
                view = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
                AnonymousClass00C.A0B(view);
                view.setTag(alQ.invoke(view));
            }
            Object tag = view.getTag();
            AnonymousClass00C.A0E(tag, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.viewholder.CategoryGroupExpandableItemViewHolder");
            AnonymousClass8X0 r12 = (AnonymousClass8X0) tag;
            r12.A0B(r4);
            ImageView imageView = (ImageView) r12.A02.getValue();
            if (z) {
                i3 = R.drawable.vec_ic_catalog_expand_less;
            } else {
                i3 = R.drawable.vec_ic_catalog_expand_more;
            }
            imageView.setImageResource(i3);
            return view;
        }
        if (r4 instanceof C174398Ws) {
            i2 = R.layout.f9nameremoved;
            r1 = new C22364AlR(this);
        } else if (r4 instanceof C174378Wq) {
            i2 = R.layout.f9nameremoved;
            r1 = C22518Ao0.A00;
        } else {
            throw AnonymousClass001.A09("Unhandled group type in getGroupView()");
        }
        C006302t r13 = r1;
        if (view == null) {
            view = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, i2);
            AnonymousClass00C.A0B(view);
            view.setTag(r13.invoke(view));
        }
        Object tag2 = view.getTag();
        AnonymousClass00C.A0E(tag2, "null cannot be cast to non-null type com.whatsapp.catalogcategory.view.adapter.viewholder.CatalogCategoryViewHolder");
        ((AnonymousClass80B) tag2).A0B(r4);
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    /* renamed from: A00 */
    public AnonymousClass9EP getChild(int i, int i2) {
        AnonymousClass9EP r1 = (AnonymousClass9EP) this.A00.get(i);
        if (r1 instanceof C174408Wt) {
            Map map = this.A01;
            String str = ((C174408Wt) r1).A00.A01;
            AnonymousClass00C.A0D(map, 0);
            return (AnonymousClass9EP) ((List) C000200c.A00(str, map)).get(i2);
        }
        throw AnonymousClass001.A09("Unhandled category parent type in getChild()");
    }

    public int getChildrenCount(int i) {
        AnonymousClass9EP r1 = (AnonymousClass9EP) this.A00.get(i);
        if (!(r1 instanceof C174408Wt)) {
            return 0;
        }
        Map map = this.A01;
        String str = ((C174408Wt) r1).A00.A01;
        AnonymousClass00C.A0D(map, 0);
        return ((List) C000200c.A00(str, map)).size();
    }

    public /* bridge */ /* synthetic */ Object getGroup(int i) {
        return this.A00.get(i);
    }

    public int getGroupCount() {
        return this.A00.size();
    }

    public int getGroupType(int i) {
        return ((AnonymousClass9EP) this.A00.get(i)).A00;
    }

    public int getChildType(int i, int i2) {
        return getChild(i, i2).A00;
    }
}
