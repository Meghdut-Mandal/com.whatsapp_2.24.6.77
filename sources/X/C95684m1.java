package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.4m1  reason: invalid class name and case insensitive filesystem */
public class C95684m1 extends AnonymousClass0UK {
    public final /* synthetic */ GridLayoutManager A00;
    public final /* synthetic */ C96184mv A01;
    public final /* synthetic */ ShapePickerRecyclerView A02;

    public C95684m1(GridLayoutManager gridLayoutManager, C96184mv r2, ShapePickerRecyclerView shapePickerRecyclerView) {
        this.A02 = shapePickerRecyclerView;
        this.A01 = r2;
        this.A00 = gridLayoutManager;
    }

    public int A00(int i) {
        if (C96184mv.A00(this.A01, i).A00 != 0) {
            return this.A00.A01;
        }
        return this.A02.A01;
    }
}
